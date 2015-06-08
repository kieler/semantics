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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "';'", "'}'", "':'", "'['", "']'", "'='", "'if'", "'then'", "'else'", "'end'", "'goto'", "'fork'", "'par'", "'join'", "'pause'", "'const'", "'input'", "'output'", "'static'", "'signal'", "','", "'combine'", "'('", "')'", "'<'", "'()'", "'>'", "'&'", "'@'", "'.'", "'-'", "'=='", "'<='", "'>='", "'!='", "'pre'", "'|'", "'!'", "'+'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'", "'++'", "'--'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'string'", "'host'", "'none'", "'max'", "'min'"
    };
    public static final int T__68=68;
    public static final int RULE_BOOLEAN=8;
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
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_HOSTCODE=5;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=9;
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
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalSCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[253+1];
             
             
        }
        

    public String[] getTokenNames() { return InternalSCLParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g"; }



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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:75:1: entryRuleSCLProgram returns [EObject current=null] : iv_ruleSCLProgram= ruleSCLProgram EOF ;
    public final EObject entryRuleSCLProgram() throws RecognitionException {
        EObject current = null;
        int entryRuleSCLProgram_StartIndex = input.index();
        EObject iv_ruleSCLProgram = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:76:2: (iv_ruleSCLProgram= ruleSCLProgram EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:77:2: iv_ruleSCLProgram= ruleSCLProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSCLProgramRule()); 
            }
            pushFollow(FOLLOW_ruleSCLProgram_in_entryRuleSCLProgram88);
            iv_ruleSCLProgram=ruleSCLProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSCLProgram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSCLProgram98); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:84:1: ruleSCLProgram returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '{' ( ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )? ) otherlv_10= '}' ) ;
    public final EObject ruleSCLProgram() throws RecognitionException {
        EObject current = null;
        int ruleSCLProgram_StartIndex = input.index();
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_declarations_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_statements_7_0 = null;

        EObject lv_statements_8_0 = null;

        EObject lv_statements_9_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:87:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '{' ( ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )? ) otherlv_10= '}' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:88:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '{' ( ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )? ) otherlv_10= '}' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:88:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '{' ( ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )? ) otherlv_10= '}' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:88:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '{' ( ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )? ) otherlv_10= '}'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:88:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMENT_ANNOTATION||LA1_0==46) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:89:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:89:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:90:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCLProgramAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleSCLProgram144);
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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleSCLProgram157); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSCLProgramAccess().getModuleKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:110:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:111:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:111:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:112:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSCLProgram174); if (state.failed) return current;
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
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:128:2: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMENT_ANNOTATION||(LA2_0>=33 && LA2_0<=37)||LA2_0==46||(LA2_0>=65 && LA2_0<=71)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:129:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:129:1: (lv_declarations_3_0= ruleDeclaration )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:130:3: lv_declarations_3_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCLProgramAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleSCLProgram200);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSCLProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_3_0, 
            	              		"Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSCLProgram213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSCLProgramAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:1: ( ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:2: ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:2: ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )*
            loop3:
            do {
                int alt3=3;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:3: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:3: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:4: ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';'
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:4: ( (lv_statements_5_0= ruleInstructionStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:151:1: (lv_statements_5_0= ruleInstructionStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:151:1: (lv_statements_5_0= ruleInstructionStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:152:3: lv_statements_5_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCLProgramAccess().getStatementsInstructionStatementParserRuleCall_5_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleSCLProgram237);
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
            	              		"InstructionStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleSCLProgram249); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getSCLProgramAccess().getSemicolonKeyword_5_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:173:6: ( (lv_statements_7_0= ruleEmptyStatement ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:173:6: ( (lv_statements_7_0= ruleEmptyStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:174:1: (lv_statements_7_0= ruleEmptyStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:174:1: (lv_statements_7_0= ruleEmptyStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:175:3: lv_statements_7_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCLProgramAccess().getStatementsEmptyStatementParserRuleCall_5_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleSCLProgram277);
            	    lv_statements_7_0=ruleEmptyStatement();

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
            	              		"EmptyStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:191:4: ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||LA5_0==RULE_COMMENT_ANNOTATION||LA5_0==17||LA5_0==24||(LA5_0>=28 && LA5_0<=29)||LA5_0==32||LA5_0==46) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:191:5: ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )*
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:191:5: ( (lv_statements_8_0= ruleInstructionStatement ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:192:1: (lv_statements_8_0= ruleInstructionStatement )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:192:1: (lv_statements_8_0= ruleInstructionStatement )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:193:3: lv_statements_8_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSCLProgramAccess().getStatementsInstructionStatementParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleSCLProgram301);
                    lv_statements_8_0=ruleInstructionStatement();

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
                              		"InstructionStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:209:2: ( (lv_statements_9_0= ruleEmptyStatement ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID||LA4_0==RULE_COMMENT_ANNOTATION||LA4_0==46) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:210:1: (lv_statements_9_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:210:1: (lv_statements_9_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:211:3: lv_statements_9_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSCLProgramAccess().getStatementsEmptyStatementParserRuleCall_5_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleSCLProgram322);
                    	    lv_statements_9_0=ruleEmptyStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSCLProgramRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_9_0, 
                    	              		"EmptyStatement");
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


            }

            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleSCLProgram338); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getSCLProgramAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

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


    // $ANTLR start "entryRuleEmptyStatement"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:241:1: entryRuleEmptyStatement returns [EObject current=null] : iv_ruleEmptyStatement= ruleEmptyStatement EOF ;
    public final EObject entryRuleEmptyStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleEmptyStatement_StartIndex = input.index();
        EObject iv_ruleEmptyStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:242:2: (iv_ruleEmptyStatement= ruleEmptyStatement EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:243:2: iv_ruleEmptyStatement= ruleEmptyStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyStatementRule()); 
            }
            pushFollow(FOLLOW_ruleEmptyStatement_in_entryRuleEmptyStatement376);
            iv_ruleEmptyStatement=ruleEmptyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyStatement386); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, entryRuleEmptyStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEmptyStatement"


    // $ANTLR start "ruleEmptyStatement"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:250:1: ruleEmptyStatement returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) ) ;
    public final EObject ruleEmptyStatement() throws RecognitionException {
        EObject current = null;
        int ruleEmptyStatement_StartIndex = input.index();
        Token lv_label_1_0=null;
        Token otherlv_2=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:253:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:254:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:254:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:254:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:254:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMENT_ANNOTATION||LA6_0==46) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:255:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:255:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:256:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmptyStatementAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleEmptyStatement432);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEmptyStatementRule());
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
            	    break loop6;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:272:3: ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:272:4: ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:272:4: ( (lv_label_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:273:1: (lv_label_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:273:1: (lv_label_1_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:274:3: lv_label_1_0= RULE_ID
            {
            lv_label_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmptyStatement451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_1_0, grammarAccess.getEmptyStatementAccess().getLabelIDTerminalRuleCall_1_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEmptyStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleEmptyStatement468); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEmptyStatementAccess().getColonKeyword_1_1());
                  
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
            if ( state.backtracking>0 ) { memoize(input, 4, ruleEmptyStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEmptyStatement"


    // $ANTLR start "entryRuleInstructionStatement"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:302:1: entryRuleInstructionStatement returns [EObject current=null] : iv_ruleInstructionStatement= ruleInstructionStatement EOF ;
    public final EObject entryRuleInstructionStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleInstructionStatement_StartIndex = input.index();
        EObject iv_ruleInstructionStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:303:2: (iv_ruleInstructionStatement= ruleInstructionStatement EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:304:2: iv_ruleInstructionStatement= ruleInstructionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionStatementRule()); 
            }
            pushFollow(FOLLOW_ruleInstructionStatement_in_entryRuleInstructionStatement505);
            iv_ruleInstructionStatement=ruleInstructionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstructionStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstructionStatement515); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:311:1: ruleInstructionStatement returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) ) ) ) ;
    public final EObject ruleInstructionStatement() throws RecognitionException {
        EObject current = null;
        int ruleInstructionStatement_StartIndex = input.index();
        EObject lv_annotations_0_0 = null;

        EObject lv_instruction_1_1 = null;

        EObject lv_instruction_1_2 = null;

        EObject lv_instruction_1_3 = null;

        EObject lv_instruction_1_4 = null;

        EObject lv_instruction_1_5 = null;

        EObject lv_instruction_1_6 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:314:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:315:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:315:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:315:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:315:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMENT_ANNOTATION||LA7_0==46) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:316:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:316:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:317:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleInstructionStatement561);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
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
            	    break loop7;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:333:3: ( ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:334:1: ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:334:1: ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:335:1: (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:335:1: (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 28:
                {
                alt8=3;
                }
                break;
            case 29:
                {
                alt8=4;
                }
                break;
            case 32:
                {
                alt8=5;
                }
                break;
            case 17:
                {
                alt8=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:336:3: lv_instruction_1_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionAssignmentParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleInstructionStatement585);
                    lv_instruction_1_1=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_1_1, 
                              		"Assignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:351:8: lv_instruction_1_2= ruleConditional
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionConditionalParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditional_in_ruleInstructionStatement604);
                    lv_instruction_1_2=ruleConditional();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_1_2, 
                              		"Conditional");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:366:8: lv_instruction_1_3= ruleGoto
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionGotoParserRuleCall_1_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGoto_in_ruleInstructionStatement623);
                    lv_instruction_1_3=ruleGoto();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_1_3, 
                              		"Goto");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:381:8: lv_instruction_1_4= ruleParallel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionParallelParserRuleCall_1_0_3()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParallel_in_ruleInstructionStatement642);
                    lv_instruction_1_4=ruleParallel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_1_4, 
                              		"Parallel");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:396:8: lv_instruction_1_5= rulePause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionPauseParserRuleCall_1_0_4()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePause_in_ruleInstructionStatement661);
                    lv_instruction_1_5=rulePause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_1_5, 
                              		"Pause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:411:8: lv_instruction_1_6= ruleStatementScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionStatementScopeParserRuleCall_1_0_5()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementScope_in_ruleInstructionStatement680);
                    lv_instruction_1_6=ruleStatementScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_1_6, 
                              		"StatementScope");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

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
            if ( state.backtracking>0 ) { memoize(input, 6, ruleInstructionStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleInstructionStatement"


    // $ANTLR start "entryRuleAssignment"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:439:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;
        int entryRuleAssignment_StartIndex = input.index();
        EObject iv_ruleAssignment = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:440:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:441:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment721);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment731); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, entryRuleAssignment_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:448:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;
        int ruleAssignment_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_indices_2_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:451:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:452:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:452:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:452:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:452:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:453:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:453:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:454:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment780); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:468:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:468:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAssignment793); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:472:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:473:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:473:1: (lv_indices_2_0= ruleExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:474:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleAssignment814);
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

            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleAssignment826); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleAssignment840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:498:1: ( (lv_expression_5_0= ruleExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:499:1: (lv_expression_5_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:499:1: (lv_expression_5_0= ruleExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:500:3: lv_expression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment861);
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
            if ( state.backtracking>0 ) { memoize(input, 8, ruleAssignment_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleConditional"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:524:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;
        int entryRuleConditional_StartIndex = input.index();
        EObject iv_ruleConditional = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:525:2: (iv_ruleConditional= ruleConditional EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:526:2: iv_ruleConditional= ruleConditional EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalRule()); 
            }
            pushFollow(FOLLOW_ruleConditional_in_entryRuleConditional897);
            iv_ruleConditional=ruleConditional();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditional; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditional907); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, entryRuleConditional_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:533:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end' ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;
        int ruleConditional_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        EObject lv_expression_1_0 = null;

        EObject lv_declarations_3_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_statements_6_0 = null;

        EObject lv_statements_7_0 = null;

        EObject lv_statements_8_0 = null;

        EObject lv_declarations_10_0 = null;

        EObject lv_elseStatements_11_0 = null;

        EObject lv_elseStatements_13_0 = null;

        EObject lv_elseStatements_14_0 = null;

        EObject lv_elseStatements_15_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:536:28: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:537:1: (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:537:1: (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:537:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleConditional944); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getIfKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:541:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:542:1: (lv_expression_1_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:542:1: (lv_expression_1_0= ruleExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:543:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleConditional965);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionalRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleConditional977); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getThenKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:563:1: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:564:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:564:1: (lv_declarations_3_0= ruleDeclaration )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:565:3: lv_declarations_3_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleConditional998);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_3_0, 
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:581:3: ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:581:4: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:581:4: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )*
            loop11:
            do {
                int alt11=3;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:581:5: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:581:5: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:581:6: ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';'
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:581:6: ( (lv_statements_4_0= ruleInstructionStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:582:1: (lv_statements_4_0= ruleInstructionStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:582:1: (lv_statements_4_0= ruleInstructionStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:583:3: lv_statements_4_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsInstructionStatementParserRuleCall_4_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleConditional1023);
            	    lv_statements_4_0=ruleInstructionStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_4_0, 
            	              		"InstructionStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleConditional1035); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getConditionalAccess().getSemicolonKeyword_4_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:604:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:604:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:605:1: (lv_statements_6_0= ruleEmptyStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:605:1: (lv_statements_6_0= ruleEmptyStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:606:3: lv_statements_6_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsEmptyStatementParserRuleCall_4_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleConditional1063);
            	    lv_statements_6_0=ruleEmptyStatement();

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
            	              		"EmptyStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:622:4: ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==RULE_COMMENT_ANNOTATION||LA13_0==17||LA13_0==24||(LA13_0>=28 && LA13_0<=29)||LA13_0==32||LA13_0==46) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:622:5: ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )*
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:622:5: ( (lv_statements_7_0= ruleInstructionStatement ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:623:1: (lv_statements_7_0= ruleInstructionStatement )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:623:1: (lv_statements_7_0= ruleInstructionStatement )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:624:3: lv_statements_7_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsInstructionStatementParserRuleCall_4_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleConditional1087);
                    lv_statements_7_0=ruleInstructionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_7_0, 
                              		"InstructionStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:640:2: ( (lv_statements_8_0= ruleEmptyStatement ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID||LA12_0==RULE_COMMENT_ANNOTATION||LA12_0==46) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:641:1: (lv_statements_8_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:641:1: (lv_statements_8_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:642:3: lv_statements_8_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsEmptyStatementParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleConditional1108);
                    	    lv_statements_8_0=ruleEmptyStatement();

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
                    	              		"EmptyStatement");
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


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:658:6: (otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:658:8: otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? )
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleConditional1125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getConditionalAccess().getElseKeyword_5_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:662:1: ( (lv_declarations_10_0= ruleDeclaration ) )*
                    loop14:
                    do {
                        int alt14=2;
                        alt14 = dfa14.predict(input);
                        switch (alt14) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:663:1: (lv_declarations_10_0= ruleDeclaration )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:663:1: (lv_declarations_10_0= ruleDeclaration )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:664:3: lv_declarations_10_0= ruleDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getDeclarationsDeclarationParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDeclaration_in_ruleConditional1146);
                    	    lv_declarations_10_0=ruleDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declarations",
                    	              		lv_declarations_10_0, 
                    	              		"Declaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:680:3: ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:680:4: ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )?
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:680:4: ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        alt15 = dfa15.predict(input);
                        switch (alt15) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:680:5: ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:680:5: ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:680:6: ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';'
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:680:6: ( (lv_elseStatements_11_0= ruleInstructionStatement ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:681:1: (lv_elseStatements_11_0= ruleInstructionStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:681:1: (lv_elseStatements_11_0= ruleInstructionStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:682:3: lv_elseStatements_11_0= ruleInstructionStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsInstructionStatementParserRuleCall_5_2_0_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleConditional1171);
                    	    lv_elseStatements_11_0=ruleInstructionStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elseStatements",
                    	              		lv_elseStatements_11_0, 
                    	              		"InstructionStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleConditional1183); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_12, grammarAccess.getConditionalAccess().getSemicolonKeyword_5_2_0_0_1());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:703:6: ( (lv_elseStatements_13_0= ruleEmptyStatement ) )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:703:6: ( (lv_elseStatements_13_0= ruleEmptyStatement ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:704:1: (lv_elseStatements_13_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:704:1: (lv_elseStatements_13_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:705:3: lv_elseStatements_13_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsEmptyStatementParserRuleCall_5_2_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleConditional1211);
                    	    lv_elseStatements_13_0=ruleEmptyStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elseStatements",
                    	              		lv_elseStatements_13_0, 
                    	              		"EmptyStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:721:4: ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID||LA17_0==RULE_COMMENT_ANNOTATION||LA17_0==17||LA17_0==24||(LA17_0>=28 && LA17_0<=29)||LA17_0==32||LA17_0==46) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:721:5: ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )*
                            {
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:721:5: ( (lv_elseStatements_14_0= ruleInstructionStatement ) )
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:722:1: (lv_elseStatements_14_0= ruleInstructionStatement )
                            {
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:722:1: (lv_elseStatements_14_0= ruleInstructionStatement )
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:723:3: lv_elseStatements_14_0= ruleInstructionStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsInstructionStatementParserRuleCall_5_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleInstructionStatement_in_ruleConditional1235);
                            lv_elseStatements_14_0=ruleInstructionStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"elseStatements",
                                      		lv_elseStatements_14_0, 
                                      		"InstructionStatement");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:739:2: ( (lv_elseStatements_15_0= ruleEmptyStatement ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==RULE_ID||LA16_0==RULE_COMMENT_ANNOTATION||LA16_0==46) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:740:1: (lv_elseStatements_15_0= ruleEmptyStatement )
                            	    {
                            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:740:1: (lv_elseStatements_15_0= ruleEmptyStatement )
                            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:741:3: lv_elseStatements_15_0= ruleEmptyStatement
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsEmptyStatementParserRuleCall_5_2_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleConditional1256);
                            	    lv_elseStatements_15_0=ruleEmptyStatement();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"elseStatements",
                            	              		lv_elseStatements_15_0, 
                            	              		"EmptyStatement");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
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

            }

            otherlv_16=(Token)match(input,27,FOLLOW_27_in_ruleConditional1274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getConditionalAccess().getEndKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, ruleConditional_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleGoto"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:769:1: entryRuleGoto returns [EObject current=null] : iv_ruleGoto= ruleGoto EOF ;
    public final EObject entryRuleGoto() throws RecognitionException {
        EObject current = null;
        int entryRuleGoto_StartIndex = input.index();
        EObject iv_ruleGoto = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:770:2: (iv_ruleGoto= ruleGoto EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:771:2: iv_ruleGoto= ruleGoto EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGotoRule()); 
            }
            pushFollow(FOLLOW_ruleGoto_in_entryRuleGoto1310);
            iv_ruleGoto=ruleGoto();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoto; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoto1320); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, entryRuleGoto_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleGoto"


    // $ANTLR start "ruleGoto"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:778:1: ruleGoto returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGoto() throws RecognitionException {
        EObject current = null;
        int ruleGoto_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_targetLabel_1_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:781:28: ( (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:782:1: (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:782:1: (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:782:3: otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleGoto1357); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGotoAccess().getGotoKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:786:1: ( (lv_targetLabel_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:787:1: (lv_targetLabel_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:787:1: (lv_targetLabel_1_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:788:3: lv_targetLabel_1_0= RULE_ID
            {
            lv_targetLabel_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoto1374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_targetLabel_1_0, grammarAccess.getGotoAccess().getTargetLabelIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGotoRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"targetLabel",
                      		lv_targetLabel_1_0, 
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
            if ( state.backtracking>0 ) { memoize(input, 12, ruleGoto_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleGoto"


    // $ANTLR start "entryRuleThread"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:814:1: entryRuleThread returns [EObject current=null] : iv_ruleThread= ruleThread EOF ;
    public final EObject entryRuleThread() throws RecognitionException {
        EObject current = null;
        int entryRuleThread_StartIndex = input.index();
        EObject iv_ruleThread = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:815:2: (iv_ruleThread= ruleThread EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:816:2: iv_ruleThread= ruleThread EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThreadRule()); 
            }
            pushFollow(FOLLOW_ruleThread_in_entryRuleThread1417);
            iv_ruleThread=ruleThread();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThread; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleThread1427); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, entryRuleThread_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleThread"


    // $ANTLR start "ruleThread"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:823:1: ruleThread returns [EObject current=null] : ( () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? ) ) ;
    public final EObject ruleThread() throws RecognitionException {
        EObject current = null;
        int ruleThread_StartIndex = input.index();
        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_statements_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:826:28: ( ( () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:827:1: ( () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:827:1: ( () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:827:2: () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:827:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:828:2: 
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:836:2: ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:836:3: ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:836:3: ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )*
            loop19:
            do {
                int alt19=3;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:836:4: ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:836:4: ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:836:5: ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';'
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:836:5: ( (lv_statements_1_0= ruleInstructionStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:837:1: (lv_statements_1_0= ruleInstructionStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:837:1: (lv_statements_1_0= ruleInstructionStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:838:3: lv_statements_1_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_1_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleThread1488);
            	    lv_statements_1_0=ruleInstructionStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getThreadRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_1_0, 
            	              		"InstructionStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleThread1500); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getThreadAccess().getSemicolonKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:859:6: ( (lv_statements_3_0= ruleEmptyStatement ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:859:6: ( (lv_statements_3_0= ruleEmptyStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:860:1: (lv_statements_3_0= ruleEmptyStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:860:1: (lv_statements_3_0= ruleEmptyStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:861:3: lv_statements_3_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsEmptyStatementParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleThread1528);
            	    lv_statements_3_0=ruleEmptyStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getThreadRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_3_0, 
            	              		"EmptyStatement");
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:877:4: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||LA21_0==RULE_COMMENT_ANNOTATION||LA21_0==17||LA21_0==24||(LA21_0>=28 && LA21_0<=29)||LA21_0==32||LA21_0==46) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:877:5: ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )*
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:877:5: ( (lv_statements_4_0= ruleInstructionStatement ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:878:1: (lv_statements_4_0= ruleInstructionStatement )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:878:1: (lv_statements_4_0= ruleInstructionStatement )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:879:3: lv_statements_4_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleThread1552);
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
                              		"InstructionStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:895:2: ( (lv_statements_5_0= ruleEmptyStatement ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID||LA20_0==RULE_COMMENT_ANNOTATION||LA20_0==46) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:896:1: (lv_statements_5_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:896:1: (lv_statements_5_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:897:3: lv_statements_5_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsEmptyStatementParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleThread1573);
                    	    lv_statements_5_0=ruleEmptyStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getThreadRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_5_0, 
                    	              		"EmptyStatement");
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, ruleThread_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleThread"


    // $ANTLR start "entryRuleParallel"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:921:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;
        int entryRuleParallel_StartIndex = input.index();
        EObject iv_ruleParallel = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:922:2: (iv_ruleParallel= ruleParallel EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:923:2: iv_ruleParallel= ruleParallel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParallelRule()); 
            }
            pushFollow(FOLLOW_ruleParallel_in_entryRuleParallel1613);
            iv_ruleParallel=ruleParallel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParallel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallel1623); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, entryRuleParallel_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleParallel"


    // $ANTLR start "ruleParallel"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:930:1: ruleParallel returns [EObject current=null] : (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:933:28: ( (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:934:1: (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:934:1: (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:934:3: otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleParallel1660); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParallelAccess().getForkKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:938:1: ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:938:2: ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )*
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:938:2: ( (lv_threads_1_0= ruleThread ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:939:1: (lv_threads_1_0= ruleThread )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:939:1: (lv_threads_1_0= ruleThread )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:940:3: lv_threads_1_0= ruleThread
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParallelAccess().getThreadsThreadParserRuleCall_1_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleThread_in_ruleParallel1682);
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
                      		"Thread");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:956:2: (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:956:4: otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleParallel1695); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParallelAccess().getParKeyword_1_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:960:1: ( (lv_threads_3_0= ruleThread ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:961:1: (lv_threads_3_0= ruleThread )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:961:1: (lv_threads_3_0= ruleThread )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:962:3: lv_threads_3_0= ruleThread
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParallelAccess().getThreadsThreadParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleThread_in_ruleParallel1716);
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
            	              		"Thread");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleParallel1731); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 16, ruleParallel_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRulePause"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:990:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;
        int entryRulePause_StartIndex = input.index();
        EObject iv_rulePause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:991:2: (iv_rulePause= rulePause EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:992:2: iv_rulePause= rulePause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPauseRule()); 
            }
            pushFollow(FOLLOW_rulePause_in_entryRulePause1767);
            iv_rulePause=rulePause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePause1777); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, entryRulePause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePause"


    // $ANTLR start "rulePause"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:999:1: rulePause returns [EObject current=null] : (otherlv_0= 'pause' () ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;
        int rulePause_StartIndex = input.index();
        Token otherlv_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1002:28: ( (otherlv_0= 'pause' () ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1003:1: (otherlv_0= 'pause' () )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1003:1: (otherlv_0= 'pause' () )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1003:3: otherlv_0= 'pause' ()
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_rulePause1814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPauseAccess().getPauseKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1007:1: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1008:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPauseAccess().getPauseAction_1(),
                          current);
                  
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
            if ( state.backtracking>0 ) { memoize(input, 18, rulePause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePause"


    // $ANTLR start "entryRuleStatementScope"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1024:1: entryRuleStatementScope returns [EObject current=null] : iv_ruleStatementScope= ruleStatementScope EOF ;
    public final EObject entryRuleStatementScope() throws RecognitionException {
        EObject current = null;
        int entryRuleStatementScope_StartIndex = input.index();
        EObject iv_ruleStatementScope = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1025:2: (iv_ruleStatementScope= ruleStatementScope EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1026:2: iv_ruleStatementScope= ruleStatementScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatementScope_in_entryRuleStatementScope1862);
            iv_ruleStatementScope=ruleStatementScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementScope1872); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, entryRuleStatementScope_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStatementScope"


    // $ANTLR start "ruleStatementScope"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1033:1: ruleStatementScope returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' ) ;
    public final EObject ruleStatementScope() throws RecognitionException {
        EObject current = null;
        int ruleStatementScope_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_declarations_2_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_statements_6_0 = null;

        EObject lv_statements_7_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1036:28: ( ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1037:1: ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1037:1: ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1037:2: () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1037:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1038:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatementScopeAccess().getStatementScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleStatementScope1921); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStatementScopeAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1050:1: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1051:1: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1051:1: (lv_declarations_2_0= ruleDeclaration )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1052:3: lv_declarations_2_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleStatementScope1942);
            	    lv_declarations_2_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatementScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_2_0, 
            	              		"Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1068:3: ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1068:4: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1068:4: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )*
            loop24:
            do {
                int alt24=3;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1068:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1068:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1068:6: ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';'
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1068:6: ( (lv_statements_3_0= ruleInstructionStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1069:1: (lv_statements_3_0= ruleInstructionStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1069:1: (lv_statements_3_0= ruleInstructionStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1070:3: lv_statements_3_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsInstructionStatementParserRuleCall_3_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleStatementScope1967);
            	    lv_statements_3_0=ruleInstructionStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatementScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_3_0, 
            	              		"InstructionStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleStatementScope1979); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getStatementScopeAccess().getSemicolonKeyword_3_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1091:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1091:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1092:1: (lv_statements_5_0= ruleEmptyStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1092:1: (lv_statements_5_0= ruleEmptyStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1093:3: lv_statements_5_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsEmptyStatementParserRuleCall_3_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleStatementScope2007);
            	    lv_statements_5_0=ruleEmptyStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatementScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_5_0, 
            	              		"EmptyStatement");
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1109:4: ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||LA26_0==RULE_COMMENT_ANNOTATION||LA26_0==17||LA26_0==24||(LA26_0>=28 && LA26_0<=29)||LA26_0==32||LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1109:5: ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )*
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1109:5: ( (lv_statements_6_0= ruleInstructionStatement ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1110:1: (lv_statements_6_0= ruleInstructionStatement )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1110:1: (lv_statements_6_0= ruleInstructionStatement )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1111:3: lv_statements_6_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsInstructionStatementParserRuleCall_3_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleStatementScope2031);
                    lv_statements_6_0=ruleInstructionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementScopeRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_6_0, 
                              		"InstructionStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1127:2: ( (lv_statements_7_0= ruleEmptyStatement ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_ID||LA25_0==RULE_COMMENT_ANNOTATION||LA25_0==46) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1128:1: (lv_statements_7_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1128:1: (lv_statements_7_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1129:3: lv_statements_7_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsEmptyStatementParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleStatementScope2052);
                    	    lv_statements_7_0=ruleEmptyStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStatementScopeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_7_0, 
                    	              		"EmptyStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleStatementScope2068); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getStatementScopeAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, ruleStatementScope_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStatementScope"


    // $ANTLR start "entryRuleDeclaration"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1159:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleDeclaration_StartIndex = input.index();
        EObject iv_ruleDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1160:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1161:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration2106);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration2116); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, entryRuleDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1168:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleDeclaration_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1171:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1172:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1172:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1172:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1172:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_COMMENT_ANNOTATION||LA27_0==46) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1173:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1173:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1174:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleDeclaration2162);
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
            	    break loop27;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1190:3: ( (lv_const_1_0= 'const' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1191:1: (lv_const_1_0= 'const' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1191:1: (lv_const_1_0= 'const' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1192:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,33,FOLLOW_33_in_ruleDeclaration2181); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1205:3: ( (lv_input_2_0= 'input' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1206:1: (lv_input_2_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1206:1: (lv_input_2_0= 'input' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1207:3: lv_input_2_0= 'input'
                    {
                    lv_input_2_0=(Token)match(input,34,FOLLOW_34_in_ruleDeclaration2213); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1220:3: ( (lv_output_3_0= 'output' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1221:1: (lv_output_3_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1221:1: (lv_output_3_0= 'output' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1222:3: lv_output_3_0= 'output'
                    {
                    lv_output_3_0=(Token)match(input,35,FOLLOW_35_in_ruleDeclaration2245); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1235:3: ( (lv_static_4_0= 'static' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1236:1: (lv_static_4_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1236:1: (lv_static_4_0= 'static' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1237:3: lv_static_4_0= 'static'
                    {
                    lv_static_4_0=(Token)match(input,36,FOLLOW_36_in_ruleDeclaration2277); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1250:3: ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==RULE_ID) ) {
                    alt33=2;
                }
                else if ( ((LA33_1>=65 && LA33_1<=71)) ) {
                    alt33=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA33_0>=65 && LA33_0<=71)) ) {
                alt33=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1250:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1250:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1250:5: ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1250:5: ( (lv_signal_5_0= 'signal' ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==37) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1251:1: (lv_signal_5_0= 'signal' )
                            {
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1251:1: (lv_signal_5_0= 'signal' )
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1252:3: lv_signal_5_0= 'signal'
                            {
                            lv_signal_5_0=(Token)match(input,37,FOLLOW_37_in_ruleDeclaration2311); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_signal_5_0, grammarAccess.getDeclarationAccess().getSignalSignalKeyword_5_0_0_0());
                                  
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1265:3: ( (lv_type_6_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1266:1: (lv_type_6_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1266:1: (lv_type_6_0= ruleValueType )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1267:3: lv_type_6_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeValueTypeEnumRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleDeclaration2346);
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


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1284:6: ( (lv_signal_7_0= 'signal' ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1284:6: ( (lv_signal_7_0= 'signal' ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1285:1: (lv_signal_7_0= 'signal' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1285:1: (lv_signal_7_0= 'signal' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1286:3: lv_signal_7_0= 'signal'
                    {
                    lv_signal_7_0=(Token)match(input,37,FOLLOW_37_in_ruleDeclaration2371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_signal_7_0, grammarAccess.getDeclarationAccess().getSignalSignalKeyword_5_1_0());
                          
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1299:3: ( (lv_valuedObjects_8_0= ruleValuedObject ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1300:1: (lv_valuedObjects_8_0= ruleValuedObject )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1300:1: (lv_valuedObjects_8_0= ruleValuedObject )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1301:3: lv_valuedObjects_8_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValuedObject_in_ruleDeclaration2406);
            lv_valuedObjects_8_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_8_0, 
                      		"ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1317:2: (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==38) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1317:4: otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    {
            	    otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleDeclaration2419); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getDeclarationAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1321:1: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1322:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1322:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1323:3: lv_valuedObjects_10_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValuedObject_in_ruleDeclaration2440);
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
            	              		"ValuedObject");
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

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleDeclaration2454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getDeclarationAccess().getSemicolonKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, ruleDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleValuedObject"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1351:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObject_StartIndex = input.index();
        EObject iv_ruleValuedObject = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1352:2: (iv_ruleValuedObject= ruleValuedObject EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1353:2: iv_ruleValuedObject= ruleValuedObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObject_in_entryRuleValuedObject2490);
            iv_ruleValuedObject=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObject; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObject2500); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, entryRuleValuedObject_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObject"


    // $ANTLR start "ruleValuedObject"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1360:1: ruleValuedObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )? (otherlv_3= 'combine' ( (lv_combineOperator_4_0= ruleCombineOperator ) ) )? ) ;
    public final EObject ruleValuedObject() throws RecognitionException {
        EObject current = null;
        int ruleValuedObject_StartIndex = input.index();
        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_initialValue_2_0 = null;

        Enumerator lv_combineOperator_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1363:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )? (otherlv_3= 'combine' ( (lv_combineOperator_4_0= ruleCombineOperator ) ) )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1364:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )? (otherlv_3= 'combine' ( (lv_combineOperator_4_0= ruleCombineOperator ) ) )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1364:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )? (otherlv_3= 'combine' ( (lv_combineOperator_4_0= ruleCombineOperator ) ) )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1364:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )? (otherlv_3= 'combine' ( (lv_combineOperator_4_0= ruleCombineOperator ) ) )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1364:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1365:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1365:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1366:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValuedObject2542); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1382:2: (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==23) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1382:4: otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleValuedObject2560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectAccess().getEqualsSignKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1386:1: ( (lv_initialValue_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1387:1: (lv_initialValue_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1387:1: (lv_initialValue_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1388:3: lv_initialValue_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getInitialValueExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleValuedObject2581);
                    lv_initialValue_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"initialValue",
                              		lv_initialValue_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1404:4: (otherlv_3= 'combine' ( (lv_combineOperator_4_0= ruleCombineOperator ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==39) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1404:6: otherlv_3= 'combine' ( (lv_combineOperator_4_0= ruleCombineOperator ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleValuedObject2596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectAccess().getCombineKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1408:1: ( (lv_combineOperator_4_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1409:1: (lv_combineOperator_4_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1409:1: (lv_combineOperator_4_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1410:3: lv_combineOperator_4_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCombineOperatorCombineOperatorEnumRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleValuedObject2617);
                    lv_combineOperator_4_0=ruleCombineOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"combineOperator",
                              		lv_combineOperator_4_0, 
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
            if ( state.backtracking>0 ) { memoize(input, 24, ruleValuedObject_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObject"


    // $ANTLR start "entryRuleEffect"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1434:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;
        int entryRuleEffect_StartIndex = input.index();
        EObject iv_ruleEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1435:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1436:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectRule()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect2655);
            iv_ruleEffect=ruleEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect2665); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, entryRuleEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1443:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_UnaryOperation_2= ruleUnaryOperation | this_TextEffect_3= ruleTextEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;
        int ruleEffect_StartIndex = input.index();
        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_UnaryOperation_2 = null;

        EObject this_TextEffect_3 = null;

        EObject this_FunctionCallEffect_4 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1446:28: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_UnaryOperation_2= ruleUnaryOperation | this_TextEffect_3= ruleTextEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1447:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_UnaryOperation_2= ruleUnaryOperation | this_TextEffect_3= ruleTextEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1447:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_UnaryOperation_2= ruleUnaryOperation | this_TextEffect_3= ruleTextEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            int alt37=5;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1448:2: this_Emission_0= ruleEmission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmission_in_ruleEffect2715);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1461:2: this_Assignment_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleEffect2745);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1474:2: this_UnaryOperation_2= ruleUnaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getUnaryOperationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnaryOperation_in_ruleEffect2775);
                    this_UnaryOperation_2=ruleUnaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnaryOperation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1487:2: this_TextEffect_3= ruleTextEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextEffect_in_ruleEffect2805);
                    this_TextEffect_3=ruleTextEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextEffect_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1500:2: this_FunctionCallEffect_4= ruleFunctionCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getFunctionCallEffectParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCallEffect_in_ruleEffect2835);
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
            if ( state.backtracking>0 ) { memoize(input, 26, ruleEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleEmission"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1519:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;
        int entryRuleEmission_StartIndex = input.index();
        EObject iv_ruleEmission = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1520:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1521:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FOLLOW_ruleEmission_in_entryRuleEmission2870);
            iv_ruleEmission=ruleEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmission2880); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, entryRuleEmission_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEmission"


    // $ANTLR start "ruleEmission"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1528:1: ruleEmission returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;
        int ruleEmission_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_newValue_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1531:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1532:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1532:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1532:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1532:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1533:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1533:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1534:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmission2929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1548:2: (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1548:4: otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleEmission2942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1552:1: ( (lv_newValue_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1553:1: (lv_newValue_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1553:1: (lv_newValue_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1554:3: lv_newValue_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEmission2963);
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

                    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleEmission2975); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 28, ruleEmission_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEmission"


    // $ANTLR start "entryRuleUnaryOperation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1582:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;
        int entryRuleUnaryOperation_StartIndex = input.index();
        EObject iv_ruleUnaryOperation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1583:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1584:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation3013);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOperation3023); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, entryRuleUnaryOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOperation"


    // $ANTLR start "ruleUnaryOperation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1591:1: ruleUnaryOperation returns [EObject current=null] : ( ( (lv_expression_0_0= rulePostfixAddExpression ) ) | ( (lv_expression_1_0= rulePostfixSubExpression ) ) ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;
        int ruleUnaryOperation_StartIndex = input.index();
        EObject lv_expression_0_0 = null;

        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1594:28: ( ( ( (lv_expression_0_0= rulePostfixAddExpression ) ) | ( (lv_expression_1_0= rulePostfixSubExpression ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1595:1: ( ( (lv_expression_0_0= rulePostfixAddExpression ) ) | ( (lv_expression_1_0= rulePostfixSubExpression ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1595:1: ( ( (lv_expression_0_0= rulePostfixAddExpression ) ) | ( (lv_expression_1_0= rulePostfixSubExpression ) ) )
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1595:2: ( (lv_expression_0_0= rulePostfixAddExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1595:2: ( (lv_expression_0_0= rulePostfixAddExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1596:1: (lv_expression_0_0= rulePostfixAddExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1596:1: (lv_expression_0_0= rulePostfixAddExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1597:3: lv_expression_0_0= rulePostfixAddExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getExpressionPostfixAddExpressionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePostfixAddExpression_in_ruleUnaryOperation3069);
                    lv_expression_0_0=rulePostfixAddExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_0_0, 
                              		"PostfixAddExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1614:6: ( (lv_expression_1_0= rulePostfixSubExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1614:6: ( (lv_expression_1_0= rulePostfixSubExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1615:1: (lv_expression_1_0= rulePostfixSubExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1615:1: (lv_expression_1_0= rulePostfixSubExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1616:3: lv_expression_1_0= rulePostfixSubExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getExpressionPostfixSubExpressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePostfixSubExpression_in_ruleUnaryOperation3096);
                    lv_expression_1_0=rulePostfixSubExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_1_0, 
                              		"PostfixSubExpression");
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
            if ( state.backtracking>0 ) { memoize(input, 30, ruleUnaryOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperation"


    // $ANTLR start "entryRuleTextEffect"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1640:1: entryRuleTextEffect returns [EObject current=null] : iv_ruleTextEffect= ruleTextEffect EOF ;
    public final EObject entryRuleTextEffect() throws RecognitionException {
        EObject current = null;
        int entryRuleTextEffect_StartIndex = input.index();
        EObject iv_ruleTextEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1641:2: (iv_ruleTextEffect= ruleTextEffect EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1642:2: iv_ruleTextEffect= ruleTextEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextEffectRule()); 
            }
            pushFollow(FOLLOW_ruleTextEffect_in_entryRuleTextEffect3132);
            iv_ruleTextEffect=ruleTextEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextEffect3142); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, entryRuleTextEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTextEffect"


    // $ANTLR start "ruleTextEffect"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1649:1: ruleTextEffect returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextEffect() throws RecognitionException {
        EObject current = null;
        int ruleTextEffect_StartIndex = input.index();
        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1652:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1653:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1653:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1654:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1654:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1655:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FOLLOW_RULE_HOSTCODE_in_ruleTextEffect3183); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 32, ruleTextEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTextEffect"


    // $ANTLR start "entryRuleFunctionCallEffect"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1679:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionCallEffect_StartIndex = input.index();
        EObject iv_ruleFunctionCallEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1680:2: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1681:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallEffectRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCallEffect_in_entryRuleFunctionCallEffect3223);
            iv_ruleFunctionCallEffect=ruleFunctionCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCallEffect3233); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, entryRuleFunctionCallEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCallEffect"


    // $ANTLR start "ruleFunctionCallEffect"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1688:1: ruleFunctionCallEffect returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) ;
    public final EObject ruleFunctionCallEffect() throws RecognitionException {
        EObject current = null;
        int ruleFunctionCallEffect_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1691:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1692:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1692:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1692:3: otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleFunctionCallEffect3270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1696:1: ( (lv_functionName_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1697:1: (lv_functionName_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1697:1: (lv_functionName_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1698:3: lv_functionName_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleFunctionCallEffect3291);
            lv_functionName_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
              	        }
                     		set(
                     			current, 
                     			"functionName",
                      		lv_functionName_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1714:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )?
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                alt41=1;
            }
            else if ( (LA41_0==43) ) {
                alt41=2;
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1714:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1714:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1714:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleFunctionCallEffect3305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1718:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1719:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1719:1: (lv_parameters_3_0= ruleParameter )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1720:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionCallEffect3326);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1736:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==38) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1736:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleFunctionCallEffect3339); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1740:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1741:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1741:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1742:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionCallEffect3360);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleFunctionCallEffect3374); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1763:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_43_in_ruleFunctionCallEffect3393); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,44,FOLLOW_44_in_ruleFunctionCallEffect3407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getFunctionCallEffectAccess().getGreaterThanSignKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, ruleFunctionCallEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCallEffect"


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1781:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleExpression_StartIndex = input.index();
        EObject iv_ruleExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1782:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1783:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression3445);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression3455); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, entryRuleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1790:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;
        int ruleExpression_StartIndex = input.index();
        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1793:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1794:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1794:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1795:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleExpression3505);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1808:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleExpression3535);
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
            if ( state.backtracking>0 ) { memoize(input, 36, ruleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBoolExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1827:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBoolExpression_StartIndex = input.index();
        EObject iv_ruleBoolExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1828:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1829:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression3570);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpression3580); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, entryRuleBoolExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1836:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;
        int ruleBoolExpression_StartIndex = input.index();
        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1839:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1841:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleBoolExpression3629);
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
            if ( state.backtracking>0 ) { memoize(input, 38, ruleBoolExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1860:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleLogicalOrExpression_StartIndex = input.index();
        EObject iv_ruleLogicalOrExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1861:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1862:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression3663);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression3673); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, entryRuleLogicalOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1869:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;
        int ruleLogicalOrExpression_StartIndex = input.index();
        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1872:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1873:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1873:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1874:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression3723);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1885:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==61) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1885:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1885:2: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1886:2: 
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1894:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==61) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1894:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1894:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1895:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1895:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1896:3: lv_operator_2_0= ruleLogicalOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression3757);
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
                    	              		"LogicalOrOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1912:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1913:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1913:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1914:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression3778);
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
                    	              		"LogicalAndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt43 >= 1 ) break loop43;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(43, input);
                                throw eee;
                        }
                        cnt43++;
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
            if ( state.backtracking>0 ) { memoize(input, 40, ruleLogicalOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1938:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleLogicalAndExpression_StartIndex = input.index();
        EObject iv_ruleLogicalAndExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1939:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1940:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression3818);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression3828); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, entryRuleLogicalAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1947:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;
        int ruleLogicalAndExpression_StartIndex = input.index();
        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1950:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1951:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1951:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1952:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression3878);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1963:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==62) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1963:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1963:2: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1964:2: 
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1972:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==62) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1972:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1972:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1973:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1973:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1974:3: lv_operator_2_0= ruleLogicalAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression3912);
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
                    	              		"LogicalAndOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1990:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1991:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1991:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1992:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression3933);
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
                    	              		"BitwiseOrExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt45 >= 1 ) break loop45;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
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
            if ( state.backtracking>0 ) { memoize(input, 42, ruleLogicalAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2016:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBitwiseOrExpression_StartIndex = input.index();
        EObject iv_ruleBitwiseOrExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2017:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2018:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression3973);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression3983); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, entryRuleBitwiseOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseOrExpression"


    // $ANTLR start "ruleBitwiseOrExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2025:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;
        int ruleBitwiseOrExpression_StartIndex = input.index();
        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2028:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2029:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2029:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2030:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression4033);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2041:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==54) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2041:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2041:2: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2042:2: 
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2050:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==54) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2050:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2050:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2051:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2051:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2052:3: lv_operator_2_0= ruleBitwiseOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBitwiseOrOperator_in_ruleBitwiseOrExpression4067);
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
                    	              		"BitwiseOrOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2068:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2069:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2069:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2070:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression4088);
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
                    	              		"BitwiseAndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
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
            if ( state.backtracking>0 ) { memoize(input, 44, ruleBitwiseOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2094:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBitwiseAndExpression_StartIndex = input.index();
        EObject iv_ruleBitwiseAndExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2095:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2096:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression4128);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression4138); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, entryRuleBitwiseAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseAndExpression"


    // $ANTLR start "ruleBitwiseAndExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2103:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;
        int ruleBitwiseAndExpression_StartIndex = input.index();
        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2106:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2107:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2107:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2108:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression4188);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2119:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==45) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2119:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2119:2: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2120:2: 
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2128:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==45) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2128:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2128:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2129:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2129:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2130:3: lv_operator_2_0= ruleBitwiseAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBitwiseAndOperator_in_ruleBitwiseAndExpression4222);
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
                    	              		"BitwiseAndOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2146:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2147:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2147:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2148:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression4243);
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
                    	              		"CompareOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
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
            if ( state.backtracking>0 ) { memoize(input, 46, ruleBitwiseAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2172:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;
        int entryRuleCompareOperation_StartIndex = input.index();
        EObject iv_ruleCompareOperation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2173:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2174:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation4283);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation4293); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, entryRuleCompareOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2181:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;
        int ruleCompareOperation_StartIndex = input.index();
        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2184:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2185:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2185:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2186:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation4343);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2197:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==42||LA51_0==44||(LA51_0>=49 && LA51_0<=52)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2197:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2197:2: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2198:2: 
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2206:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2207:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2207:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2208:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareOperation4376);
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2224:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2225:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2225:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2226:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation4397);
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
            if ( state.backtracking>0 ) { memoize(input, 48, ruleCompareOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleNotOrValuedExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2250:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNotOrValuedExpression_StartIndex = input.index();
        EObject iv_ruleNotOrValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2251:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2252:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression4435);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOrValuedExpression4445); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, entryRuleNotOrValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNotOrValuedExpression"


    // $ANTLR start "ruleNotOrValuedExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2259:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleNotOrValuedExpression_StartIndex = input.index();
        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2262:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2263:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2263:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2264:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression4495);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2277:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression4525);
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
            if ( state.backtracking>0 ) { memoize(input, 50, ruleNotOrValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotOrValuedExpression"


    // $ANTLR start "entryRuleNotExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2296:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNotExpression_StartIndex = input.index();
        EObject iv_ruleNotExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2297:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2298:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_entryRuleNotExpression4560);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotExpression4570); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, entryRuleNotExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2305:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;
        int ruleNotExpression_StartIndex = input.index();
        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2308:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2309:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2309:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==55) ) {
                alt53=1;
            }
            else if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_HOSTCODE)||LA53_0==RULE_BOOLEAN||LA53_0==40||LA53_0==42||LA53_0==53||LA53_0==60) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2309:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2309:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2309:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2309:3: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2310:2: 
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2318:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2319:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2319:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2320:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotOperator_in_ruleNotExpression4629);
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2336:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2337:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2337:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2338:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleNotExpression4650);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2356:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleNotExpression4682);
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
            if ( state.backtracking>0 ) { memoize(input, 52, ruleNotExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleValuedExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2375:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedExpression_StartIndex = input.index();
        EObject iv_ruleValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2376:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2377:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression4717);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedExpression4727); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, entryRuleValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedExpression"


    // $ANTLR start "ruleValuedExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2384:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleValuedExpression_StartIndex = input.index();
        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2387:28: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2389:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAddExpression_in_ruleValuedExpression4776);
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
            if ( state.backtracking>0 ) { memoize(input, 54, ruleValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedExpression"


    // $ANTLR start "entryRuleAddExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2408:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAddExpression_StartIndex = input.index();
        EObject iv_ruleAddExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2409:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2410:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAddExpression_in_entryRuleAddExpression4810);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExpression4820); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, entryRuleAddExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2417:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;
        int ruleAddExpression_StartIndex = input.index();
        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2420:28: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2421:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2421:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2422:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression4870);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2433:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==56) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2433:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2433:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2434:2: 
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

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2442:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2443:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2443:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2444:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddOperator_in_ruleAddExpression4903);
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

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2460:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2461:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2461:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2462:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression4924);
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
            	    break loop54;
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
            if ( state.backtracking>0 ) { memoize(input, 56, ruleAddExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2486:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleSubExpression_StartIndex = input.index();
        EObject iv_ruleSubExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2487:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2488:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_entryRuleSubExpression4962);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubExpression4972); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, entryRuleSubExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSubExpression"


    // $ANTLR start "ruleSubExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2495:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;
        int ruleSubExpression_StartIndex = input.index();
        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2498:28: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2499:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2499:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2500:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression5022);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2511:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==48) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2511:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2511:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2512:2: 
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

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2520:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2521:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2521:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2522:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubOperator_in_ruleSubExpression5055);
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

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2538:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2539:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2539:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2540:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression5076);
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
            	    break loop55;
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
            if ( state.backtracking>0 ) { memoize(input, 58, ruleSubExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2564:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleMultExpression_StartIndex = input.index();
        EObject iv_ruleMultExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2565:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2566:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_entryRuleMultExpression5114);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultExpression5124); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, entryRuleMultExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2573:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;
        int ruleMultExpression_StartIndex = input.index();
        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2576:28: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2577:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2577:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2578:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDivExpression_in_ruleMultExpression5174);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2589:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==57) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2589:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2589:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2590:2: 
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

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2598:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2599:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2599:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2600:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOperator_in_ruleMultExpression5207);
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

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2616:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2617:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2617:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2618:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDivExpression_in_ruleMultExpression5228);
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
            	    break loop56;
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
            if ( state.backtracking>0 ) { memoize(input, 60, ruleMultExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2642:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleDivExpression_StartIndex = input.index();
        EObject iv_ruleDivExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2643:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2644:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleDivExpression_in_entryRuleDivExpression5266);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivExpression5276); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, entryRuleDivExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDivExpression"


    // $ANTLR start "ruleDivExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2651:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;
        int ruleDivExpression_StartIndex = input.index();
        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2654:28: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2655:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2655:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2656:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleModExpression_in_ruleDivExpression5326);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2667:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==59) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2667:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2667:2: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2668:2: 
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2676:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2677:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2677:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2678:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDivOperator_in_ruleDivExpression5359);
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2694:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2695:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2695:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2696:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModExpression_in_ruleDivExpression5380);
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
            if ( state.backtracking>0 ) { memoize(input, 62, ruleDivExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2720:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleModExpression_StartIndex = input.index();
        EObject iv_ruleModExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2721:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2722:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_entryRuleModExpression5418);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModExpression5428); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, entryRuleModExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleModExpression"


    // $ANTLR start "ruleModExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2729:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;
        int ruleModExpression_StartIndex = input.index();
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2732:28: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2733:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2733:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2734:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNegExpression_in_ruleModExpression5478);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2745:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==58) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2745:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2745:2: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2746:2: 
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2754:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2755:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2755:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2756:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModOperator_in_ruleModExpression5511);
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2772:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2773:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2773:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2774:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression5532);
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
            if ( state.backtracking>0 ) { memoize(input, 64, ruleModExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModExpression"


    // $ANTLR start "entryRuleNegExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2798:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNegExpression_StartIndex = input.index();
        EObject iv_ruleNegExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2799:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2800:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNegExpression_in_entryRuleNegExpression5570);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpression5580); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, entryRuleNegExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNegExpression"


    // $ANTLR start "ruleNegExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2807:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_PostfixAddExpression_3= rulePostfixAddExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;
        int ruleNegExpression_StartIndex = input.index();
        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_PostfixAddExpression_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2810:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_PostfixAddExpression_3= rulePostfixAddExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2811:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_PostfixAddExpression_3= rulePostfixAddExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2811:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_PostfixAddExpression_3= rulePostfixAddExpression )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==48) ) {
                alt59=1;
            }
            else if ( ((LA59_0>=RULE_ID && LA59_0<=RULE_STRING)||LA59_0==40||LA59_0==42||LA59_0==53||LA59_0==60||(LA59_0>=63 && LA59_0<=64)) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2811:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2811:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2811:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2811:3: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2812:2: 
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2820:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2821:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2821:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2822:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSubOperator_in_ruleNegExpression5639);
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2838:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2839:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2839:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2840:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNegExpression_in_ruleNegExpression5660);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2858:2: this_PostfixAddExpression_3= rulePostfixAddExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getPostfixAddExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePostfixAddExpression_in_ruleNegExpression5692);
                    this_PostfixAddExpression_3=rulePostfixAddExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PostfixAddExpression_3; 
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
            if ( state.backtracking>0 ) { memoize(input, 66, ruleNegExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNegExpression"


    // $ANTLR start "entryRulePostfixAddExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2877:1: entryRulePostfixAddExpression returns [EObject current=null] : iv_rulePostfixAddExpression= rulePostfixAddExpression EOF ;
    public final EObject entryRulePostfixAddExpression() throws RecognitionException {
        EObject current = null;
        int entryRulePostfixAddExpression_StartIndex = input.index();
        EObject iv_rulePostfixAddExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2878:2: (iv_rulePostfixAddExpression= rulePostfixAddExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2879:2: iv_rulePostfixAddExpression= rulePostfixAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixAddExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePostfixAddExpression_in_entryRulePostfixAddExpression5727);
            iv_rulePostfixAddExpression=rulePostfixAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixAddExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfixAddExpression5737); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, entryRulePostfixAddExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePostfixAddExpression"


    // $ANTLR start "rulePostfixAddExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2886:1: rulePostfixAddExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) ) ) | this_PostfixSubExpression_3= rulePostfixSubExpression ) ;
    public final EObject rulePostfixAddExpression() throws RecognitionException {
        EObject current = null;
        int rulePostfixAddExpression_StartIndex = input.index();
        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_PostfixSubExpression_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2889:28: ( ( ( () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) ) ) | this_PostfixSubExpression_3= rulePostfixSubExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2890:1: ( ( () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) ) ) | this_PostfixSubExpression_3= rulePostfixSubExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2890:1: ( ( () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) ) ) | this_PostfixSubExpression_3= rulePostfixSubExpression )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==63) ) {
                alt60=1;
            }
            else if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_STRING)||LA60_0==40||LA60_0==42||LA60_0==53||LA60_0==60||LA60_0==64) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2890:2: ( () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2890:2: ( () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2890:3: () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2890:3: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2891:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPostfixAddExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2899:2: ( (lv_operator_1_0= rulePostfixAdd ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2900:1: (lv_operator_1_0= rulePostfixAdd )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2900:1: (lv_operator_1_0= rulePostfixAdd )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2901:3: lv_operator_1_0= rulePostfixAdd
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixAddExpressionAccess().getOperatorPostfixAddEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePostfixAdd_in_rulePostfixAddExpression5796);
                    lv_operator_1_0=rulePostfixAdd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfixAddExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"PostfixAdd");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2917:2: ( (lv_subExpressions_2_0= rulePostfixAddExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2918:1: (lv_subExpressions_2_0= rulePostfixAddExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2918:1: (lv_subExpressions_2_0= rulePostfixAddExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2919:3: lv_subExpressions_2_0= rulePostfixAddExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixAddExpressionAccess().getSubExpressionsPostfixAddExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePostfixAddExpression_in_rulePostfixAddExpression5817);
                    lv_subExpressions_2_0=rulePostfixAddExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfixAddExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_2_0, 
                              		"PostfixAddExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2937:2: this_PostfixSubExpression_3= rulePostfixSubExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPostfixAddExpressionAccess().getPostfixSubExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePostfixSubExpression_in_rulePostfixAddExpression5849);
                    this_PostfixSubExpression_3=rulePostfixSubExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PostfixSubExpression_3; 
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
            if ( state.backtracking>0 ) { memoize(input, 68, rulePostfixAddExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePostfixAddExpression"


    // $ANTLR start "entryRulePostfixSubExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2956:1: entryRulePostfixSubExpression returns [EObject current=null] : iv_rulePostfixSubExpression= rulePostfixSubExpression EOF ;
    public final EObject entryRulePostfixSubExpression() throws RecognitionException {
        EObject current = null;
        int entryRulePostfixSubExpression_StartIndex = input.index();
        EObject iv_rulePostfixSubExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2957:2: (iv_rulePostfixSubExpression= rulePostfixSubExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2958:2: iv_rulePostfixSubExpression= rulePostfixSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixSubExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePostfixSubExpression_in_entryRulePostfixSubExpression5884);
            iv_rulePostfixSubExpression=rulePostfixSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixSubExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfixSubExpression5894); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, entryRulePostfixSubExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePostfixSubExpression"


    // $ANTLR start "rulePostfixSubExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2965:1: rulePostfixSubExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject rulePostfixSubExpression() throws RecognitionException {
        EObject current = null;
        int rulePostfixSubExpression_StartIndex = input.index();
        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2968:28: ( ( ( () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2969:1: ( ( () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2969:1: ( ( () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==64) ) {
                alt61=1;
            }
            else if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_STRING)||LA61_0==40||LA61_0==42||LA61_0==53||LA61_0==60) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2969:2: ( () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2969:2: ( () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2969:3: () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2969:3: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2970:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPostfixSubExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2978:2: ( (lv_operator_1_0= rulePostfixSub ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2979:1: (lv_operator_1_0= rulePostfixSub )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2979:1: (lv_operator_1_0= rulePostfixSub )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2980:3: lv_operator_1_0= rulePostfixSub
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixSubExpressionAccess().getOperatorPostfixSubEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePostfixSub_in_rulePostfixSubExpression5953);
                    lv_operator_1_0=rulePostfixSub();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfixSubExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"PostfixSub");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2996:2: ( (lv_subExpressions_2_0= rulePostfixSubExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2997:1: (lv_subExpressions_2_0= rulePostfixSubExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2997:1: (lv_subExpressions_2_0= rulePostfixSubExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2998:3: lv_subExpressions_2_0= rulePostfixSubExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixSubExpressionAccess().getSubExpressionsPostfixSubExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePostfixSubExpression_in_rulePostfixSubExpression5974);
                    lv_subExpressions_2_0=rulePostfixSubExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfixSubExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_2_0, 
                              		"PostfixSubExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3016:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPostfixSubExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicValuedExpression_in_rulePostfixSubExpression6006);
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
            if ( state.backtracking>0 ) { memoize(input, 70, rulePostfixSubExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePostfixSubExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3035:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAtomicExpression_StartIndex = input.index();
        EObject iv_ruleAtomicExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3036:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3037:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression6041);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression6051); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, entryRuleAtomicExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3044:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3047:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3048:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3048:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            int alt62=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt62=1;
                }
                break;
            case RULE_ID:
            case 53:
            case 60:
                {
                alt62=2;
                }
                break;
            case 40:
                {
                alt62=3;
                }
                break;
            case 42:
                {
                alt62=4;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt62=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3049:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolValue_in_ruleAtomicExpression6101);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3062:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression6131);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3074:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3074:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3074:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleAtomicExpression6149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleAtomicExpression6174);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleAtomicExpression6185); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3096:2: this_FunctionCall_5= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleAtomicExpression6217);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3109:2: this_TextExpression_6= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_ruleAtomicExpression6247);
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
            if ( state.backtracking>0 ) { memoize(input, 72, ruleAtomicExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleAtomicValuedExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3128:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAtomicValuedExpression_StartIndex = input.index();
        EObject iv_ruleAtomicValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3129:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3130:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression6282);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicValuedExpression6292); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, entryRuleAtomicValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicValuedExpression"


    // $ANTLR start "ruleAtomicValuedExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3137:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3140:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3141:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3141:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt63=5;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3142:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression6342);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3155:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression6372);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3168:2: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getStringValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_ruleAtomicValuedExpression6402);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3180:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3180:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3180:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleAtomicValuedExpression6420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression6445);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleAtomicValuedExpression6456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3202:2: this_AtomicExpression_6= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression6488);
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
            if ( state.backtracking>0 ) { memoize(input, 74, ruleAtomicValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAtomicValuedExpression"


    // $ANTLR start "entryRuleValuedObjectTestExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3221:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObjectTestExpression_StartIndex = input.index();
        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3222:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3223:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression6523);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObjectTestExpression6533); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, entryRuleValuedObjectTestExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectTestExpression"


    // $ANTLR start "ruleValuedObjectTestExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3230:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3233:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3234:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3234:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==53||LA65_0==60) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_ID) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3234:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3234:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3234:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3234:3: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3235:2: 
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3243:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3244:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3244:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3245:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3245:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==53) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==60) ) {
                        alt64=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3246:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression6594);
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
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3261:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression6613);
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

                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleValuedObjectTestExpression6628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3283:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3284:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3284:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3285:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression6649);
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

                    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleValuedObjectTestExpression6661); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3307:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression6693);
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
            if ( state.backtracking>0 ) { memoize(input, 76, ruleValuedObjectTestExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObjectTestExpression"


    // $ANTLR start "entryRuleValuedObjectReference"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3326:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObjectReference_StartIndex = input.index();
        EObject iv_ruleValuedObjectReference = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3327:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3328:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference6728);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObjectReference6738); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, entryRuleValuedObjectReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectReference"


    // $ANTLR start "ruleValuedObjectReference"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3335:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;
        int ruleValuedObjectReference_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_indices_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3338:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3339:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3339:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3339:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3339:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3340:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3340:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3341:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValuedObjectReference6787); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3355:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==21) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3355:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleValuedObjectReference6800); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3359:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3360:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3360:1: (lv_indices_2_0= ruleExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3361:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleValuedObjectReference6821);
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

            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleValuedObjectReference6833); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop66;
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
            if ( state.backtracking>0 ) { memoize(input, 78, ruleValuedObjectReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleFunctionCall"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3389:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionCall_StartIndex = input.index();
        EObject iv_ruleFunctionCall = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3390:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3391:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall6871);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall6881); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, entryRuleFunctionCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3398:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3401:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3402:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3402:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3402:3: otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleFunctionCall6918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3406:1: ( (lv_functionName_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3407:1: (lv_functionName_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3407:1: (lv_functionName_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3408:3: lv_functionName_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleFunctionCall6939);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3424:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )?
            int alt68=3;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==40) ) {
                alt68=1;
            }
            else if ( (LA68_0==43) ) {
                alt68=2;
            }
            switch (alt68) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3424:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3424:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3424:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleFunctionCall6953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3428:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3429:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3429:1: (lv_parameters_3_0= ruleParameter )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3430:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionCall6974);
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
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3446:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==38) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3446:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleFunctionCall6987); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3450:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3451:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3451:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3452:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionCall7008);
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
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleFunctionCall7022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3473:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_43_in_ruleFunctionCall7041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,44,FOLLOW_44_in_ruleFunctionCall7055); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 80, ruleFunctionCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleParameter"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3489:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;
        int entryRuleParameter_StartIndex = input.index();
        EObject iv_ruleParameter = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3490:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3491:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter7091);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter7101); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, entryRuleParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3498:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;
        int ruleParameter_StartIndex = input.index();
        Token lv_callByReference_0_0=null;
        Token lv_pureOutput_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3501:28: ( ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3502:1: ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3502:1: ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3502:2: ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3502:2: ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==45) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3502:3: ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )?
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3502:3: ( (lv_callByReference_0_0= '&' ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3503:1: (lv_callByReference_0_0= '&' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3503:1: (lv_callByReference_0_0= '&' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3504:3: lv_callByReference_0_0= '&'
                    {
                    lv_callByReference_0_0=(Token)match(input,45,FOLLOW_45_in_ruleParameter7145); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_callByReference_0_0, grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterRule());
                      	        }
                             		setWithLastConsumed(current, "callByReference", true, "&");
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3517:2: ( (lv_pureOutput_1_0= '&' ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==45) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3518:1: (lv_pureOutput_1_0= '&' )
                            {
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3518:1: (lv_pureOutput_1_0= '&' )
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3519:3: lv_pureOutput_1_0= '&'
                            {
                            lv_pureOutput_1_0=(Token)match(input,45,FOLLOW_45_in_ruleParameter7176); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_pureOutput_1_0, grammarAccess.getParameterAccess().getPureOutputAmpersandKeyword_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getParameterRule());
                              	        }
                                     		setWithLastConsumed(current, "pureOutput", true, "&");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3532:5: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3533:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3533:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3534:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParameter7213);
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
            if ( state.backtracking>0 ) { memoize(input, 82, ruleParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTextExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3558:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleTextExpression_StartIndex = input.index();
        EObject iv_ruleTextExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3559:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3560:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTextExpression_in_entryRuleTextExpression7249);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextExpression7259); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, entryRuleTextExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3567:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;
        int ruleTextExpression_StartIndex = input.index();
        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3570:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3571:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3571:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3572:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3572:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3573:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FOLLOW_RULE_HOSTCODE_in_ruleTextExpression7300); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 84, ruleTextExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleIntValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3597:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;
        int entryRuleIntValue_StartIndex = input.index();
        EObject iv_ruleIntValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3598:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3599:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue7340);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue7350); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, entryRuleIntValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3606:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;
        int ruleIntValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3609:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3610:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3610:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3611:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3611:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3612:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue7391); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 86, ruleIntValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3636:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;
        int entryRuleFloatValue_StartIndex = input.index();
        EObject iv_ruleFloatValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3637:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3638:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue7431);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue7441); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, entryRuleFloatValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3645:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;
        int ruleFloatValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3648:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3649:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3649:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3650:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3650:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3651:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue7482); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 88, ruleFloatValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleBoolValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3675:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;
        int entryRuleBoolValue_StartIndex = input.index();
        EObject iv_ruleBoolValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3676:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3677:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FOLLOW_ruleBoolValue_in_entryRuleBoolValue7522);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolValue7532); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, entryRuleBoolValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3684:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;
        int ruleBoolValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3687:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3688:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3688:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3689:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3689:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3690:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBoolValue7573); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 90, ruleBoolValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleStringValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3714:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;
        int entryRuleStringValue_StartIndex = input.index();
        EObject iv_ruleStringValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3715:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3716:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue7613);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue7623); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, entryRuleStringValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3723:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;
        int ruleStringValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3726:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3727:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3727:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3728:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3728:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3729:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue7664); if (state.failed) return current;
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
                      		"STRING");
              	    
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
            if ( state.backtracking>0 ) { memoize(input, 92, ruleStringValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3755:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleAnnotation_StartIndex = input.index();
        EObject iv_ruleAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3756:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3757:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation7706);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation7716); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, entryRuleAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3764:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleAnnotation_StartIndex = input.index();
        EObject this_CommentAnnotation_0 = null;

        EObject this_TagAnnotation_1 = null;

        EObject this_KeyStringValueAnnotation_2 = null;

        EObject this_TypedKeyStringValueAnnotation_3 = null;

        EObject this_KeyBooleanValueAnnotation_4 = null;

        EObject this_KeyIntValueAnnotation_5 = null;

        EObject this_KeyFloatValueAnnotation_6 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3767:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3768:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3768:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            int alt71=7;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3769:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommentAnnotation_in_ruleAnnotation7766);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3782:2: this_TagAnnotation_1= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTagAnnotation_in_ruleAnnotation7796);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3795:2: this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation7826);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3808:2: this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation7856);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3821:2: this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation7886);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3834:2: this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation7916);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3847:2: this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation7946);
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
            if ( state.backtracking>0 ) { memoize(input, 94, ruleAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3868:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleCommentAnnotation_StartIndex = input.index();
        EObject iv_ruleCommentAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3869:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3870:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation7983);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentAnnotation7993); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, entryRuleCommentAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentAnnotation"


    // $ANTLR start "ruleCommentAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3877:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleCommentAnnotation_StartIndex = input.index();
        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3880:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3881:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3881:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3882:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3882:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3883:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation8034); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 96, ruleCommentAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleTagAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3907:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleTagAnnotation_StartIndex = input.index();
        EObject iv_ruleTagAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3908:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3909:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation8074);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagAnnotation8084); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, entryRuleTagAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTagAnnotation"


    // $ANTLR start "ruleTagAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3916:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleTagAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3919:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3920:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3920:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3920:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleTagAnnotation8121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3924:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3925:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3925:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3926:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTagAnnotation8142);
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 98, ruleTagAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3950:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3951:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3952:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation8178);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation8188); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 99, entryRuleKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyStringValueAnnotation"


    // $ANTLR start "ruleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3959:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) )+ ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyStringValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3962:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) )+ ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3963:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) )+ )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3963:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) )+ )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3963:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) )+
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleKeyStringValueAnnotation8225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3967:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3968:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3968:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3969:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation8246);
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3985:2: ( (lv_values_2_0= ruleEString ) )+
            int cnt72=0;
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_ID) ) {
                    int LA72_2 = input.LA(2);

                    if ( (LA72_2==EOF||LA72_2==RULE_ID||(LA72_2>=RULE_STRING && LA72_2<=RULE_COMMENT_ANNOTATION)||(LA72_2>=16 && LA72_2<=17)||LA72_2==24||(LA72_2>=28 && LA72_2<=29)||(LA72_2>=32 && LA72_2<=37)||LA72_2==46||(LA72_2>=65 && LA72_2<=71)) ) {
                        alt72=1;
                    }


                }
                else if ( (LA72_0==RULE_STRING) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3986:1: (lv_values_2_0= ruleEString )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3986:1: (lv_values_2_0= ruleEString )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3987:3: lv_values_2_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation8267);
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
            	              		"EString");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt72 >= 1 ) break loop72;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
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
            if ( state.backtracking>0 ) { memoize(input, 100, ruleKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4011:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleTypedKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4012:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4013:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation8304);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation8314); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, entryRuleTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4020:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) )+ ) ;
    public final EObject ruleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleTypedKeyStringValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4023:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) )+ ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4024:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) )+ )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4024:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) )+ )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4024:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) )+
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleTypedKeyStringValueAnnotation8351); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4028:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4029:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4029:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4030:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation8372);
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

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleTypedKeyStringValueAnnotation8384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4050:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4051:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4051:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4052:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation8405);
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

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleTypedKeyStringValueAnnotation8417); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4072:1: ( (lv_values_5_0= ruleEString ) )+
            int cnt73=0;
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_ID) ) {
                    int LA73_2 = input.LA(2);

                    if ( (LA73_2==EOF||LA73_2==RULE_ID||(LA73_2>=RULE_STRING && LA73_2<=RULE_COMMENT_ANNOTATION)||(LA73_2>=16 && LA73_2<=17)||LA73_2==24||(LA73_2>=28 && LA73_2<=29)||(LA73_2>=32 && LA73_2<=37)||LA73_2==46||(LA73_2>=65 && LA73_2<=71)) ) {
                        alt73=1;
                    }


                }
                else if ( (LA73_0==RULE_STRING) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4073:1: (lv_values_5_0= ruleEString )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4073:1: (lv_values_5_0= ruleEString )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4074:3: lv_values_5_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation8438);
            	    lv_values_5_0=ruleEString();

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
            	              		"EString");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 102, ruleTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4098:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyBooleanValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4099:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4100:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation8475);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation8485); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 103, entryRuleKeyBooleanValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyBooleanValueAnnotation"


    // $ANTLR start "ruleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4107:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyBooleanValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4110:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4111:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4111:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4111:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleKeyBooleanValueAnnotation8522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4115:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4116:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4116:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4117:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation8543);
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4133:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4134:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4134:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4135:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation8560); if (state.failed) return current;
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 104, ruleKeyBooleanValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyBooleanValueAnnotation"


    // $ANTLR start "entryRuleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4159:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyIntValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4160:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4161:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation8601);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation8611); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 105, entryRuleKeyIntValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyIntValueAnnotation"


    // $ANTLR start "ruleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4168:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyIntValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4171:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4172:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4172:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4172:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleKeyIntValueAnnotation8648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4176:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4177:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4177:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4178:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation8669);
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4194:2: ( (lv_value_2_0= ruleInteger ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4195:1: (lv_value_2_0= ruleInteger )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4195:1: (lv_value_2_0= ruleInteger )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4196:3: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation8690);
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
                      		"Integer");
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
            if ( state.backtracking>0 ) { memoize(input, 106, ruleKeyIntValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyIntValueAnnotation"


    // $ANTLR start "entryRuleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4220:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyFloatValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4221:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4222:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation8726);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation8736); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 107, entryRuleKeyFloatValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyFloatValueAnnotation"


    // $ANTLR start "ruleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4229:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyFloatValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4232:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4233:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4233:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4233:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleKeyFloatValueAnnotation8773); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4237:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4238:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4238:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4239:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation8794);
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4255:2: ( (lv_value_2_0= ruleFloateger ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4256:1: (lv_value_2_0= ruleFloateger )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4256:1: (lv_value_2_0= ruleFloateger )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4257:3: lv_value_2_0= ruleFloateger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation8815);
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
                      		"Floateger");
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
            if ( state.backtracking>0 ) { memoize(input, 108, ruleKeyFloatValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyFloatValueAnnotation"


    // $ANTLR start "entryRuleEString"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4283:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;
        int entryRuleEString_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4284:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4285:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString8854);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString8865); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 109, entryRuleEString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4292:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleEString_StartIndex = input.index();
        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4295:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4296:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4296:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_STRING) ) {
                alt74=1;
            }
            else if ( (LA74_0==RULE_ID) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4296:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString8905); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4304:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString8931); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 110, ruleEString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4319:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;
        int entryRuleExtendedID_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4320:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4321:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID8977);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID8988); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 111, entryRuleExtendedID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4328:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleExtendedID_StartIndex = input.index();
        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4331:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4332:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4332:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4332:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID9028); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4339:1: (kw= '.' this_ID_2= RULE_ID )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==47) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4340:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,47,FOLLOW_47_in_ruleExtendedID9047); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID9062); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop75;
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
            if ( state.backtracking>0 ) { memoize(input, 112, ruleExtendedID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleInteger"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4360:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;
        int entryRuleInteger_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4361:2: (iv_ruleInteger= ruleInteger EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4362:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger9110);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger9121); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 113, entryRuleInteger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4369:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleInteger_StartIndex = input.index();
        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4372:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4373:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4373:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4373:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4373:2: (kw= '-' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==48) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4374:2: kw= '-'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleInteger9160); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInteger9177); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 114, ruleInteger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleFloateger"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4394:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;
        int entryRuleFloateger_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4395:2: (iv_ruleFloateger= ruleFloateger EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4396:2: iv_ruleFloateger= ruleFloateger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloategerRule()); 
            }
            pushFollow(FOLLOW_ruleFloateger_in_entryRuleFloateger9223);
            iv_ruleFloateger=ruleFloateger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloateger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloateger9234); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 115, entryRuleFloateger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFloateger"


    // $ANTLR start "ruleFloateger"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4403:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFloateger_StartIndex = input.index();
        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4406:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4407:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4407:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4407:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4407:2: (kw= '-' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==48) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4408:2: kw= '-'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleFloateger9273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloateger9290); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 116, ruleFloateger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFloateger"


    // $ANTLR start "ruleCompareOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4428:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4430:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4431:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4431:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt78=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt78=1;
                }
                break;
            case 42:
                {
                alt78=2;
                }
                break;
            case 50:
                {
                alt78=3;
                }
                break;
            case 44:
                {
                alt78=4;
                }
                break;
            case 51:
                {
                alt78=5;
                }
                break;
            case 52:
                {
                alt78=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4431:2: (enumLiteral_0= '==' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4431:2: (enumLiteral_0= '==' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4431:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_ruleCompareOperator9349); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4437:6: (enumLiteral_1= '<' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4437:6: (enumLiteral_1= '<' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4437:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_42_in_ruleCompareOperator9366); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4443:6: (enumLiteral_2= '<=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4443:6: (enumLiteral_2= '<=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4443:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_50_in_ruleCompareOperator9383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4449:6: (enumLiteral_3= '>' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4449:6: (enumLiteral_3= '>' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4449:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_44_in_ruleCompareOperator9400); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4455:6: (enumLiteral_4= '>=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4455:6: (enumLiteral_4= '>=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4455:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_51_in_ruleCompareOperator9417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4461:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4461:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4461:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,52,FOLLOW_52_in_ruleCompareOperator9434); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 117, ruleCompareOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rulePreOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4471:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;
        int rulePreOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4473:28: ( (enumLiteral_0= 'pre' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4474:1: (enumLiteral_0= 'pre' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4474:1: (enumLiteral_0= 'pre' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4474:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_rulePreOperator9478); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 118, rulePreOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePreOperator"


    // $ANTLR start "ruleBitwiseOrOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4484:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleBitwiseOrOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4486:28: ( (enumLiteral_0= '|' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4487:1: (enumLiteral_0= '|' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4487:1: (enumLiteral_0= '|' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4487:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleBitwiseOrOperator9521); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 119, ruleBitwiseOrOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseOrOperator"


    // $ANTLR start "ruleBitwiseAndOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4497:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleBitwiseAndOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4499:28: ( (enumLiteral_0= '&' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4500:1: (enumLiteral_0= '&' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4500:1: (enumLiteral_0= '&' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4500:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,45,FOLLOW_45_in_ruleBitwiseAndOperator9564); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 120, ruleBitwiseAndOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseAndOperator"


    // $ANTLR start "ruleNotOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4510:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleNotOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4512:28: ( (enumLiteral_0= '!' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4513:1: (enumLiteral_0= '!' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4513:1: (enumLiteral_0= '!' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4513:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleNotOperator9607); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 121, ruleNotOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "ruleAddOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4523:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleAddOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4525:28: ( (enumLiteral_0= '+' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4526:1: (enumLiteral_0= '+' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4526:1: (enumLiteral_0= '+' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4526:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleAddOperator9650); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 122, ruleAddOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "ruleSubOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4536:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleSubOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4538:28: ( (enumLiteral_0= '-' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4539:1: (enumLiteral_0= '-' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4539:1: (enumLiteral_0= '-' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4539:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleSubOperator9693); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 123, ruleSubOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubOperator"


    // $ANTLR start "ruleMultOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4549:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleMultOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4551:28: ( (enumLiteral_0= '*' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4552:1: (enumLiteral_0= '*' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4552:1: (enumLiteral_0= '*' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4552:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleMultOperator9736); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 124, ruleMultOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMultOperator"


    // $ANTLR start "ruleModOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4562:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleModOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4564:28: ( (enumLiteral_0= '%' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4565:1: (enumLiteral_0= '%' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4565:1: (enumLiteral_0= '%' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4565:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleModOperator9779); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 125, ruleModOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModOperator"


    // $ANTLR start "ruleDivOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4575:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleDivOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4577:28: ( (enumLiteral_0= '/' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4578:1: (enumLiteral_0= '/' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4578:1: (enumLiteral_0= '/' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4578:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,59,FOLLOW_59_in_ruleDivOperator9822); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 126, ruleDivOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDivOperator"


    // $ANTLR start "ruleValOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4588:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleValOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4590:28: ( (enumLiteral_0= 'val' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4591:1: (enumLiteral_0= 'val' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4591:1: (enumLiteral_0= 'val' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4591:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_ruleValOperator9865); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 127, ruleValOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValOperator"


    // $ANTLR start "ruleLogicalOrOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4601:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleLogicalOrOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4603:28: ( (enumLiteral_0= '||' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4604:1: (enumLiteral_0= '||' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4604:1: (enumLiteral_0= '||' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4604:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,61,FOLLOW_61_in_ruleLogicalOrOperator9908); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 128, ruleLogicalOrOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4614:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleLogicalAndOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4616:28: ( (enumLiteral_0= '&&' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4617:1: (enumLiteral_0= '&&' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4617:1: (enumLiteral_0= '&&' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4617:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,62,FOLLOW_62_in_ruleLogicalAndOperator9951); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 129, ruleLogicalAndOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "rulePostfixAdd"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4627:1: rulePostfixAdd returns [Enumerator current=null] : (enumLiteral_0= '++' ) ;
    public final Enumerator rulePostfixAdd() throws RecognitionException {
        Enumerator current = null;
        int rulePostfixAdd_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4629:28: ( (enumLiteral_0= '++' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4630:1: (enumLiteral_0= '++' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4630:1: (enumLiteral_0= '++' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4630:3: enumLiteral_0= '++'
            {
            enumLiteral_0=(Token)match(input,63,FOLLOW_63_in_rulePostfixAdd9994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getPostfixAddAccess().getPOSTFIX_ADDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getPostfixAddAccess().getPOSTFIX_ADDEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 130, rulePostfixAdd_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePostfixAdd"


    // $ANTLR start "rulePostfixSub"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4640:1: rulePostfixSub returns [Enumerator current=null] : (enumLiteral_0= '--' ) ;
    public final Enumerator rulePostfixSub() throws RecognitionException {
        Enumerator current = null;
        int rulePostfixSub_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4642:28: ( (enumLiteral_0= '--' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4643:1: (enumLiteral_0= '--' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4643:1: (enumLiteral_0= '--' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4643:3: enumLiteral_0= '--'
            {
            enumLiteral_0=(Token)match(input,64,FOLLOW_64_in_rulePostfixSub10037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getPostfixSubAccess().getPOSTFIX_SUBEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getPostfixSubAccess().getPOSTFIX_SUBEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 131, rulePostfixSub_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePostfixSub"


    // $ANTLR start "ruleValueType"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4653:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4655:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4656:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4656:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            int alt79=7;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt79=1;
                }
                break;
            case 66:
                {
                alt79=2;
                }
                break;
            case 67:
                {
                alt79=3;
                }
                break;
            case 68:
                {
                alt79=4;
                }
                break;
            case 69:
                {
                alt79=5;
                }
                break;
            case 70:
                {
                alt79=6;
                }
                break;
            case 71:
                {
                alt79=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4656:2: (enumLiteral_0= 'pure' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4656:2: (enumLiteral_0= 'pure' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4656:4: enumLiteral_0= 'pure'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleValueType10081); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4662:6: (enumLiteral_1= 'bool' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4662:6: (enumLiteral_1= 'bool' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4662:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleValueType10098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4668:6: (enumLiteral_2= 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4668:6: (enumLiteral_2= 'unsigned' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4668:8: enumLiteral_2= 'unsigned'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_67_in_ruleValueType10115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4674:6: (enumLiteral_3= 'int' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4674:6: (enumLiteral_3= 'int' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4674:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_68_in_ruleValueType10132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4680:6: (enumLiteral_4= 'float' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4680:6: (enumLiteral_4= 'float' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4680:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,69,FOLLOW_69_in_ruleValueType10149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4686:6: (enumLiteral_5= 'string' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4686:6: (enumLiteral_5= 'string' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4686:8: enumLiteral_5= 'string'
                    {
                    enumLiteral_5=(Token)match(input,70,FOLLOW_70_in_ruleValueType10166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4692:6: (enumLiteral_6= 'host' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4692:6: (enumLiteral_6= 'host' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4692:8: enumLiteral_6= 'host'
                    {
                    enumLiteral_6=(Token)match(input,71,FOLLOW_71_in_ruleValueType10183); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 132, ruleValueType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "ruleCombineOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4704:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4706:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4707:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4707:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt80=8;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt80=1;
                }
                break;
            case 56:
                {
                alt80=2;
                }
                break;
            case 57:
                {
                alt80=3;
                }
                break;
            case 73:
                {
                alt80=4;
                }
                break;
            case 74:
                {
                alt80=5;
                }
                break;
            case 54:
                {
                alt80=6;
                }
                break;
            case 45:
                {
                alt80=7;
                }
                break;
            case 71:
                {
                alt80=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4707:2: (enumLiteral_0= 'none' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4707:2: (enumLiteral_0= 'none' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4707:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_72_in_ruleCombineOperator10230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4713:6: (enumLiteral_1= '+' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4713:6: (enumLiteral_1= '+' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4713:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_56_in_ruleCombineOperator10247); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4719:6: (enumLiteral_2= '*' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4719:6: (enumLiteral_2= '*' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4719:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_57_in_ruleCombineOperator10264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4725:6: (enumLiteral_3= 'max' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4725:6: (enumLiteral_3= 'max' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4725:8: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_73_in_ruleCombineOperator10281); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4731:6: (enumLiteral_4= 'min' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4731:6: (enumLiteral_4= 'min' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4731:8: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_74_in_ruleCombineOperator10298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4737:6: (enumLiteral_5= '|' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4737:6: (enumLiteral_5= '|' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4737:8: enumLiteral_5= '|'
                    {
                    enumLiteral_5=(Token)match(input,54,FOLLOW_54_in_ruleCombineOperator10315); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4743:6: (enumLiteral_6= '&' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4743:6: (enumLiteral_6= '&' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4743:8: enumLiteral_6= '&'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_45_in_ruleCombineOperator10332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4749:6: (enumLiteral_7= 'host' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4749:6: (enumLiteral_7= 'host' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4749:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,71,FOLLOW_71_in_ruleCombineOperator10349); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 133, ruleCombineOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCombineOperator"

    // $ANTLR start synpred3_InternalSCL
    public final void synpred3_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_statements_5_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:3: ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:3: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:3: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:4: ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:4: ( (lv_statements_5_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:151:1: (lv_statements_5_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:151:1: (lv_statements_5_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:152:3: lv_statements_5_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSCLProgramAccess().getStatementsInstructionStatementParserRuleCall_5_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred3_InternalSCL237);
        lv_statements_5_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,18,FOLLOW_18_in_synpred3_InternalSCL249); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalSCL

    // $ANTLR start synpred4_InternalSCL
    public final void synpred4_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_7_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:173:6: ( ( (lv_statements_7_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:173:6: ( (lv_statements_7_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:173:6: ( (lv_statements_7_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:174:1: (lv_statements_7_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:174:1: (lv_statements_7_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:175:3: lv_statements_7_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSCLProgramAccess().getStatementsEmptyStatementParserRuleCall_5_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred4_InternalSCL277);
        lv_statements_7_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalSCL

    // $ANTLR start synpred16_InternalSCL
    public final void synpred16_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_statements_4_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:581:5: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:581:5: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:581:5: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:581:6: ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:581:6: ( (lv_statements_4_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:582:1: (lv_statements_4_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:582:1: (lv_statements_4_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:583:3: lv_statements_4_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsInstructionStatementParserRuleCall_4_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred16_InternalSCL1023);
        lv_statements_4_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,18,FOLLOW_18_in_synpred16_InternalSCL1035); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalSCL

    // $ANTLR start synpred17_InternalSCL
    public final void synpred17_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_6_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:604:6: ( ( (lv_statements_6_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:604:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:604:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:605:1: (lv_statements_6_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:605:1: (lv_statements_6_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:606:3: lv_statements_6_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsEmptyStatementParserRuleCall_4_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred17_InternalSCL1063);
        lv_statements_6_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred17_InternalSCL

    // $ANTLR start synpred21_InternalSCL
    public final void synpred21_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        EObject lv_elseStatements_11_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:680:5: ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:680:5: ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:680:5: ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:680:6: ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:680:6: ( (lv_elseStatements_11_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:681:1: (lv_elseStatements_11_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:681:1: (lv_elseStatements_11_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:682:3: lv_elseStatements_11_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsInstructionStatementParserRuleCall_5_2_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred21_InternalSCL1171);
        lv_elseStatements_11_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_12=(Token)match(input,18,FOLLOW_18_in_synpred21_InternalSCL1183); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalSCL

    // $ANTLR start synpred22_InternalSCL
    public final void synpred22_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_elseStatements_13_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:703:6: ( ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:703:6: ( (lv_elseStatements_13_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:703:6: ( (lv_elseStatements_13_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:704:1: (lv_elseStatements_13_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:704:1: (lv_elseStatements_13_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:705:3: lv_elseStatements_13_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsEmptyStatementParserRuleCall_5_2_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred22_InternalSCL1211);
        lv_elseStatements_13_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred22_InternalSCL

    // $ANTLR start synpred26_InternalSCL
    public final void synpred26_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:836:4: ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:836:4: ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:836:4: ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:836:5: ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:836:5: ( (lv_statements_1_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:837:1: (lv_statements_1_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:837:1: (lv_statements_1_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:838:3: lv_statements_1_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_1_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred26_InternalSCL1488);
        lv_statements_1_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,18,FOLLOW_18_in_synpred26_InternalSCL1500); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalSCL

    // $ANTLR start synpred27_InternalSCL
    public final void synpred27_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_3_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:859:6: ( ( (lv_statements_3_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:859:6: ( (lv_statements_3_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:859:6: ( (lv_statements_3_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:860:1: (lv_statements_3_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:860:1: (lv_statements_3_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:861:3: lv_statements_3_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsEmptyStatementParserRuleCall_1_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred27_InternalSCL1528);
        lv_statements_3_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred27_InternalSCL

    // $ANTLR start synpred32_InternalSCL
    public final void synpred32_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1068:5: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1068:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1068:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1068:6: ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1068:6: ( (lv_statements_3_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1069:1: (lv_statements_3_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1069:1: (lv_statements_3_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1070:3: lv_statements_3_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsInstructionStatementParserRuleCall_3_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred32_InternalSCL1967);
        lv_statements_3_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,18,FOLLOW_18_in_synpred32_InternalSCL1979); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalSCL

    // $ANTLR start synpred33_InternalSCL
    public final void synpred33_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_5_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1091:6: ( ( (lv_statements_5_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1091:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1091:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1092:1: (lv_statements_5_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1092:1: (lv_statements_5_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1093:3: lv_statements_5_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsEmptyStatementParserRuleCall_3_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred33_InternalSCL2007);
        lv_statements_5_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred33_InternalSCL

    // $ANTLR start synpred46_InternalSCL
    public final void synpred46_InternalSCL_fragment() throws RecognitionException {   
        EObject this_Emission_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1448:2: (this_Emission_0= ruleEmission )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1448:2: this_Emission_0= ruleEmission
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleEmission_in_synpred46_InternalSCL2715);
        this_Emission_0=ruleEmission();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalSCL

    // $ANTLR start synpred47_InternalSCL
    public final void synpred47_InternalSCL_fragment() throws RecognitionException {   
        EObject this_Assignment_1 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1461:2: (this_Assignment_1= ruleAssignment )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1461:2: this_Assignment_1= ruleAssignment
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleAssignment_in_synpred47_InternalSCL2745);
        this_Assignment_1=ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalSCL

    // $ANTLR start synpred48_InternalSCL
    public final void synpred48_InternalSCL_fragment() throws RecognitionException {   
        EObject this_UnaryOperation_2 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1474:2: (this_UnaryOperation_2= ruleUnaryOperation )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1474:2: this_UnaryOperation_2= ruleUnaryOperation
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleUnaryOperation_in_synpred48_InternalSCL2775);
        this_UnaryOperation_2=ruleUnaryOperation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalSCL

    // $ANTLR start synpred49_InternalSCL
    public final void synpred49_InternalSCL_fragment() throws RecognitionException {   
        EObject this_TextEffect_3 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1487:2: (this_TextEffect_3= ruleTextEffect )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1487:2: this_TextEffect_3= ruleTextEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleTextEffect_in_synpred49_InternalSCL2805);
        this_TextEffect_3=ruleTextEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalSCL

    // $ANTLR start synpred51_InternalSCL
    public final void synpred51_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_expression_0_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1595:2: ( ( (lv_expression_0_0= rulePostfixAddExpression ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1595:2: ( (lv_expression_0_0= rulePostfixAddExpression ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1595:2: ( (lv_expression_0_0= rulePostfixAddExpression ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1596:1: (lv_expression_0_0= rulePostfixAddExpression )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1596:1: (lv_expression_0_0= rulePostfixAddExpression )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1597:3: lv_expression_0_0= rulePostfixAddExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getExpressionPostfixAddExpressionParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_rulePostfixAddExpression_in_synpred51_InternalSCL3069);
        lv_expression_0_0=rulePostfixAddExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred51_InternalSCL

    // $ANTLR start synpred55_InternalSCL
    public final void synpred55_InternalSCL_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1795:2: (this_BoolExpression_0= ruleBoolExpression )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1795:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleBoolExpression_in_synpred55_InternalSCL3505);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalSCL

    // $ANTLR start synpred65_InternalSCL
    public final void synpred65_InternalSCL_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2264:2: (this_ValuedExpression_0= ruleValuedExpression )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2264:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred65_InternalSCL4495);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalSCL

    // $ANTLR start synpred82_InternalSCL
    public final void synpred82_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3180:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3180:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3180:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3180:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,40,FOLLOW_40_in_synpred82_InternalSCL6420); if (state.failed) return ;
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred82_InternalSCL6445);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,41,FOLLOW_41_in_synpred82_InternalSCL6456); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred82_InternalSCL

    // Delegated rules

    public final boolean synpred48_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalSCL_fragment(); // can never throw exception
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
    public final boolean synpred16_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred17_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalSCL_fragment(); // can never throw exception
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
    public final boolean synpred55_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalSCL_fragment(); // can never throw exception
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
    public final boolean synpred47_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalSCL_fragment(); // can never throw exception
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA71 dfa71 = new DFA71(this);
    static final String DFA3_eotS =
        "\14\uffff";
    static final String DFA3_eofS =
        "\14\uffff";
    static final String DFA3_minS =
        "\1\4\10\0\3\uffff";
    static final String DFA3_maxS =
        "\1\56\10\0\3\uffff";
    static final String DFA3_acceptS =
        "\11\uffff\1\3\1\1\1\2";
    static final String DFA3_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\5\uffff\1\1\6\uffff\1\10\1\uffff\1\11\4\uffff\1\4\3\uffff"+
            "\1\5\1\6\2\uffff\1\7\15\uffff\1\2",
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

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 150:2: ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 10;}

                        else if ( (synpred4_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 10;}

                        else if ( (synpred4_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 10;}

                        else if ( (synpred4_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_6 = input.LA(1);

                         
                        int index3_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_7 = input.LA(1);

                         
                        int index3_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA3_8 = input.LA(1);

                         
                        int index3_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA10_eotS =
        "\26\uffff";
    static final String DFA10_eofS =
        "\26\uffff";
    static final String DFA10_minS =
        "\3\4\2\uffff\4\4\1\6\5\4\1\26\2\4\1\26\3\4";
    static final String DFA10_maxS =
        "\2\107\1\4\2\uffff\1\107\1\4\1\107\1\4\1\7\5\107\1\57\1\4\1\11"+
        "\1\57\3\107";
    static final String DFA10_acceptS =
        "\3\uffff\1\2\1\1\21\uffff";
    static final String DFA10_specialS =
        "\26\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\1\uffff\4\3\2\uffff"+
            "\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3\2\uffff"+
            "\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\14\1\uffff\1\12\1\13\1\7\1\15\1\1\6\uffff\1\3\3\uffff\1"+
            "\10\2\uffff\1\3\3\uffff\2\3\2\uffff\1\3\5\4\10\uffff\1\2\1\6"+
            "\1\11\20\uffff\7\4",
            "\1\16",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3\2\uffff"+
            "\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\17",
            "\1\12\1\13",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3\2\uffff"+
            "\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3\2\uffff"+
            "\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\14\4\uffff\1\15\1\1\6\uffff\1\3\2\uffff\2\3\1\uffff\2\3"+
            "\3\uffff\2\3\2\uffff\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\14\4\uffff\1\15\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3"+
            "\2\uffff\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\14\1\uffff\1\12\1\13\1\7\1\15\1\1\6\uffff\1\3\3\uffff\1"+
            "\10\2\uffff\1\3\3\uffff\2\3\2\uffff\1\3\5\4\10\uffff\1\2\1\6"+
            "\1\11\20\uffff\7\4",
            "\1\21\30\uffff\1\20",
            "\1\22",
            "\1\24\4\uffff\1\23",
            "\1\21\30\uffff\1\20",
            "\1\25\4\uffff\1\23\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3"+
            "\2\uffff\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\25\4\uffff\1\23\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3"+
            "\2\uffff\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\25\4\uffff\1\23\1\1\6\uffff\1\3\2\uffff\2\3\1\uffff\2\3"+
            "\3\uffff\2\3\2\uffff\1\3\5\4\10\uffff\1\2\22\uffff\7\4"
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
            return "()* loopback of 563:1: ( (lv_declarations_3_0= ruleDeclaration ) )*";
        }
    }
    static final String DFA11_eotS =
        "\15\uffff";
    static final String DFA11_eofS =
        "\15\uffff";
    static final String DFA11_minS =
        "\1\4\10\0\4\uffff";
    static final String DFA11_maxS =
        "\1\56\10\0\4\uffff";
    static final String DFA11_acceptS =
        "\11\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA11_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\4\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\3\5\uffff\1\1\6\uffff\1\10\6\uffff\1\4\1\uffff\2\11\1\5"+
            "\1\6\2\uffff\1\7\15\uffff\1\2",
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
            return "()* loopback of 581:4: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )*";
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
                        if ( (synpred16_InternalSCL()) ) {s = 11;}

                        else if ( (synpred17_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSCL()) ) {s = 11;}

                        else if ( (synpred17_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSCL()) ) {s = 11;}

                        else if ( (synpred17_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index11_8);
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
        "\26\uffff";
    static final String DFA14_eofS =
        "\26\uffff";
    static final String DFA14_minS =
        "\3\4\2\uffff\4\4\1\6\5\4\1\26\2\4\1\26\3\4";
    static final String DFA14_maxS =
        "\2\107\1\4\2\uffff\1\107\1\4\2\107\1\7\2\107\1\4\2\107\1\57\1\4"+
        "\1\11\1\57\3\107";
    static final String DFA14_acceptS =
        "\3\uffff\1\2\1\1\21\uffff";
    static final String DFA14_specialS =
        "\26\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\2\uffff\3\3\2\uffff"+
            "\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3\2\uffff"+
            "\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\10\1\uffff\1\13\1\12\1\15\1\7\1\1\6\uffff\1\3\3\uffff\1"+
            "\14\2\uffff\1\3\3\uffff\2\3\2\uffff\1\3\5\4\10\uffff\1\2\1\6"+
            "\1\11\20\uffff\7\4",
            "\1\16",
            "\1\10\4\uffff\1\7\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3"+
            "\2\uffff\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\10\4\uffff\1\7\1\1\6\uffff\1\3\2\uffff\2\3\1\uffff\2\3"+
            "\3\uffff\2\3\2\uffff\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\13\1\12",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3\2\uffff"+
            "\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3\2\uffff"+
            "\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\17",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3\2\uffff"+
            "\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\10\1\uffff\1\13\1\12\1\15\1\7\1\1\6\uffff\1\3\3\uffff\1"+
            "\14\2\uffff\1\3\3\uffff\2\3\2\uffff\1\3\5\4\10\uffff\1\2\1\6"+
            "\1\11\20\uffff\7\4",
            "\1\21\30\uffff\1\20",
            "\1\22",
            "\1\24\4\uffff\1\23",
            "\1\21\30\uffff\1\20",
            "\1\25\4\uffff\1\23\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3"+
            "\2\uffff\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\25\4\uffff\1\23\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3"+
            "\2\uffff\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\25\4\uffff\1\23\1\1\6\uffff\1\3\2\uffff\2\3\1\uffff\2\3"+
            "\3\uffff\2\3\2\uffff\1\3\5\4\10\uffff\1\2\22\uffff\7\4"
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
            return "()* loopback of 662:1: ( (lv_declarations_10_0= ruleDeclaration ) )*";
        }
    }
    static final String DFA15_eotS =
        "\14\uffff";
    static final String DFA15_eofS =
        "\14\uffff";
    static final String DFA15_minS =
        "\1\4\10\0\3\uffff";
    static final String DFA15_maxS =
        "\1\56\10\0\3\uffff";
    static final String DFA15_acceptS =
        "\11\uffff\1\3\1\1\1\2";
    static final String DFA15_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\3\5\uffff\1\1\6\uffff\1\10\6\uffff\1\4\2\uffff\1\11\1\5"+
            "\1\6\2\uffff\1\7\15\uffff\1\2",
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
            return "()* loopback of 680:4: ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSCL()) ) {s = 10;}

                        else if ( (synpred22_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSCL()) ) {s = 10;}

                        else if ( (synpred22_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSCL()) ) {s = 10;}

                        else if ( (synpred22_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_4 = input.LA(1);

                         
                        int index15_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index15_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_8 = input.LA(1);

                         
                        int index15_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index15_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\16\uffff";
    static final String DFA19_eofS =
        "\1\11\15\uffff";
    static final String DFA19_minS =
        "\1\4\10\0\5\uffff";
    static final String DFA19_maxS =
        "\1\56\10\0\5\uffff";
    static final String DFA19_acceptS =
        "\11\uffff\1\3\2\uffff\1\1\1\2";
    static final String DFA19_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\5\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\3\5\uffff\1\1\6\uffff\1\10\6\uffff\1\4\3\uffff\1\5\1\6\2"+
            "\11\1\7\15\uffff\1\2",
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
            return "()* loopback of 836:3: ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )*";
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
                        if ( (synpred26_InternalSCL()) ) {s = 12;}

                        else if ( (synpred27_InternalSCL()) ) {s = 13;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index19_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_2 = input.LA(1);

                         
                        int index19_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSCL()) ) {s = 12;}

                        else if ( (synpred27_InternalSCL()) ) {s = 13;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index19_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_3 = input.LA(1);

                         
                        int index19_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSCL()) ) {s = 12;}

                        else if ( (synpred27_InternalSCL()) ) {s = 13;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index19_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_4 = input.LA(1);

                         
                        int index19_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index19_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_5 = input.LA(1);

                         
                        int index19_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index19_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_6 = input.LA(1);

                         
                        int index19_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index19_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_7 = input.LA(1);

                         
                        int index19_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index19_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA19_8 = input.LA(1);

                         
                        int index19_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index19_8);
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
        "\26\uffff";
    static final String DFA23_eofS =
        "\26\uffff";
    static final String DFA23_minS =
        "\3\4\2\uffff\3\4\1\6\6\4\1\26\2\4\1\26\3\4";
    static final String DFA23_maxS =
        "\2\107\1\4\2\uffff\1\107\1\4\1\107\1\7\1\107\1\4\4\107\1\57\1\4"+
        "\1\11\1\57\3\107";
    static final String DFA23_acceptS =
        "\3\uffff\1\2\1\1\21\uffff";
    static final String DFA23_specialS =
        "\26\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\3\5\uffff\1\1\6\uffff\1\3\1\uffff\1\3\4\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3\2\uffff"+
            "\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\14\1\uffff\1\11\1\15\1\7\1\13\1\1\6\uffff\1\3\3\uffff\1"+
            "\12\2\uffff\1\3\3\uffff\2\3\2\uffff\1\3\5\4\10\uffff\1\2\1\6"+
            "\1\10\20\uffff\7\4",
            "\1\16",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3\2\uffff"+
            "\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\11\1\15",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3\2\uffff"+
            "\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\17",
            "\1\14\4\uffff\1\13\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3"+
            "\2\uffff\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\14\4\uffff\1\13\1\1\6\uffff\1\3\2\uffff\2\3\1\uffff\2\3"+
            "\3\uffff\2\3\2\uffff\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3\2\uffff"+
            "\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\14\1\uffff\1\11\1\15\1\7\1\13\1\1\6\uffff\1\3\3\uffff\1"+
            "\12\2\uffff\1\3\3\uffff\2\3\2\uffff\1\3\5\4\10\uffff\1\2\1\6"+
            "\1\10\20\uffff\7\4",
            "\1\21\30\uffff\1\20",
            "\1\22",
            "\1\24\4\uffff\1\23",
            "\1\21\30\uffff\1\20",
            "\1\25\4\uffff\1\23\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3"+
            "\2\uffff\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\25\4\uffff\1\23\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\2\3"+
            "\2\uffff\1\3\5\4\10\uffff\1\2\22\uffff\7\4",
            "\1\25\4\uffff\1\23\1\1\6\uffff\1\3\2\uffff\2\3\1\uffff\2\3"+
            "\3\uffff\2\3\2\uffff\1\3\5\4\10\uffff\1\2\22\uffff\7\4"
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
            return "()* loopback of 1050:1: ( (lv_declarations_2_0= ruleDeclaration ) )*";
        }
    }
    static final String DFA24_eotS =
        "\14\uffff";
    static final String DFA24_eofS =
        "\14\uffff";
    static final String DFA24_minS =
        "\1\4\10\0\3\uffff";
    static final String DFA24_maxS =
        "\1\56\10\0\3\uffff";
    static final String DFA24_acceptS =
        "\11\uffff\1\3\1\1\1\2";
    static final String DFA24_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\3\5\uffff\1\1\6\uffff\1\10\1\uffff\1\11\4\uffff\1\4\3\uffff"+
            "\1\5\1\6\2\uffff\1\7\15\uffff\1\2",
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

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "()* loopback of 1068:4: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSCL()) ) {s = 10;}

                        else if ( (synpred33_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_2 = input.LA(1);

                         
                        int index24_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSCL()) ) {s = 10;}

                        else if ( (synpred33_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_3 = input.LA(1);

                         
                        int index24_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSCL()) ) {s = 10;}

                        else if ( (synpred33_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_4 = input.LA(1);

                         
                        int index24_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA24_5 = input.LA(1);

                         
                        int index24_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA24_6 = input.LA(1);

                         
                        int index24_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA24_7 = input.LA(1);

                         
                        int index24_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA24_8 = input.LA(1);

                         
                        int index24_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\21\uffff";
    static final String DFA37_eofS =
        "\21\uffff";
    static final String DFA37_minS =
        "\1\4\1\0\11\uffff\2\0\4\uffff";
    static final String DFA37_maxS =
        "\1\100\1\0\11\uffff\2\0\4\uffff";
    static final String DFA37_acceptS =
        "\2\uffff\1\3\12\uffff\1\1\1\2\1\5\1\4";
    static final String DFA37_specialS =
        "\1\uffff\1\0\11\uffff\1\1\1\2\4\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\1\1\14\4\2\36\uffff\1\2\1\uffff\1\13\12\uffff\1\2\6\uffff"+
            "\1\2\2\uffff\2\2",
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
            "\1\uffff",
            "\1\uffff",
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
            return "1447:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_UnaryOperation_2= ruleUnaryOperation | this_TextEffect_3= ruleTextEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSCL()) ) {s = 13;}

                        else if ( (synpred47_InternalSCL()) ) {s = 14;}

                        else if ( (synpred48_InternalSCL()) ) {s = 2;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_11 = input.LA(1);

                         
                        int index37_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalSCL()) ) {s = 2;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index37_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_12 = input.LA(1);

                         
                        int index37_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalSCL()) ) {s = 2;}

                        else if ( (synpred49_InternalSCL()) ) {s = 16;}

                         
                        input.seek(index37_12);
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
    static final String DFA39_eotS =
        "\16\uffff";
    static final String DFA39_eofS =
        "\16\uffff";
    static final String DFA39_minS =
        "\1\4\1\uffff\13\0\1\uffff";
    static final String DFA39_maxS =
        "\1\100\1\uffff\13\0\1\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\13\uffff\1\2";
    static final String DFA39_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\12\1\14\1\3\1\4\1\7\1\5\36\uffff\1\6\1\uffff\1\13\12\uffff"+
            "\1\10\6\uffff\1\11\2\uffff\1\1\1\2",
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
            return "1595:1: ( ( (lv_expression_0_0= rulePostfixAddExpression ) ) | ( (lv_expression_1_0= rulePostfixSubExpression ) ) )";
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
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index39_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_3 = input.LA(1);

                         
                        int index39_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index39_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA39_4 = input.LA(1);

                         
                        int index39_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index39_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA39_5 = input.LA(1);

                         
                        int index39_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index39_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA39_6 = input.LA(1);

                         
                        int index39_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index39_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA39_7 = input.LA(1);

                         
                        int index39_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index39_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA39_8 = input.LA(1);

                         
                        int index39_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index39_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA39_9 = input.LA(1);

                         
                        int index39_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index39_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA39_10 = input.LA(1);

                         
                        int index39_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index39_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA39_11 = input.LA(1);

                         
                        int index39_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index39_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA39_12 = input.LA(1);

                         
                        int index39_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index39_12);
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
    static final String DFA42_eotS =
        "\20\uffff";
    static final String DFA42_eofS =
        "\20\uffff";
    static final String DFA42_minS =
        "\1\4\15\0\2\uffff";
    static final String DFA42_maxS =
        "\1\100\15\0\2\uffff";
    static final String DFA42_acceptS =
        "\16\uffff\1\1\1\2";
    static final String DFA42_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\2\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\13\1\15\1\4\1\5\1\10\1\6\36\uffff\1\7\1\uffff\1\14\5\uffff"+
            "\1\1\4\uffff\1\11\1\uffff\1\16\4\uffff\1\12\2\uffff\1\2\1\3",
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

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "1794:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_1 = input.LA(1);

                         
                        int index42_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalSCL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_2 = input.LA(1);

                         
                        int index42_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalSCL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_3 = input.LA(1);

                         
                        int index42_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalSCL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA42_4 = input.LA(1);

                         
                        int index42_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalSCL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA42_5 = input.LA(1);

                         
                        int index42_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalSCL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA42_6 = input.LA(1);

                         
                        int index42_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalSCL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA42_7 = input.LA(1);

                         
                        int index42_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalSCL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA42_8 = input.LA(1);

                         
                        int index42_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalSCL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA42_9 = input.LA(1);

                         
                        int index42_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalSCL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA42_10 = input.LA(1);

                         
                        int index42_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalSCL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA42_11 = input.LA(1);

                         
                        int index42_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalSCL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA42_12 = input.LA(1);

                         
                        int index42_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalSCL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA42_13 = input.LA(1);

                         
                        int index42_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalSCL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA52_eotS =
        "\17\uffff";
    static final String DFA52_eofS =
        "\17\uffff";
    static final String DFA52_minS =
        "\1\4\6\uffff\7\0\1\uffff";
    static final String DFA52_maxS =
        "\1\100\6\uffff\7\0\1\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\1\14\uffff\1\2";
    static final String DFA52_specialS =
        "\7\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\13\1\15\2\1\1\10\1\1\36\uffff\1\7\1\uffff\1\14\5\uffff\1"+
            "\1\4\uffff\1\11\1\uffff\1\16\4\uffff\1\12\2\uffff\2\1",
            "",
            "",
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

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "2263:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_7 = input.LA(1);

                         
                        int index52_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index52_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA52_8 = input.LA(1);

                         
                        int index52_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index52_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA52_9 = input.LA(1);

                         
                        int index52_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index52_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA52_10 = input.LA(1);

                         
                        int index52_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index52_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA52_11 = input.LA(1);

                         
                        int index52_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index52_11);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA52_12 = input.LA(1);

                         
                        int index52_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index52_12);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA52_13 = input.LA(1);

                         
                        int index52_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index52_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA63_eotS =
        "\14\uffff";
    static final String DFA63_eofS =
        "\14\uffff";
    static final String DFA63_minS =
        "\1\4\3\uffff\1\0\7\uffff";
    static final String DFA63_maxS =
        "\1\74\3\uffff\1\0\7\uffff";
    static final String DFA63_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\5\uffff\1\4";
    static final String DFA63_specialS =
        "\4\uffff\1\0\7\uffff}>";
    static final String[] DFA63_transitionS = {
            "\2\5\1\1\1\2\1\5\1\3\36\uffff\1\4\1\uffff\1\5\12\uffff\1\5"+
            "\6\uffff\1\5",
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

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "3141:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_4 = input.LA(1);

                         
                        int index63_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index63_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\16\uffff";
    static final String DFA71_eofS =
        "\3\uffff\1\13\4\uffff\1\7\4\uffff\1\13";
    static final String DFA71_minS =
        "\1\12\1\uffff\3\4\1\6\2\uffff\1\4\4\uffff\1\4";
    static final String DFA71_maxS =
        "\1\56\1\uffff\1\4\1\107\1\4\1\7\2\uffff\1\107\4\uffff\1\107";
    static final String DFA71_acceptS =
        "\1\uffff\1\1\4\uffff\1\6\1\3\1\uffff\1\4\1\7\1\2\1\5\1\uffff";
    static final String DFA71_specialS =
        "\16\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\1\43\uffff\1\2",
            "",
            "\1\3",
            "\1\10\1\uffff\1\6\1\12\1\14\1\7\1\13\5\uffff\2\13\3\uffff"+
            "\1\11\2\uffff\1\13\3\uffff\2\13\2\uffff\6\13\10\uffff\1\13\1"+
            "\4\1\5\20\uffff\7\13",
            "\1\15",
            "\1\6\1\12",
            "",
            "",
            "\1\7\4\uffff\2\7\5\uffff\2\7\2\uffff\2\13\1\uffff\1\13\1\7"+
            "\3\uffff\2\7\2\uffff\6\7\10\uffff\1\7\22\uffff\7\7",
            "",
            "",
            "",
            "",
            "\1\10\1\uffff\1\6\1\12\1\14\1\7\1\13\5\uffff\2\13\3\uffff"+
            "\1\11\2\uffff\1\13\3\uffff\2\13\2\uffff\6\13\10\uffff\1\13\1"+
            "\4\1\5\20\uffff\7\13"
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "3768:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )";
        }
    }
 

    public static final BitSet FOLLOW_ruleSCLProgram_in_entryRuleSCLProgram88 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSCLProgram98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleSCLProgram144 = new BitSet(new long[]{0x0000400000010400L});
    public static final BitSet FOLLOW_16_in_ruleSCLProgram157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSCLProgram174 = new BitSet(new long[]{0x0000403E00030400L,0x00000000000000FEL});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleSCLProgram200 = new BitSet(new long[]{0x0000403E00030400L,0x00000000000000FEL});
    public static final BitSet FOLLOW_17_in_ruleSCLProgram213 = new BitSet(new long[]{0x00004001310B0410L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleSCLProgram237 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSCLProgram249 = new BitSet(new long[]{0x00004001310B0410L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleSCLProgram277 = new BitSet(new long[]{0x00004001310B0410L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleSCLProgram301 = new BitSet(new long[]{0x00004001310B0410L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleSCLProgram322 = new BitSet(new long[]{0x00004001310B0410L});
    public static final BitSet FOLLOW_19_in_ruleSCLProgram338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_entryRuleEmptyStatement376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyStatement386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleEmptyStatement432 = new BitSet(new long[]{0x0000400000010410L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmptyStatement451 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEmptyStatement468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_entryRuleInstructionStatement505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstructionStatement515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleInstructionStatement561 = new BitSet(new long[]{0x0000400131030410L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleInstructionStatement585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_ruleInstructionStatement604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_ruleInstructionStatement623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_ruleInstructionStatement642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_ruleInstructionStatement661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementScope_in_ruleInstructionStatement680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment780 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_21_in_ruleAssignment793 = new BitSet(new long[]{0x90A10500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment814 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAssignment826 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_23_in_ruleAssignment840 = new BitSet(new long[]{0x90A10500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditional907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleConditional944 = new BitSet(new long[]{0x90A10500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConditional965 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleConditional977 = new BitSet(new long[]{0x0000403F3D030410L,0x00000000000000FEL});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleConditional998 = new BitSet(new long[]{0x0000403F3D030410L,0x00000000000000FEL});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleConditional1023 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConditional1035 = new BitSet(new long[]{0x000040013D030410L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleConditional1063 = new BitSet(new long[]{0x000040013D030410L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleConditional1087 = new BitSet(new long[]{0x000040013D030410L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleConditional1108 = new BitSet(new long[]{0x000040013D030410L});
    public static final BitSet FOLLOW_26_in_ruleConditional1125 = new BitSet(new long[]{0x0000403F39030410L,0x00000000000000FEL});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleConditional1146 = new BitSet(new long[]{0x0000403F39030410L,0x00000000000000FEL});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleConditional1171 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConditional1183 = new BitSet(new long[]{0x0000400139030410L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleConditional1211 = new BitSet(new long[]{0x0000400139030410L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleConditional1235 = new BitSet(new long[]{0x0000400139030410L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleConditional1256 = new BitSet(new long[]{0x0000400139030410L});
    public static final BitSet FOLLOW_27_in_ruleConditional1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_entryRuleGoto1310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoto1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleGoto1357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoto1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThread_in_entryRuleThread1417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThread1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleThread1488 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleThread1500 = new BitSet(new long[]{0x0000400131030412L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleThread1528 = new BitSet(new long[]{0x0000400131030412L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleThread1552 = new BitSet(new long[]{0x0000400131030412L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleThread1573 = new BitSet(new long[]{0x0000400131030412L});
    public static final BitSet FOLLOW_ruleParallel_in_entryRuleParallel1613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallel1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleParallel1660 = new BitSet(new long[]{0x00004001F1030410L});
    public static final BitSet FOLLOW_ruleThread_in_ruleParallel1682 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_ruleParallel1695 = new BitSet(new long[]{0x00004001F1030410L});
    public static final BitSet FOLLOW_ruleThread_in_ruleParallel1716 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_ruleParallel1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_entryRulePause1767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePause1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePause1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementScope_in_entryRuleStatementScope1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementScope1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStatementScope1921 = new BitSet(new long[]{0x0000403F310B0410L,0x00000000000000FEL});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleStatementScope1942 = new BitSet(new long[]{0x0000403F310B0410L,0x00000000000000FEL});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleStatementScope1967 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStatementScope1979 = new BitSet(new long[]{0x00004001310B0410L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleStatementScope2007 = new BitSet(new long[]{0x00004001310B0410L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleStatementScope2031 = new BitSet(new long[]{0x00004001310B0410L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleStatementScope2052 = new BitSet(new long[]{0x00004001310B0410L});
    public static final BitSet FOLLOW_19_in_ruleStatementScope2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration2106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDeclaration2162 = new BitSet(new long[]{0x0000403E00010400L,0x00000000000000FEL});
    public static final BitSet FOLLOW_33_in_ruleDeclaration2181 = new BitSet(new long[]{0x0000003C00000000L,0x00000000000000FEL});
    public static final BitSet FOLLOW_34_in_ruleDeclaration2213 = new BitSet(new long[]{0x0000003800000000L,0x00000000000000FEL});
    public static final BitSet FOLLOW_35_in_ruleDeclaration2245 = new BitSet(new long[]{0x0000003000000000L,0x00000000000000FEL});
    public static final BitSet FOLLOW_36_in_ruleDeclaration2277 = new BitSet(new long[]{0x0000002000000000L,0x00000000000000FEL});
    public static final BitSet FOLLOW_37_in_ruleDeclaration2311 = new BitSet(new long[]{0x0000002000000000L,0x00000000000000FEL});
    public static final BitSet FOLLOW_ruleValueType_in_ruleDeclaration2346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_37_in_ruleDeclaration2371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValuedObject_in_ruleDeclaration2406 = new BitSet(new long[]{0x0000004000040000L});
    public static final BitSet FOLLOW_38_in_ruleDeclaration2419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValuedObject_in_ruleDeclaration2440 = new BitSet(new long[]{0x0000004000040000L});
    public static final BitSet FOLLOW_18_in_ruleDeclaration2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObject_in_entryRuleValuedObject2490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObject2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObject2542 = new BitSet(new long[]{0x0000008000800002L});
    public static final BitSet FOLLOW_23_in_ruleValuedObject2560 = new BitSet(new long[]{0x90A10500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObject2581 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleValuedObject2596 = new BitSet(new long[]{0x0340200000000000L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleValuedObject2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect2655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_ruleEffect2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleEffect2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_ruleEffect2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCallEffect_in_ruleEffect2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission2870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmission2929 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleEmission2942 = new BitSet(new long[]{0x90A10500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEmission2963 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleEmission2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation3013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixAddExpression_in_ruleUnaryOperation3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixSubExpression_in_ruleUnaryOperation3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect3132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextEffect3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCallEffect_in_entryRuleFunctionCallEffect3223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCallEffect3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleFunctionCallEffect3270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleFunctionCallEffect3291 = new BitSet(new long[]{0x0000190000000000L});
    public static final BitSet FOLLOW_40_in_ruleFunctionCallEffect3305 = new BitSet(new long[]{0x90A12500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCallEffect3326 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_38_in_ruleFunctionCallEffect3339 = new BitSet(new long[]{0x90A12500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCallEffect3360 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_41_in_ruleFunctionCallEffect3374 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_43_in_ruleFunctionCallEffect3393 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleFunctionCallEffect3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleExpression3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression3570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleBoolExpression3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression3663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression3723 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression3757 = new BitSet(new long[]{0x90A10500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression3778 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression3818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression3878 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression3912 = new BitSet(new long[]{0x90A10500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression3933 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression3973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression4033 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrOperator_in_ruleBitwiseOrExpression4067 = new BitSet(new long[]{0x90A10500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression4088 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression4128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression4138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression4188 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndOperator_in_ruleBitwiseAndExpression4222 = new BitSet(new long[]{0x90A10500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression4243 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation4283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation4343 = new BitSet(new long[]{0x001E140000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation4376 = new BitSet(new long[]{0x90A10500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression4435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression4560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression4629 = new BitSet(new long[]{0x90A10500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression4717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression4810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression4870 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression4903 = new BitSet(new long[]{0x90210500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression4924 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression4962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression4972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression5022 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression5055 = new BitSet(new long[]{0x90210500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression5076 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression5114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression5174 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression5207 = new BitSet(new long[]{0x90210500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression5228 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression5266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression5326 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression5359 = new BitSet(new long[]{0x90210500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression5380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression5418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModExpression5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression5478 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression5511 = new BitSet(new long[]{0x90210500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression5570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression5639 = new BitSet(new long[]{0x90210500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression5660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixAddExpression_in_ruleNegExpression5692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixAddExpression_in_entryRulePostfixAddExpression5727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfixAddExpression5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixAdd_in_rulePostfixAddExpression5796 = new BitSet(new long[]{0x90210500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_rulePostfixAddExpression_in_rulePostfixAddExpression5817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixSubExpression_in_rulePostfixAddExpression5849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixSubExpression_in_entryRulePostfixSubExpression5884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfixSubExpression5894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixSub_in_rulePostfixSubExpression5953 = new BitSet(new long[]{0x90210500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_rulePostfixSubExpression_in_rulePostfixSubExpression5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rulePostfixSubExpression6006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression6041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression6051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolValue_in_ruleAtomicExpression6101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression6131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAtomicExpression6149 = new BitSet(new long[]{0x90A10500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleAtomicExpression6174 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleAtomicExpression6185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleAtomicExpression6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression6282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression6342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleAtomicValuedExpression6402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAtomicValuedExpression6420 = new BitSet(new long[]{0x90210500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression6445 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleAtomicValuedExpression6456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression6488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression6523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression6533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression6594 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression6613 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleValuedObjectTestExpression6628 = new BitSet(new long[]{0x1020000000000010L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression6649 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleValuedObjectTestExpression6661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression6693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference6728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference6738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference6787 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleValuedObjectReference6800 = new BitSet(new long[]{0x90A10500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObjectReference6821 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleValuedObjectReference6833 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall6871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleFunctionCall6918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleFunctionCall6939 = new BitSet(new long[]{0x0000190000000000L});
    public static final BitSet FOLLOW_40_in_ruleFunctionCall6953 = new BitSet(new long[]{0x90A12500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall6974 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_38_in_ruleFunctionCall6987 = new BitSet(new long[]{0x90A12500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall7008 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_41_in_ruleFunctionCall7022 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_43_in_ruleFunctionCall7041 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleFunctionCall7055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter7091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleParameter7145 = new BitSet(new long[]{0x90A12500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_45_in_ruleParameter7176 = new BitSet(new long[]{0x90A10500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParameter7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression7249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression7259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression7300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue7340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue7350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue7431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue7441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue7482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolValue_in_entryRuleBoolValue7522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolValue7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBoolValue7573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue7613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue7623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue7664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation7706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation7716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation7766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation7796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation7826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation7856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation7886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation7916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation7983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation7993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation8034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation8074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation8084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTagAnnotation8121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation8142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation8178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation8188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleKeyStringValueAnnotation8225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation8246 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation8267 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation8304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTypedKeyStringValueAnnotation8351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation8372 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTypedKeyStringValueAnnotation8384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation8405 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTypedKeyStringValueAnnotation8417 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation8438 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation8475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation8485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleKeyBooleanValueAnnotation8522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation8543 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation8560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation8601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation8611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleKeyIntValueAnnotation8648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation8669 = new BitSet(new long[]{0x0001000000000040L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation8690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation8726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation8736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleKeyFloatValueAnnotation8773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation8794 = new BitSet(new long[]{0x0001000000000080L});
    public static final BitSet FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation8815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString8854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString8865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString8905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString8931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID8977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID8988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID9028 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleExtendedID9047 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID9062 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger9110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger9121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleInteger9160 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInteger9177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloateger_in_entryRuleFloateger9223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloateger9234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleFloateger9273 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloateger9290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleCompareOperator9349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCompareOperator9366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCompareOperator9383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCompareOperator9400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCompareOperator9417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCompareOperator9434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePreOperator9478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBitwiseOrOperator9521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleBitwiseAndOperator9564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleNotOperator9607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleAddOperator9650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSubOperator9693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleMultOperator9736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleModOperator9779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleDivOperator9822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleValOperator9865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleLogicalOrOperator9908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleLogicalAndOperator9951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePostfixAdd9994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePostfixSub10037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleValueType10081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleValueType10098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleValueType10115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleValueType10132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleValueType10149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleValueType10166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleValueType10183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleCombineOperator10230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleCombineOperator10247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCombineOperator10264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleCombineOperator10281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleCombineOperator10298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleCombineOperator10315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCombineOperator10332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleCombineOperator10349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred3_InternalSCL237 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred3_InternalSCL249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred4_InternalSCL277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred16_InternalSCL1023 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred16_InternalSCL1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred17_InternalSCL1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred21_InternalSCL1171 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred21_InternalSCL1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred22_InternalSCL1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred26_InternalSCL1488 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred26_InternalSCL1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred27_InternalSCL1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred32_InternalSCL1967 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred32_InternalSCL1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred33_InternalSCL2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_synpred46_InternalSCL2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_synpred47_InternalSCL2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_synpred48_InternalSCL2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_synpred49_InternalSCL2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixAddExpression_in_synpred51_InternalSCL3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_synpred55_InternalSCL3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred65_InternalSCL4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred82_InternalSCL6420 = new BitSet(new long[]{0x90210500000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred82_InternalSCL6445 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_synpred82_InternalSCL6456 = new BitSet(new long[]{0x0000000000000002L});

}