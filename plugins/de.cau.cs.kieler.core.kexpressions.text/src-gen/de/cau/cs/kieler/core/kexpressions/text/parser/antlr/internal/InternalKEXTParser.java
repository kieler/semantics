package de.cau.cs.kieler.core.kexpressions.text.parser.antlr.internal; 

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
import de.cau.cs.kieler.core.kexpressions.text.services.KEXTGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKEXTParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HOSTCODE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'expression'", "'const'", "'input'", "'output'", "'static'", "'signal'", "','", "';'", "'['", "']'", "'='", "'combine'", "'('", "')'", "'<'", "'()'", "'>'", "'!'", "'&'", "'@'", "'.'", "'#'", "'-'", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "'=='", "'<='", "'>='", "'!='", "'pre'", "'|'", "'+'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'string'", "'host'", "'none'", "'max'", "'min'"
    };
    public static final int RULE_BOOLEAN=8;
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
    public static final int RULE_INT=5;
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
    public static final int RULE_HOSTCODE=6;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=9;
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


        public InternalKEXTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKEXTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[229+1];
             
             
        }
        

    public String[] getTokenNames() { return InternalKEXTParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private KEXTGrammarAccess grammarAccess;
     	
        public InternalKEXTParser(TokenStream input, KEXTGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Kext";	
       	}
       	
       	@Override
       	protected KEXTGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleKext"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:75:1: entryRuleKext returns [EObject current=null] : iv_ruleKext= ruleKext EOF ;
    public final EObject entryRuleKext() throws RecognitionException {
        EObject current = null;
        int entryRuleKext_StartIndex = input.index();
        EObject iv_ruleKext = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:76:2: (iv_ruleKext= ruleKext EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:77:2: iv_ruleKext= ruleKext EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKextRule()); 
            }
            pushFollow(FOLLOW_ruleKext_in_entryRuleKext88);
            iv_ruleKext=ruleKext();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKext; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKext98); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, entryRuleKext_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKext"


    // $ANTLR start "ruleKext"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:84:1: ruleKext returns [EObject current=null] : ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( ( (lv_expressions_1_0= ruleAnnotatedExpression ) ) | ( (lv_effects_2_0= ruleEffect ) ) )* ) ;
    public final EObject ruleKext() throws RecognitionException {
        EObject current = null;
        int ruleKext_StartIndex = input.index();
        EObject lv_declarations_0_0 = null;

        EObject lv_expressions_1_0 = null;

        EObject lv_effects_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:87:28: ( ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( ( (lv_expressions_1_0= ruleAnnotatedExpression ) ) | ( (lv_effects_2_0= ruleEffect ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:88:1: ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( ( (lv_expressions_1_0= ruleAnnotatedExpression ) ) | ( (lv_effects_2_0= ruleEffect ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:88:1: ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( ( (lv_expressions_1_0= ruleAnnotatedExpression ) ) | ( (lv_effects_2_0= ruleEffect ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:88:2: ( (lv_declarations_0_0= ruleDeclaration ) )* ( ( (lv_expressions_1_0= ruleAnnotatedExpression ) ) | ( (lv_effects_2_0= ruleEffect ) ) )*
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:88:2: ( (lv_declarations_0_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:89:1: (lv_declarations_0_0= ruleDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:89:1: (lv_declarations_0_0= ruleDeclaration )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:90:3: lv_declarations_0_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKextAccess().getDeclarationsDeclarationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleKext144);
            	    lv_declarations_0_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getKextRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_0_0, 
            	              		"Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:106:3: ( ( (lv_expressions_1_0= ruleAnnotatedExpression ) ) | ( (lv_effects_2_0= ruleEffect ) ) )*
            loop2:
            do {
                int alt2=3;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:106:4: ( (lv_expressions_1_0= ruleAnnotatedExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:106:4: ( (lv_expressions_1_0= ruleAnnotatedExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:107:1: (lv_expressions_1_0= ruleAnnotatedExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:107:1: (lv_expressions_1_0= ruleAnnotatedExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:108:3: lv_expressions_1_0= ruleAnnotatedExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKextAccess().getExpressionsAnnotatedExpressionParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotatedExpression_in_ruleKext167);
            	    lv_expressions_1_0=ruleAnnotatedExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getKextRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"AnnotatedExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:125:6: ( (lv_effects_2_0= ruleEffect ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:125:6: ( (lv_effects_2_0= ruleEffect ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:126:1: (lv_effects_2_0= ruleEffect )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:126:1: (lv_effects_2_0= ruleEffect )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:127:3: lv_effects_2_0= ruleEffect
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKextAccess().getEffectsEffectParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEffect_in_ruleKext194);
            	    lv_effects_2_0=ruleEffect();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getKextRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"effects",
            	              		lv_effects_2_0, 
            	              		"Effect");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
            if ( state.backtracking>0 ) { memoize(input, 2, ruleKext_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKext"


    // $ANTLR start "entryRuleAnnotatedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:151:1: entryRuleAnnotatedExpression returns [EObject current=null] : iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF ;
    public final EObject entryRuleAnnotatedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAnnotatedExpression_StartIndex = input.index();
        EObject iv_ruleAnnotatedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:152:2: (iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:153:2: iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotatedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotatedExpression_in_entryRuleAnnotatedExpression232);
            iv_ruleAnnotatedExpression=ruleAnnotatedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotatedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotatedExpression242); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, entryRuleAnnotatedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotatedExpression"


    // $ANTLR start "ruleAnnotatedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:160:1: ruleAnnotatedExpression returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAnnotatedExpression() throws RecognitionException {
        EObject current = null;
        int ruleAnnotatedExpression_StartIndex = input.index();
        Token otherlv_1=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:163:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:164:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:164:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:164:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:164:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMMENT_ANNOTATION||LA3_0==35) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:165:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:165:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:166:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotatedExpressionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotatedExpression288);
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
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleAnnotatedExpression301); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAnnotatedExpressionAccess().getExpressionKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:186:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:187:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:187:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:188:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotatedExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAnnotatedExpression322);
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
            if ( state.backtracking>0 ) { memoize(input, 4, ruleAnnotatedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAnnotatedExpression"


    // $ANTLR start "entryRuleDeclaration"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:212:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleDeclaration_StartIndex = input.index();
        EObject iv_ruleDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:213:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:214:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration358);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration368); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, entryRuleDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:221:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:224:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:225:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:225:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:225:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';'
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:225:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMENT_ANNOTATION||LA4_0==35) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:226:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:226:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:227:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleDeclaration414);
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
            	    break loop4;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:243:3: ( (lv_const_1_0= 'const' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:244:1: (lv_const_1_0= 'const' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:244:1: (lv_const_1_0= 'const' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:245:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,17,FOLLOW_17_in_ruleDeclaration433); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:258:3: ( (lv_input_2_0= 'input' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:259:1: (lv_input_2_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:259:1: (lv_input_2_0= 'input' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:260:3: lv_input_2_0= 'input'
                    {
                    lv_input_2_0=(Token)match(input,18,FOLLOW_18_in_ruleDeclaration465); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:273:3: ( (lv_output_3_0= 'output' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:274:1: (lv_output_3_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:274:1: (lv_output_3_0= 'output' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:275:3: lv_output_3_0= 'output'
                    {
                    lv_output_3_0=(Token)match(input,19,FOLLOW_19_in_ruleDeclaration497); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:288:3: ( (lv_static_4_0= 'static' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:289:1: (lv_static_4_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:289:1: (lv_static_4_0= 'static' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:290:3: lv_static_4_0= 'static'
                    {
                    lv_static_4_0=(Token)match(input,20,FOLLOW_20_in_ruleDeclaration529); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:303:3: ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=58 && LA10_1<=64)) ) {
                    alt10=1;
                }
                else if ( (LA10_1==RULE_ID) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA10_0>=58 && LA10_0<=64)) ) {
                alt10=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:303:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:303:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:303:5: ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:303:5: ( (lv_signal_5_0= 'signal' ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==21) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:304:1: (lv_signal_5_0= 'signal' )
                            {
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:304:1: (lv_signal_5_0= 'signal' )
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:305:3: lv_signal_5_0= 'signal'
                            {
                            lv_signal_5_0=(Token)match(input,21,FOLLOW_21_in_ruleDeclaration563); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:318:3: ( (lv_type_6_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:319:1: (lv_type_6_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:319:1: (lv_type_6_0= ruleValueType )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:320:3: lv_type_6_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeValueTypeEnumRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleDeclaration598);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:337:6: ( (lv_signal_7_0= 'signal' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:337:6: ( (lv_signal_7_0= 'signal' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:338:1: (lv_signal_7_0= 'signal' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:338:1: (lv_signal_7_0= 'signal' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:339:3: lv_signal_7_0= 'signal'
                    {
                    lv_signal_7_0=(Token)match(input,21,FOLLOW_21_in_ruleDeclaration623); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:352:3: ( (lv_valuedObjects_8_0= ruleValuedObject ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:353:1: (lv_valuedObjects_8_0= ruleValuedObject )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:353:1: (lv_valuedObjects_8_0= ruleValuedObject )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:354:3: lv_valuedObjects_8_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValuedObject_in_ruleDeclaration658);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:370:2: (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:370:4: otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    {
            	    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleDeclaration671); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getDeclarationAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:374:1: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:375:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:375:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:376:3: lv_valuedObjects_10_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValuedObject_in_ruleDeclaration692);
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
            	    break loop11;
                }
            } while (true);

            otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleDeclaration706); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 6, ruleDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleValuedObject"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:404:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObject_StartIndex = input.index();
        EObject iv_ruleValuedObject = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:405:2: (iv_ruleValuedObject= ruleValuedObject EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:406:2: iv_ruleValuedObject= ruleValuedObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObject_in_entryRuleValuedObject742);
            iv_ruleValuedObject=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObject; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObject752); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, entryRuleValuedObject_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObject"


    // $ANTLR start "ruleValuedObject"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:413:1: ruleValuedObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? ) ;
    public final EObject ruleValuedObject() throws RecognitionException {
        EObject current = null;
        int ruleValuedObject_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:416:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:417:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:417:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:417:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )?
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:417:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:418:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:418:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:419:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValuedObject794); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:435:2: (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:435:4: otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleValuedObject812); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:439:1: ( (lv_cardinalities_2_0= RULE_INT ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:440:1: (lv_cardinalities_2_0= RULE_INT )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:440:1: (lv_cardinalities_2_0= RULE_INT )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:441:3: lv_cardinalities_2_0= RULE_INT
            	    {
            	    lv_cardinalities_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValuedObject829); if (state.failed) return current;
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

            	    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleValuedObject846); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:461:3: (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:461:5: otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleValuedObject861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:465:1: ( (lv_initialValue_5_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:466:1: (lv_initialValue_5_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:466:1: (lv_initialValue_5_0= ruleExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:467:3: lv_initialValue_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getInitialValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleValuedObject882);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:483:4: (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:483:6: otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleValuedObject897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getValuedObjectAccess().getCombineKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:487:1: ( (lv_combineOperator_7_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:488:1: (lv_combineOperator_7_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:488:1: (lv_combineOperator_7_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:489:3: lv_combineOperator_7_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCombineOperatorCombineOperatorEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleValuedObject918);
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
            if ( state.backtracking>0 ) { memoize(input, 8, ruleValuedObject_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObject"


    // $ANTLR start "entryRuleEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:513:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;
        int entryRuleEffect_StartIndex = input.index();
        EObject iv_ruleEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:514:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:515:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectRule()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect956);
            iv_ruleEffect=ruleEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect966); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, entryRuleEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:522:1: ruleEffect returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:525:28: ( (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:526:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:526:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            int alt15=5;
            switch ( input.LA(1) ) {
            case RULE_COMMENT_ANNOTATION:
                {
                int LA15_1 = input.LA(2);

                if ( (synpred16_InternalKEXT()) ) {
                    alt15=1;
                }
                else if ( (synpred17_InternalKEXT()) ) {
                    alt15=2;
                }
                else if ( (synpred18_InternalKEXT()) ) {
                    alt15=3;
                }
                else if ( (synpred19_InternalKEXT()) ) {
                    alt15=4;
                }
                else if ( (true) ) {
                    alt15=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                int LA15_2 = input.LA(2);

                if ( (synpred16_InternalKEXT()) ) {
                    alt15=1;
                }
                else if ( (synpred17_InternalKEXT()) ) {
                    alt15=2;
                }
                else if ( (synpred18_InternalKEXT()) ) {
                    alt15=3;
                }
                else if ( (synpred19_InternalKEXT()) ) {
                    alt15=4;
                }
                else if ( (true) ) {
                    alt15=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA15_3 = input.LA(2);

                if ( (synpred16_InternalKEXT()) ) {
                    alt15=1;
                }
                else if ( (synpred17_InternalKEXT()) ) {
                    alt15=2;
                }
                else if ( (synpred18_InternalKEXT()) ) {
                    alt15=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                alt15=4;
                }
                break;
            case 30:
                {
                alt15=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:527:2: this_Assignment_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleEffect1016);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:540:2: this_PostfixEffect_1= rulePostfixEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getPostfixEffectParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePostfixEffect_in_ruleEffect1046);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:553:2: this_Emission_2= ruleEmission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmission_in_ruleEffect1076);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:566:2: this_HostcodeEffect_3= ruleHostcodeEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getHostcodeEffectParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostcodeEffect_in_ruleEffect1106);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:579:2: this_FunctionCallEffect_4= ruleFunctionCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getFunctionCallEffectParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCallEffect_in_ruleEffect1136);
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
            if ( state.backtracking>0 ) { memoize(input, 10, ruleEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleEmission"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:598:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;
        int entryRuleEmission_StartIndex = input.index();
        EObject iv_ruleEmission = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:599:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:600:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FOLLOW_ruleEmission_in_entryRuleEmission1171);
            iv_ruleEmission=ruleEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmission1181); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, entryRuleEmission_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEmission"


    // $ANTLR start "ruleEmission"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:607:1: ruleEmission returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:610:28: ( ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:611:1: ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:611:1: ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:611:2: ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:611:2: ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_COMMENT_ANNOTATION||LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:612:1: (lv_annotations_0_0= ruleRestrictedAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:612:1: (lv_annotations_0_0= ruleRestrictedAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:613:3: lv_annotations_0_0= ruleRestrictedAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmissionAccess().getAnnotationsRestrictedAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRestrictedAnnotation_in_ruleEmission1227);
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
            	              		"RestrictedAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:629:3: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:630:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:630:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:631:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmission1252); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:645:2: (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:645:4: otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleEmission1265); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:649:1: ( (lv_newValue_3_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:650:1: (lv_newValue_3_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:650:1: (lv_newValue_3_0= ruleExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:651:3: lv_newValue_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEmission1286);
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
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleEmission1298); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 12, ruleEmission_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEmission"


    // $ANTLR start "entryRuleAssignment"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:679:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;
        int entryRuleAssignment_StartIndex = input.index();
        EObject iv_ruleAssignment = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:680:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:681:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1336);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1346); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, entryRuleAssignment_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:688:1: ruleAssignment returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:691:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:692:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:692:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:692:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:692:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_COMMENT_ANNOTATION||LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:693:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:693:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:694:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAssignment1392);
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
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:710:3: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:711:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:711:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:712:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment1417); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:726:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:726:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleAssignment1430); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:730:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:731:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:731:1: (lv_indices_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:732:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleAssignment1451);
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
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleAssignment1463); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:752:3: ( (lv_operator_5_0= ruleAssignOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:753:1: (lv_operator_5_0= ruleAssignOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:753:1: (lv_operator_5_0= ruleAssignOperator )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:754:3: lv_operator_5_0= ruleAssignOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getOperatorAssignOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssignOperator_in_ruleAssignment1486);
            lv_operator_5_0=ruleAssignOperator();

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
                      		"AssignOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:770:2: ( (lv_expression_6_0= ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:771:1: (lv_expression_6_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:771:1: (lv_expression_6_0= ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:772:3: lv_expression_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment1507);
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
            if ( state.backtracking>0 ) { memoize(input, 14, ruleAssignment_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRulePostfixEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:796:1: entryRulePostfixEffect returns [EObject current=null] : iv_rulePostfixEffect= rulePostfixEffect EOF ;
    public final EObject entryRulePostfixEffect() throws RecognitionException {
        EObject current = null;
        int entryRulePostfixEffect_StartIndex = input.index();
        EObject iv_rulePostfixEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:797:2: (iv_rulePostfixEffect= rulePostfixEffect EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:798:2: iv_rulePostfixEffect= rulePostfixEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixEffectRule()); 
            }
            pushFollow(FOLLOW_rulePostfixEffect_in_entryRulePostfixEffect1543);
            iv_rulePostfixEffect=rulePostfixEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfixEffect1553); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, entryRulePostfixEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePostfixEffect"


    // $ANTLR start "rulePostfixEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:805:1: rulePostfixEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:808:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:809:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:809:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:809:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:809:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_COMMENT_ANNOTATION||LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:810:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:810:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:811:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_rulePostfixEffect1599);
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
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:827:3: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:828:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:828:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:829:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPostfixEffectRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePostfixEffect1624); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getPostfixEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:843:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:843:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_rulePostfixEffect1637); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPostfixEffectAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:847:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:848:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:848:1: (lv_indices_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:849:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_rulePostfixEffect1658);
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
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,25,FOLLOW_25_in_rulePostfixEffect1670); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getPostfixEffectAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:869:3: ( (lv_operator_5_0= rulePostfixOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:870:1: (lv_operator_5_0= rulePostfixOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:870:1: (lv_operator_5_0= rulePostfixOperator )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:871:3: lv_operator_5_0= rulePostfixOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getOperatorPostfixOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePostfixOperator_in_rulePostfixEffect1693);
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
                      		"PostfixOperator");
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
            if ( state.backtracking>0 ) { memoize(input, 16, rulePostfixEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePostfixEffect"


    // $ANTLR start "entryRuleHostcodeEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:895:1: entryRuleHostcodeEffect returns [EObject current=null] : iv_ruleHostcodeEffect= ruleHostcodeEffect EOF ;
    public final EObject entryRuleHostcodeEffect() throws RecognitionException {
        EObject current = null;
        int entryRuleHostcodeEffect_StartIndex = input.index();
        EObject iv_ruleHostcodeEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:896:2: (iv_ruleHostcodeEffect= ruleHostcodeEffect EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:897:2: iv_ruleHostcodeEffect= ruleHostcodeEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHostcodeEffectRule()); 
            }
            pushFollow(FOLLOW_ruleHostcodeEffect_in_entryRuleHostcodeEffect1729);
            iv_ruleHostcodeEffect=ruleHostcodeEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHostcodeEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostcodeEffect1739); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, entryRuleHostcodeEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleHostcodeEffect"


    // $ANTLR start "ruleHostcodeEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:904:1: ruleHostcodeEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleHostcodeEffect() throws RecognitionException {
        EObject current = null;
        int ruleHostcodeEffect_StartIndex = input.index();
        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:907:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:908:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:908:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:908:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:908:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_COMMENT_ANNOTATION||LA22_0==35) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:909:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:909:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:910:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHostcodeEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleHostcodeEffect1785);
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
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:926:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:927:1: (lv_text_1_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:927:1: (lv_text_1_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:928:3: lv_text_1_0= RULE_HOSTCODE
            {
            lv_text_1_0=(Token)match(input,RULE_HOSTCODE,FOLLOW_RULE_HOSTCODE_in_ruleHostcodeEffect1803); if (state.failed) return current;
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
                      		"HOSTCODE");
              	    
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
            if ( state.backtracking>0 ) { memoize(input, 18, ruleHostcodeEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleHostcodeEffect"


    // $ANTLR start "entryRuleFunctionCallEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:952:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionCallEffect_StartIndex = input.index();
        EObject iv_ruleFunctionCallEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:953:2: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:954:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallEffectRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCallEffect_in_entryRuleFunctionCallEffect1844);
            iv_ruleFunctionCallEffect=ruleFunctionCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCallEffect1854); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, entryRuleFunctionCallEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCallEffect"


    // $ANTLR start "ruleFunctionCallEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:961:1: ruleFunctionCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:964:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:965:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:965:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:965:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>'
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:965:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_COMMENT_ANNOTATION||LA23_0==35) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:966:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:966:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:967:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleFunctionCallEffect1900);
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
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleFunctionCallEffect1913); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:987:1: ( (lv_functionName_2_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:988:1: (lv_functionName_2_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:988:1: (lv_functionName_2_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:989:3: lv_functionName_2_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getFunctionNameExtendedIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleFunctionCallEffect1934);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1005:2: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )?
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            else if ( (LA25_0==31) ) {
                alt25=2;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1005:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1005:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1005:5: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleFunctionCallEffect1948); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_3_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1009:1: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1010:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1010:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1011:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionCallEffect1969);
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
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1027:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==22) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1027:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleFunctionCallEffect1982); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_3_0_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1031:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1032:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1032:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1033:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionCallEffect2003);
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
                    	              		"Parameter");
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

                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleFunctionCallEffect2017); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_3_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1054:7: otherlv_8= '()'
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleFunctionCallEffect2036); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,32,FOLLOW_32_in_ruleFunctionCallEffect2050); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 20, ruleFunctionCallEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCallEffect"


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1072:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleExpression_StartIndex = input.index();
        EObject iv_ruleExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1073:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1074:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2088);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2098); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, entryRuleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1081:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;
        int ruleExpression_StartIndex = input.index();
        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1084:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1085:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1085:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1086:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleExpression2148);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1099:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleExpression2178);
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
            if ( state.backtracking>0 ) { memoize(input, 22, ruleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBoolExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1118:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBoolExpression_StartIndex = input.index();
        EObject iv_ruleBoolExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1119:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1120:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression2213);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpression2223); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, entryRuleBoolExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1127:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;
        int ruleBoolExpression_StartIndex = input.index();
        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1130:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1132:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleBoolExpression2272);
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
            if ( state.backtracking>0 ) { memoize(input, 24, ruleBoolExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1151:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleLogicalOrExpression_StartIndex = input.index();
        EObject iv_ruleLogicalOrExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1152:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1153:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression2306);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression2316); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, entryRuleLogicalOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1160:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;
        int ruleLogicalOrExpression_StartIndex = input.index();
        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1163:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1164:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1164:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1165:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression2366);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1176:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==56) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1176:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1176:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1177:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1185:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==56) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1185:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1185:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1186:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1186:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1187:3: lv_operator_2_0= ruleLogicalOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression2400);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1203:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1204:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1204:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1205:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression2421);
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
                    	    if ( cnt27 >= 1 ) break loop27;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
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
            if ( state.backtracking>0 ) { memoize(input, 26, ruleLogicalOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1229:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleLogicalAndExpression_StartIndex = input.index();
        EObject iv_ruleLogicalAndExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1230:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1231:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression2461);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression2471); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, entryRuleLogicalAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1238:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;
        int ruleLogicalAndExpression_StartIndex = input.index();
        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1241:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1242:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1242:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1243:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression2521);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1254:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==57) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1254:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1254:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1255:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1263:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==57) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1263:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1263:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1264:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1264:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1265:3: lv_operator_2_0= ruleLogicalAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression2555);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1281:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1282:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1282:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1283:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression2576);
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
                    	    if ( cnt29 >= 1 ) break loop29;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
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
            if ( state.backtracking>0 ) { memoize(input, 28, ruleLogicalAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1307:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBitwiseOrExpression_StartIndex = input.index();
        EObject iv_ruleBitwiseOrExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1308:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1309:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression2616);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression2626); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, entryRuleBitwiseOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseOrExpression"


    // $ANTLR start "ruleBitwiseOrExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1316:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;
        int ruleBitwiseOrExpression_StartIndex = input.index();
        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1319:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1320:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1320:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1321:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression2676);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1332:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1332:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1332:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1333:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1341:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==50) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1341:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1341:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1342:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1342:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1343:3: lv_operator_2_0= ruleBitwiseOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBitwiseOrOperator_in_ruleBitwiseOrExpression2710);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1359:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1360:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1360:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1361:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression2731);
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
                    	    if ( cnt31 >= 1 ) break loop31;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
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
            if ( state.backtracking>0 ) { memoize(input, 30, ruleBitwiseOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1385:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBitwiseAndExpression_StartIndex = input.index();
        EObject iv_ruleBitwiseAndExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1386:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1387:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression2771);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression2781); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, entryRuleBitwiseAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseAndExpression"


    // $ANTLR start "ruleBitwiseAndExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1394:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;
        int ruleBitwiseAndExpression_StartIndex = input.index();
        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1397:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1398:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1398:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1399:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression2831);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1410:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1410:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1410:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1411:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1419:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==34) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1419:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1419:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1420:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1420:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1421:3: lv_operator_2_0= ruleBitwiseAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBitwiseAndOperator_in_ruleBitwiseAndExpression2865);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1437:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1438:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1438:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1439:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression2886);
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
                    	    if ( cnt33 >= 1 ) break loop33;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
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
            if ( state.backtracking>0 ) { memoize(input, 32, ruleBitwiseAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1463:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;
        int entryRuleCompareOperation_StartIndex = input.index();
        EObject iv_ruleCompareOperation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1464:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1465:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation2926);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation2936); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, entryRuleCompareOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1472:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;
        int ruleCompareOperation_StartIndex = input.index();
        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1475:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1476:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1476:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1477:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation2986);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1488:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32||(LA35_0>=45 && LA35_0<=48)) ) {
                alt35=1;
            }
            else if ( (LA35_0==30) ) {
                int LA35_2 = input.LA(2);

                if ( ((LA35_2>=RULE_INT && LA35_2<=RULE_STRING)||LA35_2==28||LA35_2==30||LA35_2==33||LA35_2==38||LA35_2==49||LA35_2==55) ) {
                    alt35=1;
                }
                else if ( (LA35_2==RULE_ID) ) {
                    int LA35_4 = input.LA(3);

                    if ( (LA35_4==EOF||LA35_4==RULE_ID||LA35_4==RULE_HOSTCODE||LA35_4==RULE_COMMENT_ANNOTATION||LA35_4==16||(LA35_4>=22 && LA35_4<=25)||LA35_4==27||(LA35_4>=29 && LA35_4<=30)||(LA35_4>=34 && LA35_4<=35)||LA35_4==38||(LA35_4>=50 && LA35_4<=54)||(LA35_4>=56 && LA35_4<=57)) ) {
                        alt35=1;
                    }
                }
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1488:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1488:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1489:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1497:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1498:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1498:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1499:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareOperation3019);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1515:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1516:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1516:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1517:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation3040);
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
            if ( state.backtracking>0 ) { memoize(input, 34, ruleCompareOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleNotOrValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1541:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNotOrValuedExpression_StartIndex = input.index();
        EObject iv_ruleNotOrValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1542:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1543:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression3078);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOrValuedExpression3088); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, entryRuleNotOrValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNotOrValuedExpression"


    // $ANTLR start "ruleNotOrValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1550:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleNotOrValuedExpression_StartIndex = input.index();
        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1553:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1554:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1554:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1555:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression3138);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1568:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression3168);
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
            if ( state.backtracking>0 ) { memoize(input, 36, ruleNotOrValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotOrValuedExpression"


    // $ANTLR start "entryRuleNotExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1587:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNotExpression_StartIndex = input.index();
        EObject iv_ruleNotExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1588:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1589:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_entryRuleNotExpression3203);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotExpression3213); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, entryRuleNotExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1596:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;
        int ruleNotExpression_StartIndex = input.index();
        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1599:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1600:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1600:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID||LA37_0==RULE_HOSTCODE||LA37_0==RULE_BOOLEAN||LA37_0==28||LA37_0==30||LA37_0==49||LA37_0==55) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1600:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1600:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1600:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1600:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1601:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1609:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1610:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1610:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1611:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotOperator_in_ruleNotExpression3272);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1627:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1628:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1628:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1629:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleNotExpression3293);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1647:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleNotExpression3325);
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
            if ( state.backtracking>0 ) { memoize(input, 38, ruleNotExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1666:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedExpression_StartIndex = input.index();
        EObject iv_ruleValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1667:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1668:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression3360);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedExpression3370); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, entryRuleValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedExpression"


    // $ANTLR start "ruleValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1675:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleValuedExpression_StartIndex = input.index();
        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1678:28: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1680:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAddExpression_in_ruleValuedExpression3419);
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
            if ( state.backtracking>0 ) { memoize(input, 40, ruleValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedExpression"


    // $ANTLR start "entryRuleAddExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1699:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAddExpression_StartIndex = input.index();
        EObject iv_ruleAddExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1700:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1701:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAddExpression_in_entryRuleAddExpression3453);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExpression3463); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, entryRuleAddExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1708:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;
        int ruleAddExpression_StartIndex = input.index();
        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1711:28: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1712:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1712:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1713:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression3513);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1724:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==51) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1724:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1724:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1725:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1733:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1734:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1734:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1735:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddOperator_in_ruleAddExpression3546);
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

            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1751:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1752:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1752:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1753:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression3567);
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
            	    break loop38;
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
            if ( state.backtracking>0 ) { memoize(input, 42, ruleAddExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1777:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleSubExpression_StartIndex = input.index();
        EObject iv_ruleSubExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1778:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1779:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_entryRuleSubExpression3605);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubExpression3615); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, entryRuleSubExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSubExpression"


    // $ANTLR start "ruleSubExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1786:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;
        int ruleSubExpression_StartIndex = input.index();
        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1789:28: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1790:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1790:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1791:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression3665);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1802:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==38) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1802:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1802:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1803:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1811:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1812:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1812:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1813:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubOperator_in_ruleSubExpression3698);
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

            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1829:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1830:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1830:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1831:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression3719);
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
            	    break loop39;
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
            if ( state.backtracking>0 ) { memoize(input, 44, ruleSubExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1855:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleMultExpression_StartIndex = input.index();
        EObject iv_ruleMultExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1856:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1857:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_entryRuleMultExpression3757);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultExpression3767); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, entryRuleMultExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1864:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;
        int ruleMultExpression_StartIndex = input.index();
        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1867:28: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1868:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1868:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1869:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDivExpression_in_ruleMultExpression3817);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1880:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==52) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1880:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1880:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1881:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1889:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1890:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1890:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1891:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOperator_in_ruleMultExpression3850);
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

            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1907:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1908:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1908:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1909:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDivExpression_in_ruleMultExpression3871);
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
            	    break loop40;
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
            if ( state.backtracking>0 ) { memoize(input, 46, ruleMultExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1933:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleDivExpression_StartIndex = input.index();
        EObject iv_ruleDivExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1934:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1935:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleDivExpression_in_entryRuleDivExpression3909);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivExpression3919); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, entryRuleDivExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDivExpression"


    // $ANTLR start "ruleDivExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1942:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;
        int ruleDivExpression_StartIndex = input.index();
        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1945:28: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1946:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1946:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1947:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleModExpression_in_ruleDivExpression3969);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1958:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==54) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1958:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1958:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1959:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1967:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1968:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1968:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1969:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDivOperator_in_ruleDivExpression4002);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1985:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1986:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1986:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1987:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModExpression_in_ruleDivExpression4023);
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
            if ( state.backtracking>0 ) { memoize(input, 48, ruleDivExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2011:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleModExpression_StartIndex = input.index();
        EObject iv_ruleModExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2012:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2013:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_entryRuleModExpression4061);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModExpression4071); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, entryRuleModExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleModExpression"


    // $ANTLR start "ruleModExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2020:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;
        int ruleModExpression_StartIndex = input.index();
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2023:28: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2024:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2024:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2025:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNegExpression_in_ruleModExpression4121);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2036:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==53) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2036:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2036:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2037:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2045:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2046:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2046:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2047:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModOperator_in_ruleModExpression4154);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2063:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2064:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2064:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2065:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression4175);
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
            if ( state.backtracking>0 ) { memoize(input, 50, ruleModExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModExpression"


    // $ANTLR start "entryRuleNegExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2089:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNegExpression_StartIndex = input.index();
        EObject iv_ruleNegExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2090:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2091:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNegExpression_in_entryRuleNegExpression4213);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpression4223); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, entryRuleNegExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNegExpression"


    // $ANTLR start "ruleNegExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2098:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;
        int ruleNegExpression_StartIndex = input.index();
        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2101:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2102:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2102:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==38) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_STRING)||LA43_0==28||LA43_0==30||LA43_0==49||LA43_0==55) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2102:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2102:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2102:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2102:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2103:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2111:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2112:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2112:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2113:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSubOperator_in_ruleNegExpression4282);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2129:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2130:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2130:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2131:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNegExpression_in_ruleNegExpression4303);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2149:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression4335);
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
            if ( state.backtracking>0 ) { memoize(input, 52, ruleNegExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNegExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2168:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAtomicExpression_StartIndex = input.index();
        EObject iv_ruleAtomicExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2169:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2170:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression4370);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression4380); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, entryRuleAtomicExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2177:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2180:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2181:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2181:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            int alt44=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt44=1;
                }
                break;
            case RULE_ID:
            case 49:
            case 55:
                {
                alt44=2;
                }
                break;
            case 28:
                {
                alt44=3;
                }
                break;
            case 30:
                {
                alt44=4;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt44=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2182:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolValue_in_ruleAtomicExpression4430);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2195:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression4460);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2207:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2207:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2207:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleAtomicExpression4478); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleAtomicExpression4503);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleAtomicExpression4514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2229:2: this_FunctionCall_5= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleAtomicExpression4546);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2242:2: this_TextExpression_6= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_ruleAtomicExpression4576);
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
            if ( state.backtracking>0 ) { memoize(input, 54, ruleAtomicExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleAtomicValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2261:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAtomicValuedExpression_StartIndex = input.index();
        EObject iv_ruleAtomicValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2262:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2263:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression4611);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicValuedExpression4621); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, entryRuleAtomicValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicValuedExpression"


    // $ANTLR start "ruleAtomicValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2270:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2273:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2274:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2274:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt45=5;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2275:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression4671);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2288:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression4701);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2301:2: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getStringValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_ruleAtomicValuedExpression4731);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2313:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2313:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2313:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleAtomicValuedExpression4749); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression4774);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleAtomicValuedExpression4785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2335:2: this_AtomicExpression_6= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression4817);
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
            if ( state.backtracking>0 ) { memoize(input, 56, ruleAtomicValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAtomicValuedExpression"


    // $ANTLR start "entryRuleValuedObjectTestExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2354:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObjectTestExpression_StartIndex = input.index();
        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2355:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2356:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression4852);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObjectTestExpression4862); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, entryRuleValuedObjectTestExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectTestExpression"


    // $ANTLR start "ruleValuedObjectTestExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2363:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2366:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2367:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2367:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49||LA47_0==55) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_ID) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2367:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2367:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2367:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2367:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2368:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2376:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2377:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2377:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2378:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2378:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==49) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==55) ) {
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
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2379:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression4923);
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
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2394:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression4942);
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

                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleValuedObjectTestExpression4957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2416:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2417:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2417:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2418:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression4978);
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

                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleValuedObjectTestExpression4990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2440:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression5022);
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
            if ( state.backtracking>0 ) { memoize(input, 58, ruleValuedObjectTestExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObjectTestExpression"


    // $ANTLR start "entryRuleValuedObjectReference"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2459:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObjectReference_StartIndex = input.index();
        EObject iv_ruleValuedObjectReference = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2460:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2461:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference5057);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObjectReference5067); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, entryRuleValuedObjectReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectReference"


    // $ANTLR start "ruleValuedObjectReference"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2468:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;
        int ruleValuedObjectReference_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_indices_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2471:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2472:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2472:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2472:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2472:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2473:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2473:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2474:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValuedObjectReference5116); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2488:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==24) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2488:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleValuedObjectReference5129); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2492:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2493:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2493:1: (lv_indices_2_0= ruleExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2494:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleValuedObjectReference5150);
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

            	    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleValuedObjectReference5162); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
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
            if ( state.backtracking>0 ) { memoize(input, 60, ruleValuedObjectReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleFunctionCall"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2522:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionCall_StartIndex = input.index();
        EObject iv_ruleFunctionCall = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2523:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2524:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall5200);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall5210); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, entryRuleFunctionCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2531:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2534:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2535:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2535:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2535:3: otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleFunctionCall5247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2539:1: ( (lv_functionName_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2540:1: (lv_functionName_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2540:1: (lv_functionName_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2541:3: lv_functionName_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleFunctionCall5268);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2557:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )?
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==28) ) {
                alt50=1;
            }
            else if ( (LA50_0==31) ) {
                alt50=2;
            }
            switch (alt50) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2557:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2557:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2557:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleFunctionCall5282); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2561:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2562:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2562:1: (lv_parameters_3_0= ruleParameter )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2563:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionCall5303);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2579:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==22) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2579:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleFunctionCall5316); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2583:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2584:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2584:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2585:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionCall5337);
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
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleFunctionCall5351); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2606:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleFunctionCall5370); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,32,FOLLOW_32_in_ruleFunctionCall5384); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 62, ruleFunctionCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleParameter"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2622:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;
        int entryRuleParameter_StartIndex = input.index();
        EObject iv_ruleParameter = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2623:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2624:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter5420);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter5430); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, entryRuleParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2631:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;
        int ruleParameter_StartIndex = input.index();
        Token lv_pureOutput_0_0=null;
        Token lv_callByReference_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2634:28: ( ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2635:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2635:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2635:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2635:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==33) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==34) ) {
                    alt52=1;
                }
            }
            else if ( (LA52_0==34) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2635:3: ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2635:3: ( (lv_pureOutput_0_0= '!' ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==33) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2636:1: (lv_pureOutput_0_0= '!' )
                            {
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2636:1: (lv_pureOutput_0_0= '!' )
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2637:3: lv_pureOutput_0_0= '!'
                            {
                            lv_pureOutput_0_0=(Token)match(input,33,FOLLOW_33_in_ruleParameter5474); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2650:3: ( (lv_callByReference_1_0= '&' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2651:1: (lv_callByReference_1_0= '&' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2651:1: (lv_callByReference_1_0= '&' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2652:3: lv_callByReference_1_0= '&'
                    {
                    lv_callByReference_1_0=(Token)match(input,34,FOLLOW_34_in_ruleParameter5506); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2665:4: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2666:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2666:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2667:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParameter5542);
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
            if ( state.backtracking>0 ) { memoize(input, 64, ruleParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTextExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2691:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleTextExpression_StartIndex = input.index();
        EObject iv_ruleTextExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2692:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2693:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTextExpression_in_entryRuleTextExpression5578);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextExpression5588); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, entryRuleTextExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2700:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;
        int ruleTextExpression_StartIndex = input.index();
        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2703:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2704:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2704:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2705:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2705:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2706:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FOLLOW_RULE_HOSTCODE_in_ruleTextExpression5629); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 66, ruleTextExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleIntValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2730:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;
        int entryRuleIntValue_StartIndex = input.index();
        EObject iv_ruleIntValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2731:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2732:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue5669);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue5679); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, entryRuleIntValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2739:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;
        int ruleIntValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2742:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2743:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2743:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2744:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2744:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2745:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue5720); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 68, ruleIntValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2769:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;
        int entryRuleFloatValue_StartIndex = input.index();
        EObject iv_ruleFloatValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2770:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2771:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue5760);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue5770); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, entryRuleFloatValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2778:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;
        int ruleFloatValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2781:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2782:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2782:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2783:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2783:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2784:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue5811); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 70, ruleFloatValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleBoolValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2808:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;
        int entryRuleBoolValue_StartIndex = input.index();
        EObject iv_ruleBoolValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2809:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2810:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FOLLOW_ruleBoolValue_in_entryRuleBoolValue5851);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolValue5861); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, entryRuleBoolValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2817:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;
        int ruleBoolValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2820:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2821:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2821:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2822:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2822:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2823:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBoolValue5902); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 72, ruleBoolValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleStringValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2847:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;
        int entryRuleStringValue_StartIndex = input.index();
        EObject iv_ruleStringValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2848:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2849:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue5942);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue5952); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, entryRuleStringValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2856:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;
        int ruleStringValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2859:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2860:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2860:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2861:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2861:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2862:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue5993); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 74, ruleStringValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2888:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleAnnotation_StartIndex = input.index();
        EObject iv_ruleAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2889:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2890:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation6035);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation6045); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, entryRuleAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2897:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleAnnotation_StartIndex = input.index();
        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyStringValueAnnotation_1 = null;

        EObject this_TypedKeyStringValueAnnotation_2 = null;

        EObject this_KeyBooleanValueAnnotation_3 = null;

        EObject this_KeyIntValueAnnotation_4 = null;

        EObject this_KeyFloatValueAnnotation_5 = null;

        EObject this_TagAnnotation_6 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2900:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2901:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2901:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            int alt53=7;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2902:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommentAnnotation_in_ruleAnnotation6095);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2915:2: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation6125);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2928:2: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation6155);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2941:2: this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation6185);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2954:2: this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation6215);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2967:2: this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation6245);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2980:2: this_TagAnnotation_6= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTagAnnotation_in_ruleAnnotation6275);
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
            if ( state.backtracking>0 ) { memoize(input, 76, ruleAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleRestrictedAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3001:1: entryRuleRestrictedAnnotation returns [EObject current=null] : iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF ;
    public final EObject entryRuleRestrictedAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleRestrictedAnnotation_StartIndex = input.index();
        EObject iv_ruleRestrictedAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3002:2: (iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3003:2: iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleRestrictedAnnotation_in_entryRuleRestrictedAnnotation6312);
            iv_ruleRestrictedAnnotation=ruleRestrictedAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestrictedAnnotation6322); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, entryRuleRestrictedAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleRestrictedAnnotation"


    // $ANTLR start "ruleRestrictedAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3010:1: ruleRestrictedAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3013:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3014:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3014:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            int alt54=7;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3015:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommentAnnotation_in_ruleRestrictedAnnotation6372);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3028:2: this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getQuotedKeyStringValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQuotedKeyStringValueAnnotation_in_ruleRestrictedAnnotation6402);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3041:2: this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getQuotedTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_ruleRestrictedAnnotation6432);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3054:2: this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleRestrictedAnnotation6462);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3067:2: this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_ruleRestrictedAnnotation6492);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3080:2: this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_ruleRestrictedAnnotation6522);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3093:2: this_TagAnnotation_6= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getTagAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTagAnnotation_in_ruleRestrictedAnnotation6552);
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
            if ( state.backtracking>0 ) { memoize(input, 78, ruleRestrictedAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleRestrictedAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3112:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleCommentAnnotation_StartIndex = input.index();
        EObject iv_ruleCommentAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3113:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3114:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation6587);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentAnnotation6597); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, entryRuleCommentAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentAnnotation"


    // $ANTLR start "ruleCommentAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3121:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleCommentAnnotation_StartIndex = input.index();
        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3124:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3125:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3125:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3126:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3126:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3127:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation6638); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 80, ruleCommentAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleTagAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3151:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleTagAnnotation_StartIndex = input.index();
        EObject iv_ruleTagAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3152:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3153:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation6678);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagAnnotation6688); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, entryRuleTagAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTagAnnotation"


    // $ANTLR start "ruleTagAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3160:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleTagAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3163:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3164:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3164:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3164:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleTagAnnotation6725); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3168:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3169:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3169:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3170:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTagAnnotation6746);
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
            if ( state.backtracking>0 ) { memoize(input, 82, ruleTagAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3194:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3195:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3196:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation6782);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation6792); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, entryRuleKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyStringValueAnnotation"


    // $ANTLR start "ruleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3203:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3206:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3207:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3207:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3207:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleKeyStringValueAnnotation6829); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3211:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3212:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3212:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3213:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation6850);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3229:2: ( (lv_values_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3230:1: (lv_values_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3230:1: (lv_values_2_0= ruleEString )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3231:3: lv_values_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation6871);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3247:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==22) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3247:4: otherlv_3= ',' ( (lv_values_4_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleKeyStringValueAnnotation6884); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3251:1: ( (lv_values_4_0= ruleEString ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3252:1: (lv_values_4_0= ruleEString )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3252:1: (lv_values_4_0= ruleEString )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3253:3: lv_values_4_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation6905);
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
            	              		"EString");
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
            if ( state.backtracking>0 ) { memoize(input, 84, ruleKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3277:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleTypedKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3278:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3279:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation6943);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation6953); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, entryRuleTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3286:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3289:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3290:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3290:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3290:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleTypedKeyStringValueAnnotation6990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3294:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3295:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3295:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3296:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation7011);
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleTypedKeyStringValueAnnotation7023); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3316:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3317:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3317:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3318:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation7044);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleTypedKeyStringValueAnnotation7056); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3338:1: ( (lv_values_5_0= ruleEString ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3339:1: (lv_values_5_0= ruleEString )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3339:1: (lv_values_5_0= ruleEString )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3340:3: lv_values_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation7077);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3356:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==22) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3356:4: otherlv_6= ',' ( (lv_values_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleTypedKeyStringValueAnnotation7090); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3360:1: ( (lv_values_7_0= ruleEString ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3361:1: (lv_values_7_0= ruleEString )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3361:1: (lv_values_7_0= ruleEString )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3362:3: lv_values_7_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation7111);
            	    lv_values_7_0=ruleEString();

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
            	              		"EString");
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
            if ( state.backtracking>0 ) { memoize(input, 86, ruleTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3386:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleQuotedKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3387:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3388:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleQuotedKeyStringValueAnnotation_in_entryRuleQuotedKeyStringValueAnnotation7149);
            iv_ruleQuotedKeyStringValueAnnotation=ruleQuotedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuotedKeyStringValueAnnotation7159); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, entryRuleQuotedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3395:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3398:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3399:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3399:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3399:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleQuotedKeyStringValueAnnotation7196); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3403:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3404:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3404:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3405:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleQuotedKeyStringValueAnnotation7217);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3421:2: ( (lv_values_2_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3422:1: (lv_values_2_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3422:1: (lv_values_2_0= RULE_STRING )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3423:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation7234); if (state.failed) return current;
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
                      		"STRING");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3439:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==22) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3439:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleQuotedKeyStringValueAnnotation7252); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3443:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3444:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3444:1: (lv_values_4_0= RULE_STRING )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3445:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation7269); if (state.failed) return current;
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
            	              		"STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
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
            if ( state.backtracking>0 ) { memoize(input, 88, ruleQuotedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleQuotedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3469:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleQuotedTypedKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3470:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3471:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_entryRuleQuotedTypedKeyStringValueAnnotation7312);
            iv_ruleQuotedTypedKeyStringValueAnnotation=ruleQuotedTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuotedTypedKeyStringValueAnnotation7322); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, entryRuleQuotedTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3478:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3481:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3482:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3482:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3482:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleQuotedTypedKeyStringValueAnnotation7359); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3486:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3487:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3487:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3488:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation7380);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleQuotedTypedKeyStringValueAnnotation7392); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3508:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3509:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3509:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3510:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation7413);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleQuotedTypedKeyStringValueAnnotation7425); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3530:1: ( (lv_values_5_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3531:1: (lv_values_5_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3531:1: (lv_values_5_0= RULE_STRING )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3532:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation7442); if (state.failed) return current;
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
                      		"STRING");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3548:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==22) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3548:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleQuotedTypedKeyStringValueAnnotation7460); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3552:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3553:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3553:1: (lv_values_7_0= RULE_STRING )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3554:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation7477); if (state.failed) return current;
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
            	              		"STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
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
            if ( state.backtracking>0 ) { memoize(input, 90, ruleQuotedTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3578:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyBooleanValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3579:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3580:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation7520);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation7530); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, entryRuleKeyBooleanValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyBooleanValueAnnotation"


    // $ANTLR start "ruleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3587:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyBooleanValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3590:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3591:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3591:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3591:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleKeyBooleanValueAnnotation7567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3595:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3596:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3596:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3597:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation7588);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3613:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3614:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3614:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3615:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation7605); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 92, ruleKeyBooleanValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyBooleanValueAnnotation"


    // $ANTLR start "entryRuleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3639:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyIntValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3640:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3641:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation7646);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation7656); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, entryRuleKeyIntValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyIntValueAnnotation"


    // $ANTLR start "ruleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3648:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyIntValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3651:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3652:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3652:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3652:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleKeyIntValueAnnotation7693); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3656:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3657:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3657:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3658:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation7714);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3674:2: ( (lv_value_2_0= ruleInteger ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3675:1: (lv_value_2_0= ruleInteger )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3675:1: (lv_value_2_0= ruleInteger )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3676:3: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation7735);
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
            if ( state.backtracking>0 ) { memoize(input, 94, ruleKeyIntValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyIntValueAnnotation"


    // $ANTLR start "entryRuleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3700:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyFloatValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3701:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3702:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation7771);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation7781); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, entryRuleKeyFloatValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyFloatValueAnnotation"


    // $ANTLR start "ruleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3709:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyFloatValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3712:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3713:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3713:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3713:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleKeyFloatValueAnnotation7818); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3717:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3718:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3718:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3719:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation7839);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3735:2: ( (lv_value_2_0= ruleFloateger ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3736:1: (lv_value_2_0= ruleFloateger )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3736:1: (lv_value_2_0= ruleFloateger )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3737:3: lv_value_2_0= ruleFloateger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation7860);
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
            if ( state.backtracking>0 ) { memoize(input, 96, ruleKeyFloatValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyFloatValueAnnotation"


    // $ANTLR start "entryRuleEString"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3763:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;
        int entryRuleEString_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3764:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3765:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString7899);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString7910); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, entryRuleEString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3772:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleEString_StartIndex = input.index();
        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3775:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3776:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3776:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_STRING) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_ID) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3776:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString7950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3785:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAccess().getExtendedIDParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_ruleEString7983);
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
            if ( state.backtracking>0 ) { memoize(input, 98, ruleEString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3803:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;
        int entryRuleExtendedID_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3804:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3805:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID8029);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID8040); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 99, entryRuleExtendedID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3812:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleExtendedID_StartIndex = input.index();
        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3815:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3816:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3816:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3816:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID8080); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3823:1: (kw= '.' this_ID_2= RULE_ID )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==36) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3824:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,36,FOLLOW_36_in_ruleExtendedID8099); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID8114); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3836:3: (kw= '#' this_INT_4= RULE_INT )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==37) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3837:2: kw= '#' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleExtendedID8135); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
                          
                    }
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExtendedID8150); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 100, ruleExtendedID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleInteger"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3857:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;
        int entryRuleInteger_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3858:2: (iv_ruleInteger= ruleInteger EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3859:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger8198);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger8209); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, entryRuleInteger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3866:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleInteger_StartIndex = input.index();
        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3869:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3870:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3870:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3870:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3870:2: (kw= '-' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==38) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3871:2: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleInteger8248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInteger8265); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 102, ruleInteger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleFloateger"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3891:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;
        int entryRuleFloateger_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3892:2: (iv_ruleFloateger= ruleFloateger EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3893:2: iv_ruleFloateger= ruleFloateger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloategerRule()); 
            }
            pushFollow(FOLLOW_ruleFloateger_in_entryRuleFloateger8311);
            iv_ruleFloateger=ruleFloateger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloateger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloateger8322); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 103, entryRuleFloateger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFloateger"


    // $ANTLR start "ruleFloateger"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3900:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFloateger_StartIndex = input.index();
        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3903:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3904:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3904:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3904:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3904:2: (kw= '-' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==38) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3905:2: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleFloateger8361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloateger8378); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 104, ruleFloateger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFloateger"


    // $ANTLR start "ruleAssignOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3925:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) ) ;
    public final Enumerator ruleAssignOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleAssignOperator_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3927:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3928:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3928:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) )
            int alt64=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt64=1;
                }
                break;
            case 39:
                {
                alt64=2;
                }
                break;
            case 40:
                {
                alt64=3;
                }
                break;
            case 41:
                {
                alt64=4;
                }
                break;
            case 42:
                {
                alt64=5;
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3928:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3928:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3928:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_26_in_ruleAssignOperator8437); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3934:6: (enumLiteral_1= '+=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3934:6: (enumLiteral_1= '+=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3934:8: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_39_in_ruleAssignOperator8454); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3940:6: (enumLiteral_2= '-=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3940:6: (enumLiteral_2= '-=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3940:8: enumLiteral_2= '-='
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_40_in_ruleAssignOperator8471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3946:6: (enumLiteral_3= '*=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3946:6: (enumLiteral_3= '*=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3946:8: enumLiteral_3= '*='
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_41_in_ruleAssignOperator8488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3952:6: (enumLiteral_4= '/=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3952:6: (enumLiteral_4= '/=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3952:8: enumLiteral_4= '/='
                    {
                    enumLiteral_4=(Token)match(input,42,FOLLOW_42_in_ruleAssignOperator8505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4()); 
                          
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
            if ( state.backtracking>0 ) { memoize(input, 105, ruleAssignOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAssignOperator"


    // $ANTLR start "rulePostfixOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3962:1: rulePostfixOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator rulePostfixOperator() throws RecognitionException {
        Enumerator current = null;
        int rulePostfixOperator_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3964:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3965:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3965:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==43) ) {
                alt65=1;
            }
            else if ( (LA65_0==44) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3965:2: (enumLiteral_0= '++' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3965:2: (enumLiteral_0= '++' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3965:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_rulePostfixOperator8550); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3971:6: (enumLiteral_1= '--' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3971:6: (enumLiteral_1= '--' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3971:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_rulePostfixOperator8567); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 106, rulePostfixOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePostfixOperator"


    // $ANTLR start "ruleCompareOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3981:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3983:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3984:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3984:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt66=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt66=1;
                }
                break;
            case 30:
                {
                alt66=2;
                }
                break;
            case 46:
                {
                alt66=3;
                }
                break;
            case 32:
                {
                alt66=4;
                }
                break;
            case 47:
                {
                alt66=5;
                }
                break;
            case 48:
                {
                alt66=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3984:2: (enumLiteral_0= '==' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3984:2: (enumLiteral_0= '==' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3984:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_45_in_ruleCompareOperator8612); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3990:6: (enumLiteral_1= '<' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3990:6: (enumLiteral_1= '<' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3990:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_30_in_ruleCompareOperator8629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3996:6: (enumLiteral_2= '<=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3996:6: (enumLiteral_2= '<=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3996:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_46_in_ruleCompareOperator8646); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4002:6: (enumLiteral_3= '>' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4002:6: (enumLiteral_3= '>' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4002:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_32_in_ruleCompareOperator8663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4008:6: (enumLiteral_4= '>=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4008:6: (enumLiteral_4= '>=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4008:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,47,FOLLOW_47_in_ruleCompareOperator8680); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4014:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4014:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4014:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,48,FOLLOW_48_in_ruleCompareOperator8697); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 107, ruleCompareOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rulePreOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4024:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;
        int rulePreOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4026:28: ( (enumLiteral_0= 'pre' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4027:1: (enumLiteral_0= 'pre' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4027:1: (enumLiteral_0= 'pre' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4027:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_rulePreOperator8741); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 108, rulePreOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePreOperator"


    // $ANTLR start "ruleBitwiseOrOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4037:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleBitwiseOrOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4039:28: ( (enumLiteral_0= '|' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4040:1: (enumLiteral_0= '|' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4040:1: (enumLiteral_0= '|' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4040:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_ruleBitwiseOrOperator8784); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 109, ruleBitwiseOrOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseOrOperator"


    // $ANTLR start "ruleBitwiseAndOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4050:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleBitwiseAndOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4052:28: ( (enumLiteral_0= '&' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4053:1: (enumLiteral_0= '&' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4053:1: (enumLiteral_0= '&' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4053:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,34,FOLLOW_34_in_ruleBitwiseAndOperator8827); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 110, ruleBitwiseAndOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseAndOperator"


    // $ANTLR start "ruleNotOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4063:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleNotOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4065:28: ( (enumLiteral_0= '!' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4066:1: (enumLiteral_0= '!' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4066:1: (enumLiteral_0= '!' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4066:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,33,FOLLOW_33_in_ruleNotOperator8870); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 111, ruleNotOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "ruleAddOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4076:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleAddOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4078:28: ( (enumLiteral_0= '+' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4079:1: (enumLiteral_0= '+' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4079:1: (enumLiteral_0= '+' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4079:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleAddOperator8913); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 112, ruleAddOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "ruleSubOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4089:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleSubOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4091:28: ( (enumLiteral_0= '-' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4092:1: (enumLiteral_0= '-' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4092:1: (enumLiteral_0= '-' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4092:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,38,FOLLOW_38_in_ruleSubOperator8956); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 113, ruleSubOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubOperator"


    // $ANTLR start "ruleMultOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4102:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleMultOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4104:28: ( (enumLiteral_0= '*' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4105:1: (enumLiteral_0= '*' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4105:1: (enumLiteral_0= '*' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4105:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_ruleMultOperator8999); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 114, ruleMultOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMultOperator"


    // $ANTLR start "ruleModOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4115:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleModOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4117:28: ( (enumLiteral_0= '%' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4118:1: (enumLiteral_0= '%' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4118:1: (enumLiteral_0= '%' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4118:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_ruleModOperator9042); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 115, ruleModOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModOperator"


    // $ANTLR start "ruleDivOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4128:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleDivOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4130:28: ( (enumLiteral_0= '/' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4131:1: (enumLiteral_0= '/' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4131:1: (enumLiteral_0= '/' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4131:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleDivOperator9085); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 116, ruleDivOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDivOperator"


    // $ANTLR start "ruleValOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4141:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleValOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4143:28: ( (enumLiteral_0= 'val' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4144:1: (enumLiteral_0= 'val' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4144:1: (enumLiteral_0= 'val' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4144:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleValOperator9128); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 117, ruleValOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValOperator"


    // $ANTLR start "ruleLogicalOrOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4154:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleLogicalOrOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4156:28: ( (enumLiteral_0= '||' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4157:1: (enumLiteral_0= '||' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4157:1: (enumLiteral_0= '||' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4157:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleLogicalOrOperator9171); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 118, ruleLogicalOrOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4167:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleLogicalAndOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4169:28: ( (enumLiteral_0= '&&' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4170:1: (enumLiteral_0= '&&' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4170:1: (enumLiteral_0= '&&' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4170:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleLogicalAndOperator9214); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 119, ruleLogicalAndOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleValueType"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4184:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4186:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4187:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4187:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            int alt67=7;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt67=1;
                }
                break;
            case 59:
                {
                alt67=2;
                }
                break;
            case 60:
                {
                alt67=3;
                }
                break;
            case 61:
                {
                alt67=4;
                }
                break;
            case 62:
                {
                alt67=5;
                }
                break;
            case 63:
                {
                alt67=6;
                }
                break;
            case 64:
                {
                alt67=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4187:2: (enumLiteral_0= 'pure' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4187:2: (enumLiteral_0= 'pure' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4187:4: enumLiteral_0= 'pure'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleValueType9262); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4193:6: (enumLiteral_1= 'bool' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4193:6: (enumLiteral_1= 'bool' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4193:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleValueType9279); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4199:6: (enumLiteral_2= 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4199:6: (enumLiteral_2= 'unsigned' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4199:8: enumLiteral_2= 'unsigned'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_60_in_ruleValueType9296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4205:6: (enumLiteral_3= 'int' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4205:6: (enumLiteral_3= 'int' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4205:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_61_in_ruleValueType9313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4211:6: (enumLiteral_4= 'float' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4211:6: (enumLiteral_4= 'float' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4211:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,62,FOLLOW_62_in_ruleValueType9330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4217:6: (enumLiteral_5= 'string' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4217:6: (enumLiteral_5= 'string' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4217:8: enumLiteral_5= 'string'
                    {
                    enumLiteral_5=(Token)match(input,63,FOLLOW_63_in_ruleValueType9347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4223:6: (enumLiteral_6= 'host' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4223:6: (enumLiteral_6= 'host' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4223:8: enumLiteral_6= 'host'
                    {
                    enumLiteral_6=(Token)match(input,64,FOLLOW_64_in_ruleValueType9364); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 120, ruleValueType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "ruleCombineOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4235:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4237:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4238:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4238:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt68=8;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt68=1;
                }
                break;
            case 51:
                {
                alt68=2;
                }
                break;
            case 52:
                {
                alt68=3;
                }
                break;
            case 66:
                {
                alt68=4;
                }
                break;
            case 67:
                {
                alt68=5;
                }
                break;
            case 50:
                {
                alt68=6;
                }
                break;
            case 34:
                {
                alt68=7;
                }
                break;
            case 64:
                {
                alt68=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4238:2: (enumLiteral_0= 'none' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4238:2: (enumLiteral_0= 'none' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4238:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleCombineOperator9411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4244:6: (enumLiteral_1= '+' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4244:6: (enumLiteral_1= '+' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4244:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_51_in_ruleCombineOperator9428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4250:6: (enumLiteral_2= '*' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4250:6: (enumLiteral_2= '*' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4250:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_52_in_ruleCombineOperator9445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4256:6: (enumLiteral_3= 'max' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4256:6: (enumLiteral_3= 'max' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4256:8: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_66_in_ruleCombineOperator9462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4262:6: (enumLiteral_4= 'min' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4262:6: (enumLiteral_4= 'min' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4262:8: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_67_in_ruleCombineOperator9479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4268:6: (enumLiteral_5= '|' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4268:6: (enumLiteral_5= '|' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4268:8: enumLiteral_5= '|'
                    {
                    enumLiteral_5=(Token)match(input,50,FOLLOW_50_in_ruleCombineOperator9496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4274:6: (enumLiteral_6= '&' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4274:6: (enumLiteral_6= '&' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4274:8: enumLiteral_6= '&'
                    {
                    enumLiteral_6=(Token)match(input,34,FOLLOW_34_in_ruleCombineOperator9513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4280:6: (enumLiteral_7= 'host' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4280:6: (enumLiteral_7= 'host' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4280:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,64,FOLLOW_64_in_ruleCombineOperator9530); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 121, ruleCombineOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCombineOperator"

    // $ANTLR start synpred2_InternalKEXT
    public final void synpred2_InternalKEXT_fragment() throws RecognitionException {   
        EObject lv_expressions_1_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:106:4: ( ( (lv_expressions_1_0= ruleAnnotatedExpression ) ) )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:106:4: ( (lv_expressions_1_0= ruleAnnotatedExpression ) )
        {
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:106:4: ( (lv_expressions_1_0= ruleAnnotatedExpression ) )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:107:1: (lv_expressions_1_0= ruleAnnotatedExpression )
        {
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:107:1: (lv_expressions_1_0= ruleAnnotatedExpression )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:108:3: lv_expressions_1_0= ruleAnnotatedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getKextAccess().getExpressionsAnnotatedExpressionParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAnnotatedExpression_in_synpred2_InternalKEXT167);
        lv_expressions_1_0=ruleAnnotatedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred2_InternalKEXT

    // $ANTLR start synpred3_InternalKEXT
    public final void synpred3_InternalKEXT_fragment() throws RecognitionException {   
        EObject lv_effects_2_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:125:6: ( ( (lv_effects_2_0= ruleEffect ) ) )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:125:6: ( (lv_effects_2_0= ruleEffect ) )
        {
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:125:6: ( (lv_effects_2_0= ruleEffect ) )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:126:1: (lv_effects_2_0= ruleEffect )
        {
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:126:1: (lv_effects_2_0= ruleEffect )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:127:3: lv_effects_2_0= ruleEffect
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getKextAccess().getEffectsEffectParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEffect_in_synpred3_InternalKEXT194);
        lv_effects_2_0=ruleEffect();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalKEXT

    // $ANTLR start synpred16_InternalKEXT
    public final void synpred16_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_Assignment_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:527:2: (this_Assignment_0= ruleAssignment )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:527:2: this_Assignment_0= ruleAssignment
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleAssignment_in_synpred16_InternalKEXT1016);
        this_Assignment_0=ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalKEXT

    // $ANTLR start synpred17_InternalKEXT
    public final void synpred17_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_PostfixEffect_1 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:540:2: (this_PostfixEffect_1= rulePostfixEffect )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:540:2: this_PostfixEffect_1= rulePostfixEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulePostfixEffect_in_synpred17_InternalKEXT1046);
        this_PostfixEffect_1=rulePostfixEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalKEXT

    // $ANTLR start synpred18_InternalKEXT
    public final void synpred18_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_Emission_2 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:553:2: (this_Emission_2= ruleEmission )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:553:2: this_Emission_2= ruleEmission
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleEmission_in_synpred18_InternalKEXT1076);
        this_Emission_2=ruleEmission();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalKEXT

    // $ANTLR start synpred19_InternalKEXT
    public final void synpred19_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_HostcodeEffect_3 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:566:2: (this_HostcodeEffect_3= ruleHostcodeEffect )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:566:2: this_HostcodeEffect_3= ruleHostcodeEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleHostcodeEffect_in_synpred19_InternalKEXT1106);
        this_HostcodeEffect_3=ruleHostcodeEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalKEXT

    // $ANTLR start synpred31_InternalKEXT
    public final void synpred31_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1086:2: (this_BoolExpression_0= ruleBoolExpression )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1086:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleBoolExpression_in_synpred31_InternalKEXT2148);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalKEXT

    // $ANTLR start synpred41_InternalKEXT
    public final void synpred41_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1555:2: (this_ValuedExpression_0= ruleValuedExpression )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1555:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred41_InternalKEXT3138);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalKEXT

    // $ANTLR start synpred56_InternalKEXT
    public final void synpred56_InternalKEXT_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2313:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2313:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2313:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2313:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,28,FOLLOW_28_in_synpred56_InternalKEXT4749); if (state.failed) return ;
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred56_InternalKEXT4774);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,29,FOLLOW_29_in_synpred56_InternalKEXT4785); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred56_InternalKEXT

    // Delegated rules

    public final boolean synpred18_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA54 dfa54 = new DFA54(this);
    static final String DFA1_eotS =
        "\110\uffff";
    static final String DFA1_eofS =
        "\1\3\11\uffff\1\3\75\uffff";
    static final String DFA1_minS =
        "\3\4\2\uffff\2\4\2\5\11\4\1\5\2\4\1\31\6\4\1\5\4\4\1\5\2\31\7\4"+
        "\1\5\2\4\2\5\15\4\1\31\1\4\1\5\1\4\1\5\3\4\2\31\1\4";
    static final String DFA1_maxS =
        "\2\100\1\4\2\uffff\1\100\1\4\1\5\1\7\5\100\1\4\2\100\1\4\1\5\2"+
        "\11\1\45\5\100\1\4\1\5\1\11\1\100\2\4\1\5\1\45\1\31\5\100\1\11\1"+
        "\4\1\5\1\11\1\4\1\5\1\7\5\100\1\4\7\100\1\45\1\4\1\5\1\4\1\5\1\11"+
        "\2\100\1\45\1\31\1\100";
    static final String DFA1_acceptS =
        "\3\uffff\1\2\1\1\103\uffff";
    static final String DFA1_specialS =
        "\110\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\1\uffff\1\3\3\uffff\1\1\5\uffff\1\3\5\4\10\uffff\1\3\4"+
            "\uffff\1\2\26\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\1\5\uffff\1\3\5\4\10\uffff\1\3"+
            "\4\uffff\1\2\26\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\12\1\14\1\3\1\11\1\13\1\15\1\1\5\uffff\1\3\5\4\2\uffff"+
            "\1\16\5\uffff\1\3\4\uffff\1\2\1\6\1\7\1\10\23\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\14\1\uffff\1\11",
            "\1\3\1\uffff\1\3\3\uffff\1\1\5\uffff\1\3\5\4\10\uffff\1\3"+
            "\4\uffff\1\2\26\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\1\5\uffff\1\3\5\4\1\23\1\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\4\uffff\1\2\1\21\1"+
            "\22\1\uffff\6\3\15\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\1\5\uffff\1\3\5\4\10\uffff\1\3"+
            "\4\uffff\1\2\26\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\1\5\uffff\1\3\5\4\10\uffff\1\3"+
            "\4\uffff\1\2\26\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\1\5\uffff\1\3\5\4\1\24\7\uffff"+
            "\1\3\4\uffff\1\2\26\uffff\7\4",
            "\1\25",
            "\1\12\1\14\1\3\1\11\1\13\1\15\1\1\5\uffff\1\3\5\4\2\uffff"+
            "\1\16\5\uffff\1\3\4\uffff\1\2\1\6\1\7\1\10\23\uffff\7\4",
            "\1\12\1\14\1\3\1\11\1\13\1\15\1\1\5\uffff\1\3\5\4\2\uffff"+
            "\1\16\5\uffff\1\3\4\uffff\1\2\2\uffff\1\10\23\uffff\7\4",
            "\1\26",
            "\1\27",
            "\1\31\4\uffff\1\30",
            "\1\31\4\uffff\1\32",
            "\1\35\12\uffff\1\33\1\34",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\1\23\7\uffff"+
            "\1\3\4\uffff\1\37\1\21\1\22\24\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\1\23\7\uffff"+
            "\1\3\4\uffff\1\37\26\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\1\23\7\uffff"+
            "\1\3\4\uffff\1\37\26\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\1\23\7\uffff"+
            "\1\3\4\uffff\1\37\1\40\1\41\24\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\1\5\uffff\1\3\5\4\1\24\7\uffff"+
            "\1\3\4\uffff\1\2\26\uffff\7\4",
            "\1\42",
            "\1\43",
            "\1\45\4\uffff\1\44",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\10\uffff\1\3"+
            "\4\uffff\1\37\26\uffff\7\4",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\35\12\uffff\1\33\1\34",
            "\1\35",
            "\1\3\1\uffff\1\3\3\uffff\1\1\5\uffff\1\3\5\4\1\51\7\uffff"+
            "\1\3\4\uffff\1\2\26\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\1\54\7\uffff"+
            "\1\3\4\uffff\1\37\1\52\1\53\24\uffff\7\4",
            "\1\61\1\63\1\3\1\60\1\62\1\64\1\36\5\uffff\1\3\5\4\2\uffff"+
            "\1\65\5\uffff\1\3\4\uffff\1\37\1\55\1\56\1\57\23\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\1\23\7\uffff"+
            "\1\3\4\uffff\1\37\1\40\1\41\24\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\1\23\7\uffff"+
            "\1\3\4\uffff\1\37\26\uffff\7\4",
            "\1\67\4\uffff\1\66",
            "\1\70",
            "\1\71",
            "\1\67\4\uffff\1\72",
            "\1\73",
            "\1\74",
            "\1\63\1\uffff\1\60",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\10\uffff\1\3"+
            "\4\uffff\1\37\26\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\1\23\1\uffff"+
            "\1\3\1\uffff\1\3\3\uffff\1\3\4\uffff\1\37\1\21\1\22\1\uffff"+
            "\6\3\15\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\10\uffff\1\3"+
            "\4\uffff\1\37\26\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\10\uffff\1\3"+
            "\4\uffff\1\37\26\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\1\23\7\uffff"+
            "\1\3\4\uffff\1\37\26\uffff\7\4",
            "\1\75",
            "\1\3\1\uffff\1\3\3\uffff\1\1\5\uffff\1\3\5\4\1\51\7\uffff"+
            "\1\3\4\uffff\1\2\26\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\1\54\7\uffff"+
            "\1\3\4\uffff\1\37\1\76\1\77\24\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\1\54\7\uffff"+
            "\1\3\4\uffff\1\37\1\52\1\53\24\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\1\54\7\uffff"+
            "\1\3\4\uffff\1\37\26\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\1\54\7\uffff"+
            "\1\3\4\uffff\1\37\26\uffff\7\4",
            "\1\61\1\63\1\3\1\60\1\62\1\64\1\36\5\uffff\1\3\5\4\2\uffff"+
            "\1\65\5\uffff\1\3\4\uffff\1\37\1\55\1\56\1\57\23\uffff\7\4",
            "\1\61\1\63\1\3\1\60\1\62\1\64\1\36\5\uffff\1\3\5\4\2\uffff"+
            "\1\65\5\uffff\1\3\4\uffff\1\37\2\uffff\1\57\23\uffff\7\4",
            "\1\102\12\uffff\1\100\1\101",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\45\4\uffff\1\107",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\1\54\7\uffff"+
            "\1\3\4\uffff\1\37\1\76\1\77\24\uffff\7\4",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\1\54\7\uffff"+
            "\1\3\4\uffff\1\37\26\uffff\7\4",
            "\1\102\12\uffff\1\100\1\101",
            "\1\102",
            "\1\3\1\uffff\1\3\3\uffff\1\36\5\uffff\1\3\5\4\1\54\7\uffff"+
            "\1\3\4\uffff\1\37\26\uffff\7\4"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 88:2: ( (lv_declarations_0_0= ruleDeclaration ) )*";
        }
    }
    static final String DFA2_eotS =
        "\111\uffff";
    static final String DFA2_eofS =
        "\1\1\110\uffff";
    static final String DFA2_minS =
        "\1\4\1\uffff\2\4\2\uffff\2\4\1\5\1\0\1\4\1\5\7\4\1\31\3\4\1\5\2"+
        "\4\1\5\3\4\2\31\10\4\1\5\2\4\1\5\2\4\1\5\14\4\1\5\1\31\1\4\1\5\3"+
        "\4\1\5\3\4\2\31\1\4";
    static final String DFA2_maxS =
        "\1\43\1\uffff\1\43\1\4\2\uffff\1\46\1\4\1\5\1\0\1\43\1\7\2\43\1"+
        "\4\1\43\2\46\1\11\1\45\1\43\1\45\1\4\1\5\1\11\1\4\1\5\1\43\1\4\1"+
        "\11\1\45\1\31\1\43\2\45\1\43\1\46\1\43\1\11\1\4\1\5\1\11\1\4\1\5"+
        "\1\43\1\54\1\7\3\43\1\4\1\43\2\45\2\43\2\46\1\4\1\5\1\45\1\4\1\5"+
        "\1\45\1\43\1\4\1\5\1\11\1\45\1\43\1\45\1\31\1\43";
    static final String DFA2_acceptS =
        "\1\uffff\1\3\2\uffff\1\1\1\2\103\uffff";
    static final String DFA2_specialS =
        "\11\uffff\1\0\77\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\5\1\uffff\1\5\3\uffff\1\2\5\uffff\1\4\15\uffff\1\5\4\uffff"+
            "\1\3",
            "",
            "\1\5\1\uffff\1\5\3\uffff\1\2\5\uffff\1\4\15\uffff\1\5\4\uffff"+
            "\1\3",
            "\1\6",
            "",
            "",
            "\1\11\1\17\1\5\1\14\1\12\1\15\1\2\5\uffff\1\4\7\uffff\1\16"+
            "\5\uffff\1\5\4\uffff\1\3\1\7\1\10\1\13",
            "\1\20",
            "\1\21",
            "\1\uffff",
            "\1\5\1\uffff\1\5\3\uffff\1\2\5\uffff\1\4\15\uffff\1\5\4\uffff"+
            "\1\3",
            "\1\17\1\uffff\1\14",
            "\1\5\1\uffff\1\5\3\uffff\1\2\5\uffff\1\4\15\uffff\1\5\4\uffff"+
            "\1\3",
            "\1\5\1\uffff\1\5\3\uffff\1\2\5\uffff\1\4\5\uffff\1\22\7\uffff"+
            "\1\5\4\uffff\1\3",
            "\1\23",
            "\1\5\1\uffff\1\5\3\uffff\1\2\5\uffff\1\4\15\uffff\1\5\4\uffff"+
            "\1\3",
            "\1\11\1\17\1\5\1\14\1\12\1\15\1\2\5\uffff\1\4\7\uffff\1\16"+
            "\5\uffff\1\5\4\uffff\1\3\1\7\1\10\1\13",
            "\1\11\1\17\1\5\1\14\1\12\1\15\1\2\5\uffff\1\4\7\uffff\1\16"+
            "\5\uffff\1\5\4\uffff\1\3\2\uffff\1\13",
            "\1\25\4\uffff\1\24",
            "\1\30\12\uffff\1\26\1\27",
            "\1\5\1\uffff\1\5\3\uffff\1\2\5\uffff\1\4\5\uffff\1\22\7\uffff"+
            "\1\5\4\uffff\1\3",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\5\uffff\1\35\7\uffff"+
            "\1\5\4\uffff\1\34\1\31\1\32",
            "\1\36",
            "\1\37",
            "\1\41\4\uffff\1\40",
            "\1\42",
            "\1\43",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\15\uffff\1\5\4\uffff"+
            "\1\34",
            "\1\44",
            "\1\25\4\uffff\1\45",
            "\1\30\12\uffff\1\26\1\27",
            "\1\30",
            "\1\5\1\uffff\1\5\3\uffff\1\2\5\uffff\1\4\5\uffff\1\46\7\uffff"+
            "\1\5\4\uffff\1\3",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\5\uffff\1\51\7\uffff"+
            "\1\5\4\uffff\1\34\1\47\1\50",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\5\uffff\1\35\7\uffff"+
            "\1\5\4\uffff\1\34\1\31\1\32",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\5\uffff\1\35\7\uffff"+
            "\1\5\4\uffff\1\34",
            "\1\55\1\61\1\5\1\57\1\54\1\60\1\33\5\uffff\1\4\7\uffff\1\62"+
            "\5\uffff\1\5\4\uffff\1\34\1\52\1\53\1\56",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\5\uffff\1\35\7\uffff"+
            "\1\5\4\uffff\1\34",
            "\1\64\4\uffff\1\63",
            "\1\65",
            "\1\66",
            "\1\64\4\uffff\1\67",
            "\1\70",
            "\1\71",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\15\uffff\1\5\4\uffff"+
            "\1\34",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\5\uffff\1\35\1\uffff"+
            "\1\5\1\uffff\1\5\3\uffff\1\5\4\uffff\1\34\1\72\1\73\1\uffff"+
            "\6\5",
            "\1\61\1\uffff\1\57",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\15\uffff\1\5\4\uffff"+
            "\1\34",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\5\uffff\1\35\7\uffff"+
            "\1\5\4\uffff\1\34",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\15\uffff\1\5\4\uffff"+
            "\1\34",
            "\1\74",
            "\1\5\1\uffff\1\5\3\uffff\1\2\5\uffff\1\4\5\uffff\1\46\7\uffff"+
            "\1\5\4\uffff\1\3",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\5\uffff\1\51\7\uffff"+
            "\1\5\4\uffff\1\34\1\75\1\76",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\5\uffff\1\51\7\uffff"+
            "\1\5\4\uffff\1\34\1\47\1\50",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\5\uffff\1\51\7\uffff"+
            "\1\5\4\uffff\1\34",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\5\uffff\1\51\7\uffff"+
            "\1\5\4\uffff\1\34",
            "\1\55\1\61\1\5\1\57\1\54\1\60\1\33\5\uffff\1\4\7\uffff\1\62"+
            "\5\uffff\1\5\4\uffff\1\34\1\52\1\53\1\56",
            "\1\55\1\61\1\5\1\57\1\54\1\60\1\33\5\uffff\1\4\7\uffff\1\62"+
            "\5\uffff\1\5\4\uffff\1\34\2\uffff\1\56",
            "\1\77",
            "\1\100",
            "\1\103\12\uffff\1\101\1\102",
            "\1\104",
            "\1\105",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\5\uffff\1\35\7\uffff"+
            "\1\5\4\uffff\1\34\1\72\1\73",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\5\uffff\1\35\7\uffff"+
            "\1\5\4\uffff\1\34",
            "\1\106",
            "\1\107",
            "\1\41\4\uffff\1\110",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\5\uffff\1\51\7\uffff"+
            "\1\5\4\uffff\1\34\1\75\1\76",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\5\uffff\1\51\7\uffff"+
            "\1\5\4\uffff\1\34",
            "\1\103\12\uffff\1\101\1\102",
            "\1\103",
            "\1\5\1\uffff\1\5\3\uffff\1\33\5\uffff\1\4\5\uffff\1\51\7\uffff"+
            "\1\5\4\uffff\1\34"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 106:3: ( ( (lv_expressions_1_0= ruleAnnotatedExpression ) ) | ( (lv_effects_2_0= ruleEffect ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_9 = input.LA(1);

                         
                        int index2_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKEXT()) ) {s = 4;}

                        else if ( (synpred3_InternalKEXT()) ) {s = 5;}

                         
                        input.seek(index2_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\16\uffff";
    static final String DFA26_eofS =
        "\16\uffff";
    static final String DFA26_minS =
        "\1\4\13\0\2\uffff";
    static final String DFA26_maxS =
        "\1\67\13\0\2\uffff";
    static final String DFA26_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA26_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\11\1\2\1\13\1\3\1\6\1\4\22\uffff\1\5\1\uffff\1\12\2\uffff"+
            "\1\14\4\uffff\1\1\12\uffff\1\7\5\uffff\1\10",
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
            return "1085:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
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
                        if ( (synpred31_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index26_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_3 = input.LA(1);

                         
                        int index26_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index26_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_4 = input.LA(1);

                         
                        int index26_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index26_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_5 = input.LA(1);

                         
                        int index26_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index26_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_6 = input.LA(1);

                         
                        int index26_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index26_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_7 = input.LA(1);

                         
                        int index26_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index26_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA26_8 = input.LA(1);

                         
                        int index26_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index26_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA26_9 = input.LA(1);

                         
                        int index26_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index26_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA26_10 = input.LA(1);

                         
                        int index26_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index26_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA26_11 = input.LA(1);

                         
                        int index26_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index26_11);
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
    static final String DFA36_eotS =
        "\15\uffff";
    static final String DFA36_eofS =
        "\15\uffff";
    static final String DFA36_minS =
        "\1\4\4\uffff\7\0\1\uffff";
    static final String DFA36_maxS =
        "\1\67\4\uffff\7\0\1\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\12\uffff\1\2";
    static final String DFA36_specialS =
        "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\11\1\1\1\13\1\1\1\6\1\1\22\uffff\1\5\1\uffff\1\12\2\uffff"+
            "\1\14\4\uffff\1\1\12\uffff\1\7\5\uffff\1\10",
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
            return "1554:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_5 = input.LA(1);

                         
                        int index36_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index36_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_6 = input.LA(1);

                         
                        int index36_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index36_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_7 = input.LA(1);

                         
                        int index36_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index36_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA36_8 = input.LA(1);

                         
                        int index36_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index36_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA36_9 = input.LA(1);

                         
                        int index36_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index36_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA36_10 = input.LA(1);

                         
                        int index36_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index36_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA36_11 = input.LA(1);

                         
                        int index36_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index36_11);
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
    static final String DFA45_eotS =
        "\14\uffff";
    static final String DFA45_eofS =
        "\14\uffff";
    static final String DFA45_minS =
        "\1\4\3\uffff\1\0\7\uffff";
    static final String DFA45_maxS =
        "\1\67\3\uffff\1\0\7\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\5\uffff\1\4";
    static final String DFA45_specialS =
        "\4\uffff\1\0\7\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\5\1\1\1\5\1\2\1\5\1\3\22\uffff\1\4\1\uffff\1\5\22\uffff"+
            "\1\5\5\uffff\1\5",
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

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "2274:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_4 = input.LA(1);

                         
                        int index45_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_InternalKEXT()) ) {s = 11;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index45_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\20\uffff";
    static final String DFA53_eofS =
        "\3\uffff\1\15\4\uffff\1\7\5\uffff\2\15";
    static final String DFA53_minS =
        "\1\12\1\uffff\3\4\1\5\2\uffff\1\4\1\uffff\1\5\3\uffff\2\4";
    static final String DFA53_maxS =
        "\1\43\1\uffff\1\4\1\100\1\4\1\5\2\uffff\1\100\1\uffff\1\7\3\uffff"+
        "\2\100";
    static final String DFA53_acceptS =
        "\1\uffff\1\1\4\uffff\1\4\1\2\1\uffff\1\3\1\uffff\1\6\1\5\1\7\2"+
        "\uffff";
    static final String DFA53_specialS =
        "\20\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\1\30\uffff\1\2",
            "",
            "\1\3",
            "\1\10\1\14\1\15\1\13\1\6\1\7\1\15\5\uffff\6\15\2\uffff\1\11"+
            "\5\uffff\1\15\4\uffff\1\15\1\4\1\5\1\12\23\uffff\7\15",
            "\1\16",
            "\1\17",
            "",
            "",
            "\1\7\1\uffff\1\7\3\uffff\1\7\5\uffff\7\7\1\uffff\1\15\1\uffff"+
            "\1\15\3\uffff\1\7\4\uffff\3\7\1\uffff\6\15\15\uffff\7\7",
            "",
            "\1\14\1\uffff\1\13",
            "",
            "",
            "",
            "\1\10\1\14\1\15\1\13\1\6\1\7\1\15\5\uffff\6\15\2\uffff\1\11"+
            "\5\uffff\1\15\4\uffff\1\15\1\4\1\5\1\12\23\uffff\7\15",
            "\1\10\1\14\1\15\1\13\1\6\1\7\1\15\5\uffff\6\15\2\uffff\1\11"+
            "\5\uffff\1\15\4\uffff\1\15\2\uffff\1\12\23\uffff\7\15"
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "2901:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )";
        }
    }
    static final String DFA54_eotS =
        "\17\uffff";
    static final String DFA54_eofS =
        "\3\uffff\1\14\11\uffff\2\14";
    static final String DFA54_minS =
        "\1\12\1\uffff\3\4\2\5\6\uffff\2\4";
    static final String DFA54_maxS =
        "\1\43\1\uffff\1\4\1\46\1\4\1\5\1\7\6\uffff\2\46";
    static final String DFA54_acceptS =
        "\1\uffff\1\1\5\uffff\1\6\1\2\1\5\1\3\1\4\1\7\2\uffff";
    static final String DFA54_specialS =
        "\17\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\1\30\uffff\1\2",
            "",
            "\1\3",
            "\1\14\1\11\1\uffff\1\7\1\13\1\10\1\14\15\uffff\1\12\12\uffff"+
            "\1\14\1\4\1\5\1\6",
            "\1\15",
            "\1\16",
            "\1\11\1\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\1\11\1\uffff\1\7\1\13\1\10\1\14\15\uffff\1\12\12\uffff"+
            "\1\14\1\4\1\5\1\6",
            "\1\14\1\11\1\uffff\1\7\1\13\1\10\1\14\15\uffff\1\12\12\uffff"+
            "\1\14\2\uffff\1\6"
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "3014:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )";
        }
    }
 

    public static final BitSet FOLLOW_ruleKext_in_entryRuleKext88 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKext98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleKext144 = new BitSet(new long[]{0xFC000008403F0452L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAnnotatedExpression_in_ruleKext167 = new BitSet(new long[]{0x0000000840010452L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleKext194 = new BitSet(new long[]{0x0000000840010452L});
    public static final BitSet FOLLOW_ruleAnnotatedExpression_in_entryRuleAnnotatedExpression232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotatedExpression242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotatedExpression288 = new BitSet(new long[]{0x0000000800010400L});
    public static final BitSet FOLLOW_16_in_ruleAnnotatedExpression301 = new BitSet(new long[]{0x00820042500003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAnnotatedExpression322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDeclaration414 = new BitSet(new long[]{0xFC000008003E0400L,0x0000000000000001L});
    public static final BitSet FOLLOW_17_in_ruleDeclaration433 = new BitSet(new long[]{0xFC000000003C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_18_in_ruleDeclaration465 = new BitSet(new long[]{0xFC00000000380000L,0x0000000000000001L});
    public static final BitSet FOLLOW_19_in_ruleDeclaration497 = new BitSet(new long[]{0xFC00000000300000L,0x0000000000000001L});
    public static final BitSet FOLLOW_20_in_ruleDeclaration529 = new BitSet(new long[]{0xFC00000000200000L,0x0000000000000001L});
    public static final BitSet FOLLOW_21_in_ruleDeclaration563 = new BitSet(new long[]{0xFC00000000200000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleDeclaration598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21_in_ruleDeclaration623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValuedObject_in_ruleDeclaration658 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleDeclaration671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValuedObject_in_ruleDeclaration692 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleDeclaration706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObject_in_entryRuleValuedObject742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObject752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObject794 = new BitSet(new long[]{0x000000000D000002L});
    public static final BitSet FOLLOW_24_in_ruleValuedObject812 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValuedObject829 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleValuedObject846 = new BitSet(new long[]{0x000000000D000002L});
    public static final BitSet FOLLOW_26_in_ruleValuedObject861 = new BitSet(new long[]{0x00820042500003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObject882 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleValuedObject897 = new BitSet(new long[]{0x001C000400000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleValuedObject918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixEffect_in_ruleEffect1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_ruleEffect1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostcodeEffect_in_ruleEffect1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCallEffect_in_ruleEffect1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission1171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictedAnnotation_in_ruleEmission1227 = new BitSet(new long[]{0x0000000800000410L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmission1252 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleEmission1265 = new BitSet(new long[]{0x00820042500003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEmission1286 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleEmission1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAssignment1392 = new BitSet(new long[]{0x0000000800000410L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment1417 = new BitSet(new long[]{0x0000078005000000L});
    public static final BitSet FOLLOW_24_in_ruleAssignment1430 = new BitSet(new long[]{0x00820042500003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment1451 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssignment1463 = new BitSet(new long[]{0x0000078005000000L});
    public static final BitSet FOLLOW_ruleAssignOperator_in_ruleAssignment1486 = new BitSet(new long[]{0x00820042500003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixEffect_in_entryRulePostfixEffect1543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfixEffect1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rulePostfixEffect1599 = new BitSet(new long[]{0x0000000800000410L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePostfixEffect1624 = new BitSet(new long[]{0x0000180001000000L});
    public static final BitSet FOLLOW_24_in_rulePostfixEffect1637 = new BitSet(new long[]{0x00820042500003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePostfixEffect1658 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePostfixEffect1670 = new BitSet(new long[]{0x0000180001000000L});
    public static final BitSet FOLLOW_rulePostfixOperator_in_rulePostfixEffect1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostcodeEffect_in_entryRuleHostcodeEffect1729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostcodeEffect1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleHostcodeEffect1785 = new BitSet(new long[]{0x0000000800000440L});
    public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleHostcodeEffect1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCallEffect_in_entryRuleFunctionCallEffect1844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCallEffect1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleFunctionCallEffect1900 = new BitSet(new long[]{0x0000000840000400L});
    public static final BitSet FOLLOW_30_in_ruleFunctionCallEffect1913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleFunctionCallEffect1934 = new BitSet(new long[]{0x0000000190000000L});
    public static final BitSet FOLLOW_28_in_ruleFunctionCallEffect1948 = new BitSet(new long[]{0x00820046500003F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCallEffect1969 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionCallEffect1982 = new BitSet(new long[]{0x00820046500003F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCallEffect2003 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionCallEffect2017 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31_in_ruleFunctionCallEffect2036 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleFunctionCallEffect2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleExpression2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression2213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleBoolExpression2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression2306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression2366 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression2400 = new BitSet(new long[]{0x00820042500003F0L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression2421 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression2461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression2521 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression2555 = new BitSet(new long[]{0x00820042500003F0L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression2576 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression2616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression2676 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrOperator_in_ruleBitwiseOrExpression2710 = new BitSet(new long[]{0x00820042500003F0L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression2731 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression2771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression2831 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndOperator_in_ruleBitwiseAndExpression2865 = new BitSet(new long[]{0x00820042500003F0L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression2886 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation2926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation2986 = new BitSet(new long[]{0x0001E00140000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation3019 = new BitSet(new long[]{0x00820042500003F0L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression3078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression3203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression3272 = new BitSet(new long[]{0x00820042500003F0L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression3360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression3453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression3513 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression3546 = new BitSet(new long[]{0x00820040500003F0L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression3567 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression3605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression3665 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression3698 = new BitSet(new long[]{0x00820040500003F0L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression3719 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression3757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression3817 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression3850 = new BitSet(new long[]{0x00820040500003F0L});
    public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression3871 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression3909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression3969 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression4002 = new BitSet(new long[]{0x00820040500003F0L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression4061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModExpression4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression4121 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression4154 = new BitSet(new long[]{0x00820040500003F0L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression4213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression4223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression4282 = new BitSet(new long[]{0x00820040500003F0L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression4370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolValue_in_ruleAtomicExpression4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAtomicExpression4478 = new BitSet(new long[]{0x00820042500003F0L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleAtomicExpression4503 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAtomicExpression4514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleAtomicExpression4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression4611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression4701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleAtomicValuedExpression4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAtomicValuedExpression4749 = new BitSet(new long[]{0x00820040500003F0L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression4774 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAtomicValuedExpression4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression4852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression4923 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression4942 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleValuedObjectTestExpression4957 = new BitSet(new long[]{0x0082000000000010L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression4978 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleValuedObjectTestExpression4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression5022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference5057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference5116 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleValuedObjectReference5129 = new BitSet(new long[]{0x00820042500003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObjectReference5150 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleValuedObjectReference5162 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall5200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFunctionCall5247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleFunctionCall5268 = new BitSet(new long[]{0x0000000190000000L});
    public static final BitSet FOLLOW_28_in_ruleFunctionCall5282 = new BitSet(new long[]{0x00820046500003F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall5303 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionCall5316 = new BitSet(new long[]{0x00820046500003F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall5337 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionCall5351 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31_in_ruleFunctionCall5370 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleFunctionCall5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter5420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleParameter5474 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleParameter5506 = new BitSet(new long[]{0x00820042500003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParameter5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression5578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression5588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue5669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue5720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue5760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolValue_in_entryRuleBoolValue5851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolValue5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBoolValue5902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue5942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue5952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue5993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation6035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation6045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation6095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation6185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation6215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation6245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation6275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictedAnnotation_in_entryRuleRestrictedAnnotation6312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestrictedAnnotation6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleRestrictedAnnotation6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedKeyStringValueAnnotation_in_ruleRestrictedAnnotation6402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_ruleRestrictedAnnotation6432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleRestrictedAnnotation6462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleRestrictedAnnotation6492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleRestrictedAnnotation6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleRestrictedAnnotation6552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation6587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation6597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation6638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation6678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation6688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTagAnnotation6725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation6782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation6792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleKeyStringValueAnnotation6829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation6850 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation6871 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleKeyStringValueAnnotation6884 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation6905 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation6943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation6953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTypedKeyStringValueAnnotation6990 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation7011 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTypedKeyStringValueAnnotation7023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation7044 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTypedKeyStringValueAnnotation7056 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation7077 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleTypedKeyStringValueAnnotation7090 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation7111 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleQuotedKeyStringValueAnnotation_in_entryRuleQuotedKeyStringValueAnnotation7149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuotedKeyStringValueAnnotation7159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleQuotedKeyStringValueAnnotation7196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleQuotedKeyStringValueAnnotation7217 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation7234 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQuotedKeyStringValueAnnotation7252 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation7269 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_entryRuleQuotedTypedKeyStringValueAnnotation7312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuotedTypedKeyStringValueAnnotation7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleQuotedTypedKeyStringValueAnnotation7359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation7380 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQuotedTypedKeyStringValueAnnotation7392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation7413 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleQuotedTypedKeyStringValueAnnotation7425 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation7442 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQuotedTypedKeyStringValueAnnotation7460 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation7477 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation7520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation7530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleKeyBooleanValueAnnotation7567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation7588 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation7646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleKeyIntValueAnnotation7693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation7714 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation7735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation7771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation7781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleKeyFloatValueAnnotation7818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation7839 = new BitSet(new long[]{0x0000004000000080L});
    public static final BitSet FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation7860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString7899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString7910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString7950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleEString7983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID8029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID8040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID8080 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_ruleExtendedID8099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID8114 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_37_in_ruleExtendedID8135 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExtendedID8150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger8198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger8209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleInteger8248 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInteger8265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloateger_in_entryRuleFloateger8311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloateger8322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleFloateger8361 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloateger8378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAssignOperator8437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAssignOperator8454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAssignOperator8471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAssignOperator8488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAssignOperator8505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulePostfixOperator8550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePostfixOperator8567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCompareOperator8612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCompareOperator8629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleCompareOperator8646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCompareOperator8663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleCompareOperator8680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleCompareOperator8697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePreOperator8741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleBitwiseOrOperator8784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBitwiseAndOperator8827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleNotOperator8870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAddOperator8913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleSubOperator8956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleMultOperator8999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleModOperator9042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleDivOperator9085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleValOperator9128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleLogicalOrOperator9171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleLogicalAndOperator9214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleValueType9262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleValueType9279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleValueType9296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleValueType9313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleValueType9330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleValueType9347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleValueType9364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCombineOperator9411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCombineOperator9428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCombineOperator9445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCombineOperator9462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCombineOperator9479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCombineOperator9496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCombineOperator9513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleCombineOperator9530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotatedExpression_in_synpred2_InternalKEXT167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_synpred3_InternalKEXT194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_synpred16_InternalKEXT1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixEffect_in_synpred17_InternalKEXT1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_synpred18_InternalKEXT1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostcodeEffect_in_synpred19_InternalKEXT1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_synpred31_InternalKEXT2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred41_InternalKEXT3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred56_InternalKEXT4749 = new BitSet(new long[]{0x00820040500003F0L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred56_InternalKEXT4774 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_synpred56_InternalKEXT4785 = new BitSet(new long[]{0x0000000000000002L});

}