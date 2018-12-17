package de.cau.cs.kieler.lustre.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.kieler.lustre.services.LustreGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLustreParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING_CONSTANT", "RULE_IDENT", "RULE_BOOL", "RULE_FLOAT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_LUSTRE_COMMENT", "RULE_WS", "'include'", "'type'", "'const'", "';'", "'='", "'bool'", "'int'", "'real'", "'^'", "'enum'", "'{'", "','", "'}'", "'struct'", "'unsafe'", "'extern'", "'function'", "'node'", "'returns'", "'<<'", "'>>'", "'var'", "'let'", "'tel'", "'.'", "'('", "')'", "':'", "'when'", "'not'", "'model'", "'uses'", "'needs'", "'provides'", "'body'", "'end'", "'package'", "'assert'", "'automaton'", "'|'", "'->'", "'until'", "'unless'", "'then'", "'continue'", "'['", "']'", "'..'", "'if'", "'else'", "'fby'", "'or'", "'and'", "'<>'", "'>='", "'<='", "'>'", "'<'", "'mod'", "'+'", "'-'", "'*'", "'/'", "'pre'", "'current'", "'::'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_STRING_CONSTANT=4;
    public static final int RULE_LUSTRE_COMMENT=11;
    public static final int RULE_IDENT=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
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
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=12;
    public static final int RULE_BOOL=6;
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


        public InternalLustreParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLustreParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLustreParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLustre.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private LustreGrammarAccess grammarAccess;

        public InternalLustreParser(TokenStream input, LustreGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "LustreProgram";
       	}

       	@Override
       	protected LustreGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLustreProgram"
    // InternalLustre.g:70:1: entryRuleLustreProgram returns [EObject current=null] : iv_ruleLustreProgram= ruleLustreProgram EOF ;
    public final EObject entryRuleLustreProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLustreProgram = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_LUSTRE_COMMENT");

        try {
            // InternalLustre.g:72:2: (iv_ruleLustreProgram= ruleLustreProgram EOF )
            // InternalLustre.g:73:2: iv_ruleLustreProgram= ruleLustreProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLustreProgramRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLustreProgram=ruleLustreProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLustreProgram; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleLustreProgram"


    // $ANTLR start "ruleLustreProgram"
    // InternalLustre.g:82:1: ruleLustreProgram returns [EObject current=null] : ( ( (lv_includes_0_0= ruleInclude ) )* ( ( (lv_packBody_1_0= rulePackBody ) ) | ( (lv_packList_2_0= rulePackList ) ) ) ) ;
    public final EObject ruleLustreProgram() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_includes_0_0 = null;

        EObject lv_packBody_1_0 = null;

        EObject lv_packList_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_LUSTRE_COMMENT");

        try {
            // InternalLustre.g:89:2: ( ( ( (lv_includes_0_0= ruleInclude ) )* ( ( (lv_packBody_1_0= rulePackBody ) ) | ( (lv_packList_2_0= rulePackList ) ) ) ) )
            // InternalLustre.g:90:2: ( ( (lv_includes_0_0= ruleInclude ) )* ( ( (lv_packBody_1_0= rulePackBody ) ) | ( (lv_packList_2_0= rulePackList ) ) ) )
            {
            // InternalLustre.g:90:2: ( ( (lv_includes_0_0= ruleInclude ) )* ( ( (lv_packBody_1_0= rulePackBody ) ) | ( (lv_packList_2_0= rulePackList ) ) ) )
            // InternalLustre.g:91:3: ( (lv_includes_0_0= ruleInclude ) )* ( ( (lv_packBody_1_0= rulePackBody ) ) | ( (lv_packList_2_0= rulePackList ) ) )
            {
            // InternalLustre.g:91:3: ( (lv_includes_0_0= ruleInclude ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLustre.g:92:4: (lv_includes_0_0= ruleInclude )
            	    {
            	    // InternalLustre.g:92:4: (lv_includes_0_0= ruleInclude )
            	    // InternalLustre.g:93:5: lv_includes_0_0= ruleInclude
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getLustreProgramAccess().getIncludesIncludeParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_includes_0_0=ruleInclude();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getLustreProgramRule());
            	      					}
            	      					add(
            	      						current,
            	      						"includes",
            	      						lv_includes_0_0,
            	      						"de.cau.cs.kieler.lustre.Lustre.Include");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalLustre.g:110:3: ( ( (lv_packBody_1_0= rulePackBody ) ) | ( (lv_packList_2_0= rulePackList ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=14 && LA2_0<=15)||(LA2_0>=27 && LA2_0<=30)) ) {
                alt2=1;
            }
            else if ( (LA2_0==43||LA2_0==49) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLustre.g:111:4: ( (lv_packBody_1_0= rulePackBody ) )
                    {
                    // InternalLustre.g:111:4: ( (lv_packBody_1_0= rulePackBody ) )
                    // InternalLustre.g:112:5: (lv_packBody_1_0= rulePackBody )
                    {
                    // InternalLustre.g:112:5: (lv_packBody_1_0= rulePackBody )
                    // InternalLustre.g:113:6: lv_packBody_1_0= rulePackBody
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLustreProgramAccess().getPackBodyPackBodyParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_packBody_1_0=rulePackBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLustreProgramRule());
                      						}
                      						set(
                      							current,
                      							"packBody",
                      							lv_packBody_1_0,
                      							"de.cau.cs.kieler.lustre.Lustre.PackBody");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:131:4: ( (lv_packList_2_0= rulePackList ) )
                    {
                    // InternalLustre.g:131:4: ( (lv_packList_2_0= rulePackList ) )
                    // InternalLustre.g:132:5: (lv_packList_2_0= rulePackList )
                    {
                    // InternalLustre.g:132:5: (lv_packList_2_0= rulePackList )
                    // InternalLustre.g:133:6: lv_packList_2_0= rulePackList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLustreProgramAccess().getPackListPackListParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_packList_2_0=rulePackList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLustreProgramRule());
                      						}
                      						set(
                      							current,
                      							"packList",
                      							lv_packList_2_0,
                      							"de.cau.cs.kieler.lustre.Lustre.PackList");
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleLustreProgram"


    // $ANTLR start "entryRuleInclude"
    // InternalLustre.g:158:1: entryRuleInclude returns [String current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final String entryRuleInclude() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInclude = null;


        try {
            // InternalLustre.g:158:47: (iv_ruleInclude= ruleInclude EOF )
            // InternalLustre.g:159:2: iv_ruleInclude= ruleInclude EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInclude=ruleInclude();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInclude.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalLustre.g:165:1: ruleInclude returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'include' this_STRING_CONSTANT_1= RULE_STRING_CONSTANT ) ;
    public final AntlrDatatypeRuleToken ruleInclude() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_CONSTANT_1=null;


        	enterRule();

        try {
            // InternalLustre.g:171:2: ( (kw= 'include' this_STRING_CONSTANT_1= RULE_STRING_CONSTANT ) )
            // InternalLustre.g:172:2: (kw= 'include' this_STRING_CONSTANT_1= RULE_STRING_CONSTANT )
            {
            // InternalLustre.g:172:2: (kw= 'include' this_STRING_CONSTANT_1= RULE_STRING_CONSTANT )
            // InternalLustre.g:173:3: kw= 'include' this_STRING_CONSTANT_1= RULE_STRING_CONSTANT
            {
            kw=(Token)match(input,13,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
              		
            }
            this_STRING_CONSTANT_1=(Token)match(input,RULE_STRING_CONSTANT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_STRING_CONSTANT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_STRING_CONSTANT_1, grammarAccess.getIncludeAccess().getSTRING_CONSTANTTerminalRuleCall_1());
              		
            }

            }


            }

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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRulePackBody"
    // InternalLustre.g:189:1: entryRulePackBody returns [EObject current=null] : iv_rulePackBody= rulePackBody EOF ;
    public final EObject entryRulePackBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackBody = null;


        try {
            // InternalLustre.g:189:49: (iv_rulePackBody= rulePackBody EOF )
            // InternalLustre.g:190:2: iv_rulePackBody= rulePackBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackBodyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePackBody=rulePackBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackBody; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackBody"


    // $ANTLR start "rulePackBody"
    // InternalLustre.g:196:1: rulePackBody returns [EObject current=null] : ( ( (lv_constants_0_0= ruleConstantsDeclaration ) ) | (otherlv_1= 'type' ( (lv_types_2_0= ruleTypeDeclaration ) )+ ) | ( (lv_externals_3_0= ruleExternalNodeDeclaration ) ) | ( (lv_nodes_4_0= ruleNodeDeclaration ) ) )+ ;
    public final EObject rulePackBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constants_0_0 = null;

        EObject lv_types_2_0 = null;

        EObject lv_externals_3_0 = null;

        EObject lv_nodes_4_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:202:2: ( ( ( (lv_constants_0_0= ruleConstantsDeclaration ) ) | (otherlv_1= 'type' ( (lv_types_2_0= ruleTypeDeclaration ) )+ ) | ( (lv_externals_3_0= ruleExternalNodeDeclaration ) ) | ( (lv_nodes_4_0= ruleNodeDeclaration ) ) )+ )
            // InternalLustre.g:203:2: ( ( (lv_constants_0_0= ruleConstantsDeclaration ) ) | (otherlv_1= 'type' ( (lv_types_2_0= ruleTypeDeclaration ) )+ ) | ( (lv_externals_3_0= ruleExternalNodeDeclaration ) ) | ( (lv_nodes_4_0= ruleNodeDeclaration ) ) )+
            {
            // InternalLustre.g:203:2: ( ( (lv_constants_0_0= ruleConstantsDeclaration ) ) | (otherlv_1= 'type' ( (lv_types_2_0= ruleTypeDeclaration ) )+ ) | ( (lv_externals_3_0= ruleExternalNodeDeclaration ) ) | ( (lv_nodes_4_0= ruleNodeDeclaration ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=5;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    alt4=1;
                    }
                    break;
                case 14:
                    {
                    alt4=2;
                    }
                    break;
                case 27:
                    {
                    int LA4_4 = input.LA(2);

                    if ( ((LA4_4>=29 && LA4_4<=30)) ) {
                        alt4=4;
                    }
                    else if ( (LA4_4==28) ) {
                        alt4=3;
                    }


                    }
                    break;
                case 28:
                    {
                    alt4=3;
                    }
                    break;
                case 29:
                case 30:
                    {
                    alt4=4;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // InternalLustre.g:204:3: ( (lv_constants_0_0= ruleConstantsDeclaration ) )
            	    {
            	    // InternalLustre.g:204:3: ( (lv_constants_0_0= ruleConstantsDeclaration ) )
            	    // InternalLustre.g:205:4: (lv_constants_0_0= ruleConstantsDeclaration )
            	    {
            	    // InternalLustre.g:205:4: (lv_constants_0_0= ruleConstantsDeclaration )
            	    // InternalLustre.g:206:5: lv_constants_0_0= ruleConstantsDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPackBodyAccess().getConstantsConstantsDeclarationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_constants_0_0=ruleConstantsDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPackBodyRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constants",
            	      						lv_constants_0_0,
            	      						"de.cau.cs.kieler.lustre.Lustre.ConstantsDeclaration");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLustre.g:224:3: (otherlv_1= 'type' ( (lv_types_2_0= ruleTypeDeclaration ) )+ )
            	    {
            	    // InternalLustre.g:224:3: (otherlv_1= 'type' ( (lv_types_2_0= ruleTypeDeclaration ) )+ )
            	    // InternalLustre.g:225:4: otherlv_1= 'type' ( (lv_types_2_0= ruleTypeDeclaration ) )+
            	    {
            	    otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getPackBodyAccess().getTypeKeyword_1_0());
            	      			
            	    }
            	    // InternalLustre.g:229:4: ( (lv_types_2_0= ruleTypeDeclaration ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==RULE_IDENT) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalLustre.g:230:5: (lv_types_2_0= ruleTypeDeclaration )
            	    	    {
            	    	    // InternalLustre.g:230:5: (lv_types_2_0= ruleTypeDeclaration )
            	    	    // InternalLustre.g:231:6: lv_types_2_0= ruleTypeDeclaration
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getPackBodyAccess().getTypesTypeDeclarationParserRuleCall_1_1_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_7);
            	    	    lv_types_2_0=ruleTypeDeclaration();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						if (current==null) {
            	    	      							current = createModelElementForParent(grammarAccess.getPackBodyRule());
            	    	      						}
            	    	      						add(
            	    	      							current,
            	    	      							"types",
            	    	      							lv_types_2_0,
            	    	      							"de.cau.cs.kieler.lustre.Lustre.TypeDeclaration");
            	    	      						afterParserOrEnumRuleCall();
            	    	      					
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLustre.g:250:3: ( (lv_externals_3_0= ruleExternalNodeDeclaration ) )
            	    {
            	    // InternalLustre.g:250:3: ( (lv_externals_3_0= ruleExternalNodeDeclaration ) )
            	    // InternalLustre.g:251:4: (lv_externals_3_0= ruleExternalNodeDeclaration )
            	    {
            	    // InternalLustre.g:251:4: (lv_externals_3_0= ruleExternalNodeDeclaration )
            	    // InternalLustre.g:252:5: lv_externals_3_0= ruleExternalNodeDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPackBodyAccess().getExternalsExternalNodeDeclarationParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_externals_3_0=ruleExternalNodeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPackBodyRule());
            	      					}
            	      					add(
            	      						current,
            	      						"externals",
            	      						lv_externals_3_0,
            	      						"de.cau.cs.kieler.lustre.Lustre.ExternalNodeDeclaration");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLustre.g:270:3: ( (lv_nodes_4_0= ruleNodeDeclaration ) )
            	    {
            	    // InternalLustre.g:270:3: ( (lv_nodes_4_0= ruleNodeDeclaration ) )
            	    // InternalLustre.g:271:4: (lv_nodes_4_0= ruleNodeDeclaration )
            	    {
            	    // InternalLustre.g:271:4: (lv_nodes_4_0= ruleNodeDeclaration )
            	    // InternalLustre.g:272:5: lv_nodes_4_0= ruleNodeDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPackBodyAccess().getNodesNodeDeclarationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_nodes_4_0=ruleNodeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPackBodyRule());
            	      					}
            	      					add(
            	      						current,
            	      						"nodes",
            	      						lv_nodes_4_0,
            	      						"de.cau.cs.kieler.lustre.Lustre.NodeDeclaration");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

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
    // $ANTLR end "rulePackBody"


    // $ANTLR start "entryRuleConstantsDeclaration"
    // InternalLustre.g:293:1: entryRuleConstantsDeclaration returns [EObject current=null] : iv_ruleConstantsDeclaration= ruleConstantsDeclaration EOF ;
    public final EObject entryRuleConstantsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantsDeclaration = null;


        try {
            // InternalLustre.g:293:61: (iv_ruleConstantsDeclaration= ruleConstantsDeclaration EOF )
            // InternalLustre.g:294:2: iv_ruleConstantsDeclaration= ruleConstantsDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantsDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConstantsDeclaration=ruleConstantsDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantsDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantsDeclaration"


    // $ANTLR start "ruleConstantsDeclaration"
    // InternalLustre.g:300:1: ruleConstantsDeclaration returns [EObject current=null] : (otherlv_0= 'const' ( (lv_constants_1_0= ruleLustreTypedValuedIds ) ) otherlv_2= ';' ( ( (lv_constants_3_0= ruleLustreTypedValuedIds ) ) otherlv_4= ';' )* ) ;
    public final EObject ruleConstantsDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_constants_1_0 = null;

        EObject lv_constants_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:306:2: ( (otherlv_0= 'const' ( (lv_constants_1_0= ruleLustreTypedValuedIds ) ) otherlv_2= ';' ( ( (lv_constants_3_0= ruleLustreTypedValuedIds ) ) otherlv_4= ';' )* ) )
            // InternalLustre.g:307:2: (otherlv_0= 'const' ( (lv_constants_1_0= ruleLustreTypedValuedIds ) ) otherlv_2= ';' ( ( (lv_constants_3_0= ruleLustreTypedValuedIds ) ) otherlv_4= ';' )* )
            {
            // InternalLustre.g:307:2: (otherlv_0= 'const' ( (lv_constants_1_0= ruleLustreTypedValuedIds ) ) otherlv_2= ';' ( ( (lv_constants_3_0= ruleLustreTypedValuedIds ) ) otherlv_4= ';' )* )
            // InternalLustre.g:308:3: otherlv_0= 'const' ( (lv_constants_1_0= ruleLustreTypedValuedIds ) ) otherlv_2= ';' ( ( (lv_constants_3_0= ruleLustreTypedValuedIds ) ) otherlv_4= ';' )*
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstantsDeclarationAccess().getConstKeyword_0());
              		
            }
            // InternalLustre.g:312:3: ( (lv_constants_1_0= ruleLustreTypedValuedIds ) )
            // InternalLustre.g:313:4: (lv_constants_1_0= ruleLustreTypedValuedIds )
            {
            // InternalLustre.g:313:4: (lv_constants_1_0= ruleLustreTypedValuedIds )
            // InternalLustre.g:314:5: lv_constants_1_0= ruleLustreTypedValuedIds
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstantsDeclarationAccess().getConstantsLustreTypedValuedIdsParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_8);
            lv_constants_1_0=ruleLustreTypedValuedIds();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstantsDeclarationRule());
              					}
              					add(
              						current,
              						"constants",
              						lv_constants_1_0,
              						"de.cau.cs.kieler.lustre.Lustre.LustreTypedValuedIds");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConstantsDeclarationAccess().getSemicolonKeyword_2());
              		
            }
            // InternalLustre.g:335:3: ( ( (lv_constants_3_0= ruleLustreTypedValuedIds ) ) otherlv_4= ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_IDENT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLustre.g:336:4: ( (lv_constants_3_0= ruleLustreTypedValuedIds ) ) otherlv_4= ';'
            	    {
            	    // InternalLustre.g:336:4: ( (lv_constants_3_0= ruleLustreTypedValuedIds ) )
            	    // InternalLustre.g:337:5: (lv_constants_3_0= ruleLustreTypedValuedIds )
            	    {
            	    // InternalLustre.g:337:5: (lv_constants_3_0= ruleLustreTypedValuedIds )
            	    // InternalLustre.g:338:6: lv_constants_3_0= ruleLustreTypedValuedIds
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConstantsDeclarationAccess().getConstantsLustreTypedValuedIdsParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_constants_3_0=ruleLustreTypedValuedIds();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConstantsDeclarationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"constants",
            	      							lv_constants_3_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.LustreTypedValuedIds");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getConstantsDeclarationAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleConstantsDeclaration"


    // $ANTLR start "entryRuleTypeDeclaration"
    // InternalLustre.g:364:1: entryRuleTypeDeclaration returns [EObject current=null] : iv_ruleTypeDeclaration= ruleTypeDeclaration EOF ;
    public final EObject entryRuleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclaration = null;


        try {
            // InternalLustre.g:364:56: (iv_ruleTypeDeclaration= ruleTypeDeclaration EOF )
            // InternalLustre.g:365:2: iv_ruleTypeDeclaration= ruleTypeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeDeclaration=ruleTypeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // InternalLustre.g:371:1: ruleTypeDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) (otherlv_1= '=' ( ( (lv_types_2_0= ruleType ) ) | ( (lv_enums_3_0= ruleEnumType ) ) | ( (lv_struct_4_0= ruleStructType ) ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_types_2_0 = null;

        EObject lv_enums_3_0 = null;

        EObject lv_struct_4_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:377:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) (otherlv_1= '=' ( ( (lv_types_2_0= ruleType ) ) | ( (lv_enums_3_0= ruleEnumType ) ) | ( (lv_struct_4_0= ruleStructType ) ) ) )? otherlv_5= ';' ) )
            // InternalLustre.g:378:2: ( ( (lv_name_0_0= RULE_IDENT ) ) (otherlv_1= '=' ( ( (lv_types_2_0= ruleType ) ) | ( (lv_enums_3_0= ruleEnumType ) ) | ( (lv_struct_4_0= ruleStructType ) ) ) )? otherlv_5= ';' )
            {
            // InternalLustre.g:378:2: ( ( (lv_name_0_0= RULE_IDENT ) ) (otherlv_1= '=' ( ( (lv_types_2_0= ruleType ) ) | ( (lv_enums_3_0= ruleEnumType ) ) | ( (lv_struct_4_0= ruleStructType ) ) ) )? otherlv_5= ';' )
            // InternalLustre.g:379:3: ( (lv_name_0_0= RULE_IDENT ) ) (otherlv_1= '=' ( ( (lv_types_2_0= ruleType ) ) | ( (lv_enums_3_0= ruleEnumType ) ) | ( (lv_struct_4_0= ruleStructType ) ) ) )? otherlv_5= ';'
            {
            // InternalLustre.g:379:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:380:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:380:4: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:381:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getTypeDeclarationAccess().getNameIDENTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypeDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"de.cau.cs.kieler.lustre.Lustre.IDENT");
              				
            }

            }


            }

            // InternalLustre.g:397:3: (otherlv_1= '=' ( ( (lv_types_2_0= ruleType ) ) | ( (lv_enums_3_0= ruleEnumType ) ) | ( (lv_struct_4_0= ruleStructType ) ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLustre.g:398:4: otherlv_1= '=' ( ( (lv_types_2_0= ruleType ) ) | ( (lv_enums_3_0= ruleEnumType ) ) | ( (lv_struct_4_0= ruleStructType ) ) )
                    {
                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypeDeclarationAccess().getEqualsSignKeyword_1_0());
                      			
                    }
                    // InternalLustre.g:402:4: ( ( (lv_types_2_0= ruleType ) ) | ( (lv_enums_3_0= ruleEnumType ) ) | ( (lv_struct_4_0= ruleStructType ) ) )
                    int alt6=3;
                    switch ( input.LA(1) ) {
                    case RULE_IDENT:
                    case 18:
                    case 19:
                    case 20:
                        {
                        alt6=1;
                        }
                        break;
                    case 22:
                        {
                        alt6=2;
                        }
                        break;
                    case 23:
                    case 26:
                        {
                        alt6=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }

                    switch (alt6) {
                        case 1 :
                            // InternalLustre.g:403:5: ( (lv_types_2_0= ruleType ) )
                            {
                            // InternalLustre.g:403:5: ( (lv_types_2_0= ruleType ) )
                            // InternalLustre.g:404:6: (lv_types_2_0= ruleType )
                            {
                            // InternalLustre.g:404:6: (lv_types_2_0= ruleType )
                            // InternalLustre.g:405:7: lv_types_2_0= ruleType
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTypeDeclarationAccess().getTypesTypeParserRuleCall_1_1_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_8);
                            lv_types_2_0=ruleType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTypeDeclarationRule());
                              							}
                              							set(
                              								current,
                              								"types",
                              								lv_types_2_0,
                              								"de.cau.cs.kieler.lustre.Lustre.Type");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalLustre.g:423:5: ( (lv_enums_3_0= ruleEnumType ) )
                            {
                            // InternalLustre.g:423:5: ( (lv_enums_3_0= ruleEnumType ) )
                            // InternalLustre.g:424:6: (lv_enums_3_0= ruleEnumType )
                            {
                            // InternalLustre.g:424:6: (lv_enums_3_0= ruleEnumType )
                            // InternalLustre.g:425:7: lv_enums_3_0= ruleEnumType
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTypeDeclarationAccess().getEnumsEnumTypeParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_8);
                            lv_enums_3_0=ruleEnumType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTypeDeclarationRule());
                              							}
                              							set(
                              								current,
                              								"enums",
                              								lv_enums_3_0,
                              								"de.cau.cs.kieler.lustre.Lustre.EnumType");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalLustre.g:443:5: ( (lv_struct_4_0= ruleStructType ) )
                            {
                            // InternalLustre.g:443:5: ( (lv_struct_4_0= ruleStructType ) )
                            // InternalLustre.g:444:6: (lv_struct_4_0= ruleStructType )
                            {
                            // InternalLustre.g:444:6: (lv_struct_4_0= ruleStructType )
                            // InternalLustre.g:445:7: lv_struct_4_0= ruleStructType
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTypeDeclarationAccess().getStructStructTypeParserRuleCall_1_1_2_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_8);
                            lv_struct_4_0=ruleStructType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTypeDeclarationRule());
                              							}
                              							set(
                              								current,
                              								"struct",
                              								lv_struct_4_0,
                              								"de.cau.cs.kieler.lustre.Lustre.StructType");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTypeDeclarationAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

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
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleType"
    // InternalLustre.g:472:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalLustre.g:472:45: (iv_ruleType= ruleType EOF )
            // InternalLustre.g:473:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalLustre.g:479:1: ruleType returns [EObject current=null] : ( ( ( (lv_name_0_0= 'bool' ) ) | ( (lv_name_1_0= 'int' ) ) | ( (lv_name_2_0= 'real' ) ) | ( (lv_name_3_0= RULE_IDENT ) ) ) (otherlv_4= '^' ( (lv_arraySize_5_0= ruleLustreExpression ) ) )* ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_arraySize_5_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:485:2: ( ( ( ( (lv_name_0_0= 'bool' ) ) | ( (lv_name_1_0= 'int' ) ) | ( (lv_name_2_0= 'real' ) ) | ( (lv_name_3_0= RULE_IDENT ) ) ) (otherlv_4= '^' ( (lv_arraySize_5_0= ruleLustreExpression ) ) )* ) )
            // InternalLustre.g:486:2: ( ( ( (lv_name_0_0= 'bool' ) ) | ( (lv_name_1_0= 'int' ) ) | ( (lv_name_2_0= 'real' ) ) | ( (lv_name_3_0= RULE_IDENT ) ) ) (otherlv_4= '^' ( (lv_arraySize_5_0= ruleLustreExpression ) ) )* )
            {
            // InternalLustre.g:486:2: ( ( ( (lv_name_0_0= 'bool' ) ) | ( (lv_name_1_0= 'int' ) ) | ( (lv_name_2_0= 'real' ) ) | ( (lv_name_3_0= RULE_IDENT ) ) ) (otherlv_4= '^' ( (lv_arraySize_5_0= ruleLustreExpression ) ) )* )
            // InternalLustre.g:487:3: ( ( (lv_name_0_0= 'bool' ) ) | ( (lv_name_1_0= 'int' ) ) | ( (lv_name_2_0= 'real' ) ) | ( (lv_name_3_0= RULE_IDENT ) ) ) (otherlv_4= '^' ( (lv_arraySize_5_0= ruleLustreExpression ) ) )*
            {
            // InternalLustre.g:487:3: ( ( (lv_name_0_0= 'bool' ) ) | ( (lv_name_1_0= 'int' ) ) | ( (lv_name_2_0= 'real' ) ) | ( (lv_name_3_0= RULE_IDENT ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            case RULE_IDENT:
                {
                alt8=4;
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
                    // InternalLustre.g:488:4: ( (lv_name_0_0= 'bool' ) )
                    {
                    // InternalLustre.g:488:4: ( (lv_name_0_0= 'bool' ) )
                    // InternalLustre.g:489:5: (lv_name_0_0= 'bool' )
                    {
                    // InternalLustre.g:489:5: (lv_name_0_0= 'bool' )
                    // InternalLustre.g:490:6: lv_name_0_0= 'bool'
                    {
                    lv_name_0_0=(Token)match(input,18,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_0, grammarAccess.getTypeAccess().getNameBoolKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_0_0, "bool");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:503:4: ( (lv_name_1_0= 'int' ) )
                    {
                    // InternalLustre.g:503:4: ( (lv_name_1_0= 'int' ) )
                    // InternalLustre.g:504:5: (lv_name_1_0= 'int' )
                    {
                    // InternalLustre.g:504:5: (lv_name_1_0= 'int' )
                    // InternalLustre.g:505:6: lv_name_1_0= 'int'
                    {
                    lv_name_1_0=(Token)match(input,19,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIntKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_1_0, "int");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLustre.g:518:4: ( (lv_name_2_0= 'real' ) )
                    {
                    // InternalLustre.g:518:4: ( (lv_name_2_0= 'real' ) )
                    // InternalLustre.g:519:5: (lv_name_2_0= 'real' )
                    {
                    // InternalLustre.g:519:5: (lv_name_2_0= 'real' )
                    // InternalLustre.g:520:6: lv_name_2_0= 'real'
                    {
                    lv_name_2_0=(Token)match(input,20,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getTypeAccess().getNameRealKeyword_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_2_0, "real");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLustre.g:533:4: ( (lv_name_3_0= RULE_IDENT ) )
                    {
                    // InternalLustre.g:533:4: ( (lv_name_3_0= RULE_IDENT ) )
                    // InternalLustre.g:534:5: (lv_name_3_0= RULE_IDENT )
                    {
                    // InternalLustre.g:534:5: (lv_name_3_0= RULE_IDENT )
                    // InternalLustre.g:535:6: lv_name_3_0= RULE_IDENT
                    {
                    lv_name_3_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_3_0, grammarAccess.getTypeAccess().getNameIDENTTerminalRuleCall_0_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_3_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalLustre.g:552:3: (otherlv_4= '^' ( (lv_arraySize_5_0= ruleLustreExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLustre.g:553:4: otherlv_4= '^' ( (lv_arraySize_5_0= ruleLustreExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getCircumflexAccentKeyword_1_0());
            	      			
            	    }
            	    // InternalLustre.g:557:4: ( (lv_arraySize_5_0= ruleLustreExpression ) )
            	    // InternalLustre.g:558:5: (lv_arraySize_5_0= ruleLustreExpression )
            	    {
            	    // InternalLustre.g:558:5: (lv_arraySize_5_0= ruleLustreExpression )
            	    // InternalLustre.g:559:6: lv_arraySize_5_0= ruleLustreExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTypeAccess().getArraySizeLustreExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    lv_arraySize_5_0=ruleLustreExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"arraySize",
            	      							lv_arraySize_5_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.LustreExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEnumType"
    // InternalLustre.g:581:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // InternalLustre.g:581:49: (iv_ruleEnumType= ruleEnumType EOF )
            // InternalLustre.g:582:2: iv_ruleEnumType= ruleEnumType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEnumType=ruleEnumType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumType; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // InternalLustre.g:588:1: ruleEnumType returns [EObject current=null] : (otherlv_0= 'enum' otherlv_1= '{' ( (lv_values_2_0= RULE_IDENT ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_IDENT ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleEnumType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalLustre.g:594:2: ( (otherlv_0= 'enum' otherlv_1= '{' ( (lv_values_2_0= RULE_IDENT ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_IDENT ) ) )* otherlv_5= '}' ) )
            // InternalLustre.g:595:2: (otherlv_0= 'enum' otherlv_1= '{' ( (lv_values_2_0= RULE_IDENT ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_IDENT ) ) )* otherlv_5= '}' )
            {
            // InternalLustre.g:595:2: (otherlv_0= 'enum' otherlv_1= '{' ( (lv_values_2_0= RULE_IDENT ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_IDENT ) ) )* otherlv_5= '}' )
            // InternalLustre.g:596:3: otherlv_0= 'enum' otherlv_1= '{' ( (lv_values_2_0= RULE_IDENT ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_IDENT ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumTypeAccess().getEnumKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalLustre.g:604:3: ( (lv_values_2_0= RULE_IDENT ) )
            // InternalLustre.g:605:4: (lv_values_2_0= RULE_IDENT )
            {
            // InternalLustre.g:605:4: (lv_values_2_0= RULE_IDENT )
            // InternalLustre.g:606:5: lv_values_2_0= RULE_IDENT
            {
            lv_values_2_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_values_2_0, grammarAccess.getEnumTypeAccess().getValuesIDENTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumTypeRule());
              					}
              					addWithLastConsumed(
              						current,
              						"values",
              						lv_values_2_0,
              						"de.cau.cs.kieler.lustre.Lustre.IDENT");
              				
            }

            }


            }

            // InternalLustre.g:622:3: (otherlv_3= ',' ( (lv_values_4_0= RULE_IDENT ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLustre.g:623:4: otherlv_3= ',' ( (lv_values_4_0= RULE_IDENT ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getEnumTypeAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalLustre.g:627:4: ( (lv_values_4_0= RULE_IDENT ) )
            	    // InternalLustre.g:628:5: (lv_values_4_0= RULE_IDENT )
            	    {
            	    // InternalLustre.g:628:5: (lv_values_4_0= RULE_IDENT )
            	    // InternalLustre.g:629:6: lv_values_4_0= RULE_IDENT
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_values_4_0, grammarAccess.getEnumTypeAccess().getValuesIDENTTerminalRuleCall_3_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getEnumTypeRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"values",
            	      							lv_values_4_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

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
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleStructType"
    // InternalLustre.g:654:1: entryRuleStructType returns [EObject current=null] : iv_ruleStructType= ruleStructType EOF ;
    public final EObject entryRuleStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructType = null;


        try {
            // InternalLustre.g:654:51: (iv_ruleStructType= ruleStructType EOF )
            // InternalLustre.g:655:2: iv_ruleStructType= ruleStructType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStructType=ruleStructType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructType; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructType"


    // $ANTLR start "ruleStructType"
    // InternalLustre.g:661:1: ruleStructType returns [EObject current=null] : ( (otherlv_0= 'struct' )? otherlv_1= '{' ( (lv_elements_2_0= ruleLustreTypedValuedIds ) ) (otherlv_3= ';' ( (lv_elements_4_0= ruleLustreTypedValuedIds ) ) )* (otherlv_5= ';' )? otherlv_6= '}' ) ;
    public final EObject ruleStructType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:667:2: ( ( (otherlv_0= 'struct' )? otherlv_1= '{' ( (lv_elements_2_0= ruleLustreTypedValuedIds ) ) (otherlv_3= ';' ( (lv_elements_4_0= ruleLustreTypedValuedIds ) ) )* (otherlv_5= ';' )? otherlv_6= '}' ) )
            // InternalLustre.g:668:2: ( (otherlv_0= 'struct' )? otherlv_1= '{' ( (lv_elements_2_0= ruleLustreTypedValuedIds ) ) (otherlv_3= ';' ( (lv_elements_4_0= ruleLustreTypedValuedIds ) ) )* (otherlv_5= ';' )? otherlv_6= '}' )
            {
            // InternalLustre.g:668:2: ( (otherlv_0= 'struct' )? otherlv_1= '{' ( (lv_elements_2_0= ruleLustreTypedValuedIds ) ) (otherlv_3= ';' ( (lv_elements_4_0= ruleLustreTypedValuedIds ) ) )* (otherlv_5= ';' )? otherlv_6= '}' )
            // InternalLustre.g:669:3: (otherlv_0= 'struct' )? otherlv_1= '{' ( (lv_elements_2_0= ruleLustreTypedValuedIds ) ) (otherlv_3= ';' ( (lv_elements_4_0= ruleLustreTypedValuedIds ) ) )* (otherlv_5= ';' )? otherlv_6= '}'
            {
            // InternalLustre.g:669:3: (otherlv_0= 'struct' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLustre.g:670:4: otherlv_0= 'struct'
                    {
                    otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getStructTypeAccess().getStructKeyword_0());
                      			
                    }

                    }
                    break;

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalLustre.g:679:3: ( (lv_elements_2_0= ruleLustreTypedValuedIds ) )
            // InternalLustre.g:680:4: (lv_elements_2_0= ruleLustreTypedValuedIds )
            {
            // InternalLustre.g:680:4: (lv_elements_2_0= ruleLustreTypedValuedIds )
            // InternalLustre.g:681:5: lv_elements_2_0= ruleLustreTypedValuedIds
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStructTypeAccess().getElementsLustreTypedValuedIdsParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_elements_2_0=ruleLustreTypedValuedIds();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStructTypeRule());
              					}
              					add(
              						current,
              						"elements",
              						lv_elements_2_0,
              						"de.cau.cs.kieler.lustre.Lustre.LustreTypedValuedIds");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLustre.g:698:3: (otherlv_3= ';' ( (lv_elements_4_0= ruleLustreTypedValuedIds ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==RULE_IDENT) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalLustre.g:699:4: otherlv_3= ';' ( (lv_elements_4_0= ruleLustreTypedValuedIds ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getStructTypeAccess().getSemicolonKeyword_3_0());
            	      			
            	    }
            	    // InternalLustre.g:703:4: ( (lv_elements_4_0= ruleLustreTypedValuedIds ) )
            	    // InternalLustre.g:704:5: (lv_elements_4_0= ruleLustreTypedValuedIds )
            	    {
            	    // InternalLustre.g:704:5: (lv_elements_4_0= ruleLustreTypedValuedIds )
            	    // InternalLustre.g:705:6: lv_elements_4_0= ruleLustreTypedValuedIds
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStructTypeAccess().getElementsLustreTypedValuedIdsParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    lv_elements_4_0=ruleLustreTypedValuedIds();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getStructTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"elements",
            	      							lv_elements_4_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.LustreTypedValuedIds");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalLustre.g:723:3: (otherlv_5= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLustre.g:724:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getStructTypeAccess().getSemicolonKeyword_4());
                      			
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getStructTypeAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

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
    // $ANTLR end "ruleStructType"


    // $ANTLR start "entryRuleExternalNodeDeclaration"
    // InternalLustre.g:737:1: entryRuleExternalNodeDeclaration returns [EObject current=null] : iv_ruleExternalNodeDeclaration= ruleExternalNodeDeclaration EOF ;
    public final EObject entryRuleExternalNodeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalNodeDeclaration = null;


        try {
            // InternalLustre.g:737:64: (iv_ruleExternalNodeDeclaration= ruleExternalNodeDeclaration EOF )
            // InternalLustre.g:738:2: iv_ruleExternalNodeDeclaration= ruleExternalNodeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalNodeDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExternalNodeDeclaration=ruleExternalNodeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalNodeDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalNodeDeclaration"


    // $ANTLR start "ruleExternalNodeDeclaration"
    // InternalLustre.g:744:1: ruleExternalNodeDeclaration returns [EObject current=null] : ( ( (lv_isUnsafe_0_0= 'unsafe' ) )? otherlv_1= 'extern' (otherlv_2= 'function' | ( (lv_hasState_3_0= 'node' ) ) ) ( (lv_name_4_0= RULE_IDENT ) ) ( (lv_input_5_0= ruleParams ) ) otherlv_6= 'returns' ( (lv_output_7_0= ruleParams ) ) (otherlv_8= ';' )? ) ;
    public final EObject ruleExternalNodeDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_isUnsafe_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_hasState_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_input_5_0 = null;

        EObject lv_output_7_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:750:2: ( ( ( (lv_isUnsafe_0_0= 'unsafe' ) )? otherlv_1= 'extern' (otherlv_2= 'function' | ( (lv_hasState_3_0= 'node' ) ) ) ( (lv_name_4_0= RULE_IDENT ) ) ( (lv_input_5_0= ruleParams ) ) otherlv_6= 'returns' ( (lv_output_7_0= ruleParams ) ) (otherlv_8= ';' )? ) )
            // InternalLustre.g:751:2: ( ( (lv_isUnsafe_0_0= 'unsafe' ) )? otherlv_1= 'extern' (otherlv_2= 'function' | ( (lv_hasState_3_0= 'node' ) ) ) ( (lv_name_4_0= RULE_IDENT ) ) ( (lv_input_5_0= ruleParams ) ) otherlv_6= 'returns' ( (lv_output_7_0= ruleParams ) ) (otherlv_8= ';' )? )
            {
            // InternalLustre.g:751:2: ( ( (lv_isUnsafe_0_0= 'unsafe' ) )? otherlv_1= 'extern' (otherlv_2= 'function' | ( (lv_hasState_3_0= 'node' ) ) ) ( (lv_name_4_0= RULE_IDENT ) ) ( (lv_input_5_0= ruleParams ) ) otherlv_6= 'returns' ( (lv_output_7_0= ruleParams ) ) (otherlv_8= ';' )? )
            // InternalLustre.g:752:3: ( (lv_isUnsafe_0_0= 'unsafe' ) )? otherlv_1= 'extern' (otherlv_2= 'function' | ( (lv_hasState_3_0= 'node' ) ) ) ( (lv_name_4_0= RULE_IDENT ) ) ( (lv_input_5_0= ruleParams ) ) otherlv_6= 'returns' ( (lv_output_7_0= ruleParams ) ) (otherlv_8= ';' )?
            {
            // InternalLustre.g:752:3: ( (lv_isUnsafe_0_0= 'unsafe' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLustre.g:753:4: (lv_isUnsafe_0_0= 'unsafe' )
                    {
                    // InternalLustre.g:753:4: (lv_isUnsafe_0_0= 'unsafe' )
                    // InternalLustre.g:754:5: lv_isUnsafe_0_0= 'unsafe'
                    {
                    lv_isUnsafe_0_0=(Token)match(input,27,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isUnsafe_0_0, grammarAccess.getExternalNodeDeclarationAccess().getIsUnsafeUnsafeKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExternalNodeDeclarationRule());
                      					}
                      					setWithLastConsumed(current, "isUnsafe", true, "unsafe");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExternalNodeDeclarationAccess().getExternKeyword_1());
              		
            }
            // InternalLustre.g:770:3: (otherlv_2= 'function' | ( (lv_hasState_3_0= 'node' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            else if ( (LA15_0==30) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalLustre.g:771:4: otherlv_2= 'function'
                    {
                    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getExternalNodeDeclarationAccess().getFunctionKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalLustre.g:776:4: ( (lv_hasState_3_0= 'node' ) )
                    {
                    // InternalLustre.g:776:4: ( (lv_hasState_3_0= 'node' ) )
                    // InternalLustre.g:777:5: (lv_hasState_3_0= 'node' )
                    {
                    // InternalLustre.g:777:5: (lv_hasState_3_0= 'node' )
                    // InternalLustre.g:778:6: lv_hasState_3_0= 'node'
                    {
                    lv_hasState_3_0=(Token)match(input,30,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasState_3_0, grammarAccess.getExternalNodeDeclarationAccess().getHasStateNodeKeyword_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExternalNodeDeclarationRule());
                      						}
                      						setWithLastConsumed(current, "hasState", true, "node");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalLustre.g:791:3: ( (lv_name_4_0= RULE_IDENT ) )
            // InternalLustre.g:792:4: (lv_name_4_0= RULE_IDENT )
            {
            // InternalLustre.g:792:4: (lv_name_4_0= RULE_IDENT )
            // InternalLustre.g:793:5: lv_name_4_0= RULE_IDENT
            {
            lv_name_4_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getExternalNodeDeclarationAccess().getNameIDENTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExternalNodeDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"de.cau.cs.kieler.lustre.Lustre.IDENT");
              				
            }

            }


            }

            // InternalLustre.g:809:3: ( (lv_input_5_0= ruleParams ) )
            // InternalLustre.g:810:4: (lv_input_5_0= ruleParams )
            {
            // InternalLustre.g:810:4: (lv_input_5_0= ruleParams )
            // InternalLustre.g:811:5: lv_input_5_0= ruleParams
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExternalNodeDeclarationAccess().getInputParamsParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_21);
            lv_input_5_0=ruleParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExternalNodeDeclarationRule());
              					}
              					set(
              						current,
              						"input",
              						lv_input_5_0,
              						"de.cau.cs.kieler.lustre.Lustre.Params");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getExternalNodeDeclarationAccess().getReturnsKeyword_5());
              		
            }
            // InternalLustre.g:832:3: ( (lv_output_7_0= ruleParams ) )
            // InternalLustre.g:833:4: (lv_output_7_0= ruleParams )
            {
            // InternalLustre.g:833:4: (lv_output_7_0= ruleParams )
            // InternalLustre.g:834:5: lv_output_7_0= ruleParams
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExternalNodeDeclarationAccess().getOutputParamsParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_22);
            lv_output_7_0=ruleParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExternalNodeDeclarationRule());
              					}
              					set(
              						current,
              						"output",
              						lv_output_7_0,
              						"de.cau.cs.kieler.lustre.Lustre.Params");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLustre.g:851:3: (otherlv_8= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLustre.g:852:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getExternalNodeDeclarationAccess().getSemicolonKeyword_7());
                      			
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
    // $ANTLR end "ruleExternalNodeDeclaration"


    // $ANTLR start "entryRuleNodeDeclaration"
    // InternalLustre.g:861:1: entryRuleNodeDeclaration returns [EObject current=null] : iv_ruleNodeDeclaration= ruleNodeDeclaration EOF ;
    public final EObject entryRuleNodeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeDeclaration = null;


        try {
            // InternalLustre.g:861:56: (iv_ruleNodeDeclaration= ruleNodeDeclaration EOF )
            // InternalLustre.g:862:2: iv_ruleNodeDeclaration= ruleNodeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNodeDeclaration=ruleNodeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeDeclaration"


    // $ANTLR start "ruleNodeDeclaration"
    // InternalLustre.g:868:1: ruleNodeDeclaration returns [EObject current=null] : ( ( (lv_isUnsafe_0_0= 'unsafe' ) )? (otherlv_1= 'function' | ( (lv_hasState_2_0= 'node' ) ) ) ( (lv_name_3_0= RULE_IDENT ) ) (otherlv_4= '<<' ( (lv_staticParams_5_0= ruleStaticParam ) ) (otherlv_6= ';' ( (lv_staticParams_7_0= ruleStaticParam ) ) )* otherlv_8= '>>' )? ( ( ( (lv_input_9_0= ruleParams ) ) otherlv_10= 'returns' ( (lv_output_11_0= ruleParams ) ) ( (otherlv_12= '=' ( (lv_effectiveNode_13_0= ruleIdentRef ) ) (otherlv_14= '<<' ( (lv_staticArgs_15_0= ruleStaticArg ) ) (otherlv_16= ';' ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )? ) | ( (otherlv_19= ';' )? ( ( (lv_constants_20_0= ruleConstantsDeclaration ) ) | (otherlv_21= 'var' ( (lv_variables_22_0= ruleLustreClockedIdDeclaration ) ) (otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) ) )* otherlv_25= ';' ) )* otherlv_26= 'let' ( ( (lv_equations_27_0= ruleEquation ) ) | ( (lv_assertions_28_0= ruleAssertion ) ) | ( (lv_automatons_29_0= ruleAutomaton ) ) )* otherlv_30= 'tel' (otherlv_31= '.' | (otherlv_32= ';' )? ) ) ) ) | (otherlv_33= '=' ( (lv_effectiveNode_34_0= ruleIdentRef ) ) (otherlv_35= '<<' ( (lv_staticArgs_36_0= ruleStaticArg ) ) (otherlv_37= ';' ( (lv_staticArgs_38_0= ruleStaticArg ) ) )* otherlv_39= '>>' )? ) ) ) ;
    public final EObject ruleNodeDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_isUnsafe_0_0=null;
        Token otherlv_1=null;
        Token lv_hasState_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        EObject lv_staticParams_5_0 = null;

        EObject lv_staticParams_7_0 = null;

        EObject lv_input_9_0 = null;

        EObject lv_output_11_0 = null;

        AntlrDatatypeRuleToken lv_effectiveNode_13_0 = null;

        EObject lv_staticArgs_15_0 = null;

        EObject lv_staticArgs_17_0 = null;

        EObject lv_constants_20_0 = null;

        EObject lv_variables_22_0 = null;

        EObject lv_variables_24_0 = null;

        EObject lv_equations_27_0 = null;

        EObject lv_assertions_28_0 = null;

        EObject lv_automatons_29_0 = null;

        AntlrDatatypeRuleToken lv_effectiveNode_34_0 = null;

        EObject lv_staticArgs_36_0 = null;

        EObject lv_staticArgs_38_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:874:2: ( ( ( (lv_isUnsafe_0_0= 'unsafe' ) )? (otherlv_1= 'function' | ( (lv_hasState_2_0= 'node' ) ) ) ( (lv_name_3_0= RULE_IDENT ) ) (otherlv_4= '<<' ( (lv_staticParams_5_0= ruleStaticParam ) ) (otherlv_6= ';' ( (lv_staticParams_7_0= ruleStaticParam ) ) )* otherlv_8= '>>' )? ( ( ( (lv_input_9_0= ruleParams ) ) otherlv_10= 'returns' ( (lv_output_11_0= ruleParams ) ) ( (otherlv_12= '=' ( (lv_effectiveNode_13_0= ruleIdentRef ) ) (otherlv_14= '<<' ( (lv_staticArgs_15_0= ruleStaticArg ) ) (otherlv_16= ';' ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )? ) | ( (otherlv_19= ';' )? ( ( (lv_constants_20_0= ruleConstantsDeclaration ) ) | (otherlv_21= 'var' ( (lv_variables_22_0= ruleLustreClockedIdDeclaration ) ) (otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) ) )* otherlv_25= ';' ) )* otherlv_26= 'let' ( ( (lv_equations_27_0= ruleEquation ) ) | ( (lv_assertions_28_0= ruleAssertion ) ) | ( (lv_automatons_29_0= ruleAutomaton ) ) )* otherlv_30= 'tel' (otherlv_31= '.' | (otherlv_32= ';' )? ) ) ) ) | (otherlv_33= '=' ( (lv_effectiveNode_34_0= ruleIdentRef ) ) (otherlv_35= '<<' ( (lv_staticArgs_36_0= ruleStaticArg ) ) (otherlv_37= ';' ( (lv_staticArgs_38_0= ruleStaticArg ) ) )* otherlv_39= '>>' )? ) ) ) )
            // InternalLustre.g:875:2: ( ( (lv_isUnsafe_0_0= 'unsafe' ) )? (otherlv_1= 'function' | ( (lv_hasState_2_0= 'node' ) ) ) ( (lv_name_3_0= RULE_IDENT ) ) (otherlv_4= '<<' ( (lv_staticParams_5_0= ruleStaticParam ) ) (otherlv_6= ';' ( (lv_staticParams_7_0= ruleStaticParam ) ) )* otherlv_8= '>>' )? ( ( ( (lv_input_9_0= ruleParams ) ) otherlv_10= 'returns' ( (lv_output_11_0= ruleParams ) ) ( (otherlv_12= '=' ( (lv_effectiveNode_13_0= ruleIdentRef ) ) (otherlv_14= '<<' ( (lv_staticArgs_15_0= ruleStaticArg ) ) (otherlv_16= ';' ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )? ) | ( (otherlv_19= ';' )? ( ( (lv_constants_20_0= ruleConstantsDeclaration ) ) | (otherlv_21= 'var' ( (lv_variables_22_0= ruleLustreClockedIdDeclaration ) ) (otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) ) )* otherlv_25= ';' ) )* otherlv_26= 'let' ( ( (lv_equations_27_0= ruleEquation ) ) | ( (lv_assertions_28_0= ruleAssertion ) ) | ( (lv_automatons_29_0= ruleAutomaton ) ) )* otherlv_30= 'tel' (otherlv_31= '.' | (otherlv_32= ';' )? ) ) ) ) | (otherlv_33= '=' ( (lv_effectiveNode_34_0= ruleIdentRef ) ) (otherlv_35= '<<' ( (lv_staticArgs_36_0= ruleStaticArg ) ) (otherlv_37= ';' ( (lv_staticArgs_38_0= ruleStaticArg ) ) )* otherlv_39= '>>' )? ) ) )
            {
            // InternalLustre.g:875:2: ( ( (lv_isUnsafe_0_0= 'unsafe' ) )? (otherlv_1= 'function' | ( (lv_hasState_2_0= 'node' ) ) ) ( (lv_name_3_0= RULE_IDENT ) ) (otherlv_4= '<<' ( (lv_staticParams_5_0= ruleStaticParam ) ) (otherlv_6= ';' ( (lv_staticParams_7_0= ruleStaticParam ) ) )* otherlv_8= '>>' )? ( ( ( (lv_input_9_0= ruleParams ) ) otherlv_10= 'returns' ( (lv_output_11_0= ruleParams ) ) ( (otherlv_12= '=' ( (lv_effectiveNode_13_0= ruleIdentRef ) ) (otherlv_14= '<<' ( (lv_staticArgs_15_0= ruleStaticArg ) ) (otherlv_16= ';' ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )? ) | ( (otherlv_19= ';' )? ( ( (lv_constants_20_0= ruleConstantsDeclaration ) ) | (otherlv_21= 'var' ( (lv_variables_22_0= ruleLustreClockedIdDeclaration ) ) (otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) ) )* otherlv_25= ';' ) )* otherlv_26= 'let' ( ( (lv_equations_27_0= ruleEquation ) ) | ( (lv_assertions_28_0= ruleAssertion ) ) | ( (lv_automatons_29_0= ruleAutomaton ) ) )* otherlv_30= 'tel' (otherlv_31= '.' | (otherlv_32= ';' )? ) ) ) ) | (otherlv_33= '=' ( (lv_effectiveNode_34_0= ruleIdentRef ) ) (otherlv_35= '<<' ( (lv_staticArgs_36_0= ruleStaticArg ) ) (otherlv_37= ';' ( (lv_staticArgs_38_0= ruleStaticArg ) ) )* otherlv_39= '>>' )? ) ) )
            // InternalLustre.g:876:3: ( (lv_isUnsafe_0_0= 'unsafe' ) )? (otherlv_1= 'function' | ( (lv_hasState_2_0= 'node' ) ) ) ( (lv_name_3_0= RULE_IDENT ) ) (otherlv_4= '<<' ( (lv_staticParams_5_0= ruleStaticParam ) ) (otherlv_6= ';' ( (lv_staticParams_7_0= ruleStaticParam ) ) )* otherlv_8= '>>' )? ( ( ( (lv_input_9_0= ruleParams ) ) otherlv_10= 'returns' ( (lv_output_11_0= ruleParams ) ) ( (otherlv_12= '=' ( (lv_effectiveNode_13_0= ruleIdentRef ) ) (otherlv_14= '<<' ( (lv_staticArgs_15_0= ruleStaticArg ) ) (otherlv_16= ';' ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )? ) | ( (otherlv_19= ';' )? ( ( (lv_constants_20_0= ruleConstantsDeclaration ) ) | (otherlv_21= 'var' ( (lv_variables_22_0= ruleLustreClockedIdDeclaration ) ) (otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) ) )* otherlv_25= ';' ) )* otherlv_26= 'let' ( ( (lv_equations_27_0= ruleEquation ) ) | ( (lv_assertions_28_0= ruleAssertion ) ) | ( (lv_automatons_29_0= ruleAutomaton ) ) )* otherlv_30= 'tel' (otherlv_31= '.' | (otherlv_32= ';' )? ) ) ) ) | (otherlv_33= '=' ( (lv_effectiveNode_34_0= ruleIdentRef ) ) (otherlv_35= '<<' ( (lv_staticArgs_36_0= ruleStaticArg ) ) (otherlv_37= ';' ( (lv_staticArgs_38_0= ruleStaticArg ) ) )* otherlv_39= '>>' )? ) )
            {
            // InternalLustre.g:876:3: ( (lv_isUnsafe_0_0= 'unsafe' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLustre.g:877:4: (lv_isUnsafe_0_0= 'unsafe' )
                    {
                    // InternalLustre.g:877:4: (lv_isUnsafe_0_0= 'unsafe' )
                    // InternalLustre.g:878:5: lv_isUnsafe_0_0= 'unsafe'
                    {
                    lv_isUnsafe_0_0=(Token)match(input,27,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isUnsafe_0_0, grammarAccess.getNodeDeclarationAccess().getIsUnsafeUnsafeKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getNodeDeclarationRule());
                      					}
                      					setWithLastConsumed(current, "isUnsafe", true, "unsafe");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalLustre.g:890:3: (otherlv_1= 'function' | ( (lv_hasState_2_0= 'node' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            else if ( (LA18_0==30) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalLustre.g:891:4: otherlv_1= 'function'
                    {
                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getNodeDeclarationAccess().getFunctionKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalLustre.g:896:4: ( (lv_hasState_2_0= 'node' ) )
                    {
                    // InternalLustre.g:896:4: ( (lv_hasState_2_0= 'node' ) )
                    // InternalLustre.g:897:5: (lv_hasState_2_0= 'node' )
                    {
                    // InternalLustre.g:897:5: (lv_hasState_2_0= 'node' )
                    // InternalLustre.g:898:6: lv_hasState_2_0= 'node'
                    {
                    lv_hasState_2_0=(Token)match(input,30,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasState_2_0, grammarAccess.getNodeDeclarationAccess().getHasStateNodeKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeDeclarationRule());
                      						}
                      						setWithLastConsumed(current, "hasState", true, "node");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalLustre.g:911:3: ( (lv_name_3_0= RULE_IDENT ) )
            // InternalLustre.g:912:4: (lv_name_3_0= RULE_IDENT )
            {
            // InternalLustre.g:912:4: (lv_name_3_0= RULE_IDENT )
            // InternalLustre.g:913:5: lv_name_3_0= RULE_IDENT
            {
            lv_name_3_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getNodeDeclarationAccess().getNameIDENTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNodeDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"de.cau.cs.kieler.lustre.Lustre.IDENT");
              				
            }

            }


            }

            // InternalLustre.g:929:3: (otherlv_4= '<<' ( (lv_staticParams_5_0= ruleStaticParam ) ) (otherlv_6= ';' ( (lv_staticParams_7_0= ruleStaticParam ) ) )* otherlv_8= '>>' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLustre.g:930:4: otherlv_4= '<<' ( (lv_staticParams_5_0= ruleStaticParam ) ) (otherlv_6= ';' ( (lv_staticParams_7_0= ruleStaticParam ) ) )* otherlv_8= '>>'
                    {
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getNodeDeclarationAccess().getLessThanSignLessThanSignKeyword_3_0());
                      			
                    }
                    // InternalLustre.g:934:4: ( (lv_staticParams_5_0= ruleStaticParam ) )
                    // InternalLustre.g:935:5: (lv_staticParams_5_0= ruleStaticParam )
                    {
                    // InternalLustre.g:935:5: (lv_staticParams_5_0= ruleStaticParam )
                    // InternalLustre.g:936:6: lv_staticParams_5_0= ruleStaticParam
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeDeclarationAccess().getStaticParamsStaticParamParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
                    lv_staticParams_5_0=ruleStaticParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
                      						}
                      						add(
                      							current,
                      							"staticParams",
                      							lv_staticParams_5_0,
                      							"de.cau.cs.kieler.lustre.Lustre.StaticParam");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalLustre.g:953:4: (otherlv_6= ';' ( (lv_staticParams_7_0= ruleStaticParam ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalLustre.g:954:5: otherlv_6= ';' ( (lv_staticParams_7_0= ruleStaticParam ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getNodeDeclarationAccess().getSemicolonKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalLustre.g:958:5: ( (lv_staticParams_7_0= ruleStaticParam ) )
                    	    // InternalLustre.g:959:6: (lv_staticParams_7_0= ruleStaticParam )
                    	    {
                    	    // InternalLustre.g:959:6: (lv_staticParams_7_0= ruleStaticParam )
                    	    // InternalLustre.g:960:7: lv_staticParams_7_0= ruleStaticParam
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getNodeDeclarationAccess().getStaticParamsStaticParamParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_25);
                    	    lv_staticParams_7_0=ruleStaticParam();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"staticParams",
                    	      								lv_staticParams_7_0,
                    	      								"de.cau.cs.kieler.lustre.Lustre.StaticParam");
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

                    otherlv_8=(Token)match(input,33,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getNodeDeclarationAccess().getGreaterThanSignGreaterThanSignKeyword_3_3());
                      			
                    }

                    }
                    break;

            }

            // InternalLustre.g:983:3: ( ( ( (lv_input_9_0= ruleParams ) ) otherlv_10= 'returns' ( (lv_output_11_0= ruleParams ) ) ( (otherlv_12= '=' ( (lv_effectiveNode_13_0= ruleIdentRef ) ) (otherlv_14= '<<' ( (lv_staticArgs_15_0= ruleStaticArg ) ) (otherlv_16= ';' ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )? ) | ( (otherlv_19= ';' )? ( ( (lv_constants_20_0= ruleConstantsDeclaration ) ) | (otherlv_21= 'var' ( (lv_variables_22_0= ruleLustreClockedIdDeclaration ) ) (otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) ) )* otherlv_25= ';' ) )* otherlv_26= 'let' ( ( (lv_equations_27_0= ruleEquation ) ) | ( (lv_assertions_28_0= ruleAssertion ) ) | ( (lv_automatons_29_0= ruleAutomaton ) ) )* otherlv_30= 'tel' (otherlv_31= '.' | (otherlv_32= ';' )? ) ) ) ) | (otherlv_33= '=' ( (lv_effectiveNode_34_0= ruleIdentRef ) ) (otherlv_35= '<<' ( (lv_staticArgs_36_0= ruleStaticArg ) ) (otherlv_37= ';' ( (lv_staticArgs_38_0= ruleStaticArg ) ) )* otherlv_39= '>>' )? ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            else if ( (LA32_0==17) ) {
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
                    // InternalLustre.g:984:4: ( ( (lv_input_9_0= ruleParams ) ) otherlv_10= 'returns' ( (lv_output_11_0= ruleParams ) ) ( (otherlv_12= '=' ( (lv_effectiveNode_13_0= ruleIdentRef ) ) (otherlv_14= '<<' ( (lv_staticArgs_15_0= ruleStaticArg ) ) (otherlv_16= ';' ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )? ) | ( (otherlv_19= ';' )? ( ( (lv_constants_20_0= ruleConstantsDeclaration ) ) | (otherlv_21= 'var' ( (lv_variables_22_0= ruleLustreClockedIdDeclaration ) ) (otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) ) )* otherlv_25= ';' ) )* otherlv_26= 'let' ( ( (lv_equations_27_0= ruleEquation ) ) | ( (lv_assertions_28_0= ruleAssertion ) ) | ( (lv_automatons_29_0= ruleAutomaton ) ) )* otherlv_30= 'tel' (otherlv_31= '.' | (otherlv_32= ';' )? ) ) ) )
                    {
                    // InternalLustre.g:984:4: ( ( (lv_input_9_0= ruleParams ) ) otherlv_10= 'returns' ( (lv_output_11_0= ruleParams ) ) ( (otherlv_12= '=' ( (lv_effectiveNode_13_0= ruleIdentRef ) ) (otherlv_14= '<<' ( (lv_staticArgs_15_0= ruleStaticArg ) ) (otherlv_16= ';' ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )? ) | ( (otherlv_19= ';' )? ( ( (lv_constants_20_0= ruleConstantsDeclaration ) ) | (otherlv_21= 'var' ( (lv_variables_22_0= ruleLustreClockedIdDeclaration ) ) (otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) ) )* otherlv_25= ';' ) )* otherlv_26= 'let' ( ( (lv_equations_27_0= ruleEquation ) ) | ( (lv_assertions_28_0= ruleAssertion ) ) | ( (lv_automatons_29_0= ruleAutomaton ) ) )* otherlv_30= 'tel' (otherlv_31= '.' | (otherlv_32= ';' )? ) ) ) )
                    // InternalLustre.g:985:5: ( (lv_input_9_0= ruleParams ) ) otherlv_10= 'returns' ( (lv_output_11_0= ruleParams ) ) ( (otherlv_12= '=' ( (lv_effectiveNode_13_0= ruleIdentRef ) ) (otherlv_14= '<<' ( (lv_staticArgs_15_0= ruleStaticArg ) ) (otherlv_16= ';' ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )? ) | ( (otherlv_19= ';' )? ( ( (lv_constants_20_0= ruleConstantsDeclaration ) ) | (otherlv_21= 'var' ( (lv_variables_22_0= ruleLustreClockedIdDeclaration ) ) (otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) ) )* otherlv_25= ';' ) )* otherlv_26= 'let' ( ( (lv_equations_27_0= ruleEquation ) ) | ( (lv_assertions_28_0= ruleAssertion ) ) | ( (lv_automatons_29_0= ruleAutomaton ) ) )* otherlv_30= 'tel' (otherlv_31= '.' | (otherlv_32= ';' )? ) ) )
                    {
                    // InternalLustre.g:985:5: ( (lv_input_9_0= ruleParams ) )
                    // InternalLustre.g:986:6: (lv_input_9_0= ruleParams )
                    {
                    // InternalLustre.g:986:6: (lv_input_9_0= ruleParams )
                    // InternalLustre.g:987:7: lv_input_9_0= ruleParams
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNodeDeclarationAccess().getInputParamsParserRuleCall_4_0_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    lv_input_9_0=ruleParams();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
                      							}
                      							set(
                      								current,
                      								"input",
                      								lv_input_9_0,
                      								"de.cau.cs.kieler.lustre.Lustre.Params");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,31,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getNodeDeclarationAccess().getReturnsKeyword_4_0_1());
                      				
                    }
                    // InternalLustre.g:1008:5: ( (lv_output_11_0= ruleParams ) )
                    // InternalLustre.g:1009:6: (lv_output_11_0= ruleParams )
                    {
                    // InternalLustre.g:1009:6: (lv_output_11_0= ruleParams )
                    // InternalLustre.g:1010:7: lv_output_11_0= ruleParams
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNodeDeclarationAccess().getOutputParamsParserRuleCall_4_0_2_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_output_11_0=ruleParams();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
                      							}
                      							set(
                      								current,
                      								"output",
                      								lv_output_11_0,
                      								"de.cau.cs.kieler.lustre.Lustre.Params");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalLustre.g:1027:5: ( (otherlv_12= '=' ( (lv_effectiveNode_13_0= ruleIdentRef ) ) (otherlv_14= '<<' ( (lv_staticArgs_15_0= ruleStaticArg ) ) (otherlv_16= ';' ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )? ) | ( (otherlv_19= ';' )? ( ( (lv_constants_20_0= ruleConstantsDeclaration ) ) | (otherlv_21= 'var' ( (lv_variables_22_0= ruleLustreClockedIdDeclaration ) ) (otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) ) )* otherlv_25= ';' ) )* otherlv_26= 'let' ( ( (lv_equations_27_0= ruleEquation ) ) | ( (lv_assertions_28_0= ruleAssertion ) ) | ( (lv_automatons_29_0= ruleAutomaton ) ) )* otherlv_30= 'tel' (otherlv_31= '.' | (otherlv_32= ';' )? ) ) )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==17) ) {
                        alt29=1;
                    }
                    else if ( ((LA29_0>=15 && LA29_0<=16)||(LA29_0>=34 && LA29_0<=35)) ) {
                        alt29=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalLustre.g:1028:6: (otherlv_12= '=' ( (lv_effectiveNode_13_0= ruleIdentRef ) ) (otherlv_14= '<<' ( (lv_staticArgs_15_0= ruleStaticArg ) ) (otherlv_16= ';' ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )? )
                            {
                            // InternalLustre.g:1028:6: (otherlv_12= '=' ( (lv_effectiveNode_13_0= ruleIdentRef ) ) (otherlv_14= '<<' ( (lv_staticArgs_15_0= ruleStaticArg ) ) (otherlv_16= ';' ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )? )
                            // InternalLustre.g:1029:7: otherlv_12= '=' ( (lv_effectiveNode_13_0= ruleIdentRef ) ) (otherlv_14= '<<' ( (lv_staticArgs_15_0= ruleStaticArg ) ) (otherlv_16= ';' ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )?
                            {
                            otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_12, grammarAccess.getNodeDeclarationAccess().getEqualsSignKeyword_4_0_3_0_0());
                              						
                            }
                            // InternalLustre.g:1033:7: ( (lv_effectiveNode_13_0= ruleIdentRef ) )
                            // InternalLustre.g:1034:8: (lv_effectiveNode_13_0= ruleIdentRef )
                            {
                            // InternalLustre.g:1034:8: (lv_effectiveNode_13_0= ruleIdentRef )
                            // InternalLustre.g:1035:9: lv_effectiveNode_13_0= ruleIdentRef
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getNodeDeclarationAccess().getEffectiveNodeIdentRefParserRuleCall_4_0_3_0_1_0());
                              								
                            }
                            pushFollow(FollowSets000.FOLLOW_28);
                            lv_effectiveNode_13_0=ruleIdentRef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
                              									}
                              									set(
                              										current,
                              										"effectiveNode",
                              										lv_effectiveNode_13_0,
                              										"de.cau.cs.kieler.lustre.Lustre.IdentRef");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalLustre.g:1052:7: (otherlv_14= '<<' ( (lv_staticArgs_15_0= ruleStaticArg ) ) (otherlv_16= ';' ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==32) ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // InternalLustre.g:1053:8: otherlv_14= '<<' ( (lv_staticArgs_15_0= ruleStaticArg ) ) (otherlv_16= ';' ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>'
                                    {
                                    otherlv_14=(Token)match(input,32,FollowSets000.FOLLOW_29); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_14, grammarAccess.getNodeDeclarationAccess().getLessThanSignLessThanSignKeyword_4_0_3_0_2_0());
                                      							
                                    }
                                    // InternalLustre.g:1057:8: ( (lv_staticArgs_15_0= ruleStaticArg ) )
                                    // InternalLustre.g:1058:9: (lv_staticArgs_15_0= ruleStaticArg )
                                    {
                                    // InternalLustre.g:1058:9: (lv_staticArgs_15_0= ruleStaticArg )
                                    // InternalLustre.g:1059:10: lv_staticArgs_15_0= ruleStaticArg
                                    {
                                    if ( state.backtracking==0 ) {

                                      										newCompositeNode(grammarAccess.getNodeDeclarationAccess().getStaticArgsStaticArgParserRuleCall_4_0_3_0_2_1_0());
                                      									
                                    }
                                    pushFollow(FollowSets000.FOLLOW_25);
                                    lv_staticArgs_15_0=ruleStaticArg();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      										if (current==null) {
                                      											current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
                                      										}
                                      										add(
                                      											current,
                                      											"staticArgs",
                                      											lv_staticArgs_15_0,
                                      											"de.cau.cs.kieler.lustre.Lustre.StaticArg");
                                      										afterParserOrEnumRuleCall();
                                      									
                                    }

                                    }


                                    }

                                    // InternalLustre.g:1076:8: (otherlv_16= ';' ( (lv_staticArgs_17_0= ruleStaticArg ) ) )*
                                    loop21:
                                    do {
                                        int alt21=2;
                                        int LA21_0 = input.LA(1);

                                        if ( (LA21_0==16) ) {
                                            alt21=1;
                                        }


                                        switch (alt21) {
                                    	case 1 :
                                    	    // InternalLustre.g:1077:9: otherlv_16= ';' ( (lv_staticArgs_17_0= ruleStaticArg ) )
                                    	    {
                                    	    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_29); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      									newLeafNode(otherlv_16, grammarAccess.getNodeDeclarationAccess().getSemicolonKeyword_4_0_3_0_2_2_0());
                                    	      								
                                    	    }
                                    	    // InternalLustre.g:1081:9: ( (lv_staticArgs_17_0= ruleStaticArg ) )
                                    	    // InternalLustre.g:1082:10: (lv_staticArgs_17_0= ruleStaticArg )
                                    	    {
                                    	    // InternalLustre.g:1082:10: (lv_staticArgs_17_0= ruleStaticArg )
                                    	    // InternalLustre.g:1083:11: lv_staticArgs_17_0= ruleStaticArg
                                    	    {
                                    	    if ( state.backtracking==0 ) {

                                    	      											newCompositeNode(grammarAccess.getNodeDeclarationAccess().getStaticArgsStaticArgParserRuleCall_4_0_3_0_2_2_1_0());
                                    	      										
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_25);
                                    	    lv_staticArgs_17_0=ruleStaticArg();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      											if (current==null) {
                                    	      												current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
                                    	      											}
                                    	      											add(
                                    	      												current,
                                    	      												"staticArgs",
                                    	      												lv_staticArgs_17_0,
                                    	      												"de.cau.cs.kieler.lustre.Lustre.StaticArg");
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

                                    otherlv_18=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_18, grammarAccess.getNodeDeclarationAccess().getGreaterThanSignGreaterThanSignKeyword_4_0_3_0_2_3());
                                      							
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalLustre.g:1108:6: ( (otherlv_19= ';' )? ( ( (lv_constants_20_0= ruleConstantsDeclaration ) ) | (otherlv_21= 'var' ( (lv_variables_22_0= ruleLustreClockedIdDeclaration ) ) (otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) ) )* otherlv_25= ';' ) )* otherlv_26= 'let' ( ( (lv_equations_27_0= ruleEquation ) ) | ( (lv_assertions_28_0= ruleAssertion ) ) | ( (lv_automatons_29_0= ruleAutomaton ) ) )* otherlv_30= 'tel' (otherlv_31= '.' | (otherlv_32= ';' )? ) )
                            {
                            // InternalLustre.g:1108:6: ( (otherlv_19= ';' )? ( ( (lv_constants_20_0= ruleConstantsDeclaration ) ) | (otherlv_21= 'var' ( (lv_variables_22_0= ruleLustreClockedIdDeclaration ) ) (otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) ) )* otherlv_25= ';' ) )* otherlv_26= 'let' ( ( (lv_equations_27_0= ruleEquation ) ) | ( (lv_assertions_28_0= ruleAssertion ) ) | ( (lv_automatons_29_0= ruleAutomaton ) ) )* otherlv_30= 'tel' (otherlv_31= '.' | (otherlv_32= ';' )? ) )
                            // InternalLustre.g:1109:7: (otherlv_19= ';' )? ( ( (lv_constants_20_0= ruleConstantsDeclaration ) ) | (otherlv_21= 'var' ( (lv_variables_22_0= ruleLustreClockedIdDeclaration ) ) (otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) ) )* otherlv_25= ';' ) )* otherlv_26= 'let' ( ( (lv_equations_27_0= ruleEquation ) ) | ( (lv_assertions_28_0= ruleAssertion ) ) | ( (lv_automatons_29_0= ruleAutomaton ) ) )* otherlv_30= 'tel' (otherlv_31= '.' | (otherlv_32= ';' )? )
                            {
                            // InternalLustre.g:1109:7: (otherlv_19= ';' )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0==16) ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // InternalLustre.g:1110:8: otherlv_19= ';'
                                    {
                                    otherlv_19=(Token)match(input,16,FollowSets000.FOLLOW_30); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_19, grammarAccess.getNodeDeclarationAccess().getSemicolonKeyword_4_0_3_1_0());
                                      							
                                    }

                                    }
                                    break;

                            }

                            // InternalLustre.g:1115:7: ( ( (lv_constants_20_0= ruleConstantsDeclaration ) ) | (otherlv_21= 'var' ( (lv_variables_22_0= ruleLustreClockedIdDeclaration ) ) (otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) ) )* otherlv_25= ';' ) )*
                            loop25:
                            do {
                                int alt25=3;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==15) ) {
                                    alt25=1;
                                }
                                else if ( (LA25_0==34) ) {
                                    alt25=2;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // InternalLustre.g:1116:8: ( (lv_constants_20_0= ruleConstantsDeclaration ) )
                            	    {
                            	    // InternalLustre.g:1116:8: ( (lv_constants_20_0= ruleConstantsDeclaration ) )
                            	    // InternalLustre.g:1117:9: (lv_constants_20_0= ruleConstantsDeclaration )
                            	    {
                            	    // InternalLustre.g:1117:9: (lv_constants_20_0= ruleConstantsDeclaration )
                            	    // InternalLustre.g:1118:10: lv_constants_20_0= ruleConstantsDeclaration
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      										newCompositeNode(grammarAccess.getNodeDeclarationAccess().getConstantsConstantsDeclarationParserRuleCall_4_0_3_1_1_0_0());
                            	      									
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_30);
                            	    lv_constants_20_0=ruleConstantsDeclaration();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      										if (current==null) {
                            	      											current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
                            	      										}
                            	      										add(
                            	      											current,
                            	      											"constants",
                            	      											lv_constants_20_0,
                            	      											"de.cau.cs.kieler.lustre.Lustre.ConstantsDeclaration");
                            	      										afterParserOrEnumRuleCall();
                            	      									
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 2 :
                            	    // InternalLustre.g:1136:8: (otherlv_21= 'var' ( (lv_variables_22_0= ruleLustreClockedIdDeclaration ) ) (otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) ) )* otherlv_25= ';' )
                            	    {
                            	    // InternalLustre.g:1136:8: (otherlv_21= 'var' ( (lv_variables_22_0= ruleLustreClockedIdDeclaration ) ) (otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) ) )* otherlv_25= ';' )
                            	    // InternalLustre.g:1137:9: otherlv_21= 'var' ( (lv_variables_22_0= ruleLustreClockedIdDeclaration ) ) (otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) ) )* otherlv_25= ';'
                            	    {
                            	    otherlv_21=(Token)match(input,34,FollowSets000.FOLLOW_31); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									newLeafNode(otherlv_21, grammarAccess.getNodeDeclarationAccess().getVarKeyword_4_0_3_1_1_1_0());
                            	      								
                            	    }
                            	    // InternalLustre.g:1141:9: ( (lv_variables_22_0= ruleLustreClockedIdDeclaration ) )
                            	    // InternalLustre.g:1142:10: (lv_variables_22_0= ruleLustreClockedIdDeclaration )
                            	    {
                            	    // InternalLustre.g:1142:10: (lv_variables_22_0= ruleLustreClockedIdDeclaration )
                            	    // InternalLustre.g:1143:11: lv_variables_22_0= ruleLustreClockedIdDeclaration
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      											newCompositeNode(grammarAccess.getNodeDeclarationAccess().getVariablesLustreClockedIdDeclarationParserRuleCall_4_0_3_1_1_1_1_0());
                            	      										
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_8);
                            	    lv_variables_22_0=ruleLustreClockedIdDeclaration();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      											if (current==null) {
                            	      												current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
                            	      											}
                            	      											add(
                            	      												current,
                            	      												"variables",
                            	      												lv_variables_22_0,
                            	      												"de.cau.cs.kieler.lustre.Lustre.LustreClockedIdDeclaration");
                            	      											afterParserOrEnumRuleCall();
                            	      										
                            	    }

                            	    }


                            	    }

                            	    // InternalLustre.g:1160:9: (otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) ) )*
                            	    loop24:
                            	    do {
                            	        int alt24=2;
                            	        int LA24_0 = input.LA(1);

                            	        if ( (LA24_0==16) ) {
                            	            int LA24_1 = input.LA(2);

                            	            if ( (LA24_1==RULE_IDENT||LA24_1==38) ) {
                            	                alt24=1;
                            	            }


                            	        }


                            	        switch (alt24) {
                            	    	case 1 :
                            	    	    // InternalLustre.g:1161:10: otherlv_23= ';' ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) )
                            	    	    {
                            	    	    otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_31); if (state.failed) return current;
                            	    	    if ( state.backtracking==0 ) {

                            	    	      										newLeafNode(otherlv_23, grammarAccess.getNodeDeclarationAccess().getSemicolonKeyword_4_0_3_1_1_1_2_0());
                            	    	      									
                            	    	    }
                            	    	    // InternalLustre.g:1165:10: ( (lv_variables_24_0= ruleLustreClockedIdDeclaration ) )
                            	    	    // InternalLustre.g:1166:11: (lv_variables_24_0= ruleLustreClockedIdDeclaration )
                            	    	    {
                            	    	    // InternalLustre.g:1166:11: (lv_variables_24_0= ruleLustreClockedIdDeclaration )
                            	    	    // InternalLustre.g:1167:12: lv_variables_24_0= ruleLustreClockedIdDeclaration
                            	    	    {
                            	    	    if ( state.backtracking==0 ) {

                            	    	      												newCompositeNode(grammarAccess.getNodeDeclarationAccess().getVariablesLustreClockedIdDeclarationParserRuleCall_4_0_3_1_1_1_2_1_0());
                            	    	      											
                            	    	    }
                            	    	    pushFollow(FollowSets000.FOLLOW_8);
                            	    	    lv_variables_24_0=ruleLustreClockedIdDeclaration();

                            	    	    state._fsp--;
                            	    	    if (state.failed) return current;
                            	    	    if ( state.backtracking==0 ) {

                            	    	      												if (current==null) {
                            	    	      													current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
                            	    	      												}
                            	    	      												add(
                            	    	      													current,
                            	    	      													"variables",
                            	    	      													lv_variables_24_0,
                            	    	      													"de.cau.cs.kieler.lustre.Lustre.LustreClockedIdDeclaration");
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

                            	    otherlv_25=(Token)match(input,16,FollowSets000.FOLLOW_30); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									newLeafNode(otherlv_25, grammarAccess.getNodeDeclarationAccess().getSemicolonKeyword_4_0_3_1_1_1_3());
                            	      								
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop25;
                                }
                            } while (true);

                            otherlv_26=(Token)match(input,35,FollowSets000.FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_26, grammarAccess.getNodeDeclarationAccess().getLetKeyword_4_0_3_1_2());
                              						
                            }
                            // InternalLustre.g:1195:7: ( ( (lv_equations_27_0= ruleEquation ) ) | ( (lv_assertions_28_0= ruleAssertion ) ) | ( (lv_automatons_29_0= ruleAutomaton ) ) )*
                            loop26:
                            do {
                                int alt26=4;
                                switch ( input.LA(1) ) {
                                case RULE_IDENT:
                                    {
                                    alt26=1;
                                    }
                                    break;
                                case 50:
                                    {
                                    alt26=2;
                                    }
                                    break;
                                case 51:
                                    {
                                    alt26=3;
                                    }
                                    break;

                                }

                                switch (alt26) {
                            	case 1 :
                            	    // InternalLustre.g:1196:8: ( (lv_equations_27_0= ruleEquation ) )
                            	    {
                            	    // InternalLustre.g:1196:8: ( (lv_equations_27_0= ruleEquation ) )
                            	    // InternalLustre.g:1197:9: (lv_equations_27_0= ruleEquation )
                            	    {
                            	    // InternalLustre.g:1197:9: (lv_equations_27_0= ruleEquation )
                            	    // InternalLustre.g:1198:10: lv_equations_27_0= ruleEquation
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      										newCompositeNode(grammarAccess.getNodeDeclarationAccess().getEquationsEquationParserRuleCall_4_0_3_1_3_0_0());
                            	      									
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_32);
                            	    lv_equations_27_0=ruleEquation();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      										if (current==null) {
                            	      											current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
                            	      										}
                            	      										add(
                            	      											current,
                            	      											"equations",
                            	      											lv_equations_27_0,
                            	      											"de.cau.cs.kieler.lustre.Lustre.Equation");
                            	      										afterParserOrEnumRuleCall();
                            	      									
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 2 :
                            	    // InternalLustre.g:1216:8: ( (lv_assertions_28_0= ruleAssertion ) )
                            	    {
                            	    // InternalLustre.g:1216:8: ( (lv_assertions_28_0= ruleAssertion ) )
                            	    // InternalLustre.g:1217:9: (lv_assertions_28_0= ruleAssertion )
                            	    {
                            	    // InternalLustre.g:1217:9: (lv_assertions_28_0= ruleAssertion )
                            	    // InternalLustre.g:1218:10: lv_assertions_28_0= ruleAssertion
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      										newCompositeNode(grammarAccess.getNodeDeclarationAccess().getAssertionsAssertionParserRuleCall_4_0_3_1_3_1_0());
                            	      									
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_32);
                            	    lv_assertions_28_0=ruleAssertion();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      										if (current==null) {
                            	      											current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
                            	      										}
                            	      										add(
                            	      											current,
                            	      											"assertions",
                            	      											lv_assertions_28_0,
                            	      											"de.cau.cs.kieler.lustre.Lustre.Assertion");
                            	      										afterParserOrEnumRuleCall();
                            	      									
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 3 :
                            	    // InternalLustre.g:1236:8: ( (lv_automatons_29_0= ruleAutomaton ) )
                            	    {
                            	    // InternalLustre.g:1236:8: ( (lv_automatons_29_0= ruleAutomaton ) )
                            	    // InternalLustre.g:1237:9: (lv_automatons_29_0= ruleAutomaton )
                            	    {
                            	    // InternalLustre.g:1237:9: (lv_automatons_29_0= ruleAutomaton )
                            	    // InternalLustre.g:1238:10: lv_automatons_29_0= ruleAutomaton
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      										newCompositeNode(grammarAccess.getNodeDeclarationAccess().getAutomatonsAutomatonParserRuleCall_4_0_3_1_3_2_0());
                            	      									
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_32);
                            	    lv_automatons_29_0=ruleAutomaton();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      										if (current==null) {
                            	      											current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
                            	      										}
                            	      										add(
                            	      											current,
                            	      											"automatons",
                            	      											lv_automatons_29_0,
                            	      											"de.cau.cs.kieler.lustre.Lustre.Automaton");
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

                            otherlv_30=(Token)match(input,36,FollowSets000.FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_30, grammarAccess.getNodeDeclarationAccess().getTelKeyword_4_0_3_1_4());
                              						
                            }
                            // InternalLustre.g:1260:7: (otherlv_31= '.' | (otherlv_32= ';' )? )
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==37) ) {
                                alt28=1;
                            }
                            else if ( (LA28_0==EOF||(LA28_0>=14 && LA28_0<=16)||(LA28_0>=27 && LA28_0<=30)||LA28_0==48) ) {
                                alt28=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 28, 0, input);

                                throw nvae;
                            }
                            switch (alt28) {
                                case 1 :
                                    // InternalLustre.g:1261:8: otherlv_31= '.'
                                    {
                                    otherlv_31=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_31, grammarAccess.getNodeDeclarationAccess().getFullStopKeyword_4_0_3_1_5_0());
                                      							
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalLustre.g:1266:8: (otherlv_32= ';' )?
                                    {
                                    // InternalLustre.g:1266:8: (otherlv_32= ';' )?
                                    int alt27=2;
                                    int LA27_0 = input.LA(1);

                                    if ( (LA27_0==16) ) {
                                        alt27=1;
                                    }
                                    switch (alt27) {
                                        case 1 :
                                            // InternalLustre.g:1267:9: otherlv_32= ';'
                                            {
                                            otherlv_32=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              									newLeafNode(otherlv_32, grammarAccess.getNodeDeclarationAccess().getSemicolonKeyword_4_0_3_1_5_1());
                                              								
                                            }

                                            }
                                            break;

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
                    break;
                case 2 :
                    // InternalLustre.g:1277:4: (otherlv_33= '=' ( (lv_effectiveNode_34_0= ruleIdentRef ) ) (otherlv_35= '<<' ( (lv_staticArgs_36_0= ruleStaticArg ) ) (otherlv_37= ';' ( (lv_staticArgs_38_0= ruleStaticArg ) ) )* otherlv_39= '>>' )? )
                    {
                    // InternalLustre.g:1277:4: (otherlv_33= '=' ( (lv_effectiveNode_34_0= ruleIdentRef ) ) (otherlv_35= '<<' ( (lv_staticArgs_36_0= ruleStaticArg ) ) (otherlv_37= ';' ( (lv_staticArgs_38_0= ruleStaticArg ) ) )* otherlv_39= '>>' )? )
                    // InternalLustre.g:1278:5: otherlv_33= '=' ( (lv_effectiveNode_34_0= ruleIdentRef ) ) (otherlv_35= '<<' ( (lv_staticArgs_36_0= ruleStaticArg ) ) (otherlv_37= ';' ( (lv_staticArgs_38_0= ruleStaticArg ) ) )* otherlv_39= '>>' )?
                    {
                    otherlv_33=(Token)match(input,17,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_33, grammarAccess.getNodeDeclarationAccess().getEqualsSignKeyword_4_1_0());
                      				
                    }
                    // InternalLustre.g:1282:5: ( (lv_effectiveNode_34_0= ruleIdentRef ) )
                    // InternalLustre.g:1283:6: (lv_effectiveNode_34_0= ruleIdentRef )
                    {
                    // InternalLustre.g:1283:6: (lv_effectiveNode_34_0= ruleIdentRef )
                    // InternalLustre.g:1284:7: lv_effectiveNode_34_0= ruleIdentRef
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNodeDeclarationAccess().getEffectiveNodeIdentRefParserRuleCall_4_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    lv_effectiveNode_34_0=ruleIdentRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
                      							}
                      							set(
                      								current,
                      								"effectiveNode",
                      								lv_effectiveNode_34_0,
                      								"de.cau.cs.kieler.lustre.Lustre.IdentRef");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalLustre.g:1301:5: (otherlv_35= '<<' ( (lv_staticArgs_36_0= ruleStaticArg ) ) (otherlv_37= ';' ( (lv_staticArgs_38_0= ruleStaticArg ) ) )* otherlv_39= '>>' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==32) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalLustre.g:1302:6: otherlv_35= '<<' ( (lv_staticArgs_36_0= ruleStaticArg ) ) (otherlv_37= ';' ( (lv_staticArgs_38_0= ruleStaticArg ) ) )* otherlv_39= '>>'
                            {
                            otherlv_35=(Token)match(input,32,FollowSets000.FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_35, grammarAccess.getNodeDeclarationAccess().getLessThanSignLessThanSignKeyword_4_1_2_0());
                              					
                            }
                            // InternalLustre.g:1306:6: ( (lv_staticArgs_36_0= ruleStaticArg ) )
                            // InternalLustre.g:1307:7: (lv_staticArgs_36_0= ruleStaticArg )
                            {
                            // InternalLustre.g:1307:7: (lv_staticArgs_36_0= ruleStaticArg )
                            // InternalLustre.g:1308:8: lv_staticArgs_36_0= ruleStaticArg
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNodeDeclarationAccess().getStaticArgsStaticArgParserRuleCall_4_1_2_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_25);
                            lv_staticArgs_36_0=ruleStaticArg();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
                              								}
                              								add(
                              									current,
                              									"staticArgs",
                              									lv_staticArgs_36_0,
                              									"de.cau.cs.kieler.lustre.Lustre.StaticArg");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalLustre.g:1325:6: (otherlv_37= ';' ( (lv_staticArgs_38_0= ruleStaticArg ) ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==16) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // InternalLustre.g:1326:7: otherlv_37= ';' ( (lv_staticArgs_38_0= ruleStaticArg ) )
                            	    {
                            	    otherlv_37=(Token)match(input,16,FollowSets000.FOLLOW_29); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_37, grammarAccess.getNodeDeclarationAccess().getSemicolonKeyword_4_1_2_2_0());
                            	      						
                            	    }
                            	    // InternalLustre.g:1330:7: ( (lv_staticArgs_38_0= ruleStaticArg ) )
                            	    // InternalLustre.g:1331:8: (lv_staticArgs_38_0= ruleStaticArg )
                            	    {
                            	    // InternalLustre.g:1331:8: (lv_staticArgs_38_0= ruleStaticArg )
                            	    // InternalLustre.g:1332:9: lv_staticArgs_38_0= ruleStaticArg
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getNodeDeclarationAccess().getStaticArgsStaticArgParserRuleCall_4_1_2_2_1_0());
                            	      								
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_25);
                            	    lv_staticArgs_38_0=ruleStaticArg();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"staticArgs",
                            	      										lv_staticArgs_38_0,
                            	      										"de.cau.cs.kieler.lustre.Lustre.StaticArg");
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

                            otherlv_39=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_39, grammarAccess.getNodeDeclarationAccess().getGreaterThanSignGreaterThanSignKeyword_4_1_2_3());
                              					
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
        }
        return current;
    }
    // $ANTLR end "ruleNodeDeclaration"


    // $ANTLR start "entryRuleParams"
    // InternalLustre.g:1361:1: entryRuleParams returns [EObject current=null] : iv_ruleParams= ruleParams EOF ;
    public final EObject entryRuleParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParams = null;


        try {
            // InternalLustre.g:1361:47: (iv_ruleParams= ruleParams EOF )
            // InternalLustre.g:1362:2: iv_ruleParams= ruleParams EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParams=ruleParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParams; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParams"


    // $ANTLR start "ruleParams"
    // InternalLustre.g:1368:1: ruleParams returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_parameter_2_0= ruleLustreClockedIdDeclaration ) ) (otherlv_3= ';' ( (lv_parameter_4_0= ruleLustreClockedIdDeclaration ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameter_2_0 = null;

        EObject lv_parameter_4_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1374:2: ( ( () otherlv_1= '(' ( ( (lv_parameter_2_0= ruleLustreClockedIdDeclaration ) ) (otherlv_3= ';' ( (lv_parameter_4_0= ruleLustreClockedIdDeclaration ) ) )* )? otherlv_5= ')' ) )
            // InternalLustre.g:1375:2: ( () otherlv_1= '(' ( ( (lv_parameter_2_0= ruleLustreClockedIdDeclaration ) ) (otherlv_3= ';' ( (lv_parameter_4_0= ruleLustreClockedIdDeclaration ) ) )* )? otherlv_5= ')' )
            {
            // InternalLustre.g:1375:2: ( () otherlv_1= '(' ( ( (lv_parameter_2_0= ruleLustreClockedIdDeclaration ) ) (otherlv_3= ';' ( (lv_parameter_4_0= ruleLustreClockedIdDeclaration ) ) )* )? otherlv_5= ')' )
            // InternalLustre.g:1376:3: () otherlv_1= '(' ( ( (lv_parameter_2_0= ruleLustreClockedIdDeclaration ) ) (otherlv_3= ';' ( (lv_parameter_4_0= ruleLustreClockedIdDeclaration ) ) )* )? otherlv_5= ')'
            {
            // InternalLustre.g:1376:3: ()
            // InternalLustre.g:1377:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParamsAccess().getParamsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParamsAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalLustre.g:1390:3: ( ( (lv_parameter_2_0= ruleLustreClockedIdDeclaration ) ) (otherlv_3= ';' ( (lv_parameter_4_0= ruleLustreClockedIdDeclaration ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_IDENT||LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalLustre.g:1391:4: ( (lv_parameter_2_0= ruleLustreClockedIdDeclaration ) ) (otherlv_3= ';' ( (lv_parameter_4_0= ruleLustreClockedIdDeclaration ) ) )*
                    {
                    // InternalLustre.g:1391:4: ( (lv_parameter_2_0= ruleLustreClockedIdDeclaration ) )
                    // InternalLustre.g:1392:5: (lv_parameter_2_0= ruleLustreClockedIdDeclaration )
                    {
                    // InternalLustre.g:1392:5: (lv_parameter_2_0= ruleLustreClockedIdDeclaration )
                    // InternalLustre.g:1393:6: lv_parameter_2_0= ruleLustreClockedIdDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParamsAccess().getParameterLustreClockedIdDeclarationParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    lv_parameter_2_0=ruleLustreClockedIdDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParamsRule());
                      						}
                      						add(
                      							current,
                      							"parameter",
                      							lv_parameter_2_0,
                      							"de.cau.cs.kieler.lustre.Lustre.LustreClockedIdDeclaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalLustre.g:1410:4: (otherlv_3= ';' ( (lv_parameter_4_0= ruleLustreClockedIdDeclaration ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==16) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalLustre.g:1411:5: otherlv_3= ';' ( (lv_parameter_4_0= ruleLustreClockedIdDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getParamsAccess().getSemicolonKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalLustre.g:1415:5: ( (lv_parameter_4_0= ruleLustreClockedIdDeclaration ) )
                    	    // InternalLustre.g:1416:6: (lv_parameter_4_0= ruleLustreClockedIdDeclaration )
                    	    {
                    	    // InternalLustre.g:1416:6: (lv_parameter_4_0= ruleLustreClockedIdDeclaration )
                    	    // InternalLustre.g:1417:7: lv_parameter_4_0= ruleLustreClockedIdDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getParamsAccess().getParameterLustreClockedIdDeclarationParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_35);
                    	    lv_parameter_4_0=ruleLustreClockedIdDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getParamsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameter",
                    	      								lv_parameter_4_0,
                    	      								"de.cau.cs.kieler.lustre.Lustre.LustreClockedIdDeclaration");
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
                    break;

            }

            otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getParamsAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

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
    // $ANTLR end "ruleParams"


    // $ANTLR start "entryRuleStaticParam"
    // InternalLustre.g:1444:1: entryRuleStaticParam returns [EObject current=null] : iv_ruleStaticParam= ruleStaticParam EOF ;
    public final EObject entryRuleStaticParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticParam = null;


        try {
            // InternalLustre.g:1444:52: (iv_ruleStaticParam= ruleStaticParam EOF )
            // InternalLustre.g:1445:2: iv_ruleStaticParam= ruleStaticParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticParamRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStaticParam=ruleStaticParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticParam; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticParam"


    // $ANTLR start "ruleStaticParam"
    // InternalLustre.g:1451:1: ruleStaticParam returns [EObject current=null] : ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= 'const' ( (lv_name_3_0= RULE_IDENT ) ) otherlv_4= ':' ( (lv_type_5_0= ruleType ) ) ) | ( (otherlv_6= 'unsafe' )? (otherlv_7= 'node' | otherlv_8= 'function' ) ( (lv_name_9_0= RULE_IDENT ) ) ( (lv_nodeInput_10_0= ruleParams ) ) otherlv_11= 'returns' ( (lv_nodeOutput_12_0= ruleParams ) ) ) ) ;
    public final EObject ruleStaticParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_11=null;
        EObject lv_type_5_0 = null;

        EObject lv_nodeInput_10_0 = null;

        EObject lv_nodeOutput_12_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1457:2: ( ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= 'const' ( (lv_name_3_0= RULE_IDENT ) ) otherlv_4= ':' ( (lv_type_5_0= ruleType ) ) ) | ( (otherlv_6= 'unsafe' )? (otherlv_7= 'node' | otherlv_8= 'function' ) ( (lv_name_9_0= RULE_IDENT ) ) ( (lv_nodeInput_10_0= ruleParams ) ) otherlv_11= 'returns' ( (lv_nodeOutput_12_0= ruleParams ) ) ) ) )
            // InternalLustre.g:1458:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= 'const' ( (lv_name_3_0= RULE_IDENT ) ) otherlv_4= ':' ( (lv_type_5_0= ruleType ) ) ) | ( (otherlv_6= 'unsafe' )? (otherlv_7= 'node' | otherlv_8= 'function' ) ( (lv_name_9_0= RULE_IDENT ) ) ( (lv_nodeInput_10_0= ruleParams ) ) otherlv_11= 'returns' ( (lv_nodeOutput_12_0= ruleParams ) ) ) )
            {
            // InternalLustre.g:1458:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= 'const' ( (lv_name_3_0= RULE_IDENT ) ) otherlv_4= ':' ( (lv_type_5_0= ruleType ) ) ) | ( (otherlv_6= 'unsafe' )? (otherlv_7= 'node' | otherlv_8= 'function' ) ( (lv_name_9_0= RULE_IDENT ) ) ( (lv_nodeInput_10_0= ruleParams ) ) otherlv_11= 'returns' ( (lv_nodeOutput_12_0= ruleParams ) ) ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt37=1;
                }
                break;
            case 15:
                {
                alt37=2;
                }
                break;
            case 27:
            case 29:
            case 30:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalLustre.g:1459:3: (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) )
                    {
                    // InternalLustre.g:1459:3: (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) )
                    // InternalLustre.g:1460:4: otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) )
                    {
                    otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getStaticParamAccess().getTypeKeyword_0_0());
                      			
                    }
                    // InternalLustre.g:1464:4: ( (lv_name_1_0= RULE_IDENT ) )
                    // InternalLustre.g:1465:5: (lv_name_1_0= RULE_IDENT )
                    {
                    // InternalLustre.g:1465:5: (lv_name_1_0= RULE_IDENT )
                    // InternalLustre.g:1466:6: lv_name_1_0= RULE_IDENT
                    {
                    lv_name_1_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_0, grammarAccess.getStaticParamAccess().getNameIDENTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStaticParamRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:1484:3: (otherlv_2= 'const' ( (lv_name_3_0= RULE_IDENT ) ) otherlv_4= ':' ( (lv_type_5_0= ruleType ) ) )
                    {
                    // InternalLustre.g:1484:3: (otherlv_2= 'const' ( (lv_name_3_0= RULE_IDENT ) ) otherlv_4= ':' ( (lv_type_5_0= ruleType ) ) )
                    // InternalLustre.g:1485:4: otherlv_2= 'const' ( (lv_name_3_0= RULE_IDENT ) ) otherlv_4= ':' ( (lv_type_5_0= ruleType ) )
                    {
                    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getStaticParamAccess().getConstKeyword_1_0());
                      			
                    }
                    // InternalLustre.g:1489:4: ( (lv_name_3_0= RULE_IDENT ) )
                    // InternalLustre.g:1490:5: (lv_name_3_0= RULE_IDENT )
                    {
                    // InternalLustre.g:1490:5: (lv_name_3_0= RULE_IDENT )
                    // InternalLustre.g:1491:6: lv_name_3_0= RULE_IDENT
                    {
                    lv_name_3_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_3_0, grammarAccess.getStaticParamAccess().getNameIDENTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStaticParamRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_3_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getStaticParamAccess().getColonKeyword_1_2());
                      			
                    }
                    // InternalLustre.g:1511:4: ( (lv_type_5_0= ruleType ) )
                    // InternalLustre.g:1512:5: (lv_type_5_0= ruleType )
                    {
                    // InternalLustre.g:1512:5: (lv_type_5_0= ruleType )
                    // InternalLustre.g:1513:6: lv_type_5_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStaticParamAccess().getTypeTypeParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_type_5_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStaticParamRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_5_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLustre.g:1532:3: ( (otherlv_6= 'unsafe' )? (otherlv_7= 'node' | otherlv_8= 'function' ) ( (lv_name_9_0= RULE_IDENT ) ) ( (lv_nodeInput_10_0= ruleParams ) ) otherlv_11= 'returns' ( (lv_nodeOutput_12_0= ruleParams ) ) )
                    {
                    // InternalLustre.g:1532:3: ( (otherlv_6= 'unsafe' )? (otherlv_7= 'node' | otherlv_8= 'function' ) ( (lv_name_9_0= RULE_IDENT ) ) ( (lv_nodeInput_10_0= ruleParams ) ) otherlv_11= 'returns' ( (lv_nodeOutput_12_0= ruleParams ) ) )
                    // InternalLustre.g:1533:4: (otherlv_6= 'unsafe' )? (otherlv_7= 'node' | otherlv_8= 'function' ) ( (lv_name_9_0= RULE_IDENT ) ) ( (lv_nodeInput_10_0= ruleParams ) ) otherlv_11= 'returns' ( (lv_nodeOutput_12_0= ruleParams ) )
                    {
                    // InternalLustre.g:1533:4: (otherlv_6= 'unsafe' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==27) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalLustre.g:1534:5: otherlv_6= 'unsafe'
                            {
                            otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getStaticParamAccess().getUnsafeKeyword_2_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalLustre.g:1539:4: (otherlv_7= 'node' | otherlv_8= 'function' )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==30) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==29) ) {
                        alt36=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalLustre.g:1540:5: otherlv_7= 'node'
                            {
                            otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getStaticParamAccess().getNodeKeyword_2_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalLustre.g:1545:5: otherlv_8= 'function'
                            {
                            otherlv_8=(Token)match(input,29,FollowSets000.FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getStaticParamAccess().getFunctionKeyword_2_1_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalLustre.g:1550:4: ( (lv_name_9_0= RULE_IDENT ) )
                    // InternalLustre.g:1551:5: (lv_name_9_0= RULE_IDENT )
                    {
                    // InternalLustre.g:1551:5: (lv_name_9_0= RULE_IDENT )
                    // InternalLustre.g:1552:6: lv_name_9_0= RULE_IDENT
                    {
                    lv_name_9_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_9_0, grammarAccess.getStaticParamAccess().getNameIDENTTerminalRuleCall_2_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStaticParamRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_9_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }

                    // InternalLustre.g:1568:4: ( (lv_nodeInput_10_0= ruleParams ) )
                    // InternalLustre.g:1569:5: (lv_nodeInput_10_0= ruleParams )
                    {
                    // InternalLustre.g:1569:5: (lv_nodeInput_10_0= ruleParams )
                    // InternalLustre.g:1570:6: lv_nodeInput_10_0= ruleParams
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStaticParamAccess().getNodeInputParamsParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    lv_nodeInput_10_0=ruleParams();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStaticParamRule());
                      						}
                      						set(
                      							current,
                      							"nodeInput",
                      							lv_nodeInput_10_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Params");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,31,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getStaticParamAccess().getReturnsKeyword_2_4());
                      			
                    }
                    // InternalLustre.g:1591:4: ( (lv_nodeOutput_12_0= ruleParams ) )
                    // InternalLustre.g:1592:5: (lv_nodeOutput_12_0= ruleParams )
                    {
                    // InternalLustre.g:1592:5: (lv_nodeOutput_12_0= ruleParams )
                    // InternalLustre.g:1593:6: lv_nodeOutput_12_0= ruleParams
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStaticParamAccess().getNodeOutputParamsParserRuleCall_2_5_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_nodeOutput_12_0=ruleParams();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStaticParamRule());
                      						}
                      						set(
                      							current,
                      							"nodeOutput",
                      							lv_nodeOutput_12_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Params");
                      						afterParserOrEnumRuleCall();
                      					
                    }

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
    // $ANTLR end "ruleStaticParam"


    // $ANTLR start "entryRuleStaticArg"
    // InternalLustre.g:1615:1: entryRuleStaticArg returns [EObject current=null] : iv_ruleStaticArg= ruleStaticArg EOF ;
    public final EObject entryRuleStaticArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticArg = null;


        try {
            // InternalLustre.g:1615:50: (iv_ruleStaticArg= ruleStaticArg EOF )
            // InternalLustre.g:1616:2: iv_ruleStaticArg= ruleStaticArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticArgRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStaticArg=ruleStaticArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticArg; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticArg"


    // $ANTLR start "ruleStaticArg"
    // InternalLustre.g:1622:1: ruleStaticArg returns [EObject current=null] : ( (otherlv_0= 'type' ( (lv_type_1_0= ruleType ) ) ) | (otherlv_2= 'const' ( (lv_expr_3_0= ruleLustreExpression ) ) ) | ( (otherlv_4= 'node' | otherlv_5= 'function' ) ( (lv_name_6_0= ruleIdentRef ) ) (otherlv_7= '<<' ( (lv_staticArgs_8_0= ruleStaticArg ) ) ( (otherlv_9= ';' | otherlv_10= ',' ) ( (lv_staticArgs_11_0= ruleStaticArg ) ) )* otherlv_12= '>>' )? ) ) ;
    public final EObject ruleStaticArg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_type_1_0 = null;

        EObject lv_expr_3_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_staticArgs_8_0 = null;

        EObject lv_staticArgs_11_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1628:2: ( ( (otherlv_0= 'type' ( (lv_type_1_0= ruleType ) ) ) | (otherlv_2= 'const' ( (lv_expr_3_0= ruleLustreExpression ) ) ) | ( (otherlv_4= 'node' | otherlv_5= 'function' ) ( (lv_name_6_0= ruleIdentRef ) ) (otherlv_7= '<<' ( (lv_staticArgs_8_0= ruleStaticArg ) ) ( (otherlv_9= ';' | otherlv_10= ',' ) ( (lv_staticArgs_11_0= ruleStaticArg ) ) )* otherlv_12= '>>' )? ) ) )
            // InternalLustre.g:1629:2: ( (otherlv_0= 'type' ( (lv_type_1_0= ruleType ) ) ) | (otherlv_2= 'const' ( (lv_expr_3_0= ruleLustreExpression ) ) ) | ( (otherlv_4= 'node' | otherlv_5= 'function' ) ( (lv_name_6_0= ruleIdentRef ) ) (otherlv_7= '<<' ( (lv_staticArgs_8_0= ruleStaticArg ) ) ( (otherlv_9= ';' | otherlv_10= ',' ) ( (lv_staticArgs_11_0= ruleStaticArg ) ) )* otherlv_12= '>>' )? ) )
            {
            // InternalLustre.g:1629:2: ( (otherlv_0= 'type' ( (lv_type_1_0= ruleType ) ) ) | (otherlv_2= 'const' ( (lv_expr_3_0= ruleLustreExpression ) ) ) | ( (otherlv_4= 'node' | otherlv_5= 'function' ) ( (lv_name_6_0= ruleIdentRef ) ) (otherlv_7= '<<' ( (lv_staticArgs_8_0= ruleStaticArg ) ) ( (otherlv_9= ';' | otherlv_10= ',' ) ( (lv_staticArgs_11_0= ruleStaticArg ) ) )* otherlv_12= '>>' )? ) )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt42=1;
                }
                break;
            case 15:
                {
                alt42=2;
                }
                break;
            case 29:
            case 30:
                {
                alt42=3;
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
                    // InternalLustre.g:1630:3: (otherlv_0= 'type' ( (lv_type_1_0= ruleType ) ) )
                    {
                    // InternalLustre.g:1630:3: (otherlv_0= 'type' ( (lv_type_1_0= ruleType ) ) )
                    // InternalLustre.g:1631:4: otherlv_0= 'type' ( (lv_type_1_0= ruleType ) )
                    {
                    otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getStaticArgAccess().getTypeKeyword_0_0());
                      			
                    }
                    // InternalLustre.g:1635:4: ( (lv_type_1_0= ruleType ) )
                    // InternalLustre.g:1636:5: (lv_type_1_0= ruleType )
                    {
                    // InternalLustre.g:1636:5: (lv_type_1_0= ruleType )
                    // InternalLustre.g:1637:6: lv_type_1_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStaticArgAccess().getTypeTypeParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_type_1_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStaticArgRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_1_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:1656:3: (otherlv_2= 'const' ( (lv_expr_3_0= ruleLustreExpression ) ) )
                    {
                    // InternalLustre.g:1656:3: (otherlv_2= 'const' ( (lv_expr_3_0= ruleLustreExpression ) ) )
                    // InternalLustre.g:1657:4: otherlv_2= 'const' ( (lv_expr_3_0= ruleLustreExpression ) )
                    {
                    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getStaticArgAccess().getConstKeyword_1_0());
                      			
                    }
                    // InternalLustre.g:1661:4: ( (lv_expr_3_0= ruleLustreExpression ) )
                    // InternalLustre.g:1662:5: (lv_expr_3_0= ruleLustreExpression )
                    {
                    // InternalLustre.g:1662:5: (lv_expr_3_0= ruleLustreExpression )
                    // InternalLustre.g:1663:6: lv_expr_3_0= ruleLustreExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStaticArgAccess().getExprLustreExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_expr_3_0=ruleLustreExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStaticArgRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_3_0,
                      							"de.cau.cs.kieler.lustre.Lustre.LustreExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLustre.g:1682:3: ( (otherlv_4= 'node' | otherlv_5= 'function' ) ( (lv_name_6_0= ruleIdentRef ) ) (otherlv_7= '<<' ( (lv_staticArgs_8_0= ruleStaticArg ) ) ( (otherlv_9= ';' | otherlv_10= ',' ) ( (lv_staticArgs_11_0= ruleStaticArg ) ) )* otherlv_12= '>>' )? )
                    {
                    // InternalLustre.g:1682:3: ( (otherlv_4= 'node' | otherlv_5= 'function' ) ( (lv_name_6_0= ruleIdentRef ) ) (otherlv_7= '<<' ( (lv_staticArgs_8_0= ruleStaticArg ) ) ( (otherlv_9= ';' | otherlv_10= ',' ) ( (lv_staticArgs_11_0= ruleStaticArg ) ) )* otherlv_12= '>>' )? )
                    // InternalLustre.g:1683:4: (otherlv_4= 'node' | otherlv_5= 'function' ) ( (lv_name_6_0= ruleIdentRef ) ) (otherlv_7= '<<' ( (lv_staticArgs_8_0= ruleStaticArg ) ) ( (otherlv_9= ';' | otherlv_10= ',' ) ( (lv_staticArgs_11_0= ruleStaticArg ) ) )* otherlv_12= '>>' )?
                    {
                    // InternalLustre.g:1683:4: (otherlv_4= 'node' | otherlv_5= 'function' )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==30) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==29) ) {
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
                            // InternalLustre.g:1684:5: otherlv_4= 'node'
                            {
                            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getStaticArgAccess().getNodeKeyword_2_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalLustre.g:1689:5: otherlv_5= 'function'
                            {
                            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getStaticArgAccess().getFunctionKeyword_2_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalLustre.g:1694:4: ( (lv_name_6_0= ruleIdentRef ) )
                    // InternalLustre.g:1695:5: (lv_name_6_0= ruleIdentRef )
                    {
                    // InternalLustre.g:1695:5: (lv_name_6_0= ruleIdentRef )
                    // InternalLustre.g:1696:6: lv_name_6_0= ruleIdentRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStaticArgAccess().getNameIdentRefParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    lv_name_6_0=ruleIdentRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStaticArgRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_6_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IdentRef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalLustre.g:1713:4: (otherlv_7= '<<' ( (lv_staticArgs_8_0= ruleStaticArg ) ) ( (otherlv_9= ';' | otherlv_10= ',' ) ( (lv_staticArgs_11_0= ruleStaticArg ) ) )* otherlv_12= '>>' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==32) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalLustre.g:1714:5: otherlv_7= '<<' ( (lv_staticArgs_8_0= ruleStaticArg ) ) ( (otherlv_9= ';' | otherlv_10= ',' ) ( (lv_staticArgs_11_0= ruleStaticArg ) ) )* otherlv_12= '>>'
                            {
                            otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getStaticArgAccess().getLessThanSignLessThanSignKeyword_2_2_0());
                              				
                            }
                            // InternalLustre.g:1718:5: ( (lv_staticArgs_8_0= ruleStaticArg ) )
                            // InternalLustre.g:1719:6: (lv_staticArgs_8_0= ruleStaticArg )
                            {
                            // InternalLustre.g:1719:6: (lv_staticArgs_8_0= ruleStaticArg )
                            // InternalLustre.g:1720:7: lv_staticArgs_8_0= ruleStaticArg
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getStaticArgAccess().getStaticArgsStaticArgParserRuleCall_2_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_38);
                            lv_staticArgs_8_0=ruleStaticArg();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getStaticArgRule());
                              							}
                              							add(
                              								current,
                              								"staticArgs",
                              								lv_staticArgs_8_0,
                              								"de.cau.cs.kieler.lustre.Lustre.StaticArg");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalLustre.g:1737:5: ( (otherlv_9= ';' | otherlv_10= ',' ) ( (lv_staticArgs_11_0= ruleStaticArg ) ) )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==16||LA40_0==24) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // InternalLustre.g:1738:6: (otherlv_9= ';' | otherlv_10= ',' ) ( (lv_staticArgs_11_0= ruleStaticArg ) )
                            	    {
                            	    // InternalLustre.g:1738:6: (otherlv_9= ';' | otherlv_10= ',' )
                            	    int alt39=2;
                            	    int LA39_0 = input.LA(1);

                            	    if ( (LA39_0==16) ) {
                            	        alt39=1;
                            	    }
                            	    else if ( (LA39_0==24) ) {
                            	        alt39=2;
                            	    }
                            	    else {
                            	        if (state.backtracking>0) {state.failed=true; return current;}
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 39, 0, input);

                            	        throw nvae;
                            	    }
                            	    switch (alt39) {
                            	        case 1 :
                            	            // InternalLustre.g:1739:7: otherlv_9= ';'
                            	            {
                            	            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_29); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	              							newLeafNode(otherlv_9, grammarAccess.getStaticArgAccess().getSemicolonKeyword_2_2_2_0_0());
                            	              						
                            	            }

                            	            }
                            	            break;
                            	        case 2 :
                            	            // InternalLustre.g:1744:7: otherlv_10= ','
                            	            {
                            	            otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_29); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	              							newLeafNode(otherlv_10, grammarAccess.getStaticArgAccess().getCommaKeyword_2_2_2_0_1());
                            	              						
                            	            }

                            	            }
                            	            break;

                            	    }

                            	    // InternalLustre.g:1749:6: ( (lv_staticArgs_11_0= ruleStaticArg ) )
                            	    // InternalLustre.g:1750:7: (lv_staticArgs_11_0= ruleStaticArg )
                            	    {
                            	    // InternalLustre.g:1750:7: (lv_staticArgs_11_0= ruleStaticArg )
                            	    // InternalLustre.g:1751:8: lv_staticArgs_11_0= ruleStaticArg
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getStaticArgAccess().getStaticArgsStaticArgParserRuleCall_2_2_2_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_38);
                            	    lv_staticArgs_11_0=ruleStaticArg();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getStaticArgRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"staticArgs",
                            	      									lv_staticArgs_11_0,
                            	      									"de.cau.cs.kieler.lustre.Lustre.StaticArg");
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

                            otherlv_12=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_12, grammarAccess.getStaticArgAccess().getGreaterThanSignGreaterThanSignKeyword_2_2_3());
                              				
                            }

                            }
                            break;

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
    // $ANTLR end "ruleStaticArg"


    // $ANTLR start "entryRuleByNameStaticArg"
    // InternalLustre.g:1779:1: entryRuleByNameStaticArg returns [EObject current=null] : iv_ruleByNameStaticArg= ruleByNameStaticArg EOF ;
    public final EObject entryRuleByNameStaticArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleByNameStaticArg = null;


        try {
            // InternalLustre.g:1779:56: (iv_ruleByNameStaticArg= ruleByNameStaticArg EOF )
            // InternalLustre.g:1780:2: iv_ruleByNameStaticArg= ruleByNameStaticArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getByNameStaticArgRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleByNameStaticArg=ruleByNameStaticArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleByNameStaticArg; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleByNameStaticArg"


    // $ANTLR start "ruleByNameStaticArg"
    // InternalLustre.g:1786:1: ruleByNameStaticArg returns [EObject current=null] : ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_type_3_0= ruleType ) ) ) | (otherlv_4= 'const' ( (lv_name_5_0= RULE_IDENT ) ) otherlv_6= '=' ( (lv_expr_7_0= ruleLustreExpression ) ) ) | ( (otherlv_8= 'function' | otherlv_9= 'node' ) ( (lv_name_10_0= RULE_IDENT ) ) otherlv_11= '=' ( (lv_nodeRef_12_0= ruleIdentRef ) ) (otherlv_13= '<<' ( (lv_staticArgs_14_0= ruleStaticArg ) ) ( (otherlv_15= ';' | otherlv_16= ',' ) ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )? ) | ( ( (lv_name_19_0= RULE_IDENT ) ) otherlv_20= '=' ) ) ;
    public final EObject ruleByNameStaticArg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token lv_name_19_0=null;
        Token otherlv_20=null;
        EObject lv_type_3_0 = null;

        EObject lv_expr_7_0 = null;

        AntlrDatatypeRuleToken lv_nodeRef_12_0 = null;

        EObject lv_staticArgs_14_0 = null;

        EObject lv_staticArgs_17_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1792:2: ( ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_type_3_0= ruleType ) ) ) | (otherlv_4= 'const' ( (lv_name_5_0= RULE_IDENT ) ) otherlv_6= '=' ( (lv_expr_7_0= ruleLustreExpression ) ) ) | ( (otherlv_8= 'function' | otherlv_9= 'node' ) ( (lv_name_10_0= RULE_IDENT ) ) otherlv_11= '=' ( (lv_nodeRef_12_0= ruleIdentRef ) ) (otherlv_13= '<<' ( (lv_staticArgs_14_0= ruleStaticArg ) ) ( (otherlv_15= ';' | otherlv_16= ',' ) ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )? ) | ( ( (lv_name_19_0= RULE_IDENT ) ) otherlv_20= '=' ) ) )
            // InternalLustre.g:1793:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_type_3_0= ruleType ) ) ) | (otherlv_4= 'const' ( (lv_name_5_0= RULE_IDENT ) ) otherlv_6= '=' ( (lv_expr_7_0= ruleLustreExpression ) ) ) | ( (otherlv_8= 'function' | otherlv_9= 'node' ) ( (lv_name_10_0= RULE_IDENT ) ) otherlv_11= '=' ( (lv_nodeRef_12_0= ruleIdentRef ) ) (otherlv_13= '<<' ( (lv_staticArgs_14_0= ruleStaticArg ) ) ( (otherlv_15= ';' | otherlv_16= ',' ) ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )? ) | ( ( (lv_name_19_0= RULE_IDENT ) ) otherlv_20= '=' ) )
            {
            // InternalLustre.g:1793:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_type_3_0= ruleType ) ) ) | (otherlv_4= 'const' ( (lv_name_5_0= RULE_IDENT ) ) otherlv_6= '=' ( (lv_expr_7_0= ruleLustreExpression ) ) ) | ( (otherlv_8= 'function' | otherlv_9= 'node' ) ( (lv_name_10_0= RULE_IDENT ) ) otherlv_11= '=' ( (lv_nodeRef_12_0= ruleIdentRef ) ) (otherlv_13= '<<' ( (lv_staticArgs_14_0= ruleStaticArg ) ) ( (otherlv_15= ';' | otherlv_16= ',' ) ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )? ) | ( ( (lv_name_19_0= RULE_IDENT ) ) otherlv_20= '=' ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt47=1;
                }
                break;
            case 15:
                {
                alt47=2;
                }
                break;
            case 29:
            case 30:
                {
                alt47=3;
                }
                break;
            case RULE_IDENT:
                {
                alt47=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalLustre.g:1794:3: (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_type_3_0= ruleType ) ) )
                    {
                    // InternalLustre.g:1794:3: (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_type_3_0= ruleType ) ) )
                    // InternalLustre.g:1795:4: otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_type_3_0= ruleType ) )
                    {
                    otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getByNameStaticArgAccess().getTypeKeyword_0_0());
                      			
                    }
                    // InternalLustre.g:1799:4: ( (lv_name_1_0= RULE_IDENT ) )
                    // InternalLustre.g:1800:5: (lv_name_1_0= RULE_IDENT )
                    {
                    // InternalLustre.g:1800:5: (lv_name_1_0= RULE_IDENT )
                    // InternalLustre.g:1801:6: lv_name_1_0= RULE_IDENT
                    {
                    lv_name_1_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_0, grammarAccess.getByNameStaticArgAccess().getNameIDENTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getByNameStaticArgRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getByNameStaticArgAccess().getEqualsSignKeyword_0_2());
                      			
                    }
                    // InternalLustre.g:1821:4: ( (lv_type_3_0= ruleType ) )
                    // InternalLustre.g:1822:5: (lv_type_3_0= ruleType )
                    {
                    // InternalLustre.g:1822:5: (lv_type_3_0= ruleType )
                    // InternalLustre.g:1823:6: lv_type_3_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getByNameStaticArgAccess().getTypeTypeParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_type_3_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getByNameStaticArgRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_3_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:1842:3: (otherlv_4= 'const' ( (lv_name_5_0= RULE_IDENT ) ) otherlv_6= '=' ( (lv_expr_7_0= ruleLustreExpression ) ) )
                    {
                    // InternalLustre.g:1842:3: (otherlv_4= 'const' ( (lv_name_5_0= RULE_IDENT ) ) otherlv_6= '=' ( (lv_expr_7_0= ruleLustreExpression ) ) )
                    // InternalLustre.g:1843:4: otherlv_4= 'const' ( (lv_name_5_0= RULE_IDENT ) ) otherlv_6= '=' ( (lv_expr_7_0= ruleLustreExpression ) )
                    {
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getByNameStaticArgAccess().getConstKeyword_1_0());
                      			
                    }
                    // InternalLustre.g:1847:4: ( (lv_name_5_0= RULE_IDENT ) )
                    // InternalLustre.g:1848:5: (lv_name_5_0= RULE_IDENT )
                    {
                    // InternalLustre.g:1848:5: (lv_name_5_0= RULE_IDENT )
                    // InternalLustre.g:1849:6: lv_name_5_0= RULE_IDENT
                    {
                    lv_name_5_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_5_0, grammarAccess.getByNameStaticArgAccess().getNameIDENTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getByNameStaticArgRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_5_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getByNameStaticArgAccess().getEqualsSignKeyword_1_2());
                      			
                    }
                    // InternalLustre.g:1869:4: ( (lv_expr_7_0= ruleLustreExpression ) )
                    // InternalLustre.g:1870:5: (lv_expr_7_0= ruleLustreExpression )
                    {
                    // InternalLustre.g:1870:5: (lv_expr_7_0= ruleLustreExpression )
                    // InternalLustre.g:1871:6: lv_expr_7_0= ruleLustreExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getByNameStaticArgAccess().getExprLustreExpressionParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_expr_7_0=ruleLustreExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getByNameStaticArgRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_7_0,
                      							"de.cau.cs.kieler.lustre.Lustre.LustreExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLustre.g:1890:3: ( (otherlv_8= 'function' | otherlv_9= 'node' ) ( (lv_name_10_0= RULE_IDENT ) ) otherlv_11= '=' ( (lv_nodeRef_12_0= ruleIdentRef ) ) (otherlv_13= '<<' ( (lv_staticArgs_14_0= ruleStaticArg ) ) ( (otherlv_15= ';' | otherlv_16= ',' ) ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )? )
                    {
                    // InternalLustre.g:1890:3: ( (otherlv_8= 'function' | otherlv_9= 'node' ) ( (lv_name_10_0= RULE_IDENT ) ) otherlv_11= '=' ( (lv_nodeRef_12_0= ruleIdentRef ) ) (otherlv_13= '<<' ( (lv_staticArgs_14_0= ruleStaticArg ) ) ( (otherlv_15= ';' | otherlv_16= ',' ) ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )? )
                    // InternalLustre.g:1891:4: (otherlv_8= 'function' | otherlv_9= 'node' ) ( (lv_name_10_0= RULE_IDENT ) ) otherlv_11= '=' ( (lv_nodeRef_12_0= ruleIdentRef ) ) (otherlv_13= '<<' ( (lv_staticArgs_14_0= ruleStaticArg ) ) ( (otherlv_15= ';' | otherlv_16= ',' ) ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )?
                    {
                    // InternalLustre.g:1891:4: (otherlv_8= 'function' | otherlv_9= 'node' )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==29) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==30) ) {
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
                            // InternalLustre.g:1892:5: otherlv_8= 'function'
                            {
                            otherlv_8=(Token)match(input,29,FollowSets000.FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getByNameStaticArgAccess().getFunctionKeyword_2_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalLustre.g:1897:5: otherlv_9= 'node'
                            {
                            otherlv_9=(Token)match(input,30,FollowSets000.FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getByNameStaticArgAccess().getNodeKeyword_2_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalLustre.g:1902:4: ( (lv_name_10_0= RULE_IDENT ) )
                    // InternalLustre.g:1903:5: (lv_name_10_0= RULE_IDENT )
                    {
                    // InternalLustre.g:1903:5: (lv_name_10_0= RULE_IDENT )
                    // InternalLustre.g:1904:6: lv_name_10_0= RULE_IDENT
                    {
                    lv_name_10_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_10_0, grammarAccess.getByNameStaticArgAccess().getNameIDENTTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getByNameStaticArgRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_10_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getByNameStaticArgAccess().getEqualsSignKeyword_2_2());
                      			
                    }
                    // InternalLustre.g:1924:4: ( (lv_nodeRef_12_0= ruleIdentRef ) )
                    // InternalLustre.g:1925:5: (lv_nodeRef_12_0= ruleIdentRef )
                    {
                    // InternalLustre.g:1925:5: (lv_nodeRef_12_0= ruleIdentRef )
                    // InternalLustre.g:1926:6: lv_nodeRef_12_0= ruleIdentRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getByNameStaticArgAccess().getNodeRefIdentRefParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    lv_nodeRef_12_0=ruleIdentRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getByNameStaticArgRule());
                      						}
                      						set(
                      							current,
                      							"nodeRef",
                      							lv_nodeRef_12_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IdentRef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalLustre.g:1943:4: (otherlv_13= '<<' ( (lv_staticArgs_14_0= ruleStaticArg ) ) ( (otherlv_15= ';' | otherlv_16= ',' ) ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==32) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalLustre.g:1944:5: otherlv_13= '<<' ( (lv_staticArgs_14_0= ruleStaticArg ) ) ( (otherlv_15= ';' | otherlv_16= ',' ) ( (lv_staticArgs_17_0= ruleStaticArg ) ) )* otherlv_18= '>>'
                            {
                            otherlv_13=(Token)match(input,32,FollowSets000.FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getByNameStaticArgAccess().getLessThanSignLessThanSignKeyword_2_4_0());
                              				
                            }
                            // InternalLustre.g:1948:5: ( (lv_staticArgs_14_0= ruleStaticArg ) )
                            // InternalLustre.g:1949:6: (lv_staticArgs_14_0= ruleStaticArg )
                            {
                            // InternalLustre.g:1949:6: (lv_staticArgs_14_0= ruleStaticArg )
                            // InternalLustre.g:1950:7: lv_staticArgs_14_0= ruleStaticArg
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getByNameStaticArgAccess().getStaticArgsStaticArgParserRuleCall_2_4_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_38);
                            lv_staticArgs_14_0=ruleStaticArg();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getByNameStaticArgRule());
                              							}
                              							add(
                              								current,
                              								"staticArgs",
                              								lv_staticArgs_14_0,
                              								"de.cau.cs.kieler.lustre.Lustre.StaticArg");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalLustre.g:1967:5: ( (otherlv_15= ';' | otherlv_16= ',' ) ( (lv_staticArgs_17_0= ruleStaticArg ) ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==16||LA45_0==24) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // InternalLustre.g:1968:6: (otherlv_15= ';' | otherlv_16= ',' ) ( (lv_staticArgs_17_0= ruleStaticArg ) )
                            	    {
                            	    // InternalLustre.g:1968:6: (otherlv_15= ';' | otherlv_16= ',' )
                            	    int alt44=2;
                            	    int LA44_0 = input.LA(1);

                            	    if ( (LA44_0==16) ) {
                            	        alt44=1;
                            	    }
                            	    else if ( (LA44_0==24) ) {
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
                            	            // InternalLustre.g:1969:7: otherlv_15= ';'
                            	            {
                            	            otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_29); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	              							newLeafNode(otherlv_15, grammarAccess.getByNameStaticArgAccess().getSemicolonKeyword_2_4_2_0_0());
                            	              						
                            	            }

                            	            }
                            	            break;
                            	        case 2 :
                            	            // InternalLustre.g:1974:7: otherlv_16= ','
                            	            {
                            	            otherlv_16=(Token)match(input,24,FollowSets000.FOLLOW_29); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	              							newLeafNode(otherlv_16, grammarAccess.getByNameStaticArgAccess().getCommaKeyword_2_4_2_0_1());
                            	              						
                            	            }

                            	            }
                            	            break;

                            	    }

                            	    // InternalLustre.g:1979:6: ( (lv_staticArgs_17_0= ruleStaticArg ) )
                            	    // InternalLustre.g:1980:7: (lv_staticArgs_17_0= ruleStaticArg )
                            	    {
                            	    // InternalLustre.g:1980:7: (lv_staticArgs_17_0= ruleStaticArg )
                            	    // InternalLustre.g:1981:8: lv_staticArgs_17_0= ruleStaticArg
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getByNameStaticArgAccess().getStaticArgsStaticArgParserRuleCall_2_4_2_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_38);
                            	    lv_staticArgs_17_0=ruleStaticArg();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getByNameStaticArgRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"staticArgs",
                            	      									lv_staticArgs_17_0,
                            	      									"de.cau.cs.kieler.lustre.Lustre.StaticArg");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);

                            otherlv_18=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_18, grammarAccess.getByNameStaticArgAccess().getGreaterThanSignGreaterThanSignKeyword_2_4_3());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLustre.g:2006:3: ( ( (lv_name_19_0= RULE_IDENT ) ) otherlv_20= '=' )
                    {
                    // InternalLustre.g:2006:3: ( ( (lv_name_19_0= RULE_IDENT ) ) otherlv_20= '=' )
                    // InternalLustre.g:2007:4: ( (lv_name_19_0= RULE_IDENT ) ) otherlv_20= '='
                    {
                    // InternalLustre.g:2007:4: ( (lv_name_19_0= RULE_IDENT ) )
                    // InternalLustre.g:2008:5: (lv_name_19_0= RULE_IDENT )
                    {
                    // InternalLustre.g:2008:5: (lv_name_19_0= RULE_IDENT )
                    // InternalLustre.g:2009:6: lv_name_19_0= RULE_IDENT
                    {
                    lv_name_19_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_19_0, grammarAccess.getByNameStaticArgAccess().getNameIDENTTerminalRuleCall_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getByNameStaticArgRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_19_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getByNameStaticArgAccess().getEqualsSignKeyword_3_1());
                      			
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
    // $ANTLR end "ruleByNameStaticArg"


    // $ANTLR start "entryRuleLustreTypedId"
    // InternalLustre.g:2034:1: entryRuleLustreTypedId returns [EObject current=null] : iv_ruleLustreTypedId= ruleLustreTypedId EOF ;
    public final EObject entryRuleLustreTypedId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLustreTypedId = null;


        try {
            // InternalLustre.g:2034:54: (iv_ruleLustreTypedId= ruleLustreTypedId EOF )
            // InternalLustre.g:2035:2: iv_ruleLustreTypedId= ruleLustreTypedId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLustreTypedIdRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLustreTypedId=ruleLustreTypedId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLustreTypedId; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLustreTypedId"


    // $ANTLR start "ruleLustreTypedId"
    // InternalLustre.g:2041:1: ruleLustreTypedId returns [EObject current=null] : ( ( (lv_variableNames_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_variableNames_2_0= RULE_IDENT ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) ;
    public final EObject ruleLustreTypedId() throws RecognitionException {
        EObject current = null;

        Token lv_variableNames_0_0=null;
        Token otherlv_1=null;
        Token lv_variableNames_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2047:2: ( ( ( (lv_variableNames_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_variableNames_2_0= RULE_IDENT ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) )
            // InternalLustre.g:2048:2: ( ( (lv_variableNames_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_variableNames_2_0= RULE_IDENT ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            {
            // InternalLustre.g:2048:2: ( ( (lv_variableNames_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_variableNames_2_0= RULE_IDENT ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            // InternalLustre.g:2049:3: ( (lv_variableNames_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_variableNames_2_0= RULE_IDENT ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) )
            {
            // InternalLustre.g:2049:3: ( (lv_variableNames_0_0= RULE_IDENT ) )
            // InternalLustre.g:2050:4: (lv_variableNames_0_0= RULE_IDENT )
            {
            // InternalLustre.g:2050:4: (lv_variableNames_0_0= RULE_IDENT )
            // InternalLustre.g:2051:5: lv_variableNames_0_0= RULE_IDENT
            {
            lv_variableNames_0_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_variableNames_0_0, grammarAccess.getLustreTypedIdAccess().getVariableNamesIDENTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLustreTypedIdRule());
              					}
              					addWithLastConsumed(
              						current,
              						"variableNames",
              						lv_variableNames_0_0,
              						"de.cau.cs.kieler.lustre.Lustre.IDENT");
              				
            }

            }


            }

            // InternalLustre.g:2067:3: (otherlv_1= ',' ( (lv_variableNames_2_0= RULE_IDENT ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==24) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalLustre.g:2068:4: otherlv_1= ',' ( (lv_variableNames_2_0= RULE_IDENT ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getLustreTypedIdAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalLustre.g:2072:4: ( (lv_variableNames_2_0= RULE_IDENT ) )
            	    // InternalLustre.g:2073:5: (lv_variableNames_2_0= RULE_IDENT )
            	    {
            	    // InternalLustre.g:2073:5: (lv_variableNames_2_0= RULE_IDENT )
            	    // InternalLustre.g:2074:6: lv_variableNames_2_0= RULE_IDENT
            	    {
            	    lv_variableNames_2_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_variableNames_2_0, grammarAccess.getLustreTypedIdAccess().getVariableNamesIDENTTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getLustreTypedIdRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"variableNames",
            	      							lv_variableNames_2_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLustreTypedIdAccess().getColonKeyword_2());
              		
            }
            // InternalLustre.g:2095:3: ( (lv_type_4_0= ruleType ) )
            // InternalLustre.g:2096:4: (lv_type_4_0= ruleType )
            {
            // InternalLustre.g:2096:4: (lv_type_4_0= ruleType )
            // InternalLustre.g:2097:5: lv_type_4_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLustreTypedIdAccess().getTypeTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_type_4_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLustreTypedIdRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_4_0,
              						"de.cau.cs.kieler.lustre.Lustre.Type");
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
    // $ANTLR end "ruleLustreTypedId"


    // $ANTLR start "entryRuleLustreTypedValuedIds"
    // InternalLustre.g:2118:1: entryRuleLustreTypedValuedIds returns [EObject current=null] : iv_ruleLustreTypedValuedIds= ruleLustreTypedValuedIds EOF ;
    public final EObject entryRuleLustreTypedValuedIds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLustreTypedValuedIds = null;


        try {
            // InternalLustre.g:2118:61: (iv_ruleLustreTypedValuedIds= ruleLustreTypedValuedIds EOF )
            // InternalLustre.g:2119:2: iv_ruleLustreTypedValuedIds= ruleLustreTypedValuedIds EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLustreTypedValuedIdsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLustreTypedValuedIds=ruleLustreTypedValuedIds();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLustreTypedValuedIds; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLustreTypedValuedIds"


    // $ANTLR start "ruleLustreTypedValuedIds"
    // InternalLustre.g:2125:1: ruleLustreTypedValuedIds returns [EObject current=null] : ( ( (lv_variableNames_0_0= RULE_IDENT ) ) ( ( (otherlv_1= ',' ( (lv_variableNames_2_0= RULE_IDENT ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleLustreExpression ) ) )? ) | (otherlv_7= '=' ( (lv_value_8_0= ruleLustreExpression ) ) ) ) ) ;
    public final EObject ruleLustreTypedValuedIds() throws RecognitionException {
        EObject current = null;

        Token lv_variableNames_0_0=null;
        Token otherlv_1=null;
        Token lv_variableNames_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_type_4_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_value_8_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2131:2: ( ( ( (lv_variableNames_0_0= RULE_IDENT ) ) ( ( (otherlv_1= ',' ( (lv_variableNames_2_0= RULE_IDENT ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleLustreExpression ) ) )? ) | (otherlv_7= '=' ( (lv_value_8_0= ruleLustreExpression ) ) ) ) ) )
            // InternalLustre.g:2132:2: ( ( (lv_variableNames_0_0= RULE_IDENT ) ) ( ( (otherlv_1= ',' ( (lv_variableNames_2_0= RULE_IDENT ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleLustreExpression ) ) )? ) | (otherlv_7= '=' ( (lv_value_8_0= ruleLustreExpression ) ) ) ) )
            {
            // InternalLustre.g:2132:2: ( ( (lv_variableNames_0_0= RULE_IDENT ) ) ( ( (otherlv_1= ',' ( (lv_variableNames_2_0= RULE_IDENT ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleLustreExpression ) ) )? ) | (otherlv_7= '=' ( (lv_value_8_0= ruleLustreExpression ) ) ) ) )
            // InternalLustre.g:2133:3: ( (lv_variableNames_0_0= RULE_IDENT ) ) ( ( (otherlv_1= ',' ( (lv_variableNames_2_0= RULE_IDENT ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleLustreExpression ) ) )? ) | (otherlv_7= '=' ( (lv_value_8_0= ruleLustreExpression ) ) ) )
            {
            // InternalLustre.g:2133:3: ( (lv_variableNames_0_0= RULE_IDENT ) )
            // InternalLustre.g:2134:4: (lv_variableNames_0_0= RULE_IDENT )
            {
            // InternalLustre.g:2134:4: (lv_variableNames_0_0= RULE_IDENT )
            // InternalLustre.g:2135:5: lv_variableNames_0_0= RULE_IDENT
            {
            lv_variableNames_0_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_variableNames_0_0, grammarAccess.getLustreTypedValuedIdsAccess().getVariableNamesIDENTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLustreTypedValuedIdsRule());
              					}
              					addWithLastConsumed(
              						current,
              						"variableNames",
              						lv_variableNames_0_0,
              						"de.cau.cs.kieler.lustre.Lustre.IDENT");
              				
            }

            }


            }

            // InternalLustre.g:2151:3: ( ( (otherlv_1= ',' ( (lv_variableNames_2_0= RULE_IDENT ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleLustreExpression ) ) )? ) | (otherlv_7= '=' ( (lv_value_8_0= ruleLustreExpression ) ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==24||LA52_0==40) ) {
                alt52=1;
            }
            else if ( (LA52_0==17) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalLustre.g:2152:4: ( (otherlv_1= ',' ( (lv_variableNames_2_0= RULE_IDENT ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleLustreExpression ) ) )? )
                    {
                    // InternalLustre.g:2152:4: ( (otherlv_1= ',' ( (lv_variableNames_2_0= RULE_IDENT ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleLustreExpression ) ) )? )
                    // InternalLustre.g:2153:5: (otherlv_1= ',' ( (lv_variableNames_2_0= RULE_IDENT ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleLustreExpression ) ) )?
                    {
                    // InternalLustre.g:2153:5: (otherlv_1= ',' ( (lv_variableNames_2_0= RULE_IDENT ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==24) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalLustre.g:2154:6: otherlv_1= ',' ( (lv_variableNames_2_0= RULE_IDENT ) )
                    	    {
                    	    otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_1, grammarAccess.getLustreTypedValuedIdsAccess().getCommaKeyword_1_0_0_0());
                    	      					
                    	    }
                    	    // InternalLustre.g:2158:6: ( (lv_variableNames_2_0= RULE_IDENT ) )
                    	    // InternalLustre.g:2159:7: (lv_variableNames_2_0= RULE_IDENT )
                    	    {
                    	    // InternalLustre.g:2159:7: (lv_variableNames_2_0= RULE_IDENT )
                    	    // InternalLustre.g:2160:8: lv_variableNames_2_0= RULE_IDENT
                    	    {
                    	    lv_variableNames_2_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_40); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								newLeafNode(lv_variableNames_2_0, grammarAccess.getLustreTypedValuedIdsAccess().getVariableNamesIDENTTerminalRuleCall_1_0_0_1_0());
                    	      							
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElement(grammarAccess.getLustreTypedValuedIdsRule());
                    	      								}
                    	      								addWithLastConsumed(
                    	      									current,
                    	      									"variableNames",
                    	      									lv_variableNames_2_0,
                    	      									"de.cau.cs.kieler.lustre.Lustre.IDENT");
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getLustreTypedValuedIdsAccess().getColonKeyword_1_0_1());
                      				
                    }
                    // InternalLustre.g:2181:5: ( (lv_type_4_0= ruleType ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_IDENT||(LA50_0>=18 && LA50_0<=20)) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalLustre.g:2182:6: (lv_type_4_0= ruleType )
                            {
                            // InternalLustre.g:2182:6: (lv_type_4_0= ruleType )
                            // InternalLustre.g:2183:7: lv_type_4_0= ruleType
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getLustreTypedValuedIdsAccess().getTypeTypeParserRuleCall_1_0_2_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_43);
                            lv_type_4_0=ruleType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getLustreTypedValuedIdsRule());
                              							}
                              							set(
                              								current,
                              								"type",
                              								lv_type_4_0,
                              								"de.cau.cs.kieler.lustre.Lustre.Type");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalLustre.g:2200:5: (otherlv_5= '=' ( (lv_value_6_0= ruleLustreExpression ) ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==17) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalLustre.g:2201:6: otherlv_5= '=' ( (lv_value_6_0= ruleLustreExpression ) )
                            {
                            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getLustreTypedValuedIdsAccess().getEqualsSignKeyword_1_0_3_0());
                              					
                            }
                            // InternalLustre.g:2205:6: ( (lv_value_6_0= ruleLustreExpression ) )
                            // InternalLustre.g:2206:7: (lv_value_6_0= ruleLustreExpression )
                            {
                            // InternalLustre.g:2206:7: (lv_value_6_0= ruleLustreExpression )
                            // InternalLustre.g:2207:8: lv_value_6_0= ruleLustreExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getLustreTypedValuedIdsAccess().getValueLustreExpressionParserRuleCall_1_0_3_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_value_6_0=ruleLustreExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getLustreTypedValuedIdsRule());
                              								}
                              								set(
                              									current,
                              									"value",
                              									lv_value_6_0,
                              									"de.cau.cs.kieler.lustre.Lustre.LustreExpression");
                              								afterParserOrEnumRuleCall();
                              							
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
                    // InternalLustre.g:2227:4: (otherlv_7= '=' ( (lv_value_8_0= ruleLustreExpression ) ) )
                    {
                    // InternalLustre.g:2227:4: (otherlv_7= '=' ( (lv_value_8_0= ruleLustreExpression ) ) )
                    // InternalLustre.g:2228:5: otherlv_7= '=' ( (lv_value_8_0= ruleLustreExpression ) )
                    {
                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getLustreTypedValuedIdsAccess().getEqualsSignKeyword_1_1_0());
                      				
                    }
                    // InternalLustre.g:2232:5: ( (lv_value_8_0= ruleLustreExpression ) )
                    // InternalLustre.g:2233:6: (lv_value_8_0= ruleLustreExpression )
                    {
                    // InternalLustre.g:2233:6: (lv_value_8_0= ruleLustreExpression )
                    // InternalLustre.g:2234:7: lv_value_8_0= ruleLustreExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLustreTypedValuedIdsAccess().getValueLustreExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_8_0=ruleLustreExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getLustreTypedValuedIdsRule());
                      							}
                      							set(
                      								current,
                      								"value",
                      								lv_value_8_0,
                      								"de.cau.cs.kieler.lustre.Lustre.LustreExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

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
    // $ANTLR end "ruleLustreTypedValuedIds"


    // $ANTLR start "entryRuleLustreClockedIdDeclaration"
    // InternalLustre.g:2257:1: entryRuleLustreClockedIdDeclaration returns [EObject current=null] : iv_ruleLustreClockedIdDeclaration= ruleLustreClockedIdDeclaration EOF ;
    public final EObject entryRuleLustreClockedIdDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLustreClockedIdDeclaration = null;


        try {
            // InternalLustre.g:2257:67: (iv_ruleLustreClockedIdDeclaration= ruleLustreClockedIdDeclaration EOF )
            // InternalLustre.g:2258:2: iv_ruleLustreClockedIdDeclaration= ruleLustreClockedIdDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLustreClockedIdDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLustreClockedIdDeclaration=ruleLustreClockedIdDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLustreClockedIdDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLustreClockedIdDeclaration"


    // $ANTLR start "ruleLustreClockedIdDeclaration"
    // InternalLustre.g:2264:1: ruleLustreClockedIdDeclaration returns [EObject current=null] : ( ( ( (lv_typedIds_0_0= ruleLustreTypedId ) ) (otherlv_1= 'when' ( (lv_clockExpr_2_0= ruleClockExpression ) ) )? ) | (otherlv_3= '(' ( (lv_typedIds_4_0= ruleLustreTypedId ) ) (otherlv_5= ';' ( (lv_typedIds_6_0= ruleLustreTypedId ) ) )* otherlv_7= ')' otherlv_8= 'when' ( (lv_clockExpr_9_0= ruleClockExpression ) ) ) ) ;
    public final EObject ruleLustreClockedIdDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_typedIds_0_0 = null;

        AntlrDatatypeRuleToken lv_clockExpr_2_0 = null;

        EObject lv_typedIds_4_0 = null;

        EObject lv_typedIds_6_0 = null;

        AntlrDatatypeRuleToken lv_clockExpr_9_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2270:2: ( ( ( ( (lv_typedIds_0_0= ruleLustreTypedId ) ) (otherlv_1= 'when' ( (lv_clockExpr_2_0= ruleClockExpression ) ) )? ) | (otherlv_3= '(' ( (lv_typedIds_4_0= ruleLustreTypedId ) ) (otherlv_5= ';' ( (lv_typedIds_6_0= ruleLustreTypedId ) ) )* otherlv_7= ')' otherlv_8= 'when' ( (lv_clockExpr_9_0= ruleClockExpression ) ) ) ) )
            // InternalLustre.g:2271:2: ( ( ( (lv_typedIds_0_0= ruleLustreTypedId ) ) (otherlv_1= 'when' ( (lv_clockExpr_2_0= ruleClockExpression ) ) )? ) | (otherlv_3= '(' ( (lv_typedIds_4_0= ruleLustreTypedId ) ) (otherlv_5= ';' ( (lv_typedIds_6_0= ruleLustreTypedId ) ) )* otherlv_7= ')' otherlv_8= 'when' ( (lv_clockExpr_9_0= ruleClockExpression ) ) ) )
            {
            // InternalLustre.g:2271:2: ( ( ( (lv_typedIds_0_0= ruleLustreTypedId ) ) (otherlv_1= 'when' ( (lv_clockExpr_2_0= ruleClockExpression ) ) )? ) | (otherlv_3= '(' ( (lv_typedIds_4_0= ruleLustreTypedId ) ) (otherlv_5= ';' ( (lv_typedIds_6_0= ruleLustreTypedId ) ) )* otherlv_7= ')' otherlv_8= 'when' ( (lv_clockExpr_9_0= ruleClockExpression ) ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_IDENT) ) {
                alt55=1;
            }
            else if ( (LA55_0==38) ) {
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
                    // InternalLustre.g:2272:3: ( ( (lv_typedIds_0_0= ruleLustreTypedId ) ) (otherlv_1= 'when' ( (lv_clockExpr_2_0= ruleClockExpression ) ) )? )
                    {
                    // InternalLustre.g:2272:3: ( ( (lv_typedIds_0_0= ruleLustreTypedId ) ) (otherlv_1= 'when' ( (lv_clockExpr_2_0= ruleClockExpression ) ) )? )
                    // InternalLustre.g:2273:4: ( (lv_typedIds_0_0= ruleLustreTypedId ) ) (otherlv_1= 'when' ( (lv_clockExpr_2_0= ruleClockExpression ) ) )?
                    {
                    // InternalLustre.g:2273:4: ( (lv_typedIds_0_0= ruleLustreTypedId ) )
                    // InternalLustre.g:2274:5: (lv_typedIds_0_0= ruleLustreTypedId )
                    {
                    // InternalLustre.g:2274:5: (lv_typedIds_0_0= ruleLustreTypedId )
                    // InternalLustre.g:2275:6: lv_typedIds_0_0= ruleLustreTypedId
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLustreClockedIdDeclarationAccess().getTypedIdsLustreTypedIdParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_44);
                    lv_typedIds_0_0=ruleLustreTypedId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLustreClockedIdDeclarationRule());
                      						}
                      						add(
                      							current,
                      							"typedIds",
                      							lv_typedIds_0_0,
                      							"de.cau.cs.kieler.lustre.Lustre.LustreTypedId");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalLustre.g:2292:4: (otherlv_1= 'when' ( (lv_clockExpr_2_0= ruleClockExpression ) ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==41) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalLustre.g:2293:5: otherlv_1= 'when' ( (lv_clockExpr_2_0= ruleClockExpression ) )
                            {
                            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_45); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getLustreClockedIdDeclarationAccess().getWhenKeyword_0_1_0());
                              				
                            }
                            // InternalLustre.g:2297:5: ( (lv_clockExpr_2_0= ruleClockExpression ) )
                            // InternalLustre.g:2298:6: (lv_clockExpr_2_0= ruleClockExpression )
                            {
                            // InternalLustre.g:2298:6: (lv_clockExpr_2_0= ruleClockExpression )
                            // InternalLustre.g:2299:7: lv_clockExpr_2_0= ruleClockExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getLustreClockedIdDeclarationAccess().getClockExprClockExpressionParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_clockExpr_2_0=ruleClockExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getLustreClockedIdDeclarationRule());
                              							}
                              							set(
                              								current,
                              								"clockExpr",
                              								lv_clockExpr_2_0,
                              								"de.cau.cs.kieler.lustre.Lustre.ClockExpression");
                              							afterParserOrEnumRuleCall();
                              						
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
                    // InternalLustre.g:2319:3: (otherlv_3= '(' ( (lv_typedIds_4_0= ruleLustreTypedId ) ) (otherlv_5= ';' ( (lv_typedIds_6_0= ruleLustreTypedId ) ) )* otherlv_7= ')' otherlv_8= 'when' ( (lv_clockExpr_9_0= ruleClockExpression ) ) )
                    {
                    // InternalLustre.g:2319:3: (otherlv_3= '(' ( (lv_typedIds_4_0= ruleLustreTypedId ) ) (otherlv_5= ';' ( (lv_typedIds_6_0= ruleLustreTypedId ) ) )* otherlv_7= ')' otherlv_8= 'when' ( (lv_clockExpr_9_0= ruleClockExpression ) ) )
                    // InternalLustre.g:2320:4: otherlv_3= '(' ( (lv_typedIds_4_0= ruleLustreTypedId ) ) (otherlv_5= ';' ( (lv_typedIds_6_0= ruleLustreTypedId ) ) )* otherlv_7= ')' otherlv_8= 'when' ( (lv_clockExpr_9_0= ruleClockExpression ) )
                    {
                    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLustreClockedIdDeclarationAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalLustre.g:2324:4: ( (lv_typedIds_4_0= ruleLustreTypedId ) )
                    // InternalLustre.g:2325:5: (lv_typedIds_4_0= ruleLustreTypedId )
                    {
                    // InternalLustre.g:2325:5: (lv_typedIds_4_0= ruleLustreTypedId )
                    // InternalLustre.g:2326:6: lv_typedIds_4_0= ruleLustreTypedId
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLustreClockedIdDeclarationAccess().getTypedIdsLustreTypedIdParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    lv_typedIds_4_0=ruleLustreTypedId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLustreClockedIdDeclarationRule());
                      						}
                      						add(
                      							current,
                      							"typedIds",
                      							lv_typedIds_4_0,
                      							"de.cau.cs.kieler.lustre.Lustre.LustreTypedId");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalLustre.g:2343:4: (otherlv_5= ';' ( (lv_typedIds_6_0= ruleLustreTypedId ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==16) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalLustre.g:2344:5: otherlv_5= ';' ( (lv_typedIds_6_0= ruleLustreTypedId ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getLustreClockedIdDeclarationAccess().getSemicolonKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalLustre.g:2348:5: ( (lv_typedIds_6_0= ruleLustreTypedId ) )
                    	    // InternalLustre.g:2349:6: (lv_typedIds_6_0= ruleLustreTypedId )
                    	    {
                    	    // InternalLustre.g:2349:6: (lv_typedIds_6_0= ruleLustreTypedId )
                    	    // InternalLustre.g:2350:7: lv_typedIds_6_0= ruleLustreTypedId
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLustreClockedIdDeclarationAccess().getTypedIdsLustreTypedIdParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_35);
                    	    lv_typedIds_6_0=ruleLustreTypedId();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getLustreClockedIdDeclarationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"typedIds",
                    	      								lv_typedIds_6_0,
                    	      								"de.cau.cs.kieler.lustre.Lustre.LustreTypedId");
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

                    otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getLustreClockedIdDeclarationAccess().getRightParenthesisKeyword_1_3());
                      			
                    }
                    otherlv_8=(Token)match(input,41,FollowSets000.FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getLustreClockedIdDeclarationAccess().getWhenKeyword_1_4());
                      			
                    }
                    // InternalLustre.g:2376:4: ( (lv_clockExpr_9_0= ruleClockExpression ) )
                    // InternalLustre.g:2377:5: (lv_clockExpr_9_0= ruleClockExpression )
                    {
                    // InternalLustre.g:2377:5: (lv_clockExpr_9_0= ruleClockExpression )
                    // InternalLustre.g:2378:6: lv_clockExpr_9_0= ruleClockExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLustreClockedIdDeclarationAccess().getClockExprClockExpressionParserRuleCall_1_5_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_clockExpr_9_0=ruleClockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLustreClockedIdDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"clockExpr",
                      							lv_clockExpr_9_0,
                      							"de.cau.cs.kieler.lustre.Lustre.ClockExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

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
    // $ANTLR end "ruleLustreClockedIdDeclaration"


    // $ANTLR start "entryRuleLustreExpression"
    // InternalLustre.g:2400:1: entryRuleLustreExpression returns [EObject current=null] : iv_ruleLustreExpression= ruleLustreExpression EOF ;
    public final EObject entryRuleLustreExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLustreExpression = null;


        try {
            // InternalLustre.g:2400:57: (iv_ruleLustreExpression= ruleLustreExpression EOF )
            // InternalLustre.g:2401:2: iv_ruleLustreExpression= ruleLustreExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLustreExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLustreExpression=ruleLustreExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLustreExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLustreExpression"


    // $ANTLR start "ruleLustreExpression"
    // InternalLustre.g:2407:1: ruleLustreExpression returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleLustreExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2413:2: (this_Expression_0= ruleExpression )
            // InternalLustre.g:2414:2: this_Expression_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getLustreExpressionAccess().getExpressionParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // $ANTLR end "ruleLustreExpression"


    // $ANTLR start "entryRuleClockExpression"
    // InternalLustre.g:2428:1: entryRuleClockExpression returns [String current=null] : iv_ruleClockExpression= ruleClockExpression EOF ;
    public final String entryRuleClockExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClockExpression = null;


        try {
            // InternalLustre.g:2428:55: (iv_ruleClockExpression= ruleClockExpression EOF )
            // InternalLustre.g:2429:2: iv_ruleClockExpression= ruleClockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClockExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleClockExpression=ruleClockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClockExpression.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClockExpression"


    // $ANTLR start "ruleClockExpression"
    // InternalLustre.g:2435:1: ruleClockExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IdentRef_0= ruleIdentRef kw= '(' this_IDENT_2= RULE_IDENT kw= ')' ) | this_IDENT_4= RULE_IDENT | (kw= 'not' this_IDENT_6= RULE_IDENT ) | (kw= '(' kw= 'not' kw= ')' this_IDENT_10= RULE_IDENT ) ) ;
    public final AntlrDatatypeRuleToken ruleClockExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_2=null;
        Token this_IDENT_4=null;
        Token this_IDENT_6=null;
        Token this_IDENT_10=null;
        AntlrDatatypeRuleToken this_IdentRef_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2441:2: ( ( (this_IdentRef_0= ruleIdentRef kw= '(' this_IDENT_2= RULE_IDENT kw= ')' ) | this_IDENT_4= RULE_IDENT | (kw= 'not' this_IDENT_6= RULE_IDENT ) | (kw= '(' kw= 'not' kw= ')' this_IDENT_10= RULE_IDENT ) ) )
            // InternalLustre.g:2442:2: ( (this_IdentRef_0= ruleIdentRef kw= '(' this_IDENT_2= RULE_IDENT kw= ')' ) | this_IDENT_4= RULE_IDENT | (kw= 'not' this_IDENT_6= RULE_IDENT ) | (kw= '(' kw= 'not' kw= ')' this_IDENT_10= RULE_IDENT ) )
            {
            // InternalLustre.g:2442:2: ( (this_IdentRef_0= ruleIdentRef kw= '(' this_IDENT_2= RULE_IDENT kw= ')' ) | this_IDENT_4= RULE_IDENT | (kw= 'not' this_IDENT_6= RULE_IDENT ) | (kw= '(' kw= 'not' kw= ')' this_IDENT_10= RULE_IDENT ) )
            int alt56=4;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==38||LA56_1==78) ) {
                    alt56=1;
                }
                else if ( (LA56_1==EOF||LA56_1==16||LA56_1==39) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                alt56=3;
                }
                break;
            case 38:
                {
                alt56=4;
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
                    // InternalLustre.g:2443:3: (this_IdentRef_0= ruleIdentRef kw= '(' this_IDENT_2= RULE_IDENT kw= ')' )
                    {
                    // InternalLustre.g:2443:3: (this_IdentRef_0= ruleIdentRef kw= '(' this_IDENT_2= RULE_IDENT kw= ')' )
                    // InternalLustre.g:2444:4: this_IdentRef_0= ruleIdentRef kw= '(' this_IDENT_2= RULE_IDENT kw= ')'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getClockExpressionAccess().getIdentRefParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_20);
                    this_IdentRef_0=ruleIdentRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IdentRef_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getClockExpressionAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENT_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IDENT_2, grammarAccess.getClockExpressionAccess().getIDENTTerminalRuleCall_0_2());
                      			
                    }
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getClockExpressionAccess().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:2473:3: this_IDENT_4= RULE_IDENT
                    {
                    this_IDENT_4=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IDENT_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_IDENT_4, grammarAccess.getClockExpressionAccess().getIDENTTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalLustre.g:2481:3: (kw= 'not' this_IDENT_6= RULE_IDENT )
                    {
                    // InternalLustre.g:2481:3: (kw= 'not' this_IDENT_6= RULE_IDENT )
                    // InternalLustre.g:2482:4: kw= 'not' this_IDENT_6= RULE_IDENT
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getClockExpressionAccess().getNotKeyword_2_0());
                      			
                    }
                    this_IDENT_6=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENT_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IDENT_6, grammarAccess.getClockExpressionAccess().getIDENTTerminalRuleCall_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalLustre.g:2496:3: (kw= '(' kw= 'not' kw= ')' this_IDENT_10= RULE_IDENT )
                    {
                    // InternalLustre.g:2496:3: (kw= '(' kw= 'not' kw= ')' this_IDENT_10= RULE_IDENT )
                    // InternalLustre.g:2497:4: kw= '(' kw= 'not' kw= ')' this_IDENT_10= RULE_IDENT
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getClockExpressionAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getClockExpressionAccess().getNotKeyword_3_1());
                      			
                    }
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getClockExpressionAccess().getRightParenthesisKeyword_3_2());
                      			
                    }
                    this_IDENT_10=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENT_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IDENT_10, grammarAccess.getClockExpressionAccess().getIDENTTerminalRuleCall_3_3());
                      			
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
    // $ANTLR end "ruleClockExpression"


    // $ANTLR start "entryRulePackList"
    // InternalLustre.g:2524:1: entryRulePackList returns [EObject current=null] : iv_rulePackList= rulePackList EOF ;
    public final EObject entryRulePackList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackList = null;


        try {
            // InternalLustre.g:2524:49: (iv_rulePackList= rulePackList EOF )
            // InternalLustre.g:2525:2: iv_rulePackList= rulePackList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePackList=rulePackList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackList"


    // $ANTLR start "rulePackList"
    // InternalLustre.g:2531:1: rulePackList returns [EObject current=null] : ( ( (lv_modelDeclarations_0_0= ruleModelDeclaration ) ) | ( (lv_packageDeclarations_1_0= rulePackageDeclaration ) ) | ( (lv_packageEquations_2_0= rulePackageEquation ) ) )+ ;
    public final EObject rulePackList() throws RecognitionException {
        EObject current = null;

        EObject lv_modelDeclarations_0_0 = null;

        EObject lv_packageDeclarations_1_0 = null;

        EObject lv_packageEquations_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2537:2: ( ( ( (lv_modelDeclarations_0_0= ruleModelDeclaration ) ) | ( (lv_packageDeclarations_1_0= rulePackageDeclaration ) ) | ( (lv_packageEquations_2_0= rulePackageEquation ) ) )+ )
            // InternalLustre.g:2538:2: ( ( (lv_modelDeclarations_0_0= ruleModelDeclaration ) ) | ( (lv_packageDeclarations_1_0= rulePackageDeclaration ) ) | ( (lv_packageEquations_2_0= rulePackageEquation ) ) )+
            {
            // InternalLustre.g:2538:2: ( ( (lv_modelDeclarations_0_0= ruleModelDeclaration ) ) | ( (lv_packageDeclarations_1_0= rulePackageDeclaration ) ) | ( (lv_packageEquations_2_0= rulePackageEquation ) ) )+
            int cnt57=0;
            loop57:
            do {
                int alt57=4;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==43) ) {
                    alt57=1;
                }
                else if ( (LA57_0==49) ) {
                    int LA57_3 = input.LA(2);

                    if ( (LA57_3==RULE_IDENT) ) {
                        int LA57_4 = input.LA(3);

                        if ( (LA57_4==RULE_IDENT) ) {
                            alt57=3;
                        }
                        else if ( (LA57_4==44||(LA57_4>=46 && LA57_4<=47)) ) {
                            alt57=2;
                        }


                    }


                }


                switch (alt57) {
            	case 1 :
            	    // InternalLustre.g:2539:3: ( (lv_modelDeclarations_0_0= ruleModelDeclaration ) )
            	    {
            	    // InternalLustre.g:2539:3: ( (lv_modelDeclarations_0_0= ruleModelDeclaration ) )
            	    // InternalLustre.g:2540:4: (lv_modelDeclarations_0_0= ruleModelDeclaration )
            	    {
            	    // InternalLustre.g:2540:4: (lv_modelDeclarations_0_0= ruleModelDeclaration )
            	    // InternalLustre.g:2541:5: lv_modelDeclarations_0_0= ruleModelDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPackListAccess().getModelDeclarationsModelDeclarationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_49);
            	    lv_modelDeclarations_0_0=ruleModelDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPackListRule());
            	      					}
            	      					add(
            	      						current,
            	      						"modelDeclarations",
            	      						lv_modelDeclarations_0_0,
            	      						"de.cau.cs.kieler.lustre.Lustre.ModelDeclaration");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLustre.g:2559:3: ( (lv_packageDeclarations_1_0= rulePackageDeclaration ) )
            	    {
            	    // InternalLustre.g:2559:3: ( (lv_packageDeclarations_1_0= rulePackageDeclaration ) )
            	    // InternalLustre.g:2560:4: (lv_packageDeclarations_1_0= rulePackageDeclaration )
            	    {
            	    // InternalLustre.g:2560:4: (lv_packageDeclarations_1_0= rulePackageDeclaration )
            	    // InternalLustre.g:2561:5: lv_packageDeclarations_1_0= rulePackageDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPackListAccess().getPackageDeclarationsPackageDeclarationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_49);
            	    lv_packageDeclarations_1_0=rulePackageDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPackListRule());
            	      					}
            	      					add(
            	      						current,
            	      						"packageDeclarations",
            	      						lv_packageDeclarations_1_0,
            	      						"de.cau.cs.kieler.lustre.Lustre.PackageDeclaration");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLustre.g:2579:3: ( (lv_packageEquations_2_0= rulePackageEquation ) )
            	    {
            	    // InternalLustre.g:2579:3: ( (lv_packageEquations_2_0= rulePackageEquation ) )
            	    // InternalLustre.g:2580:4: (lv_packageEquations_2_0= rulePackageEquation )
            	    {
            	    // InternalLustre.g:2580:4: (lv_packageEquations_2_0= rulePackageEquation )
            	    // InternalLustre.g:2581:5: lv_packageEquations_2_0= rulePackageEquation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPackListAccess().getPackageEquationsPackageEquationParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_49);
            	    lv_packageEquations_2_0=rulePackageEquation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPackListRule());
            	      					}
            	      					add(
            	      						current,
            	      						"packageEquations",
            	      						lv_packageEquations_2_0,
            	      						"de.cau.cs.kieler.lustre.Lustre.PackageEquation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);


            }

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
    // $ANTLR end "rulePackList"


    // $ANTLR start "entryRuleModelDeclaration"
    // InternalLustre.g:2602:1: entryRuleModelDeclaration returns [EObject current=null] : iv_ruleModelDeclaration= ruleModelDeclaration EOF ;
    public final EObject entryRuleModelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelDeclaration = null;


        try {
            // InternalLustre.g:2602:57: (iv_ruleModelDeclaration= ruleModelDeclaration EOF )
            // InternalLustre.g:2603:2: iv_ruleModelDeclaration= ruleModelDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModelDeclaration=ruleModelDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelDeclaration"


    // $ANTLR start "ruleModelDeclaration"
    // InternalLustre.g:2609:1: ruleModelDeclaration returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_usesIds_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_usesIds_5_0= RULE_IDENT ) ) )* otherlv_6= ';' )? otherlv_7= 'needs' ( (lv_needsParams_8_0= ruleStaticParam ) ) (otherlv_9= ';' ( (lv_needsParams_10_0= ruleStaticParam ) ) )* otherlv_11= ';' (otherlv_12= 'provides' ( (lv_provisions_13_0= ruleProvide ) ) otherlv_14= ';' ( ( (lv_provisions_15_0= ruleProvide ) ) otherlv_16= ';' )* )? otherlv_17= 'body' ( (lv_body_18_0= rulePackBody ) ) otherlv_19= 'end' ) ;
    public final EObject ruleModelDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_usesIds_3_0=null;
        Token otherlv_4=null;
        Token lv_usesIds_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_needsParams_8_0 = null;

        EObject lv_needsParams_10_0 = null;

        EObject lv_provisions_13_0 = null;

        EObject lv_provisions_15_0 = null;

        EObject lv_body_18_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2615:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_usesIds_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_usesIds_5_0= RULE_IDENT ) ) )* otherlv_6= ';' )? otherlv_7= 'needs' ( (lv_needsParams_8_0= ruleStaticParam ) ) (otherlv_9= ';' ( (lv_needsParams_10_0= ruleStaticParam ) ) )* otherlv_11= ';' (otherlv_12= 'provides' ( (lv_provisions_13_0= ruleProvide ) ) otherlv_14= ';' ( ( (lv_provisions_15_0= ruleProvide ) ) otherlv_16= ';' )* )? otherlv_17= 'body' ( (lv_body_18_0= rulePackBody ) ) otherlv_19= 'end' ) )
            // InternalLustre.g:2616:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_usesIds_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_usesIds_5_0= RULE_IDENT ) ) )* otherlv_6= ';' )? otherlv_7= 'needs' ( (lv_needsParams_8_0= ruleStaticParam ) ) (otherlv_9= ';' ( (lv_needsParams_10_0= ruleStaticParam ) ) )* otherlv_11= ';' (otherlv_12= 'provides' ( (lv_provisions_13_0= ruleProvide ) ) otherlv_14= ';' ( ( (lv_provisions_15_0= ruleProvide ) ) otherlv_16= ';' )* )? otherlv_17= 'body' ( (lv_body_18_0= rulePackBody ) ) otherlv_19= 'end' )
            {
            // InternalLustre.g:2616:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_usesIds_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_usesIds_5_0= RULE_IDENT ) ) )* otherlv_6= ';' )? otherlv_7= 'needs' ( (lv_needsParams_8_0= ruleStaticParam ) ) (otherlv_9= ';' ( (lv_needsParams_10_0= ruleStaticParam ) ) )* otherlv_11= ';' (otherlv_12= 'provides' ( (lv_provisions_13_0= ruleProvide ) ) otherlv_14= ';' ( ( (lv_provisions_15_0= ruleProvide ) ) otherlv_16= ';' )* )? otherlv_17= 'body' ( (lv_body_18_0= rulePackBody ) ) otherlv_19= 'end' )
            // InternalLustre.g:2617:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_usesIds_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_usesIds_5_0= RULE_IDENT ) ) )* otherlv_6= ';' )? otherlv_7= 'needs' ( (lv_needsParams_8_0= ruleStaticParam ) ) (otherlv_9= ';' ( (lv_needsParams_10_0= ruleStaticParam ) ) )* otherlv_11= ';' (otherlv_12= 'provides' ( (lv_provisions_13_0= ruleProvide ) ) otherlv_14= ';' ( ( (lv_provisions_15_0= ruleProvide ) ) otherlv_16= ';' )* )? otherlv_17= 'body' ( (lv_body_18_0= rulePackBody ) ) otherlv_19= 'end'
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModelDeclarationAccess().getModelKeyword_0());
              		
            }
            // InternalLustre.g:2621:3: ( (lv_name_1_0= RULE_IDENT ) )
            // InternalLustre.g:2622:4: (lv_name_1_0= RULE_IDENT )
            {
            // InternalLustre.g:2622:4: (lv_name_1_0= RULE_IDENT )
            // InternalLustre.g:2623:5: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getModelDeclarationAccess().getNameIDENTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModelDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.cau.cs.kieler.lustre.Lustre.IDENT");
              				
            }

            }


            }

            // InternalLustre.g:2639:3: (otherlv_2= 'uses' ( (lv_usesIds_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_usesIds_5_0= RULE_IDENT ) ) )* otherlv_6= ';' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==44) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalLustre.g:2640:4: otherlv_2= 'uses' ( (lv_usesIds_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_usesIds_5_0= RULE_IDENT ) ) )* otherlv_6= ';'
                    {
                    otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getModelDeclarationAccess().getUsesKeyword_2_0());
                      			
                    }
                    // InternalLustre.g:2644:4: ( (lv_usesIds_3_0= RULE_IDENT ) )
                    // InternalLustre.g:2645:5: (lv_usesIds_3_0= RULE_IDENT )
                    {
                    // InternalLustre.g:2645:5: (lv_usesIds_3_0= RULE_IDENT )
                    // InternalLustre.g:2646:6: lv_usesIds_3_0= RULE_IDENT
                    {
                    lv_usesIds_3_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_usesIds_3_0, grammarAccess.getModelDeclarationAccess().getUsesIdsIDENTTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getModelDeclarationRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"usesIds",
                      							lv_usesIds_3_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }

                    // InternalLustre.g:2662:4: (otherlv_4= ',' ( (lv_usesIds_5_0= RULE_IDENT ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==24) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalLustre.g:2663:5: otherlv_4= ',' ( (lv_usesIds_5_0= RULE_IDENT ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getModelDeclarationAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalLustre.g:2667:5: ( (lv_usesIds_5_0= RULE_IDENT ) )
                    	    // InternalLustre.g:2668:6: (lv_usesIds_5_0= RULE_IDENT )
                    	    {
                    	    // InternalLustre.g:2668:6: (lv_usesIds_5_0= RULE_IDENT )
                    	    // InternalLustre.g:2669:7: lv_usesIds_5_0= RULE_IDENT
                    	    {
                    	    lv_usesIds_5_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_51); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(lv_usesIds_5_0, grammarAccess.getModelDeclarationAccess().getUsesIdsIDENTTerminalRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getModelDeclarationRule());
                    	      							}
                    	      							addWithLastConsumed(
                    	      								current,
                    	      								"usesIds",
                    	      								lv_usesIds_5_0,
                    	      								"de.cau.cs.kieler.lustre.Lustre.IDENT");
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getModelDeclarationAccess().getSemicolonKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,45,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getModelDeclarationAccess().getNeedsKeyword_3());
              		
            }
            // InternalLustre.g:2695:3: ( (lv_needsParams_8_0= ruleStaticParam ) )
            // InternalLustre.g:2696:4: (lv_needsParams_8_0= ruleStaticParam )
            {
            // InternalLustre.g:2696:4: (lv_needsParams_8_0= ruleStaticParam )
            // InternalLustre.g:2697:5: lv_needsParams_8_0= ruleStaticParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelDeclarationAccess().getNeedsParamsStaticParamParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_8);
            lv_needsParams_8_0=ruleStaticParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelDeclarationRule());
              					}
              					add(
              						current,
              						"needsParams",
              						lv_needsParams_8_0,
              						"de.cau.cs.kieler.lustre.Lustre.StaticParam");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLustre.g:2714:3: (otherlv_9= ';' ( (lv_needsParams_10_0= ruleStaticParam ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==16) ) {
                    int LA60_1 = input.LA(2);

                    if ( ((LA60_1>=14 && LA60_1<=15)||LA60_1==27||(LA60_1>=29 && LA60_1<=30)) ) {
                        alt60=1;
                    }


                }


                switch (alt60) {
            	case 1 :
            	    // InternalLustre.g:2715:4: otherlv_9= ';' ( (lv_needsParams_10_0= ruleStaticParam ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_9, grammarAccess.getModelDeclarationAccess().getSemicolonKeyword_5_0());
            	      			
            	    }
            	    // InternalLustre.g:2719:4: ( (lv_needsParams_10_0= ruleStaticParam ) )
            	    // InternalLustre.g:2720:5: (lv_needsParams_10_0= ruleStaticParam )
            	    {
            	    // InternalLustre.g:2720:5: (lv_needsParams_10_0= ruleStaticParam )
            	    // InternalLustre.g:2721:6: lv_needsParams_10_0= ruleStaticParam
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModelDeclarationAccess().getNeedsParamsStaticParamParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_needsParams_10_0=ruleStaticParam();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModelDeclarationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"needsParams",
            	      							lv_needsParams_10_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.StaticParam");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getModelDeclarationAccess().getSemicolonKeyword_6());
              		
            }
            // InternalLustre.g:2743:3: (otherlv_12= 'provides' ( (lv_provisions_13_0= ruleProvide ) ) otherlv_14= ';' ( ( (lv_provisions_15_0= ruleProvide ) ) otherlv_16= ';' )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==46) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalLustre.g:2744:4: otherlv_12= 'provides' ( (lv_provisions_13_0= ruleProvide ) ) otherlv_14= ';' ( ( (lv_provisions_15_0= ruleProvide ) ) otherlv_16= ';' )*
                    {
                    otherlv_12=(Token)match(input,46,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getModelDeclarationAccess().getProvidesKeyword_7_0());
                      			
                    }
                    // InternalLustre.g:2748:4: ( (lv_provisions_13_0= ruleProvide ) )
                    // InternalLustre.g:2749:5: (lv_provisions_13_0= ruleProvide )
                    {
                    // InternalLustre.g:2749:5: (lv_provisions_13_0= ruleProvide )
                    // InternalLustre.g:2750:6: lv_provisions_13_0= ruleProvide
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModelDeclarationAccess().getProvisionsProvideParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_provisions_13_0=ruleProvide();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModelDeclarationRule());
                      						}
                      						add(
                      							current,
                      							"provisions",
                      							lv_provisions_13_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Provide");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getModelDeclarationAccess().getSemicolonKeyword_7_2());
                      			
                    }
                    // InternalLustre.g:2771:4: ( ( (lv_provisions_15_0= ruleProvide ) ) otherlv_16= ';' )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( ((LA61_0>=14 && LA61_0<=15)||LA61_0==27||(LA61_0>=29 && LA61_0<=30)) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalLustre.g:2772:5: ( (lv_provisions_15_0= ruleProvide ) ) otherlv_16= ';'
                    	    {
                    	    // InternalLustre.g:2772:5: ( (lv_provisions_15_0= ruleProvide ) )
                    	    // InternalLustre.g:2773:6: (lv_provisions_15_0= ruleProvide )
                    	    {
                    	    // InternalLustre.g:2773:6: (lv_provisions_15_0= ruleProvide )
                    	    // InternalLustre.g:2774:7: lv_provisions_15_0= ruleProvide
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getModelDeclarationAccess().getProvisionsProvideParserRuleCall_7_3_0_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_8);
                    	    lv_provisions_15_0=ruleProvide();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getModelDeclarationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"provisions",
                    	      								lv_provisions_15_0,
                    	      								"de.cau.cs.kieler.lustre.Lustre.Provide");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_16, grammarAccess.getModelDeclarationAccess().getSemicolonKeyword_7_3_1());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,47,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getModelDeclarationAccess().getBodyKeyword_8());
              		
            }
            // InternalLustre.g:2801:3: ( (lv_body_18_0= rulePackBody ) )
            // InternalLustre.g:2802:4: (lv_body_18_0= rulePackBody )
            {
            // InternalLustre.g:2802:4: (lv_body_18_0= rulePackBody )
            // InternalLustre.g:2803:5: lv_body_18_0= rulePackBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelDeclarationAccess().getBodyPackBodyParserRuleCall_9_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_56);
            lv_body_18_0=rulePackBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelDeclarationRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_18_0,
              						"de.cau.cs.kieler.lustre.Lustre.PackBody");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_19=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getModelDeclarationAccess().getEndKeyword_10());
              		
            }

            }


            }

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
    // $ANTLR end "ruleModelDeclaration"


    // $ANTLR start "entryRuleProvide"
    // InternalLustre.g:2828:1: entryRuleProvide returns [EObject current=null] : iv_ruleProvide= ruleProvide EOF ;
    public final EObject entryRuleProvide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvide = null;


        try {
            // InternalLustre.g:2828:48: (iv_ruleProvide= ruleProvide EOF )
            // InternalLustre.g:2829:2: iv_ruleProvide= ruleProvide EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProvideRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProvide=ruleProvide();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProvide; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProvide"


    // $ANTLR start "ruleProvide"
    // InternalLustre.g:2835:1: ruleProvide returns [EObject current=null] : ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleLustreExpression ) ) )? ) | (otherlv_6= 'type' ( (lv_types_7_0= ruleTypeDeclaration ) ) ) | ( (otherlv_8= 'unsafe' )? (otherlv_9= 'node' | otherlv_10= 'function' ) ( (lv_name_11_0= RULE_IDENT ) ) (otherlv_12= '<<' ( (lv_staticParams_13_0= ruleStaticParam ) ) (otherlv_14= ';' ( (lv_staticParams_15_0= ruleStaticParam ) ) )* otherlv_16= '>>' )? ( (lv_input_17_0= ruleParams ) ) otherlv_18= 'returns' ( (lv_output_19_0= ruleParams ) ) ) ) ;
    public final EObject ruleProvide() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_name_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_type_3_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_types_7_0 = null;

        EObject lv_staticParams_13_0 = null;

        EObject lv_staticParams_15_0 = null;

        EObject lv_input_17_0 = null;

        EObject lv_output_19_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2841:2: ( ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleLustreExpression ) ) )? ) | (otherlv_6= 'type' ( (lv_types_7_0= ruleTypeDeclaration ) ) ) | ( (otherlv_8= 'unsafe' )? (otherlv_9= 'node' | otherlv_10= 'function' ) ( (lv_name_11_0= RULE_IDENT ) ) (otherlv_12= '<<' ( (lv_staticParams_13_0= ruleStaticParam ) ) (otherlv_14= ';' ( (lv_staticParams_15_0= ruleStaticParam ) ) )* otherlv_16= '>>' )? ( (lv_input_17_0= ruleParams ) ) otherlv_18= 'returns' ( (lv_output_19_0= ruleParams ) ) ) ) )
            // InternalLustre.g:2842:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleLustreExpression ) ) )? ) | (otherlv_6= 'type' ( (lv_types_7_0= ruleTypeDeclaration ) ) ) | ( (otherlv_8= 'unsafe' )? (otherlv_9= 'node' | otherlv_10= 'function' ) ( (lv_name_11_0= RULE_IDENT ) ) (otherlv_12= '<<' ( (lv_staticParams_13_0= ruleStaticParam ) ) (otherlv_14= ';' ( (lv_staticParams_15_0= ruleStaticParam ) ) )* otherlv_16= '>>' )? ( (lv_input_17_0= ruleParams ) ) otherlv_18= 'returns' ( (lv_output_19_0= ruleParams ) ) ) )
            {
            // InternalLustre.g:2842:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleLustreExpression ) ) )? ) | (otherlv_6= 'type' ( (lv_types_7_0= ruleTypeDeclaration ) ) ) | ( (otherlv_8= 'unsafe' )? (otherlv_9= 'node' | otherlv_10= 'function' ) ( (lv_name_11_0= RULE_IDENT ) ) (otherlv_12= '<<' ( (lv_staticParams_13_0= ruleStaticParam ) ) (otherlv_14= ';' ( (lv_staticParams_15_0= ruleStaticParam ) ) )* otherlv_16= '>>' )? ( (lv_input_17_0= ruleParams ) ) otherlv_18= 'returns' ( (lv_output_19_0= ruleParams ) ) ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt68=1;
                }
                break;
            case 14:
                {
                alt68=2;
                }
                break;
            case 27:
            case 29:
            case 30:
                {
                alt68=3;
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
                    // InternalLustre.g:2843:3: (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleLustreExpression ) ) )? )
                    {
                    // InternalLustre.g:2843:3: (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleLustreExpression ) ) )? )
                    // InternalLustre.g:2844:4: otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleLustreExpression ) ) )?
                    {
                    otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getProvideAccess().getConstKeyword_0_0());
                      			
                    }
                    // InternalLustre.g:2848:4: ( (lv_name_1_0= RULE_IDENT ) )
                    // InternalLustre.g:2849:5: (lv_name_1_0= RULE_IDENT )
                    {
                    // InternalLustre.g:2849:5: (lv_name_1_0= RULE_IDENT )
                    // InternalLustre.g:2850:6: lv_name_1_0= RULE_IDENT
                    {
                    lv_name_1_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_0, grammarAccess.getProvideAccess().getNameIDENTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getProvideRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getProvideAccess().getColonKeyword_0_2());
                      			
                    }
                    // InternalLustre.g:2870:4: ( (lv_type_3_0= ruleType ) )
                    // InternalLustre.g:2871:5: (lv_type_3_0= ruleType )
                    {
                    // InternalLustre.g:2871:5: (lv_type_3_0= ruleType )
                    // InternalLustre.g:2872:6: lv_type_3_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProvideAccess().getTypeTypeParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_43);
                    lv_type_3_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProvideRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_3_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalLustre.g:2889:4: (otherlv_4= '=' ( (lv_value_5_0= ruleLustreExpression ) ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==17) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalLustre.g:2890:5: otherlv_4= '=' ( (lv_value_5_0= ruleLustreExpression ) )
                            {
                            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getProvideAccess().getEqualsSignKeyword_0_4_0());
                              				
                            }
                            // InternalLustre.g:2894:5: ( (lv_value_5_0= ruleLustreExpression ) )
                            // InternalLustre.g:2895:6: (lv_value_5_0= ruleLustreExpression )
                            {
                            // InternalLustre.g:2895:6: (lv_value_5_0= ruleLustreExpression )
                            // InternalLustre.g:2896:7: lv_value_5_0= ruleLustreExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getProvideAccess().getValueLustreExpressionParserRuleCall_0_4_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_value_5_0=ruleLustreExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getProvideRule());
                              							}
                              							set(
                              								current,
                              								"value",
                              								lv_value_5_0,
                              								"de.cau.cs.kieler.lustre.Lustre.LustreExpression");
                              							afterParserOrEnumRuleCall();
                              						
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
                    // InternalLustre.g:2916:3: (otherlv_6= 'type' ( (lv_types_7_0= ruleTypeDeclaration ) ) )
                    {
                    // InternalLustre.g:2916:3: (otherlv_6= 'type' ( (lv_types_7_0= ruleTypeDeclaration ) ) )
                    // InternalLustre.g:2917:4: otherlv_6= 'type' ( (lv_types_7_0= ruleTypeDeclaration ) )
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getProvideAccess().getTypeKeyword_1_0());
                      			
                    }
                    // InternalLustre.g:2921:4: ( (lv_types_7_0= ruleTypeDeclaration ) )
                    // InternalLustre.g:2922:5: (lv_types_7_0= ruleTypeDeclaration )
                    {
                    // InternalLustre.g:2922:5: (lv_types_7_0= ruleTypeDeclaration )
                    // InternalLustre.g:2923:6: lv_types_7_0= ruleTypeDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProvideAccess().getTypesTypeDeclarationParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_types_7_0=ruleTypeDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProvideRule());
                      						}
                      						set(
                      							current,
                      							"types",
                      							lv_types_7_0,
                      							"de.cau.cs.kieler.lustre.Lustre.TypeDeclaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLustre.g:2942:3: ( (otherlv_8= 'unsafe' )? (otherlv_9= 'node' | otherlv_10= 'function' ) ( (lv_name_11_0= RULE_IDENT ) ) (otherlv_12= '<<' ( (lv_staticParams_13_0= ruleStaticParam ) ) (otherlv_14= ';' ( (lv_staticParams_15_0= ruleStaticParam ) ) )* otherlv_16= '>>' )? ( (lv_input_17_0= ruleParams ) ) otherlv_18= 'returns' ( (lv_output_19_0= ruleParams ) ) )
                    {
                    // InternalLustre.g:2942:3: ( (otherlv_8= 'unsafe' )? (otherlv_9= 'node' | otherlv_10= 'function' ) ( (lv_name_11_0= RULE_IDENT ) ) (otherlv_12= '<<' ( (lv_staticParams_13_0= ruleStaticParam ) ) (otherlv_14= ';' ( (lv_staticParams_15_0= ruleStaticParam ) ) )* otherlv_16= '>>' )? ( (lv_input_17_0= ruleParams ) ) otherlv_18= 'returns' ( (lv_output_19_0= ruleParams ) ) )
                    // InternalLustre.g:2943:4: (otherlv_8= 'unsafe' )? (otherlv_9= 'node' | otherlv_10= 'function' ) ( (lv_name_11_0= RULE_IDENT ) ) (otherlv_12= '<<' ( (lv_staticParams_13_0= ruleStaticParam ) ) (otherlv_14= ';' ( (lv_staticParams_15_0= ruleStaticParam ) ) )* otherlv_16= '>>' )? ( (lv_input_17_0= ruleParams ) ) otherlv_18= 'returns' ( (lv_output_19_0= ruleParams ) )
                    {
                    // InternalLustre.g:2943:4: (otherlv_8= 'unsafe' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==27) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalLustre.g:2944:5: otherlv_8= 'unsafe'
                            {
                            otherlv_8=(Token)match(input,27,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getProvideAccess().getUnsafeKeyword_2_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalLustre.g:2949:4: (otherlv_9= 'node' | otherlv_10= 'function' )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==30) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==29) ) {
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
                            // InternalLustre.g:2950:5: otherlv_9= 'node'
                            {
                            otherlv_9=(Token)match(input,30,FollowSets000.FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getProvideAccess().getNodeKeyword_2_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalLustre.g:2955:5: otherlv_10= 'function'
                            {
                            otherlv_10=(Token)match(input,29,FollowSets000.FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_10, grammarAccess.getProvideAccess().getFunctionKeyword_2_1_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalLustre.g:2960:4: ( (lv_name_11_0= RULE_IDENT ) )
                    // InternalLustre.g:2961:5: (lv_name_11_0= RULE_IDENT )
                    {
                    // InternalLustre.g:2961:5: (lv_name_11_0= RULE_IDENT )
                    // InternalLustre.g:2962:6: lv_name_11_0= RULE_IDENT
                    {
                    lv_name_11_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_11_0, grammarAccess.getProvideAccess().getNameIDENTTerminalRuleCall_2_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getProvideRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_11_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }

                    // InternalLustre.g:2978:4: (otherlv_12= '<<' ( (lv_staticParams_13_0= ruleStaticParam ) ) (otherlv_14= ';' ( (lv_staticParams_15_0= ruleStaticParam ) ) )* otherlv_16= '>>' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==32) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalLustre.g:2979:5: otherlv_12= '<<' ( (lv_staticParams_13_0= ruleStaticParam ) ) (otherlv_14= ';' ( (lv_staticParams_15_0= ruleStaticParam ) ) )* otherlv_16= '>>'
                            {
                            otherlv_12=(Token)match(input,32,FollowSets000.FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_12, grammarAccess.getProvideAccess().getLessThanSignLessThanSignKeyword_2_3_0());
                              				
                            }
                            // InternalLustre.g:2983:5: ( (lv_staticParams_13_0= ruleStaticParam ) )
                            // InternalLustre.g:2984:6: (lv_staticParams_13_0= ruleStaticParam )
                            {
                            // InternalLustre.g:2984:6: (lv_staticParams_13_0= ruleStaticParam )
                            // InternalLustre.g:2985:7: lv_staticParams_13_0= ruleStaticParam
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getProvideAccess().getStaticParamsStaticParamParserRuleCall_2_3_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_25);
                            lv_staticParams_13_0=ruleStaticParam();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getProvideRule());
                              							}
                              							add(
                              								current,
                              								"staticParams",
                              								lv_staticParams_13_0,
                              								"de.cau.cs.kieler.lustre.Lustre.StaticParam");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalLustre.g:3002:5: (otherlv_14= ';' ( (lv_staticParams_15_0= ruleStaticParam ) ) )*
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( (LA66_0==16) ) {
                                    alt66=1;
                                }


                                switch (alt66) {
                            	case 1 :
                            	    // InternalLustre.g:3003:6: otherlv_14= ';' ( (lv_staticParams_15_0= ruleStaticParam ) )
                            	    {
                            	    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_24); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_14, grammarAccess.getProvideAccess().getSemicolonKeyword_2_3_2_0());
                            	      					
                            	    }
                            	    // InternalLustre.g:3007:6: ( (lv_staticParams_15_0= ruleStaticParam ) )
                            	    // InternalLustre.g:3008:7: (lv_staticParams_15_0= ruleStaticParam )
                            	    {
                            	    // InternalLustre.g:3008:7: (lv_staticParams_15_0= ruleStaticParam )
                            	    // InternalLustre.g:3009:8: lv_staticParams_15_0= ruleStaticParam
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getProvideAccess().getStaticParamsStaticParamParserRuleCall_2_3_2_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_25);
                            	    lv_staticParams_15_0=ruleStaticParam();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getProvideRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"staticParams",
                            	      									lv_staticParams_15_0,
                            	      									"de.cau.cs.kieler.lustre.Lustre.StaticParam");
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

                            otherlv_16=(Token)match(input,33,FollowSets000.FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getProvideAccess().getGreaterThanSignGreaterThanSignKeyword_2_3_3());
                              				
                            }

                            }
                            break;

                    }

                    // InternalLustre.g:3032:4: ( (lv_input_17_0= ruleParams ) )
                    // InternalLustre.g:3033:5: (lv_input_17_0= ruleParams )
                    {
                    // InternalLustre.g:3033:5: (lv_input_17_0= ruleParams )
                    // InternalLustre.g:3034:6: lv_input_17_0= ruleParams
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProvideAccess().getInputParamsParserRuleCall_2_4_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    lv_input_17_0=ruleParams();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProvideRule());
                      						}
                      						set(
                      							current,
                      							"input",
                      							lv_input_17_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Params");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,31,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getProvideAccess().getReturnsKeyword_2_5());
                      			
                    }
                    // InternalLustre.g:3055:4: ( (lv_output_19_0= ruleParams ) )
                    // InternalLustre.g:3056:5: (lv_output_19_0= ruleParams )
                    {
                    // InternalLustre.g:3056:5: (lv_output_19_0= ruleParams )
                    // InternalLustre.g:3057:6: lv_output_19_0= ruleParams
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProvideAccess().getOutputParamsParserRuleCall_2_6_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_output_19_0=ruleParams();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProvideRule());
                      						}
                      						set(
                      							current,
                      							"output",
                      							lv_output_19_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Params");
                      						afterParserOrEnumRuleCall();
                      					
                    }

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
    // $ANTLR end "ruleProvide"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalLustre.g:3079:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalLustre.g:3079:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalLustre.g:3080:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalLustre.g:3086:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_usesIds_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_usesIds_5_0= RULE_IDENT ) ) )* otherlv_6= ';' )? (otherlv_7= 'provides' ( (lv_provisions_8_0= ruleProvide ) ) otherlv_9= ';' ( ( (lv_provisions_10_0= ruleProvide ) ) otherlv_11= ';' )* )? otherlv_12= 'body' ( (lv_body_13_0= rulePackBody ) ) otherlv_14= 'end' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_usesIds_3_0=null;
        Token otherlv_4=null;
        Token lv_usesIds_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_provisions_8_0 = null;

        EObject lv_provisions_10_0 = null;

        EObject lv_body_13_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:3092:2: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_usesIds_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_usesIds_5_0= RULE_IDENT ) ) )* otherlv_6= ';' )? (otherlv_7= 'provides' ( (lv_provisions_8_0= ruleProvide ) ) otherlv_9= ';' ( ( (lv_provisions_10_0= ruleProvide ) ) otherlv_11= ';' )* )? otherlv_12= 'body' ( (lv_body_13_0= rulePackBody ) ) otherlv_14= 'end' ) )
            // InternalLustre.g:3093:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_usesIds_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_usesIds_5_0= RULE_IDENT ) ) )* otherlv_6= ';' )? (otherlv_7= 'provides' ( (lv_provisions_8_0= ruleProvide ) ) otherlv_9= ';' ( ( (lv_provisions_10_0= ruleProvide ) ) otherlv_11= ';' )* )? otherlv_12= 'body' ( (lv_body_13_0= rulePackBody ) ) otherlv_14= 'end' )
            {
            // InternalLustre.g:3093:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_usesIds_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_usesIds_5_0= RULE_IDENT ) ) )* otherlv_6= ';' )? (otherlv_7= 'provides' ( (lv_provisions_8_0= ruleProvide ) ) otherlv_9= ';' ( ( (lv_provisions_10_0= ruleProvide ) ) otherlv_11= ';' )* )? otherlv_12= 'body' ( (lv_body_13_0= rulePackBody ) ) otherlv_14= 'end' )
            // InternalLustre.g:3094:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_usesIds_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_usesIds_5_0= RULE_IDENT ) ) )* otherlv_6= ';' )? (otherlv_7= 'provides' ( (lv_provisions_8_0= ruleProvide ) ) otherlv_9= ';' ( ( (lv_provisions_10_0= ruleProvide ) ) otherlv_11= ';' )* )? otherlv_12= 'body' ( (lv_body_13_0= rulePackBody ) ) otherlv_14= 'end'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
              		
            }
            // InternalLustre.g:3098:3: ( (lv_name_1_0= RULE_IDENT ) )
            // InternalLustre.g:3099:4: (lv_name_1_0= RULE_IDENT )
            {
            // InternalLustre.g:3099:4: (lv_name_1_0= RULE_IDENT )
            // InternalLustre.g:3100:5: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPackageDeclarationAccess().getNameIDENTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPackageDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.cau.cs.kieler.lustre.Lustre.IDENT");
              				
            }

            }


            }

            // InternalLustre.g:3116:3: (otherlv_2= 'uses' ( (lv_usesIds_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_usesIds_5_0= RULE_IDENT ) ) )* otherlv_6= ';' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==44) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalLustre.g:3117:4: otherlv_2= 'uses' ( (lv_usesIds_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_usesIds_5_0= RULE_IDENT ) ) )* otherlv_6= ';'
                    {
                    otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getUsesKeyword_2_0());
                      			
                    }
                    // InternalLustre.g:3121:4: ( (lv_usesIds_3_0= RULE_IDENT ) )
                    // InternalLustre.g:3122:5: (lv_usesIds_3_0= RULE_IDENT )
                    {
                    // InternalLustre.g:3122:5: (lv_usesIds_3_0= RULE_IDENT )
                    // InternalLustre.g:3123:6: lv_usesIds_3_0= RULE_IDENT
                    {
                    lv_usesIds_3_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_usesIds_3_0, grammarAccess.getPackageDeclarationAccess().getUsesIdsIDENTTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPackageDeclarationRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"usesIds",
                      							lv_usesIds_3_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }

                    // InternalLustre.g:3139:4: (otherlv_4= ',' ( (lv_usesIds_5_0= RULE_IDENT ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==24) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalLustre.g:3140:5: otherlv_4= ',' ( (lv_usesIds_5_0= RULE_IDENT ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalLustre.g:3144:5: ( (lv_usesIds_5_0= RULE_IDENT ) )
                    	    // InternalLustre.g:3145:6: (lv_usesIds_5_0= RULE_IDENT )
                    	    {
                    	    // InternalLustre.g:3145:6: (lv_usesIds_5_0= RULE_IDENT )
                    	    // InternalLustre.g:3146:7: lv_usesIds_5_0= RULE_IDENT
                    	    {
                    	    lv_usesIds_5_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_51); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(lv_usesIds_5_0, grammarAccess.getPackageDeclarationAccess().getUsesIdsIDENTTerminalRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getPackageDeclarationRule());
                    	      							}
                    	      							addWithLastConsumed(
                    	      								current,
                    	      								"usesIds",
                    	      								lv_usesIds_5_0,
                    	      								"de.cau.cs.kieler.lustre.Lustre.IDENT");
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            // InternalLustre.g:3168:3: (otherlv_7= 'provides' ( (lv_provisions_8_0= ruleProvide ) ) otherlv_9= ';' ( ( (lv_provisions_10_0= ruleProvide ) ) otherlv_11= ';' )* )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==46) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalLustre.g:3169:4: otherlv_7= 'provides' ( (lv_provisions_8_0= ruleProvide ) ) otherlv_9= ';' ( ( (lv_provisions_10_0= ruleProvide ) ) otherlv_11= ';' )*
                    {
                    otherlv_7=(Token)match(input,46,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getPackageDeclarationAccess().getProvidesKeyword_3_0());
                      			
                    }
                    // InternalLustre.g:3173:4: ( (lv_provisions_8_0= ruleProvide ) )
                    // InternalLustre.g:3174:5: (lv_provisions_8_0= ruleProvide )
                    {
                    // InternalLustre.g:3174:5: (lv_provisions_8_0= ruleProvide )
                    // InternalLustre.g:3175:6: lv_provisions_8_0= ruleProvide
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getProvisionsProvideParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_provisions_8_0=ruleProvide();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
                      						}
                      						add(
                      							current,
                      							"provisions",
                      							lv_provisions_8_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Provide");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_3_2());
                      			
                    }
                    // InternalLustre.g:3196:4: ( ( (lv_provisions_10_0= ruleProvide ) ) otherlv_11= ';' )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( ((LA71_0>=14 && LA71_0<=15)||LA71_0==27||(LA71_0>=29 && LA71_0<=30)) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalLustre.g:3197:5: ( (lv_provisions_10_0= ruleProvide ) ) otherlv_11= ';'
                    	    {
                    	    // InternalLustre.g:3197:5: ( (lv_provisions_10_0= ruleProvide ) )
                    	    // InternalLustre.g:3198:6: (lv_provisions_10_0= ruleProvide )
                    	    {
                    	    // InternalLustre.g:3198:6: (lv_provisions_10_0= ruleProvide )
                    	    // InternalLustre.g:3199:7: lv_provisions_10_0= ruleProvide
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPackageDeclarationAccess().getProvisionsProvideParserRuleCall_3_3_0_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_8);
                    	    lv_provisions_10_0=ruleProvide();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"provisions",
                    	      								lv_provisions_10_0,
                    	      								"de.cau.cs.kieler.lustre.Lustre.Provide");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_11, grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_3_3_1());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,47,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getPackageDeclarationAccess().getBodyKeyword_4());
              		
            }
            // InternalLustre.g:3226:3: ( (lv_body_13_0= rulePackBody ) )
            // InternalLustre.g:3227:4: (lv_body_13_0= rulePackBody )
            {
            // InternalLustre.g:3227:4: (lv_body_13_0= rulePackBody )
            // InternalLustre.g:3228:5: lv_body_13_0= rulePackBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getBodyPackBodyParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_56);
            lv_body_13_0=rulePackBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_13_0,
              						"de.cau.cs.kieler.lustre.Lustre.PackBody");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_14=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getPackageDeclarationAccess().getEndKeyword_6());
              		
            }

            }


            }

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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRulePackageEquation"
    // InternalLustre.g:3253:1: entryRulePackageEquation returns [EObject current=null] : iv_rulePackageEquation= rulePackageEquation EOF ;
    public final EObject entryRulePackageEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageEquation = null;


        try {
            // InternalLustre.g:3253:56: (iv_rulePackageEquation= rulePackageEquation EOF )
            // InternalLustre.g:3254:2: iv_rulePackageEquation= rulePackageEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageEquationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePackageEquation=rulePackageEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageEquation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageEquation"


    // $ANTLR start "rulePackageEquation"
    // InternalLustre.g:3260:1: rulePackageEquation returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_eqOrIs_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_byNameStaticArgs_4_0= ruleByNameStaticArg ) ) ( (otherlv_5= ',' | otherlv_6= ';' ) ( (lv_byNameStaticArgs_7_0= ruleByNameStaticArg ) ) )* otherlv_8= ')' otherlv_9= ';' ) ;
    public final EObject rulePackageEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_eqOrIs_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_byNameStaticArgs_4_0 = null;

        EObject lv_byNameStaticArgs_7_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:3266:2: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_eqOrIs_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_byNameStaticArgs_4_0= ruleByNameStaticArg ) ) ( (otherlv_5= ',' | otherlv_6= ';' ) ( (lv_byNameStaticArgs_7_0= ruleByNameStaticArg ) ) )* otherlv_8= ')' otherlv_9= ';' ) )
            // InternalLustre.g:3267:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_eqOrIs_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_byNameStaticArgs_4_0= ruleByNameStaticArg ) ) ( (otherlv_5= ',' | otherlv_6= ';' ) ( (lv_byNameStaticArgs_7_0= ruleByNameStaticArg ) ) )* otherlv_8= ')' otherlv_9= ';' )
            {
            // InternalLustre.g:3267:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_eqOrIs_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_byNameStaticArgs_4_0= ruleByNameStaticArg ) ) ( (otherlv_5= ',' | otherlv_6= ';' ) ( (lv_byNameStaticArgs_7_0= ruleByNameStaticArg ) ) )* otherlv_8= ')' otherlv_9= ';' )
            // InternalLustre.g:3268:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_eqOrIs_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_byNameStaticArgs_4_0= ruleByNameStaticArg ) ) ( (otherlv_5= ',' | otherlv_6= ';' ) ( (lv_byNameStaticArgs_7_0= ruleByNameStaticArg ) ) )* otherlv_8= ')' otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPackageEquationAccess().getPackageKeyword_0());
              		
            }
            // InternalLustre.g:3272:3: ( (lv_name_1_0= RULE_IDENT ) )
            // InternalLustre.g:3273:4: (lv_name_1_0= RULE_IDENT )
            {
            // InternalLustre.g:3273:4: (lv_name_1_0= RULE_IDENT )
            // InternalLustre.g:3274:5: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPackageEquationAccess().getNameIDENTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPackageEquationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.cau.cs.kieler.lustre.Lustre.IDENT");
              				
            }

            }


            }

            // InternalLustre.g:3290:3: ( (lv_eqOrIs_2_0= RULE_IDENT ) )
            // InternalLustre.g:3291:4: (lv_eqOrIs_2_0= RULE_IDENT )
            {
            // InternalLustre.g:3291:4: (lv_eqOrIs_2_0= RULE_IDENT )
            // InternalLustre.g:3292:5: lv_eqOrIs_2_0= RULE_IDENT
            {
            lv_eqOrIs_2_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_eqOrIs_2_0, grammarAccess.getPackageEquationAccess().getEqOrIsIDENTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPackageEquationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"eqOrIs",
              						lv_eqOrIs_2_0,
              						"de.cau.cs.kieler.lustre.Lustre.IDENT");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPackageEquationAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalLustre.g:3312:3: ( (lv_byNameStaticArgs_4_0= ruleByNameStaticArg ) )
            // InternalLustre.g:3313:4: (lv_byNameStaticArgs_4_0= ruleByNameStaticArg )
            {
            // InternalLustre.g:3313:4: (lv_byNameStaticArgs_4_0= ruleByNameStaticArg )
            // InternalLustre.g:3314:5: lv_byNameStaticArgs_4_0= ruleByNameStaticArg
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPackageEquationAccess().getByNameStaticArgsByNameStaticArgParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_60);
            lv_byNameStaticArgs_4_0=ruleByNameStaticArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPackageEquationRule());
              					}
              					add(
              						current,
              						"byNameStaticArgs",
              						lv_byNameStaticArgs_4_0,
              						"de.cau.cs.kieler.lustre.Lustre.ByNameStaticArg");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLustre.g:3331:3: ( (otherlv_5= ',' | otherlv_6= ';' ) ( (lv_byNameStaticArgs_7_0= ruleByNameStaticArg ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==16||LA74_0==24) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalLustre.g:3332:4: (otherlv_5= ',' | otherlv_6= ';' ) ( (lv_byNameStaticArgs_7_0= ruleByNameStaticArg ) )
            	    {
            	    // InternalLustre.g:3332:4: (otherlv_5= ',' | otherlv_6= ';' )
            	    int alt73=2;
            	    int LA73_0 = input.LA(1);

            	    if ( (LA73_0==24) ) {
            	        alt73=1;
            	    }
            	    else if ( (LA73_0==16) ) {
            	        alt73=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 73, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // InternalLustre.g:3333:5: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_5, grammarAccess.getPackageEquationAccess().getCommaKeyword_5_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:3338:5: otherlv_6= ';'
            	            {
            	            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_6, grammarAccess.getPackageEquationAccess().getSemicolonKeyword_5_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalLustre.g:3343:4: ( (lv_byNameStaticArgs_7_0= ruleByNameStaticArg ) )
            	    // InternalLustre.g:3344:5: (lv_byNameStaticArgs_7_0= ruleByNameStaticArg )
            	    {
            	    // InternalLustre.g:3344:5: (lv_byNameStaticArgs_7_0= ruleByNameStaticArg )
            	    // InternalLustre.g:3345:6: lv_byNameStaticArgs_7_0= ruleByNameStaticArg
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPackageEquationAccess().getByNameStaticArgsByNameStaticArgParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_60);
            	    lv_byNameStaticArgs_7_0=ruleByNameStaticArg();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPackageEquationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"byNameStaticArgs",
            	      							lv_byNameStaticArgs_7_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.ByNameStaticArg");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            otherlv_8=(Token)match(input,39,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getPackageEquationAccess().getRightParenthesisKeyword_6());
              		
            }
            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getPackageEquationAccess().getSemicolonKeyword_7());
              		
            }

            }


            }

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
    // $ANTLR end "rulePackageEquation"


    // $ANTLR start "entryRulePackage_Provided_IO"
    // InternalLustre.g:3375:1: entryRulePackage_Provided_IO returns [EObject current=null] : iv_rulePackage_Provided_IO= rulePackage_Provided_IO EOF ;
    public final EObject entryRulePackage_Provided_IO() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Provided_IO = null;


        try {
            // InternalLustre.g:3375:60: (iv_rulePackage_Provided_IO= rulePackage_Provided_IO EOF )
            // InternalLustre.g:3376:2: iv_rulePackage_Provided_IO= rulePackage_Provided_IO EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_Provided_IORule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePackage_Provided_IO=rulePackage_Provided_IO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_Provided_IO; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage_Provided_IO"


    // $ANTLR start "rulePackage_Provided_IO"
    // InternalLustre.g:3382:1: rulePackage_Provided_IO returns [EObject current=null] : ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) ) ) ;
    public final EObject rulePackage_Provided_IO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalLustre.g:3388:2: ( ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) ) ) )
            // InternalLustre.g:3389:2: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) ) )
            {
            // InternalLustre.g:3389:2: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) ) )
            // InternalLustre.g:3390:3: ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) )
            {
            // InternalLustre.g:3390:3: ( (otherlv_0= RULE_IDENT ) )
            // InternalLustre.g:3391:4: (otherlv_0= RULE_IDENT )
            {
            // InternalLustre.g:3391:4: (otherlv_0= RULE_IDENT )
            // InternalLustre.g:3392:5: otherlv_0= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPackage_Provided_IORule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getPackage_Provided_IOAccess().getNameVariable_DeclarationCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPackage_Provided_IOAccess().getColonKeyword_1());
              		
            }
            // InternalLustre.g:3410:3: ( (lv_type_2_0= RULE_IDENT ) )
            // InternalLustre.g:3411:4: (lv_type_2_0= RULE_IDENT )
            {
            // InternalLustre.g:3411:4: (lv_type_2_0= RULE_IDENT )
            // InternalLustre.g:3412:5: lv_type_2_0= RULE_IDENT
            {
            lv_type_2_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_type_2_0, grammarAccess.getPackage_Provided_IOAccess().getTypeIDENTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPackage_Provided_IORule());
              					}
              					setWithLastConsumed(
              						current,
              						"type",
              						lv_type_2_0,
              						"de.cau.cs.kieler.lustre.Lustre.IDENT");
              				
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
    // $ANTLR end "rulePackage_Provided_IO"


    // $ANTLR start "entryRuleField"
    // InternalLustre.g:3432:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalLustre.g:3432:46: (iv_ruleField= ruleField EOF )
            // InternalLustre.g:3433:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalLustre.g:3439:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalLustre.g:3445:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) ) ) )
            // InternalLustre.g:3446:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) ) )
            {
            // InternalLustre.g:3446:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) ) )
            // InternalLustre.g:3447:3: ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) )
            {
            // InternalLustre.g:3447:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:3448:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:3448:4: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:3449:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDENTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"de.cau.cs.kieler.lustre.Lustre.IDENT");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
              		
            }
            // InternalLustre.g:3469:3: ( (otherlv_2= RULE_IDENT ) )
            // InternalLustre.g:3470:4: (otherlv_2= RULE_IDENT )
            {
            // InternalLustre.g:3470:4: (otherlv_2= RULE_IDENT )
            // InternalLustre.g:3471:5: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getTypeTypeCrossReference_2_0());
              				
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleConstant_Declaration"
    // InternalLustre.g:3489:1: entryRuleConstant_Declaration returns [EObject current=null] : iv_ruleConstant_Declaration= ruleConstant_Declaration EOF ;
    public final EObject entryRuleConstant_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant_Declaration = null;


        try {
            // InternalLustre.g:3489:61: (iv_ruleConstant_Declaration= ruleConstant_Declaration EOF )
            // InternalLustre.g:3490:2: iv_ruleConstant_Declaration= ruleConstant_Declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstant_DeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConstant_Declaration=ruleConstant_Declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant_Declaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant_Declaration"


    // $ANTLR start "ruleConstant_Declaration"
    // InternalLustre.g:3496:1: ruleConstant_Declaration returns [EObject current=null] : ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) | (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' ) | (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' ) ) ;
    public final EObject ruleConstant_Declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_name_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_type_3_0 = null;

        EObject lv_expr_8_0 = null;

        EObject lv_type_13_0 = null;

        EObject lv_expr_15_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:3502:2: ( ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) | (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' ) | (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' ) ) )
            // InternalLustre.g:3503:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) | (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' ) | (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' ) )
            {
            // InternalLustre.g:3503:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) | (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' ) | (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' ) )
            int alt75=3;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==15) ) {
                int LA75_1 = input.LA(2);

                if ( (synpred93_InternalLustre()) ) {
                    alt75=1;
                }
                else if ( (synpred94_InternalLustre()) ) {
                    alt75=2;
                }
                else if ( (true) ) {
                    alt75=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalLustre.g:3504:3: (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )
                    {
                    // InternalLustre.g:3504:3: (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )
                    // InternalLustre.g:3505:4: otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getConstant_DeclarationAccess().getConstKeyword_0_0());
                      			
                    }
                    // InternalLustre.g:3509:4: ( (lv_name_1_0= RULE_IDENT ) )
                    // InternalLustre.g:3510:5: (lv_name_1_0= RULE_IDENT )
                    {
                    // InternalLustre.g:3510:5: (lv_name_1_0= RULE_IDENT )
                    // InternalLustre.g:3511:6: lv_name_1_0= RULE_IDENT
                    {
                    lv_name_1_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_0, grammarAccess.getConstant_DeclarationAccess().getNameIDENTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstant_DeclarationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getConstant_DeclarationAccess().getColonKeyword_0_2());
                      			
                    }
                    // InternalLustre.g:3531:4: ( (lv_type_3_0= ruleType ) )
                    // InternalLustre.g:3532:5: (lv_type_3_0= ruleType )
                    {
                    // InternalLustre.g:3532:5: (lv_type_3_0= ruleType )
                    // InternalLustre.g:3533:6: lv_type_3_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstant_DeclarationAccess().getTypeTypeParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_type_3_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConstant_DeclarationRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_3_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getConstant_DeclarationAccess().getSemicolonKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:3556:3: (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' )
                    {
                    // InternalLustre.g:3556:3: (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' )
                    // InternalLustre.g:3557:4: otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';'
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getConstant_DeclarationAccess().getConstKeyword_1_0());
                      			
                    }
                    // InternalLustre.g:3561:4: ( (lv_name_6_0= RULE_IDENT ) )
                    // InternalLustre.g:3562:5: (lv_name_6_0= RULE_IDENT )
                    {
                    // InternalLustre.g:3562:5: (lv_name_6_0= RULE_IDENT )
                    // InternalLustre.g:3563:6: lv_name_6_0= RULE_IDENT
                    {
                    lv_name_6_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_6_0, grammarAccess.getConstant_DeclarationAccess().getNameIDENTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstant_DeclarationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_6_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getConstant_DeclarationAccess().getEqualsSignKeyword_1_2());
                      			
                    }
                    // InternalLustre.g:3583:4: ( (lv_expr_8_0= ruleConstantExpression ) )
                    // InternalLustre.g:3584:5: (lv_expr_8_0= ruleConstantExpression )
                    {
                    // InternalLustre.g:3584:5: (lv_expr_8_0= ruleConstantExpression )
                    // InternalLustre.g:3585:6: lv_expr_8_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstant_DeclarationAccess().getExprConstantExpressionParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_expr_8_0=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConstant_DeclarationRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_8_0,
                      							"de.cau.cs.kieler.lustre.Lustre.ConstantExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getConstant_DeclarationAccess().getSemicolonKeyword_1_4());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLustre.g:3608:3: (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' )
                    {
                    // InternalLustre.g:3608:3: (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' )
                    // InternalLustre.g:3609:4: otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';'
                    {
                    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getConstant_DeclarationAccess().getConstKeyword_2_0());
                      			
                    }
                    // InternalLustre.g:3613:4: ( (lv_name_11_0= RULE_IDENT ) )
                    // InternalLustre.g:3614:5: (lv_name_11_0= RULE_IDENT )
                    {
                    // InternalLustre.g:3614:5: (lv_name_11_0= RULE_IDENT )
                    // InternalLustre.g:3615:6: lv_name_11_0= RULE_IDENT
                    {
                    lv_name_11_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_11_0, grammarAccess.getConstant_DeclarationAccess().getNameIDENTTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstant_DeclarationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_11_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,40,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getConstant_DeclarationAccess().getColonKeyword_2_2());
                      			
                    }
                    // InternalLustre.g:3635:4: ( (lv_type_13_0= ruleType ) )
                    // InternalLustre.g:3636:5: (lv_type_13_0= ruleType )
                    {
                    // InternalLustre.g:3636:5: (lv_type_13_0= ruleType )
                    // InternalLustre.g:3637:6: lv_type_13_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstant_DeclarationAccess().getTypeTypeParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_39);
                    lv_type_13_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConstant_DeclarationRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_13_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getConstant_DeclarationAccess().getEqualsSignKeyword_2_4());
                      			
                    }
                    // InternalLustre.g:3658:4: ( (lv_expr_15_0= ruleConstantExpression ) )
                    // InternalLustre.g:3659:5: (lv_expr_15_0= ruleConstantExpression )
                    {
                    // InternalLustre.g:3659:5: (lv_expr_15_0= ruleConstantExpression )
                    // InternalLustre.g:3660:6: lv_expr_15_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstant_DeclarationAccess().getExprConstantExpressionParserRuleCall_2_5_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_expr_15_0=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConstant_DeclarationRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_15_0,
                      							"de.cau.cs.kieler.lustre.Lustre.ConstantExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getConstant_DeclarationAccess().getSemicolonKeyword_2_6());
                      			
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
    // $ANTLR end "ruleConstant_Declaration"


    // $ANTLR start "entryRuleVariable_Declaration"
    // InternalLustre.g:3686:1: entryRuleVariable_Declaration returns [EObject current=null] : iv_ruleVariable_Declaration= ruleVariable_Declaration EOF ;
    public final EObject entryRuleVariable_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_Declaration = null;


        try {
            // InternalLustre.g:3686:61: (iv_ruleVariable_Declaration= ruleVariable_Declaration EOF )
            // InternalLustre.g:3687:2: iv_ruleVariable_Declaration= ruleVariable_Declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_DeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariable_Declaration=ruleVariable_Declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_Declaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable_Declaration"


    // $ANTLR start "ruleVariable_Declaration"
    // InternalLustre.g:3693:1: ruleVariable_Declaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )? ) ;
    public final EObject ruleVariable_Declaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_clock_4_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:3699:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )? ) )
            // InternalLustre.g:3700:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )? )
            {
            // InternalLustre.g:3700:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )? )
            // InternalLustre.g:3701:3: ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )?
            {
            // InternalLustre.g:3701:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:3702:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:3702:4: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:3703:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getVariable_DeclarationAccess().getNameIDENTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariable_DeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"de.cau.cs.kieler.lustre.Lustre.IDENT");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariable_DeclarationAccess().getColonKeyword_1());
              		
            }
            // InternalLustre.g:3723:3: ( (lv_type_2_0= ruleType ) )
            // InternalLustre.g:3724:4: (lv_type_2_0= ruleType )
            {
            // InternalLustre.g:3724:4: (lv_type_2_0= ruleType )
            // InternalLustre.g:3725:5: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariable_DeclarationAccess().getTypeTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_44);
            lv_type_2_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariable_DeclarationRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"de.cau.cs.kieler.lustre.Lustre.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLustre.g:3742:3: (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==41) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalLustre.g:3743:4: otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) )
                    {
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getVariable_DeclarationAccess().getWhenKeyword_3_0());
                      			
                    }
                    // InternalLustre.g:3747:4: ( (lv_clock_4_0= RULE_IDENT ) )
                    // InternalLustre.g:3748:5: (lv_clock_4_0= RULE_IDENT )
                    {
                    // InternalLustre.g:3748:5: (lv_clock_4_0= RULE_IDENT )
                    // InternalLustre.g:3749:6: lv_clock_4_0= RULE_IDENT
                    {
                    lv_clock_4_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_clock_4_0, grammarAccess.getVariable_DeclarationAccess().getClockIDENTTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariable_DeclarationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"clock",
                      							lv_clock_4_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
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
    // $ANTLR end "ruleVariable_Declaration"


    // $ANTLR start "entryRuleEquation"
    // InternalLustre.g:3770:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // InternalLustre.g:3770:49: (iv_ruleEquation= ruleEquation EOF )
            // InternalLustre.g:3771:2: iv_ruleEquation= ruleEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEquation=ruleEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // InternalLustre.g:3777:1: ruleEquation returns [EObject current=null] : ( ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_IDENT ) ) otherlv_5= '=' ( (lv_right_6_0= ruleRight_Part ) ) otherlv_7= ';' ) | ( ( (otherlv_8= RULE_IDENT ) ) otherlv_9= '=' ( (lv_right_10_0= ruleRight_Part ) ) otherlv_11= ';' ) ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_right_2_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_10_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:3783:2: ( ( ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_IDENT ) ) otherlv_5= '=' ( (lv_right_6_0= ruleRight_Part ) ) otherlv_7= ';' ) | ( ( (otherlv_8= RULE_IDENT ) ) otherlv_9= '=' ( (lv_right_10_0= ruleRight_Part ) ) otherlv_11= ';' ) ) )
            // InternalLustre.g:3784:2: ( ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_IDENT ) ) otherlv_5= '=' ( (lv_right_6_0= ruleRight_Part ) ) otherlv_7= ';' ) | ( ( (otherlv_8= RULE_IDENT ) ) otherlv_9= '=' ( (lv_right_10_0= ruleRight_Part ) ) otherlv_11= ';' ) )
            {
            // InternalLustre.g:3784:2: ( ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_IDENT ) ) otherlv_5= '=' ( (lv_right_6_0= ruleRight_Part ) ) otherlv_7= ';' ) | ( ( (otherlv_8= RULE_IDENT ) ) otherlv_9= '=' ( (lv_right_10_0= ruleRight_Part ) ) otherlv_11= ';' ) )
            int alt77=3;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_IDENT) ) {
                int LA77_1 = input.LA(2);

                if ( (synpred96_InternalLustre()) ) {
                    alt77=1;
                }
                else if ( (synpred97_InternalLustre()) ) {
                    alt77=2;
                }
                else if ( (true) ) {
                    alt77=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalLustre.g:3785:3: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' )
                    {
                    // InternalLustre.g:3785:3: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' )
                    // InternalLustre.g:3786:4: ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';'
                    {
                    // InternalLustre.g:3786:4: ( (otherlv_0= RULE_IDENT ) )
                    // InternalLustre.g:3787:5: (otherlv_0= RULE_IDENT )
                    {
                    // InternalLustre.g:3787:5: (otherlv_0= RULE_IDENT )
                    // InternalLustre.g:3788:6: otherlv_0= RULE_IDENT
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEquationRule());
                      						}
                      					
                    }
                    otherlv_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_0, grammarAccess.getEquationAccess().getLeftLustreTypedIdCrossReference_0_0_0());
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getEqualsSignKeyword_0_1());
                      			
                    }
                    // InternalLustre.g:3806:4: ( (lv_right_2_0= ruleRight_Part ) )
                    // InternalLustre.g:3807:5: (lv_right_2_0= ruleRight_Part )
                    {
                    // InternalLustre.g:3807:5: (lv_right_2_0= ruleRight_Part )
                    // InternalLustre.g:3808:6: lv_right_2_0= ruleRight_Part
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEquationAccess().getRightRight_PartParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_right_2_0=ruleRight_Part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEquationRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_2_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Right_Part");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getEquationAccess().getSemicolonKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:3831:3: ( ( (otherlv_4= RULE_IDENT ) ) otherlv_5= '=' ( (lv_right_6_0= ruleRight_Part ) ) otherlv_7= ';' )
                    {
                    // InternalLustre.g:3831:3: ( ( (otherlv_4= RULE_IDENT ) ) otherlv_5= '=' ( (lv_right_6_0= ruleRight_Part ) ) otherlv_7= ';' )
                    // InternalLustre.g:3832:4: ( (otherlv_4= RULE_IDENT ) ) otherlv_5= '=' ( (lv_right_6_0= ruleRight_Part ) ) otherlv_7= ';'
                    {
                    // InternalLustre.g:3832:4: ( (otherlv_4= RULE_IDENT ) )
                    // InternalLustre.g:3833:5: (otherlv_4= RULE_IDENT )
                    {
                    // InternalLustre.g:3833:5: (otherlv_4= RULE_IDENT )
                    // InternalLustre.g:3834:6: otherlv_4= RULE_IDENT
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEquationRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getEquationAccess().getLeftLustreTypedValuedIdsCrossReference_1_0_0());
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getEquationAccess().getEqualsSignKeyword_1_1());
                      			
                    }
                    // InternalLustre.g:3852:4: ( (lv_right_6_0= ruleRight_Part ) )
                    // InternalLustre.g:3853:5: (lv_right_6_0= ruleRight_Part )
                    {
                    // InternalLustre.g:3853:5: (lv_right_6_0= ruleRight_Part )
                    // InternalLustre.g:3854:6: lv_right_6_0= ruleRight_Part
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEquationAccess().getRightRight_PartParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_right_6_0=ruleRight_Part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEquationRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_6_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Right_Part");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getEquationAccess().getSemicolonKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLustre.g:3877:3: ( ( (otherlv_8= RULE_IDENT ) ) otherlv_9= '=' ( (lv_right_10_0= ruleRight_Part ) ) otherlv_11= ';' )
                    {
                    // InternalLustre.g:3877:3: ( ( (otherlv_8= RULE_IDENT ) ) otherlv_9= '=' ( (lv_right_10_0= ruleRight_Part ) ) otherlv_11= ';' )
                    // InternalLustre.g:3878:4: ( (otherlv_8= RULE_IDENT ) ) otherlv_9= '=' ( (lv_right_10_0= ruleRight_Part ) ) otherlv_11= ';'
                    {
                    // InternalLustre.g:3878:4: ( (otherlv_8= RULE_IDENT ) )
                    // InternalLustre.g:3879:5: (otherlv_8= RULE_IDENT )
                    {
                    // InternalLustre.g:3879:5: (otherlv_8= RULE_IDENT )
                    // InternalLustre.g:3880:6: otherlv_8= RULE_IDENT
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEquationRule());
                      						}
                      					
                    }
                    otherlv_8=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_8, grammarAccess.getEquationAccess().getLeftLustreClockedIdDeclarationCrossReference_2_0_0());
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getEquationAccess().getEqualsSignKeyword_2_1());
                      			
                    }
                    // InternalLustre.g:3898:4: ( (lv_right_10_0= ruleRight_Part ) )
                    // InternalLustre.g:3899:5: (lv_right_10_0= ruleRight_Part )
                    {
                    // InternalLustre.g:3899:5: (lv_right_10_0= ruleRight_Part )
                    // InternalLustre.g:3900:6: lv_right_10_0= ruleRight_Part
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEquationAccess().getRightRight_PartParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_right_10_0=ruleRight_Part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEquationRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_10_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Right_Part");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getEquationAccess().getSemicolonKeyword_2_3());
                      			
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
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleAssertion"
    // InternalLustre.g:3926:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalLustre.g:3926:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalLustre.g:3927:2: iv_ruleAssertion= ruleAssertion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // InternalLustre.g:3933:1: ruleAssertion returns [EObject current=null] : (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:3939:2: ( (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' ) )
            // InternalLustre.g:3940:2: (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' )
            {
            // InternalLustre.g:3940:2: (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' )
            // InternalLustre.g:3941:3: otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAssertionAccess().getAssertKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssertionAccess().getExpressionParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_8);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAssertionAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

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
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "entryRuleAutomaton"
    // InternalLustre.g:3964:1: entryRuleAutomaton returns [EObject current=null] : iv_ruleAutomaton= ruleAutomaton EOF ;
    public final EObject entryRuleAutomaton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomaton = null;


        try {
            // InternalLustre.g:3964:50: (iv_ruleAutomaton= ruleAutomaton EOF )
            // InternalLustre.g:3965:2: iv_ruleAutomaton= ruleAutomaton EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAutomatonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAutomaton=ruleAutomaton();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAutomaton; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutomaton"


    // $ANTLR start "ruleAutomaton"
    // InternalLustre.g:3971:1: ruleAutomaton returns [EObject current=null] : (otherlv_0= 'automaton' ( (lv_states_1_0= ruleAState ) ) (otherlv_2= '|' ( (lv_states_3_0= ruleAState ) ) )* otherlv_4= 'end' otherlv_5= ';' ) ;
    public final EObject ruleAutomaton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_states_1_0 = null;

        EObject lv_states_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:3977:2: ( (otherlv_0= 'automaton' ( (lv_states_1_0= ruleAState ) ) (otherlv_2= '|' ( (lv_states_3_0= ruleAState ) ) )* otherlv_4= 'end' otherlv_5= ';' ) )
            // InternalLustre.g:3978:2: (otherlv_0= 'automaton' ( (lv_states_1_0= ruleAState ) ) (otherlv_2= '|' ( (lv_states_3_0= ruleAState ) ) )* otherlv_4= 'end' otherlv_5= ';' )
            {
            // InternalLustre.g:3978:2: (otherlv_0= 'automaton' ( (lv_states_1_0= ruleAState ) ) (otherlv_2= '|' ( (lv_states_3_0= ruleAState ) ) )* otherlv_4= 'end' otherlv_5= ';' )
            // InternalLustre.g:3979:3: otherlv_0= 'automaton' ( (lv_states_1_0= ruleAState ) ) (otherlv_2= '|' ( (lv_states_3_0= ruleAState ) ) )* otherlv_4= 'end' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAutomatonAccess().getAutomatonKeyword_0());
              		
            }
            // InternalLustre.g:3983:3: ( (lv_states_1_0= ruleAState ) )
            // InternalLustre.g:3984:4: (lv_states_1_0= ruleAState )
            {
            // InternalLustre.g:3984:4: (lv_states_1_0= ruleAState )
            // InternalLustre.g:3985:5: lv_states_1_0= ruleAState
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAutomatonAccess().getStatesAStateParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_62);
            lv_states_1_0=ruleAState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAutomatonRule());
              					}
              					add(
              						current,
              						"states",
              						lv_states_1_0,
              						"de.cau.cs.kieler.lustre.Lustre.AState");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLustre.g:4002:3: (otherlv_2= '|' ( (lv_states_3_0= ruleAState ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==52) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalLustre.g:4003:4: otherlv_2= '|' ( (lv_states_3_0= ruleAState ) )
            	    {
            	    otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAutomatonAccess().getVerticalLineKeyword_2_0());
            	      			
            	    }
            	    // InternalLustre.g:4007:4: ( (lv_states_3_0= ruleAState ) )
            	    // InternalLustre.g:4008:5: (lv_states_3_0= ruleAState )
            	    {
            	    // InternalLustre.g:4008:5: (lv_states_3_0= ruleAState )
            	    // InternalLustre.g:4009:6: lv_states_3_0= ruleAState
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAutomatonAccess().getStatesAStateParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_62);
            	    lv_states_3_0=ruleAState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAutomatonRule());
            	      						}
            	      						add(
            	      							current,
            	      							"states",
            	      							lv_states_3_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.AState");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAutomatonAccess().getEndKeyword_3());
              		
            }
            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAutomatonAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

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
    // $ANTLR end "ruleAutomaton"


    // $ANTLR start "entryRuleAState"
    // InternalLustre.g:4039:1: entryRuleAState returns [EObject current=null] : iv_ruleAState= ruleAState EOF ;
    public final EObject entryRuleAState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAState = null;


        try {
            // InternalLustre.g:4039:47: (iv_ruleAState= ruleAState EOF )
            // InternalLustre.g:4040:2: iv_ruleAState= ruleAState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAStateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAState=ruleAState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAState; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAState"


    // $ANTLR start "ruleAState"
    // InternalLustre.g:4046:1: ruleAState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '->' ( ( (lv_equations_2_0= ruleEquation ) ) | ( (lv_assertions_3_0= ruleAssertion ) ) | ( (lv_automatons_4_0= ruleAutomaton ) ) )* ( (lv_transitions_5_0= ruleATransition ) )+ ) ;
    public final EObject ruleAState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_equations_2_0 = null;

        EObject lv_assertions_3_0 = null;

        EObject lv_automatons_4_0 = null;

        EObject lv_transitions_5_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:4052:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '->' ( ( (lv_equations_2_0= ruleEquation ) ) | ( (lv_assertions_3_0= ruleAssertion ) ) | ( (lv_automatons_4_0= ruleAutomaton ) ) )* ( (lv_transitions_5_0= ruleATransition ) )+ ) )
            // InternalLustre.g:4053:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '->' ( ( (lv_equations_2_0= ruleEquation ) ) | ( (lv_assertions_3_0= ruleAssertion ) ) | ( (lv_automatons_4_0= ruleAutomaton ) ) )* ( (lv_transitions_5_0= ruleATransition ) )+ )
            {
            // InternalLustre.g:4053:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '->' ( ( (lv_equations_2_0= ruleEquation ) ) | ( (lv_assertions_3_0= ruleAssertion ) ) | ( (lv_automatons_4_0= ruleAutomaton ) ) )* ( (lv_transitions_5_0= ruleATransition ) )+ )
            // InternalLustre.g:4054:3: ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '->' ( ( (lv_equations_2_0= ruleEquation ) ) | ( (lv_assertions_3_0= ruleAssertion ) ) | ( (lv_automatons_4_0= ruleAutomaton ) ) )* ( (lv_transitions_5_0= ruleATransition ) )+
            {
            // InternalLustre.g:4054:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:4055:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:4055:4: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:4056:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getAStateAccess().getNameIDENTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAStateRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"de.cau.cs.kieler.lustre.Lustre.IDENT");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAStateAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalLustre.g:4076:3: ( ( (lv_equations_2_0= ruleEquation ) ) | ( (lv_assertions_3_0= ruleAssertion ) ) | ( (lv_automatons_4_0= ruleAutomaton ) ) )*
            loop79:
            do {
                int alt79=4;
                switch ( input.LA(1) ) {
                case RULE_IDENT:
                    {
                    alt79=1;
                    }
                    break;
                case 50:
                    {
                    alt79=2;
                    }
                    break;
                case 51:
                    {
                    alt79=3;
                    }
                    break;

                }

                switch (alt79) {
            	case 1 :
            	    // InternalLustre.g:4077:4: ( (lv_equations_2_0= ruleEquation ) )
            	    {
            	    // InternalLustre.g:4077:4: ( (lv_equations_2_0= ruleEquation ) )
            	    // InternalLustre.g:4078:5: (lv_equations_2_0= ruleEquation )
            	    {
            	    // InternalLustre.g:4078:5: (lv_equations_2_0= ruleEquation )
            	    // InternalLustre.g:4079:6: lv_equations_2_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAStateAccess().getEquationsEquationParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_64);
            	    lv_equations_2_0=ruleEquation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAStateRule());
            	      						}
            	      						add(
            	      							current,
            	      							"equations",
            	      							lv_equations_2_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.Equation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLustre.g:4097:4: ( (lv_assertions_3_0= ruleAssertion ) )
            	    {
            	    // InternalLustre.g:4097:4: ( (lv_assertions_3_0= ruleAssertion ) )
            	    // InternalLustre.g:4098:5: (lv_assertions_3_0= ruleAssertion )
            	    {
            	    // InternalLustre.g:4098:5: (lv_assertions_3_0= ruleAssertion )
            	    // InternalLustre.g:4099:6: lv_assertions_3_0= ruleAssertion
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAStateAccess().getAssertionsAssertionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_64);
            	    lv_assertions_3_0=ruleAssertion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAStateRule());
            	      						}
            	      						add(
            	      							current,
            	      							"assertions",
            	      							lv_assertions_3_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.Assertion");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLustre.g:4117:4: ( (lv_automatons_4_0= ruleAutomaton ) )
            	    {
            	    // InternalLustre.g:4117:4: ( (lv_automatons_4_0= ruleAutomaton ) )
            	    // InternalLustre.g:4118:5: (lv_automatons_4_0= ruleAutomaton )
            	    {
            	    // InternalLustre.g:4118:5: (lv_automatons_4_0= ruleAutomaton )
            	    // InternalLustre.g:4119:6: lv_automatons_4_0= ruleAutomaton
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAStateAccess().getAutomatonsAutomatonParserRuleCall_2_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_64);
            	    lv_automatons_4_0=ruleAutomaton();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAStateRule());
            	      						}
            	      						add(
            	      							current,
            	      							"automatons",
            	      							lv_automatons_4_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.Automaton");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // InternalLustre.g:4137:3: ( (lv_transitions_5_0= ruleATransition ) )+
            int cnt80=0;
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( ((LA80_0>=54 && LA80_0<=55)) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalLustre.g:4138:4: (lv_transitions_5_0= ruleATransition )
            	    {
            	    // InternalLustre.g:4138:4: (lv_transitions_5_0= ruleATransition )
            	    // InternalLustre.g:4139:5: lv_transitions_5_0= ruleATransition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAStateAccess().getTransitionsATransitionParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_65);
            	    lv_transitions_5_0=ruleATransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAStateRule());
            	      					}
            	      					add(
            	      						current,
            	      						"transitions",
            	      						lv_transitions_5_0,
            	      						"de.cau.cs.kieler.lustre.Lustre.ATransition");
            	      					afterParserOrEnumRuleCall();
            	      				
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


            }

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
    // $ANTLR end "ruleAState"


    // $ANTLR start "entryRuleATransition"
    // InternalLustre.g:4160:1: entryRuleATransition returns [EObject current=null] : iv_ruleATransition= ruleATransition EOF ;
    public final EObject entryRuleATransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATransition = null;


        try {
            // InternalLustre.g:4160:52: (iv_ruleATransition= ruleATransition EOF )
            // InternalLustre.g:4161:2: iv_ruleATransition= ruleATransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getATransitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleATransition=ruleATransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleATransition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleATransition"


    // $ANTLR start "ruleATransition"
    // InternalLustre.g:4167:1: ruleATransition returns [EObject current=null] : ( (otherlv_0= 'until' | ( (lv_strong_1_0= 'unless' ) ) ) ( (lv_condition_2_0= ruleExpression ) ) (otherlv_3= 'then' | ( (lv_history_4_0= 'continue' ) ) ) ( (otherlv_5= RULE_IDENT ) ) otherlv_6= ';' ) ;
    public final EObject ruleATransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_strong_1_0=null;
        Token otherlv_3=null;
        Token lv_history_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:4173:2: ( ( (otherlv_0= 'until' | ( (lv_strong_1_0= 'unless' ) ) ) ( (lv_condition_2_0= ruleExpression ) ) (otherlv_3= 'then' | ( (lv_history_4_0= 'continue' ) ) ) ( (otherlv_5= RULE_IDENT ) ) otherlv_6= ';' ) )
            // InternalLustre.g:4174:2: ( (otherlv_0= 'until' | ( (lv_strong_1_0= 'unless' ) ) ) ( (lv_condition_2_0= ruleExpression ) ) (otherlv_3= 'then' | ( (lv_history_4_0= 'continue' ) ) ) ( (otherlv_5= RULE_IDENT ) ) otherlv_6= ';' )
            {
            // InternalLustre.g:4174:2: ( (otherlv_0= 'until' | ( (lv_strong_1_0= 'unless' ) ) ) ( (lv_condition_2_0= ruleExpression ) ) (otherlv_3= 'then' | ( (lv_history_4_0= 'continue' ) ) ) ( (otherlv_5= RULE_IDENT ) ) otherlv_6= ';' )
            // InternalLustre.g:4175:3: (otherlv_0= 'until' | ( (lv_strong_1_0= 'unless' ) ) ) ( (lv_condition_2_0= ruleExpression ) ) (otherlv_3= 'then' | ( (lv_history_4_0= 'continue' ) ) ) ( (otherlv_5= RULE_IDENT ) ) otherlv_6= ';'
            {
            // InternalLustre.g:4175:3: (otherlv_0= 'until' | ( (lv_strong_1_0= 'unless' ) ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==54) ) {
                alt81=1;
            }
            else if ( (LA81_0==55) ) {
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
                    // InternalLustre.g:4176:4: otherlv_0= 'until'
                    {
                    otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getATransitionAccess().getUntilKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalLustre.g:4181:4: ( (lv_strong_1_0= 'unless' ) )
                    {
                    // InternalLustre.g:4181:4: ( (lv_strong_1_0= 'unless' ) )
                    // InternalLustre.g:4182:5: (lv_strong_1_0= 'unless' )
                    {
                    // InternalLustre.g:4182:5: (lv_strong_1_0= 'unless' )
                    // InternalLustre.g:4183:6: lv_strong_1_0= 'unless'
                    {
                    lv_strong_1_0=(Token)match(input,55,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_strong_1_0, grammarAccess.getATransitionAccess().getStrongUnlessKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getATransitionRule());
                      						}
                      						setWithLastConsumed(current, "strong", true, "unless");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalLustre.g:4196:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalLustre.g:4197:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalLustre.g:4197:4: (lv_condition_2_0= ruleExpression )
            // InternalLustre.g:4198:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getATransitionAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_66);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getATransitionRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"de.cau.cs.kieler.lustre.Lustre.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLustre.g:4215:3: (otherlv_3= 'then' | ( (lv_history_4_0= 'continue' ) ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==56) ) {
                alt82=1;
            }
            else if ( (LA82_0==57) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalLustre.g:4216:4: otherlv_3= 'then'
                    {
                    otherlv_3=(Token)match(input,56,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getATransitionAccess().getThenKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalLustre.g:4221:4: ( (lv_history_4_0= 'continue' ) )
                    {
                    // InternalLustre.g:4221:4: ( (lv_history_4_0= 'continue' ) )
                    // InternalLustre.g:4222:5: (lv_history_4_0= 'continue' )
                    {
                    // InternalLustre.g:4222:5: (lv_history_4_0= 'continue' )
                    // InternalLustre.g:4223:6: lv_history_4_0= 'continue'
                    {
                    lv_history_4_0=(Token)match(input,57,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_history_4_0, grammarAccess.getATransitionAccess().getHistoryContinueKeyword_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getATransitionRule());
                      						}
                      						setWithLastConsumed(current, "history", true, "continue");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalLustre.g:4236:3: ( (otherlv_5= RULE_IDENT ) )
            // InternalLustre.g:4237:4: (otherlv_5= RULE_IDENT )
            {
            // InternalLustre.g:4237:4: (otherlv_5= RULE_IDENT )
            // InternalLustre.g:4238:5: otherlv_5= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getATransitionRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getATransitionAccess().getNextStateAStateCrossReference_3_0());
              				
            }

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getATransitionAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

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
    // $ANTLR end "ruleATransition"


    // $ANTLR start "entryRuleLeft_List"
    // InternalLustre.g:4260:1: entryRuleLeft_List returns [EObject current=null] : iv_ruleLeft_List= ruleLeft_List EOF ;
    public final EObject entryRuleLeft_List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft_List = null;


        try {
            // InternalLustre.g:4260:50: (iv_ruleLeft_List= ruleLeft_List EOF )
            // InternalLustre.g:4261:2: iv_ruleLeft_List= ruleLeft_List EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeft_ListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLeft_List=ruleLeft_List();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeft_List; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeft_List"


    // $ANTLR start "ruleLeft_List"
    // InternalLustre.g:4267:1: ruleLeft_List returns [EObject current=null] : ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* ) ;
    public final EObject ruleLeft_List() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_id_0_0 = null;

        EObject lv_id_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:4273:2: ( ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* ) )
            // InternalLustre.g:4274:2: ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* )
            {
            // InternalLustre.g:4274:2: ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* )
            // InternalLustre.g:4275:3: ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )*
            {
            // InternalLustre.g:4275:3: ( (lv_id_0_0= ruleLeft ) )
            // InternalLustre.g:4276:4: (lv_id_0_0= ruleLeft )
            {
            // InternalLustre.g:4276:4: (lv_id_0_0= ruleLeft )
            // InternalLustre.g:4277:5: lv_id_0_0= ruleLeft
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLeft_ListAccess().getIdLeftParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_67);
            lv_id_0_0=ruleLeft();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLeft_ListRule());
              					}
              					add(
              						current,
              						"id",
              						lv_id_0_0,
              						"de.cau.cs.kieler.lustre.Lustre.Left");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLustre.g:4294:3: (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==24) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalLustre.g:4295:4: otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getLeft_ListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalLustre.g:4299:4: ( (lv_id_2_0= ruleLeft ) )
            	    // InternalLustre.g:4300:5: (lv_id_2_0= ruleLeft )
            	    {
            	    // InternalLustre.g:4300:5: (lv_id_2_0= ruleLeft )
            	    // InternalLustre.g:4301:6: lv_id_2_0= ruleLeft
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLeft_ListAccess().getIdLeftParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_67);
            	    lv_id_2_0=ruleLeft();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLeft_ListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"id",
            	      							lv_id_2_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.Left");
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


            }


            }

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
    // $ANTLR end "ruleLeft_List"


    // $ANTLR start "entryRuleLeft"
    // InternalLustre.g:4323:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // InternalLustre.g:4323:45: (iv_ruleLeft= ruleLeft EOF )
            // InternalLustre.g:4324:2: iv_ruleLeft= ruleLeft EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLeft=ruleLeft();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeft; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // InternalLustre.g:4330:1: ruleLeft returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )? ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_selector_1_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:4336:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )? ) )
            // InternalLustre.g:4337:2: ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )? )
            {
            // InternalLustre.g:4337:2: ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )? )
            // InternalLustre.g:4338:3: ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )?
            {
            // InternalLustre.g:4338:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:4339:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:4339:4: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:4340:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getLeftAccess().getNameIDENTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLeftRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"de.cau.cs.kieler.lustre.Lustre.IDENT");
              				
            }

            }


            }

            // InternalLustre.g:4356:3: ( (lv_selector_1_0= ruleSelector ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==37||LA84_0==58) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalLustre.g:4357:4: (lv_selector_1_0= ruleSelector )
                    {
                    // InternalLustre.g:4357:4: (lv_selector_1_0= ruleSelector )
                    // InternalLustre.g:4358:5: lv_selector_1_0= ruleSelector
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLeftAccess().getSelectorSelectorParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_selector_1_0=ruleSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLeftRule());
                      					}
                      					set(
                      						current,
                      						"selector",
                      						lv_selector_1_0,
                      						"de.cau.cs.kieler.lustre.Lustre.Selector");
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
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleSelector"
    // InternalLustre.g:4379:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalLustre.g:4379:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalLustre.g:4380:2: iv_ruleSelector= ruleSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelector; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalLustre.g:4386:1: ruleSelector returns [EObject current=null] : ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_begin_3_0 = null;

        EObject lv_end_4_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:4392:2: ( ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) ) )
            // InternalLustre.g:4393:2: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) )
            {
            // InternalLustre.g:4393:2: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==37) ) {
                alt86=1;
            }
            else if ( (LA86_0==58) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalLustre.g:4394:3: (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) )
                    {
                    // InternalLustre.g:4394:3: (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) )
                    // InternalLustre.g:4395:4: otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) )
                    {
                    otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getFullStopKeyword_0_0());
                      			
                    }
                    // InternalLustre.g:4399:4: ( (lv_name_1_0= RULE_IDENT ) )
                    // InternalLustre.g:4400:5: (lv_name_1_0= RULE_IDENT )
                    {
                    // InternalLustre.g:4400:5: (lv_name_1_0= RULE_IDENT )
                    // InternalLustre.g:4401:6: lv_name_1_0= RULE_IDENT
                    {
                    lv_name_1_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_0, grammarAccess.getSelectorAccess().getNameIDENTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSelectorRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:4419:3: (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' )
                    {
                    // InternalLustre.g:4419:3: (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' )
                    // InternalLustre.g:4420:4: otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']'
                    {
                    otherlv_2=(Token)match(input,58,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalLustre.g:4424:4: ( (lv_begin_3_0= ruleExpression ) )
                    // InternalLustre.g:4425:5: (lv_begin_3_0= ruleExpression )
                    {
                    // InternalLustre.g:4425:5: (lv_begin_3_0= ruleExpression )
                    // InternalLustre.g:4426:6: lv_begin_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSelectorAccess().getBeginExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_69);
                    lv_begin_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSelectorRule());
                      						}
                      						set(
                      							current,
                      							"begin",
                      							lv_begin_3_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalLustre.g:4443:4: ( (lv_end_4_0= ruleSelTrancheEnd ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==60) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalLustre.g:4444:5: (lv_end_4_0= ruleSelTrancheEnd )
                            {
                            // InternalLustre.g:4444:5: (lv_end_4_0= ruleSelTrancheEnd )
                            // InternalLustre.g:4445:6: lv_end_4_0= ruleSelTrancheEnd
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getSelectorAccess().getEndSelTrancheEndParserRuleCall_1_2_0());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_70);
                            lv_end_4_0=ruleSelTrancheEnd();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getSelectorRule());
                              						}
                              						set(
                              							current,
                              							"end",
                              							lv_end_4_0,
                              							"de.cau.cs.kieler.lustre.Lustre.SelTrancheEnd");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSelectorAccess().getRightSquareBracketKeyword_1_3());
                      			
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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleSelTrancheEnd"
    // InternalLustre.g:4471:1: entryRuleSelTrancheEnd returns [EObject current=null] : iv_ruleSelTrancheEnd= ruleSelTrancheEnd EOF ;
    public final EObject entryRuleSelTrancheEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelTrancheEnd = null;


        try {
            // InternalLustre.g:4471:54: (iv_ruleSelTrancheEnd= ruleSelTrancheEnd EOF )
            // InternalLustre.g:4472:2: iv_ruleSelTrancheEnd= ruleSelTrancheEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelTrancheEndRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSelTrancheEnd=ruleSelTrancheEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelTrancheEnd; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelTrancheEnd"


    // $ANTLR start "ruleSelTrancheEnd"
    // InternalLustre.g:4478:1: ruleSelTrancheEnd returns [EObject current=null] : (otherlv_0= '..' this_Expression_1= ruleExpression ) ;
    public final EObject ruleSelTrancheEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:4484:2: ( (otherlv_0= '..' this_Expression_1= ruleExpression ) )
            // InternalLustre.g:4485:2: (otherlv_0= '..' this_Expression_1= ruleExpression )
            {
            // InternalLustre.g:4485:2: (otherlv_0= '..' this_Expression_1= ruleExpression )
            // InternalLustre.g:4486:3: otherlv_0= '..' this_Expression_1= ruleExpression
            {
            otherlv_0=(Token)match(input,60,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSelTrancheEndAccess().getFullStopFullStopKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSelTrancheEndAccess().getExpressionParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression_1;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

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
    // $ANTLR end "ruleSelTrancheEnd"


    // $ANTLR start "entryRuleRight_Part"
    // InternalLustre.g:4505:1: entryRuleRight_Part returns [EObject current=null] : iv_ruleRight_Part= ruleRight_Part EOF ;
    public final EObject entryRuleRight_Part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight_Part = null;


        try {
            // InternalLustre.g:4505:51: (iv_ruleRight_Part= ruleRight_Part EOF )
            // InternalLustre.g:4506:2: iv_ruleRight_Part= ruleRight_Part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRight_PartRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRight_Part=ruleRight_Part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRight_Part; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRight_Part"


    // $ANTLR start "ruleRight_Part"
    // InternalLustre.g:4512:1: ruleRight_Part returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleRight_Part() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:4518:2: (this_Expression_0= ruleExpression )
            // InternalLustre.g:4519:2: this_Expression_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getRight_PartAccess().getExpressionParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // $ANTLR end "ruleRight_Part"


    // $ANTLR start "entryRuleExpression"
    // InternalLustre.g:4533:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalLustre.g:4533:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalLustre.g:4534:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalLustre.g:4540:1: ruleExpression returns [EObject current=null] : ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ifexpr_2_0 = null;

        EObject lv_thenexpr_4_0 = null;

        EObject lv_elseexpr_6_0 = null;

        EObject this_Fby_7 = null;



        	enterRule();

        try {
            // InternalLustre.g:4546:2: ( ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby ) )
            // InternalLustre.g:4547:2: ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby )
            {
            // InternalLustre.g:4547:2: ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==61) ) {
                alt87=1;
            }
            else if ( ((LA87_0>=RULE_IDENT && LA87_0<=RULE_INT)||LA87_0==38||LA87_0==42||LA87_0==73||(LA87_0>=76 && LA87_0<=77)) ) {
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
                    // InternalLustre.g:4548:3: ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) )
                    {
                    // InternalLustre.g:4548:3: ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) )
                    // InternalLustre.g:4549:4: () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) )
                    {
                    // InternalLustre.g:4549:4: ()
                    // InternalLustre.g:4550:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExpressionAccess().getIfThenElseAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,61,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getIfKeyword_0_1());
                      			
                    }
                    // InternalLustre.g:4563:4: ( (lv_ifexpr_2_0= ruleExpression ) )
                    // InternalLustre.g:4564:5: (lv_ifexpr_2_0= ruleExpression )
                    {
                    // InternalLustre.g:4564:5: (lv_ifexpr_2_0= ruleExpression )
                    // InternalLustre.g:4565:6: lv_ifexpr_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getIfexprExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_71);
                    lv_ifexpr_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"ifexpr",
                      							lv_ifexpr_2_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,56,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getThenKeyword_0_3());
                      			
                    }
                    // InternalLustre.g:4586:4: ( (lv_thenexpr_4_0= ruleExpression ) )
                    // InternalLustre.g:4587:5: (lv_thenexpr_4_0= ruleExpression )
                    {
                    // InternalLustre.g:4587:5: (lv_thenexpr_4_0= ruleExpression )
                    // InternalLustre.g:4588:6: lv_thenexpr_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getThenexprExpressionParserRuleCall_0_4_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_72);
                    lv_thenexpr_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"thenexpr",
                      							lv_thenexpr_4_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,62,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getElseKeyword_0_5());
                      			
                    }
                    // InternalLustre.g:4609:4: ( (lv_elseexpr_6_0= ruleExpression ) )
                    // InternalLustre.g:4610:5: (lv_elseexpr_6_0= ruleExpression )
                    {
                    // InternalLustre.g:4610:5: (lv_elseexpr_6_0= ruleExpression )
                    // InternalLustre.g:4611:6: lv_elseexpr_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getElseexprExpressionParserRuleCall_0_6_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_elseexpr_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"elseexpr",
                      							lv_elseexpr_6_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:4630:3: this_Fby_7= ruleFby
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getFbyParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Fby_7=ruleFby();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Fby_7;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleFby"
    // InternalLustre.g:4645:1: entryRuleFby returns [EObject current=null] : iv_ruleFby= ruleFby EOF ;
    public final EObject entryRuleFby() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFby = null;


        try {
            // InternalLustre.g:4645:44: (iv_ruleFby= ruleFby EOF )
            // InternalLustre.g:4646:2: iv_ruleFby= ruleFby EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFbyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFby=ruleFby();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFby; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFby"


    // $ANTLR start "ruleFby"
    // InternalLustre.g:4652:1: ruleFby returns [EObject current=null] : (this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )? ) ;
    public final EObject ruleFby() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Arrow_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:4658:2: ( (this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )? ) )
            // InternalLustre.g:4659:2: (this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )? )
            {
            // InternalLustre.g:4659:2: (this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )? )
            // InternalLustre.g:4660:3: this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFbyAccess().getArrowParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_73);
            this_Arrow_0=ruleArrow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Arrow_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLustre.g:4671:3: ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==63) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalLustre.g:4672:4: () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+
                    {
                    // InternalLustre.g:4672:4: ()
                    // InternalLustre.g:4673:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getFbyAccess().getFbySubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalLustre.g:4682:4: (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+
                    int cnt88=0;
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==63) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalLustre.g:4683:5: otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) )
                    	    {
                    	    otherlv_2=(Token)match(input,63,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getFbyAccess().getFbyKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalLustre.g:4687:5: ( (lv_subExpressions_3_0= ruleArrow ) )
                    	    // InternalLustre.g:4688:6: (lv_subExpressions_3_0= ruleArrow )
                    	    {
                    	    // InternalLustre.g:4688:6: (lv_subExpressions_3_0= ruleArrow )
                    	    // InternalLustre.g:4689:7: lv_subExpressions_3_0= ruleArrow
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFbyAccess().getSubExpressionsArrowParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_73);
                    	    lv_subExpressions_3_0=ruleArrow();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFbyRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_3_0,
                    	      								"de.cau.cs.kieler.lustre.Lustre.Arrow");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt88 >= 1 ) break loop88;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(88, input);
                                throw eee;
                        }
                        cnt88++;
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
    // $ANTLR end "ruleFby"


    // $ANTLR start "entryRuleArrow"
    // InternalLustre.g:4712:1: entryRuleArrow returns [EObject current=null] : iv_ruleArrow= ruleArrow EOF ;
    public final EObject entryRuleArrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrow = null;


        try {
            // InternalLustre.g:4712:46: (iv_ruleArrow= ruleArrow EOF )
            // InternalLustre.g:4713:2: iv_ruleArrow= ruleArrow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrowRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArrow=ruleArrow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrow; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrow"


    // $ANTLR start "ruleArrow"
    // InternalLustre.g:4719:1: ruleArrow returns [EObject current=null] : (this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )? ) ;
    public final EObject ruleArrow() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:4725:2: ( (this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )? ) )
            // InternalLustre.g:4726:2: (this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )? )
            {
            // InternalLustre.g:4726:2: (this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )? )
            // InternalLustre.g:4727:3: this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArrowAccess().getOrParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_74);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Or_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLustre.g:4738:3: ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==53) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalLustre.g:4739:4: () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+
                    {
                    // InternalLustre.g:4739:4: ()
                    // InternalLustre.g:4740:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getArrowAccess().getArrowSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalLustre.g:4749:4: (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+
                    int cnt90=0;
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==53) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalLustre.g:4750:5: otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) )
                    	    {
                    	    otherlv_2=(Token)match(input,53,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getArrowAccess().getHyphenMinusGreaterThanSignKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalLustre.g:4754:5: ( (lv_subExpressions_3_0= ruleOr ) )
                    	    // InternalLustre.g:4755:6: (lv_subExpressions_3_0= ruleOr )
                    	    {
                    	    // InternalLustre.g:4755:6: (lv_subExpressions_3_0= ruleOr )
                    	    // InternalLustre.g:4756:7: lv_subExpressions_3_0= ruleOr
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getArrowAccess().getSubExpressionsOrParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_74);
                    	    lv_subExpressions_3_0=ruleOr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getArrowRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_3_0,
                    	      								"de.cau.cs.kieler.lustre.Lustre.Or");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt90 >= 1 ) break loop90;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(90, input);
                                throw eee;
                        }
                        cnt90++;
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
    // $ANTLR end "ruleArrow"


    // $ANTLR start "entryRuleOr"
    // InternalLustre.g:4779:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalLustre.g:4779:43: (iv_ruleOr= ruleOr EOF )
            // InternalLustre.g:4780:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalLustre.g:4786:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )? ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:4792:2: ( (this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )? ) )
            // InternalLustre.g:4793:2: (this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )? )
            {
            // InternalLustre.g:4793:2: (this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )? )
            // InternalLustre.g:4794:3: this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_75);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLustre.g:4805:3: ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==64) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalLustre.g:4806:4: () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+
                    {
                    // InternalLustre.g:4806:4: ()
                    // InternalLustre.g:4807:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getOrAccess().getOrSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalLustre.g:4816:4: (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+
                    int cnt92=0;
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==64) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalLustre.g:4817:5: otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) )
                    	    {
                    	    otherlv_2=(Token)match(input,64,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalLustre.g:4821:5: ( (lv_subExpressions_3_0= ruleAnd ) )
                    	    // InternalLustre.g:4822:6: (lv_subExpressions_3_0= ruleAnd )
                    	    {
                    	    // InternalLustre.g:4822:6: (lv_subExpressions_3_0= ruleAnd )
                    	    // InternalLustre.g:4823:7: lv_subExpressions_3_0= ruleAnd
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOrAccess().getSubExpressionsAndParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_75);
                    	    lv_subExpressions_3_0=ruleAnd();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOrRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_3_0,
                    	      								"de.cau.cs.kieler.lustre.Lustre.And");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalLustre.g:4846:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalLustre.g:4846:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalLustre.g:4847:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalLustre.g:4853:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )? ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:4859:2: ( (this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )? ) )
            // InternalLustre.g:4860:2: (this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )? )
            {
            // InternalLustre.g:4860:2: (this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )? )
            // InternalLustre.g:4861:3: this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_76);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLustre.g:4872:3: ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==65) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalLustre.g:4873:4: () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+
                    {
                    // InternalLustre.g:4873:4: ()
                    // InternalLustre.g:4874:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getAndAccess().getAndSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalLustre.g:4883:4: (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+
                    int cnt94=0;
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==65) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // InternalLustre.g:4884:5: otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) )
                    	    {
                    	    otherlv_2=(Token)match(input,65,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalLustre.g:4888:5: ( (lv_subExpressions_3_0= ruleEquality ) )
                    	    // InternalLustre.g:4889:6: (lv_subExpressions_3_0= ruleEquality )
                    	    {
                    	    // InternalLustre.g:4889:6: (lv_subExpressions_3_0= ruleEquality )
                    	    // InternalLustre.g:4890:7: lv_subExpressions_3_0= ruleEquality
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAndAccess().getSubExpressionsEqualityParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_76);
                    	    lv_subExpressions_3_0=ruleEquality();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAndRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_3_0,
                    	      								"de.cau.cs.kieler.lustre.Lustre.Equality");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt94 >= 1 ) break loop94;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(94, input);
                                throw eee;
                        }
                        cnt94++;
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalLustre.g:4913:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalLustre.g:4913:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalLustre.g:4914:2: iv_ruleEquality= ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquality; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalLustre.g:4920:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:4926:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalLustre.g:4927:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalLustre.g:4927:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalLustre.g:4928:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_77);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLustre.g:4939:3: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop97:
            do {
                int alt97=2;
                alt97 = dfa97.predict(input);
                switch (alt97) {
            	case 1 :
            	    // InternalLustre.g:4940:4: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalLustre.g:4940:4: ()
            	    // InternalLustre.g:4941:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalLustre.g:4950:4: ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) )
            	    // InternalLustre.g:4951:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    {
            	    // InternalLustre.g:4951:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    // InternalLustre.g:4952:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    {
            	    // InternalLustre.g:4952:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    int alt96=2;
            	    int LA96_0 = input.LA(1);

            	    if ( (LA96_0==17) ) {
            	        alt96=1;
            	    }
            	    else if ( (LA96_0==66) ) {
            	        alt96=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 96, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt96) {
            	        case 1 :
            	            // InternalLustre.g:4953:7: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:4964:7: lv_op_2_2= '<>'
            	            {
            	            lv_op_2_2=(Token)match(input,66,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpLessThanSignGreaterThanSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalLustre.g:4977:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalLustre.g:4978:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalLustre.g:4978:5: (lv_right_3_0= ruleComparison )
            	    // InternalLustre.g:4979:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_77);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.Comparison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop97;
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalLustre.g:5001:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalLustre.g:5001:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalLustre.g:5002:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalLustre.g:5008:1: ruleComparison returns [EObject current=null] : (this_Mod_0= ruleMod ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_Mod_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:5014:2: ( (this_Mod_0= ruleMod ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) ) )* ) )
            // InternalLustre.g:5015:2: (this_Mod_0= ruleMod ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) ) )* )
            {
            // InternalLustre.g:5015:2: (this_Mod_0= ruleMod ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) ) )* )
            // InternalLustre.g:5016:3: this_Mod_0= ruleMod ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getModParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_78);
            this_Mod_0=ruleMod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Mod_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLustre.g:5027:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( ((LA99_0>=67 && LA99_0<=70)) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalLustre.g:5028:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) )
            	    {
            	    // InternalLustre.g:5028:4: ()
            	    // InternalLustre.g:5029:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalLustre.g:5038:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalLustre.g:5039:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalLustre.g:5039:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalLustre.g:5040:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalLustre.g:5040:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt98=4;
            	    switch ( input.LA(1) ) {
            	    case 67:
            	        {
            	        alt98=1;
            	        }
            	        break;
            	    case 68:
            	        {
            	        alt98=2;
            	        }
            	        break;
            	    case 69:
            	        {
            	        alt98=3;
            	        }
            	        break;
            	    case 70:
            	        {
            	        alt98=4;
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
            	            // InternalLustre.g:5041:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,67,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:5052:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,68,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalLustre.g:5063:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,69,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalLustre.g:5074:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,70,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalLustre.g:5087:4: ( (lv_right_3_0= ruleMod ) )
            	    // InternalLustre.g:5088:5: (lv_right_3_0= ruleMod )
            	    {
            	    // InternalLustre.g:5088:5: (lv_right_3_0= ruleMod )
            	    // InternalLustre.g:5089:6: lv_right_3_0= ruleMod
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightModParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_78);
            	    lv_right_3_0=ruleMod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.Mod");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleMod"
    // InternalLustre.g:5111:1: entryRuleMod returns [EObject current=null] : iv_ruleMod= ruleMod EOF ;
    public final EObject entryRuleMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMod = null;


        try {
            // InternalLustre.g:5111:44: (iv_ruleMod= ruleMod EOF )
            // InternalLustre.g:5112:2: iv_ruleMod= ruleMod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMod=ruleMod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMod; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMod"


    // $ANTLR start "ruleMod"
    // InternalLustre.g:5118:1: ruleMod returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleMod() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:5124:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalLustre.g:5125:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalLustre.g:5125:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) ) )* )
            // InternalLustre.g:5126:3: this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getModAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_79);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLustre.g:5137:3: ( () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==71) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalLustre.g:5138:4: () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalLustre.g:5138:4: ()
            	    // InternalLustre.g:5139:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndAdd(
            	      						grammarAccess.getModAccess().getModSubExpressionsAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,71,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getModAccess().getModKeyword_1_1());
            	      			
            	    }
            	    // InternalLustre.g:5152:4: ( (lv_subExpressions_3_0= rulePlusOrMinus ) )
            	    // InternalLustre.g:5153:5: (lv_subExpressions_3_0= rulePlusOrMinus )
            	    {
            	    // InternalLustre.g:5153:5: (lv_subExpressions_3_0= rulePlusOrMinus )
            	    // InternalLustre.g:5154:6: lv_subExpressions_3_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModAccess().getSubExpressionsPlusOrMinusParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_79);
            	    lv_subExpressions_3_0=rulePlusOrMinus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModRule());
            	      						}
            	      						add(
            	      							current,
            	      							"subExpressions",
            	      							lv_subExpressions_3_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.PlusOrMinus");
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


            }

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
    // $ANTLR end "ruleMod"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalLustre.g:5176:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalLustre.g:5176:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalLustre.g:5177:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOrMinus; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalLustre.g:5183:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:5189:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalLustre.g:5190:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalLustre.g:5190:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )* )
            // InternalLustre.g:5191:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_80);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLustre.g:5202:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( ((LA102_0>=72 && LA102_0<=73)) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // InternalLustre.g:5203:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalLustre.g:5203:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt101=2;
            	    int LA101_0 = input.LA(1);

            	    if ( (LA101_0==72) ) {
            	        alt101=1;
            	    }
            	    else if ( (LA101_0==73) ) {
            	        alt101=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 101, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt101) {
            	        case 1 :
            	            // InternalLustre.g:5204:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalLustre.g:5204:5: ( () otherlv_2= '+' )
            	            // InternalLustre.g:5205:6: () otherlv_2= '+'
            	            {
            	            // InternalLustre.g:5205:6: ()
            	            // InternalLustre.g:5206:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndAdd(
            	              								grammarAccess.getPlusOrMinusAccess().getPlusSubExpressionsAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,72,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:5221:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalLustre.g:5221:5: ( () otherlv_4= '-' )
            	            // InternalLustre.g:5222:6: () otherlv_4= '-'
            	            {
            	            // InternalLustre.g:5222:6: ()
            	            // InternalLustre.g:5223:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndAdd(
            	              								grammarAccess.getPlusOrMinusAccess().getMinusSubExpressionsAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,73,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalLustre.g:5238:4: ( (lv_subExpressions_5_0= ruleMulOrDiv ) )
            	    // InternalLustre.g:5239:5: (lv_subExpressions_5_0= ruleMulOrDiv )
            	    {
            	    // InternalLustre.g:5239:5: (lv_subExpressions_5_0= ruleMulOrDiv )
            	    // InternalLustre.g:5240:6: lv_subExpressions_5_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getSubExpressionsMulOrDivParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_80);
            	    lv_subExpressions_5_0=ruleMulOrDiv();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	      						}
            	      						add(
            	      							current,
            	      							"subExpressions",
            	      							lv_subExpressions_5_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.MulOrDiv");
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


            }


            }

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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalLustre.g:5262:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalLustre.g:5262:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalLustre.g:5263:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOrDiv; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalLustre.g:5269:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:5275:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )* ) )
            // InternalLustre.g:5276:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )* )
            {
            // InternalLustre.g:5276:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )* )
            // InternalLustre.g:5277:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_81);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLustre.g:5288:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( ((LA104_0>=74 && LA104_0<=75)) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalLustre.g:5289:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) )
            	    {
            	    // InternalLustre.g:5289:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt103=2;
            	    int LA103_0 = input.LA(1);

            	    if ( (LA103_0==74) ) {
            	        alt103=1;
            	    }
            	    else if ( (LA103_0==75) ) {
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
            	            // InternalLustre.g:5290:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalLustre.g:5290:5: ( () otherlv_2= '*' )
            	            // InternalLustre.g:5291:6: () otherlv_2= '*'
            	            {
            	            // InternalLustre.g:5291:6: ()
            	            // InternalLustre.g:5292:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndAdd(
            	              								grammarAccess.getMulOrDivAccess().getMulSubExpressionsAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,74,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:5307:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalLustre.g:5307:5: ( () otherlv_4= '/' )
            	            // InternalLustre.g:5308:6: () otherlv_4= '/'
            	            {
            	            // InternalLustre.g:5308:6: ()
            	            // InternalLustre.g:5309:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndAdd(
            	              								grammarAccess.getMulOrDivAccess().getDivSubExpressionsAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,75,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalLustre.g:5324:4: ( (lv_subExpressions_5_0= rulePrimary ) )
            	    // InternalLustre.g:5325:5: (lv_subExpressions_5_0= rulePrimary )
            	    {
            	    // InternalLustre.g:5325:5: (lv_subExpressions_5_0= rulePrimary )
            	    // InternalLustre.g:5326:6: lv_subExpressions_5_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getSubExpressionsPrimaryParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_81);
            	    lv_subExpressions_5_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	      						}
            	      						add(
            	      							current,
            	      							"subExpressions",
            	      							lv_subExpressions_5_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.Primary");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop104;
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalLustre.g:5348:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalLustre.g:5348:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalLustre.g:5349:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalLustre.g:5355:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_expression_8_0 = null;

        EObject lv_expression_11_0 = null;

        EObject lv_expression_14_0 = null;

        EObject this_AtomicExpression_15 = null;



        	enterRule();

        try {
            // InternalLustre.g:5361:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression ) )
            // InternalLustre.g:5362:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression )
            {
            // InternalLustre.g:5362:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression )
            int alt105=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt105=1;
                }
                break;
            case 42:
                {
                alt105=2;
                }
                break;
            case 73:
                {
                alt105=3;
                }
                break;
            case 76:
                {
                alt105=4;
                }
                break;
            case 77:
                {
                alt105=5;
                }
                break;
            case RULE_IDENT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_INT:
                {
                alt105=6;
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
                    // InternalLustre.g:5363:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalLustre.g:5363:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalLustre.g:5364:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_47);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:5385:3: ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:5385:3: ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalLustre.g:5386:4: () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalLustre.g:5386:4: ()
                    // InternalLustre.g:5387:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getNotKeyword_1_1());
                      			
                    }
                    // InternalLustre.g:5400:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalLustre.g:5401:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalLustre.g:5401:5: (lv_expression_5_0= rulePrimary )
                    // InternalLustre.g:5402:6: lv_expression_5_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_5_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLustre.g:5421:3: ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:5421:3: ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) )
                    // InternalLustre.g:5422:4: () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) )
                    {
                    // InternalLustre.g:5422:4: ()
                    // InternalLustre.g:5423:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getUMinusAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,73,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1());
                      			
                    }
                    // InternalLustre.g:5436:4: ( (lv_expression_8_0= rulePrimary ) )
                    // InternalLustre.g:5437:5: (lv_expression_8_0= rulePrimary )
                    {
                    // InternalLustre.g:5437:5: (lv_expression_8_0= rulePrimary )
                    // InternalLustre.g:5438:6: lv_expression_8_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_expression_8_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_8_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLustre.g:5457:3: ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:5457:3: ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) )
                    // InternalLustre.g:5458:4: () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) )
                    {
                    // InternalLustre.g:5458:4: ()
                    // InternalLustre.g:5459:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getPreAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_10=(Token)match(input,76,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getPrimaryAccess().getPreKeyword_3_1());
                      			
                    }
                    // InternalLustre.g:5472:4: ( (lv_expression_11_0= rulePrimary ) )
                    // InternalLustre.g:5473:5: (lv_expression_11_0= rulePrimary )
                    {
                    // InternalLustre.g:5473:5: (lv_expression_11_0= rulePrimary )
                    // InternalLustre.g:5474:6: lv_expression_11_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_expression_11_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_11_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalLustre.g:5493:3: ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:5493:3: ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) )
                    // InternalLustre.g:5494:4: () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) )
                    {
                    // InternalLustre.g:5494:4: ()
                    // InternalLustre.g:5495:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getCurrentAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_13=(Token)match(input,77,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getPrimaryAccess().getCurrentKeyword_4_1());
                      			
                    }
                    // InternalLustre.g:5508:4: ( (lv_expression_14_0= rulePrimary ) )
                    // InternalLustre.g:5509:5: (lv_expression_14_0= rulePrimary )
                    {
                    // InternalLustre.g:5509:5: (lv_expression_14_0= rulePrimary )
                    // InternalLustre.g:5510:6: lv_expression_14_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_expression_14_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_14_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalLustre.g:5529:3: this_AtomicExpression_15= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicExpressionParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicExpression_15=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AtomicExpression_15;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalLustre.g:5544:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalLustre.g:5544:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalLustre.g:5545:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalLustre.g:5551:1: ruleAtomicExpression returns [EObject current=null] : (this_ConstantExpression_0= ruleConstantExpression | this_VariableReference_1= ruleVariableReference ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantExpression_0 = null;

        EObject this_VariableReference_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:5557:2: ( (this_ConstantExpression_0= ruleConstantExpression | this_VariableReference_1= ruleVariableReference ) )
            // InternalLustre.g:5558:2: (this_ConstantExpression_0= ruleConstantExpression | this_VariableReference_1= ruleVariableReference )
            {
            // InternalLustre.g:5558:2: (this_ConstantExpression_0= ruleConstantExpression | this_VariableReference_1= ruleVariableReference )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( ((LA106_0>=RULE_BOOL && LA106_0<=RULE_INT)) ) {
                alt106=1;
            }
            else if ( (LA106_0==RULE_IDENT) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalLustre.g:5559:3: this_ConstantExpression_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getConstantExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ConstantExpression_0=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConstantExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLustre.g:5571:3: this_VariableReference_1= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getVariableReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_VariableReference_1=ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableReference_1;
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


    // $ANTLR start "entryRuleVariableReference"
    // InternalLustre.g:5586:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // InternalLustre.g:5586:58: (iv_ruleVariableReference= ruleVariableReference EOF )
            // InternalLustre.g:5587:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // InternalLustre.g:5593:1: ruleVariableReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_IDENT ) ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLustre.g:5599:2: ( ( () ( (otherlv_1= RULE_IDENT ) ) ) )
            // InternalLustre.g:5600:2: ( () ( (otherlv_1= RULE_IDENT ) ) )
            {
            // InternalLustre.g:5600:2: ( () ( (otherlv_1= RULE_IDENT ) ) )
            // InternalLustre.g:5601:3: () ( (otherlv_1= RULE_IDENT ) )
            {
            // InternalLustre.g:5601:3: ()
            // InternalLustre.g:5602:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVariableReferenceAccess().getVariableReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalLustre.g:5611:3: ( (otherlv_1= RULE_IDENT ) )
            // InternalLustre.g:5612:4: (otherlv_1= RULE_IDENT )
            {
            // InternalLustre.g:5612:4: (otherlv_1= RULE_IDENT )
            // InternalLustre.g:5613:5: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariableReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getVariableReferenceAccess().getValueVariable_DeclarationCrossReference_1_0());
              				
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
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleConstantExpression"
    // InternalLustre.g:5631:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // InternalLustre.g:5631:59: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // InternalLustre.g:5632:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConstantExpression=ruleConstantExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantExpression"


    // $ANTLR start "ruleConstantExpression"
    // InternalLustre.g:5638:1: ruleConstantExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;


        	enterRule();

        try {
            // InternalLustre.g:5644:2: ( ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) ) )
            // InternalLustre.g:5645:2: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) )
            {
            // InternalLustre.g:5645:2: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) )
            int alt107=3;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt107=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt107=2;
                }
                break;
            case RULE_INT:
                {
                alt107=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // InternalLustre.g:5646:3: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
                    {
                    // InternalLustre.g:5646:3: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
                    // InternalLustre.g:5647:4: () ( (lv_value_1_0= RULE_BOOL ) )
                    {
                    // InternalLustre.g:5647:4: ()
                    // InternalLustre.g:5648:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getConstantExpressionAccess().getBoolConstantAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalLustre.g:5657:4: ( (lv_value_1_0= RULE_BOOL ) )
                    // InternalLustre.g:5658:5: (lv_value_1_0= RULE_BOOL )
                    {
                    // InternalLustre.g:5658:5: (lv_value_1_0= RULE_BOOL )
                    // InternalLustre.g:5659:6: lv_value_1_0= RULE_BOOL
                    {
                    lv_value_1_0=(Token)match(input,RULE_BOOL,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getConstantExpressionAccess().getValueBOOLTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstantExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"de.cau.cs.kieler.lustre.Lustre.BOOL");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:5677:3: ( () ( (lv_value_3_0= RULE_FLOAT ) ) )
                    {
                    // InternalLustre.g:5677:3: ( () ( (lv_value_3_0= RULE_FLOAT ) ) )
                    // InternalLustre.g:5678:4: () ( (lv_value_3_0= RULE_FLOAT ) )
                    {
                    // InternalLustre.g:5678:4: ()
                    // InternalLustre.g:5679:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getConstantExpressionAccess().getFloatConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalLustre.g:5688:4: ( (lv_value_3_0= RULE_FLOAT ) )
                    // InternalLustre.g:5689:5: (lv_value_3_0= RULE_FLOAT )
                    {
                    // InternalLustre.g:5689:5: (lv_value_3_0= RULE_FLOAT )
                    // InternalLustre.g:5690:6: lv_value_3_0= RULE_FLOAT
                    {
                    lv_value_3_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getConstantExpressionAccess().getValueFLOATTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstantExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"de.cau.cs.kieler.lustre.Lustre.FLOAT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLustre.g:5708:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    {
                    // InternalLustre.g:5708:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    // InternalLustre.g:5709:4: () ( (lv_value_5_0= RULE_INT ) )
                    {
                    // InternalLustre.g:5709:4: ()
                    // InternalLustre.g:5710:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getConstantExpressionAccess().getIntConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalLustre.g:5719:4: ( (lv_value_5_0= RULE_INT ) )
                    // InternalLustre.g:5720:5: (lv_value_5_0= RULE_INT )
                    {
                    // InternalLustre.g:5720:5: (lv_value_5_0= RULE_INT )
                    // InternalLustre.g:5721:6: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_5_0, grammarAccess.getConstantExpressionAccess().getValueINTTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstantExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_5_0,
                      							"de.cau.cs.kieler.lustre.Lustre.INT");
                      					
                    }

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
    // $ANTLR end "ruleConstantExpression"


    // $ANTLR start "entryRuleIdentRef"
    // InternalLustre.g:5742:1: entryRuleIdentRef returns [String current=null] : iv_ruleIdentRef= ruleIdentRef EOF ;
    public final String entryRuleIdentRef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentRef = null;


        try {
            // InternalLustre.g:5742:48: (iv_ruleIdentRef= ruleIdentRef EOF )
            // InternalLustre.g:5743:2: iv_ruleIdentRef= ruleIdentRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIdentRef=ruleIdentRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentRef.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentRef"


    // $ANTLR start "ruleIdentRef"
    // InternalLustre.g:5749:1: ruleIdentRef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT | (this_IDENT_1= RULE_IDENT kw= '::' this_IDENT_3= RULE_IDENT ) ) ;
    public final AntlrDatatypeRuleToken ruleIdentRef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENT_0=null;
        Token this_IDENT_1=null;
        Token kw=null;
        Token this_IDENT_3=null;


        	enterRule();

        try {
            // InternalLustre.g:5755:2: ( (this_IDENT_0= RULE_IDENT | (this_IDENT_1= RULE_IDENT kw= '::' this_IDENT_3= RULE_IDENT ) ) )
            // InternalLustre.g:5756:2: (this_IDENT_0= RULE_IDENT | (this_IDENT_1= RULE_IDENT kw= '::' this_IDENT_3= RULE_IDENT ) )
            {
            // InternalLustre.g:5756:2: (this_IDENT_0= RULE_IDENT | (this_IDENT_1= RULE_IDENT kw= '::' this_IDENT_3= RULE_IDENT ) )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==RULE_IDENT) ) {
                int LA108_1 = input.LA(2);

                if ( (LA108_1==78) ) {
                    alt108=2;
                }
                else if ( (LA108_1==EOF||(LA108_1>=14 && LA108_1<=16)||LA108_1==24||(LA108_1>=27 && LA108_1<=30)||(LA108_1>=32 && LA108_1<=33)||(LA108_1>=38 && LA108_1<=39)||LA108_1==48) ) {
                    alt108=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 108, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // InternalLustre.g:5757:3: this_IDENT_0= RULE_IDENT
                    {
                    this_IDENT_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IDENT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_IDENT_0, grammarAccess.getIdentRefAccess().getIDENTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLustre.g:5765:3: (this_IDENT_1= RULE_IDENT kw= '::' this_IDENT_3= RULE_IDENT )
                    {
                    // InternalLustre.g:5765:3: (this_IDENT_1= RULE_IDENT kw= '::' this_IDENT_3= RULE_IDENT )
                    // InternalLustre.g:5766:4: this_IDENT_1= RULE_IDENT kw= '::' this_IDENT_3= RULE_IDENT
                    {
                    this_IDENT_1=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_82); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENT_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IDENT_1, grammarAccess.getIdentRefAccess().getIDENTTerminalRuleCall_1_0());
                      			
                    }
                    kw=(Token)match(input,78,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIdentRefAccess().getColonColonKeyword_1_1());
                      			
                    }
                    this_IDENT_3=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENT_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IDENT_3, grammarAccess.getIdentRefAccess().getIDENTTerminalRuleCall_1_2());
                      			
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
    // $ANTLR end "ruleIdentRef"

    // $ANTLR start synpred93_InternalLustre
    public final void synpred93_InternalLustre_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;


        // InternalLustre.g:3504:3: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) )
        // InternalLustre.g:3504:3: (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )
        {
        // InternalLustre.g:3504:3: (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )
        // InternalLustre.g:3505:4: otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';'
        {
        otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_6); if (state.failed) return ;
        // InternalLustre.g:3509:4: ( (lv_name_1_0= RULE_IDENT ) )
        // InternalLustre.g:3510:5: (lv_name_1_0= RULE_IDENT )
        {
        // InternalLustre.g:3510:5: (lv_name_1_0= RULE_IDENT )
        // InternalLustre.g:3511:6: lv_name_1_0= RULE_IDENT
        {
        lv_name_1_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_36); if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_37); if (state.failed) return ;
        // InternalLustre.g:3531:4: ( (lv_type_3_0= ruleType ) )
        // InternalLustre.g:3532:5: (lv_type_3_0= ruleType )
        {
        // InternalLustre.g:3532:5: (lv_type_3_0= ruleType )
        // InternalLustre.g:3533:6: lv_type_3_0= ruleType
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getConstant_DeclarationAccess().getTypeTypeParserRuleCall_0_3_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_8);
        lv_type_3_0=ruleType();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred93_InternalLustre

    // $ANTLR start synpred94_InternalLustre
    public final void synpred94_InternalLustre_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_expr_8_0 = null;


        // InternalLustre.g:3556:3: ( (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' ) )
        // InternalLustre.g:3556:3: (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' )
        {
        // InternalLustre.g:3556:3: (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' )
        // InternalLustre.g:3557:4: otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';'
        {
        otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_6); if (state.failed) return ;
        // InternalLustre.g:3561:4: ( (lv_name_6_0= RULE_IDENT ) )
        // InternalLustre.g:3562:5: (lv_name_6_0= RULE_IDENT )
        {
        // InternalLustre.g:3562:5: (lv_name_6_0= RULE_IDENT )
        // InternalLustre.g:3563:6: lv_name_6_0= RULE_IDENT
        {
        lv_name_6_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_39); if (state.failed) return ;

        }


        }

        otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_61); if (state.failed) return ;
        // InternalLustre.g:3583:4: ( (lv_expr_8_0= ruleConstantExpression ) )
        // InternalLustre.g:3584:5: (lv_expr_8_0= ruleConstantExpression )
        {
        // InternalLustre.g:3584:5: (lv_expr_8_0= ruleConstantExpression )
        // InternalLustre.g:3585:6: lv_expr_8_0= ruleConstantExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getConstant_DeclarationAccess().getExprConstantExpressionParserRuleCall_1_3_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_8);
        lv_expr_8_0=ruleConstantExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred94_InternalLustre

    // $ANTLR start synpred96_InternalLustre
    public final void synpred96_InternalLustre_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_right_2_0 = null;


        // InternalLustre.g:3785:3: ( ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' ) )
        // InternalLustre.g:3785:3: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' )
        {
        // InternalLustre.g:3785:3: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' )
        // InternalLustre.g:3786:4: ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';'
        {
        // InternalLustre.g:3786:4: ( (otherlv_0= RULE_IDENT ) )
        // InternalLustre.g:3787:5: (otherlv_0= RULE_IDENT )
        {
        // InternalLustre.g:3787:5: (otherlv_0= RULE_IDENT )
        // InternalLustre.g:3788:6: otherlv_0= RULE_IDENT
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }
        otherlv_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_39); if (state.failed) return ;

        }


        }

        otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return ;
        // InternalLustre.g:3806:4: ( (lv_right_2_0= ruleRight_Part ) )
        // InternalLustre.g:3807:5: (lv_right_2_0= ruleRight_Part )
        {
        // InternalLustre.g:3807:5: (lv_right_2_0= ruleRight_Part )
        // InternalLustre.g:3808:6: lv_right_2_0= ruleRight_Part
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getEquationAccess().getRightRight_PartParserRuleCall_0_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_8);
        lv_right_2_0=ruleRight_Part();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred96_InternalLustre

    // $ANTLR start synpred97_InternalLustre
    public final void synpred97_InternalLustre_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_right_6_0 = null;


        // InternalLustre.g:3831:3: ( ( ( (otherlv_4= RULE_IDENT ) ) otherlv_5= '=' ( (lv_right_6_0= ruleRight_Part ) ) otherlv_7= ';' ) )
        // InternalLustre.g:3831:3: ( ( (otherlv_4= RULE_IDENT ) ) otherlv_5= '=' ( (lv_right_6_0= ruleRight_Part ) ) otherlv_7= ';' )
        {
        // InternalLustre.g:3831:3: ( ( (otherlv_4= RULE_IDENT ) ) otherlv_5= '=' ( (lv_right_6_0= ruleRight_Part ) ) otherlv_7= ';' )
        // InternalLustre.g:3832:4: ( (otherlv_4= RULE_IDENT ) ) otherlv_5= '=' ( (lv_right_6_0= ruleRight_Part ) ) otherlv_7= ';'
        {
        // InternalLustre.g:3832:4: ( (otherlv_4= RULE_IDENT ) )
        // InternalLustre.g:3833:5: (otherlv_4= RULE_IDENT )
        {
        // InternalLustre.g:3833:5: (otherlv_4= RULE_IDENT )
        // InternalLustre.g:3834:6: otherlv_4= RULE_IDENT
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }
        otherlv_4=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_39); if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return ;
        // InternalLustre.g:3852:4: ( (lv_right_6_0= ruleRight_Part ) )
        // InternalLustre.g:3853:5: (lv_right_6_0= ruleRight_Part )
        {
        // InternalLustre.g:3853:5: (lv_right_6_0= ruleRight_Part )
        // InternalLustre.g:3854:6: lv_right_6_0= ruleRight_Part
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getEquationAccess().getRightRight_PartParserRuleCall_1_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_8);
        lv_right_6_0=ruleRight_Part();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred97_InternalLustre

    // $ANTLR start synpred119_InternalLustre
    public final void synpred119_InternalLustre_fragment() throws RecognitionException {   
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject lv_right_3_0 = null;


        // InternalLustre.g:4940:4: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )
        // InternalLustre.g:4940:4: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) )
        {
        // InternalLustre.g:4940:4: ()
        // InternalLustre.g:4941:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalLustre.g:4950:4: ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) )
        // InternalLustre.g:4951:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
        {
        // InternalLustre.g:4951:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
        // InternalLustre.g:4952:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
        {
        // InternalLustre.g:4952:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
        int alt152=2;
        int LA152_0 = input.LA(1);

        if ( (LA152_0==17) ) {
            alt152=1;
        }
        else if ( (LA152_0==66) ) {
            alt152=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 152, 0, input);

            throw nvae;
        }
        switch (alt152) {
            case 1 :
                // InternalLustre.g:4953:7: lv_op_2_1= '='
                {
                lv_op_2_1=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalLustre.g:4964:7: lv_op_2_2= '<>'
                {
                lv_op_2_2=(Token)match(input,66,FollowSets000.FOLLOW_13); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalLustre.g:4977:4: ( (lv_right_3_0= ruleComparison ) )
        // InternalLustre.g:4978:5: (lv_right_3_0= ruleComparison )
        {
        // InternalLustre.g:4978:5: (lv_right_3_0= ruleComparison )
        // InternalLustre.g:4979:6: lv_right_3_0= ruleComparison
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_3_0=ruleComparison();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred119_InternalLustre

    // Delegated rules

    public final boolean synpred94_InternalLustre() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_InternalLustre_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_InternalLustre() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_InternalLustre_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_InternalLustre() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_InternalLustre_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred119_InternalLustre() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_InternalLustre_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_InternalLustre() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_InternalLustre_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA97 dfa97 = new DFA97(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\1\1\23\uffff";
    static final String dfa_3s = "\1\20\12\uffff\1\0\10\uffff";
    static final String dfa_4s = "\1\102\12\uffff\1\0\10\uffff";
    static final String dfa_5s = "\1\uffff\1\2\21\uffff\1\1";
    static final String dfa_6s = "\13\uffff\1\0\10\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\13\3\uffff\1\1\2\uffff\2\1\7\uffff\1\1\5\uffff\1\1\1\uffff\1\1\13\uffff\1\1\2\uffff\2\1\1\uffff\2\1\1\uffff\4\1\1\23",
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA97 extends DFA {

        public DFA97(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 97;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 4939:3: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA97_11 = input.LA(1);

                         
                        int index97_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_InternalLustre()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index97_11);
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
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000208007800E000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000007800C002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000007800C022L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004DC0020L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x20000440000001E0L,0x0000000000003200L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004100020000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000006800C000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200010000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C00038000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000006000C000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000C00008000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000020L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000C001000000020L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000010002L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000C000000020L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000010000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000001C0020L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000201010000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010001000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010001020000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000001E0022L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000044000000020L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000208007800C002L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000300000000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000001010000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000C00000000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000080006800C000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000000007800C000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000004100000000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000D00000000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x000000006000C020L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000008001010000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x00000000000001C0L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0011000000000000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x00CC000000000020L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x00CC000000000022L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0300000000000000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0400002000000002L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x1800000000000000L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x8000000000000002L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000004L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000078L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    }


}