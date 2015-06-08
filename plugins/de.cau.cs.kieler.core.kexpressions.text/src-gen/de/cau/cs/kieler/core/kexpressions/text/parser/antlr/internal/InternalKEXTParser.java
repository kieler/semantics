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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'const'", "'input'", "'output'", "'static'", "'signal'", "','", "';'", "'='", "'combine'", "'('", "')'", "'['", "']'", "'<'", "'()'", "'>'", "'&'", "'@'", "'.'", "'#'", "'-'", "'=='", "'<='", "'>='", "'!='", "'pre'", "'|'", "'!'", "'+'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'string'", "'host'", "'none'", "'max'", "'min'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
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
            this.state.ruleMemo = new HashMap[197+1];
             
             
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
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:84:1: ruleKext returns [EObject current=null] : ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_effects_1_0= ruleEffect ) )* ) ;
    public final EObject ruleKext() throws RecognitionException {
        EObject current = null;
        int ruleKext_StartIndex = input.index();
        EObject lv_declarations_0_0 = null;

        EObject lv_effects_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:87:28: ( ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_effects_1_0= ruleEffect ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:88:1: ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_effects_1_0= ruleEffect ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:88:1: ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_effects_1_0= ruleEffect ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:88:2: ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_effects_1_0= ruleEffect ) )*
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:106:3: ( (lv_effects_1_0= ruleEffect ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_HOSTCODE)||LA2_0==RULE_COMMENT_ANNOTATION||LA2_0==29||LA2_0==33) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:107:1: (lv_effects_1_0= ruleEffect )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:107:1: (lv_effects_1_0= ruleEffect )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:108:3: lv_effects_1_0= ruleEffect
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKextAccess().getEffectsEffectParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEffect_in_ruleKext166);
            	    lv_effects_1_0=ruleEffect();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getKextRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"effects",
            	              		lv_effects_1_0, 
            	              		"Effect");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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


    // $ANTLR start "entryRuleDeclaration"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:132:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleDeclaration_StartIndex = input.index();
        EObject iv_ruleDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:133:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:134:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration203);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration213); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, entryRuleDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:141:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:144:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:145:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:145:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:145:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';'
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:145:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMMENT_ANNOTATION||LA3_0==33) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:146:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:146:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:147:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleDeclaration259);
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
            	    break loop3;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:163:3: ( (lv_const_1_0= 'const' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:164:1: (lv_const_1_0= 'const' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:164:1: (lv_const_1_0= 'const' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:165:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,16,FOLLOW_16_in_ruleDeclaration278); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:178:3: ( (lv_input_2_0= 'input' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:179:1: (lv_input_2_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:179:1: (lv_input_2_0= 'input' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:180:3: lv_input_2_0= 'input'
                    {
                    lv_input_2_0=(Token)match(input,17,FOLLOW_17_in_ruleDeclaration310); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:193:3: ( (lv_output_3_0= 'output' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:194:1: (lv_output_3_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:194:1: (lv_output_3_0= 'output' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:195:3: lv_output_3_0= 'output'
                    {
                    lv_output_3_0=(Token)match(input,18,FOLLOW_18_in_ruleDeclaration342); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:208:3: ( (lv_static_4_0= 'static' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:209:1: (lv_static_4_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:209:1: (lv_static_4_0= 'static' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:210:3: lv_static_4_0= 'static'
                    {
                    lv_static_4_0=(Token)match(input,19,FOLLOW_19_in_ruleDeclaration374); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:223:3: ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=51 && LA9_1<=57)) ) {
                    alt9=1;
                }
                else if ( (LA9_1==RULE_ID) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA9_0>=51 && LA9_0<=57)) ) {
                alt9=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:223:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:223:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:223:5: ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:223:5: ( (lv_signal_5_0= 'signal' ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==20) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:224:1: (lv_signal_5_0= 'signal' )
                            {
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:224:1: (lv_signal_5_0= 'signal' )
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:225:3: lv_signal_5_0= 'signal'
                            {
                            lv_signal_5_0=(Token)match(input,20,FOLLOW_20_in_ruleDeclaration408); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:238:3: ( (lv_type_6_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:239:1: (lv_type_6_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:239:1: (lv_type_6_0= ruleValueType )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:240:3: lv_type_6_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeValueTypeEnumRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleDeclaration443);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:257:6: ( (lv_signal_7_0= 'signal' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:257:6: ( (lv_signal_7_0= 'signal' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:258:1: (lv_signal_7_0= 'signal' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:258:1: (lv_signal_7_0= 'signal' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:259:3: lv_signal_7_0= 'signal'
                    {
                    lv_signal_7_0=(Token)match(input,20,FOLLOW_20_in_ruleDeclaration468); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:272:3: ( (lv_valuedObjects_8_0= ruleValuedObject ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:273:1: (lv_valuedObjects_8_0= ruleValuedObject )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:273:1: (lv_valuedObjects_8_0= ruleValuedObject )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:274:3: lv_valuedObjects_8_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValuedObject_in_ruleDeclaration503);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:290:2: (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:290:4: otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    {
            	    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleDeclaration516); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getDeclarationAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:294:1: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:295:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:295:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:296:3: lv_valuedObjects_10_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValuedObject_in_ruleDeclaration537);
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
            	    break loop10;
                }
            } while (true);

            otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleDeclaration551); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 4, ruleDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleValuedObject"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:324:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObject_StartIndex = input.index();
        EObject iv_ruleValuedObject = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:325:2: (iv_ruleValuedObject= ruleValuedObject EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:326:2: iv_ruleValuedObject= ruleValuedObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObject_in_entryRuleValuedObject587);
            iv_ruleValuedObject=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObject; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObject597); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, entryRuleValuedObject_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObject"


    // $ANTLR start "ruleValuedObject"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:333:1: ruleValuedObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )? (otherlv_3= 'combine' ( (lv_combineOperator_4_0= ruleCombineOperator ) ) )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:336:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )? (otherlv_3= 'combine' ( (lv_combineOperator_4_0= ruleCombineOperator ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:337:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )? (otherlv_3= 'combine' ( (lv_combineOperator_4_0= ruleCombineOperator ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:337:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )? (otherlv_3= 'combine' ( (lv_combineOperator_4_0= ruleCombineOperator ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:337:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )? (otherlv_3= 'combine' ( (lv_combineOperator_4_0= ruleCombineOperator ) ) )?
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:337:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:338:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:338:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:339:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValuedObject639); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:355:2: (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:355:4: otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleValuedObject657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectAccess().getEqualsSignKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:359:1: ( (lv_initialValue_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:360:1: (lv_initialValue_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:360:1: (lv_initialValue_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:361:3: lv_initialValue_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getInitialValueExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleValuedObject678);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:377:4: (otherlv_3= 'combine' ( (lv_combineOperator_4_0= ruleCombineOperator ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:377:6: otherlv_3= 'combine' ( (lv_combineOperator_4_0= ruleCombineOperator ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleValuedObject693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectAccess().getCombineKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:381:1: ( (lv_combineOperator_4_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:382:1: (lv_combineOperator_4_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:382:1: (lv_combineOperator_4_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:383:3: lv_combineOperator_4_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCombineOperatorCombineOperatorEnumRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleValuedObject714);
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
            if ( state.backtracking>0 ) { memoize(input, 6, ruleValuedObject_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObject"


    // $ANTLR start "entryRuleEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:407:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;
        int entryRuleEffect_StartIndex = input.index();
        EObject iv_ruleEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:408:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:409:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectRule()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect752);
            iv_ruleEffect=ruleEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect762); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, entryRuleEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:416:1: ruleEffect returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_Emission_1= ruleEmission | this_TextEffect_2= ruleTextEffect | this_FunctionCallEffect_3= ruleFunctionCallEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;
        int ruleEffect_StartIndex = input.index();
        EObject this_Assignment_0 = null;

        EObject this_Emission_1 = null;

        EObject this_TextEffect_2 = null;

        EObject this_FunctionCallEffect_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:419:28: ( (this_Assignment_0= ruleAssignment | this_Emission_1= ruleEmission | this_TextEffect_2= ruleTextEffect | this_FunctionCallEffect_3= ruleFunctionCallEffect ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:420:1: (this_Assignment_0= ruleAssignment | this_Emission_1= ruleEmission | this_TextEffect_2= ruleTextEffect | this_FunctionCallEffect_3= ruleFunctionCallEffect )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:420:1: (this_Assignment_0= ruleAssignment | this_Emission_1= ruleEmission | this_TextEffect_2= ruleTextEffect | this_FunctionCallEffect_3= ruleFunctionCallEffect )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:421:2: this_Assignment_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleEffect812);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:434:2: this_Emission_1= ruleEmission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmission_in_ruleEffect842);
                    this_Emission_1=ruleEmission();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Emission_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:447:2: this_TextEffect_2= ruleTextEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextEffect_in_ruleEffect872);
                    this_TextEffect_2=ruleTextEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextEffect_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:460:2: this_FunctionCallEffect_3= ruleFunctionCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getFunctionCallEffectParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCallEffect_in_ruleEffect902);
                    this_FunctionCallEffect_3=ruleFunctionCallEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCallEffect_3; 
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
            if ( state.backtracking>0 ) { memoize(input, 8, ruleEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleEmission"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:479:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;
        int entryRuleEmission_StartIndex = input.index();
        EObject iv_ruleEmission = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:480:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:481:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FOLLOW_ruleEmission_in_entryRuleEmission937);
            iv_ruleEmission=ruleEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmission947); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, entryRuleEmission_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEmission"


    // $ANTLR start "ruleEmission"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:488:1: ruleEmission returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;
        int ruleEmission_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_newValue_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:491:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:492:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:492:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:492:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )?
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:492:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:493:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:493:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:494:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmission996); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:508:2: (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:508:4: otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleEmission1009); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:512:1: ( (lv_newValue_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:513:1: (lv_newValue_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:513:1: (lv_newValue_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:514:3: lv_newValue_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEmission1030);
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

                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleEmission1042); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 10, ruleEmission_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEmission"


    // $ANTLR start "entryRuleAssignment"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:542:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;
        int entryRuleAssignment_StartIndex = input.index();
        EObject iv_ruleAssignment = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:543:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:544:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1080);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1090); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, entryRuleAssignment_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:551:1: ruleAssignment returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* otherlv_5= '=' ( (lv_expression_6_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;
        int ruleAssignment_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_indices_3_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:554:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* otherlv_5= '=' ( (lv_expression_6_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:555:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* otherlv_5= '=' ( (lv_expression_6_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:555:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* otherlv_5= '=' ( (lv_expression_6_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:555:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* otherlv_5= '=' ( (lv_expression_6_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:555:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMENT_ANNOTATION||LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:556:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:556:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:557:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAssignment1136);
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
            	    break loop15;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:573:3: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:574:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:574:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:575:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment1161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:589:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:589:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleAssignment1174); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:593:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:594:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:594:1: (lv_indices_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:595:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleAssignment1195);
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

            	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleAssignment1207); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleAssignment1221); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:619:1: ( (lv_expression_6_0= ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:620:1: (lv_expression_6_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:620:1: (lv_expression_6_0= ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:621:3: lv_expression_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment1242);
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
            if ( state.backtracking>0 ) { memoize(input, 12, ruleAssignment_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleTextEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:645:1: entryRuleTextEffect returns [EObject current=null] : iv_ruleTextEffect= ruleTextEffect EOF ;
    public final EObject entryRuleTextEffect() throws RecognitionException {
        EObject current = null;
        int entryRuleTextEffect_StartIndex = input.index();
        EObject iv_ruleTextEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:646:2: (iv_ruleTextEffect= ruleTextEffect EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:647:2: iv_ruleTextEffect= ruleTextEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextEffectRule()); 
            }
            pushFollow(FOLLOW_ruleTextEffect_in_entryRuleTextEffect1278);
            iv_ruleTextEffect=ruleTextEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextEffect1288); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, entryRuleTextEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTextEffect"


    // $ANTLR start "ruleTextEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:654:1: ruleTextEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleTextEffect() throws RecognitionException {
        EObject current = null;
        int ruleTextEffect_StartIndex = input.index();
        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:657:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:658:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:658:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:658:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:658:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_COMMENT_ANNOTATION||LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:659:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:659:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:660:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTextEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleTextEffect1334);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTextEffectRule());
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
            	    break loop17;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:676:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:677:1: (lv_text_1_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:677:1: (lv_text_1_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:678:3: lv_text_1_0= RULE_HOSTCODE
            {
            lv_text_1_0=(Token)match(input,RULE_HOSTCODE,FOLLOW_RULE_HOSTCODE_in_ruleTextEffect1352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_1_0, grammarAccess.getTextEffectAccess().getTextHOSTCODETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextEffectRule());
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
            if ( state.backtracking>0 ) { memoize(input, 14, ruleTextEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTextEffect"


    // $ANTLR start "entryRuleFunctionCallEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:702:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionCallEffect_StartIndex = input.index();
        EObject iv_ruleFunctionCallEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:703:2: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:704:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallEffectRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCallEffect_in_entryRuleFunctionCallEffect1393);
            iv_ruleFunctionCallEffect=ruleFunctionCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCallEffect1403); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, entryRuleFunctionCallEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCallEffect"


    // $ANTLR start "ruleFunctionCallEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:711:1: ruleFunctionCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:714:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:715:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:715:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:715:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>'
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:715:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_COMMENT_ANNOTATION||LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:716:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:716:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:717:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleFunctionCallEffect1449);
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
            	    break loop18;
                }
            } while (true);

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleFunctionCallEffect1462); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:737:1: ( (lv_functionName_2_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:738:1: (lv_functionName_2_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:738:1: (lv_functionName_2_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:739:3: lv_functionName_2_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getFunctionNameExtendedIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleFunctionCallEffect1483);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:755:2: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            else if ( (LA20_0==30) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:755:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:755:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:755:5: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleFunctionCallEffect1497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_3_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:759:1: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:760:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:760:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:761:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionCallEffect1518);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:777:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==21) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:777:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleFunctionCallEffect1531); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_3_0_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:781:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:782:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:782:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:783:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionCallEffect1552);
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
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleFunctionCallEffect1566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_3_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:804:7: otherlv_8= '()'
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleFunctionCallEffect1585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleFunctionCallEffect1599); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 16, ruleFunctionCallEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCallEffect"


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:822:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleExpression_StartIndex = input.index();
        EObject iv_ruleExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:823:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:824:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1637);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1647); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, entryRuleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:831:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;
        int ruleExpression_StartIndex = input.index();
        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:834:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:835:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:835:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:836:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleExpression1697);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:849:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleExpression1727);
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
            if ( state.backtracking>0 ) { memoize(input, 18, ruleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBoolExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:868:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBoolExpression_StartIndex = input.index();
        EObject iv_ruleBoolExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:869:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:870:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1762);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpression1772); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, entryRuleBoolExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:877:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;
        int ruleBoolExpression_StartIndex = input.index();
        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:880:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:882:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleBoolExpression1821);
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
            if ( state.backtracking>0 ) { memoize(input, 20, ruleBoolExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:901:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleLogicalOrExpression_StartIndex = input.index();
        EObject iv_ruleLogicalOrExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:902:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:903:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression1855);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression1865); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, entryRuleLogicalOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:910:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;
        int ruleLogicalOrExpression_StartIndex = input.index();
        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:913:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:914:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:914:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:915:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression1915);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:926:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==49) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:926:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:926:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:927:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:935:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==49) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:935:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:935:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:936:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:936:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:937:3: lv_operator_2_0= ruleLogicalOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression1949);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:953:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:954:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:954:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:955:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression1970);
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
                    	    if ( cnt22 >= 1 ) break loop22;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
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
            if ( state.backtracking>0 ) { memoize(input, 22, ruleLogicalOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:979:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleLogicalAndExpression_StartIndex = input.index();
        EObject iv_ruleLogicalAndExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:980:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:981:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression2010);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression2020); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, entryRuleLogicalAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:988:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;
        int ruleLogicalAndExpression_StartIndex = input.index();
        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:991:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:992:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:992:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:993:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression2070);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1004:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==50) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1004:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1004:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1005:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1013:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==50) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1013:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1013:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1014:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1014:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1015:3: lv_operator_2_0= ruleLogicalAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression2104);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1031:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1032:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1032:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1033:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression2125);
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
                    	    if ( cnt24 >= 1 ) break loop24;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
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
            if ( state.backtracking>0 ) { memoize(input, 24, ruleLogicalAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1057:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBitwiseOrExpression_StartIndex = input.index();
        EObject iv_ruleBitwiseOrExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1058:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1059:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression2165);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression2175); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, entryRuleBitwiseOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseOrExpression"


    // $ANTLR start "ruleBitwiseOrExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1066:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;
        int ruleBitwiseOrExpression_StartIndex = input.index();
        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1069:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1070:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1070:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1071:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression2225);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1082:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1082:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1082:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1083:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1091:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==42) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1091:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1091:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1092:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1092:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1093:3: lv_operator_2_0= ruleBitwiseOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBitwiseOrOperator_in_ruleBitwiseOrExpression2259);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1109:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1110:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1110:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1111:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression2280);
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
                    	    if ( cnt26 >= 1 ) break loop26;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
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
            if ( state.backtracking>0 ) { memoize(input, 26, ruleBitwiseOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1135:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBitwiseAndExpression_StartIndex = input.index();
        EObject iv_ruleBitwiseAndExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1136:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1137:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression2320);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression2330); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, entryRuleBitwiseAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseAndExpression"


    // $ANTLR start "ruleBitwiseAndExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1144:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;
        int ruleBitwiseAndExpression_StartIndex = input.index();
        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1147:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1148:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1148:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1149:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression2380);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1160:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1160:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1160:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1161:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1169:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==32) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1169:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1169:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1170:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1170:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1171:3: lv_operator_2_0= ruleBitwiseAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBitwiseAndOperator_in_ruleBitwiseAndExpression2414);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1187:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1188:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1188:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1189:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression2435);
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
                    	    if ( cnt28 >= 1 ) break loop28;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
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
            if ( state.backtracking>0 ) { memoize(input, 28, ruleBitwiseAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1213:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;
        int entryRuleCompareOperation_StartIndex = input.index();
        EObject iv_ruleCompareOperation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1214:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1215:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation2475);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation2485); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, entryRuleCompareOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1222:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;
        int ruleCompareOperation_StartIndex = input.index();
        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1225:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1226:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1226:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1227:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation2535);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1238:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31||(LA30_0>=37 && LA30_0<=40)) ) {
                alt30=1;
            }
            else if ( (LA30_0==29) ) {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==RULE_ID) ) {
                    int LA30_4 = input.LA(3);

                    if ( (LA30_4==EOF||(LA30_4>=RULE_ID && LA30_4<=RULE_HOSTCODE)||LA30_4==RULE_COMMENT_ANNOTATION||(LA30_4>=21 && LA30_4<=22)||LA30_4==24||(LA30_4>=26 && LA30_4<=29)||(LA30_4>=32 && LA30_4<=33)||LA30_4==36||LA30_4==42||(LA30_4>=44 && LA30_4<=47)||(LA30_4>=49 && LA30_4<=50)) ) {
                        alt30=1;
                    }
                }
                else if ( ((LA30_2>=RULE_HOSTCODE && LA30_2<=RULE_STRING)||LA30_2==25||LA30_2==29||LA30_2==36||LA30_2==41||LA30_2==43||LA30_2==48) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1238:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1238:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1239:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1247:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1248:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1248:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1249:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareOperation2568);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1265:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1266:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1266:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1267:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation2589);
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
            if ( state.backtracking>0 ) { memoize(input, 30, ruleCompareOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleNotOrValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1291:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNotOrValuedExpression_StartIndex = input.index();
        EObject iv_ruleNotOrValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1292:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1293:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression2627);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOrValuedExpression2637); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, entryRuleNotOrValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNotOrValuedExpression"


    // $ANTLR start "ruleNotOrValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1300:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleNotOrValuedExpression_StartIndex = input.index();
        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1303:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1304:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1304:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1305:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression2687);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1318:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression2717);
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
            if ( state.backtracking>0 ) { memoize(input, 32, ruleNotOrValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotOrValuedExpression"


    // $ANTLR start "entryRuleNotExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1337:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNotExpression_StartIndex = input.index();
        EObject iv_ruleNotExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1338:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1339:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_entryRuleNotExpression2752);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotExpression2762); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, entryRuleNotExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1346:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;
        int ruleNotExpression_StartIndex = input.index();
        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1349:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1350:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1350:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            else if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_HOSTCODE)||LA32_0==RULE_BOOLEAN||LA32_0==25||LA32_0==29||LA32_0==41||LA32_0==48) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1350:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1350:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1350:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1350:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1351:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1359:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1360:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1360:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1361:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotOperator_in_ruleNotExpression2821);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1377:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1378:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1378:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1379:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleNotExpression2842);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1397:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleNotExpression2874);
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
            if ( state.backtracking>0 ) { memoize(input, 34, ruleNotExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1416:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedExpression_StartIndex = input.index();
        EObject iv_ruleValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1417:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1418:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression2909);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedExpression2919); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, entryRuleValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedExpression"


    // $ANTLR start "ruleValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1425:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleValuedExpression_StartIndex = input.index();
        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1428:28: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1430:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAddExpression_in_ruleValuedExpression2968);
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
            if ( state.backtracking>0 ) { memoize(input, 36, ruleValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedExpression"


    // $ANTLR start "entryRuleAddExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1449:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAddExpression_StartIndex = input.index();
        EObject iv_ruleAddExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1450:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1451:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAddExpression_in_entryRuleAddExpression3002);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExpression3012); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, entryRuleAddExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1458:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;
        int ruleAddExpression_StartIndex = input.index();
        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1461:28: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1462:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1462:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1463:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression3062);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1474:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==44) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1474:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1474:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1475:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1483:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1484:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1484:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1485:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddOperator_in_ruleAddExpression3095);
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

            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1501:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1502:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1502:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1503:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression3116);
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
            	    break loop33;
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
            if ( state.backtracking>0 ) { memoize(input, 38, ruleAddExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1527:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleSubExpression_StartIndex = input.index();
        EObject iv_ruleSubExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1528:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1529:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_entryRuleSubExpression3154);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubExpression3164); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, entryRuleSubExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSubExpression"


    // $ANTLR start "ruleSubExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1536:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;
        int ruleSubExpression_StartIndex = input.index();
        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1539:28: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1540:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1540:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1541:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression3214);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1552:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==36) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1552:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1552:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1553:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1561:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1562:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1562:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1563:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubOperator_in_ruleSubExpression3247);
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

            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1579:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1580:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1580:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1581:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression3268);
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
            	    break loop34;
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
            if ( state.backtracking>0 ) { memoize(input, 40, ruleSubExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1605:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleMultExpression_StartIndex = input.index();
        EObject iv_ruleMultExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1606:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1607:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_entryRuleMultExpression3306);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultExpression3316); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, entryRuleMultExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1614:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;
        int ruleMultExpression_StartIndex = input.index();
        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1617:28: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1618:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1618:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1619:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDivExpression_in_ruleMultExpression3366);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1630:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==45) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1630:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1630:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1631:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1639:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1640:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1640:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1641:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOperator_in_ruleMultExpression3399);
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

            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1657:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1658:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1658:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1659:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDivExpression_in_ruleMultExpression3420);
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
            	    break loop35;
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
            if ( state.backtracking>0 ) { memoize(input, 42, ruleMultExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1683:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleDivExpression_StartIndex = input.index();
        EObject iv_ruleDivExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1684:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1685:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleDivExpression_in_entryRuleDivExpression3458);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivExpression3468); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, entryRuleDivExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDivExpression"


    // $ANTLR start "ruleDivExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1692:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;
        int ruleDivExpression_StartIndex = input.index();
        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1695:28: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1696:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1696:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1697:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleModExpression_in_ruleDivExpression3518);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1708:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1708:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1708:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1709:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1717:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1718:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1718:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1719:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDivOperator_in_ruleDivExpression3551);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1735:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1736:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1736:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1737:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModExpression_in_ruleDivExpression3572);
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
            if ( state.backtracking>0 ) { memoize(input, 44, ruleDivExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1761:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleModExpression_StartIndex = input.index();
        EObject iv_ruleModExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1762:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1763:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_entryRuleModExpression3610);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModExpression3620); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, entryRuleModExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleModExpression"


    // $ANTLR start "ruleModExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1770:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;
        int ruleModExpression_StartIndex = input.index();
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1773:28: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1774:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1774:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1775:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNegExpression_in_ruleModExpression3670);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1786:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1786:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1786:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1787:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1795:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1796:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1796:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1797:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModOperator_in_ruleModExpression3703);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1813:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1814:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1814:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1815:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression3724);
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
            if ( state.backtracking>0 ) { memoize(input, 46, ruleModExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModExpression"


    // $ANTLR start "entryRuleNegExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1839:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNegExpression_StartIndex = input.index();
        EObject iv_ruleNegExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1840:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1841:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNegExpression_in_entryRuleNegExpression3762);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpression3772); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, entryRuleNegExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNegExpression"


    // $ANTLR start "ruleNegExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1848:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;
        int ruleNegExpression_StartIndex = input.index();
        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1851:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1852:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1852:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_STRING)||LA38_0==25||LA38_0==29||LA38_0==41||LA38_0==48) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1852:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1852:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1852:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1852:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1853:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1861:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1862:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1862:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1863:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSubOperator_in_ruleNegExpression3831);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1879:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1880:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1880:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1881:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNegExpression_in_ruleNegExpression3852);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1899:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression3884);
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
            if ( state.backtracking>0 ) { memoize(input, 48, ruleNegExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNegExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1918:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAtomicExpression_StartIndex = input.index();
        EObject iv_ruleAtomicExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1919:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1920:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression3919);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression3929); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, entryRuleAtomicExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1927:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1930:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1931:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1931:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            int alt39=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt39=1;
                }
                break;
            case RULE_ID:
            case 41:
            case 48:
                {
                alt39=2;
                }
                break;
            case 25:
                {
                alt39=3;
                }
                break;
            case 29:
                {
                alt39=4;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt39=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1932:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolValue_in_ruleAtomicExpression3979);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1945:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression4009);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1957:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1957:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1957:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleAtomicExpression4027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleAtomicExpression4052);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleAtomicExpression4063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1979:2: this_FunctionCall_5= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleAtomicExpression4095);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1992:2: this_TextExpression_6= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_ruleAtomicExpression4125);
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
            if ( state.backtracking>0 ) { memoize(input, 50, ruleAtomicExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleAtomicValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2011:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAtomicValuedExpression_StartIndex = input.index();
        EObject iv_ruleAtomicValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2012:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2013:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression4160);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicValuedExpression4170); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, entryRuleAtomicValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicValuedExpression"


    // $ANTLR start "ruleAtomicValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2020:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2023:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2024:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2024:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt40=5;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2025:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression4220);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2038:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression4250);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2051:2: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getStringValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_ruleAtomicValuedExpression4280);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2063:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2063:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2063:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleAtomicValuedExpression4298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression4323);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleAtomicValuedExpression4334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2085:2: this_AtomicExpression_6= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression4366);
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
            if ( state.backtracking>0 ) { memoize(input, 52, ruleAtomicValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAtomicValuedExpression"


    // $ANTLR start "entryRuleValuedObjectTestExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2104:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObjectTestExpression_StartIndex = input.index();
        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2105:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2106:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression4401);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObjectTestExpression4411); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, entryRuleValuedObjectTestExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectTestExpression"


    // $ANTLR start "ruleValuedObjectTestExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2113:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2116:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2117:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2117:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==41||LA42_0==48) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_ID) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2117:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2117:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2117:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2117:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2118:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2126:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2127:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2127:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2128:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2128:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==41) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==48) ) {
                        alt41=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2129:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression4472);
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
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2144:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression4491);
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

                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleValuedObjectTestExpression4506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2166:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2167:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2167:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2168:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression4527);
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

                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleValuedObjectTestExpression4539); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2190:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression4571);
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
            if ( state.backtracking>0 ) { memoize(input, 54, ruleValuedObjectTestExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObjectTestExpression"


    // $ANTLR start "entryRuleValuedObjectReference"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2209:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObjectReference_StartIndex = input.index();
        EObject iv_ruleValuedObjectReference = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2210:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2211:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference4606);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObjectReference4616); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, entryRuleValuedObjectReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectReference"


    // $ANTLR start "ruleValuedObjectReference"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2218:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;
        int ruleValuedObjectReference_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_indices_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2221:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2222:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2222:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2222:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2222:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2223:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2223:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2224:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValuedObjectReference4665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2238:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==27) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2238:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleValuedObjectReference4678); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2242:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2243:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2243:1: (lv_indices_2_0= ruleExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2244:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleValuedObjectReference4699);
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

            	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleValuedObjectReference4711); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop43;
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
            if ( state.backtracking>0 ) { memoize(input, 56, ruleValuedObjectReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleFunctionCall"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2272:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionCall_StartIndex = input.index();
        EObject iv_ruleFunctionCall = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2273:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2274:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall4749);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall4759); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, entryRuleFunctionCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2281:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2284:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2285:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2285:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2285:3: otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleFunctionCall4796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2289:1: ( (lv_functionName_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2290:1: (lv_functionName_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2290:1: (lv_functionName_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2291:3: lv_functionName_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleFunctionCall4817);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2307:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )?
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==25) ) {
                alt45=1;
            }
            else if ( (LA45_0==30) ) {
                alt45=2;
            }
            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2307:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2307:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2307:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleFunctionCall4831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2311:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2312:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2312:1: (lv_parameters_3_0= ruleParameter )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2313:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionCall4852);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2329:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==21) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2329:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleFunctionCall4865); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2333:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2334:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2334:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2335:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionCall4886);
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
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleFunctionCall4900); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2356:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleFunctionCall4919); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleFunctionCall4933); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 58, ruleFunctionCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleParameter"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2372:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;
        int entryRuleParameter_StartIndex = input.index();
        EObject iv_ruleParameter = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2373:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2374:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter4969);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter4979); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, entryRuleParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2381:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;
        int ruleParameter_StartIndex = input.index();
        Token lv_callByReference_0_0=null;
        Token lv_pureOutput_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2384:28: ( ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2385:1: ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2385:1: ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2385:2: ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2385:2: ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==32) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2385:3: ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )?
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2385:3: ( (lv_callByReference_0_0= '&' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2386:1: (lv_callByReference_0_0= '&' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2386:1: (lv_callByReference_0_0= '&' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2387:3: lv_callByReference_0_0= '&'
                    {
                    lv_callByReference_0_0=(Token)match(input,32,FOLLOW_32_in_ruleParameter5023); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2400:2: ( (lv_pureOutput_1_0= '&' ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==32) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2401:1: (lv_pureOutput_1_0= '&' )
                            {
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2401:1: (lv_pureOutput_1_0= '&' )
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2402:3: lv_pureOutput_1_0= '&'
                            {
                            lv_pureOutput_1_0=(Token)match(input,32,FOLLOW_32_in_ruleParameter5054); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2415:5: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2416:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2416:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2417:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParameter5091);
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
            if ( state.backtracking>0 ) { memoize(input, 60, ruleParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTextExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2441:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleTextExpression_StartIndex = input.index();
        EObject iv_ruleTextExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2442:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2443:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTextExpression_in_entryRuleTextExpression5127);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextExpression5137); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, entryRuleTextExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2450:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;
        int ruleTextExpression_StartIndex = input.index();
        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2453:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2454:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2454:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2455:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2455:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2456:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FOLLOW_RULE_HOSTCODE_in_ruleTextExpression5178); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 62, ruleTextExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleIntValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2480:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;
        int entryRuleIntValue_StartIndex = input.index();
        EObject iv_ruleIntValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2481:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2482:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue5218);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue5228); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, entryRuleIntValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2489:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;
        int ruleIntValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2492:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2493:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2493:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2494:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2494:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2495:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue5269); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 64, ruleIntValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2519:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;
        int entryRuleFloatValue_StartIndex = input.index();
        EObject iv_ruleFloatValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2520:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2521:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue5309);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue5319); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, entryRuleFloatValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2528:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;
        int ruleFloatValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2531:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2532:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2532:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2533:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2533:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2534:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue5360); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 66, ruleFloatValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleBoolValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2558:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;
        int entryRuleBoolValue_StartIndex = input.index();
        EObject iv_ruleBoolValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2559:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2560:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FOLLOW_ruleBoolValue_in_entryRuleBoolValue5400);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolValue5410); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, entryRuleBoolValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2567:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;
        int ruleBoolValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2570:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2571:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2571:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2572:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2572:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2573:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBoolValue5451); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 68, ruleBoolValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleStringValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2597:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;
        int entryRuleStringValue_StartIndex = input.index();
        EObject iv_ruleStringValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2598:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2599:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue5491);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue5501); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, entryRuleStringValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2606:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;
        int ruleStringValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2609:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2610:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2610:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2611:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2611:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2612:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue5542); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 70, ruleStringValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2638:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleAnnotation_StartIndex = input.index();
        EObject iv_ruleAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2639:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2640:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation5584);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation5594); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, entryRuleAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2647:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2650:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2651:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2651:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            int alt48=7;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2652:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommentAnnotation_in_ruleAnnotation5644);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2665:2: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation5674);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2678:2: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation5704);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2691:2: this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation5734);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2704:2: this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation5764);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2717:2: this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation5794);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2730:2: this_TagAnnotation_6= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTagAnnotation_in_ruleAnnotation5824);
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
            if ( state.backtracking>0 ) { memoize(input, 72, ruleAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2751:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleCommentAnnotation_StartIndex = input.index();
        EObject iv_ruleCommentAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2752:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2753:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation5861);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentAnnotation5871); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, entryRuleCommentAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentAnnotation"


    // $ANTLR start "ruleCommentAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2760:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleCommentAnnotation_StartIndex = input.index();
        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2763:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2764:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2764:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2765:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2765:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2766:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation5912); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 74, ruleCommentAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleTagAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2790:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleTagAnnotation_StartIndex = input.index();
        EObject iv_ruleTagAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2791:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2792:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation5952);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagAnnotation5962); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, entryRuleTagAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTagAnnotation"


    // $ANTLR start "ruleTagAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2799:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleTagAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2802:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2803:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2803:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2803:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleTagAnnotation5999); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2807:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2808:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2808:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2809:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTagAnnotation6020);
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
            if ( state.backtracking>0 ) { memoize(input, 76, ruleTagAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2833:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2834:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2835:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation6056);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation6066); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, entryRuleKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyStringValueAnnotation"


    // $ANTLR start "ruleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2842:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2845:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2846:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2846:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2846:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleKeyStringValueAnnotation6103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2850:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2851:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2851:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2852:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation6124);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2868:2: ( (lv_values_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2869:1: (lv_values_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2869:1: (lv_values_2_0= ruleEString )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2870:3: lv_values_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation6145);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2886:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==21) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2886:4: otherlv_3= ',' ( (lv_values_4_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleKeyStringValueAnnotation6158); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2890:1: ( (lv_values_4_0= ruleEString ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2891:1: (lv_values_4_0= ruleEString )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2891:1: (lv_values_4_0= ruleEString )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2892:3: lv_values_4_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation6179);
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
            if ( state.backtracking>0 ) { memoize(input, 78, ruleKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2916:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleTypedKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2917:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2918:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation6217);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation6227); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, entryRuleTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2925:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2928:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2929:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2929:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2929:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleTypedKeyStringValueAnnotation6264); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2933:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2934:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2934:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2935:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6285);
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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleTypedKeyStringValueAnnotation6297); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2955:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2956:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2956:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2957:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6318);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleTypedKeyStringValueAnnotation6330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2977:1: ( (lv_values_5_0= ruleEString ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2978:1: (lv_values_5_0= ruleEString )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2978:1: (lv_values_5_0= ruleEString )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2979:3: lv_values_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation6351);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2995:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==21) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2995:4: otherlv_6= ',' ( (lv_values_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleTypedKeyStringValueAnnotation6364); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2999:1: ( (lv_values_7_0= ruleEString ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3000:1: (lv_values_7_0= ruleEString )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3000:1: (lv_values_7_0= ruleEString )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3001:3: lv_values_7_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation6385);
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
            	    break loop50;
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
            if ( state.backtracking>0 ) { memoize(input, 80, ruleTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3025:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyBooleanValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3026:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3027:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation6423);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation6433); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, entryRuleKeyBooleanValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyBooleanValueAnnotation"


    // $ANTLR start "ruleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3034:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyBooleanValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3037:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3038:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3038:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3038:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleKeyBooleanValueAnnotation6470); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3042:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3043:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3043:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3044:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation6491);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3060:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3061:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3061:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3062:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation6508); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 82, ruleKeyBooleanValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyBooleanValueAnnotation"


    // $ANTLR start "entryRuleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3086:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyIntValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3087:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3088:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation6549);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation6559); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, entryRuleKeyIntValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyIntValueAnnotation"


    // $ANTLR start "ruleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3095:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyIntValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3098:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3099:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3099:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3099:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleKeyIntValueAnnotation6596); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3103:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3104:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3104:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3105:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation6617);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3121:2: ( (lv_value_2_0= ruleInteger ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3122:1: (lv_value_2_0= ruleInteger )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3122:1: (lv_value_2_0= ruleInteger )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3123:3: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation6638);
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
            if ( state.backtracking>0 ) { memoize(input, 84, ruleKeyIntValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyIntValueAnnotation"


    // $ANTLR start "entryRuleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3147:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyFloatValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3148:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3149:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation6674);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation6684); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, entryRuleKeyFloatValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyFloatValueAnnotation"


    // $ANTLR start "ruleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3156:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyFloatValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3159:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3160:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3160:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3160:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleKeyFloatValueAnnotation6721); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3164:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3165:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3165:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3166:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation6742);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3182:2: ( (lv_value_2_0= ruleFloateger ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3183:1: (lv_value_2_0= ruleFloateger )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3183:1: (lv_value_2_0= ruleFloateger )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3184:3: lv_value_2_0= ruleFloateger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation6763);
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
            if ( state.backtracking>0 ) { memoize(input, 86, ruleKeyFloatValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyFloatValueAnnotation"


    // $ANTLR start "entryRuleEString"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3210:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;
        int entryRuleEString_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3211:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3212:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString6802);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString6813); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, entryRuleEString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3219:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleEString_StartIndex = input.index();
        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3222:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3223:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3223:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_STRING) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_ID) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3223:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString6853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3232:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAccess().getExtendedIDParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_ruleEString6886);
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
            if ( state.backtracking>0 ) { memoize(input, 88, ruleEString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3250:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;
        int entryRuleExtendedID_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3251:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3252:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID6932);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID6943); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, entryRuleExtendedID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3259:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleExtendedID_StartIndex = input.index();
        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3262:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3263:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3263:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3263:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID6983); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3270:1: (kw= '.' this_ID_2= RULE_ID )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==34) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3271:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,34,FOLLOW_34_in_ruleExtendedID7002); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID7017); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3283:3: (kw= '#' this_INT_4= RULE_INT )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==35) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3284:2: kw= '#' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleExtendedID7038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
                          
                    }
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExtendedID7053); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 90, ruleExtendedID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleInteger"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3304:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;
        int entryRuleInteger_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3305:2: (iv_ruleInteger= ruleInteger EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3306:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger7101);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger7112); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, entryRuleInteger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3313:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleInteger_StartIndex = input.index();
        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3316:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3317:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3317:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3317:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3317:2: (kw= '-' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==36) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3318:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleInteger7151); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInteger7168); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 92, ruleInteger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleFloateger"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3338:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;
        int entryRuleFloateger_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3339:2: (iv_ruleFloateger= ruleFloateger EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3340:2: iv_ruleFloateger= ruleFloateger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloategerRule()); 
            }
            pushFollow(FOLLOW_ruleFloateger_in_entryRuleFloateger7214);
            iv_ruleFloateger=ruleFloateger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloateger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloateger7225); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, entryRuleFloateger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFloateger"


    // $ANTLR start "ruleFloateger"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3347:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFloateger_StartIndex = input.index();
        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3350:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3351:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3351:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3351:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3351:2: (kw= '-' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==36) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3352:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleFloateger7264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloateger7281); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 94, ruleFloateger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFloateger"


    // $ANTLR start "ruleCompareOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3372:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3374:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3375:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3375:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt56=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt56=1;
                }
                break;
            case 29:
                {
                alt56=2;
                }
                break;
            case 38:
                {
                alt56=3;
                }
                break;
            case 31:
                {
                alt56=4;
                }
                break;
            case 39:
                {
                alt56=5;
                }
                break;
            case 40:
                {
                alt56=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3375:2: (enumLiteral_0= '==' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3375:2: (enumLiteral_0= '==' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3375:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_37_in_ruleCompareOperator7340); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3381:6: (enumLiteral_1= '<' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3381:6: (enumLiteral_1= '<' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3381:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_ruleCompareOperator7357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3387:6: (enumLiteral_2= '<=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3387:6: (enumLiteral_2= '<=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3387:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_38_in_ruleCompareOperator7374); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3393:6: (enumLiteral_3= '>' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3393:6: (enumLiteral_3= '>' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3393:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_31_in_ruleCompareOperator7391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3399:6: (enumLiteral_4= '>=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3399:6: (enumLiteral_4= '>=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3399:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_39_in_ruleCompareOperator7408); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3405:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3405:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3405:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,40,FOLLOW_40_in_ruleCompareOperator7425); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 95, ruleCompareOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rulePreOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3415:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;
        int rulePreOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3417:28: ( (enumLiteral_0= 'pre' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3418:1: (enumLiteral_0= 'pre' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3418:1: (enumLiteral_0= 'pre' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3418:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,41,FOLLOW_41_in_rulePreOperator7469); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 96, rulePreOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePreOperator"


    // $ANTLR start "ruleBitwiseOrOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3428:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleBitwiseOrOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3430:28: ( (enumLiteral_0= '|' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3431:1: (enumLiteral_0= '|' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3431:1: (enumLiteral_0= '|' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3431:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleBitwiseOrOperator7512); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 97, ruleBitwiseOrOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseOrOperator"


    // $ANTLR start "ruleBitwiseAndOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3441:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleBitwiseAndOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3443:28: ( (enumLiteral_0= '&' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3444:1: (enumLiteral_0= '&' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3444:1: (enumLiteral_0= '&' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3444:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,32,FOLLOW_32_in_ruleBitwiseAndOperator7555); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 98, ruleBitwiseAndOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseAndOperator"


    // $ANTLR start "ruleNotOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3454:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleNotOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3456:28: ( (enumLiteral_0= '!' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3457:1: (enumLiteral_0= '!' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3457:1: (enumLiteral_0= '!' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3457:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleNotOperator7598); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 99, ruleNotOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "ruleAddOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3467:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleAddOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3469:28: ( (enumLiteral_0= '+' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3470:1: (enumLiteral_0= '+' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3470:1: (enumLiteral_0= '+' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3470:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,44,FOLLOW_44_in_ruleAddOperator7641); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 100, ruleAddOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "ruleSubOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3480:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleSubOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3482:28: ( (enumLiteral_0= '-' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3483:1: (enumLiteral_0= '-' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3483:1: (enumLiteral_0= '-' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3483:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,36,FOLLOW_36_in_ruleSubOperator7684); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 101, ruleSubOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubOperator"


    // $ANTLR start "ruleMultOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3493:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleMultOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3495:28: ( (enumLiteral_0= '*' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3496:1: (enumLiteral_0= '*' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3496:1: (enumLiteral_0= '*' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3496:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,45,FOLLOW_45_in_ruleMultOperator7727); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 102, ruleMultOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMultOperator"


    // $ANTLR start "ruleModOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3506:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleModOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3508:28: ( (enumLiteral_0= '%' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3509:1: (enumLiteral_0= '%' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3509:1: (enumLiteral_0= '%' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3509:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleModOperator7770); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 103, ruleModOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModOperator"


    // $ANTLR start "ruleDivOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3519:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleDivOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3521:28: ( (enumLiteral_0= '/' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3522:1: (enumLiteral_0= '/' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3522:1: (enumLiteral_0= '/' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3522:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_ruleDivOperator7813); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 104, ruleDivOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDivOperator"


    // $ANTLR start "ruleValOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3532:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleValOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3534:28: ( (enumLiteral_0= 'val' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3535:1: (enumLiteral_0= 'val' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3535:1: (enumLiteral_0= 'val' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3535:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleValOperator7856); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 105, ruleValOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValOperator"


    // $ANTLR start "ruleLogicalOrOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3545:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleLogicalOrOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3547:28: ( (enumLiteral_0= '||' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3548:1: (enumLiteral_0= '||' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3548:1: (enumLiteral_0= '||' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3548:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_ruleLogicalOrOperator7899); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 106, ruleLogicalOrOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3558:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleLogicalAndOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3560:28: ( (enumLiteral_0= '&&' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3561:1: (enumLiteral_0= '&&' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3561:1: (enumLiteral_0= '&&' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3561:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_ruleLogicalAndOperator7942); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 107, ruleLogicalAndOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleValueType"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3575:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3577:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3578:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3578:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            int alt57=7;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt57=1;
                }
                break;
            case 52:
                {
                alt57=2;
                }
                break;
            case 53:
                {
                alt57=3;
                }
                break;
            case 54:
                {
                alt57=4;
                }
                break;
            case 55:
                {
                alt57=5;
                }
                break;
            case 56:
                {
                alt57=6;
                }
                break;
            case 57:
                {
                alt57=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3578:2: (enumLiteral_0= 'pure' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3578:2: (enumLiteral_0= 'pure' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3578:4: enumLiteral_0= 'pure'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleValueType7990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3584:6: (enumLiteral_1= 'bool' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3584:6: (enumLiteral_1= 'bool' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3584:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleValueType8007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3590:6: (enumLiteral_2= 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3590:6: (enumLiteral_2= 'unsigned' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3590:8: enumLiteral_2= 'unsigned'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_53_in_ruleValueType8024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3596:6: (enumLiteral_3= 'int' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3596:6: (enumLiteral_3= 'int' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3596:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_54_in_ruleValueType8041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3602:6: (enumLiteral_4= 'float' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3602:6: (enumLiteral_4= 'float' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3602:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,55,FOLLOW_55_in_ruleValueType8058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3608:6: (enumLiteral_5= 'string' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3608:6: (enumLiteral_5= 'string' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3608:8: enumLiteral_5= 'string'
                    {
                    enumLiteral_5=(Token)match(input,56,FOLLOW_56_in_ruleValueType8075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3614:6: (enumLiteral_6= 'host' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3614:6: (enumLiteral_6= 'host' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3614:8: enumLiteral_6= 'host'
                    {
                    enumLiteral_6=(Token)match(input,57,FOLLOW_57_in_ruleValueType8092); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 108, ruleValueType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "ruleCombineOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3626:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3628:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3629:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3629:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt58=8;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt58=1;
                }
                break;
            case 44:
                {
                alt58=2;
                }
                break;
            case 45:
                {
                alt58=3;
                }
                break;
            case 59:
                {
                alt58=4;
                }
                break;
            case 60:
                {
                alt58=5;
                }
                break;
            case 42:
                {
                alt58=6;
                }
                break;
            case 32:
                {
                alt58=7;
                }
                break;
            case 57:
                {
                alt58=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3629:2: (enumLiteral_0= 'none' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3629:2: (enumLiteral_0= 'none' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3629:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleCombineOperator8139); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3635:6: (enumLiteral_1= '+' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3635:6: (enumLiteral_1= '+' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3635:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleCombineOperator8156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3641:6: (enumLiteral_2= '*' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3641:6: (enumLiteral_2= '*' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3641:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_45_in_ruleCombineOperator8173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3647:6: (enumLiteral_3= 'max' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3647:6: (enumLiteral_3= 'max' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3647:8: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_59_in_ruleCombineOperator8190); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3653:6: (enumLiteral_4= 'min' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3653:6: (enumLiteral_4= 'min' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3653:8: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,60,FOLLOW_60_in_ruleCombineOperator8207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3659:6: (enumLiteral_5= '|' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3659:6: (enumLiteral_5= '|' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3659:8: enumLiteral_5= '|'
                    {
                    enumLiteral_5=(Token)match(input,42,FOLLOW_42_in_ruleCombineOperator8224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3665:6: (enumLiteral_6= '&' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3665:6: (enumLiteral_6= '&' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3665:8: enumLiteral_6= '&'
                    {
                    enumLiteral_6=(Token)match(input,32,FOLLOW_32_in_ruleCombineOperator8241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3671:6: (enumLiteral_7= 'host' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3671:6: (enumLiteral_7= 'host' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3671:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,57,FOLLOW_57_in_ruleCombineOperator8258); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 109, ruleCombineOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCombineOperator"

    // $ANTLR start synpred24_InternalKEXT
    public final void synpred24_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:836:2: (this_BoolExpression_0= ruleBoolExpression )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:836:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleBoolExpression_in_synpred24_InternalKEXT1697);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalKEXT

    // $ANTLR start synpred34_InternalKEXT
    public final void synpred34_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1305:2: (this_ValuedExpression_0= ruleValuedExpression )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1305:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred34_InternalKEXT2687);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalKEXT

    // $ANTLR start synpred49_InternalKEXT
    public final void synpred49_InternalKEXT_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2063:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2063:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2063:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2063:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,25,FOLLOW_25_in_synpred49_InternalKEXT4298); if (state.failed) return ;
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred49_InternalKEXT4323);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,26,FOLLOW_26_in_synpred49_InternalKEXT4334); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred49_InternalKEXT

    // Delegated rules

    public final boolean synpred24_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalKEXT_fragment(); // can never throw exception
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
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA48 dfa48 = new DFA48(this);
    static final String DFA1_eotS =
        "\57\uffff";
    static final String DFA1_eofS =
        "\1\3\56\uffff";
    static final String DFA1_minS =
        "\3\4\2\uffff\2\4\1\6\2\4\1\6\6\4\1\34\2\4\1\6\1\4\1\6\5\4\2\34"+
        "\3\4\1\6\2\4\1\6\7\4\1\6\2\4";
    static final String DFA1_maxS =
        "\2\71\1\4\2\uffff\1\71\1\4\1\6\1\71\1\4\1\7\6\71\1\43\1\11\1\4"+
        "\1\6\1\4\1\6\1\11\4\71\1\43\1\34\2\71\1\4\1\6\1\11\1\4\1\6\6\71"+
        "\1\4\1\6\2\71";
    static final String DFA1_acceptS =
        "\3\uffff\1\2\1\1\52\uffff";
    static final String DFA1_specialS =
        "\57\uffff}>";
    static final String[] DFA1_transitionS = {
            "\2\3\4\uffff\1\1\5\uffff\5\4\10\uffff\1\3\3\uffff\1\2\21\uffff"+
            "\7\4",
            "\2\3\4\uffff\1\1\5\uffff\5\4\10\uffff\1\3\3\uffff\1\2\21\uffff"+
            "\7\4",
            "\1\5",
            "",
            "",
            "\1\15\1\3\1\13\1\16\1\10\1\14\1\1\5\uffff\5\4\6\uffff\1\11"+
            "\1\uffff\1\3\3\uffff\1\2\1\6\1\7\1\12\16\uffff\7\4",
            "\1\17",
            "\1\20",
            "\2\3\4\uffff\1\1\5\uffff\5\4\10\uffff\1\3\3\uffff\1\2\21\uffff"+
            "\7\4",
            "\1\21",
            "\1\13\1\16",
            "\2\3\4\uffff\1\1\5\uffff\5\4\10\uffff\1\3\3\uffff\1\2\21\uffff"+
            "\7\4",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\22\7\uffff\1\3\3\uffff\1\2"+
            "\21\uffff\7\4",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\22\1\uffff\1\3\3\uffff\1\3"+
            "\1\uffff\1\3\3\uffff\1\2\1\23\1\24\17\uffff\7\4",
            "\2\3\4\uffff\1\1\5\uffff\5\4\10\uffff\1\3\3\uffff\1\2\21\uffff"+
            "\7\4",
            "\1\15\1\3\1\13\1\16\1\10\1\14\1\1\5\uffff\5\4\6\uffff\1\11"+
            "\1\uffff\1\3\3\uffff\1\2\1\6\1\7\1\12\16\uffff\7\4",
            "\1\15\1\3\1\13\1\16\1\10\1\14\1\1\5\uffff\5\4\6\uffff\1\11"+
            "\1\uffff\1\3\3\uffff\1\2\2\uffff\1\12\16\uffff\7\4",
            "\1\27\5\uffff\1\25\1\26",
            "\1\31\4\uffff\1\30",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\37\4\uffff\1\36",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\22\7\uffff\1\3\3\uffff\1\2"+
            "\21\uffff\7\4",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\22\7\uffff\1\3\3\uffff\1\2"+
            "\1\40\1\41\17\uffff\7\4",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\22\7\uffff\1\3\3\uffff\1\2"+
            "\1\23\1\24\17\uffff\7\4",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\22\7\uffff\1\3\3\uffff\1\2"+
            "\21\uffff\7\4",
            "\1\27\5\uffff\1\25\1\26",
            "\1\27",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\42\7\uffff\1\3\3\uffff\1\2"+
            "\21\uffff\7\4",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\42\7\uffff\1\3\3\uffff\1\2"+
            "\1\43\1\44\17\uffff\7\4",
            "\1\45",
            "\1\46",
            "\1\50\4\uffff\1\47",
            "\1\51",
            "\1\52",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\22\7\uffff\1\3\3\uffff\1\2"+
            "\1\40\1\41\17\uffff\7\4",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\22\7\uffff\1\3\3\uffff\1\2"+
            "\21\uffff\7\4",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\42\7\uffff\1\3\3\uffff\1\2"+
            "\21\uffff\7\4",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\42\7\uffff\1\3\3\uffff\1\2"+
            "\1\53\1\54\17\uffff\7\4",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\42\7\uffff\1\3\3\uffff\1\2"+
            "\1\43\1\44\17\uffff\7\4",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\42\7\uffff\1\3\3\uffff\1\2"+
            "\21\uffff\7\4",
            "\1\55",
            "\1\56",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\42\7\uffff\1\3\3\uffff\1\2"+
            "\1\53\1\54\17\uffff\7\4",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\42\7\uffff\1\3\3\uffff\1\2"+
            "\21\uffff\7\4"
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
    static final String DFA13_eotS =
        "\62\uffff";
    static final String DFA13_eofS =
        "\3\uffff\1\10\56\uffff";
    static final String DFA13_minS =
        "\4\4\3\uffff\1\4\1\uffff\1\4\1\6\2\4\1\6\6\4\1\34\1\4\1\6\2\4\1"+
        "\6\5\4\2\34\3\4\1\6\2\4\1\6\7\4\1\6\2\4";
    static final String DFA13_maxS =
        "\2\41\1\4\1\41\3\uffff\1\44\1\uffff\1\4\1\6\1\4\1\43\1\7\4\41\2"+
        "\44\1\43\1\4\1\6\1\11\1\4\1\6\1\11\1\43\2\41\2\43\1\34\1\41\1\43"+
        "\1\4\1\6\1\11\1\4\1\6\1\43\2\41\2\43\1\41\1\4\1\6\1\43\1\41";
    static final String DFA13_acceptS =
        "\4\uffff\1\3\1\4\1\1\1\uffff\1\2\51\uffff";
    static final String DFA13_specialS =
        "\62\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\3\1\4\4\uffff\1\1\22\uffff\1\5\3\uffff\1\2",
            "\1\6\1\4\4\uffff\1\1\22\uffff\1\5\3\uffff\1\2",
            "\1\7",
            "\2\10\4\uffff\1\10\14\uffff\1\6\1\uffff\1\10\1\uffff\1\6\1"+
            "\uffff\1\10\3\uffff\1\10",
            "",
            "",
            "",
            "\1\14\1\4\1\16\1\17\1\21\1\20\1\1\20\uffff\1\13\1\uffff\1"+
            "\5\3\uffff\1\2\1\11\1\12\1\15",
            "",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\27\1\uffff\1\6\3\uffff\1\6"+
            "\1\uffff\1\5\3\uffff\1\2\1\25\1\26",
            "\1\16\1\17",
            "\1\6\1\4\4\uffff\1\1\22\uffff\1\5\3\uffff\1\2",
            "\1\6\1\4\4\uffff\1\1\22\uffff\1\5\3\uffff\1\2",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\27\7\uffff\1\5\3\uffff\1\2",
            "\1\6\1\4\4\uffff\1\1\22\uffff\1\5\3\uffff\1\2",
            "\1\14\1\4\1\16\1\17\1\21\1\20\1\1\20\uffff\1\13\1\uffff\1"+
            "\5\3\uffff\1\2\1\11\1\12\1\15",
            "\1\14\1\4\1\16\1\17\1\21\1\20\1\1\20\uffff\1\13\1\uffff\1"+
            "\5\3\uffff\1\2\2\uffff\1\15",
            "\1\32\5\uffff\1\30\1\31",
            "\1\33",
            "\1\34",
            "\1\36\4\uffff\1\35",
            "\1\37",
            "\1\40",
            "\1\42\4\uffff\1\41",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\27\7\uffff\1\5\3\uffff\1\2"+
            "\1\25\1\26",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\27\7\uffff\1\5\3\uffff\1\2",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\27\7\uffff\1\5\3\uffff\1\2",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\27\7\uffff\1\5\3\uffff\1\2"+
            "\1\43\1\44",
            "\1\32\5\uffff\1\30\1\31",
            "\1\32",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\45\7\uffff\1\5\3\uffff\1\2",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\45\7\uffff\1\5\3\uffff\1\2"+
            "\1\46\1\47",
            "\1\50",
            "\1\51",
            "\1\53\4\uffff\1\52",
            "\1\54",
            "\1\55",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\27\7\uffff\1\5\3\uffff\1\2"+
            "\1\43\1\44",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\27\7\uffff\1\5\3\uffff\1\2",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\45\7\uffff\1\5\3\uffff\1\2",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\45\7\uffff\1\5\3\uffff\1\2"+
            "\1\56\1\57",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\45\7\uffff\1\5\3\uffff\1\2"+
            "\1\46\1\47",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\45\7\uffff\1\5\3\uffff\1\2",
            "\1\60",
            "\1\61",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\45\7\uffff\1\5\3\uffff\1\2"+
            "\1\56\1\57",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\45\7\uffff\1\5\3\uffff\1\2"
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
            return "420:1: (this_Assignment_0= ruleAssignment | this_Emission_1= ruleEmission | this_TextEffect_2= ruleTextEffect | this_FunctionCallEffect_3= ruleFunctionCallEffect )";
        }
    }
    static final String DFA21_eotS =
        "\16\uffff";
    static final String DFA21_eofS =
        "\16\uffff";
    static final String DFA21_minS =
        "\1\4\13\0\2\uffff";
    static final String DFA21_maxS =
        "\1\60\13\0\2\uffff";
    static final String DFA21_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA21_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\11\1\13\1\2\1\3\1\6\1\4\17\uffff\1\5\3\uffff\1\12\6\uffff"+
            "\1\1\4\uffff\1\7\1\uffff\1\14\4\uffff\1\10",
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "835:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
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
                        if ( (synpred24_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_2 = input.LA(1);

                         
                        int index21_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_3 = input.LA(1);

                         
                        int index21_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_4 = input.LA(1);

                         
                        int index21_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_5 = input.LA(1);

                         
                        int index21_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_6 = input.LA(1);

                         
                        int index21_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_7 = input.LA(1);

                         
                        int index21_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA21_8 = input.LA(1);

                         
                        int index21_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA21_9 = input.LA(1);

                         
                        int index21_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA21_10 = input.LA(1);

                         
                        int index21_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA21_11 = input.LA(1);

                         
                        int index21_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_11);
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
    static final String DFA31_eotS =
        "\15\uffff";
    static final String DFA31_eofS =
        "\15\uffff";
    static final String DFA31_minS =
        "\1\4\4\uffff\7\0\1\uffff";
    static final String DFA31_maxS =
        "\1\60\4\uffff\7\0\1\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\12\uffff\1\2";
    static final String DFA31_specialS =
        "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\11\1\13\2\1\1\6\1\1\17\uffff\1\5\3\uffff\1\12\6\uffff\1"+
            "\1\4\uffff\1\7\1\uffff\1\14\4\uffff\1\10",
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
            return "1304:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_5 = input.LA(1);

                         
                        int index31_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index31_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_7 = input.LA(1);

                         
                        int index31_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index31_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_8 = input.LA(1);

                         
                        int index31_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index31_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_10 = input.LA(1);

                         
                        int index31_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index31_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_11 = input.LA(1);

                         
                        int index31_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index31_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA40_eotS =
        "\14\uffff";
    static final String DFA40_eofS =
        "\14\uffff";
    static final String DFA40_minS =
        "\1\4\3\uffff\1\0\7\uffff";
    static final String DFA40_maxS =
        "\1\60\3\uffff\1\0\7\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\5\uffff\1\4";
    static final String DFA40_specialS =
        "\4\uffff\1\0\7\uffff}>";
    static final String[] DFA40_transitionS = {
            "\2\5\1\1\1\2\1\5\1\3\17\uffff\1\4\3\uffff\1\5\13\uffff\1\5"+
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

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "2024:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_4 = input.LA(1);

                         
                        int index40_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalKEXT()) ) {s = 11;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index40_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA48_eotS =
        "\20\uffff";
    static final String DFA48_eofS =
        "\3\uffff\1\11\6\uffff\1\14\3\uffff\2\11";
    static final String DFA48_minS =
        "\1\12\1\uffff\3\4\1\6\1\uffff\1\6\2\uffff\1\4\3\uffff\2\4";
    static final String DFA48_maxS =
        "\1\41\1\uffff\1\4\1\71\1\4\1\6\1\uffff\1\7\2\uffff\1\71\3\uffff"+
        "\2\71";
    static final String DFA48_acceptS =
        "\1\uffff\1\1\4\uffff\1\4\1\uffff\1\6\1\7\1\uffff\1\3\1\2\1\5\2"+
        "\uffff";
    static final String DFA48_specialS =
        "\20\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\1\26\uffff\1\2",
            "",
            "\1\3",
            "\1\12\1\11\1\15\1\10\1\6\1\14\1\11\5\uffff\5\11\6\uffff\1"+
            "\13\1\uffff\1\11\3\uffff\1\11\1\4\1\5\1\7\16\uffff\7\11",
            "\1\16",
            "\1\17",
            "",
            "\1\15\1\10",
            "",
            "",
            "\2\14\4\uffff\1\14\5\uffff\6\14\1\uffff\1\11\3\uffff\1\11"+
            "\1\uffff\1\14\3\uffff\3\14\17\uffff\7\14",
            "",
            "",
            "",
            "\1\12\1\11\1\15\1\10\1\6\1\14\1\11\5\uffff\5\11\6\uffff\1"+
            "\13\1\uffff\1\11\3\uffff\1\11\1\4\1\5\1\7\16\uffff\7\11",
            "\1\12\1\11\1\15\1\10\1\6\1\14\1\11\5\uffff\5\11\6\uffff\1"+
            "\13\1\uffff\1\11\3\uffff\1\11\2\uffff\1\7\16\uffff\7\11"
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "2651:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )";
        }
    }
 

    public static final BitSet FOLLOW_ruleKext_in_entryRuleKext88 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKext98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleKext144 = new BitSet(new long[]{0x03F80002201F0432L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleKext166 = new BitSet(new long[]{0x0000000220000432L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDeclaration259 = new BitSet(new long[]{0x03F80002001F0400L});
    public static final BitSet FOLLOW_16_in_ruleDeclaration278 = new BitSet(new long[]{0x03F80000001E0000L});
    public static final BitSet FOLLOW_17_in_ruleDeclaration310 = new BitSet(new long[]{0x03F80000001C0000L});
    public static final BitSet FOLLOW_18_in_ruleDeclaration342 = new BitSet(new long[]{0x03F8000000180000L});
    public static final BitSet FOLLOW_19_in_ruleDeclaration374 = new BitSet(new long[]{0x03F8000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDeclaration408 = new BitSet(new long[]{0x03F8000000100000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleDeclaration443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20_in_ruleDeclaration468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValuedObject_in_ruleDeclaration503 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleDeclaration516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValuedObject_in_ruleDeclaration537 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleDeclaration551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObject_in_entryRuleValuedObject587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObject597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObject639 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_ruleValuedObject657 = new BitSet(new long[]{0x00010A10220003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObject678 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleValuedObject693 = new BitSet(new long[]{0x1E00340100000000L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleValuedObject714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_ruleEffect842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_ruleEffect872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCallEffect_in_ruleEffect902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmission996 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleEmission1009 = new BitSet(new long[]{0x00010A10220003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEmission1030 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEmission1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAssignment1136 = new BitSet(new long[]{0x0000000200000410L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment1161 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_27_in_ruleAssignment1174 = new BitSet(new long[]{0x00010A10220003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment1195 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAssignment1207 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_23_in_ruleAssignment1221 = new BitSet(new long[]{0x00010A10220003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect1278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTextEffect1334 = new BitSet(new long[]{0x0000000200000420L});
    public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextEffect1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCallEffect_in_entryRuleFunctionCallEffect1393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCallEffect1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleFunctionCallEffect1449 = new BitSet(new long[]{0x0000000220000400L});
    public static final BitSet FOLLOW_29_in_ruleFunctionCallEffect1462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleFunctionCallEffect1483 = new BitSet(new long[]{0x00000000C2000000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionCallEffect1497 = new BitSet(new long[]{0x00010A11220003F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCallEffect1518 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionCallEffect1531 = new BitSet(new long[]{0x00010A11220003F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCallEffect1552 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionCallEffect1566 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30_in_ruleFunctionCallEffect1585 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFunctionCallEffect1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleExpression1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleBoolExpression1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression1855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression1915 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression1949 = new BitSet(new long[]{0x00010A10220003F0L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression1970 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression2010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression2070 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression2104 = new BitSet(new long[]{0x00010A10220003F0L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression2125 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression2165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression2225 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrOperator_in_ruleBitwiseOrExpression2259 = new BitSet(new long[]{0x00010A10220003F0L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression2280 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression2320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression2380 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndOperator_in_ruleBitwiseAndExpression2414 = new BitSet(new long[]{0x00010A10220003F0L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression2435 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation2475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation2535 = new BitSet(new long[]{0x000001E0A0000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation2568 = new BitSet(new long[]{0x00010A10220003F0L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression2627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression2752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression2821 = new BitSet(new long[]{0x00010A10220003F0L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression2909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression3002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression3062 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression3095 = new BitSet(new long[]{0x00010210220003F0L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression3116 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression3154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression3214 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression3247 = new BitSet(new long[]{0x00010210220003F0L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression3268 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression3306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression3366 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression3399 = new BitSet(new long[]{0x00010210220003F0L});
    public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression3420 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression3458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression3518 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression3551 = new BitSet(new long[]{0x00010210220003F0L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression3610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModExpression3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression3670 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression3703 = new BitSet(new long[]{0x00010210220003F0L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression3762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression3831 = new BitSet(new long[]{0x00010210220003F0L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression3919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolValue_in_ruleAtomicExpression3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAtomicExpression4027 = new BitSet(new long[]{0x00010A10220003F0L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleAtomicExpression4052 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAtomicExpression4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleAtomicExpression4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression4160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression4170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleAtomicValuedExpression4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAtomicValuedExpression4298 = new BitSet(new long[]{0x00010210220003F0L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression4323 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAtomicValuedExpression4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression4401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression4472 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression4491 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleValuedObjectTestExpression4506 = new BitSet(new long[]{0x0001020000000010L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression4527 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleValuedObjectTestExpression4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference4606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference4665 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleValuedObjectReference4678 = new BitSet(new long[]{0x00010A10220003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObjectReference4699 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleValuedObjectReference4711 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall4749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFunctionCall4796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleFunctionCall4817 = new BitSet(new long[]{0x00000000C2000000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionCall4831 = new BitSet(new long[]{0x00010A11220003F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall4852 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionCall4865 = new BitSet(new long[]{0x00010A11220003F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall4886 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionCall4900 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30_in_ruleFunctionCall4919 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFunctionCall4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleParameter5023 = new BitSet(new long[]{0x00010A11220003F0L});
    public static final BitSet FOLLOW_32_in_ruleParameter5054 = new BitSet(new long[]{0x00010A10220003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParameter5091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression5127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue5218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue5309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue5360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolValue_in_entryRuleBoolValue5400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolValue5410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBoolValue5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue5491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation5584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation5824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation5861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation5912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation5952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation5962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTagAnnotation5999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation6056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation6066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleKeyStringValueAnnotation6103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation6124 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation6145 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleKeyStringValueAnnotation6158 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation6179 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation6217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation6227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTypedKeyStringValueAnnotation6264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6285 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTypedKeyStringValueAnnotation6297 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6318 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTypedKeyStringValueAnnotation6330 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation6351 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleTypedKeyStringValueAnnotation6364 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation6385 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation6423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation6433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleKeyBooleanValueAnnotation6470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation6491 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation6549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleKeyIntValueAnnotation6596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation6617 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation6638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation6674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation6684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleKeyFloatValueAnnotation6721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation6742 = new BitSet(new long[]{0x0000001000000080L});
    public static final BitSet FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation6763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString6802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString6813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString6853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleEString6886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID6932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID6943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID6983 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_ruleExtendedID7002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID7017 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_35_in_ruleExtendedID7038 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExtendedID7053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger7101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger7112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInteger7151 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInteger7168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloateger_in_entryRuleFloateger7214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloateger7225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFloateger7264 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloateger7281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleCompareOperator7340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCompareOperator7357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCompareOperator7374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCompareOperator7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCompareOperator7408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCompareOperator7425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePreOperator7469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBitwiseOrOperator7512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBitwiseAndOperator7555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleNotOperator7598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAddOperator7641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSubOperator7684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleMultOperator7727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleModOperator7770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDivOperator7813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleValOperator7856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLogicalOrOperator7899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLogicalAndOperator7942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleValueType7990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleValueType8007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleValueType8024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleValueType8041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleValueType8058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleValueType8075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleValueType8092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleCombineOperator8139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCombineOperator8156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCombineOperator8173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleCombineOperator8190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleCombineOperator8207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCombineOperator8224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCombineOperator8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCombineOperator8258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_synpred24_InternalKEXT1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred34_InternalKEXT2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred49_InternalKEXT4298 = new BitSet(new long[]{0x00010210220003F0L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred49_InternalKEXT4323 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_synpred49_InternalKEXT4334 = new BitSet(new long[]{0x0000000000000002L});

}