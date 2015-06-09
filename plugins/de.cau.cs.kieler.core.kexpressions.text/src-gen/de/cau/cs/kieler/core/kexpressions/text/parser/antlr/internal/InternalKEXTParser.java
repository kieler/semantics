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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'const'", "'input'", "'output'", "'static'", "'signal'", "','", "';'", "'='", "'combine'", "'('", "')'", "'['", "']'", "'<'", "'()'", "'>'", "'&'", "'@'", "'.'", "'#'", "'-'", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "'=='", "'<='", "'>='", "'!='", "'pre'", "'|'", "'!'", "'+'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'string'", "'host'", "'none'", "'max'", "'min'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=4;
    public static final int T__66=66;
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
            this.state.ruleMemo = new HashMap[224+1];
             
             
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

                if ( ((LA9_1>=57 && LA9_1<=63)) ) {
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
            else if ( ((LA9_0>=57 && LA9_0<=63)) ) {
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
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:416:1: ruleEffect returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_TextEffect_3= ruleTextEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;
        int ruleEffect_StartIndex = input.index();
        EObject this_Assignment_0 = null;

        EObject this_PostfixEffect_1 = null;

        EObject this_Emission_2 = null;

        EObject this_TextEffect_3 = null;

        EObject this_FunctionCallEffect_4 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:419:28: ( (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_TextEffect_3= ruleTextEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:420:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_TextEffect_3= ruleTextEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:420:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_TextEffect_3= ruleTextEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_COMMENT_ANNOTATION:
                {
                int LA13_1 = input.LA(2);

                if ( (synpred13_InternalKEXT()) ) {
                    alt13=1;
                }
                else if ( (synpred14_InternalKEXT()) ) {
                    alt13=2;
                }
                else if ( (synpred15_InternalKEXT()) ) {
                    alt13=3;
                }
                else if ( (synpred16_InternalKEXT()) ) {
                    alt13=4;
                }
                else if ( (true) ) {
                    alt13=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA13_2 = input.LA(2);

                if ( (synpred13_InternalKEXT()) ) {
                    alt13=1;
                }
                else if ( (synpred14_InternalKEXT()) ) {
                    alt13=2;
                }
                else if ( (synpred15_InternalKEXT()) ) {
                    alt13=3;
                }
                else if ( (synpred16_InternalKEXT()) ) {
                    alt13=4;
                }
                else if ( (true) ) {
                    alt13=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA13_3 = input.LA(2);

                if ( (synpred13_InternalKEXT()) ) {
                    alt13=1;
                }
                else if ( (synpred14_InternalKEXT()) ) {
                    alt13=2;
                }
                else if ( (synpred15_InternalKEXT()) ) {
                    alt13=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                alt13=4;
                }
                break;
            case 29:
                {
                alt13=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:434:2: this_PostfixEffect_1= rulePostfixEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getPostfixEffectParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePostfixEffect_in_ruleEffect842);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:447:2: this_Emission_2= ruleEmission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmission_in_ruleEffect872);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:460:2: this_TextEffect_3= ruleTextEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextEffect_in_ruleEffect902);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:473:2: this_FunctionCallEffect_4= ruleFunctionCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getFunctionCallEffectParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCallEffect_in_ruleEffect932);
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
            if ( state.backtracking>0 ) { memoize(input, 8, ruleEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleEmission"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:492:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;
        int entryRuleEmission_StartIndex = input.index();
        EObject iv_ruleEmission = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:493:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:494:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FOLLOW_ruleEmission_in_entryRuleEmission967);
            iv_ruleEmission=ruleEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmission977); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:501:1: ruleEmission returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:504:28: ( ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:505:1: ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:505:1: ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:505:2: ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:505:2: ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMENT_ANNOTATION||LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:506:1: (lv_annotations_0_0= ruleRestrictedAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:506:1: (lv_annotations_0_0= ruleRestrictedAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:507:3: lv_annotations_0_0= ruleRestrictedAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmissionAccess().getAnnotationsRestrictedAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRestrictedAnnotation_in_ruleEmission1023);
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
            	    break loop14;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:523:3: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:524:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:524:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:525:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmission1048); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:539:2: (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:539:4: otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleEmission1061); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:543:1: ( (lv_newValue_3_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:544:1: (lv_newValue_3_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:544:1: (lv_newValue_3_0= ruleExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:545:3: lv_newValue_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEmission1082);
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

                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleEmission1094); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 10, ruleEmission_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEmission"


    // $ANTLR start "entryRuleAssignment"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:573:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;
        int entryRuleAssignment_StartIndex = input.index();
        EObject iv_ruleAssignment = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:574:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:575:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1132);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1142); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:582:1: ruleAssignment returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:585:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:586:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:586:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:586:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:586:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_COMMENT_ANNOTATION||LA16_0==33) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:587:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:587:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:588:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAssignment1188);
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
            	    break loop16;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:604:3: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:605:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:605:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:606:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment1213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:620:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:620:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleAssignment1226); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:624:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:625:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:625:1: (lv_indices_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:626:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleAssignment1247);
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

            	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleAssignment1259); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:646:3: ( (lv_operator_5_0= ruleAssignOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:647:1: (lv_operator_5_0= ruleAssignOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:647:1: (lv_operator_5_0= ruleAssignOperator )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:648:3: lv_operator_5_0= ruleAssignOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getOperatorAssignOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssignOperator_in_ruleAssignment1282);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:664:2: ( (lv_expression_6_0= ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:665:1: (lv_expression_6_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:665:1: (lv_expression_6_0= ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:666:3: lv_expression_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment1303);
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


    // $ANTLR start "entryRulePostfixEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:690:1: entryRulePostfixEffect returns [EObject current=null] : iv_rulePostfixEffect= rulePostfixEffect EOF ;
    public final EObject entryRulePostfixEffect() throws RecognitionException {
        EObject current = null;
        int entryRulePostfixEffect_StartIndex = input.index();
        EObject iv_rulePostfixEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:691:2: (iv_rulePostfixEffect= rulePostfixEffect EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:692:2: iv_rulePostfixEffect= rulePostfixEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixEffectRule()); 
            }
            pushFollow(FOLLOW_rulePostfixEffect_in_entryRulePostfixEffect1339);
            iv_rulePostfixEffect=rulePostfixEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfixEffect1349); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, entryRulePostfixEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePostfixEffect"


    // $ANTLR start "rulePostfixEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:699:1: rulePostfixEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:702:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:703:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:703:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:703:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:703:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_COMMENT_ANNOTATION||LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:704:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:704:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:705:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_rulePostfixEffect1395);
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
            	    break loop18;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:721:3: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:722:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:722:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:723:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPostfixEffectRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePostfixEffect1420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getPostfixEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:737:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:737:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_rulePostfixEffect1433); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPostfixEffectAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:741:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:742:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:742:1: (lv_indices_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:743:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_rulePostfixEffect1454);
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

            	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_rulePostfixEffect1466); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getPostfixEffectAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:763:3: ( (lv_operator_5_0= rulePostfixOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:764:1: (lv_operator_5_0= rulePostfixOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:764:1: (lv_operator_5_0= rulePostfixOperator )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:765:3: lv_operator_5_0= rulePostfixOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getOperatorPostfixOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePostfixOperator_in_rulePostfixEffect1489);
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
            if ( state.backtracking>0 ) { memoize(input, 14, rulePostfixEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePostfixEffect"


    // $ANTLR start "entryRuleTextEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:789:1: entryRuleTextEffect returns [EObject current=null] : iv_ruleTextEffect= ruleTextEffect EOF ;
    public final EObject entryRuleTextEffect() throws RecognitionException {
        EObject current = null;
        int entryRuleTextEffect_StartIndex = input.index();
        EObject iv_ruleTextEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:790:2: (iv_ruleTextEffect= ruleTextEffect EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:791:2: iv_ruleTextEffect= ruleTextEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextEffectRule()); 
            }
            pushFollow(FOLLOW_ruleTextEffect_in_entryRuleTextEffect1525);
            iv_ruleTextEffect=ruleTextEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextEffect1535); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, entryRuleTextEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTextEffect"


    // $ANTLR start "ruleTextEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:798:1: ruleTextEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleTextEffect() throws RecognitionException {
        EObject current = null;
        int ruleTextEffect_StartIndex = input.index();
        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:801:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:802:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:802:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:802:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:802:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_COMMENT_ANNOTATION||LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:803:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:803:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:804:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTextEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleTextEffect1581);
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
            	    break loop20;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:820:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:821:1: (lv_text_1_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:821:1: (lv_text_1_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:822:3: lv_text_1_0= RULE_HOSTCODE
            {
            lv_text_1_0=(Token)match(input,RULE_HOSTCODE,FOLLOW_RULE_HOSTCODE_in_ruleTextEffect1599); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 16, ruleTextEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTextEffect"


    // $ANTLR start "entryRuleFunctionCallEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:846:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionCallEffect_StartIndex = input.index();
        EObject iv_ruleFunctionCallEffect = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:847:2: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:848:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallEffectRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCallEffect_in_entryRuleFunctionCallEffect1640);
            iv_ruleFunctionCallEffect=ruleFunctionCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCallEffect1650); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, entryRuleFunctionCallEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCallEffect"


    // $ANTLR start "ruleFunctionCallEffect"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:855:1: ruleFunctionCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:858:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:859:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:859:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:859:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>'
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:859:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_COMMENT_ANNOTATION||LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:860:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:860:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:861:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleFunctionCallEffect1696);
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
            	    break loop21;
                }
            } while (true);

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleFunctionCallEffect1709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:881:1: ( (lv_functionName_2_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:882:1: (lv_functionName_2_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:882:1: (lv_functionName_2_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:883:3: lv_functionName_2_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getFunctionNameExtendedIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleFunctionCallEffect1730);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:899:2: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            else if ( (LA23_0==30) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:899:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:899:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:899:5: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleFunctionCallEffect1744); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_3_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:903:1: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:904:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:904:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:905:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionCallEffect1765);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:921:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==21) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:921:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleFunctionCallEffect1778); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_3_0_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:925:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:926:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:926:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:927:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionCallEffect1799);
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
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleFunctionCallEffect1813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_3_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:948:7: otherlv_8= '()'
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleFunctionCallEffect1832); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleFunctionCallEffect1846); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 18, ruleFunctionCallEffect_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCallEffect"


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:966:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleExpression_StartIndex = input.index();
        EObject iv_ruleExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:967:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:968:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1884);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1894); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, entryRuleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:975:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;
        int ruleExpression_StartIndex = input.index();
        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:978:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:979:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:979:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:980:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleExpression1944);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:993:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleExpression1974);
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
            if ( state.backtracking>0 ) { memoize(input, 20, ruleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBoolExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1012:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBoolExpression_StartIndex = input.index();
        EObject iv_ruleBoolExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1013:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1014:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression2009);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpression2019); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, entryRuleBoolExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1021:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;
        int ruleBoolExpression_StartIndex = input.index();
        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1024:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1026:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleBoolExpression2068);
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
            if ( state.backtracking>0 ) { memoize(input, 22, ruleBoolExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1045:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleLogicalOrExpression_StartIndex = input.index();
        EObject iv_ruleLogicalOrExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1046:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1047:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression2102);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression2112); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, entryRuleLogicalOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1054:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;
        int ruleLogicalOrExpression_StartIndex = input.index();
        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1057:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1058:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1058:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1059:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression2162);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1070:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==55) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1070:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1070:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1071:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1079:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==55) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1079:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1079:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1080:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1080:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1081:3: lv_operator_2_0= ruleLogicalOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression2196);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1097:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1098:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1098:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1099:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression2217);
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
                    	    if ( cnt25 >= 1 ) break loop25;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
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
            if ( state.backtracking>0 ) { memoize(input, 24, ruleLogicalOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1123:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleLogicalAndExpression_StartIndex = input.index();
        EObject iv_ruleLogicalAndExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1124:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1125:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression2257);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression2267); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, entryRuleLogicalAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1132:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;
        int ruleLogicalAndExpression_StartIndex = input.index();
        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1135:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1136:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1136:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1137:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression2317);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1148:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==56) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1148:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1148:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1149:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1157:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
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
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1157:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1157:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1158:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1158:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1159:3: lv_operator_2_0= ruleLogicalAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression2351);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1175:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1176:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1176:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1177:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression2372);
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
            if ( state.backtracking>0 ) { memoize(input, 26, ruleLogicalAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1201:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBitwiseOrExpression_StartIndex = input.index();
        EObject iv_ruleBitwiseOrExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1202:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1203:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression2412);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression2422); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, entryRuleBitwiseOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseOrExpression"


    // $ANTLR start "ruleBitwiseOrExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1210:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;
        int ruleBitwiseOrExpression_StartIndex = input.index();
        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1213:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1214:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1214:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1215:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression2472);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1226:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1226:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1226:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1227:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1235:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==48) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1235:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1235:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1236:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1236:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1237:3: lv_operator_2_0= ruleBitwiseOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBitwiseOrOperator_in_ruleBitwiseOrExpression2506);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1253:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1254:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1254:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1255:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression2527);
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
            if ( state.backtracking>0 ) { memoize(input, 28, ruleBitwiseOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1279:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBitwiseAndExpression_StartIndex = input.index();
        EObject iv_ruleBitwiseAndExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1280:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1281:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression2567);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression2577); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, entryRuleBitwiseAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseAndExpression"


    // $ANTLR start "ruleBitwiseAndExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1288:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;
        int ruleBitwiseAndExpression_StartIndex = input.index();
        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1291:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1292:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1292:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1293:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression2627);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1304:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==32) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1304:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1304:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1305:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1313:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==32) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1313:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1313:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1314:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1314:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1315:3: lv_operator_2_0= ruleBitwiseAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBitwiseAndOperator_in_ruleBitwiseAndExpression2661);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1331:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1332:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1332:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1333:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression2682);
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
            if ( state.backtracking>0 ) { memoize(input, 30, ruleBitwiseAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1357:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;
        int entryRuleCompareOperation_StartIndex = input.index();
        EObject iv_ruleCompareOperation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1358:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1359:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation2722);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation2732); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, entryRuleCompareOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1366:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;
        int ruleCompareOperation_StartIndex = input.index();
        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1369:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1370:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1370:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1371:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation2782);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1382:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31||(LA33_0>=43 && LA33_0<=46)) ) {
                alt33=1;
            }
            else if ( (LA33_0==29) ) {
                int LA33_2 = input.LA(2);

                if ( ((LA33_2>=RULE_HOSTCODE && LA33_2<=RULE_STRING)||LA33_2==25||LA33_2==29||LA33_2==36||LA33_2==47||LA33_2==49||LA33_2==54) ) {
                    alt33=1;
                }
                else if ( (LA33_2==RULE_ID) ) {
                    int LA33_4 = input.LA(3);

                    if ( (LA33_4==EOF||(LA33_4>=RULE_ID && LA33_4<=RULE_HOSTCODE)||LA33_4==RULE_COMMENT_ANNOTATION||(LA33_4>=21 && LA33_4<=22)||LA33_4==24||(LA33_4>=26 && LA33_4<=29)||(LA33_4>=32 && LA33_4<=33)||LA33_4==36||LA33_4==48||(LA33_4>=50 && LA33_4<=53)||(LA33_4>=55 && LA33_4<=56)) ) {
                        alt33=1;
                    }
                }
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1382:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1382:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1383:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1391:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1392:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1392:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1393:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareOperation2815);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1409:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1410:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1410:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1411:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation2836);
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
            if ( state.backtracking>0 ) { memoize(input, 32, ruleCompareOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleNotOrValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1435:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNotOrValuedExpression_StartIndex = input.index();
        EObject iv_ruleNotOrValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1436:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1437:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression2874);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOrValuedExpression2884); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, entryRuleNotOrValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNotOrValuedExpression"


    // $ANTLR start "ruleNotOrValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1444:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleNotOrValuedExpression_StartIndex = input.index();
        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1447:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1448:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1448:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1449:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression2934);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1462:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression2964);
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
            if ( state.backtracking>0 ) { memoize(input, 34, ruleNotOrValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotOrValuedExpression"


    // $ANTLR start "entryRuleNotExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1481:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNotExpression_StartIndex = input.index();
        EObject iv_ruleNotExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1482:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1483:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_entryRuleNotExpression2999);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotExpression3009); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, entryRuleNotExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1490:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;
        int ruleNotExpression_StartIndex = input.index();
        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1493:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1494:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1494:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_HOSTCODE)||LA35_0==RULE_BOOLEAN||LA35_0==25||LA35_0==29||LA35_0==47||LA35_0==54) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1494:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1494:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1494:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1494:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1495:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1503:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1504:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1504:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1505:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotOperator_in_ruleNotExpression3068);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1521:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1522:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1522:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1523:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleNotExpression3089);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1541:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleNotExpression3121);
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
            if ( state.backtracking>0 ) { memoize(input, 36, ruleNotExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1560:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedExpression_StartIndex = input.index();
        EObject iv_ruleValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1561:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1562:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression3156);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedExpression3166); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, entryRuleValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedExpression"


    // $ANTLR start "ruleValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1569:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleValuedExpression_StartIndex = input.index();
        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1572:28: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1574:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAddExpression_in_ruleValuedExpression3215);
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
            if ( state.backtracking>0 ) { memoize(input, 38, ruleValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedExpression"


    // $ANTLR start "entryRuleAddExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1593:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAddExpression_StartIndex = input.index();
        EObject iv_ruleAddExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1594:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1595:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAddExpression_in_entryRuleAddExpression3249);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExpression3259); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, entryRuleAddExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1602:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;
        int ruleAddExpression_StartIndex = input.index();
        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1605:28: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1606:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1606:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1607:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression3309);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1618:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==50) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1618:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1618:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1619:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1627:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1628:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1628:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1629:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddOperator_in_ruleAddExpression3342);
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

            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1645:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1646:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1646:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1647:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression3363);
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
            	    break loop36;
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
            if ( state.backtracking>0 ) { memoize(input, 40, ruleAddExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1671:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleSubExpression_StartIndex = input.index();
        EObject iv_ruleSubExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1672:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1673:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_entryRuleSubExpression3401);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubExpression3411); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, entryRuleSubExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSubExpression"


    // $ANTLR start "ruleSubExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1680:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;
        int ruleSubExpression_StartIndex = input.index();
        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1683:28: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1684:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1684:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1685:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression3461);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1696:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==36) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1696:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1696:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1697:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1705:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1706:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1706:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1707:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubOperator_in_ruleSubExpression3494);
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

            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1723:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1724:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1724:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1725:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression3515);
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
            	    break loop37;
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
            if ( state.backtracking>0 ) { memoize(input, 42, ruleSubExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1749:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleMultExpression_StartIndex = input.index();
        EObject iv_ruleMultExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1750:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1751:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_entryRuleMultExpression3553);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultExpression3563); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, entryRuleMultExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1758:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;
        int ruleMultExpression_StartIndex = input.index();
        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1761:28: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1762:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1762:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1763:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDivExpression_in_ruleMultExpression3613);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1774:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==51) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1774:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1774:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1775:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1783:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1784:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1784:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1785:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOperator_in_ruleMultExpression3646);
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

            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1801:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1802:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1802:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1803:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDivExpression_in_ruleMultExpression3667);
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
            if ( state.backtracking>0 ) { memoize(input, 44, ruleMultExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1827:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleDivExpression_StartIndex = input.index();
        EObject iv_ruleDivExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1828:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1829:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleDivExpression_in_entryRuleDivExpression3705);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivExpression3715); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, entryRuleDivExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDivExpression"


    // $ANTLR start "ruleDivExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1836:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;
        int ruleDivExpression_StartIndex = input.index();
        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1839:28: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1840:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1840:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1841:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleModExpression_in_ruleDivExpression3765);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1852:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==53) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1852:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1852:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1853:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1861:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1862:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1862:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1863:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDivOperator_in_ruleDivExpression3798);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1879:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1880:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1880:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1881:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModExpression_in_ruleDivExpression3819);
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
            if ( state.backtracking>0 ) { memoize(input, 46, ruleDivExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1905:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleModExpression_StartIndex = input.index();
        EObject iv_ruleModExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1906:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1907:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_entryRuleModExpression3857);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModExpression3867); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, entryRuleModExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleModExpression"


    // $ANTLR start "ruleModExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1914:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;
        int ruleModExpression_StartIndex = input.index();
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1917:28: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1918:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1918:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1919:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNegExpression_in_ruleModExpression3917);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1930:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==52) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1930:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1930:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1931:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1939:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1940:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1940:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1941:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModOperator_in_ruleModExpression3950);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1957:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1958:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1958:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1959:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression3971);
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
            if ( state.backtracking>0 ) { memoize(input, 48, ruleModExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModExpression"


    // $ANTLR start "entryRuleNegExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1983:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNegExpression_StartIndex = input.index();
        EObject iv_ruleNegExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1984:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1985:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNegExpression_in_entryRuleNegExpression4009);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpression4019); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, entryRuleNegExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNegExpression"


    // $ANTLR start "ruleNegExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1992:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;
        int ruleNegExpression_StartIndex = input.index();
        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1995:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1996:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1996:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==36) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_STRING)||LA41_0==25||LA41_0==29||LA41_0==47||LA41_0==54) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1996:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1996:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1996:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1996:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1997:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2005:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2006:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2006:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2007:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSubOperator_in_ruleNegExpression4078);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2023:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2024:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2024:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2025:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNegExpression_in_ruleNegExpression4099);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2043:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression4131);
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
            if ( state.backtracking>0 ) { memoize(input, 50, ruleNegExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNegExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2062:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAtomicExpression_StartIndex = input.index();
        EObject iv_ruleAtomicExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2063:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2064:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression4166);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression4176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, entryRuleAtomicExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2071:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2074:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2075:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2075:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            int alt42=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt42=1;
                }
                break;
            case RULE_ID:
            case 47:
            case 54:
                {
                alt42=2;
                }
                break;
            case 25:
                {
                alt42=3;
                }
                break;
            case 29:
                {
                alt42=4;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt42=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2076:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolValue_in_ruleAtomicExpression4226);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2089:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression4256);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2101:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2101:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2101:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleAtomicExpression4274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleAtomicExpression4299);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleAtomicExpression4310); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2123:2: this_FunctionCall_5= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleAtomicExpression4342);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2136:2: this_TextExpression_6= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_ruleAtomicExpression4372);
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
            if ( state.backtracking>0 ) { memoize(input, 52, ruleAtomicExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleAtomicValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2155:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAtomicValuedExpression_StartIndex = input.index();
        EObject iv_ruleAtomicValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2156:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2157:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression4407);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicValuedExpression4417); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, entryRuleAtomicValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicValuedExpression"


    // $ANTLR start "ruleAtomicValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2164:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2167:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2168:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2168:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt43=5;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2169:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression4467);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2182:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression4497);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2195:2: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getStringValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_ruleAtomicValuedExpression4527);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2207:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2207:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2207:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleAtomicValuedExpression4545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression4570);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleAtomicValuedExpression4581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2229:2: this_AtomicExpression_6= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression4613);
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
            if ( state.backtracking>0 ) { memoize(input, 54, ruleAtomicValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAtomicValuedExpression"


    // $ANTLR start "entryRuleValuedObjectTestExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2248:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObjectTestExpression_StartIndex = input.index();
        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2249:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2250:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression4648);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObjectTestExpression4658); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, entryRuleValuedObjectTestExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectTestExpression"


    // $ANTLR start "ruleValuedObjectTestExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2257:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2260:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2261:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2261:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==47||LA45_0==54) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_ID) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2261:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2261:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2261:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2261:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2262:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2270:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2271:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2271:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2272:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2272:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==47) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==54) ) {
                        alt44=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2273:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression4719);
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
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2288:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression4738);
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

                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleValuedObjectTestExpression4753); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2310:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2311:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2311:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2312:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression4774);
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

                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleValuedObjectTestExpression4786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2334:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression4818);
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
            if ( state.backtracking>0 ) { memoize(input, 56, ruleValuedObjectTestExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObjectTestExpression"


    // $ANTLR start "entryRuleValuedObjectReference"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2353:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObjectReference_StartIndex = input.index();
        EObject iv_ruleValuedObjectReference = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2354:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2355:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference4853);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObjectReference4863); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, entryRuleValuedObjectReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectReference"


    // $ANTLR start "ruleValuedObjectReference"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2362:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;
        int ruleValuedObjectReference_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_indices_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2365:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2366:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2366:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2366:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2366:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2367:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2367:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2368:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValuedObjectReference4912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2382:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==27) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2382:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleValuedObjectReference4925); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2386:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2387:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2387:1: (lv_indices_2_0= ruleExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2388:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleValuedObjectReference4946);
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

            	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleValuedObjectReference4958); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop46;
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
            if ( state.backtracking>0 ) { memoize(input, 58, ruleValuedObjectReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleFunctionCall"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2416:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionCall_StartIndex = input.index();
        EObject iv_ruleFunctionCall = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2417:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2418:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall4996);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall5006); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, entryRuleFunctionCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2425:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2428:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2429:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2429:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2429:3: otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleFunctionCall5043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2433:1: ( (lv_functionName_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2434:1: (lv_functionName_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2434:1: (lv_functionName_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2435:3: lv_functionName_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleFunctionCall5064);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2451:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )?
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==25) ) {
                alt48=1;
            }
            else if ( (LA48_0==30) ) {
                alt48=2;
            }
            switch (alt48) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2451:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2451:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2451:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleFunctionCall5078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2455:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2456:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2456:1: (lv_parameters_3_0= ruleParameter )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2457:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionCall5099);
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2473:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==21) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2473:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleFunctionCall5112); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2477:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2478:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2478:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2479:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionCall5133);
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
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleFunctionCall5147); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2500:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleFunctionCall5166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleFunctionCall5180); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 60, ruleFunctionCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleParameter"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2516:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;
        int entryRuleParameter_StartIndex = input.index();
        EObject iv_ruleParameter = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2517:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2518:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter5216);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter5226); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, entryRuleParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2525:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;
        int ruleParameter_StartIndex = input.index();
        Token lv_callByReference_0_0=null;
        Token lv_pureOutput_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2528:28: ( ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2529:1: ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2529:1: ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2529:2: ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2529:2: ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==32) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2529:3: ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )?
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2529:3: ( (lv_callByReference_0_0= '&' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2530:1: (lv_callByReference_0_0= '&' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2530:1: (lv_callByReference_0_0= '&' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2531:3: lv_callByReference_0_0= '&'
                    {
                    lv_callByReference_0_0=(Token)match(input,32,FOLLOW_32_in_ruleParameter5270); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2544:2: ( (lv_pureOutput_1_0= '&' ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==32) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2545:1: (lv_pureOutput_1_0= '&' )
                            {
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2545:1: (lv_pureOutput_1_0= '&' )
                            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2546:3: lv_pureOutput_1_0= '&'
                            {
                            lv_pureOutput_1_0=(Token)match(input,32,FOLLOW_32_in_ruleParameter5301); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2559:5: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2560:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2560:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2561:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParameter5338);
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
            if ( state.backtracking>0 ) { memoize(input, 62, ruleParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTextExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2585:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleTextExpression_StartIndex = input.index();
        EObject iv_ruleTextExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2586:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2587:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTextExpression_in_entryRuleTextExpression5374);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextExpression5384); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, entryRuleTextExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2594:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;
        int ruleTextExpression_StartIndex = input.index();
        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2597:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2598:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2598:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2599:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2599:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2600:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FOLLOW_RULE_HOSTCODE_in_ruleTextExpression5425); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 64, ruleTextExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleIntValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2624:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;
        int entryRuleIntValue_StartIndex = input.index();
        EObject iv_ruleIntValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2625:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2626:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue5465);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue5475); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, entryRuleIntValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2633:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;
        int ruleIntValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2636:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2637:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2637:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2638:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2638:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2639:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue5516); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 66, ruleIntValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2663:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;
        int entryRuleFloatValue_StartIndex = input.index();
        EObject iv_ruleFloatValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2664:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2665:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue5556);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue5566); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, entryRuleFloatValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2672:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;
        int ruleFloatValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2675:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2676:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2676:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2677:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2677:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2678:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue5607); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 68, ruleFloatValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleBoolValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2702:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;
        int entryRuleBoolValue_StartIndex = input.index();
        EObject iv_ruleBoolValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2703:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2704:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FOLLOW_ruleBoolValue_in_entryRuleBoolValue5647);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolValue5657); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, entryRuleBoolValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2711:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;
        int ruleBoolValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2714:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2715:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2715:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2716:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2716:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2717:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBoolValue5698); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 70, ruleBoolValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleStringValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2741:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;
        int entryRuleStringValue_StartIndex = input.index();
        EObject iv_ruleStringValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2742:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2743:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue5738);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue5748); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, entryRuleStringValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2750:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;
        int ruleStringValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2753:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2754:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2754:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2755:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2755:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2756:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue5789); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 72, ruleStringValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2782:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleAnnotation_StartIndex = input.index();
        EObject iv_ruleAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2783:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2784:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation5831);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation5841); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, entryRuleAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2791:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2794:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2795:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2795:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            int alt51=7;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2796:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommentAnnotation_in_ruleAnnotation5891);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2809:2: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation5921);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2822:2: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation5951);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2835:2: this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation5981);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2848:2: this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation6011);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2861:2: this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation6041);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2874:2: this_TagAnnotation_6= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTagAnnotation_in_ruleAnnotation6071);
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
            if ( state.backtracking>0 ) { memoize(input, 74, ruleAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleRestrictedAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2895:1: entryRuleRestrictedAnnotation returns [EObject current=null] : iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF ;
    public final EObject entryRuleRestrictedAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleRestrictedAnnotation_StartIndex = input.index();
        EObject iv_ruleRestrictedAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2896:2: (iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2897:2: iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleRestrictedAnnotation_in_entryRuleRestrictedAnnotation6108);
            iv_ruleRestrictedAnnotation=ruleRestrictedAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestrictedAnnotation6118); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, entryRuleRestrictedAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleRestrictedAnnotation"


    // $ANTLR start "ruleRestrictedAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2904:1: ruleRestrictedAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2907:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2908:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2908:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            int alt52=7;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2909:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommentAnnotation_in_ruleRestrictedAnnotation6168);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2922:2: this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getQuotedKeyStringValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQuotedKeyStringValueAnnotation_in_ruleRestrictedAnnotation6198);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2935:2: this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getQuotedTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_ruleRestrictedAnnotation6228);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2948:2: this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleRestrictedAnnotation6258);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2961:2: this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_ruleRestrictedAnnotation6288);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2974:2: this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_ruleRestrictedAnnotation6318);
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2987:2: this_TagAnnotation_6= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getTagAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTagAnnotation_in_ruleRestrictedAnnotation6348);
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
            if ( state.backtracking>0 ) { memoize(input, 76, ruleRestrictedAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleRestrictedAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3006:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleCommentAnnotation_StartIndex = input.index();
        EObject iv_ruleCommentAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3007:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3008:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation6383);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentAnnotation6393); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, entryRuleCommentAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentAnnotation"


    // $ANTLR start "ruleCommentAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3015:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleCommentAnnotation_StartIndex = input.index();
        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3018:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3019:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3019:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3020:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3020:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3021:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation6434); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 78, ruleCommentAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleTagAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3045:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleTagAnnotation_StartIndex = input.index();
        EObject iv_ruleTagAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3046:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3047:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation6474);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagAnnotation6484); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, entryRuleTagAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTagAnnotation"


    // $ANTLR start "ruleTagAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3054:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleTagAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3057:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3058:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3058:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3058:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleTagAnnotation6521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3062:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3063:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3063:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3064:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTagAnnotation6542);
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
            if ( state.backtracking>0 ) { memoize(input, 80, ruleTagAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3088:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3089:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3090:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation6578);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation6588); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, entryRuleKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyStringValueAnnotation"


    // $ANTLR start "ruleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3097:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3100:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3101:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3101:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3101:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleKeyStringValueAnnotation6625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3105:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3106:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3106:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3107:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation6646);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3123:2: ( (lv_values_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3124:1: (lv_values_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3124:1: (lv_values_2_0= ruleEString )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3125:3: lv_values_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation6667);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3141:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==21) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3141:4: otherlv_3= ',' ( (lv_values_4_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleKeyStringValueAnnotation6680); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3145:1: ( (lv_values_4_0= ruleEString ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3146:1: (lv_values_4_0= ruleEString )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3146:1: (lv_values_4_0= ruleEString )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3147:3: lv_values_4_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation6701);
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
            	    break loop53;
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
            if ( state.backtracking>0 ) { memoize(input, 82, ruleKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3171:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleTypedKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3172:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3173:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation6739);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation6749); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, entryRuleTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3180:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3183:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3184:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3184:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3184:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleTypedKeyStringValueAnnotation6786); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3188:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3189:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3189:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3190:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6807);
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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleTypedKeyStringValueAnnotation6819); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3210:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3211:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3211:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3212:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6840);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleTypedKeyStringValueAnnotation6852); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3232:1: ( (lv_values_5_0= ruleEString ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3233:1: (lv_values_5_0= ruleEString )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3233:1: (lv_values_5_0= ruleEString )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3234:3: lv_values_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation6873);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3250:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==21) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3250:4: otherlv_6= ',' ( (lv_values_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleTypedKeyStringValueAnnotation6886); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3254:1: ( (lv_values_7_0= ruleEString ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3255:1: (lv_values_7_0= ruleEString )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3255:1: (lv_values_7_0= ruleEString )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3256:3: lv_values_7_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation6907);
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
            if ( state.backtracking>0 ) { memoize(input, 84, ruleTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3280:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleQuotedKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3281:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3282:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleQuotedKeyStringValueAnnotation_in_entryRuleQuotedKeyStringValueAnnotation6945);
            iv_ruleQuotedKeyStringValueAnnotation=ruleQuotedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuotedKeyStringValueAnnotation6955); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, entryRuleQuotedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3289:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3292:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3293:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3293:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3293:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleQuotedKeyStringValueAnnotation6992); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3297:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3298:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3298:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3299:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleQuotedKeyStringValueAnnotation7013);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3315:2: ( (lv_values_2_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3316:1: (lv_values_2_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3316:1: (lv_values_2_0= RULE_STRING )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3317:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation7030); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3333:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==21) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3333:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleQuotedKeyStringValueAnnotation7048); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3337:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3338:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3338:1: (lv_values_4_0= RULE_STRING )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3339:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation7065); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 86, ruleQuotedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleQuotedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3363:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleQuotedTypedKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3364:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3365:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_entryRuleQuotedTypedKeyStringValueAnnotation7108);
            iv_ruleQuotedTypedKeyStringValueAnnotation=ruleQuotedTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuotedTypedKeyStringValueAnnotation7118); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, entryRuleQuotedTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3372:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3375:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3376:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3376:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3376:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleQuotedTypedKeyStringValueAnnotation7155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3380:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3381:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3381:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3382:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation7176);
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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleQuotedTypedKeyStringValueAnnotation7188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3402:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3403:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3403:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3404:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation7209);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleQuotedTypedKeyStringValueAnnotation7221); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3424:1: ( (lv_values_5_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3425:1: (lv_values_5_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3425:1: (lv_values_5_0= RULE_STRING )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3426:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation7238); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3442:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==21) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3442:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleQuotedTypedKeyStringValueAnnotation7256); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3446:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3447:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3447:1: (lv_values_7_0= RULE_STRING )
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3448:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation7273); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 88, ruleQuotedTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3472:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyBooleanValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3473:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3474:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation7316);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation7326); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, entryRuleKeyBooleanValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyBooleanValueAnnotation"


    // $ANTLR start "ruleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3481:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyBooleanValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3484:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3485:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3485:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3485:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleKeyBooleanValueAnnotation7363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3489:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3490:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3490:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3491:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation7384);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3507:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3508:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3508:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3509:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation7401); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 90, ruleKeyBooleanValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyBooleanValueAnnotation"


    // $ANTLR start "entryRuleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3533:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyIntValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3534:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3535:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation7442);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation7452); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, entryRuleKeyIntValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyIntValueAnnotation"


    // $ANTLR start "ruleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3542:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyIntValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3545:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3546:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3546:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3546:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleKeyIntValueAnnotation7489); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3550:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3551:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3551:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3552:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation7510);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3568:2: ( (lv_value_2_0= ruleInteger ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3569:1: (lv_value_2_0= ruleInteger )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3569:1: (lv_value_2_0= ruleInteger )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3570:3: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation7531);
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
            if ( state.backtracking>0 ) { memoize(input, 92, ruleKeyIntValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyIntValueAnnotation"


    // $ANTLR start "entryRuleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3594:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyFloatValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3595:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3596:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation7567);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation7577); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, entryRuleKeyFloatValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyFloatValueAnnotation"


    // $ANTLR start "ruleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3603:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyFloatValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3606:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3607:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3607:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3607:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleKeyFloatValueAnnotation7614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3611:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3612:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3612:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3613:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation7635);
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

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3629:2: ( (lv_value_2_0= ruleFloateger ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3630:1: (lv_value_2_0= ruleFloateger )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3630:1: (lv_value_2_0= ruleFloateger )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3631:3: lv_value_2_0= ruleFloateger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation7656);
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
            if ( state.backtracking>0 ) { memoize(input, 94, ruleKeyFloatValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyFloatValueAnnotation"


    // $ANTLR start "entryRuleEString"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3657:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;
        int entryRuleEString_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3658:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3659:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString7695);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString7706); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, entryRuleEString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3666:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleEString_StartIndex = input.index();
        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3669:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3670:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3670:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_STRING) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_ID) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3670:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString7746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3679:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAccess().getExtendedIDParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_ruleEString7779);
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
            if ( state.backtracking>0 ) { memoize(input, 96, ruleEString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3697:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;
        int entryRuleExtendedID_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3698:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3699:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID7825);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID7836); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, entryRuleExtendedID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3706:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleExtendedID_StartIndex = input.index();
        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3709:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3710:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3710:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3710:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID7876); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3717:1: (kw= '.' this_ID_2= RULE_ID )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==34) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3718:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,34,FOLLOW_34_in_ruleExtendedID7895); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID7910); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3730:3: (kw= '#' this_INT_4= RULE_INT )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==35) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3731:2: kw= '#' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleExtendedID7931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
                          
                    }
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExtendedID7946); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 98, ruleExtendedID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleInteger"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3751:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;
        int entryRuleInteger_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3752:2: (iv_ruleInteger= ruleInteger EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3753:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger7994);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger8005); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 99, entryRuleInteger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3760:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleInteger_StartIndex = input.index();
        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3763:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3764:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3764:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3764:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3764:2: (kw= '-' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==36) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3765:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleInteger8044); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInteger8061); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 100, ruleInteger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleFloateger"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3785:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;
        int entryRuleFloateger_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3786:2: (iv_ruleFloateger= ruleFloateger EOF )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3787:2: iv_ruleFloateger= ruleFloateger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloategerRule()); 
            }
            pushFollow(FOLLOW_ruleFloateger_in_entryRuleFloateger8107);
            iv_ruleFloateger=ruleFloateger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloateger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloateger8118); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, entryRuleFloateger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFloateger"


    // $ANTLR start "ruleFloateger"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3794:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFloateger_StartIndex = input.index();
        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3797:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3798:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3798:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3798:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3798:2: (kw= '-' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==36) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3799:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleFloateger8157); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloateger8174); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 102, ruleFloateger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFloateger"


    // $ANTLR start "ruleAssignOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3819:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3821:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3822:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3822:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) )
            int alt62=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt62=1;
                }
                break;
            case 37:
                {
                alt62=2;
                }
                break;
            case 38:
                {
                alt62=3;
                }
                break;
            case 39:
                {
                alt62=4;
                }
                break;
            case 40:
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3822:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3822:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3822:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_ruleAssignOperator8233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3828:6: (enumLiteral_1= '+=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3828:6: (enumLiteral_1= '+=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3828:8: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_37_in_ruleAssignOperator8250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3834:6: (enumLiteral_2= '-=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3834:6: (enumLiteral_2= '-=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3834:8: enumLiteral_2= '-='
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_38_in_ruleAssignOperator8267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3840:6: (enumLiteral_3= '*=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3840:6: (enumLiteral_3= '*=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3840:8: enumLiteral_3= '*='
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_39_in_ruleAssignOperator8284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3846:6: (enumLiteral_4= '/=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3846:6: (enumLiteral_4= '/=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3846:8: enumLiteral_4= '/='
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_40_in_ruleAssignOperator8301); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 103, ruleAssignOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAssignOperator"


    // $ANTLR start "rulePostfixOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3856:1: rulePostfixOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator rulePostfixOperator() throws RecognitionException {
        Enumerator current = null;
        int rulePostfixOperator_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3858:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3859:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3859:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==41) ) {
                alt63=1;
            }
            else if ( (LA63_0==42) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3859:2: (enumLiteral_0= '++' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3859:2: (enumLiteral_0= '++' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3859:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_41_in_rulePostfixOperator8346); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3865:6: (enumLiteral_1= '--' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3865:6: (enumLiteral_1= '--' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3865:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_42_in_rulePostfixOperator8363); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 104, rulePostfixOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePostfixOperator"


    // $ANTLR start "ruleCompareOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3875:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3877:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3878:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3878:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt64=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt64=1;
                }
                break;
            case 29:
                {
                alt64=2;
                }
                break;
            case 44:
                {
                alt64=3;
                }
                break;
            case 31:
                {
                alt64=4;
                }
                break;
            case 45:
                {
                alt64=5;
                }
                break;
            case 46:
                {
                alt64=6;
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3878:2: (enumLiteral_0= '==' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3878:2: (enumLiteral_0= '==' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3878:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleCompareOperator8408); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3884:6: (enumLiteral_1= '<' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3884:6: (enumLiteral_1= '<' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3884:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_ruleCompareOperator8425); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3890:6: (enumLiteral_2= '<=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3890:6: (enumLiteral_2= '<=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3890:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_44_in_ruleCompareOperator8442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3896:6: (enumLiteral_3= '>' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3896:6: (enumLiteral_3= '>' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3896:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_31_in_ruleCompareOperator8459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3902:6: (enumLiteral_4= '>=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3902:6: (enumLiteral_4= '>=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3902:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,45,FOLLOW_45_in_ruleCompareOperator8476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3908:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3908:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3908:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,46,FOLLOW_46_in_ruleCompareOperator8493); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 105, ruleCompareOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rulePreOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3918:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;
        int rulePreOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3920:28: ( (enumLiteral_0= 'pre' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3921:1: (enumLiteral_0= 'pre' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3921:1: (enumLiteral_0= 'pre' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3921:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_rulePreOperator8537); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 106, rulePreOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePreOperator"


    // $ANTLR start "ruleBitwiseOrOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3931:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleBitwiseOrOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3933:28: ( (enumLiteral_0= '|' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3934:1: (enumLiteral_0= '|' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3934:1: (enumLiteral_0= '|' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3934:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleBitwiseOrOperator8580); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 107, ruleBitwiseOrOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseOrOperator"


    // $ANTLR start "ruleBitwiseAndOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3944:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleBitwiseAndOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3946:28: ( (enumLiteral_0= '&' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3947:1: (enumLiteral_0= '&' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3947:1: (enumLiteral_0= '&' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3947:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,32,FOLLOW_32_in_ruleBitwiseAndOperator8623); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 108, ruleBitwiseAndOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseAndOperator"


    // $ANTLR start "ruleNotOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3957:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleNotOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3959:28: ( (enumLiteral_0= '!' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3960:1: (enumLiteral_0= '!' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3960:1: (enumLiteral_0= '!' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3960:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_ruleNotOperator8666); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 109, ruleNotOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "ruleAddOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3970:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleAddOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3972:28: ( (enumLiteral_0= '+' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3973:1: (enumLiteral_0= '+' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3973:1: (enumLiteral_0= '+' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3973:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_ruleAddOperator8709); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 110, ruleAddOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "ruleSubOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3983:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleSubOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3985:28: ( (enumLiteral_0= '-' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3986:1: (enumLiteral_0= '-' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3986:1: (enumLiteral_0= '-' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3986:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,36,FOLLOW_36_in_ruleSubOperator8752); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 111, ruleSubOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubOperator"


    // $ANTLR start "ruleMultOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3996:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleMultOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3998:28: ( (enumLiteral_0= '*' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3999:1: (enumLiteral_0= '*' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3999:1: (enumLiteral_0= '*' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:3999:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleMultOperator8795); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 112, ruleMultOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMultOperator"


    // $ANTLR start "ruleModOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4009:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleModOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4011:28: ( (enumLiteral_0= '%' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4012:1: (enumLiteral_0= '%' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4012:1: (enumLiteral_0= '%' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4012:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_ruleModOperator8838); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 113, ruleModOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModOperator"


    // $ANTLR start "ruleDivOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4022:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleDivOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4024:28: ( (enumLiteral_0= '/' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4025:1: (enumLiteral_0= '/' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4025:1: (enumLiteral_0= '/' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4025:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_ruleDivOperator8881); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 114, ruleDivOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDivOperator"


    // $ANTLR start "ruleValOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4035:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleValOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4037:28: ( (enumLiteral_0= 'val' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4038:1: (enumLiteral_0= 'val' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4038:1: (enumLiteral_0= 'val' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4038:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleValOperator8924); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 115, ruleValOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValOperator"


    // $ANTLR start "ruleLogicalOrOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4048:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleLogicalOrOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4050:28: ( (enumLiteral_0= '||' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4051:1: (enumLiteral_0= '||' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4051:1: (enumLiteral_0= '||' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4051:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleLogicalOrOperator8967); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 116, ruleLogicalOrOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4061:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleLogicalAndOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4063:28: ( (enumLiteral_0= '&&' ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4064:1: (enumLiteral_0= '&&' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4064:1: (enumLiteral_0= '&&' )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4064:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleLogicalAndOperator9010); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 117, ruleLogicalAndOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleValueType"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4078:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4080:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4081:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4081:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            int alt65=7;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt65=1;
                }
                break;
            case 58:
                {
                alt65=2;
                }
                break;
            case 59:
                {
                alt65=3;
                }
                break;
            case 60:
                {
                alt65=4;
                }
                break;
            case 61:
                {
                alt65=5;
                }
                break;
            case 62:
                {
                alt65=6;
                }
                break;
            case 63:
                {
                alt65=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4081:2: (enumLiteral_0= 'pure' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4081:2: (enumLiteral_0= 'pure' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4081:4: enumLiteral_0= 'pure'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleValueType9058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4087:6: (enumLiteral_1= 'bool' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4087:6: (enumLiteral_1= 'bool' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4087:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleValueType9075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4093:6: (enumLiteral_2= 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4093:6: (enumLiteral_2= 'unsigned' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4093:8: enumLiteral_2= 'unsigned'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_59_in_ruleValueType9092); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4099:6: (enumLiteral_3= 'int' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4099:6: (enumLiteral_3= 'int' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4099:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_60_in_ruleValueType9109); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4105:6: (enumLiteral_4= 'float' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4105:6: (enumLiteral_4= 'float' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4105:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,61,FOLLOW_61_in_ruleValueType9126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4111:6: (enumLiteral_5= 'string' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4111:6: (enumLiteral_5= 'string' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4111:8: enumLiteral_5= 'string'
                    {
                    enumLiteral_5=(Token)match(input,62,FOLLOW_62_in_ruleValueType9143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4117:6: (enumLiteral_6= 'host' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4117:6: (enumLiteral_6= 'host' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4117:8: enumLiteral_6= 'host'
                    {
                    enumLiteral_6=(Token)match(input,63,FOLLOW_63_in_ruleValueType9160); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 118, ruleValueType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "ruleCombineOperator"
    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4129:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return current; }
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4131:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4132:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4132:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt66=8;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt66=1;
                }
                break;
            case 50:
                {
                alt66=2;
                }
                break;
            case 51:
                {
                alt66=3;
                }
                break;
            case 65:
                {
                alt66=4;
                }
                break;
            case 66:
                {
                alt66=5;
                }
                break;
            case 48:
                {
                alt66=6;
                }
                break;
            case 32:
                {
                alt66=7;
                }
                break;
            case 63:
                {
                alt66=8;
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
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4132:2: (enumLiteral_0= 'none' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4132:2: (enumLiteral_0= 'none' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4132:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_64_in_ruleCombineOperator9207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4138:6: (enumLiteral_1= '+' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4138:6: (enumLiteral_1= '+' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4138:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_50_in_ruleCombineOperator9224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4144:6: (enumLiteral_2= '*' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4144:6: (enumLiteral_2= '*' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4144:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_51_in_ruleCombineOperator9241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4150:6: (enumLiteral_3= 'max' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4150:6: (enumLiteral_3= 'max' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4150:8: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_65_in_ruleCombineOperator9258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4156:6: (enumLiteral_4= 'min' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4156:6: (enumLiteral_4= 'min' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4156:8: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,66,FOLLOW_66_in_ruleCombineOperator9275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4162:6: (enumLiteral_5= '|' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4162:6: (enumLiteral_5= '|' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4162:8: enumLiteral_5= '|'
                    {
                    enumLiteral_5=(Token)match(input,48,FOLLOW_48_in_ruleCombineOperator9292); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4168:6: (enumLiteral_6= '&' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4168:6: (enumLiteral_6= '&' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4168:8: enumLiteral_6= '&'
                    {
                    enumLiteral_6=(Token)match(input,32,FOLLOW_32_in_ruleCombineOperator9309); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4174:6: (enumLiteral_7= 'host' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4174:6: (enumLiteral_7= 'host' )
                    // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:4174:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,63,FOLLOW_63_in_ruleCombineOperator9326); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 119, ruleCombineOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCombineOperator"

    // $ANTLR start synpred13_InternalKEXT
    public final void synpred13_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_Assignment_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:421:2: (this_Assignment_0= ruleAssignment )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:421:2: this_Assignment_0= ruleAssignment
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleAssignment_in_synpred13_InternalKEXT812);
        this_Assignment_0=ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalKEXT

    // $ANTLR start synpred14_InternalKEXT
    public final void synpred14_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_PostfixEffect_1 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:434:2: (this_PostfixEffect_1= rulePostfixEffect )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:434:2: this_PostfixEffect_1= rulePostfixEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulePostfixEffect_in_synpred14_InternalKEXT842);
        this_PostfixEffect_1=rulePostfixEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalKEXT

    // $ANTLR start synpred15_InternalKEXT
    public final void synpred15_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_Emission_2 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:447:2: (this_Emission_2= ruleEmission )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:447:2: this_Emission_2= ruleEmission
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleEmission_in_synpred15_InternalKEXT872);
        this_Emission_2=ruleEmission();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalKEXT

    // $ANTLR start synpred16_InternalKEXT
    public final void synpred16_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_TextEffect_3 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:460:2: (this_TextEffect_3= ruleTextEffect )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:460:2: this_TextEffect_3= ruleTextEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleTextEffect_in_synpred16_InternalKEXT902);
        this_TextEffect_3=ruleTextEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalKEXT

    // $ANTLR start synpred28_InternalKEXT
    public final void synpred28_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:980:2: (this_BoolExpression_0= ruleBoolExpression )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:980:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleBoolExpression_in_synpred28_InternalKEXT1944);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalKEXT

    // $ANTLR start synpred38_InternalKEXT
    public final void synpred38_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1449:2: (this_ValuedExpression_0= ruleValuedExpression )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:1449:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred38_InternalKEXT2934);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalKEXT

    // $ANTLR start synpred53_InternalKEXT
    public final void synpred53_InternalKEXT_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2207:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2207:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2207:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // ../de.cau.cs.kieler.core.kexpressions.text/src-gen/de/cau/cs/kieler/core/kexpressions/text/parser/antlr/internal/InternalKEXT.g:2207:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,25,FOLLOW_25_in_synpred53_InternalKEXT4545); if (state.failed) return ;
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred53_InternalKEXT4570);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,26,FOLLOW_26_in_synpred53_InternalKEXT4581); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred53_InternalKEXT

    // Delegated rules

    public final boolean synpred15_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalKEXT_fragment(); // can never throw exception
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
    public final boolean synpred13_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalKEXT_fragment(); // can never throw exception
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
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA52 dfa52 = new DFA52(this);
    static final String DFA1_eotS =
        "\110\uffff";
    static final String DFA1_eofS =
        "\1\3\12\uffff\1\3\74\uffff";
    static final String DFA1_minS =
        "\3\4\2\uffff\2\4\1\6\4\4\1\6\4\4\1\34\2\4\1\6\2\4\1\6\6\4\2\34"+
        "\3\4\1\6\4\4\1\6\12\4\1\6\4\4\1\6\3\4\1\6\2\4\1\34\3\4\1\6\1\4\2"+
        "\34\1\4";
    static final String DFA1_maxS =
        "\2\77\1\4\2\uffff\1\77\1\4\1\6\1\77\1\4\2\77\1\7\4\77\1\43\1\11"+
        "\1\4\1\6\1\11\1\4\1\6\1\11\5\77\1\43\1\34\2\77\1\4\1\6\1\77\1\4"+
        "\1\11\1\4\1\6\1\11\10\77\1\4\1\6\1\77\1\4\2\77\1\7\2\77\1\4\1\6"+
        "\2\77\1\43\2\77\1\4\1\6\1\11\1\43\1\34\1\77";
    static final String DFA1_acceptS =
        "\3\uffff\1\2\1\1\103\uffff";
    static final String DFA1_specialS =
        "\110\uffff}>";
    static final String[] DFA1_transitionS = {
            "\2\3\4\uffff\1\1\5\uffff\5\4\10\uffff\1\3\3\uffff\1\2\27\uffff"+
            "\7\4",
            "\2\3\4\uffff\1\1\5\uffff\5\4\10\uffff\1\3\3\uffff\1\2\27\uffff"+
            "\7\4",
            "\1\5",
            "",
            "",
            "\1\13\1\3\1\16\1\15\1\10\1\12\1\1\5\uffff\5\4\6\uffff\1\11"+
            "\1\uffff\1\3\3\uffff\1\2\1\6\1\7\1\14\24\uffff\7\4",
            "\1\17",
            "\1\20",
            "\2\3\4\uffff\1\1\5\uffff\5\4\10\uffff\1\3\3\uffff\1\2\27\uffff"+
            "\7\4",
            "\1\21",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\22\7\uffff\1\3\3\uffff\1\2"+
            "\27\uffff\7\4",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\25\1\uffff\1\3\1\uffff\1\3"+
            "\1\uffff\1\3\1\uffff\1\3\3\uffff\1\2\1\23\1\24\1\uffff\6\3\16"+
            "\uffff\7\4",
            "\1\16\1\15",
            "\2\3\4\uffff\1\1\5\uffff\5\4\10\uffff\1\3\3\uffff\1\2\27\uffff"+
            "\7\4",
            "\2\3\4\uffff\1\1\5\uffff\5\4\10\uffff\1\3\3\uffff\1\2\27\uffff"+
            "\7\4",
            "\1\13\1\3\1\16\1\15\1\10\1\12\1\1\5\uffff\5\4\6\uffff\1\11"+
            "\1\uffff\1\3\3\uffff\1\2\1\6\1\7\1\14\24\uffff\7\4",
            "\1\13\1\3\1\16\1\15\1\10\1\12\1\1\5\uffff\5\4\6\uffff\1\11"+
            "\1\uffff\1\3\3\uffff\1\2\2\uffff\1\14\24\uffff\7\4",
            "\1\30\5\uffff\1\26\1\27",
            "\1\32\4\uffff\1\31",
            "\1\33",
            "\1\34",
            "\1\32\4\uffff\1\35",
            "\1\36",
            "\1\37",
            "\1\41\4\uffff\1\40",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\22\7\uffff\1\3\3\uffff\1\2"+
            "\27\uffff\7\4",
            "\2\3\4\uffff\1\44\5\uffff\5\4\1\25\7\uffff\1\3\3\uffff\1\45"+
            "\1\42\1\43\25\uffff\7\4",
            "\2\3\4\uffff\1\44\5\uffff\5\4\1\25\7\uffff\1\3\3\uffff\1\45"+
            "\1\23\1\24\25\uffff\7\4",
            "\2\3\4\uffff\1\44\5\uffff\5\4\1\25\7\uffff\1\3\3\uffff\1\45"+
            "\27\uffff\7\4",
            "\2\3\4\uffff\1\44\5\uffff\5\4\1\25\7\uffff\1\3\3\uffff\1\45"+
            "\27\uffff\7\4",
            "\1\30\5\uffff\1\26\1\27",
            "\1\30",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\46\7\uffff\1\3\3\uffff\1\2"+
            "\27\uffff\7\4",
            "\2\3\4\uffff\1\44\5\uffff\5\4\1\51\7\uffff\1\3\3\uffff\1\45"+
            "\1\47\1\50\25\uffff\7\4",
            "\1\52",
            "\1\53",
            "\2\3\4\uffff\1\44\5\uffff\5\4\10\uffff\1\3\3\uffff\1\45\27"+
            "\uffff\7\4",
            "\1\54",
            "\1\56\4\uffff\1\55",
            "\1\57",
            "\1\60",
            "\1\56\4\uffff\1\61",
            "\2\3\4\uffff\1\44\5\uffff\5\4\1\25\7\uffff\1\3\3\uffff\1\45"+
            "\1\42\1\43\25\uffff\7\4",
            "\2\3\4\uffff\1\44\5\uffff\5\4\1\25\7\uffff\1\3\3\uffff\1\45"+
            "\27\uffff\7\4",
            "\1\67\1\3\1\71\1\72\1\64\1\66\1\44\5\uffff\5\4\6\uffff\1\65"+
            "\1\uffff\1\3\3\uffff\1\45\1\62\1\63\1\70\24\uffff\7\4",
            "\2\3\4\uffff\1\1\5\uffff\5\4\1\46\7\uffff\1\3\3\uffff\1\2"+
            "\27\uffff\7\4",
            "\2\3\4\uffff\1\44\5\uffff\5\4\1\51\7\uffff\1\3\3\uffff\1\45"+
            "\1\73\1\74\25\uffff\7\4",
            "\2\3\4\uffff\1\44\5\uffff\5\4\1\51\7\uffff\1\3\3\uffff\1\45"+
            "\1\47\1\50\25\uffff\7\4",
            "\2\3\4\uffff\1\44\5\uffff\5\4\1\51\7\uffff\1\3\3\uffff\1\45"+
            "\27\uffff\7\4",
            "\2\3\4\uffff\1\44\5\uffff\5\4\1\51\7\uffff\1\3\3\uffff\1\45"+
            "\27\uffff\7\4",
            "\1\75",
            "\1\76",
            "\2\3\4\uffff\1\44\5\uffff\5\4\10\uffff\1\3\3\uffff\1\45\27"+
            "\uffff\7\4",
            "\1\77",
            "\2\3\4\uffff\1\44\5\uffff\5\4\1\25\7\uffff\1\3\3\uffff\1\45"+
            "\27\uffff\7\4",
            "\2\3\4\uffff\1\44\5\uffff\5\4\1\25\1\uffff\1\3\3\uffff\1\3"+
            "\1\uffff\1\3\3\uffff\1\45\1\23\1\24\1\uffff\6\3\16\uffff\7\4",
            "\1\71\1\72",
            "\2\3\4\uffff\1\44\5\uffff\5\4\10\uffff\1\3\3\uffff\1\45\27"+
            "\uffff\7\4",
            "\2\3\4\uffff\1\44\5\uffff\5\4\10\uffff\1\3\3\uffff\1\45\27"+
            "\uffff\7\4",
            "\1\100",
            "\1\101",
            "\1\67\1\3\1\71\1\72\1\64\1\66\1\44\5\uffff\5\4\6\uffff\1\65"+
            "\1\uffff\1\3\3\uffff\1\45\1\62\1\63\1\70\24\uffff\7\4",
            "\1\67\1\3\1\71\1\72\1\64\1\66\1\44\5\uffff\5\4\6\uffff\1\65"+
            "\1\uffff\1\3\3\uffff\1\45\2\uffff\1\70\24\uffff\7\4",
            "\1\104\5\uffff\1\102\1\103",
            "\2\3\4\uffff\1\44\5\uffff\5\4\1\51\7\uffff\1\3\3\uffff\1\45"+
            "\1\73\1\74\25\uffff\7\4",
            "\2\3\4\uffff\1\44\5\uffff\5\4\1\51\7\uffff\1\3\3\uffff\1\45"+
            "\27\uffff\7\4",
            "\1\105",
            "\1\106",
            "\1\41\4\uffff\1\107",
            "\1\104\5\uffff\1\102\1\103",
            "\1\104",
            "\2\3\4\uffff\1\44\5\uffff\5\4\1\51\7\uffff\1\3\3\uffff\1\45"+
            "\27\uffff\7\4"
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
    static final String DFA24_eotS =
        "\16\uffff";
    static final String DFA24_eofS =
        "\16\uffff";
    static final String DFA24_minS =
        "\1\4\13\0\2\uffff";
    static final String DFA24_maxS =
        "\1\66\13\0\2\uffff";
    static final String DFA24_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA24_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\11\1\13\1\2\1\3\1\6\1\4\17\uffff\1\5\3\uffff\1\12\6\uffff"+
            "\1\1\12\uffff\1\7\1\uffff\1\14\4\uffff\1\10",
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
            return "979:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
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
                        if ( (synpred28_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_2 = input.LA(1);

                         
                        int index24_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index24_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_3 = input.LA(1);

                         
                        int index24_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index24_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_4 = input.LA(1);

                         
                        int index24_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index24_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA24_5 = input.LA(1);

                         
                        int index24_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index24_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA24_6 = input.LA(1);

                         
                        int index24_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index24_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA24_7 = input.LA(1);

                         
                        int index24_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index24_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA24_8 = input.LA(1);

                         
                        int index24_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index24_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA24_9 = input.LA(1);

                         
                        int index24_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index24_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA24_10 = input.LA(1);

                         
                        int index24_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index24_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA24_11 = input.LA(1);

                         
                        int index24_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index24_11);
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
    static final String DFA34_eotS =
        "\15\uffff";
    static final String DFA34_eofS =
        "\15\uffff";
    static final String DFA34_minS =
        "\1\4\4\uffff\7\0\1\uffff";
    static final String DFA34_maxS =
        "\1\66\4\uffff\7\0\1\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\12\uffff\1\2";
    static final String DFA34_specialS =
        "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\11\1\13\2\1\1\6\1\1\17\uffff\1\5\3\uffff\1\12\6\uffff\1"+
            "\1\12\uffff\1\7\1\uffff\1\14\4\uffff\1\10",
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "1448:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_7 = input.LA(1);

                         
                        int index34_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index34_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_8 = input.LA(1);

                         
                        int index34_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index34_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_9 = input.LA(1);

                         
                        int index34_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index34_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_10 = input.LA(1);

                         
                        int index34_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index34_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_11 = input.LA(1);

                         
                        int index34_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index34_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA43_eotS =
        "\14\uffff";
    static final String DFA43_eofS =
        "\14\uffff";
    static final String DFA43_minS =
        "\1\4\3\uffff\1\0\7\uffff";
    static final String DFA43_maxS =
        "\1\66\3\uffff\1\0\7\uffff";
    static final String DFA43_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\5\uffff\1\4";
    static final String DFA43_specialS =
        "\4\uffff\1\0\7\uffff}>";
    static final String[] DFA43_transitionS = {
            "\2\5\1\1\1\2\1\5\1\3\17\uffff\1\4\3\uffff\1\5\21\uffff\1\5"+
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

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "2168:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_4 = input.LA(1);

                         
                        int index43_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalKEXT()) ) {s = 11;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index43_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\20\uffff";
    static final String DFA51_eofS =
        "\3\uffff\1\15\3\uffff\1\6\6\uffff\2\15";
    static final String DFA51_minS =
        "\1\12\1\uffff\3\4\1\6\1\uffff\1\4\1\uffff\1\6\4\uffff\2\4";
    static final String DFA51_maxS =
        "\1\41\1\uffff\1\4\1\77\1\4\1\6\1\uffff\1\77\1\uffff\1\7\4\uffff"+
        "\2\77";
    static final String DFA51_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\1\uffff\1\4\1\uffff\1\5\1\3\1\6\1\7\2"+
        "\uffff";
    static final String DFA51_specialS =
        "\20\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\1\26\uffff\1\2",
            "",
            "\1\3",
            "\1\7\1\15\1\12\1\14\1\10\1\6\1\15\5\uffff\5\15\6\uffff\1\13"+
            "\1\uffff\1\15\3\uffff\1\15\1\4\1\5\1\11\24\uffff\7\15",
            "\1\16",
            "\1\17",
            "",
            "\2\6\4\uffff\1\6\5\uffff\6\6\1\uffff\1\15\3\uffff\1\15\1\uffff"+
            "\1\6\3\uffff\3\6\1\uffff\6\15\16\uffff\7\6",
            "",
            "\1\12\1\14",
            "",
            "",
            "",
            "",
            "\1\7\1\15\1\12\1\14\1\10\1\6\1\15\5\uffff\5\15\6\uffff\1\13"+
            "\1\uffff\1\15\3\uffff\1\15\1\4\1\5\1\11\24\uffff\7\15",
            "\1\7\1\15\1\12\1\14\1\10\1\6\1\15\5\uffff\5\15\6\uffff\1\13"+
            "\1\uffff\1\15\3\uffff\1\15\2\uffff\1\11\24\uffff\7\15"
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "2795:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )";
        }
    }
    static final String DFA52_eotS =
        "\17\uffff";
    static final String DFA52_eofS =
        "\3\uffff\1\13\11\uffff\2\13";
    static final String DFA52_minS =
        "\1\12\1\uffff\3\4\2\6\6\uffff\2\4";
    static final String DFA52_maxS =
        "\1\41\1\uffff\1\4\1\44\1\4\1\6\1\7\6\uffff\2\44";
    static final String DFA52_acceptS =
        "\1\uffff\1\1\5\uffff\1\5\1\6\1\3\1\2\1\7\1\4\2\uffff";
    static final String DFA52_specialS =
        "\17\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\1\26\uffff\1\2",
            "",
            "\1\3",
            "\1\13\1\uffff\1\7\1\10\1\14\1\12\1\13\20\uffff\1\11\5\uffff"+
            "\1\13\1\4\1\5\1\6",
            "\1\15",
            "\1\16",
            "\1\7\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\1\uffff\1\7\1\10\1\14\1\12\1\13\20\uffff\1\11\5\uffff"+
            "\1\13\1\4\1\5\1\6",
            "\1\13\1\uffff\1\7\1\10\1\14\1\12\1\13\20\uffff\1\11\5\uffff"+
            "\1\13\2\uffff\1\6"
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
            return "2908:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )";
        }
    }
 

    public static final BitSet FOLLOW_ruleKext_in_entryRuleKext88 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKext98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleKext144 = new BitSet(new long[]{0xFE000002201F0432L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleKext166 = new BitSet(new long[]{0x0000000220000432L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDeclaration259 = new BitSet(new long[]{0xFE000002001F0400L});
    public static final BitSet FOLLOW_16_in_ruleDeclaration278 = new BitSet(new long[]{0xFE000000001E0000L});
    public static final BitSet FOLLOW_17_in_ruleDeclaration310 = new BitSet(new long[]{0xFE000000001C0000L});
    public static final BitSet FOLLOW_18_in_ruleDeclaration342 = new BitSet(new long[]{0xFE00000000180000L});
    public static final BitSet FOLLOW_19_in_ruleDeclaration374 = new BitSet(new long[]{0xFE00000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDeclaration408 = new BitSet(new long[]{0xFE00000000100000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleDeclaration443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20_in_ruleDeclaration468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValuedObject_in_ruleDeclaration503 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleDeclaration516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValuedObject_in_ruleDeclaration537 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleDeclaration551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObject_in_entryRuleValuedObject587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObject597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObject639 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_ruleValuedObject657 = new BitSet(new long[]{0x00428010220003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObject678 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleValuedObject693 = new BitSet(new long[]{0x800D000100000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleValuedObject714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixEffect_in_ruleEffect842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_ruleEffect872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_ruleEffect902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCallEffect_in_ruleEffect932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictedAnnotation_in_ruleEmission1023 = new BitSet(new long[]{0x0000000200000410L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmission1048 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleEmission1061 = new BitSet(new long[]{0x00428010220003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEmission1082 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEmission1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAssignment1188 = new BitSet(new long[]{0x0000000200000410L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment1213 = new BitSet(new long[]{0x000001E008800000L});
    public static final BitSet FOLLOW_27_in_ruleAssignment1226 = new BitSet(new long[]{0x00428010220003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment1247 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAssignment1259 = new BitSet(new long[]{0x000001E008800000L});
    public static final BitSet FOLLOW_ruleAssignOperator_in_ruleAssignment1282 = new BitSet(new long[]{0x00428010220003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixEffect_in_entryRulePostfixEffect1339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfixEffect1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rulePostfixEffect1395 = new BitSet(new long[]{0x0000000200000410L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePostfixEffect1420 = new BitSet(new long[]{0x0000060008000000L});
    public static final BitSet FOLLOW_27_in_rulePostfixEffect1433 = new BitSet(new long[]{0x00428010220003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePostfixEffect1454 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePostfixEffect1466 = new BitSet(new long[]{0x0000060008000000L});
    public static final BitSet FOLLOW_rulePostfixOperator_in_rulePostfixEffect1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect1525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTextEffect1581 = new BitSet(new long[]{0x0000000200000420L});
    public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextEffect1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCallEffect_in_entryRuleFunctionCallEffect1640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCallEffect1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleFunctionCallEffect1696 = new BitSet(new long[]{0x0000000220000400L});
    public static final BitSet FOLLOW_29_in_ruleFunctionCallEffect1709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleFunctionCallEffect1730 = new BitSet(new long[]{0x00000000C2000000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionCallEffect1744 = new BitSet(new long[]{0x00428011220003F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCallEffect1765 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionCallEffect1778 = new BitSet(new long[]{0x00428011220003F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCallEffect1799 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionCallEffect1813 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30_in_ruleFunctionCallEffect1832 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFunctionCallEffect1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleExpression1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression2009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleBoolExpression2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression2102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression2162 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression2196 = new BitSet(new long[]{0x00428010220003F0L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression2217 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression2257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression2317 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression2351 = new BitSet(new long[]{0x00428010220003F0L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression2372 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression2412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression2472 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrOperator_in_ruleBitwiseOrExpression2506 = new BitSet(new long[]{0x00428010220003F0L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression2527 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression2567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression2627 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndOperator_in_ruleBitwiseAndExpression2661 = new BitSet(new long[]{0x00428010220003F0L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression2682 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation2722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation2782 = new BitSet(new long[]{0x00007800A0000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation2815 = new BitSet(new long[]{0x00428010220003F0L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression2874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression2999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression3068 = new BitSet(new long[]{0x00428010220003F0L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression3156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression3249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression3309 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression3342 = new BitSet(new long[]{0x00408010220003F0L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression3363 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression3401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression3461 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression3494 = new BitSet(new long[]{0x00408010220003F0L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression3515 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression3553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression3613 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression3646 = new BitSet(new long[]{0x00408010220003F0L});
    public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression3667 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression3705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression3765 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression3798 = new BitSet(new long[]{0x00408010220003F0L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression3857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModExpression3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression3917 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression3950 = new BitSet(new long[]{0x00408010220003F0L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression4009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression4078 = new BitSet(new long[]{0x00408010220003F0L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression4166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolValue_in_ruleAtomicExpression4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAtomicExpression4274 = new BitSet(new long[]{0x00428010220003F0L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleAtomicExpression4299 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAtomicExpression4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleAtomicExpression4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression4407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleAtomicValuedExpression4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAtomicValuedExpression4545 = new BitSet(new long[]{0x00408010220003F0L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression4570 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAtomicValuedExpression4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression4648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression4719 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression4738 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleValuedObjectTestExpression4753 = new BitSet(new long[]{0x0040800000000010L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression4774 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleValuedObjectTestExpression4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference4853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference4912 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleValuedObjectReference4925 = new BitSet(new long[]{0x00428010220003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObjectReference4946 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleValuedObjectReference4958 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall4996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFunctionCall5043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleFunctionCall5064 = new BitSet(new long[]{0x00000000C2000000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionCall5078 = new BitSet(new long[]{0x00428011220003F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall5099 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionCall5112 = new BitSet(new long[]{0x00428011220003F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall5133 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionCall5147 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30_in_ruleFunctionCall5166 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFunctionCall5180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter5216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleParameter5270 = new BitSet(new long[]{0x00428011220003F0L});
    public static final BitSet FOLLOW_32_in_ruleParameter5301 = new BitSet(new long[]{0x00428010220003F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParameter5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression5374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue5465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue5516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue5556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolValue_in_entryRuleBoolValue5647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolValue5657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBoolValue5698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue5738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue5748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue5789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation5831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation5891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation6071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictedAnnotation_in_entryRuleRestrictedAnnotation6108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestrictedAnnotation6118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleRestrictedAnnotation6168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedKeyStringValueAnnotation_in_ruleRestrictedAnnotation6198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_ruleRestrictedAnnotation6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleRestrictedAnnotation6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleRestrictedAnnotation6288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleRestrictedAnnotation6318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleRestrictedAnnotation6348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation6383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation6393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation6434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation6474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation6484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTagAnnotation6521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation6578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation6588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleKeyStringValueAnnotation6625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation6646 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation6667 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleKeyStringValueAnnotation6680 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation6701 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation6739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation6749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTypedKeyStringValueAnnotation6786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6807 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTypedKeyStringValueAnnotation6819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6840 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTypedKeyStringValueAnnotation6852 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation6873 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleTypedKeyStringValueAnnotation6886 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation6907 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleQuotedKeyStringValueAnnotation_in_entryRuleQuotedKeyStringValueAnnotation6945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuotedKeyStringValueAnnotation6955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleQuotedKeyStringValueAnnotation6992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleQuotedKeyStringValueAnnotation7013 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation7030 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleQuotedKeyStringValueAnnotation7048 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation7065 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_entryRuleQuotedTypedKeyStringValueAnnotation7108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuotedTypedKeyStringValueAnnotation7118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleQuotedTypedKeyStringValueAnnotation7155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation7176 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleQuotedTypedKeyStringValueAnnotation7188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation7209 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleQuotedTypedKeyStringValueAnnotation7221 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation7238 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleQuotedTypedKeyStringValueAnnotation7256 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation7273 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation7316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation7326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleKeyBooleanValueAnnotation7363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation7384 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation7442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation7452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleKeyIntValueAnnotation7489 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation7510 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation7531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation7567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation7577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleKeyFloatValueAnnotation7614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation7635 = new BitSet(new long[]{0x0000001000000080L});
    public static final BitSet FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString7695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString7706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleEString7779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID7825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID7836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID7876 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_ruleExtendedID7895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID7910 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_35_in_ruleExtendedID7931 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExtendedID7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger7994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger8005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInteger8044 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInteger8061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloateger_in_entryRuleFloateger8107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloateger8118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFloateger8157 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloateger8174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAssignOperator8233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleAssignOperator8250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleAssignOperator8267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAssignOperator8284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAssignOperator8301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePostfixOperator8346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePostfixOperator8363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCompareOperator8408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCompareOperator8425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCompareOperator8442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCompareOperator8459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCompareOperator8476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleCompareOperator8493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePreOperator8537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBitwiseOrOperator8580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBitwiseAndOperator8623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNotOperator8666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAddOperator8709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSubOperator8752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleMultOperator8795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleModOperator8838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDivOperator8881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleValOperator8924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleLogicalOrOperator8967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleLogicalAndOperator9010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleValueType9058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleValueType9075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleValueType9092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleValueType9109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleValueType9126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleValueType9143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleValueType9160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleCombineOperator9207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCombineOperator9224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCombineOperator9241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCombineOperator9258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCombineOperator9275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleCombineOperator9292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCombineOperator9309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCombineOperator9326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_synpred13_InternalKEXT812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixEffect_in_synpred14_InternalKEXT842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_synpred15_InternalKEXT872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_synpred16_InternalKEXT902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_synpred28_InternalKEXT1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred38_InternalKEXT2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred53_InternalKEXT4545 = new BitSet(new long[]{0x00408010220003F0L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred53_InternalKEXT4570 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_synpred53_InternalKEXT4581 = new BitSet(new long[]{0x0000000000000002L});

}