package de.cau.cs.kieler.scl.parser.antlr.internal; 

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
import de.cau.cs.kieler.scl.services.SCLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSCLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "':'", "';'", "'pause'", "'goto'", "'['", "']'", "'if'", "'then'", "'{'", "'}'", "'else'", "'fork'", "'par'", "'join'", "'expression'", "'const'", "'extern'", "'volatile'", "'input'", "'output'", "'static'", "'signal'", "','", "'='", "'combine'", "'('", "')'", "'<'", "'()'", "'>'", "'!'", "'&'", "'@'", "'.'", "'#'", "'-'", "'++'", "'--'", "'=='", "'<='", "'>='", "'!='", "'pre'", "'|'", "'+'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'string'", "'host'", "'none'", "'max'", "'min'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=5;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_NUMBER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[299+1];
             
             
        }
        

    public String[] getTokenNames() { return InternalSCLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSCL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private SCLGrammarAccess grammarAccess;
     	
        public InternalSCLParser(TokenStream input, SCLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SCLProgram";	
       	}
       	
       	@Override
       	protected SCLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSCLProgram"
    // InternalSCL.g:75:1: entryRuleSCLProgram returns [EObject current=null] : iv_ruleSCLProgram= ruleSCLProgram EOF ;
    public final EObject entryRuleSCLProgram() throws RecognitionException {
        EObject current = null;
        int entryRuleSCLProgram_StartIndex = input.index();
        EObject iv_ruleSCLProgram = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return current; }
            // InternalSCL.g:76:2: (iv_ruleSCLProgram= ruleSCLProgram EOF )
            // InternalSCL.g:77:2: iv_ruleSCLProgram= ruleSCLProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSCLProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSCLProgram=ruleSCLProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSCLProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, entryRuleSCLProgram_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSCLProgram"


    // $ANTLR start "ruleSCLProgram"
    // InternalSCL.g:84:1: ruleSCLProgram returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_declarations_4_0= ruleDeclaration ) )* ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleMetaStatement ) ) )* ( (lv_statements_8_0= ruleStatement ) )? ) ;
    public final EObject ruleSCLProgram() throws RecognitionException {
        EObject current = null;
        int ruleSCLProgram_StartIndex = input.index();
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_declarations_4_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_statements_7_0 = null;

        EObject lv_statements_8_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return current; }
            // InternalSCL.g:87:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_declarations_4_0= ruleDeclaration ) )* ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleMetaStatement ) ) )* ( (lv_statements_8_0= ruleStatement ) )? ) )
            // InternalSCL.g:88:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_declarations_4_0= ruleDeclaration ) )* ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleMetaStatement ) ) )* ( (lv_statements_8_0= ruleStatement ) )? )
            {
            // InternalSCL.g:88:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_declarations_4_0= ruleDeclaration ) )* ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleMetaStatement ) ) )* ( (lv_statements_8_0= ruleStatement ) )? )
            // InternalSCL.g:88:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_declarations_4_0= ruleDeclaration ) )* ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleMetaStatement ) ) )* ( (lv_statements_8_0= ruleStatement ) )?
            {
            // InternalSCL.g:88:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMENT_ANNOTATION||LA1_0==49) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSCL.g:89:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:89:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:90:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCLProgramAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSCLProgramRule());
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
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSCLProgramAccess().getModuleKeyword_1());
                  
            }
            // InternalSCL.g:110:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSCL.g:111:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSCL.g:111:1: (lv_name_2_0= RULE_ID )
            // InternalSCL.g:112:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getSCLProgramAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSCLProgramRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalSCL.g:128:2: (otherlv_3= ':' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSCL.g:128:4: otherlv_3= ':'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSCLProgramAccess().getColonKeyword_3());
                          
                    }

                    }
                    break;

            }

            // InternalSCL.g:132:3: ( (lv_declarations_4_0= ruleDeclaration ) )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalSCL.g:133:1: (lv_declarations_4_0= ruleDeclaration )
            	    {
            	    // InternalSCL.g:133:1: (lv_declarations_4_0= ruleDeclaration )
            	    // InternalSCL.g:134:3: lv_declarations_4_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCLProgramAccess().getDeclarationsDeclarationParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_declarations_4_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSCLProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_4_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalSCL.g:150:3: ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleMetaStatement ) ) )*
            loop4:
            do {
                int alt4=3;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalSCL.g:150:4: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
            	    {
            	    // InternalSCL.g:150:4: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
            	    // InternalSCL.g:150:5: ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';'
            	    {
            	    // InternalSCL.g:150:5: ( (lv_statements_5_0= ruleInstructionStatement ) )
            	    // InternalSCL.g:151:1: (lv_statements_5_0= ruleInstructionStatement )
            	    {
            	    // InternalSCL.g:151:1: (lv_statements_5_0= ruleInstructionStatement )
            	    // InternalSCL.g:152:3: lv_statements_5_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCLProgramAccess().getStatementsInstructionStatementParserRuleCall_5_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_statements_5_0=ruleInstructionStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSCLProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_5_0, 
            	              		"de.cau.cs.kieler.scl.SCL.InstructionStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getSCLProgramAccess().getSemicolonKeyword_5_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSCL.g:173:6: ( (lv_statements_7_0= ruleMetaStatement ) )
            	    {
            	    // InternalSCL.g:173:6: ( (lv_statements_7_0= ruleMetaStatement ) )
            	    // InternalSCL.g:174:1: (lv_statements_7_0= ruleMetaStatement )
            	    {
            	    // InternalSCL.g:174:1: (lv_statements_7_0= ruleMetaStatement )
            	    // InternalSCL.g:175:3: lv_statements_7_0= ruleMetaStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCLProgramAccess().getStatementsMetaStatementParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_statements_7_0=ruleMetaStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSCLProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_7_0, 
            	              		"de.cau.cs.kieler.scl.SCL.MetaStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSCL.g:191:4: ( (lv_statements_8_0= ruleStatement ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||LA5_0==RULE_COMMENT_ANNOTATION||(LA5_0>=19 && LA5_0<=20)||LA5_0==23||LA5_0==25||LA5_0==28||LA5_0==49) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSCL.g:192:1: (lv_statements_8_0= ruleStatement )
                    {
                    // InternalSCL.g:192:1: (lv_statements_8_0= ruleStatement )
                    // InternalSCL.g:193:3: lv_statements_8_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSCLProgramAccess().getStatementsStatementParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_statements_8_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSCLProgramRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_8_0, 
                              		"de.cau.cs.kieler.scl.SCL.Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
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
            if ( state.backtracking>0 ) { memoize(input, 2, ruleSCLProgram_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSCLProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalSCL.g:217:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleStatement_StartIndex = input.index();
        EObject iv_ruleStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return current; }
            // InternalSCL.g:218:2: (iv_ruleStatement= ruleStatement EOF )
            // InternalSCL.g:219:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, entryRuleStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalSCL.g:226:1: ruleStatement returns [EObject current=null] : (this_InstructionStatement_0= ruleInstructionStatement | this_MetaStatement_1= ruleMetaStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;
        int ruleStatement_StartIndex = input.index();
        EObject this_InstructionStatement_0 = null;

        EObject this_MetaStatement_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return current; }
            // InternalSCL.g:229:28: ( (this_InstructionStatement_0= ruleInstructionStatement | this_MetaStatement_1= ruleMetaStatement ) )
            // InternalSCL.g:230:1: (this_InstructionStatement_0= ruleInstructionStatement | this_MetaStatement_1= ruleMetaStatement )
            {
            // InternalSCL.g:230:1: (this_InstructionStatement_0= ruleInstructionStatement | this_MetaStatement_1= ruleMetaStatement )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalSCL.g:231:2: this_InstructionStatement_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getInstructionStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_InstructionStatement_0=ruleInstructionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InstructionStatement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSCL.g:244:2: this_MetaStatement_1= ruleMetaStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getMetaStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_MetaStatement_1=ruleMetaStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MetaStatement_1; 
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
            if ( state.backtracking>0 ) { memoize(input, 4, ruleStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleInstructionStatement"
    // InternalSCL.g:263:1: entryRuleInstructionStatement returns [EObject current=null] : iv_ruleInstructionStatement= ruleInstructionStatement EOF ;
    public final EObject entryRuleInstructionStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleInstructionStatement_StartIndex = input.index();
        EObject iv_ruleInstructionStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return current; }
            // InternalSCL.g:264:2: (iv_ruleInstructionStatement= ruleInstructionStatement EOF )
            // InternalSCL.g:265:2: iv_ruleInstructionStatement= ruleInstructionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInstructionStatement=ruleInstructionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstructionStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, entryRuleInstructionStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleInstructionStatement"


    // $ANTLR start "ruleInstructionStatement"
    // InternalSCL.g:272:1: ruleInstructionStatement returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Goto_2= ruleGoto | this_Parallel_3= ruleParallel | this_Pause_4= rulePause ) ;
    public final EObject ruleInstructionStatement() throws RecognitionException {
        EObject current = null;
        int ruleInstructionStatement_StartIndex = input.index();
        EObject this_Assignment_0 = null;

        EObject this_Conditional_1 = null;

        EObject this_Goto_2 = null;

        EObject this_Parallel_3 = null;

        EObject this_Pause_4 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return current; }
            // InternalSCL.g:275:28: ( (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Goto_2= ruleGoto | this_Parallel_3= ruleParallel | this_Pause_4= rulePause ) )
            // InternalSCL.g:276:1: (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Goto_2= ruleGoto | this_Parallel_3= ruleParallel | this_Pause_4= rulePause )
            {
            // InternalSCL.g:276:1: (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Goto_2= ruleGoto | this_Parallel_3= ruleParallel | this_Pause_4= rulePause )
            int alt7=5;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalSCL.g:277:2: this_Assignment_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionStatementAccess().getAssignmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:290:2: this_Conditional_1= ruleConditional
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionStatementAccess().getConditionalParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Conditional_1=ruleConditional();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Conditional_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSCL.g:303:2: this_Goto_2= ruleGoto
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionStatementAccess().getGotoParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Goto_2=ruleGoto();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Goto_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSCL.g:316:2: this_Parallel_3= ruleParallel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionStatementAccess().getParallelParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Parallel_3=ruleParallel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Parallel_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalSCL.g:329:2: this_Pause_4= rulePause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionStatementAccess().getPauseParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Pause_4=rulePause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Pause_4; 
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
            if ( state.backtracking>0 ) { memoize(input, 6, ruleInstructionStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleInstructionStatement"


    // $ANTLR start "entryRuleMetaStatement"
    // InternalSCL.g:348:1: entryRuleMetaStatement returns [EObject current=null] : iv_ruleMetaStatement= ruleMetaStatement EOF ;
    public final EObject entryRuleMetaStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleMetaStatement_StartIndex = input.index();
        EObject iv_ruleMetaStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return current; }
            // InternalSCL.g:349:2: (iv_ruleMetaStatement= ruleMetaStatement EOF )
            // InternalSCL.g:350:2: iv_ruleMetaStatement= ruleMetaStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetaStatement=ruleMetaStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, entryRuleMetaStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMetaStatement"


    // $ANTLR start "ruleMetaStatement"
    // InternalSCL.g:357:1: ruleMetaStatement returns [EObject current=null] : (this_Label_0= ruleLabel | this_ScopeStatement_1= ruleScopeStatement ) ;
    public final EObject ruleMetaStatement() throws RecognitionException {
        EObject current = null;
        int ruleMetaStatement_StartIndex = input.index();
        EObject this_Label_0 = null;

        EObject this_ScopeStatement_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return current; }
            // InternalSCL.g:360:28: ( (this_Label_0= ruleLabel | this_ScopeStatement_1= ruleScopeStatement ) )
            // InternalSCL.g:361:1: (this_Label_0= ruleLabel | this_ScopeStatement_1= ruleScopeStatement )
            {
            // InternalSCL.g:361:1: (this_Label_0= ruleLabel | this_ScopeStatement_1= ruleScopeStatement )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalSCL.g:362:2: this_Label_0= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMetaStatementAccess().getLabelParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Label_0=ruleLabel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Label_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSCL.g:375:2: this_ScopeStatement_1= ruleScopeStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMetaStatementAccess().getScopeStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ScopeStatement_1=ruleScopeStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ScopeStatement_1; 
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
            if ( state.backtracking>0 ) { memoize(input, 8, ruleMetaStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMetaStatement"


    // $ANTLR start "entryRulePause"
    // InternalSCL.g:394:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;
        int entryRulePause_StartIndex = input.index();
        EObject iv_rulePause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return current; }
            // InternalSCL.g:395:2: (iv_rulePause= rulePause EOF )
            // InternalSCL.g:396:2: iv_rulePause= rulePause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePause=rulePause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, entryRulePause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePause"


    // $ANTLR start "rulePause"
    // InternalSCL.g:403:1: rulePause returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'pause' ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;
        int rulePause_StartIndex = input.index();
        Token otherlv_2=null;
        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return current; }
            // InternalSCL.g:406:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'pause' ) )
            // InternalSCL.g:407:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'pause' )
            {
            // InternalSCL.g:407:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'pause' )
            // InternalSCL.g:407:2: () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'pause'
            {
            // InternalSCL.g:407:2: ()
            // InternalSCL.g:408:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPauseAccess().getPauseAction_0(),
                          current);
                  
            }

            }

            // InternalSCL.g:416:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMMENT_ANNOTATION||LA9_0==49) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSCL.g:417:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:417:1: (lv_annotations_1_0= ruleAnnotation )
            	    // InternalSCL.g:418:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPauseAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_annotations_1_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPauseRule());
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
            	    break loop9;
                }
            } while (true);

            otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPauseAccess().getPauseKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, rulePause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePause"


    // $ANTLR start "entryRuleLabel"
    // InternalSCL.g:446:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;
        int entryRuleLabel_StartIndex = input.index();
        EObject iv_ruleLabel = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return current; }
            // InternalSCL.g:447:2: (iv_ruleLabel= ruleLabel EOF )
            // InternalSCL.g:448:2: iv_ruleLabel= ruleLabel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, entryRuleLabel_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalSCL.g:455:1: ruleLabel returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;
        int ruleLabel_StartIndex = input.index();
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return current; }
            // InternalSCL.g:458:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ) ) )
            // InternalSCL.g:459:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ) )
            {
            // InternalSCL.g:459:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ) )
            // InternalSCL.g:459:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' )
            {
            // InternalSCL.g:459:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMMENT_ANNOTATION||LA10_0==49) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSCL.g:460:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:460:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:461:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLabelAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLabelRule());
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
            	    break loop10;
                }
            } while (true);

            // InternalSCL.g:477:3: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' )
            // InternalSCL.g:477:4: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':'
            {
            // InternalSCL.g:477:4: ( (lv_name_1_0= RULE_ID ) )
            // InternalSCL.g:478:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSCL.g:478:1: (lv_name_1_0= RULE_ID )
            // InternalSCL.g:479:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLabelRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLabelAccess().getColonKeyword_1_1());
                  
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
            if ( state.backtracking>0 ) { memoize(input, 12, ruleLabel_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleGoto"
    // InternalSCL.g:507:1: entryRuleGoto returns [EObject current=null] : iv_ruleGoto= ruleGoto EOF ;
    public final EObject entryRuleGoto() throws RecognitionException {
        EObject current = null;
        int entryRuleGoto_StartIndex = input.index();
        EObject iv_ruleGoto = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return current; }
            // InternalSCL.g:508:2: (iv_ruleGoto= ruleGoto EOF )
            // InternalSCL.g:509:2: iv_ruleGoto= ruleGoto EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGotoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGoto=ruleGoto();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoto; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, entryRuleGoto_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleGoto"


    // $ANTLR start "ruleGoto"
    // InternalSCL.g:516:1: ruleGoto returns [EObject current=null] : (otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleGoto() throws RecognitionException {
        EObject current = null;
        int ruleGoto_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return current; }
            // InternalSCL.g:519:28: ( (otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalSCL.g:520:1: (otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalSCL.g:520:1: (otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) ) )
            // InternalSCL.g:520:3: otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGotoAccess().getGotoKeyword_0());
                  
            }
            // InternalSCL.g:524:1: ( (otherlv_1= RULE_ID ) )
            // InternalSCL.g:525:1: (otherlv_1= RULE_ID )
            {
            // InternalSCL.g:525:1: (otherlv_1= RULE_ID )
            // InternalSCL.g:526:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGotoRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getGotoAccess().getTargetLabelCrossReference_1_0()); 
              	
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
            if ( state.backtracking>0 ) { memoize(input, 14, ruleGoto_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleGoto"


    // $ANTLR start "entryRuleAssignment"
    // InternalSCL.g:548:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;
        int entryRuleAssignment_StartIndex = input.index();
        EObject iv_ruleAssignment = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return current; }
            // InternalSCL.g:549:2: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalSCL.g:550:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, entryRuleAssignment_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalSCL.g:557:1: ruleAssignment returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleSCLAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;
        int ruleAssignment_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_indices_3_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return current; }
            // InternalSCL.g:560:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleSCLAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) ) )
            // InternalSCL.g:561:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleSCLAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) )
            {
            // InternalSCL.g:561:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleSCLAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) )
            // InternalSCL.g:561:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleSCLAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) )
            {
            // InternalSCL.g:561:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMENT_ANNOTATION||LA11_0==49) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSCL.g:562:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:562:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:563:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_10);
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
            	    break loop11;
                }
            } while (true);

            // InternalSCL.g:579:3: ( (otherlv_1= RULE_ID ) )
            // InternalSCL.g:580:1: (otherlv_1= RULE_ID )
            {
            // InternalSCL.g:580:1: (otherlv_1= RULE_ID )
            // InternalSCL.g:581:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSCL.g:595:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSCL.g:595:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalSCL.g:599:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // InternalSCL.g:600:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // InternalSCL.g:600:1: (lv_indices_3_0= ruleExpression )
            	    // InternalSCL.g:601:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_14);
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

            	    otherlv_4=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalSCL.g:621:3: ( (lv_operator_5_0= ruleSCLAssignOperator ) )
            // InternalSCL.g:622:1: (lv_operator_5_0= ruleSCLAssignOperator )
            {
            // InternalSCL.g:622:1: (lv_operator_5_0= ruleSCLAssignOperator )
            // InternalSCL.g:623:3: lv_operator_5_0= ruleSCLAssignOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getOperatorSCLAssignOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_13);
            lv_operator_5_0=ruleSCLAssignOperator();

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
                      		"de.cau.cs.kieler.scl.SCL.SCLAssignOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSCL.g:639:2: ( (lv_expression_6_0= ruleExpression ) )
            // InternalSCL.g:640:1: (lv_expression_6_0= ruleExpression )
            {
            // InternalSCL.g:640:1: (lv_expression_6_0= ruleExpression )
            // InternalSCL.g:641:3: lv_expression_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 16, ruleAssignment_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleConditional"
    // InternalSCL.g:665:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;
        int entryRuleConditional_StartIndex = input.index();
        EObject iv_ruleConditional = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return current; }
            // InternalSCL.g:666:2: (iv_ruleConditional= ruleConditional EOF )
            // InternalSCL.g:667:2: iv_ruleConditional= ruleConditional EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditional=ruleConditional();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditional; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, entryRuleConditional_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalSCL.g:674:1: ruleConditional returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) ) ( (otherlv_3= 'then' )? otherlv_4= '{' ( (lv_declarations_5_0= ruleDeclaration ) )* ( ( ( (lv_statements_6_0= ruleInstructionStatement ) ) otherlv_7= ';' ) | ( (lv_statements_8_0= ruleMetaStatement ) ) )* ( (lv_statements_9_0= ruleStatement ) )? otherlv_10= '}' ) ( (lv_else_11_0= ruleElseScope ) )? ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;
        int ruleConditional_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_expression_2_0 = null;

        EObject lv_declarations_5_0 = null;

        EObject lv_statements_6_0 = null;

        EObject lv_statements_8_0 = null;

        EObject lv_statements_9_0 = null;

        EObject lv_else_11_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return current; }
            // InternalSCL.g:677:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) ) ( (otherlv_3= 'then' )? otherlv_4= '{' ( (lv_declarations_5_0= ruleDeclaration ) )* ( ( ( (lv_statements_6_0= ruleInstructionStatement ) ) otherlv_7= ';' ) | ( (lv_statements_8_0= ruleMetaStatement ) ) )* ( (lv_statements_9_0= ruleStatement ) )? otherlv_10= '}' ) ( (lv_else_11_0= ruleElseScope ) )? ) )
            // InternalSCL.g:678:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) ) ( (otherlv_3= 'then' )? otherlv_4= '{' ( (lv_declarations_5_0= ruleDeclaration ) )* ( ( ( (lv_statements_6_0= ruleInstructionStatement ) ) otherlv_7= ';' ) | ( (lv_statements_8_0= ruleMetaStatement ) ) )* ( (lv_statements_9_0= ruleStatement ) )? otherlv_10= '}' ) ( (lv_else_11_0= ruleElseScope ) )? )
            {
            // InternalSCL.g:678:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) ) ( (otherlv_3= 'then' )? otherlv_4= '{' ( (lv_declarations_5_0= ruleDeclaration ) )* ( ( ( (lv_statements_6_0= ruleInstructionStatement ) ) otherlv_7= ';' ) | ( (lv_statements_8_0= ruleMetaStatement ) ) )* ( (lv_statements_9_0= ruleStatement ) )? otherlv_10= '}' ) ( (lv_else_11_0= ruleElseScope ) )? )
            // InternalSCL.g:678:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) ) ( (otherlv_3= 'then' )? otherlv_4= '{' ( (lv_declarations_5_0= ruleDeclaration ) )* ( ( ( (lv_statements_6_0= ruleInstructionStatement ) ) otherlv_7= ';' ) | ( (lv_statements_8_0= ruleMetaStatement ) ) )* ( (lv_statements_9_0= ruleStatement ) )? otherlv_10= '}' ) ( (lv_else_11_0= ruleElseScope ) )?
            {
            // InternalSCL.g:678:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_COMMENT_ANNOTATION||LA13_0==49) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSCL.g:679:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:679:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:680:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
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
            	    break loop13;
                }
            } while (true);

            otherlv_1=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConditionalAccess().getIfKeyword_1());
                  
            }
            // InternalSCL.g:700:1: ( (lv_expression_2_0= ruleExpression ) )
            // InternalSCL.g:701:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalSCL.g:701:1: (lv_expression_2_0= ruleExpression )
            // InternalSCL.g:702:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_16);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionalRule());
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

            // InternalSCL.g:718:2: ( (otherlv_3= 'then' )? otherlv_4= '{' ( (lv_declarations_5_0= ruleDeclaration ) )* ( ( ( (lv_statements_6_0= ruleInstructionStatement ) ) otherlv_7= ';' ) | ( (lv_statements_8_0= ruleMetaStatement ) ) )* ( (lv_statements_9_0= ruleStatement ) )? otherlv_10= '}' )
            // InternalSCL.g:718:3: (otherlv_3= 'then' )? otherlv_4= '{' ( (lv_declarations_5_0= ruleDeclaration ) )* ( ( ( (lv_statements_6_0= ruleInstructionStatement ) ) otherlv_7= ';' ) | ( (lv_statements_8_0= ruleMetaStatement ) ) )* ( (lv_statements_9_0= ruleStatement ) )? otherlv_10= '}'
            {
            // InternalSCL.g:718:3: (otherlv_3= 'then' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSCL.g:718:5: otherlv_3= 'then'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getConditionalAccess().getThenKeyword_3_0());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_3_1());
                  
            }
            // InternalSCL.g:726:1: ( (lv_declarations_5_0= ruleDeclaration ) )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // InternalSCL.g:727:1: (lv_declarations_5_0= ruleDeclaration )
            	    {
            	    // InternalSCL.g:727:1: (lv_declarations_5_0= ruleDeclaration )
            	    // InternalSCL.g:728:3: lv_declarations_5_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getDeclarationsDeclarationParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_declarations_5_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_5_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalSCL.g:744:3: ( ( ( (lv_statements_6_0= ruleInstructionStatement ) ) otherlv_7= ';' ) | ( (lv_statements_8_0= ruleMetaStatement ) ) )*
            loop16:
            do {
                int alt16=3;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // InternalSCL.g:744:4: ( ( (lv_statements_6_0= ruleInstructionStatement ) ) otherlv_7= ';' )
            	    {
            	    // InternalSCL.g:744:4: ( ( (lv_statements_6_0= ruleInstructionStatement ) ) otherlv_7= ';' )
            	    // InternalSCL.g:744:5: ( (lv_statements_6_0= ruleInstructionStatement ) ) otherlv_7= ';'
            	    {
            	    // InternalSCL.g:744:5: ( (lv_statements_6_0= ruleInstructionStatement ) )
            	    // InternalSCL.g:745:1: (lv_statements_6_0= ruleInstructionStatement )
            	    {
            	    // InternalSCL.g:745:1: (lv_statements_6_0= ruleInstructionStatement )
            	    // InternalSCL.g:746:3: lv_statements_6_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsInstructionStatementParserRuleCall_3_3_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_statements_6_0=ruleInstructionStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_6_0, 
            	              		"de.cau.cs.kieler.scl.SCL.InstructionStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,18,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getConditionalAccess().getSemicolonKeyword_3_3_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSCL.g:767:6: ( (lv_statements_8_0= ruleMetaStatement ) )
            	    {
            	    // InternalSCL.g:767:6: ( (lv_statements_8_0= ruleMetaStatement ) )
            	    // InternalSCL.g:768:1: (lv_statements_8_0= ruleMetaStatement )
            	    {
            	    // InternalSCL.g:768:1: (lv_statements_8_0= ruleMetaStatement )
            	    // InternalSCL.g:769:3: lv_statements_8_0= ruleMetaStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsMetaStatementParserRuleCall_3_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_statements_8_0=ruleMetaStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_8_0, 
            	              		"de.cau.cs.kieler.scl.SCL.MetaStatement");
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

            // InternalSCL.g:785:4: ( (lv_statements_9_0= ruleStatement ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==RULE_COMMENT_ANNOTATION||(LA17_0>=19 && LA17_0<=20)||LA17_0==23||LA17_0==25||LA17_0==28||LA17_0==49) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSCL.g:786:1: (lv_statements_9_0= ruleStatement )
                    {
                    // InternalSCL.g:786:1: (lv_statements_9_0= ruleStatement )
                    // InternalSCL.g:787:3: lv_statements_9_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsStatementParserRuleCall_3_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_20);
                    lv_statements_9_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_9_0, 
                              		"de.cau.cs.kieler.scl.SCL.Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,26,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_3_5());
                  
            }

            }

            // InternalSCL.g:807:2: ( (lv_else_11_0= ruleElseScope ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_COMMENT_ANNOTATION||LA18_0==27||LA18_0==49) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSCL.g:808:1: (lv_else_11_0= ruleElseScope )
                    {
                    // InternalSCL.g:808:1: (lv_else_11_0= ruleElseScope )
                    // InternalSCL.g:809:3: lv_else_11_0= ruleElseScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalAccess().getElseElseScopeParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_else_11_0=ruleElseScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_11_0, 
                              		"de.cau.cs.kieler.scl.SCL.ElseScope");
                      	        afterParserOrEnumRuleCall();
                      	    
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
            if ( state.backtracking>0 ) { memoize(input, 18, ruleConditional_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleElseScope"
    // InternalSCL.g:833:1: entryRuleElseScope returns [EObject current=null] : iv_ruleElseScope= ruleElseScope EOF ;
    public final EObject entryRuleElseScope() throws RecognitionException {
        EObject current = null;
        int entryRuleElseScope_StartIndex = input.index();
        EObject iv_ruleElseScope = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return current; }
            // InternalSCL.g:834:2: (iv_ruleElseScope= ruleElseScope EOF )
            // InternalSCL.g:835:2: iv_ruleElseScope= ruleElseScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElseScope=ruleElseScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseScope; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, entryRuleElseScope_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleElseScope"


    // $ANTLR start "ruleElseScope"
    // InternalSCL.g:842:1: ruleElseScope returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'else' otherlv_3= '{' ( (lv_declarations_4_0= ruleDeclaration ) )* ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleMetaStatement ) ) )* ( (lv_statements_8_0= ruleStatement ) )? otherlv_9= '}' ) ;
    public final EObject ruleElseScope() throws RecognitionException {
        EObject current = null;
        int ruleElseScope_StartIndex = input.index();
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_declarations_4_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_statements_7_0 = null;

        EObject lv_statements_8_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return current; }
            // InternalSCL.g:845:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'else' otherlv_3= '{' ( (lv_declarations_4_0= ruleDeclaration ) )* ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleMetaStatement ) ) )* ( (lv_statements_8_0= ruleStatement ) )? otherlv_9= '}' ) )
            // InternalSCL.g:846:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'else' otherlv_3= '{' ( (lv_declarations_4_0= ruleDeclaration ) )* ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleMetaStatement ) ) )* ( (lv_statements_8_0= ruleStatement ) )? otherlv_9= '}' )
            {
            // InternalSCL.g:846:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'else' otherlv_3= '{' ( (lv_declarations_4_0= ruleDeclaration ) )* ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleMetaStatement ) ) )* ( (lv_statements_8_0= ruleStatement ) )? otherlv_9= '}' )
            // InternalSCL.g:846:2: () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'else' otherlv_3= '{' ( (lv_declarations_4_0= ruleDeclaration ) )* ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleMetaStatement ) ) )* ( (lv_statements_8_0= ruleStatement ) )? otherlv_9= '}'
            {
            // InternalSCL.g:846:2: ()
            // InternalSCL.g:847:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElseScopeAccess().getElseScopeAction_0(),
                          current);
                  
            }

            }

            // InternalSCL.g:855:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_COMMENT_ANNOTATION||LA19_0==49) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSCL.g:856:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:856:1: (lv_annotations_1_0= ruleAnnotation )
            	    // InternalSCL.g:857:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElseScopeAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_annotations_1_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElseScopeRule());
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
            	    break loop19;
                }
            } while (true);

            otherlv_2=(Token)match(input,27,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getElseScopeAccess().getElseKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,25,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getElseScopeAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalSCL.g:881:1: ( (lv_declarations_4_0= ruleDeclaration ) )*
            loop20:
            do {
                int alt20=2;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // InternalSCL.g:882:1: (lv_declarations_4_0= ruleDeclaration )
            	    {
            	    // InternalSCL.g:882:1: (lv_declarations_4_0= ruleDeclaration )
            	    // InternalSCL.g:883:3: lv_declarations_4_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElseScopeAccess().getDeclarationsDeclarationParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_declarations_4_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElseScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_4_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalSCL.g:899:3: ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleMetaStatement ) ) )*
            loop21:
            do {
                int alt21=3;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // InternalSCL.g:899:4: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
            	    {
            	    // InternalSCL.g:899:4: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
            	    // InternalSCL.g:899:5: ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';'
            	    {
            	    // InternalSCL.g:899:5: ( (lv_statements_5_0= ruleInstructionStatement ) )
            	    // InternalSCL.g:900:1: (lv_statements_5_0= ruleInstructionStatement )
            	    {
            	    // InternalSCL.g:900:1: (lv_statements_5_0= ruleInstructionStatement )
            	    // InternalSCL.g:901:3: lv_statements_5_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElseScopeAccess().getStatementsInstructionStatementParserRuleCall_5_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_statements_5_0=ruleInstructionStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElseScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_5_0, 
            	              		"de.cau.cs.kieler.scl.SCL.InstructionStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,18,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getElseScopeAccess().getSemicolonKeyword_5_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSCL.g:922:6: ( (lv_statements_7_0= ruleMetaStatement ) )
            	    {
            	    // InternalSCL.g:922:6: ( (lv_statements_7_0= ruleMetaStatement ) )
            	    // InternalSCL.g:923:1: (lv_statements_7_0= ruleMetaStatement )
            	    {
            	    // InternalSCL.g:923:1: (lv_statements_7_0= ruleMetaStatement )
            	    // InternalSCL.g:924:3: lv_statements_7_0= ruleMetaStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElseScopeAccess().getStatementsMetaStatementParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_statements_7_0=ruleMetaStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElseScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_7_0, 
            	              		"de.cau.cs.kieler.scl.SCL.MetaStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalSCL.g:940:4: ( (lv_statements_8_0= ruleStatement ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||LA22_0==RULE_COMMENT_ANNOTATION||(LA22_0>=19 && LA22_0<=20)||LA22_0==23||LA22_0==25||LA22_0==28||LA22_0==49) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSCL.g:941:1: (lv_statements_8_0= ruleStatement )
                    {
                    // InternalSCL.g:941:1: (lv_statements_8_0= ruleStatement )
                    // InternalSCL.g:942:3: lv_statements_8_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElseScopeAccess().getStatementsStatementParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_20);
                    lv_statements_8_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElseScopeRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_8_0, 
                              		"de.cau.cs.kieler.scl.SCL.Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getElseScopeAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, ruleElseScope_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleElseScope"


    // $ANTLR start "entryRuleThread"
    // InternalSCL.g:970:1: entryRuleThread returns [EObject current=null] : iv_ruleThread= ruleThread EOF ;
    public final EObject entryRuleThread() throws RecognitionException {
        EObject current = null;
        int entryRuleThread_StartIndex = input.index();
        EObject iv_ruleThread = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return current; }
            // InternalSCL.g:971:2: (iv_ruleThread= ruleThread EOF )
            // InternalSCL.g:972:2: iv_ruleThread= ruleThread EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThreadRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleThread=ruleThread();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThread; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, entryRuleThread_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleThread"


    // $ANTLR start "ruleThread"
    // InternalSCL.g:979:1: ruleThread returns [EObject current=null] : ( () ( ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}' ) | ( ( ( ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_statements_11_0= ruleMetaStatement ) ) )* ( (lv_statements_12_0= ruleStatement ) )? ) ) ) ;
    public final EObject ruleThread() throws RecognitionException {
        EObject current = null;
        int ruleThread_StartIndex = input.index();
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_declarations_3_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_statements_6_0 = null;

        EObject lv_statements_7_0 = null;

        EObject lv_statements_9_0 = null;

        EObject lv_statements_11_0 = null;

        EObject lv_statements_12_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return current; }
            // InternalSCL.g:982:28: ( ( () ( ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}' ) | ( ( ( ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_statements_11_0= ruleMetaStatement ) ) )* ( (lv_statements_12_0= ruleStatement ) )? ) ) ) )
            // InternalSCL.g:983:1: ( () ( ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}' ) | ( ( ( ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_statements_11_0= ruleMetaStatement ) ) )* ( (lv_statements_12_0= ruleStatement ) )? ) ) )
            {
            // InternalSCL.g:983:1: ( () ( ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}' ) | ( ( ( ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_statements_11_0= ruleMetaStatement ) ) )* ( (lv_statements_12_0= ruleStatement ) )? ) ) )
            // InternalSCL.g:983:2: () ( ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}' ) | ( ( ( ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_statements_11_0= ruleMetaStatement ) ) )* ( (lv_statements_12_0= ruleStatement ) )? ) )
            {
            // InternalSCL.g:983:2: ()
            // InternalSCL.g:984:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getThreadAccess().getThreadAction_0(),
                          current);
                  
            }

            }

            // InternalSCL.g:992:2: ( ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}' ) | ( ( ( ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_statements_11_0= ruleMetaStatement ) ) )* ( (lv_statements_12_0= ruleStatement ) )? ) )
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalSCL.g:992:3: ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}' )
                    {
                    // InternalSCL.g:992:3: ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}' )
                    // InternalSCL.g:992:4: ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}'
                    {
                    // InternalSCL.g:992:4: ( (lv_annotations_1_0= ruleAnnotation ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_COMMENT_ANNOTATION||LA23_0==49) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSCL.g:993:1: (lv_annotations_1_0= ruleAnnotation )
                    	    {
                    	    // InternalSCL.g:993:1: (lv_annotations_1_0= ruleAnnotation )
                    	    // InternalSCL.g:994:3: lv_annotations_1_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getThreadAccess().getAnnotationsAnnotationParserRuleCall_1_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_annotations_1_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getThreadRule());
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
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_2=(Token)match(input,25,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getThreadAccess().getLeftCurlyBracketKeyword_1_0_1());
                          
                    }
                    // InternalSCL.g:1014:1: ( (lv_declarations_3_0= ruleDeclaration ) )*
                    loop24:
                    do {
                        int alt24=2;
                        alt24 = dfa24.predict(input);
                        switch (alt24) {
                    	case 1 :
                    	    // InternalSCL.g:1015:1: (lv_declarations_3_0= ruleDeclaration )
                    	    {
                    	    // InternalSCL.g:1015:1: (lv_declarations_3_0= ruleDeclaration )
                    	    // InternalSCL.g:1016:3: lv_declarations_3_0= ruleDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getThreadAccess().getDeclarationsDeclarationParserRuleCall_1_0_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_declarations_3_0=ruleDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getThreadRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declarations",
                    	              		lv_declarations_3_0, 
                    	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Declaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    // InternalSCL.g:1032:3: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )*
                    loop25:
                    do {
                        int alt25=3;
                        alt25 = dfa25.predict(input);
                        switch (alt25) {
                    	case 1 :
                    	    // InternalSCL.g:1032:4: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
                    	    {
                    	    // InternalSCL.g:1032:4: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
                    	    // InternalSCL.g:1032:5: ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';'
                    	    {
                    	    // InternalSCL.g:1032:5: ( (lv_statements_4_0= ruleInstructionStatement ) )
                    	    // InternalSCL.g:1033:1: (lv_statements_4_0= ruleInstructionStatement )
                    	    {
                    	    // InternalSCL.g:1033:1: (lv_statements_4_0= ruleInstructionStatement )
                    	    // InternalSCL.g:1034:3: lv_statements_4_0= ruleInstructionStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_1_0_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_statements_4_0=ruleInstructionStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getThreadRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_4_0, 
                    	              		"de.cau.cs.kieler.scl.SCL.InstructionStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_5=(Token)match(input,18,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getThreadAccess().getSemicolonKeyword_1_0_3_0_1());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSCL.g:1055:6: ( (lv_statements_6_0= ruleMetaStatement ) )
                    	    {
                    	    // InternalSCL.g:1055:6: ( (lv_statements_6_0= ruleMetaStatement ) )
                    	    // InternalSCL.g:1056:1: (lv_statements_6_0= ruleMetaStatement )
                    	    {
                    	    // InternalSCL.g:1056:1: (lv_statements_6_0= ruleMetaStatement )
                    	    // InternalSCL.g:1057:3: lv_statements_6_0= ruleMetaStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsMetaStatementParserRuleCall_1_0_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    lv_statements_6_0=ruleMetaStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getThreadRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_6_0, 
                    	              		"de.cau.cs.kieler.scl.SCL.MetaStatement");
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

                    // InternalSCL.g:1073:4: ( (lv_statements_7_0= ruleStatement ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_ID||LA26_0==RULE_COMMENT_ANNOTATION||(LA26_0>=19 && LA26_0<=20)||LA26_0==23||LA26_0==25||LA26_0==28||LA26_0==49) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalSCL.g:1074:1: (lv_statements_7_0= ruleStatement )
                            {
                            // InternalSCL.g:1074:1: (lv_statements_7_0= ruleStatement )
                            // InternalSCL.g:1075:3: lv_statements_7_0= ruleStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsStatementParserRuleCall_1_0_4_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_20);
                            lv_statements_7_0=ruleStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getThreadRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"statements",
                                      		lv_statements_7_0, 
                                      		"de.cau.cs.kieler.scl.SCL.Statement");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getThreadAccess().getRightCurlyBracketKeyword_1_0_5());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:1096:6: ( ( ( ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_statements_11_0= ruleMetaStatement ) ) )* ( (lv_statements_12_0= ruleStatement ) )? )
                    {
                    // InternalSCL.g:1096:6: ( ( ( ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_statements_11_0= ruleMetaStatement ) ) )* ( (lv_statements_12_0= ruleStatement ) )? )
                    // InternalSCL.g:1096:7: ( ( ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_statements_11_0= ruleMetaStatement ) ) )* ( (lv_statements_12_0= ruleStatement ) )?
                    {
                    // InternalSCL.g:1096:7: ( ( ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_statements_11_0= ruleMetaStatement ) ) )*
                    loop27:
                    do {
                        int alt27=3;
                        alt27 = dfa27.predict(input);
                        switch (alt27) {
                    	case 1 :
                    	    // InternalSCL.g:1096:8: ( ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' )
                    	    {
                    	    // InternalSCL.g:1096:8: ( ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' )
                    	    // InternalSCL.g:1096:9: ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';'
                    	    {
                    	    // InternalSCL.g:1096:9: ( (lv_statements_9_0= ruleInstructionStatement ) )
                    	    // InternalSCL.g:1097:1: (lv_statements_9_0= ruleInstructionStatement )
                    	    {
                    	    // InternalSCL.g:1097:1: (lv_statements_9_0= ruleInstructionStatement )
                    	    // InternalSCL.g:1098:3: lv_statements_9_0= ruleInstructionStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_1_1_0_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_statements_9_0=ruleInstructionStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getThreadRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_9_0, 
                    	              		"de.cau.cs.kieler.scl.SCL.InstructionStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_10=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getThreadAccess().getSemicolonKeyword_1_1_0_0_1());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSCL.g:1119:6: ( (lv_statements_11_0= ruleMetaStatement ) )
                    	    {
                    	    // InternalSCL.g:1119:6: ( (lv_statements_11_0= ruleMetaStatement ) )
                    	    // InternalSCL.g:1120:1: (lv_statements_11_0= ruleMetaStatement )
                    	    {
                    	    // InternalSCL.g:1120:1: (lv_statements_11_0= ruleMetaStatement )
                    	    // InternalSCL.g:1121:3: lv_statements_11_0= ruleMetaStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsMetaStatementParserRuleCall_1_1_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_8);
                    	    lv_statements_11_0=ruleMetaStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getThreadRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_11_0, 
                    	              		"de.cau.cs.kieler.scl.SCL.MetaStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    // InternalSCL.g:1137:4: ( (lv_statements_12_0= ruleStatement ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_ID||LA28_0==RULE_COMMENT_ANNOTATION||(LA28_0>=19 && LA28_0<=20)||LA28_0==23||LA28_0==25||LA28_0==28||LA28_0==49) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalSCL.g:1138:1: (lv_statements_12_0= ruleStatement )
                            {
                            // InternalSCL.g:1138:1: (lv_statements_12_0= ruleStatement )
                            // InternalSCL.g:1139:3: lv_statements_12_0= ruleStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsStatementParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_2);
                            lv_statements_12_0=ruleStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getThreadRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"statements",
                                      		lv_statements_12_0, 
                                      		"de.cau.cs.kieler.scl.SCL.Statement");
                              	        afterParserOrEnumRuleCall();
                              	    
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

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, ruleThread_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleThread"


    // $ANTLR start "entryRuleParallel"
    // InternalSCL.g:1163:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;
        int entryRuleParallel_StartIndex = input.index();
        EObject iv_ruleParallel = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return current; }
            // InternalSCL.g:1164:2: (iv_ruleParallel= ruleParallel EOF )
            // InternalSCL.g:1165:2: iv_ruleParallel= ruleParallel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParallelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParallel=ruleParallel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParallel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, entryRuleParallel_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleParallel"


    // $ANTLR start "ruleParallel"
    // InternalSCL.g:1172:1: ruleParallel returns [EObject current=null] : (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;
        int ruleParallel_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_threads_1_0 = null;

        EObject lv_threads_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return current; }
            // InternalSCL.g:1175:28: ( (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' ) )
            // InternalSCL.g:1176:1: (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' )
            {
            // InternalSCL.g:1176:1: (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' )
            // InternalSCL.g:1176:3: otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParallelAccess().getForkKeyword_0());
                  
            }
            // InternalSCL.g:1180:1: ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* )
            // InternalSCL.g:1180:2: ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )*
            {
            // InternalSCL.g:1180:2: ( (lv_threads_1_0= ruleThread ) )
            // InternalSCL.g:1181:1: (lv_threads_1_0= ruleThread )
            {
            // InternalSCL.g:1181:1: (lv_threads_1_0= ruleThread )
            // InternalSCL.g:1182:3: lv_threads_1_0= ruleThread
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParallelAccess().getThreadsThreadParserRuleCall_1_0_0()); 
              	    
            }
            pushFollow(FOLLOW_25);
            lv_threads_1_0=ruleThread();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParallelRule());
              	        }
                     		add(
                     			current, 
                     			"threads",
                      		lv_threads_1_0, 
                      		"de.cau.cs.kieler.scl.SCL.Thread");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSCL.g:1198:2: (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==29) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSCL.g:1198:4: otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParallelAccess().getParKeyword_1_1_0());
            	          
            	    }
            	    // InternalSCL.g:1202:1: ( (lv_threads_3_0= ruleThread ) )
            	    // InternalSCL.g:1203:1: (lv_threads_3_0= ruleThread )
            	    {
            	    // InternalSCL.g:1203:1: (lv_threads_3_0= ruleThread )
            	    // InternalSCL.g:1204:3: lv_threads_3_0= ruleThread
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParallelAccess().getThreadsThreadParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_threads_3_0=ruleThread();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParallelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"threads",
            	              		lv_threads_3_0, 
            	              		"de.cau.cs.kieler.scl.SCL.Thread");
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

            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getParallelAccess().getJoinKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, ruleParallel_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRuleScopeStatement"
    // InternalSCL.g:1232:1: entryRuleScopeStatement returns [EObject current=null] : iv_ruleScopeStatement= ruleScopeStatement EOF ;
    public final EObject entryRuleScopeStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleScopeStatement_StartIndex = input.index();
        EObject iv_ruleScopeStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return current; }
            // InternalSCL.g:1233:2: (iv_ruleScopeStatement= ruleScopeStatement EOF )
            // InternalSCL.g:1234:2: iv_ruleScopeStatement= ruleScopeStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopeStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScopeStatement=ruleScopeStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScopeStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, entryRuleScopeStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleScopeStatement"


    // $ANTLR start "ruleScopeStatement"
    // InternalSCL.g:1241:1: ruleScopeStatement returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}' ) ;
    public final EObject ruleScopeStatement() throws RecognitionException {
        EObject current = null;
        int ruleScopeStatement_StartIndex = input.index();
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_declarations_3_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_statements_6_0 = null;

        EObject lv_statements_7_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return current; }
            // InternalSCL.g:1244:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}' ) )
            // InternalSCL.g:1245:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}' )
            {
            // InternalSCL.g:1245:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}' )
            // InternalSCL.g:1245:2: () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}'
            {
            // InternalSCL.g:1245:2: ()
            // InternalSCL.g:1246:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getScopeStatementAccess().getScopeStatementAction_0(),
                          current);
                  
            }

            }

            // InternalSCL.g:1254:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_COMMENT_ANNOTATION||LA31_0==49) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSCL.g:1255:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:1255:1: (lv_annotations_1_0= ruleAnnotation )
            	    // InternalSCL.g:1256:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeStatementAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_annotations_1_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScopeStatementRule());
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
            	    break loop31;
                }
            } while (true);

            otherlv_2=(Token)match(input,25,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getScopeStatementAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalSCL.g:1276:1: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // InternalSCL.g:1277:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // InternalSCL.g:1277:1: (lv_declarations_3_0= ruleDeclaration )
            	    // InternalSCL.g:1278:3: lv_declarations_3_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeStatementAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScopeStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_3_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalSCL.g:1294:3: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )*
            loop33:
            do {
                int alt33=3;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // InternalSCL.g:1294:4: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
            	    {
            	    // InternalSCL.g:1294:4: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
            	    // InternalSCL.g:1294:5: ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';'
            	    {
            	    // InternalSCL.g:1294:5: ( (lv_statements_4_0= ruleInstructionStatement ) )
            	    // InternalSCL.g:1295:1: (lv_statements_4_0= ruleInstructionStatement )
            	    {
            	    // InternalSCL.g:1295:1: (lv_statements_4_0= ruleInstructionStatement )
            	    // InternalSCL.g:1296:3: lv_statements_4_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeStatementAccess().getStatementsInstructionStatementParserRuleCall_4_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_statements_4_0=ruleInstructionStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScopeStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_4_0, 
            	              		"de.cau.cs.kieler.scl.SCL.InstructionStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,18,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getScopeStatementAccess().getSemicolonKeyword_4_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSCL.g:1317:6: ( (lv_statements_6_0= ruleMetaStatement ) )
            	    {
            	    // InternalSCL.g:1317:6: ( (lv_statements_6_0= ruleMetaStatement ) )
            	    // InternalSCL.g:1318:1: (lv_statements_6_0= ruleMetaStatement )
            	    {
            	    // InternalSCL.g:1318:1: (lv_statements_6_0= ruleMetaStatement )
            	    // InternalSCL.g:1319:3: lv_statements_6_0= ruleMetaStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeStatementAccess().getStatementsMetaStatementParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_statements_6_0=ruleMetaStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScopeStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_6_0, 
            	              		"de.cau.cs.kieler.scl.SCL.MetaStatement");
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

            // InternalSCL.g:1335:4: ( (lv_statements_7_0= ruleStatement ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||LA34_0==RULE_COMMENT_ANNOTATION||(LA34_0>=19 && LA34_0<=20)||LA34_0==23||LA34_0==25||LA34_0==28||LA34_0==49) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSCL.g:1336:1: (lv_statements_7_0= ruleStatement )
                    {
                    // InternalSCL.g:1336:1: (lv_statements_7_0= ruleStatement )
                    // InternalSCL.g:1337:3: lv_statements_7_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScopeStatementAccess().getStatementsStatementParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_20);
                    lv_statements_7_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScopeStatementRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_7_0, 
                              		"de.cau.cs.kieler.scl.SCL.Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getScopeStatementAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, ruleScopeStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleScopeStatement"


    // $ANTLR start "entryRuleTestEntity"
    // InternalSCL.g:1367:1: entryRuleTestEntity returns [EObject current=null] : iv_ruleTestEntity= ruleTestEntity EOF ;
    public final EObject entryRuleTestEntity() throws RecognitionException {
        EObject current = null;
        int entryRuleTestEntity_StartIndex = input.index();
        EObject iv_ruleTestEntity = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return current; }
            // InternalSCL.g:1368:2: (iv_ruleTestEntity= ruleTestEntity EOF )
            // InternalSCL.g:1369:2: iv_ruleTestEntity= ruleTestEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTestEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTestEntity=ruleTestEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTestEntity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, entryRuleTestEntity_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTestEntity"


    // $ANTLR start "ruleTestEntity"
    // InternalSCL.g:1376:1: ruleTestEntity returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) ;
    public final EObject ruleTestEntity() throws RecognitionException {
        EObject current = null;
        int ruleTestEntity_StartIndex = input.index();
        EObject lv_expression_0_0 = null;

        EObject lv_effect_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return current; }
            // InternalSCL.g:1379:28: ( ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) )
            // InternalSCL.g:1380:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            {
            // InternalSCL.g:1380:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalSCL.g:1380:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    {
                    // InternalSCL.g:1380:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    // InternalSCL.g:1381:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    {
                    // InternalSCL.g:1381:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    // InternalSCL.g:1382:3: lv_expression_0_0= ruleAnnotatedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTestEntityAccess().getExpressionAnnotatedExpressionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:1399:6: ( (lv_effect_1_0= ruleEffect ) )
                    {
                    // InternalSCL.g:1399:6: ( (lv_effect_1_0= ruleEffect ) )
                    // InternalSCL.g:1400:1: (lv_effect_1_0= ruleEffect )
                    {
                    // InternalSCL.g:1400:1: (lv_effect_1_0= ruleEffect )
                    // InternalSCL.g:1401:3: lv_effect_1_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTestEntityAccess().getEffectEffectParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 28, ruleTestEntity_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTestEntity"


    // $ANTLR start "entryRuleAnnotatedExpression"
    // InternalSCL.g:1425:1: entryRuleAnnotatedExpression returns [EObject current=null] : iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF ;
    public final EObject entryRuleAnnotatedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAnnotatedExpression_StartIndex = input.index();
        EObject iv_ruleAnnotatedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return current; }
            // InternalSCL.g:1426:2: (iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF )
            // InternalSCL.g:1427:2: iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotatedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnnotatedExpression=ruleAnnotatedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotatedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, entryRuleAnnotatedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotatedExpression"


    // $ANTLR start "ruleAnnotatedExpression"
    // InternalSCL.g:1434:1: ruleAnnotatedExpression returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAnnotatedExpression() throws RecognitionException {
        EObject current = null;
        int ruleAnnotatedExpression_StartIndex = input.index();
        Token otherlv_1=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return current; }
            // InternalSCL.g:1437:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalSCL.g:1438:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalSCL.g:1438:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalSCL.g:1438:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalSCL.g:1438:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_COMMENT_ANNOTATION||LA36_0==49) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSCL.g:1439:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:1439:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:1440:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotatedExpressionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_26);
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
            	    break loop36;
                }
            } while (true);

            otherlv_1=(Token)match(input,31,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAnnotatedExpressionAccess().getExpressionKeyword_1());
                  
            }
            // InternalSCL.g:1460:1: ( (lv_expression_2_0= ruleExpression ) )
            // InternalSCL.g:1461:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalSCL.g:1461:1: (lv_expression_2_0= ruleExpression )
            // InternalSCL.g:1462:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotatedExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 30, ruleAnnotatedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAnnotatedExpression"


    // $ANTLR start "entryRuleDeclaration"
    // InternalSCL.g:1486:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleDeclaration_StartIndex = input.index();
        EObject iv_ruleDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return current; }
            // InternalSCL.g:1487:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalSCL.g:1488:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, entryRuleDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalSCL.g:1495:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleDeclaration_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return current; }
            // InternalSCL.g:1498:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' ) )
            // InternalSCL.g:1499:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' )
            {
            // InternalSCL.g:1499:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' )
            // InternalSCL.g:1499:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';'
            {
            // InternalSCL.g:1499:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_COMMENT_ANNOTATION||LA37_0==49) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSCL.g:1500:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:1500:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:1501:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_27);
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
            	    break loop37;
                }
            } while (true);

            // InternalSCL.g:1517:3: ( (lv_const_1_0= 'const' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSCL.g:1518:1: (lv_const_1_0= 'const' )
                    {
                    // InternalSCL.g:1518:1: (lv_const_1_0= 'const' )
                    // InternalSCL.g:1519:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,32,FOLLOW_28); if (state.failed) return current;
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

            // InternalSCL.g:1532:3: ( (lv_extern_2_0= 'extern' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==33) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSCL.g:1533:1: (lv_extern_2_0= 'extern' )
                    {
                    // InternalSCL.g:1533:1: (lv_extern_2_0= 'extern' )
                    // InternalSCL.g:1534:3: lv_extern_2_0= 'extern'
                    {
                    lv_extern_2_0=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
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

            // InternalSCL.g:1547:3: ( (lv_volatile_3_0= 'volatile' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSCL.g:1548:1: (lv_volatile_3_0= 'volatile' )
                    {
                    // InternalSCL.g:1548:1: (lv_volatile_3_0= 'volatile' )
                    // InternalSCL.g:1549:3: lv_volatile_3_0= 'volatile'
                    {
                    lv_volatile_3_0=(Token)match(input,34,FOLLOW_30); if (state.failed) return current;
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

            // InternalSCL.g:1562:3: ( (lv_input_4_0= 'input' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==35) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSCL.g:1563:1: (lv_input_4_0= 'input' )
                    {
                    // InternalSCL.g:1563:1: (lv_input_4_0= 'input' )
                    // InternalSCL.g:1564:3: lv_input_4_0= 'input'
                    {
                    lv_input_4_0=(Token)match(input,35,FOLLOW_31); if (state.failed) return current;
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

            // InternalSCL.g:1577:3: ( (lv_output_5_0= 'output' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSCL.g:1578:1: (lv_output_5_0= 'output' )
                    {
                    // InternalSCL.g:1578:1: (lv_output_5_0= 'output' )
                    // InternalSCL.g:1579:3: lv_output_5_0= 'output'
                    {
                    lv_output_5_0=(Token)match(input,36,FOLLOW_32); if (state.failed) return current;
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

            // InternalSCL.g:1592:3: ( (lv_static_6_0= 'static' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSCL.g:1593:1: (lv_static_6_0= 'static' )
                    {
                    // InternalSCL.g:1593:1: (lv_static_6_0= 'static' )
                    // InternalSCL.g:1594:3: lv_static_6_0= 'static'
                    {
                    lv_static_6_0=(Token)match(input,37,FOLLOW_33); if (state.failed) return current;
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

            // InternalSCL.g:1607:3: ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==38) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==RULE_ID) ) {
                    alt45=2;
                }
                else if ( ((LA45_1>=68 && LA45_1<=74)) ) {
                    alt45=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA45_0>=68 && LA45_0<=74)) ) {
                alt45=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalSCL.g:1607:4: ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) )
                    {
                    // InternalSCL.g:1607:4: ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) )
                    // InternalSCL.g:1607:5: ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) )
                    {
                    // InternalSCL.g:1607:5: ( (lv_signal_7_0= 'signal' ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==38) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalSCL.g:1608:1: (lv_signal_7_0= 'signal' )
                            {
                            // InternalSCL.g:1608:1: (lv_signal_7_0= 'signal' )
                            // InternalSCL.g:1609:3: lv_signal_7_0= 'signal'
                            {
                            lv_signal_7_0=(Token)match(input,38,FOLLOW_33); if (state.failed) return current;
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

                    // InternalSCL.g:1622:3: ( (lv_type_8_0= ruleValueType ) )
                    // InternalSCL.g:1623:1: (lv_type_8_0= ruleValueType )
                    {
                    // InternalSCL.g:1623:1: (lv_type_8_0= ruleValueType )
                    // InternalSCL.g:1624:3: lv_type_8_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeValueTypeEnumRuleCall_7_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_4);
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
                    // InternalSCL.g:1641:6: ( (lv_signal_9_0= 'signal' ) )
                    {
                    // InternalSCL.g:1641:6: ( (lv_signal_9_0= 'signal' ) )
                    // InternalSCL.g:1642:1: (lv_signal_9_0= 'signal' )
                    {
                    // InternalSCL.g:1642:1: (lv_signal_9_0= 'signal' )
                    // InternalSCL.g:1643:3: lv_signal_9_0= 'signal'
                    {
                    lv_signal_9_0=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
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

            // InternalSCL.g:1656:3: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            // InternalSCL.g:1657:1: (lv_valuedObjects_10_0= ruleValuedObject )
            {
            // InternalSCL.g:1657:1: (lv_valuedObjects_10_0= ruleValuedObject )
            // InternalSCL.g:1658:3: lv_valuedObjects_10_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_34);
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

            // InternalSCL.g:1674:2: (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==39) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSCL.g:1674:4: otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) )
            	    {
            	    otherlv_11=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getDeclarationAccess().getCommaKeyword_9_0());
            	          
            	    }
            	    // InternalSCL.g:1678:1: ( (lv_valuedObjects_12_0= ruleValuedObject ) )
            	    // InternalSCL.g:1679:1: (lv_valuedObjects_12_0= ruleValuedObject )
            	    {
            	    // InternalSCL.g:1679:1: (lv_valuedObjects_12_0= ruleValuedObject )
            	    // InternalSCL.g:1680:3: lv_valuedObjects_12_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_9_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_34);
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
            	    break loop46;
                }
            } while (true);

            otherlv_13=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 32, ruleDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleValuedObject"
    // InternalSCL.g:1708:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObject_StartIndex = input.index();
        EObject iv_ruleValuedObject = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return current; }
            // InternalSCL.g:1709:2: (iv_ruleValuedObject= ruleValuedObject EOF )
            // InternalSCL.g:1710:2: iv_ruleValuedObject= ruleValuedObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValuedObject=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, entryRuleValuedObject_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObject"


    // $ANTLR start "ruleValuedObject"
    // InternalSCL.g:1717:1: ruleValuedObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? ) ;
    public final EObject ruleValuedObject() throws RecognitionException {
        EObject current = null;
        int ruleValuedObject_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return current; }
            // InternalSCL.g:1720:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? ) )
            // InternalSCL.g:1721:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? )
            {
            // InternalSCL.g:1721:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? )
            // InternalSCL.g:1721:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )?
            {
            // InternalSCL.g:1721:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSCL.g:1722:1: (lv_name_0_0= RULE_ID )
            {
            // InternalSCL.g:1722:1: (lv_name_0_0= RULE_ID )
            // InternalSCL.g:1723:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
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

            // InternalSCL.g:1739:2: (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==21) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSCL.g:1739:4: otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // InternalSCL.g:1743:1: ( (lv_cardinalities_2_0= ruleExpression ) )
            	    // InternalSCL.g:1744:1: (lv_cardinalities_2_0= ruleExpression )
            	    {
            	    // InternalSCL.g:1744:1: (lv_cardinalities_2_0= ruleExpression )
            	    // InternalSCL.g:1745:3: lv_cardinalities_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCardinalitiesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_14);
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

            	    otherlv_3=(Token)match(input,22,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // InternalSCL.g:1765:3: (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==40) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSCL.g:1765:5: otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // InternalSCL.g:1769:1: ( (lv_initialValue_5_0= ruleExpression ) )
                    // InternalSCL.g:1770:1: (lv_initialValue_5_0= ruleExpression )
                    {
                    // InternalSCL.g:1770:1: (lv_initialValue_5_0= ruleExpression )
                    // InternalSCL.g:1771:3: lv_initialValue_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getInitialValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_36);
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

            // InternalSCL.g:1787:4: (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==41) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSCL.g:1787:6: otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) )
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getValuedObjectAccess().getCombineKeyword_3_0());
                          
                    }
                    // InternalSCL.g:1791:1: ( (lv_combineOperator_7_0= ruleCombineOperator ) )
                    // InternalSCL.g:1792:1: (lv_combineOperator_7_0= ruleCombineOperator )
                    {
                    // InternalSCL.g:1792:1: (lv_combineOperator_7_0= ruleCombineOperator )
                    // InternalSCL.g:1793:3: lv_combineOperator_7_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCombineOperatorCombineOperatorEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 34, ruleValuedObject_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObject"


    // $ANTLR start "entryRuleEffect"
    // InternalSCL.g:1817:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;
        int entryRuleEffect_StartIndex = input.index();
        EObject iv_ruleEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return current; }
            // InternalSCL.g:1818:2: (iv_ruleEffect= ruleEffect EOF )
            // InternalSCL.g:1819:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEffect=ruleEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, entryRuleEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalSCL.g:1826:1: ruleEffect returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;
        int ruleEffect_StartIndex = input.index();
        EObject this_Assignment_0 = null;

        EObject this_PostfixEffect_1 = null;

        EObject this_Emission_2 = null;

        EObject this_HostcodeEffect_3 = null;

        EObject this_FunctionCallEffect_4 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return current; }
            // InternalSCL.g:1829:28: ( (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) )
            // InternalSCL.g:1830:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            {
            // InternalSCL.g:1830:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            int alt50=5;
            switch ( input.LA(1) ) {
            case RULE_COMMENT_ANNOTATION:
                {
                int LA50_1 = input.LA(2);

                if ( (synpred59_InternalSCL()) ) {
                    alt50=1;
                }
                else if ( (synpred60_InternalSCL()) ) {
                    alt50=2;
                }
                else if ( (synpred61_InternalSCL()) ) {
                    alt50=3;
                }
                else if ( (synpred62_InternalSCL()) ) {
                    alt50=4;
                }
                else if ( (true) ) {
                    alt50=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                int LA50_2 = input.LA(2);

                if ( (synpred59_InternalSCL()) ) {
                    alt50=1;
                }
                else if ( (synpred60_InternalSCL()) ) {
                    alt50=2;
                }
                else if ( (synpred61_InternalSCL()) ) {
                    alt50=3;
                }
                else if ( (synpred62_InternalSCL()) ) {
                    alt50=4;
                }
                else if ( (true) ) {
                    alt50=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA50_3 = input.LA(2);

                if ( (synpred59_InternalSCL()) ) {
                    alt50=1;
                }
                else if ( (synpred60_InternalSCL()) ) {
                    alt50=2;
                }
                else if ( (synpred61_InternalSCL()) ) {
                    alt50=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                alt50=4;
                }
                break;
            case 44:
                {
                alt50=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalSCL.g:1831:2: this_Assignment_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:1844:2: this_PostfixEffect_1= rulePostfixEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getPostfixEffectParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:1857:2: this_Emission_2= ruleEmission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:1870:2: this_HostcodeEffect_3= ruleHostcodeEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getHostcodeEffectParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:1883:2: this_FunctionCallEffect_4= ruleFunctionCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getFunctionCallEffectParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 36, ruleEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleEmission"
    // InternalSCL.g:1902:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;
        int entryRuleEmission_StartIndex = input.index();
        EObject iv_ruleEmission = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return current; }
            // InternalSCL.g:1903:2: (iv_ruleEmission= ruleEmission EOF )
            // InternalSCL.g:1904:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEmission=ruleEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, entryRuleEmission_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEmission"


    // $ANTLR start "ruleEmission"
    // InternalSCL.g:1911:1: ruleEmission returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;
        int ruleEmission_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_newValue_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return current; }
            // InternalSCL.g:1914:28: ( ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) )
            // InternalSCL.g:1915:1: ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            {
            // InternalSCL.g:1915:1: ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            // InternalSCL.g:1915:2: ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            {
            // InternalSCL.g:1915:2: ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_COMMENT_ANNOTATION||LA51_0==49) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalSCL.g:1916:1: (lv_annotations_0_0= ruleRestrictedAnnotation )
            	    {
            	    // InternalSCL.g:1916:1: (lv_annotations_0_0= ruleRestrictedAnnotation )
            	    // InternalSCL.g:1917:3: lv_annotations_0_0= ruleRestrictedAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmissionAccess().getAnnotationsRestrictedAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_10);
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
            	    break loop51;
                }
            } while (true);

            // InternalSCL.g:1933:3: ( (otherlv_1= RULE_ID ) )
            // InternalSCL.g:1934:1: (otherlv_1= RULE_ID )
            {
            // InternalSCL.g:1934:1: (otherlv_1= RULE_ID )
            // InternalSCL.g:1935:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSCL.g:1949:2: (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==42) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSCL.g:1949:4: otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalSCL.g:1953:1: ( (lv_newValue_3_0= ruleExpression ) )
                    // InternalSCL.g:1954:1: (lv_newValue_3_0= ruleExpression )
                    {
                    // InternalSCL.g:1954:1: (lv_newValue_3_0= ruleExpression )
                    // InternalSCL.g:1955:3: lv_newValue_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_39);
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

                    otherlv_4=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 38, ruleEmission_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEmission"


    // $ANTLR start "entryRulePostfixEffect"
    // InternalSCL.g:1983:1: entryRulePostfixEffect returns [EObject current=null] : iv_rulePostfixEffect= rulePostfixEffect EOF ;
    public final EObject entryRulePostfixEffect() throws RecognitionException {
        EObject current = null;
        int entryRulePostfixEffect_StartIndex = input.index();
        EObject iv_rulePostfixEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return current; }
            // InternalSCL.g:1984:2: (iv_rulePostfixEffect= rulePostfixEffect EOF )
            // InternalSCL.g:1985:2: iv_rulePostfixEffect= rulePostfixEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixEffectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePostfixEffect=rulePostfixEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixEffect; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, entryRulePostfixEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePostfixEffect"


    // $ANTLR start "rulePostfixEffect"
    // InternalSCL.g:1992:1: rulePostfixEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) ;
    public final EObject rulePostfixEffect() throws RecognitionException {
        EObject current = null;
        int rulePostfixEffect_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_indices_3_0 = null;

        Enumerator lv_operator_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return current; }
            // InternalSCL.g:1995:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) )
            // InternalSCL.g:1996:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            {
            // InternalSCL.g:1996:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            // InternalSCL.g:1996:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) )
            {
            // InternalSCL.g:1996:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_COMMENT_ANNOTATION||LA53_0==49) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalSCL.g:1997:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:1997:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:1998:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_10);
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
            	    break loop53;
                }
            } while (true);

            // InternalSCL.g:2014:3: ( (otherlv_1= RULE_ID ) )
            // InternalSCL.g:2015:1: (otherlv_1= RULE_ID )
            {
            // InternalSCL.g:2015:1: (otherlv_1= RULE_ID )
            // InternalSCL.g:2016:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPostfixEffectRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getPostfixEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSCL.g:2030:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==21) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalSCL.g:2030:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPostfixEffectAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalSCL.g:2034:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // InternalSCL.g:2035:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // InternalSCL.g:2035:1: (lv_indices_3_0= ruleExpression )
            	    // InternalSCL.g:2036:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_14);
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

            	    otherlv_4=(Token)match(input,22,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getPostfixEffectAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // InternalSCL.g:2056:3: ( (lv_operator_5_0= rulePostfixOperator ) )
            // InternalSCL.g:2057:1: (lv_operator_5_0= rulePostfixOperator )
            {
            // InternalSCL.g:2057:1: (lv_operator_5_0= rulePostfixOperator )
            // InternalSCL.g:2058:3: lv_operator_5_0= rulePostfixOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getOperatorPostfixOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 40, rulePostfixEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePostfixEffect"


    // $ANTLR start "entryRuleHostcodeEffect"
    // InternalSCL.g:2082:1: entryRuleHostcodeEffect returns [EObject current=null] : iv_ruleHostcodeEffect= ruleHostcodeEffect EOF ;
    public final EObject entryRuleHostcodeEffect() throws RecognitionException {
        EObject current = null;
        int entryRuleHostcodeEffect_StartIndex = input.index();
        EObject iv_ruleHostcodeEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return current; }
            // InternalSCL.g:2083:2: (iv_ruleHostcodeEffect= ruleHostcodeEffect EOF )
            // InternalSCL.g:2084:2: iv_ruleHostcodeEffect= ruleHostcodeEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHostcodeEffectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHostcodeEffect=ruleHostcodeEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHostcodeEffect; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, entryRuleHostcodeEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleHostcodeEffect"


    // $ANTLR start "ruleHostcodeEffect"
    // InternalSCL.g:2091:1: ruleHostcodeEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleHostcodeEffect() throws RecognitionException {
        EObject current = null;
        int ruleHostcodeEffect_StartIndex = input.index();
        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return current; }
            // InternalSCL.g:2094:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // InternalSCL.g:2095:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // InternalSCL.g:2095:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // InternalSCL.g:2095:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // InternalSCL.g:2095:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_COMMENT_ANNOTATION||LA55_0==49) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalSCL.g:2096:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:2096:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:2097:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHostcodeEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_41);
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
            	    break loop55;
                }
            } while (true);

            // InternalSCL.g:2113:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // InternalSCL.g:2114:1: (lv_text_1_0= RULE_HOSTCODE )
            {
            // InternalSCL.g:2114:1: (lv_text_1_0= RULE_HOSTCODE )
            // InternalSCL.g:2115:3: lv_text_1_0= RULE_HOSTCODE
            {
            lv_text_1_0=(Token)match(input,RULE_HOSTCODE,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 42, ruleHostcodeEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleHostcodeEffect"


    // $ANTLR start "entryRuleFunctionCallEffect"
    // InternalSCL.g:2139:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionCallEffect_StartIndex = input.index();
        EObject iv_ruleFunctionCallEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return current; }
            // InternalSCL.g:2140:2: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // InternalSCL.g:2141:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallEffectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCallEffect=ruleFunctionCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallEffect; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, entryRuleFunctionCallEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCallEffect"


    // $ANTLR start "ruleFunctionCallEffect"
    // InternalSCL.g:2148:1: ruleFunctionCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) ;
    public final EObject ruleFunctionCallEffect() throws RecognitionException {
        EObject current = null;
        int ruleFunctionCallEffect_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return current; }
            // InternalSCL.g:2151:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) )
            // InternalSCL.g:2152:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            {
            // InternalSCL.g:2152:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            // InternalSCL.g:2152:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>'
            {
            // InternalSCL.g:2152:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_COMMENT_ANNOTATION||LA56_0==49) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalSCL.g:2153:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:2153:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:2154:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_42);
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
            	    break loop56;
                }
            } while (true);

            otherlv_1=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_1());
                  
            }
            // InternalSCL.g:2174:1: ( (lv_functionName_2_0= ruleExtendedID ) )
            // InternalSCL.g:2175:1: (lv_functionName_2_0= ruleExtendedID )
            {
            // InternalSCL.g:2175:1: (lv_functionName_2_0= ruleExtendedID )
            // InternalSCL.g:2176:3: lv_functionName_2_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getFunctionNameExtendedIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_43);
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

            // InternalSCL.g:2192:2: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )?
            int alt58=3;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==42) ) {
                alt58=1;
            }
            else if ( (LA58_0==45) ) {
                alt58=2;
            }
            switch (alt58) {
                case 1 :
                    // InternalSCL.g:2192:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    {
                    // InternalSCL.g:2192:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    // InternalSCL.g:2192:5: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_3_0_0());
                          
                    }
                    // InternalSCL.g:2196:1: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalSCL.g:2197:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalSCL.g:2197:1: (lv_parameters_4_0= ruleParameter )
                    // InternalSCL.g:2198:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_45);
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

                    // InternalSCL.g:2214:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==39) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalSCL.g:2214:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,39,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_3_0_2_0());
                    	          
                    	    }
                    	    // InternalSCL.g:2218:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalSCL.g:2219:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalSCL.g:2219:1: (lv_parameters_6_0= ruleParameter )
                    	    // InternalSCL.g:2220:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_45);
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
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,43,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_3_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:2241:7: otherlv_8= '()'
                    {
                    otherlv_8=(Token)match(input,45,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 44, ruleFunctionCallEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCallEffect"


    // $ANTLR start "entryRuleExpression"
    // InternalSCL.g:2259:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleExpression_StartIndex = input.index();
        EObject iv_ruleExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return current; }
            // InternalSCL.g:2260:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalSCL.g:2261:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, entryRuleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSCL.g:2268:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;
        int ruleExpression_StartIndex = input.index();
        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return current; }
            // InternalSCL.g:2271:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // InternalSCL.g:2272:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // InternalSCL.g:2272:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // InternalSCL.g:2273:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:2286:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 46, ruleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBoolExpression"
    // InternalSCL.g:2305:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBoolExpression_StartIndex = input.index();
        EObject iv_ruleBoolExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return current; }
            // InternalSCL.g:2306:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalSCL.g:2307:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, entryRuleBoolExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // InternalSCL.g:2314:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;
        int ruleBoolExpression_StartIndex = input.index();
        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return current; }
            // InternalSCL.g:2317:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalSCL.g:2319:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 48, ruleBoolExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalSCL.g:2338:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleLogicalOrExpression_StartIndex = input.index();
        EObject iv_ruleLogicalOrExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return current; }
            // InternalSCL.g:2339:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalSCL.g:2340:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, entryRuleLogicalOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // InternalSCL.g:2347:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;
        int ruleLogicalOrExpression_StartIndex = input.index();
        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return current; }
            // InternalSCL.g:2350:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) )
            // InternalSCL.g:2351:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            {
            // InternalSCL.g:2351:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            // InternalSCL.g:2352:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_47);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:2363:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==66) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSCL.g:2363:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    {
                    // InternalSCL.g:2363:2: ()
                    // InternalSCL.g:2364:2: 
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

                    // InternalSCL.g:2372:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==66) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalSCL.g:2372:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    {
                    	    // InternalSCL.g:2372:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    	    // InternalSCL.g:2373:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    {
                    	    // InternalSCL.g:2373:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    // InternalSCL.g:2374:3: lv_operator_2_0= ruleLogicalOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_13);
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

                    	    // InternalSCL.g:2390:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    // InternalSCL.g:2391:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    {
                    	    // InternalSCL.g:2391:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    // InternalSCL.g:2392:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_47);
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
                    	    if ( cnt60 >= 1 ) break loop60;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
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
            if ( state.backtracking>0 ) { memoize(input, 50, ruleLogicalOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalSCL.g:2416:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleLogicalAndExpression_StartIndex = input.index();
        EObject iv_ruleLogicalAndExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return current; }
            // InternalSCL.g:2417:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalSCL.g:2418:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, entryRuleLogicalAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // InternalSCL.g:2425:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;
        int ruleLogicalAndExpression_StartIndex = input.index();
        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return current; }
            // InternalSCL.g:2428:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) )
            // InternalSCL.g:2429:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            {
            // InternalSCL.g:2429:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            // InternalSCL.g:2430:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_48);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:2441:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==67) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalSCL.g:2441:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    {
                    // InternalSCL.g:2441:2: ()
                    // InternalSCL.g:2442:2: 
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

                    // InternalSCL.g:2450:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==67) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalSCL.g:2450:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    // InternalSCL.g:2450:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    	    // InternalSCL.g:2451:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    {
                    	    // InternalSCL.g:2451:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    // InternalSCL.g:2452:3: lv_operator_2_0= ruleLogicalAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_13);
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

                    	    // InternalSCL.g:2468:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    // InternalSCL.g:2469:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    {
                    	    // InternalSCL.g:2469:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    // InternalSCL.g:2470:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_48);
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
                    	    if ( cnt62 >= 1 ) break loop62;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
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
            if ( state.backtracking>0 ) { memoize(input, 52, ruleLogicalAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // InternalSCL.g:2494:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBitwiseOrExpression_StartIndex = input.index();
        EObject iv_ruleBitwiseOrExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return current; }
            // InternalSCL.g:2495:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalSCL.g:2496:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, entryRuleBitwiseOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseOrExpression"


    // $ANTLR start "ruleBitwiseOrExpression"
    // InternalSCL.g:2503:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;
        int ruleBitwiseOrExpression_StartIndex = input.index();
        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return current; }
            // InternalSCL.g:2506:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) )
            // InternalSCL.g:2507:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            {
            // InternalSCL.g:2507:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            // InternalSCL.g:2508:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_49);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:2519:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==60) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalSCL.g:2519:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    {
                    // InternalSCL.g:2519:2: ()
                    // InternalSCL.g:2520:2: 
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

                    // InternalSCL.g:2528:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==60) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalSCL.g:2528:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    // InternalSCL.g:2528:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    	    // InternalSCL.g:2529:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    {
                    	    // InternalSCL.g:2529:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    // InternalSCL.g:2530:3: lv_operator_2_0= ruleBitwiseOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_13);
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

                    	    // InternalSCL.g:2546:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    // InternalSCL.g:2547:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    {
                    	    // InternalSCL.g:2547:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    // InternalSCL.g:2548:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_49);
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
                    	    if ( cnt64 >= 1 ) break loop64;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
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
            if ( state.backtracking>0 ) { memoize(input, 54, ruleBitwiseOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // InternalSCL.g:2572:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBitwiseAndExpression_StartIndex = input.index();
        EObject iv_ruleBitwiseAndExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return current; }
            // InternalSCL.g:2573:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalSCL.g:2574:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, entryRuleBitwiseAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseAndExpression"


    // $ANTLR start "ruleBitwiseAndExpression"
    // InternalSCL.g:2581:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;
        int ruleBitwiseAndExpression_StartIndex = input.index();
        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return current; }
            // InternalSCL.g:2584:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) )
            // InternalSCL.g:2585:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            {
            // InternalSCL.g:2585:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            // InternalSCL.g:2586:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_50);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:2597:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==48) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalSCL.g:2597:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    {
                    // InternalSCL.g:2597:2: ()
                    // InternalSCL.g:2598:2: 
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

                    // InternalSCL.g:2606:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    int cnt66=0;
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==48) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalSCL.g:2606:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // InternalSCL.g:2606:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    	    // InternalSCL.g:2607:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    {
                    	    // InternalSCL.g:2607:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    // InternalSCL.g:2608:3: lv_operator_2_0= ruleBitwiseAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_13);
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

                    	    // InternalSCL.g:2624:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // InternalSCL.g:2625:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // InternalSCL.g:2625:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // InternalSCL.g:2626:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_50);
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
                    	    if ( cnt66 >= 1 ) break loop66;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(66, input);
                                throw eee;
                        }
                        cnt66++;
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
            if ( state.backtracking>0 ) { memoize(input, 56, ruleBitwiseAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalSCL.g:2650:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;
        int entryRuleCompareOperation_StartIndex = input.index();
        EObject iv_ruleCompareOperation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return current; }
            // InternalSCL.g:2651:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalSCL.g:2652:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, entryRuleCompareOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // InternalSCL.g:2659:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;
        int ruleCompareOperation_StartIndex = input.index();
        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return current; }
            // InternalSCL.g:2662:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // InternalSCL.g:2663:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // InternalSCL.g:2663:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // InternalSCL.g:2664:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_51);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:2675:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==44||LA68_0==46||(LA68_0>=55 && LA68_0<=58)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalSCL.g:2675:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // InternalSCL.g:2675:2: ()
                    // InternalSCL.g:2676:2: 
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

                    // InternalSCL.g:2684:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // InternalSCL.g:2685:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // InternalSCL.g:2685:1: (lv_operator_2_0= ruleCompareOperator )
                    // InternalSCL.g:2686:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_13);
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

                    // InternalSCL.g:2702:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // InternalSCL.g:2703:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // InternalSCL.g:2703:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // InternalSCL.g:2704:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 58, ruleCompareOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleNotOrValuedExpression"
    // InternalSCL.g:2728:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNotOrValuedExpression_StartIndex = input.index();
        EObject iv_ruleNotOrValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return current; }
            // InternalSCL.g:2729:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // InternalSCL.g:2730:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, entryRuleNotOrValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNotOrValuedExpression"


    // $ANTLR start "ruleNotOrValuedExpression"
    // InternalSCL.g:2737:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleNotOrValuedExpression_StartIndex = input.index();
        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return current; }
            // InternalSCL.g:2740:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // InternalSCL.g:2741:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // InternalSCL.g:2741:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // InternalSCL.g:2742:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:2755:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 60, ruleNotOrValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotOrValuedExpression"


    // $ANTLR start "entryRuleNotExpression"
    // InternalSCL.g:2774:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNotExpression_StartIndex = input.index();
        EObject iv_ruleNotExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return current; }
            // InternalSCL.g:2775:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalSCL.g:2776:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, entryRuleNotExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalSCL.g:2783:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;
        int ruleNotExpression_StartIndex = input.index();
        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return current; }
            // InternalSCL.g:2786:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // InternalSCL.g:2787:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // InternalSCL.g:2787:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==47) ) {
                alt70=1;
            }
            else if ( ((LA70_0>=RULE_ID && LA70_0<=RULE_HOSTCODE)||LA70_0==RULE_BOOLEAN||LA70_0==42||LA70_0==44||LA70_0==59||LA70_0==65) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalSCL.g:2787:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // InternalSCL.g:2787:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // InternalSCL.g:2787:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // InternalSCL.g:2787:3: ()
                    // InternalSCL.g:2788:2: 
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

                    // InternalSCL.g:2796:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // InternalSCL.g:2797:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // InternalSCL.g:2797:1: (lv_operator_1_0= ruleNotOperator )
                    // InternalSCL.g:2798:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_13);
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

                    // InternalSCL.g:2814:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // InternalSCL.g:2815:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // InternalSCL.g:2815:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // InternalSCL.g:2816:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:2834:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 62, ruleNotExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleValuedExpression"
    // InternalSCL.g:2853:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedExpression_StartIndex = input.index();
        EObject iv_ruleValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return current; }
            // InternalSCL.g:2854:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // InternalSCL.g:2855:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, entryRuleValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedExpression"


    // $ANTLR start "ruleValuedExpression"
    // InternalSCL.g:2862:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleValuedExpression_StartIndex = input.index();
        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return current; }
            // InternalSCL.g:2865:28: (this_AddExpression_0= ruleAddExpression )
            // InternalSCL.g:2867:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 64, ruleValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalSCL.g:2886:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAddExpression_StartIndex = input.index();
        EObject iv_ruleAddExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return current; }
            // InternalSCL.g:2887:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalSCL.g:2888:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, entryRuleAddExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // InternalSCL.g:2895:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;
        int ruleAddExpression_StartIndex = input.index();
        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return current; }
            // InternalSCL.g:2898:28: ( (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? ) )
            // InternalSCL.g:2899:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? )
            {
            // InternalSCL.g:2899:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? )
            // InternalSCL.g:2900:2: this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_52);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:2911:1: ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==61) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalSCL.g:2911:2: () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+
                    {
                    // InternalSCL.g:2911:2: ()
                    // InternalSCL.g:2912:2: 
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

                    // InternalSCL.g:2920:2: ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+
                    int cnt71=0;
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==61) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalSCL.g:2920:3: ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    	    {
                    	    // InternalSCL.g:2920:3: ( (lv_operator_2_0= ruleAddOperator ) )
                    	    // InternalSCL.g:2921:1: (lv_operator_2_0= ruleAddOperator )
                    	    {
                    	    // InternalSCL.g:2921:1: (lv_operator_2_0= ruleAddOperator )
                    	    // InternalSCL.g:2922:3: lv_operator_2_0= ruleAddOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_53);
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

                    	    // InternalSCL.g:2938:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    	    // InternalSCL.g:2939:1: (lv_subExpressions_3_0= ruleSubExpression )
                    	    {
                    	    // InternalSCL.g:2939:1: (lv_subExpressions_3_0= ruleSubExpression )
                    	    // InternalSCL.g:2940:3: lv_subExpressions_3_0= ruleSubExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_52);
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
                    	    if ( cnt71 >= 1 ) break loop71;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(71, input);
                                throw eee;
                        }
                        cnt71++;
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
            if ( state.backtracking>0 ) { memoize(input, 66, ruleAddExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // InternalSCL.g:2964:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleSubExpression_StartIndex = input.index();
        EObject iv_ruleSubExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return current; }
            // InternalSCL.g:2965:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // InternalSCL.g:2966:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, entryRuleSubExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSubExpression"


    // $ANTLR start "ruleSubExpression"
    // InternalSCL.g:2973:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;
        int ruleSubExpression_StartIndex = input.index();
        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return current; }
            // InternalSCL.g:2976:28: ( (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? ) )
            // InternalSCL.g:2977:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? )
            {
            // InternalSCL.g:2977:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? )
            // InternalSCL.g:2978:2: this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_54);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:2989:1: ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==52) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalSCL.g:2989:2: () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+
                    {
                    // InternalSCL.g:2989:2: ()
                    // InternalSCL.g:2990:2: 
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

                    // InternalSCL.g:2998:2: ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+
                    int cnt73=0;
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==52) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalSCL.g:2998:3: ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    	    {
                    	    // InternalSCL.g:2998:3: ( (lv_operator_2_0= ruleSubOperator ) )
                    	    // InternalSCL.g:2999:1: (lv_operator_2_0= ruleSubOperator )
                    	    {
                    	    // InternalSCL.g:2999:1: (lv_operator_2_0= ruleSubOperator )
                    	    // InternalSCL.g:3000:3: lv_operator_2_0= ruleSubOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_53);
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

                    	    // InternalSCL.g:3016:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    	    // InternalSCL.g:3017:1: (lv_subExpressions_3_0= ruleMultExpression )
                    	    {
                    	    // InternalSCL.g:3017:1: (lv_subExpressions_3_0= ruleMultExpression )
                    	    // InternalSCL.g:3018:3: lv_subExpressions_3_0= ruleMultExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_54);
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
                    	    if ( cnt73 >= 1 ) break loop73;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(73, input);
                                throw eee;
                        }
                        cnt73++;
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
            if ( state.backtracking>0 ) { memoize(input, 68, ruleSubExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // InternalSCL.g:3042:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleMultExpression_StartIndex = input.index();
        EObject iv_ruleMultExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return current; }
            // InternalSCL.g:3043:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalSCL.g:3044:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, entryRuleMultExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // InternalSCL.g:3051:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;
        int ruleMultExpression_StartIndex = input.index();
        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return current; }
            // InternalSCL.g:3054:28: ( (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? ) )
            // InternalSCL.g:3055:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? )
            {
            // InternalSCL.g:3055:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? )
            // InternalSCL.g:3056:2: this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_55);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:3067:1: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==62) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalSCL.g:3067:2: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+
                    {
                    // InternalSCL.g:3067:2: ()
                    // InternalSCL.g:3068:2: 
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

                    // InternalSCL.g:3076:2: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+
                    int cnt75=0;
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==62) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalSCL.g:3076:3: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    	    {
                    	    // InternalSCL.g:3076:3: ( (lv_operator_2_0= ruleMultOperator ) )
                    	    // InternalSCL.g:3077:1: (lv_operator_2_0= ruleMultOperator )
                    	    {
                    	    // InternalSCL.g:3077:1: (lv_operator_2_0= ruleMultOperator )
                    	    // InternalSCL.g:3078:3: lv_operator_2_0= ruleMultOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_53);
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

                    	    // InternalSCL.g:3094:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    	    // InternalSCL.g:3095:1: (lv_subExpressions_3_0= ruleDivExpression )
                    	    {
                    	    // InternalSCL.g:3095:1: (lv_subExpressions_3_0= ruleDivExpression )
                    	    // InternalSCL.g:3096:3: lv_subExpressions_3_0= ruleDivExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_55);
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
                    	    if ( cnt75 >= 1 ) break loop75;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(75, input);
                                throw eee;
                        }
                        cnt75++;
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
            if ( state.backtracking>0 ) { memoize(input, 70, ruleMultExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // InternalSCL.g:3120:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleDivExpression_StartIndex = input.index();
        EObject iv_ruleDivExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return current; }
            // InternalSCL.g:3121:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // InternalSCL.g:3122:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, entryRuleDivExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDivExpression"


    // $ANTLR start "ruleDivExpression"
    // InternalSCL.g:3129:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;
        int ruleDivExpression_StartIndex = input.index();
        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return current; }
            // InternalSCL.g:3132:28: ( (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? ) )
            // InternalSCL.g:3133:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? )
            {
            // InternalSCL.g:3133:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? )
            // InternalSCL.g:3134:2: this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_56);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:3145:1: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==64) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalSCL.g:3145:2: () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+
                    {
                    // InternalSCL.g:3145:2: ()
                    // InternalSCL.g:3146:2: 
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

                    // InternalSCL.g:3154:2: ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==64) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalSCL.g:3154:3: ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    	    {
                    	    // InternalSCL.g:3154:3: ( (lv_operator_2_0= ruleDivOperator ) )
                    	    // InternalSCL.g:3155:1: (lv_operator_2_0= ruleDivOperator )
                    	    {
                    	    // InternalSCL.g:3155:1: (lv_operator_2_0= ruleDivOperator )
                    	    // InternalSCL.g:3156:3: lv_operator_2_0= ruleDivOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_53);
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
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.DivOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSCL.g:3172:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    	    // InternalSCL.g:3173:1: (lv_subExpressions_3_0= ruleModExpression )
                    	    {
                    	    // InternalSCL.g:3173:1: (lv_subExpressions_3_0= ruleModExpression )
                    	    // InternalSCL.g:3174:3: lv_subExpressions_3_0= ruleModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_56);
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
                    	    if ( cnt77 >= 1 ) break loop77;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
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
            if ( state.backtracking>0 ) { memoize(input, 72, ruleDivExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // InternalSCL.g:3198:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleModExpression_StartIndex = input.index();
        EObject iv_ruleModExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return current; }
            // InternalSCL.g:3199:2: (iv_ruleModExpression= ruleModExpression EOF )
            // InternalSCL.g:3200:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, entryRuleModExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleModExpression"


    // $ANTLR start "ruleModExpression"
    // InternalSCL.g:3207:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;
        int ruleModExpression_StartIndex = input.index();
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return current; }
            // InternalSCL.g:3210:28: ( (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? ) )
            // InternalSCL.g:3211:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? )
            {
            // InternalSCL.g:3211:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? )
            // InternalSCL.g:3212:2: this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_57);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:3223:1: ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==63) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalSCL.g:3223:2: () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+
                    {
                    // InternalSCL.g:3223:2: ()
                    // InternalSCL.g:3224:2: 
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

                    // InternalSCL.g:3232:2: ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+
                    int cnt79=0;
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==63) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalSCL.g:3232:3: ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    	    {
                    	    // InternalSCL.g:3232:3: ( (lv_operator_2_0= ruleModOperator ) )
                    	    // InternalSCL.g:3233:1: (lv_operator_2_0= ruleModOperator )
                    	    {
                    	    // InternalSCL.g:3233:1: (lv_operator_2_0= ruleModOperator )
                    	    // InternalSCL.g:3234:3: lv_operator_2_0= ruleModOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_53);
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

                    	    // InternalSCL.g:3250:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    	    // InternalSCL.g:3251:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    	    {
                    	    // InternalSCL.g:3251:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    	    // InternalSCL.g:3252:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_57);
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
                    	    if ( cnt79 >= 1 ) break loop79;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(79, input);
                                throw eee;
                        }
                        cnt79++;
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
            if ( state.backtracking>0 ) { memoize(input, 74, ruleModExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModExpression"


    // $ANTLR start "entryRuleNegExpression"
    // InternalSCL.g:3276:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNegExpression_StartIndex = input.index();
        EObject iv_ruleNegExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return current; }
            // InternalSCL.g:3277:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // InternalSCL.g:3278:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, entryRuleNegExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNegExpression"


    // $ANTLR start "ruleNegExpression"
    // InternalSCL.g:3285:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;
        int ruleNegExpression_StartIndex = input.index();
        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return current; }
            // InternalSCL.g:3288:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // InternalSCL.g:3289:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // InternalSCL.g:3289:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==52) ) {
                alt81=1;
            }
            else if ( ((LA81_0>=RULE_ID && LA81_0<=RULE_STRING)||LA81_0==42||LA81_0==44||LA81_0==59||LA81_0==65) ) {
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
                    // InternalSCL.g:3289:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // InternalSCL.g:3289:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // InternalSCL.g:3289:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // InternalSCL.g:3289:3: ()
                    // InternalSCL.g:3290:2: 
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

                    // InternalSCL.g:3298:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // InternalSCL.g:3299:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // InternalSCL.g:3299:1: (lv_operator_1_0= ruleSubOperator )
                    // InternalSCL.g:3300:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_53);
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

                    // InternalSCL.g:3316:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // InternalSCL.g:3317:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // InternalSCL.g:3317:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // InternalSCL.g:3318:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:3336:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 76, ruleNegExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNegExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalSCL.g:3355:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAtomicExpression_StartIndex = input.index();
        EObject iv_ruleAtomicExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return current; }
            // InternalSCL.g:3356:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalSCL.g:3357:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, entryRuleAtomicExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalSCL.g:3364:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;
        int ruleAtomicExpression_StartIndex = input.index();
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BoolValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BoolExpression_3 = null;

        EObject this_FunctionCall_5 = null;

        EObject this_TextExpression_6 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return current; }
            // InternalSCL.g:3367:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) )
            // InternalSCL.g:3368:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            {
            // InternalSCL.g:3368:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            int alt82=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt82=1;
                }
                break;
            case RULE_ID:
            case 59:
            case 65:
                {
                alt82=2;
                }
                break;
            case 42:
                {
                alt82=3;
                }
                break;
            case 44:
                {
                alt82=4;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt82=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalSCL.g:3369:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:3382:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:3394:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // InternalSCL.g:3394:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // InternalSCL.g:3394:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_39);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSCL.g:3416:2: this_FunctionCall_5= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:3429:2: this_TextExpression_6= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 78, ruleAtomicExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleAtomicValuedExpression"
    // InternalSCL.g:3448:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAtomicValuedExpression_StartIndex = input.index();
        EObject iv_ruleAtomicValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return current; }
            // InternalSCL.g:3449:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // InternalSCL.g:3450:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, entryRuleAtomicValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicValuedExpression"


    // $ANTLR start "ruleAtomicValuedExpression"
    // InternalSCL.g:3457:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleAtomicValuedExpression_StartIndex = input.index();
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_ValuedExpression_4 = null;

        EObject this_AtomicExpression_6 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return current; }
            // InternalSCL.g:3460:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // InternalSCL.g:3461:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // InternalSCL.g:3461:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt83=5;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // InternalSCL.g:3462:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:3475:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:3488:2: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getStringValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:3500:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // InternalSCL.g:3500:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // InternalSCL.g:3500:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_39);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSCL.g:3522:2: this_AtomicExpression_6= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 80, ruleAtomicValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAtomicValuedExpression"


    // $ANTLR start "entryRuleValuedObjectTestExpression"
    // InternalSCL.g:3541:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObjectTestExpression_StartIndex = input.index();
        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return current; }
            // InternalSCL.g:3542:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // InternalSCL.g:3543:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, entryRuleValuedObjectTestExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectTestExpression"


    // $ANTLR start "ruleValuedObjectTestExpression"
    // InternalSCL.g:3550:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
    public final EObject ruleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;
        int ruleValuedObjectTestExpression_StartIndex = input.index();
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_operator_1_1 = null;

        Enumerator lv_operator_1_2 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_ValuedObjectReference_5 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return current; }
            // InternalSCL.g:3553:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // InternalSCL.g:3554:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // InternalSCL.g:3554:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==59||LA85_0==65) ) {
                alt85=1;
            }
            else if ( (LA85_0==RULE_ID) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalSCL.g:3554:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // InternalSCL.g:3554:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // InternalSCL.g:3554:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // InternalSCL.g:3554:3: ()
                    // InternalSCL.g:3555:2: 
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

                    // InternalSCL.g:3563:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // InternalSCL.g:3564:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // InternalSCL.g:3564:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // InternalSCL.g:3565:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // InternalSCL.g:3565:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==59) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==65) ) {
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
                            // InternalSCL.g:3566:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_58);
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
                            // InternalSCL.g:3581:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_58);
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

                    otherlv_2=(Token)match(input,42,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // InternalSCL.g:3603:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // InternalSCL.g:3604:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // InternalSCL.g:3604:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // InternalSCL.g:3605:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_39);
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

                    otherlv_4=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:3627:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 82, ruleValuedObjectTestExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObjectTestExpression"


    // $ANTLR start "entryRuleValuedObjectReference"
    // InternalSCL.g:3646:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObjectReference_StartIndex = input.index();
        EObject iv_ruleValuedObjectReference = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return current; }
            // InternalSCL.g:3647:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // InternalSCL.g:3648:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, entryRuleValuedObjectReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectReference"


    // $ANTLR start "ruleValuedObjectReference"
    // InternalSCL.g:3655:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;
        int ruleValuedObjectReference_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_indices_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return current; }
            // InternalSCL.g:3658:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // InternalSCL.g:3659:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // InternalSCL.g:3659:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // InternalSCL.g:3659:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // InternalSCL.g:3659:2: ( (otherlv_0= RULE_ID ) )
            // InternalSCL.g:3660:1: (otherlv_0= RULE_ID )
            {
            // InternalSCL.g:3660:1: (otherlv_0= RULE_ID )
            // InternalSCL.g:3661:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalSCL.g:3675:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==21) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalSCL.g:3675:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // InternalSCL.g:3679:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalSCL.g:3680:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalSCL.g:3680:1: (lv_indices_2_0= ruleExpression )
            	    // InternalSCL.g:3681:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_14);
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

            	    otherlv_3=(Token)match(input,22,FOLLOW_60); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
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
            if ( state.backtracking>0 ) { memoize(input, 84, ruleValuedObjectReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalSCL.g:3709:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionCall_StartIndex = input.index();
        EObject iv_ruleFunctionCall = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return current; }
            // InternalSCL.g:3710:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalSCL.g:3711:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, entryRuleFunctionCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalSCL.g:3718:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;
        int ruleFunctionCall_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return current; }
            // InternalSCL.g:3721:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) )
            // InternalSCL.g:3722:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            {
            // InternalSCL.g:3722:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            // InternalSCL.g:3722:3: otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0());
                  
            }
            // InternalSCL.g:3726:1: ( (lv_functionName_1_0= ruleExtendedID ) )
            // InternalSCL.g:3727:1: (lv_functionName_1_0= ruleExtendedID )
            {
            // InternalSCL.g:3727:1: (lv_functionName_1_0= ruleExtendedID )
            // InternalSCL.g:3728:3: lv_functionName_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_43);
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

            // InternalSCL.g:3744:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )?
            int alt88=3;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==42) ) {
                alt88=1;
            }
            else if ( (LA88_0==45) ) {
                alt88=2;
            }
            switch (alt88) {
                case 1 :
                    // InternalSCL.g:3744:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalSCL.g:3744:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalSCL.g:3744:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // InternalSCL.g:3748:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalSCL.g:3749:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalSCL.g:3749:1: (lv_parameters_3_0= ruleParameter )
                    // InternalSCL.g:3750:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_45);
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

                    // InternalSCL.g:3766:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==39) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalSCL.g:3766:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,39,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // InternalSCL.g:3770:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalSCL.g:3771:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalSCL.g:3771:1: (lv_parameters_5_0= ruleParameter )
                    	    // InternalSCL.g:3772:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_45);
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
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,43,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:3793:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,45,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 86, ruleFunctionCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleParameter"
    // InternalSCL.g:3809:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;
        int entryRuleParameter_StartIndex = input.index();
        EObject iv_ruleParameter = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return current; }
            // InternalSCL.g:3810:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalSCL.g:3811:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, entryRuleParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalSCL.g:3818:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;
        int ruleParameter_StartIndex = input.index();
        Token lv_pureOutput_0_0=null;
        Token lv_callByReference_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return current; }
            // InternalSCL.g:3821:28: ( ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalSCL.g:3822:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalSCL.g:3822:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalSCL.g:3822:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalSCL.g:3822:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==47) ) {
                int LA90_1 = input.LA(2);

                if ( (LA90_1==48) ) {
                    alt90=1;
                }
            }
            else if ( (LA90_0==48) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalSCL.g:3822:3: ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) )
                    {
                    // InternalSCL.g:3822:3: ( (lv_pureOutput_0_0= '!' ) )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==47) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalSCL.g:3823:1: (lv_pureOutput_0_0= '!' )
                            {
                            // InternalSCL.g:3823:1: (lv_pureOutput_0_0= '!' )
                            // InternalSCL.g:3824:3: lv_pureOutput_0_0= '!'
                            {
                            lv_pureOutput_0_0=(Token)match(input,47,FOLLOW_61); if (state.failed) return current;
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

                    // InternalSCL.g:3837:3: ( (lv_callByReference_1_0= '&' ) )
                    // InternalSCL.g:3838:1: (lv_callByReference_1_0= '&' )
                    {
                    // InternalSCL.g:3838:1: (lv_callByReference_1_0= '&' )
                    // InternalSCL.g:3839:3: lv_callByReference_1_0= '&'
                    {
                    lv_callByReference_1_0=(Token)match(input,48,FOLLOW_13); if (state.failed) return current;
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

            // InternalSCL.g:3852:4: ( (lv_expression_2_0= ruleExpression ) )
            // InternalSCL.g:3853:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalSCL.g:3853:1: (lv_expression_2_0= ruleExpression )
            // InternalSCL.g:3854:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 88, ruleParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTextExpression"
    // InternalSCL.g:3878:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleTextExpression_StartIndex = input.index();
        EObject iv_ruleTextExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return current; }
            // InternalSCL.g:3879:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalSCL.g:3880:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, entryRuleTextExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // InternalSCL.g:3887:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;
        int ruleTextExpression_StartIndex = input.index();
        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return current; }
            // InternalSCL.g:3890:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // InternalSCL.g:3891:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // InternalSCL.g:3891:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // InternalSCL.g:3892:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // InternalSCL.g:3892:1: (lv_text_0_0= RULE_HOSTCODE )
            // InternalSCL.g:3893:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 90, ruleTextExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleIntValue"
    // InternalSCL.g:3917:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;
        int entryRuleIntValue_StartIndex = input.index();
        EObject iv_ruleIntValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return current; }
            // InternalSCL.g:3918:2: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalSCL.g:3919:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, entryRuleIntValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalSCL.g:3926:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;
        int ruleIntValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return current; }
            // InternalSCL.g:3929:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalSCL.g:3930:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalSCL.g:3930:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalSCL.g:3931:1: (lv_value_0_0= RULE_INT )
            {
            // InternalSCL.g:3931:1: (lv_value_0_0= RULE_INT )
            // InternalSCL.g:3932:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 92, ruleIntValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalSCL.g:3956:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;
        int entryRuleFloatValue_StartIndex = input.index();
        EObject iv_ruleFloatValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return current; }
            // InternalSCL.g:3957:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalSCL.g:3958:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, entryRuleFloatValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalSCL.g:3965:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;
        int ruleFloatValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return current; }
            // InternalSCL.g:3968:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalSCL.g:3969:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalSCL.g:3969:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalSCL.g:3970:1: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalSCL.g:3970:1: (lv_value_0_0= RULE_FLOAT )
            // InternalSCL.g:3971:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 94, ruleFloatValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleBoolValue"
    // InternalSCL.g:3995:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;
        int entryRuleBoolValue_StartIndex = input.index();
        EObject iv_ruleBoolValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return current; }
            // InternalSCL.g:3996:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalSCL.g:3997:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, entryRuleBoolValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // InternalSCL.g:4004:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;
        int ruleBoolValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return current; }
            // InternalSCL.g:4007:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalSCL.g:4008:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalSCL.g:4008:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalSCL.g:4009:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalSCL.g:4009:1: (lv_value_0_0= RULE_BOOLEAN )
            // InternalSCL.g:4010:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 96, ruleBoolValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalSCL.g:4034:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;
        int entryRuleStringValue_StartIndex = input.index();
        EObject iv_ruleStringValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return current; }
            // InternalSCL.g:4035:2: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalSCL.g:4036:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, entryRuleStringValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalSCL.g:4043:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;
        int ruleStringValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return current; }
            // InternalSCL.g:4046:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSCL.g:4047:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSCL.g:4047:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSCL.g:4048:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalSCL.g:4048:1: (lv_value_0_0= RULE_STRING )
            // InternalSCL.g:4049:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 98, ruleStringValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleAnnotation"
    // InternalSCL.g:4077:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleAnnotation_StartIndex = input.index();
        EObject iv_ruleAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return current; }
            // InternalSCL.g:4078:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalSCL.g:4079:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 99, entryRuleAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalSCL.g:4086:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleAnnotation_StartIndex = input.index();
        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyBooleanValueAnnotation_1 = null;

        EObject this_KeyStringValueAnnotation_2 = null;

        EObject this_TypedKeyStringValueAnnotation_3 = null;

        EObject this_KeyIntValueAnnotation_4 = null;

        EObject this_KeyFloatValueAnnotation_5 = null;

        EObject this_TagAnnotation_6 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return current; }
            // InternalSCL.g:4089:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) )
            // InternalSCL.g:4090:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            {
            // InternalSCL.g:4090:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            int alt91=7;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // InternalSCL.g:4091:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:4104:2: this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:4117:2: this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:4130:2: this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:4143:2: this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:4156:2: this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:4169:2: this_TagAnnotation_6= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 100, ruleAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleRestrictedAnnotation"
    // InternalSCL.g:4190:1: entryRuleRestrictedAnnotation returns [EObject current=null] : iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF ;
    public final EObject entryRuleRestrictedAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleRestrictedAnnotation_StartIndex = input.index();
        EObject iv_ruleRestrictedAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return current; }
            // InternalSCL.g:4191:2: (iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF )
            // InternalSCL.g:4192:2: iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRestrictedAnnotation=ruleRestrictedAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedAnnotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, entryRuleRestrictedAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleRestrictedAnnotation"


    // $ANTLR start "ruleRestrictedAnnotation"
    // InternalSCL.g:4199:1: ruleRestrictedAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) ;
    public final EObject ruleRestrictedAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleRestrictedAnnotation_StartIndex = input.index();
        EObject this_CommentAnnotation_0 = null;

        EObject this_QuotedKeyStringValueAnnotation_1 = null;

        EObject this_QuotedTypedKeyStringValueAnnotation_2 = null;

        EObject this_KeyBooleanValueAnnotation_3 = null;

        EObject this_KeyIntValueAnnotation_4 = null;

        EObject this_KeyFloatValueAnnotation_5 = null;

        EObject this_TagAnnotation_6 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return current; }
            // InternalSCL.g:4202:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) )
            // InternalSCL.g:4203:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            {
            // InternalSCL.g:4203:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            int alt92=7;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // InternalSCL.g:4204:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:4217:2: this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getQuotedKeyStringValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:4230:2: this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getQuotedTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:4243:2: this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:4256:2: this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:4269:2: this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:4282:2: this_TagAnnotation_6= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getTagAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 102, ruleRestrictedAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleRestrictedAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // InternalSCL.g:4301:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleCommentAnnotation_StartIndex = input.index();
        EObject iv_ruleCommentAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return current; }
            // InternalSCL.g:4302:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalSCL.g:4303:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 103, entryRuleCommentAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentAnnotation"


    // $ANTLR start "ruleCommentAnnotation"
    // InternalSCL.g:4310:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleCommentAnnotation_StartIndex = input.index();
        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return current; }
            // InternalSCL.g:4313:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalSCL.g:4314:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalSCL.g:4314:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalSCL.g:4315:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalSCL.g:4315:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalSCL.g:4316:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 104, ruleCommentAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleTagAnnotation"
    // InternalSCL.g:4340:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleTagAnnotation_StartIndex = input.index();
        EObject iv_ruleTagAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return current; }
            // InternalSCL.g:4341:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalSCL.g:4342:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 105, entryRuleTagAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTagAnnotation"


    // $ANTLR start "ruleTagAnnotation"
    // InternalSCL.g:4349:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleTagAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return current; }
            // InternalSCL.g:4352:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalSCL.g:4353:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalSCL.g:4353:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalSCL.g:4353:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSCL.g:4357:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSCL.g:4358:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSCL.g:4358:1: (lv_name_1_0= ruleExtendedID )
            // InternalSCL.g:4359:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 106, ruleTagAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // InternalSCL.g:4383:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return current; }
            // InternalSCL.g:4384:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalSCL.g:4385:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 107, entryRuleKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyStringValueAnnotation"


    // $ANTLR start "ruleKeyStringValueAnnotation"
    // InternalSCL.g:4392:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyStringValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return current; }
            // InternalSCL.g:4395:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) )
            // InternalSCL.g:4396:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            {
            // InternalSCL.g:4396:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            // InternalSCL.g:4396:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSCL.g:4400:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSCL.g:4401:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSCL.g:4401:1: (lv_name_1_0= ruleExtendedID )
            // InternalSCL.g:4402:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_62);
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

            // InternalSCL.g:4418:2: ( (lv_values_2_0= ruleEString ) )
            // InternalSCL.g:4419:1: (lv_values_2_0= ruleEString )
            {
            // InternalSCL.g:4419:1: (lv_values_2_0= ruleEString )
            // InternalSCL.g:4420:3: lv_values_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_63);
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

            // InternalSCL.g:4436:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==39) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalSCL.g:4436:4: otherlv_3= ',' ( (lv_values_4_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,39,FOLLOW_62); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalSCL.g:4440:1: ( (lv_values_4_0= ruleEString ) )
            	    // InternalSCL.g:4441:1: (lv_values_4_0= ruleEString )
            	    {
            	    // InternalSCL.g:4441:1: (lv_values_4_0= ruleEString )
            	    // InternalSCL.g:4442:3: lv_values_4_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_63);
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
            if ( state.backtracking>0 ) { memoize(input, 108, ruleKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalSCL.g:4466:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleTypedKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return current; }
            // InternalSCL.g:4467:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalSCL.g:4468:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 109, entryRuleTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleTypedKeyStringValueAnnotation"
    // InternalSCL.g:4475:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleTypedKeyStringValueAnnotation_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return current; }
            // InternalSCL.g:4478:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalSCL.g:4479:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalSCL.g:4479:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalSCL.g:4479:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSCL.g:4483:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSCL.g:4484:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSCL.g:4484:1: (lv_name_1_0= ruleExtendedID )
            // InternalSCL.g:4485:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_64);
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

            otherlv_2=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalSCL.g:4505:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalSCL.g:4506:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalSCL.g:4506:1: (lv_type_3_0= ruleExtendedID )
            // InternalSCL.g:4507:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
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

            otherlv_4=(Token)match(input,22,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalSCL.g:4527:1: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalSCL.g:4528:1: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalSCL.g:4528:1: (lv_values_5_0= ruleEStringBoolean )
            // InternalSCL.g:4529:3: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_63);
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

            // InternalSCL.g:4545:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==39) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalSCL.g:4545:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,39,FOLLOW_65); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalSCL.g:4549:1: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalSCL.g:4550:1: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalSCL.g:4550:1: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalSCL.g:4551:3: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_63);
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
            if ( state.backtracking>0 ) { memoize(input, 110, ruleTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // InternalSCL.g:4575:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleQuotedKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return current; }
            // InternalSCL.g:4576:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalSCL.g:4577:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQuotedKeyStringValueAnnotation=ruleQuotedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 111, entryRuleQuotedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedKeyStringValueAnnotation"
    // InternalSCL.g:4584:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleQuotedKeyStringValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return current; }
            // InternalSCL.g:4587:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalSCL.g:4588:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalSCL.g:4588:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalSCL.g:4588:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSCL.g:4592:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSCL.g:4593:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSCL.g:4593:1: (lv_name_1_0= ruleExtendedID )
            // InternalSCL.g:4594:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_66);
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

            // InternalSCL.g:4610:2: ( (lv_values_2_0= RULE_STRING ) )
            // InternalSCL.g:4611:1: (lv_values_2_0= RULE_STRING )
            {
            // InternalSCL.g:4611:1: (lv_values_2_0= RULE_STRING )
            // InternalSCL.g:4612:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_63); if (state.failed) return current;
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

            // InternalSCL.g:4628:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==39) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // InternalSCL.g:4628:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,39,FOLLOW_66); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalSCL.g:4632:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalSCL.g:4633:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalSCL.g:4633:1: (lv_values_4_0= RULE_STRING )
            	    // InternalSCL.g:4634:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_63); if (state.failed) return current;
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
            	    break loop95;
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
            if ( state.backtracking>0 ) { memoize(input, 112, ruleQuotedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleQuotedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedTypedKeyStringValueAnnotation"
    // InternalSCL.g:4658:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleQuotedTypedKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return current; }
            // InternalSCL.g:4659:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalSCL.g:4660:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQuotedTypedKeyStringValueAnnotation=ruleQuotedTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 113, entryRuleQuotedTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedTypedKeyStringValueAnnotation"
    // InternalSCL.g:4667:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleQuotedTypedKeyStringValueAnnotation_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return current; }
            // InternalSCL.g:4670:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalSCL.g:4671:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalSCL.g:4671:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalSCL.g:4671:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSCL.g:4675:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSCL.g:4676:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSCL.g:4676:1: (lv_name_1_0= ruleExtendedID )
            // InternalSCL.g:4677:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_64);
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

            otherlv_2=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalSCL.g:4697:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalSCL.g:4698:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalSCL.g:4698:1: (lv_type_3_0= ruleExtendedID )
            // InternalSCL.g:4699:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
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

            otherlv_4=(Token)match(input,22,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalSCL.g:4719:1: ( (lv_values_5_0= RULE_STRING ) )
            // InternalSCL.g:4720:1: (lv_values_5_0= RULE_STRING )
            {
            // InternalSCL.g:4720:1: (lv_values_5_0= RULE_STRING )
            // InternalSCL.g:4721:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FOLLOW_63); if (state.failed) return current;
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

            // InternalSCL.g:4737:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==39) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalSCL.g:4737:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,39,FOLLOW_66); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalSCL.g:4741:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalSCL.g:4742:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalSCL.g:4742:1: (lv_values_7_0= RULE_STRING )
            	    // InternalSCL.g:4743:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FOLLOW_63); if (state.failed) return current;
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
            	    break loop96;
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
            if ( state.backtracking>0 ) { memoize(input, 114, ruleQuotedTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // InternalSCL.g:4767:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyBooleanValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return current; }
            // InternalSCL.g:4768:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // InternalSCL.g:4769:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 115, entryRuleKeyBooleanValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyBooleanValueAnnotation"


    // $ANTLR start "ruleKeyBooleanValueAnnotation"
    // InternalSCL.g:4776:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyBooleanValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return current; }
            // InternalSCL.g:4779:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // InternalSCL.g:4780:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // InternalSCL.g:4780:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // InternalSCL.g:4780:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSCL.g:4784:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSCL.g:4785:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSCL.g:4785:1: (lv_name_1_0= ruleExtendedID )
            // InternalSCL.g:4786:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_67);
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

            // InternalSCL.g:4802:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // InternalSCL.g:4803:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // InternalSCL.g:4803:1: (lv_value_2_0= RULE_BOOLEAN )
            // InternalSCL.g:4804:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 116, ruleKeyBooleanValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyBooleanValueAnnotation"


    // $ANTLR start "entryRuleKeyIntValueAnnotation"
    // InternalSCL.g:4828:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyIntValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return current; }
            // InternalSCL.g:4829:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // InternalSCL.g:4830:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 117, entryRuleKeyIntValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyIntValueAnnotation"


    // $ANTLR start "ruleKeyIntValueAnnotation"
    // InternalSCL.g:4837:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyIntValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return current; }
            // InternalSCL.g:4840:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) )
            // InternalSCL.g:4841:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            {
            // InternalSCL.g:4841:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            // InternalSCL.g:4841:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSCL.g:4845:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSCL.g:4846:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSCL.g:4846:1: (lv_name_1_0= ruleExtendedID )
            // InternalSCL.g:4847:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_68);
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

            // InternalSCL.g:4863:2: ( (lv_value_2_0= ruleInteger ) )
            // InternalSCL.g:4864:1: (lv_value_2_0= ruleInteger )
            {
            // InternalSCL.g:4864:1: (lv_value_2_0= ruleInteger )
            // InternalSCL.g:4865:3: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 118, ruleKeyIntValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyIntValueAnnotation"


    // $ANTLR start "entryRuleKeyFloatValueAnnotation"
    // InternalSCL.g:4889:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyFloatValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return current; }
            // InternalSCL.g:4890:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // InternalSCL.g:4891:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 119, entryRuleKeyFloatValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyFloatValueAnnotation"


    // $ANTLR start "ruleKeyFloatValueAnnotation"
    // InternalSCL.g:4898:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyFloatValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return current; }
            // InternalSCL.g:4901:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) )
            // InternalSCL.g:4902:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            {
            // InternalSCL.g:4902:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            // InternalSCL.g:4902:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSCL.g:4906:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSCL.g:4907:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSCL.g:4907:1: (lv_name_1_0= ruleExtendedID )
            // InternalSCL.g:4908:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_69);
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

            // InternalSCL.g:4924:2: ( (lv_value_2_0= ruleFloateger ) )
            // InternalSCL.g:4925:1: (lv_value_2_0= ruleFloateger )
            {
            // InternalSCL.g:4925:1: (lv_value_2_0= ruleFloateger )
            // InternalSCL.g:4926:3: lv_value_2_0= ruleFloateger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 120, ruleKeyFloatValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyFloatValueAnnotation"


    // $ANTLR start "entryRuleEString"
    // InternalSCL.g:4950:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;
        int entryRuleEString_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return current; }
            // InternalSCL.g:4951:2: (iv_ruleEString= ruleEString EOF )
            // InternalSCL.g:4952:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 121, entryRuleEString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSCL.g:4959:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleEString_StartIndex = input.index();
        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return current; }
            // InternalSCL.g:4962:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) )
            // InternalSCL.g:4963:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            {
            // InternalSCL.g:4963:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_STRING) ) {
                alt97=1;
            }
            else if ( (LA97_0==RULE_ID) ) {
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
                    // InternalSCL.g:4963:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSCL.g:4972:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAccess().getExtendedIDParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 122, ruleEString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEStringBoolean"
    // InternalSCL.g:4990:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;
        int entryRuleEStringBoolean_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return current; }
            // InternalSCL.g:4991:2: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalSCL.g:4992:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEStringBoolean=ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEStringBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 123, entryRuleEStringBoolean_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEStringBoolean"


    // $ANTLR start "ruleEStringBoolean"
    // InternalSCL.g:4999:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleEStringBoolean_StartIndex = input.index();
        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return current; }
            // InternalSCL.g:5002:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalSCL.g:5003:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalSCL.g:5003:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt98=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt98=1;
                }
                break;
            case RULE_ID:
                {
                alt98=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt98=3;
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
                    // InternalSCL.g:5003:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringBooleanAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSCL.g:5012:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringBooleanAccess().getExtendedIDParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:5023:10: this_BOOLEAN_2= RULE_BOOLEAN
                    {
                    this_BOOLEAN_2=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 124, ruleEStringBoolean_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEStringBoolean"


    // $ANTLR start "entryRuleExtendedID"
    // InternalSCL.g:5038:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;
        int entryRuleExtendedID_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return current; }
            // InternalSCL.g:5039:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalSCL.g:5040:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 125, entryRuleExtendedID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // InternalSCL.g:5047:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleExtendedID_StartIndex = input.index();
        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return current; }
            // InternalSCL.g:5050:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) )
            // InternalSCL.g:5051:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            {
            // InternalSCL.g:5051:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            // InternalSCL.g:5051:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalSCL.g:5058:1: (kw= '.' this_ID_2= RULE_ID )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==50) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalSCL.g:5059:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,50,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);

            // InternalSCL.g:5071:3: (kw= '#' this_INT_4= RULE_INT )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==51) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalSCL.g:5072:2: kw= '#' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,51,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
                          
                    }
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 126, ruleExtendedID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleInteger"
    // InternalSCL.g:5092:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;
        int entryRuleInteger_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return current; }
            // InternalSCL.g:5093:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalSCL.g:5094:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 127, entryRuleInteger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalSCL.g:5101:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleInteger_StartIndex = input.index();
        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return current; }
            // InternalSCL.g:5104:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSCL.g:5105:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSCL.g:5105:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSCL.g:5105:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSCL.g:5105:2: (kw= '-' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==52) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalSCL.g:5106:2: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 128, ruleInteger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleFloateger"
    // InternalSCL.g:5126:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;
        int entryRuleFloateger_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return current; }
            // InternalSCL.g:5127:2: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalSCL.g:5128:2: iv_ruleFloateger= ruleFloateger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloategerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFloateger=ruleFloateger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloateger.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 129, entryRuleFloateger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFloateger"


    // $ANTLR start "ruleFloateger"
    // InternalSCL.g:5135:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFloateger_StartIndex = input.index();
        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return current; }
            // InternalSCL.g:5138:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalSCL.g:5139:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalSCL.g:5139:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalSCL.g:5139:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalSCL.g:5139:2: (kw= '-' )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==52) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalSCL.g:5140:2: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 130, ruleFloateger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFloateger"


    // $ANTLR start "ruleSCLAssignOperator"
    // InternalSCL.g:5160:1: ruleSCLAssignOperator returns [Enumerator current=null] : (enumLiteral_0= '=' ) ;
    public final Enumerator ruleSCLAssignOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleSCLAssignOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return current; }
            // InternalSCL.g:5162:28: ( (enumLiteral_0= '=' ) )
            // InternalSCL.g:5163:1: (enumLiteral_0= '=' )
            {
            // InternalSCL.g:5163:1: (enumLiteral_0= '=' )
            // InternalSCL.g:5163:3: enumLiteral_0= '='
            {
            enumLiteral_0=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getSCLAssignOperatorAccess().getASSIGNEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getSCLAssignOperatorAccess().getASSIGNEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 131, ruleSCLAssignOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSCLAssignOperator"


    // $ANTLR start "rulePostfixOperator"
    // InternalSCL.g:5175:1: rulePostfixOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator rulePostfixOperator() throws RecognitionException {
        Enumerator current = null;
        int rulePostfixOperator_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return current; }
            // InternalSCL.g:5177:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalSCL.g:5178:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalSCL.g:5178:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==53) ) {
                alt103=1;
            }
            else if ( (LA103_0==54) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // InternalSCL.g:5178:2: (enumLiteral_0= '++' )
                    {
                    // InternalSCL.g:5178:2: (enumLiteral_0= '++' )
                    // InternalSCL.g:5178:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:5184:6: (enumLiteral_1= '--' )
                    {
                    // InternalSCL.g:5184:6: (enumLiteral_1= '--' )
                    // InternalSCL.g:5184:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 132, rulePostfixOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePostfixOperator"


    // $ANTLR start "ruleCompareOperator"
    // InternalSCL.g:5194:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleCompareOperator_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return current; }
            // InternalSCL.g:5196:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalSCL.g:5197:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalSCL.g:5197:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt104=6;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt104=1;
                }
                break;
            case 44:
                {
                alt104=2;
                }
                break;
            case 56:
                {
                alt104=3;
                }
                break;
            case 46:
                {
                alt104=4;
                }
                break;
            case 57:
                {
                alt104=5;
                }
                break;
            case 58:
                {
                alt104=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // InternalSCL.g:5197:2: (enumLiteral_0= '==' )
                    {
                    // InternalSCL.g:5197:2: (enumLiteral_0= '==' )
                    // InternalSCL.g:5197:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:5203:6: (enumLiteral_1= '<' )
                    {
                    // InternalSCL.g:5203:6: (enumLiteral_1= '<' )
                    // InternalSCL.g:5203:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSCL.g:5209:6: (enumLiteral_2= '<=' )
                    {
                    // InternalSCL.g:5209:6: (enumLiteral_2= '<=' )
                    // InternalSCL.g:5209:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSCL.g:5215:6: (enumLiteral_3= '>' )
                    {
                    // InternalSCL.g:5215:6: (enumLiteral_3= '>' )
                    // InternalSCL.g:5215:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSCL.g:5221:6: (enumLiteral_4= '>=' )
                    {
                    // InternalSCL.g:5221:6: (enumLiteral_4= '>=' )
                    // InternalSCL.g:5221:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSCL.g:5227:6: (enumLiteral_5= '!=' )
                    {
                    // InternalSCL.g:5227:6: (enumLiteral_5= '!=' )
                    // InternalSCL.g:5227:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 133, ruleCompareOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rulePreOperator"
    // InternalSCL.g:5237:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;
        int rulePreOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return current; }
            // InternalSCL.g:5239:28: ( (enumLiteral_0= 'pre' ) )
            // InternalSCL.g:5240:1: (enumLiteral_0= 'pre' )
            {
            // InternalSCL.g:5240:1: (enumLiteral_0= 'pre' )
            // InternalSCL.g:5240:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 134, rulePreOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePreOperator"


    // $ANTLR start "ruleBitwiseOrOperator"
    // InternalSCL.g:5250:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleBitwiseOrOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return current; }
            // InternalSCL.g:5252:28: ( (enumLiteral_0= '|' ) )
            // InternalSCL.g:5253:1: (enumLiteral_0= '|' )
            {
            // InternalSCL.g:5253:1: (enumLiteral_0= '|' )
            // InternalSCL.g:5253:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 135, ruleBitwiseOrOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseOrOperator"


    // $ANTLR start "ruleBitwiseAndOperator"
    // InternalSCL.g:5263:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleBitwiseAndOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return current; }
            // InternalSCL.g:5265:28: ( (enumLiteral_0= '&' ) )
            // InternalSCL.g:5266:1: (enumLiteral_0= '&' )
            {
            // InternalSCL.g:5266:1: (enumLiteral_0= '&' )
            // InternalSCL.g:5266:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 136, ruleBitwiseAndOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseAndOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalSCL.g:5276:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleNotOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return current; }
            // InternalSCL.g:5278:28: ( (enumLiteral_0= '!' ) )
            // InternalSCL.g:5279:1: (enumLiteral_0= '!' )
            {
            // InternalSCL.g:5279:1: (enumLiteral_0= '!' )
            // InternalSCL.g:5279:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 137, ruleNotOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "ruleAddOperator"
    // InternalSCL.g:5289:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleAddOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return current; }
            // InternalSCL.g:5291:28: ( (enumLiteral_0= '+' ) )
            // InternalSCL.g:5292:1: (enumLiteral_0= '+' )
            {
            // InternalSCL.g:5292:1: (enumLiteral_0= '+' )
            // InternalSCL.g:5292:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 138, ruleAddOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "ruleSubOperator"
    // InternalSCL.g:5302:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleSubOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return current; }
            // InternalSCL.g:5304:28: ( (enumLiteral_0= '-' ) )
            // InternalSCL.g:5305:1: (enumLiteral_0= '-' )
            {
            // InternalSCL.g:5305:1: (enumLiteral_0= '-' )
            // InternalSCL.g:5305:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 139, ruleSubOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubOperator"


    // $ANTLR start "ruleMultOperator"
    // InternalSCL.g:5315:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleMultOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return current; }
            // InternalSCL.g:5317:28: ( (enumLiteral_0= '*' ) )
            // InternalSCL.g:5318:1: (enumLiteral_0= '*' )
            {
            // InternalSCL.g:5318:1: (enumLiteral_0= '*' )
            // InternalSCL.g:5318:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 140, ruleMultOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMultOperator"


    // $ANTLR start "ruleModOperator"
    // InternalSCL.g:5328:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleModOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return current; }
            // InternalSCL.g:5330:28: ( (enumLiteral_0= '%' ) )
            // InternalSCL.g:5331:1: (enumLiteral_0= '%' )
            {
            // InternalSCL.g:5331:1: (enumLiteral_0= '%' )
            // InternalSCL.g:5331:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 141, ruleModOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModOperator"


    // $ANTLR start "ruleDivOperator"
    // InternalSCL.g:5341:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleDivOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return current; }
            // InternalSCL.g:5343:28: ( (enumLiteral_0= '/' ) )
            // InternalSCL.g:5344:1: (enumLiteral_0= '/' )
            {
            // InternalSCL.g:5344:1: (enumLiteral_0= '/' )
            // InternalSCL.g:5344:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 142, ruleDivOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDivOperator"


    // $ANTLR start "ruleValOperator"
    // InternalSCL.g:5354:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleValOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return current; }
            // InternalSCL.g:5356:28: ( (enumLiteral_0= 'val' ) )
            // InternalSCL.g:5357:1: (enumLiteral_0= 'val' )
            {
            // InternalSCL.g:5357:1: (enumLiteral_0= 'val' )
            // InternalSCL.g:5357:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 143, ruleValOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValOperator"


    // $ANTLR start "ruleLogicalOrOperator"
    // InternalSCL.g:5367:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleLogicalOrOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return current; }
            // InternalSCL.g:5369:28: ( (enumLiteral_0= '||' ) )
            // InternalSCL.g:5370:1: (enumLiteral_0= '||' )
            {
            // InternalSCL.g:5370:1: (enumLiteral_0= '||' )
            // InternalSCL.g:5370:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 144, ruleLogicalOrOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // InternalSCL.g:5380:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleLogicalAndOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return current; }
            // InternalSCL.g:5382:28: ( (enumLiteral_0= '&&' ) )
            // InternalSCL.g:5383:1: (enumLiteral_0= '&&' )
            {
            // InternalSCL.g:5383:1: (enumLiteral_0= '&&' )
            // InternalSCL.g:5383:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 145, ruleLogicalAndOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleValueType"
    // InternalSCL.g:5397:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;
        int ruleValueType_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 146) ) { return current; }
            // InternalSCL.g:5399:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) )
            // InternalSCL.g:5400:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            {
            // InternalSCL.g:5400:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            int alt105=7;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt105=1;
                }
                break;
            case 69:
                {
                alt105=2;
                }
                break;
            case 70:
                {
                alt105=3;
                }
                break;
            case 71:
                {
                alt105=4;
                }
                break;
            case 72:
                {
                alt105=5;
                }
                break;
            case 73:
                {
                alt105=6;
                }
                break;
            case 74:
                {
                alt105=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // InternalSCL.g:5400:2: (enumLiteral_0= 'pure' )
                    {
                    // InternalSCL.g:5400:2: (enumLiteral_0= 'pure' )
                    // InternalSCL.g:5400:4: enumLiteral_0= 'pure'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:5406:6: (enumLiteral_1= 'bool' )
                    {
                    // InternalSCL.g:5406:6: (enumLiteral_1= 'bool' )
                    // InternalSCL.g:5406:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSCL.g:5412:6: (enumLiteral_2= 'unsigned' )
                    {
                    // InternalSCL.g:5412:6: (enumLiteral_2= 'unsigned' )
                    // InternalSCL.g:5412:8: enumLiteral_2= 'unsigned'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSCL.g:5418:6: (enumLiteral_3= 'int' )
                    {
                    // InternalSCL.g:5418:6: (enumLiteral_3= 'int' )
                    // InternalSCL.g:5418:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSCL.g:5424:6: (enumLiteral_4= 'float' )
                    {
                    // InternalSCL.g:5424:6: (enumLiteral_4= 'float' )
                    // InternalSCL.g:5424:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSCL.g:5430:6: (enumLiteral_5= 'string' )
                    {
                    // InternalSCL.g:5430:6: (enumLiteral_5= 'string' )
                    // InternalSCL.g:5430:8: enumLiteral_5= 'string'
                    {
                    enumLiteral_5=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSCL.g:5436:6: (enumLiteral_6= 'host' )
                    {
                    // InternalSCL.g:5436:6: (enumLiteral_6= 'host' )
                    // InternalSCL.g:5436:8: enumLiteral_6= 'host'
                    {
                    enumLiteral_6=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 146, ruleValueType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "ruleCombineOperator"
    // InternalSCL.g:5448:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleCombineOperator_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 147) ) { return current; }
            // InternalSCL.g:5450:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // InternalSCL.g:5451:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // InternalSCL.g:5451:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt106=8;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt106=1;
                }
                break;
            case 61:
                {
                alt106=2;
                }
                break;
            case 62:
                {
                alt106=3;
                }
                break;
            case 76:
                {
                alt106=4;
                }
                break;
            case 77:
                {
                alt106=5;
                }
                break;
            case 60:
                {
                alt106=6;
                }
                break;
            case 48:
                {
                alt106=7;
                }
                break;
            case 74:
                {
                alt106=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // InternalSCL.g:5451:2: (enumLiteral_0= 'none' )
                    {
                    // InternalSCL.g:5451:2: (enumLiteral_0= 'none' )
                    // InternalSCL.g:5451:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:5457:6: (enumLiteral_1= '+' )
                    {
                    // InternalSCL.g:5457:6: (enumLiteral_1= '+' )
                    // InternalSCL.g:5457:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSCL.g:5463:6: (enumLiteral_2= '*' )
                    {
                    // InternalSCL.g:5463:6: (enumLiteral_2= '*' )
                    // InternalSCL.g:5463:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSCL.g:5469:6: (enumLiteral_3= 'max' )
                    {
                    // InternalSCL.g:5469:6: (enumLiteral_3= 'max' )
                    // InternalSCL.g:5469:8: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSCL.g:5475:6: (enumLiteral_4= 'min' )
                    {
                    // InternalSCL.g:5475:6: (enumLiteral_4= 'min' )
                    // InternalSCL.g:5475:8: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSCL.g:5481:6: (enumLiteral_5= '|' )
                    {
                    // InternalSCL.g:5481:6: (enumLiteral_5= '|' )
                    // InternalSCL.g:5481:8: enumLiteral_5= '|'
                    {
                    enumLiteral_5=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSCL.g:5487:6: (enumLiteral_6= '&' )
                    {
                    // InternalSCL.g:5487:6: (enumLiteral_6= '&' )
                    // InternalSCL.g:5487:8: enumLiteral_6= '&'
                    {
                    enumLiteral_6=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalSCL.g:5493:6: (enumLiteral_7= 'host' )
                    {
                    // InternalSCL.g:5493:6: (enumLiteral_7= 'host' )
                    // InternalSCL.g:5493:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 147, ruleCombineOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCombineOperator"

    // $ANTLR start synpred4_InternalSCL
    public final void synpred4_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_statements_5_0 = null;


        // InternalSCL.g:150:4: ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) )
        // InternalSCL.g:150:4: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
        {
        // InternalSCL.g:150:4: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
        // InternalSCL.g:150:5: ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';'
        {
        // InternalSCL.g:150:5: ( (lv_statements_5_0= ruleInstructionStatement ) )
        // InternalSCL.g:151:1: (lv_statements_5_0= ruleInstructionStatement )
        {
        // InternalSCL.g:151:1: (lv_statements_5_0= ruleInstructionStatement )
        // InternalSCL.g:152:3: lv_statements_5_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSCLProgramAccess().getStatementsInstructionStatementParserRuleCall_5_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_7);
        lv_statements_5_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,18,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalSCL

    // $ANTLR start synpred5_InternalSCL
    public final void synpred5_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_7_0 = null;


        // InternalSCL.g:173:6: ( ( (lv_statements_7_0= ruleMetaStatement ) ) )
        // InternalSCL.g:173:6: ( (lv_statements_7_0= ruleMetaStatement ) )
        {
        // InternalSCL.g:173:6: ( (lv_statements_7_0= ruleMetaStatement ) )
        // InternalSCL.g:174:1: (lv_statements_7_0= ruleMetaStatement )
        {
        // InternalSCL.g:174:1: (lv_statements_7_0= ruleMetaStatement )
        // InternalSCL.g:175:3: lv_statements_7_0= ruleMetaStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSCLProgramAccess().getStatementsMetaStatementParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_statements_7_0=ruleMetaStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalSCL

    // $ANTLR start synpred20_InternalSCL
    public final void synpred20_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        EObject lv_statements_6_0 = null;


        // InternalSCL.g:744:4: ( ( ( (lv_statements_6_0= ruleInstructionStatement ) ) otherlv_7= ';' ) )
        // InternalSCL.g:744:4: ( ( (lv_statements_6_0= ruleInstructionStatement ) ) otherlv_7= ';' )
        {
        // InternalSCL.g:744:4: ( ( (lv_statements_6_0= ruleInstructionStatement ) ) otherlv_7= ';' )
        // InternalSCL.g:744:5: ( (lv_statements_6_0= ruleInstructionStatement ) ) otherlv_7= ';'
        {
        // InternalSCL.g:744:5: ( (lv_statements_6_0= ruleInstructionStatement ) )
        // InternalSCL.g:745:1: (lv_statements_6_0= ruleInstructionStatement )
        {
        // InternalSCL.g:745:1: (lv_statements_6_0= ruleInstructionStatement )
        // InternalSCL.g:746:3: lv_statements_6_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsInstructionStatementParserRuleCall_3_3_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_7);
        lv_statements_6_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_7=(Token)match(input,18,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalSCL

    // $ANTLR start synpred21_InternalSCL
    public final void synpred21_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_8_0 = null;


        // InternalSCL.g:767:6: ( ( (lv_statements_8_0= ruleMetaStatement ) ) )
        // InternalSCL.g:767:6: ( (lv_statements_8_0= ruleMetaStatement ) )
        {
        // InternalSCL.g:767:6: ( (lv_statements_8_0= ruleMetaStatement ) )
        // InternalSCL.g:768:1: (lv_statements_8_0= ruleMetaStatement )
        {
        // InternalSCL.g:768:1: (lv_statements_8_0= ruleMetaStatement )
        // InternalSCL.g:769:3: lv_statements_8_0= ruleMetaStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsMetaStatementParserRuleCall_3_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_statements_8_0=ruleMetaStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred21_InternalSCL

    // $ANTLR start synpred26_InternalSCL
    public final void synpred26_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_statements_5_0 = null;


        // InternalSCL.g:899:4: ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) )
        // InternalSCL.g:899:4: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
        {
        // InternalSCL.g:899:4: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
        // InternalSCL.g:899:5: ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';'
        {
        // InternalSCL.g:899:5: ( (lv_statements_5_0= ruleInstructionStatement ) )
        // InternalSCL.g:900:1: (lv_statements_5_0= ruleInstructionStatement )
        {
        // InternalSCL.g:900:1: (lv_statements_5_0= ruleInstructionStatement )
        // InternalSCL.g:901:3: lv_statements_5_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getElseScopeAccess().getStatementsInstructionStatementParserRuleCall_5_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_7);
        lv_statements_5_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,18,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalSCL

    // $ANTLR start synpred27_InternalSCL
    public final void synpred27_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_7_0 = null;


        // InternalSCL.g:922:6: ( ( (lv_statements_7_0= ruleMetaStatement ) ) )
        // InternalSCL.g:922:6: ( (lv_statements_7_0= ruleMetaStatement ) )
        {
        // InternalSCL.g:922:6: ( (lv_statements_7_0= ruleMetaStatement ) )
        // InternalSCL.g:923:1: (lv_statements_7_0= ruleMetaStatement )
        {
        // InternalSCL.g:923:1: (lv_statements_7_0= ruleMetaStatement )
        // InternalSCL.g:924:3: lv_statements_7_0= ruleMetaStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getElseScopeAccess().getStatementsMetaStatementParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_statements_7_0=ruleMetaStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred27_InternalSCL

    // $ANTLR start synpred31_InternalSCL
    public final void synpred31_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_statements_4_0 = null;


        // InternalSCL.g:1032:4: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) )
        // InternalSCL.g:1032:4: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
        {
        // InternalSCL.g:1032:4: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
        // InternalSCL.g:1032:5: ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';'
        {
        // InternalSCL.g:1032:5: ( (lv_statements_4_0= ruleInstructionStatement ) )
        // InternalSCL.g:1033:1: (lv_statements_4_0= ruleInstructionStatement )
        {
        // InternalSCL.g:1033:1: (lv_statements_4_0= ruleInstructionStatement )
        // InternalSCL.g:1034:3: lv_statements_4_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_1_0_3_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_7);
        lv_statements_4_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,18,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalSCL

    // $ANTLR start synpred32_InternalSCL
    public final void synpred32_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_6_0 = null;


        // InternalSCL.g:1055:6: ( ( (lv_statements_6_0= ruleMetaStatement ) ) )
        // InternalSCL.g:1055:6: ( (lv_statements_6_0= ruleMetaStatement ) )
        {
        // InternalSCL.g:1055:6: ( (lv_statements_6_0= ruleMetaStatement ) )
        // InternalSCL.g:1056:1: (lv_statements_6_0= ruleMetaStatement )
        {
        // InternalSCL.g:1056:1: (lv_statements_6_0= ruleMetaStatement )
        // InternalSCL.g:1057:3: lv_statements_6_0= ruleMetaStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsMetaStatementParserRuleCall_1_0_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_statements_6_0=ruleMetaStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred32_InternalSCL

    // $ANTLR start synpred34_InternalSCL
    public final void synpred34_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_declarations_3_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_statements_6_0 = null;

        EObject lv_statements_7_0 = null;


        // InternalSCL.g:992:3: ( ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}' ) )
        // InternalSCL.g:992:3: ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}' )
        {
        // InternalSCL.g:992:3: ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}' )
        // InternalSCL.g:992:4: ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}'
        {
        // InternalSCL.g:992:4: ( (lv_annotations_1_0= ruleAnnotation ) )*
        loop107:
        do {
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RULE_COMMENT_ANNOTATION||LA107_0==49) ) {
                alt107=1;
            }


            switch (alt107) {
        	case 1 :
        	    // InternalSCL.g:993:1: (lv_annotations_1_0= ruleAnnotation )
        	    {
        	    // InternalSCL.g:993:1: (lv_annotations_1_0= ruleAnnotation )
        	    // InternalSCL.g:994:3: lv_annotations_1_0= ruleAnnotation
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getThreadAccess().getAnnotationsAnnotationParserRuleCall_1_0_0_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_23);
        	    lv_annotations_1_0=ruleAnnotation();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop107;
            }
        } while (true);

        otherlv_2=(Token)match(input,25,FOLLOW_18); if (state.failed) return ;
        // InternalSCL.g:1014:1: ( (lv_declarations_3_0= ruleDeclaration ) )*
        loop108:
        do {
            int alt108=2;
            alt108 = dfa108.predict(input);
            switch (alt108) {
        	case 1 :
        	    // InternalSCL.g:1015:1: (lv_declarations_3_0= ruleDeclaration )
        	    {
        	    // InternalSCL.g:1015:1: (lv_declarations_3_0= ruleDeclaration )
        	    // InternalSCL.g:1016:3: lv_declarations_3_0= ruleDeclaration
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getThreadAccess().getDeclarationsDeclarationParserRuleCall_1_0_2_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_18);
        	    lv_declarations_3_0=ruleDeclaration();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop108;
            }
        } while (true);

        // InternalSCL.g:1032:3: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )*
        loop109:
        do {
            int alt109=3;
            alt109 = dfa109.predict(input);
            switch (alt109) {
        	case 1 :
        	    // InternalSCL.g:1032:4: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
        	    {
        	    // InternalSCL.g:1032:4: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
        	    // InternalSCL.g:1032:5: ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';'
        	    {
        	    // InternalSCL.g:1032:5: ( (lv_statements_4_0= ruleInstructionStatement ) )
        	    // InternalSCL.g:1033:1: (lv_statements_4_0= ruleInstructionStatement )
        	    {
        	    // InternalSCL.g:1033:1: (lv_statements_4_0= ruleInstructionStatement )
        	    // InternalSCL.g:1034:3: lv_statements_4_0= ruleInstructionStatement
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_1_0_3_0_0_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_7);
        	    lv_statements_4_0=ruleInstructionStatement();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }

        	    otherlv_5=(Token)match(input,18,FOLLOW_19); if (state.failed) return ;

        	    }


        	    }
        	    break;
        	case 2 :
        	    // InternalSCL.g:1055:6: ( (lv_statements_6_0= ruleMetaStatement ) )
        	    {
        	    // InternalSCL.g:1055:6: ( (lv_statements_6_0= ruleMetaStatement ) )
        	    // InternalSCL.g:1056:1: (lv_statements_6_0= ruleMetaStatement )
        	    {
        	    // InternalSCL.g:1056:1: (lv_statements_6_0= ruleMetaStatement )
        	    // InternalSCL.g:1057:3: lv_statements_6_0= ruleMetaStatement
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsMetaStatementParserRuleCall_1_0_3_1_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_19);
        	    lv_statements_6_0=ruleMetaStatement();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop109;
            }
        } while (true);

        // InternalSCL.g:1073:4: ( (lv_statements_7_0= ruleStatement ) )?
        int alt110=2;
        int LA110_0 = input.LA(1);

        if ( (LA110_0==RULE_ID||LA110_0==RULE_COMMENT_ANNOTATION||(LA110_0>=19 && LA110_0<=20)||LA110_0==23||LA110_0==25||LA110_0==28||LA110_0==49) ) {
            alt110=1;
        }
        switch (alt110) {
            case 1 :
                // InternalSCL.g:1074:1: (lv_statements_7_0= ruleStatement )
                {
                // InternalSCL.g:1074:1: (lv_statements_7_0= ruleStatement )
                // InternalSCL.g:1075:3: lv_statements_7_0= ruleStatement
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsStatementParserRuleCall_1_0_4_0()); 
                  	    
                }
                pushFollow(FOLLOW_20);
                lv_statements_7_0=ruleStatement();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_8=(Token)match(input,26,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_InternalSCL

    // $ANTLR start synpred35_InternalSCL
    public final void synpred35_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_10=null;
        EObject lv_statements_9_0 = null;


        // InternalSCL.g:1096:8: ( ( ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) )
        // InternalSCL.g:1096:8: ( ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' )
        {
        // InternalSCL.g:1096:8: ( ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' )
        // InternalSCL.g:1096:9: ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';'
        {
        // InternalSCL.g:1096:9: ( (lv_statements_9_0= ruleInstructionStatement ) )
        // InternalSCL.g:1097:1: (lv_statements_9_0= ruleInstructionStatement )
        {
        // InternalSCL.g:1097:1: (lv_statements_9_0= ruleInstructionStatement )
        // InternalSCL.g:1098:3: lv_statements_9_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_1_1_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_7);
        lv_statements_9_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_10=(Token)match(input,18,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred35_InternalSCL

    // $ANTLR start synpred36_InternalSCL
    public final void synpred36_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_11_0 = null;


        // InternalSCL.g:1119:6: ( ( (lv_statements_11_0= ruleMetaStatement ) ) )
        // InternalSCL.g:1119:6: ( (lv_statements_11_0= ruleMetaStatement ) )
        {
        // InternalSCL.g:1119:6: ( (lv_statements_11_0= ruleMetaStatement ) )
        // InternalSCL.g:1120:1: (lv_statements_11_0= ruleMetaStatement )
        {
        // InternalSCL.g:1120:1: (lv_statements_11_0= ruleMetaStatement )
        // InternalSCL.g:1121:3: lv_statements_11_0= ruleMetaStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsMetaStatementParserRuleCall_1_1_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_statements_11_0=ruleMetaStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred36_InternalSCL

    // $ANTLR start synpred41_InternalSCL
    public final void synpred41_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_statements_4_0 = null;


        // InternalSCL.g:1294:4: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) )
        // InternalSCL.g:1294:4: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
        {
        // InternalSCL.g:1294:4: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
        // InternalSCL.g:1294:5: ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';'
        {
        // InternalSCL.g:1294:5: ( (lv_statements_4_0= ruleInstructionStatement ) )
        // InternalSCL.g:1295:1: (lv_statements_4_0= ruleInstructionStatement )
        {
        // InternalSCL.g:1295:1: (lv_statements_4_0= ruleInstructionStatement )
        // InternalSCL.g:1296:3: lv_statements_4_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getScopeStatementAccess().getStatementsInstructionStatementParserRuleCall_4_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_7);
        lv_statements_4_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,18,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred41_InternalSCL

    // $ANTLR start synpred42_InternalSCL
    public final void synpred42_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_6_0 = null;


        // InternalSCL.g:1317:6: ( ( (lv_statements_6_0= ruleMetaStatement ) ) )
        // InternalSCL.g:1317:6: ( (lv_statements_6_0= ruleMetaStatement ) )
        {
        // InternalSCL.g:1317:6: ( (lv_statements_6_0= ruleMetaStatement ) )
        // InternalSCL.g:1318:1: (lv_statements_6_0= ruleMetaStatement )
        {
        // InternalSCL.g:1318:1: (lv_statements_6_0= ruleMetaStatement )
        // InternalSCL.g:1319:3: lv_statements_6_0= ruleMetaStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getScopeStatementAccess().getStatementsMetaStatementParserRuleCall_4_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_statements_6_0=ruleMetaStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred42_InternalSCL

    // $ANTLR start synpred59_InternalSCL
    public final void synpred59_InternalSCL_fragment() throws RecognitionException {   
        EObject this_Assignment_0 = null;


        // InternalSCL.g:1831:2: (this_Assignment_0= ruleAssignment )
        // InternalSCL.g:1831:2: this_Assignment_0= ruleAssignment
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_Assignment_0=ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalSCL

    // $ANTLR start synpred60_InternalSCL
    public final void synpred60_InternalSCL_fragment() throws RecognitionException {   
        EObject this_PostfixEffect_1 = null;


        // InternalSCL.g:1844:2: (this_PostfixEffect_1= rulePostfixEffect )
        // InternalSCL.g:1844:2: this_PostfixEffect_1= rulePostfixEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_PostfixEffect_1=rulePostfixEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalSCL

    // $ANTLR start synpred61_InternalSCL
    public final void synpred61_InternalSCL_fragment() throws RecognitionException {   
        EObject this_Emission_2 = null;


        // InternalSCL.g:1857:2: (this_Emission_2= ruleEmission )
        // InternalSCL.g:1857:2: this_Emission_2= ruleEmission
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_Emission_2=ruleEmission();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalSCL

    // $ANTLR start synpred62_InternalSCL
    public final void synpred62_InternalSCL_fragment() throws RecognitionException {   
        EObject this_HostcodeEffect_3 = null;


        // InternalSCL.g:1870:2: (this_HostcodeEffect_3= ruleHostcodeEffect )
        // InternalSCL.g:1870:2: this_HostcodeEffect_3= ruleHostcodeEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_HostcodeEffect_3=ruleHostcodeEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalSCL

    // $ANTLR start synpred72_InternalSCL
    public final void synpred72_InternalSCL_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalSCL.g:2273:2: (this_BoolExpression_0= ruleBoolExpression )
        // InternalSCL.g:2273:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_InternalSCL

    // $ANTLR start synpred82_InternalSCL
    public final void synpred82_InternalSCL_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // InternalSCL.g:2742:2: (this_ValuedExpression_0= ruleValuedExpression )
        // InternalSCL.g:2742:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred82_InternalSCL

    // $ANTLR start synpred102_InternalSCL
    public final void synpred102_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // InternalSCL.g:3500:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // InternalSCL.g:3500:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // InternalSCL.g:3500:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // InternalSCL.g:3500:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,42,FOLLOW_53); if (state.failed) return ;
        pushFollow(FOLLOW_39);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,43,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred102_InternalSCL

    // Delegated rules

    public final boolean synpred26_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred102_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA91 dfa91 = new DFA91(this);
    protected DFA92 dfa92 = new DFA92(this);
    protected DFA108 dfa108 = new DFA108(this);
    protected DFA109 dfa109 = new DFA109(this);
    static final String dfa_1s = "\61\uffff";
    static final String dfa_2s = "\1\3\60\uffff";
    static final String dfa_3s = "\3\4\2\uffff\2\4\2\6\10\4\1\26\2\4\1\6\1\4\1\6\5\4\2\26\4\4\1\6\2\4\1\6\10\4\1\6\2\4";
    static final String dfa_4s = "\2\112\1\4\2\uffff\1\112\1\4\1\6\1\7\1\112\1\4\6\112\1\63\1\11\1\4\1\6\1\4\1\6\1\11\4\112\1\63\1\26\3\112\1\4\1\6\1\11\1\4\1\6\7\112\1\4\1\6\2\112";
    static final String dfa_5s = "\3\uffff\1\2\1\1\54\uffff";
    static final String dfa_6s = "\61\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\5\uffff\1\1\10\uffff\2\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\3\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\14\1\uffff\1\11\1\16\1\15\1\13\1\1\10\uffff\1\3\1\uffff\1\12\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\1\6\1\7\1\10\17\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\11\1\16",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\21",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\22\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\22\1\3\10\uffff\1\2\1\23\1\24\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\14\1\uffff\1\11\1\16\1\15\1\13\1\1\10\uffff\1\3\1\uffff\1\12\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\1\6\1\7\1\10\17\uffff\7\4",
            "\1\14\1\uffff\1\11\1\16\1\15\1\13\1\1\10\uffff\1\3\1\uffff\1\12\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\2\uffff\1\10\17\uffff\7\4",
            "\1\27\33\uffff\1\25\1\26",
            "\1\31\4\uffff\1\30",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\37\3\uffff\1\40\1\36",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\22\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\22\11\uffff\1\2\1\41\1\42\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\22\11\uffff\1\2\1\23\1\24\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\22\11\uffff\1\2\22\uffff\7\4",
            "\1\27\33\uffff\1\25\1\26",
            "\1\27",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\1\44\1\45\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\22\uffff\7\4",
            "\1\46",
            "\1\47",
            "\1\51\3\uffff\1\52\1\50",
            "\1\53",
            "\1\54",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\22\11\uffff\1\2\1\41\1\42\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\22\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\1\55\1\56\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\1\44\1\45\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\22\uffff\7\4",
            "\1\57",
            "\1\60",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\1\55\1\56\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\22\uffff\7\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 132:3: ( (lv_declarations_4_0= ruleDeclaration ) )*";
        }
    }
    static final String dfa_8s = "\14\uffff";
    static final String dfa_9s = "\1\11\13\uffff";
    static final String dfa_10s = "\1\4\10\0\3\uffff";
    static final String dfa_11s = "\1\61\10\0\3\uffff";
    static final String dfa_12s = "\11\uffff\1\3\1\1\1\2";
    static final String dfa_13s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff}>";
    static final String[] dfa_14s = {
            "\1\3\5\uffff\1\1\10\uffff\1\7\1\5\2\uffff\1\4\1\uffff\1\10\2\uffff\1\6\24\uffff\1\2",
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
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 150:3: ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleMetaStatement ) ) )*";
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
                        if ( (synpred4_InternalSCL()) ) {s = 10;}

                        else if ( (synpred5_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalSCL()) ) {s = 10;}

                        else if ( (synpred5_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_3 = input.LA(1);

                         
                        int index4_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalSCL()) ) {s = 10;}

                        else if ( (synpred5_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_4 = input.LA(1);

                         
                        int index4_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_5 = input.LA(1);

                         
                        int index4_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA4_8 = input.LA(1);

                         
                        int index4_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_8);
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
    static final String dfa_15s = "\62\uffff";
    static final String dfa_16s = "\3\4\1\21\2\uffff\2\4\2\6\10\4\1\26\2\4\1\6\1\4\1\6\5\4\2\26\4\4\1\6\2\4\1\6\10\4\1\6\2\4";
    static final String dfa_17s = "\2\61\1\4\1\50\2\uffff\1\64\1\4\1\6\1\7\2\61\1\4\1\61\1\63\1\61\2\64\1\63\1\11\1\4\1\6\1\4\1\6\1\11\1\61\2\63\1\61\1\63\1\26\1\61\1\63\1\61\1\4\1\6\1\11\1\4\1\6\1\63\2\61\1\63\1\61\1\63\1\61\1\4\1\6\1\63\1\61";
    static final String dfa_18s = "\4\uffff\1\1\1\2\54\uffff";
    static final String dfa_19s = "\62\uffff}>";
    static final String[] dfa_20s = {
            "\1\3\5\uffff\1\1\10\uffff\2\4\2\uffff\1\4\1\uffff\1\5\2\uffff\1\4\24\uffff\1\2",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\27\uffff\1\2",
            "\1\6",
            "\1\5\3\uffff\1\4\22\uffff\1\4",
            "",
            "",
            "\1\16\1\uffff\1\12\1\17\1\13\1\15\1\1\10\uffff\1\4\1\uffff\1\14\1\uffff\1\4\1\uffff\1\5\27\uffff\1\2\1\7\1\10\1\11",
            "\1\20",
            "\1\21",
            "\1\12\1\17",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\27\uffff\1\2",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\27\uffff\1\2",
            "\1\22",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\15\uffff\1\23\11\uffff\1\2",
            "\1\3\5\uffff\1\1\6\uffff\1\5\1\uffff\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\1\5\15\uffff\1\23\1\4\10\uffff\1\2\1\24\1\25",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\27\uffff\1\2",
            "\1\16\1\uffff\1\12\1\17\1\13\1\15\1\1\10\uffff\1\4\1\uffff\1\14\1\uffff\1\4\1\uffff\1\5\27\uffff\1\2\1\7\1\10\1\11",
            "\1\16\1\uffff\1\12\1\17\1\13\1\15\1\1\10\uffff\1\4\1\uffff\1\14\1\uffff\1\4\1\uffff\1\5\27\uffff\1\2\2\uffff\1\11",
            "\1\30\33\uffff\1\26\1\27",
            "\1\32\4\uffff\1\31",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\40\3\uffff\1\41\1\37",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\15\uffff\1\23\11\uffff\1\2",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\15\uffff\1\23\11\uffff\1\2\1\42\1\43",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\15\uffff\1\23\11\uffff\1\2\1\24\1\25",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\15\uffff\1\23\11\uffff\1\2",
            "\1\30\33\uffff\1\26\1\27",
            "\1\30",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\15\uffff\1\44\11\uffff\1\2",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\15\uffff\1\44\11\uffff\1\2\1\45\1\46",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\15\uffff\1\44\11\uffff\1\2",
            "\1\47",
            "\1\50",
            "\1\52\3\uffff\1\53\1\51",
            "\1\54",
            "\1\55",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\15\uffff\1\23\11\uffff\1\2\1\42\1\43",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\15\uffff\1\23\11\uffff\1\2",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\15\uffff\1\44\11\uffff\1\2",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\15\uffff\1\44\11\uffff\1\2\1\56\1\57",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\15\uffff\1\44\11\uffff\1\2",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\15\uffff\1\44\11\uffff\1\2\1\45\1\46",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\15\uffff\1\44\11\uffff\1\2",
            "\1\60",
            "\1\61",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\15\uffff\1\44\11\uffff\1\2\1\56\1\57",
            "\1\3\5\uffff\1\1\10\uffff\1\4\3\uffff\1\4\1\uffff\1\5\15\uffff\1\44\11\uffff\1\2"
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "230:1: (this_InstructionStatement_0= ruleInstructionStatement | this_MetaStatement_1= ruleMetaStatement )";
        }
    }
    static final String dfa_21s = "\64\uffff";
    static final String dfa_22s = "\3\4\5\uffff\2\4\1\6\3\4\1\6\5\4\1\26\2\4\1\6\1\4\1\6\5\4\2\26\4\4\1\6\2\4\1\6\10\4\1\6\2\4";
    static final String dfa_23s = "\2\61\1\4\5\uffff\1\64\1\4\1\6\1\4\1\61\1\63\1\7\3\61\2\64\1\63\1\11\1\4\1\6\1\4\1\6\1\11\1\61\2\63\1\61\1\63\1\26\1\61\1\63\1\61\1\4\1\6\1\11\1\4\1\6\1\63\2\61\1\63\1\61\1\63\1\61\1\4\1\6\1\63\1\61";
    static final String dfa_24s = "\3\uffff\1\1\1\2\1\3\1\4\1\5\54\uffff";
    static final String dfa_25s = "\64\uffff}>";
    static final String[] dfa_26s = {
            "\1\3\5\uffff\1\1\10\uffff\1\7\1\5\2\uffff\1\4\4\uffff\1\6\24\uffff\1\2",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\31\uffff\1\2",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\15\1\uffff\1\17\1\21\1\20\1\14\1\1\10\uffff\1\7\1\uffff\1\13\1\uffff\1\4\31\uffff\1\2\1\11\1\12\1\16",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\17\uffff\1\25\11\uffff\1\2",
            "\1\3\5\uffff\1\1\10\uffff\1\7\1\uffff\1\3\1\uffff\1\4\17\uffff\1\25\1\3\10\uffff\1\2\1\26\1\27",
            "\1\17\1\21",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\31\uffff\1\2",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\31\uffff\1\2",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\31\uffff\1\2",
            "\1\15\1\uffff\1\17\1\21\1\20\1\14\1\1\10\uffff\1\7\1\uffff\1\13\1\uffff\1\4\31\uffff\1\2\1\11\1\12\1\16",
            "\1\15\1\uffff\1\17\1\21\1\20\1\14\1\1\10\uffff\1\7\1\uffff\1\13\1\uffff\1\4\31\uffff\1\2\2\uffff\1\16",
            "\1\32\33\uffff\1\30\1\31",
            "\1\34\4\uffff\1\33",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\42\3\uffff\1\43\1\41",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\17\uffff\1\25\11\uffff\1\2",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\17\uffff\1\25\11\uffff\1\2\1\44\1\45",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\17\uffff\1\25\11\uffff\1\2\1\26\1\27",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\17\uffff\1\25\11\uffff\1\2",
            "\1\32\33\uffff\1\30\1\31",
            "\1\32",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\17\uffff\1\46\11\uffff\1\2",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\17\uffff\1\46\11\uffff\1\2\1\47\1\50",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\17\uffff\1\46\11\uffff\1\2",
            "\1\51",
            "\1\52",
            "\1\54\3\uffff\1\55\1\53",
            "\1\56",
            "\1\57",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\17\uffff\1\25\11\uffff\1\2\1\44\1\45",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\17\uffff\1\25\11\uffff\1\2",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\17\uffff\1\46\11\uffff\1\2",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\17\uffff\1\46\11\uffff\1\2\1\60\1\61",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\17\uffff\1\46\11\uffff\1\2",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\17\uffff\1\46\11\uffff\1\2\1\47\1\50",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\17\uffff\1\46\11\uffff\1\2",
            "\1\62",
            "\1\63",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\17\uffff\1\46\11\uffff\1\2\1\60\1\61",
            "\1\3\5\uffff\1\1\10\uffff\1\7\3\uffff\1\4\17\uffff\1\46\11\uffff\1\2"
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "276:1: (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Goto_2= ruleGoto | this_Parallel_3= ruleParallel | this_Pause_4= rulePause )";
        }
    }
    static final String dfa_27s = "\3\4\2\uffff\2\4\1\6\1\4\1\6\7\4\1\26\2\4\1\6\1\4\1\6\5\4\2\26\4\4\1\6\2\4\1\6\10\4\1\6\2\4";
    static final String dfa_28s = "\2\61\1\4\2\uffff\1\64\1\4\1\6\1\4\1\7\2\61\1\63\2\61\2\64\1\63\1\11\1\4\1\6\1\4\1\6\1\11\1\61\2\63\1\61\1\63\1\26\1\61\1\63\1\61\1\4\1\6\1\11\1\4\1\6\1\63\2\61\1\63\1\61\1\63\1\61\1\4\1\6\1\63\1\61";
    static final String dfa_29s = "\3\uffff\1\1\1\2\54\uffff";
    static final String[] dfa_30s = {
            "\1\3\5\uffff\1\1\16\uffff\1\4\27\uffff\1\2",
            "\1\3\5\uffff\1\1\16\uffff\1\4\27\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\14\1\uffff\1\12\1\15\1\16\1\13\1\1\12\uffff\1\10\3\uffff\1\4\27\uffff\1\2\1\6\1\7\1\11",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\12\1\15",
            "\1\3\5\uffff\1\1\16\uffff\1\4\27\uffff\1\2",
            "\1\3\5\uffff\1\1\16\uffff\1\4\15\uffff\1\22\11\uffff\1\2",
            "\1\3\5\uffff\1\1\6\uffff\1\3\7\uffff\1\4\15\uffff\1\22\11\uffff\1\2\1\23\1\24",
            "\1\3\5\uffff\1\1\16\uffff\1\4\27\uffff\1\2",
            "\1\3\5\uffff\1\1\16\uffff\1\4\27\uffff\1\2",
            "\1\14\1\uffff\1\12\1\15\1\16\1\13\1\1\12\uffff\1\10\3\uffff\1\4\27\uffff\1\2\1\6\1\7\1\11",
            "\1\14\1\uffff\1\12\1\15\1\16\1\13\1\1\12\uffff\1\10\3\uffff\1\4\27\uffff\1\2\2\uffff\1\11",
            "\1\27\33\uffff\1\25\1\26",
            "\1\31\4\uffff\1\30",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\37\3\uffff\1\40\1\36",
            "\1\3\5\uffff\1\1\16\uffff\1\4\15\uffff\1\22\11\uffff\1\2",
            "\1\3\5\uffff\1\1\16\uffff\1\4\15\uffff\1\22\11\uffff\1\2\1\41\1\42",
            "\1\3\5\uffff\1\1\16\uffff\1\4\15\uffff\1\22\11\uffff\1\2\1\23\1\24",
            "\1\3\5\uffff\1\1\16\uffff\1\4\15\uffff\1\22\11\uffff\1\2",
            "\1\27\33\uffff\1\25\1\26",
            "\1\27",
            "\1\3\5\uffff\1\1\16\uffff\1\4\15\uffff\1\43\11\uffff\1\2",
            "\1\3\5\uffff\1\1\16\uffff\1\4\15\uffff\1\43\11\uffff\1\2\1\44\1\45",
            "\1\3\5\uffff\1\1\16\uffff\1\4\15\uffff\1\43\11\uffff\1\2",
            "\1\46",
            "\1\47",
            "\1\51\3\uffff\1\52\1\50",
            "\1\53",
            "\1\54",
            "\1\3\5\uffff\1\1\16\uffff\1\4\15\uffff\1\22\11\uffff\1\2\1\41\1\42",
            "\1\3\5\uffff\1\1\16\uffff\1\4\15\uffff\1\22\11\uffff\1\2",
            "\1\3\5\uffff\1\1\16\uffff\1\4\15\uffff\1\43\11\uffff\1\2",
            "\1\3\5\uffff\1\1\16\uffff\1\4\15\uffff\1\43\11\uffff\1\2\1\55\1\56",
            "\1\3\5\uffff\1\1\16\uffff\1\4\15\uffff\1\43\11\uffff\1\2",
            "\1\3\5\uffff\1\1\16\uffff\1\4\15\uffff\1\43\11\uffff\1\2\1\44\1\45",
            "\1\3\5\uffff\1\1\16\uffff\1\4\15\uffff\1\43\11\uffff\1\2",
            "\1\57",
            "\1\60",
            "\1\3\5\uffff\1\1\16\uffff\1\4\15\uffff\1\43\11\uffff\1\2\1\55\1\56",
            "\1\3\5\uffff\1\1\16\uffff\1\4\15\uffff\1\43\11\uffff\1\2"
    };
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_6;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "361:1: (this_Label_0= ruleLabel | this_ScopeStatement_1= ruleScopeStatement )";
        }
    }
    static final String dfa_31s = "\2\112\1\4\2\uffff\1\112\1\4\1\6\1\4\1\7\7\112\1\63\1\11\1\4\1\6\1\4\1\6\1\11\4\112\1\63\1\26\3\112\1\4\1\6\1\11\1\4\1\6\7\112\1\4\1\6\2\112";
    static final String[] dfa_32s = {
            "\1\3\5\uffff\1\1\10\uffff\2\3\2\uffff\1\3\1\uffff\2\3\1\uffff\1\3\3\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\16\1\uffff\1\12\1\13\1\14\1\15\1\1\10\uffff\1\3\1\uffff\1\10\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\1\6\1\7\1\11\17\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\12\1\13",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\22\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\22\1\3\10\uffff\1\2\1\23\1\24\20\uffff\7\4",
            "\1\16\1\uffff\1\12\1\13\1\14\1\15\1\1\10\uffff\1\3\1\uffff\1\10\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\1\6\1\7\1\11\17\uffff\7\4",
            "\1\16\1\uffff\1\12\1\13\1\14\1\15\1\1\10\uffff\1\3\1\uffff\1\10\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\2\uffff\1\11\17\uffff\7\4",
            "\1\27\33\uffff\1\25\1\26",
            "\1\31\4\uffff\1\30",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\37\3\uffff\1\40\1\36",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\22\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\22\11\uffff\1\2\1\41\1\42\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\22\11\uffff\1\2\1\23\1\24\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\22\11\uffff\1\2\22\uffff\7\4",
            "\1\27\33\uffff\1\25\1\26",
            "\1\27",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\1\44\1\45\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\22\uffff\7\4",
            "\1\46",
            "\1\47",
            "\1\51\3\uffff\1\52\1\50",
            "\1\53",
            "\1\54",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\22\11\uffff\1\2\1\41\1\42\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\22\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\1\55\1\56\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\1\44\1\45\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\22\uffff\7\4",
            "\1\57",
            "\1\60",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\1\55\1\56\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\43\11\uffff\1\2\22\uffff\7\4"
    };
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_27;
            this.max = dfa_31;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "()* loopback of 726:1: ( (lv_declarations_5_0= ruleDeclaration ) )*";
        }
    }
    static final String[] dfa_33s = {
            "\1\3\5\uffff\1\1\10\uffff\1\7\1\5\2\uffff\1\4\1\uffff\1\10\1\11\1\uffff\1\6\24\uffff\1\2",
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
            ""
    };
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "()* loopback of 744:3: ( ( ( (lv_statements_6_0= ruleInstructionStatement ) ) otherlv_7= ';' ) | ( (lv_statements_8_0= ruleMetaStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSCL()) ) {s = 10;}

                        else if ( (synpred21_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_2 = input.LA(1);

                         
                        int index16_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSCL()) ) {s = 10;}

                        else if ( (synpred21_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_3 = input.LA(1);

                         
                        int index16_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSCL()) ) {s = 10;}

                        else if ( (synpred21_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_4 = input.LA(1);

                         
                        int index16_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_5 = input.LA(1);

                         
                        int index16_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_6 = input.LA(1);

                         
                        int index16_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_7 = input.LA(1);

                         
                        int index16_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_8 = input.LA(1);

                         
                        int index16_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\3\4\2\uffff\2\4\1\6\3\4\1\6\7\4\1\6\1\26\5\4\1\6\2\4\1\6\2\26\7\4\1\6\6\4\1\6\2\4";
    static final String dfa_35s = "\2\112\1\4\2\uffff\1\112\1\4\1\6\3\112\1\7\2\112\1\4\2\112\1\11\1\4\1\6\1\63\4\112\1\4\1\6\1\11\1\4\1\6\1\63\1\26\5\112\1\11\1\4\1\6\5\112\1\4\1\6\2\112";
    static final String[] dfa_36s = {
            "\1\3\5\uffff\1\1\10\uffff\2\3\2\uffff\1\3\1\uffff\2\3\1\uffff\1\3\3\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\11\1\uffff\1\15\1\14\1\12\1\10\1\1\10\uffff\1\3\1\uffff\1\16\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\1\6\1\7\1\13\17\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\1\3\10\uffff\1\2\1\22\1\23\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\15\1\14",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\24",
            "\1\11\1\uffff\1\15\1\14\1\12\1\10\1\1\10\uffff\1\3\1\uffff\1\16\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\1\6\1\7\1\13\17\uffff\7\4",
            "\1\11\1\uffff\1\15\1\14\1\12\1\10\1\1\10\uffff\1\3\1\uffff\1\16\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\2\uffff\1\13\17\uffff\7\4",
            "\1\26\4\uffff\1\25",
            "\1\27",
            "\1\30",
            "\1\33\33\uffff\1\31\1\32",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\1\34\1\35\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\1\22\1\23\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\22\uffff\7\4",
            "\1\36",
            "\1\37",
            "\1\41\3\uffff\1\42\1\40",
            "\1\43",
            "\1\44",
            "\1\33\33\uffff\1\31\1\32",
            "\1\33",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\1\46\1\47\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\1\34\1\35\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\22\uffff\7\4",
            "\1\51\3\uffff\1\52\1\50",
            "\1\53",
            "\1\54",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\1\55\1\56\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\1\46\1\47\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\57",
            "\1\60",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\1\55\1\56\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4"
    };
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[][] dfa_36 = unpackEncodedStringArray(dfa_36s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "()* loopback of 881:1: ( (lv_declarations_4_0= ruleDeclaration ) )*";
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "()* loopback of 899:3: ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleMetaStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_1 = input.LA(1);

                         
                        int index21_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSCL()) ) {s = 10;}

                        else if ( (synpred27_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_2 = input.LA(1);

                         
                        int index21_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSCL()) ) {s = 10;}

                        else if ( (synpred27_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_3 = input.LA(1);

                         
                        int index21_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSCL()) ) {s = 10;}

                        else if ( (synpred27_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_4 = input.LA(1);

                         
                        int index21_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_5 = input.LA(1);

                         
                        int index21_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_6 = input.LA(1);

                         
                        int index21_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_7 = input.LA(1);

                         
                        int index21_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA21_8 = input.LA(1);

                         
                        int index21_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_37s = "\15\uffff";
    static final String dfa_38s = "\1\4\14\uffff";
    static final String dfa_39s = "\1\4\3\0\11\uffff";
    static final String dfa_40s = "\1\61\3\0\11\uffff";
    static final String dfa_41s = "\4\uffff\1\2\7\uffff\1\1";
    static final String dfa_42s = "\1\uffff\1\0\1\1\1\2\11\uffff}>";
    static final String[] dfa_43s = {
            "\1\4\5\uffff\1\1\10\uffff\2\4\2\uffff\1\4\1\uffff\1\3\2\uffff\3\4\22\uffff\1\2",
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
            ""
    };

    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_37;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "992:2: ( ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )* ( (lv_statements_7_0= ruleStatement ) )? otherlv_8= '}' ) | ( ( ( ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_statements_11_0= ruleMetaStatement ) ) )* ( (lv_statements_12_0= ruleStatement ) )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_2 = input.LA(1);

                         
                        int index29_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index29_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_3 = input.LA(1);

                         
                        int index29_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index29_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_44s = "\3\4\2\uffff\2\4\1\6\2\4\1\6\7\4\1\6\1\4\1\26\5\4\1\6\2\4\1\6\2\26\7\4\1\6\6\4\1\6\2\4";
    static final String dfa_45s = "\2\112\1\4\2\uffff\1\112\1\4\1\6\2\112\1\7\2\112\1\4\3\112\1\4\1\6\1\11\1\63\4\112\1\4\1\6\1\11\1\4\1\6\1\63\1\26\5\112\1\11\1\4\1\6\5\112\1\4\1\6\2\112";
    static final String[] dfa_46s = {
            "\1\3\5\uffff\1\1\10\uffff\2\3\2\uffff\1\3\1\uffff\2\3\1\uffff\1\3\3\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\11\1\uffff\1\14\1\13\1\10\1\16\1\1\10\uffff\1\3\1\uffff\1\15\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\1\6\1\7\1\12\17\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\23\1\3\10\uffff\1\2\1\21\1\22\20\uffff\7\4",
            "\1\14\1\13",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\24",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\23\11\uffff\1\2\22\uffff\7\4",
            "\1\11\1\uffff\1\14\1\13\1\10\1\16\1\1\10\uffff\1\3\1\uffff\1\15\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\1\6\1\7\1\12\17\uffff\7\4",
            "\1\11\1\uffff\1\14\1\13\1\10\1\16\1\1\10\uffff\1\3\1\uffff\1\15\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\2\uffff\1\12\17\uffff\7\4",
            "\1\25",
            "\1\26",
            "\1\30\4\uffff\1\27",
            "\1\33\33\uffff\1\31\1\32",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\23\11\uffff\1\2\1\21\1\22\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\23\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\23\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\23\11\uffff\1\2\1\34\1\35\20\uffff\7\4",
            "\1\36",
            "\1\37",
            "\1\41\3\uffff\1\42\1\40",
            "\1\43",
            "\1\44",
            "\1\33\33\uffff\1\31\1\32",
            "\1\33",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\1\46\1\47\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\23\11\uffff\1\2\1\34\1\35\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\23\11\uffff\1\2\22\uffff\7\4",
            "\1\51\3\uffff\1\52\1\50",
            "\1\53",
            "\1\54",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\1\55\1\56\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\1\46\1\47\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\57",
            "\1\60",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\1\55\1\56\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4"
    };
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final short[][] dfa_46 = unpackEncodedStringArray(dfa_46s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_44;
            this.max = dfa_45;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_46;
        }
        public String getDescription() {
            return "()* loopback of 1014:1: ( (lv_declarations_3_0= ruleDeclaration ) )*";
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "()* loopback of 1032:3: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_1 = input.LA(1);

                         
                        int index25_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSCL()) ) {s = 10;}

                        else if ( (synpred32_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index25_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_2 = input.LA(1);

                         
                        int index25_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSCL()) ) {s = 10;}

                        else if ( (synpred32_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index25_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_3 = input.LA(1);

                         
                        int index25_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSCL()) ) {s = 10;}

                        else if ( (synpred32_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index25_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA25_4 = input.LA(1);

                         
                        int index25_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index25_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA25_5 = input.LA(1);

                         
                        int index25_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index25_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA25_6 = input.LA(1);

                         
                        int index25_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index25_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA25_7 = input.LA(1);

                         
                        int index25_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index25_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA25_8 = input.LA(1);

                         
                        int index25_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index25_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_47s = "\16\uffff";
    static final String dfa_48s = "\1\11\15\uffff";
    static final String dfa_49s = "\1\4\10\0\5\uffff";
    static final String dfa_50s = "\1\61\10\0\5\uffff";
    static final String dfa_51s = "\11\uffff\1\3\2\uffff\1\1\1\2";
    static final String dfa_52s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\5\uffff}>";
    static final String[] dfa_53s = {
            "\1\3\5\uffff\1\1\10\uffff\1\7\1\5\2\uffff\1\4\1\uffff\1\10\2\uffff\1\6\2\11\22\uffff\1\2",
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

    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[][] dfa_53 = unpackEncodedStringArray(dfa_53s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_47;
            this.eof = dfa_48;
            this.min = dfa_49;
            this.max = dfa_50;
            this.accept = dfa_51;
            this.special = dfa_52;
            this.transition = dfa_53;
        }
        public String getDescription() {
            return "()* loopback of 1096:7: ( ( ( (lv_statements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_statements_11_0= ruleMetaStatement ) ) )*";
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
                        if ( (synpred35_InternalSCL()) ) {s = 12;}

                        else if ( (synpred36_InternalSCL()) ) {s = 13;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_2 = input.LA(1);

                         
                        int index27_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSCL()) ) {s = 12;}

                        else if ( (synpred36_InternalSCL()) ) {s = 13;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index27_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_3 = input.LA(1);

                         
                        int index27_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSCL()) ) {s = 12;}

                        else if ( (synpred36_InternalSCL()) ) {s = 13;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index27_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_4 = input.LA(1);

                         
                        int index27_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index27_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_5 = input.LA(1);

                         
                        int index27_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index27_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_6 = input.LA(1);

                         
                        int index27_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index27_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_7 = input.LA(1);

                         
                        int index27_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index27_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA27_8 = input.LA(1);

                         
                        int index27_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalSCL()) ) {s = 13;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index27_8);
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
    static final String dfa_54s = "\2\112\1\4\2\uffff\1\112\1\4\1\6\2\112\1\4\1\7\5\112\1\11\1\4\1\6\1\63\4\112\1\4\1\6\1\11\1\4\1\6\1\63\1\26\5\112\1\11\1\4\1\6\5\112\1\4\1\6\2\112";
    static final String[] dfa_55s = {
            "\1\3\5\uffff\1\1\10\uffff\2\3\2\uffff\1\3\1\uffff\2\3\1\uffff\1\3\3\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\11\1\uffff\1\14\1\16\1\15\1\10\1\1\10\uffff\1\3\1\uffff\1\12\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\1\6\1\7\1\13\17\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\1\3\10\uffff\1\2\1\22\1\23\20\uffff\7\4",
            "\1\24",
            "\1\14\1\16",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\11\1\uffff\1\14\1\16\1\15\1\10\1\1\10\uffff\1\3\1\uffff\1\12\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\1\6\1\7\1\13\17\uffff\7\4",
            "\1\11\1\uffff\1\14\1\16\1\15\1\10\1\1\10\uffff\1\3\1\uffff\1\12\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\2\uffff\1\13\17\uffff\7\4",
            "\1\26\4\uffff\1\25",
            "\1\27",
            "\1\30",
            "\1\33\33\uffff\1\31\1\32",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\1\34\1\35\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\1\22\1\23\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\22\uffff\7\4",
            "\1\36",
            "\1\37",
            "\1\41\3\uffff\1\42\1\40",
            "\1\43",
            "\1\44",
            "\1\33\33\uffff\1\31\1\32",
            "\1\33",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\1\46\1\47\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\1\34\1\35\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\22\uffff\7\4",
            "\1\51\3\uffff\1\52\1\50",
            "\1\53",
            "\1\54",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\1\55\1\56\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\1\46\1\47\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\57",
            "\1\60",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\1\55\1\56\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4"
    };
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final short[][] dfa_55 = unpackEncodedStringArray(dfa_55s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_34;
            this.max = dfa_54;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_55;
        }
        public String getDescription() {
            return "()* loopback of 1276:1: ( (lv_declarations_3_0= ruleDeclaration ) )*";
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "()* loopback of 1294:3: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )*";
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
                        if ( (synpred41_InternalSCL()) ) {s = 10;}

                        else if ( (synpred42_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSCL()) ) {s = 10;}

                        else if ( (synpred42_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_3 = input.LA(1);

                         
                        int index33_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSCL()) ) {s = 10;}

                        else if ( (synpred42_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index33_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA33_4 = input.LA(1);

                         
                        int index33_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index33_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA33_5 = input.LA(1);

                         
                        int index33_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index33_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA33_6 = input.LA(1);

                         
                        int index33_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index33_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA33_7 = input.LA(1);

                         
                        int index33_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index33_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA33_8 = input.LA(1);

                         
                        int index33_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index33_8);
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
    static final String dfa_56s = "\112\uffff";
    static final String dfa_57s = "\14\uffff\1\4\75\uffff";
    static final String dfa_58s = "\3\4\2\uffff\2\4\2\6\11\4\1\6\3\4\1\26\7\4\1\6\3\4\1\6\1\4\2\6\6\4\2\26\7\4\1\26\2\4\1\6\2\4\1\6\7\4\2\26\2\4\1\6\2\4";
    static final String dfa_59s = "\2\61\1\4\2\uffff\1\64\1\4\1\6\1\7\3\61\1\66\1\4\1\61\2\64\1\4\1\6\1\11\1\61\1\4\1\63\1\11\1\63\2\61\1\63\1\64\1\4\1\6\1\11\1\61\1\4\1\6\1\4\1\6\1\7\3\61\1\4\1\61\1\66\1\63\1\26\1\61\1\63\1\61\1\63\1\61\2\64\1\63\1\11\1\4\1\6\1\11\1\4\1\6\1\11\1\61\1\63\1\61\1\63\2\61\1\63\1\26\1\61\1\4\1\6\1\63\1\61";
    static final String dfa_60s = "\3\uffff\1\1\1\2\105\uffff";
    static final String dfa_61s = "\112\uffff}>";
    static final String[] dfa_62s = {
            "\2\4\4\uffff\1\1\24\uffff\1\3\14\uffff\1\4\4\uffff\1\2",
            "\2\4\4\uffff\1\1\24\uffff\1\3\14\uffff\1\4\4\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\14\1\4\1\12\1\11\1\13\1\16\1\1\12\uffff\1\15\11\uffff\1\3\14\uffff\1\4\4\uffff\1\2\1\6\1\7\1\10",
            "\1\17",
            "\1\20",
            "\1\12\1\11",
            "\2\4\4\uffff\1\1\24\uffff\1\3\14\uffff\1\4\4\uffff\1\2",
            "\2\4\4\uffff\1\1\24\uffff\1\3\14\uffff\1\4\4\uffff\1\2",
            "\2\4\4\uffff\1\1\24\uffff\1\3\14\uffff\1\4\4\uffff\1\2",
            "\2\4\4\uffff\1\24\12\uffff\1\4\11\uffff\1\3\7\uffff\1\23\1\4\1\uffff\1\4\1\uffff\1\4\4\uffff\1\25\1\21\1\22\1\uffff\2\4",
            "\1\26",
            "\2\4\4\uffff\1\1\24\uffff\1\3\7\uffff\1\27\4\uffff\1\4\4\uffff\1\2",
            "\1\14\1\4\1\12\1\11\1\13\1\16\1\1\12\uffff\1\15\11\uffff\1\3\14\uffff\1\4\4\uffff\1\2\1\6\1\7\1\10",
            "\1\14\1\4\1\12\1\11\1\13\1\16\1\1\12\uffff\1\15\11\uffff\1\3\14\uffff\1\4\4\uffff\1\2\2\uffff\1\10",
            "\1\30",
            "\1\31",
            "\1\33\4\uffff\1\32",
            "\2\4\4\uffff\1\24\24\uffff\1\3\14\uffff\1\4\4\uffff\1\25",
            "\1\34",
            "\1\37\33\uffff\1\35\1\36",
            "\1\33\4\uffff\1\40",
            "\2\4\4\uffff\1\24\24\uffff\1\3\7\uffff\1\23\4\uffff\1\4\4\uffff\1\25\1\21\1\22",
            "\2\4\4\uffff\1\24\24\uffff\1\3\7\uffff\1\23\4\uffff\1\4\4\uffff\1\25",
            "\2\4\4\uffff\1\24\24\uffff\1\3\7\uffff\1\23\4\uffff\1\4\4\uffff\1\25",
            "\2\4\4\uffff\1\24\24\uffff\1\3\7\uffff\1\23\4\uffff\1\4\4\uffff\1\25\1\41\1\42",
            "\1\53\1\4\1\47\1\46\1\50\1\52\1\24\12\uffff\1\51\11\uffff\1\3\14\uffff\1\4\4\uffff\1\25\1\43\1\44\1\45",
            "\1\54",
            "\1\55",
            "\1\57\3\uffff\1\60\1\56",
            "\2\4\4\uffff\1\1\24\uffff\1\3\7\uffff\1\27\4\uffff\1\4\4\uffff\1\2",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\47\1\46",
            "\2\4\4\uffff\1\24\24\uffff\1\3\14\uffff\1\4\4\uffff\1\25",
            "\2\4\4\uffff\1\24\24\uffff\1\3\14\uffff\1\4\4\uffff\1\25",
            "\2\4\4\uffff\1\24\24\uffff\1\3\14\uffff\1\4\4\uffff\1\25",
            "\1\65",
            "\2\4\4\uffff\1\24\24\uffff\1\3\7\uffff\1\23\4\uffff\1\4\4\uffff\1\25",
            "\2\4\4\uffff\1\24\12\uffff\1\4\11\uffff\1\3\7\uffff\1\23\1\4\3\uffff\1\4\4\uffff\1\25\1\21\1\22\1\uffff\2\4",
            "\1\37\33\uffff\1\35\1\36",
            "\1\37",
            "\2\4\4\uffff\1\1\24\uffff\1\3\7\uffff\1\66\4\uffff\1\4\4\uffff\1\2",
            "\2\4\4\uffff\1\24\24\uffff\1\3\7\uffff\1\71\4\uffff\1\4\4\uffff\1\25\1\67\1\70",
            "\2\4\4\uffff\1\24\24\uffff\1\3\7\uffff\1\71\4\uffff\1\4\4\uffff\1\25",
            "\2\4\4\uffff\1\24\24\uffff\1\3\7\uffff\1\23\4\uffff\1\4\4\uffff\1\25\1\41\1\42",
            "\2\4\4\uffff\1\24\24\uffff\1\3\7\uffff\1\23\4\uffff\1\4\4\uffff\1\25",
            "\1\53\1\4\1\47\1\46\1\50\1\52\1\24\12\uffff\1\51\11\uffff\1\3\14\uffff\1\4\4\uffff\1\25\1\43\1\44\1\45",
            "\1\53\1\4\1\47\1\46\1\50\1\52\1\24\12\uffff\1\51\11\uffff\1\3\14\uffff\1\4\4\uffff\1\25\2\uffff\1\45",
            "\1\74\33\uffff\1\72\1\73",
            "\1\76\3\uffff\1\77\1\75",
            "\1\100",
            "\1\101",
            "\1\76\3\uffff\1\77\1\102",
            "\1\103",
            "\1\104",
            "\1\57\3\uffff\1\60\1\105",
            "\2\4\4\uffff\1\1\24\uffff\1\3\7\uffff\1\66\4\uffff\1\4\4\uffff\1\2",
            "\2\4\4\uffff\1\24\24\uffff\1\3\7\uffff\1\71\4\uffff\1\4\4\uffff\1\25\1\106\1\107",
            "\2\4\4\uffff\1\24\24\uffff\1\3\7\uffff\1\71\4\uffff\1\4\4\uffff\1\25",
            "\2\4\4\uffff\1\24\24\uffff\1\3\7\uffff\1\71\4\uffff\1\4\4\uffff\1\25\1\67\1\70",
            "\2\4\4\uffff\1\24\24\uffff\1\3\7\uffff\1\71\4\uffff\1\4\4\uffff\1\25",
            "\2\4\4\uffff\1\24\24\uffff\1\3\7\uffff\1\71\4\uffff\1\4\4\uffff\1\25",
            "\1\74\33\uffff\1\72\1\73",
            "\1\74",
            "\2\4\4\uffff\1\24\24\uffff\1\3\7\uffff\1\71\4\uffff\1\4\4\uffff\1\25",
            "\1\110",
            "\1\111",
            "\2\4\4\uffff\1\24\24\uffff\1\3\7\uffff\1\71\4\uffff\1\4\4\uffff\1\25\1\106\1\107",
            "\2\4\4\uffff\1\24\24\uffff\1\3\7\uffff\1\71\4\uffff\1\4\4\uffff\1\25"
    };

    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final char[] dfa_58 = DFA.unpackEncodedStringToUnsignedChars(dfa_58s);
    static final char[] dfa_59 = DFA.unpackEncodedStringToUnsignedChars(dfa_59s);
    static final short[] dfa_60 = DFA.unpackEncodedString(dfa_60s);
    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final short[][] dfa_62 = unpackEncodedStringArray(dfa_62s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_56;
            this.eof = dfa_57;
            this.min = dfa_58;
            this.max = dfa_59;
            this.accept = dfa_60;
            this.special = dfa_61;
            this.transition = dfa_62;
        }
        public String getDescription() {
            return "1380:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )";
        }
    }
    static final String dfa_63s = "\1\4\13\0\2\uffff";
    static final String dfa_64s = "\1\101\13\0\2\uffff";
    static final String dfa_65s = "\14\uffff\1\1\1\2";
    static final String dfa_66s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_67s = {
            "\1\11\1\13\1\2\1\3\1\6\1\4\40\uffff\1\5\1\uffff\1\12\2\uffff\1\14\4\uffff\1\1\6\uffff\1\7\5\uffff\1\10",
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
    static final char[] dfa_63 = DFA.unpackEncodedStringToUnsignedChars(dfa_63s);
    static final char[] dfa_64 = DFA.unpackEncodedStringToUnsignedChars(dfa_64s);
    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final short[][] dfa_67 = unpackEncodedStringArray(dfa_67s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_47;
            this.eof = dfa_47;
            this.min = dfa_63;
            this.max = dfa_64;
            this.accept = dfa_65;
            this.special = dfa_66;
            this.transition = dfa_67;
        }
        public String getDescription() {
            return "2272:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
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
                        if ( (synpred72_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_2 = input.LA(1);

                         
                        int index59_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_3 = input.LA(1);

                         
                        int index59_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA59_4 = input.LA(1);

                         
                        int index59_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA59_5 = input.LA(1);

                         
                        int index59_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA59_6 = input.LA(1);

                         
                        int index59_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA59_7 = input.LA(1);

                         
                        int index59_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA59_8 = input.LA(1);

                         
                        int index59_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA59_9 = input.LA(1);

                         
                        int index59_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA59_10 = input.LA(1);

                         
                        int index59_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA59_11 = input.LA(1);

                         
                        int index59_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_11);
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
    static final String dfa_68s = "\1\4\4\uffff\7\0\1\uffff";
    static final String dfa_69s = "\1\101\4\uffff\7\0\1\uffff";
    static final String dfa_70s = "\1\uffff\1\1\12\uffff\1\2";
    static final String dfa_71s = "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] dfa_72s = {
            "\1\11\1\13\2\1\1\6\1\1\40\uffff\1\5\1\uffff\1\12\2\uffff\1\14\4\uffff\1\1\6\uffff\1\7\5\uffff\1\10",
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
    static final char[] dfa_68 = DFA.unpackEncodedStringToUnsignedChars(dfa_68s);
    static final char[] dfa_69 = DFA.unpackEncodedStringToUnsignedChars(dfa_69s);
    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final short[][] dfa_72 = unpackEncodedStringArray(dfa_72s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_37;
            this.eof = dfa_37;
            this.min = dfa_68;
            this.max = dfa_69;
            this.accept = dfa_70;
            this.special = dfa_71;
            this.transition = dfa_72;
        }
        public String getDescription() {
            return "2741:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_5 = input.LA(1);

                         
                        int index69_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index69_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_6 = input.LA(1);

                         
                        int index69_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index69_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_7 = input.LA(1);

                         
                        int index69_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index69_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA69_8 = input.LA(1);

                         
                        int index69_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index69_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA69_9 = input.LA(1);

                         
                        int index69_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index69_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA69_10 = input.LA(1);

                         
                        int index69_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index69_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA69_11 = input.LA(1);

                         
                        int index69_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index69_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_73s = "\1\4\3\uffff\1\0\7\uffff";
    static final String dfa_74s = "\1\101\3\uffff\1\0\7\uffff";
    static final String dfa_75s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\5\uffff\1\4";
    static final String dfa_76s = "\4\uffff\1\0\7\uffff}>";
    static final String[] dfa_77s = {
            "\2\5\1\1\1\2\1\5\1\3\40\uffff\1\4\1\uffff\1\5\16\uffff\1\5\5\uffff\1\5",
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
    static final char[] dfa_73 = DFA.unpackEncodedStringToUnsignedChars(dfa_73s);
    static final char[] dfa_74 = DFA.unpackEncodedStringToUnsignedChars(dfa_74s);
    static final short[] dfa_75 = DFA.unpackEncodedString(dfa_75s);
    static final short[] dfa_76 = DFA.unpackEncodedString(dfa_76s);
    static final short[][] dfa_77 = unpackEncodedStringArray(dfa_77s);

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_73;
            this.max = dfa_74;
            this.accept = dfa_75;
            this.special = dfa_76;
            this.transition = dfa_77;
        }
        public String getDescription() {
            return "3461:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
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
                        if ( (synpred102_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index83_4);
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
    static final String dfa_78s = "\20\uffff";
    static final String dfa_79s = "\3\uffff\1\13\6\uffff\1\11\3\uffff\2\13";
    static final String dfa_80s = "\1\12\1\uffff\3\4\2\6\3\uffff\1\4\3\uffff\2\4";
    static final String dfa_81s = "\1\61\1\uffff\1\4\1\112\1\4\1\6\1\7\3\uffff\1\112\3\uffff\2\112";
    static final String dfa_82s = "\1\uffff\1\1\5\uffff\1\5\1\4\1\3\1\uffff\1\7\1\6\1\2\2\uffff";
    static final String dfa_83s = "\20\uffff}>";
    static final String[] dfa_84s = {
            "\1\1\46\uffff\1\2",
            "",
            "\1\3",
            "\1\12\1\13\1\7\1\14\1\15\1\11\1\13\5\uffff\1\13\2\uffff\1\13\1\uffff\1\10\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\3\uffff\10\13\5\uffff\1\13\4\uffff\1\13\1\4\1\5\1\6\17\uffff\7\13",
            "\1\16",
            "\1\17",
            "\1\7\1\14",
            "",
            "",
            "",
            "\2\11\4\uffff\1\11\5\uffff\1\11\1\13\1\uffff\1\11\1\uffff\1\13\1\uffff\1\11\1\uffff\1\11\1\uffff\1\11\3\uffff\11\11\1\13\3\uffff\1\11\4\uffff\3\11\1\uffff\2\13\15\uffff\7\11",
            "",
            "",
            "",
            "\1\12\1\13\1\7\1\14\1\15\1\11\1\13\5\uffff\1\13\2\uffff\1\13\1\uffff\1\10\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\3\uffff\10\13\5\uffff\1\13\4\uffff\1\13\1\4\1\5\1\6\17\uffff\7\13",
            "\1\12\1\13\1\7\1\14\1\15\1\11\1\13\5\uffff\1\13\2\uffff\1\13\1\uffff\1\10\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\3\uffff\10\13\5\uffff\1\13\4\uffff\1\13\2\uffff\1\6\17\uffff\7\13"
    };

    static final short[] dfa_78 = DFA.unpackEncodedString(dfa_78s);
    static final short[] dfa_79 = DFA.unpackEncodedString(dfa_79s);
    static final char[] dfa_80 = DFA.unpackEncodedStringToUnsignedChars(dfa_80s);
    static final char[] dfa_81 = DFA.unpackEncodedStringToUnsignedChars(dfa_81s);
    static final short[] dfa_82 = DFA.unpackEncodedString(dfa_82s);
    static final short[] dfa_83 = DFA.unpackEncodedString(dfa_83s);
    static final short[][] dfa_84 = unpackEncodedStringArray(dfa_84s);

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = dfa_78;
            this.eof = dfa_79;
            this.min = dfa_80;
            this.max = dfa_81;
            this.accept = dfa_82;
            this.special = dfa_83;
            this.transition = dfa_84;
        }
        public String getDescription() {
            return "4090:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )";
        }
    }
    static final String dfa_85s = "\17\uffff";
    static final String dfa_86s = "\3\uffff\1\6\11\uffff\2\6";
    static final String dfa_87s = "\1\12\1\uffff\3\4\1\6\1\uffff\1\6\5\uffff\2\4";
    static final String dfa_88s = "\1\61\1\uffff\1\4\1\64\1\4\1\6\1\uffff\1\7\5\uffff\2\64";
    static final String dfa_89s = "\1\uffff\1\1\4\uffff\1\7\1\uffff\1\6\1\5\1\4\1\3\1\2\2\uffff";
    static final String dfa_90s = "\17\uffff}>";
    static final String[] dfa_91s = {
            "\1\1\46\uffff\1\2",
            "",
            "\1\3",
            "\1\6\1\uffff\1\11\1\10\1\12\1\14\1\6\12\uffff\1\13\33\uffff\1\6\1\4\1\5\1\7",
            "\1\15",
            "\1\16",
            "",
            "\1\11\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\6\1\uffff\1\11\1\10\1\12\1\14\1\6\12\uffff\1\13\33\uffff\1\6\1\4\1\5\1\7",
            "\1\6\1\uffff\1\11\1\10\1\12\1\14\1\6\12\uffff\1\13\33\uffff\1\6\2\uffff\1\7"
    };

    static final short[] dfa_85 = DFA.unpackEncodedString(dfa_85s);
    static final short[] dfa_86 = DFA.unpackEncodedString(dfa_86s);
    static final char[] dfa_87 = DFA.unpackEncodedStringToUnsignedChars(dfa_87s);
    static final char[] dfa_88 = DFA.unpackEncodedStringToUnsignedChars(dfa_88s);
    static final short[] dfa_89 = DFA.unpackEncodedString(dfa_89s);
    static final short[] dfa_90 = DFA.unpackEncodedString(dfa_90s);
    static final short[][] dfa_91 = unpackEncodedStringArray(dfa_91s);

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = dfa_85;
            this.eof = dfa_86;
            this.min = dfa_87;
            this.max = dfa_88;
            this.accept = dfa_89;
            this.special = dfa_90;
            this.transition = dfa_91;
        }
        public String getDescription() {
            return "4203:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )";
        }
    }
    static final String dfa_92s = "\3\4\2\uffff\2\4\1\6\4\4\1\6\6\4\1\6\1\26\5\4\1\6\2\4\1\6\2\26\7\4\1\6\6\4\1\6\2\4";
    static final String dfa_93s = "\2\112\1\4\2\uffff\1\112\1\4\1\6\3\112\1\4\1\7\4\112\1\11\1\4\1\6\1\63\4\112\1\4\1\6\1\11\1\4\1\6\1\63\1\26\5\112\1\11\1\4\1\6\5\112\1\4\1\6\2\112";
    static final String[] dfa_94s = {
            "\1\3\5\uffff\1\1\10\uffff\2\3\2\uffff\1\3\1\uffff\2\3\1\uffff\1\3\3\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\11\1\uffff\1\15\1\16\1\12\1\10\1\1\10\uffff\1\3\1\uffff\1\13\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\1\6\1\7\1\14\17\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\1\3\10\uffff\1\2\1\22\1\23\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\24",
            "\1\15\1\16",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\22\uffff\7\4",
            "\1\11\1\uffff\1\15\1\16\1\12\1\10\1\1\10\uffff\1\3\1\uffff\1\13\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\1\6\1\7\1\14\17\uffff\7\4",
            "\1\11\1\uffff\1\15\1\16\1\12\1\10\1\1\10\uffff\1\3\1\uffff\1\13\1\uffff\1\3\1\uffff\1\3\6\uffff\7\4\12\uffff\1\2\2\uffff\1\14\17\uffff\7\4",
            "\1\26\4\uffff\1\25",
            "\1\27",
            "\1\30",
            "\1\33\33\uffff\1\31\1\32",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\1\34\1\35\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\1\22\1\23\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\22\uffff\7\4",
            "\1\36",
            "\1\37",
            "\1\41\3\uffff\1\42\1\40",
            "\1\43",
            "\1\44",
            "\1\33\33\uffff\1\31\1\32",
            "\1\33",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\1\46\1\47\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\1\34\1\35\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\21\11\uffff\1\2\22\uffff\7\4",
            "\1\51\3\uffff\1\52\1\50",
            "\1\53",
            "\1\54",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\1\55\1\56\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\1\46\1\47\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4",
            "\1\57",
            "\1\60",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\1\55\1\56\20\uffff\7\4",
            "\1\3\5\uffff\1\1\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\6\uffff\7\4\1\45\11\uffff\1\2\22\uffff\7\4"
    };
    static final char[] dfa_92 = DFA.unpackEncodedStringToUnsignedChars(dfa_92s);
    static final char[] dfa_93 = DFA.unpackEncodedStringToUnsignedChars(dfa_93s);
    static final short[][] dfa_94 = unpackEncodedStringArray(dfa_94s);

    class DFA108 extends DFA {

        public DFA108(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 108;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_92;
            this.max = dfa_93;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_94;
        }
        public String getDescription() {
            return "()* loopback of 1014:1: ( (lv_declarations_3_0= ruleDeclaration ) )*";
        }
    }

    class DFA109 extends DFA {

        public DFA109(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 109;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "()* loopback of 1032:3: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleMetaStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA109_1 = input.LA(1);

                         
                        int index109_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSCL()) ) {s = 10;}

                        else if ( (synpred32_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index109_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA109_2 = input.LA(1);

                         
                        int index109_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSCL()) ) {s = 10;}

                        else if ( (synpred32_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index109_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA109_3 = input.LA(1);

                         
                        int index109_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSCL()) ) {s = 10;}

                        else if ( (synpred32_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index109_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA109_4 = input.LA(1);

                         
                        int index109_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index109_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA109_5 = input.LA(1);

                         
                        int index109_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index109_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA109_6 = input.LA(1);

                         
                        int index109_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index109_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA109_7 = input.LA(1);

                         
                        int index109_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index109_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA109_8 = input.LA(1);

                         
                        int index109_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index109_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 109, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0002000000010400L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0002007F129B0412L,0x00000000000007F0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0002007F12990412L,0x00000000000007F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0002000012990412L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0002000000090400L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0002000000010410L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x08109400000003F0L,0x0000000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0002000000810400L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0002007F16990410L,0x00000000000007F0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0002000016990410L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0002000008010402L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002000008010400L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002000002010400L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002000072990410L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0002000080010400L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002007F00010400L,0x00000000000007F0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000007E00000000L,0x00000000000007F0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000007C00000000L,0x00000000000007F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000007800000000L,0x00000000000007F0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000007000000000L,0x00000000000007F0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000006000000000L,0x00000000000007F0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L,0x00000000000007F0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000030000200002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x7001000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0060000000200000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000010420L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002100000010400L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000640000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x08119400000003F0L,0x0000000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0780500000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x08101400000003F0L,0x0000000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0800000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0010000000000080L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000080L});

}