package de.cau.cs.kieler.s.parser.antlr.internal; 

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
import de.cau.cs.kieler.s.services.SGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HOSTCODE", "RULE_STRING", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_SL_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_NUMBER", "RULE_WS", "RULE_ANY_OTHER", "'synchronous program'", "'('", "')'", "'state'", "'{'", "';'", "'}'", "'['", "']'", "'='", "'prio'", "','", "'trans'", "'fork'", "'join'", "'pause'", "'term'", "'halt'", "'signal'", "'emit'", "'abort'", "'if'", "'await'", "'scope'", "'expression'", "'const'", "'input'", "'output'", "'static'", "':'", "'ref'", "'extern'", "'schedule'", "'combine'", "'()'", "'<'", "'>'", "'||'", "'&&'", "'|'", "'&'", "'+'", "'-'", "'*'", "'/'", "'%'", "'\\''", "'.'", "'!'", "'@'", "'#'", "'conflict'", "'confluent'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'min='", "'max='", "'++'", "'--'", "'=='", "'<='", "'>='", "'!='", "'pre'", "'val'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'string'", "'host'", "'none'", "'max'", "'min'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
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
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int T__37=37;
    public static final int RULE_SL_COMMENT_ANNOTATION=11;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=8;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=9;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=6;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_NUMBER=14;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalS.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private SGrammarAccess grammarAccess;
     	
        public InternalSParser(TokenStream input, SGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected SGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // InternalS.g:74:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalS.g:75:2: (iv_ruleProgram= ruleProgram EOF )
            // InternalS.g:76:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalS.g:83:1: ruleProgram returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'synchronous program' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= ')' ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_globalHostCodeInstruction_7_0= RULE_HOSTCODE ) )? ( (lv_states_8_0= ruleState ) )+ ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_priority_4_0=null;
        Token otherlv_5=null;
        Token lv_globalHostCodeInstruction_7_0=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_declarations_6_0 = null;

        EObject lv_states_8_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:86:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'synchronous program' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= ')' ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_globalHostCodeInstruction_7_0= RULE_HOSTCODE ) )? ( (lv_states_8_0= ruleState ) )+ ) )
            // InternalS.g:87:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'synchronous program' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= ')' ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_globalHostCodeInstruction_7_0= RULE_HOSTCODE ) )? ( (lv_states_8_0= ruleState ) )+ )
            {
            // InternalS.g:87:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'synchronous program' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= ')' ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_globalHostCodeInstruction_7_0= RULE_HOSTCODE ) )? ( (lv_states_8_0= ruleState ) )+ )
            // InternalS.g:87:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'synchronous program' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= ')' ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_globalHostCodeInstruction_7_0= RULE_HOSTCODE ) )? ( (lv_states_8_0= ruleState ) )+
            {
            // InternalS.g:87:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMENT_ANNOTATION||LA1_0==66) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalS.g:88:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalS.g:88:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalS.g:89:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
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

            otherlv_1=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getSynchronousProgramKeyword_1());
                  
            }
            // InternalS.g:109:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalS.g:110:1: (lv_name_2_0= RULE_ID )
            {
            // InternalS.g:110:1: (lv_name_2_0= RULE_ID )
            // InternalS.g:111:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProgramRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getLeftParenthesisKeyword_3());
                  
            }
            // InternalS.g:131:1: ( (lv_priority_4_0= RULE_INT ) )
            // InternalS.g:132:1: (lv_priority_4_0= RULE_INT )
            {
            // InternalS.g:132:1: (lv_priority_4_0= RULE_INT )
            // InternalS.g:133:3: lv_priority_4_0= RULE_INT
            {
            lv_priority_4_0=(Token)match(input,RULE_INT,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_priority_4_0, grammarAccess.getProgramAccess().getPriorityINTTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProgramRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"priority",
                      		lv_priority_4_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.INT");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getProgramAccess().getRightParenthesisKeyword_5());
                  
            }
            // InternalS.g:153:1: ( (lv_declarations_6_0= ruleDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalS.g:154:1: (lv_declarations_6_0= ruleDeclaration )
            	    {
            	    // InternalS.g:154:1: (lv_declarations_6_0= ruleDeclaration )
            	    // InternalS.g:155:3: lv_declarations_6_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getDeclarationsDeclarationParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_declarations_6_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_6_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalS.g:171:3: ( (lv_globalHostCodeInstruction_7_0= RULE_HOSTCODE ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_HOSTCODE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalS.g:172:1: (lv_globalHostCodeInstruction_7_0= RULE_HOSTCODE )
                    {
                    // InternalS.g:172:1: (lv_globalHostCodeInstruction_7_0= RULE_HOSTCODE )
                    // InternalS.g:173:3: lv_globalHostCodeInstruction_7_0= RULE_HOSTCODE
                    {
                    lv_globalHostCodeInstruction_7_0=(Token)match(input,RULE_HOSTCODE,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_globalHostCodeInstruction_7_0, grammarAccess.getProgramAccess().getGlobalHostCodeInstructionHOSTCODETerminalRuleCall_7_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getProgramRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"globalHostCodeInstruction",
                              		lv_globalHostCodeInstruction_7_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.HOSTCODE");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalS.g:189:3: ( (lv_states_8_0= ruleState ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMENT_ANNOTATION||LA4_0==20||LA4_0==66) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalS.g:190:1: (lv_states_8_0= ruleState )
            	    {
            	    // InternalS.g:190:1: (lv_states_8_0= ruleState )
            	    // InternalS.g:191:3: lv_states_8_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getStatesStateParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_states_8_0=ruleState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"states",
            	              		lv_states_8_0, 
            	              		"de.cau.cs.kieler.s.S.State");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleState"
    // InternalS.g:217:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalS.g:218:2: (iv_ruleState= ruleState EOF )
            // InternalS.g:219:2: iv_ruleState= ruleState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalS.g:226:1: ruleState returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'state' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_declarations_6_0= ruleDeclaration ) )* ( ( (lv_instructions_7_0= ruleInstruction ) ) otherlv_8= ';' )* otherlv_9= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_declarations_6_0 = null;

        EObject lv_instructions_7_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:229:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'state' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_declarations_6_0= ruleDeclaration ) )* ( ( (lv_instructions_7_0= ruleInstruction ) ) otherlv_8= ';' )* otherlv_9= '}' ) )
            // InternalS.g:230:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'state' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_declarations_6_0= ruleDeclaration ) )* ( ( (lv_instructions_7_0= ruleInstruction ) ) otherlv_8= ';' )* otherlv_9= '}' )
            {
            // InternalS.g:230:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'state' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_declarations_6_0= ruleDeclaration ) )* ( ( (lv_instructions_7_0= ruleInstruction ) ) otherlv_8= ';' )* otherlv_9= '}' )
            // InternalS.g:230:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'state' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_declarations_6_0= ruleDeclaration ) )* ( ( (lv_instructions_7_0= ruleInstruction ) ) otherlv_8= ';' )* otherlv_9= '}'
            {
            // InternalS.g:230:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMENT_ANNOTATION||LA5_0==66) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalS.g:231:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalS.g:231:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalS.g:232:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_10);
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
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_1=(Token)match(input,20,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalS.g:256:1: ( (lv_name_3_0= RULE_ID ) )
            // InternalS.g:257:1: (lv_name_3_0= RULE_ID )
            {
            // InternalS.g:257:1: (lv_name_3_0= RULE_ID )
            // InternalS.g:258:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStateRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // InternalS.g:282:1: ( (lv_declarations_6_0= ruleDeclaration ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==35) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==RULE_ID||LA6_2==RULE_COMMENT_ANNOTATION||LA6_2==66||(LA6_2>=88 && LA6_2<=94)) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==RULE_COMMENT_ANNOTATION||(LA6_0>=42 && LA6_0<=45)||(LA6_0>=47 && LA6_0<=49)||LA6_0==66||(LA6_0>=88 && LA6_0<=94)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalS.g:283:1: (lv_declarations_6_0= ruleDeclaration )
            	    {
            	    // InternalS.g:283:1: (lv_declarations_6_0= ruleDeclaration )
            	    // InternalS.g:284:3: lv_declarations_6_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getDeclarationsDeclarationParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_declarations_6_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStateRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_6_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalS.g:300:3: ( ( (lv_instructions_7_0= ruleInstruction ) ) otherlv_8= ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==RULE_HOSTCODE||LA7_0==27||(LA7_0>=29 && LA7_0<=39)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalS.g:300:4: ( (lv_instructions_7_0= ruleInstruction ) ) otherlv_8= ';'
            	    {
            	    // InternalS.g:300:4: ( (lv_instructions_7_0= ruleInstruction ) )
            	    // InternalS.g:301:1: (lv_instructions_7_0= ruleInstruction )
            	    {
            	    // InternalS.g:301:1: (lv_instructions_7_0= ruleInstruction )
            	    // InternalS.g:302:3: lv_instructions_7_0= ruleInstruction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getInstructionsInstructionParserRuleCall_7_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_instructions_7_0=ruleInstruction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStateRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"instructions",
            	              		lv_instructions_7_0, 
            	              		"de.cau.cs.kieler.s.S.Instruction");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_8=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getStateAccess().getSemicolonKeyword_7_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_8());
                  
            }

            }


            }

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


    // $ANTLR start "entryRuleHostCodeInstruction"
    // InternalS.g:334:1: entryRuleHostCodeInstruction returns [EObject current=null] : iv_ruleHostCodeInstruction= ruleHostCodeInstruction EOF ;
    public final EObject entryRuleHostCodeInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostCodeInstruction = null;


        try {
            // InternalS.g:335:2: (iv_ruleHostCodeInstruction= ruleHostCodeInstruction EOF )
            // InternalS.g:336:2: iv_ruleHostCodeInstruction= ruleHostCodeInstruction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHostCodeInstructionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHostCodeInstruction=ruleHostCodeInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHostCodeInstruction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHostCodeInstruction"


    // $ANTLR start "ruleHostCodeInstruction"
    // InternalS.g:343:1: ruleHostCodeInstruction returns [EObject current=null] : ( (lv_hostCode_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleHostCodeInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_hostCode_0_0=null;

         enterRule(); 
            
        try {
            // InternalS.g:346:28: ( ( (lv_hostCode_0_0= RULE_HOSTCODE ) ) )
            // InternalS.g:347:1: ( (lv_hostCode_0_0= RULE_HOSTCODE ) )
            {
            // InternalS.g:347:1: ( (lv_hostCode_0_0= RULE_HOSTCODE ) )
            // InternalS.g:348:1: (lv_hostCode_0_0= RULE_HOSTCODE )
            {
            // InternalS.g:348:1: (lv_hostCode_0_0= RULE_HOSTCODE )
            // InternalS.g:349:3: lv_hostCode_0_0= RULE_HOSTCODE
            {
            lv_hostCode_0_0=(Token)match(input,RULE_HOSTCODE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_hostCode_0_0, grammarAccess.getHostCodeInstructionAccess().getHostCodeHOSTCODETerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getHostCodeInstructionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"hostCode",
                      		lv_hostCode_0_0, 
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
        }
        return current;
    }
    // $ANTLR end "ruleHostCodeInstruction"


    // $ANTLR start "entryRuleInstruction"
    // InternalS.g:373:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalS.g:374:2: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalS.g:375:2: iv_ruleInstruction= ruleInstruction EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalS.g:382:1: ruleInstruction returns [EObject current=null] : (this_Halt_0= ruleHalt | this_Abort_1= ruleAbort | this_Join_2= ruleJoin | this_Pause_3= rulePause | this_Term_4= ruleTerm | this_If_5= ruleIf | this_Trans_6= ruleTrans | this_Fork_7= ruleFork | this_LocalSignal_8= ruleLocalSignal | this_Emit_9= ruleEmit | this_Await_10= ruleAwait | this_Prio_11= rulePrio | this_HostCodeInstruction_12= ruleHostCodeInstruction | this_Assignment_13= ruleAssignment ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Halt_0 = null;

        EObject this_Abort_1 = null;

        EObject this_Join_2 = null;

        EObject this_Pause_3 = null;

        EObject this_Term_4 = null;

        EObject this_If_5 = null;

        EObject this_Trans_6 = null;

        EObject this_Fork_7 = null;

        EObject this_LocalSignal_8 = null;

        EObject this_Emit_9 = null;

        EObject this_Await_10 = null;

        EObject this_Prio_11 = null;

        EObject this_HostCodeInstruction_12 = null;

        EObject this_Assignment_13 = null;


         enterRule(); 
            
        try {
            // InternalS.g:385:28: ( (this_Halt_0= ruleHalt | this_Abort_1= ruleAbort | this_Join_2= ruleJoin | this_Pause_3= rulePause | this_Term_4= ruleTerm | this_If_5= ruleIf | this_Trans_6= ruleTrans | this_Fork_7= ruleFork | this_LocalSignal_8= ruleLocalSignal | this_Emit_9= ruleEmit | this_Await_10= ruleAwait | this_Prio_11= rulePrio | this_HostCodeInstruction_12= ruleHostCodeInstruction | this_Assignment_13= ruleAssignment ) )
            // InternalS.g:386:1: (this_Halt_0= ruleHalt | this_Abort_1= ruleAbort | this_Join_2= ruleJoin | this_Pause_3= rulePause | this_Term_4= ruleTerm | this_If_5= ruleIf | this_Trans_6= ruleTrans | this_Fork_7= ruleFork | this_LocalSignal_8= ruleLocalSignal | this_Emit_9= ruleEmit | this_Await_10= ruleAwait | this_Prio_11= rulePrio | this_HostCodeInstruction_12= ruleHostCodeInstruction | this_Assignment_13= ruleAssignment )
            {
            // InternalS.g:386:1: (this_Halt_0= ruleHalt | this_Abort_1= ruleAbort | this_Join_2= ruleJoin | this_Pause_3= rulePause | this_Term_4= ruleTerm | this_If_5= ruleIf | this_Trans_6= ruleTrans | this_Fork_7= ruleFork | this_LocalSignal_8= ruleLocalSignal | this_Emit_9= ruleEmit | this_Await_10= ruleAwait | this_Prio_11= rulePrio | this_HostCodeInstruction_12= ruleHostCodeInstruction | this_Assignment_13= ruleAssignment )
            int alt8=14;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt8=1;
                }
                break;
            case 37:
                {
                alt8=2;
                }
                break;
            case 31:
                {
                alt8=3;
                }
                break;
            case 32:
                {
                alt8=4;
                }
                break;
            case 33:
                {
                alt8=5;
                }
                break;
            case 38:
                {
                alt8=6;
                }
                break;
            case 29:
                {
                alt8=7;
                }
                break;
            case 30:
                {
                alt8=8;
                }
                break;
            case 35:
                {
                alt8=9;
                }
                break;
            case 36:
                {
                alt8=10;
                }
                break;
            case 39:
                {
                alt8=11;
                }
                break;
            case 27:
                {
                alt8=12;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt8=13;
                }
                break;
            case RULE_ID:
                {
                alt8=14;
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
                    // InternalS.g:387:2: this_Halt_0= ruleHalt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getHaltParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Halt_0=ruleHalt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Halt_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalS.g:400:2: this_Abort_1= ruleAbort
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getAbortParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Abort_1=ruleAbort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Abort_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalS.g:413:2: this_Join_2= ruleJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getJoinParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Join_2=ruleJoin();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Join_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalS.g:426:2: this_Pause_3= rulePause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getPauseParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Pause_3=rulePause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Pause_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalS.g:439:2: this_Term_4= ruleTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getTermParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Term_4=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Term_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalS.g:452:2: this_If_5= ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getIfParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_If_5=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_If_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalS.g:465:2: this_Trans_6= ruleTrans
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getTransParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Trans_6=ruleTrans();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Trans_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalS.g:478:2: this_Fork_7= ruleFork
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getForkParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Fork_7=ruleFork();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Fork_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // InternalS.g:491:2: this_LocalSignal_8= ruleLocalSignal
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getLocalSignalParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_LocalSignal_8=ruleLocalSignal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalSignal_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // InternalS.g:504:2: this_Emit_9= ruleEmit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getEmitParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Emit_9=ruleEmit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Emit_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // InternalS.g:517:2: this_Await_10= ruleAwait
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getAwaitParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Await_10=ruleAwait();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Await_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // InternalS.g:530:2: this_Prio_11= rulePrio
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getPrioParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Prio_11=rulePrio();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Prio_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // InternalS.g:543:2: this_HostCodeInstruction_12= ruleHostCodeInstruction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getHostCodeInstructionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_HostCodeInstruction_12=ruleHostCodeInstruction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HostCodeInstruction_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 14 :
                    // InternalS.g:556:2: this_Assignment_13= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getAssignmentParserRuleCall_13()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Assignment_13=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Assignment_13; 
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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleAssignment"
    // InternalS.g:575:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalS.g:576:2: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalS.g:577:2: iv_ruleAssignment= ruleAssignment EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalS.g:584:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) ;
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
            // InternalS.g:587:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) )
            // InternalS.g:588:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )
            {
            // InternalS.g:588:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )
            // InternalS.g:588:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
            {
            // InternalS.g:588:2: ( (otherlv_0= RULE_ID ) )
            // InternalS.g:589:1: (otherlv_0= RULE_ID )
            {
            // InternalS.g:589:1: (otherlv_0= RULE_ID )
            // InternalS.g:590:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalS.g:604:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalS.g:604:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // InternalS.g:608:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalS.g:609:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalS.g:609:1: (lv_indices_2_0= ruleExpression )
            	    // InternalS.g:610:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_17);
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
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalS.g:634:1: ( (lv_expression_5_0= ruleExpression ) )
            // InternalS.g:635:1: (lv_expression_5_0= ruleExpression )
            {
            // InternalS.g:635:1: (lv_expression_5_0= ruleExpression )
            // InternalS.g:636:3: lv_expression_5_0= ruleExpression
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
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRulePrio"
    // InternalS.g:660:1: entryRulePrio returns [EObject current=null] : iv_rulePrio= rulePrio EOF ;
    public final EObject entryRulePrio() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrio = null;


        try {
            // InternalS.g:661:2: (iv_rulePrio= rulePrio EOF )
            // InternalS.g:662:2: iv_rulePrio= rulePrio EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrioRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrio=rulePrio();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrio; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrio"


    // $ANTLR start "rulePrio"
    // InternalS.g:669:1: rulePrio returns [EObject current=null] : (otherlv_0= 'prio' otherlv_1= '(' ( (lv_priority_2_0= RULE_INT ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) ;
    public final EObject rulePrio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_priority_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalS.g:672:28: ( (otherlv_0= 'prio' otherlv_1= '(' ( (lv_priority_2_0= RULE_INT ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) )
            // InternalS.g:673:1: (otherlv_0= 'prio' otherlv_1= '(' ( (lv_priority_2_0= RULE_INT ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            {
            // InternalS.g:673:1: (otherlv_0= 'prio' otherlv_1= '(' ( (lv_priority_2_0= RULE_INT ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            // InternalS.g:673:3: otherlv_0= 'prio' otherlv_1= '(' ( (lv_priority_2_0= RULE_INT ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPrioAccess().getPrioKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPrioAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalS.g:681:1: ( (lv_priority_2_0= RULE_INT ) )
            // InternalS.g:682:1: (lv_priority_2_0= RULE_INT )
            {
            // InternalS.g:682:1: (lv_priority_2_0= RULE_INT )
            // InternalS.g:683:3: lv_priority_2_0= RULE_INT
            {
            lv_priority_2_0=(Token)match(input,RULE_INT,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_priority_2_0, grammarAccess.getPrioAccess().getPriorityINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPrioRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"priority",
                      		lv_priority_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.INT");
              	    
            }

            }


            }

            // InternalS.g:699:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalS.g:699:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPrioAccess().getCommaKeyword_3_0());
                          
                    }
                    // InternalS.g:703:1: ( (otherlv_4= RULE_ID ) )
                    // InternalS.g:704:1: (otherlv_4= RULE_ID )
                    {
                    // InternalS.g:704:1: (otherlv_4= RULE_ID )
                    // InternalS.g:705:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrioRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getPrioAccess().getContinuationStateCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPrioAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

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
    // $ANTLR end "rulePrio"


    // $ANTLR start "entryRuleTrans"
    // InternalS.g:731:1: entryRuleTrans returns [EObject current=null] : iv_ruleTrans= ruleTrans EOF ;
    public final EObject entryRuleTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrans = null;


        try {
            // InternalS.g:732:2: (iv_ruleTrans= ruleTrans EOF )
            // InternalS.g:733:2: iv_ruleTrans= ruleTrans EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTrans=ruleTrans();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTrans; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrans"


    // $ANTLR start "ruleTrans"
    // InternalS.g:740:1: ruleTrans returns [EObject current=null] : (otherlv_0= 'trans' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleTrans() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalS.g:743:28: ( (otherlv_0= 'trans' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalS.g:744:1: (otherlv_0= 'trans' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalS.g:744:1: (otherlv_0= 'trans' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalS.g:744:3: otherlv_0= 'trans' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransAccess().getTransKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTransAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalS.g:752:1: ( (otherlv_2= RULE_ID ) )
            // InternalS.g:753:1: (otherlv_2= RULE_ID )
            {
            // InternalS.g:753:1: (otherlv_2= RULE_ID )
            // InternalS.g:754:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getTransAccess().getContinuationStateCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTransAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

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
    // $ANTLR end "ruleTrans"


    // $ANTLR start "entryRuleFork"
    // InternalS.g:780:1: entryRuleFork returns [EObject current=null] : iv_ruleFork= ruleFork EOF ;
    public final EObject entryRuleFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFork = null;


        try {
            // InternalS.g:781:2: (iv_ruleFork= ruleFork EOF )
            // InternalS.g:782:2: iv_ruleFork= ruleFork EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForkRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFork=ruleFork();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFork; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFork"


    // $ANTLR start "ruleFork"
    // InternalS.g:789:1: ruleFork returns [EObject current=null] : (otherlv_0= 'fork' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
    public final EObject ruleFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_priority_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalS.g:792:28: ( (otherlv_0= 'fork' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // InternalS.g:793:1: (otherlv_0= 'fork' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // InternalS.g:793:1: (otherlv_0= 'fork' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= ')' )
            // InternalS.g:793:3: otherlv_0= 'fork' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForkAccess().getForkKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForkAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalS.g:801:1: ( (otherlv_2= RULE_ID ) )
            // InternalS.g:802:1: (otherlv_2= RULE_ID )
            {
            // InternalS.g:802:1: (otherlv_2= RULE_ID )
            // InternalS.g:803:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getForkRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getForkAccess().getContinuationStateCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getForkAccess().getCommaKeyword_3());
                  
            }
            // InternalS.g:821:1: ( (lv_priority_4_0= RULE_INT ) )
            // InternalS.g:822:1: (lv_priority_4_0= RULE_INT )
            {
            // InternalS.g:822:1: (lv_priority_4_0= RULE_INT )
            // InternalS.g:823:3: lv_priority_4_0= RULE_INT
            {
            lv_priority_4_0=(Token)match(input,RULE_INT,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_priority_4_0, grammarAccess.getForkAccess().getPriorityINTTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getForkRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"priority",
                      		lv_priority_4_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.INT");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getForkAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

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
    // $ANTLR end "ruleFork"


    // $ANTLR start "entryRuleJoin"
    // InternalS.g:851:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalS.g:852:2: (iv_ruleJoin= ruleJoin EOF )
            // InternalS.g:853:2: iv_ruleJoin= ruleJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJoin=ruleJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoin; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // InternalS.g:860:1: ruleJoin returns [EObject current=null] : ( () otherlv_1= 'join' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // InternalS.g:863:28: ( ( () otherlv_1= 'join' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? ) )
            // InternalS.g:864:1: ( () otherlv_1= 'join' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? )
            {
            // InternalS.g:864:1: ( () otherlv_1= 'join' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? )
            // InternalS.g:864:2: () otherlv_1= 'join' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )?
            {
            // InternalS.g:864:2: ()
            // InternalS.g:865:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJoinAccess().getJoinAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJoinAccess().getJoinKeyword_1());
                  
            }
            // InternalS.g:877:1: (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalS.g:877:3: otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getJoinAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalS.g:881:1: ( (otherlv_3= RULE_ID ) )
                    // InternalS.g:882:1: (otherlv_3= RULE_ID )
                    {
                    // InternalS.g:882:1: (otherlv_3= RULE_ID )
                    // InternalS.g:883:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getJoinRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getJoinAccess().getContinuationStateCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getJoinAccess().getRightParenthesisKeyword_2_2());
                          
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
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRulePause"
    // InternalS.g:909:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePause = null;


        try {
            // InternalS.g:910:2: (iv_rulePause= rulePause EOF )
            // InternalS.g:911:2: iv_rulePause= rulePause EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRulePause"


    // $ANTLR start "rulePause"
    // InternalS.g:918:1: rulePause returns [EObject current=null] : ( () otherlv_1= 'pause' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // InternalS.g:921:28: ( ( () otherlv_1= 'pause' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? ) )
            // InternalS.g:922:1: ( () otherlv_1= 'pause' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? )
            {
            // InternalS.g:922:1: ( () otherlv_1= 'pause' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? )
            // InternalS.g:922:2: () otherlv_1= 'pause' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )?
            {
            // InternalS.g:922:2: ()
            // InternalS.g:923:2: 
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

            otherlv_1=(Token)match(input,32,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPauseAccess().getPauseKeyword_1());
                  
            }
            // InternalS.g:935:1: (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalS.g:935:3: otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPauseAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalS.g:939:1: ( (otherlv_3= RULE_ID ) )
                    // InternalS.g:940:1: (otherlv_3= RULE_ID )
                    {
                    // InternalS.g:940:1: (otherlv_3= RULE_ID )
                    // InternalS.g:941:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPauseRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getPauseAccess().getContinuationStateCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPauseAccess().getRightParenthesisKeyword_2_2());
                          
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
    // $ANTLR end "rulePause"


    // $ANTLR start "entryRuleTerm"
    // InternalS.g:967:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalS.g:968:2: (iv_ruleTerm= ruleTerm EOF )
            // InternalS.g:969:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalS.g:976:1: ruleTerm returns [EObject current=null] : ( () otherlv_1= 'term' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // InternalS.g:979:28: ( ( () otherlv_1= 'term' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? ) )
            // InternalS.g:980:1: ( () otherlv_1= 'term' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? )
            {
            // InternalS.g:980:1: ( () otherlv_1= 'term' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? )
            // InternalS.g:980:2: () otherlv_1= 'term' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )?
            {
            // InternalS.g:980:2: ()
            // InternalS.g:981:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTermAccess().getTermAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTermAccess().getTermKeyword_1());
                  
            }
            // InternalS.g:993:1: (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalS.g:993:3: otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTermAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalS.g:997:1: ( (otherlv_3= RULE_ID ) )
                    // InternalS.g:998:1: (otherlv_3= RULE_ID )
                    {
                    // InternalS.g:998:1: (otherlv_3= RULE_ID )
                    // InternalS.g:999:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTermRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getTermAccess().getContinuationStateCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTermAccess().getRightParenthesisKeyword_2_2());
                          
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleHalt"
    // InternalS.g:1025:1: entryRuleHalt returns [EObject current=null] : iv_ruleHalt= ruleHalt EOF ;
    public final EObject entryRuleHalt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHalt = null;


        try {
            // InternalS.g:1026:2: (iv_ruleHalt= ruleHalt EOF )
            // InternalS.g:1027:2: iv_ruleHalt= ruleHalt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHaltRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHalt=ruleHalt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHalt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHalt"


    // $ANTLR start "ruleHalt"
    // InternalS.g:1034:1: ruleHalt returns [EObject current=null] : ( () otherlv_1= 'halt' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleHalt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // InternalS.g:1037:28: ( ( () otherlv_1= 'halt' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? ) )
            // InternalS.g:1038:1: ( () otherlv_1= 'halt' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? )
            {
            // InternalS.g:1038:1: ( () otherlv_1= 'halt' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? )
            // InternalS.g:1038:2: () otherlv_1= 'halt' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )?
            {
            // InternalS.g:1038:2: ()
            // InternalS.g:1039:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHaltAccess().getHaltAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getHaltAccess().getHaltKeyword_1());
                  
            }
            // InternalS.g:1051:1: (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalS.g:1051:3: otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getHaltAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalS.g:1055:1: ( (otherlv_3= RULE_ID ) )
                    // InternalS.g:1056:1: (otherlv_3= RULE_ID )
                    {
                    // InternalS.g:1056:1: (otherlv_3= RULE_ID )
                    // InternalS.g:1057:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getHaltRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getHaltAccess().getContinuationStateCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getHaltAccess().getRightParenthesisKeyword_2_2());
                          
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
    // $ANTLR end "ruleHalt"


    // $ANTLR start "entryRuleLocalSignal"
    // InternalS.g:1083:1: entryRuleLocalSignal returns [EObject current=null] : iv_ruleLocalSignal= ruleLocalSignal EOF ;
    public final EObject entryRuleLocalSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalSignal = null;


        try {
            // InternalS.g:1084:2: (iv_ruleLocalSignal= ruleLocalSignal EOF )
            // InternalS.g:1085:2: iv_ruleLocalSignal= ruleLocalSignal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalSignalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocalSignal=ruleLocalSignal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalSignal; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalSignal"


    // $ANTLR start "ruleLocalSignal"
    // InternalS.g:1092:1: ruleLocalSignal returns [EObject current=null] : (otherlv_0= 'signal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleLocalSignal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalS.g:1095:28: ( (otherlv_0= 'signal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalS.g:1096:1: (otherlv_0= 'signal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalS.g:1096:1: (otherlv_0= 'signal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalS.g:1096:3: otherlv_0= 'signal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLocalSignalAccess().getSignalKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalSignalAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalS.g:1104:1: ( (otherlv_2= RULE_ID ) )
            // InternalS.g:1105:1: (otherlv_2= RULE_ID )
            {
            // InternalS.g:1105:1: (otherlv_2= RULE_ID )
            // InternalS.g:1106:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalSignalRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getLocalSignalAccess().getSignalValuedObjectCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLocalSignalAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

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
    // $ANTLR end "ruleLocalSignal"


    // $ANTLR start "entryRuleEmit"
    // InternalS.g:1132:1: entryRuleEmit returns [EObject current=null] : iv_ruleEmit= ruleEmit EOF ;
    public final EObject entryRuleEmit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmit = null;


        try {
            // InternalS.g:1133:2: (iv_ruleEmit= ruleEmit EOF )
            // InternalS.g:1134:2: iv_ruleEmit= ruleEmit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEmit=ruleEmit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmit"


    // $ANTLR start "ruleEmit"
    // InternalS.g:1141:1: ruleEmit returns [EObject current=null] : (otherlv_0= 'emit' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_value_4_0= ruleSExpression ) ) otherlv_5= ')' )? (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= ')' ) ;
    public final EObject ruleEmit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:1144:28: ( (otherlv_0= 'emit' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_value_4_0= ruleSExpression ) ) otherlv_5= ')' )? (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= ')' ) )
            // InternalS.g:1145:1: (otherlv_0= 'emit' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_value_4_0= ruleSExpression ) ) otherlv_5= ')' )? (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= ')' )
            {
            // InternalS.g:1145:1: (otherlv_0= 'emit' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_value_4_0= ruleSExpression ) ) otherlv_5= ')' )? (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= ')' )
            // InternalS.g:1145:3: otherlv_0= 'emit' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_value_4_0= ruleSExpression ) ) otherlv_5= ')' )? (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEmitAccess().getEmitKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEmitAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalS.g:1153:1: ( (otherlv_2= RULE_ID ) )
            // InternalS.g:1154:1: (otherlv_2= RULE_ID )
            {
            // InternalS.g:1154:1: (otherlv_2= RULE_ID )
            // InternalS.g:1155:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmitRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getEmitAccess().getSignalValuedObjectCrossReference_2_0()); 
              	
            }

            }


            }

            // InternalS.g:1169:2: (otherlv_3= '(' ( (lv_value_4_0= ruleSExpression ) ) otherlv_5= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalS.g:1169:4: otherlv_3= '(' ( (lv_value_4_0= ruleSExpression ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEmitAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // InternalS.g:1173:1: ( (lv_value_4_0= ruleSExpression ) )
                    // InternalS.g:1174:1: (lv_value_4_0= ruleSExpression )
                    {
                    // InternalS.g:1174:1: (lv_value_4_0= ruleSExpression )
                    // InternalS.g:1175:3: lv_value_4_0= ruleSExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmitAccess().getValueSExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
                    lv_value_4_0=ruleSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEmitRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
                              		"de.cau.cs.kieler.s.S.SExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEmitAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            // InternalS.g:1195:3: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalS.g:1195:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEmitAccess().getCommaKeyword_4_0());
                          
                    }
                    // InternalS.g:1199:1: ( (otherlv_7= RULE_ID ) )
                    // InternalS.g:1200:1: (otherlv_7= RULE_ID )
                    {
                    // InternalS.g:1200:1: (otherlv_7= RULE_ID )
                    // InternalS.g:1201:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEmitRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getEmitAccess().getContinuationStateCrossReference_4_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getEmitAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

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
    // $ANTLR end "ruleEmit"


    // $ANTLR start "entryRuleAbort"
    // InternalS.g:1227:1: entryRuleAbort returns [EObject current=null] : iv_ruleAbort= ruleAbort EOF ;
    public final EObject entryRuleAbort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbort = null;


        try {
            // InternalS.g:1228:2: (iv_ruleAbort= ruleAbort EOF )
            // InternalS.g:1229:2: iv_ruleAbort= ruleAbort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbortRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbort=ruleAbort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbort; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbort"


    // $ANTLR start "ruleAbort"
    // InternalS.g:1236:1: ruleAbort returns [EObject current=null] : ( () otherlv_1= 'abort' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleAbort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // InternalS.g:1239:28: ( ( () otherlv_1= 'abort' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? ) )
            // InternalS.g:1240:1: ( () otherlv_1= 'abort' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? )
            {
            // InternalS.g:1240:1: ( () otherlv_1= 'abort' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? )
            // InternalS.g:1240:2: () otherlv_1= 'abort' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )?
            {
            // InternalS.g:1240:2: ()
            // InternalS.g:1241:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAbortAccess().getAbortAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAbortAccess().getAbortKeyword_1());
                  
            }
            // InternalS.g:1253:1: (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalS.g:1253:3: otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAbortAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalS.g:1257:1: ( (otherlv_3= RULE_ID ) )
                    // InternalS.g:1258:1: (otherlv_3= RULE_ID )
                    {
                    // InternalS.g:1258:1: (otherlv_3= RULE_ID )
                    // InternalS.g:1259:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAbortRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getAbortAccess().getContinuationStateCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAbortAccess().getRightParenthesisKeyword_2_2());
                          
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
    // $ANTLR end "ruleAbort"


    // $ANTLR start "entryRuleIf"
    // InternalS.g:1285:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalS.g:1286:2: (iv_ruleIf= ruleIf EOF )
            // InternalS.g:1287:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalS.g:1294:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSExpression ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' otherlv_6= '{' ( ( (lv_instructions_7_0= ruleInstruction ) ) otherlv_8= ';' )* otherlv_9= '}' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_expression_2_0 = null;

        EObject lv_instructions_7_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:1297:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSExpression ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' otherlv_6= '{' ( ( (lv_instructions_7_0= ruleInstruction ) ) otherlv_8= ';' )* otherlv_9= '}' ) )
            // InternalS.g:1298:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSExpression ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' otherlv_6= '{' ( ( (lv_instructions_7_0= ruleInstruction ) ) otherlv_8= ';' )* otherlv_9= '}' )
            {
            // InternalS.g:1298:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSExpression ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' otherlv_6= '{' ( ( (lv_instructions_7_0= ruleInstruction ) ) otherlv_8= ';' )* otherlv_9= '}' )
            // InternalS.g:1298:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSExpression ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' otherlv_6= '{' ( ( (lv_instructions_7_0= ruleInstruction ) ) otherlv_8= ';' )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalS.g:1306:1: ( (lv_expression_2_0= ruleSExpression ) )
            // InternalS.g:1307:1: (lv_expression_2_0= ruleSExpression )
            {
            // InternalS.g:1307:1: (lv_expression_2_0= ruleSExpression )
            // InternalS.g:1308:3: lv_expression_2_0= ruleSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getExpressionSExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_18);
            lv_expression_2_0=ruleSExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"de.cau.cs.kieler.s.S.SExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:1324:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalS.g:1324:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getIfAccess().getCommaKeyword_3_0());
                          
                    }
                    // InternalS.g:1328:1: ( (otherlv_4= RULE_ID ) )
                    // InternalS.g:1329:1: (otherlv_4= RULE_ID )
                    {
                    // InternalS.g:1329:1: (otherlv_4= RULE_ID )
                    // InternalS.g:1330:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getIfRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getIfAccess().getContinuationStateCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getIfAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_6=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // InternalS.g:1352:1: ( ( (lv_instructions_7_0= ruleInstruction ) ) otherlv_8= ';' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==RULE_HOSTCODE||LA19_0==27||(LA19_0>=29 && LA19_0<=39)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalS.g:1352:2: ( (lv_instructions_7_0= ruleInstruction ) ) otherlv_8= ';'
            	    {
            	    // InternalS.g:1352:2: ( (lv_instructions_7_0= ruleInstruction ) )
            	    // InternalS.g:1353:1: (lv_instructions_7_0= ruleInstruction )
            	    {
            	    // InternalS.g:1353:1: (lv_instructions_7_0= ruleInstruction )
            	    // InternalS.g:1354:3: lv_instructions_7_0= ruleInstruction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfAccess().getInstructionsInstructionParserRuleCall_6_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_instructions_7_0=ruleInstruction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIfRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"instructions",
            	              		lv_instructions_7_0, 
            	              		"de.cau.cs.kieler.s.S.Instruction");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_8=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getIfAccess().getSemicolonKeyword_6_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_9=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleAwait"
    // InternalS.g:1386:1: entryRuleAwait returns [EObject current=null] : iv_ruleAwait= ruleAwait EOF ;
    public final EObject entryRuleAwait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAwait = null;


        try {
            // InternalS.g:1387:2: (iv_ruleAwait= ruleAwait EOF )
            // InternalS.g:1388:2: iv_ruleAwait= ruleAwait EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAwaitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAwait=ruleAwait();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAwait; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAwait"


    // $ANTLR start "ruleAwait"
    // InternalS.g:1395:1: ruleAwait returns [EObject current=null] : (otherlv_0= 'await' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleAwait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalS.g:1398:28: ( (otherlv_0= 'await' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) )
            // InternalS.g:1399:1: (otherlv_0= 'await' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            {
            // InternalS.g:1399:1: (otherlv_0= 'await' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            // InternalS.g:1399:3: otherlv_0= 'await' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAwaitAccess().getAwaitKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAwaitAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalS.g:1407:1: ( (otherlv_2= RULE_ID ) )
            // InternalS.g:1408:1: (otherlv_2= RULE_ID )
            {
            // InternalS.g:1408:1: (otherlv_2= RULE_ID )
            // InternalS.g:1409:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAwaitRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getAwaitAccess().getSignalValuedObjectCrossReference_2_0()); 
              	
            }

            }


            }

            // InternalS.g:1423:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalS.g:1423:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAwaitAccess().getCommaKeyword_3_0());
                          
                    }
                    // InternalS.g:1427:1: ( (otherlv_4= RULE_ID ) )
                    // InternalS.g:1428:1: (otherlv_4= RULE_ID )
                    {
                    // InternalS.g:1428:1: (otherlv_4= RULE_ID )
                    // InternalS.g:1429:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAwaitRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getAwaitAccess().getContinuationStateCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAwaitAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

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
    // $ANTLR end "ruleAwait"


    // $ANTLR start "entryRuleSExpression"
    // InternalS.g:1455:1: entryRuleSExpression returns [EObject current=null] : iv_ruleSExpression= ruleSExpression EOF ;
    public final EObject entryRuleSExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSExpression = null;


        try {
            // InternalS.g:1456:2: (iv_ruleSExpression= ruleSExpression EOF )
            // InternalS.g:1457:2: iv_ruleSExpression= ruleSExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSExpression=ruleSExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSExpression"


    // $ANTLR start "ruleSExpression"
    // InternalS.g:1464:1: ruleSExpression returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleSExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:1467:28: (this_Expression_0= ruleExpression )
            // InternalS.g:1469:2: this_Expression_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSExpressionAccess().getExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_2);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_0; 
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
    // $ANTLR end "ruleSExpression"


    // $ANTLR start "entryRuleRootScope"
    // InternalS.g:1490:1: entryRuleRootScope returns [EObject current=null] : iv_ruleRootScope= ruleRootScope EOF ;
    public final EObject entryRuleRootScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootScope = null;


        try {
            // InternalS.g:1491:2: (iv_ruleRootScope= ruleRootScope EOF )
            // InternalS.g:1492:2: iv_ruleRootScope= ruleRootScope EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleRootScope"


    // $ANTLR start "ruleRootScope"
    // InternalS.g:1499:1: ruleRootScope returns [EObject current=null] : ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* ) ;
    public final EObject ruleRootScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_declarations_1_0 = null;

        EObject lv_entities_2_0 = null;

        EObject lv_scopes_4_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:1502:28: ( ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* ) )
            // InternalS.g:1503:1: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* )
            {
            // InternalS.g:1503:1: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* )
            // InternalS.g:1503:2: () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )*
            {
            // InternalS.g:1503:2: ()
            // InternalS.g:1504:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRootScopeAccess().getKExtScopeAction_0(),
                          current);
                  
            }

            }

            // InternalS.g:1512:2: ( (lv_declarations_1_0= ruleDeclaration ) )*
            loop21:
            do {
                int alt21=2;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // InternalS.g:1513:1: (lv_declarations_1_0= ruleDeclaration )
            	    {
            	    // InternalS.g:1513:1: (lv_declarations_1_0= ruleDeclaration )
            	    // InternalS.g:1514:3: lv_declarations_1_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootScopeAccess().getDeclarationsDeclarationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_22);
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
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalS.g:1530:3: ( (lv_entities_2_0= ruleTestEntity ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||LA22_0==RULE_HOSTCODE||LA22_0==RULE_COMMENT_ANNOTATION||LA22_0==41||LA22_0==48||LA22_0==52||LA22_0==66) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalS.g:1531:1: (lv_entities_2_0= ruleTestEntity )
            	    {
            	    // InternalS.g:1531:1: (lv_entities_2_0= ruleTestEntity )
            	    // InternalS.g:1532:3: lv_entities_2_0= ruleTestEntity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootScopeAccess().getEntitiesTestEntityParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_23);
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
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.TestEntity");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalS.g:1548:3: (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalS.g:1548:5: otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) )
            	    {
            	    otherlv_3=(Token)match(input,40,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRootScopeAccess().getScopeKeyword_3_0());
            	          
            	    }
            	    // InternalS.g:1552:1: ( (lv_scopes_4_0= ruleScope ) )
            	    // InternalS.g:1553:1: (lv_scopes_4_0= ruleScope )
            	    {
            	    // InternalS.g:1553:1: (lv_scopes_4_0= ruleScope )
            	    // InternalS.g:1554:3: lv_scopes_4_0= ruleScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootScopeAccess().getScopesScopeParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_25);
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
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Scope");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


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
    // $ANTLR end "ruleRootScope"


    // $ANTLR start "entryRuleScope"
    // InternalS.g:1578:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalS.g:1579:2: (iv_ruleScope= ruleScope EOF )
            // InternalS.g:1580:2: iv_ruleScope= ruleScope EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalS.g:1587:1: ruleScope returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_declarations_3_0 = null;

        EObject lv_entities_4_0 = null;

        EObject lv_scopes_6_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:1590:28: ( ( () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' ) )
            // InternalS.g:1591:1: ( () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' )
            {
            // InternalS.g:1591:1: ( () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' )
            // InternalS.g:1591:2: () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}'
            {
            // InternalS.g:1591:2: ()
            // InternalS.g:1592:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getScopeAccess().getKExtScopeAction_0(),
                          current);
                  
            }

            }

            // InternalS.g:1600:2: ( (lv_name_1_0= RULE_ID ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalS.g:1601:1: (lv_name_1_0= RULE_ID )
                    {
                    // InternalS.g:1601:1: (lv_name_1_0= RULE_ID )
                    // InternalS.g:1602:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getScopeAccess().getNameIDTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScopeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getScopeAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalS.g:1622:1: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // InternalS.g:1623:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // InternalS.g:1623:1: (lv_declarations_3_0= ruleDeclaration )
            	    // InternalS.g:1624:3: lv_declarations_3_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_26);
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
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalS.g:1640:3: ( (lv_entities_4_0= ruleTestEntity ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==RULE_HOSTCODE||LA26_0==RULE_COMMENT_ANNOTATION||LA26_0==41||LA26_0==48||LA26_0==52||LA26_0==66) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalS.g:1641:1: (lv_entities_4_0= ruleTestEntity )
            	    {
            	    // InternalS.g:1641:1: (lv_entities_4_0= ruleTestEntity )
            	    // InternalS.g:1642:3: lv_entities_4_0= ruleTestEntity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeAccess().getEntitiesTestEntityParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_27);
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
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.TestEntity");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalS.g:1658:3: (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==40) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalS.g:1658:5: otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) )
            	    {
            	    otherlv_5=(Token)match(input,40,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getScopeAccess().getScopeKeyword_5_0());
            	          
            	    }
            	    // InternalS.g:1662:1: ( (lv_scopes_6_0= ruleScope ) )
            	    // InternalS.g:1663:1: (lv_scopes_6_0= ruleScope )
            	    {
            	    // InternalS.g:1663:1: (lv_scopes_6_0= ruleScope )
            	    // InternalS.g:1664:3: lv_scopes_6_0= ruleScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeAccess().getScopesScopeParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_28);
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
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Scope");
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

            otherlv_7=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleTestEntity"
    // InternalS.g:1692:1: entryRuleTestEntity returns [EObject current=null] : iv_ruleTestEntity= ruleTestEntity EOF ;
    public final EObject entryRuleTestEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestEntity = null;


        try {
            // InternalS.g:1693:2: (iv_ruleTestEntity= ruleTestEntity EOF )
            // InternalS.g:1694:2: iv_ruleTestEntity= ruleTestEntity EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleTestEntity"


    // $ANTLR start "ruleTestEntity"
    // InternalS.g:1701:1: ruleTestEntity returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) ;
    public final EObject ruleTestEntity() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        EObject lv_effect_1_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:1704:28: ( ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) )
            // InternalS.g:1705:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            {
            // InternalS.g:1705:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalS.g:1705:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    {
                    // InternalS.g:1705:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    // InternalS.g:1706:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    {
                    // InternalS.g:1706:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    // InternalS.g:1707:3: lv_expression_0_0= ruleAnnotatedExpression
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
                    // InternalS.g:1724:6: ( (lv_effect_1_0= ruleEffect ) )
                    {
                    // InternalS.g:1724:6: ( (lv_effect_1_0= ruleEffect ) )
                    // InternalS.g:1725:1: (lv_effect_1_0= ruleEffect )
                    {
                    // InternalS.g:1725:1: (lv_effect_1_0= ruleEffect )
                    // InternalS.g:1726:3: lv_effect_1_0= ruleEffect
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
        }
        return current;
    }
    // $ANTLR end "ruleTestEntity"


    // $ANTLR start "entryRuleAnnotatedExpression"
    // InternalS.g:1750:1: entryRuleAnnotatedExpression returns [EObject current=null] : iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF ;
    public final EObject entryRuleAnnotatedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotatedExpression = null;


        try {
            // InternalS.g:1751:2: (iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF )
            // InternalS.g:1752:2: iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotatedExpression"


    // $ANTLR start "ruleAnnotatedExpression"
    // InternalS.g:1759:1: ruleAnnotatedExpression returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAnnotatedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:1762:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalS.g:1763:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalS.g:1763:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalS.g:1763:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalS.g:1763:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_COMMENT_ANNOTATION||LA29_0==66) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalS.g:1764:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalS.g:1764:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalS.g:1765:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotatedExpressionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    break loop29;
                }
            } while (true);

            otherlv_1=(Token)match(input,41,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAnnotatedExpressionAccess().getExpressionKeyword_1());
                  
            }
            // InternalS.g:1785:1: ( (lv_expression_2_0= ruleExpression ) )
            // InternalS.g:1786:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalS.g:1786:1: (lv_expression_2_0= ruleExpression )
            // InternalS.g:1787:3: lv_expression_2_0= ruleExpression
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
        }
        return current;
    }
    // $ANTLR end "ruleAnnotatedExpression"


    // $ANTLR start "entryRuleDeclaration"
    // InternalS.g:1811:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalS.g:1812:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalS.g:1813:2: iv_ruleDeclaration= ruleDeclaration EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalS.g:1820:1: ruleDeclaration returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration | this_ScheduleDeclaration_2= ruleScheduleDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_ReferenceDeclaration_1 = null;

        EObject this_ScheduleDeclaration_2 = null;


         enterRule(); 
            
        try {
            // InternalS.g:1823:28: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration | this_ScheduleDeclaration_2= ruleScheduleDeclaration ) )
            // InternalS.g:1824:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration | this_ScheduleDeclaration_2= ruleScheduleDeclaration )
            {
            // InternalS.g:1824:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration | this_ScheduleDeclaration_2= ruleScheduleDeclaration )
            int alt30=3;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalS.g:1825:2: this_VariableDeclaration_0= ruleVariableDeclaration
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
                    // InternalS.g:1838:2: this_ReferenceDeclaration_1= ruleReferenceDeclaration
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
                case 3 :
                    // InternalS.g:1851:2: this_ScheduleDeclaration_2= ruleScheduleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getScheduleDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ScheduleDeclaration_2=ruleScheduleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ScheduleDeclaration_2; 
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalS.g:1872:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalS.g:1873:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalS.g:1874:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalS.g:1881:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ( (lv_annotations_12_0= ruleCommentAnnotatonSL ) )? ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

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

        EObject lv_annotations_12_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:1884:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ( (lv_annotations_12_0= ruleCommentAnnotatonSL ) )? ) )
            // InternalS.g:1885:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ( (lv_annotations_12_0= ruleCommentAnnotatonSL ) )? )
            {
            // InternalS.g:1885:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ( (lv_annotations_12_0= ruleCommentAnnotatonSL ) )? )
            // InternalS.g:1885:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ( (lv_annotations_12_0= ruleCommentAnnotatonSL ) )?
            {
            // InternalS.g:1885:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_COMMENT_ANNOTATION||LA31_0==66) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalS.g:1886:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalS.g:1886:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalS.g:1887:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_30);
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

            // InternalS.g:1903:3: ( (lv_const_1_0= 'const' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalS.g:1904:1: (lv_const_1_0= 'const' )
                    {
                    // InternalS.g:1904:1: (lv_const_1_0= 'const' )
                    // InternalS.g:1905:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,42,FOLLOW_31); if (state.failed) return current;
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

            // InternalS.g:1918:3: ( (lv_input_2_0= 'input' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalS.g:1919:1: (lv_input_2_0= 'input' )
                    {
                    // InternalS.g:1919:1: (lv_input_2_0= 'input' )
                    // InternalS.g:1920:3: lv_input_2_0= 'input'
                    {
                    lv_input_2_0=(Token)match(input,43,FOLLOW_32); if (state.failed) return current;
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

            // InternalS.g:1933:3: ( (lv_output_3_0= 'output' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalS.g:1934:1: (lv_output_3_0= 'output' )
                    {
                    // InternalS.g:1934:1: (lv_output_3_0= 'output' )
                    // InternalS.g:1935:3: lv_output_3_0= 'output'
                    {
                    lv_output_3_0=(Token)match(input,44,FOLLOW_33); if (state.failed) return current;
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

            // InternalS.g:1948:3: ( (lv_static_4_0= 'static' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalS.g:1949:1: (lv_static_4_0= 'static' )
                    {
                    // InternalS.g:1949:1: (lv_static_4_0= 'static' )
                    // InternalS.g:1950:3: lv_static_4_0= 'static'
                    {
                    lv_static_4_0=(Token)match(input,45,FOLLOW_34); if (state.failed) return current;
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

            // InternalS.g:1963:3: ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                int LA37_1 = input.LA(2);

                if ( ((LA37_1>=88 && LA37_1<=94)) ) {
                    alt37=1;
                }
                else if ( (LA37_1==RULE_ID||LA37_1==RULE_COMMENT_ANNOTATION||LA37_1==66) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA37_0>=88 && LA37_0<=94)) ) {
                alt37=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalS.g:1963:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    {
                    // InternalS.g:1963:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    // InternalS.g:1963:5: ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) )
                    {
                    // InternalS.g:1963:5: ( (lv_signal_5_0= 'signal' ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==35) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalS.g:1964:1: (lv_signal_5_0= 'signal' )
                            {
                            // InternalS.g:1964:1: (lv_signal_5_0= 'signal' )
                            // InternalS.g:1965:3: lv_signal_5_0= 'signal'
                            {
                            lv_signal_5_0=(Token)match(input,35,FOLLOW_34); if (state.failed) return current;
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

                    // InternalS.g:1978:3: ( (lv_type_6_0= ruleValueType ) )
                    // InternalS.g:1979:1: (lv_type_6_0= ruleValueType )
                    {
                    // InternalS.g:1979:1: (lv_type_6_0= ruleValueType )
                    // InternalS.g:1980:3: lv_type_6_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeValueTypeEnumRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_35);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ValueType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalS.g:1997:6: ( (lv_signal_7_0= 'signal' ) )
                    {
                    // InternalS.g:1997:6: ( (lv_signal_7_0= 'signal' ) )
                    // InternalS.g:1998:1: (lv_signal_7_0= 'signal' )
                    {
                    // InternalS.g:1998:1: (lv_signal_7_0= 'signal' )
                    // InternalS.g:1999:3: lv_signal_7_0= 'signal'
                    {
                    lv_signal_7_0=(Token)match(input,35,FOLLOW_35); if (state.failed) return current;
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

            // InternalS.g:2012:3: ( (lv_valuedObjects_8_0= ruleValuedObject ) )
            // InternalS.g:2013:1: (lv_valuedObjects_8_0= ruleValuedObject )
            {
            // InternalS.g:2013:1: (lv_valuedObjects_8_0= ruleValuedObject )
            // InternalS.g:2014:3: lv_valuedObjects_8_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_36);
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
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:2030:2: (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==28) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalS.g:2030:4: otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    {
            	    otherlv_9=(Token)match(input,28,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // InternalS.g:2034:1: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    // InternalS.g:2035:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    {
            	    // InternalS.g:2035:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    // InternalS.g:2036:3: lv_valuedObjects_10_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_36);
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
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_11=(Token)match(input,22,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_8());
                  
            }
            // InternalS.g:2056:1: ( (lv_annotations_12_0= ruleCommentAnnotatonSL ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_SL_COMMENT_ANNOTATION) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalS.g:2057:1: (lv_annotations_12_0= ruleCommentAnnotatonSL )
                    {
                    // InternalS.g:2057:1: (lv_annotations_12_0= ruleCommentAnnotatonSL )
                    // InternalS.g:2058:3: lv_annotations_12_0= ruleCommentAnnotatonSL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getAnnotationsCommentAnnotatonSLParserRuleCall_9_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_annotations_12_0=ruleCommentAnnotatonSL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_12_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.CommentAnnotatonSL");
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
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableDeclarationWOSemicolon"
    // InternalS.g:2082:1: entryRuleVariableDeclarationWOSemicolon returns [EObject current=null] : iv_ruleVariableDeclarationWOSemicolon= ruleVariableDeclarationWOSemicolon EOF ;
    public final EObject entryRuleVariableDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationWOSemicolon = null;


        try {
            // InternalS.g:2083:2: (iv_ruleVariableDeclarationWOSemicolon= ruleVariableDeclarationWOSemicolon EOF )
            // InternalS.g:2084:2: iv_ruleVariableDeclarationWOSemicolon= ruleVariableDeclarationWOSemicolon EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclarationWOSemicolon"


    // $ANTLR start "ruleVariableDeclarationWOSemicolon"
    // InternalS.g:2091:1: ruleVariableDeclarationWOSemicolon returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )? ) ;
    public final EObject ruleVariableDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

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

        EObject lv_annotations_11_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:2094:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )? ) )
            // InternalS.g:2095:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )? )
            {
            // InternalS.g:2095:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )? )
            // InternalS.g:2095:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )?
            {
            // InternalS.g:2095:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_COMMENT_ANNOTATION||LA40_0==66) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalS.g:2096:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalS.g:2096:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalS.g:2097:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_30);
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
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalS.g:2113:3: ( (lv_const_1_0= 'const' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==42) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalS.g:2114:1: (lv_const_1_0= 'const' )
                    {
                    // InternalS.g:2114:1: (lv_const_1_0= 'const' )
                    // InternalS.g:2115:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,42,FOLLOW_31); if (state.failed) return current;
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

            // InternalS.g:2128:3: ( (lv_input_2_0= 'input' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==43) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalS.g:2129:1: (lv_input_2_0= 'input' )
                    {
                    // InternalS.g:2129:1: (lv_input_2_0= 'input' )
                    // InternalS.g:2130:3: lv_input_2_0= 'input'
                    {
                    lv_input_2_0=(Token)match(input,43,FOLLOW_32); if (state.failed) return current;
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

            // InternalS.g:2143:3: ( (lv_output_3_0= 'output' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==44) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalS.g:2144:1: (lv_output_3_0= 'output' )
                    {
                    // InternalS.g:2144:1: (lv_output_3_0= 'output' )
                    // InternalS.g:2145:3: lv_output_3_0= 'output'
                    {
                    lv_output_3_0=(Token)match(input,44,FOLLOW_33); if (state.failed) return current;
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

            // InternalS.g:2158:3: ( (lv_static_4_0= 'static' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==45) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalS.g:2159:1: (lv_static_4_0= 'static' )
                    {
                    // InternalS.g:2159:1: (lv_static_4_0= 'static' )
                    // InternalS.g:2160:3: lv_static_4_0= 'static'
                    {
                    lv_static_4_0=(Token)match(input,45,FOLLOW_34); if (state.failed) return current;
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

            // InternalS.g:2173:3: ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==35) ) {
                int LA46_1 = input.LA(2);

                if ( ((LA46_1>=88 && LA46_1<=94)) ) {
                    alt46=1;
                }
                else if ( (LA46_1==RULE_ID||LA46_1==RULE_COMMENT_ANNOTATION||LA46_1==66) ) {
                    alt46=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA46_0>=88 && LA46_0<=94)) ) {
                alt46=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalS.g:2173:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    {
                    // InternalS.g:2173:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    // InternalS.g:2173:5: ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) )
                    {
                    // InternalS.g:2173:5: ( (lv_signal_5_0= 'signal' ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==35) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalS.g:2174:1: (lv_signal_5_0= 'signal' )
                            {
                            // InternalS.g:2174:1: (lv_signal_5_0= 'signal' )
                            // InternalS.g:2175:3: lv_signal_5_0= 'signal'
                            {
                            lv_signal_5_0=(Token)match(input,35,FOLLOW_34); if (state.failed) return current;
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

                    // InternalS.g:2188:3: ( (lv_type_6_0= ruleValueType ) )
                    // InternalS.g:2189:1: (lv_type_6_0= ruleValueType )
                    {
                    // InternalS.g:2189:1: (lv_type_6_0= ruleValueType )
                    // InternalS.g:2190:3: lv_type_6_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getTypeValueTypeEnumRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_35);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ValueType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalS.g:2207:6: ( (lv_signal_7_0= 'signal' ) )
                    {
                    // InternalS.g:2207:6: ( (lv_signal_7_0= 'signal' ) )
                    // InternalS.g:2208:1: (lv_signal_7_0= 'signal' )
                    {
                    // InternalS.g:2208:1: (lv_signal_7_0= 'signal' )
                    // InternalS.g:2209:3: lv_signal_7_0= 'signal'
                    {
                    lv_signal_7_0=(Token)match(input,35,FOLLOW_35); if (state.failed) return current;
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

            // InternalS.g:2222:3: ( (lv_valuedObjects_8_0= ruleValuedObject ) )
            // InternalS.g:2223:1: (lv_valuedObjects_8_0= ruleValuedObject )
            {
            // InternalS.g:2223:1: (lv_valuedObjects_8_0= ruleValuedObject )
            // InternalS.g:2224:3: lv_valuedObjects_8_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_38);
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
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:2240:2: (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==28) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalS.g:2240:4: otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    {
            	    otherlv_9=(Token)match(input,28,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getVariableDeclarationWOSemicolonAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // InternalS.g:2244:1: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    // InternalS.g:2245:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    {
            	    // InternalS.g:2245:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    // InternalS.g:2246:3: lv_valuedObjects_10_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_38);
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
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
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

            // InternalS.g:2262:4: ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_SL_COMMENT_ANNOTATION) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalS.g:2263:1: (lv_annotations_11_0= ruleCommentAnnotatonSL )
                    {
                    // InternalS.g:2263:1: (lv_annotations_11_0= ruleCommentAnnotatonSL )
                    // InternalS.g:2264:3: lv_annotations_11_0= ruleCommentAnnotatonSL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getAnnotationsCommentAnnotatonSLParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_annotations_11_0=ruleCommentAnnotatonSL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_11_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.CommentAnnotatonSL");
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
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclarationWOSemicolon"


    // $ANTLR start "entryRuleNamespaceID"
    // InternalS.g:2288:1: entryRuleNamespaceID returns [String current=null] : iv_ruleNamespaceID= ruleNamespaceID EOF ;
    public final String entryRuleNamespaceID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespaceID = null;


        try {
            // InternalS.g:2289:2: (iv_ruleNamespaceID= ruleNamespaceID EOF )
            // InternalS.g:2290:2: iv_ruleNamespaceID= ruleNamespaceID EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespaceID"


    // $ANTLR start "ruleNamespaceID"
    // InternalS.g:2297:1: ruleNamespaceID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ':' this_PrimeID_2= rulePrimeID )* ) ;
    public final AntlrDatatypeRuleToken ruleNamespaceID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_PrimeID_2 = null;


         enterRule(); 
            
        try {
            // InternalS.g:2300:28: ( (this_ID_0= RULE_ID (kw= ':' this_PrimeID_2= rulePrimeID )* ) )
            // InternalS.g:2301:1: (this_ID_0= RULE_ID (kw= ':' this_PrimeID_2= rulePrimeID )* )
            {
            // InternalS.g:2301:1: (this_ID_0= RULE_ID (kw= ':' this_PrimeID_2= rulePrimeID )* )
            // InternalS.g:2301:6: this_ID_0= RULE_ID (kw= ':' this_PrimeID_2= rulePrimeID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getNamespaceIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalS.g:2308:1: (kw= ':' this_PrimeID_2= rulePrimeID )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==46) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalS.g:2309:2: kw= ':' this_PrimeID_2= rulePrimeID
            	    {
            	    kw=(Token)match(input,46,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getNamespaceIDAccess().getColonKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getNamespaceIDAccess().getPrimeIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_39);
            	    this_PrimeID_2=rulePrimeID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PrimeID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // $ANTLR end "ruleNamespaceID"


    // $ANTLR start "entryRuleReferenceDeclaration"
    // InternalS.g:2333:1: entryRuleReferenceDeclaration returns [EObject current=null] : iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF ;
    public final EObject entryRuleReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceDeclaration = null;


        try {
            // InternalS.g:2334:2: (iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF )
            // InternalS.g:2335:2: iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceDeclaration"


    // $ANTLR start "ruleReferenceDeclaration"
    // InternalS.g:2342:1: ruleReferenceDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )? ) ;
    public final EObject ruleReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_extern_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_valuedObjects_5_0 = null;

        EObject lv_valuedObjects_7_0 = null;

        EObject lv_annotations_9_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:2345:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )? ) )
            // InternalS.g:2346:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )? )
            {
            // InternalS.g:2346:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )? )
            // InternalS.g:2346:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )?
            {
            // InternalS.g:2346:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_COMMENT_ANNOTATION||LA50_0==66) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalS.g:2347:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalS.g:2347:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalS.g:2348:3: lv_annotations_0_0= ruleAnnotation
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
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // InternalS.g:2364:3: ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==47) ) {
                alt51=1;
            }
            else if ( (LA51_0==48) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalS.g:2364:4: (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) )
                    {
                    // InternalS.g:2364:4: (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) )
                    // InternalS.g:2364:6: otherlv_1= 'ref' ( ( ruleNamespaceID ) )
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReferenceDeclarationAccess().getRefKeyword_1_0_0());
                          
                    }
                    // InternalS.g:2368:1: ( ( ruleNamespaceID ) )
                    // InternalS.g:2369:1: ( ruleNamespaceID )
                    {
                    // InternalS.g:2369:1: ( ruleNamespaceID )
                    // InternalS.g:2370:3: ruleNamespaceID
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
                       
                      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getReferenceNamedObjectCrossReference_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_35);
                    ruleNamespaceID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalS.g:2387:6: (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) )
                    {
                    // InternalS.g:2387:6: (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) )
                    // InternalS.g:2387:8: otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getReferenceDeclarationAccess().getExternKeyword_1_1_0());
                          
                    }
                    // InternalS.g:2391:1: ( (lv_extern_4_0= RULE_STRING ) )
                    // InternalS.g:2392:1: (lv_extern_4_0= RULE_STRING )
                    {
                    // InternalS.g:2392:1: (lv_extern_4_0= RULE_STRING )
                    // InternalS.g:2393:3: lv_extern_4_0= RULE_STRING
                    {
                    lv_extern_4_0=(Token)match(input,RULE_STRING,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_extern_4_0, grammarAccess.getReferenceDeclarationAccess().getExternSTRINGTerminalRuleCall_1_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReferenceDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"extern",
                              		lv_extern_4_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalS.g:2409:4: ( (lv_valuedObjects_5_0= ruleValuedObject ) )
            // InternalS.g:2410:1: (lv_valuedObjects_5_0= ruleValuedObject )
            {
            // InternalS.g:2410:1: (lv_valuedObjects_5_0= ruleValuedObject )
            // InternalS.g:2411:3: lv_valuedObjects_5_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_36);
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
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:2427:2: (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==28) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalS.g:2427:4: otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    {
            	    otherlv_6=(Token)match(input,28,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getReferenceDeclarationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalS.g:2431:1: ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    // InternalS.g:2432:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    {
            	    // InternalS.g:2432:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    // InternalS.g:2433:3: lv_valuedObjects_7_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_valuedObjects_7_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_7_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
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

            otherlv_8=(Token)match(input,22,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getReferenceDeclarationAccess().getSemicolonKeyword_4());
                  
            }
            // InternalS.g:2453:1: ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_SL_COMMENT_ANNOTATION) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalS.g:2454:1: (lv_annotations_9_0= ruleCommentAnnotatonSL )
                    {
                    // InternalS.g:2454:1: (lv_annotations_9_0= ruleCommentAnnotatonSL )
                    // InternalS.g:2455:3: lv_annotations_9_0= ruleCommentAnnotatonSL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getAnnotationsCommentAnnotatonSLParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_annotations_9_0=ruleCommentAnnotatonSL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_9_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.CommentAnnotatonSL");
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
        }
        return current;
    }
    // $ANTLR end "ruleReferenceDeclaration"


    // $ANTLR start "entryRuleReferenceDeclarationWOSemicolon"
    // InternalS.g:2479:1: entryRuleReferenceDeclarationWOSemicolon returns [EObject current=null] : iv_ruleReferenceDeclarationWOSemicolon= ruleReferenceDeclarationWOSemicolon EOF ;
    public final EObject entryRuleReferenceDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceDeclarationWOSemicolon = null;


        try {
            // InternalS.g:2480:2: (iv_ruleReferenceDeclarationWOSemicolon= ruleReferenceDeclarationWOSemicolon EOF )
            // InternalS.g:2481:2: iv_ruleReferenceDeclarationWOSemicolon= ruleReferenceDeclarationWOSemicolon EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceDeclarationWOSemicolon"


    // $ANTLR start "ruleReferenceDeclarationWOSemicolon"
    // InternalS.g:2488:1: ruleReferenceDeclarationWOSemicolon returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )? ) ;
    public final EObject ruleReferenceDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_extern_4_0=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_valuedObjects_5_0 = null;

        EObject lv_valuedObjects_7_0 = null;

        EObject lv_annotations_8_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:2491:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )? ) )
            // InternalS.g:2492:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )? )
            {
            // InternalS.g:2492:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )? )
            // InternalS.g:2492:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )?
            {
            // InternalS.g:2492:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_COMMENT_ANNOTATION||LA54_0==66) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalS.g:2493:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalS.g:2493:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalS.g:2494:3: lv_annotations_0_0= ruleAnnotation
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
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // InternalS.g:2510:3: ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==47) ) {
                alt55=1;
            }
            else if ( (LA55_0==48) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalS.g:2510:4: (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) )
                    {
                    // InternalS.g:2510:4: (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) )
                    // InternalS.g:2510:6: otherlv_1= 'ref' ( ( ruleNamespaceID ) )
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getRefKeyword_1_0_0());
                          
                    }
                    // InternalS.g:2514:1: ( ( ruleNamespaceID ) )
                    // InternalS.g:2515:1: ( ruleNamespaceID )
                    {
                    // InternalS.g:2515:1: ( ruleNamespaceID )
                    // InternalS.g:2516:3: ruleNamespaceID
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
                       
                      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getReferenceNamedObjectCrossReference_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_35);
                    ruleNamespaceID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalS.g:2533:6: (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) )
                    {
                    // InternalS.g:2533:6: (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) )
                    // InternalS.g:2533:8: otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getExternKeyword_1_1_0());
                          
                    }
                    // InternalS.g:2537:1: ( (lv_extern_4_0= RULE_STRING ) )
                    // InternalS.g:2538:1: (lv_extern_4_0= RULE_STRING )
                    {
                    // InternalS.g:2538:1: (lv_extern_4_0= RULE_STRING )
                    // InternalS.g:2539:3: lv_extern_4_0= RULE_STRING
                    {
                    lv_extern_4_0=(Token)match(input,RULE_STRING,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_extern_4_0, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getExternSTRINGTerminalRuleCall_1_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReferenceDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"extern",
                              		lv_extern_4_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalS.g:2555:4: ( (lv_valuedObjects_5_0= ruleValuedObject ) )
            // InternalS.g:2556:1: (lv_valuedObjects_5_0= ruleValuedObject )
            {
            // InternalS.g:2556:1: (lv_valuedObjects_5_0= ruleValuedObject )
            // InternalS.g:2557:3: lv_valuedObjects_5_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_38);
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
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:2573:2: (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==28) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalS.g:2573:4: otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    {
            	    otherlv_6=(Token)match(input,28,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalS.g:2577:1: ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    // InternalS.g:2578:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    {
            	    // InternalS.g:2578:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    // InternalS.g:2579:3: lv_valuedObjects_7_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_valuedObjects_7_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_7_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
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

            // InternalS.g:2595:4: ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_SL_COMMENT_ANNOTATION) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalS.g:2596:1: (lv_annotations_8_0= ruleCommentAnnotatonSL )
                    {
                    // InternalS.g:2596:1: (lv_annotations_8_0= ruleCommentAnnotatonSL )
                    // InternalS.g:2597:3: lv_annotations_8_0= ruleCommentAnnotatonSL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getAnnotationsCommentAnnotatonSLParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_annotations_8_0=ruleCommentAnnotatonSL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationWOSemicolonRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_8_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.CommentAnnotatonSL");
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
        }
        return current;
    }
    // $ANTLR end "ruleReferenceDeclarationWOSemicolon"


    // $ANTLR start "entryRuleScheduleDeclaration"
    // InternalS.g:2621:1: entryRuleScheduleDeclaration returns [EObject current=null] : iv_ruleScheduleDeclaration= ruleScheduleDeclaration EOF ;
    public final EObject entryRuleScheduleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleDeclaration = null;


        try {
            // InternalS.g:2622:2: (iv_ruleScheduleDeclaration= ruleScheduleDeclaration EOF )
            // InternalS.g:2623:2: iv_ruleScheduleDeclaration= ruleScheduleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScheduleDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScheduleDeclaration=ruleScheduleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScheduleDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScheduleDeclaration"


    // $ANTLR start "ruleScheduleDeclaration"
    // InternalS.g:2630:1: ruleScheduleDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )? ) ;
    public final EObject ruleScheduleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_global_3_0 = null;

        EObject lv_priorities_4_0 = null;

        EObject lv_valuedObjects_5_0 = null;

        EObject lv_valuedObjects_7_0 = null;

        EObject lv_annotations_9_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:2633:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )? ) )
            // InternalS.g:2634:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )? )
            {
            // InternalS.g:2634:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )? )
            // InternalS.g:2634:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )?
            {
            // InternalS.g:2634:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_COMMENT_ANNOTATION||LA58_0==66) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalS.g:2635:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalS.g:2635:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalS.g:2636:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_43);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
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
            	    break loop58;
                }
            } while (true);

            otherlv_1=(Token)match(input,49,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getScheduleDeclarationAccess().getScheduleKeyword_1());
                  
            }
            // InternalS.g:2656:1: ( (lv_name_2_0= rulePrimeID ) )
            // InternalS.g:2657:1: (lv_name_2_0= rulePrimeID )
            {
            // InternalS.g:2657:1: (lv_name_2_0= rulePrimeID )
            // InternalS.g:2658:3: lv_name_2_0= rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getNamePrimeIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_44);
            lv_name_2_0=rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.PrimeID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:2674:2: ( (lv_global_3_0= ruleSchedulePriorityType ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=68 && LA59_0<=69)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalS.g:2675:1: (lv_global_3_0= ruleSchedulePriorityType )
                    {
                    // InternalS.g:2675:1: (lv_global_3_0= ruleSchedulePriorityType )
                    // InternalS.g:2676:3: lv_global_3_0= ruleSchedulePriorityType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getGlobalSchedulePriorityTypeEnumRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_45);
                    lv_global_3_0=ruleSchedulePriorityType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"global",
                              		lv_global_3_0, 
                              		"de.cau.cs.kieler.kexpressions.kext.KExt.SchedulePriorityType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalS.g:2692:3: ( (lv_priorities_4_0= ruleSchedulePriority ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==27) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalS.g:2693:1: (lv_priorities_4_0= ruleSchedulePriority )
            	    {
            	    // InternalS.g:2693:1: (lv_priorities_4_0= ruleSchedulePriority )
            	    // InternalS.g:2694:3: lv_priorities_4_0= ruleSchedulePriority
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getPrioritiesSchedulePriorityParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_priorities_4_0=ruleSchedulePriority();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"priorities",
            	              		lv_priorities_4_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.SchedulePriority");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            // InternalS.g:2710:3: ( (lv_valuedObjects_5_0= ruleValuedObject ) )
            // InternalS.g:2711:1: (lv_valuedObjects_5_0= ruleValuedObject )
            {
            // InternalS.g:2711:1: (lv_valuedObjects_5_0= ruleValuedObject )
            // InternalS.g:2712:3: lv_valuedObjects_5_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_36);
            lv_valuedObjects_5_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_5_0, 
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:2728:2: (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==28) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalS.g:2728:4: otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    {
            	    otherlv_6=(Token)match(input,28,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getScheduleDeclarationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalS.g:2732:1: ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    // InternalS.g:2733:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    {
            	    // InternalS.g:2733:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    // InternalS.g:2734:3: lv_valuedObjects_7_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_valuedObjects_7_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_7_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getScheduleDeclarationAccess().getSemicolonKeyword_7());
                  
            }
            // InternalS.g:2754:1: ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_SL_COMMENT_ANNOTATION) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalS.g:2755:1: (lv_annotations_9_0= ruleCommentAnnotatonSL )
                    {
                    // InternalS.g:2755:1: (lv_annotations_9_0= ruleCommentAnnotatonSL )
                    // InternalS.g:2756:3: lv_annotations_9_0= ruleCommentAnnotatonSL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getAnnotationsCommentAnnotatonSLParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_annotations_9_0=ruleCommentAnnotatonSL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_9_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.CommentAnnotatonSL");
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
        }
        return current;
    }
    // $ANTLR end "ruleScheduleDeclaration"


    // $ANTLR start "entryRuleScheduleDeclarationWOSemicolon"
    // InternalS.g:2780:1: entryRuleScheduleDeclarationWOSemicolon returns [EObject current=null] : iv_ruleScheduleDeclarationWOSemicolon= ruleScheduleDeclarationWOSemicolon EOF ;
    public final EObject entryRuleScheduleDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleDeclarationWOSemicolon = null;


        try {
            // InternalS.g:2781:2: (iv_ruleScheduleDeclarationWOSemicolon= ruleScheduleDeclarationWOSemicolon EOF )
            // InternalS.g:2782:2: iv_ruleScheduleDeclarationWOSemicolon= ruleScheduleDeclarationWOSemicolon EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScheduleDeclarationWOSemicolon=ruleScheduleDeclarationWOSemicolon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScheduleDeclarationWOSemicolon; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScheduleDeclarationWOSemicolon"


    // $ANTLR start "ruleScheduleDeclarationWOSemicolon"
    // InternalS.g:2789:1: ruleScheduleDeclarationWOSemicolon returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )? ) ;
    public final EObject ruleScheduleDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_global_3_0 = null;

        EObject lv_priorities_4_0 = null;

        EObject lv_valuedObjects_5_0 = null;

        EObject lv_valuedObjects_7_0 = null;

        EObject lv_annotations_8_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:2792:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )? ) )
            // InternalS.g:2793:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )? )
            {
            // InternalS.g:2793:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )? )
            // InternalS.g:2793:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )?
            {
            // InternalS.g:2793:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_COMMENT_ANNOTATION||LA63_0==66) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalS.g:2794:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalS.g:2794:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalS.g:2795:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_43);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
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
            	    break loop63;
                }
            } while (true);

            otherlv_1=(Token)match(input,49,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getScheduleDeclarationWOSemicolonAccess().getScheduleKeyword_1());
                  
            }
            // InternalS.g:2815:1: ( (lv_name_2_0= rulePrimeID ) )
            // InternalS.g:2816:1: (lv_name_2_0= rulePrimeID )
            {
            // InternalS.g:2816:1: (lv_name_2_0= rulePrimeID )
            // InternalS.g:2817:3: lv_name_2_0= rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getNamePrimeIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_44);
            lv_name_2_0=rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.PrimeID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:2833:2: ( (lv_global_3_0= ruleSchedulePriorityType ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=68 && LA64_0<=69)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalS.g:2834:1: (lv_global_3_0= ruleSchedulePriorityType )
                    {
                    // InternalS.g:2834:1: (lv_global_3_0= ruleSchedulePriorityType )
                    // InternalS.g:2835:3: lv_global_3_0= ruleSchedulePriorityType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getGlobalSchedulePriorityTypeEnumRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_45);
                    lv_global_3_0=ruleSchedulePriorityType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
                      	        }
                             		set(
                             			current, 
                             			"global",
                              		lv_global_3_0, 
                              		"de.cau.cs.kieler.kexpressions.kext.KExt.SchedulePriorityType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalS.g:2851:3: ( (lv_priorities_4_0= ruleSchedulePriority ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==27) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalS.g:2852:1: (lv_priorities_4_0= ruleSchedulePriority )
            	    {
            	    // InternalS.g:2852:1: (lv_priorities_4_0= ruleSchedulePriority )
            	    // InternalS.g:2853:3: lv_priorities_4_0= ruleSchedulePriority
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getPrioritiesSchedulePriorityParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_priorities_4_0=ruleSchedulePriority();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"priorities",
            	              		lv_priorities_4_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.SchedulePriority");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            // InternalS.g:2869:3: ( (lv_valuedObjects_5_0= ruleValuedObject ) )
            // InternalS.g:2870:1: (lv_valuedObjects_5_0= ruleValuedObject )
            {
            // InternalS.g:2870:1: (lv_valuedObjects_5_0= ruleValuedObject )
            // InternalS.g:2871:3: lv_valuedObjects_5_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_38);
            lv_valuedObjects_5_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_5_0, 
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:2887:2: (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==28) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalS.g:2887:4: otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    {
            	    otherlv_6=(Token)match(input,28,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getScheduleDeclarationWOSemicolonAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalS.g:2891:1: ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    // InternalS.g:2892:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    {
            	    // InternalS.g:2892:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    // InternalS.g:2893:3: lv_valuedObjects_7_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_valuedObjects_7_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_7_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
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

            // InternalS.g:2909:4: ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_SL_COMMENT_ANNOTATION) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalS.g:2910:1: (lv_annotations_8_0= ruleCommentAnnotatonSL )
                    {
                    // InternalS.g:2910:1: (lv_annotations_8_0= ruleCommentAnnotatonSL )
                    // InternalS.g:2911:3: lv_annotations_8_0= ruleCommentAnnotatonSL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getAnnotationsCommentAnnotatonSLParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_annotations_8_0=ruleCommentAnnotatonSL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_8_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.CommentAnnotatonSL");
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
        }
        return current;
    }
    // $ANTLR end "ruleScheduleDeclarationWOSemicolon"


    // $ANTLR start "entryRuleSchedulePriority"
    // InternalS.g:2935:1: entryRuleSchedulePriority returns [EObject current=null] : iv_ruleSchedulePriority= ruleSchedulePriority EOF ;
    public final EObject entryRuleSchedulePriority() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedulePriority = null;


        try {
            // InternalS.g:2936:2: (iv_ruleSchedulePriority= ruleSchedulePriority EOF )
            // InternalS.g:2937:2: iv_ruleSchedulePriority= ruleSchedulePriority EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchedulePriorityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSchedulePriority=ruleSchedulePriority();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchedulePriority; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchedulePriority"


    // $ANTLR start "ruleSchedulePriority"
    // InternalS.g:2944:1: ruleSchedulePriority returns [EObject current=null] : (otherlv_0= 'prio' ( (lv_priority_1_0= RULE_INT ) ) ( (lv_type_2_0= ruleSchedulePriorityType ) ) ) ;
    public final EObject ruleSchedulePriority() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_priority_1_0=null;
        Enumerator lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:2947:28: ( (otherlv_0= 'prio' ( (lv_priority_1_0= RULE_INT ) ) ( (lv_type_2_0= ruleSchedulePriorityType ) ) ) )
            // InternalS.g:2948:1: (otherlv_0= 'prio' ( (lv_priority_1_0= RULE_INT ) ) ( (lv_type_2_0= ruleSchedulePriorityType ) ) )
            {
            // InternalS.g:2948:1: (otherlv_0= 'prio' ( (lv_priority_1_0= RULE_INT ) ) ( (lv_type_2_0= ruleSchedulePriorityType ) ) )
            // InternalS.g:2948:3: otherlv_0= 'prio' ( (lv_priority_1_0= RULE_INT ) ) ( (lv_type_2_0= ruleSchedulePriorityType ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSchedulePriorityAccess().getPrioKeyword_0());
                  
            }
            // InternalS.g:2952:1: ( (lv_priority_1_0= RULE_INT ) )
            // InternalS.g:2953:1: (lv_priority_1_0= RULE_INT )
            {
            // InternalS.g:2953:1: (lv_priority_1_0= RULE_INT )
            // InternalS.g:2954:3: lv_priority_1_0= RULE_INT
            {
            lv_priority_1_0=(Token)match(input,RULE_INT,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_priority_1_0, grammarAccess.getSchedulePriorityAccess().getPriorityINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSchedulePriorityRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"priority",
                      		lv_priority_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.INT");
              	    
            }

            }


            }

            // InternalS.g:2970:2: ( (lv_type_2_0= ruleSchedulePriorityType ) )
            // InternalS.g:2971:1: (lv_type_2_0= ruleSchedulePriorityType )
            {
            // InternalS.g:2971:1: (lv_type_2_0= ruleSchedulePriorityType )
            // InternalS.g:2972:3: lv_type_2_0= ruleSchedulePriorityType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSchedulePriorityAccess().getTypeSchedulePriorityTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleSchedulePriorityType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSchedulePriorityRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.SchedulePriorityType");
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
    // $ANTLR end "ruleSchedulePriority"


    // $ANTLR start "entryRuleValuedObject"
    // InternalS.g:2996:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObject = null;


        try {
            // InternalS.g:2997:2: (iv_ruleValuedObject= ruleValuedObject EOF )
            // InternalS.g:2998:2: iv_ruleValuedObject= ruleValuedObject EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObject"


    // $ANTLR start "ruleValuedObject"
    // InternalS.g:3005:1: ruleValuedObject returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? ) ;
    public final EObject ruleValuedObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_cardinalities_3_0 = null;

        EObject lv_initialValue_6_0 = null;

        Enumerator lv_combineOperator_8_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:3008:28: ( ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? ) )
            // InternalS.g:3009:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? )
            {
            // InternalS.g:3009:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? )
            // InternalS.g:3009:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )?
            {
            // InternalS.g:3009:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_COMMENT_ANNOTATION||LA68_0==66) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalS.g:3010:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    {
            	    // InternalS.g:3010:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    // InternalS.g:3011:3: lv_annotations_0_0= ruleQuotedStringAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getAnnotationsQuotedStringAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_35);
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
            	              		"de.cau.cs.kieler.annotations.Annotations.QuotedStringAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            // InternalS.g:3027:3: ( (lv_name_1_0= rulePrimeID ) )
            // InternalS.g:3028:1: (lv_name_1_0= rulePrimeID )
            {
            // InternalS.g:3028:1: (lv_name_1_0= rulePrimeID )
            // InternalS.g:3029:3: lv_name_1_0= rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValuedObjectAccess().getNamePrimeIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_47);
            lv_name_1_0=rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.PrimeID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:3045:2: (otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==24) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalS.g:3045:4: otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalS.g:3049:1: ( (lv_cardinalities_3_0= ruleExpression ) )
            	    // InternalS.g:3050:1: (lv_cardinalities_3_0= ruleExpression )
            	    {
            	    // InternalS.g:3050:1: (lv_cardinalities_3_0= ruleExpression )
            	    // InternalS.g:3051:3: lv_cardinalities_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCardinalitiesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_cardinalities_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cardinalities",
            	              		lv_cardinalities_3_0, 
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,25,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            // InternalS.g:3071:3: (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==26) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalS.g:3071:5: otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getValuedObjectAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // InternalS.g:3075:1: ( (lv_initialValue_6_0= ruleExpression ) )
                    // InternalS.g:3076:1: (lv_initialValue_6_0= ruleExpression )
                    {
                    // InternalS.g:3076:1: (lv_initialValue_6_0= ruleExpression )
                    // InternalS.g:3077:3: lv_initialValue_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getInitialValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_48);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalS.g:3093:4: (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==50) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalS.g:3093:6: otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) )
                    {
                    otherlv_7=(Token)match(input,50,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getValuedObjectAccess().getCombineKeyword_4_0());
                          
                    }
                    // InternalS.g:3097:1: ( (lv_combineOperator_8_0= ruleCombineOperator ) )
                    // InternalS.g:3098:1: (lv_combineOperator_8_0= ruleCombineOperator )
                    {
                    // InternalS.g:3098:1: (lv_combineOperator_8_0= ruleCombineOperator )
                    // InternalS.g:3099:3: lv_combineOperator_8_0= ruleCombineOperator
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
        }
        return current;
    }
    // $ANTLR end "ruleValuedObject"


    // $ANTLR start "entryRuleEffect"
    // InternalS.g:3123:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalS.g:3124:2: (iv_ruleEffect= ruleEffect EOF )
            // InternalS.g:3125:2: iv_ruleEffect= ruleEffect EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalS.g:3132:1: ruleEffect returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_PostfixEffect_1 = null;

        EObject this_Emission_2 = null;

        EObject this_HostcodeEffect_3 = null;

        EObject this_ReferenceCallEffect_4 = null;

        EObject this_FunctionCallEffect_5 = null;


         enterRule(); 
            
        try {
            // InternalS.g:3135:28: ( (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect ) )
            // InternalS.g:3136:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect )
            {
            // InternalS.g:3136:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect )
            int alt72=6;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // InternalS.g:3137:2: this_Assignment_0= ruleAssignment
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
                    // InternalS.g:3150:2: this_PostfixEffect_1= rulePostfixEffect
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
                    // InternalS.g:3163:2: this_Emission_2= ruleEmission
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
                    // InternalS.g:3176:2: this_HostcodeEffect_3= ruleHostcodeEffect
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
                    // InternalS.g:3189:2: this_ReferenceCallEffect_4= ruleReferenceCallEffect
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
                case 6 :
                    // InternalS.g:3202:2: this_FunctionCallEffect_5= ruleFunctionCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getFunctionCallEffectParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionCallEffect_5=ruleFunctionCallEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCallEffect_5; 
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
    // InternalS.g:3221:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // InternalS.g:3222:2: (iv_ruleEmission= ruleEmission EOF )
            // InternalS.g:3223:2: iv_ruleEmission= ruleEmission EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleEmission"


    // $ANTLR start "ruleEmission"
    // InternalS.g:3230:1: ruleEmission returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_newValue_3_0 = null;

        EObject lv_schedule_6_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:3233:28: ( ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )? ) )
            // InternalS.g:3234:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )? )
            {
            // InternalS.g:3234:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )? )
            // InternalS.g:3234:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )?
            {
            // InternalS.g:3234:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_COMMENT_ANNOTATION||LA73_0==66) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalS.g:3235:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    {
            	    // InternalS.g:3235:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    // InternalS.g:3236:3: lv_annotations_0_0= ruleQuotedStringAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmissionAccess().getAnnotationsQuotedStringAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_35);
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
            	              		"de.cau.cs.kieler.annotations.Annotations.QuotedStringAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            // InternalS.g:3252:3: ( ( rulePrimeID ) )
            // InternalS.g:3253:1: ( rulePrimeID )
            {
            // InternalS.g:3253:1: ( rulePrimeID )
            // InternalS.g:3254:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_50);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:3270:2: (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==18) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalS.g:3270:4: otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalS.g:3274:1: ( (lv_newValue_3_0= ruleExpression ) )
                    // InternalS.g:3275:1: (lv_newValue_3_0= ruleExpression )
                    {
                    // InternalS.g:3275:1: (lv_newValue_3_0= ruleExpression )
                    // InternalS.g:3276:3: lv_newValue_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
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

                    otherlv_4=(Token)match(input,19,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEmissionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // InternalS.g:3296:3: (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==49) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalS.g:3296:5: otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+
                    {
                    otherlv_5=(Token)match(input,49,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEmissionAccess().getScheduleKeyword_3_0());
                          
                    }
                    // InternalS.g:3300:1: ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+
                    int cnt75=0;
                    loop75:
                    do {
                        int alt75=2;
                        alt75 = dfa75.predict(input);
                        switch (alt75) {
                    	case 1 :
                    	    // InternalS.g:3301:1: (lv_schedule_6_0= ruleScheduleObjectReference )
                    	    {
                    	    // InternalS.g:3301:1: (lv_schedule_6_0= ruleScheduleObjectReference )
                    	    // InternalS.g:3302:3: lv_schedule_6_0= ruleScheduleObjectReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEmissionAccess().getScheduleScheduleObjectReferenceParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_52);
                    	    lv_schedule_6_0=ruleScheduleObjectReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEmissionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"schedule",
                    	              		lv_schedule_6_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ScheduleObjectReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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
        }
        return current;
    }
    // $ANTLR end "ruleEmission"


    // $ANTLR start "entryRulePostfixEffect"
    // InternalS.g:3328:1: entryRulePostfixEffect returns [EObject current=null] : iv_rulePostfixEffect= rulePostfixEffect EOF ;
    public final EObject entryRulePostfixEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixEffect = null;


        try {
            // InternalS.g:3329:2: (iv_rulePostfixEffect= rulePostfixEffect EOF )
            // InternalS.g:3330:2: iv_rulePostfixEffect= rulePostfixEffect EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRulePostfixEffect"


    // $ANTLR start "rulePostfixEffect"
    // InternalS.g:3337:1: rulePostfixEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) (otherlv_6= 'schedule' ( (lv_schedule_7_0= ruleScheduleObjectReference ) )+ )? ) ;
    public final EObject rulePostfixEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_indices_3_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_schedule_7_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:3340:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) (otherlv_6= 'schedule' ( (lv_schedule_7_0= ruleScheduleObjectReference ) )+ )? ) )
            // InternalS.g:3341:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) (otherlv_6= 'schedule' ( (lv_schedule_7_0= ruleScheduleObjectReference ) )+ )? )
            {
            // InternalS.g:3341:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) (otherlv_6= 'schedule' ( (lv_schedule_7_0= ruleScheduleObjectReference ) )+ )? )
            // InternalS.g:3341:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) (otherlv_6= 'schedule' ( (lv_schedule_7_0= ruleScheduleObjectReference ) )+ )?
            {
            // InternalS.g:3341:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==RULE_COMMENT_ANNOTATION||LA77_0==66) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalS.g:3342:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalS.g:3342:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalS.g:3343:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_35);
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
            	    break loop77;
                }
            } while (true);

            // InternalS.g:3359:3: ( ( rulePrimeID ) )
            // InternalS.g:3360:1: ( rulePrimeID )
            {
            // InternalS.g:3360:1: ( rulePrimeID )
            // InternalS.g:3361:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPostfixEffectRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_53);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:3377:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==24) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalS.g:3377:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPostfixEffectAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalS.g:3381:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // InternalS.g:3382:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // InternalS.g:3382:1: (lv_indices_3_0= ruleExpression )
            	    // InternalS.g:3383:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_17);
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

            	    otherlv_4=(Token)match(input,25,FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getPostfixEffectAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            // InternalS.g:3403:3: ( (lv_operator_5_0= rulePostfixOperator ) )
            // InternalS.g:3404:1: (lv_operator_5_0= rulePostfixOperator )
            {
            // InternalS.g:3404:1: (lv_operator_5_0= rulePostfixOperator )
            // InternalS.g:3405:3: lv_operator_5_0= rulePostfixOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getOperatorPostfixOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_51);
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

            // InternalS.g:3421:2: (otherlv_6= 'schedule' ( (lv_schedule_7_0= ruleScheduleObjectReference ) )+ )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==49) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalS.g:3421:4: otherlv_6= 'schedule' ( (lv_schedule_7_0= ruleScheduleObjectReference ) )+
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getPostfixEffectAccess().getScheduleKeyword_4_0());
                          
                    }
                    // InternalS.g:3425:1: ( (lv_schedule_7_0= ruleScheduleObjectReference ) )+
                    int cnt79=0;
                    loop79:
                    do {
                        int alt79=2;
                        alt79 = dfa79.predict(input);
                        switch (alt79) {
                    	case 1 :
                    	    // InternalS.g:3426:1: (lv_schedule_7_0= ruleScheduleObjectReference )
                    	    {
                    	    // InternalS.g:3426:1: (lv_schedule_7_0= ruleScheduleObjectReference )
                    	    // InternalS.g:3427:3: lv_schedule_7_0= ruleScheduleObjectReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getScheduleScheduleObjectReferenceParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_52);
                    	    lv_schedule_7_0=ruleScheduleObjectReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPostfixEffectRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"schedule",
                    	              		lv_schedule_7_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ScheduleObjectReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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
        }
        return current;
    }
    // $ANTLR end "rulePostfixEffect"


    // $ANTLR start "entryRuleHostcodeEffect"
    // InternalS.g:3451:1: entryRuleHostcodeEffect returns [EObject current=null] : iv_ruleHostcodeEffect= ruleHostcodeEffect EOF ;
    public final EObject entryRuleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostcodeEffect = null;


        try {
            // InternalS.g:3452:2: (iv_ruleHostcodeEffect= ruleHostcodeEffect EOF )
            // InternalS.g:3453:2: iv_ruleHostcodeEffect= ruleHostcodeEffect EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleHostcodeEffect"


    // $ANTLR start "ruleHostcodeEffect"
    // InternalS.g:3460:1: ruleHostcodeEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:3463:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // InternalS.g:3464:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // InternalS.g:3464:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // InternalS.g:3464:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // InternalS.g:3464:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==RULE_COMMENT_ANNOTATION||LA81_0==66) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalS.g:3465:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalS.g:3465:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalS.g:3466:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHostcodeEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_54);
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
            	    break loop81;
                }
            } while (true);

            // InternalS.g:3482:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // InternalS.g:3483:1: (lv_text_1_0= RULE_HOSTCODE )
            {
            // InternalS.g:3483:1: (lv_text_1_0= RULE_HOSTCODE )
            // InternalS.g:3484:3: lv_text_1_0= RULE_HOSTCODE
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
        }
        return current;
    }
    // $ANTLR end "ruleHostcodeEffect"


    // $ANTLR start "entryRuleReferenceCallEffect"
    // InternalS.g:3508:1: entryRuleReferenceCallEffect returns [EObject current=null] : iv_ruleReferenceCallEffect= ruleReferenceCallEffect EOF ;
    public final EObject entryRuleReferenceCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCallEffect = null;


        try {
            // InternalS.g:3509:2: (iv_ruleReferenceCallEffect= ruleReferenceCallEffect EOF )
            // InternalS.g:3510:2: iv_ruleReferenceCallEffect= ruleReferenceCallEffect EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceCallEffect"


    // $ANTLR start "ruleReferenceCallEffect"
    // InternalS.g:3517:1: ruleReferenceCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) ;
    public final EObject ruleReferenceCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:3520:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) )
            // InternalS.g:3521:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            {
            // InternalS.g:3521:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            // InternalS.g:3521:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            {
            // InternalS.g:3521:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_COMMENT_ANNOTATION||LA82_0==66) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalS.g:3522:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalS.g:3522:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalS.g:3523:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_35);
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
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            // InternalS.g:3539:3: ( ( rulePrimeID ) )
            // InternalS.g:3540:1: ( rulePrimeID )
            {
            // InternalS.g:3540:1: ( rulePrimeID )
            // InternalS.g:3541:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceCallEffectRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_55);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:3557:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==18) ) {
                alt84=1;
            }
            else if ( (LA84_0==51) ) {
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
                    // InternalS.g:3557:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalS.g:3557:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalS.g:3557:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getReferenceCallEffectAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // InternalS.g:3561:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalS.g:3562:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalS.g:3562:1: (lv_parameters_3_0= ruleParameter )
                    // InternalS.g:3563:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_18);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalS.g:3579:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==28) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalS.g:3579:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FOLLOW_56); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getReferenceCallEffectAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // InternalS.g:3583:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalS.g:3584:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalS.g:3584:1: (lv_parameters_5_0= ruleParameter )
                    	    // InternalS.g:3585:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_18);
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
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getReferenceCallEffectAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalS.g:3606:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleReferenceCallEffect"


    // $ANTLR start "entryRuleFunctionCallEffect"
    // InternalS.g:3618:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallEffect = null;


        try {
            // InternalS.g:3619:2: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // InternalS.g:3620:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCallEffect"


    // $ANTLR start "ruleFunctionCallEffect"
    // InternalS.g:3627:1: ruleFunctionCallEffect returns [EObject current=null] : ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ) | (otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>' ) ) ;
    public final EObject ruleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_functionName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_functionName_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_12_0 = null;

        EObject lv_parameters_14_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:3630:28: ( ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ) | (otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>' ) ) )
            // InternalS.g:3631:1: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ) | (otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>' ) )
            {
            // InternalS.g:3631:1: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ) | (otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>' ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_COMMENT_ANNOTATION||LA90_0==48||LA90_0==66) ) {
                alt90=1;
            }
            else if ( (LA90_0==52) ) {
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
                    // InternalS.g:3631:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) )
                    {
                    // InternalS.g:3631:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) )
                    // InternalS.g:3631:3: ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
                    {
                    // InternalS.g:3631:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==RULE_COMMENT_ANNOTATION||LA85_0==66) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalS.g:3632:1: (lv_annotations_0_0= ruleAnnotation )
                    	    {
                    	    // InternalS.g:3632:1: (lv_annotations_0_0= ruleAnnotation )
                    	    // InternalS.g:3633:3: lv_annotations_0_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_57);
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
                    	    break loop85;
                        }
                    } while (true);

                    // InternalS.g:3649:3: (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
                    // InternalS.g:3649:5: otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getFunctionCallEffectAccess().getExternKeyword_0_1_0());
                          
                    }
                    // InternalS.g:3653:1: ( (lv_functionName_2_0= RULE_ID ) )
                    // InternalS.g:3654:1: (lv_functionName_2_0= RULE_ID )
                    {
                    // InternalS.g:3654:1: (lv_functionName_2_0= RULE_ID )
                    // InternalS.g:3655:3: lv_functionName_2_0= RULE_ID
                    {
                    lv_functionName_2_0=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_functionName_2_0, grammarAccess.getFunctionCallEffectAccess().getFunctionNameIDTerminalRuleCall_0_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionCallEffectRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"functionName",
                              		lv_functionName_2_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    // InternalS.g:3671:2: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==18) ) {
                        alt87=1;
                    }
                    else if ( (LA87_0==51) ) {
                        alt87=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalS.g:3671:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                            {
                            // InternalS.g:3671:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                            // InternalS.g:3671:5: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_56); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_0_1_2_0_0());
                                  
                            }
                            // InternalS.g:3675:1: ( (lv_parameters_4_0= ruleParameter ) )
                            // InternalS.g:3676:1: (lv_parameters_4_0= ruleParameter )
                            {
                            // InternalS.g:3676:1: (lv_parameters_4_0= ruleParameter )
                            // InternalS.g:3677:3: lv_parameters_4_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_0_1_2_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_18);
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

                            // InternalS.g:3693:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                            loop86:
                            do {
                                int alt86=2;
                                int LA86_0 = input.LA(1);

                                if ( (LA86_0==28) ) {
                                    alt86=1;
                                }


                                switch (alt86) {
                            	case 1 :
                            	    // InternalS.g:3693:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                            	    {
                            	    otherlv_5=(Token)match(input,28,FOLLOW_56); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_5, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_0_1_2_0_2_0());
                            	          
                            	    }
                            	    // InternalS.g:3697:1: ( (lv_parameters_6_0= ruleParameter ) )
                            	    // InternalS.g:3698:1: (lv_parameters_6_0= ruleParameter )
                            	    {
                            	    // InternalS.g:3698:1: (lv_parameters_6_0= ruleParameter )
                            	    // InternalS.g:3699:3: lv_parameters_6_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_0_1_2_0_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_18);
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
                            	    break loop86;
                                }
                            } while (true);

                            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_0_1_2_0_3());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalS.g:3720:7: otherlv_8= '()'
                            {
                            otherlv_8=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_0_1_2_1());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalS.g:3725:6: (otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>' )
                    {
                    // InternalS.g:3725:6: (otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>' )
                    // InternalS.g:3725:8: otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>'
                    {
                    otherlv_9=(Token)match(input,52,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // InternalS.g:3729:1: ( (lv_functionName_10_0= RULE_ID ) )
                    // InternalS.g:3730:1: (lv_functionName_10_0= RULE_ID )
                    {
                    // InternalS.g:3730:1: (lv_functionName_10_0= RULE_ID )
                    // InternalS.g:3731:3: lv_functionName_10_0= RULE_ID
                    {
                    lv_functionName_10_0=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_functionName_10_0, grammarAccess.getFunctionCallEffectAccess().getFunctionNameIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionCallEffectRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"functionName",
                              		lv_functionName_10_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    // InternalS.g:3747:2: ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' )
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==18) ) {
                        alt89=1;
                    }
                    else if ( (LA89_0==51) ) {
                        alt89=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 0, input);

                        throw nvae;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalS.g:3747:3: (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' )
                            {
                            // InternalS.g:3747:3: (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' )
                            // InternalS.g:3747:5: otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')'
                            {
                            otherlv_11=(Token)match(input,18,FOLLOW_56); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_1_2_0_0());
                                  
                            }
                            // InternalS.g:3751:1: ( (lv_parameters_12_0= ruleParameter ) )
                            // InternalS.g:3752:1: (lv_parameters_12_0= ruleParameter )
                            {
                            // InternalS.g:3752:1: (lv_parameters_12_0= ruleParameter )
                            // InternalS.g:3753:3: lv_parameters_12_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_1_2_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_18);
                            lv_parameters_12_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameters",
                                      		lv_parameters_12_0, 
                                      		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalS.g:3769:2: (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )*
                            loop88:
                            do {
                                int alt88=2;
                                int LA88_0 = input.LA(1);

                                if ( (LA88_0==28) ) {
                                    alt88=1;
                                }


                                switch (alt88) {
                            	case 1 :
                            	    // InternalS.g:3769:4: otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) )
                            	    {
                            	    otherlv_13=(Token)match(input,28,FOLLOW_56); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_13, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_1_2_0_2_0());
                            	          
                            	    }
                            	    // InternalS.g:3773:1: ( (lv_parameters_14_0= ruleParameter ) )
                            	    // InternalS.g:3774:1: (lv_parameters_14_0= ruleParameter )
                            	    {
                            	    // InternalS.g:3774:1: (lv_parameters_14_0= ruleParameter )
                            	    // InternalS.g:3775:3: lv_parameters_14_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_1_2_0_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_18);
                            	    lv_parameters_14_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameters",
                            	              		lv_parameters_14_0, 
                            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
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

                            otherlv_15=(Token)match(input,19,FOLLOW_58); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_15, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_1_2_0_3());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalS.g:3796:7: otherlv_16= '()'
                            {
                            otherlv_16=(Token)match(input,51,FOLLOW_58); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_1_2_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getFunctionCallEffectAccess().getGreaterThanSignKeyword_1_3());
                          
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
    // $ANTLR end "ruleFunctionCallEffect"


    // $ANTLR start "entryRuleExpression"
    // InternalS.g:3814:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalS.g:3815:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalS.g:3816:2: iv_ruleExpression= ruleExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalS.g:3823:1: ruleExpression returns [EObject current=null] : ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;

        EObject lv_schedule_3_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:3826:28: ( ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? ) )
            // InternalS.g:3827:1: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? )
            {
            // InternalS.g:3827:1: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? )
            // InternalS.g:3827:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )?
            {
            // InternalS.g:3827:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // InternalS.g:3828:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_51);
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
                    // InternalS.g:3841:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_51);
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

            // InternalS.g:3852:2: (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==49) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalS.g:3852:4: otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getScheduleKeyword_1_0());
                          
                    }
                    // InternalS.g:3856:1: ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+
                    int cnt92=0;
                    loop92:
                    do {
                        int alt92=2;
                        alt92 = dfa92.predict(input);
                        switch (alt92) {
                    	case 1 :
                    	    // InternalS.g:3857:1: (lv_schedule_3_0= ruleScheduleObjectReference )
                    	    {
                    	    // InternalS.g:3857:1: (lv_schedule_3_0= ruleScheduleObjectReference )
                    	    // InternalS.g:3858:3: lv_schedule_3_0= ruleScheduleObjectReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpressionAccess().getScheduleScheduleObjectReferenceParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_52);
                    	    lv_schedule_3_0=ruleScheduleObjectReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"schedule",
                    	              		lv_schedule_3_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ScheduleObjectReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt92 >= 1 ) break loop92;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(92, input);
                                throw eee;
                        }
                        cnt92++;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBoolExpression"
    // InternalS.g:3882:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalS.g:3883:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalS.g:3884:2: iv_ruleBoolExpression= ruleBoolExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // InternalS.g:3891:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:3894:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalS.g:3896:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
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
        }
        return current;
    }
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalS.g:3915:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalS.g:3916:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalS.g:3917:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // InternalS.g:3924:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:3927:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) )
            // InternalS.g:3928:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            {
            // InternalS.g:3928:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            // InternalS.g:3929:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_59);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalS.g:3940:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==54) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalS.g:3940:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    {
                    // InternalS.g:3940:2: ()
                    // InternalS.g:3941:2: 
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

                    // InternalS.g:3949:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )
                    // InternalS.g:3949:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    {
                    // InternalS.g:3949:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    // InternalS.g:3950:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    {
                    // InternalS.g:3950:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    // InternalS.g:3951:3: lv_operator_2_0= ruleLogicalOrOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
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

                    // InternalS.g:3967:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    // InternalS.g:3968:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    {
                    // InternalS.g:3968:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    // InternalS.g:3969:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_59);
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

                    // InternalS.g:3985:3: (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==54) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // InternalS.g:3985:5: otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,54,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalS.g:3989:1: ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    // InternalS.g:3990:1: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    {
                    	    // InternalS.g:3990:1: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    // InternalS.g:3991:3: lv_subExpressions_5_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_59);
                    	    lv_subExpressions_5_0=ruleLogicalAndExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.LogicalAndExpression");
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalS.g:4015:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalS.g:4016:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalS.g:4017:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // InternalS.g:4024:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:4027:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) )
            // InternalS.g:4028:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            {
            // InternalS.g:4028:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            // InternalS.g:4029:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_60);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalS.g:4040:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==55) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalS.g:4040:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    {
                    // InternalS.g:4040:2: ()
                    // InternalS.g:4041:2: 
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

                    // InternalS.g:4049:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )
                    // InternalS.g:4049:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    {
                    // InternalS.g:4049:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    // InternalS.g:4050:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    {
                    // InternalS.g:4050:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    // InternalS.g:4051:3: lv_operator_2_0= ruleLogicalAndOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
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

                    // InternalS.g:4067:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    // InternalS.g:4068:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    {
                    // InternalS.g:4068:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    // InternalS.g:4069:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_60);
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

                    // InternalS.g:4085:3: (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==55) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // InternalS.g:4085:5: otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalS.g:4089:1: ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    // InternalS.g:4090:1: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    {
                    	    // InternalS.g:4090:1: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    // InternalS.g:4091:3: lv_subExpressions_5_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_60);
                    	    lv_subExpressions_5_0=ruleBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseOrExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // InternalS.g:4115:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // InternalS.g:4116:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalS.g:4117:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseOrExpression"


    // $ANTLR start "ruleBitwiseOrExpression"
    // InternalS.g:4124:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:4127:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) )
            // InternalS.g:4128:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            {
            // InternalS.g:4128:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            // InternalS.g:4129:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_61);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalS.g:4140:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==56) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalS.g:4140:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    {
                    // InternalS.g:4140:2: ()
                    // InternalS.g:4141:2: 
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

                    // InternalS.g:4149:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )
                    // InternalS.g:4149:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    {
                    // InternalS.g:4149:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    // InternalS.g:4150:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    {
                    // InternalS.g:4150:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    // InternalS.g:4151:3: lv_operator_2_0= ruleBitwiseOrOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
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

                    // InternalS.g:4167:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    // InternalS.g:4168:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    {
                    // InternalS.g:4168:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    // InternalS.g:4169:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_61);
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

                    // InternalS.g:4185:3: (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==56) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // InternalS.g:4185:5: otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,56,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalS.g:4189:1: ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    // InternalS.g:4190:1: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    {
                    	    // InternalS.g:4190:1: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    // InternalS.g:4191:3: lv_subExpressions_5_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_61);
                    	    lv_subExpressions_5_0=ruleBitwiseAndExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseAndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop98;
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // InternalS.g:4215:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // InternalS.g:4216:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalS.g:4217:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseAndExpression"


    // $ANTLR start "ruleBitwiseAndExpression"
    // InternalS.g:4224:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:4227:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) )
            // InternalS.g:4228:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            {
            // InternalS.g:4228:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            // InternalS.g:4229:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_62);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalS.g:4240:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==57) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalS.g:4240:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    {
                    // InternalS.g:4240:2: ()
                    // InternalS.g:4241:2: 
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

                    // InternalS.g:4249:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )
                    // InternalS.g:4249:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    {
                    // InternalS.g:4249:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    // InternalS.g:4250:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    {
                    // InternalS.g:4250:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    // InternalS.g:4251:3: lv_operator_2_0= ruleBitwiseAndOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
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

                    // InternalS.g:4267:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    // InternalS.g:4268:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    {
                    // InternalS.g:4268:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    // InternalS.g:4269:3: lv_subExpressions_3_0= ruleCompareOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_62);
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

                    // InternalS.g:4285:3: (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==57) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // InternalS.g:4285:5: otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    {
                    	    otherlv_4=(Token)match(input,57,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalS.g:4289:1: ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    // InternalS.g:4290:1: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    {
                    	    // InternalS.g:4290:1: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    // InternalS.g:4291:3: lv_subExpressions_5_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_62);
                    	    lv_subExpressions_5_0=ruleCompareOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.CompareOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop100;
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalS.g:4315:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalS.g:4316:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalS.g:4317:2: iv_ruleCompareOperation= ruleCompareOperation EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // InternalS.g:4324:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:4327:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // InternalS.g:4328:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // InternalS.g:4328:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // InternalS.g:4329:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_63);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalS.g:4340:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt102=2;
            alt102 = dfa102.predict(input);
            switch (alt102) {
                case 1 :
                    // InternalS.g:4340:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // InternalS.g:4340:2: ()
                    // InternalS.g:4341:2: 
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

                    // InternalS.g:4349:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // InternalS.g:4350:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // InternalS.g:4350:1: (lv_operator_2_0= ruleCompareOperator )
                    // InternalS.g:4351:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
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

                    // InternalS.g:4367:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // InternalS.g:4368:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // InternalS.g:4368:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // InternalS.g:4369:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
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
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleNotOrValuedExpression"
    // InternalS.g:4393:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // InternalS.g:4394:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // InternalS.g:4395:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleNotOrValuedExpression"


    // $ANTLR start "ruleNotOrValuedExpression"
    // InternalS.g:4402:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalS.g:4405:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // InternalS.g:4406:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // InternalS.g:4406:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt103=2;
            alt103 = dfa103.predict(input);
            switch (alt103) {
                case 1 :
                    // InternalS.g:4407:2: this_ValuedExpression_0= ruleValuedExpression
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
                    // InternalS.g:4420:2: this_NotExpression_1= ruleNotExpression
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
        }
        return current;
    }
    // $ANTLR end "ruleNotOrValuedExpression"


    // $ANTLR start "entryRuleNotExpression"
    // InternalS.g:4439:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalS.g:4440:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalS.g:4441:2: iv_ruleNotExpression= ruleNotExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalS.g:4448:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalS.g:4451:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // InternalS.g:4452:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // InternalS.g:4452:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==65) ) {
                alt104=1;
            }
            else if ( (LA104_0==RULE_ID||LA104_0==RULE_HOSTCODE||LA104_0==RULE_BOOLEAN||LA104_0==18||LA104_0==48||LA104_0==52||(LA104_0>=86 && LA104_0<=87)) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // InternalS.g:4452:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // InternalS.g:4452:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // InternalS.g:4452:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // InternalS.g:4452:3: ()
                    // InternalS.g:4453:2: 
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

                    // InternalS.g:4461:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // InternalS.g:4462:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // InternalS.g:4462:1: (lv_operator_1_0= ruleNotOperator )
                    // InternalS.g:4463:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
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

                    // InternalS.g:4479:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // InternalS.g:4480:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // InternalS.g:4480:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // InternalS.g:4481:3: lv_subExpressions_2_0= ruleNotExpression
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
                    // InternalS.g:4499:2: this_AtomicExpression_3= ruleAtomicExpression
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
        }
        return current;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleValuedExpression"
    // InternalS.g:4518:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // InternalS.g:4519:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // InternalS.g:4520:2: iv_ruleValuedExpression= ruleValuedExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedExpression"


    // $ANTLR start "ruleValuedExpression"
    // InternalS.g:4527:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:4530:28: (this_AddExpression_0= ruleAddExpression )
            // InternalS.g:4532:2: this_AddExpression_0= ruleAddExpression
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
        }
        return current;
    }
    // $ANTLR end "ruleValuedExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalS.g:4551:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalS.g:4552:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalS.g:4553:2: iv_ruleAddExpression= ruleAddExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // InternalS.g:4560:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:4563:28: ( (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? ) )
            // InternalS.g:4564:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? )
            {
            // InternalS.g:4564:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? )
            // InternalS.g:4565:2: this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_64);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalS.g:4576:1: ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==58) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalS.g:4576:2: () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )*
                    {
                    // InternalS.g:4576:2: ()
                    // InternalS.g:4577:2: 
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

                    // InternalS.g:4585:2: ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )
                    // InternalS.g:4585:3: ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    {
                    // InternalS.g:4585:3: ( (lv_operator_2_0= ruleAddOperator ) )
                    // InternalS.g:4586:1: (lv_operator_2_0= ruleAddOperator )
                    {
                    // InternalS.g:4586:1: (lv_operator_2_0= ruleAddOperator )
                    // InternalS.g:4587:3: lv_operator_2_0= ruleAddOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_65);
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

                    // InternalS.g:4603:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    // InternalS.g:4604:1: (lv_subExpressions_3_0= ruleSubExpression )
                    {
                    // InternalS.g:4604:1: (lv_subExpressions_3_0= ruleSubExpression )
                    // InternalS.g:4605:3: lv_subExpressions_3_0= ruleSubExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_64);
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

                    // InternalS.g:4621:3: (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==58) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalS.g:4621:5: otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,58,FOLLOW_65); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalS.g:4625:1: ( (lv_subExpressions_5_0= ruleSubExpression ) )
                    	    // InternalS.g:4626:1: (lv_subExpressions_5_0= ruleSubExpression )
                    	    {
                    	    // InternalS.g:4626:1: (lv_subExpressions_5_0= ruleSubExpression )
                    	    // InternalS.g:4627:3: lv_subExpressions_5_0= ruleSubExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_64);
                    	    lv_subExpressions_5_0=ruleSubExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.SubExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // InternalS.g:4651:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // InternalS.g:4652:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // InternalS.g:4653:2: iv_ruleSubExpression= ruleSubExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleSubExpression"


    // $ANTLR start "ruleSubExpression"
    // InternalS.g:4660:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:4663:28: ( (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? ) )
            // InternalS.g:4664:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? )
            {
            // InternalS.g:4664:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? )
            // InternalS.g:4665:2: this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_66);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalS.g:4676:1: ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==59) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalS.g:4676:2: () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )*
                    {
                    // InternalS.g:4676:2: ()
                    // InternalS.g:4677:2: 
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

                    // InternalS.g:4685:2: ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )
                    // InternalS.g:4685:3: ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    {
                    // InternalS.g:4685:3: ( (lv_operator_2_0= ruleSubOperator ) )
                    // InternalS.g:4686:1: (lv_operator_2_0= ruleSubOperator )
                    {
                    // InternalS.g:4686:1: (lv_operator_2_0= ruleSubOperator )
                    // InternalS.g:4687:3: lv_operator_2_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_65);
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

                    // InternalS.g:4703:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    // InternalS.g:4704:1: (lv_subExpressions_3_0= ruleMultExpression )
                    {
                    // InternalS.g:4704:1: (lv_subExpressions_3_0= ruleMultExpression )
                    // InternalS.g:4705:3: lv_subExpressions_3_0= ruleMultExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_66);
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

                    // InternalS.g:4721:3: (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==59) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // InternalS.g:4721:5: otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,59,FOLLOW_65); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getSubExpressionAccess().getHyphenMinusKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalS.g:4725:1: ( (lv_subExpressions_5_0= ruleMultExpression ) )
                    	    // InternalS.g:4726:1: (lv_subExpressions_5_0= ruleMultExpression )
                    	    {
                    	    // InternalS.g:4726:1: (lv_subExpressions_5_0= ruleMultExpression )
                    	    // InternalS.g:4727:3: lv_subExpressions_5_0= ruleMultExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_66);
                    	    lv_subExpressions_5_0=ruleMultExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSubExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.MultExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop107;
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
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // InternalS.g:4751:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // InternalS.g:4752:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalS.g:4753:2: iv_ruleMultExpression= ruleMultExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // InternalS.g:4760:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:4763:28: ( (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? ) )
            // InternalS.g:4764:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? )
            {
            // InternalS.g:4764:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? )
            // InternalS.g:4765:2: this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_67);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalS.g:4776:1: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==60) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalS.g:4776:2: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )*
                    {
                    // InternalS.g:4776:2: ()
                    // InternalS.g:4777:2: 
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

                    // InternalS.g:4785:2: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )
                    // InternalS.g:4785:3: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    {
                    // InternalS.g:4785:3: ( (lv_operator_2_0= ruleMultOperator ) )
                    // InternalS.g:4786:1: (lv_operator_2_0= ruleMultOperator )
                    {
                    // InternalS.g:4786:1: (lv_operator_2_0= ruleMultOperator )
                    // InternalS.g:4787:3: lv_operator_2_0= ruleMultOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_65);
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

                    // InternalS.g:4803:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    // InternalS.g:4804:1: (lv_subExpressions_3_0= ruleDivExpression )
                    {
                    // InternalS.g:4804:1: (lv_subExpressions_3_0= ruleDivExpression )
                    // InternalS.g:4805:3: lv_subExpressions_3_0= ruleDivExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_67);
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

                    // InternalS.g:4821:3: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==60) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // InternalS.g:4821:5: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,60,FOLLOW_65); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalS.g:4825:1: ( (lv_subExpressions_5_0= ruleDivExpression ) )
                    	    // InternalS.g:4826:1: (lv_subExpressions_5_0= ruleDivExpression )
                    	    {
                    	    // InternalS.g:4826:1: (lv_subExpressions_5_0= ruleDivExpression )
                    	    // InternalS.g:4827:3: lv_subExpressions_5_0= ruleDivExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_67);
                    	    lv_subExpressions_5_0=ruleDivExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.DivExpression");
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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // InternalS.g:4851:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // InternalS.g:4852:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // InternalS.g:4853:2: iv_ruleDivExpression= ruleDivExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleDivExpression"


    // $ANTLR start "ruleDivExpression"
    // InternalS.g:4860:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:4863:28: ( (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? ) )
            // InternalS.g:4864:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? )
            {
            // InternalS.g:4864:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? )
            // InternalS.g:4865:2: this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_68);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalS.g:4876:1: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==61) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalS.g:4876:2: () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )*
                    {
                    // InternalS.g:4876:2: ()
                    // InternalS.g:4877:2: 
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

                    // InternalS.g:4885:2: ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )
                    // InternalS.g:4885:3: ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // InternalS.g:4885:3: ( (lv_operator_2_0= ruleDivOperator ) )
                    // InternalS.g:4886:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // InternalS.g:4886:1: (lv_operator_2_0= ruleDivOperator )
                    // InternalS.g:4887:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_65);
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

                    // InternalS.g:4903:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // InternalS.g:4904:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // InternalS.g:4904:1: (lv_subExpressions_3_0= ruleModExpression )
                    // InternalS.g:4905:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_68);
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

                    // InternalS.g:4921:3: (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )*
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==61) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // InternalS.g:4921:5: otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,61,FOLLOW_65); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getDivExpressionAccess().getSolidusKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalS.g:4925:1: ( (lv_subExpressions_5_0= ruleModExpression ) )
                    	    // InternalS.g:4926:1: (lv_subExpressions_5_0= ruleModExpression )
                    	    {
                    	    // InternalS.g:4926:1: (lv_subExpressions_5_0= ruleModExpression )
                    	    // InternalS.g:4927:3: lv_subExpressions_5_0= ruleModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_68);
                    	    lv_subExpressions_5_0=ruleModExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDivExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ModExpression");
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
    // InternalS.g:4951:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // InternalS.g:4952:2: (iv_ruleModExpression= ruleModExpression EOF )
            // InternalS.g:4953:2: iv_ruleModExpression= ruleModExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleModExpression"


    // $ANTLR start "ruleModExpression"
    // InternalS.g:4960:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:4963:28: ( (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? ) )
            // InternalS.g:4964:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? )
            {
            // InternalS.g:4964:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? )
            // InternalS.g:4965:2: this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_69);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalS.g:4976:1: ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==62) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalS.g:4976:2: () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )*
                    {
                    // InternalS.g:4976:2: ()
                    // InternalS.g:4977:2: 
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

                    // InternalS.g:4985:2: ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
                    // InternalS.g:4985:3: ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // InternalS.g:4985:3: ( (lv_operator_2_0= ruleModOperator ) )
                    // InternalS.g:4986:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // InternalS.g:4986:1: (lv_operator_2_0= ruleModOperator )
                    // InternalS.g:4987:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_65);
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

                    // InternalS.g:5003:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalS.g:5004:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalS.g:5004:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalS.g:5005:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_69);
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

                    // InternalS.g:5021:3: (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==62) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // InternalS.g:5021:5: otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,62,FOLLOW_65); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getModExpressionAccess().getPercentSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalS.g:5025:1: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    	    // InternalS.g:5026:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    	    {
                    	    // InternalS.g:5026:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    	    // InternalS.g:5027:3: lv_subExpressions_5_0= ruleAtomicValuedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_69);
                    	    lv_subExpressions_5_0=ruleAtomicValuedExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getModExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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
    // InternalS.g:5051:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // InternalS.g:5052:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // InternalS.g:5053:2: iv_ruleNegExpression= ruleNegExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleNegExpression"


    // $ANTLR start "ruleNegExpression"
    // InternalS.g:5060:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalS.g:5063:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // InternalS.g:5064:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // InternalS.g:5064:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==59) ) {
                alt115=1;
            }
            else if ( ((LA115_0>=RULE_ID && LA115_0<=RULE_BOOLEAN)||LA115_0==18||LA115_0==48||LA115_0==52||(LA115_0>=86 && LA115_0<=87)) ) {
                alt115=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // InternalS.g:5064:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // InternalS.g:5064:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // InternalS.g:5064:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // InternalS.g:5064:3: ()
                    // InternalS.g:5065:2: 
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

                    // InternalS.g:5073:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // InternalS.g:5074:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // InternalS.g:5074:1: (lv_operator_1_0= ruleSubOperator )
                    // InternalS.g:5075:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_65);
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

                    // InternalS.g:5091:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // InternalS.g:5092:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // InternalS.g:5092:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // InternalS.g:5093:3: lv_subExpressions_2_0= ruleNegExpression
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
                    // InternalS.g:5111:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
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
        }
        return current;
    }
    // $ANTLR end "ruleNegExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalS.g:5130:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalS.g:5131:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalS.g:5132:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalS.g:5139:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BoolValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BoolExpression_3 = null;

        EObject this_ReferenceCall_5 = null;

        EObject this_FunctionCall_6 = null;

        EObject this_TextExpression_7 = null;


         enterRule(); 
            
        try {
            // InternalS.g:5142:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression ) )
            // InternalS.g:5143:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression )
            {
            // InternalS.g:5143:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression )
            int alt116=6;
            alt116 = dfa116.predict(input);
            switch (alt116) {
                case 1 :
                    // InternalS.g:5144:2: this_BoolValue_0= ruleBoolValue
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
                    // InternalS.g:5157:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
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
                    // InternalS.g:5169:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // InternalS.g:5169:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // InternalS.g:5169:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_7);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalS.g:5191:2: this_ReferenceCall_5= ruleReferenceCall
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
                    // InternalS.g:5204:2: this_FunctionCall_6= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_6=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCall_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalS.g:5217:2: this_TextExpression_7= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_TextExpression_7=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextExpression_7; 
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
    // InternalS.g:5236:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // InternalS.g:5237:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // InternalS.g:5238:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicValuedExpression"


    // $ANTLR start "ruleAtomicValuedExpression"
    // InternalS.g:5245:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_ValuedExpression_4 = null;

        EObject this_AtomicExpression_6 = null;


         enterRule(); 
            
        try {
            // InternalS.g:5248:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // InternalS.g:5249:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // InternalS.g:5249:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt117=5;
            alt117 = dfa117.predict(input);
            switch (alt117) {
                case 1 :
                    // InternalS.g:5250:2: this_IntValue_0= ruleIntValue
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
                    // InternalS.g:5263:2: this_FloatValue_1= ruleFloatValue
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
                    // InternalS.g:5276:2: this_StringValue_2= ruleStringValue
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
                    // InternalS.g:5288:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // InternalS.g:5288:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // InternalS.g:5288:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_7);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalS.g:5310:2: this_AtomicExpression_6= ruleAtomicExpression
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
        }
        return current;
    }
    // $ANTLR end "ruleAtomicValuedExpression"


    // $ANTLR start "entryRuleValuedObjectTestExpression"
    // InternalS.g:5329:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // InternalS.g:5330:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // InternalS.g:5331:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectTestExpression"


    // $ANTLR start "ruleValuedObjectTestExpression"
    // InternalS.g:5338:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            // InternalS.g:5341:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // InternalS.g:5342:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // InternalS.g:5342:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( ((LA119_0>=86 && LA119_0<=87)) ) {
                alt119=1;
            }
            else if ( (LA119_0==RULE_ID) ) {
                alt119=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }
            switch (alt119) {
                case 1 :
                    // InternalS.g:5342:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // InternalS.g:5342:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // InternalS.g:5342:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // InternalS.g:5342:3: ()
                    // InternalS.g:5343:2: 
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

                    // InternalS.g:5351:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // InternalS.g:5352:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // InternalS.g:5352:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // InternalS.g:5353:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // InternalS.g:5353:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==86) ) {
                        alt118=1;
                    }
                    else if ( (LA118_0==87) ) {
                        alt118=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 118, 0, input);

                        throw nvae;
                    }
                    switch (alt118) {
                        case 1 :
                            // InternalS.g:5354:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_5);
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
                            // InternalS.g:5369:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_5);
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

                    otherlv_2=(Token)match(input,18,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // InternalS.g:5391:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // InternalS.g:5392:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // InternalS.g:5392:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // InternalS.g:5393:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
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

                    otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalS.g:5415:2: this_ValuedObjectReference_5= ruleValuedObjectReference
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
        }
        return current;
    }
    // $ANTLR end "ruleValuedObjectTestExpression"


    // $ANTLR start "entryRulePrimeID"
    // InternalS.g:5434:1: entryRulePrimeID returns [String current=null] : iv_rulePrimeID= rulePrimeID EOF ;
    public final String entryRulePrimeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimeID = null;


        try {
            // InternalS.g:5435:2: (iv_rulePrimeID= rulePrimeID EOF )
            // InternalS.g:5436:2: iv_rulePrimeID= rulePrimeID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimeIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimeID=rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimeID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimeID"


    // $ANTLR start "rulePrimeID"
    // InternalS.g:5443:1: rulePrimeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '\\'' )* ) ;
    public final AntlrDatatypeRuleToken rulePrimeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // InternalS.g:5446:28: ( (this_ID_0= RULE_ID (kw= '\\'' )* ) )
            // InternalS.g:5447:1: (this_ID_0= RULE_ID (kw= '\\'' )* )
            {
            // InternalS.g:5447:1: (this_ID_0= RULE_ID (kw= '\\'' )* )
            // InternalS.g:5447:6: this_ID_0= RULE_ID (kw= '\\'' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getPrimeIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalS.g:5454:1: (kw= '\\'' )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==63) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // InternalS.g:5455:2: kw= '\\''
            	    {
            	    kw=(Token)match(input,63,FOLLOW_70); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getPrimeIDAccess().getApostropheKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop120;
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
    // $ANTLR end "rulePrimeID"


    // $ANTLR start "entryRuleValuedObjectReference"
    // InternalS.g:5468:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // InternalS.g:5469:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // InternalS.g:5470:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectReference"


    // $ANTLR start "ruleValuedObjectReference"
    // InternalS.g:5477:1: ruleValuedObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_indices_2_0 = null;

        EObject lv_subReference_5_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:5480:28: ( ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) )
            // InternalS.g:5481:1: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            {
            // InternalS.g:5481:1: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            // InternalS.g:5481:2: ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            {
            // InternalS.g:5481:2: ( ( rulePrimeID ) )
            // InternalS.g:5482:1: ( rulePrimeID )
            {
            // InternalS.g:5482:1: ( rulePrimeID )
            // InternalS.g:5483:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_71);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:5499:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==24) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // InternalS.g:5499:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // InternalS.g:5503:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalS.g:5504:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalS.g:5504:1: (lv_indices_2_0= ruleExpression )
            	    // InternalS.g:5505:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_17);
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

            	    otherlv_3=(Token)match(input,25,FOLLOW_71); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);

            // InternalS.g:5525:3: (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==64) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalS.g:5525:5: otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    {
                    otherlv_4=(Token)match(input,64,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectReferenceAccess().getFullStopKeyword_2_0());
                          
                    }
                    // InternalS.g:5529:1: ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    // InternalS.g:5530:1: (lv_subReference_5_0= ruleValuedObjectReference )
                    {
                    // InternalS.g:5530:1: (lv_subReference_5_0= ruleValuedObjectReference )
                    // InternalS.g:5531:3: lv_subReference_5_0= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getSubReferenceValuedObjectReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_subReference_5_0=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectReferenceRule());
                      	        }
                             		set(
                             			current, 
                             			"subReference",
                              		lv_subReference_5_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
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
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleScheduleObjectReference"
    // InternalS.g:5555:1: entryRuleScheduleObjectReference returns [EObject current=null] : iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF ;
    public final EObject entryRuleScheduleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleObjectReference = null;


        try {
            // InternalS.g:5556:2: (iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF )
            // InternalS.g:5557:2: iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScheduleObjectReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScheduleObjectReference=ruleScheduleObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScheduleObjectReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScheduleObjectReference"


    // $ANTLR start "ruleScheduleObjectReference"
    // InternalS.g:5564:1: ruleScheduleObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) ) ;
    public final EObject ruleScheduleObjectReference() throws RecognitionException {
        EObject current = null;

        Token lv_priority_1_0=null;

         enterRule(); 
            
        try {
            // InternalS.g:5567:28: ( ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) ) )
            // InternalS.g:5568:1: ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) )
            {
            // InternalS.g:5568:1: ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) )
            // InternalS.g:5568:2: ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) )
            {
            // InternalS.g:5568:2: ( ( rulePrimeID ) )
            // InternalS.g:5569:1: ( rulePrimeID )
            {
            // InternalS.g:5569:1: ( rulePrimeID )
            // InternalS.g:5570:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getScheduleObjectReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScheduleObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_6);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:5586:2: ( (lv_priority_1_0= RULE_INT ) )
            // InternalS.g:5587:1: (lv_priority_1_0= RULE_INT )
            {
            // InternalS.g:5587:1: (lv_priority_1_0= RULE_INT )
            // InternalS.g:5588:3: lv_priority_1_0= RULE_INT
            {
            lv_priority_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_priority_1_0, grammarAccess.getScheduleObjectReferenceAccess().getPriorityINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getScheduleObjectReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"priority",
                      		lv_priority_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.INT");
              	    
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
    // $ANTLR end "ruleScheduleObjectReference"


    // $ANTLR start "entryRuleReferenceCall"
    // InternalS.g:5612:1: entryRuleReferenceCall returns [EObject current=null] : iv_ruleReferenceCall= ruleReferenceCall EOF ;
    public final EObject entryRuleReferenceCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCall = null;


        try {
            // InternalS.g:5613:2: (iv_ruleReferenceCall= ruleReferenceCall EOF )
            // InternalS.g:5614:2: iv_ruleReferenceCall= ruleReferenceCall EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceCall"


    // $ANTLR start "ruleReferenceCall"
    // InternalS.g:5621:1: ruleReferenceCall returns [EObject current=null] : ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) ;
    public final EObject ruleReferenceCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:5624:28: ( ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) )
            // InternalS.g:5625:1: ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            {
            // InternalS.g:5625:1: ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            // InternalS.g:5625:2: ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            {
            // InternalS.g:5625:2: ( ( rulePrimeID ) )
            // InternalS.g:5626:1: ( rulePrimeID )
            {
            // InternalS.g:5626:1: ( rulePrimeID )
            // InternalS.g:5627:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceCallAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_55);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:5643:2: ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==18) ) {
                alt124=1;
            }
            else if ( (LA124_0==51) ) {
                alt124=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // InternalS.g:5643:3: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    {
                    // InternalS.g:5643:3: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    // InternalS.g:5643:5: otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReferenceCallAccess().getLeftParenthesisKeyword_1_0_0());
                          
                    }
                    // InternalS.g:5647:1: ( (lv_parameters_2_0= ruleParameter ) )
                    // InternalS.g:5648:1: (lv_parameters_2_0= ruleParameter )
                    {
                    // InternalS.g:5648:1: (lv_parameters_2_0= ruleParameter )
                    // InternalS.g:5649:3: lv_parameters_2_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_18);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalS.g:5665:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==28) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // InternalS.g:5665:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_56); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getReferenceCallAccess().getCommaKeyword_1_0_2_0());
                    	          
                    	    }
                    	    // InternalS.g:5669:1: ( (lv_parameters_4_0= ruleParameter ) )
                    	    // InternalS.g:5670:1: (lv_parameters_4_0= ruleParameter )
                    	    {
                    	    // InternalS.g:5670:1: (lv_parameters_4_0= ruleParameter )
                    	    // InternalS.g:5671:3: lv_parameters_4_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_18);
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
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop123;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getReferenceCallAccess().getRightParenthesisKeyword_1_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalS.g:5692:7: otherlv_6= '()'
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleReferenceCall"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalS.g:5704:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalS.g:5705:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalS.g:5706:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalS.g:5713:1: ruleFunctionCall returns [EObject current=null] : ( (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) | (otherlv_8= '<' ( (lv_functionName_9_0= RULE_ID ) ) ( (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' ) | otherlv_15= '()' ) otherlv_16= '>' ) ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_functionName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_functionName_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:5716:28: ( ( (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) | (otherlv_8= '<' ( (lv_functionName_9_0= RULE_ID ) ) ( (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' ) | otherlv_15= '()' ) otherlv_16= '>' ) ) )
            // InternalS.g:5717:1: ( (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) | (otherlv_8= '<' ( (lv_functionName_9_0= RULE_ID ) ) ( (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' ) | otherlv_15= '()' ) otherlv_16= '>' ) )
            {
            // InternalS.g:5717:1: ( (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) | (otherlv_8= '<' ( (lv_functionName_9_0= RULE_ID ) ) ( (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' ) | otherlv_15= '()' ) otherlv_16= '>' ) )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==48) ) {
                alt129=1;
            }
            else if ( (LA129_0==52) ) {
                alt129=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // InternalS.g:5717:2: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
                    {
                    // InternalS.g:5717:2: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
                    // InternalS.g:5717:4: otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
                    {
                    otherlv_0=(Token)match(input,48,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getExternKeyword_0_0());
                          
                    }
                    // InternalS.g:5721:1: ( (lv_functionName_1_0= RULE_ID ) )
                    // InternalS.g:5722:1: (lv_functionName_1_0= RULE_ID )
                    {
                    // InternalS.g:5722:1: (lv_functionName_1_0= RULE_ID )
                    // InternalS.g:5723:3: lv_functionName_1_0= RULE_ID
                    {
                    lv_functionName_1_0=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_functionName_1_0, grammarAccess.getFunctionCallAccess().getFunctionNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionCallRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"functionName",
                              		lv_functionName_1_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    // InternalS.g:5739:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==18) ) {
                        alt126=1;
                    }
                    else if ( (LA126_0==51) ) {
                        alt126=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 126, 0, input);

                        throw nvae;
                    }
                    switch (alt126) {
                        case 1 :
                            // InternalS.g:5739:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                            {
                            // InternalS.g:5739:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                            // InternalS.g:5739:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                            {
                            otherlv_2=(Token)match(input,18,FOLLOW_56); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_0_2_0_0());
                                  
                            }
                            // InternalS.g:5743:1: ( (lv_parameters_3_0= ruleParameter ) )
                            // InternalS.g:5744:1: (lv_parameters_3_0= ruleParameter )
                            {
                            // InternalS.g:5744:1: (lv_parameters_3_0= ruleParameter )
                            // InternalS.g:5745:3: lv_parameters_3_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_0_2_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_18);
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

                            // InternalS.g:5761:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                            loop125:
                            do {
                                int alt125=2;
                                int LA125_0 = input.LA(1);

                                if ( (LA125_0==28) ) {
                                    alt125=1;
                                }


                                switch (alt125) {
                            	case 1 :
                            	    // InternalS.g:5761:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,28,FOLLOW_56); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_0_2_0_2_0());
                            	          
                            	    }
                            	    // InternalS.g:5765:1: ( (lv_parameters_5_0= ruleParameter ) )
                            	    // InternalS.g:5766:1: (lv_parameters_5_0= ruleParameter )
                            	    {
                            	    // InternalS.g:5766:1: (lv_parameters_5_0= ruleParameter )
                            	    // InternalS.g:5767:3: lv_parameters_5_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_0_2_0_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_18);
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
                            	    break loop125;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_0_2_0_3());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalS.g:5788:7: otherlv_7= '()'
                            {
                            otherlv_7=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_0_2_1());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalS.g:5793:6: (otherlv_8= '<' ( (lv_functionName_9_0= RULE_ID ) ) ( (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' ) | otherlv_15= '()' ) otherlv_16= '>' )
                    {
                    // InternalS.g:5793:6: (otherlv_8= '<' ( (lv_functionName_9_0= RULE_ID ) ) ( (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' ) | otherlv_15= '()' ) otherlv_16= '>' )
                    // InternalS.g:5793:8: otherlv_8= '<' ( (lv_functionName_9_0= RULE_ID ) ) ( (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' ) | otherlv_15= '()' ) otherlv_16= '>'
                    {
                    otherlv_8=(Token)match(input,52,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // InternalS.g:5797:1: ( (lv_functionName_9_0= RULE_ID ) )
                    // InternalS.g:5798:1: (lv_functionName_9_0= RULE_ID )
                    {
                    // InternalS.g:5798:1: (lv_functionName_9_0= RULE_ID )
                    // InternalS.g:5799:3: lv_functionName_9_0= RULE_ID
                    {
                    lv_functionName_9_0=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_functionName_9_0, grammarAccess.getFunctionCallAccess().getFunctionNameIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionCallRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"functionName",
                              		lv_functionName_9_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    // InternalS.g:5815:2: ( (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' ) | otherlv_15= '()' )
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==18) ) {
                        alt128=1;
                    }
                    else if ( (LA128_0==51) ) {
                        alt128=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 128, 0, input);

                        throw nvae;
                    }
                    switch (alt128) {
                        case 1 :
                            // InternalS.g:5815:3: (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' )
                            {
                            // InternalS.g:5815:3: (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' )
                            // InternalS.g:5815:5: otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')'
                            {
                            otherlv_10=(Token)match(input,18,FOLLOW_56); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_2_0_0());
                                  
                            }
                            // InternalS.g:5819:1: ( (lv_parameters_11_0= ruleParameter ) )
                            // InternalS.g:5820:1: (lv_parameters_11_0= ruleParameter )
                            {
                            // InternalS.g:5820:1: (lv_parameters_11_0= ruleParameter )
                            // InternalS.g:5821:3: lv_parameters_11_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_1_2_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_18);
                            lv_parameters_11_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameters",
                                      		lv_parameters_11_0, 
                                      		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalS.g:5837:2: (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )*
                            loop127:
                            do {
                                int alt127=2;
                                int LA127_0 = input.LA(1);

                                if ( (LA127_0==28) ) {
                                    alt127=1;
                                }


                                switch (alt127) {
                            	case 1 :
                            	    // InternalS.g:5837:4: otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) )
                            	    {
                            	    otherlv_12=(Token)match(input,28,FOLLOW_56); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_12, grammarAccess.getFunctionCallAccess().getCommaKeyword_1_2_0_2_0());
                            	          
                            	    }
                            	    // InternalS.g:5841:1: ( (lv_parameters_13_0= ruleParameter ) )
                            	    // InternalS.g:5842:1: (lv_parameters_13_0= ruleParameter )
                            	    {
                            	    // InternalS.g:5842:1: (lv_parameters_13_0= ruleParameter )
                            	    // InternalS.g:5843:3: lv_parameters_13_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_1_2_0_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_18);
                            	    lv_parameters_13_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameters",
                            	              		lv_parameters_13_0, 
                            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop127;
                                }
                            } while (true);

                            otherlv_14=(Token)match(input,19,FOLLOW_58); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_14, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_2_0_3());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalS.g:5864:7: otherlv_15= '()'
                            {
                            otherlv_15=(Token)match(input,51,FOLLOW_58); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_15, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_1_2_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getFunctionCallAccess().getGreaterThanSignKeyword_1_3());
                          
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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleParameter"
    // InternalS.g:5880:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalS.g:5881:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalS.g:5882:2: iv_ruleParameter= ruleParameter EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalS.g:5889:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_pureOutput_0_0=null;
        Token lv_callByReference_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:5892:28: ( ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalS.g:5893:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalS.g:5893:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalS.g:5893:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalS.g:5893:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==65) ) {
                int LA131_1 = input.LA(2);

                if ( (LA131_1==57) ) {
                    alt131=1;
                }
            }
            else if ( (LA131_0==57) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalS.g:5893:3: ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) )
                    {
                    // InternalS.g:5893:3: ( (lv_pureOutput_0_0= '!' ) )?
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==65) ) {
                        alt130=1;
                    }
                    switch (alt130) {
                        case 1 :
                            // InternalS.g:5894:1: (lv_pureOutput_0_0= '!' )
                            {
                            // InternalS.g:5894:1: (lv_pureOutput_0_0= '!' )
                            // InternalS.g:5895:3: lv_pureOutput_0_0= '!'
                            {
                            lv_pureOutput_0_0=(Token)match(input,65,FOLLOW_72); if (state.failed) return current;
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

                    // InternalS.g:5908:3: ( (lv_callByReference_1_0= '&' ) )
                    // InternalS.g:5909:1: (lv_callByReference_1_0= '&' )
                    {
                    // InternalS.g:5909:1: (lv_callByReference_1_0= '&' )
                    // InternalS.g:5910:3: lv_callByReference_1_0= '&'
                    {
                    lv_callByReference_1_0=(Token)match(input,57,FOLLOW_16); if (state.failed) return current;
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

            // InternalS.g:5923:4: ( (lv_expression_2_0= ruleExpression ) )
            // InternalS.g:5924:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalS.g:5924:1: (lv_expression_2_0= ruleExpression )
            // InternalS.g:5925:3: lv_expression_2_0= ruleExpression
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
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTextExpression"
    // InternalS.g:5949:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalS.g:5950:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalS.g:5951:2: iv_ruleTextExpression= ruleTextExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // InternalS.g:5958:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // InternalS.g:5961:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // InternalS.g:5962:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // InternalS.g:5962:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // InternalS.g:5963:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // InternalS.g:5963:1: (lv_text_0_0= RULE_HOSTCODE )
            // InternalS.g:5964:3: lv_text_0_0= RULE_HOSTCODE
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
        }
        return current;
    }
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleIntValue"
    // InternalS.g:5988:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalS.g:5989:2: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalS.g:5990:2: iv_ruleIntValue= ruleIntValue EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalS.g:5997:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalS.g:6000:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalS.g:6001:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalS.g:6001:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalS.g:6002:1: (lv_value_0_0= RULE_INT )
            {
            // InternalS.g:6002:1: (lv_value_0_0= RULE_INT )
            // InternalS.g:6003:3: lv_value_0_0= RULE_INT
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
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalS.g:6027:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalS.g:6028:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalS.g:6029:2: iv_ruleFloatValue= ruleFloatValue EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalS.g:6036:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalS.g:6039:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalS.g:6040:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalS.g:6040:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalS.g:6041:1: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalS.g:6041:1: (lv_value_0_0= RULE_FLOAT )
            // InternalS.g:6042:3: lv_value_0_0= RULE_FLOAT
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
        }
        return current;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleBoolValue"
    // InternalS.g:6066:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalS.g:6067:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalS.g:6068:2: iv_ruleBoolValue= ruleBoolValue EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // InternalS.g:6075:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalS.g:6078:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalS.g:6079:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalS.g:6079:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalS.g:6080:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalS.g:6080:1: (lv_value_0_0= RULE_BOOLEAN )
            // InternalS.g:6081:3: lv_value_0_0= RULE_BOOLEAN
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
        }
        return current;
    }
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalS.g:6105:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalS.g:6106:2: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalS.g:6107:2: iv_ruleStringValue= ruleStringValue EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalS.g:6114:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalS.g:6117:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalS.g:6118:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalS.g:6118:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalS.g:6119:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalS.g:6119:1: (lv_value_0_0= RULE_STRING )
            // InternalS.g:6120:3: lv_value_0_0= RULE_STRING
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
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleAnnotation"
    // InternalS.g:6148:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalS.g:6149:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalS.g:6150:2: iv_ruleAnnotation= ruleAnnotation EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalS.g:6157:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyStringValueAnnotation_1 = null;

        EObject this_TypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;


         enterRule(); 
            
        try {
            // InternalS.g:6160:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalS.g:6161:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalS.g:6161:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt132=4;
            alt132 = dfa132.predict(input);
            switch (alt132) {
                case 1 :
                    // InternalS.g:6162:2: this_CommentAnnotation_0= ruleCommentAnnotation
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
                    // InternalS.g:6175:2: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
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
                    // InternalS.g:6188:2: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
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
                    // InternalS.g:6201:2: this_TagAnnotation_3= ruleTagAnnotation
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
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleQuotedStringAnnotation"
    // InternalS.g:6226:1: entryRuleQuotedStringAnnotation returns [EObject current=null] : iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF ;
    public final EObject entryRuleQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedStringAnnotation = null;


        try {
            // InternalS.g:6227:2: (iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF )
            // InternalS.g:6228:2: iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedStringAnnotation"


    // $ANTLR start "ruleQuotedStringAnnotation"
    // InternalS.g:6235:1: ruleQuotedStringAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject ruleQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_QuotedKeyStringValueAnnotation_1 = null;

        EObject this_QuotedTypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;


         enterRule(); 
            
        try {
            // InternalS.g:6238:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalS.g:6239:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalS.g:6239:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt133=4;
            alt133 = dfa133.predict(input);
            switch (alt133) {
                case 1 :
                    // InternalS.g:6240:2: this_CommentAnnotation_0= ruleCommentAnnotation
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
                    // InternalS.g:6253:2: this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation
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
                    // InternalS.g:6266:2: this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation
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
                    // InternalS.g:6279:2: this_TagAnnotation_3= ruleTagAnnotation
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
        }
        return current;
    }
    // $ANTLR end "ruleQuotedStringAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // InternalS.g:6298:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // InternalS.g:6299:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalS.g:6300:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentAnnotation"


    // $ANTLR start "ruleCommentAnnotation"
    // InternalS.g:6307:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // InternalS.g:6310:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalS.g:6311:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalS.g:6311:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalS.g:6312:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalS.g:6312:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalS.g:6313:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
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
        }
        return current;
    }
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleCommentAnnotatonSL"
    // InternalS.g:6337:1: entryRuleCommentAnnotatonSL returns [EObject current=null] : iv_ruleCommentAnnotatonSL= ruleCommentAnnotatonSL EOF ;
    public final EObject entryRuleCommentAnnotatonSL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotatonSL = null;


        try {
            // InternalS.g:6338:2: (iv_ruleCommentAnnotatonSL= ruleCommentAnnotatonSL EOF )
            // InternalS.g:6339:2: iv_ruleCommentAnnotatonSL= ruleCommentAnnotatonSL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotatonSLRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommentAnnotatonSL=ruleCommentAnnotatonSL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotatonSL; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentAnnotatonSL"


    // $ANTLR start "ruleCommentAnnotatonSL"
    // InternalS.g:6346:1: ruleCommentAnnotatonSL returns [EObject current=null] : ( (lv_values_0_0= RULE_SL_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotatonSL() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // InternalS.g:6349:28: ( ( (lv_values_0_0= RULE_SL_COMMENT_ANNOTATION ) ) )
            // InternalS.g:6350:1: ( (lv_values_0_0= RULE_SL_COMMENT_ANNOTATION ) )
            {
            // InternalS.g:6350:1: ( (lv_values_0_0= RULE_SL_COMMENT_ANNOTATION ) )
            // InternalS.g:6351:1: (lv_values_0_0= RULE_SL_COMMENT_ANNOTATION )
            {
            // InternalS.g:6351:1: (lv_values_0_0= RULE_SL_COMMENT_ANNOTATION )
            // InternalS.g:6352:3: lv_values_0_0= RULE_SL_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_SL_COMMENT_ANNOTATION,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_values_0_0, grammarAccess.getCommentAnnotatonSLAccess().getValuesSL_COMMENT_ANNOTATIONTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCommentAnnotatonSLRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"values",
                      		lv_values_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.SL_COMMENT_ANNOTATION");
              	    
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
    // $ANTLR end "ruleCommentAnnotatonSL"


    // $ANTLR start "entryRuleTagAnnotation"
    // InternalS.g:6376:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // InternalS.g:6377:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalS.g:6378:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleTagAnnotation"


    // $ANTLR start "ruleTagAnnotation"
    // InternalS.g:6385:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:6388:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalS.g:6389:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalS.g:6389:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalS.g:6389:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalS.g:6393:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalS.g:6394:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalS.g:6394:1: (lv_name_1_0= ruleExtendedID )
            // InternalS.g:6395:3: lv_name_1_0= ruleExtendedID
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
        }
        return current;
    }
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRulePragmaTag"
    // InternalS.g:6419:1: entryRulePragmaTag returns [EObject current=null] : iv_rulePragmaTag= rulePragmaTag EOF ;
    public final EObject entryRulePragmaTag() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePragmaTag = null;


        try {
            // InternalS.g:6420:2: (iv_rulePragmaTag= rulePragmaTag EOF )
            // InternalS.g:6421:2: iv_rulePragmaTag= rulePragmaTag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPragmaTagRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePragmaTag=rulePragmaTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePragmaTag; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePragmaTag"


    // $ANTLR start "rulePragmaTag"
    // InternalS.g:6428:1: rulePragmaTag returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject rulePragmaTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:6431:28: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalS.g:6432:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalS.g:6432:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalS.g:6432:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0());
                  
            }
            // InternalS.g:6436:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalS.g:6437:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalS.g:6437:1: (lv_name_1_0= ruleExtendedID )
            // InternalS.g:6438:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPragmaTagAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPragmaTagRule());
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
        }
        return current;
    }
    // $ANTLR end "rulePragmaTag"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // InternalS.g:6462:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // InternalS.g:6463:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalS.g:6464:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyStringValueAnnotation"


    // $ANTLR start "ruleKeyStringValueAnnotation"
    // InternalS.g:6471:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:6474:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalS.g:6475:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalS.g:6475:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalS.g:6475:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalS.g:6479:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalS.g:6480:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalS.g:6480:1: (lv_name_1_0= ruleExtendedID )
            // InternalS.g:6481:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_73);
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

            // InternalS.g:6497:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalS.g:6498:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalS.g:6498:1: (lv_values_2_0= ruleEStringAllTypes )
            // InternalS.g:6499:3: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_74);
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
                      		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:6515:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==28) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // InternalS.g:6515:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_73); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalS.g:6519:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalS.g:6520:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalS.g:6520:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalS.g:6521:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_74);
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
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop134;
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
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleRestrictedKeyStringValueAnnotation"
    // InternalS.g:6545:1: entryRuleRestrictedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedKeyStringValueAnnotation = null;


        try {
            // InternalS.g:6546:2: (iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalS.g:6547:2: iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "ruleRestrictedKeyStringValueAnnotation"
    // InternalS.g:6554:1: ruleRestrictedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:6557:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) )
            // InternalS.g:6558:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            {
            // InternalS.g:6558:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            // InternalS.g:6558:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalS.g:6562:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalS.g:6563:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalS.g:6563:1: (lv_name_1_0= ruleExtendedID )
            // InternalS.g:6564:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_75);
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
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:6580:2: ( (lv_values_2_0= ruleEStringBoolean ) )
            // InternalS.g:6581:1: (lv_values_2_0= ruleEStringBoolean )
            {
            // InternalS.g:6581:1: (lv_values_2_0= ruleEStringBoolean )
            // InternalS.g:6582:3: lv_values_2_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_74);
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
                      		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:6598:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==28) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // InternalS.g:6598:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_75); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalS.g:6602:1: ( (lv_values_4_0= ruleEStringBoolean ) )
            	    // InternalS.g:6603:1: (lv_values_4_0= ruleEStringBoolean )
            	    {
            	    // InternalS.g:6603:1: (lv_values_4_0= ruleEStringBoolean )
            	    // InternalS.g:6604:3: lv_values_4_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_74);
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
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop135;
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
    // $ANTLR end "ruleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleStringPragma"
    // InternalS.g:6628:1: entryRuleStringPragma returns [EObject current=null] : iv_ruleStringPragma= ruleStringPragma EOF ;
    public final EObject entryRuleStringPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPragma = null;


        try {
            // InternalS.g:6629:2: (iv_ruleStringPragma= ruleStringPragma EOF )
            // InternalS.g:6630:2: iv_ruleStringPragma= ruleStringPragma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringPragmaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringPragma=ruleStringPragma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringPragma; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringPragma"


    // $ANTLR start "ruleStringPragma"
    // InternalS.g:6637:1: ruleStringPragma returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleStringPragma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:6640:28: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalS.g:6641:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalS.g:6641:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalS.g:6641:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,67,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0());
                  
            }
            // InternalS.g:6645:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalS.g:6646:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalS.g:6646:1: (lv_name_1_0= ruleExtendedID )
            // InternalS.g:6647:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringPragmaAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_73);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStringPragmaRule());
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

            // InternalS.g:6663:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalS.g:6664:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalS.g:6664:1: (lv_values_2_0= ruleEStringAllTypes )
            // InternalS.g:6665:3: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_74);
            lv_values_2_0=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStringPragmaRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:6681:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==28) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // InternalS.g:6681:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_73); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalS.g:6685:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalS.g:6686:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalS.g:6686:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalS.g:6687:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_74);
            	    lv_values_4_0=ruleEStringAllTypes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStringPragmaRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop136;
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
    // $ANTLR end "ruleStringPragma"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalS.g:6711:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // InternalS.g:6712:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalS.g:6713:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleTypedKeyStringValueAnnotation"
    // InternalS.g:6720:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

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
            // InternalS.g:6723:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) )
            // InternalS.g:6724:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalS.g:6724:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            // InternalS.g:6724:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalS.g:6728:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalS.g:6729:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalS.g:6729:1: (lv_name_1_0= ruleExtendedID )
            // InternalS.g:6730:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_76);
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

            otherlv_2=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalS.g:6750:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalS.g:6751:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalS.g:6751:1: (lv_type_3_0= ruleExtendedID )
            // InternalS.g:6752:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,25,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalS.g:6772:1: ( (lv_values_5_0= ruleEStringAllTypes ) )
            // InternalS.g:6773:1: (lv_values_5_0= ruleEStringAllTypes )
            {
            // InternalS.g:6773:1: (lv_values_5_0= ruleEStringAllTypes )
            // InternalS.g:6774:3: lv_values_5_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_74);
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
                      		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:6790:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            loop137:
            do {
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( (LA137_0==28) ) {
                    alt137=1;
                }


                switch (alt137) {
            	case 1 :
            	    // InternalS.g:6790:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_6=(Token)match(input,28,FOLLOW_73); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalS.g:6794:1: ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    // InternalS.g:6795:1: (lv_values_7_0= ruleEStringAllTypes )
            	    {
            	    // InternalS.g:6795:1: (lv_values_7_0= ruleEStringAllTypes )
            	    // InternalS.g:6796:3: lv_values_7_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_74);
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
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop137;
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
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleRestrictedTypedKeyStringValueAnnotation"
    // InternalS.g:6820:1: entryRuleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedTypedKeyStringValueAnnotation = null;


        try {
            // InternalS.g:6821:2: (iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalS.g:6822:2: iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleRestrictedTypedKeyStringValueAnnotation"
    // InternalS.g:6829:1: ruleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

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
            // InternalS.g:6832:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalS.g:6833:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalS.g:6833:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalS.g:6833:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalS.g:6837:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalS.g:6838:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalS.g:6838:1: (lv_name_1_0= ruleExtendedID )
            // InternalS.g:6839:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_76);
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
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalS.g:6859:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalS.g:6860:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalS.g:6860:1: (lv_type_3_0= ruleExtendedID )
            // InternalS.g:6861:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_17);
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
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalS.g:6881:1: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalS.g:6882:1: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalS.g:6882:1: (lv_values_5_0= ruleEStringBoolean )
            // InternalS.g:6883:3: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_74);
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
                      		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalS.g:6899:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( (LA138_0==28) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // InternalS.g:6899:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,28,FOLLOW_75); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalS.g:6903:1: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalS.g:6904:1: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalS.g:6904:1: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalS.g:6905:3: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_74);
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
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop138;
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
    // $ANTLR end "ruleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // InternalS.g:6929:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // InternalS.g:6930:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalS.g:6931:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedKeyStringValueAnnotation"
    // InternalS.g:6938:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalS.g:6941:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalS.g:6942:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalS.g:6942:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalS.g:6942:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalS.g:6946:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalS.g:6947:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalS.g:6947:1: (lv_name_1_0= ruleExtendedID )
            // InternalS.g:6948:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_42);
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

            // InternalS.g:6964:2: ( (lv_values_2_0= RULE_STRING ) )
            // InternalS.g:6965:1: (lv_values_2_0= RULE_STRING )
            {
            // InternalS.g:6965:1: (lv_values_2_0= RULE_STRING )
            // InternalS.g:6966:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_74); if (state.failed) return current;
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

            // InternalS.g:6982:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==28) ) {
                    alt139=1;
                }


                switch (alt139) {
            	case 1 :
            	    // InternalS.g:6982:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_42); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalS.g:6986:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalS.g:6987:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalS.g:6987:1: (lv_values_4_0= RULE_STRING )
            	    // InternalS.g:6988:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_74); if (state.failed) return current;
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
            	    break loop139;
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
    // $ANTLR end "ruleQuotedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedTypedKeyStringValueAnnotation"
    // InternalS.g:7012:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // InternalS.g:7013:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalS.g:7014:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedTypedKeyStringValueAnnotation"
    // InternalS.g:7021:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

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
            // InternalS.g:7024:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalS.g:7025:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalS.g:7025:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalS.g:7025:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalS.g:7029:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalS.g:7030:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalS.g:7030:1: (lv_name_1_0= ruleExtendedID )
            // InternalS.g:7031:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_76);
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

            otherlv_2=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalS.g:7051:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalS.g:7052:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalS.g:7052:1: (lv_type_3_0= ruleExtendedID )
            // InternalS.g:7053:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,25,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalS.g:7073:1: ( (lv_values_5_0= RULE_STRING ) )
            // InternalS.g:7074:1: (lv_values_5_0= RULE_STRING )
            {
            // InternalS.g:7074:1: (lv_values_5_0= RULE_STRING )
            // InternalS.g:7075:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FOLLOW_74); if (state.failed) return current;
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

            // InternalS.g:7091:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop140:
            do {
                int alt140=2;
                int LA140_0 = input.LA(1);

                if ( (LA140_0==28) ) {
                    alt140=1;
                }


                switch (alt140) {
            	case 1 :
            	    // InternalS.g:7091:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,28,FOLLOW_42); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalS.g:7095:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalS.g:7096:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalS.g:7096:1: (lv_values_7_0= RULE_STRING )
            	    // InternalS.g:7097:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FOLLOW_74); if (state.failed) return current;
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
            	    break loop140;
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
    // $ANTLR end "ruleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleEStringBoolean"
    // InternalS.g:7123:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // InternalS.g:7124:2: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalS.g:7125:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleEStringBoolean"


    // $ANTLR start "ruleEStringBoolean"
    // InternalS.g:7132:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalS.g:7135:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalS.g:7136:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalS.g:7136:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt141=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt141=1;
                }
                break;
            case RULE_ID:
                {
                alt141=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt141=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }

            switch (alt141) {
                case 1 :
                    // InternalS.g:7136:6: this_STRING_0= RULE_STRING
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
                    // InternalS.g:7145:5: this_ExtendedID_1= ruleExtendedID
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
                    // InternalS.g:7156:10: this_BOOLEAN_2= RULE_BOOLEAN
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
        }
        return current;
    }
    // $ANTLR end "ruleEStringBoolean"


    // $ANTLR start "entryRuleEStringAllTypes"
    // InternalS.g:7171:1: entryRuleEStringAllTypes returns [String current=null] : iv_ruleEStringAllTypes= ruleEStringAllTypes EOF ;
    public final String entryRuleEStringAllTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringAllTypes = null;


        try {
            // InternalS.g:7172:2: (iv_ruleEStringAllTypes= ruleEStringAllTypes EOF )
            // InternalS.g:7173:2: iv_ruleEStringAllTypes= ruleEStringAllTypes EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleEStringAllTypes"


    // $ANTLR start "ruleEStringAllTypes"
    // InternalS.g:7180:1: ruleEStringAllTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) ;
    public final AntlrDatatypeRuleToken ruleEStringAllTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;

        AntlrDatatypeRuleToken this_Integer_3 = null;

        AntlrDatatypeRuleToken this_Floateger_4 = null;


         enterRule(); 
            
        try {
            // InternalS.g:7183:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) )
            // InternalS.g:7184:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            {
            // InternalS.g:7184:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            int alt142=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt142=1;
                }
                break;
            case RULE_ID:
                {
                alt142=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt142=3;
                }
                break;
            case 59:
                {
                int LA142_4 = input.LA(2);

                if ( (LA142_4==RULE_INT) ) {
                    alt142=4;
                }
                else if ( (LA142_4==RULE_FLOAT) ) {
                    alt142=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 142, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt142=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt142=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }

            switch (alt142) {
                case 1 :
                    // InternalS.g:7184:6: this_STRING_0= RULE_STRING
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
                    // InternalS.g:7193:5: this_ExtendedID_1= ruleExtendedID
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
                    // InternalS.g:7204:10: this_BOOLEAN_2= RULE_BOOLEAN
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
                    // InternalS.g:7213:5: this_Integer_3= ruleInteger
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
                    // InternalS.g:7225:5: this_Floateger_4= ruleFloateger
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
        }
        return current;
    }
    // $ANTLR end "ruleEStringAllTypes"


    // $ANTLR start "entryRuleExtendedID"
    // InternalS.g:7243:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // InternalS.g:7244:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalS.g:7245:2: iv_ruleExtendedID= ruleExtendedID EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // InternalS.g:7252:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' | (kw= '-' this_ID_3= RULE_ID ) )* (kw= '#' this_INT_5= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_INT_5=null;

         enterRule(); 
            
        try {
            // InternalS.g:7255:28: ( (this_ID_0= RULE_ID (kw= '.' | (kw= '-' this_ID_3= RULE_ID ) )* (kw= '#' this_INT_5= RULE_INT )? ) )
            // InternalS.g:7256:1: (this_ID_0= RULE_ID (kw= '.' | (kw= '-' this_ID_3= RULE_ID ) )* (kw= '#' this_INT_5= RULE_INT )? )
            {
            // InternalS.g:7256:1: (this_ID_0= RULE_ID (kw= '.' | (kw= '-' this_ID_3= RULE_ID ) )* (kw= '#' this_INT_5= RULE_INT )? )
            // InternalS.g:7256:6: this_ID_0= RULE_ID (kw= '.' | (kw= '-' this_ID_3= RULE_ID ) )* (kw= '#' this_INT_5= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalS.g:7263:1: (kw= '.' | (kw= '-' this_ID_3= RULE_ID ) )*
            loop143:
            do {
                int alt143=3;
                int LA143_0 = input.LA(1);

                if ( (LA143_0==59) ) {
                    int LA143_2 = input.LA(2);

                    if ( (LA143_2==RULE_ID) ) {
                        alt143=2;
                    }


                }
                else if ( (LA143_0==64) ) {
                    alt143=1;
                }


                switch (alt143) {
            	case 1 :
            	    // InternalS.g:7264:2: kw= '.'
            	    {
            	    kw=(Token)match(input,64,FOLLOW_77); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalS.g:7270:6: (kw= '-' this_ID_3= RULE_ID )
            	    {
            	    // InternalS.g:7270:6: (kw= '-' this_ID_3= RULE_ID )
            	    // InternalS.g:7271:2: kw= '-' this_ID_3= RULE_ID
            	    {
            	    kw=(Token)match(input,59,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_1_0()); 
            	          
            	    }
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_77); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_3, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1_1()); 
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop143;
                }
            } while (true);

            // InternalS.g:7283:4: (kw= '#' this_INT_5= RULE_INT )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==67) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalS.g:7284:2: kw= '#' this_INT_5= RULE_INT
                    {
                    kw=(Token)match(input,67,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
                          
                    }
                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_5, grammarAccess.getExtendedIDAccess().getINTTerminalRuleCall_2_1()); 
                          
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
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleInteger"
    // InternalS.g:7306:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalS.g:7307:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalS.g:7308:2: iv_ruleInteger= ruleInteger EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalS.g:7315:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalS.g:7318:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalS.g:7319:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalS.g:7319:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalS.g:7319:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalS.g:7319:2: (kw= '-' )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==59) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalS.g:7320:2: kw= '-'
                    {
                    kw=(Token)match(input,59,FOLLOW_6); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleFloateger"
    // InternalS.g:7340:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // InternalS.g:7341:2: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalS.g:7342:2: iv_ruleFloateger= ruleFloateger EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleFloateger"


    // $ANTLR start "ruleFloateger"
    // InternalS.g:7349:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // InternalS.g:7352:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalS.g:7353:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalS.g:7353:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalS.g:7353:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalS.g:7353:2: (kw= '-' )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==59) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalS.g:7354:2: kw= '-'
                    {
                    kw=(Token)match(input,59,FOLLOW_78); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleFloateger"


    // $ANTLR start "ruleSchedulePriorityType"
    // InternalS.g:7374:1: ruleSchedulePriorityType returns [Enumerator current=null] : ( (enumLiteral_0= 'conflict' ) | (enumLiteral_1= 'confluent' ) ) ;
    public final Enumerator ruleSchedulePriorityType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalS.g:7376:28: ( ( (enumLiteral_0= 'conflict' ) | (enumLiteral_1= 'confluent' ) ) )
            // InternalS.g:7377:1: ( (enumLiteral_0= 'conflict' ) | (enumLiteral_1= 'confluent' ) )
            {
            // InternalS.g:7377:1: ( (enumLiteral_0= 'conflict' ) | (enumLiteral_1= 'confluent' ) )
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==68) ) {
                alt147=1;
            }
            else if ( (LA147_0==69) ) {
                alt147=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }
            switch (alt147) {
                case 1 :
                    // InternalS.g:7377:2: (enumLiteral_0= 'conflict' )
                    {
                    // InternalS.g:7377:2: (enumLiteral_0= 'conflict' )
                    // InternalS.g:7377:4: enumLiteral_0= 'conflict'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSchedulePriorityTypeAccess().getCONFLICTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSchedulePriorityTypeAccess().getCONFLICTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalS.g:7383:6: (enumLiteral_1= 'confluent' )
                    {
                    // InternalS.g:7383:6: (enumLiteral_1= 'confluent' )
                    // InternalS.g:7383:8: enumLiteral_1= 'confluent'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSchedulePriorityTypeAccess().getCONFLUENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSchedulePriorityTypeAccess().getCONFLUENTEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleSchedulePriorityType"


    // $ANTLR start "ruleAssignOperator"
    // InternalS.g:7393:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= 'min=' ) | (enumLiteral_10= 'max=' ) ) ;
    public final Enumerator ruleAssignOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;

         enterRule(); 
        try {
            // InternalS.g:7395:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= 'min=' ) | (enumLiteral_10= 'max=' ) ) )
            // InternalS.g:7396:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= 'min=' ) | (enumLiteral_10= 'max=' ) )
            {
            // InternalS.g:7396:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= 'min=' ) | (enumLiteral_10= 'max=' ) )
            int alt148=11;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt148=1;
                }
                break;
            case 70:
                {
                alt148=2;
                }
                break;
            case 71:
                {
                alt148=3;
                }
                break;
            case 72:
                {
                alt148=4;
                }
                break;
            case 73:
                {
                alt148=5;
                }
                break;
            case 74:
                {
                alt148=6;
                }
                break;
            case 75:
                {
                alt148=7;
                }
                break;
            case 76:
                {
                alt148=8;
                }
                break;
            case 77:
                {
                alt148=9;
                }
                break;
            case 78:
                {
                alt148=10;
                }
                break;
            case 79:
                {
                alt148=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 148, 0, input);

                throw nvae;
            }

            switch (alt148) {
                case 1 :
                    // InternalS.g:7396:2: (enumLiteral_0= '=' )
                    {
                    // InternalS.g:7396:2: (enumLiteral_0= '=' )
                    // InternalS.g:7396:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalS.g:7402:6: (enumLiteral_1= '+=' )
                    {
                    // InternalS.g:7402:6: (enumLiteral_1= '+=' )
                    // InternalS.g:7402:8: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalS.g:7408:6: (enumLiteral_2= '-=' )
                    {
                    // InternalS.g:7408:6: (enumLiteral_2= '-=' )
                    // InternalS.g:7408:8: enumLiteral_2= '-='
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalS.g:7414:6: (enumLiteral_3= '*=' )
                    {
                    // InternalS.g:7414:6: (enumLiteral_3= '*=' )
                    // InternalS.g:7414:8: enumLiteral_3= '*='
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalS.g:7420:6: (enumLiteral_4= '/=' )
                    {
                    // InternalS.g:7420:6: (enumLiteral_4= '/=' )
                    // InternalS.g:7420:8: enumLiteral_4= '/='
                    {
                    enumLiteral_4=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalS.g:7426:6: (enumLiteral_5= '%=' )
                    {
                    // InternalS.g:7426:6: (enumLiteral_5= '%=' )
                    // InternalS.g:7426:8: enumLiteral_5= '%='
                    {
                    enumLiteral_5=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMODEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignOperatorAccess().getASSIGNMODEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalS.g:7432:6: (enumLiteral_6= '&=' )
                    {
                    // InternalS.g:7432:6: (enumLiteral_6= '&=' )
                    // InternalS.g:7432:8: enumLiteral_6= '&='
                    {
                    enumLiteral_6=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignOperatorAccess().getASSIGNANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalS.g:7438:6: (enumLiteral_7= '|=' )
                    {
                    // InternalS.g:7438:6: (enumLiteral_7= '|=' )
                    // InternalS.g:7438:8: enumLiteral_7= '|='
                    {
                    enumLiteral_7=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNOREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignOperatorAccess().getASSIGNOREnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalS.g:7444:6: (enumLiteral_8= '^=' )
                    {
                    // InternalS.g:7444:6: (enumLiteral_8= '^=' )
                    // InternalS.g:7444:8: enumLiteral_8= '^='
                    {
                    enumLiteral_8=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNXOREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignOperatorAccess().getASSIGNXOREnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalS.g:7450:6: (enumLiteral_9= 'min=' )
                    {
                    // InternalS.g:7450:6: (enumLiteral_9= 'min=' )
                    // InternalS.g:7450:8: enumLiteral_9= 'min='
                    {
                    enumLiteral_9=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMINEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignOperatorAccess().getASSIGNMINEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalS.g:7456:6: (enumLiteral_10= 'max=' )
                    {
                    // InternalS.g:7456:6: (enumLiteral_10= 'max=' )
                    // InternalS.g:7456:8: enumLiteral_10= 'max='
                    {
                    enumLiteral_10=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMAXEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getAssignOperatorAccess().getASSIGNMAXEnumLiteralDeclaration_10()); 
                          
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
    // $ANTLR end "ruleAssignOperator"


    // $ANTLR start "rulePostfixOperator"
    // InternalS.g:7466:1: rulePostfixOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator rulePostfixOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalS.g:7468:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalS.g:7469:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalS.g:7469:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==80) ) {
                alt149=1;
            }
            else if ( (LA149_0==81) ) {
                alt149=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }
            switch (alt149) {
                case 1 :
                    // InternalS.g:7469:2: (enumLiteral_0= '++' )
                    {
                    // InternalS.g:7469:2: (enumLiteral_0= '++' )
                    // InternalS.g:7469:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalS.g:7475:6: (enumLiteral_1= '--' )
                    {
                    // InternalS.g:7475:6: (enumLiteral_1= '--' )
                    // InternalS.g:7475:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "rulePostfixOperator"


    // $ANTLR start "ruleCompareOperator"
    // InternalS.g:7485:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // InternalS.g:7487:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalS.g:7488:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalS.g:7488:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt150=6;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt150=1;
                }
                break;
            case 52:
                {
                alt150=2;
                }
                break;
            case 83:
                {
                alt150=3;
                }
                break;
            case 53:
                {
                alt150=4;
                }
                break;
            case 84:
                {
                alt150=5;
                }
                break;
            case 85:
                {
                alt150=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 150, 0, input);

                throw nvae;
            }

            switch (alt150) {
                case 1 :
                    // InternalS.g:7488:2: (enumLiteral_0= '==' )
                    {
                    // InternalS.g:7488:2: (enumLiteral_0= '==' )
                    // InternalS.g:7488:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalS.g:7494:6: (enumLiteral_1= '<' )
                    {
                    // InternalS.g:7494:6: (enumLiteral_1= '<' )
                    // InternalS.g:7494:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalS.g:7500:6: (enumLiteral_2= '<=' )
                    {
                    // InternalS.g:7500:6: (enumLiteral_2= '<=' )
                    // InternalS.g:7500:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalS.g:7506:6: (enumLiteral_3= '>' )
                    {
                    // InternalS.g:7506:6: (enumLiteral_3= '>' )
                    // InternalS.g:7506:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalS.g:7512:6: (enumLiteral_4= '>=' )
                    {
                    // InternalS.g:7512:6: (enumLiteral_4= '>=' )
                    // InternalS.g:7512:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalS.g:7518:6: (enumLiteral_5= '!=' )
                    {
                    // InternalS.g:7518:6: (enumLiteral_5= '!=' )
                    // InternalS.g:7518:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
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
    // InternalS.g:7528:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalS.g:7530:28: ( (enumLiteral_0= 'pre' ) )
            // InternalS.g:7531:1: (enumLiteral_0= 'pre' )
            {
            // InternalS.g:7531:1: (enumLiteral_0= 'pre' )
            // InternalS.g:7531:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleBitwiseOrOperator"
    // InternalS.g:7541:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalS.g:7543:28: ( (enumLiteral_0= '|' ) )
            // InternalS.g:7544:1: (enumLiteral_0= '|' )
            {
            // InternalS.g:7544:1: (enumLiteral_0= '|' )
            // InternalS.g:7544:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseOrOperator"


    // $ANTLR start "ruleBitwiseAndOperator"
    // InternalS.g:7554:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalS.g:7556:28: ( (enumLiteral_0= '&' ) )
            // InternalS.g:7557:1: (enumLiteral_0= '&' )
            {
            // InternalS.g:7557:1: (enumLiteral_0= '&' )
            // InternalS.g:7557:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseAndOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalS.g:7567:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalS.g:7569:28: ( (enumLiteral_0= '!' ) )
            // InternalS.g:7570:1: (enumLiteral_0= '!' )
            {
            // InternalS.g:7570:1: (enumLiteral_0= '!' )
            // InternalS.g:7570:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
    // InternalS.g:7580:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalS.g:7582:28: ( (enumLiteral_0= '+' ) )
            // InternalS.g:7583:1: (enumLiteral_0= '+' )
            {
            // InternalS.g:7583:1: (enumLiteral_0= '+' )
            // InternalS.g:7583:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
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
    // InternalS.g:7593:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalS.g:7595:28: ( (enumLiteral_0= '-' ) )
            // InternalS.g:7596:1: (enumLiteral_0= '-' )
            {
            // InternalS.g:7596:1: (enumLiteral_0= '-' )
            // InternalS.g:7596:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
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
    // InternalS.g:7606:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalS.g:7608:28: ( (enumLiteral_0= '*' ) )
            // InternalS.g:7609:1: (enumLiteral_0= '*' )
            {
            // InternalS.g:7609:1: (enumLiteral_0= '*' )
            // InternalS.g:7609:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
    // InternalS.g:7619:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalS.g:7621:28: ( (enumLiteral_0= '%' ) )
            // InternalS.g:7622:1: (enumLiteral_0= '%' )
            {
            // InternalS.g:7622:1: (enumLiteral_0= '%' )
            // InternalS.g:7622:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleDivOperator"
    // InternalS.g:7632:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalS.g:7634:28: ( (enumLiteral_0= '/' ) )
            // InternalS.g:7635:1: (enumLiteral_0= '/' )
            {
            // InternalS.g:7635:1: (enumLiteral_0= '/' )
            // InternalS.g:7635:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleValOperator"
    // InternalS.g:7645:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalS.g:7647:28: ( (enumLiteral_0= 'val' ) )
            // InternalS.g:7648:1: (enumLiteral_0= 'val' )
            {
            // InternalS.g:7648:1: (enumLiteral_0= 'val' )
            // InternalS.g:7648:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
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
    // InternalS.g:7658:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalS.g:7660:28: ( (enumLiteral_0= '||' ) )
            // InternalS.g:7661:1: (enumLiteral_0= '||' )
            {
            // InternalS.g:7661:1: (enumLiteral_0= '||' )
            // InternalS.g:7661:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // InternalS.g:7671:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalS.g:7673:28: ( (enumLiteral_0= '&&' ) )
            // InternalS.g:7674:1: (enumLiteral_0= '&&' )
            {
            // InternalS.g:7674:1: (enumLiteral_0= '&&' )
            // InternalS.g:7674:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleValueType"
    // InternalS.g:7688:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) ;
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
            // InternalS.g:7690:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) )
            // InternalS.g:7691:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            {
            // InternalS.g:7691:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            int alt151=7;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt151=1;
                }
                break;
            case 89:
                {
                alt151=2;
                }
                break;
            case 90:
                {
                alt151=3;
                }
                break;
            case 91:
                {
                alt151=4;
                }
                break;
            case 92:
                {
                alt151=5;
                }
                break;
            case 93:
                {
                alt151=6;
                }
                break;
            case 94:
                {
                alt151=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;
            }

            switch (alt151) {
                case 1 :
                    // InternalS.g:7691:2: (enumLiteral_0= 'pure' )
                    {
                    // InternalS.g:7691:2: (enumLiteral_0= 'pure' )
                    // InternalS.g:7691:4: enumLiteral_0= 'pure'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalS.g:7697:6: (enumLiteral_1= 'bool' )
                    {
                    // InternalS.g:7697:6: (enumLiteral_1= 'bool' )
                    // InternalS.g:7697:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalS.g:7703:6: (enumLiteral_2= 'unsigned' )
                    {
                    // InternalS.g:7703:6: (enumLiteral_2= 'unsigned' )
                    // InternalS.g:7703:8: enumLiteral_2= 'unsigned'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalS.g:7709:6: (enumLiteral_3= 'int' )
                    {
                    // InternalS.g:7709:6: (enumLiteral_3= 'int' )
                    // InternalS.g:7709:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalS.g:7715:6: (enumLiteral_4= 'float' )
                    {
                    // InternalS.g:7715:6: (enumLiteral_4= 'float' )
                    // InternalS.g:7715:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalS.g:7721:6: (enumLiteral_5= 'string' )
                    {
                    // InternalS.g:7721:6: (enumLiteral_5= 'string' )
                    // InternalS.g:7721:8: enumLiteral_5= 'string'
                    {
                    enumLiteral_5=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalS.g:7727:6: (enumLiteral_6= 'host' )
                    {
                    // InternalS.g:7727:6: (enumLiteral_6= 'host' )
                    // InternalS.g:7727:8: enumLiteral_6= 'host'
                    {
                    enumLiteral_6=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
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
    // InternalS.g:7739:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
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
            // InternalS.g:7741:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // InternalS.g:7742:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // InternalS.g:7742:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt152=8;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt152=1;
                }
                break;
            case 58:
                {
                alt152=2;
                }
                break;
            case 60:
                {
                alt152=3;
                }
                break;
            case 96:
                {
                alt152=4;
                }
                break;
            case 97:
                {
                alt152=5;
                }
                break;
            case 56:
                {
                alt152=6;
                }
                break;
            case 57:
                {
                alt152=7;
                }
                break;
            case 94:
                {
                alt152=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;
            }

            switch (alt152) {
                case 1 :
                    // InternalS.g:7742:2: (enumLiteral_0= 'none' )
                    {
                    // InternalS.g:7742:2: (enumLiteral_0= 'none' )
                    // InternalS.g:7742:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalS.g:7748:6: (enumLiteral_1= '+' )
                    {
                    // InternalS.g:7748:6: (enumLiteral_1= '+' )
                    // InternalS.g:7748:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalS.g:7754:6: (enumLiteral_2= '*' )
                    {
                    // InternalS.g:7754:6: (enumLiteral_2= '*' )
                    // InternalS.g:7754:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalS.g:7760:6: (enumLiteral_3= 'max' )
                    {
                    // InternalS.g:7760:6: (enumLiteral_3= 'max' )
                    // InternalS.g:7760:8: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalS.g:7766:6: (enumLiteral_4= 'min' )
                    {
                    // InternalS.g:7766:6: (enumLiteral_4= 'min' )
                    // InternalS.g:7766:8: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalS.g:7772:6: (enumLiteral_5= '|' )
                    {
                    // InternalS.g:7772:6: (enumLiteral_5= '|' )
                    // InternalS.g:7772:8: enumLiteral_5= '|'
                    {
                    enumLiteral_5=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalS.g:7778:6: (enumLiteral_6= '&' )
                    {
                    // InternalS.g:7778:6: (enumLiteral_6= '&' )
                    // InternalS.g:7778:8: enumLiteral_6= '&'
                    {
                    enumLiteral_6=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalS.g:7784:6: (enumLiteral_7= 'host' )
                    {
                    // InternalS.g:7784:6: (enumLiteral_7= 'host' )
                    // InternalS.g:7784:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred40_InternalS
    public final void synpred40_InternalS_fragment() throws RecognitionException {   
        EObject lv_expression_0_0 = null;


        // InternalS.g:1705:2: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) )
        // InternalS.g:1705:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
        {
        // InternalS.g:1705:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
        // InternalS.g:1706:1: (lv_expression_0_0= ruleAnnotatedExpression )
        {
        // InternalS.g:1706:1: (lv_expression_0_0= ruleAnnotatedExpression )
        // InternalS.g:1707:3: lv_expression_0_0= ruleAnnotatedExpression
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
    // $ANTLR end synpred40_InternalS

    // $ANTLR start synpred85_InternalS
    public final void synpred85_InternalS_fragment() throws RecognitionException {   
        EObject this_Assignment_0 = null;


        // InternalS.g:3137:2: (this_Assignment_0= ruleAssignment )
        // InternalS.g:3137:2: this_Assignment_0= ruleAssignment
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
    // $ANTLR end synpred85_InternalS

    // $ANTLR start synpred86_InternalS
    public final void synpred86_InternalS_fragment() throws RecognitionException {   
        EObject this_PostfixEffect_1 = null;


        // InternalS.g:3150:2: (this_PostfixEffect_1= rulePostfixEffect )
        // InternalS.g:3150:2: this_PostfixEffect_1= rulePostfixEffect
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
    // $ANTLR end synpred86_InternalS

    // $ANTLR start synpred87_InternalS
    public final void synpred87_InternalS_fragment() throws RecognitionException {   
        EObject this_Emission_2 = null;


        // InternalS.g:3163:2: (this_Emission_2= ruleEmission )
        // InternalS.g:3163:2: this_Emission_2= ruleEmission
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
    // $ANTLR end synpred87_InternalS

    // $ANTLR start synpred88_InternalS
    public final void synpred88_InternalS_fragment() throws RecognitionException {   
        EObject this_HostcodeEffect_3 = null;


        // InternalS.g:3176:2: (this_HostcodeEffect_3= ruleHostcodeEffect )
        // InternalS.g:3176:2: this_HostcodeEffect_3= ruleHostcodeEffect
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
    // $ANTLR end synpred88_InternalS

    // $ANTLR start synpred89_InternalS
    public final void synpred89_InternalS_fragment() throws RecognitionException {   
        EObject this_ReferenceCallEffect_4 = null;


        // InternalS.g:3189:2: (this_ReferenceCallEffect_4= ruleReferenceCallEffect )
        // InternalS.g:3189:2: this_ReferenceCallEffect_4= ruleReferenceCallEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_ReferenceCallEffect_4=ruleReferenceCallEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred89_InternalS

    // $ANTLR start synpred108_InternalS
    public final void synpred108_InternalS_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalS.g:3828:2: (this_BoolExpression_0= ruleBoolExpression )
        // InternalS.g:3828:2: this_BoolExpression_0= ruleBoolExpression
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
    // $ANTLR end synpred108_InternalS

    // $ANTLR start synpred119_InternalS
    public final void synpred119_InternalS_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


        // InternalS.g:4340:2: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
        // InternalS.g:4340:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        {
        // InternalS.g:4340:2: ()
        // InternalS.g:4341:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // InternalS.g:4349:2: ( (lv_operator_2_0= ruleCompareOperator ) )
        // InternalS.g:4350:1: (lv_operator_2_0= ruleCompareOperator )
        {
        // InternalS.g:4350:1: (lv_operator_2_0= ruleCompareOperator )
        // InternalS.g:4351:3: lv_operator_2_0= ruleCompareOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_16);
        lv_operator_2_0=ruleCompareOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalS.g:4367:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        // InternalS.g:4368:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        {
        // InternalS.g:4368:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        // InternalS.g:4369:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_subExpressions_3_0=ruleNotOrValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred119_InternalS

    // $ANTLR start synpred120_InternalS
    public final void synpred120_InternalS_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // InternalS.g:4407:2: (this_ValuedExpression_0= ruleValuedExpression )
        // InternalS.g:4407:2: this_ValuedExpression_0= ruleValuedExpression
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
    // $ANTLR end synpred120_InternalS

    // $ANTLR start synpred141_InternalS
    public final void synpred141_InternalS_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // InternalS.g:5288:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // InternalS.g:5288:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // InternalS.g:5288:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // InternalS.g:5288:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,18,FOLLOW_65); if (state.failed) return ;
        pushFollow(FOLLOW_7);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred141_InternalS

    // Delegated rules

    public final boolean synpred88_InternalS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_InternalS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred120_InternalS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred120_InternalS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred119_InternalS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_InternalS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_InternalS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_InternalS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred141_InternalS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred141_InternalS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred108_InternalS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_InternalS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_InternalS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_InternalS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA91 dfa91 = new DFA91(this);
    protected DFA92 dfa92 = new DFA92(this);
    protected DFA102 dfa102 = new DFA102(this);
    protected DFA103 dfa103 = new DFA103(this);
    protected DFA116 dfa116 = new DFA116(this);
    protected DFA117 dfa117 = new DFA117(this);
    protected DFA132 dfa132 = new DFA132(this);
    protected DFA133 dfa133 = new DFA133(this);
    static final String dfa_1s = "\101\uffff";
    static final String dfa_2s = "\1\6\1\uffff\1\12\1\4\1\uffff\3\4\1\5\1\4\5\12\2\4\1\31\1\4\1\12\1\4\2\5\1\31\1\4\1\5\1\4\3\12\1\5\4\12\2\31\3\12\1\5\3\12\1\4\1\5\1\4\1\12\1\4\1\5\5\12\1\5\5\12\1\4\1\5\2\12";
    static final String dfa_3s = "\1\136\1\uffff\1\136\1\4\1\uffff\2\136\1\10\1\5\1\4\7\136\1\103\1\73\1\136\1\4\1\5\1\10\1\103\1\4\1\5\1\73\3\136\1\10\4\136\1\103\1\31\3\136\1\10\3\136\1\4\1\5\1\73\1\136\1\4\1\5\5\136\1\10\5\136\1\4\1\5\2\136";
    static final String dfa_4s = "\1\uffff\1\2\2\uffff\1\1\74\uffff";
    static final String dfa_5s = "\101\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\3\uffff\1\2\11\uffff\1\1\16\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "",
            "\1\2\11\uffff\1\1\16\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\5",
            "",
            "\1\13\1\15\1\uffff\1\12\1\16\1\14\1\2\11\uffff\1\1\3\uffff\1\11\12\uffff\1\4\6\uffff\4\4\1\uffff\3\4\11\uffff\1\7\4\uffff\1\6\1\uffff\1\3\1\10\24\uffff\7\4",
            "\1\13\1\15\1\uffff\1\12\1\16\1\14\1\2\11\uffff\1\1\3\uffff\1\11\12\uffff\1\4\6\uffff\4\4\1\uffff\3\4\11\uffff\1\7\4\uffff\1\6\1\uffff\1\3\1\10\24\uffff\7\4",
            "\1\17\1\15\2\uffff\1\16",
            "\1\20",
            "\1\21",
            "\1\2\11\uffff\1\1\7\uffff\1\22\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\22\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\11\uffff\1\24\4\uffff\1\23\1\uffff\1\3\1\25\24\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\22\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\22\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\22\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\13\1\15\1\uffff\1\12\1\16\1\14\1\2\11\uffff\1\1\3\uffff\1\11\12\uffff\1\4\6\uffff\4\4\1\uffff\3\4\11\uffff\1\7\4\uffff\1\6\1\uffff\1\3\1\10\24\uffff\7\4",
            "\1\13\1\15\1\uffff\1\12\1\16\1\14\1\2\11\uffff\1\1\3\uffff\1\11\12\uffff\1\4\6\uffff\4\4\1\uffff\3\4\11\uffff\1\26\6\uffff\1\3\25\uffff\7\4",
            "\1\32\41\uffff\1\30\4\uffff\1\27\2\uffff\1\31",
            "\1\34\1\37\1\uffff\1\33\1\40\1\35\61\uffff\1\36",
            "\1\2\11\uffff\1\1\7\uffff\1\22\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\11\uffff\1\24\4\uffff\1\23\1\uffff\1\3\1\25\24\uffff\7\4",
            "\1\41",
            "\1\42",
            "\1\15\2\uffff\1\16",
            "\1\32\41\uffff\1\30\4\uffff\1\27\2\uffff\1\31",
            "\1\43",
            "\1\44",
            "\1\46\1\51\1\uffff\1\45\1\52\1\47\61\uffff\1\50",
            "\1\2\11\uffff\1\1\7\uffff\1\22\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\22\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\11\uffff\1\54\4\uffff\1\53\1\uffff\1\3\1\55\24\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\22\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\37\2\uffff\1\40",
            "\1\2\11\uffff\1\1\7\uffff\1\22\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\22\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\22\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\11\uffff\1\24\4\uffff\1\23\1\uffff\1\3\1\25\24\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\22\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\32\41\uffff\1\30\4\uffff\1\27\2\uffff\1\31",
            "\1\32",
            "\1\2\11\uffff\1\1\7\uffff\1\56\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\56\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\11\uffff\1\60\4\uffff\1\57\1\uffff\1\3\1\61\24\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\56\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\51\2\uffff\1\52",
            "\1\2\11\uffff\1\1\7\uffff\1\56\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\56\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\22\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\11\uffff\1\54\4\uffff\1\53\1\uffff\1\3\1\55\24\uffff\7\4",
            "\1\62",
            "\1\63",
            "\1\65\1\70\1\uffff\1\64\1\71\1\66\61\uffff\1\67",
            "\1\2\11\uffff\1\1\7\uffff\1\56\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\11\uffff\1\60\4\uffff\1\57\1\uffff\1\3\1\61\24\uffff\7\4",
            "\1\72",
            "\1\73",
            "\1\2\11\uffff\1\1\7\uffff\1\22\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\11\uffff\1\54\4\uffff\1\53\1\uffff\1\3\1\55\24\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\22\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\56\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\56\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\11\uffff\1\75\4\uffff\1\74\1\uffff\1\3\1\76\24\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\56\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\70\2\uffff\1\71",
            "\1\2\11\uffff\1\1\7\uffff\1\56\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\56\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\56\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\11\uffff\1\60\4\uffff\1\57\1\uffff\1\3\1\61\24\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\56\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\56\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\11\uffff\1\75\4\uffff\1\74\1\uffff\1\3\1\76\24\uffff\7\4",
            "\1\77",
            "\1\100",
            "\1\2\11\uffff\1\1\7\uffff\1\56\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\11\uffff\1\75\4\uffff\1\74\1\uffff\1\3\1\76\24\uffff\7\4",
            "\1\2\11\uffff\1\1\7\uffff\1\56\6\uffff\1\4\6\uffff\4\4\1\uffff\3\4\20\uffff\1\3\25\uffff\7\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 153:1: ( (lv_declarations_6_0= ruleDeclaration ) )*";
        }
    }
    static final String dfa_7s = "\134\uffff";
    static final String dfa_8s = "\1\3\13\uffff\1\3\117\uffff";
    static final String dfa_9s = "\3\4\1\uffff\1\4\1\uffff\3\4\1\5\10\4\1\31\3\4\1\5\4\4\1\5\1\31\1\4\1\5\4\4\1\5\7\4\2\31\3\4\1\5\4\4\1\5\3\4\1\5\6\4\1\5\5\4\1\31\3\4\1\5\5\4\1\31\1\4\1\5\3\4\1\5\2\31\3\4";
    static final String dfa_10s = "\2\136\1\4\1\uffff\1\7\1\uffff\2\136\1\10\1\5\1\4\7\136\1\103\1\73\1\136\1\4\1\5\1\73\1\4\1\136\1\4\1\10\1\103\1\4\1\5\1\73\3\136\1\10\5\136\1\105\1\136\1\103\1\31\3\136\1\10\3\136\1\4\1\5\1\105\1\136\1\10\1\5\1\4\2\136\1\73\1\136\1\4\1\5\1\73\4\136\1\103\3\136\1\10\5\136\1\103\1\4\1\5\1\73\1\136\1\4\1\5\1\103\1\31\3\136";
    static final String dfa_11s = "\3\uffff\1\2\1\uffff\1\1\126\uffff";
    static final String dfa_12s = "\134\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\1\uffff\1\3\3\uffff\1\1\30\uffff\1\5\4\uffff\2\3\4\5\1\uffff\1\5\1\4\1\5\2\uffff\1\3\15\uffff\1\2\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\1\30\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\2\25\uffff\7\5",
            "\1\6",
            "",
            "\1\3\2\uffff\1\5",
            "",
            "\1\14\1\16\1\3\1\13\1\17\1\15\1\1\15\uffff\1\12\12\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\10\4\uffff\1\7\1\uffff\1\2\1\11\24\uffff\7\5",
            "\1\14\1\16\1\3\1\13\1\17\1\15\1\1\15\uffff\1\12\12\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\10\4\uffff\1\7\1\uffff\1\2\1\11\24\uffff\7\5",
            "\1\20\1\16\2\uffff\1\17",
            "\1\21",
            "\1\22",
            "\1\3\1\uffff\1\3\3\uffff\1\1\21\uffff\1\23\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\2\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\1\7\uffff\1\3\5\uffff\1\3\3\uffff\1\27\6\uffff\1\5\4\uffff\2\3\4\5\1\uffff\1\5\1\4\1\30\1\uffff\2\3\6\uffff\1\25\3\uffff\1\3\1\24\1\uffff\1\2\1\26\14\uffff\2\3\6\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\14\1\16\1\3\1\13\1\17\1\15\1\1\15\uffff\1\12\12\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\10\4\uffff\1\7\1\uffff\1\2\1\11\24\uffff\7\5",
            "\1\14\1\16\1\3\1\13\1\17\1\15\1\1\15\uffff\1\12\12\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\33\6\uffff\1\2\25\uffff\7\5",
            "\1\37\41\uffff\1\35\4\uffff\1\34\2\uffff\1\36",
            "\1\41\1\44\1\uffff\1\40\1\45\1\42\61\uffff\1\43",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\25\4\uffff\1\24\1\uffff\1\32\1\26\24\uffff\7\5",
            "\1\46",
            "\1\47",
            "\1\41\1\44\1\uffff\1\50\1\45\1\42\61\uffff\1\43",
            "\1\51",
            "\1\3\1\uffff\1\3\3\uffff\1\31\30\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\52",
            "\1\16\2\uffff\1\17",
            "\1\37\41\uffff\1\35\4\uffff\1\34\2\uffff\1\36",
            "\1\53",
            "\1\54",
            "\1\56\1\61\1\uffff\1\55\1\62\1\57\61\uffff\1\60",
            "\1\3\1\uffff\1\3\3\uffff\1\1\21\uffff\1\23\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\2\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\64\4\uffff\1\63\1\uffff\1\32\1\65\24\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\44\2\uffff\1\45",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\25\4\uffff\1\24\1\uffff\1\32\1\26\24\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\5\1\3\4\uffff\1\5\20\uffff\1\5\43\uffff\1\66\2\uffff\1\5\1\uffff\2\5",
            "\1\74\1\16\1\3\1\73\1\17\1\15\1\31\15\uffff\1\72\12\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\70\4\uffff\1\67\1\uffff\1\32\1\71\24\uffff\7\5",
            "\1\37\41\uffff\1\35\4\uffff\1\34\2\uffff\1\36",
            "\1\37",
            "\1\3\1\uffff\1\3\3\uffff\1\1\21\uffff\1\75\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\2\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\77\4\uffff\1\76\1\uffff\1\32\1\100\24\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\61\2\uffff\1\62",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\64\4\uffff\1\63\1\uffff\1\32\1\65\24\uffff\7\5",
            "\1\102",
            "\1\103",
            "\1\5\1\3\4\uffff\1\5\20\uffff\1\5\43\uffff\1\66\2\uffff\1\5\1\uffff\2\5",
            "\1\74\1\16\1\3\1\73\1\17\1\15\1\31\15\uffff\1\72\12\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\70\4\uffff\1\67\1\uffff\1\32\1\71\24\uffff\7\5",
            "\1\104\1\16\2\uffff\1\17",
            "\1\105",
            "\1\106",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\7\uffff\1\3\5\uffff\1\3\3\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\1\uffff\1\3\7\uffff\1\25\3\uffff\1\3\1\24\1\uffff\1\32\1\26\14\uffff\2\3\6\uffff\7\5",
            "\1\110\1\113\1\uffff\1\107\1\114\1\111\61\uffff\1\112",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\77\4\uffff\1\76\1\uffff\1\32\1\100\24\uffff\7\5",
            "\1\115",
            "\1\116",
            "\1\110\1\113\1\uffff\1\117\1\114\1\111\61\uffff\1\112",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\64\4\uffff\1\63\1\uffff\1\32\1\65\24\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\74\1\16\1\3\1\73\1\17\1\15\1\31\15\uffff\1\72\12\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\70\4\uffff\1\67\1\uffff\1\32\1\71\24\uffff\7\5",
            "\1\74\1\16\1\3\1\73\1\17\1\15\1\31\15\uffff\1\72\12\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\33\6\uffff\1\32\25\uffff\7\5",
            "\1\123\41\uffff\1\121\4\uffff\1\120\2\uffff\1\122",
            "\1\3\1\uffff\1\3\3\uffff\1\1\21\uffff\1\75\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\2\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\125\4\uffff\1\124\1\uffff\1\32\1\126\24\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\113\2\uffff\1\114",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\77\4\uffff\1\76\1\uffff\1\32\1\100\24\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\123\41\uffff\1\121\4\uffff\1\120\2\uffff\1\122",
            "\1\127",
            "\1\130",
            "\1\56\1\61\1\uffff\1\131\1\62\1\57\61\uffff\1\60",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\125\4\uffff\1\124\1\uffff\1\32\1\126\24\uffff\7\5",
            "\1\132",
            "\1\133",
            "\1\123\41\uffff\1\121\4\uffff\1\120\2\uffff\1\122",
            "\1\123",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\125\4\uffff\1\124\1\uffff\1\32\1\126\24\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1512:2: ( (lv_declarations_1_0= ruleDeclaration ) )*";
        }
    }
    static final String dfa_14s = "\2\136\1\4\1\uffff\1\7\1\uffff\2\136\1\10\1\5\1\4\7\136\1\103\1\73\1\136\1\4\1\5\1\73\1\4\1\136\1\4\1\10\1\103\1\4\1\5\1\73\3\136\1\10\5\136\1\105\1\136\1\103\1\31\3\136\1\10\3\136\1\4\1\5\1\105\1\136\1\10\1\5\1\136\1\4\1\136\1\73\1\136\1\4\1\5\1\73\4\136\1\103\3\136\1\10\5\136\1\103\1\4\1\5\1\73\1\136\1\4\1\5\1\103\1\31\3\136";
    static final String[] dfa_15s = {
            "\1\3\1\uffff\1\3\3\uffff\1\1\14\uffff\1\3\13\uffff\1\5\4\uffff\2\3\4\5\1\uffff\1\5\1\4\1\5\2\uffff\1\3\15\uffff\1\2\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\1\30\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\2\25\uffff\7\5",
            "\1\6",
            "",
            "\1\3\2\uffff\1\5",
            "",
            "\1\14\1\16\1\3\1\13\1\17\1\15\1\1\15\uffff\1\12\12\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\10\4\uffff\1\7\1\uffff\1\2\1\11\24\uffff\7\5",
            "\1\14\1\16\1\3\1\13\1\17\1\15\1\1\15\uffff\1\12\12\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\10\4\uffff\1\7\1\uffff\1\2\1\11\24\uffff\7\5",
            "\1\20\1\16\2\uffff\1\17",
            "\1\21",
            "\1\22",
            "\1\3\1\uffff\1\3\3\uffff\1\1\21\uffff\1\23\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\2\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\1\7\uffff\1\3\4\uffff\2\3\3\uffff\1\27\6\uffff\1\5\4\uffff\2\3\4\5\1\uffff\1\5\1\4\1\30\1\uffff\2\3\6\uffff\1\25\3\uffff\1\3\1\24\1\uffff\1\2\1\26\14\uffff\2\3\6\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\14\1\16\1\3\1\13\1\17\1\15\1\1\15\uffff\1\12\12\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\10\4\uffff\1\7\1\uffff\1\2\1\11\24\uffff\7\5",
            "\1\14\1\16\1\3\1\13\1\17\1\15\1\1\15\uffff\1\12\12\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\33\6\uffff\1\2\25\uffff\7\5",
            "\1\37\41\uffff\1\35\4\uffff\1\34\2\uffff\1\36",
            "\1\41\1\44\1\uffff\1\40\1\45\1\42\61\uffff\1\43",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\25\4\uffff\1\24\1\uffff\1\32\1\26\24\uffff\7\5",
            "\1\46",
            "\1\47",
            "\1\41\1\44\1\uffff\1\50\1\45\1\42\61\uffff\1\43",
            "\1\51",
            "\1\3\1\uffff\1\3\3\uffff\1\31\30\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\52",
            "\1\16\2\uffff\1\17",
            "\1\37\41\uffff\1\35\4\uffff\1\34\2\uffff\1\36",
            "\1\53",
            "\1\54",
            "\1\56\1\61\1\uffff\1\55\1\62\1\57\61\uffff\1\60",
            "\1\3\1\uffff\1\3\3\uffff\1\1\21\uffff\1\23\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\2\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\64\4\uffff\1\63\1\uffff\1\32\1\65\24\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\44\2\uffff\1\45",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\25\4\uffff\1\24\1\uffff\1\32\1\26\24\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\5\1\3\4\uffff\1\5\20\uffff\1\5\43\uffff\1\66\2\uffff\1\5\1\uffff\2\5",
            "\1\72\1\16\1\3\1\74\1\17\1\15\1\31\15\uffff\1\73\12\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\70\4\uffff\1\67\1\uffff\1\32\1\71\24\uffff\7\5",
            "\1\37\41\uffff\1\35\4\uffff\1\34\2\uffff\1\36",
            "\1\37",
            "\1\3\1\uffff\1\3\3\uffff\1\1\21\uffff\1\75\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\2\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\77\4\uffff\1\76\1\uffff\1\32\1\100\24\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\61\2\uffff\1\62",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\64\4\uffff\1\63\1\uffff\1\32\1\65\24\uffff\7\5",
            "\1\102",
            "\1\103",
            "\1\5\1\3\4\uffff\1\5\20\uffff\1\5\43\uffff\1\66\2\uffff\1\5\1\uffff\2\5",
            "\1\72\1\16\1\3\1\74\1\17\1\15\1\31\15\uffff\1\73\12\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\70\4\uffff\1\67\1\uffff\1\32\1\71\24\uffff\7\5",
            "\1\104\1\16\2\uffff\1\17",
            "\1\105",
            "\1\3\1\uffff\1\3\3\uffff\1\31\7\uffff\1\3\5\uffff\1\3\3\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\1\uffff\1\3\7\uffff\1\25\3\uffff\1\3\1\24\1\uffff\1\32\1\26\14\uffff\2\3\6\uffff\7\5",
            "\1\106",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\110\1\113\1\uffff\1\107\1\114\1\111\61\uffff\1\112",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\77\4\uffff\1\76\1\uffff\1\32\1\100\24\uffff\7\5",
            "\1\115",
            "\1\116",
            "\1\110\1\113\1\uffff\1\117\1\114\1\111\61\uffff\1\112",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\64\4\uffff\1\63\1\uffff\1\32\1\65\24\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\27\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\72\1\16\1\3\1\74\1\17\1\15\1\31\15\uffff\1\73\12\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\70\4\uffff\1\67\1\uffff\1\32\1\71\24\uffff\7\5",
            "\1\72\1\16\1\3\1\74\1\17\1\15\1\31\15\uffff\1\73\12\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\33\6\uffff\1\32\25\uffff\7\5",
            "\1\123\41\uffff\1\121\4\uffff\1\120\2\uffff\1\122",
            "\1\3\1\uffff\1\3\3\uffff\1\1\21\uffff\1\75\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\2\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\125\4\uffff\1\124\1\uffff\1\32\1\126\24\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\113\2\uffff\1\114",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\77\4\uffff\1\76\1\uffff\1\32\1\100\24\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\123\41\uffff\1\121\4\uffff\1\120\2\uffff\1\122",
            "\1\127",
            "\1\130",
            "\1\56\1\61\1\uffff\1\131\1\62\1\57\61\uffff\1\60",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\125\4\uffff\1\124\1\uffff\1\32\1\126\24\uffff\7\5",
            "\1\132",
            "\1\133",
            "\1\123\41\uffff\1\121\4\uffff\1\120\2\uffff\1\122",
            "\1\123",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\11\uffff\1\125\4\uffff\1\124\1\uffff\1\32\1\126\24\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\21\uffff\1\101\6\uffff\1\5\5\uffff\1\3\4\5\1\uffff\1\5\1\4\1\5\20\uffff\1\32\25\uffff\7\5"
    };
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[][] dfa_15 = unpackEncodedStringArray(dfa_15s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_9;
            this.max = dfa_14;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_15;
        }
        public String getDescription() {
            return "()* loopback of 1622:1: ( (lv_declarations_3_0= ruleDeclaration ) )*";
        }
    }
    static final String dfa_16s = "\130\uffff";
    static final String dfa_17s = "\3\4\2\uffff\3\4\1\5\1\4\1\0\12\4\1\31\1\5\3\4\1\5\4\4\1\31\1\4\1\5\3\4\1\5\2\4\1\5\3\4\2\31\3\4\1\5\10\4\1\5\1\31\3\4\1\5\3\4\1\31\1\4\1\5\4\4\1\5\5\4\2\31\3\4\1\5\2\4";
    static final String dfa_18s = "\2\102\1\4\2\uffff\2\103\1\10\1\5\1\102\1\0\3\102\1\4\1\103\1\102\2\73\1\102\1\4\1\103\1\10\1\102\1\103\1\102\1\10\3\102\2\103\1\4\1\5\1\73\1\103\1\4\1\5\1\103\1\10\1\5\1\102\1\121\1\4\1\103\1\31\1\102\1\103\1\102\1\10\2\102\1\103\1\102\1\103\1\102\1\103\1\4\1\5\1\103\1\73\1\103\1\4\1\5\1\73\1\103\1\102\1\103\1\4\1\5\1\73\1\102\1\103\1\102\1\10\2\102\1\103\2\102\1\103\1\31\1\102\1\103\1\4\1\5\1\103\1\102";
    static final String dfa_19s = "\3\uffff\1\1\1\2\123\uffff";
    static final String dfa_20s = "\12\uffff\1\0\115\uffff}>";
    static final String[] dfa_21s = {
            "\1\4\1\uffff\1\4\3\uffff\1\1\36\uffff\1\3\6\uffff\1\4\3\uffff\1\4\15\uffff\1\2",
            "\1\4\1\uffff\1\4\3\uffff\1\1\36\uffff\1\3\6\uffff\1\4\21\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\12\1\14\1\4\1\11\1\15\1\13\1\1\15\uffff\1\16\20\uffff\1\3\6\uffff\1\4\12\uffff\1\7\4\uffff\1\6\1\uffff\1\2\1\10",
            "\1\12\1\14\1\4\1\11\1\15\1\13\1\1\15\uffff\1\16\20\uffff\1\3\6\uffff\1\4\12\uffff\1\7\4\uffff\1\6\1\uffff\1\2\1\10",
            "\1\17\1\14\2\uffff\1\15",
            "\1\20",
            "\1\4\1\uffff\1\4\3\uffff\1\1\21\uffff\1\21\14\uffff\1\3\6\uffff\1\4\21\uffff\1\2",
            "\1\uffff",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\22\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\22\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\22\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\25",
            "\1\12\1\14\1\4\1\11\1\15\1\13\1\1\15\uffff\1\16\20\uffff\1\3\6\uffff\1\4\12\uffff\1\7\4\uffff\1\6\1\uffff\1\2\1\10",
            "\1\12\1\14\1\4\1\11\1\15\1\13\1\1\15\uffff\1\16\20\uffff\1\3\6\uffff\1\4\12\uffff\1\26\6\uffff\1\2",
            "\1\30\1\33\1\uffff\1\27\1\34\1\31\61\uffff\1\32",
            "\1\30\1\33\1\uffff\1\35\1\34\1\31\61\uffff\1\32",
            "\1\4\1\uffff\1\4\3\uffff\1\23\36\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\36",
            "\1\42\41\uffff\1\40\4\uffff\1\37\2\uffff\1\41",
            "\1\14\2\uffff\1\15",
            "\1\4\1\uffff\1\4\3\uffff\1\1\21\uffff\1\21\14\uffff\1\3\6\uffff\1\4\21\uffff\1\2",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\22\14\uffff\1\3\6\uffff\1\4\12\uffff\1\44\4\uffff\1\43\1\uffff\1\24\1\45",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\22\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\33\2\uffff\1\34",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\22\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\22\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\22\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\52\1\14\1\4\1\51\1\15\1\13\1\23\15\uffff\1\53\20\uffff\1\3\6\uffff\1\4\12\uffff\1\47\4\uffff\1\46\1\uffff\1\24\1\50",
            "\1\42\41\uffff\1\40\4\uffff\1\37\2\uffff\1\41",
            "\1\54",
            "\1\55",
            "\1\57\1\62\1\uffff\1\56\1\63\1\60\61\uffff\1\61",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\22\14\uffff\1\3\6\uffff\1\4\12\uffff\1\44\4\uffff\1\43\1\uffff\1\24\1\45",
            "\1\64",
            "\1\65",
            "\1\52\1\14\1\4\1\51\1\15\1\13\1\23\15\uffff\1\53\20\uffff\1\3\6\uffff\1\4\12\uffff\1\47\4\uffff\1\46\1\uffff\1\24\1\50",
            "\1\66\1\14\2\uffff\1\15",
            "\1\67",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\22\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\7\uffff\1\4\5\uffff\1\4\3\uffff\1\22\14\uffff\1\3\6\uffff\1\4\2\uffff\1\4\7\uffff\1\71\3\uffff\1\4\1\70\1\uffff\1\24\1\72\14\uffff\2\4",
            "\1\73",
            "\1\42\41\uffff\1\40\4\uffff\1\37\2\uffff\1\41",
            "\1\42",
            "\1\4\1\uffff\1\4\3\uffff\1\1\21\uffff\1\74\14\uffff\1\3\6\uffff\1\4\21\uffff\1\2",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\100\14\uffff\1\3\6\uffff\1\4\12\uffff\1\76\4\uffff\1\75\1\uffff\1\24\1\77",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\100\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\62\2\uffff\1\63",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\100\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\100\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\22\14\uffff\1\3\6\uffff\1\4\12\uffff\1\44\4\uffff\1\43\1\uffff\1\24\1\45",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\22\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\52\1\14\1\4\1\51\1\15\1\13\1\23\15\uffff\1\53\20\uffff\1\3\6\uffff\1\4\12\uffff\1\47\4\uffff\1\46\1\uffff\1\24\1\50",
            "\1\52\1\14\1\4\1\51\1\15\1\13\1\23\15\uffff\1\53\20\uffff\1\3\6\uffff\1\4\12\uffff\1\26\6\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\22\14\uffff\1\3\6\uffff\1\4\12\uffff\1\71\4\uffff\1\70\1\uffff\1\24\1\72",
            "\1\101",
            "\1\102",
            "\1\106\41\uffff\1\104\4\uffff\1\103\2\uffff\1\105",
            "\1\110\1\113\1\uffff\1\107\1\114\1\111\61\uffff\1\112",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\100\14\uffff\1\3\6\uffff\1\4\12\uffff\1\76\4\uffff\1\75\1\uffff\1\24\1\77",
            "\1\115",
            "\1\116",
            "\1\110\1\113\1\uffff\1\117\1\114\1\111\61\uffff\1\112",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\22\14\uffff\1\3\6\uffff\1\4\12\uffff\1\71\4\uffff\1\70\1\uffff\1\24\1\72",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\22\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\106\41\uffff\1\104\4\uffff\1\103\2\uffff\1\105",
            "\1\120",
            "\1\121",
            "\1\57\1\62\1\uffff\1\122\1\63\1\60\61\uffff\1\61",
            "\1\4\1\uffff\1\4\3\uffff\1\1\21\uffff\1\74\14\uffff\1\3\6\uffff\1\4\21\uffff\1\2",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\100\14\uffff\1\3\6\uffff\1\4\12\uffff\1\124\4\uffff\1\123\1\uffff\1\24\1\125",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\100\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\113\2\uffff\1\114",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\100\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\100\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\100\14\uffff\1\3\6\uffff\1\4\12\uffff\1\76\4\uffff\1\75\1\uffff\1\24\1\77",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\100\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\100\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\106\41\uffff\1\104\4\uffff\1\103\2\uffff\1\105",
            "\1\106",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\100\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\100\14\uffff\1\3\6\uffff\1\4\12\uffff\1\124\4\uffff\1\123\1\uffff\1\24\1\125",
            "\1\126",
            "\1\127",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\100\14\uffff\1\3\6\uffff\1\4\12\uffff\1\124\4\uffff\1\123\1\uffff\1\24\1\125",
            "\1\4\1\uffff\1\4\3\uffff\1\23\21\uffff\1\100\14\uffff\1\3\6\uffff\1\4\21\uffff\1\24"
    };

    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_16;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "1705:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_10 = input.LA(1);

                         
                        int index28_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalS()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index28_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_22s = "\102\uffff";
    static final String dfa_23s = "\2\12\1\4\3\uffff\3\4\1\5\1\4\5\12\2\4\1\31\1\4\1\12\1\4\2\5\1\31\1\4\1\5\1\4\3\12\1\5\4\12\2\31\3\12\1\5\3\12\1\4\1\5\1\4\1\12\1\4\1\5\5\12\1\5\5\12\1\4\1\5\2\12";
    static final String dfa_24s = "\2\136\1\4\3\uffff\2\136\1\10\1\5\1\4\7\136\1\103\1\73\1\136\1\4\1\5\1\10\1\103\1\4\1\5\1\73\3\136\1\10\4\136\1\103\1\31\3\136\1\10\3\136\1\4\1\5\1\73\1\136\1\4\1\5\5\136\1\10\5\136\1\4\1\5\2\136";
    static final String dfa_25s = "\3\uffff\1\1\1\2\1\3\74\uffff";
    static final String dfa_26s = "\102\uffff}>";
    static final String[] dfa_27s = {
            "\1\1\30\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\1\30\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\6",
            "",
            "",
            "",
            "\1\14\1\16\1\uffff\1\13\1\17\1\15\1\1\15\uffff\1\12\12\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\11\uffff\1\10\4\uffff\1\7\1\uffff\1\2\1\11\24\uffff\7\3",
            "\1\14\1\16\1\uffff\1\13\1\17\1\15\1\1\15\uffff\1\12\12\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\11\uffff\1\10\4\uffff\1\7\1\uffff\1\2\1\11\24\uffff\7\3",
            "\1\20\1\16\2\uffff\1\17",
            "\1\21",
            "\1\22",
            "\1\1\21\uffff\1\23\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\1\21\uffff\1\23\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\11\uffff\1\25\4\uffff\1\24\1\uffff\1\2\1\26\24\uffff\7\3",
            "\1\1\21\uffff\1\23\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\1\21\uffff\1\23\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\1\21\uffff\1\23\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\14\1\16\1\uffff\1\13\1\17\1\15\1\1\15\uffff\1\12\12\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\11\uffff\1\10\4\uffff\1\7\1\uffff\1\2\1\11\24\uffff\7\3",
            "\1\14\1\16\1\uffff\1\13\1\17\1\15\1\1\15\uffff\1\12\12\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\11\uffff\1\27\6\uffff\1\2\25\uffff\7\3",
            "\1\33\41\uffff\1\31\4\uffff\1\30\2\uffff\1\32",
            "\1\35\1\40\1\uffff\1\34\1\41\1\36\61\uffff\1\37",
            "\1\1\21\uffff\1\23\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\11\uffff\1\25\4\uffff\1\24\1\uffff\1\2\1\26\24\uffff\7\3",
            "\1\42",
            "\1\43",
            "\1\16\2\uffff\1\17",
            "\1\33\41\uffff\1\31\4\uffff\1\30\2\uffff\1\32",
            "\1\44",
            "\1\45",
            "\1\47\1\52\1\uffff\1\46\1\53\1\50\61\uffff\1\51",
            "\1\1\21\uffff\1\23\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\1\21\uffff\1\23\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\11\uffff\1\55\4\uffff\1\54\1\uffff\1\2\1\56\24\uffff\7\3",
            "\1\1\21\uffff\1\23\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\40\2\uffff\1\41",
            "\1\1\21\uffff\1\23\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\1\21\uffff\1\23\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\1\21\uffff\1\23\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\11\uffff\1\25\4\uffff\1\24\1\uffff\1\2\1\26\24\uffff\7\3",
            "\1\1\21\uffff\1\23\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\33\41\uffff\1\31\4\uffff\1\30\2\uffff\1\32",
            "\1\33",
            "\1\1\21\uffff\1\57\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\1\21\uffff\1\57\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\11\uffff\1\61\4\uffff\1\60\1\uffff\1\2\1\62\24\uffff\7\3",
            "\1\1\21\uffff\1\57\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\52\2\uffff\1\53",
            "\1\1\21\uffff\1\57\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\1\21\uffff\1\57\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\1\21\uffff\1\23\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\11\uffff\1\55\4\uffff\1\54\1\uffff\1\2\1\56\24\uffff\7\3",
            "\1\63",
            "\1\64",
            "\1\66\1\71\1\uffff\1\65\1\72\1\67\61\uffff\1\70",
            "\1\1\21\uffff\1\57\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\11\uffff\1\61\4\uffff\1\60\1\uffff\1\2\1\62\24\uffff\7\3",
            "\1\73",
            "\1\74",
            "\1\1\21\uffff\1\23\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\11\uffff\1\55\4\uffff\1\54\1\uffff\1\2\1\56\24\uffff\7\3",
            "\1\1\21\uffff\1\23\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\1\21\uffff\1\57\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\1\21\uffff\1\57\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\11\uffff\1\76\4\uffff\1\75\1\uffff\1\2\1\77\24\uffff\7\3",
            "\1\1\21\uffff\1\57\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\71\2\uffff\1\72",
            "\1\1\21\uffff\1\57\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\1\21\uffff\1\57\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\1\21\uffff\1\57\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\11\uffff\1\61\4\uffff\1\60\1\uffff\1\2\1\62\24\uffff\7\3",
            "\1\1\21\uffff\1\57\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3",
            "\1\1\21\uffff\1\57\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\11\uffff\1\76\4\uffff\1\75\1\uffff\1\2\1\77\24\uffff\7\3",
            "\1\100",
            "\1\101",
            "\1\1\21\uffff\1\57\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\11\uffff\1\76\4\uffff\1\75\1\uffff\1\2\1\77\24\uffff\7\3",
            "\1\1\21\uffff\1\57\6\uffff\1\3\6\uffff\4\3\1\uffff\2\4\1\5\20\uffff\1\2\25\uffff\7\3"
    };

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_22;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "1824:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration | this_ScheduleDeclaration_2= ruleScheduleDeclaration )";
        }
    }
    static final String dfa_28s = "\13\uffff";
    static final String dfa_29s = "\1\4\3\0\7\uffff";
    static final String dfa_30s = "\1\102\3\0\7\uffff";
    static final String dfa_31s = "\4\uffff\1\4\1\6\1\uffff\1\1\1\2\1\3\1\5";
    static final String dfa_32s = "\1\uffff\1\0\1\1\1\2\7\uffff}>";
    static final String[] dfa_33s = {
            "\1\1\1\uffff\1\4\3\uffff\1\2\45\uffff\1\5\3\uffff\1\5\15\uffff\1\3",
            "\1\uffff",
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

    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_28;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "3136:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalS()) ) {s = 7;}

                        else if ( (synpred86_InternalS()) ) {s = 8;}

                        else if ( (synpred87_InternalS()) ) {s = 9;}

                        else if ( (synpred89_InternalS()) ) {s = 10;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_2 = input.LA(1);

                         
                        int index72_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalS()) ) {s = 8;}

                        else if ( (synpred87_InternalS()) ) {s = 9;}

                        else if ( (synpred88_InternalS()) ) {s = 4;}

                        else if ( (synpred89_InternalS()) ) {s = 10;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index72_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_3 = input.LA(1);

                         
                        int index72_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalS()) ) {s = 8;}

                        else if ( (synpred87_InternalS()) ) {s = 9;}

                        else if ( (synpred88_InternalS()) ) {s = 4;}

                        else if ( (synpred89_InternalS()) ) {s = 10;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index72_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\5\uffff";
    static final String dfa_35s = "\1\1\1\uffff\2\1\1\uffff";
    static final String dfa_36s = "\1\4\1\uffff\2\4\1\uffff";
    static final String dfa_37s = "\1\102\1\uffff\2\121\1\uffff";
    static final String dfa_38s = "\1\uffff\1\2\2\uffff\1\1";
    static final String dfa_39s = "\5\uffff}>";
    static final String[] dfa_40s = {
            "\1\2\1\uffff\1\1\3\uffff\1\1\14\uffff\1\1\20\uffff\2\1\6\uffff\1\1\3\uffff\1\1\15\uffff\1\1",
            "",
            "\1\1\1\4\1\1\3\uffff\1\1\7\uffff\1\1\4\uffff\2\1\1\uffff\1\1\15\uffff\2\1\6\uffff\2\1\1\uffff\2\1\12\uffff\1\3\2\uffff\1\1\15\uffff\2\1",
            "\1\1\1\4\1\1\3\uffff\1\1\7\uffff\1\1\4\uffff\2\1\17\uffff\2\1\6\uffff\2\1\1\uffff\2\1\12\uffff\1\3\2\uffff\1\1\15\uffff\2\1",
            ""
    };

    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = dfa_34;
            this.eof = dfa_35;
            this.min = dfa_36;
            this.max = dfa_37;
            this.accept = dfa_38;
            this.special = dfa_39;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "()+ loopback of 3300:1: ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+";
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = dfa_34;
            this.eof = dfa_35;
            this.min = dfa_36;
            this.max = dfa_37;
            this.accept = dfa_38;
            this.special = dfa_39;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "()+ loopback of 3425:1: ( (lv_schedule_7_0= ruleScheduleObjectReference ) )+";
        }
    }
    static final String dfa_41s = "\17\uffff";
    static final String dfa_42s = "\1\4\14\0\2\uffff";
    static final String dfa_43s = "\1\127\14\0\2\uffff";
    static final String dfa_44s = "\15\uffff\1\1\1\2";
    static final String dfa_45s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff}>";
    static final String[] dfa_46s = {
            "\1\11\1\2\1\14\1\4\1\3\1\6\10\uffff\1\5\35\uffff\1\12\3\uffff\1\13\6\uffff\1\1\5\uffff\1\15\24\uffff\1\7\1\10",
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

    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[][] dfa_46 = unpackEncodedStringArray(dfa_46s);

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = dfa_41;
            this.eof = dfa_41;
            this.min = dfa_42;
            this.max = dfa_43;
            this.accept = dfa_44;
            this.special = dfa_45;
            this.transition = dfa_46;
        }
        public String getDescription() {
            return "3827:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA91_1 = input.LA(1);

                         
                        int index91_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA91_2 = input.LA(1);

                         
                        int index91_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA91_3 = input.LA(1);

                         
                        int index91_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA91_4 = input.LA(1);

                         
                        int index91_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA91_5 = input.LA(1);

                         
                        int index91_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA91_6 = input.LA(1);

                         
                        int index91_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA91_7 = input.LA(1);

                         
                        int index91_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA91_8 = input.LA(1);

                         
                        int index91_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA91_9 = input.LA(1);

                         
                        int index91_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA91_10 = input.LA(1);

                         
                        int index91_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA91_11 = input.LA(1);

                         
                        int index91_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA91_12 = input.LA(1);

                         
                        int index91_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalS()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 91, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_47s = {
            "\1\2\1\uffff\1\1\3\uffff\2\1\7\uffff\1\1\2\uffff\2\1\1\uffff\1\1\2\uffff\1\1\13\uffff\2\1\6\uffff\1\1\1\uffff\1\1\1\uffff\1\1\15\uffff\1\1",
            "",
            "\1\1\1\4\1\1\3\uffff\1\1\7\uffff\1\1\4\uffff\2\1\1\uffff\1\1\15\uffff\2\1\6\uffff\2\1\1\uffff\2\1\12\uffff\1\3\2\uffff\1\1\15\uffff\2\1",
            "\1\1\1\4\1\1\3\uffff\1\1\7\uffff\1\1\4\uffff\2\1\17\uffff\2\1\6\uffff\2\1\1\uffff\2\1\12\uffff\1\3\2\uffff\1\1\15\uffff\2\1",
            ""
    };
    static final short[][] dfa_47 = unpackEncodedStringArray(dfa_47s);

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = dfa_34;
            this.eof = dfa_35;
            this.min = dfa_36;
            this.max = dfa_37;
            this.accept = dfa_38;
            this.special = dfa_39;
            this.transition = dfa_47;
        }
        public String getDescription() {
            return "()+ loopback of 3856:1: ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+";
        }
    }
    static final String dfa_48s = "\33\uffff";
    static final String dfa_49s = "\1\7\32\uffff";
    static final String dfa_50s = "\1\4\1\uffff\1\0\30\uffff";
    static final String dfa_51s = "\1\125\1\uffff\1\0\30\uffff";
    static final String dfa_52s = "\1\uffff\1\1\5\uffff\1\2\23\uffff";
    static final String dfa_53s = "\2\uffff\1\0\30\uffff}>";
    static final String[] dfa_54s = {
            "\1\7\1\uffff\1\7\3\uffff\2\7\7\uffff\1\7\2\uffff\2\7\1\uffff\1\7\2\uffff\1\7\13\uffff\2\7\6\uffff\3\7\1\uffff\1\2\1\1\4\7\10\uffff\1\7\17\uffff\4\1",
            "",
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
            ""
    };

    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final char[] dfa_51 = DFA.unpackEncodedStringToUnsignedChars(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final short[][] dfa_54 = unpackEncodedStringArray(dfa_54s);

    class DFA102 extends DFA {

        public DFA102(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 102;
            this.eot = dfa_48;
            this.eof = dfa_49;
            this.min = dfa_50;
            this.max = dfa_51;
            this.accept = dfa_52;
            this.special = dfa_53;
            this.transition = dfa_54;
        }
        public String getDescription() {
            return "4340:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA102_2 = input.LA(1);

                         
                        int index102_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_InternalS()) ) {s = 1;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index102_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 102, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_55s = "\16\uffff";
    static final String dfa_56s = "\1\4\4\uffff\10\0\1\uffff";
    static final String dfa_57s = "\1\127\4\uffff\10\0\1\uffff";
    static final String dfa_58s = "\1\uffff\1\1\13\uffff\1\2";
    static final String dfa_59s = "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff}>";
    static final String[] dfa_60s = {
            "\1\11\1\1\1\14\2\1\1\6\10\uffff\1\5\35\uffff\1\12\3\uffff\1\13\6\uffff\1\1\5\uffff\1\15\24\uffff\1\7\1\10",
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
            "\1\uffff",
            ""
    };

    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final char[] dfa_56 = DFA.unpackEncodedStringToUnsignedChars(dfa_56s);
    static final char[] dfa_57 = DFA.unpackEncodedStringToUnsignedChars(dfa_57s);
    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final short[][] dfa_60 = unpackEncodedStringArray(dfa_60s);

    class DFA103 extends DFA {

        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = dfa_55;
            this.eof = dfa_55;
            this.min = dfa_56;
            this.max = dfa_57;
            this.accept = dfa_58;
            this.special = dfa_59;
            this.transition = dfa_60;
        }
        public String getDescription() {
            return "4406:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA103_5 = input.LA(1);

                         
                        int index103_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_InternalS()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index103_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA103_6 = input.LA(1);

                         
                        int index103_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_InternalS()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index103_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA103_7 = input.LA(1);

                         
                        int index103_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_InternalS()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index103_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA103_8 = input.LA(1);

                         
                        int index103_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_InternalS()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index103_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA103_9 = input.LA(1);

                         
                        int index103_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_InternalS()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index103_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA103_10 = input.LA(1);

                         
                        int index103_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_InternalS()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index103_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA103_11 = input.LA(1);

                         
                        int index103_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_InternalS()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index103_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA103_12 = input.LA(1);

                         
                        int index103_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_InternalS()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index103_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 103, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_61s = "\11\uffff";
    static final String dfa_62s = "\3\uffff\1\2\3\uffff\1\2\1\uffff";
    static final String dfa_63s = "\1\4\2\uffff\1\4\3\uffff\1\4\1\uffff";
    static final String dfa_64s = "\1\127\2\uffff\1\125\3\uffff\1\125\1\uffff";
    static final String dfa_65s = "\1\uffff\1\1\1\2\1\uffff\1\3\1\5\1\6\1\uffff\1\4";
    static final String dfa_66s = "\11\uffff}>";
    static final String[] dfa_67s = {
            "\1\3\1\uffff\1\6\2\uffff\1\1\10\uffff\1\4\35\uffff\1\5\3\uffff\1\5\41\uffff\2\2",
            "",
            "",
            "\1\2\1\uffff\1\2\3\uffff\2\2\6\uffff\1\10\1\2\2\uffff\4\2\2\uffff\1\2\13\uffff\2\2\6\uffff\3\2\1\10\13\2\1\7\1\2\1\uffff\1\2\17\uffff\4\2",
            "",
            "",
            "",
            "\1\2\1\uffff\1\2\3\uffff\2\2\6\uffff\1\10\1\2\2\uffff\4\2\2\uffff\1\2\13\uffff\2\2\6\uffff\3\2\1\10\13\2\1\7\1\2\1\uffff\1\2\17\uffff\4\2",
            ""
    };

    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final char[] dfa_63 = DFA.unpackEncodedStringToUnsignedChars(dfa_63s);
    static final char[] dfa_64 = DFA.unpackEncodedStringToUnsignedChars(dfa_64s);
    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final short[][] dfa_67 = unpackEncodedStringArray(dfa_67s);

    class DFA116 extends DFA {

        public DFA116(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 116;
            this.eot = dfa_61;
            this.eof = dfa_62;
            this.min = dfa_63;
            this.max = dfa_64;
            this.accept = dfa_65;
            this.special = dfa_66;
            this.transition = dfa_67;
        }
        public String getDescription() {
            return "5143:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression )";
        }
    }
    static final String dfa_68s = "\15\uffff";
    static final String dfa_69s = "\1\4\3\uffff\1\0\10\uffff";
    static final String dfa_70s = "\1\127\3\uffff\1\0\10\uffff";
    static final String dfa_71s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\6\uffff\1\4";
    static final String dfa_72s = "\4\uffff\1\0\10\uffff}>";
    static final String[] dfa_73s = {
            "\1\5\1\1\1\5\1\3\1\2\1\5\10\uffff\1\4\35\uffff\1\5\3\uffff\1\5\41\uffff\2\5",
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
            "",
            ""
    };

    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final char[] dfa_69 = DFA.unpackEncodedStringToUnsignedChars(dfa_69s);
    static final char[] dfa_70 = DFA.unpackEncodedStringToUnsignedChars(dfa_70s);
    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final short[] dfa_72 = DFA.unpackEncodedString(dfa_72s);
    static final short[][] dfa_73 = unpackEncodedStringArray(dfa_73s);

    class DFA117 extends DFA {

        public DFA117(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 117;
            this.eot = dfa_68;
            this.eof = dfa_68;
            this.min = dfa_69;
            this.max = dfa_70;
            this.accept = dfa_71;
            this.special = dfa_72;
            this.transition = dfa_73;
        }
        public String getDescription() {
            return "5249:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA117_4 = input.LA(1);

                         
                        int index117_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred141_InternalS()) ) {s = 12;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index117_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 117, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_74s = "\3\uffff\2\12\4\uffff\1\10\1\uffff\2\12";
    static final String dfa_75s = "\1\12\1\uffff\4\4\1\5\2\uffff\1\4\1\uffff\2\4";
    static final String dfa_76s = "\1\102\1\uffff\1\4\2\136\1\10\1\5\2\uffff\1\136\1\uffff\2\136";
    static final String dfa_77s = "\1\uffff\1\1\5\uffff\1\3\1\2\1\uffff\1\4\2\uffff";
    static final String dfa_78s = "\15\uffff}>";
    static final String[] dfa_79s = {
            "\1\1\67\uffff\1\2",
            "",
            "\1\3",
            "\1\11\1\10\1\12\3\10\1\12\6\uffff\1\12\2\uffff\1\12\3\uffff\1\7\12\uffff\1\12\5\uffff\5\12\1\uffff\3\12\11\uffff\1\5\4\uffff\1\4\1\uffff\1\12\1\6\24\uffff\7\12",
            "\1\11\1\10\1\12\3\10\1\12\6\uffff\1\12\2\uffff\1\12\3\uffff\1\7\12\uffff\1\12\5\uffff\5\12\1\uffff\3\12\11\uffff\1\5\4\uffff\1\4\1\uffff\1\12\1\6\24\uffff\7\12",
            "\1\13\1\10\2\uffff\1\10",
            "\1\14",
            "",
            "",
            "\1\10\1\uffff\1\10\3\uffff\1\10\6\uffff\1\10\1\12\1\uffff\1\10\3\uffff\1\12\3\uffff\1\10\6\uffff\1\10\5\uffff\5\10\1\uffff\3\10\1\uffff\1\12\7\uffff\1\10\3\uffff\1\12\1\10\1\uffff\2\10\14\uffff\2\12\6\uffff\7\10",
            "",
            "\1\11\1\10\1\12\3\10\1\12\6\uffff\1\12\2\uffff\1\12\3\uffff\1\7\12\uffff\1\12\5\uffff\5\12\1\uffff\3\12\11\uffff\1\5\4\uffff\1\4\1\uffff\1\12\1\6\24\uffff\7\12",
            "\1\11\1\10\1\12\3\10\1\12\6\uffff\1\12\2\uffff\1\12\3\uffff\1\7\12\uffff\1\12\5\uffff\5\12\1\uffff\3\12\11\uffff\1\10\6\uffff\1\12\25\uffff\7\12"
    };
    static final short[] dfa_74 = DFA.unpackEncodedString(dfa_74s);
    static final char[] dfa_75 = DFA.unpackEncodedStringToUnsignedChars(dfa_75s);
    static final char[] dfa_76 = DFA.unpackEncodedStringToUnsignedChars(dfa_76s);
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final short[] dfa_78 = DFA.unpackEncodedString(dfa_78s);
    static final short[][] dfa_79 = unpackEncodedStringArray(dfa_79s);

    class DFA132 extends DFA {

        public DFA132(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 132;
            this.eot = dfa_68;
            this.eof = dfa_74;
            this.min = dfa_75;
            this.max = dfa_76;
            this.accept = dfa_77;
            this.special = dfa_78;
            this.transition = dfa_79;
        }
        public String getDescription() {
            return "6161:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
    static final String dfa_80s = "\14\uffff";
    static final String dfa_81s = "\3\uffff\2\10\5\uffff\2\10";
    static final String dfa_82s = "\1\12\1\uffff\4\4\1\5\3\uffff\2\4";
    static final String dfa_83s = "\1\102\1\uffff\1\4\2\103\1\4\1\5\3\uffff\1\103\1\102";
    static final String dfa_84s = "\1\uffff\1\1\5\uffff\1\3\1\4\1\2\2\uffff";
    static final String dfa_85s = "\14\uffff}>";
    static final String[] dfa_86s = {
            "\1\1\67\uffff\1\2",
            "",
            "\1\3",
            "\1\10\2\uffff\1\11\2\uffff\1\10\15\uffff\1\7\42\uffff\1\5\4\uffff\1\4\1\uffff\1\10\1\6",
            "\1\10\2\uffff\1\11\2\uffff\1\10\15\uffff\1\7\42\uffff\1\5\4\uffff\1\4\1\uffff\1\10\1\6",
            "\1\12",
            "\1\13",
            "",
            "",
            "",
            "\1\10\2\uffff\1\11\2\uffff\1\10\15\uffff\1\7\42\uffff\1\5\4\uffff\1\4\1\uffff\1\10\1\6",
            "\1\10\2\uffff\1\11\2\uffff\1\10\15\uffff\1\7\51\uffff\1\10"
    };

    static final short[] dfa_80 = DFA.unpackEncodedString(dfa_80s);
    static final short[] dfa_81 = DFA.unpackEncodedString(dfa_81s);
    static final char[] dfa_82 = DFA.unpackEncodedStringToUnsignedChars(dfa_82s);
    static final char[] dfa_83 = DFA.unpackEncodedStringToUnsignedChars(dfa_83s);
    static final short[] dfa_84 = DFA.unpackEncodedString(dfa_84s);
    static final short[] dfa_85 = DFA.unpackEncodedString(dfa_85s);
    static final short[][] dfa_86 = unpackEncodedStringArray(dfa_86s);

    class DFA133 extends DFA {

        public DFA133(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 133;
            this.eot = dfa_80;
            this.eof = dfa_81;
            this.min = dfa_82;
            this.max = dfa_83;
            this.accept = dfa_84;
            this.special = dfa_85;
            this.transition = dfa_86;
        }
        public String getDescription() {
            return "6239:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020400L,0x0000000000000004L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0003BC0800120440L,0x000000007F000004L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0003BC0800120442L,0x000000007F000004L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000120400L,0x0000000000000004L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0003BCFFE8820450L,0x000000007F000004L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000FFE8800050L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x08110000000403F0L,0x0000000000C00002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000100C0000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0013BFFFE8020452L,0x000000007FC00004L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x001103FFE8020452L,0x0000000000C00004L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0013BFFFE8820450L,0x000000007FC00004L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x001103FFE8820450L,0x0000000000C00004L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000020400L,0x0000000000000004L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00003C0800020400L,0x000000007F000004L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000380800000000L,0x000000007F000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000300800000000L,0x000000007F000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200800000000L,0x000000007F000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L,0x000000007F000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000020410L,0x0000000000C00004L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000010000802L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000010L,0x0000000000C00000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001800000020400L,0x0000000000000004L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000020400L,0x0000000000000004L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000008020410L,0x0000000000C00034L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000008020410L,0x0000000000C00004L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004000005000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x1700000000000000L,0x00000003C0000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000040002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000012L,0x0000000000C00000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000001000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000020440L,0x0000000000000004L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0008000000040000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0A110000000403F0L,0x0000000000C00002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0001000000020400L,0x0000000000000004L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0030000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x08110000000403F0L,0x0000000000C00000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000001000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x08000000000003B0L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000290L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000009L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000100L});

}