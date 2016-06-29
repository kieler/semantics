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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HOSTCODE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "';'", "'}'", "':'", "'['", "']'", "'='", "'if'", "'then'", "'else'", "'end'", "'goto'", "'thread'", "'fork'", "'par'", "'join'", "'pause'", "'scope'", "'expression'", "'const'", "'input'", "'output'", "'static'", "'signal'", "','", "'&'", "'combine'", "'('", "')'", "'()'", "'.'", "'!'", "'@'", "'#'", "'-'", "'++'", "'--'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'pre'", "'|'", "'+'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'string'", "'host'", "'none'", "'max'", "'min'"
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
    public static final int RULE_HOSTCODE=6;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
    public static final int T__78=78;
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
            this.state.ruleMemo = new HashMap[318+1];
             
             
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
    // InternalSCL.g:84:1: ruleSCLProgram returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '{' ( ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )? ) otherlv_10= '}' ) ;
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
            // InternalSCL.g:87:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '{' ( ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )? ) otherlv_10= '}' ) )
            // InternalSCL.g:88:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '{' ( ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )? ) otherlv_10= '}' )
            {
            // InternalSCL.g:88:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '{' ( ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )? ) otherlv_10= '}' )
            // InternalSCL.g:88:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '{' ( ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )? ) otherlv_10= '}'
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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
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

            // InternalSCL.g:128:2: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMENT_ANNOTATION||(LA2_0>=36 && LA2_0<=40)||LA2_0==42||LA2_0==49||(LA2_0>=69 && LA2_0<=75)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSCL.g:129:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // InternalSCL.g:129:1: (lv_declarations_3_0= ruleDeclaration )
            	    // InternalSCL.g:130:3: lv_declarations_3_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCLProgramAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_5);
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
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSCLProgramAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // InternalSCL.g:150:1: ( ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )? )
            // InternalSCL.g:150:2: ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )?
            {
            // InternalSCL.g:150:2: ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )*
            loop3:
            do {
                int alt3=3;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalSCL.g:150:3: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
            	    {
            	    // InternalSCL.g:150:3: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
            	    // InternalSCL.g:150:4: ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';'
            	    {
            	    // InternalSCL.g:150:4: ( (lv_statements_5_0= ruleInstructionStatement ) )
            	    // InternalSCL.g:151:1: (lv_statements_5_0= ruleInstructionStatement )
            	    {
            	    // InternalSCL.g:151:1: (lv_statements_5_0= ruleInstructionStatement )
            	    // InternalSCL.g:152:3: lv_statements_5_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCLProgramAccess().getStatementsInstructionStatementParserRuleCall_5_0_0_0_0()); 
            	      	    
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

            	    otherlv_6=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getSCLProgramAccess().getSemicolonKeyword_5_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSCL.g:173:6: ( (lv_statements_7_0= ruleEmptyStatement ) )
            	    {
            	    // InternalSCL.g:173:6: ( (lv_statements_7_0= ruleEmptyStatement ) )
            	    // InternalSCL.g:174:1: (lv_statements_7_0= ruleEmptyStatement )
            	    {
            	    // InternalSCL.g:174:1: (lv_statements_7_0= ruleEmptyStatement )
            	    // InternalSCL.g:175:3: lv_statements_7_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCLProgramAccess().getStatementsEmptyStatementParserRuleCall_5_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_6);
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
            	              		"de.cau.cs.kieler.scl.SCL.EmptyStatement");
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

            // InternalSCL.g:191:4: ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||LA5_0==RULE_COMMENT_ANNOTATION||LA5_0==17||LA5_0==24||LA5_0==28||LA5_0==30||LA5_0==33||LA5_0==49) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSCL.g:191:5: ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )*
                    {
                    // InternalSCL.g:191:5: ( (lv_statements_8_0= ruleInstructionStatement ) )
                    // InternalSCL.g:192:1: (lv_statements_8_0= ruleInstructionStatement )
                    {
                    // InternalSCL.g:192:1: (lv_statements_8_0= ruleInstructionStatement )
                    // InternalSCL.g:193:3: lv_statements_8_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSCLProgramAccess().getStatementsInstructionStatementParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_6);
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
                              		"de.cau.cs.kieler.scl.SCL.InstructionStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSCL.g:209:2: ( (lv_statements_9_0= ruleEmptyStatement ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID||LA4_0==RULE_COMMENT_ANNOTATION||LA4_0==49) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSCL.g:210:1: (lv_statements_9_0= ruleEmptyStatement )
                    	    {
                    	    // InternalSCL.g:210:1: (lv_statements_9_0= ruleEmptyStatement )
                    	    // InternalSCL.g:211:3: lv_statements_9_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSCLProgramAccess().getStatementsEmptyStatementParserRuleCall_5_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_6);
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
                    	              		"de.cau.cs.kieler.scl.SCL.EmptyStatement");
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

            otherlv_10=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalSCL.g:239:1: entryRuleEmptyStatement returns [EObject current=null] : iv_ruleEmptyStatement= ruleEmptyStatement EOF ;
    public final EObject entryRuleEmptyStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleEmptyStatement_StartIndex = input.index();
        EObject iv_ruleEmptyStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return current; }
            // InternalSCL.g:240:2: (iv_ruleEmptyStatement= ruleEmptyStatement EOF )
            // InternalSCL.g:241:2: iv_ruleEmptyStatement= ruleEmptyStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEmptyStatement=ruleEmptyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalSCL.g:248:1: ruleEmptyStatement returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) ) ;
    public final EObject ruleEmptyStatement() throws RecognitionException {
        EObject current = null;
        int ruleEmptyStatement_StartIndex = input.index();
        Token lv_label_1_0=null;
        Token otherlv_2=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return current; }
            // InternalSCL.g:251:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) ) )
            // InternalSCL.g:252:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) )
            {
            // InternalSCL.g:252:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) )
            // InternalSCL.g:252:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' )
            {
            // InternalSCL.g:252:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMENT_ANNOTATION||LA6_0==49) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSCL.g:253:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:253:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:254:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmptyStatementAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_8);
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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalSCL.g:270:3: ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' )
            // InternalSCL.g:270:4: ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':'
            {
            // InternalSCL.g:270:4: ( (lv_label_1_0= RULE_ID ) )
            // InternalSCL.g:271:1: (lv_label_1_0= RULE_ID )
            {
            // InternalSCL.g:271:1: (lv_label_1_0= RULE_ID )
            // InternalSCL.g:272:3: lv_label_1_0= RULE_ID
            {
            lv_label_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleInstruction"
    // InternalSCL.g:300:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;
        int entryRuleInstruction_StartIndex = input.index();
        EObject iv_ruleInstruction = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return current; }
            // InternalSCL.g:301:2: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalSCL.g:302:2: iv_ruleInstruction= ruleInstruction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstruction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, entryRuleInstruction_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalSCL.g:309:1: ruleInstruction returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Goto_2= ruleGoto | this_Parallel_3= ruleParallel | this_Pause_4= rulePause | this_StatementScope_5= ruleStatementScope ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;
        int ruleInstruction_StartIndex = input.index();
        EObject this_Assignment_0 = null;

        EObject this_Conditional_1 = null;

        EObject this_Goto_2 = null;

        EObject this_Parallel_3 = null;

        EObject this_Pause_4 = null;

        EObject this_StatementScope_5 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return current; }
            // InternalSCL.g:312:28: ( (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Goto_2= ruleGoto | this_Parallel_3= ruleParallel | this_Pause_4= rulePause | this_StatementScope_5= ruleStatementScope ) )
            // InternalSCL.g:313:1: (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Goto_2= ruleGoto | this_Parallel_3= ruleParallel | this_Pause_4= rulePause | this_StatementScope_5= ruleStatementScope )
            {
            // InternalSCL.g:313:1: (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Goto_2= ruleGoto | this_Parallel_3= ruleParallel | this_Pause_4= rulePause | this_StatementScope_5= ruleStatementScope )
            int alt7=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 30:
                {
                alt7=4;
                }
                break;
            case 33:
                {
                alt7=5;
                }
                break;
            case 17:
                {
                alt7=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSCL.g:314:2: this_Assignment_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getAssignmentParserRuleCall_0()); 
                          
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
                    // InternalSCL.g:327:2: this_Conditional_1= ruleConditional
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getConditionalParserRuleCall_1()); 
                          
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
                    // InternalSCL.g:340:2: this_Goto_2= ruleGoto
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getGotoParserRuleCall_2()); 
                          
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
                    // InternalSCL.g:353:2: this_Parallel_3= ruleParallel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getParallelParserRuleCall_3()); 
                          
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
                    // InternalSCL.g:366:2: this_Pause_4= rulePause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getPauseParserRuleCall_4()); 
                          
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
                case 6 :
                    // InternalSCL.g:379:2: this_StatementScope_5= ruleStatementScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getStatementScopeParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_StatementScope_5=ruleStatementScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StatementScope_5; 
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
            if ( state.backtracking>0 ) { memoize(input, 6, ruleInstruction_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleInstructionStatement"
    // InternalSCL.g:398:1: entryRuleInstructionStatement returns [EObject current=null] : iv_ruleInstructionStatement= ruleInstructionStatement EOF ;
    public final EObject entryRuleInstructionStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleInstructionStatement_StartIndex = input.index();
        EObject iv_ruleInstructionStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return current; }
            // InternalSCL.g:399:2: (iv_ruleInstructionStatement= ruleInstructionStatement EOF )
            // InternalSCL.g:400:2: iv_ruleInstructionStatement= ruleInstructionStatement EOF
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
            if ( state.backtracking>0 ) { memoize(input, 7, entryRuleInstructionStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleInstructionStatement"


    // $ANTLR start "ruleInstructionStatement"
    // InternalSCL.g:407:1: ruleInstructionStatement returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_instruction_1_0= ruleInstruction ) ) ) ;
    public final EObject ruleInstructionStatement() throws RecognitionException {
        EObject current = null;
        int ruleInstructionStatement_StartIndex = input.index();
        EObject lv_annotations_0_0 = null;

        EObject lv_instruction_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return current; }
            // InternalSCL.g:410:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_instruction_1_0= ruleInstruction ) ) ) )
            // InternalSCL.g:411:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_instruction_1_0= ruleInstruction ) ) )
            {
            // InternalSCL.g:411:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_instruction_1_0= ruleInstruction ) ) )
            // InternalSCL.g:411:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_instruction_1_0= ruleInstruction ) )
            {
            // InternalSCL.g:411:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMENT_ANNOTATION||LA8_0==49) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSCL.g:412:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:412:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:413:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_10);
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

            // InternalSCL.g:429:3: ( (lv_instruction_1_0= ruleInstruction ) )
            // InternalSCL.g:430:1: (lv_instruction_1_0= ruleInstruction )
            {
            // InternalSCL.g:430:1: (lv_instruction_1_0= ruleInstruction )
            // InternalSCL.g:431:3: lv_instruction_1_0= ruleInstruction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionInstructionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_instruction_1_0=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
              	        }
                     		set(
                     			current, 
                     			"instruction",
                      		lv_instruction_1_0, 
                      		"de.cau.cs.kieler.scl.SCL.Instruction");
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
            if ( state.backtracking>0 ) { memoize(input, 8, ruleInstructionStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleInstructionStatement"


    // $ANTLR start "entryRuleAssignment"
    // InternalSCL.g:455:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;
        int entryRuleAssignment_StartIndex = input.index();
        EObject iv_ruleAssignment = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return current; }
            // InternalSCL.g:456:2: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalSCL.g:457:2: iv_ruleAssignment= ruleAssignment EOF
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
            if ( state.backtracking>0 ) { memoize(input, 9, entryRuleAssignment_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalSCL.g:464:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return current; }
            // InternalSCL.g:467:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) )
            // InternalSCL.g:468:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )
            {
            // InternalSCL.g:468:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )
            // InternalSCL.g:468:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
            {
            // InternalSCL.g:468:2: ( (otherlv_0= RULE_ID ) )
            // InternalSCL.g:469:1: (otherlv_0= RULE_ID )
            {
            // InternalSCL.g:469:1: (otherlv_0= RULE_ID )
            // InternalSCL.g:470:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalSCL.g:484:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSCL.g:484:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // InternalSCL.g:488:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalSCL.g:489:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalSCL.g:489:1: (lv_indices_2_0= ruleExpression )
            	    // InternalSCL.g:490:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_13);
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
            	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,22,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalSCL.g:514:1: ( (lv_expression_5_0= ruleExpression ) )
            // InternalSCL.g:515:1: (lv_expression_5_0= ruleExpression )
            {
            // InternalSCL.g:515:1: (lv_expression_5_0= ruleExpression )
            // InternalSCL.g:516:3: lv_expression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 10, ruleAssignment_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleConditional"
    // InternalSCL.g:540:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;
        int entryRuleConditional_StartIndex = input.index();
        EObject iv_ruleConditional = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return current; }
            // InternalSCL.g:541:2: (iv_ruleConditional= ruleConditional EOF )
            // InternalSCL.g:542:2: iv_ruleConditional= ruleConditional EOF
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
            if ( state.backtracking>0 ) { memoize(input, 11, entryRuleConditional_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalSCL.g:549:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return current; }
            // InternalSCL.g:552:28: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end' ) )
            // InternalSCL.g:553:1: (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end' )
            {
            // InternalSCL.g:553:1: (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end' )
            // InternalSCL.g:553:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getIfKeyword_0());
                  
            }
            // InternalSCL.g:557:1: ( (lv_expression_1_0= ruleExpression ) )
            // InternalSCL.g:558:1: (lv_expression_1_0= ruleExpression )
            {
            // InternalSCL.g:558:1: (lv_expression_1_0= ruleExpression )
            // InternalSCL.g:559:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
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
                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getThenKeyword_2());
                  
            }
            // InternalSCL.g:579:1: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalSCL.g:580:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // InternalSCL.g:580:1: (lv_declarations_3_0= ruleDeclaration )
            	    // InternalSCL.g:581:3: lv_declarations_3_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_15);
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
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalSCL.g:597:3: ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? )
            // InternalSCL.g:597:4: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )?
            {
            // InternalSCL.g:597:4: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )*
            loop11:
            do {
                int alt11=3;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalSCL.g:597:5: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
            	    {
            	    // InternalSCL.g:597:5: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
            	    // InternalSCL.g:597:6: ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';'
            	    {
            	    // InternalSCL.g:597:6: ( (lv_statements_4_0= ruleInstructionStatement ) )
            	    // InternalSCL.g:598:1: (lv_statements_4_0= ruleInstructionStatement )
            	    {
            	    // InternalSCL.g:598:1: (lv_statements_4_0= ruleInstructionStatement )
            	    // InternalSCL.g:599:3: lv_statements_4_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsInstructionStatementParserRuleCall_4_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_7);
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
            	              		"de.cau.cs.kieler.scl.SCL.InstructionStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,18,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getConditionalAccess().getSemicolonKeyword_4_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSCL.g:620:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
            	    {
            	    // InternalSCL.g:620:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
            	    // InternalSCL.g:621:1: (lv_statements_6_0= ruleEmptyStatement )
            	    {
            	    // InternalSCL.g:621:1: (lv_statements_6_0= ruleEmptyStatement )
            	    // InternalSCL.g:622:3: lv_statements_6_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsEmptyStatementParserRuleCall_4_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_16);
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
            	              		"de.cau.cs.kieler.scl.SCL.EmptyStatement");
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

            // InternalSCL.g:638:4: ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==RULE_COMMENT_ANNOTATION||LA13_0==17||LA13_0==24||LA13_0==28||LA13_0==30||LA13_0==33||LA13_0==49) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSCL.g:638:5: ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )*
                    {
                    // InternalSCL.g:638:5: ( (lv_statements_7_0= ruleInstructionStatement ) )
                    // InternalSCL.g:639:1: (lv_statements_7_0= ruleInstructionStatement )
                    {
                    // InternalSCL.g:639:1: (lv_statements_7_0= ruleInstructionStatement )
                    // InternalSCL.g:640:3: lv_statements_7_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsInstructionStatementParserRuleCall_4_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
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
                              		"de.cau.cs.kieler.scl.SCL.InstructionStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSCL.g:656:2: ( (lv_statements_8_0= ruleEmptyStatement ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID||LA12_0==RULE_COMMENT_ANNOTATION||LA12_0==49) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSCL.g:657:1: (lv_statements_8_0= ruleEmptyStatement )
                    	    {
                    	    // InternalSCL.g:657:1: (lv_statements_8_0= ruleEmptyStatement )
                    	    // InternalSCL.g:658:3: lv_statements_8_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsEmptyStatementParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_16);
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
                    	              		"de.cau.cs.kieler.scl.SCL.EmptyStatement");
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

            // InternalSCL.g:674:6: (otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSCL.g:674:8: otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? )
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getConditionalAccess().getElseKeyword_5_0());
                          
                    }
                    // InternalSCL.g:678:1: ( (lv_declarations_10_0= ruleDeclaration ) )*
                    loop14:
                    do {
                        int alt14=2;
                        alt14 = dfa14.predict(input);
                        switch (alt14) {
                    	case 1 :
                    	    // InternalSCL.g:679:1: (lv_declarations_10_0= ruleDeclaration )
                    	    {
                    	    // InternalSCL.g:679:1: (lv_declarations_10_0= ruleDeclaration )
                    	    // InternalSCL.g:680:3: lv_declarations_10_0= ruleDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getDeclarationsDeclarationParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_17);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.Declaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // InternalSCL.g:696:3: ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? )
                    // InternalSCL.g:696:4: ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )?
                    {
                    // InternalSCL.g:696:4: ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        alt15 = dfa15.predict(input);
                        switch (alt15) {
                    	case 1 :
                    	    // InternalSCL.g:696:5: ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' )
                    	    {
                    	    // InternalSCL.g:696:5: ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' )
                    	    // InternalSCL.g:696:6: ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';'
                    	    {
                    	    // InternalSCL.g:696:6: ( (lv_elseStatements_11_0= ruleInstructionStatement ) )
                    	    // InternalSCL.g:697:1: (lv_elseStatements_11_0= ruleInstructionStatement )
                    	    {
                    	    // InternalSCL.g:697:1: (lv_elseStatements_11_0= ruleInstructionStatement )
                    	    // InternalSCL.g:698:3: lv_elseStatements_11_0= ruleInstructionStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsInstructionStatementParserRuleCall_5_2_0_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_7);
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
                    	              		"de.cau.cs.kieler.scl.SCL.InstructionStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_12, grammarAccess.getConditionalAccess().getSemicolonKeyword_5_2_0_0_1());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSCL.g:719:6: ( (lv_elseStatements_13_0= ruleEmptyStatement ) )
                    	    {
                    	    // InternalSCL.g:719:6: ( (lv_elseStatements_13_0= ruleEmptyStatement ) )
                    	    // InternalSCL.g:720:1: (lv_elseStatements_13_0= ruleEmptyStatement )
                    	    {
                    	    // InternalSCL.g:720:1: (lv_elseStatements_13_0= ruleEmptyStatement )
                    	    // InternalSCL.g:721:3: lv_elseStatements_13_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsEmptyStatementParserRuleCall_5_2_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_18);
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
                    	              		"de.cau.cs.kieler.scl.SCL.EmptyStatement");
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

                    // InternalSCL.g:737:4: ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID||LA17_0==RULE_COMMENT_ANNOTATION||LA17_0==17||LA17_0==24||LA17_0==28||LA17_0==30||LA17_0==33||LA17_0==49) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalSCL.g:737:5: ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )*
                            {
                            // InternalSCL.g:737:5: ( (lv_elseStatements_14_0= ruleInstructionStatement ) )
                            // InternalSCL.g:738:1: (lv_elseStatements_14_0= ruleInstructionStatement )
                            {
                            // InternalSCL.g:738:1: (lv_elseStatements_14_0= ruleInstructionStatement )
                            // InternalSCL.g:739:3: lv_elseStatements_14_0= ruleInstructionStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsInstructionStatementParserRuleCall_5_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_18);
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
                                      		"de.cau.cs.kieler.scl.SCL.InstructionStatement");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalSCL.g:755:2: ( (lv_elseStatements_15_0= ruleEmptyStatement ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==RULE_ID||LA16_0==RULE_COMMENT_ANNOTATION||LA16_0==49) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // InternalSCL.g:756:1: (lv_elseStatements_15_0= ruleEmptyStatement )
                            	    {
                            	    // InternalSCL.g:756:1: (lv_elseStatements_15_0= ruleEmptyStatement )
                            	    // InternalSCL.g:757:3: lv_elseStatements_15_0= ruleEmptyStatement
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsEmptyStatementParserRuleCall_5_2_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_18);
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
                            	              		"de.cau.cs.kieler.scl.SCL.EmptyStatement");
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

            otherlv_16=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 12, ruleConditional_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleGoto"
    // InternalSCL.g:785:1: entryRuleGoto returns [EObject current=null] : iv_ruleGoto= ruleGoto EOF ;
    public final EObject entryRuleGoto() throws RecognitionException {
        EObject current = null;
        int entryRuleGoto_StartIndex = input.index();
        EObject iv_ruleGoto = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return current; }
            // InternalSCL.g:786:2: (iv_ruleGoto= ruleGoto EOF )
            // InternalSCL.g:787:2: iv_ruleGoto= ruleGoto EOF
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
    // InternalSCL.g:794:1: ruleGoto returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGoto() throws RecognitionException {
        EObject current = null;
        int ruleGoto_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_targetLabel_1_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return current; }
            // InternalSCL.g:797:28: ( (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) ) )
            // InternalSCL.g:798:1: (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) )
            {
            // InternalSCL.g:798:1: (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) )
            // InternalSCL.g:798:3: otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGotoAccess().getGotoKeyword_0());
                  
            }
            // InternalSCL.g:802:1: ( (lv_targetLabel_1_0= RULE_ID ) )
            // InternalSCL.g:803:1: (lv_targetLabel_1_0= RULE_ID )
            {
            // InternalSCL.g:803:1: (lv_targetLabel_1_0= RULE_ID )
            // InternalSCL.g:804:3: lv_targetLabel_1_0= RULE_ID
            {
            lv_targetLabel_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
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


    // $ANTLR start "entryRuleThread"
    // InternalSCL.g:828:1: entryRuleThread returns [EObject current=null] : iv_ruleThread= ruleThread EOF ;
    public final EObject entryRuleThread() throws RecognitionException {
        EObject current = null;
        int entryRuleThread_StartIndex = input.index();
        EObject iv_ruleThread = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return current; }
            // InternalSCL.g:829:2: (iv_ruleThread= ruleThread EOF )
            // InternalSCL.g:830:2: iv_ruleThread= ruleThread EOF
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
            if ( state.backtracking>0 ) { memoize(input, 15, entryRuleThread_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleThread"


    // $ANTLR start "ruleThread"
    // InternalSCL.g:837:1: ruleThread returns [EObject current=null] : ( () ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'thread' )? ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) ) ;
    public final EObject ruleThread() throws RecognitionException {
        EObject current = null;
        int ruleThread_StartIndex = input.index();
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_statements_6_0 = null;

        EObject lv_statements_7_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return current; }
            // InternalSCL.g:840:28: ( ( () ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'thread' )? ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) ) )
            // InternalSCL.g:841:1: ( () ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'thread' )? ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) )
            {
            // InternalSCL.g:841:1: ( () ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'thread' )? ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) )
            // InternalSCL.g:841:2: () ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'thread' )? ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? )
            {
            // InternalSCL.g:841:2: ()
            // InternalSCL.g:842:2: 
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

            // InternalSCL.g:850:2: ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'thread' )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalSCL.g:850:3: ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'thread'
                    {
                    // InternalSCL.g:850:3: ( (lv_annotations_1_0= ruleAnnotation ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_COMMENT_ANNOTATION||LA19_0==49) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalSCL.g:851:1: (lv_annotations_1_0= ruleAnnotation )
                    	    {
                    	    // InternalSCL.g:851:1: (lv_annotations_1_0= ruleAnnotation )
                    	    // InternalSCL.g:852:3: lv_annotations_1_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getThreadAccess().getAnnotationsAnnotationParserRuleCall_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_19);
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
                    	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_2=(Token)match(input,29,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getThreadAccess().getThreadKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // InternalSCL.g:872:3: ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? )
            // InternalSCL.g:872:4: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )?
            {
            // InternalSCL.g:872:4: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )*
            loop21:
            do {
                int alt21=3;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // InternalSCL.g:872:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
            	    {
            	    // InternalSCL.g:872:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
            	    // InternalSCL.g:872:6: ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';'
            	    {
            	    // InternalSCL.g:872:6: ( (lv_statements_3_0= ruleInstructionStatement ) )
            	    // InternalSCL.g:873:1: (lv_statements_3_0= ruleInstructionStatement )
            	    {
            	    // InternalSCL.g:873:1: (lv_statements_3_0= ruleInstructionStatement )
            	    // InternalSCL.g:874:3: lv_statements_3_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_2_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_statements_3_0=ruleInstructionStatement();

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
            	              		"de.cau.cs.kieler.scl.SCL.InstructionStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,18,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getThreadAccess().getSemicolonKeyword_2_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSCL.g:895:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
            	    {
            	    // InternalSCL.g:895:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
            	    // InternalSCL.g:896:1: (lv_statements_5_0= ruleEmptyStatement )
            	    {
            	    // InternalSCL.g:896:1: (lv_statements_5_0= ruleEmptyStatement )
            	    // InternalSCL.g:897:3: lv_statements_5_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsEmptyStatementParserRuleCall_2_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_20);
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
            	              		"de.cau.cs.kieler.scl.SCL.EmptyStatement");
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

            // InternalSCL.g:913:4: ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||LA23_0==RULE_COMMENT_ANNOTATION||LA23_0==17||LA23_0==24||LA23_0==28||LA23_0==30||LA23_0==33||LA23_0==49) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSCL.g:913:5: ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )*
                    {
                    // InternalSCL.g:913:5: ( (lv_statements_6_0= ruleInstructionStatement ) )
                    // InternalSCL.g:914:1: (lv_statements_6_0= ruleInstructionStatement )
                    {
                    // InternalSCL.g:914:1: (lv_statements_6_0= ruleInstructionStatement )
                    // InternalSCL.g:915:3: lv_statements_6_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_20);
                    lv_statements_6_0=ruleInstructionStatement();

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
                              		"de.cau.cs.kieler.scl.SCL.InstructionStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSCL.g:931:2: ( (lv_statements_7_0= ruleEmptyStatement ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID||LA22_0==RULE_COMMENT_ANNOTATION||LA22_0==49) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSCL.g:932:1: (lv_statements_7_0= ruleEmptyStatement )
                    	    {
                    	    // InternalSCL.g:932:1: (lv_statements_7_0= ruleEmptyStatement )
                    	    // InternalSCL.g:933:3: lv_statements_7_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsEmptyStatementParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_20);
                    	    lv_statements_7_0=ruleEmptyStatement();

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
                    	              		"de.cau.cs.kieler.scl.SCL.EmptyStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, ruleThread_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleThread"


    // $ANTLR start "entryRuleParallel"
    // InternalSCL.g:957:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;
        int entryRuleParallel_StartIndex = input.index();
        EObject iv_ruleParallel = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return current; }
            // InternalSCL.g:958:2: (iv_ruleParallel= ruleParallel EOF )
            // InternalSCL.g:959:2: iv_ruleParallel= ruleParallel EOF
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
            if ( state.backtracking>0 ) { memoize(input, 17, entryRuleParallel_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleParallel"


    // $ANTLR start "ruleParallel"
    // InternalSCL.g:966:1: ruleParallel returns [EObject current=null] : (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return current; }
            // InternalSCL.g:969:28: ( (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' ) )
            // InternalSCL.g:970:1: (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' )
            {
            // InternalSCL.g:970:1: (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' )
            // InternalSCL.g:970:3: otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParallelAccess().getForkKeyword_0());
                  
            }
            // InternalSCL.g:974:1: ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* )
            // InternalSCL.g:974:2: ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )*
            {
            // InternalSCL.g:974:2: ( (lv_threads_1_0= ruleThread ) )
            // InternalSCL.g:975:1: (lv_threads_1_0= ruleThread )
            {
            // InternalSCL.g:975:1: (lv_threads_1_0= ruleThread )
            // InternalSCL.g:976:3: lv_threads_1_0= ruleThread
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParallelAccess().getThreadsThreadParserRuleCall_1_0_0()); 
              	    
            }
            pushFollow(FOLLOW_22);
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

            // InternalSCL.g:992:2: (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSCL.g:992:4: otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParallelAccess().getParKeyword_1_1_0());
            	          
            	    }
            	    // InternalSCL.g:996:1: ( (lv_threads_3_0= ruleThread ) )
            	    // InternalSCL.g:997:1: (lv_threads_3_0= ruleThread )
            	    {
            	    // InternalSCL.g:997:1: (lv_threads_3_0= ruleThread )
            	    // InternalSCL.g:998:3: lv_threads_3_0= ruleThread
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParallelAccess().getThreadsThreadParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_22);
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
            	    break loop24;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 18, ruleParallel_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRulePause"
    // InternalSCL.g:1026:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;
        int entryRulePause_StartIndex = input.index();
        EObject iv_rulePause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return current; }
            // InternalSCL.g:1027:2: (iv_rulePause= rulePause EOF )
            // InternalSCL.g:1028:2: iv_rulePause= rulePause EOF
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
            if ( state.backtracking>0 ) { memoize(input, 19, entryRulePause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePause"


    // $ANTLR start "rulePause"
    // InternalSCL.g:1035:1: rulePause returns [EObject current=null] : (otherlv_0= 'pause' () ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;
        int rulePause_StartIndex = input.index();
        Token otherlv_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return current; }
            // InternalSCL.g:1038:28: ( (otherlv_0= 'pause' () ) )
            // InternalSCL.g:1039:1: (otherlv_0= 'pause' () )
            {
            // InternalSCL.g:1039:1: (otherlv_0= 'pause' () )
            // InternalSCL.g:1039:3: otherlv_0= 'pause' ()
            {
            otherlv_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPauseAccess().getPauseKeyword_0());
                  
            }
            // InternalSCL.g:1043:1: ()
            // InternalSCL.g:1044:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 20, rulePause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePause"


    // $ANTLR start "entryRuleStatementScope"
    // InternalSCL.g:1060:1: entryRuleStatementScope returns [EObject current=null] : iv_ruleStatementScope= ruleStatementScope EOF ;
    public final EObject entryRuleStatementScope() throws RecognitionException {
        EObject current = null;
        int entryRuleStatementScope_StartIndex = input.index();
        EObject iv_ruleStatementScope = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return current; }
            // InternalSCL.g:1061:2: (iv_ruleStatementScope= ruleStatementScope EOF )
            // InternalSCL.g:1062:2: iv_ruleStatementScope= ruleStatementScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatementScope=ruleStatementScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementScope; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, entryRuleStatementScope_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStatementScope"


    // $ANTLR start "ruleStatementScope"
    // InternalSCL.g:1069:1: ruleStatementScope returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return current; }
            // InternalSCL.g:1072:28: ( ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' ) )
            // InternalSCL.g:1073:1: ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' )
            {
            // InternalSCL.g:1073:1: ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' )
            // InternalSCL.g:1073:2: () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}'
            {
            // InternalSCL.g:1073:2: ()
            // InternalSCL.g:1074:2: 
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

            otherlv_1=(Token)match(input,17,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStatementScopeAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalSCL.g:1086:1: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // InternalSCL.g:1087:1: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // InternalSCL.g:1087:1: (lv_declarations_2_0= ruleDeclaration )
            	    // InternalSCL.g:1088:3: lv_declarations_2_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_23);
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
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalSCL.g:1104:3: ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? )
            // InternalSCL.g:1104:4: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )?
            {
            // InternalSCL.g:1104:4: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )*
            loop26:
            do {
                int alt26=3;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // InternalSCL.g:1104:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
            	    {
            	    // InternalSCL.g:1104:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
            	    // InternalSCL.g:1104:6: ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';'
            	    {
            	    // InternalSCL.g:1104:6: ( (lv_statements_3_0= ruleInstructionStatement ) )
            	    // InternalSCL.g:1105:1: (lv_statements_3_0= ruleInstructionStatement )
            	    {
            	    // InternalSCL.g:1105:1: (lv_statements_3_0= ruleInstructionStatement )
            	    // InternalSCL.g:1106:3: lv_statements_3_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsInstructionStatementParserRuleCall_3_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_7);
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
            	              		"de.cau.cs.kieler.scl.SCL.InstructionStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getStatementScopeAccess().getSemicolonKeyword_3_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSCL.g:1127:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
            	    {
            	    // InternalSCL.g:1127:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
            	    // InternalSCL.g:1128:1: (lv_statements_5_0= ruleEmptyStatement )
            	    {
            	    // InternalSCL.g:1128:1: (lv_statements_5_0= ruleEmptyStatement )
            	    // InternalSCL.g:1129:3: lv_statements_5_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsEmptyStatementParserRuleCall_3_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_6);
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
            	              		"de.cau.cs.kieler.scl.SCL.EmptyStatement");
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

            // InternalSCL.g:1145:4: ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID||LA28_0==RULE_COMMENT_ANNOTATION||LA28_0==17||LA28_0==24||LA28_0==28||LA28_0==30||LA28_0==33||LA28_0==49) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSCL.g:1145:5: ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )*
                    {
                    // InternalSCL.g:1145:5: ( (lv_statements_6_0= ruleInstructionStatement ) )
                    // InternalSCL.g:1146:1: (lv_statements_6_0= ruleInstructionStatement )
                    {
                    // InternalSCL.g:1146:1: (lv_statements_6_0= ruleInstructionStatement )
                    // InternalSCL.g:1147:3: lv_statements_6_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsInstructionStatementParserRuleCall_3_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_6);
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
                              		"de.cau.cs.kieler.scl.SCL.InstructionStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSCL.g:1163:2: ( (lv_statements_7_0= ruleEmptyStatement ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_ID||LA27_0==RULE_COMMENT_ANNOTATION||LA27_0==49) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalSCL.g:1164:1: (lv_statements_7_0= ruleEmptyStatement )
                    	    {
                    	    // InternalSCL.g:1164:1: (lv_statements_7_0= ruleEmptyStatement )
                    	    // InternalSCL.g:1165:3: lv_statements_7_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsEmptyStatementParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_6);
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
                    	              		"de.cau.cs.kieler.scl.SCL.EmptyStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 22, ruleStatementScope_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStatementScope"


    // $ANTLR start "entryRuleRootScope"
    // InternalSCL.g:1195:1: entryRuleRootScope returns [EObject current=null] : iv_ruleRootScope= ruleRootScope EOF ;
    public final EObject entryRuleRootScope() throws RecognitionException {
        EObject current = null;
        int entryRuleRootScope_StartIndex = input.index();
        EObject iv_ruleRootScope = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return current; }
            // InternalSCL.g:1196:2: (iv_ruleRootScope= ruleRootScope EOF )
            // InternalSCL.g:1197:2: iv_ruleRootScope= ruleRootScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRootScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRootScope=ruleRootScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRootScope; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, entryRuleRootScope_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleRootScope"


    // $ANTLR start "ruleRootScope"
    // InternalSCL.g:1204:1: ruleRootScope returns [EObject current=null] : ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* ) ;
    public final EObject ruleRootScope() throws RecognitionException {
        EObject current = null;
        int ruleRootScope_StartIndex = input.index();
        Token otherlv_3=null;
        EObject lv_declarations_1_0 = null;

        EObject lv_entities_2_0 = null;

        EObject lv_scopes_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return current; }
            // InternalSCL.g:1207:28: ( ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* ) )
            // InternalSCL.g:1208:1: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* )
            {
            // InternalSCL.g:1208:1: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* )
            // InternalSCL.g:1208:2: () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )*
            {
            // InternalSCL.g:1208:2: ()
            // InternalSCL.g:1209:2: 
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

            // InternalSCL.g:1217:2: ( (lv_declarations_1_0= ruleDeclaration ) )*
            loop29:
            do {
                int alt29=2;
                alt29 = dfa29.predict(input);
                switch (alt29) {
            	case 1 :
            	    // InternalSCL.g:1218:1: (lv_declarations_1_0= ruleDeclaration )
            	    {
            	    // InternalSCL.g:1218:1: (lv_declarations_1_0= ruleDeclaration )
            	    // InternalSCL.g:1219:3: lv_declarations_1_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootScopeAccess().getDeclarationsDeclarationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_24);
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
            	    break loop29;
                }
            } while (true);

            // InternalSCL.g:1235:3: ( (lv_entities_2_0= ruleTestEntity ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||LA30_0==RULE_HOSTCODE||LA30_0==RULE_COMMENT_ANNOTATION||LA30_0==35||LA30_0==49) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSCL.g:1236:1: (lv_entities_2_0= ruleTestEntity )
            	    {
            	    // InternalSCL.g:1236:1: (lv_entities_2_0= ruleTestEntity )
            	    // InternalSCL.g:1237:3: lv_entities_2_0= ruleTestEntity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootScopeAccess().getEntitiesTestEntityParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_25);
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
            	    break loop30;
                }
            } while (true);

            // InternalSCL.g:1253:3: (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==34) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSCL.g:1253:5: otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) )
            	    {
            	    otherlv_3=(Token)match(input,34,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRootScopeAccess().getScopeKeyword_3_0());
            	          
            	    }
            	    // InternalSCL.g:1257:1: ( (lv_scopes_4_0= ruleScope ) )
            	    // InternalSCL.g:1258:1: (lv_scopes_4_0= ruleScope )
            	    {
            	    // InternalSCL.g:1258:1: (lv_scopes_4_0= ruleScope )
            	    // InternalSCL.g:1259:3: lv_scopes_4_0= ruleScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootScopeAccess().getScopesScopeParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_27);
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
            	    break loop31;
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
            if ( state.backtracking>0 ) { memoize(input, 24, ruleRootScope_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleRootScope"


    // $ANTLR start "entryRuleScope"
    // InternalSCL.g:1283:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;
        int entryRuleScope_StartIndex = input.index();
        EObject iv_ruleScope = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return current; }
            // InternalSCL.g:1284:2: (iv_ruleScope= ruleScope EOF )
            // InternalSCL.g:1285:2: iv_ruleScope= ruleScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScope; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, entryRuleScope_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalSCL.g:1292:1: ruleScope returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;
        int ruleScope_StartIndex = input.index();
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_declarations_3_0 = null;

        EObject lv_entities_4_0 = null;

        EObject lv_scopes_6_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return current; }
            // InternalSCL.g:1295:28: ( ( () ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' ) )
            // InternalSCL.g:1296:1: ( () ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' )
            {
            // InternalSCL.g:1296:1: ( () ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' )
            // InternalSCL.g:1296:2: () ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}'
            {
            // InternalSCL.g:1296:2: ()
            // InternalSCL.g:1297:2: 
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

            // InternalSCL.g:1305:2: ( (lv_id_1_0= RULE_ID ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSCL.g:1306:1: (lv_id_1_0= RULE_ID )
                    {
                    // InternalSCL.g:1306:1: (lv_id_1_0= RULE_ID )
                    // InternalSCL.g:1307:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getScopeAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalSCL.g:1327:1: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop33:
            do {
                int alt33=2;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // InternalSCL.g:1328:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // InternalSCL.g:1328:1: (lv_declarations_3_0= ruleDeclaration )
            	    // InternalSCL.g:1329:3: lv_declarations_3_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    break loop33;
                }
            } while (true);

            // InternalSCL.g:1345:3: ( (lv_entities_4_0= ruleTestEntity ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||LA34_0==RULE_HOSTCODE||LA34_0==RULE_COMMENT_ANNOTATION||LA34_0==35||LA34_0==49) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSCL.g:1346:1: (lv_entities_4_0= ruleTestEntity )
            	    {
            	    // InternalSCL.g:1346:1: (lv_entities_4_0= ruleTestEntity )
            	    // InternalSCL.g:1347:3: lv_entities_4_0= ruleTestEntity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeAccess().getEntitiesTestEntityParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_30);
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
            	    break loop34;
                }
            } while (true);

            // InternalSCL.g:1363:3: (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==34) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSCL.g:1363:5: otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) )
            	    {
            	    otherlv_5=(Token)match(input,34,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getScopeAccess().getScopeKeyword_5_0());
            	          
            	    }
            	    // InternalSCL.g:1367:1: ( (lv_scopes_6_0= ruleScope ) )
            	    // InternalSCL.g:1368:1: (lv_scopes_6_0= ruleScope )
            	    {
            	    // InternalSCL.g:1368:1: (lv_scopes_6_0= ruleScope )
            	    // InternalSCL.g:1369:3: lv_scopes_6_0= ruleScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeAccess().getScopesScopeParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_31);
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
            	    break loop35;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 26, ruleScope_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleTestEntity"
    // InternalSCL.g:1397:1: entryRuleTestEntity returns [EObject current=null] : iv_ruleTestEntity= ruleTestEntity EOF ;
    public final EObject entryRuleTestEntity() throws RecognitionException {
        EObject current = null;
        int entryRuleTestEntity_StartIndex = input.index();
        EObject iv_ruleTestEntity = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return current; }
            // InternalSCL.g:1398:2: (iv_ruleTestEntity= ruleTestEntity EOF )
            // InternalSCL.g:1399:2: iv_ruleTestEntity= ruleTestEntity EOF
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
    // InternalSCL.g:1406:1: ruleTestEntity returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) ;
    public final EObject ruleTestEntity() throws RecognitionException {
        EObject current = null;
        int ruleTestEntity_StartIndex = input.index();
        EObject lv_expression_0_0 = null;

        EObject lv_effect_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return current; }
            // InternalSCL.g:1409:28: ( ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) )
            // InternalSCL.g:1410:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            {
            // InternalSCL.g:1410:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // InternalSCL.g:1410:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    {
                    // InternalSCL.g:1410:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    // InternalSCL.g:1411:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    {
                    // InternalSCL.g:1411:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    // InternalSCL.g:1412:3: lv_expression_0_0= ruleAnnotatedExpression
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
                              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.AnnotatedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:1429:6: ( (lv_effect_1_0= ruleEffect ) )
                    {
                    // InternalSCL.g:1429:6: ( (lv_effect_1_0= ruleEffect ) )
                    // InternalSCL.g:1430:1: (lv_effect_1_0= ruleEffect )
                    {
                    // InternalSCL.g:1430:1: (lv_effect_1_0= ruleEffect )
                    // InternalSCL.g:1431:3: lv_effect_1_0= ruleEffect
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
            if ( state.backtracking>0 ) { memoize(input, 28, ruleTestEntity_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTestEntity"


    // $ANTLR start "entryRuleAnnotatedExpression"
    // InternalSCL.g:1455:1: entryRuleAnnotatedExpression returns [EObject current=null] : iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF ;
    public final EObject entryRuleAnnotatedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAnnotatedExpression_StartIndex = input.index();
        EObject iv_ruleAnnotatedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return current; }
            // InternalSCL.g:1456:2: (iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF )
            // InternalSCL.g:1457:2: iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF
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
    // InternalSCL.g:1464:1: ruleAnnotatedExpression returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAnnotatedExpression() throws RecognitionException {
        EObject current = null;
        int ruleAnnotatedExpression_StartIndex = input.index();
        Token otherlv_1=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return current; }
            // InternalSCL.g:1467:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalSCL.g:1468:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalSCL.g:1468:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalSCL.g:1468:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalSCL.g:1468:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_COMMENT_ANNOTATION||LA37_0==49) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSCL.g:1469:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:1469:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:1470:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotatedExpressionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_32);
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
            	    break loop37;
                }
            } while (true);

            otherlv_1=(Token)match(input,35,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAnnotatedExpressionAccess().getExpressionKeyword_1());
                  
            }
            // InternalSCL.g:1490:1: ( (lv_expression_2_0= ruleExpression ) )
            // InternalSCL.g:1491:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalSCL.g:1491:1: (lv_expression_2_0= ruleExpression )
            // InternalSCL.g:1492:3: lv_expression_2_0= ruleExpression
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
            if ( state.backtracking>0 ) { memoize(input, 30, ruleAnnotatedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAnnotatedExpression"


    // $ANTLR start "entryRuleDeclaration"
    // InternalSCL.g:1516:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleDeclaration_StartIndex = input.index();
        EObject iv_ruleDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return current; }
            // InternalSCL.g:1517:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalSCL.g:1518:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalSCL.g:1525:1: ruleDeclaration returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleDeclaration_StartIndex = input.index();
        EObject this_VariableDeclaration_0 = null;

        EObject this_ReferenceDeclaration_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return current; }
            // InternalSCL.g:1528:28: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration ) )
            // InternalSCL.g:1529:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration )
            {
            // InternalSCL.g:1529:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration )
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalSCL.g:1530:2: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:1543:2: this_ReferenceDeclaration_1= ruleReferenceDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getReferenceDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 32, ruleDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalSCL.g:1564:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleVariableDeclaration_StartIndex = input.index();
        EObject iv_ruleVariableDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return current; }
            // InternalSCL.g:1565:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalSCL.g:1566:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, entryRuleVariableDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalSCL.g:1573:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleVariableDeclaration_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return current; }
            // InternalSCL.g:1576:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ) )
            // InternalSCL.g:1577:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' )
            {
            // InternalSCL.g:1577:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' )
            // InternalSCL.g:1577:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';'
            {
            // InternalSCL.g:1577:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_COMMENT_ANNOTATION||LA39_0==49) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSCL.g:1578:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:1578:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:1579:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_33);
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
            	    break loop39;
                }
            } while (true);

            // InternalSCL.g:1595:3: ( (lv_const_1_0= 'const' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSCL.g:1596:1: (lv_const_1_0= 'const' )
                    {
                    // InternalSCL.g:1596:1: (lv_const_1_0= 'const' )
                    // InternalSCL.g:1597:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,36,FOLLOW_34); if (state.failed) return current;
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

            // InternalSCL.g:1610:3: ( (lv_input_2_0= 'input' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSCL.g:1611:1: (lv_input_2_0= 'input' )
                    {
                    // InternalSCL.g:1611:1: (lv_input_2_0= 'input' )
                    // InternalSCL.g:1612:3: lv_input_2_0= 'input'
                    {
                    lv_input_2_0=(Token)match(input,37,FOLLOW_35); if (state.failed) return current;
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

            // InternalSCL.g:1625:3: ( (lv_output_3_0= 'output' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==38) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSCL.g:1626:1: (lv_output_3_0= 'output' )
                    {
                    // InternalSCL.g:1626:1: (lv_output_3_0= 'output' )
                    // InternalSCL.g:1627:3: lv_output_3_0= 'output'
                    {
                    lv_output_3_0=(Token)match(input,38,FOLLOW_36); if (state.failed) return current;
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

            // InternalSCL.g:1640:3: ( (lv_static_4_0= 'static' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==39) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSCL.g:1641:1: (lv_static_4_0= 'static' )
                    {
                    // InternalSCL.g:1641:1: (lv_static_4_0= 'static' )
                    // InternalSCL.g:1642:3: lv_static_4_0= 'static'
                    {
                    lv_static_4_0=(Token)match(input,39,FOLLOW_37); if (state.failed) return current;
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

            // InternalSCL.g:1655:3: ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==40) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==RULE_ID||LA45_1==RULE_COMMENT_ANNOTATION||LA45_1==49) ) {
                    alt45=2;
                }
                else if ( ((LA45_1>=69 && LA45_1<=75)) ) {
                    alt45=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA45_0>=69 && LA45_0<=75)) ) {
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
                    // InternalSCL.g:1655:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    {
                    // InternalSCL.g:1655:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    // InternalSCL.g:1655:5: ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) )
                    {
                    // InternalSCL.g:1655:5: ( (lv_signal_5_0= 'signal' ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==40) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalSCL.g:1656:1: (lv_signal_5_0= 'signal' )
                            {
                            // InternalSCL.g:1656:1: (lv_signal_5_0= 'signal' )
                            // InternalSCL.g:1657:3: lv_signal_5_0= 'signal'
                            {
                            lv_signal_5_0=(Token)match(input,40,FOLLOW_37); if (state.failed) return current;
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

                    // InternalSCL.g:1670:3: ( (lv_type_6_0= ruleValueType ) )
                    // InternalSCL.g:1671:1: (lv_type_6_0= ruleValueType )
                    {
                    // InternalSCL.g:1671:1: (lv_type_6_0= ruleValueType )
                    // InternalSCL.g:1672:3: lv_type_6_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeValueTypeEnumRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_8);
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
                    // InternalSCL.g:1689:6: ( (lv_signal_7_0= 'signal' ) )
                    {
                    // InternalSCL.g:1689:6: ( (lv_signal_7_0= 'signal' ) )
                    // InternalSCL.g:1690:1: (lv_signal_7_0= 'signal' )
                    {
                    // InternalSCL.g:1690:1: (lv_signal_7_0= 'signal' )
                    // InternalSCL.g:1691:3: lv_signal_7_0= 'signal'
                    {
                    lv_signal_7_0=(Token)match(input,40,FOLLOW_8); if (state.failed) return current;
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

            // InternalSCL.g:1704:3: ( (lv_valuedObjects_8_0= ruleValuedObject ) )
            // InternalSCL.g:1705:1: (lv_valuedObjects_8_0= ruleValuedObject )
            {
            // InternalSCL.g:1705:1: (lv_valuedObjects_8_0= ruleValuedObject )
            // InternalSCL.g:1706:3: lv_valuedObjects_8_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_38);
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

            // InternalSCL.g:1722:2: (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==41) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSCL.g:1722:4: otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    {
            	    otherlv_9=(Token)match(input,41,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // InternalSCL.g:1726:1: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    // InternalSCL.g:1727:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    {
            	    // InternalSCL.g:1727:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    // InternalSCL.g:1728:3: lv_valuedObjects_10_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_38);
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
            	    break loop46;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 34, ruleVariableDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableDeclarationWOSemicolon"
    // InternalSCL.g:1756:1: entryRuleVariableDeclarationWOSemicolon returns [EObject current=null] : iv_ruleVariableDeclarationWOSemicolon= ruleVariableDeclarationWOSemicolon EOF ;
    public final EObject entryRuleVariableDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;
        int entryRuleVariableDeclarationWOSemicolon_StartIndex = input.index();
        EObject iv_ruleVariableDeclarationWOSemicolon = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return current; }
            // InternalSCL.g:1757:2: (iv_ruleVariableDeclarationWOSemicolon= ruleVariableDeclarationWOSemicolon EOF )
            // InternalSCL.g:1758:2: iv_ruleVariableDeclarationWOSemicolon= ruleVariableDeclarationWOSemicolon EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclarationWOSemicolon=ruleVariableDeclarationWOSemicolon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclarationWOSemicolon; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, entryRuleVariableDeclarationWOSemicolon_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclarationWOSemicolon"


    // $ANTLR start "ruleVariableDeclarationWOSemicolon"
    // InternalSCL.g:1765:1: ruleVariableDeclarationWOSemicolon returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ) ;
    public final EObject ruleVariableDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;
        int ruleVariableDeclarationWOSemicolon_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return current; }
            // InternalSCL.g:1768:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ) )
            // InternalSCL.g:1769:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* )
            {
            // InternalSCL.g:1769:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* )
            // InternalSCL.g:1769:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )*
            {
            // InternalSCL.g:1769:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_COMMENT_ANNOTATION||LA47_0==49) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSCL.g:1770:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:1770:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:1771:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_33);
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
            	    break loop47;
                }
            } while (true);

            // InternalSCL.g:1787:3: ( (lv_const_1_0= 'const' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==36) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSCL.g:1788:1: (lv_const_1_0= 'const' )
                    {
                    // InternalSCL.g:1788:1: (lv_const_1_0= 'const' )
                    // InternalSCL.g:1789:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,36,FOLLOW_34); if (state.failed) return current;
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

            // InternalSCL.g:1802:3: ( (lv_input_2_0= 'input' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==37) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSCL.g:1803:1: (lv_input_2_0= 'input' )
                    {
                    // InternalSCL.g:1803:1: (lv_input_2_0= 'input' )
                    // InternalSCL.g:1804:3: lv_input_2_0= 'input'
                    {
                    lv_input_2_0=(Token)match(input,37,FOLLOW_35); if (state.failed) return current;
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

            // InternalSCL.g:1817:3: ( (lv_output_3_0= 'output' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==38) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSCL.g:1818:1: (lv_output_3_0= 'output' )
                    {
                    // InternalSCL.g:1818:1: (lv_output_3_0= 'output' )
                    // InternalSCL.g:1819:3: lv_output_3_0= 'output'
                    {
                    lv_output_3_0=(Token)match(input,38,FOLLOW_36); if (state.failed) return current;
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

            // InternalSCL.g:1832:3: ( (lv_static_4_0= 'static' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==39) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSCL.g:1833:1: (lv_static_4_0= 'static' )
                    {
                    // InternalSCL.g:1833:1: (lv_static_4_0= 'static' )
                    // InternalSCL.g:1834:3: lv_static_4_0= 'static'
                    {
                    lv_static_4_0=(Token)match(input,39,FOLLOW_37); if (state.failed) return current;
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

            // InternalSCL.g:1847:3: ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==40) ) {
                int LA53_1 = input.LA(2);

                if ( ((LA53_1>=69 && LA53_1<=75)) ) {
                    alt53=1;
                }
                else if ( (LA53_1==RULE_ID||LA53_1==RULE_COMMENT_ANNOTATION||LA53_1==49) ) {
                    alt53=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA53_0>=69 && LA53_0<=75)) ) {
                alt53=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalSCL.g:1847:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    {
                    // InternalSCL.g:1847:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    // InternalSCL.g:1847:5: ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) )
                    {
                    // InternalSCL.g:1847:5: ( (lv_signal_5_0= 'signal' ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==40) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalSCL.g:1848:1: (lv_signal_5_0= 'signal' )
                            {
                            // InternalSCL.g:1848:1: (lv_signal_5_0= 'signal' )
                            // InternalSCL.g:1849:3: lv_signal_5_0= 'signal'
                            {
                            lv_signal_5_0=(Token)match(input,40,FOLLOW_37); if (state.failed) return current;
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

                    // InternalSCL.g:1862:3: ( (lv_type_6_0= ruleValueType ) )
                    // InternalSCL.g:1863:1: (lv_type_6_0= ruleValueType )
                    {
                    // InternalSCL.g:1863:1: (lv_type_6_0= ruleValueType )
                    // InternalSCL.g:1864:3: lv_type_6_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getTypeValueTypeEnumRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_8);
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
                    // InternalSCL.g:1881:6: ( (lv_signal_7_0= 'signal' ) )
                    {
                    // InternalSCL.g:1881:6: ( (lv_signal_7_0= 'signal' ) )
                    // InternalSCL.g:1882:1: (lv_signal_7_0= 'signal' )
                    {
                    // InternalSCL.g:1882:1: (lv_signal_7_0= 'signal' )
                    // InternalSCL.g:1883:3: lv_signal_7_0= 'signal'
                    {
                    lv_signal_7_0=(Token)match(input,40,FOLLOW_8); if (state.failed) return current;
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

            // InternalSCL.g:1896:3: ( (lv_valuedObjects_8_0= ruleValuedObject ) )
            // InternalSCL.g:1897:1: (lv_valuedObjects_8_0= ruleValuedObject )
            {
            // InternalSCL.g:1897:1: (lv_valuedObjects_8_0= ruleValuedObject )
            // InternalSCL.g:1898:3: lv_valuedObjects_8_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_39);
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

            // InternalSCL.g:1914:2: (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==41) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalSCL.g:1914:4: otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    {
            	    otherlv_9=(Token)match(input,41,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getVariableDeclarationWOSemicolonAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // InternalSCL.g:1918:1: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    // InternalSCL.g:1919:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    {
            	    // InternalSCL.g:1919:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    // InternalSCL.g:1920:3: lv_valuedObjects_10_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_39);
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
            if ( state.backtracking>0 ) { memoize(input, 36, ruleVariableDeclarationWOSemicolon_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclarationWOSemicolon"


    // $ANTLR start "entryRuleNamespaceID"
    // InternalSCL.g:1944:1: entryRuleNamespaceID returns [String current=null] : iv_ruleNamespaceID= ruleNamespaceID EOF ;
    public final String entryRuleNamespaceID() throws RecognitionException {
        String current = null;
        int entryRuleNamespaceID_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleNamespaceID = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return current; }
            // InternalSCL.g:1945:2: (iv_ruleNamespaceID= ruleNamespaceID EOF )
            // InternalSCL.g:1946:2: iv_ruleNamespaceID= ruleNamespaceID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamespaceIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNamespaceID=ruleNamespaceID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamespaceID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, entryRuleNamespaceID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespaceID"


    // $ANTLR start "ruleNamespaceID"
    // InternalSCL.g:1953:1: ruleNamespaceID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleNamespaceID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleNamespaceID_StartIndex = input.index();
        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return current; }
            // InternalSCL.g:1956:28: ( (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* ) )
            // InternalSCL.g:1957:1: (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* )
            {
            // InternalSCL.g:1957:1: (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* )
            // InternalSCL.g:1957:6: this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getNamespaceIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalSCL.g:1964:1: (kw= ':' this_ID_2= RULE_ID )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==20) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalSCL.g:1965:2: kw= ':' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getNamespaceIDAccess().getColonKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getNamespaceIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
            if ( state.backtracking>0 ) { memoize(input, 38, ruleNamespaceID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNamespaceID"


    // $ANTLR start "entryRuleReferenceDeclaration"
    // InternalSCL.g:1985:1: entryRuleReferenceDeclaration returns [EObject current=null] : iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF ;
    public final EObject entryRuleReferenceDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleReferenceDeclaration_StartIndex = input.index();
        EObject iv_ruleReferenceDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return current; }
            // InternalSCL.g:1986:2: (iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF )
            // InternalSCL.g:1987:2: iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReferenceDeclaration=ruleReferenceDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, entryRuleReferenceDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceDeclaration"


    // $ANTLR start "ruleReferenceDeclaration"
    // InternalSCL.g:1994:1: ruleReferenceDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleReferenceDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleReferenceDeclaration_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_valuedObjects_3_0 = null;

        EObject lv_valuedObjects_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return current; }
            // InternalSCL.g:1997:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )* otherlv_6= ';' ) )
            // InternalSCL.g:1998:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )* otherlv_6= ';' )
            {
            // InternalSCL.g:1998:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )* otherlv_6= ';' )
            // InternalSCL.g:1998:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )* otherlv_6= ';'
            {
            // InternalSCL.g:1998:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_COMMENT_ANNOTATION||LA56_0==49) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalSCL.g:1999:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:1999:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:2000:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_41);
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
            	    break loop56;
                }
            } while (true);

            otherlv_1=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReferenceDeclarationAccess().getAmpersandKeyword_1());
                  
            }
            // InternalSCL.g:2020:1: ( ( ruleNamespaceID ) )
            // InternalSCL.g:2021:1: ( ruleNamespaceID )
            {
            // InternalSCL.g:2021:1: ( ruleNamespaceID )
            // InternalSCL.g:2022:3: ruleNamespaceID
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
            pushFollow(FOLLOW_8);
            ruleNamespaceID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSCL.g:2038:2: ( (lv_valuedObjects_3_0= ruleValuedObject ) )
            // InternalSCL.g:2039:1: (lv_valuedObjects_3_0= ruleValuedObject )
            {
            // InternalSCL.g:2039:1: (lv_valuedObjects_3_0= ruleValuedObject )
            // InternalSCL.g:2040:3: lv_valuedObjects_3_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_38);
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

            // InternalSCL.g:2056:2: (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==41) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalSCL.g:2056:4: otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) )
            	    {
            	    otherlv_4=(Token)match(input,41,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getReferenceDeclarationAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalSCL.g:2060:1: ( (lv_valuedObjects_5_0= ruleValuedObject ) )
            	    // InternalSCL.g:2061:1: (lv_valuedObjects_5_0= ruleValuedObject )
            	    {
            	    // InternalSCL.g:2061:1: (lv_valuedObjects_5_0= ruleValuedObject )
            	    // InternalSCL.g:2062:3: lv_valuedObjects_5_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_38);
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
            	    break loop57;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 40, ruleReferenceDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleReferenceDeclaration"


    // $ANTLR start "entryRuleReferenceDeclarationWOSemicolon"
    // InternalSCL.g:2090:1: entryRuleReferenceDeclarationWOSemicolon returns [EObject current=null] : iv_ruleReferenceDeclarationWOSemicolon= ruleReferenceDeclarationWOSemicolon EOF ;
    public final EObject entryRuleReferenceDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;
        int entryRuleReferenceDeclarationWOSemicolon_StartIndex = input.index();
        EObject iv_ruleReferenceDeclarationWOSemicolon = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return current; }
            // InternalSCL.g:2091:2: (iv_ruleReferenceDeclarationWOSemicolon= ruleReferenceDeclarationWOSemicolon EOF )
            // InternalSCL.g:2092:2: iv_ruleReferenceDeclarationWOSemicolon= ruleReferenceDeclarationWOSemicolon EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReferenceDeclarationWOSemicolon=ruleReferenceDeclarationWOSemicolon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceDeclarationWOSemicolon; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, entryRuleReferenceDeclarationWOSemicolon_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceDeclarationWOSemicolon"


    // $ANTLR start "ruleReferenceDeclarationWOSemicolon"
    // InternalSCL.g:2099:1: ruleReferenceDeclarationWOSemicolon returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )* ) ;
    public final EObject ruleReferenceDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;
        int ruleReferenceDeclarationWOSemicolon_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_valuedObjects_3_0 = null;

        EObject lv_valuedObjects_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return current; }
            // InternalSCL.g:2102:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )* ) )
            // InternalSCL.g:2103:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )* )
            {
            // InternalSCL.g:2103:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )* )
            // InternalSCL.g:2103:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )*
            {
            // InternalSCL.g:2103:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_COMMENT_ANNOTATION||LA58_0==49) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalSCL.g:2104:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:2104:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:2105:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_41);
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
            	    break loop58;
                }
            } while (true);

            otherlv_1=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getAmpersandKeyword_1());
                  
            }
            // InternalSCL.g:2125:1: ( ( ruleNamespaceID ) )
            // InternalSCL.g:2126:1: ( ruleNamespaceID )
            {
            // InternalSCL.g:2126:1: ( ruleNamespaceID )
            // InternalSCL.g:2127:3: ruleNamespaceID
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
            pushFollow(FOLLOW_8);
            ruleNamespaceID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSCL.g:2143:2: ( (lv_valuedObjects_3_0= ruleValuedObject ) )
            // InternalSCL.g:2144:1: (lv_valuedObjects_3_0= ruleValuedObject )
            {
            // InternalSCL.g:2144:1: (lv_valuedObjects_3_0= ruleValuedObject )
            // InternalSCL.g:2145:3: lv_valuedObjects_3_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_39);
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

            // InternalSCL.g:2161:2: (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==41) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalSCL.g:2161:4: otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) )
            	    {
            	    otherlv_4=(Token)match(input,41,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalSCL.g:2165:1: ( (lv_valuedObjects_5_0= ruleValuedObject ) )
            	    // InternalSCL.g:2166:1: (lv_valuedObjects_5_0= ruleValuedObject )
            	    {
            	    // InternalSCL.g:2166:1: (lv_valuedObjects_5_0= ruleValuedObject )
            	    // InternalSCL.g:2167:3: lv_valuedObjects_5_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop59;
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
            if ( state.backtracking>0 ) { memoize(input, 42, ruleReferenceDeclarationWOSemicolon_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleReferenceDeclarationWOSemicolon"


    // $ANTLR start "entryRuleValuedObject"
    // InternalSCL.g:2191:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObject_StartIndex = input.index();
        EObject iv_ruleValuedObject = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return current; }
            // InternalSCL.g:2192:2: (iv_ruleValuedObject= ruleValuedObject EOF )
            // InternalSCL.g:2193:2: iv_ruleValuedObject= ruleValuedObject EOF
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
            if ( state.backtracking>0 ) { memoize(input, 43, entryRuleValuedObject_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObject"


    // $ANTLR start "ruleValuedObject"
    // InternalSCL.g:2200:1: ruleValuedObject returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? ) ;
    public final EObject ruleValuedObject() throws RecognitionException {
        EObject current = null;
        int ruleValuedObject_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return current; }
            // InternalSCL.g:2203:28: ( ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? ) )
            // InternalSCL.g:2204:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? )
            {
            // InternalSCL.g:2204:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? )
            // InternalSCL.g:2204:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )?
            {
            // InternalSCL.g:2204:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_COMMENT_ANNOTATION||LA60_0==49) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalSCL.g:2205:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    {
            	    // InternalSCL.g:2205:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    // InternalSCL.g:2206:3: lv_annotations_0_0= ruleQuotedStringAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getAnnotationsQuotedStringAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_8);
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
            	    break loop60;
                }
            } while (true);

            // InternalSCL.g:2222:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSCL.g:2223:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSCL.g:2223:1: (lv_name_1_0= RULE_ID )
            // InternalSCL.g:2224:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
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

            // InternalSCL.g:2240:2: (otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']' )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==21) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalSCL.g:2240:4: otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalSCL.g:2244:1: ( (lv_cardinalities_3_0= RULE_INT ) )
            	    // InternalSCL.g:2245:1: (lv_cardinalities_3_0= RULE_INT )
            	    {
            	    // InternalSCL.g:2245:1: (lv_cardinalities_3_0= RULE_INT )
            	    // InternalSCL.g:2246:3: lv_cardinalities_3_0= RULE_INT
            	    {
            	    lv_cardinalities_3_0=(Token)match(input,RULE_INT,FOLLOW_13); if (state.failed) return current;
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

            	    otherlv_4=(Token)match(input,22,FOLLOW_42); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            // InternalSCL.g:2266:3: (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==23) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSCL.g:2266:5: otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getValuedObjectAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // InternalSCL.g:2270:1: ( (lv_initialValue_6_0= ruleExpression ) )
                    // InternalSCL.g:2271:1: (lv_initialValue_6_0= ruleExpression )
                    {
                    // InternalSCL.g:2271:1: (lv_initialValue_6_0= ruleExpression )
                    // InternalSCL.g:2272:3: lv_initialValue_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getInitialValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_44);
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

            // InternalSCL.g:2288:4: (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==43) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalSCL.g:2288:6: otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) )
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getValuedObjectAccess().getCombineKeyword_4_0());
                          
                    }
                    // InternalSCL.g:2292:1: ( (lv_combineOperator_8_0= ruleCombineOperator ) )
                    // InternalSCL.g:2293:1: (lv_combineOperator_8_0= ruleCombineOperator )
                    {
                    // InternalSCL.g:2293:1: (lv_combineOperator_8_0= ruleCombineOperator )
                    // InternalSCL.g:2294:3: lv_combineOperator_8_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCombineOperatorCombineOperatorEnumRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 44, ruleValuedObject_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObject"


    // $ANTLR start "entryRuleEffect"
    // InternalSCL.g:2318:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;
        int entryRuleEffect_StartIndex = input.index();
        EObject iv_ruleEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return current; }
            // InternalSCL.g:2319:2: (iv_ruleEffect= ruleEffect EOF )
            // InternalSCL.g:2320:2: iv_ruleEffect= ruleEffect EOF
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
            if ( state.backtracking>0 ) { memoize(input, 45, entryRuleEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalSCL.g:2327:1: ruleEffect returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;
        int ruleEffect_StartIndex = input.index();
        EObject this_Assignment_0 = null;

        EObject this_PostfixEffect_1 = null;

        EObject this_Emission_2 = null;

        EObject this_HostcodeEffect_3 = null;

        EObject this_ReferenceCallEffect_4 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return current; }
            // InternalSCL.g:2330:28: ( (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect ) )
            // InternalSCL.g:2331:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect )
            {
            // InternalSCL.g:2331:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect )
            int alt64=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA64_1 = input.LA(2);

                if ( (synpred73_InternalSCL()) ) {
                    alt64=1;
                }
                else if ( (synpred74_InternalSCL()) ) {
                    alt64=2;
                }
                else if ( (synpred75_InternalSCL()) ) {
                    alt64=3;
                }
                else if ( (true) ) {
                    alt64=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_COMMENT_ANNOTATION:
                {
                int LA64_2 = input.LA(2);

                if ( (synpred74_InternalSCL()) ) {
                    alt64=2;
                }
                else if ( (synpred75_InternalSCL()) ) {
                    alt64=3;
                }
                else if ( (synpred76_InternalSCL()) ) {
                    alt64=4;
                }
                else if ( (true) ) {
                    alt64=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 2, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                int LA64_3 = input.LA(2);

                if ( (synpred74_InternalSCL()) ) {
                    alt64=2;
                }
                else if ( (synpred75_InternalSCL()) ) {
                    alt64=3;
                }
                else if ( (synpred76_InternalSCL()) ) {
                    alt64=4;
                }
                else if ( (true) ) {
                    alt64=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                alt64=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalSCL.g:2332:2: this_Assignment_0= ruleAssignment
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
                    // InternalSCL.g:2345:2: this_PostfixEffect_1= rulePostfixEffect
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
                    // InternalSCL.g:2358:2: this_Emission_2= ruleEmission
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
                    // InternalSCL.g:2371:2: this_HostcodeEffect_3= ruleHostcodeEffect
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
                    // InternalSCL.g:2384:2: this_ReferenceCallEffect_4= ruleReferenceCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getReferenceCallEffectParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ReferenceCallEffect_4=ruleReferenceCallEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceCallEffect_4; 
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
            if ( state.backtracking>0 ) { memoize(input, 46, ruleEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleEmission"
    // InternalSCL.g:2403:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;
        int entryRuleEmission_StartIndex = input.index();
        EObject iv_ruleEmission = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return current; }
            // InternalSCL.g:2404:2: (iv_ruleEmission= ruleEmission EOF )
            // InternalSCL.g:2405:2: iv_ruleEmission= ruleEmission EOF
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
            if ( state.backtracking>0 ) { memoize(input, 47, entryRuleEmission_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEmission"


    // $ANTLR start "ruleEmission"
    // InternalSCL.g:2412:1: ruleEmission returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return current; }
            // InternalSCL.g:2415:28: ( ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) )
            // InternalSCL.g:2416:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            {
            // InternalSCL.g:2416:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            // InternalSCL.g:2416:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            {
            // InternalSCL.g:2416:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_COMMENT_ANNOTATION||LA65_0==49) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalSCL.g:2417:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    {
            	    // InternalSCL.g:2417:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    // InternalSCL.g:2418:3: lv_annotations_0_0= ruleQuotedStringAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmissionAccess().getAnnotationsQuotedStringAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_8);
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
            	    break loop65;
                }
            } while (true);

            // InternalSCL.g:2434:3: ( (otherlv_1= RULE_ID ) )
            // InternalSCL.g:2435:1: (otherlv_1= RULE_ID )
            {
            // InternalSCL.g:2435:1: (otherlv_1= RULE_ID )
            // InternalSCL.g:2436:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSCL.g:2450:2: (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==44) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalSCL.g:2450:4: otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalSCL.g:2454:1: ( (lv_newValue_3_0= ruleExpression ) )
                    // InternalSCL.g:2455:1: (lv_newValue_3_0= ruleExpression )
                    {
                    // InternalSCL.g:2455:1: (lv_newValue_3_0= ruleExpression )
                    // InternalSCL.g:2456:3: lv_newValue_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_47);
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

                    otherlv_4=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 48, ruleEmission_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEmission"


    // $ANTLR start "entryRulePostfixEffect"
    // InternalSCL.g:2484:1: entryRulePostfixEffect returns [EObject current=null] : iv_rulePostfixEffect= rulePostfixEffect EOF ;
    public final EObject entryRulePostfixEffect() throws RecognitionException {
        EObject current = null;
        int entryRulePostfixEffect_StartIndex = input.index();
        EObject iv_rulePostfixEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return current; }
            // InternalSCL.g:2485:2: (iv_rulePostfixEffect= rulePostfixEffect EOF )
            // InternalSCL.g:2486:2: iv_rulePostfixEffect= rulePostfixEffect EOF
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
            if ( state.backtracking>0 ) { memoize(input, 49, entryRulePostfixEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePostfixEffect"


    // $ANTLR start "rulePostfixEffect"
    // InternalSCL.g:2493:1: rulePostfixEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return current; }
            // InternalSCL.g:2496:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) )
            // InternalSCL.g:2497:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            {
            // InternalSCL.g:2497:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            // InternalSCL.g:2497:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) )
            {
            // InternalSCL.g:2497:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_COMMENT_ANNOTATION||LA67_0==49) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalSCL.g:2498:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:2498:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:2499:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_8);
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
            	    break loop67;
                }
            } while (true);

            // InternalSCL.g:2515:3: ( (otherlv_1= RULE_ID ) )
            // InternalSCL.g:2516:1: (otherlv_1= RULE_ID )
            {
            // InternalSCL.g:2516:1: (otherlv_1= RULE_ID )
            // InternalSCL.g:2517:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPostfixEffectRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getPostfixEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSCL.g:2531:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==21) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalSCL.g:2531:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPostfixEffectAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalSCL.g:2535:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // InternalSCL.g:2536:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // InternalSCL.g:2536:1: (lv_indices_3_0= ruleExpression )
            	    // InternalSCL.g:2537:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_13);
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

            	    otherlv_4=(Token)match(input,22,FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getPostfixEffectAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            // InternalSCL.g:2557:3: ( (lv_operator_5_0= rulePostfixOperator ) )
            // InternalSCL.g:2558:1: (lv_operator_5_0= rulePostfixOperator )
            {
            // InternalSCL.g:2558:1: (lv_operator_5_0= rulePostfixOperator )
            // InternalSCL.g:2559:3: lv_operator_5_0= rulePostfixOperator
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
            if ( state.backtracking>0 ) { memoize(input, 50, rulePostfixEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePostfixEffect"


    // $ANTLR start "entryRuleHostcodeEffect"
    // InternalSCL.g:2583:1: entryRuleHostcodeEffect returns [EObject current=null] : iv_ruleHostcodeEffect= ruleHostcodeEffect EOF ;
    public final EObject entryRuleHostcodeEffect() throws RecognitionException {
        EObject current = null;
        int entryRuleHostcodeEffect_StartIndex = input.index();
        EObject iv_ruleHostcodeEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return current; }
            // InternalSCL.g:2584:2: (iv_ruleHostcodeEffect= ruleHostcodeEffect EOF )
            // InternalSCL.g:2585:2: iv_ruleHostcodeEffect= ruleHostcodeEffect EOF
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
            if ( state.backtracking>0 ) { memoize(input, 51, entryRuleHostcodeEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleHostcodeEffect"


    // $ANTLR start "ruleHostcodeEffect"
    // InternalSCL.g:2592:1: ruleHostcodeEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleHostcodeEffect() throws RecognitionException {
        EObject current = null;
        int ruleHostcodeEffect_StartIndex = input.index();
        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return current; }
            // InternalSCL.g:2595:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // InternalSCL.g:2596:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // InternalSCL.g:2596:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // InternalSCL.g:2596:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // InternalSCL.g:2596:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_COMMENT_ANNOTATION||LA69_0==49) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalSCL.g:2597:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:2597:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:2598:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHostcodeEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_49);
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
            	    break loop69;
                }
            } while (true);

            // InternalSCL.g:2614:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // InternalSCL.g:2615:1: (lv_text_1_0= RULE_HOSTCODE )
            {
            // InternalSCL.g:2615:1: (lv_text_1_0= RULE_HOSTCODE )
            // InternalSCL.g:2616:3: lv_text_1_0= RULE_HOSTCODE
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
            if ( state.backtracking>0 ) { memoize(input, 52, ruleHostcodeEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleHostcodeEffect"


    // $ANTLR start "entryRuleReferenceCallEffect"
    // InternalSCL.g:2640:1: entryRuleReferenceCallEffect returns [EObject current=null] : iv_ruleReferenceCallEffect= ruleReferenceCallEffect EOF ;
    public final EObject entryRuleReferenceCallEffect() throws RecognitionException {
        EObject current = null;
        int entryRuleReferenceCallEffect_StartIndex = input.index();
        EObject iv_ruleReferenceCallEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return current; }
            // InternalSCL.g:2641:2: (iv_ruleReferenceCallEffect= ruleReferenceCallEffect EOF )
            // InternalSCL.g:2642:2: iv_ruleReferenceCallEffect= ruleReferenceCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceCallEffectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReferenceCallEffect=ruleReferenceCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceCallEffect; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, entryRuleReferenceCallEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceCallEffect"


    // $ANTLR start "ruleReferenceCallEffect"
    // InternalSCL.g:2649:1: ruleReferenceCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) ;
    public final EObject ruleReferenceCallEffect() throws RecognitionException {
        EObject current = null;
        int ruleReferenceCallEffect_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return current; }
            // InternalSCL.g:2652:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) )
            // InternalSCL.g:2653:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            {
            // InternalSCL.g:2653:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            // InternalSCL.g:2653:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            {
            // InternalSCL.g:2653:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==RULE_COMMENT_ANNOTATION||LA70_0==49) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalSCL.g:2654:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSCL.g:2654:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSCL.g:2655:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceCallEffectRule());
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
            	    break loop70;
                }
            } while (true);

            // InternalSCL.g:2671:3: ( (otherlv_1= RULE_ID ) )
            // InternalSCL.g:2672:1: (otherlv_1= RULE_ID )
            {
            // InternalSCL.g:2672:1: (otherlv_1= RULE_ID )
            // InternalSCL.g:2673:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceCallEffectRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getReferenceCallEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSCL.g:2687:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==44) ) {
                alt72=1;
            }
            else if ( (LA72_0==46) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalSCL.g:2687:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalSCL.g:2687:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalSCL.g:2687:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getReferenceCallEffectAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // InternalSCL.g:2691:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalSCL.g:2692:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalSCL.g:2692:1: (lv_parameters_3_0= ruleParameter )
                    // InternalSCL.g:2693:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_52);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceCallEffectRule());
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

                    // InternalSCL.g:2709:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==41) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalSCL.g:2709:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,41,FOLLOW_51); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getReferenceCallEffectAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // InternalSCL.g:2713:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalSCL.g:2714:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalSCL.g:2714:1: (lv_parameters_5_0= ruleParameter )
                    	    // InternalSCL.g:2715:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_52);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getReferenceCallEffectRule());
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
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getReferenceCallEffectAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:2736:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getReferenceCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
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
            if ( state.backtracking>0 ) { memoize(input, 54, ruleReferenceCallEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleReferenceCallEffect"


    // $ANTLR start "entryRuleExpression"
    // InternalSCL.g:2750:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleExpression_StartIndex = input.index();
        EObject iv_ruleExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return current; }
            // InternalSCL.g:2751:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalSCL.g:2752:2: iv_ruleExpression= ruleExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 55, entryRuleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSCL.g:2759:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;
        int ruleExpression_StartIndex = input.index();
        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return current; }
            // InternalSCL.g:2762:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // InternalSCL.g:2763:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // InternalSCL.g:2763:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // InternalSCL.g:2764:2: this_BoolExpression_0= ruleBoolExpression
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
                    // InternalSCL.g:2777:2: this_ValuedExpression_1= ruleValuedExpression
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
            if ( state.backtracking>0 ) { memoize(input, 56, ruleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBoolExpression"
    // InternalSCL.g:2796:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBoolExpression_StartIndex = input.index();
        EObject iv_ruleBoolExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return current; }
            // InternalSCL.g:2797:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalSCL.g:2798:2: iv_ruleBoolExpression= ruleBoolExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 57, entryRuleBoolExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // InternalSCL.g:2805:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;
        int ruleBoolExpression_StartIndex = input.index();
        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return current; }
            // InternalSCL.g:2808:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalSCL.g:2810:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
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
            if ( state.backtracking>0 ) { memoize(input, 58, ruleBoolExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalSCL.g:2829:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleLogicalOrExpression_StartIndex = input.index();
        EObject iv_ruleLogicalOrExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return current; }
            // InternalSCL.g:2830:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalSCL.g:2831:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 59, entryRuleLogicalOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // InternalSCL.g:2838:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;
        int ruleLogicalOrExpression_StartIndex = input.index();
        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return current; }
            // InternalSCL.g:2841:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) )
            // InternalSCL.g:2842:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            {
            // InternalSCL.g:2842:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            // InternalSCL.g:2843:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_53);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:2854:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==67) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalSCL.g:2854:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    {
                    // InternalSCL.g:2854:2: ()
                    // InternalSCL.g:2855:2: 
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

                    // InternalSCL.g:2863:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    int cnt74=0;
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==67) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalSCL.g:2863:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    {
                    	    // InternalSCL.g:2863:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    	    // InternalSCL.g:2864:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    {
                    	    // InternalSCL.g:2864:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    // InternalSCL.g:2865:3: lv_operator_2_0= ruleLogicalOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_12);
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

                    	    // InternalSCL.g:2881:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    // InternalSCL.g:2882:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    {
                    	    // InternalSCL.g:2882:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    // InternalSCL.g:2883:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_53);
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
                    	    if ( cnt74 >= 1 ) break loop74;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(74, input);
                                throw eee;
                        }
                        cnt74++;
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
            if ( state.backtracking>0 ) { memoize(input, 60, ruleLogicalOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalSCL.g:2907:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleLogicalAndExpression_StartIndex = input.index();
        EObject iv_ruleLogicalAndExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return current; }
            // InternalSCL.g:2908:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalSCL.g:2909:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 61, entryRuleLogicalAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // InternalSCL.g:2916:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;
        int ruleLogicalAndExpression_StartIndex = input.index();
        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return current; }
            // InternalSCL.g:2919:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) )
            // InternalSCL.g:2920:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            {
            // InternalSCL.g:2920:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            // InternalSCL.g:2921:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_54);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:2932:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==68) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalSCL.g:2932:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    {
                    // InternalSCL.g:2932:2: ()
                    // InternalSCL.g:2933:2: 
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

                    // InternalSCL.g:2941:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    int cnt76=0;
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==68) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalSCL.g:2941:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    // InternalSCL.g:2941:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    	    // InternalSCL.g:2942:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    {
                    	    // InternalSCL.g:2942:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    // InternalSCL.g:2943:3: lv_operator_2_0= ruleLogicalAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_12);
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

                    	    // InternalSCL.g:2959:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    // InternalSCL.g:2960:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    {
                    	    // InternalSCL.g:2960:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    // InternalSCL.g:2961:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_54);
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
                    	    if ( cnt76 >= 1 ) break loop76;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(76, input);
                                throw eee;
                        }
                        cnt76++;
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
            if ( state.backtracking>0 ) { memoize(input, 62, ruleLogicalAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // InternalSCL.g:2985:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBitwiseOrExpression_StartIndex = input.index();
        EObject iv_ruleBitwiseOrExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return current; }
            // InternalSCL.g:2986:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalSCL.g:2987:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 63, entryRuleBitwiseOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseOrExpression"


    // $ANTLR start "ruleBitwiseOrExpression"
    // InternalSCL.g:2994:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;
        int ruleBitwiseOrExpression_StartIndex = input.index();
        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return current; }
            // InternalSCL.g:2997:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) )
            // InternalSCL.g:2998:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            {
            // InternalSCL.g:2998:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            // InternalSCL.g:2999:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_55);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:3010:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==61) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalSCL.g:3010:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    {
                    // InternalSCL.g:3010:2: ()
                    // InternalSCL.g:3011:2: 
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

                    // InternalSCL.g:3019:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    int cnt78=0;
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==61) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalSCL.g:3019:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    // InternalSCL.g:3019:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    	    // InternalSCL.g:3020:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    {
                    	    // InternalSCL.g:3020:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    // InternalSCL.g:3021:3: lv_operator_2_0= ruleBitwiseOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_12);
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

                    	    // InternalSCL.g:3037:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    // InternalSCL.g:3038:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    {
                    	    // InternalSCL.g:3038:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    // InternalSCL.g:3039:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_55);
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
                    	    if ( cnt78 >= 1 ) break loop78;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(78, input);
                                throw eee;
                        }
                        cnt78++;
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
            if ( state.backtracking>0 ) { memoize(input, 64, ruleBitwiseOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // InternalSCL.g:3063:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBitwiseAndExpression_StartIndex = input.index();
        EObject iv_ruleBitwiseAndExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return current; }
            // InternalSCL.g:3064:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalSCL.g:3065:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 65, entryRuleBitwiseAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseAndExpression"


    // $ANTLR start "ruleBitwiseAndExpression"
    // InternalSCL.g:3072:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;
        int ruleBitwiseAndExpression_StartIndex = input.index();
        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return current; }
            // InternalSCL.g:3075:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) )
            // InternalSCL.g:3076:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            {
            // InternalSCL.g:3076:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            // InternalSCL.g:3077:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_56);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:3088:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==42) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalSCL.g:3088:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    {
                    // InternalSCL.g:3088:2: ()
                    // InternalSCL.g:3089:2: 
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

                    // InternalSCL.g:3097:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    int cnt80=0;
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==42) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalSCL.g:3097:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // InternalSCL.g:3097:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    	    // InternalSCL.g:3098:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    {
                    	    // InternalSCL.g:3098:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    // InternalSCL.g:3099:3: lv_operator_2_0= ruleBitwiseAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_12);
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

                    	    // InternalSCL.g:3115:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // InternalSCL.g:3116:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // InternalSCL.g:3116:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // InternalSCL.g:3117:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_56);
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
                    	    if ( cnt80 >= 1 ) break loop80;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(80, input);
                                throw eee;
                        }
                        cnt80++;
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
            if ( state.backtracking>0 ) { memoize(input, 66, ruleBitwiseAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalSCL.g:3141:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;
        int entryRuleCompareOperation_StartIndex = input.index();
        EObject iv_ruleCompareOperation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return current; }
            // InternalSCL.g:3142:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalSCL.g:3143:2: iv_ruleCompareOperation= ruleCompareOperation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 67, entryRuleCompareOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // InternalSCL.g:3150:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;
        int ruleCompareOperation_StartIndex = input.index();
        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return current; }
            // InternalSCL.g:3153:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // InternalSCL.g:3154:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // InternalSCL.g:3154:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // InternalSCL.g:3155:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_57);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:3166:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=54 && LA82_0<=59)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalSCL.g:3166:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // InternalSCL.g:3166:2: ()
                    // InternalSCL.g:3167:2: 
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

                    // InternalSCL.g:3175:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // InternalSCL.g:3176:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // InternalSCL.g:3176:1: (lv_operator_2_0= ruleCompareOperator )
                    // InternalSCL.g:3177:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_12);
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

                    // InternalSCL.g:3193:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // InternalSCL.g:3194:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // InternalSCL.g:3194:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // InternalSCL.g:3195:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
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
            if ( state.backtracking>0 ) { memoize(input, 68, ruleCompareOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleNotOrValuedExpression"
    // InternalSCL.g:3219:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNotOrValuedExpression_StartIndex = input.index();
        EObject iv_ruleNotOrValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return current; }
            // InternalSCL.g:3220:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // InternalSCL.g:3221:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 69, entryRuleNotOrValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNotOrValuedExpression"


    // $ANTLR start "ruleNotOrValuedExpression"
    // InternalSCL.g:3228:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleNotOrValuedExpression_StartIndex = input.index();
        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return current; }
            // InternalSCL.g:3231:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // InternalSCL.g:3232:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // InternalSCL.g:3232:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // InternalSCL.g:3233:2: this_ValuedExpression_0= ruleValuedExpression
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
                    // InternalSCL.g:3246:2: this_NotExpression_1= ruleNotExpression
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
            if ( state.backtracking>0 ) { memoize(input, 70, ruleNotOrValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotOrValuedExpression"


    // $ANTLR start "entryRuleNotExpression"
    // InternalSCL.g:3265:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNotExpression_StartIndex = input.index();
        EObject iv_ruleNotExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return current; }
            // InternalSCL.g:3266:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalSCL.g:3267:2: iv_ruleNotExpression= ruleNotExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 71, entryRuleNotExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalSCL.g:3274:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;
        int ruleNotExpression_StartIndex = input.index();
        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return current; }
            // InternalSCL.g:3277:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // InternalSCL.g:3278:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // InternalSCL.g:3278:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==48) ) {
                alt84=1;
            }
            else if ( (LA84_0==RULE_ID||LA84_0==RULE_HOSTCODE||LA84_0==RULE_BOOLEAN||LA84_0==44||LA84_0==60||LA84_0==66) ) {
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
                    // InternalSCL.g:3278:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // InternalSCL.g:3278:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // InternalSCL.g:3278:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // InternalSCL.g:3278:3: ()
                    // InternalSCL.g:3279:2: 
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

                    // InternalSCL.g:3287:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // InternalSCL.g:3288:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // InternalSCL.g:3288:1: (lv_operator_1_0= ruleNotOperator )
                    // InternalSCL.g:3289:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_12);
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

                    // InternalSCL.g:3305:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // InternalSCL.g:3306:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // InternalSCL.g:3306:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // InternalSCL.g:3307:3: lv_subExpressions_2_0= ruleNotExpression
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.NotExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:3325:2: this_AtomicExpression_3= ruleAtomicExpression
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
            if ( state.backtracking>0 ) { memoize(input, 72, ruleNotExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleValuedExpression"
    // InternalSCL.g:3344:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedExpression_StartIndex = input.index();
        EObject iv_ruleValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return current; }
            // InternalSCL.g:3345:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // InternalSCL.g:3346:2: iv_ruleValuedExpression= ruleValuedExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 73, entryRuleValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedExpression"


    // $ANTLR start "ruleValuedExpression"
    // InternalSCL.g:3353:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleValuedExpression_StartIndex = input.index();
        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return current; }
            // InternalSCL.g:3356:28: (this_AddExpression_0= ruleAddExpression )
            // InternalSCL.g:3358:2: this_AddExpression_0= ruleAddExpression
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
            if ( state.backtracking>0 ) { memoize(input, 74, ruleValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalSCL.g:3377:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAddExpression_StartIndex = input.index();
        EObject iv_ruleAddExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return current; }
            // InternalSCL.g:3378:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalSCL.g:3379:2: iv_ruleAddExpression= ruleAddExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 75, entryRuleAddExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // InternalSCL.g:3386:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;
        int ruleAddExpression_StartIndex = input.index();
        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return current; }
            // InternalSCL.g:3389:28: ( (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? ) )
            // InternalSCL.g:3390:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? )
            {
            // InternalSCL.g:3390:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? )
            // InternalSCL.g:3391:2: this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_58);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:3402:1: ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==62) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalSCL.g:3402:2: () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+
                    {
                    // InternalSCL.g:3402:2: ()
                    // InternalSCL.g:3403:2: 
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

                    // InternalSCL.g:3411:2: ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+
                    int cnt85=0;
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==62) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalSCL.g:3411:3: ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    	    {
                    	    // InternalSCL.g:3411:3: ( (lv_operator_2_0= ruleAddOperator ) )
                    	    // InternalSCL.g:3412:1: (lv_operator_2_0= ruleAddOperator )
                    	    {
                    	    // InternalSCL.g:3412:1: (lv_operator_2_0= ruleAddOperator )
                    	    // InternalSCL.g:3413:3: lv_operator_2_0= ruleAddOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_59);
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

                    	    // InternalSCL.g:3429:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    	    // InternalSCL.g:3430:1: (lv_subExpressions_3_0= ruleSubExpression )
                    	    {
                    	    // InternalSCL.g:3430:1: (lv_subExpressions_3_0= ruleSubExpression )
                    	    // InternalSCL.g:3431:3: lv_subExpressions_3_0= ruleSubExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_58);
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
                    	    if ( cnt85 >= 1 ) break loop85;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(85, input);
                                throw eee;
                        }
                        cnt85++;
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
            if ( state.backtracking>0 ) { memoize(input, 76, ruleAddExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // InternalSCL.g:3455:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleSubExpression_StartIndex = input.index();
        EObject iv_ruleSubExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return current; }
            // InternalSCL.g:3456:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // InternalSCL.g:3457:2: iv_ruleSubExpression= ruleSubExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 77, entryRuleSubExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSubExpression"


    // $ANTLR start "ruleSubExpression"
    // InternalSCL.g:3464:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;
        int ruleSubExpression_StartIndex = input.index();
        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return current; }
            // InternalSCL.g:3467:28: ( (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? ) )
            // InternalSCL.g:3468:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? )
            {
            // InternalSCL.g:3468:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? )
            // InternalSCL.g:3469:2: this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_60);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:3480:1: ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==51) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalSCL.g:3480:2: () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+
                    {
                    // InternalSCL.g:3480:2: ()
                    // InternalSCL.g:3481:2: 
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

                    // InternalSCL.g:3489:2: ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+
                    int cnt87=0;
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==51) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalSCL.g:3489:3: ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    	    {
                    	    // InternalSCL.g:3489:3: ( (lv_operator_2_0= ruleSubOperator ) )
                    	    // InternalSCL.g:3490:1: (lv_operator_2_0= ruleSubOperator )
                    	    {
                    	    // InternalSCL.g:3490:1: (lv_operator_2_0= ruleSubOperator )
                    	    // InternalSCL.g:3491:3: lv_operator_2_0= ruleSubOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_59);
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

                    	    // InternalSCL.g:3507:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    	    // InternalSCL.g:3508:1: (lv_subExpressions_3_0= ruleMultExpression )
                    	    {
                    	    // InternalSCL.g:3508:1: (lv_subExpressions_3_0= ruleMultExpression )
                    	    // InternalSCL.g:3509:3: lv_subExpressions_3_0= ruleMultExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_60);
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
                    	    if ( cnt87 >= 1 ) break loop87;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(87, input);
                                throw eee;
                        }
                        cnt87++;
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
            if ( state.backtracking>0 ) { memoize(input, 78, ruleSubExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // InternalSCL.g:3533:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleMultExpression_StartIndex = input.index();
        EObject iv_ruleMultExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return current; }
            // InternalSCL.g:3534:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalSCL.g:3535:2: iv_ruleMultExpression= ruleMultExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 79, entryRuleMultExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // InternalSCL.g:3542:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;
        int ruleMultExpression_StartIndex = input.index();
        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return current; }
            // InternalSCL.g:3545:28: ( (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? ) )
            // InternalSCL.g:3546:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? )
            {
            // InternalSCL.g:3546:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? )
            // InternalSCL.g:3547:2: this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_61);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:3558:1: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==63) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalSCL.g:3558:2: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+
                    {
                    // InternalSCL.g:3558:2: ()
                    // InternalSCL.g:3559:2: 
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

                    // InternalSCL.g:3567:2: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+
                    int cnt89=0;
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==63) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalSCL.g:3567:3: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    	    {
                    	    // InternalSCL.g:3567:3: ( (lv_operator_2_0= ruleMultOperator ) )
                    	    // InternalSCL.g:3568:1: (lv_operator_2_0= ruleMultOperator )
                    	    {
                    	    // InternalSCL.g:3568:1: (lv_operator_2_0= ruleMultOperator )
                    	    // InternalSCL.g:3569:3: lv_operator_2_0= ruleMultOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_59);
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

                    	    // InternalSCL.g:3585:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    	    // InternalSCL.g:3586:1: (lv_subExpressions_3_0= ruleDivExpression )
                    	    {
                    	    // InternalSCL.g:3586:1: (lv_subExpressions_3_0= ruleDivExpression )
                    	    // InternalSCL.g:3587:3: lv_subExpressions_3_0= ruleDivExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_61);
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
                    	    if ( cnt89 >= 1 ) break loop89;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(89, input);
                                throw eee;
                        }
                        cnt89++;
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
            if ( state.backtracking>0 ) { memoize(input, 80, ruleMultExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // InternalSCL.g:3611:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleDivExpression_StartIndex = input.index();
        EObject iv_ruleDivExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return current; }
            // InternalSCL.g:3612:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // InternalSCL.g:3613:2: iv_ruleDivExpression= ruleDivExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 81, entryRuleDivExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDivExpression"


    // $ANTLR start "ruleDivExpression"
    // InternalSCL.g:3620:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;
        int ruleDivExpression_StartIndex = input.index();
        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return current; }
            // InternalSCL.g:3623:28: ( (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? ) )
            // InternalSCL.g:3624:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? )
            {
            // InternalSCL.g:3624:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? )
            // InternalSCL.g:3625:2: this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_62);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:3636:1: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==65) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalSCL.g:3636:2: () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+
                    {
                    // InternalSCL.g:3636:2: ()
                    // InternalSCL.g:3637:2: 
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

                    // InternalSCL.g:3645:2: ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+
                    int cnt91=0;
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==65) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalSCL.g:3645:3: ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    	    {
                    	    // InternalSCL.g:3645:3: ( (lv_operator_2_0= ruleDivOperator ) )
                    	    // InternalSCL.g:3646:1: (lv_operator_2_0= ruleDivOperator )
                    	    {
                    	    // InternalSCL.g:3646:1: (lv_operator_2_0= ruleDivOperator )
                    	    // InternalSCL.g:3647:3: lv_operator_2_0= ruleDivOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_59);
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

                    	    // InternalSCL.g:3663:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    	    // InternalSCL.g:3664:1: (lv_subExpressions_3_0= ruleModExpression )
                    	    {
                    	    // InternalSCL.g:3664:1: (lv_subExpressions_3_0= ruleModExpression )
                    	    // InternalSCL.g:3665:3: lv_subExpressions_3_0= ruleModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_62);
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
                    	    if ( cnt91 >= 1 ) break loop91;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(91, input);
                                throw eee;
                        }
                        cnt91++;
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
            if ( state.backtracking>0 ) { memoize(input, 82, ruleDivExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // InternalSCL.g:3689:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleModExpression_StartIndex = input.index();
        EObject iv_ruleModExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return current; }
            // InternalSCL.g:3690:2: (iv_ruleModExpression= ruleModExpression EOF )
            // InternalSCL.g:3691:2: iv_ruleModExpression= ruleModExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 83, entryRuleModExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleModExpression"


    // $ANTLR start "ruleModExpression"
    // InternalSCL.g:3698:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;
        int ruleModExpression_StartIndex = input.index();
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return current; }
            // InternalSCL.g:3701:28: ( (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? ) )
            // InternalSCL.g:3702:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? )
            {
            // InternalSCL.g:3702:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? )
            // InternalSCL.g:3703:2: this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_63);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSCL.g:3714:1: ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==64) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalSCL.g:3714:2: () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+
                    {
                    // InternalSCL.g:3714:2: ()
                    // InternalSCL.g:3715:2: 
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

                    // InternalSCL.g:3723:2: ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+
                    int cnt93=0;
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==64) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalSCL.g:3723:3: ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    	    {
                    	    // InternalSCL.g:3723:3: ( (lv_operator_2_0= ruleModOperator ) )
                    	    // InternalSCL.g:3724:1: (lv_operator_2_0= ruleModOperator )
                    	    {
                    	    // InternalSCL.g:3724:1: (lv_operator_2_0= ruleModOperator )
                    	    // InternalSCL.g:3725:3: lv_operator_2_0= ruleModOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_59);
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

                    	    // InternalSCL.g:3741:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    	    // InternalSCL.g:3742:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    	    {
                    	    // InternalSCL.g:3742:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    	    // InternalSCL.g:3743:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_63);
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
                    	    if ( cnt93 >= 1 ) break loop93;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(93, input);
                                throw eee;
                        }
                        cnt93++;
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
            if ( state.backtracking>0 ) { memoize(input, 84, ruleModExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModExpression"


    // $ANTLR start "entryRuleNegExpression"
    // InternalSCL.g:3767:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNegExpression_StartIndex = input.index();
        EObject iv_ruleNegExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return current; }
            // InternalSCL.g:3768:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // InternalSCL.g:3769:2: iv_ruleNegExpression= ruleNegExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 85, entryRuleNegExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNegExpression"


    // $ANTLR start "ruleNegExpression"
    // InternalSCL.g:3776:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;
        int ruleNegExpression_StartIndex = input.index();
        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return current; }
            // InternalSCL.g:3779:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // InternalSCL.g:3780:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // InternalSCL.g:3780:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==51) ) {
                alt95=1;
            }
            else if ( ((LA95_0>=RULE_ID && LA95_0<=RULE_STRING)||LA95_0==44||LA95_0==60||LA95_0==66) ) {
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
                    // InternalSCL.g:3780:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // InternalSCL.g:3780:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // InternalSCL.g:3780:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // InternalSCL.g:3780:3: ()
                    // InternalSCL.g:3781:2: 
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

                    // InternalSCL.g:3789:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // InternalSCL.g:3790:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // InternalSCL.g:3790:1: (lv_operator_1_0= ruleSubOperator )
                    // InternalSCL.g:3791:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_59);
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

                    // InternalSCL.g:3807:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // InternalSCL.g:3808:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // InternalSCL.g:3808:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // InternalSCL.g:3809:3: lv_subExpressions_2_0= ruleNegExpression
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.NegExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:3827:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
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
            if ( state.backtracking>0 ) { memoize(input, 86, ruleNegExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNegExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalSCL.g:3846:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAtomicExpression_StartIndex = input.index();
        EObject iv_ruleAtomicExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return current; }
            // InternalSCL.g:3847:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalSCL.g:3848:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 87, entryRuleAtomicExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalSCL.g:3855:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_TextExpression_6= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;
        int ruleAtomicExpression_StartIndex = input.index();
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BoolValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BoolExpression_3 = null;

        EObject this_ReferenceCall_5 = null;

        EObject this_TextExpression_6 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return current; }
            // InternalSCL.g:3858:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_TextExpression_6= ruleTextExpression ) )
            // InternalSCL.g:3859:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_TextExpression_6= ruleTextExpression )
            {
            // InternalSCL.g:3859:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_TextExpression_6= ruleTextExpression )
            int alt96=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt96=1;
                }
                break;
            case 60:
            case 66:
                {
                alt96=2;
                }
                break;
            case RULE_ID:
                {
                int LA96_3 = input.LA(2);

                if ( (LA96_3==EOF||LA96_3==RULE_ID||LA96_3==RULE_HOSTCODE||LA96_3==RULE_COMMENT_ANNOTATION||(LA96_3>=18 && LA96_3<=19)||(LA96_3>=21 && LA96_3<=22)||(LA96_3>=25 && LA96_3<=27)||(LA96_3>=31 && LA96_3<=32)||(LA96_3>=34 && LA96_3<=35)||(LA96_3>=41 && LA96_3<=43)||LA96_3==45||LA96_3==47||LA96_3==49||LA96_3==51||(LA96_3>=54 && LA96_3<=59)||(LA96_3>=61 && LA96_3<=65)||(LA96_3>=67 && LA96_3<=68)) ) {
                    alt96=2;
                }
                else if ( (LA96_3==44||LA96_3==46) ) {
                    alt96=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 96, 3, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                alt96=3;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt96=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalSCL.g:3860:2: this_BoolValue_0= ruleBoolValue
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
                    // InternalSCL.g:3873:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
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
                    // InternalSCL.g:3885:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // InternalSCL.g:3885:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // InternalSCL.g:3885:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_47);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSCL.g:3907:2: this_ReferenceCall_5= ruleReferenceCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getReferenceCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ReferenceCall_5=ruleReferenceCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceCall_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalSCL.g:3920:2: this_TextExpression_6= ruleTextExpression
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
            if ( state.backtracking>0 ) { memoize(input, 88, ruleAtomicExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleAtomicValuedExpression"
    // InternalSCL.g:3939:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAtomicValuedExpression_StartIndex = input.index();
        EObject iv_ruleAtomicValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return current; }
            // InternalSCL.g:3940:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // InternalSCL.g:3941:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 89, entryRuleAtomicValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicValuedExpression"


    // $ANTLR start "ruleAtomicValuedExpression"
    // InternalSCL.g:3948:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return current; }
            // InternalSCL.g:3951:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // InternalSCL.g:3952:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // InternalSCL.g:3952:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt97=5;
            alt97 = dfa97.predict(input);
            switch (alt97) {
                case 1 :
                    // InternalSCL.g:3953:2: this_IntValue_0= ruleIntValue
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
                    // InternalSCL.g:3966:2: this_FloatValue_1= ruleFloatValue
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
                    // InternalSCL.g:3979:2: this_StringValue_2= ruleStringValue
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
                    // InternalSCL.g:3991:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // InternalSCL.g:3991:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // InternalSCL.g:3991:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_47);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSCL.g:4013:2: this_AtomicExpression_6= ruleAtomicExpression
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
            if ( state.backtracking>0 ) { memoize(input, 90, ruleAtomicValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAtomicValuedExpression"


    // $ANTLR start "entryRuleValuedObjectTestExpression"
    // InternalSCL.g:4032:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObjectTestExpression_StartIndex = input.index();
        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return current; }
            // InternalSCL.g:4033:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // InternalSCL.g:4034:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 91, entryRuleValuedObjectTestExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectTestExpression"


    // $ANTLR start "ruleValuedObjectTestExpression"
    // InternalSCL.g:4041:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return current; }
            // InternalSCL.g:4044:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // InternalSCL.g:4045:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // InternalSCL.g:4045:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==60||LA99_0==66) ) {
                alt99=1;
            }
            else if ( (LA99_0==RULE_ID) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalSCL.g:4045:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // InternalSCL.g:4045:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // InternalSCL.g:4045:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // InternalSCL.g:4045:3: ()
                    // InternalSCL.g:4046:2: 
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

                    // InternalSCL.g:4054:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // InternalSCL.g:4055:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // InternalSCL.g:4055:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // InternalSCL.g:4056:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // InternalSCL.g:4056:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==60) ) {
                        alt98=1;
                    }
                    else if ( (LA98_0==66) ) {
                        alt98=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 0, input);

                        throw nvae;
                    }
                    switch (alt98) {
                        case 1 :
                            // InternalSCL.g:4057:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_64);
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
                            // InternalSCL.g:4072:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_64);
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

                    otherlv_2=(Token)match(input,44,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // InternalSCL.g:4094:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // InternalSCL.g:4095:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // InternalSCL.g:4095:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // InternalSCL.g:4096:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_47);
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

                    otherlv_4=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:4118:2: this_ValuedObjectReference_5= ruleValuedObjectReference
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
            if ( state.backtracking>0 ) { memoize(input, 92, ruleValuedObjectTestExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObjectTestExpression"


    // $ANTLR start "entryRuleValuedObjectReference"
    // InternalSCL.g:4137:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObjectReference_StartIndex = input.index();
        EObject iv_ruleValuedObjectReference = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return current; }
            // InternalSCL.g:4138:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // InternalSCL.g:4139:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
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
            if ( state.backtracking>0 ) { memoize(input, 93, entryRuleValuedObjectReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectReference"


    // $ANTLR start "ruleValuedObjectReference"
    // InternalSCL.g:4146:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) ) )? (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;
        int ruleValuedObjectReference_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_subReference_2_0 = null;

        EObject lv_indices_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return current; }
            // InternalSCL.g:4149:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) ) )? (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )* ) )
            // InternalSCL.g:4150:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) ) )? (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )* )
            {
            // InternalSCL.g:4150:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) ) )? (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )* )
            // InternalSCL.g:4150:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) ) )? (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )*
            {
            // InternalSCL.g:4150:2: ( (otherlv_0= RULE_ID ) )
            // InternalSCL.g:4151:1: (otherlv_0= RULE_ID )
            {
            // InternalSCL.g:4151:1: (otherlv_0= RULE_ID )
            // InternalSCL.g:4152:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalSCL.g:4166:2: (otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==47) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalSCL.g:4166:4: otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) )
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getFullStopKeyword_1_0());
                          
                    }
                    // InternalSCL.g:4170:1: ( (lv_subReference_2_0= ruleValuedObjectReference ) )
                    // InternalSCL.g:4171:1: (lv_subReference_2_0= ruleValuedObjectReference )
                    {
                    // InternalSCL.g:4171:1: (lv_subReference_2_0= ruleValuedObjectReference )
                    // InternalSCL.g:4172:3: lv_subReference_2_0= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getSubReferenceValuedObjectReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_67);
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

            // InternalSCL.g:4188:4: (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==21) ) {
                    int LA101_2 = input.LA(2);

                    if ( (synpred119_InternalSCL()) ) {
                        alt101=1;
                    }


                }


                switch (alt101) {
            	case 1 :
            	    // InternalSCL.g:4188:6: otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']'
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalSCL.g:4192:1: ( (lv_indices_4_0= ruleExpression ) )
            	    // InternalSCL.g:4193:1: (lv_indices_4_0= ruleExpression )
            	    {
            	    // InternalSCL.g:4193:1: (lv_indices_4_0= ruleExpression )
            	    // InternalSCL.g:4194:3: lv_indices_4_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_13);
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

            	    otherlv_5=(Token)match(input,22,FOLLOW_67); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop101;
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
            if ( state.backtracking>0 ) { memoize(input, 94, ruleValuedObjectReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleReferenceCall"
    // InternalSCL.g:4222:1: entryRuleReferenceCall returns [EObject current=null] : iv_ruleReferenceCall= ruleReferenceCall EOF ;
    public final EObject entryRuleReferenceCall() throws RecognitionException {
        EObject current = null;
        int entryRuleReferenceCall_StartIndex = input.index();
        EObject iv_ruleReferenceCall = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return current; }
            // InternalSCL.g:4223:2: (iv_ruleReferenceCall= ruleReferenceCall EOF )
            // InternalSCL.g:4224:2: iv_ruleReferenceCall= ruleReferenceCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReferenceCall=ruleReferenceCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, entryRuleReferenceCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceCall"


    // $ANTLR start "ruleReferenceCall"
    // InternalSCL.g:4231:1: ruleReferenceCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) ;
    public final EObject ruleReferenceCall() throws RecognitionException {
        EObject current = null;
        int ruleReferenceCall_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return current; }
            // InternalSCL.g:4234:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) )
            // InternalSCL.g:4235:1: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            {
            // InternalSCL.g:4235:1: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            // InternalSCL.g:4235:2: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            {
            // InternalSCL.g:4235:2: ( (otherlv_0= RULE_ID ) )
            // InternalSCL.g:4236:1: (otherlv_0= RULE_ID )
            {
            // InternalSCL.g:4236:1: (otherlv_0= RULE_ID )
            // InternalSCL.g:4237:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceCallRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getReferenceCallAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalSCL.g:4251:2: ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==44) ) {
                alt103=1;
            }
            else if ( (LA103_0==46) ) {
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
                    // InternalSCL.g:4251:3: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    {
                    // InternalSCL.g:4251:3: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    // InternalSCL.g:4251:5: otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReferenceCallAccess().getLeftParenthesisKeyword_1_0_0());
                          
                    }
                    // InternalSCL.g:4255:1: ( (lv_parameters_2_0= ruleParameter ) )
                    // InternalSCL.g:4256:1: (lv_parameters_2_0= ruleParameter )
                    {
                    // InternalSCL.g:4256:1: (lv_parameters_2_0= ruleParameter )
                    // InternalSCL.g:4257:3: lv_parameters_2_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_52);
                    lv_parameters_2_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceCallRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_2_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSCL.g:4273:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==41) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // InternalSCL.g:4273:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,41,FOLLOW_51); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getReferenceCallAccess().getCommaKeyword_1_0_2_0());
                    	          
                    	    }
                    	    // InternalSCL.g:4277:1: ( (lv_parameters_4_0= ruleParameter ) )
                    	    // InternalSCL.g:4278:1: (lv_parameters_4_0= ruleParameter )
                    	    {
                    	    // InternalSCL.g:4278:1: (lv_parameters_4_0= ruleParameter )
                    	    // InternalSCL.g:4279:3: lv_parameters_4_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_52);
                    	    lv_parameters_4_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getReferenceCallRule());
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


                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getReferenceCallAccess().getRightParenthesisKeyword_1_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:4300:7: otherlv_6= '()'
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getReferenceCallAccess().getLeftParenthesisRightParenthesisKeyword_1_1());
                          
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
            if ( state.backtracking>0 ) { memoize(input, 96, ruleReferenceCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleReferenceCall"


    // $ANTLR start "entryRuleParameter"
    // InternalSCL.g:4312:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;
        int entryRuleParameter_StartIndex = input.index();
        EObject iv_ruleParameter = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return current; }
            // InternalSCL.g:4313:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalSCL.g:4314:2: iv_ruleParameter= ruleParameter EOF
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
            if ( state.backtracking>0 ) { memoize(input, 97, entryRuleParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalSCL.g:4321:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;
        int ruleParameter_StartIndex = input.index();
        Token lv_pureOutput_0_0=null;
        Token lv_callByReference_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return current; }
            // InternalSCL.g:4324:28: ( ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalSCL.g:4325:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalSCL.g:4325:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalSCL.g:4325:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalSCL.g:4325:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==48) ) {
                int LA105_1 = input.LA(2);

                if ( (LA105_1==42) ) {
                    alt105=1;
                }
            }
            else if ( (LA105_0==42) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalSCL.g:4325:3: ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) )
                    {
                    // InternalSCL.g:4325:3: ( (lv_pureOutput_0_0= '!' ) )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==48) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // InternalSCL.g:4326:1: (lv_pureOutput_0_0= '!' )
                            {
                            // InternalSCL.g:4326:1: (lv_pureOutput_0_0= '!' )
                            // InternalSCL.g:4327:3: lv_pureOutput_0_0= '!'
                            {
                            lv_pureOutput_0_0=(Token)match(input,48,FOLLOW_68); if (state.failed) return current;
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

                    // InternalSCL.g:4340:3: ( (lv_callByReference_1_0= '&' ) )
                    // InternalSCL.g:4341:1: (lv_callByReference_1_0= '&' )
                    {
                    // InternalSCL.g:4341:1: (lv_callByReference_1_0= '&' )
                    // InternalSCL.g:4342:3: lv_callByReference_1_0= '&'
                    {
                    lv_callByReference_1_0=(Token)match(input,42,FOLLOW_12); if (state.failed) return current;
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

            // InternalSCL.g:4355:4: ( (lv_expression_2_0= ruleExpression ) )
            // InternalSCL.g:4356:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalSCL.g:4356:1: (lv_expression_2_0= ruleExpression )
            // InternalSCL.g:4357:3: lv_expression_2_0= ruleExpression
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
            if ( state.backtracking>0 ) { memoize(input, 98, ruleParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTextExpression"
    // InternalSCL.g:4381:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleTextExpression_StartIndex = input.index();
        EObject iv_ruleTextExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return current; }
            // InternalSCL.g:4382:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalSCL.g:4383:2: iv_ruleTextExpression= ruleTextExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 99, entryRuleTextExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // InternalSCL.g:4390:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;
        int ruleTextExpression_StartIndex = input.index();
        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return current; }
            // InternalSCL.g:4393:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // InternalSCL.g:4394:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // InternalSCL.g:4394:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // InternalSCL.g:4395:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // InternalSCL.g:4395:1: (lv_text_0_0= RULE_HOSTCODE )
            // InternalSCL.g:4396:3: lv_text_0_0= RULE_HOSTCODE
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
            if ( state.backtracking>0 ) { memoize(input, 100, ruleTextExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleIntValue"
    // InternalSCL.g:4420:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;
        int entryRuleIntValue_StartIndex = input.index();
        EObject iv_ruleIntValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return current; }
            // InternalSCL.g:4421:2: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalSCL.g:4422:2: iv_ruleIntValue= ruleIntValue EOF
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
            if ( state.backtracking>0 ) { memoize(input, 101, entryRuleIntValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalSCL.g:4429:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;
        int ruleIntValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return current; }
            // InternalSCL.g:4432:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalSCL.g:4433:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalSCL.g:4433:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalSCL.g:4434:1: (lv_value_0_0= RULE_INT )
            {
            // InternalSCL.g:4434:1: (lv_value_0_0= RULE_INT )
            // InternalSCL.g:4435:3: lv_value_0_0= RULE_INT
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
            if ( state.backtracking>0 ) { memoize(input, 102, ruleIntValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalSCL.g:4459:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;
        int entryRuleFloatValue_StartIndex = input.index();
        EObject iv_ruleFloatValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return current; }
            // InternalSCL.g:4460:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalSCL.g:4461:2: iv_ruleFloatValue= ruleFloatValue EOF
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
            if ( state.backtracking>0 ) { memoize(input, 103, entryRuleFloatValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalSCL.g:4468:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;
        int ruleFloatValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return current; }
            // InternalSCL.g:4471:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalSCL.g:4472:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalSCL.g:4472:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalSCL.g:4473:1: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalSCL.g:4473:1: (lv_value_0_0= RULE_FLOAT )
            // InternalSCL.g:4474:3: lv_value_0_0= RULE_FLOAT
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
            if ( state.backtracking>0 ) { memoize(input, 104, ruleFloatValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleBoolValue"
    // InternalSCL.g:4498:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;
        int entryRuleBoolValue_StartIndex = input.index();
        EObject iv_ruleBoolValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return current; }
            // InternalSCL.g:4499:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalSCL.g:4500:2: iv_ruleBoolValue= ruleBoolValue EOF
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
            if ( state.backtracking>0 ) { memoize(input, 105, entryRuleBoolValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // InternalSCL.g:4507:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;
        int ruleBoolValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return current; }
            // InternalSCL.g:4510:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalSCL.g:4511:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalSCL.g:4511:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalSCL.g:4512:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalSCL.g:4512:1: (lv_value_0_0= RULE_BOOLEAN )
            // InternalSCL.g:4513:3: lv_value_0_0= RULE_BOOLEAN
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
            if ( state.backtracking>0 ) { memoize(input, 106, ruleBoolValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalSCL.g:4537:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;
        int entryRuleStringValue_StartIndex = input.index();
        EObject iv_ruleStringValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return current; }
            // InternalSCL.g:4538:2: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalSCL.g:4539:2: iv_ruleStringValue= ruleStringValue EOF
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
            if ( state.backtracking>0 ) { memoize(input, 107, entryRuleStringValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalSCL.g:4546:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;
        int ruleStringValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return current; }
            // InternalSCL.g:4549:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSCL.g:4550:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSCL.g:4550:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSCL.g:4551:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalSCL.g:4551:1: (lv_value_0_0= RULE_STRING )
            // InternalSCL.g:4552:3: lv_value_0_0= RULE_STRING
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
            if ( state.backtracking>0 ) { memoize(input, 108, ruleStringValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleAnnotation"
    // InternalSCL.g:4578:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleAnnotation_StartIndex = input.index();
        EObject iv_ruleAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return current; }
            // InternalSCL.g:4579:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalSCL.g:4580:2: iv_ruleAnnotation= ruleAnnotation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 109, entryRuleAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalSCL.g:4587:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleAnnotation_StartIndex = input.index();
        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyStringValueAnnotation_1 = null;

        EObject this_TypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return current; }
            // InternalSCL.g:4590:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalSCL.g:4591:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalSCL.g:4591:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt106=4;
            alt106 = dfa106.predict(input);
            switch (alt106) {
                case 1 :
                    // InternalSCL.g:4592:2: this_CommentAnnotation_0= ruleCommentAnnotation
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
                    // InternalSCL.g:4605:2: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:4618:2: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:4631:2: this_TagAnnotation_3= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 110, ruleAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleQuotedStringAnnotation"
    // InternalSCL.g:4654:1: entryRuleQuotedStringAnnotation returns [EObject current=null] : iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF ;
    public final EObject entryRuleQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleQuotedStringAnnotation_StartIndex = input.index();
        EObject iv_ruleQuotedStringAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return current; }
            // InternalSCL.g:4655:2: (iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF )
            // InternalSCL.g:4656:2: iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedStringAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQuotedStringAnnotation=ruleQuotedStringAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedStringAnnotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 111, entryRuleQuotedStringAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedStringAnnotation"


    // $ANTLR start "ruleQuotedStringAnnotation"
    // InternalSCL.g:4663:1: ruleQuotedStringAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject ruleQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleQuotedStringAnnotation_StartIndex = input.index();
        EObject this_CommentAnnotation_0 = null;

        EObject this_QuotedKeyStringValueAnnotation_1 = null;

        EObject this_QuotedTypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return current; }
            // InternalSCL.g:4666:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalSCL.g:4667:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalSCL.g:4667:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt107=4;
            alt107 = dfa107.predict(input);
            switch (alt107) {
                case 1 :
                    // InternalSCL.g:4668:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
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
                    // InternalSCL.g:4681:2: this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAnnotationAccess().getQuotedKeyStringValueAnnotationParserRuleCall_1()); 
                          
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
                    // InternalSCL.g:4694:2: this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAnnotationAccess().getQuotedTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
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
                    // InternalSCL.g:4707:2: this_TagAnnotation_3= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAnnotationAccess().getTagAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 112, ruleQuotedStringAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleQuotedStringAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // InternalSCL.g:4726:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleCommentAnnotation_StartIndex = input.index();
        EObject iv_ruleCommentAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return current; }
            // InternalSCL.g:4727:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalSCL.g:4728:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 113, entryRuleCommentAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentAnnotation"


    // $ANTLR start "ruleCommentAnnotation"
    // InternalSCL.g:4735:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleCommentAnnotation_StartIndex = input.index();
        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return current; }
            // InternalSCL.g:4738:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalSCL.g:4739:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalSCL.g:4739:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalSCL.g:4740:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalSCL.g:4740:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalSCL.g:4741:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
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
            if ( state.backtracking>0 ) { memoize(input, 114, ruleCommentAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleTagAnnotation"
    // InternalSCL.g:4765:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleTagAnnotation_StartIndex = input.index();
        EObject iv_ruleTagAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return current; }
            // InternalSCL.g:4766:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalSCL.g:4767:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 115, entryRuleTagAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTagAnnotation"


    // $ANTLR start "ruleTagAnnotation"
    // InternalSCL.g:4774:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleTagAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return current; }
            // InternalSCL.g:4777:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalSCL.g:4778:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalSCL.g:4778:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalSCL.g:4778:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSCL.g:4782:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSCL.g:4783:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSCL.g:4783:1: (lv_name_1_0= ruleExtendedID )
            // InternalSCL.g:4784:3: lv_name_1_0= ruleExtendedID
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
            if ( state.backtracking>0 ) { memoize(input, 116, ruleTagAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // InternalSCL.g:4808:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return current; }
            // InternalSCL.g:4809:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalSCL.g:4810:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 117, entryRuleKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyStringValueAnnotation"


    // $ANTLR start "ruleKeyStringValueAnnotation"
    // InternalSCL.g:4817:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return current; }
            // InternalSCL.g:4820:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalSCL.g:4821:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalSCL.g:4821:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalSCL.g:4821:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSCL.g:4825:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSCL.g:4826:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSCL.g:4826:1: (lv_name_1_0= ruleExtendedID )
            // InternalSCL.g:4827:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_69);
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

            // InternalSCL.g:4843:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalSCL.g:4844:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalSCL.g:4844:1: (lv_values_2_0= ruleEStringAllTypes )
            // InternalSCL.g:4845:3: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_39);
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

            // InternalSCL.g:4861:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==41) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // InternalSCL.g:4861:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,41,FOLLOW_69); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalSCL.g:4865:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalSCL.g:4866:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalSCL.g:4866:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalSCL.g:4867:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop108;
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
            if ( state.backtracking>0 ) { memoize(input, 118, ruleKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleRestrictedKeyStringValueAnnotation"
    // InternalSCL.g:4891:1: entryRuleRestrictedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleRestrictedKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleRestrictedKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return current; }
            // InternalSCL.g:4892:2: (iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalSCL.g:4893:2: iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRestrictedKeyStringValueAnnotation=ruleRestrictedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 119, entryRuleRestrictedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "ruleRestrictedKeyStringValueAnnotation"
    // InternalSCL.g:4900:1: ruleRestrictedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleRestrictedKeyStringValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return current; }
            // InternalSCL.g:4903:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) )
            // InternalSCL.g:4904:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            {
            // InternalSCL.g:4904:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            // InternalSCL.g:4904:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSCL.g:4908:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSCL.g:4909:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSCL.g:4909:1: (lv_name_1_0= ruleExtendedID )
            // InternalSCL.g:4910:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_70);
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

            // InternalSCL.g:4926:2: ( (lv_values_2_0= ruleEStringBoolean ) )
            // InternalSCL.g:4927:1: (lv_values_2_0= ruleEStringBoolean )
            {
            // InternalSCL.g:4927:1: (lv_values_2_0= ruleEStringBoolean )
            // InternalSCL.g:4928:3: lv_values_2_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_39);
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

            // InternalSCL.g:4944:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==41) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // InternalSCL.g:4944:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,41,FOLLOW_70); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalSCL.g:4948:1: ( (lv_values_4_0= ruleEStringBoolean ) )
            	    // InternalSCL.g:4949:1: (lv_values_4_0= ruleEStringBoolean )
            	    {
            	    // InternalSCL.g:4949:1: (lv_values_4_0= ruleEStringBoolean )
            	    // InternalSCL.g:4950:3: lv_values_4_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_39);
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
            if ( state.backtracking>0 ) { memoize(input, 120, ruleRestrictedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalSCL.g:4974:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleTypedKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return current; }
            // InternalSCL.g:4975:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalSCL.g:4976:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 121, entryRuleTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleTypedKeyStringValueAnnotation"
    // InternalSCL.g:4983:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return current; }
            // InternalSCL.g:4986:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) )
            // InternalSCL.g:4987:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalSCL.g:4987:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            // InternalSCL.g:4987:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSCL.g:4991:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSCL.g:4992:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSCL.g:4992:1: (lv_name_1_0= ruleExtendedID )
            // InternalSCL.g:4993:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_71);
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

            otherlv_2=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalSCL.g:5013:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalSCL.g:5014:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalSCL.g:5014:1: (lv_type_3_0= ruleExtendedID )
            // InternalSCL.g:5015:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,22,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalSCL.g:5035:1: ( (lv_values_5_0= ruleEStringAllTypes ) )
            // InternalSCL.g:5036:1: (lv_values_5_0= ruleEStringAllTypes )
            {
            // InternalSCL.g:5036:1: (lv_values_5_0= ruleEStringAllTypes )
            // InternalSCL.g:5037:3: lv_values_5_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_39);
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

            // InternalSCL.g:5053:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==41) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // InternalSCL.g:5053:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_6=(Token)match(input,41,FOLLOW_69); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalSCL.g:5057:1: ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    // InternalSCL.g:5058:1: (lv_values_7_0= ruleEStringAllTypes )
            	    {
            	    // InternalSCL.g:5058:1: (lv_values_7_0= ruleEStringAllTypes )
            	    // InternalSCL.g:5059:3: lv_values_7_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop110;
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
            if ( state.backtracking>0 ) { memoize(input, 122, ruleTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleRestrictedTypedKeyStringValueAnnotation"
    // InternalSCL.g:5083:1: entryRuleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleRestrictedTypedKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleRestrictedTypedKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return current; }
            // InternalSCL.g:5084:2: (iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalSCL.g:5085:2: iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRestrictedTypedKeyStringValueAnnotation=ruleRestrictedTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 123, entryRuleRestrictedTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleRestrictedTypedKeyStringValueAnnotation"
    // InternalSCL.g:5092:1: ruleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleRestrictedTypedKeyStringValueAnnotation_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return current; }
            // InternalSCL.g:5095:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalSCL.g:5096:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalSCL.g:5096:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalSCL.g:5096:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSCL.g:5100:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSCL.g:5101:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSCL.g:5101:1: (lv_name_1_0= ruleExtendedID )
            // InternalSCL.g:5102:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_71);
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

            otherlv_2=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalSCL.g:5122:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalSCL.g:5123:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalSCL.g:5123:1: (lv_type_3_0= ruleExtendedID )
            // InternalSCL.g:5124:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,22,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalSCL.g:5144:1: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalSCL.g:5145:1: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalSCL.g:5145:1: (lv_values_5_0= ruleEStringBoolean )
            // InternalSCL.g:5146:3: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_39);
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

            // InternalSCL.g:5162:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==41) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // InternalSCL.g:5162:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,41,FOLLOW_70); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalSCL.g:5166:1: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalSCL.g:5167:1: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalSCL.g:5167:1: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalSCL.g:5168:3: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop111;
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
            if ( state.backtracking>0 ) { memoize(input, 124, ruleRestrictedTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // InternalSCL.g:5192:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleQuotedKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return current; }
            // InternalSCL.g:5193:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalSCL.g:5194:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 125, entryRuleQuotedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedKeyStringValueAnnotation"
    // InternalSCL.g:5201:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return current; }
            // InternalSCL.g:5204:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalSCL.g:5205:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalSCL.g:5205:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalSCL.g:5205:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSCL.g:5209:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSCL.g:5210:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSCL.g:5210:1: (lv_name_1_0= ruleExtendedID )
            // InternalSCL.g:5211:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_72);
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

            // InternalSCL.g:5227:2: ( (lv_values_2_0= RULE_STRING ) )
            // InternalSCL.g:5228:1: (lv_values_2_0= RULE_STRING )
            {
            // InternalSCL.g:5228:1: (lv_values_2_0= RULE_STRING )
            // InternalSCL.g:5229:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_39); if (state.failed) return current;
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

            // InternalSCL.g:5245:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==41) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // InternalSCL.g:5245:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,41,FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalSCL.g:5249:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalSCL.g:5250:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalSCL.g:5250:1: (lv_values_4_0= RULE_STRING )
            	    // InternalSCL.g:5251:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_39); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 126, ruleQuotedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleQuotedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedTypedKeyStringValueAnnotation"
    // InternalSCL.g:5275:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleQuotedTypedKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return current; }
            // InternalSCL.g:5276:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalSCL.g:5277:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 127, entryRuleQuotedTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedTypedKeyStringValueAnnotation"
    // InternalSCL.g:5284:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return current; }
            // InternalSCL.g:5287:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalSCL.g:5288:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalSCL.g:5288:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalSCL.g:5288:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSCL.g:5292:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSCL.g:5293:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSCL.g:5293:1: (lv_name_1_0= ruleExtendedID )
            // InternalSCL.g:5294:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_71);
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

            otherlv_2=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalSCL.g:5314:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalSCL.g:5315:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalSCL.g:5315:1: (lv_type_3_0= ruleExtendedID )
            // InternalSCL.g:5316:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,22,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalSCL.g:5336:1: ( (lv_values_5_0= RULE_STRING ) )
            // InternalSCL.g:5337:1: (lv_values_5_0= RULE_STRING )
            {
            // InternalSCL.g:5337:1: (lv_values_5_0= RULE_STRING )
            // InternalSCL.g:5338:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FOLLOW_39); if (state.failed) return current;
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

            // InternalSCL.g:5354:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==41) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // InternalSCL.g:5354:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,41,FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalSCL.g:5358:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalSCL.g:5359:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalSCL.g:5359:1: (lv_values_7_0= RULE_STRING )
            	    // InternalSCL.g:5360:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FOLLOW_39); if (state.failed) return current;
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
            	    break loop113;
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
            if ( state.backtracking>0 ) { memoize(input, 128, ruleQuotedTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleEStringBoolean"
    // InternalSCL.g:5386:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;
        int entryRuleEStringBoolean_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return current; }
            // InternalSCL.g:5387:2: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalSCL.g:5388:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
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
            if ( state.backtracking>0 ) { memoize(input, 129, entryRuleEStringBoolean_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEStringBoolean"


    // $ANTLR start "ruleEStringBoolean"
    // InternalSCL.g:5395:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleEStringBoolean_StartIndex = input.index();
        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return current; }
            // InternalSCL.g:5398:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalSCL.g:5399:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalSCL.g:5399:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt114=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt114=1;
                }
                break;
            case RULE_ID:
                {
                alt114=2;
                }
                break;
            case RULE_BOOLEAN:
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
                    // InternalSCL.g:5399:6: this_STRING_0= RULE_STRING
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
                    // InternalSCL.g:5408:5: this_ExtendedID_1= ruleExtendedID
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
                    // InternalSCL.g:5419:10: this_BOOLEAN_2= RULE_BOOLEAN
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
            if ( state.backtracking>0 ) { memoize(input, 130, ruleEStringBoolean_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEStringBoolean"


    // $ANTLR start "entryRuleEStringAllTypes"
    // InternalSCL.g:5434:1: entryRuleEStringAllTypes returns [String current=null] : iv_ruleEStringAllTypes= ruleEStringAllTypes EOF ;
    public final String entryRuleEStringAllTypes() throws RecognitionException {
        String current = null;
        int entryRuleEStringAllTypes_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleEStringAllTypes = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return current; }
            // InternalSCL.g:5435:2: (iv_ruleEStringAllTypes= ruleEStringAllTypes EOF )
            // InternalSCL.g:5436:2: iv_ruleEStringAllTypes= ruleEStringAllTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringAllTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEStringAllTypes=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEStringAllTypes.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 131, entryRuleEStringAllTypes_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEStringAllTypes"


    // $ANTLR start "ruleEStringAllTypes"
    // InternalSCL.g:5443:1: ruleEStringAllTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) ;
    public final AntlrDatatypeRuleToken ruleEStringAllTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleEStringAllTypes_StartIndex = input.index();
        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;

        AntlrDatatypeRuleToken this_Integer_3 = null;

        AntlrDatatypeRuleToken this_Floateger_4 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return current; }
            // InternalSCL.g:5446:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) )
            // InternalSCL.g:5447:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            {
            // InternalSCL.g:5447:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            int alt115=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt115=1;
                }
                break;
            case RULE_ID:
                {
                alt115=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt115=3;
                }
                break;
            case 51:
                {
                int LA115_4 = input.LA(2);

                if ( (LA115_4==RULE_INT) ) {
                    alt115=4;
                }
                else if ( (LA115_4==RULE_FLOAT) ) {
                    alt115=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 115, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt115=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt115=5;
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
                    // InternalSCL.g:5447:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAllTypesAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSCL.g:5456:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAllTypesAccess().getExtendedIDParserRuleCall_1()); 
                          
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
                    // InternalSCL.g:5467:10: this_BOOLEAN_2= RULE_BOOLEAN
                    {
                    this_BOOLEAN_2=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_2, grammarAccess.getEStringAllTypesAccess().getBOOLEANTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSCL.g:5476:5: this_Integer_3= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAllTypesAccess().getIntegerParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalSCL.g:5488:5: this_Floateger_4= ruleFloateger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAllTypesAccess().getFloategerParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 132, ruleEStringAllTypes_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEStringAllTypes"


    // $ANTLR start "entryRuleExtendedID"
    // InternalSCL.g:5506:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;
        int entryRuleExtendedID_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return current; }
            // InternalSCL.g:5507:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalSCL.g:5508:2: iv_ruleExtendedID= ruleExtendedID EOF
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
            if ( state.backtracking>0 ) { memoize(input, 133, entryRuleExtendedID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // InternalSCL.g:5515:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleExtendedID_StartIndex = input.index();
        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return current; }
            // InternalSCL.g:5518:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) )
            // InternalSCL.g:5519:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            {
            // InternalSCL.g:5519:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            // InternalSCL.g:5519:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalSCL.g:5526:1: (kw= '.' this_ID_2= RULE_ID )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==47) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // InternalSCL.g:5527:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,47,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_73); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);

            // InternalSCL.g:5539:3: (kw= '#' this_INT_4= RULE_INT )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==50) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalSCL.g:5540:2: kw= '#' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,50,FOLLOW_43); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 134, ruleExtendedID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleInteger"
    // InternalSCL.g:5562:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;
        int entryRuleInteger_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return current; }
            // InternalSCL.g:5563:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalSCL.g:5564:2: iv_ruleInteger= ruleInteger EOF
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
            if ( state.backtracking>0 ) { memoize(input, 135, entryRuleInteger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalSCL.g:5571:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleInteger_StartIndex = input.index();
        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return current; }
            // InternalSCL.g:5574:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSCL.g:5575:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSCL.g:5575:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSCL.g:5575:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSCL.g:5575:2: (kw= '-' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==51) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalSCL.g:5576:2: kw= '-'
                    {
                    kw=(Token)match(input,51,FOLLOW_43); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 136, ruleInteger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleFloateger"
    // InternalSCL.g:5596:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;
        int entryRuleFloateger_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return current; }
            // InternalSCL.g:5597:2: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalSCL.g:5598:2: iv_ruleFloateger= ruleFloateger EOF
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
            if ( state.backtracking>0 ) { memoize(input, 137, entryRuleFloateger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFloateger"


    // $ANTLR start "ruleFloateger"
    // InternalSCL.g:5605:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFloateger_StartIndex = input.index();
        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return current; }
            // InternalSCL.g:5608:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalSCL.g:5609:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalSCL.g:5609:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalSCL.g:5609:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalSCL.g:5609:2: (kw= '-' )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==51) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalSCL.g:5610:2: kw= '-'
                    {
                    kw=(Token)match(input,51,FOLLOW_74); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 138, ruleFloateger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFloateger"


    // $ANTLR start "rulePostfixOperator"
    // InternalSCL.g:5632:1: rulePostfixOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator rulePostfixOperator() throws RecognitionException {
        Enumerator current = null;
        int rulePostfixOperator_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return current; }
            // InternalSCL.g:5634:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalSCL.g:5635:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalSCL.g:5635:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==52) ) {
                alt120=1;
            }
            else if ( (LA120_0==53) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // InternalSCL.g:5635:2: (enumLiteral_0= '++' )
                    {
                    // InternalSCL.g:5635:2: (enumLiteral_0= '++' )
                    // InternalSCL.g:5635:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:5641:6: (enumLiteral_1= '--' )
                    {
                    // InternalSCL.g:5641:6: (enumLiteral_1= '--' )
                    // InternalSCL.g:5641:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 139, rulePostfixOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePostfixOperator"


    // $ANTLR start "ruleCompareOperator"
    // InternalSCL.g:5651:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return current; }
            // InternalSCL.g:5653:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalSCL.g:5654:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalSCL.g:5654:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt121=6;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt121=1;
                }
                break;
            case 55:
                {
                alt121=2;
                }
                break;
            case 56:
                {
                alt121=3;
                }
                break;
            case 57:
                {
                alt121=4;
                }
                break;
            case 58:
                {
                alt121=5;
                }
                break;
            case 59:
                {
                alt121=6;
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
                    // InternalSCL.g:5654:2: (enumLiteral_0= '==' )
                    {
                    // InternalSCL.g:5654:2: (enumLiteral_0= '==' )
                    // InternalSCL.g:5654:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:5660:6: (enumLiteral_1= '<' )
                    {
                    // InternalSCL.g:5660:6: (enumLiteral_1= '<' )
                    // InternalSCL.g:5660:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSCL.g:5666:6: (enumLiteral_2= '<=' )
                    {
                    // InternalSCL.g:5666:6: (enumLiteral_2= '<=' )
                    // InternalSCL.g:5666:8: enumLiteral_2= '<='
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
                    // InternalSCL.g:5672:6: (enumLiteral_3= '>' )
                    {
                    // InternalSCL.g:5672:6: (enumLiteral_3= '>' )
                    // InternalSCL.g:5672:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSCL.g:5678:6: (enumLiteral_4= '>=' )
                    {
                    // InternalSCL.g:5678:6: (enumLiteral_4= '>=' )
                    // InternalSCL.g:5678:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSCL.g:5684:6: (enumLiteral_5= '!=' )
                    {
                    // InternalSCL.g:5684:6: (enumLiteral_5= '!=' )
                    // InternalSCL.g:5684:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 140, ruleCompareOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rulePreOperator"
    // InternalSCL.g:5694:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;
        int rulePreOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return current; }
            // InternalSCL.g:5696:28: ( (enumLiteral_0= 'pre' ) )
            // InternalSCL.g:5697:1: (enumLiteral_0= 'pre' )
            {
            // InternalSCL.g:5697:1: (enumLiteral_0= 'pre' )
            // InternalSCL.g:5697:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 141, rulePreOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePreOperator"


    // $ANTLR start "ruleBitwiseOrOperator"
    // InternalSCL.g:5707:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleBitwiseOrOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return current; }
            // InternalSCL.g:5709:28: ( (enumLiteral_0= '|' ) )
            // InternalSCL.g:5710:1: (enumLiteral_0= '|' )
            {
            // InternalSCL.g:5710:1: (enumLiteral_0= '|' )
            // InternalSCL.g:5710:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 142, ruleBitwiseOrOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseOrOperator"


    // $ANTLR start "ruleBitwiseAndOperator"
    // InternalSCL.g:5720:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleBitwiseAndOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return current; }
            // InternalSCL.g:5722:28: ( (enumLiteral_0= '&' ) )
            // InternalSCL.g:5723:1: (enumLiteral_0= '&' )
            {
            // InternalSCL.g:5723:1: (enumLiteral_0= '&' )
            // InternalSCL.g:5723:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 143, ruleBitwiseAndOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseAndOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalSCL.g:5733:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleNotOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return current; }
            // InternalSCL.g:5735:28: ( (enumLiteral_0= '!' ) )
            // InternalSCL.g:5736:1: (enumLiteral_0= '!' )
            {
            // InternalSCL.g:5736:1: (enumLiteral_0= '!' )
            // InternalSCL.g:5736:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 144, ruleNotOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "ruleAddOperator"
    // InternalSCL.g:5746:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleAddOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return current; }
            // InternalSCL.g:5748:28: ( (enumLiteral_0= '+' ) )
            // InternalSCL.g:5749:1: (enumLiteral_0= '+' )
            {
            // InternalSCL.g:5749:1: (enumLiteral_0= '+' )
            // InternalSCL.g:5749:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 145, ruleAddOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "ruleSubOperator"
    // InternalSCL.g:5759:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleSubOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 146) ) { return current; }
            // InternalSCL.g:5761:28: ( (enumLiteral_0= '-' ) )
            // InternalSCL.g:5762:1: (enumLiteral_0= '-' )
            {
            // InternalSCL.g:5762:1: (enumLiteral_0= '-' )
            // InternalSCL.g:5762:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 146, ruleSubOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubOperator"


    // $ANTLR start "ruleMultOperator"
    // InternalSCL.g:5772:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleMultOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 147) ) { return current; }
            // InternalSCL.g:5774:28: ( (enumLiteral_0= '*' ) )
            // InternalSCL.g:5775:1: (enumLiteral_0= '*' )
            {
            // InternalSCL.g:5775:1: (enumLiteral_0= '*' )
            // InternalSCL.g:5775:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 147, ruleMultOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMultOperator"


    // $ANTLR start "ruleModOperator"
    // InternalSCL.g:5785:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleModOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 148) ) { return current; }
            // InternalSCL.g:5787:28: ( (enumLiteral_0= '%' ) )
            // InternalSCL.g:5788:1: (enumLiteral_0= '%' )
            {
            // InternalSCL.g:5788:1: (enumLiteral_0= '%' )
            // InternalSCL.g:5788:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 148, ruleModOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModOperator"


    // $ANTLR start "ruleDivOperator"
    // InternalSCL.g:5798:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleDivOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 149) ) { return current; }
            // InternalSCL.g:5800:28: ( (enumLiteral_0= '/' ) )
            // InternalSCL.g:5801:1: (enumLiteral_0= '/' )
            {
            // InternalSCL.g:5801:1: (enumLiteral_0= '/' )
            // InternalSCL.g:5801:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 149, ruleDivOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDivOperator"


    // $ANTLR start "ruleValOperator"
    // InternalSCL.g:5811:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleValOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 150) ) { return current; }
            // InternalSCL.g:5813:28: ( (enumLiteral_0= 'val' ) )
            // InternalSCL.g:5814:1: (enumLiteral_0= 'val' )
            {
            // InternalSCL.g:5814:1: (enumLiteral_0= 'val' )
            // InternalSCL.g:5814:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 150, ruleValOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValOperator"


    // $ANTLR start "ruleLogicalOrOperator"
    // InternalSCL.g:5824:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleLogicalOrOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 151) ) { return current; }
            // InternalSCL.g:5826:28: ( (enumLiteral_0= '||' ) )
            // InternalSCL.g:5827:1: (enumLiteral_0= '||' )
            {
            // InternalSCL.g:5827:1: (enumLiteral_0= '||' )
            // InternalSCL.g:5827:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 151, ruleLogicalOrOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // InternalSCL.g:5837:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleLogicalAndOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 152) ) { return current; }
            // InternalSCL.g:5839:28: ( (enumLiteral_0= '&&' ) )
            // InternalSCL.g:5840:1: (enumLiteral_0= '&&' )
            {
            // InternalSCL.g:5840:1: (enumLiteral_0= '&&' )
            // InternalSCL.g:5840:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 152, ruleLogicalAndOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleValueType"
    // InternalSCL.g:5854:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 153) ) { return current; }
            // InternalSCL.g:5856:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) )
            // InternalSCL.g:5857:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            {
            // InternalSCL.g:5857:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            int alt122=7;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt122=1;
                }
                break;
            case 70:
                {
                alt122=2;
                }
                break;
            case 71:
                {
                alt122=3;
                }
                break;
            case 72:
                {
                alt122=4;
                }
                break;
            case 73:
                {
                alt122=5;
                }
                break;
            case 74:
                {
                alt122=6;
                }
                break;
            case 75:
                {
                alt122=7;
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
                    // InternalSCL.g:5857:2: (enumLiteral_0= 'pure' )
                    {
                    // InternalSCL.g:5857:2: (enumLiteral_0= 'pure' )
                    // InternalSCL.g:5857:4: enumLiteral_0= 'pure'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:5863:6: (enumLiteral_1= 'bool' )
                    {
                    // InternalSCL.g:5863:6: (enumLiteral_1= 'bool' )
                    // InternalSCL.g:5863:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSCL.g:5869:6: (enumLiteral_2= 'unsigned' )
                    {
                    // InternalSCL.g:5869:6: (enumLiteral_2= 'unsigned' )
                    // InternalSCL.g:5869:8: enumLiteral_2= 'unsigned'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSCL.g:5875:6: (enumLiteral_3= 'int' )
                    {
                    // InternalSCL.g:5875:6: (enumLiteral_3= 'int' )
                    // InternalSCL.g:5875:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSCL.g:5881:6: (enumLiteral_4= 'float' )
                    {
                    // InternalSCL.g:5881:6: (enumLiteral_4= 'float' )
                    // InternalSCL.g:5881:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSCL.g:5887:6: (enumLiteral_5= 'string' )
                    {
                    // InternalSCL.g:5887:6: (enumLiteral_5= 'string' )
                    // InternalSCL.g:5887:8: enumLiteral_5= 'string'
                    {
                    enumLiteral_5=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSCL.g:5893:6: (enumLiteral_6= 'host' )
                    {
                    // InternalSCL.g:5893:6: (enumLiteral_6= 'host' )
                    // InternalSCL.g:5893:8: enumLiteral_6= 'host'
                    {
                    enumLiteral_6=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 153, ruleValueType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "ruleCombineOperator"
    // InternalSCL.g:5905:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 154) ) { return current; }
            // InternalSCL.g:5907:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // InternalSCL.g:5908:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // InternalSCL.g:5908:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt123=8;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt123=1;
                }
                break;
            case 62:
                {
                alt123=2;
                }
                break;
            case 63:
                {
                alt123=3;
                }
                break;
            case 77:
                {
                alt123=4;
                }
                break;
            case 78:
                {
                alt123=5;
                }
                break;
            case 61:
                {
                alt123=6;
                }
                break;
            case 42:
                {
                alt123=7;
                }
                break;
            case 75:
                {
                alt123=8;
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
                    // InternalSCL.g:5908:2: (enumLiteral_0= 'none' )
                    {
                    // InternalSCL.g:5908:2: (enumLiteral_0= 'none' )
                    // InternalSCL.g:5908:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:5914:6: (enumLiteral_1= '+' )
                    {
                    // InternalSCL.g:5914:6: (enumLiteral_1= '+' )
                    // InternalSCL.g:5914:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSCL.g:5920:6: (enumLiteral_2= '*' )
                    {
                    // InternalSCL.g:5920:6: (enumLiteral_2= '*' )
                    // InternalSCL.g:5920:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSCL.g:5926:6: (enumLiteral_3= 'max' )
                    {
                    // InternalSCL.g:5926:6: (enumLiteral_3= 'max' )
                    // InternalSCL.g:5926:8: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSCL.g:5932:6: (enumLiteral_4= 'min' )
                    {
                    // InternalSCL.g:5932:6: (enumLiteral_4= 'min' )
                    // InternalSCL.g:5932:8: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSCL.g:5938:6: (enumLiteral_5= '|' )
                    {
                    // InternalSCL.g:5938:6: (enumLiteral_5= '|' )
                    // InternalSCL.g:5938:8: enumLiteral_5= '|'
                    {
                    enumLiteral_5=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSCL.g:5944:6: (enumLiteral_6= '&' )
                    {
                    // InternalSCL.g:5944:6: (enumLiteral_6= '&' )
                    // InternalSCL.g:5944:8: enumLiteral_6= '&'
                    {
                    enumLiteral_6=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalSCL.g:5950:6: (enumLiteral_7= 'host' )
                    {
                    // InternalSCL.g:5950:6: (enumLiteral_7= 'host' )
                    // InternalSCL.g:5950:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 154, ruleCombineOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCombineOperator"

    // $ANTLR start synpred3_InternalSCL
    public final void synpred3_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_statements_5_0 = null;


        // InternalSCL.g:150:3: ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) )
        // InternalSCL.g:150:3: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
        {
        // InternalSCL.g:150:3: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
        // InternalSCL.g:150:4: ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';'
        {
        // InternalSCL.g:150:4: ( (lv_statements_5_0= ruleInstructionStatement ) )
        // InternalSCL.g:151:1: (lv_statements_5_0= ruleInstructionStatement )
        {
        // InternalSCL.g:151:1: (lv_statements_5_0= ruleInstructionStatement )
        // InternalSCL.g:152:3: lv_statements_5_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSCLProgramAccess().getStatementsInstructionStatementParserRuleCall_5_0_0_0_0()); 
          	    
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
    // $ANTLR end synpred3_InternalSCL

    // $ANTLR start synpred4_InternalSCL
    public final void synpred4_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_7_0 = null;


        // InternalSCL.g:173:6: ( ( (lv_statements_7_0= ruleEmptyStatement ) ) )
        // InternalSCL.g:173:6: ( (lv_statements_7_0= ruleEmptyStatement ) )
        {
        // InternalSCL.g:173:6: ( (lv_statements_7_0= ruleEmptyStatement ) )
        // InternalSCL.g:174:1: (lv_statements_7_0= ruleEmptyStatement )
        {
        // InternalSCL.g:174:1: (lv_statements_7_0= ruleEmptyStatement )
        // InternalSCL.g:175:3: lv_statements_7_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSCLProgramAccess().getStatementsEmptyStatementParserRuleCall_5_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
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


        // InternalSCL.g:597:5: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) )
        // InternalSCL.g:597:5: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
        {
        // InternalSCL.g:597:5: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
        // InternalSCL.g:597:6: ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';'
        {
        // InternalSCL.g:597:6: ( (lv_statements_4_0= ruleInstructionStatement ) )
        // InternalSCL.g:598:1: (lv_statements_4_0= ruleInstructionStatement )
        {
        // InternalSCL.g:598:1: (lv_statements_4_0= ruleInstructionStatement )
        // InternalSCL.g:599:3: lv_statements_4_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsInstructionStatementParserRuleCall_4_0_0_0_0()); 
          	    
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
    // $ANTLR end synpred16_InternalSCL

    // $ANTLR start synpred17_InternalSCL
    public final void synpred17_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_6_0 = null;


        // InternalSCL.g:620:6: ( ( (lv_statements_6_0= ruleEmptyStatement ) ) )
        // InternalSCL.g:620:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
        {
        // InternalSCL.g:620:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
        // InternalSCL.g:621:1: (lv_statements_6_0= ruleEmptyStatement )
        {
        // InternalSCL.g:621:1: (lv_statements_6_0= ruleEmptyStatement )
        // InternalSCL.g:622:3: lv_statements_6_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsEmptyStatementParserRuleCall_4_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
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


        // InternalSCL.g:696:5: ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) )
        // InternalSCL.g:696:5: ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' )
        {
        // InternalSCL.g:696:5: ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' )
        // InternalSCL.g:696:6: ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';'
        {
        // InternalSCL.g:696:6: ( (lv_elseStatements_11_0= ruleInstructionStatement ) )
        // InternalSCL.g:697:1: (lv_elseStatements_11_0= ruleInstructionStatement )
        {
        // InternalSCL.g:697:1: (lv_elseStatements_11_0= ruleInstructionStatement )
        // InternalSCL.g:698:3: lv_elseStatements_11_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsInstructionStatementParserRuleCall_5_2_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_7);
        lv_elseStatements_11_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_12=(Token)match(input,18,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalSCL

    // $ANTLR start synpred22_InternalSCL
    public final void synpred22_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_elseStatements_13_0 = null;


        // InternalSCL.g:719:6: ( ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )
        // InternalSCL.g:719:6: ( (lv_elseStatements_13_0= ruleEmptyStatement ) )
        {
        // InternalSCL.g:719:6: ( (lv_elseStatements_13_0= ruleEmptyStatement ) )
        // InternalSCL.g:720:1: (lv_elseStatements_13_0= ruleEmptyStatement )
        {
        // InternalSCL.g:720:1: (lv_elseStatements_13_0= ruleEmptyStatement )
        // InternalSCL.g:721:3: lv_elseStatements_13_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsEmptyStatementParserRuleCall_5_2_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_elseStatements_13_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred22_InternalSCL

    // $ANTLR start synpred28_InternalSCL
    public final void synpred28_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;


        // InternalSCL.g:872:5: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) )
        // InternalSCL.g:872:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
        {
        // InternalSCL.g:872:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
        // InternalSCL.g:872:6: ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';'
        {
        // InternalSCL.g:872:6: ( (lv_statements_3_0= ruleInstructionStatement ) )
        // InternalSCL.g:873:1: (lv_statements_3_0= ruleInstructionStatement )
        {
        // InternalSCL.g:873:1: (lv_statements_3_0= ruleInstructionStatement )
        // InternalSCL.g:874:3: lv_statements_3_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_2_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_7);
        lv_statements_3_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalSCL

    // $ANTLR start synpred29_InternalSCL
    public final void synpred29_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_5_0 = null;


        // InternalSCL.g:895:6: ( ( (lv_statements_5_0= ruleEmptyStatement ) ) )
        // InternalSCL.g:895:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
        {
        // InternalSCL.g:895:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
        // InternalSCL.g:896:1: (lv_statements_5_0= ruleEmptyStatement )
        {
        // InternalSCL.g:896:1: (lv_statements_5_0= ruleEmptyStatement )
        // InternalSCL.g:897:3: lv_statements_5_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsEmptyStatementParserRuleCall_2_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_statements_5_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred29_InternalSCL

    // $ANTLR start synpred34_InternalSCL
    public final void synpred34_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;


        // InternalSCL.g:1104:5: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) )
        // InternalSCL.g:1104:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
        {
        // InternalSCL.g:1104:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
        // InternalSCL.g:1104:6: ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';'
        {
        // InternalSCL.g:1104:6: ( (lv_statements_3_0= ruleInstructionStatement ) )
        // InternalSCL.g:1105:1: (lv_statements_3_0= ruleInstructionStatement )
        {
        // InternalSCL.g:1105:1: (lv_statements_3_0= ruleInstructionStatement )
        // InternalSCL.g:1106:3: lv_statements_3_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsInstructionStatementParserRuleCall_3_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_7);
        lv_statements_3_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_InternalSCL

    // $ANTLR start synpred35_InternalSCL
    public final void synpred35_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_5_0 = null;


        // InternalSCL.g:1127:6: ( ( (lv_statements_5_0= ruleEmptyStatement ) ) )
        // InternalSCL.g:1127:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
        {
        // InternalSCL.g:1127:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
        // InternalSCL.g:1128:1: (lv_statements_5_0= ruleEmptyStatement )
        {
        // InternalSCL.g:1128:1: (lv_statements_5_0= ruleEmptyStatement )
        // InternalSCL.g:1129:3: lv_statements_5_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsEmptyStatementParserRuleCall_3_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_statements_5_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred35_InternalSCL

    // $ANTLR start synpred45_InternalSCL
    public final void synpred45_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_expression_0_0 = null;


        // InternalSCL.g:1410:2: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) )
        // InternalSCL.g:1410:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
        {
        // InternalSCL.g:1410:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
        // InternalSCL.g:1411:1: (lv_expression_0_0= ruleAnnotatedExpression )
        {
        // InternalSCL.g:1411:1: (lv_expression_0_0= ruleAnnotatedExpression )
        // InternalSCL.g:1412:3: lv_expression_0_0= ruleAnnotatedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTestEntityAccess().getExpressionAnnotatedExpressionParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_expression_0_0=ruleAnnotatedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred45_InternalSCL

    // $ANTLR start synpred73_InternalSCL
    public final void synpred73_InternalSCL_fragment() throws RecognitionException {   
        EObject this_Assignment_0 = null;


        // InternalSCL.g:2332:2: (this_Assignment_0= ruleAssignment )
        // InternalSCL.g:2332:2: this_Assignment_0= ruleAssignment
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
    // $ANTLR end synpred73_InternalSCL

    // $ANTLR start synpred74_InternalSCL
    public final void synpred74_InternalSCL_fragment() throws RecognitionException {   
        EObject this_PostfixEffect_1 = null;


        // InternalSCL.g:2345:2: (this_PostfixEffect_1= rulePostfixEffect )
        // InternalSCL.g:2345:2: this_PostfixEffect_1= rulePostfixEffect
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
    // $ANTLR end synpred74_InternalSCL

    // $ANTLR start synpred75_InternalSCL
    public final void synpred75_InternalSCL_fragment() throws RecognitionException {   
        EObject this_Emission_2 = null;


        // InternalSCL.g:2358:2: (this_Emission_2= ruleEmission )
        // InternalSCL.g:2358:2: this_Emission_2= ruleEmission
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
    // $ANTLR end synpred75_InternalSCL

    // $ANTLR start synpred76_InternalSCL
    public final void synpred76_InternalSCL_fragment() throws RecognitionException {   
        EObject this_HostcodeEffect_3 = null;


        // InternalSCL.g:2371:2: (this_HostcodeEffect_3= ruleHostcodeEffect )
        // InternalSCL.g:2371:2: this_HostcodeEffect_3= ruleHostcodeEffect
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
    // $ANTLR end synpred76_InternalSCL

    // $ANTLR start synpred85_InternalSCL
    public final void synpred85_InternalSCL_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalSCL.g:2764:2: (this_BoolExpression_0= ruleBoolExpression )
        // InternalSCL.g:2764:2: this_BoolExpression_0= ruleBoolExpression
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
    // $ANTLR end synpred85_InternalSCL

    // $ANTLR start synpred95_InternalSCL
    public final void synpred95_InternalSCL_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // InternalSCL.g:3233:2: (this_ValuedExpression_0= ruleValuedExpression )
        // InternalSCL.g:3233:2: this_ValuedExpression_0= ruleValuedExpression
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
    // $ANTLR end synpred95_InternalSCL

    // $ANTLR start synpred115_InternalSCL
    public final void synpred115_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // InternalSCL.g:3991:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // InternalSCL.g:3991:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // InternalSCL.g:3991:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // InternalSCL.g:3991:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,44,FOLLOW_59); if (state.failed) return ;
        pushFollow(FOLLOW_47);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,45,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred115_InternalSCL

    // $ANTLR start synpred119_InternalSCL
    public final void synpred119_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_indices_4_0 = null;


        // InternalSCL.g:4188:6: (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )
        // InternalSCL.g:4188:6: otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']'
        {
        otherlv_3=(Token)match(input,21,FOLLOW_12); if (state.failed) return ;
        // InternalSCL.g:4192:1: ( (lv_indices_4_0= ruleExpression ) )
        // InternalSCL.g:4193:1: (lv_indices_4_0= ruleExpression )
        {
        // InternalSCL.g:4193:1: (lv_indices_4_0= ruleExpression )
        // InternalSCL.g:4194:3: lv_indices_4_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
          	    
        }
        pushFollow(FOLLOW_13);
        lv_indices_4_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,22,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred119_InternalSCL

    // Delegated rules

    public final boolean synpred115_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_InternalSCL_fragment(); // can never throw exception
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
    public final boolean synpred28_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalSCL_fragment(); // can never throw exception
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
    public final boolean synpred119_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_InternalSCL_fragment(); // can never throw exception
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
    public final boolean synpred45_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalSCL_fragment(); // can never throw exception
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
    public final boolean synpred73_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred95_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred95_InternalSCL_fragment(); // can never throw exception
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
    public final boolean synpred76_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_InternalSCL_fragment(); // can never throw exception
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
    public final boolean synpred75_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_InternalSCL_fragment(); // can never throw exception
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
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA97 dfa97 = new DFA97(this);
    protected DFA106 dfa106 = new DFA106(this);
    protected DFA107 dfa107 = new DFA107(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\10\0\3\uffff";
    static final String dfa_3s = "\1\61\10\0\3\uffff";
    static final String dfa_4s = "\11\uffff\1\3\1\1\1\2";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\5\uffff\1\1\6\uffff\1\10\1\uffff\1\11\4\uffff\1\4\3\uffff\1\5\1\uffff\1\6\2\uffff\1\7\17\uffff\1\2",
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
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
    static final String dfa_7s = "\73\uffff";
    static final String dfa_8s = "\3\4\2\uffff\2\4\1\5\4\4\1\5\4\4\1\26\1\4\1\5\2\4\1\5\6\4\1\5\2\4\2\26\3\4\1\5\3\4\1\5\2\4\1\5\5\4\1\5\5\4\1\5\2\4";
    static final String dfa_9s = "\2\113\1\4\2\uffff\1\113\1\4\1\5\1\4\3\113\1\7\4\113\1\62\1\4\1\5\1\63\1\4\1\5\1\63\5\113\1\7\2\113\1\62\1\26\3\113\1\7\2\113\1\4\1\5\1\63\1\4\1\5\5\113\1\7\4\113\1\4\1\5\2\113";
    static final String dfa_10s = "\3\uffff\1\2\1\1\66\uffff";
    static final String dfa_11s = "\73\uffff}>";
    static final String[] dfa_12s = {
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\1\uffff\3\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\uffff\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\uffff\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\11\1\15\1\uffff\1\16\1\13\1\12\1\1\6\uffff\1\3\3\uffff\1\10\2\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\uffff\1\4\4\uffff\1\6\1\uffff\1\2\1\7\1\14\21\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\3\5\uffff\1\1\6\uffff\1\3\2\uffff\2\3\1\uffff\2\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\4\uffff\1\22\1\uffff\1\2\1\23\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\15\1\uffff\1\16",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\11\1\15\1\uffff\1\16\1\13\1\12\1\1\6\uffff\1\3\3\uffff\1\10\2\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\uffff\1\4\4\uffff\1\6\1\uffff\1\2\1\7\1\14\21\uffff\7\4",
            "\1\11\1\15\1\uffff\1\16\1\13\1\12\1\1\6\uffff\1\3\3\uffff\1\10\2\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\uffff\1\4\6\uffff\1\2\1\uffff\1\14\21\uffff\7\4",
            "\1\27\30\uffff\1\25\2\uffff\1\26",
            "\1\30",
            "\1\31",
            "\1\33\1\36\1\uffff\1\37\1\34\1\32\51\uffff\1\35",
            "\1\40",
            "\1\41",
            "\1\43\1\46\1\uffff\1\47\1\44\1\42\51\uffff\1\45",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\4\uffff\1\22\1\uffff\1\2\1\23\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\4\uffff\1\50\1\uffff\1\2\1\51\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\36\1\uffff\1\37",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\27\30\uffff\1\25\2\uffff\1\26",
            "\1\27",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\4\uffff\1\53\1\uffff\1\2\1\54\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\46\1\uffff\1\47",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\55",
            "\1\56",
            "\1\60\1\63\1\uffff\1\64\1\61\1\57\51\uffff\1\62",
            "\1\65",
            "\1\66",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\4\uffff\1\50\1\uffff\1\2\1\51\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\4\uffff\1\67\1\uffff\1\2\1\70\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\63\1\uffff\1\64",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\4\uffff\1\53\1\uffff\1\2\1\54\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\71",
            "\1\72",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\4\uffff\1\67\1\uffff\1\2\1\70\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 579:1: ( (lv_declarations_3_0= ruleDeclaration ) )*";
        }
    }
    static final String dfa_13s = "\15\uffff";
    static final String dfa_14s = "\1\4\10\0\4\uffff";
    static final String dfa_15s = "\1\61\10\0\4\uffff";
    static final String dfa_16s = "\11\uffff\1\3\1\uffff\1\1\1\2";
    static final String dfa_17s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\4\uffff}>";
    static final String[] dfa_18s = {
            "\1\3\5\uffff\1\1\6\uffff\1\10\6\uffff\1\4\1\uffff\2\11\1\5\1\uffff\1\6\2\uffff\1\7\17\uffff\1\2",
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

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "()* loopback of 597:4: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )*";
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
    static final String[] dfa_19s = {
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\2\uffff\2\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\uffff\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\uffff\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\11\1\15\1\uffff\1\16\1\13\1\12\1\1\6\uffff\1\3\3\uffff\1\10\2\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\uffff\1\4\4\uffff\1\6\1\uffff\1\2\1\7\1\14\21\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\3\5\uffff\1\1\6\uffff\1\3\2\uffff\2\3\1\uffff\2\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\4\uffff\1\22\1\uffff\1\2\1\23\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\15\1\uffff\1\16",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\11\1\15\1\uffff\1\16\1\13\1\12\1\1\6\uffff\1\3\3\uffff\1\10\2\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\uffff\1\4\4\uffff\1\6\1\uffff\1\2\1\7\1\14\21\uffff\7\4",
            "\1\11\1\15\1\uffff\1\16\1\13\1\12\1\1\6\uffff\1\3\3\uffff\1\10\2\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\uffff\1\4\6\uffff\1\2\1\uffff\1\14\21\uffff\7\4",
            "\1\27\30\uffff\1\25\2\uffff\1\26",
            "\1\30",
            "\1\31",
            "\1\33\1\36\1\uffff\1\37\1\34\1\32\51\uffff\1\35",
            "\1\40",
            "\1\41",
            "\1\43\1\46\1\uffff\1\47\1\44\1\42\51\uffff\1\45",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\4\uffff\1\22\1\uffff\1\2\1\23\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\4\uffff\1\50\1\uffff\1\2\1\51\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\36\1\uffff\1\37",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\27\30\uffff\1\25\2\uffff\1\26",
            "\1\27",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\4\uffff\1\53\1\uffff\1\2\1\54\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\46\1\uffff\1\47",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\55",
            "\1\56",
            "\1\60\1\63\1\uffff\1\64\1\61\1\57\51\uffff\1\62",
            "\1\65",
            "\1\66",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\4\uffff\1\50\1\uffff\1\2\1\51\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\4\uffff\1\67\1\uffff\1\2\1\70\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\63\1\uffff\1\64",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\4\uffff\1\53\1\uffff\1\2\1\54\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\71",
            "\1\72",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\4\uffff\1\67\1\uffff\1\2\1\70\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4"
    };
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()* loopback of 678:1: ( (lv_declarations_10_0= ruleDeclaration ) )*";
        }
    }
    static final String[] dfa_20s = {
            "\1\3\5\uffff\1\1\6\uffff\1\10\6\uffff\1\4\2\uffff\1\11\1\5\1\uffff\1\6\2\uffff\1\7\17\uffff\1\2",
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
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 696:4: ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )*";
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
    static final String dfa_21s = "\1\4\72\uffff";
    static final String dfa_22s = "\3\4\2\uffff\2\4\1\5\3\4\1\5\7\4\1\5\1\26\3\4\1\5\5\4\1\5\2\4\1\5\2\26\3\4\1\5\6\4\1\5\3\4\1\5\5\4\1\5\2\4";
    static final String dfa_23s = "\2\61\1\4\2\uffff\1\63\1\4\1\5\1\61\1\62\1\61\1\7\2\61\1\4\3\63\1\4\1\5\1\62\1\61\1\62\1\61\1\7\2\61\1\62\1\61\1\4\1\5\1\63\1\4\1\5\1\62\1\26\1\61\1\62\1\61\1\7\2\61\1\62\1\61\1\63\1\4\1\5\1\61\1\62\1\61\1\7\2\61\1\62\1\61\1\4\1\5\1\62\1\61";
    static final String dfa_24s = "\3\uffff\1\1\1\2\66\uffff";
    static final String[] dfa_25s = {
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\4\4\17\uffff\1\2",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\17\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\11\1\14\1\uffff\1\15\1\12\1\10\1\1\6\uffff\1\4\3\uffff\1\16\2\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\15\uffff\1\6\1\uffff\1\2\1\7\1\13",
            "\1\17",
            "\1\20",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\21\7\uffff\1\2",
            "\1\4\5\uffff\1\1\6\uffff\1\4\2\uffff\2\4\1\uffff\2\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\21\5\uffff\1\22\1\uffff\1\2\1\23",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\21\7\uffff\1\2",
            "\1\14\1\uffff\1\15",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\21\7\uffff\1\2",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\21\7\uffff\1\2",
            "\1\24",
            "\1\11\1\14\1\uffff\1\15\1\12\1\10\1\1\6\uffff\1\4\3\uffff\1\16\2\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\15\uffff\1\6\1\uffff\1\2\1\7\1\13",
            "\1\11\1\14\1\uffff\1\15\1\12\1\10\1\1\6\uffff\1\4\3\uffff\1\16\2\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\17\uffff\1\2\1\uffff\1\13",
            "\1\26\1\31\1\uffff\1\32\1\27\1\25\51\uffff\1\30",
            "\1\33",
            "\1\34",
            "\1\37\30\uffff\1\35\2\uffff\1\36",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\21\7\uffff\1\2",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\21\5\uffff\1\40\1\uffff\1\2\1\41",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\21\7\uffff\1\2",
            "\1\31\1\uffff\1\32",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\21\7\uffff\1\2",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\21\7\uffff\1\2",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\21\5\uffff\1\22\1\uffff\1\2\1\23",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\21\7\uffff\1\2",
            "\1\42",
            "\1\43",
            "\1\45\1\50\1\uffff\1\51\1\46\1\44\51\uffff\1\47",
            "\1\52",
            "\1\53",
            "\1\37\30\uffff\1\35\2\uffff\1\36",
            "\1\37",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\54\7\uffff\1\2",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\54\5\uffff\1\55\1\uffff\1\2\1\56",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\54\7\uffff\1\2",
            "\1\50\1\uffff\1\51",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\54\7\uffff\1\2",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\54\7\uffff\1\2",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\21\5\uffff\1\40\1\uffff\1\2\1\41",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\21\7\uffff\1\2",
            "\1\60\1\63\1\uffff\1\64\1\61\1\57\51\uffff\1\62",
            "\1\65",
            "\1\66",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\54\7\uffff\1\2",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\54\5\uffff\1\67\1\uffff\1\2\1\70",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\54\7\uffff\1\2",
            "\1\63\1\uffff\1\64",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\54\7\uffff\1\2",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\54\7\uffff\1\2",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\54\5\uffff\1\55\1\uffff\1\2\1\56",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\54\7\uffff\1\2",
            "\1\71",
            "\1\72",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\54\5\uffff\1\67\1\uffff\1\2\1\70",
            "\1\4\5\uffff\1\1\6\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\3\1\4\2\uffff\1\4\7\uffff\1\54\7\uffff\1\2"
    };
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_7;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_11;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "850:2: ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'thread' )?";
        }
    }
    static final String dfa_26s = "\16\uffff";
    static final String dfa_27s = "\1\11\15\uffff";
    static final String dfa_28s = "\1\4\10\0\5\uffff";
    static final String dfa_29s = "\1\61\10\0\5\uffff";
    static final String dfa_30s = "\11\uffff\1\3\2\uffff\1\1\1\2";
    static final String dfa_31s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\5\uffff}>";
    static final String[] dfa_32s = {
            "\1\3\5\uffff\1\1\6\uffff\1\10\6\uffff\1\4\3\uffff\1\5\1\uffff\1\6\2\11\1\7\17\uffff\1\2",
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

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_26;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "()* loopback of 872:4: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )*";
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
                        if ( (synpred28_InternalSCL()) ) {s = 12;}

                        else if ( (synpred29_InternalSCL()) ) {s = 13;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_2 = input.LA(1);

                         
                        int index21_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 12;}

                        else if ( (synpred29_InternalSCL()) ) {s = 13;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_3 = input.LA(1);

                         
                        int index21_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 12;}

                        else if ( (synpred29_InternalSCL()) ) {s = 13;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_4 = input.LA(1);

                         
                        int index21_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_5 = input.LA(1);

                         
                        int index21_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_6 = input.LA(1);

                         
                        int index21_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_7 = input.LA(1);

                         
                        int index21_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index21_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA21_8 = input.LA(1);

                         
                        int index21_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 12;}

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
    static final String[] dfa_33s = {
            "\1\3\5\uffff\1\1\6\uffff\1\3\1\uffff\1\3\4\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\uffff\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\uffff\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\11\1\15\1\uffff\1\16\1\13\1\12\1\1\6\uffff\1\3\3\uffff\1\10\2\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\uffff\1\4\4\uffff\1\6\1\uffff\1\2\1\7\1\14\21\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\3\5\uffff\1\1\6\uffff\1\3\2\uffff\2\3\1\uffff\2\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\4\uffff\1\22\1\uffff\1\2\1\23\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\15\1\uffff\1\16",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\11\1\15\1\uffff\1\16\1\13\1\12\1\1\6\uffff\1\3\3\uffff\1\10\2\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\uffff\1\4\4\uffff\1\6\1\uffff\1\2\1\7\1\14\21\uffff\7\4",
            "\1\11\1\15\1\uffff\1\16\1\13\1\12\1\1\6\uffff\1\3\3\uffff\1\10\2\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\uffff\1\4\6\uffff\1\2\1\uffff\1\14\21\uffff\7\4",
            "\1\27\30\uffff\1\25\2\uffff\1\26",
            "\1\30",
            "\1\31",
            "\1\33\1\36\1\uffff\1\37\1\34\1\32\51\uffff\1\35",
            "\1\40",
            "\1\41",
            "\1\43\1\46\1\uffff\1\47\1\44\1\42\51\uffff\1\45",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\4\uffff\1\22\1\uffff\1\2\1\23\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\4\uffff\1\50\1\uffff\1\2\1\51\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\36\1\uffff\1\37",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\27\30\uffff\1\25\2\uffff\1\26",
            "\1\27",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\4\uffff\1\53\1\uffff\1\2\1\54\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\46\1\uffff\1\47",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\55",
            "\1\56",
            "\1\60\1\63\1\uffff\1\64\1\61\1\57\51\uffff\1\62",
            "\1\65",
            "\1\66",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\4\uffff\1\50\1\uffff\1\2\1\51\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\24\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\4\uffff\1\67\1\uffff\1\2\1\70\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\63\1\uffff\1\64",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\4\uffff\1\53\1\uffff\1\2\1\54\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\71",
            "\1\72",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\4\uffff\1\67\1\uffff\1\2\1\70\22\uffff\7\4",
            "\1\3\5\uffff\1\1\6\uffff\1\3\6\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\5\4\1\52\1\4\6\uffff\1\2\23\uffff\7\4"
    };
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "()* loopback of 1086:1: ( (lv_declarations_2_0= ruleDeclaration ) )*";
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 1104:4: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_1 = input.LA(1);

                         
                        int index26_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 10;}

                        else if ( (synpred35_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index26_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 10;}

                        else if ( (synpred35_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_3 = input.LA(1);

                         
                        int index26_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 10;}

                        else if ( (synpred35_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index26_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_4 = input.LA(1);

                         
                        int index26_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index26_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_5 = input.LA(1);

                         
                        int index26_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index26_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_6 = input.LA(1);

                         
                        int index26_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index26_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_7 = input.LA(1);

                         
                        int index26_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index26_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA26_8 = input.LA(1);

                         
                        int index26_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index26_8);
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
    static final String dfa_34s = "\120\uffff";
    static final String dfa_35s = "\1\3\11\uffff\1\3\105\uffff";
    static final String dfa_36s = "\3\4\2\uffff\2\4\1\5\4\4\1\5\4\4\1\26\2\4\1\5\4\4\1\5\4\4\1\5\6\4\2\26\3\4\1\5\3\4\1\5\1\4\1\5\5\4\1\5\5\4\1\26\3\4\1\5\6\4\1\5\2\4\1\5\2\26\3\4";
    static final String dfa_37s = "\2\113\1\4\2\uffff\1\113\1\4\1\5\1\4\3\113\1\7\4\113\1\62\1\63\1\4\1\5\1\63\1\113\2\4\1\5\1\63\3\113\1\7\6\113\1\62\1\26\3\113\1\7\2\113\1\4\1\5\1\4\1\5\1\4\2\113\1\63\1\4\1\5\1\63\4\113\1\62\3\113\1\7\5\113\1\4\1\5\1\63\1\4\1\5\1\62\1\26\3\113";
    static final String dfa_38s = "\3\uffff\1\2\1\1\113\uffff";
    static final String dfa_39s = "\120\uffff}>";
    static final String[] dfa_40s = {
            "\1\3\1\uffff\1\3\3\uffff\1\1\27\uffff\2\3\5\4\1\uffff\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\1\30\uffff\1\3\5\4\1\uffff\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\12\1\15\1\3\1\16\1\13\1\11\1\1\12\uffff\1\10\15\uffff\1\3\5\4\1\uffff\1\4\4\uffff\1\6\1\uffff\1\2\1\7\1\14\21\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\3\1\uffff\1\3\3\uffff\1\1\30\uffff\1\3\5\4\1\22\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\1\12\uffff\1\3\14\uffff\2\3\5\4\1\25\1\4\1\uffff\1\3\1\uffff\1\3\1\23\1\uffff\1\2\1\24\1\uffff\2\3\17\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\15\1\uffff\1\16",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\12\1\15\1\3\1\16\1\13\1\11\1\1\12\uffff\1\10\15\uffff\1\3\5\4\1\uffff\1\4\4\uffff\1\6\1\uffff\1\2\1\7\1\14\21\uffff\7\4",
            "\1\12\1\15\1\3\1\16\1\13\1\11\1\1\12\uffff\1\10\15\uffff\1\3\5\4\1\uffff\1\4\6\uffff\1\2\1\uffff\1\14\21\uffff\7\4",
            "\1\32\30\uffff\1\30\2\uffff\1\31",
            "\1\34\1\37\1\uffff\1\40\1\35\1\33\51\uffff\1\36",
            "\1\41",
            "\1\42",
            "\1\34\1\37\1\uffff\1\40\1\35\1\43\51\uffff\1\36",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\uffff\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\50\1\53\1\uffff\1\54\1\51\1\47\51\uffff\1\52",
            "\1\3\1\uffff\1\3\3\uffff\1\1\30\uffff\1\3\5\4\1\22\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\4\uffff\1\55\1\uffff\1\27\1\56\22\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\37\1\uffff\1\40",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\4\uffff\1\23\1\uffff\1\27\1\24\22\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\63\1\15\1\3\1\16\1\13\1\62\1\26\12\uffff\1\61\15\uffff\1\3\5\4\1\uffff\1\4\4\uffff\1\57\1\uffff\1\27\1\60\1\14\21\uffff\7\4",
            "\1\32\30\uffff\1\30\2\uffff\1\31",
            "\1\32",
            "\1\3\1\uffff\1\3\3\uffff\1\1\30\uffff\1\3\5\4\1\64\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\4\uffff\1\65\1\uffff\1\27\1\66\22\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\53\1\uffff\1\54",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\12\uffff\1\3\15\uffff\1\3\5\4\1\25\1\4\1\uffff\1\3\1\uffff\1\3\1\23\1\uffff\1\27\1\24\1\uffff\2\3\17\uffff\7\4",
            "\1\76\1\101\1\uffff\1\102\1\77\1\75\51\uffff\1\100",
            "\1\103",
            "\1\104",
            "\1\76\1\101\1\uffff\1\102\1\77\1\105\51\uffff\1\100",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\4\uffff\1\55\1\uffff\1\27\1\56\22\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\63\1\15\1\3\1\16\1\13\1\62\1\26\12\uffff\1\61\15\uffff\1\3\5\4\1\uffff\1\4\4\uffff\1\57\1\uffff\1\27\1\60\1\14\21\uffff\7\4",
            "\1\63\1\15\1\3\1\16\1\13\1\62\1\26\12\uffff\1\61\15\uffff\1\3\5\4\1\uffff\1\4\6\uffff\1\27\1\uffff\1\14\21\uffff\7\4",
            "\1\110\30\uffff\1\106\2\uffff\1\107",
            "\1\3\1\uffff\1\3\3\uffff\1\1\30\uffff\1\3\5\4\1\64\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\4\uffff\1\111\1\uffff\1\27\1\112\22\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\101\1\uffff\1\102",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\4\uffff\1\65\1\uffff\1\27\1\66\22\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\113",
            "\1\114",
            "\1\50\1\53\1\uffff\1\54\1\51\1\115\51\uffff\1\52",
            "\1\116",
            "\1\117",
            "\1\110\30\uffff\1\106\2\uffff\1\107",
            "\1\110",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\4\uffff\1\111\1\uffff\1\27\1\112\22\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4"
    };

    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_34;
            this.eof = dfa_35;
            this.min = dfa_36;
            this.max = dfa_37;
            this.accept = dfa_38;
            this.special = dfa_39;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "()* loopback of 1217:2: ( (lv_declarations_1_0= ruleDeclaration ) )*";
        }
    }
    static final String dfa_41s = "\2\113\1\4\2\uffff\1\113\1\4\1\5\1\4\3\113\1\7\4\113\1\62\1\63\1\4\1\5\1\63\1\113\2\4\1\5\1\63\3\113\1\7\6\113\1\62\1\26\3\113\1\7\2\113\1\4\1\5\1\4\1\5\2\113\1\4\1\63\1\4\1\5\1\63\4\113\1\62\3\113\1\7\5\113\1\4\1\5\1\63\1\4\1\5\1\62\1\26\3\113";
    static final String[] dfa_42s = {
            "\1\3\1\uffff\1\3\3\uffff\1\1\10\uffff\1\3\16\uffff\2\3\5\4\1\uffff\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\1\30\uffff\1\3\5\4\1\uffff\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\12\1\15\1\3\1\16\1\13\1\11\1\1\12\uffff\1\10\15\uffff\1\3\5\4\1\uffff\1\4\4\uffff\1\6\1\uffff\1\2\1\7\1\14\21\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\3\1\uffff\1\3\3\uffff\1\1\30\uffff\1\3\5\4\1\22\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\1\10\uffff\1\3\1\uffff\1\3\14\uffff\2\3\5\4\1\25\1\4\1\uffff\1\3\1\uffff\1\3\1\23\1\uffff\1\2\1\24\1\uffff\2\3\17\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\15\1\uffff\1\16",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\12\1\15\1\3\1\16\1\13\1\11\1\1\12\uffff\1\10\15\uffff\1\3\5\4\1\uffff\1\4\4\uffff\1\6\1\uffff\1\2\1\7\1\14\21\uffff\7\4",
            "\1\12\1\15\1\3\1\16\1\13\1\11\1\1\12\uffff\1\10\15\uffff\1\3\5\4\1\uffff\1\4\6\uffff\1\2\1\uffff\1\14\21\uffff\7\4",
            "\1\32\30\uffff\1\30\2\uffff\1\31",
            "\1\34\1\37\1\uffff\1\40\1\35\1\33\51\uffff\1\36",
            "\1\41",
            "\1\42",
            "\1\34\1\37\1\uffff\1\40\1\35\1\43\51\uffff\1\36",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\uffff\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\50\1\53\1\uffff\1\54\1\51\1\47\51\uffff\1\52",
            "\1\3\1\uffff\1\3\3\uffff\1\1\30\uffff\1\3\5\4\1\22\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\4\uffff\1\55\1\uffff\1\27\1\56\22\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\37\1\uffff\1\40",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\4\uffff\1\23\1\uffff\1\27\1\24\22\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\62\1\15\1\3\1\16\1\13\1\61\1\26\12\uffff\1\63\15\uffff\1\3\5\4\1\uffff\1\4\4\uffff\1\57\1\uffff\1\27\1\60\1\14\21\uffff\7\4",
            "\1\32\30\uffff\1\30\2\uffff\1\31",
            "\1\32",
            "\1\3\1\uffff\1\3\3\uffff\1\1\30\uffff\1\3\5\4\1\64\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\4\uffff\1\65\1\uffff\1\27\1\66\22\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\53\1\uffff\1\54",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\12\uffff\1\3\15\uffff\1\3\5\4\1\25\1\4\1\uffff\1\3\1\uffff\1\3\1\23\1\uffff\1\27\1\24\1\uffff\2\3\17\uffff\7\4",
            "\1\74",
            "\1\76\1\101\1\uffff\1\102\1\77\1\75\51\uffff\1\100",
            "\1\103",
            "\1\104",
            "\1\76\1\101\1\uffff\1\102\1\77\1\105\51\uffff\1\100",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\4\uffff\1\55\1\uffff\1\27\1\56\22\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\25\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\62\1\15\1\3\1\16\1\13\1\61\1\26\12\uffff\1\63\15\uffff\1\3\5\4\1\uffff\1\4\4\uffff\1\57\1\uffff\1\27\1\60\1\14\21\uffff\7\4",
            "\1\62\1\15\1\3\1\16\1\13\1\61\1\26\12\uffff\1\63\15\uffff\1\3\5\4\1\uffff\1\4\6\uffff\1\27\1\uffff\1\14\21\uffff\7\4",
            "\1\110\30\uffff\1\106\2\uffff\1\107",
            "\1\3\1\uffff\1\3\3\uffff\1\1\30\uffff\1\3\5\4\1\64\1\4\6\uffff\1\2\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\4\uffff\1\111\1\uffff\1\27\1\112\22\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\101\1\uffff\1\102",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\4\uffff\1\65\1\uffff\1\27\1\66\22\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\113",
            "\1\114",
            "\1\50\1\53\1\uffff\1\54\1\51\1\115\51\uffff\1\52",
            "\1\116",
            "\1\117",
            "\1\110\30\uffff\1\106\2\uffff\1\107",
            "\1\110",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\4\uffff\1\111\1\uffff\1\27\1\112\22\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\26\30\uffff\1\3\5\4\1\67\1\4\6\uffff\1\27\23\uffff\7\4"
    };
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[][] dfa_42 = unpackEncodedStringArray(dfa_42s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_34;
            this.eof = dfa_34;
            this.min = dfa_36;
            this.max = dfa_41;
            this.accept = dfa_38;
            this.special = dfa_39;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()* loopback of 1327:1: ( (lv_declarations_3_0= ruleDeclaration ) )*";
        }
    }
    static final String dfa_43s = "\3\4\2\uffff\2\4\1\5\2\4\1\0\1\4\1\5\4\4\1\26\5\4\1\5\4\4\1\5\4\4\2\26\3\4\1\5\3\4\1\5\1\4\1\5\5\4\1\5\5\4\1\26\1\4\1\5\3\4\1\5\6\4\1\5\4\4\1\5\2\26\3\4";
    static final String dfa_44s = "\2\61\1\4\2\uffff\1\63\1\4\1\5\1\4\1\61\1\0\1\61\1\7\2\61\2\63\1\62\2\63\1\61\2\4\1\5\1\63\1\61\1\62\1\61\1\7\3\61\1\63\1\62\1\26\1\61\1\62\1\61\1\7\2\61\1\4\1\5\1\4\1\5\1\4\1\61\1\65\1\63\1\4\1\5\1\63\1\62\1\61\2\63\1\62\1\4\1\5\1\61\1\62\1\61\1\7\2\61\1\62\2\61\1\4\1\5\1\63\1\62\1\61\1\4\1\5\1\62\1\26\1\61\1\62\1\61";
    static final String dfa_45s = "\3\uffff\1\1\1\2\113\uffff";
    static final String dfa_46s = "\12\uffff\1\0\105\uffff}>";
    static final String[] dfa_47s = {
            "\1\4\1\uffff\1\4\3\uffff\1\1\30\uffff\1\3\15\uffff\1\2",
            "\1\4\1\uffff\1\4\3\uffff\1\1\30\uffff\1\3\15\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\12\1\15\1\4\1\16\1\13\1\11\1\1\12\uffff\1\10\15\uffff\1\3\13\uffff\1\6\1\uffff\1\2\1\7\1\14",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\4\1\uffff\1\4\3\uffff\1\1\30\uffff\1\3\5\uffff\1\22\7\uffff\1\2",
            "\1\uffff",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\23\7\uffff\1\25",
            "\1\15\1\uffff\1\16",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\23\7\uffff\1\25",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\23\7\uffff\1\25",
            "\1\12\1\15\1\4\1\16\1\13\1\11\1\1\12\uffff\1\10\15\uffff\1\3\13\uffff\1\6\1\uffff\1\2\1\7\1\14",
            "\1\12\1\15\1\4\1\16\1\13\1\11\1\1\12\uffff\1\10\15\uffff\1\3\15\uffff\1\2\1\uffff\1\14",
            "\1\30\30\uffff\1\26\2\uffff\1\27",
            "\1\32\1\35\1\uffff\1\36\1\33\1\31\51\uffff\1\34",
            "\1\32\1\35\1\uffff\1\36\1\33\1\37\51\uffff\1\34",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\15\uffff\1\25",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\44\1\47\1\uffff\1\50\1\45\1\43\51\uffff\1\46",
            "\1\4\1\uffff\1\4\3\uffff\1\1\30\uffff\1\3\5\uffff\1\22\7\uffff\1\2",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\23\5\uffff\1\51\1\uffff\1\25\1\52",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\23\7\uffff\1\25",
            "\1\35\1\uffff\1\36",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\23\7\uffff\1\25",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\23\7\uffff\1\25",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\23\7\uffff\1\25",
            "\1\57\1\15\1\4\1\16\1\13\1\56\1\24\12\uffff\1\55\15\uffff\1\3\13\uffff\1\53\1\uffff\1\25\1\54\1\14",
            "\1\30\30\uffff\1\26\2\uffff\1\27",
            "\1\30",
            "\1\4\1\uffff\1\4\3\uffff\1\1\30\uffff\1\3\5\uffff\1\60\7\uffff\1\2",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\63\5\uffff\1\61\1\uffff\1\25\1\62",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\63\7\uffff\1\25",
            "\1\47\1\uffff\1\50",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\63\7\uffff\1\25",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\63\7\uffff\1\25",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\23\7\uffff\1\25",
            "\1\4\1\uffff\1\4\3\uffff\1\24\12\uffff\1\4\15\uffff\1\3\5\uffff\1\23\2\uffff\1\4\1\uffff\1\4\1\71\1\uffff\1\25\1\72\1\uffff\2\4",
            "\1\74\1\77\1\uffff\1\100\1\75\1\73\51\uffff\1\76",
            "\1\101",
            "\1\102",
            "\1\74\1\77\1\uffff\1\100\1\75\1\103\51\uffff\1\76",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\23\5\uffff\1\51\1\uffff\1\25\1\52",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\23\7\uffff\1\25",
            "\1\57\1\15\1\4\1\16\1\13\1\56\1\24\12\uffff\1\55\15\uffff\1\3\13\uffff\1\53\1\uffff\1\25\1\54\1\14",
            "\1\57\1\15\1\4\1\16\1\13\1\56\1\24\12\uffff\1\55\15\uffff\1\3\15\uffff\1\25\1\uffff\1\14",
            "\1\106\30\uffff\1\104\2\uffff\1\105",
            "\1\107",
            "\1\110",
            "\1\4\1\uffff\1\4\3\uffff\1\1\30\uffff\1\3\5\uffff\1\60\7\uffff\1\2",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\63\5\uffff\1\111\1\uffff\1\25\1\112",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\63\7\uffff\1\25",
            "\1\77\1\uffff\1\100",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\63\7\uffff\1\25",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\63\7\uffff\1\25",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\63\5\uffff\1\61\1\uffff\1\25\1\62",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\63\7\uffff\1\25",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\63\7\uffff\1\25",
            "\1\113",
            "\1\114",
            "\1\44\1\47\1\uffff\1\50\1\45\1\115\51\uffff\1\46",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\23\5\uffff\1\71\1\uffff\1\25\1\72",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\23\7\uffff\1\25",
            "\1\116",
            "\1\117",
            "\1\106\30\uffff\1\104\2\uffff\1\105",
            "\1\106",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\63\7\uffff\1\25",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\63\5\uffff\1\111\1\uffff\1\25\1\112",
            "\1\4\1\uffff\1\4\3\uffff\1\24\30\uffff\1\3\5\uffff\1\63\7\uffff\1\25"
    };
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[][] dfa_47 = unpackEncodedStringArray(dfa_47s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_34;
            this.eof = dfa_34;
            this.min = dfa_43;
            this.max = dfa_44;
            this.accept = dfa_45;
            this.special = dfa_46;
            this.transition = dfa_47;
        }
        public String getDescription() {
            return "1410:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_10 = input.LA(1);

                         
                        int index36_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSCL()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index36_10);
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
    static final String dfa_48s = "\2\12\1\4\2\uffff\2\4\1\5\1\4\3\12\1\5\2\12\2\4\1\26\2\4\1\5\1\4\1\5\1\4\3\12\1\5\4\12\2\26\3\12\1\5\2\12\1\4\1\5\2\4\1\5\5\12\1\5\4\12\1\4\1\5\2\12";
    static final String dfa_49s = "\2\113\1\4\2\uffff\1\113\1\4\1\5\1\4\3\113\1\7\4\113\1\62\1\63\1\4\1\5\1\4\1\5\1\63\3\113\1\7\4\113\1\62\1\26\3\113\1\7\2\113\1\4\1\5\1\63\1\4\1\5\5\113\1\7\4\113\1\4\1\5\2\113";
    static final String[] dfa_50s = {
            "\1\1\31\uffff\5\3\1\uffff\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\1\31\uffff\5\3\1\uffff\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\5",
            "",
            "",
            "\1\12\1\15\1\uffff\1\16\1\13\1\11\1\1\12\uffff\1\10\16\uffff\5\3\1\uffff\1\4\4\uffff\1\6\1\uffff\1\2\1\7\1\14\21\uffff\7\3",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\1\31\uffff\5\3\1\22\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\1\31\uffff\5\3\1\22\1\4\4\uffff\1\23\1\uffff\1\2\1\24\22\uffff\7\3",
            "\1\1\31\uffff\5\3\1\22\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\15\1\uffff\1\16",
            "\1\1\31\uffff\5\3\1\22\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\1\31\uffff\5\3\1\22\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\12\1\15\1\uffff\1\16\1\13\1\11\1\1\12\uffff\1\10\16\uffff\5\3\1\uffff\1\4\4\uffff\1\6\1\uffff\1\2\1\7\1\14\21\uffff\7\3",
            "\1\12\1\15\1\uffff\1\16\1\13\1\11\1\1\12\uffff\1\10\16\uffff\5\3\1\uffff\1\4\6\uffff\1\2\1\uffff\1\14\21\uffff\7\3",
            "\1\27\30\uffff\1\25\2\uffff\1\26",
            "\1\31\1\34\1\uffff\1\35\1\32\1\30\51\uffff\1\33",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\43\1\46\1\uffff\1\47\1\44\1\42\51\uffff\1\45",
            "\1\1\31\uffff\5\3\1\22\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\1\31\uffff\5\3\1\22\1\4\4\uffff\1\50\1\uffff\1\2\1\51\22\uffff\7\3",
            "\1\1\31\uffff\5\3\1\22\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\34\1\uffff\1\35",
            "\1\1\31\uffff\5\3\1\22\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\1\31\uffff\5\3\1\22\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\1\31\uffff\5\3\1\22\1\4\4\uffff\1\23\1\uffff\1\2\1\24\22\uffff\7\3",
            "\1\1\31\uffff\5\3\1\22\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\27\30\uffff\1\25\2\uffff\1\26",
            "\1\27",
            "\1\1\31\uffff\5\3\1\52\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\1\31\uffff\5\3\1\52\1\4\4\uffff\1\53\1\uffff\1\2\1\54\22\uffff\7\3",
            "\1\1\31\uffff\5\3\1\52\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\46\1\uffff\1\47",
            "\1\1\31\uffff\5\3\1\52\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\1\31\uffff\5\3\1\52\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\55",
            "\1\56",
            "\1\60\1\63\1\uffff\1\64\1\61\1\57\51\uffff\1\62",
            "\1\65",
            "\1\66",
            "\1\1\31\uffff\5\3\1\22\1\4\4\uffff\1\50\1\uffff\1\2\1\51\22\uffff\7\3",
            "\1\1\31\uffff\5\3\1\22\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\1\31\uffff\5\3\1\52\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\1\31\uffff\5\3\1\52\1\4\4\uffff\1\67\1\uffff\1\2\1\70\22\uffff\7\3",
            "\1\1\31\uffff\5\3\1\52\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\63\1\uffff\1\64",
            "\1\1\31\uffff\5\3\1\52\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\1\31\uffff\5\3\1\52\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\1\31\uffff\5\3\1\52\1\4\4\uffff\1\53\1\uffff\1\2\1\54\22\uffff\7\3",
            "\1\1\31\uffff\5\3\1\52\1\4\6\uffff\1\2\23\uffff\7\3",
            "\1\71",
            "\1\72",
            "\1\1\31\uffff\5\3\1\52\1\4\4\uffff\1\67\1\uffff\1\2\1\70\22\uffff\7\3",
            "\1\1\31\uffff\5\3\1\52\1\4\6\uffff\1\2\23\uffff\7\3"
    };
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final short[][] dfa_50 = unpackEncodedStringArray(dfa_50s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_24;
            this.special = dfa_11;
            this.transition = dfa_50;
        }
        public String getDescription() {
            return "1529:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration )";
        }
    }
    static final String dfa_51s = "\1\4\12\0\2\uffff";
    static final String dfa_52s = "\1\102\12\0\2\uffff";
    static final String dfa_53s = "\13\uffff\1\1\1\2";
    static final String dfa_54s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff}>";
    static final String[] dfa_55s = {
            "\1\11\1\2\1\12\1\3\1\6\1\4\42\uffff\1\5\3\uffff\1\13\2\uffff\1\1\10\uffff\1\7\5\uffff\1\10",
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
    static final char[] dfa_51 = DFA.unpackEncodedStringToUnsignedChars(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[][] dfa_55 = unpackEncodedStringArray(dfa_55s);

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_51;
            this.max = dfa_52;
            this.accept = dfa_53;
            this.special = dfa_54;
            this.transition = dfa_55;
        }
        public String getDescription() {
            return "2763:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index73_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_3 = input.LA(1);

                         
                        int index73_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index73_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA73_4 = input.LA(1);

                         
                        int index73_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index73_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA73_5 = input.LA(1);

                         
                        int index73_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index73_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA73_6 = input.LA(1);

                         
                        int index73_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index73_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA73_7 = input.LA(1);

                         
                        int index73_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index73_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA73_8 = input.LA(1);

                         
                        int index73_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index73_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA73_9 = input.LA(1);

                         
                        int index73_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index73_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA73_10 = input.LA(1);

                         
                        int index73_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index73_10);
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
    static final String dfa_56s = "\1\4\4\uffff\6\0\1\uffff";
    static final String dfa_57s = "\1\102\4\uffff\6\0\1\uffff";
    static final String dfa_58s = "\1\uffff\1\1\11\uffff\1\2";
    static final String dfa_59s = "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\uffff}>";
    static final String[] dfa_60s = {
            "\1\11\1\1\1\12\1\1\1\6\1\1\42\uffff\1\5\3\uffff\1\13\2\uffff\1\1\10\uffff\1\7\5\uffff\1\10",
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
            ""
    };
    static final char[] dfa_56 = DFA.unpackEncodedStringToUnsignedChars(dfa_56s);
    static final char[] dfa_57 = DFA.unpackEncodedStringToUnsignedChars(dfa_57s);
    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final short[][] dfa_60 = unpackEncodedStringArray(dfa_60s);

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_56;
            this.max = dfa_57;
            this.accept = dfa_58;
            this.special = dfa_59;
            this.transition = dfa_60;
        }
        public String getDescription() {
            return "3232:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA83_5 = input.LA(1);

                         
                        int index83_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index83_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA83_6 = input.LA(1);

                         
                        int index83_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index83_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA83_7 = input.LA(1);

                         
                        int index83_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index83_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA83_8 = input.LA(1);

                         
                        int index83_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index83_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA83_9 = input.LA(1);

                         
                        int index83_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index83_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA83_10 = input.LA(1);

                         
                        int index83_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index83_10);
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
    static final String dfa_61s = "\13\uffff";
    static final String dfa_62s = "\1\4\3\uffff\1\0\6\uffff";
    static final String dfa_63s = "\1\102\3\uffff\1\0\6\uffff";
    static final String dfa_64s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\4\uffff\1\4";
    static final String dfa_65s = "\4\uffff\1\0\6\uffff}>";
    static final String[] dfa_66s = {
            "\1\5\1\1\1\5\1\2\1\5\1\3\42\uffff\1\4\17\uffff\1\5\5\uffff\1\5",
            "",
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

    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final char[] dfa_62 = DFA.unpackEncodedStringToUnsignedChars(dfa_62s);
    static final char[] dfa_63 = DFA.unpackEncodedStringToUnsignedChars(dfa_63s);
    static final short[] dfa_64 = DFA.unpackEncodedString(dfa_64s);
    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final short[][] dfa_66 = unpackEncodedStringArray(dfa_66s);

    class DFA97 extends DFA {

        public DFA97(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 97;
            this.eot = dfa_61;
            this.eof = dfa_61;
            this.min = dfa_62;
            this.max = dfa_63;
            this.accept = dfa_64;
            this.special = dfa_65;
            this.transition = dfa_66;
        }
        public String getDescription() {
            return "3952:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA97_4 = input.LA(1);

                         
                        int index97_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index97_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 97, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_67s = "\3\uffff\1\11\3\uffff\1\6\2\uffff\2\11";
    static final String dfa_68s = "\1\12\1\uffff\3\4\1\5\1\uffff\1\4\2\uffff\2\4";
    static final String dfa_69s = "\1\61\1\uffff\1\4\1\113\1\4\1\5\1\uffff\1\113\2\uffff\2\113";
    static final String dfa_70s = "\1\uffff\1\1\4\uffff\1\2\1\uffff\1\3\1\4\2\uffff";
    static final String dfa_71s = "\14\uffff}>";
    static final String[] dfa_72s = {
            "\1\1\46\uffff\1\2",
            "",
            "\1\3",
            "\1\7\1\6\1\11\3\6\1\11\5\uffff\2\11\3\uffff\1\10\2\uffff\1\11\3\uffff\3\11\2\uffff\1\11\1\uffff\6\11\1\uffff\1\11\4\uffff\1\4\1\uffff\1\11\1\5\1\6\21\uffff\7\11",
            "\1\12",
            "\1\13",
            "",
            "\1\6\1\uffff\1\6\3\uffff\1\6\5\uffff\2\6\2\uffff\2\11\1\uffff\1\11\1\6\3\uffff\3\6\2\uffff\1\6\1\uffff\10\6\1\uffff\1\11\1\uffff\1\11\1\6\1\uffff\2\6\1\uffff\2\11\17\uffff\7\6",
            "",
            "",
            "\1\7\1\6\1\11\3\6\1\11\5\uffff\2\11\3\uffff\1\10\2\uffff\1\11\3\uffff\3\11\2\uffff\1\11\1\uffff\6\11\1\uffff\1\11\4\uffff\1\4\1\uffff\1\11\1\5\1\6\21\uffff\7\11",
            "\1\7\1\6\1\11\3\6\1\11\5\uffff\2\11\3\uffff\1\10\2\uffff\1\11\3\uffff\3\11\2\uffff\1\11\1\uffff\6\11\1\uffff\1\11\6\uffff\1\11\1\uffff\1\6\21\uffff\7\11"
    };
    static final short[] dfa_67 = DFA.unpackEncodedString(dfa_67s);
    static final char[] dfa_68 = DFA.unpackEncodedStringToUnsignedChars(dfa_68s);
    static final char[] dfa_69 = DFA.unpackEncodedStringToUnsignedChars(dfa_69s);
    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final short[][] dfa_72 = unpackEncodedStringArray(dfa_72s);

    class DFA106 extends DFA {

        public DFA106(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 106;
            this.eot = dfa_1;
            this.eof = dfa_67;
            this.min = dfa_68;
            this.max = dfa_69;
            this.accept = dfa_70;
            this.special = dfa_71;
            this.transition = dfa_72;
        }
        public String getDescription() {
            return "4591:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
    static final String dfa_73s = "\3\uffff\1\6\5\uffff\2\6";
    static final String dfa_74s = "\1\12\1\uffff\3\4\1\5\3\uffff\2\4";
    static final String dfa_75s = "\1\61\1\uffff\1\4\1\62\1\4\1\5\3\uffff\1\62\1\61";
    static final String dfa_76s = "\1\uffff\1\1\4\uffff\1\4\1\3\1\2\2\uffff";
    static final String dfa_77s = "\13\uffff}>";
    static final String[] dfa_78s = {
            "\1\1\46\uffff\1\2",
            "",
            "\1\3",
            "\1\6\4\uffff\1\10\1\6\12\uffff\1\7\31\uffff\1\4\1\uffff\1\6\1\5",
            "\1\11",
            "\1\12",
            "",
            "",
            "",
            "\1\6\4\uffff\1\10\1\6\12\uffff\1\7\31\uffff\1\4\1\uffff\1\6\1\5",
            "\1\6\4\uffff\1\10\1\6\12\uffff\1\7\33\uffff\1\6"
    };
    static final short[] dfa_73 = DFA.unpackEncodedString(dfa_73s);
    static final char[] dfa_74 = DFA.unpackEncodedStringToUnsignedChars(dfa_74s);
    static final char[] dfa_75 = DFA.unpackEncodedStringToUnsignedChars(dfa_75s);
    static final short[] dfa_76 = DFA.unpackEncodedString(dfa_76s);
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final short[][] dfa_78 = unpackEncodedStringArray(dfa_78s);

    class DFA107 extends DFA {

        public DFA107(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 107;
            this.eot = dfa_61;
            this.eof = dfa_73;
            this.min = dfa_74;
            this.max = dfa_75;
            this.accept = dfa_76;
            this.special = dfa_77;
            this.transition = dfa_78;
        }
        public String getDescription() {
            return "4667:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0002000000010400L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000205F000030400L,0x0000000000000FE0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00020002510B0410L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0002000000010410L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0002000251030410L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x10091000000003F0L,0x0000000000000004L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000205F25D030410L,0x0000000000000FE0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000200025D030410L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000205F259030410L,0x0000000000000FE0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0002000259030410L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0002000020010400L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002000251030412L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00020003F1030410L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000205F2510B0410L,0x0000000000000FE0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000205FC00010452L,0x0000000000000FE0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0002000C00010452L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000205FC00090450L,0x0000000000000FE0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000C00090450L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000800010400L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000201F000010400L,0x0000000000000FE0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000001E000000000L,0x0000000000000FE0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000001C000000000L,0x0000000000000FE0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000018000000000L,0x0000000000000FE0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000FE0L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002040000010400L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000A00002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0xE000040000000000L,0x0000000000007800L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0030000000200000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000010440L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x10091400000003F0L,0x0000000000000004L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0FC0000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x10081000000003F0L,0x0000000000000004L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x1000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000800000200002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x00080000000003B0L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0004800000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000080L});

}