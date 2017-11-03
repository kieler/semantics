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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_BOOL", "RULE_FLOAT", "RULE_INT", "RULE_STRING_CONSTANT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_LUSTRE_COMMENT", "RULE_WS", "'node'", "'('", "','", "')'", "'returns'", "';'", "':'", "'type'", "'='", "'const'", "'when'", "'var'", "'let'", "'tel'", "'assert'", "'automaton'", "'|'", "'end'", "'->'", "'until'", "'unless'", "'then'", "'continue'", "'.'", "'['", "']'", "'..'", "'if'", "'else'", "'fby'", "'or'", "'and'", "'<>'", "'>='", "'<='", "'>'", "'<'", "'mod'", "'+'", "'-'", "'*'", "'/'", "'not'", "'pre'", "'current'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_STRING_CONSTANT=8;
    public static final int RULE_LUSTRE_COMMENT=11;
    public static final int RULE_IDENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_BOOL=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=6;
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
    // InternalLustre.g:82:1: ruleLustreProgram returns [EObject current=null] : ( (lv_nodes_0_0= ruleNode_Declaration ) )+ ;
    public final EObject ruleLustreProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_nodes_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_LUSTRE_COMMENT");

        try {
            // InternalLustre.g:89:2: ( ( (lv_nodes_0_0= ruleNode_Declaration ) )+ )
            // InternalLustre.g:90:2: ( (lv_nodes_0_0= ruleNode_Declaration ) )+
            {
            // InternalLustre.g:90:2: ( (lv_nodes_0_0= ruleNode_Declaration ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLustre.g:91:3: (lv_nodes_0_0= ruleNode_Declaration )
            	    {
            	    // InternalLustre.g:91:3: (lv_nodes_0_0= ruleNode_Declaration )
            	    // InternalLustre.g:92:4: lv_nodes_0_0= ruleNode_Declaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getLustreProgramAccess().getNodesNode_DeclarationParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_nodes_0_0=ruleNode_Declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getLustreProgramRule());
            	      				}
            	      				add(
            	      					current,
            	      					"nodes",
            	      					lv_nodes_0_0,
            	      					"de.cau.cs.kieler.lustre.Lustre.Node_Declaration");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleLustreProgram"


    // $ANTLR start "entryRulePackage_Provided"
    // InternalLustre.g:115:1: entryRulePackage_Provided returns [EObject current=null] : iv_rulePackage_Provided= rulePackage_Provided EOF ;
    public final EObject entryRulePackage_Provided() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Provided = null;


        try {
            // InternalLustre.g:115:57: (iv_rulePackage_Provided= rulePackage_Provided EOF )
            // InternalLustre.g:116:2: iv_rulePackage_Provided= rulePackage_Provided EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_ProvidedRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePackage_Provided=rulePackage_Provided();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_Provided; 
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
    // $ANTLR end "entryRulePackage_Provided"


    // $ANTLR start "rulePackage_Provided"
    // InternalLustre.g:122:1: rulePackage_Provided returns [EObject current=null] : (otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= rulePackage_Provided_IO ) ) (otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) ) )* otherlv_12= ')' otherlv_13= ';' ) ;
    public final EObject rulePackage_Provided() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_returned_9_0 = null;

        EObject lv_returned_11_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:128:2: ( (otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= rulePackage_Provided_IO ) ) (otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) ) )* otherlv_12= ')' otherlv_13= ';' ) )
            // InternalLustre.g:129:2: (otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= rulePackage_Provided_IO ) ) (otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) ) )* otherlv_12= ')' otherlv_13= ';' )
            {
            // InternalLustre.g:129:2: (otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= rulePackage_Provided_IO ) ) (otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) ) )* otherlv_12= ')' otherlv_13= ';' )
            // InternalLustre.g:130:3: otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= rulePackage_Provided_IO ) ) (otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) ) )* otherlv_12= ')' otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPackage_ProvidedAccess().getNodeKeyword_0());
              		
            }
            // InternalLustre.g:134:3: ( (otherlv_1= RULE_IDENT ) )
            // InternalLustre.g:135:4: (otherlv_1= RULE_IDENT )
            {
            // InternalLustre.g:135:4: (otherlv_1= RULE_IDENT )
            // InternalLustre.g:136:5: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPackage_ProvidedRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getPackage_ProvidedAccess().getNameNode_DeclarationCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPackage_ProvidedAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLustre.g:154:3: ( ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_IDENT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLustre.g:155:4: ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )*
                    {
                    // InternalLustre.g:155:4: ( (lv_parameters_3_0= rulePackage_Provided_IO ) )
                    // InternalLustre.g:156:5: (lv_parameters_3_0= rulePackage_Provided_IO )
                    {
                    // InternalLustre.g:156:5: (lv_parameters_3_0= rulePackage_Provided_IO )
                    // InternalLustre.g:157:6: lv_parameters_3_0= rulePackage_Provided_IO
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPackage_ProvidedAccess().getParametersPackage_Provided_IOParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_parameters_3_0=rulePackage_Provided_IO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPackage_ProvidedRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_3_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Package_Provided_IO");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalLustre.g:174:4: (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalLustre.g:175:5: otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getPackage_ProvidedAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalLustre.g:179:5: ( (lv_parameters_5_0= rulePackage_Provided_IO ) )
                    	    // InternalLustre.g:180:6: (lv_parameters_5_0= rulePackage_Provided_IO )
                    	    {
                    	    // InternalLustre.g:180:6: (lv_parameters_5_0= rulePackage_Provided_IO )
                    	    // InternalLustre.g:181:7: lv_parameters_5_0= rulePackage_Provided_IO
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPackage_ProvidedAccess().getParametersPackage_Provided_IOParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_parameters_5_0=rulePackage_Provided_IO();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPackage_ProvidedRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_5_0,
                    	      								"de.cau.cs.kieler.lustre.Lustre.Package_Provided_IO");
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
                    break;

            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getPackage_ProvidedAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getPackage_ProvidedAccess().getReturnsKeyword_5());
              		
            }
            otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getPackage_ProvidedAccess().getLeftParenthesisKeyword_6());
              		
            }
            // InternalLustre.g:212:3: ( (lv_returned_9_0= rulePackage_Provided_IO ) )
            // InternalLustre.g:213:4: (lv_returned_9_0= rulePackage_Provided_IO )
            {
            // InternalLustre.g:213:4: (lv_returned_9_0= rulePackage_Provided_IO )
            // InternalLustre.g:214:5: lv_returned_9_0= rulePackage_Provided_IO
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPackage_ProvidedAccess().getReturnedPackage_Provided_IOParserRuleCall_7_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_7);
            lv_returned_9_0=rulePackage_Provided_IO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPackage_ProvidedRule());
              					}
              					add(
              						current,
              						"returned",
              						lv_returned_9_0,
              						"de.cau.cs.kieler.lustre.Lustre.Package_Provided_IO");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLustre.g:231:3: (otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLustre.g:232:4: otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) )
            	    {
            	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_10, grammarAccess.getPackage_ProvidedAccess().getCommaKeyword_8_0());
            	      			
            	    }
            	    // InternalLustre.g:236:4: ( (lv_returned_11_0= rulePackage_Provided_IO ) )
            	    // InternalLustre.g:237:5: (lv_returned_11_0= rulePackage_Provided_IO )
            	    {
            	    // InternalLustre.g:237:5: (lv_returned_11_0= rulePackage_Provided_IO )
            	    // InternalLustre.g:238:6: lv_returned_11_0= rulePackage_Provided_IO
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPackage_ProvidedAccess().getReturnedPackage_Provided_IOParserRuleCall_8_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    lv_returned_11_0=rulePackage_Provided_IO();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPackage_ProvidedRule());
            	      						}
            	      						add(
            	      							current,
            	      							"returned",
            	      							lv_returned_11_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.Package_Provided_IO");
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

            otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getPackage_ProvidedAccess().getRightParenthesisKeyword_9());
              		
            }
            otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getPackage_ProvidedAccess().getSemicolonKeyword_10());
              		
            }

            }


            }

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
    // $ANTLR end "rulePackage_Provided"


    // $ANTLR start "entryRulePackage_Provided_IO"
    // InternalLustre.g:268:1: entryRulePackage_Provided_IO returns [EObject current=null] : iv_rulePackage_Provided_IO= rulePackage_Provided_IO EOF ;
    public final EObject entryRulePackage_Provided_IO() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Provided_IO = null;


        try {
            // InternalLustre.g:268:60: (iv_rulePackage_Provided_IO= rulePackage_Provided_IO EOF )
            // InternalLustre.g:269:2: iv_rulePackage_Provided_IO= rulePackage_Provided_IO EOF
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
    // InternalLustre.g:275:1: rulePackage_Provided_IO returns [EObject current=null] : ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) ) ) ;
    public final EObject rulePackage_Provided_IO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalLustre.g:281:2: ( ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) ) ) )
            // InternalLustre.g:282:2: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) ) )
            {
            // InternalLustre.g:282:2: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) ) )
            // InternalLustre.g:283:3: ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) )
            {
            // InternalLustre.g:283:3: ( (otherlv_0= RULE_IDENT ) )
            // InternalLustre.g:284:4: (otherlv_0= RULE_IDENT )
            {
            // InternalLustre.g:284:4: (otherlv_0= RULE_IDENT )
            // InternalLustre.g:285:5: otherlv_0= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPackage_Provided_IORule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getPackage_Provided_IOAccess().getNameVariable_DeclarationCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPackage_Provided_IOAccess().getColonKeyword_1());
              		
            }
            // InternalLustre.g:303:3: ( (lv_type_2_0= RULE_IDENT ) )
            // InternalLustre.g:304:4: (lv_type_2_0= RULE_IDENT )
            {
            // InternalLustre.g:304:4: (lv_type_2_0= RULE_IDENT )
            // InternalLustre.g:305:5: lv_type_2_0= RULE_IDENT
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


    // $ANTLR start "entryRuleType_Declaration"
    // InternalLustre.g:325:1: entryRuleType_Declaration returns [EObject current=null] : iv_ruleType_Declaration= ruleType_Declaration EOF ;
    public final EObject entryRuleType_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Declaration = null;


        try {
            // InternalLustre.g:325:57: (iv_ruleType_Declaration= ruleType_Declaration EOF )
            // InternalLustre.g:326:2: iv_ruleType_Declaration= ruleType_Declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_DeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleType_Declaration=ruleType_Declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType_Declaration; 
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
    // $ANTLR end "entryRuleType_Declaration"


    // $ANTLR start "ruleType_Declaration"
    // InternalLustre.g:332:1: ruleType_Declaration returns [EObject current=null] : ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';' ) | (otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';' ) ) ;
    public final EObject ruleType_Declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:338:2: ( ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';' ) | (otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';' ) ) )
            // InternalLustre.g:339:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';' ) | (otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';' ) )
            {
            // InternalLustre.g:339:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';' ) | (otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_IDENT) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==18) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==21) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLustre.g:340:3: (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';' )
                    {
                    // InternalLustre.g:340:3: (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';' )
                    // InternalLustre.g:341:4: otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';'
                    {
                    otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getType_DeclarationAccess().getTypeKeyword_0_0());
                      			
                    }
                    // InternalLustre.g:345:4: ( (lv_name_1_0= RULE_IDENT ) )
                    // InternalLustre.g:346:5: (lv_name_1_0= RULE_IDENT )
                    {
                    // InternalLustre.g:346:5: (lv_name_1_0= RULE_IDENT )
                    // InternalLustre.g:347:6: lv_name_1_0= RULE_IDENT
                    {
                    lv_name_1_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_0, grammarAccess.getType_DeclarationAccess().getNameIDENTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getType_DeclarationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getType_DeclarationAccess().getSemicolonKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:369:3: (otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';' )
                    {
                    // InternalLustre.g:369:3: (otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';' )
                    // InternalLustre.g:370:4: otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';'
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getType_DeclarationAccess().getTypeKeyword_1_0());
                      			
                    }
                    // InternalLustre.g:374:4: ( (lv_name_4_0= RULE_IDENT ) )
                    // InternalLustre.g:375:5: (lv_name_4_0= RULE_IDENT )
                    {
                    // InternalLustre.g:375:5: (lv_name_4_0= RULE_IDENT )
                    // InternalLustre.g:376:6: lv_name_4_0= RULE_IDENT
                    {
                    lv_name_4_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_4_0, grammarAccess.getType_DeclarationAccess().getNameIDENTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getType_DeclarationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_4_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getType_DeclarationAccess().getEqualsSignKeyword_1_2());
                      			
                    }
                    // InternalLustre.g:396:4: ( (lv_type_6_0= ruleType ) )
                    // InternalLustre.g:397:5: (lv_type_6_0= ruleType )
                    {
                    // InternalLustre.g:397:5: (lv_type_6_0= ruleType )
                    // InternalLustre.g:398:6: lv_type_6_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getType_DeclarationAccess().getTypeTypeParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
                    lv_type_6_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getType_DeclarationRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_6_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getType_DeclarationAccess().getSemicolonKeyword_1_4());
                      			
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
    // $ANTLR end "ruleType_Declaration"


    // $ANTLR start "entryRuleType"
    // InternalLustre.g:424:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalLustre.g:424:45: (iv_ruleType= ruleType EOF )
            // InternalLustre.g:425:2: iv_ruleType= ruleType EOF
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
    // InternalLustre.g:431:1: ruleType returns [EObject current=null] : ( (lv_name_0_0= RULE_IDENT ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLustre.g:437:2: ( ( (lv_name_0_0= RULE_IDENT ) ) )
            // InternalLustre.g:438:2: ( (lv_name_0_0= RULE_IDENT ) )
            {
            // InternalLustre.g:438:2: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:439:3: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:439:3: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:440:4: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getTypeAccess().getNameIDENTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getTypeRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"de.cau.cs.kieler.lustre.Lustre.IDENT");
              			
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleField"
    // InternalLustre.g:459:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalLustre.g:459:46: (iv_ruleField= ruleField EOF )
            // InternalLustre.g:460:2: iv_ruleField= ruleField EOF
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
    // InternalLustre.g:466:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalLustre.g:472:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) ) ) )
            // InternalLustre.g:473:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) ) )
            {
            // InternalLustre.g:473:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) ) )
            // InternalLustre.g:474:3: ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) )
            {
            // InternalLustre.g:474:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:475:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:475:4: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:476:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_10); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
              		
            }
            // InternalLustre.g:496:3: ( (otherlv_2= RULE_IDENT ) )
            // InternalLustre.g:497:4: (otherlv_2= RULE_IDENT )
            {
            // InternalLustre.g:497:4: (otherlv_2= RULE_IDENT )
            // InternalLustre.g:498:5: otherlv_2= RULE_IDENT
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
    // InternalLustre.g:516:1: entryRuleConstant_Declaration returns [EObject current=null] : iv_ruleConstant_Declaration= ruleConstant_Declaration EOF ;
    public final EObject entryRuleConstant_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant_Declaration = null;


        try {
            // InternalLustre.g:516:61: (iv_ruleConstant_Declaration= ruleConstant_Declaration EOF )
            // InternalLustre.g:517:2: iv_ruleConstant_Declaration= ruleConstant_Declaration EOF
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
    // InternalLustre.g:523:1: ruleConstant_Declaration returns [EObject current=null] : ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) | (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' ) | (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' ) ) ;
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
            // InternalLustre.g:529:2: ( ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) | (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' ) | (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' ) ) )
            // InternalLustre.g:530:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) | (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' ) | (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' ) )
            {
            // InternalLustre.g:530:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) | (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' ) | (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_IDENT) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==19) ) {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3==RULE_IDENT) ) {
                            int LA6_5 = input.LA(5);

                            if ( (LA6_5==21) ) {
                                alt6=3;
                            }
                            else if ( (LA6_5==18) ) {
                                alt6=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA6_2==21) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLustre.g:531:3: (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )
                    {
                    // InternalLustre.g:531:3: (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )
                    // InternalLustre.g:532:4: otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getConstant_DeclarationAccess().getConstKeyword_0_0());
                      			
                    }
                    // InternalLustre.g:536:4: ( (lv_name_1_0= RULE_IDENT ) )
                    // InternalLustre.g:537:5: (lv_name_1_0= RULE_IDENT )
                    {
                    // InternalLustre.g:537:5: (lv_name_1_0= RULE_IDENT )
                    // InternalLustre.g:538:6: lv_name_1_0= RULE_IDENT
                    {
                    lv_name_1_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_10); if (state.failed) return current;
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

                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getConstant_DeclarationAccess().getColonKeyword_0_2());
                      			
                    }
                    // InternalLustre.g:558:4: ( (lv_type_3_0= ruleType ) )
                    // InternalLustre.g:559:5: (lv_type_3_0= ruleType )
                    {
                    // InternalLustre.g:559:5: (lv_type_3_0= ruleType )
                    // InternalLustre.g:560:6: lv_type_3_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstant_DeclarationAccess().getTypeTypeParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
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

                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getConstant_DeclarationAccess().getSemicolonKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:583:3: (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' )
                    {
                    // InternalLustre.g:583:3: (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' )
                    // InternalLustre.g:584:4: otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';'
                    {
                    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getConstant_DeclarationAccess().getConstKeyword_1_0());
                      			
                    }
                    // InternalLustre.g:588:4: ( (lv_name_6_0= RULE_IDENT ) )
                    // InternalLustre.g:589:5: (lv_name_6_0= RULE_IDENT )
                    {
                    // InternalLustre.g:589:5: (lv_name_6_0= RULE_IDENT )
                    // InternalLustre.g:590:6: lv_name_6_0= RULE_IDENT
                    {
                    lv_name_6_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_11); if (state.failed) return current;
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

                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getConstant_DeclarationAccess().getEqualsSignKeyword_1_2());
                      			
                    }
                    // InternalLustre.g:610:4: ( (lv_expr_8_0= ruleConstantExpression ) )
                    // InternalLustre.g:611:5: (lv_expr_8_0= ruleConstantExpression )
                    {
                    // InternalLustre.g:611:5: (lv_expr_8_0= ruleConstantExpression )
                    // InternalLustre.g:612:6: lv_expr_8_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstant_DeclarationAccess().getExprConstantExpressionParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
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

                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getConstant_DeclarationAccess().getSemicolonKeyword_1_4());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLustre.g:635:3: (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' )
                    {
                    // InternalLustre.g:635:3: (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' )
                    // InternalLustre.g:636:4: otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';'
                    {
                    otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getConstant_DeclarationAccess().getConstKeyword_2_0());
                      			
                    }
                    // InternalLustre.g:640:4: ( (lv_name_11_0= RULE_IDENT ) )
                    // InternalLustre.g:641:5: (lv_name_11_0= RULE_IDENT )
                    {
                    // InternalLustre.g:641:5: (lv_name_11_0= RULE_IDENT )
                    // InternalLustre.g:642:6: lv_name_11_0= RULE_IDENT
                    {
                    lv_name_11_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_10); if (state.failed) return current;
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

                    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getConstant_DeclarationAccess().getColonKeyword_2_2());
                      			
                    }
                    // InternalLustre.g:662:4: ( (lv_type_13_0= ruleType ) )
                    // InternalLustre.g:663:5: (lv_type_13_0= ruleType )
                    {
                    // InternalLustre.g:663:5: (lv_type_13_0= ruleType )
                    // InternalLustre.g:664:6: lv_type_13_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstant_DeclarationAccess().getTypeTypeParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
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

                    otherlv_14=(Token)match(input,21,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getConstant_DeclarationAccess().getEqualsSignKeyword_2_4());
                      			
                    }
                    // InternalLustre.g:685:4: ( (lv_expr_15_0= ruleConstantExpression ) )
                    // InternalLustre.g:686:5: (lv_expr_15_0= ruleConstantExpression )
                    {
                    // InternalLustre.g:686:5: (lv_expr_15_0= ruleConstantExpression )
                    // InternalLustre.g:687:6: lv_expr_15_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstant_DeclarationAccess().getExprConstantExpressionParserRuleCall_2_5_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
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

                    otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalLustre.g:713:1: entryRuleVariable_Declaration returns [EObject current=null] : iv_ruleVariable_Declaration= ruleVariable_Declaration EOF ;
    public final EObject entryRuleVariable_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_Declaration = null;


        try {
            // InternalLustre.g:713:61: (iv_ruleVariable_Declaration= ruleVariable_Declaration EOF )
            // InternalLustre.g:714:2: iv_ruleVariable_Declaration= ruleVariable_Declaration EOF
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
    // InternalLustre.g:720:1: ruleVariable_Declaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )? ) ;
    public final EObject ruleVariable_Declaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_clock_4_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:726:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )? ) )
            // InternalLustre.g:727:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )? )
            {
            // InternalLustre.g:727:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )? )
            // InternalLustre.g:728:3: ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )?
            {
            // InternalLustre.g:728:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:729:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:729:4: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:730:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_10); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariable_DeclarationAccess().getColonKeyword_1());
              		
            }
            // InternalLustre.g:750:3: ( (lv_type_2_0= ruleType ) )
            // InternalLustre.g:751:4: (lv_type_2_0= ruleType )
            {
            // InternalLustre.g:751:4: (lv_type_2_0= ruleType )
            // InternalLustre.g:752:5: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariable_DeclarationAccess().getTypeTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
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

            // InternalLustre.g:769:3: (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLustre.g:770:4: otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) )
                    {
                    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getVariable_DeclarationAccess().getWhenKeyword_3_0());
                      			
                    }
                    // InternalLustre.g:774:4: ( (lv_clock_4_0= RULE_IDENT ) )
                    // InternalLustre.g:775:5: (lv_clock_4_0= RULE_IDENT )
                    {
                    // InternalLustre.g:775:5: (lv_clock_4_0= RULE_IDENT )
                    // InternalLustre.g:776:6: lv_clock_4_0= RULE_IDENT
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


    // $ANTLR start "entryRuleLocal_Variable_Declaration"
    // InternalLustre.g:797:1: entryRuleLocal_Variable_Declaration returns [EObject current=null] : iv_ruleLocal_Variable_Declaration= ruleLocal_Variable_Declaration EOF ;
    public final EObject entryRuleLocal_Variable_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal_Variable_Declaration = null;


        try {
            // InternalLustre.g:797:67: (iv_ruleLocal_Variable_Declaration= ruleLocal_Variable_Declaration EOF )
            // InternalLustre.g:798:2: iv_ruleLocal_Variable_Declaration= ruleLocal_Variable_Declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocal_Variable_DeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLocal_Variable_Declaration=ruleLocal_Variable_Declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocal_Variable_Declaration; 
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
    // $ANTLR end "entryRuleLocal_Variable_Declaration"


    // $ANTLR start "ruleLocal_Variable_Declaration"
    // InternalLustre.g:804:1: ruleLocal_Variable_Declaration returns [EObject current=null] : (otherlv_0= 'var' this_Variable_Declaration_1= ruleVariable_Declaration otherlv_2= ';' ) ;
    public final EObject ruleLocal_Variable_Declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Variable_Declaration_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:810:2: ( (otherlv_0= 'var' this_Variable_Declaration_1= ruleVariable_Declaration otherlv_2= ';' ) )
            // InternalLustre.g:811:2: (otherlv_0= 'var' this_Variable_Declaration_1= ruleVariable_Declaration otherlv_2= ';' )
            {
            // InternalLustre.g:811:2: (otherlv_0= 'var' this_Variable_Declaration_1= ruleVariable_Declaration otherlv_2= ';' )
            // InternalLustre.g:812:3: otherlv_0= 'var' this_Variable_Declaration_1= ruleVariable_Declaration otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLocal_Variable_DeclarationAccess().getVarKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLocal_Variable_DeclarationAccess().getVariable_DeclarationParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_9);
            this_Variable_Declaration_1=ruleVariable_Declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Variable_Declaration_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLocal_Variable_DeclarationAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

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
    // $ANTLR end "ruleLocal_Variable_Declaration"


    // $ANTLR start "entryRuleLocal_Constant_Declaration"
    // InternalLustre.g:835:1: entryRuleLocal_Constant_Declaration returns [EObject current=null] : iv_ruleLocal_Constant_Declaration= ruleLocal_Constant_Declaration EOF ;
    public final EObject entryRuleLocal_Constant_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal_Constant_Declaration = null;


        try {
            // InternalLustre.g:835:67: (iv_ruleLocal_Constant_Declaration= ruleLocal_Constant_Declaration EOF )
            // InternalLustre.g:836:2: iv_ruleLocal_Constant_Declaration= ruleLocal_Constant_Declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocal_Constant_DeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLocal_Constant_Declaration=ruleLocal_Constant_Declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocal_Constant_Declaration; 
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
    // $ANTLR end "entryRuleLocal_Constant_Declaration"


    // $ANTLR start "ruleLocal_Constant_Declaration"
    // InternalLustre.g:842:1: ruleLocal_Constant_Declaration returns [EObject current=null] : ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';' ) | ( () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';' ) ) ;
    public final EObject ruleLocal_Constant_Declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_expr_4_0 = null;

        EObject lv_type_10_0 = null;

        EObject lv_expr_12_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:848:2: ( ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';' ) | ( () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';' ) ) )
            // InternalLustre.g:849:2: ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';' ) | ( () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';' ) )
            {
            // InternalLustre.g:849:2: ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';' ) | ( () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_IDENT) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==19) ) {
                        alt8=2;
                    }
                    else if ( (LA8_2==21) ) {
                        alt8=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLustre.g:850:3: ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';' )
                    {
                    // InternalLustre.g:850:3: ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';' )
                    // InternalLustre.g:851:4: () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';'
                    {
                    // InternalLustre.g:851:4: ()
                    // InternalLustre.g:852:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLocal_Constant_DeclarationAccess().getConstant_DeclarationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLocal_Constant_DeclarationAccess().getConstKeyword_0_1());
                      			
                    }
                    // InternalLustre.g:865:4: ( (lv_name_2_0= RULE_IDENT ) )
                    // InternalLustre.g:866:5: (lv_name_2_0= RULE_IDENT )
                    {
                    // InternalLustre.g:866:5: (lv_name_2_0= RULE_IDENT )
                    // InternalLustre.g:867:6: lv_name_2_0= RULE_IDENT
                    {
                    lv_name_2_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getLocal_Constant_DeclarationAccess().getNameIDENTTerminalRuleCall_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLocal_Constant_DeclarationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLocal_Constant_DeclarationAccess().getEqualsSignKeyword_0_3());
                      			
                    }
                    // InternalLustre.g:887:4: ( (lv_expr_4_0= ruleConstantExpression ) )
                    // InternalLustre.g:888:5: (lv_expr_4_0= ruleConstantExpression )
                    {
                    // InternalLustre.g:888:5: (lv_expr_4_0= ruleConstantExpression )
                    // InternalLustre.g:889:6: lv_expr_4_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLocal_Constant_DeclarationAccess().getExprConstantExpressionParserRuleCall_0_4_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
                    lv_expr_4_0=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLocal_Constant_DeclarationRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_4_0,
                      							"de.cau.cs.kieler.lustre.Lustre.ConstantExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getLocal_Constant_DeclarationAccess().getSemicolonKeyword_0_5());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:912:3: ( () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';' )
                    {
                    // InternalLustre.g:912:3: ( () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';' )
                    // InternalLustre.g:913:4: () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';'
                    {
                    // InternalLustre.g:913:4: ()
                    // InternalLustre.g:914:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLocal_Constant_DeclarationAccess().getConstant_DeclarationAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getLocal_Constant_DeclarationAccess().getConstKeyword_1_1());
                      			
                    }
                    // InternalLustre.g:927:4: ( (lv_name_8_0= RULE_IDENT ) )
                    // InternalLustre.g:928:5: (lv_name_8_0= RULE_IDENT )
                    {
                    // InternalLustre.g:928:5: (lv_name_8_0= RULE_IDENT )
                    // InternalLustre.g:929:6: lv_name_8_0= RULE_IDENT
                    {
                    lv_name_8_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_8_0, grammarAccess.getLocal_Constant_DeclarationAccess().getNameIDENTTerminalRuleCall_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLocal_Constant_DeclarationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_8_0,
                      							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getLocal_Constant_DeclarationAccess().getColonKeyword_1_3());
                      			
                    }
                    // InternalLustre.g:949:4: ( (lv_type_10_0= ruleType ) )
                    // InternalLustre.g:950:5: (lv_type_10_0= ruleType )
                    {
                    // InternalLustre.g:950:5: (lv_type_10_0= ruleType )
                    // InternalLustre.g:951:6: lv_type_10_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLocal_Constant_DeclarationAccess().getTypeTypeParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_type_10_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLocal_Constant_DeclarationRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_10_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getLocal_Constant_DeclarationAccess().getEqualsSignKeyword_1_5());
                      			
                    }
                    // InternalLustre.g:972:4: ( (lv_expr_12_0= ruleConstantExpression ) )
                    // InternalLustre.g:973:5: (lv_expr_12_0= ruleConstantExpression )
                    {
                    // InternalLustre.g:973:5: (lv_expr_12_0= ruleConstantExpression )
                    // InternalLustre.g:974:6: lv_expr_12_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLocal_Constant_DeclarationAccess().getExprConstantExpressionParserRuleCall_1_6_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
                    lv_expr_12_0=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLocal_Constant_DeclarationRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_12_0,
                      							"de.cau.cs.kieler.lustre.Lustre.ConstantExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getLocal_Constant_DeclarationAccess().getSemicolonKeyword_1_7());
                      			
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
    // $ANTLR end "ruleLocal_Constant_Declaration"


    // $ANTLR start "entryRuleNode_Declaration"
    // InternalLustre.g:1000:1: entryRuleNode_Declaration returns [EObject current=null] : iv_ruleNode_Declaration= ruleNode_Declaration EOF ;
    public final EObject entryRuleNode_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode_Declaration = null;


        try {
            // InternalLustre.g:1000:57: (iv_ruleNode_Declaration= ruleNode_Declaration EOF )
            // InternalLustre.g:1001:2: iv_ruleNode_Declaration= ruleNode_Declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNode_DeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNode_Declaration=ruleNode_Declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNode_Declaration; 
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
    // $ANTLR end "entryRuleNode_Declaration"


    // $ANTLR start "ruleNode_Declaration"
    // InternalLustre.g:1007:1: ruleNode_Declaration returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= ruleVariable_Declaration ) ) (otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) ) )* otherlv_12= ')' otherlv_13= ';' ( ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) ) | ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) ) )* otherlv_16= 'let' ( ( (lv_equations_17_0= ruleEquation ) ) | ( (lv_assertions_18_0= ruleAssertion ) ) | ( (lv_automatons_19_0= ruleAutomaton ) ) )* otherlv_20= 'tel' (otherlv_21= ';' )? ) ;
    public final EObject ruleNode_Declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_returned_9_0 = null;

        EObject lv_returned_11_0 = null;

        EObject lv_constants_14_0 = null;

        EObject lv_variables_15_0 = null;

        EObject lv_equations_17_0 = null;

        EObject lv_assertions_18_0 = null;

        EObject lv_automatons_19_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1013:2: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= ruleVariable_Declaration ) ) (otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) ) )* otherlv_12= ')' otherlv_13= ';' ( ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) ) | ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) ) )* otherlv_16= 'let' ( ( (lv_equations_17_0= ruleEquation ) ) | ( (lv_assertions_18_0= ruleAssertion ) ) | ( (lv_automatons_19_0= ruleAutomaton ) ) )* otherlv_20= 'tel' (otherlv_21= ';' )? ) )
            // InternalLustre.g:1014:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= ruleVariable_Declaration ) ) (otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) ) )* otherlv_12= ')' otherlv_13= ';' ( ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) ) | ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) ) )* otherlv_16= 'let' ( ( (lv_equations_17_0= ruleEquation ) ) | ( (lv_assertions_18_0= ruleAssertion ) ) | ( (lv_automatons_19_0= ruleAutomaton ) ) )* otherlv_20= 'tel' (otherlv_21= ';' )? )
            {
            // InternalLustre.g:1014:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= ruleVariable_Declaration ) ) (otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) ) )* otherlv_12= ')' otherlv_13= ';' ( ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) ) | ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) ) )* otherlv_16= 'let' ( ( (lv_equations_17_0= ruleEquation ) ) | ( (lv_assertions_18_0= ruleAssertion ) ) | ( (lv_automatons_19_0= ruleAutomaton ) ) )* otherlv_20= 'tel' (otherlv_21= ';' )? )
            // InternalLustre.g:1015:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= ruleVariable_Declaration ) ) (otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) ) )* otherlv_12= ')' otherlv_13= ';' ( ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) ) | ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) ) )* otherlv_16= 'let' ( ( (lv_equations_17_0= ruleEquation ) ) | ( (lv_assertions_18_0= ruleAssertion ) ) | ( (lv_automatons_19_0= ruleAutomaton ) ) )* otherlv_20= 'tel' (otherlv_21= ';' )?
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNode_DeclarationAccess().getNodeKeyword_0());
              		
            }
            // InternalLustre.g:1019:3: ( (lv_name_1_0= RULE_IDENT ) )
            // InternalLustre.g:1020:4: (lv_name_1_0= RULE_IDENT )
            {
            // InternalLustre.g:1020:4: (lv_name_1_0= RULE_IDENT )
            // InternalLustre.g:1021:5: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getNode_DeclarationAccess().getNameIDENTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNode_DeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.cau.cs.kieler.lustre.Lustre.IDENT");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNode_DeclarationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLustre.g:1041:3: ( ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_IDENT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalLustre.g:1042:4: ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )*
                    {
                    // InternalLustre.g:1042:4: ( (lv_parameters_3_0= ruleVariable_Declaration ) )
                    // InternalLustre.g:1043:5: (lv_parameters_3_0= ruleVariable_Declaration )
                    {
                    // InternalLustre.g:1043:5: (lv_parameters_3_0= ruleVariable_Declaration )
                    // InternalLustre.g:1044:6: lv_parameters_3_0= ruleVariable_Declaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getParametersVariable_DeclarationParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_parameters_3_0=ruleVariable_Declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNode_DeclarationRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_3_0,
                      							"de.cau.cs.kieler.lustre.Lustre.Variable_Declaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalLustre.g:1061:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalLustre.g:1062:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getNode_DeclarationAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalLustre.g:1066:5: ( (lv_parameters_5_0= ruleVariable_Declaration ) )
                    	    // InternalLustre.g:1067:6: (lv_parameters_5_0= ruleVariable_Declaration )
                    	    {
                    	    // InternalLustre.g:1067:6: (lv_parameters_5_0= ruleVariable_Declaration )
                    	    // InternalLustre.g:1068:7: lv_parameters_5_0= ruleVariable_Declaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getNode_DeclarationAccess().getParametersVariable_DeclarationParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_parameters_5_0=ruleVariable_Declaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getNode_DeclarationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_5_0,
                    	      								"de.cau.cs.kieler.lustre.Lustre.Variable_Declaration");
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
                    break;

            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getNode_DeclarationAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getNode_DeclarationAccess().getReturnsKeyword_5());
              		
            }
            otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getNode_DeclarationAccess().getLeftParenthesisKeyword_6());
              		
            }
            // InternalLustre.g:1099:3: ( (lv_returned_9_0= ruleVariable_Declaration ) )
            // InternalLustre.g:1100:4: (lv_returned_9_0= ruleVariable_Declaration )
            {
            // InternalLustre.g:1100:4: (lv_returned_9_0= ruleVariable_Declaration )
            // InternalLustre.g:1101:5: lv_returned_9_0= ruleVariable_Declaration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNode_DeclarationAccess().getReturnedVariable_DeclarationParserRuleCall_7_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_7);
            lv_returned_9_0=ruleVariable_Declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNode_DeclarationRule());
              					}
              					add(
              						current,
              						"returned",
              						lv_returned_9_0,
              						"de.cau.cs.kieler.lustre.Lustre.Variable_Declaration");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLustre.g:1118:3: (otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLustre.g:1119:4: otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) )
            	    {
            	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_10, grammarAccess.getNode_DeclarationAccess().getCommaKeyword_8_0());
            	      			
            	    }
            	    // InternalLustre.g:1123:4: ( (lv_returned_11_0= ruleVariable_Declaration ) )
            	    // InternalLustre.g:1124:5: (lv_returned_11_0= ruleVariable_Declaration )
            	    {
            	    // InternalLustre.g:1124:5: (lv_returned_11_0= ruleVariable_Declaration )
            	    // InternalLustre.g:1125:6: lv_returned_11_0= ruleVariable_Declaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getReturnedVariable_DeclarationParserRuleCall_8_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    lv_returned_11_0=ruleVariable_Declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getNode_DeclarationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"returned",
            	      							lv_returned_11_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.Variable_Declaration");
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

            otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getNode_DeclarationAccess().getRightParenthesisKeyword_9());
              		
            }
            otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getNode_DeclarationAccess().getSemicolonKeyword_10());
              		
            }
            // InternalLustre.g:1151:3: ( ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) ) | ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }
                else if ( (LA12_0==24) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLustre.g:1152:4: ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) )
            	    {
            	    // InternalLustre.g:1152:4: ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) )
            	    // InternalLustre.g:1153:5: (lv_constants_14_0= ruleLocal_Constant_Declaration )
            	    {
            	    // InternalLustre.g:1153:5: (lv_constants_14_0= ruleLocal_Constant_Declaration )
            	    // InternalLustre.g:1154:6: lv_constants_14_0= ruleLocal_Constant_Declaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getConstantsLocal_Constant_DeclarationParserRuleCall_11_0_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_constants_14_0=ruleLocal_Constant_Declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getNode_DeclarationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"constants",
            	      							lv_constants_14_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.Local_Constant_Declaration");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLustre.g:1172:4: ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) )
            	    {
            	    // InternalLustre.g:1172:4: ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) )
            	    // InternalLustre.g:1173:5: (lv_variables_15_0= ruleLocal_Variable_Declaration )
            	    {
            	    // InternalLustre.g:1173:5: (lv_variables_15_0= ruleLocal_Variable_Declaration )
            	    // InternalLustre.g:1174:6: lv_variables_15_0= ruleLocal_Variable_Declaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getVariablesLocal_Variable_DeclarationParserRuleCall_11_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_variables_15_0=ruleLocal_Variable_Declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getNode_DeclarationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"variables",
            	      							lv_variables_15_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.Local_Variable_Declaration");
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

            otherlv_16=(Token)match(input,25,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getNode_DeclarationAccess().getLetKeyword_12());
              		
            }
            // InternalLustre.g:1196:3: ( ( (lv_equations_17_0= ruleEquation ) ) | ( (lv_assertions_18_0= ruleAssertion ) ) | ( (lv_automatons_19_0= ruleAutomaton ) ) )*
            loop13:
            do {
                int alt13=4;
                switch ( input.LA(1) ) {
                case RULE_IDENT:
                    {
                    alt13=1;
                    }
                    break;
                case 27:
                    {
                    alt13=2;
                    }
                    break;
                case 28:
                    {
                    alt13=3;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // InternalLustre.g:1197:4: ( (lv_equations_17_0= ruleEquation ) )
            	    {
            	    // InternalLustre.g:1197:4: ( (lv_equations_17_0= ruleEquation ) )
            	    // InternalLustre.g:1198:5: (lv_equations_17_0= ruleEquation )
            	    {
            	    // InternalLustre.g:1198:5: (lv_equations_17_0= ruleEquation )
            	    // InternalLustre.g:1199:6: lv_equations_17_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getEquationsEquationParserRuleCall_13_0_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    lv_equations_17_0=ruleEquation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getNode_DeclarationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"equations",
            	      							lv_equations_17_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.Equation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLustre.g:1217:4: ( (lv_assertions_18_0= ruleAssertion ) )
            	    {
            	    // InternalLustre.g:1217:4: ( (lv_assertions_18_0= ruleAssertion ) )
            	    // InternalLustre.g:1218:5: (lv_assertions_18_0= ruleAssertion )
            	    {
            	    // InternalLustre.g:1218:5: (lv_assertions_18_0= ruleAssertion )
            	    // InternalLustre.g:1219:6: lv_assertions_18_0= ruleAssertion
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getAssertionsAssertionParserRuleCall_13_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    lv_assertions_18_0=ruleAssertion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getNode_DeclarationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"assertions",
            	      							lv_assertions_18_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.Assertion");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLustre.g:1237:4: ( (lv_automatons_19_0= ruleAutomaton ) )
            	    {
            	    // InternalLustre.g:1237:4: ( (lv_automatons_19_0= ruleAutomaton ) )
            	    // InternalLustre.g:1238:5: (lv_automatons_19_0= ruleAutomaton )
            	    {
            	    // InternalLustre.g:1238:5: (lv_automatons_19_0= ruleAutomaton )
            	    // InternalLustre.g:1239:6: lv_automatons_19_0= ruleAutomaton
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getAutomatonsAutomatonParserRuleCall_13_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    lv_automatons_19_0=ruleAutomaton();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getNode_DeclarationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"automatons",
            	      							lv_automatons_19_0,
            	      							"de.cau.cs.kieler.lustre.Lustre.Automaton");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_20=(Token)match(input,26,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_20, grammarAccess.getNode_DeclarationAccess().getTelKeyword_14());
              		
            }
            // InternalLustre.g:1261:3: (otherlv_21= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLustre.g:1262:4: otherlv_21= ';'
                    {
                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getNode_DeclarationAccess().getSemicolonKeyword_15());
                      			
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
    // $ANTLR end "ruleNode_Declaration"


    // $ANTLR start "entryRuleEquation"
    // InternalLustre.g:1271:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // InternalLustre.g:1271:49: (iv_ruleEquation= ruleEquation EOF )
            // InternalLustre.g:1272:2: iv_ruleEquation= ruleEquation EOF
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
    // InternalLustre.g:1278:1: ruleEquation returns [EObject current=null] : ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1284:2: ( ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' ) )
            // InternalLustre.g:1285:2: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' )
            {
            // InternalLustre.g:1285:2: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' )
            // InternalLustre.g:1286:3: ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';'
            {
            // InternalLustre.g:1286:3: ( (otherlv_0= RULE_IDENT ) )
            // InternalLustre.g:1287:4: (otherlv_0= RULE_IDENT )
            {
            // InternalLustre.g:1287:4: (otherlv_0= RULE_IDENT )
            // InternalLustre.g:1288:5: otherlv_0= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEquationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getEquationAccess().getLeftVariable_DeclarationCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalLustre.g:1306:3: ( (lv_right_2_0= ruleRight_Part ) )
            // InternalLustre.g:1307:4: (lv_right_2_0= ruleRight_Part )
            {
            // InternalLustre.g:1307:4: (lv_right_2_0= ruleRight_Part )
            // InternalLustre.g:1308:5: lv_right_2_0= ruleRight_Part
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEquationAccess().getRightRight_PartParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_9);
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

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEquationAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

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
    // InternalLustre.g:1333:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalLustre.g:1333:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalLustre.g:1334:2: iv_ruleAssertion= ruleAssertion EOF
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
    // InternalLustre.g:1340:1: ruleAssertion returns [EObject current=null] : (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:1346:2: ( (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' ) )
            // InternalLustre.g:1347:2: (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' )
            {
            // InternalLustre.g:1347:2: (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' )
            // InternalLustre.g:1348:3: otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAssertionAccess().getAssertKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssertionAccess().getExpressionParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_9);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalLustre.g:1371:1: entryRuleAutomaton returns [EObject current=null] : iv_ruleAutomaton= ruleAutomaton EOF ;
    public final EObject entryRuleAutomaton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomaton = null;


        try {
            // InternalLustre.g:1371:50: (iv_ruleAutomaton= ruleAutomaton EOF )
            // InternalLustre.g:1372:2: iv_ruleAutomaton= ruleAutomaton EOF
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
    // InternalLustre.g:1378:1: ruleAutomaton returns [EObject current=null] : (otherlv_0= 'automaton' ( (lv_states_1_0= ruleAState ) ) (otherlv_2= '|' ( (lv_states_3_0= ruleAState ) ) )* otherlv_4= 'end' otherlv_5= ';' ) ;
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
            // InternalLustre.g:1384:2: ( (otherlv_0= 'automaton' ( (lv_states_1_0= ruleAState ) ) (otherlv_2= '|' ( (lv_states_3_0= ruleAState ) ) )* otherlv_4= 'end' otherlv_5= ';' ) )
            // InternalLustre.g:1385:2: (otherlv_0= 'automaton' ( (lv_states_1_0= ruleAState ) ) (otherlv_2= '|' ( (lv_states_3_0= ruleAState ) ) )* otherlv_4= 'end' otherlv_5= ';' )
            {
            // InternalLustre.g:1385:2: (otherlv_0= 'automaton' ( (lv_states_1_0= ruleAState ) ) (otherlv_2= '|' ( (lv_states_3_0= ruleAState ) ) )* otherlv_4= 'end' otherlv_5= ';' )
            // InternalLustre.g:1386:3: otherlv_0= 'automaton' ( (lv_states_1_0= ruleAState ) ) (otherlv_2= '|' ( (lv_states_3_0= ruleAState ) ) )* otherlv_4= 'end' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAutomatonAccess().getAutomatonKeyword_0());
              		
            }
            // InternalLustre.g:1390:3: ( (lv_states_1_0= ruleAState ) )
            // InternalLustre.g:1391:4: (lv_states_1_0= ruleAState )
            {
            // InternalLustre.g:1391:4: (lv_states_1_0= ruleAState )
            // InternalLustre.g:1392:5: lv_states_1_0= ruleAState
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAutomatonAccess().getStatesAStateParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_18);
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

            // InternalLustre.g:1409:3: (otherlv_2= '|' ( (lv_states_3_0= ruleAState ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLustre.g:1410:4: otherlv_2= '|' ( (lv_states_3_0= ruleAState ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAutomatonAccess().getVerticalLineKeyword_2_0());
            	      			
            	    }
            	    // InternalLustre.g:1414:4: ( (lv_states_3_0= ruleAState ) )
            	    // InternalLustre.g:1415:5: (lv_states_3_0= ruleAState )
            	    {
            	    // InternalLustre.g:1415:5: (lv_states_3_0= ruleAState )
            	    // InternalLustre.g:1416:6: lv_states_3_0= ruleAState
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAutomatonAccess().getStatesAStateParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
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
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAutomatonAccess().getEndKeyword_3());
              		
            }
            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalLustre.g:1446:1: entryRuleAState returns [EObject current=null] : iv_ruleAState= ruleAState EOF ;
    public final EObject entryRuleAState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAState = null;


        try {
            // InternalLustre.g:1446:47: (iv_ruleAState= ruleAState EOF )
            // InternalLustre.g:1447:2: iv_ruleAState= ruleAState EOF
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
    // InternalLustre.g:1453:1: ruleAState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '->' ( ( (lv_equations_2_0= ruleEquation ) ) | ( (lv_assertions_3_0= ruleAssertion ) ) | ( (lv_automatons_4_0= ruleAutomaton ) ) )* ( (lv_transitions_5_0= ruleATransition ) )+ ) ;
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
            // InternalLustre.g:1459:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '->' ( ( (lv_equations_2_0= ruleEquation ) ) | ( (lv_assertions_3_0= ruleAssertion ) ) | ( (lv_automatons_4_0= ruleAutomaton ) ) )* ( (lv_transitions_5_0= ruleATransition ) )+ ) )
            // InternalLustre.g:1460:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '->' ( ( (lv_equations_2_0= ruleEquation ) ) | ( (lv_assertions_3_0= ruleAssertion ) ) | ( (lv_automatons_4_0= ruleAutomaton ) ) )* ( (lv_transitions_5_0= ruleATransition ) )+ )
            {
            // InternalLustre.g:1460:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '->' ( ( (lv_equations_2_0= ruleEquation ) ) | ( (lv_assertions_3_0= ruleAssertion ) ) | ( (lv_automatons_4_0= ruleAutomaton ) ) )* ( (lv_transitions_5_0= ruleATransition ) )+ )
            // InternalLustre.g:1461:3: ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '->' ( ( (lv_equations_2_0= ruleEquation ) ) | ( (lv_assertions_3_0= ruleAssertion ) ) | ( (lv_automatons_4_0= ruleAutomaton ) ) )* ( (lv_transitions_5_0= ruleATransition ) )+
            {
            // InternalLustre.g:1461:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:1462:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:1462:4: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:1463:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_19); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAStateAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalLustre.g:1483:3: ( ( (lv_equations_2_0= ruleEquation ) ) | ( (lv_assertions_3_0= ruleAssertion ) ) | ( (lv_automatons_4_0= ruleAutomaton ) ) )*
            loop16:
            do {
                int alt16=4;
                switch ( input.LA(1) ) {
                case RULE_IDENT:
                    {
                    alt16=1;
                    }
                    break;
                case 27:
                    {
                    alt16=2;
                    }
                    break;
                case 28:
                    {
                    alt16=3;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // InternalLustre.g:1484:4: ( (lv_equations_2_0= ruleEquation ) )
            	    {
            	    // InternalLustre.g:1484:4: ( (lv_equations_2_0= ruleEquation ) )
            	    // InternalLustre.g:1485:5: (lv_equations_2_0= ruleEquation )
            	    {
            	    // InternalLustre.g:1485:5: (lv_equations_2_0= ruleEquation )
            	    // InternalLustre.g:1486:6: lv_equations_2_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAStateAccess().getEquationsEquationParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
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
            	    // InternalLustre.g:1504:4: ( (lv_assertions_3_0= ruleAssertion ) )
            	    {
            	    // InternalLustre.g:1504:4: ( (lv_assertions_3_0= ruleAssertion ) )
            	    // InternalLustre.g:1505:5: (lv_assertions_3_0= ruleAssertion )
            	    {
            	    // InternalLustre.g:1505:5: (lv_assertions_3_0= ruleAssertion )
            	    // InternalLustre.g:1506:6: lv_assertions_3_0= ruleAssertion
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAStateAccess().getAssertionsAssertionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
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
            	    // InternalLustre.g:1524:4: ( (lv_automatons_4_0= ruleAutomaton ) )
            	    {
            	    // InternalLustre.g:1524:4: ( (lv_automatons_4_0= ruleAutomaton ) )
            	    // InternalLustre.g:1525:5: (lv_automatons_4_0= ruleAutomaton )
            	    {
            	    // InternalLustre.g:1525:5: (lv_automatons_4_0= ruleAutomaton )
            	    // InternalLustre.g:1526:6: lv_automatons_4_0= ruleAutomaton
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAStateAccess().getAutomatonsAutomatonParserRuleCall_2_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
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
            	    break loop16;
                }
            } while (true);

            // InternalLustre.g:1544:3: ( (lv_transitions_5_0= ruleATransition ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=32 && LA17_0<=33)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLustre.g:1545:4: (lv_transitions_5_0= ruleATransition )
            	    {
            	    // InternalLustre.g:1545:4: (lv_transitions_5_0= ruleATransition )
            	    // InternalLustre.g:1546:5: lv_transitions_5_0= ruleATransition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAStateAccess().getTransitionsATransitionParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
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
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // InternalLustre.g:1567:1: entryRuleATransition returns [EObject current=null] : iv_ruleATransition= ruleATransition EOF ;
    public final EObject entryRuleATransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATransition = null;


        try {
            // InternalLustre.g:1567:52: (iv_ruleATransition= ruleATransition EOF )
            // InternalLustre.g:1568:2: iv_ruleATransition= ruleATransition EOF
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
    // InternalLustre.g:1574:1: ruleATransition returns [EObject current=null] : ( (otherlv_0= 'until' | ( (lv_strong_1_0= 'unless' ) ) ) ( (lv_condition_2_0= ruleExpression ) ) (otherlv_3= 'then' | ( (lv_history_4_0= 'continue' ) ) ) ( (otherlv_5= RULE_IDENT ) ) otherlv_6= ';' ) ;
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
            // InternalLustre.g:1580:2: ( ( (otherlv_0= 'until' | ( (lv_strong_1_0= 'unless' ) ) ) ( (lv_condition_2_0= ruleExpression ) ) (otherlv_3= 'then' | ( (lv_history_4_0= 'continue' ) ) ) ( (otherlv_5= RULE_IDENT ) ) otherlv_6= ';' ) )
            // InternalLustre.g:1581:2: ( (otherlv_0= 'until' | ( (lv_strong_1_0= 'unless' ) ) ) ( (lv_condition_2_0= ruleExpression ) ) (otherlv_3= 'then' | ( (lv_history_4_0= 'continue' ) ) ) ( (otherlv_5= RULE_IDENT ) ) otherlv_6= ';' )
            {
            // InternalLustre.g:1581:2: ( (otherlv_0= 'until' | ( (lv_strong_1_0= 'unless' ) ) ) ( (lv_condition_2_0= ruleExpression ) ) (otherlv_3= 'then' | ( (lv_history_4_0= 'continue' ) ) ) ( (otherlv_5= RULE_IDENT ) ) otherlv_6= ';' )
            // InternalLustre.g:1582:3: (otherlv_0= 'until' | ( (lv_strong_1_0= 'unless' ) ) ) ( (lv_condition_2_0= ruleExpression ) ) (otherlv_3= 'then' | ( (lv_history_4_0= 'continue' ) ) ) ( (otherlv_5= RULE_IDENT ) ) otherlv_6= ';'
            {
            // InternalLustre.g:1582:3: (otherlv_0= 'until' | ( (lv_strong_1_0= 'unless' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            else if ( (LA18_0==33) ) {
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
                    // InternalLustre.g:1583:4: otherlv_0= 'until'
                    {
                    otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getATransitionAccess().getUntilKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalLustre.g:1588:4: ( (lv_strong_1_0= 'unless' ) )
                    {
                    // InternalLustre.g:1588:4: ( (lv_strong_1_0= 'unless' ) )
                    // InternalLustre.g:1589:5: (lv_strong_1_0= 'unless' )
                    {
                    // InternalLustre.g:1589:5: (lv_strong_1_0= 'unless' )
                    // InternalLustre.g:1590:6: lv_strong_1_0= 'unless'
                    {
                    lv_strong_1_0=(Token)match(input,33,FollowSets000.FOLLOW_17); if (state.failed) return current;
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

            // InternalLustre.g:1603:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalLustre.g:1604:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalLustre.g:1604:4: (lv_condition_2_0= ruleExpression )
            // InternalLustre.g:1605:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getATransitionAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_22);
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

            // InternalLustre.g:1622:3: (otherlv_3= 'then' | ( (lv_history_4_0= 'continue' ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            else if ( (LA19_0==35) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalLustre.g:1623:4: otherlv_3= 'then'
                    {
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getATransitionAccess().getThenKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalLustre.g:1628:4: ( (lv_history_4_0= 'continue' ) )
                    {
                    // InternalLustre.g:1628:4: ( (lv_history_4_0= 'continue' ) )
                    // InternalLustre.g:1629:5: (lv_history_4_0= 'continue' )
                    {
                    // InternalLustre.g:1629:5: (lv_history_4_0= 'continue' )
                    // InternalLustre.g:1630:6: lv_history_4_0= 'continue'
                    {
                    lv_history_4_0=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
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

            // InternalLustre.g:1643:3: ( (otherlv_5= RULE_IDENT ) )
            // InternalLustre.g:1644:4: (otherlv_5= RULE_IDENT )
            {
            // InternalLustre.g:1644:4: (otherlv_5= RULE_IDENT )
            // InternalLustre.g:1645:5: otherlv_5= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getATransitionRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getATransitionAccess().getNextStateAStateCrossReference_3_0());
              				
            }

            }


            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalLustre.g:1667:1: entryRuleLeft_List returns [EObject current=null] : iv_ruleLeft_List= ruleLeft_List EOF ;
    public final EObject entryRuleLeft_List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft_List = null;


        try {
            // InternalLustre.g:1667:50: (iv_ruleLeft_List= ruleLeft_List EOF )
            // InternalLustre.g:1668:2: iv_ruleLeft_List= ruleLeft_List EOF
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
    // InternalLustre.g:1674:1: ruleLeft_List returns [EObject current=null] : ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* ) ;
    public final EObject ruleLeft_List() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_id_0_0 = null;

        EObject lv_id_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1680:2: ( ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* ) )
            // InternalLustre.g:1681:2: ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* )
            {
            // InternalLustre.g:1681:2: ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* )
            // InternalLustre.g:1682:3: ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )*
            {
            // InternalLustre.g:1682:3: ( (lv_id_0_0= ruleLeft ) )
            // InternalLustre.g:1683:4: (lv_id_0_0= ruleLeft )
            {
            // InternalLustre.g:1683:4: (lv_id_0_0= ruleLeft )
            // InternalLustre.g:1684:5: lv_id_0_0= ruleLeft
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLeft_ListAccess().getIdLeftParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_23);
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

            // InternalLustre.g:1701:3: (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLustre.g:1702:4: otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getLeft_ListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalLustre.g:1706:4: ( (lv_id_2_0= ruleLeft ) )
            	    // InternalLustre.g:1707:5: (lv_id_2_0= ruleLeft )
            	    {
            	    // InternalLustre.g:1707:5: (lv_id_2_0= ruleLeft )
            	    // InternalLustre.g:1708:6: lv_id_2_0= ruleLeft
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLeft_ListAccess().getIdLeftParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
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
            	    break loop20;
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
    // InternalLustre.g:1730:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // InternalLustre.g:1730:45: (iv_ruleLeft= ruleLeft EOF )
            // InternalLustre.g:1731:2: iv_ruleLeft= ruleLeft EOF
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
    // InternalLustre.g:1737:1: ruleLeft returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )? ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_selector_1_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1743:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )? ) )
            // InternalLustre.g:1744:2: ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )? )
            {
            // InternalLustre.g:1744:2: ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )? )
            // InternalLustre.g:1745:3: ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )?
            {
            // InternalLustre.g:1745:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:1746:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:1746:4: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:1747:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FollowSets000.FOLLOW_24); if (state.failed) return current;
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

            // InternalLustre.g:1763:3: ( (lv_selector_1_0= ruleSelector ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=36 && LA21_0<=37)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLustre.g:1764:4: (lv_selector_1_0= ruleSelector )
                    {
                    // InternalLustre.g:1764:4: (lv_selector_1_0= ruleSelector )
                    // InternalLustre.g:1765:5: lv_selector_1_0= ruleSelector
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
    // InternalLustre.g:1786:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalLustre.g:1786:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalLustre.g:1787:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalLustre.g:1793:1: ruleSelector returns [EObject current=null] : ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) ) ;
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
            // InternalLustre.g:1799:2: ( ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) ) )
            // InternalLustre.g:1800:2: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) )
            {
            // InternalLustre.g:1800:2: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            else if ( (LA23_0==37) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalLustre.g:1801:3: (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) )
                    {
                    // InternalLustre.g:1801:3: (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) )
                    // InternalLustre.g:1802:4: otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) )
                    {
                    otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getFullStopKeyword_0_0());
                      			
                    }
                    // InternalLustre.g:1806:4: ( (lv_name_1_0= RULE_IDENT ) )
                    // InternalLustre.g:1807:5: (lv_name_1_0= RULE_IDENT )
                    {
                    // InternalLustre.g:1807:5: (lv_name_1_0= RULE_IDENT )
                    // InternalLustre.g:1808:6: lv_name_1_0= RULE_IDENT
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
                    // InternalLustre.g:1826:3: (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' )
                    {
                    // InternalLustre.g:1826:3: (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' )
                    // InternalLustre.g:1827:4: otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']'
                    {
                    otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalLustre.g:1831:4: ( (lv_begin_3_0= ruleExpression ) )
                    // InternalLustre.g:1832:5: (lv_begin_3_0= ruleExpression )
                    {
                    // InternalLustre.g:1832:5: (lv_begin_3_0= ruleExpression )
                    // InternalLustre.g:1833:6: lv_begin_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSelectorAccess().getBeginExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
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

                    // InternalLustre.g:1850:4: ( (lv_end_4_0= ruleSelTrancheEnd ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==39) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalLustre.g:1851:5: (lv_end_4_0= ruleSelTrancheEnd )
                            {
                            // InternalLustre.g:1851:5: (lv_end_4_0= ruleSelTrancheEnd )
                            // InternalLustre.g:1852:6: lv_end_4_0= ruleSelTrancheEnd
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getSelectorAccess().getEndSelTrancheEndParserRuleCall_1_2_0());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_26);
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

                    otherlv_5=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalLustre.g:1878:1: entryRuleSelTrancheEnd returns [EObject current=null] : iv_ruleSelTrancheEnd= ruleSelTrancheEnd EOF ;
    public final EObject entryRuleSelTrancheEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelTrancheEnd = null;


        try {
            // InternalLustre.g:1878:54: (iv_ruleSelTrancheEnd= ruleSelTrancheEnd EOF )
            // InternalLustre.g:1879:2: iv_ruleSelTrancheEnd= ruleSelTrancheEnd EOF
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
    // InternalLustre.g:1885:1: ruleSelTrancheEnd returns [EObject current=null] : (otherlv_0= '..' this_Expression_1= ruleExpression ) ;
    public final EObject ruleSelTrancheEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:1891:2: ( (otherlv_0= '..' this_Expression_1= ruleExpression ) )
            // InternalLustre.g:1892:2: (otherlv_0= '..' this_Expression_1= ruleExpression )
            {
            // InternalLustre.g:1892:2: (otherlv_0= '..' this_Expression_1= ruleExpression )
            // InternalLustre.g:1893:3: otherlv_0= '..' this_Expression_1= ruleExpression
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_17); if (state.failed) return current;
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
    // InternalLustre.g:1912:1: entryRuleRight_Part returns [EObject current=null] : iv_ruleRight_Part= ruleRight_Part EOF ;
    public final EObject entryRuleRight_Part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight_Part = null;


        try {
            // InternalLustre.g:1912:51: (iv_ruleRight_Part= ruleRight_Part EOF )
            // InternalLustre.g:1913:2: iv_ruleRight_Part= ruleRight_Part EOF
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
    // InternalLustre.g:1919:1: ruleRight_Part returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleRight_Part() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1925:2: (this_Expression_0= ruleExpression )
            // InternalLustre.g:1926:2: this_Expression_0= ruleExpression
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
    // InternalLustre.g:1940:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalLustre.g:1940:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalLustre.g:1941:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalLustre.g:1947:1: ruleExpression returns [EObject current=null] : ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby ) ;
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
            // InternalLustre.g:1953:2: ( ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby ) )
            // InternalLustre.g:1954:2: ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby )
            {
            // InternalLustre.g:1954:2: ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=RULE_IDENT && LA24_0<=RULE_INT)||LA24_0==14||LA24_0==52||(LA24_0>=55 && LA24_0<=57)) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalLustre.g:1955:3: ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) )
                    {
                    // InternalLustre.g:1955:3: ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) )
                    // InternalLustre.g:1956:4: () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) )
                    {
                    // InternalLustre.g:1956:4: ()
                    // InternalLustre.g:1957:5: 
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

                    otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getIfKeyword_0_1());
                      			
                    }
                    // InternalLustre.g:1970:4: ( (lv_ifexpr_2_0= ruleExpression ) )
                    // InternalLustre.g:1971:5: (lv_ifexpr_2_0= ruleExpression )
                    {
                    // InternalLustre.g:1971:5: (lv_ifexpr_2_0= ruleExpression )
                    // InternalLustre.g:1972:6: lv_ifexpr_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getIfexprExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
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

                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getThenKeyword_0_3());
                      			
                    }
                    // InternalLustre.g:1993:4: ( (lv_thenexpr_4_0= ruleExpression ) )
                    // InternalLustre.g:1994:5: (lv_thenexpr_4_0= ruleExpression )
                    {
                    // InternalLustre.g:1994:5: (lv_thenexpr_4_0= ruleExpression )
                    // InternalLustre.g:1995:6: lv_thenexpr_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getThenexprExpressionParserRuleCall_0_4_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
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

                    otherlv_5=(Token)match(input,41,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getElseKeyword_0_5());
                      			
                    }
                    // InternalLustre.g:2016:4: ( (lv_elseexpr_6_0= ruleExpression ) )
                    // InternalLustre.g:2017:5: (lv_elseexpr_6_0= ruleExpression )
                    {
                    // InternalLustre.g:2017:5: (lv_elseexpr_6_0= ruleExpression )
                    // InternalLustre.g:2018:6: lv_elseexpr_6_0= ruleExpression
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
                    // InternalLustre.g:2037:3: this_Fby_7= ruleFby
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
    // InternalLustre.g:2052:1: entryRuleFby returns [EObject current=null] : iv_ruleFby= ruleFby EOF ;
    public final EObject entryRuleFby() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFby = null;


        try {
            // InternalLustre.g:2052:44: (iv_ruleFby= ruleFby EOF )
            // InternalLustre.g:2053:2: iv_ruleFby= ruleFby EOF
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
    // InternalLustre.g:2059:1: ruleFby returns [EObject current=null] : (this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )? ) ;
    public final EObject ruleFby() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Arrow_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2065:2: ( (this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )? ) )
            // InternalLustre.g:2066:2: (this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )? )
            {
            // InternalLustre.g:2066:2: (this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )? )
            // InternalLustre.g:2067:3: this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFbyAccess().getArrowParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_29);
            this_Arrow_0=ruleArrow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Arrow_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLustre.g:2078:3: ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalLustre.g:2079:4: () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+
                    {
                    // InternalLustre.g:2079:4: ()
                    // InternalLustre.g:2080:5: 
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

                    // InternalLustre.g:2089:4: (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==42) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalLustre.g:2090:5: otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) )
                    	    {
                    	    otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getFbyAccess().getFbyKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalLustre.g:2094:5: ( (lv_subExpressions_3_0= ruleArrow ) )
                    	    // InternalLustre.g:2095:6: (lv_subExpressions_3_0= ruleArrow )
                    	    {
                    	    // InternalLustre.g:2095:6: (lv_subExpressions_3_0= ruleArrow )
                    	    // InternalLustre.g:2096:7: lv_subExpressions_3_0= ruleArrow
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFbyAccess().getSubExpressionsArrowParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_29);
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
        }
        return current;
    }
    // $ANTLR end "ruleFby"


    // $ANTLR start "entryRuleArrow"
    // InternalLustre.g:2119:1: entryRuleArrow returns [EObject current=null] : iv_ruleArrow= ruleArrow EOF ;
    public final EObject entryRuleArrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrow = null;


        try {
            // InternalLustre.g:2119:46: (iv_ruleArrow= ruleArrow EOF )
            // InternalLustre.g:2120:2: iv_ruleArrow= ruleArrow EOF
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
    // InternalLustre.g:2126:1: ruleArrow returns [EObject current=null] : (this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )? ) ;
    public final EObject ruleArrow() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2132:2: ( (this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )? ) )
            // InternalLustre.g:2133:2: (this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )? )
            {
            // InternalLustre.g:2133:2: (this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )? )
            // InternalLustre.g:2134:3: this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArrowAccess().getOrParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_30);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Or_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLustre.g:2145:3: ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalLustre.g:2146:4: () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+
                    {
                    // InternalLustre.g:2146:4: ()
                    // InternalLustre.g:2147:5: 
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

                    // InternalLustre.g:2156:4: (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==31) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalLustre.g:2157:5: otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) )
                    	    {
                    	    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getArrowAccess().getHyphenMinusGreaterThanSignKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalLustre.g:2161:5: ( (lv_subExpressions_3_0= ruleOr ) )
                    	    // InternalLustre.g:2162:6: (lv_subExpressions_3_0= ruleOr )
                    	    {
                    	    // InternalLustre.g:2162:6: (lv_subExpressions_3_0= ruleOr )
                    	    // InternalLustre.g:2163:7: lv_subExpressions_3_0= ruleOr
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getArrowAccess().getSubExpressionsOrParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_30);
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
        }
        return current;
    }
    // $ANTLR end "ruleArrow"


    // $ANTLR start "entryRuleOr"
    // InternalLustre.g:2186:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalLustre.g:2186:43: (iv_ruleOr= ruleOr EOF )
            // InternalLustre.g:2187:2: iv_ruleOr= ruleOr EOF
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
    // InternalLustre.g:2193:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )? ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2199:2: ( (this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )? ) )
            // InternalLustre.g:2200:2: (this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )? )
            {
            // InternalLustre.g:2200:2: (this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )? )
            // InternalLustre.g:2201:3: this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_31);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLustre.g:2212:3: ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalLustre.g:2213:4: () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+
                    {
                    // InternalLustre.g:2213:4: ()
                    // InternalLustre.g:2214:5: 
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

                    // InternalLustre.g:2223:4: (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==43) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalLustre.g:2224:5: otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) )
                    	    {
                    	    otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalLustre.g:2228:5: ( (lv_subExpressions_3_0= ruleAnd ) )
                    	    // InternalLustre.g:2229:6: (lv_subExpressions_3_0= ruleAnd )
                    	    {
                    	    // InternalLustre.g:2229:6: (lv_subExpressions_3_0= ruleAnd )
                    	    // InternalLustre.g:2230:7: lv_subExpressions_3_0= ruleAnd
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOrAccess().getSubExpressionsAndParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_31);
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
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalLustre.g:2253:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalLustre.g:2253:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalLustre.g:2254:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalLustre.g:2260:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )? ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2266:2: ( (this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )? ) )
            // InternalLustre.g:2267:2: (this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )? )
            {
            // InternalLustre.g:2267:2: (this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )? )
            // InternalLustre.g:2268:3: this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_32);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLustre.g:2279:3: ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalLustre.g:2280:4: () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+
                    {
                    // InternalLustre.g:2280:4: ()
                    // InternalLustre.g:2281:5: 
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

                    // InternalLustre.g:2290:4: (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==44) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalLustre.g:2291:5: otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) )
                    	    {
                    	    otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalLustre.g:2295:5: ( (lv_subExpressions_3_0= ruleEquality ) )
                    	    // InternalLustre.g:2296:6: (lv_subExpressions_3_0= ruleEquality )
                    	    {
                    	    // InternalLustre.g:2296:6: (lv_subExpressions_3_0= ruleEquality )
                    	    // InternalLustre.g:2297:7: lv_subExpressions_3_0= ruleEquality
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAndAccess().getSubExpressionsEqualityParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_32);
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
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalLustre.g:2320:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalLustre.g:2320:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalLustre.g:2321:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalLustre.g:2327:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2333:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalLustre.g:2334:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalLustre.g:2334:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalLustre.g:2335:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_33);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLustre.g:2346:3: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==21||LA34_0==45) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalLustre.g:2347:4: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalLustre.g:2347:4: ()
            	    // InternalLustre.g:2348:5: 
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

            	    // InternalLustre.g:2357:4: ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) )
            	    // InternalLustre.g:2358:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    {
            	    // InternalLustre.g:2358:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    // InternalLustre.g:2359:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    {
            	    // InternalLustre.g:2359:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==21) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==45) ) {
            	        alt33=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalLustre.g:2360:7: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,21,FollowSets000.FOLLOW_17); if (state.failed) return current;
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
            	            // InternalLustre.g:2371:7: lv_op_2_2= '<>'
            	            {
            	            lv_op_2_2=(Token)match(input,45,FollowSets000.FOLLOW_17); if (state.failed) return current;
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

            	    // InternalLustre.g:2384:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalLustre.g:2385:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalLustre.g:2385:5: (lv_right_3_0= ruleComparison )
            	    // InternalLustre.g:2386:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_33);
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
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalLustre.g:2408:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalLustre.g:2408:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalLustre.g:2409:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalLustre.g:2415:1: ruleComparison returns [EObject current=null] : (this_Mod_0= ruleMod ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) ) )* ) ;
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
            // InternalLustre.g:2421:2: ( (this_Mod_0= ruleMod ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) ) )* ) )
            // InternalLustre.g:2422:2: (this_Mod_0= ruleMod ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) ) )* )
            {
            // InternalLustre.g:2422:2: (this_Mod_0= ruleMod ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) ) )* )
            // InternalLustre.g:2423:3: this_Mod_0= ruleMod ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getModParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_34);
            this_Mod_0=ruleMod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Mod_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLustre.g:2434:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=46 && LA36_0<=49)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalLustre.g:2435:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) )
            	    {
            	    // InternalLustre.g:2435:4: ()
            	    // InternalLustre.g:2436:5: 
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

            	    // InternalLustre.g:2445:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalLustre.g:2446:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalLustre.g:2446:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalLustre.g:2447:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalLustre.g:2447:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt35=4;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt35=1;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt35=2;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt35=3;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt35=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt35) {
            	        case 1 :
            	            // InternalLustre.g:2448:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,46,FollowSets000.FOLLOW_17); if (state.failed) return current;
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
            	            // InternalLustre.g:2459:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,47,FollowSets000.FOLLOW_17); if (state.failed) return current;
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
            	            // InternalLustre.g:2470:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,48,FollowSets000.FOLLOW_17); if (state.failed) return current;
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
            	            // InternalLustre.g:2481:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,49,FollowSets000.FOLLOW_17); if (state.failed) return current;
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

            	    // InternalLustre.g:2494:4: ( (lv_right_3_0= ruleMod ) )
            	    // InternalLustre.g:2495:5: (lv_right_3_0= ruleMod )
            	    {
            	    // InternalLustre.g:2495:5: (lv_right_3_0= ruleMod )
            	    // InternalLustre.g:2496:6: lv_right_3_0= ruleMod
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightModParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_34);
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
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleMod"
    // InternalLustre.g:2518:1: entryRuleMod returns [EObject current=null] : iv_ruleMod= ruleMod EOF ;
    public final EObject entryRuleMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMod = null;


        try {
            // InternalLustre.g:2518:44: (iv_ruleMod= ruleMod EOF )
            // InternalLustre.g:2519:2: iv_ruleMod= ruleMod EOF
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
    // InternalLustre.g:2525:1: ruleMod returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleMod() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2531:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalLustre.g:2532:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalLustre.g:2532:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) ) )* )
            // InternalLustre.g:2533:3: this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getModAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_35);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLustre.g:2544:3: ( () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==50) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalLustre.g:2545:4: () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalLustre.g:2545:4: ()
            	    // InternalLustre.g:2546:5: 
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

            	    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getModAccess().getModKeyword_1_1());
            	      			
            	    }
            	    // InternalLustre.g:2559:4: ( (lv_subExpressions_3_0= rulePlusOrMinus ) )
            	    // InternalLustre.g:2560:5: (lv_subExpressions_3_0= rulePlusOrMinus )
            	    {
            	    // InternalLustre.g:2560:5: (lv_subExpressions_3_0= rulePlusOrMinus )
            	    // InternalLustre.g:2561:6: lv_subExpressions_3_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModAccess().getSubExpressionsPlusOrMinusParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_35);
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
        }
        return current;
    }
    // $ANTLR end "ruleMod"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalLustre.g:2583:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalLustre.g:2583:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalLustre.g:2584:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalLustre.g:2590:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2596:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalLustre.g:2597:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalLustre.g:2597:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )* )
            // InternalLustre.g:2598:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_36);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLustre.g:2609:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=51 && LA39_0<=52)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalLustre.g:2610:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalLustre.g:2610:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==51) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==52) ) {
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
            	            // InternalLustre.g:2611:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalLustre.g:2611:5: ( () otherlv_2= '+' )
            	            // InternalLustre.g:2612:6: () otherlv_2= '+'
            	            {
            	            // InternalLustre.g:2612:6: ()
            	            // InternalLustre.g:2613:7: 
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

            	            otherlv_2=(Token)match(input,51,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:2628:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalLustre.g:2628:5: ( () otherlv_4= '-' )
            	            // InternalLustre.g:2629:6: () otherlv_4= '-'
            	            {
            	            // InternalLustre.g:2629:6: ()
            	            // InternalLustre.g:2630:7: 
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

            	            otherlv_4=(Token)match(input,52,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalLustre.g:2645:4: ( (lv_subExpressions_5_0= ruleMulOrDiv ) )
            	    // InternalLustre.g:2646:5: (lv_subExpressions_5_0= ruleMulOrDiv )
            	    {
            	    // InternalLustre.g:2646:5: (lv_subExpressions_5_0= ruleMulOrDiv )
            	    // InternalLustre.g:2647:6: lv_subExpressions_5_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getSubExpressionsMulOrDivParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_36);
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
        }
        return current;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalLustre.g:2669:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalLustre.g:2669:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalLustre.g:2670:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalLustre.g:2676:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2682:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )* ) )
            // InternalLustre.g:2683:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )* )
            {
            // InternalLustre.g:2683:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )* )
            // InternalLustre.g:2684:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_37);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLustre.g:2695:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=53 && LA41_0<=54)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalLustre.g:2696:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) )
            	    {
            	    // InternalLustre.g:2696:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==53) ) {
            	        alt40=1;
            	    }
            	    else if ( (LA40_0==54) ) {
            	        alt40=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalLustre.g:2697:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalLustre.g:2697:5: ( () otherlv_2= '*' )
            	            // InternalLustre.g:2698:6: () otherlv_2= '*'
            	            {
            	            // InternalLustre.g:2698:6: ()
            	            // InternalLustre.g:2699:7: 
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

            	            otherlv_2=(Token)match(input,53,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:2714:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalLustre.g:2714:5: ( () otherlv_4= '/' )
            	            // InternalLustre.g:2715:6: () otherlv_4= '/'
            	            {
            	            // InternalLustre.g:2715:6: ()
            	            // InternalLustre.g:2716:7: 
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

            	            otherlv_4=(Token)match(input,54,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalLustre.g:2731:4: ( (lv_subExpressions_5_0= rulePrimary ) )
            	    // InternalLustre.g:2732:5: (lv_subExpressions_5_0= rulePrimary )
            	    {
            	    // InternalLustre.g:2732:5: (lv_subExpressions_5_0= rulePrimary )
            	    // InternalLustre.g:2733:6: lv_subExpressions_5_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getSubExpressionsPrimaryParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_37);
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
            	    break loop41;
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
    // InternalLustre.g:2755:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalLustre.g:2755:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalLustre.g:2756:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalLustre.g:2762:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression ) ;
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
            // InternalLustre.g:2768:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression ) )
            // InternalLustre.g:2769:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression )
            {
            // InternalLustre.g:2769:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression )
            int alt42=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt42=1;
                }
                break;
            case 55:
                {
                alt42=2;
                }
                break;
            case 52:
                {
                alt42=3;
                }
                break;
            case 56:
                {
                alt42=4;
                }
                break;
            case 57:
                {
                alt42=5;
                }
                break;
            case RULE_IDENT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_INT:
                {
                alt42=6;
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
                    // InternalLustre.g:2770:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalLustre.g:2770:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalLustre.g:2771:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:2792:3: ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:2792:3: ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalLustre.g:2793:4: () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalLustre.g:2793:4: ()
                    // InternalLustre.g:2794:5: 
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

                    otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getNotKeyword_1_1());
                      			
                    }
                    // InternalLustre.g:2807:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalLustre.g:2808:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalLustre.g:2808:5: (lv_expression_5_0= rulePrimary )
                    // InternalLustre.g:2809:6: lv_expression_5_0= rulePrimary
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
                    // InternalLustre.g:2828:3: ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:2828:3: ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) )
                    // InternalLustre.g:2829:4: () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) )
                    {
                    // InternalLustre.g:2829:4: ()
                    // InternalLustre.g:2830:5: 
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

                    otherlv_7=(Token)match(input,52,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1());
                      			
                    }
                    // InternalLustre.g:2843:4: ( (lv_expression_8_0= rulePrimary ) )
                    // InternalLustre.g:2844:5: (lv_expression_8_0= rulePrimary )
                    {
                    // InternalLustre.g:2844:5: (lv_expression_8_0= rulePrimary )
                    // InternalLustre.g:2845:6: lv_expression_8_0= rulePrimary
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
                    // InternalLustre.g:2864:3: ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:2864:3: ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) )
                    // InternalLustre.g:2865:4: () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) )
                    {
                    // InternalLustre.g:2865:4: ()
                    // InternalLustre.g:2866:5: 
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

                    otherlv_10=(Token)match(input,56,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getPrimaryAccess().getPreKeyword_3_1());
                      			
                    }
                    // InternalLustre.g:2879:4: ( (lv_expression_11_0= rulePrimary ) )
                    // InternalLustre.g:2880:5: (lv_expression_11_0= rulePrimary )
                    {
                    // InternalLustre.g:2880:5: (lv_expression_11_0= rulePrimary )
                    // InternalLustre.g:2881:6: lv_expression_11_0= rulePrimary
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
                    // InternalLustre.g:2900:3: ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:2900:3: ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) )
                    // InternalLustre.g:2901:4: () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) )
                    {
                    // InternalLustre.g:2901:4: ()
                    // InternalLustre.g:2902:5: 
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

                    otherlv_13=(Token)match(input,57,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getPrimaryAccess().getCurrentKeyword_4_1());
                      			
                    }
                    // InternalLustre.g:2915:4: ( (lv_expression_14_0= rulePrimary ) )
                    // InternalLustre.g:2916:5: (lv_expression_14_0= rulePrimary )
                    {
                    // InternalLustre.g:2916:5: (lv_expression_14_0= rulePrimary )
                    // InternalLustre.g:2917:6: lv_expression_14_0= rulePrimary
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
                    // InternalLustre.g:2936:3: this_AtomicExpression_15= ruleAtomicExpression
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
    // InternalLustre.g:2951:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalLustre.g:2951:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalLustre.g:2952:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalLustre.g:2958:1: ruleAtomicExpression returns [EObject current=null] : (this_ConstantExpression_0= ruleConstantExpression | this_VariableReference_1= ruleVariableReference ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantExpression_0 = null;

        EObject this_VariableReference_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:2964:2: ( (this_ConstantExpression_0= ruleConstantExpression | this_VariableReference_1= ruleVariableReference ) )
            // InternalLustre.g:2965:2: (this_ConstantExpression_0= ruleConstantExpression | this_VariableReference_1= ruleVariableReference )
            {
            // InternalLustre.g:2965:2: (this_ConstantExpression_0= ruleConstantExpression | this_VariableReference_1= ruleVariableReference )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_BOOL && LA43_0<=RULE_INT)) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_IDENT) ) {
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
                    // InternalLustre.g:2966:3: this_ConstantExpression_0= ruleConstantExpression
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
                    // InternalLustre.g:2978:3: this_VariableReference_1= ruleVariableReference
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
    // InternalLustre.g:2993:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // InternalLustre.g:2993:58: (iv_ruleVariableReference= ruleVariableReference EOF )
            // InternalLustre.g:2994:2: iv_ruleVariableReference= ruleVariableReference EOF
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
    // InternalLustre.g:3000:1: ruleVariableReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_IDENT ) ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLustre.g:3006:2: ( ( () ( (otherlv_1= RULE_IDENT ) ) ) )
            // InternalLustre.g:3007:2: ( () ( (otherlv_1= RULE_IDENT ) ) )
            {
            // InternalLustre.g:3007:2: ( () ( (otherlv_1= RULE_IDENT ) ) )
            // InternalLustre.g:3008:3: () ( (otherlv_1= RULE_IDENT ) )
            {
            // InternalLustre.g:3008:3: ()
            // InternalLustre.g:3009:4: 
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

            // InternalLustre.g:3018:3: ( (otherlv_1= RULE_IDENT ) )
            // InternalLustre.g:3019:4: (otherlv_1= RULE_IDENT )
            {
            // InternalLustre.g:3019:4: (otherlv_1= RULE_IDENT )
            // InternalLustre.g:3020:5: otherlv_1= RULE_IDENT
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
    // InternalLustre.g:3038:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // InternalLustre.g:3038:59: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // InternalLustre.g:3039:2: iv_ruleConstantExpression= ruleConstantExpression EOF
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
    // InternalLustre.g:3045:1: ruleConstantExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;


        	enterRule();

        try {
            // InternalLustre.g:3051:2: ( ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) ) )
            // InternalLustre.g:3052:2: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) )
            {
            // InternalLustre.g:3052:2: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt44=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt44=2;
                }
                break;
            case RULE_INT:
                {
                alt44=3;
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
                    // InternalLustre.g:3053:3: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
                    {
                    // InternalLustre.g:3053:3: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
                    // InternalLustre.g:3054:4: () ( (lv_value_1_0= RULE_BOOL ) )
                    {
                    // InternalLustre.g:3054:4: ()
                    // InternalLustre.g:3055:5: 
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

                    // InternalLustre.g:3064:4: ( (lv_value_1_0= RULE_BOOL ) )
                    // InternalLustre.g:3065:5: (lv_value_1_0= RULE_BOOL )
                    {
                    // InternalLustre.g:3065:5: (lv_value_1_0= RULE_BOOL )
                    // InternalLustre.g:3066:6: lv_value_1_0= RULE_BOOL
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
                    // InternalLustre.g:3084:3: ( () ( (lv_value_3_0= RULE_FLOAT ) ) )
                    {
                    // InternalLustre.g:3084:3: ( () ( (lv_value_3_0= RULE_FLOAT ) ) )
                    // InternalLustre.g:3085:4: () ( (lv_value_3_0= RULE_FLOAT ) )
                    {
                    // InternalLustre.g:3085:4: ()
                    // InternalLustre.g:3086:5: 
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

                    // InternalLustre.g:3095:4: ( (lv_value_3_0= RULE_FLOAT ) )
                    // InternalLustre.g:3096:5: (lv_value_3_0= RULE_FLOAT )
                    {
                    // InternalLustre.g:3096:5: (lv_value_3_0= RULE_FLOAT )
                    // InternalLustre.g:3097:6: lv_value_3_0= RULE_FLOAT
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
                    // InternalLustre.g:3115:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    {
                    // InternalLustre.g:3115:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    // InternalLustre.g:3116:4: () ( (lv_value_5_0= RULE_INT ) )
                    {
                    // InternalLustre.g:3116:4: ()
                    // InternalLustre.g:3117:5: 
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

                    // InternalLustre.g:3126:4: ( (lv_value_5_0= RULE_INT ) )
                    // InternalLustre.g:3127:5: (lv_value_5_0= RULE_INT )
                    {
                    // InternalLustre.g:3127:5: (lv_value_5_0= RULE_INT )
                    // InternalLustre.g:3128:6: lv_value_5_0= RULE_INT
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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000000E0L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003400000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000001C000010L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x03900100000040F0L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000318000010L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000318000012L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000003000000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000200002L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0003C00000000002L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0018000000000002L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0060000000000002L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000010000L});
    }


}