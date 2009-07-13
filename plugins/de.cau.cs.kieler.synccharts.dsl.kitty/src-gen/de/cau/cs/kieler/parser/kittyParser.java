// $ANTLR 3.0 ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g 2009-07-13 17:26:56

package de.cau.cs.kieler.parser;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManagerNeu;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import de.cau.cs.kieler.MetaModelRegistration;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class kittyParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'statechart'", "'['", "';'", "']'", "'{'", "'}'", "'_'", "'#'", "'.'", "'model'", "'='", "'version'", "':'", "'input'", "'output'", "'var'", "'boolean'", "'double'", "'float'", "'integer'", "'combine integer with +'", "'combine integer with *'", "'||'", "'label'", "'type'", "'doActivity'", "'do'", "'entryActivity'", "'entry'", "'exitActivity'", "'exit'", "'final'", "'initial'", "'history'", "'choice'", "'dynamicchoice'", "'suspend'", "'localEvent'", "'localVariable'", "'<'", "'>'", "'->'", "'priority'", "'weakAbortion'", "'wa'", "'strongAbortion'", "'sa'", "'normalTermination'", "'nt'", "'suspension'", "'sp'", "'conditional'", "'co'", "'internal'", "'it'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_INT=5;
    public static final int RULE_WS=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public kittyParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[91+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g"; }



    	private Token getLastToken() {
    		return input.LT(-1);
    	}

    	protected Object convert(Object arg) {
    		if (arg instanceof org.antlr.runtime.Token) {
    			Token t = (Token) arg;
    			String s = t.getText();
    			if (t.getType() == kittyLexer.RULE_ID && s.startsWith("^")) {
    				return s.substring(1);
    			} else if (t.getType()==kittyLexer.RULE_STRING) {
    				return s.substring(1,s.length()-1);
    			} else if (t.getType()==kittyLexer.RULE_INT) {
    				return Integer.valueOf(s);
    			}
    			return s;
    		}
    		return arg;
    	}


    	private EcoreModelFactory factory = new EcoreModelFactory(MetaModelRegistration.getEPackage());
        private ParseTreeManagerNeu ptm = new ParseTreeManagerNeu();
    	private XtextFile xtextfile = MetaModelRegistration.getXtextFile();
    	
    	{
    		
    	}

    	public ParseTreeManagerNeu getResult() {
    		return ptm;
    	}

    	private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
    	public List<ErrorMsg> getErrors() {
    		return errors;
    	}

    	@Override
    	public void reportError(RecognitionException e) {
    		String msg = super.getErrorMessage(e,tokenNames);
    		errors.add(AntlrUtil.create(msg,e,tokenNames));
    		ptm.addError(msg, e);
    		// This doesn't work. ANTLR may simply report an superfluous token. In that case,
    		// two nodes will be finished instead of one.
    		// ptm.ruleFinished(null, end());
    	}

        private boolean skipCurrentToken;
        
    	@Override
    	protected boolean recoverFromMismatchedElement(IntStream arg0, RecognitionException arg1, BitSet arg2) {
    		skipCurrentToken = true;
    		return super.recoverFromMismatchedElement(arg0, arg1, arg2);
    	}



    // $ANTLR start parse
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:101:1: parse returns [Node r] : result= ruleChart EOF ;
    public Node parse() throws RecognitionException {
        Node r = null;
        int parse_StartIndex = input.index();
        EObject result = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return r; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:102:3: (result= ruleChart EOF )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:102:3: result= ruleChart EOF
            {
            pushFollow(FOLLOW_ruleChart_in_parse67);
            result=ruleChart();
            _fsp--;
            if (failed) return r;
            if ( backtracking==0 ) {

              if (result != null)
                ptm.setModelElement(result);
              r = ptm.getCurrent();
              ptm.ruleFinished(result);
            }
            match(input,EOF,FOLLOW_EOF_in_parse78); if (failed) return r;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 1, parse_StartIndex); }
        }
        return r;
    }
    // $ANTLR end parse


    // $ANTLR start ruleChart
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:112:1: ruleChart returns [EObject result] : ( ( 'statechart' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_ChartArgument= ruleChartArgument ) ( ';' ) )* (temp_ChartArgument= ruleChartArgument ) ( ';' )? ( ']' ) )? ( '{' ) (temp_IoDeclaration= ruleIoDeclaration )* (temp_CState= ruleCState ) ( '}' ) ( ';' ) ) ;
    public EObject ruleChart() throws RecognitionException {
        EObject result = null;
        int ruleChart_StartIndex = input.index();
        String temp_SableCCIdentifier = null;

        EObject temp_ChartArgument = null;

        EObject temp_IoDeclaration = null;

        EObject temp_CState = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:115:4: ( ( ( 'statechart' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_ChartArgument= ruleChartArgument ) ( ';' ) )* (temp_ChartArgument= ruleChartArgument ) ( ';' )? ( ']' ) )? ( '{' ) (temp_IoDeclaration= ruleIoDeclaration )* (temp_CState= ruleCState ) ( '}' ) ( ';' ) ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:115:4: ( ( 'statechart' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_ChartArgument= ruleChartArgument ) ( ';' ) )* (temp_ChartArgument= ruleChartArgument ) ( ';' )? ( ']' ) )? ( '{' ) (temp_IoDeclaration= ruleIoDeclaration )* (temp_CState= ruleCState ) ( '}' ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Chart");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:118:1: ( ( 'statechart' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_ChartArgument= ruleChartArgument ) ( ';' ) )* (temp_ChartArgument= ruleChartArgument ) ( ';' )? ( ']' ) )? ( '{' ) (temp_IoDeclaration= ruleIoDeclaration )* (temp_CState= ruleCState ) ( '}' ) ( ';' ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:118:2: ( 'statechart' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_ChartArgument= ruleChartArgument ) ( ';' ) )* (temp_ChartArgument= ruleChartArgument ) ( ';' )? ( ']' ) )? ( '{' ) (temp_IoDeclaration= ruleIoDeclaration )* (temp_CState= ruleCState ) ( '}' ) ( ';' )
            {
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:118:2: ( 'statechart' )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:118:3: 'statechart'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,10,FOLLOW_10_in_ruleChart104); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:124:1: (temp_SableCCIdentifier= ruleSableCCIdentifier )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:124:2: temp_SableCCIdentifier= ruleSableCCIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleSableCCIdentifier_in_ruleChart114);
            temp_SableCCIdentifier=ruleSableCCIdentifier();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_SableCCIdentifier != null) {
                hasContent = true;
                factory.set(result,"name",convert(temp_SableCCIdentifier),false);
                ptm.ruleFinished(temp_SableCCIdentifier);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:135:1: ( ( '[' ) ( (temp_ChartArgument= ruleChartArgument ) ( ';' ) )* (temp_ChartArgument= ruleChartArgument ) ( ';' )? ( ']' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:135:2: ( '[' ) ( (temp_ChartArgument= ruleChartArgument ) ( ';' ) )* (temp_ChartArgument= ruleChartArgument ) ( ';' )? ( ']' )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:135:2: ( '[' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:135:3: '['
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleChart123); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:141:1: ( (temp_ChartArgument= ruleChartArgument ) ( ';' ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==19) ) {
                            int LA1_1 = input.LA(2);

                            if ( (LA1_1==20) ) {
                                int LA1_3 = input.LA(3);

                                if ( (LA1_3==RULE_STRING) ) {
                                    int LA1_5 = input.LA(4);

                                    if ( (LA1_5==12) ) {
                                        int LA1_7 = input.LA(5);

                                        if ( (LA1_7==19||LA1_7==21) ) {
                                            alt1=1;
                                        }


                                    }


                                }


                            }


                        }
                        else if ( (LA1_0==21) ) {
                            int LA1_2 = input.LA(2);

                            if ( (LA1_2==20) ) {
                                int LA1_4 = input.LA(3);

                                if ( (LA1_4==RULE_STRING) ) {
                                    int LA1_6 = input.LA(4);

                                    if ( (LA1_6==12) ) {
                                        int LA1_7 = input.LA(5);

                                        if ( (LA1_7==19||LA1_7==21) ) {
                                            alt1=1;
                                        }


                                    }


                                }


                            }


                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:141:2: (temp_ChartArgument= ruleChartArgument ) ( ';' )
                    	    {
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:141:2: (temp_ChartArgument= ruleChartArgument )
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:141:3: temp_ChartArgument= ruleChartArgument
                    	    {
                    	    if ( backtracking==0 ) {
                    	      ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)).eContents().get(1)).eContents().get(0)));
                    	    }
                    	    pushFollow(FOLLOW_ruleChartArgument_in_ruleChart134);
                    	    temp_ChartArgument=ruleChartArgument();
                    	    _fsp--;
                    	    if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      if (temp_ChartArgument != null) {
                    	        hasContent = true;
                    	        ptm.setModelElement(temp_ChartArgument);
                    	        factory.add(result,"chartArgs",convert(temp_ChartArgument),false);
                    	        ptm.ruleFinished(temp_ChartArgument);
                    	      } else {
                    	        ptm.destroyNode();
                    	      }

                    	    }

                    	    }

                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:153:1: ( ';' )
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:153:2: ';'
                    	    {
                    	    if ( backtracking==0 ) {
                    	      skipCurrentToken = false;
                    	    }
                    	    match(input,12,FOLLOW_12_in_ruleChart142); if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      if (!skipCurrentToken) {
                    	        hasContent = true;
                    	        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)).eContents().get(1)).eContents().get(1)));
                    	        ptm.ruleFinished(getLastToken());
                    	      }
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:160:1: (temp_ChartArgument= ruleChartArgument )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:160:2: temp_ChartArgument= ruleChartArgument
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                    }
                    pushFollow(FOLLOW_ruleChartArgument_in_ruleChart155);
                    temp_ChartArgument=ruleChartArgument();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_ChartArgument != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_ChartArgument);
                        factory.add(result,"chartArgs",convert(temp_ChartArgument),false);
                        ptm.ruleFinished(temp_ChartArgument);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:172:1: ( ';' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==12) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:172:2: ';'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,12,FOLLOW_12_in_ruleChart163); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)).eContents().get(3)));
                                ptm.ruleFinished(getLastToken());
                              }
                            }

                            }
                            break;

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:178:1: ( ']' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:178:2: ']'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,13,FOLLOW_13_in_ruleChart171); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)).eContents().get(4)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:185:1: ( '{' )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:185:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleChart181); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:191:1: (temp_IoDeclaration= ruleIoDeclaration )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=23 && LA4_0<=25)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:191:2: temp_IoDeclaration= ruleIoDeclaration
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(4)));
            	    }
            	    pushFollow(FOLLOW_ruleIoDeclaration_in_ruleChart191);
            	    temp_IoDeclaration=ruleIoDeclaration();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_IoDeclaration != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_IoDeclaration);
            	        factory.add(result,"iodeclarations",convert(temp_IoDeclaration),false);
            	        ptm.ruleFinished(temp_IoDeclaration);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:203:1: (temp_CState= ruleCState )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:203:2: temp_CState= ruleCState
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(5)));
            }
            pushFollow(FOLLOW_ruleCState_in_ruleChart203);
            temp_CState=ruleCState();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_CState != null) {
                hasContent = true;
                ptm.setModelElement(temp_CState);
                factory.set(result,"cstate",convert(temp_CState),false);
                ptm.ruleFinished(temp_CState);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:215:1: ( '}' )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:215:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,15,FOLLOW_15_in_ruleChart211); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(6)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:221:1: ( ';' )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:221:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleChart218); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(7)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 2, ruleChart_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleChart


    // $ANTLR start ruleSableCCIdentifier
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:234:1: ruleSableCCIdentifier returns [String s] : ( ( '_' ) | ( '#' ) | ( '.' ) | ( RULE_ID ) | ( RULE_INT ) )* ;
    public String ruleSableCCIdentifier() throws RecognitionException {
        String s = null;
        int ruleSableCCIdentifier_StartIndex = input.index();
        StringBuffer buff = new StringBuffer(); boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return s; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:237:1: ( ( ( '_' ) | ( '#' ) | ( '.' ) | ( RULE_ID ) | ( RULE_INT ) )* )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:237:1: ( ( '_' ) | ( '#' ) | ( '.' ) | ( RULE_ID ) | ( RULE_INT ) )*
            {
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:237:1: ( ( '_' ) | ( '#' ) | ( '.' ) | ( RULE_ID ) | ( RULE_INT ) )*
            loop5:
            do {
                int alt5=6;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    alt5=1;
                    }
                    break;
                case 17:
                    {
                    alt5=2;
                    }
                    break;
                case 18:
                    {
                    alt5=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt5=4;
                    }
                    break;
                case RULE_INT:
                    {
                    alt5=5;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:237:2: ( '_' )
            	    {
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:237:2: ( '_' )
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:237:4: '_'
            	    {
            	    if ( backtracking==0 ) {
            	      skipCurrentToken = false;
            	    }
            	    match(input,16,FOLLOW_16_in_ruleSableCCIdentifier257); if (failed) return s;
            	    if ( backtracking==0 ) {
            	      if (!skipCurrentToken) {
            	        hasContent = true;
            	        Token temp = getLastToken();
            	        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(0)).eContents().get(0)));
            	        ptm.ruleFinished(temp);
            	        buff.append(temp.getText());
            	      }
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:245:1: ( '#' )
            	    {
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:245:1: ( '#' )
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:245:3: '#'
            	    {
            	    if ( backtracking==0 ) {
            	      skipCurrentToken = false;
            	    }
            	    match(input,17,FOLLOW_17_in_ruleSableCCIdentifier269); if (failed) return s;
            	    if ( backtracking==0 ) {
            	      if (!skipCurrentToken) {
            	        hasContent = true;
            	        Token temp = getLastToken();
            	        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(0)).eContents().get(1)));
            	        ptm.ruleFinished(temp);
            	        buff.append(temp.getText());
            	      }
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:253:1: ( '.' )
            	    {
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:253:1: ( '.' )
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:253:3: '.'
            	    {
            	    if ( backtracking==0 ) {
            	      skipCurrentToken = false;
            	    }
            	    match(input,18,FOLLOW_18_in_ruleSableCCIdentifier281); if (failed) return s;
            	    if ( backtracking==0 ) {
            	      if (!skipCurrentToken) {
            	        hasContent = true;
            	        Token temp = getLastToken();
            	        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(0)).eContents().get(2)));
            	        ptm.ruleFinished(temp);
            	        buff.append(temp.getText());
            	      }
            	    }

            	    }


            	    }
            	    break;
            	case 4 :
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:261:1: ( RULE_ID )
            	    {
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:261:1: ( RULE_ID )
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:261:2: RULE_ID
            	    {
            	    if ( backtracking==0 ) {
            	      skipCurrentToken = false;
            	    }
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSableCCIdentifier292); if (failed) return s;
            	    if ( backtracking==0 ) {
            	      if (!skipCurrentToken) {
            	        hasContent = true;
            	        Token temp = getLastToken();
            	        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(0)).eContents().get(3)));
            	        ptm.ruleFinished(temp);
            	        if (temp.getType() == kittyLexer.RULE_ID)
            	          temp.setText((String) convert(temp));
            	        buff.append(temp.getText());
            	      }
            	    }

            	    }


            	    }
            	    break;
            	case 5 :
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:272:1: ( RULE_INT )
            	    {
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:272:1: ( RULE_INT )
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:272:2: RULE_INT
            	    {
            	    if ( backtracking==0 ) {
            	      skipCurrentToken = false;
            	    }
            	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSableCCIdentifier302); if (failed) return s;
            	    if ( backtracking==0 ) {
            	      if (!skipCurrentToken) {
            	        hasContent = true;
            	        Token temp = getLastToken();
            	        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(0)).eContents().get(4)));
            	        ptm.ruleFinished(temp);
            	        if (temp.getType() == kittyLexer.RULE_ID)
            	          temp.setText((String) convert(temp));
            	        buff.append(temp.getText());
            	      }
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( backtracking==0 ) {
              if (hasContent)
                s =buff.toString();
            }

            }

        }
        catch (RecognitionException re) {
            if (hasContent)
            s =buff.toString();
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 3, ruleSableCCIdentifier_StartIndex); }
        }
        return s;
    }
    // $ANTLR end ruleSableCCIdentifier


    // $ANTLR start ruleChartArgument
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:292:1: ruleChartArgument returns [EObject result] : ( ( ( 'model' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'version' ) ( '=' ) ( RULE_STRING ) ) ) ;
    public EObject ruleChartArgument() throws RecognitionException {
        EObject result = null;
        int ruleChartArgument_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:295:4: ( ( ( ( 'model' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'version' ) ( '=' ) ( RULE_STRING ) ) ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:295:4: ( ( ( 'model' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'version' ) ( '=' ) ( RULE_STRING ) ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ChartArgument");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:298:1: ( ( ( 'model' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'version' ) ( '=' ) ( RULE_STRING ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("298:1: ( ( ( 'model' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'version' ) ( '=' ) ( RULE_STRING ) ) )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:298:2: ( ( 'model' ) ( '=' ) ( RULE_STRING ) )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:298:2: ( ( 'model' ) ( '=' ) ( RULE_STRING ) )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:298:3: ( 'model' ) ( '=' ) ( RULE_STRING )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:298:3: ( 'model' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:298:4: 'model'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,19,FOLLOW_19_in_ruleChartArgument343); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:304:1: ( '=' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:304:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,20,FOLLOW_20_in_ruleChartArgument350); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:310:1: ( RULE_STRING )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:310:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChartArgument358); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        factory.set(result,"model",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:321:1: ( ( 'version' ) ( '=' ) ( RULE_STRING ) )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:321:1: ( ( 'version' ) ( '=' ) ( RULE_STRING ) )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:321:2: ( 'version' ) ( '=' ) ( RULE_STRING )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:321:2: ( 'version' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:321:3: 'version'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,21,FOLLOW_21_in_ruleChartArgument371); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:327:1: ( '=' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:327:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,20,FOLLOW_20_in_ruleChartArgument378); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:333:1: ( RULE_STRING )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:333:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChartArgument386); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                        factory.set(result,"version",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }


                    }
                    break;

            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 4, ruleChartArgument_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleChartArgument


    // $ANTLR start ruleIoDeclaration
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:351:1: ruleIoDeclaration returns [EObject result] : ( (temp_DeclarationType= ruleDeclarationType ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( ':' ) ( '=' ) ( RULE_INT ) )? ( ( ':' ) (temp_VarEventType= ruleVarEventType ) )? ( ';' ) ) ;
    public EObject ruleIoDeclaration() throws RecognitionException {
        EObject result = null;
        int ruleIoDeclaration_StartIndex = input.index();
        Enumerator temp_DeclarationType = null;

        String temp_SableCCIdentifier = null;

        Enumerator temp_VarEventType = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:354:4: ( ( (temp_DeclarationType= ruleDeclarationType ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( ':' ) ( '=' ) ( RULE_INT ) )? ( ( ':' ) (temp_VarEventType= ruleVarEventType ) )? ( ';' ) ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:354:4: ( (temp_DeclarationType= ruleDeclarationType ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( ':' ) ( '=' ) ( RULE_INT ) )? ( ( ':' ) (temp_VarEventType= ruleVarEventType ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "IoDeclaration");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:357:1: ( (temp_DeclarationType= ruleDeclarationType ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( ':' ) ( '=' ) ( RULE_INT ) )? ( ( ':' ) (temp_VarEventType= ruleVarEventType ) )? ( ';' ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:357:2: (temp_DeclarationType= ruleDeclarationType ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( ':' ) ( '=' ) ( RULE_INT ) )? ( ( ':' ) (temp_VarEventType= ruleVarEventType ) )? ( ';' )
            {
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:357:2: (temp_DeclarationType= ruleDeclarationType )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:357:3: temp_DeclarationType= ruleDeclarationType
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(0)));
            }
            pushFollow(FOLLOW_ruleDeclarationType_in_ruleIoDeclaration430);
            temp_DeclarationType=ruleDeclarationType();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_DeclarationType != null) {
                hasContent = true;
                factory.set(result,"type",convert(temp_DeclarationType),false);
                ptm.ruleFinished(temp_DeclarationType);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:368:1: (temp_SableCCIdentifier= ruleSableCCIdentifier )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:368:2: temp_SableCCIdentifier= ruleSableCCIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleSableCCIdentifier_in_ruleIoDeclaration441);
            temp_SableCCIdentifier=ruleSableCCIdentifier();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_SableCCIdentifier != null) {
                hasContent = true;
                factory.set(result,"name",convert(temp_SableCCIdentifier),false);
                ptm.ruleFinished(temp_SableCCIdentifier);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:379:1: ( ( ':' ) ( '=' ) ( RULE_INT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==20) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:379:2: ( ':' ) ( '=' ) ( RULE_INT )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:379:2: ( ':' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:379:3: ':'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,22,FOLLOW_22_in_ruleIoDeclaration450); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:385:1: ( '=' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:385:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,20,FOLLOW_20_in_ruleIoDeclaration457); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:391:1: ( RULE_INT )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:391:2: RULE_INT
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIoDeclaration465); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                        factory.set(result,"initialValue",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:402:1: ( ( ':' ) (temp_VarEventType= ruleVarEventType ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:402:2: ( ':' ) (temp_VarEventType= ruleVarEventType )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:402:2: ( ':' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:402:3: ':'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,22,FOLLOW_22_in_ruleIoDeclaration477); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:408:1: (temp_VarEventType= ruleVarEventType )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:408:2: temp_VarEventType= ruleVarEventType
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(3)).eContents().get(1)));
                    }
                    pushFollow(FOLLOW_ruleVarEventType_in_ruleIoDeclaration487);
                    temp_VarEventType=ruleVarEventType();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_VarEventType != null) {
                        hasContent = true;
                        factory.set(result,"varEventType",convert(temp_VarEventType),false);
                        ptm.ruleFinished(temp_VarEventType);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }


                    }
                    break;

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:420:1: ( ';' )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:420:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleIoDeclaration498); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 5, ruleIoDeclaration_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleIoDeclaration


    // $ANTLR start ruleDeclarationType
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:433:1: ruleDeclarationType returns [Enumerator r] : ( 'input' | 'output' | 'var' );
    public Enumerator ruleDeclarationType() throws RecognitionException {
        Enumerator r = null;
        int ruleDeclarationType_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return r; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:434:4: ( 'input' | 'output' | 'var' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 25:
                {
                alt9=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("433:1: ruleDeclarationType returns [Enumerator r] : ( 'input' | 'output' | 'var' );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:434:4: 'input'
                    {
                    match(input,23,FOLLOW_23_in_ruleDeclarationType526); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)));
                      r =factory.enumLit("", "DeclarationType","input");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 2 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:440:7: 'output'
                    {
                    match(input,24,FOLLOW_24_in_ruleDeclarationType539); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(2)));
                      r =factory.enumLit("", "DeclarationType","output");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 3 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:446:7: 'var'
                    {
                    match(input,25,FOLLOW_25_in_ruleDeclarationType552); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(3)));
                      r =factory.enumLit("", "DeclarationType","variable");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 6, ruleDeclarationType_StartIndex); }
        }
        return r;
    }
    // $ANTLR end ruleDeclarationType


    // $ANTLR start ruleVarEventType
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:454:1: ruleVarEventType returns [Enumerator r] : ( 'boolean' | 'double' | 'float' | 'integer' | 'combine integer with +' | 'combine integer with *' );
    public Enumerator ruleVarEventType() throws RecognitionException {
        Enumerator r = null;
        int ruleVarEventType_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return r; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:455:4: ( 'boolean' | 'double' | 'float' | 'integer' | 'combine integer with +' | 'combine integer with *' )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt10=1;
                }
                break;
            case 27:
                {
                alt10=2;
                }
                break;
            case 28:
                {
                alt10=3;
                }
                break;
            case 29:
                {
                alt10=4;
                }
                break;
            case 30:
                {
                alt10=5;
                }
                break;
            case 31:
                {
                alt10=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("454:1: ruleVarEventType returns [Enumerator r] : ( 'boolean' | 'double' | 'float' | 'integer' | 'combine integer with +' | 'combine integer with *' );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:455:4: 'boolean'
                    {
                    match(input,26,FOLLOW_26_in_ruleVarEventType573); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)));
                      r =factory.enumLit("", "VarEventType","boolean");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 2 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:461:7: 'double'
                    {
                    match(input,27,FOLLOW_27_in_ruleVarEventType586); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(2)));
                      r =factory.enumLit("", "VarEventType","double");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 3 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:467:7: 'float'
                    {
                    match(input,28,FOLLOW_28_in_ruleVarEventType599); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(3)));
                      r =factory.enumLit("", "VarEventType","float");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 4 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:473:7: 'integer'
                    {
                    match(input,29,FOLLOW_29_in_ruleVarEventType612); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(4)));
                      r =factory.enumLit("", "VarEventType","integer");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 5 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:479:7: 'combine integer with +'
                    {
                    match(input,30,FOLLOW_30_in_ruleVarEventType625); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(5)));
                      r =factory.enumLit("", "VarEventType","combPlus");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 6 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:485:7: 'combine integer with *'
                    {
                    match(input,31,FOLLOW_31_in_ruleVarEventType638); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(6)));
                      r =factory.enumLit("", "VarEventType","combMal");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 7, ruleVarEventType_StartIndex); }
        }
        return r;
    }
    // $ANTLR end ruleVarEventType


    // $ANTLR start ruleCState
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:493:1: ruleCState returns [EObject result] : ( ( ( '[' ) ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )* (temp_StateArgument= ruleStateArgument ) ( ';' )? ( ']' ) )? ( '{' ) (temp_Region= ruleRegion )? ( (temp_State= ruleState ) | (temp_Transition= ruleTransition ) | ( ( '||' ) (temp_Region= ruleRegion )? ) )* ( '}' ) ( ';' ) ) ;
    public EObject ruleCState() throws RecognitionException {
        EObject result = null;
        int ruleCState_StartIndex = input.index();
        EObject temp_StateArgument = null;

        EObject temp_Region = null;

        EObject temp_State = null;

        EObject temp_Transition = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:496:4: ( ( ( ( '[' ) ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )* (temp_StateArgument= ruleStateArgument ) ( ';' )? ( ']' ) )? ( '{' ) (temp_Region= ruleRegion )? ( (temp_State= ruleState ) | (temp_Transition= ruleTransition ) | ( ( '||' ) (temp_Region= ruleRegion )? ) )* ( '}' ) ( ';' ) ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:496:4: ( ( ( '[' ) ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )* (temp_StateArgument= ruleStateArgument ) ( ';' )? ( ']' ) )? ( '{' ) (temp_Region= ruleRegion )? ( (temp_State= ruleState ) | (temp_Transition= ruleTransition ) | ( ( '||' ) (temp_Region= ruleRegion )? ) )* ( '}' ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "CState");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:499:1: ( ( ( '[' ) ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )* (temp_StateArgument= ruleStateArgument ) ( ';' )? ( ']' ) )? ( '{' ) (temp_Region= ruleRegion )? ( (temp_State= ruleState ) | (temp_Transition= ruleTransition ) | ( ( '||' ) (temp_Region= ruleRegion )? ) )* ( '}' ) ( ';' ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:499:2: ( ( '[' ) ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )* (temp_StateArgument= ruleStateArgument ) ( ';' )? ( ']' ) )? ( '{' ) (temp_Region= ruleRegion )? ( (temp_State= ruleState ) | (temp_Transition= ruleTransition ) | ( ( '||' ) (temp_Region= ruleRegion )? ) )* ( '}' ) ( ';' )
            {
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:499:2: ( ( '[' ) ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )* (temp_StateArgument= ruleStateArgument ) ( ';' )? ( ']' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==11) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:499:3: ( '[' ) ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )* (temp_StateArgument= ruleStateArgument ) ( ';' )? ( ']' )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:499:3: ( '[' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:499:4: '['
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleCState670); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:505:1: ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )*
                    loop11:
                    do {
                        int alt11=2;
                        switch ( input.LA(1) ) {
                        case 33:
                            {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==20) ) {
                                int LA11_11 = input.LA(3);

                                if ( (LA11_11==RULE_STRING) ) {
                                    int LA11_21 = input.LA(4);

                                    if ( (LA11_21==12) ) {
                                        int LA11_36 = input.LA(5);

                                        if ( ((LA11_36>=33 && LA11_36<=40)||(LA11_36>=47 && LA11_36<=48)) ) {
                                            alt11=1;
                                        }


                                    }


                                }


                            }


                            }
                            break;
                        case 34:
                            {
                            int LA11_2 = input.LA(2);

                            if ( (LA11_2==20) ) {
                                switch ( input.LA(3) ) {
                                case 41:
                                    {
                                    int LA11_22 = input.LA(4);

                                    if ( (LA11_22==12) ) {
                                        int LA11_36 = input.LA(5);

                                        if ( ((LA11_36>=33 && LA11_36<=40)||(LA11_36>=47 && LA11_36<=48)) ) {
                                            alt11=1;
                                        }


                                    }


                                    }
                                    break;
                                case 42:
                                    {
                                    int LA11_23 = input.LA(4);

                                    if ( (LA11_23==12) ) {
                                        int LA11_36 = input.LA(5);

                                        if ( ((LA11_36>=33 && LA11_36<=40)||(LA11_36>=47 && LA11_36<=48)) ) {
                                            alt11=1;
                                        }


                                    }


                                    }
                                    break;
                                case 43:
                                    {
                                    int LA11_24 = input.LA(4);

                                    if ( (LA11_24==12) ) {
                                        int LA11_36 = input.LA(5);

                                        if ( ((LA11_36>=33 && LA11_36<=40)||(LA11_36>=47 && LA11_36<=48)) ) {
                                            alt11=1;
                                        }


                                    }


                                    }
                                    break;
                                case 44:
                                    {
                                    int LA11_25 = input.LA(4);

                                    if ( (LA11_25==12) ) {
                                        int LA11_36 = input.LA(5);

                                        if ( ((LA11_36>=33 && LA11_36<=40)||(LA11_36>=47 && LA11_36<=48)) ) {
                                            alt11=1;
                                        }


                                    }


                                    }
                                    break;
                                case 45:
                                    {
                                    int LA11_26 = input.LA(4);

                                    if ( (LA11_26==12) ) {
                                        int LA11_36 = input.LA(5);

                                        if ( ((LA11_36>=33 && LA11_36<=40)||(LA11_36>=47 && LA11_36<=48)) ) {
                                            alt11=1;
                                        }


                                    }


                                    }
                                    break;
                                case 46:
                                    {
                                    int LA11_27 = input.LA(4);

                                    if ( (LA11_27==12) ) {
                                        int LA11_36 = input.LA(5);

                                        if ( ((LA11_36>=33 && LA11_36<=40)||(LA11_36>=47 && LA11_36<=48)) ) {
                                            alt11=1;
                                        }


                                    }


                                    }
                                    break;

                                }

                            }


                            }
                            break;
                        case 47:
                            {
                            int LA11_3 = input.LA(2);

                            if ( (LA11_3==20) ) {
                                int LA11_13 = input.LA(3);

                                if ( (LA11_13==RULE_STRING) ) {
                                    int LA11_28 = input.LA(4);

                                    if ( (LA11_28==12) ) {
                                        int LA11_36 = input.LA(5);

                                        if ( ((LA11_36>=33 && LA11_36<=40)||(LA11_36>=47 && LA11_36<=48)) ) {
                                            alt11=1;
                                        }


                                    }


                                }


                            }


                            }
                            break;
                        case 48:
                            {
                            int LA11_4 = input.LA(2);

                            if ( (LA11_4==20) ) {
                                int LA11_14 = input.LA(3);

                                if ( (LA11_14==RULE_STRING) ) {
                                    int LA11_29 = input.LA(4);

                                    if ( (LA11_29==12) ) {
                                        int LA11_36 = input.LA(5);

                                        if ( ((LA11_36>=33 && LA11_36<=40)||(LA11_36>=47 && LA11_36<=48)) ) {
                                            alt11=1;
                                        }


                                    }


                                }


                            }


                            }
                            break;
                        case 35:
                            {
                            int LA11_5 = input.LA(2);

                            if ( (LA11_5==20) ) {
                                int LA11_15 = input.LA(3);

                                if ( (LA11_15==RULE_STRING) ) {
                                    int LA11_30 = input.LA(4);

                                    if ( (LA11_30==12) ) {
                                        int LA11_36 = input.LA(5);

                                        if ( ((LA11_36>=33 && LA11_36<=40)||(LA11_36>=47 && LA11_36<=48)) ) {
                                            alt11=1;
                                        }


                                    }


                                }


                            }


                            }
                            break;
                        case 36:
                            {
                            int LA11_6 = input.LA(2);

                            if ( (LA11_6==20) ) {
                                int LA11_16 = input.LA(3);

                                if ( (LA11_16==RULE_STRING) ) {
                                    int LA11_31 = input.LA(4);

                                    if ( (LA11_31==12) ) {
                                        int LA11_36 = input.LA(5);

                                        if ( ((LA11_36>=33 && LA11_36<=40)||(LA11_36>=47 && LA11_36<=48)) ) {
                                            alt11=1;
                                        }


                                    }


                                }


                            }


                            }
                            break;
                        case 37:
                            {
                            int LA11_7 = input.LA(2);

                            if ( (LA11_7==20) ) {
                                int LA11_17 = input.LA(3);

                                if ( (LA11_17==RULE_STRING) ) {
                                    int LA11_32 = input.LA(4);

                                    if ( (LA11_32==12) ) {
                                        int LA11_36 = input.LA(5);

                                        if ( ((LA11_36>=33 && LA11_36<=40)||(LA11_36>=47 && LA11_36<=48)) ) {
                                            alt11=1;
                                        }


                                    }


                                }


                            }


                            }
                            break;
                        case 38:
                            {
                            int LA11_8 = input.LA(2);

                            if ( (LA11_8==20) ) {
                                int LA11_18 = input.LA(3);

                                if ( (LA11_18==RULE_STRING) ) {
                                    int LA11_33 = input.LA(4);

                                    if ( (LA11_33==12) ) {
                                        int LA11_36 = input.LA(5);

                                        if ( ((LA11_36>=33 && LA11_36<=40)||(LA11_36>=47 && LA11_36<=48)) ) {
                                            alt11=1;
                                        }


                                    }


                                }


                            }


                            }
                            break;
                        case 39:
                            {
                            int LA11_9 = input.LA(2);

                            if ( (LA11_9==20) ) {
                                int LA11_19 = input.LA(3);

                                if ( (LA11_19==RULE_STRING) ) {
                                    int LA11_34 = input.LA(4);

                                    if ( (LA11_34==12) ) {
                                        int LA11_36 = input.LA(5);

                                        if ( ((LA11_36>=33 && LA11_36<=40)||(LA11_36>=47 && LA11_36<=48)) ) {
                                            alt11=1;
                                        }


                                    }


                                }


                            }


                            }
                            break;
                        case 40:
                            {
                            int LA11_10 = input.LA(2);

                            if ( (LA11_10==20) ) {
                                int LA11_20 = input.LA(3);

                                if ( (LA11_20==RULE_STRING) ) {
                                    int LA11_35 = input.LA(4);

                                    if ( (LA11_35==12) ) {
                                        int LA11_36 = input.LA(5);

                                        if ( ((LA11_36>=33 && LA11_36<=40)||(LA11_36>=47 && LA11_36<=48)) ) {
                                            alt11=1;
                                        }


                                    }


                                }


                            }


                            }
                            break;

                        }

                        switch (alt11) {
                    	case 1 :
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:505:2: (temp_StateArgument= ruleStateArgument ) ( ';' )
                    	    {
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:505:2: (temp_StateArgument= ruleStateArgument )
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:505:3: temp_StateArgument= ruleStateArgument
                    	    {
                    	    if ( backtracking==0 ) {
                    	      ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(1)).eContents().get(0)));
                    	    }
                    	    pushFollow(FOLLOW_ruleStateArgument_in_ruleCState681);
                    	    temp_StateArgument=ruleStateArgument();
                    	    _fsp--;
                    	    if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      if (temp_StateArgument != null) {
                    	        hasContent = true;
                    	        ptm.setModelElement(temp_StateArgument);
                    	        factory.add(result,"stateArgs",convert(temp_StateArgument),false);
                    	        ptm.ruleFinished(temp_StateArgument);
                    	      } else {
                    	        ptm.destroyNode();
                    	      }

                    	    }

                    	    }

                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:517:1: ( ';' )
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:517:2: ';'
                    	    {
                    	    if ( backtracking==0 ) {
                    	      skipCurrentToken = false;
                    	    }
                    	    match(input,12,FOLLOW_12_in_ruleCState689); if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      if (!skipCurrentToken) {
                    	        hasContent = true;
                    	        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(1)).eContents().get(1)));
                    	        ptm.ruleFinished(getLastToken());
                    	      }
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:524:1: (temp_StateArgument= ruleStateArgument )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:524:2: temp_StateArgument= ruleStateArgument
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                    }
                    pushFollow(FOLLOW_ruleStateArgument_in_ruleCState702);
                    temp_StateArgument=ruleStateArgument();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_StateArgument != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_StateArgument);
                        factory.add(result,"stateArgs",convert(temp_StateArgument),false);
                        ptm.ruleFinished(temp_StateArgument);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:536:1: ( ';' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==12) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:536:2: ';'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,12,FOLLOW_12_in_ruleCState710); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(3)));
                                ptm.ruleFinished(getLastToken());
                              }
                            }

                            }
                            break;

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:542:1: ( ']' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:542:2: ']'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,13,FOLLOW_13_in_ruleCState718); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(4)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:549:1: ( '{' )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:549:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleCState728); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:555:1: (temp_Region= ruleRegion )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==49) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:555:2: temp_Region= ruleRegion
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(2)));
                    }
                    pushFollow(FOLLOW_ruleRegion_in_ruleCState738);
                    temp_Region=ruleRegion();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_Region != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_Region);
                        factory.set(result,"firstRegion",convert(temp_Region),false);
                        ptm.ruleFinished(temp_Region);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }
                    break;

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:567:1: ( (temp_State= ruleState ) | (temp_Transition= ruleTransition ) | ( ( '||' ) (temp_Region= ruleRegion )? ) )*
            loop16:
            do {
                int alt16=4;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:567:2: (temp_State= ruleState )
            	    {
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:567:2: (temp_State= ruleState )
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:567:3: temp_State= ruleState
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
            	    }
            	    pushFollow(FOLLOW_ruleState_in_ruleCState751);
            	    temp_State=ruleState();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_State != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_State);
            	        factory.add(result,"states",convert(temp_State),false);
            	        ptm.ruleFinished(temp_State);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:579:1: (temp_Transition= ruleTransition )
            	    {
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:579:1: (temp_Transition= ruleTransition )
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:579:2: temp_Transition= ruleTransition
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(3)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleCState764);
            	    temp_Transition=ruleTransition();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_Transition != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_Transition);
            	        factory.add(result,"transitions",convert(temp_Transition),false);
            	        ptm.ruleFinished(temp_Transition);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:591:1: ( ( '||' ) (temp_Region= ruleRegion )? )
            	    {
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:591:1: ( ( '||' ) (temp_Region= ruleRegion )? )
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:591:2: ( '||' ) (temp_Region= ruleRegion )?
            	    {
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:591:2: ( '||' )
            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:591:3: '||'
            	    {
            	    if ( backtracking==0 ) {
            	      skipCurrentToken = false;
            	    }
            	    match(input,32,FOLLOW_32_in_ruleCState775); if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (!skipCurrentToken) {
            	        hasContent = true;
            	        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(3)).eContents().get(2)).eContents().get(0)));
            	        ptm.ruleFinished(getLastToken());
            	      }
            	    }

            	    }

            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:597:1: (temp_Region= ruleRegion )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==49) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:597:2: temp_Region= ruleRegion
            	            {
            	            if ( backtracking==0 ) {
            	              ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(3)).eContents().get(2)).eContents().get(1)));
            	            }
            	            pushFollow(FOLLOW_ruleRegion_in_ruleCState785);
            	            temp_Region=ruleRegion();
            	            _fsp--;
            	            if (failed) return result;
            	            if ( backtracking==0 ) {
            	              if (temp_Region != null) {
            	                hasContent = true;
            	                ptm.setModelElement(temp_Region);
            	                factory.add(result,"innerRegions",convert(temp_Region),false);
            	                ptm.ruleFinished(temp_Region);
            	              } else {
            	                ptm.destroyNode();
            	              }

            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:611:1: ( '}' )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:611:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,15,FOLLOW_15_in_ruleCState799); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(4)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:617:1: ( ';' )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:617:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleCState806); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(5)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 8, ruleCState_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleCState


    // $ANTLR start ruleStateArgument
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:630:1: ruleStateArgument returns [EObject result] : ( ( ( 'label' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'type' ) ( '=' ) (temp_Pseudo= rulePseudo ) ) | (temp_Event= ruleEvent ) | (temp_Variable= ruleVariable ) | ( ( 'doActivity' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'do' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'entryActivity' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'entry' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'exitActivity' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'exit' ) ( '=' ) ( RULE_STRING ) ) ) ;
    public EObject ruleStateArgument() throws RecognitionException {
        EObject result = null;
        int ruleStateArgument_StartIndex = input.index();
        Enumerator temp_Pseudo = null;

        EObject temp_Event = null;

        EObject temp_Variable = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:633:4: ( ( ( ( 'label' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'type' ) ( '=' ) (temp_Pseudo= rulePseudo ) ) | (temp_Event= ruleEvent ) | (temp_Variable= ruleVariable ) | ( ( 'doActivity' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'do' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'entryActivity' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'entry' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'exitActivity' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'exit' ) ( '=' ) ( RULE_STRING ) ) ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:633:4: ( ( ( 'label' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'type' ) ( '=' ) (temp_Pseudo= rulePseudo ) ) | (temp_Event= ruleEvent ) | (temp_Variable= ruleVariable ) | ( ( 'doActivity' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'do' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'entryActivity' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'entry' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'exitActivity' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'exit' ) ( '=' ) ( RULE_STRING ) ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "StateArgument");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:636:1: ( ( ( 'label' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'type' ) ( '=' ) (temp_Pseudo= rulePseudo ) ) | (temp_Event= ruleEvent ) | (temp_Variable= ruleVariable ) | ( ( 'doActivity' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'do' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'entryActivity' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'entry' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'exitActivity' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'exit' ) ( '=' ) ( RULE_STRING ) ) )
            int alt17=10;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt17=1;
                }
                break;
            case 34:
                {
                alt17=2;
                }
                break;
            case 47:
                {
                alt17=3;
                }
                break;
            case 48:
                {
                alt17=4;
                }
                break;
            case 35:
                {
                alt17=5;
                }
                break;
            case 36:
                {
                alt17=6;
                }
                break;
            case 37:
                {
                alt17=7;
                }
                break;
            case 38:
                {
                alt17=8;
                }
                break;
            case 39:
                {
                alt17=9;
                }
                break;
            case 40:
                {
                alt17=10;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("636:1: ( ( ( 'label' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'type' ) ( '=' ) (temp_Pseudo= rulePseudo ) ) | (temp_Event= ruleEvent ) | (temp_Variable= ruleVariable ) | ( ( 'doActivity' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'do' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'entryActivity' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'entry' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'exitActivity' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'exit' ) ( '=' ) ( RULE_STRING ) ) )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:636:2: ( ( 'label' ) ( '=' ) ( RULE_STRING ) )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:636:2: ( ( 'label' ) ( '=' ) ( RULE_STRING ) )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:636:3: ( 'label' ) ( '=' ) ( RULE_STRING )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:636:3: ( 'label' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:636:4: 'label'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,33,FOLLOW_33_in_ruleStateArgument845); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:642:1: ( '=' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:642:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,20,FOLLOW_20_in_ruleStateArgument852); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:648:1: ( RULE_STRING )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:648:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStateArgument860); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        factory.set(result,"label",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:659:1: ( ( 'type' ) ( '=' ) (temp_Pseudo= rulePseudo ) )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:659:1: ( ( 'type' ) ( '=' ) (temp_Pseudo= rulePseudo ) )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:659:2: ( 'type' ) ( '=' ) (temp_Pseudo= rulePseudo )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:659:2: ( 'type' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:659:3: 'type'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,34,FOLLOW_34_in_ruleStateArgument873); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:665:1: ( '=' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:665:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,20,FOLLOW_20_in_ruleStateArgument880); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:671:1: (temp_Pseudo= rulePseudo )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:671:2: temp_Pseudo= rulePseudo
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                    }
                    pushFollow(FOLLOW_rulePseudo_in_ruleStateArgument890);
                    temp_Pseudo=rulePseudo();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_Pseudo != null) {
                        hasContent = true;
                        factory.set(result,"type",convert(temp_Pseudo),false);
                        ptm.ruleFinished(temp_Pseudo);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:683:1: (temp_Event= ruleEvent )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:683:1: (temp_Event= ruleEvent )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:683:2: temp_Event= ruleEvent
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)));
                    }
                    pushFollow(FOLLOW_ruleEvent_in_ruleStateArgument905);
                    temp_Event=ruleEvent();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_Event != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_Event);
                        factory.set(result,"event",convert(temp_Event),false);
                        ptm.ruleFinished(temp_Event);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }


                    }
                    break;
                case 4 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:695:1: (temp_Variable= ruleVariable )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:695:1: (temp_Variable= ruleVariable )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:695:2: temp_Variable= ruleVariable
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(3)));
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleStateArgument918);
                    temp_Variable=ruleVariable();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_Variable != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_Variable);
                        factory.set(result,"variable",convert(temp_Variable),false);
                        ptm.ruleFinished(temp_Variable);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }


                    }
                    break;
                case 5 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:707:1: ( ( 'doActivity' ) ( '=' ) ( RULE_STRING ) )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:707:1: ( ( 'doActivity' ) ( '=' ) ( RULE_STRING ) )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:707:2: ( 'doActivity' ) ( '=' ) ( RULE_STRING )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:707:2: ( 'doActivity' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:707:3: 'doActivity'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,35,FOLLOW_35_in_ruleStateArgument929); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(4)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:713:1: ( '=' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:713:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,20,FOLLOW_20_in_ruleStateArgument936); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(4)).eContents().get(1)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:719:1: ( RULE_STRING )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:719:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStateArgument944); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(4)).eContents().get(2)));
                        factory.set(result,"doAction",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:730:1: ( ( 'do' ) ( '=' ) ( RULE_STRING ) )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:730:1: ( ( 'do' ) ( '=' ) ( RULE_STRING ) )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:730:2: ( 'do' ) ( '=' ) ( RULE_STRING )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:730:2: ( 'do' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:730:3: 'do'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,36,FOLLOW_36_in_ruleStateArgument957); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(5)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:736:1: ( '=' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:736:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,20,FOLLOW_20_in_ruleStateArgument964); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(5)).eContents().get(1)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:742:1: ( RULE_STRING )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:742:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStateArgument972); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(5)).eContents().get(2)));
                        factory.set(result,"doAction",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:753:1: ( ( 'entryActivity' ) ( '=' ) ( RULE_STRING ) )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:753:1: ( ( 'entryActivity' ) ( '=' ) ( RULE_STRING ) )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:753:2: ( 'entryActivity' ) ( '=' ) ( RULE_STRING )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:753:2: ( 'entryActivity' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:753:3: 'entryActivity'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,37,FOLLOW_37_in_ruleStateArgument985); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(6)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:759:1: ( '=' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:759:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,20,FOLLOW_20_in_ruleStateArgument992); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(6)).eContents().get(1)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:765:1: ( RULE_STRING )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:765:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStateArgument1000); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(6)).eContents().get(2)));
                        factory.set(result,"entryAction",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:776:1: ( ( 'entry' ) ( '=' ) ( RULE_STRING ) )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:776:1: ( ( 'entry' ) ( '=' ) ( RULE_STRING ) )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:776:2: ( 'entry' ) ( '=' ) ( RULE_STRING )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:776:2: ( 'entry' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:776:3: 'entry'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,38,FOLLOW_38_in_ruleStateArgument1013); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(7)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:782:1: ( '=' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:782:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,20,FOLLOW_20_in_ruleStateArgument1020); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(7)).eContents().get(1)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:788:1: ( RULE_STRING )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:788:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStateArgument1028); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(7)).eContents().get(2)));
                        factory.set(result,"entryAction",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:799:1: ( ( 'exitActivity' ) ( '=' ) ( RULE_STRING ) )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:799:1: ( ( 'exitActivity' ) ( '=' ) ( RULE_STRING ) )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:799:2: ( 'exitActivity' ) ( '=' ) ( RULE_STRING )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:799:2: ( 'exitActivity' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:799:3: 'exitActivity'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,39,FOLLOW_39_in_ruleStateArgument1041); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(8)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:805:1: ( '=' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:805:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,20,FOLLOW_20_in_ruleStateArgument1048); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(8)).eContents().get(1)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:811:1: ( RULE_STRING )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:811:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStateArgument1056); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(8)).eContents().get(2)));
                        factory.set(result,"exitAction",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }


                    }
                    break;
                case 10 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:822:1: ( ( 'exit' ) ( '=' ) ( RULE_STRING ) )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:822:1: ( ( 'exit' ) ( '=' ) ( RULE_STRING ) )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:822:2: ( 'exit' ) ( '=' ) ( RULE_STRING )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:822:2: ( 'exit' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:822:3: 'exit'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,40,FOLLOW_40_in_ruleStateArgument1069); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(9)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:828:1: ( '=' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:828:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,20,FOLLOW_20_in_ruleStateArgument1076); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(9)).eContents().get(1)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:834:1: ( RULE_STRING )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:834:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStateArgument1084); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(9)).eContents().get(2)));
                        factory.set(result,"exitAction",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }


                    }
                    break;

            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 9, ruleStateArgument_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleStateArgument


    // $ANTLR start rulePseudo
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:852:1: rulePseudo returns [Enumerator r] : ( 'final' | 'initial' | 'history' | 'choice' | 'dynamicchoice' | 'suspend' );
    public Enumerator rulePseudo() throws RecognitionException {
        Enumerator r = null;
        int rulePseudo_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return r; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:853:4: ( 'final' | 'initial' | 'history' | 'choice' | 'dynamicchoice' | 'suspend' )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt18=1;
                }
                break;
            case 42:
                {
                alt18=2;
                }
                break;
            case 43:
                {
                alt18=3;
                }
                break;
            case 44:
                {
                alt18=4;
                }
                break;
            case 45:
                {
                alt18=5;
                }
                break;
            case 46:
                {
                alt18=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("852:1: rulePseudo returns [Enumerator r] : ( 'final' | 'initial' | 'history' | 'choice' | 'dynamicchoice' | 'suspend' );", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:853:4: 'final'
                    {
                    match(input,41,FOLLOW_41_in_rulePseudo1115); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)));
                      r =factory.enumLit("", "Pseudo","final");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 2 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:859:7: 'initial'
                    {
                    match(input,42,FOLLOW_42_in_rulePseudo1128); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(2)));
                      r =factory.enumLit("", "Pseudo","initial");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 3 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:865:7: 'history'
                    {
                    match(input,43,FOLLOW_43_in_rulePseudo1141); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(3)));
                      r =factory.enumLit("", "Pseudo","history");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 4 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:871:7: 'choice'
                    {
                    match(input,44,FOLLOW_44_in_rulePseudo1154); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(4)));
                      r =factory.enumLit("", "Pseudo","choice");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 5 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:877:7: 'dynamicchoice'
                    {
                    match(input,45,FOLLOW_45_in_rulePseudo1167); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(5)));
                      r =factory.enumLit("", "Pseudo","dynamicchoice");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 6 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:883:7: 'suspend'
                    {
                    match(input,46,FOLLOW_46_in_rulePseudo1180); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(6)));
                      r =factory.enumLit("", "Pseudo","suspend");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 10, rulePseudo_StartIndex); }
        }
        return r;
    }
    // $ANTLR end rulePseudo


    // $ANTLR start ruleEvent
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:891:1: ruleEvent returns [EObject result] : ( ( 'localEvent' ) ( '=' ) ( RULE_STRING ) ) ;
    public EObject ruleEvent() throws RecognitionException {
        EObject result = null;
        int ruleEvent_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:894:4: ( ( ( 'localEvent' ) ( '=' ) ( RULE_STRING ) ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:894:4: ( ( 'localEvent' ) ( '=' ) ( RULE_STRING ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Event");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:897:1: ( ( 'localEvent' ) ( '=' ) ( RULE_STRING ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:897:2: ( 'localEvent' ) ( '=' ) ( RULE_STRING )
            {
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:897:2: ( 'localEvent' )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:897:3: 'localEvent'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,47,FOLLOW_47_in_ruleEvent1211); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:903:1: ( '=' )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:903:2: '='
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,20,FOLLOW_20_in_ruleEvent1218); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:909:1: ( RULE_STRING )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:909:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent1226); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)));
                factory.set(result,"localEvent",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 11, ruleEvent_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleEvent


    // $ANTLR start ruleVariable
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:926:1: ruleVariable returns [EObject result] : ( ( 'localVariable' ) ( '=' ) ( RULE_STRING ) ) ;
    public EObject ruleVariable() throws RecognitionException {
        EObject result = null;
        int ruleVariable_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:929:4: ( ( ( 'localVariable' ) ( '=' ) ( RULE_STRING ) ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:929:4: ( ( 'localVariable' ) ( '=' ) ( RULE_STRING ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Variable");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:932:1: ( ( 'localVariable' ) ( '=' ) ( RULE_STRING ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:932:2: ( 'localVariable' ) ( '=' ) ( RULE_STRING )
            {
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:932:2: ( 'localVariable' )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:932:3: 'localVariable'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,48,FOLLOW_48_in_ruleVariable1265); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:938:1: ( '=' )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:938:2: '='
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,20,FOLLOW_20_in_ruleVariable1272); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:944:1: ( RULE_STRING )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:944:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariable1280); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(2)));
                factory.set(result,"localVariable",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 12, ruleVariable_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleVariable


    // $ANTLR start ruleRegion
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:961:1: ruleRegion returns [EObject result] : ( ( '<' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( '>' ) ( ( '[' ) ( (temp_RegionArgument= ruleRegionArgument ) ( ';' ) )* (temp_RegionArgument= ruleRegionArgument ) ( ';' )? ( ']' ) )? ) ;
    public EObject ruleRegion() throws RecognitionException {
        EObject result = null;
        int ruleRegion_StartIndex = input.index();
        String temp_SableCCIdentifier = null;

        EObject temp_RegionArgument = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:964:4: ( ( ( '<' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( '>' ) ( ( '[' ) ( (temp_RegionArgument= ruleRegionArgument ) ( ';' ) )* (temp_RegionArgument= ruleRegionArgument ) ( ';' )? ( ']' ) )? ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:964:4: ( ( '<' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( '>' ) ( ( '[' ) ( (temp_RegionArgument= ruleRegionArgument ) ( ';' ) )* (temp_RegionArgument= ruleRegionArgument ) ( ';' )? ( ']' ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Region");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:967:1: ( ( '<' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( '>' ) ( ( '[' ) ( (temp_RegionArgument= ruleRegionArgument ) ( ';' ) )* (temp_RegionArgument= ruleRegionArgument ) ( ';' )? ( ']' ) )? )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:967:2: ( '<' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( '>' ) ( ( '[' ) ( (temp_RegionArgument= ruleRegionArgument ) ( ';' ) )* (temp_RegionArgument= ruleRegionArgument ) ( ';' )? ( ']' ) )?
            {
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:967:2: ( '<' )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:967:3: '<'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,49,FOLLOW_49_in_ruleRegion1319); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:973:1: (temp_SableCCIdentifier= ruleSableCCIdentifier )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:973:2: temp_SableCCIdentifier= ruleSableCCIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleSableCCIdentifier_in_ruleRegion1329);
            temp_SableCCIdentifier=ruleSableCCIdentifier();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_SableCCIdentifier != null) {
                hasContent = true;
                factory.set(result,"regionID",convert(temp_SableCCIdentifier),false);
                ptm.ruleFinished(temp_SableCCIdentifier);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:984:1: ( '>' )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:984:2: '>'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,50,FOLLOW_50_in_ruleRegion1337); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:990:1: ( ( '[' ) ( (temp_RegionArgument= ruleRegionArgument ) ( ';' ) )* (temp_RegionArgument= ruleRegionArgument ) ( ';' )? ( ']' ) )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:990:2: ( '[' ) ( (temp_RegionArgument= ruleRegionArgument ) ( ';' ) )* (temp_RegionArgument= ruleRegionArgument ) ( ';' )? ( ']' )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:990:2: ( '[' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:990:3: '['
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleRegion1345); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:996:1: ( (temp_RegionArgument= ruleRegionArgument ) ( ';' ) )*
                    loop19:
                    do {
                        int alt19=2;
                        switch ( input.LA(1) ) {
                        case 33:
                            {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1==20) ) {
                                int LA19_4 = input.LA(3);

                                if ( (LA19_4==RULE_STRING) ) {
                                    int LA19_7 = input.LA(4);

                                    if ( (LA19_7==12) ) {
                                        int LA19_10 = input.LA(5);

                                        if ( (LA19_10==33||(LA19_10>=47 && LA19_10<=48)) ) {
                                            alt19=1;
                                        }


                                    }


                                }


                            }


                            }
                            break;
                        case 47:
                            {
                            int LA19_2 = input.LA(2);

                            if ( (LA19_2==20) ) {
                                int LA19_5 = input.LA(3);

                                if ( (LA19_5==RULE_STRING) ) {
                                    int LA19_8 = input.LA(4);

                                    if ( (LA19_8==12) ) {
                                        int LA19_10 = input.LA(5);

                                        if ( (LA19_10==33||(LA19_10>=47 && LA19_10<=48)) ) {
                                            alt19=1;
                                        }


                                    }


                                }


                            }


                            }
                            break;
                        case 48:
                            {
                            int LA19_3 = input.LA(2);

                            if ( (LA19_3==20) ) {
                                int LA19_6 = input.LA(3);

                                if ( (LA19_6==RULE_STRING) ) {
                                    int LA19_9 = input.LA(4);

                                    if ( (LA19_9==12) ) {
                                        int LA19_10 = input.LA(5);

                                        if ( (LA19_10==33||(LA19_10>=47 && LA19_10<=48)) ) {
                                            alt19=1;
                                        }


                                    }


                                }


                            }


                            }
                            break;

                        }

                        switch (alt19) {
                    	case 1 :
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:996:2: (temp_RegionArgument= ruleRegionArgument ) ( ';' )
                    	    {
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:996:2: (temp_RegionArgument= ruleRegionArgument )
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:996:3: temp_RegionArgument= ruleRegionArgument
                    	    {
                    	    if ( backtracking==0 ) {
                    	      ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                    	    }
                    	    pushFollow(FOLLOW_ruleRegionArgument_in_ruleRegion1356);
                    	    temp_RegionArgument=ruleRegionArgument();
                    	    _fsp--;
                    	    if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      if (temp_RegionArgument != null) {
                    	        hasContent = true;
                    	        ptm.setModelElement(temp_RegionArgument);
                    	        factory.add(result,"regArgs",convert(temp_RegionArgument),false);
                    	        ptm.ruleFinished(temp_RegionArgument);
                    	      } else {
                    	        ptm.destroyNode();
                    	      }

                    	    }

                    	    }

                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1008:1: ( ';' )
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1008:2: ';'
                    	    {
                    	    if ( backtracking==0 ) {
                    	      skipCurrentToken = false;
                    	    }
                    	    match(input,12,FOLLOW_12_in_ruleRegion1364); if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      if (!skipCurrentToken) {
                    	        hasContent = true;
                    	        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
                    	        ptm.ruleFinished(getLastToken());
                    	      }
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1015:1: (temp_RegionArgument= ruleRegionArgument )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1015:2: temp_RegionArgument= ruleRegionArgument
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(2)));
                    }
                    pushFollow(FOLLOW_ruleRegionArgument_in_ruleRegion1377);
                    temp_RegionArgument=ruleRegionArgument();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_RegionArgument != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_RegionArgument);
                        factory.add(result,"stateArgs",convert(temp_RegionArgument),false);
                        ptm.ruleFinished(temp_RegionArgument);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1027:1: ( ';' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==12) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1027:2: ';'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,12,FOLLOW_12_in_ruleRegion1385); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(3)));
                                ptm.ruleFinished(getLastToken());
                              }
                            }

                            }
                            break;

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1033:1: ( ']' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1033:2: ']'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,13,FOLLOW_13_in_ruleRegion1393); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(4)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 13, ruleRegion_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleRegion


    // $ANTLR start ruleRegionArgument
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1047:1: ruleRegionArgument returns [EObject result] : ( ( ( 'label' ) ( '=' ) ( RULE_STRING ) ) | (temp_Event= ruleEvent ) | (temp_Variable= ruleVariable ) ) ;
    public EObject ruleRegionArgument() throws RecognitionException {
        EObject result = null;
        int ruleRegionArgument_StartIndex = input.index();
        EObject temp_Event = null;

        EObject temp_Variable = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1050:4: ( ( ( ( 'label' ) ( '=' ) ( RULE_STRING ) ) | (temp_Event= ruleEvent ) | (temp_Variable= ruleVariable ) ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1050:4: ( ( ( 'label' ) ( '=' ) ( RULE_STRING ) ) | (temp_Event= ruleEvent ) | (temp_Variable= ruleVariable ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "RegionArgument");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1053:1: ( ( ( 'label' ) ( '=' ) ( RULE_STRING ) ) | (temp_Event= ruleEvent ) | (temp_Variable= ruleVariable ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt22=1;
                }
                break;
            case 47:
                {
                alt22=2;
                }
                break;
            case 48:
                {
                alt22=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("1053:1: ( ( ( 'label' ) ( '=' ) ( RULE_STRING ) ) | (temp_Event= ruleEvent ) | (temp_Variable= ruleVariable ) )", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1053:2: ( ( 'label' ) ( '=' ) ( RULE_STRING ) )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1053:2: ( ( 'label' ) ( '=' ) ( RULE_STRING ) )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1053:3: ( 'label' ) ( '=' ) ( RULE_STRING )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1053:3: ( 'label' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1053:4: 'label'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,33,FOLLOW_33_in_ruleRegionArgument1435); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1059:1: ( '=' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1059:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,20,FOLLOW_20_in_ruleRegionArgument1442); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1065:1: ( RULE_STRING )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1065:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRegionArgument1450); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        factory.set(result,"label",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1076:1: (temp_Event= ruleEvent )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1076:1: (temp_Event= ruleEvent )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1076:2: temp_Event= ruleEvent
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)));
                    }
                    pushFollow(FOLLOW_ruleEvent_in_ruleRegionArgument1465);
                    temp_Event=ruleEvent();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_Event != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_Event);
                        factory.set(result,"event",convert(temp_Event),false);
                        ptm.ruleFinished(temp_Event);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }


                    }
                    break;
                case 3 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1088:1: (temp_Variable= ruleVariable )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1088:1: (temp_Variable= ruleVariable )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1088:2: temp_Variable= ruleVariable
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(2)));
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleRegionArgument1478);
                    temp_Variable=ruleVariable();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_Variable != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_Variable);
                        factory.set(result,"variable",convert(temp_Variable),false);
                        ptm.ruleFinished(temp_Variable);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }


                    }
                    break;

            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 14, ruleRegionArgument_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleRegionArgument


    // $ANTLR start ruleState
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1107:1: ruleState returns [EObject result] : ( ( (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )* (temp_StateArgument= ruleStateArgument ) ( ';' )? ( ']' ) )? ( ';' ) ) | ( (temp_SableCCIdentifier= ruleSableCCIdentifier ) (temp_CState= ruleCState ) ) ) ;
    public EObject ruleState() throws RecognitionException {
        EObject result = null;
        int ruleState_StartIndex = input.index();
        String temp_SableCCIdentifier = null;

        EObject temp_StateArgument = null;

        EObject temp_CState = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1110:4: ( ( ( (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )* (temp_StateArgument= ruleStateArgument ) ( ';' )? ( ']' ) )? ( ';' ) ) | ( (temp_SableCCIdentifier= ruleSableCCIdentifier ) (temp_CState= ruleCState ) ) ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1110:4: ( ( (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )* (temp_StateArgument= ruleStateArgument ) ( ';' )? ( ']' ) )? ( ';' ) ) | ( (temp_SableCCIdentifier= ruleSableCCIdentifier ) (temp_CState= ruleCState ) ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "State");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1113:1: ( ( (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )* (temp_StateArgument= ruleStateArgument ) ( ';' )? ( ']' ) )? ( ';' ) ) | ( (temp_SableCCIdentifier= ruleSableCCIdentifier ) (temp_CState= ruleCState ) ) )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1113:2: ( (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )* (temp_StateArgument= ruleStateArgument ) ( ';' )? ( ']' ) )? ( ';' ) )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1113:2: ( (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )* (temp_StateArgument= ruleStateArgument ) ( ';' )? ( ']' ) )? ( ';' ) )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1113:3: (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )* (temp_StateArgument= ruleStateArgument ) ( ';' )? ( ']' ) )? ( ';' )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1113:3: (temp_SableCCIdentifier= ruleSableCCIdentifier )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1113:4: temp_SableCCIdentifier= ruleSableCCIdentifier
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                    }
                    pushFollow(FOLLOW_ruleSableCCIdentifier_in_ruleState1521);
                    temp_SableCCIdentifier=ruleSableCCIdentifier();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_SableCCIdentifier != null) {
                        hasContent = true;
                        factory.set(result,"name",convert(temp_SableCCIdentifier),false);
                        ptm.ruleFinished(temp_SableCCIdentifier);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1124:1: ( ( '[' ) ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )* (temp_StateArgument= ruleStateArgument ) ( ';' )? ( ']' ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==11) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1124:2: ( '[' ) ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )* (temp_StateArgument= ruleStateArgument ) ( ';' )? ( ']' )
                            {
                            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1124:2: ( '[' )
                            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1124:3: '['
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,11,FOLLOW_11_in_ruleState1530); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)).eContents().get(1)).eContents().get(0)));
                                ptm.ruleFinished(getLastToken());
                              }
                            }

                            }

                            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1130:1: ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )*
                            loop23:
                            do {
                                int alt23=2;
                                switch ( input.LA(1) ) {
                                case 33:
                                    {
                                    int LA23_1 = input.LA(2);

                                    if ( (LA23_1==20) ) {
                                        int LA23_11 = input.LA(3);

                                        if ( (LA23_11==RULE_STRING) ) {
                                            int LA23_21 = input.LA(4);

                                            if ( (LA23_21==12) ) {
                                                int LA23_36 = input.LA(5);

                                                if ( ((LA23_36>=33 && LA23_36<=40)||(LA23_36>=47 && LA23_36<=48)) ) {
                                                    alt23=1;
                                                }


                                            }


                                        }


                                    }


                                    }
                                    break;
                                case 34:
                                    {
                                    int LA23_2 = input.LA(2);

                                    if ( (LA23_2==20) ) {
                                        switch ( input.LA(3) ) {
                                        case 41:
                                            {
                                            int LA23_22 = input.LA(4);

                                            if ( (LA23_22==12) ) {
                                                int LA23_36 = input.LA(5);

                                                if ( ((LA23_36>=33 && LA23_36<=40)||(LA23_36>=47 && LA23_36<=48)) ) {
                                                    alt23=1;
                                                }


                                            }


                                            }
                                            break;
                                        case 42:
                                            {
                                            int LA23_23 = input.LA(4);

                                            if ( (LA23_23==12) ) {
                                                int LA23_36 = input.LA(5);

                                                if ( ((LA23_36>=33 && LA23_36<=40)||(LA23_36>=47 && LA23_36<=48)) ) {
                                                    alt23=1;
                                                }


                                            }


                                            }
                                            break;
                                        case 43:
                                            {
                                            int LA23_24 = input.LA(4);

                                            if ( (LA23_24==12) ) {
                                                int LA23_36 = input.LA(5);

                                                if ( ((LA23_36>=33 && LA23_36<=40)||(LA23_36>=47 && LA23_36<=48)) ) {
                                                    alt23=1;
                                                }


                                            }


                                            }
                                            break;
                                        case 44:
                                            {
                                            int LA23_25 = input.LA(4);

                                            if ( (LA23_25==12) ) {
                                                int LA23_36 = input.LA(5);

                                                if ( ((LA23_36>=33 && LA23_36<=40)||(LA23_36>=47 && LA23_36<=48)) ) {
                                                    alt23=1;
                                                }


                                            }


                                            }
                                            break;
                                        case 45:
                                            {
                                            int LA23_26 = input.LA(4);

                                            if ( (LA23_26==12) ) {
                                                int LA23_36 = input.LA(5);

                                                if ( ((LA23_36>=33 && LA23_36<=40)||(LA23_36>=47 && LA23_36<=48)) ) {
                                                    alt23=1;
                                                }


                                            }


                                            }
                                            break;
                                        case 46:
                                            {
                                            int LA23_27 = input.LA(4);

                                            if ( (LA23_27==12) ) {
                                                int LA23_36 = input.LA(5);

                                                if ( ((LA23_36>=33 && LA23_36<=40)||(LA23_36>=47 && LA23_36<=48)) ) {
                                                    alt23=1;
                                                }


                                            }


                                            }
                                            break;

                                        }

                                    }


                                    }
                                    break;
                                case 47:
                                    {
                                    int LA23_3 = input.LA(2);

                                    if ( (LA23_3==20) ) {
                                        int LA23_13 = input.LA(3);

                                        if ( (LA23_13==RULE_STRING) ) {
                                            int LA23_28 = input.LA(4);

                                            if ( (LA23_28==12) ) {
                                                int LA23_36 = input.LA(5);

                                                if ( ((LA23_36>=33 && LA23_36<=40)||(LA23_36>=47 && LA23_36<=48)) ) {
                                                    alt23=1;
                                                }


                                            }


                                        }


                                    }


                                    }
                                    break;
                                case 48:
                                    {
                                    int LA23_4 = input.LA(2);

                                    if ( (LA23_4==20) ) {
                                        int LA23_14 = input.LA(3);

                                        if ( (LA23_14==RULE_STRING) ) {
                                            int LA23_29 = input.LA(4);

                                            if ( (LA23_29==12) ) {
                                                int LA23_36 = input.LA(5);

                                                if ( ((LA23_36>=33 && LA23_36<=40)||(LA23_36>=47 && LA23_36<=48)) ) {
                                                    alt23=1;
                                                }


                                            }


                                        }


                                    }


                                    }
                                    break;
                                case 35:
                                    {
                                    int LA23_5 = input.LA(2);

                                    if ( (LA23_5==20) ) {
                                        int LA23_15 = input.LA(3);

                                        if ( (LA23_15==RULE_STRING) ) {
                                            int LA23_30 = input.LA(4);

                                            if ( (LA23_30==12) ) {
                                                int LA23_36 = input.LA(5);

                                                if ( ((LA23_36>=33 && LA23_36<=40)||(LA23_36>=47 && LA23_36<=48)) ) {
                                                    alt23=1;
                                                }


                                            }


                                        }


                                    }


                                    }
                                    break;
                                case 36:
                                    {
                                    int LA23_6 = input.LA(2);

                                    if ( (LA23_6==20) ) {
                                        int LA23_16 = input.LA(3);

                                        if ( (LA23_16==RULE_STRING) ) {
                                            int LA23_31 = input.LA(4);

                                            if ( (LA23_31==12) ) {
                                                int LA23_36 = input.LA(5);

                                                if ( ((LA23_36>=33 && LA23_36<=40)||(LA23_36>=47 && LA23_36<=48)) ) {
                                                    alt23=1;
                                                }


                                            }


                                        }


                                    }


                                    }
                                    break;
                                case 37:
                                    {
                                    int LA23_7 = input.LA(2);

                                    if ( (LA23_7==20) ) {
                                        int LA23_17 = input.LA(3);

                                        if ( (LA23_17==RULE_STRING) ) {
                                            int LA23_32 = input.LA(4);

                                            if ( (LA23_32==12) ) {
                                                int LA23_36 = input.LA(5);

                                                if ( ((LA23_36>=33 && LA23_36<=40)||(LA23_36>=47 && LA23_36<=48)) ) {
                                                    alt23=1;
                                                }


                                            }


                                        }


                                    }


                                    }
                                    break;
                                case 38:
                                    {
                                    int LA23_8 = input.LA(2);

                                    if ( (LA23_8==20) ) {
                                        int LA23_18 = input.LA(3);

                                        if ( (LA23_18==RULE_STRING) ) {
                                            int LA23_33 = input.LA(4);

                                            if ( (LA23_33==12) ) {
                                                int LA23_36 = input.LA(5);

                                                if ( ((LA23_36>=33 && LA23_36<=40)||(LA23_36>=47 && LA23_36<=48)) ) {
                                                    alt23=1;
                                                }


                                            }


                                        }


                                    }


                                    }
                                    break;
                                case 39:
                                    {
                                    int LA23_9 = input.LA(2);

                                    if ( (LA23_9==20) ) {
                                        int LA23_19 = input.LA(3);

                                        if ( (LA23_19==RULE_STRING) ) {
                                            int LA23_34 = input.LA(4);

                                            if ( (LA23_34==12) ) {
                                                int LA23_36 = input.LA(5);

                                                if ( ((LA23_36>=33 && LA23_36<=40)||(LA23_36>=47 && LA23_36<=48)) ) {
                                                    alt23=1;
                                                }


                                            }


                                        }


                                    }


                                    }
                                    break;
                                case 40:
                                    {
                                    int LA23_10 = input.LA(2);

                                    if ( (LA23_10==20) ) {
                                        int LA23_20 = input.LA(3);

                                        if ( (LA23_20==RULE_STRING) ) {
                                            int LA23_35 = input.LA(4);

                                            if ( (LA23_35==12) ) {
                                                int LA23_36 = input.LA(5);

                                                if ( ((LA23_36>=33 && LA23_36<=40)||(LA23_36>=47 && LA23_36<=48)) ) {
                                                    alt23=1;
                                                }


                                            }


                                        }


                                    }


                                    }
                                    break;

                                }

                                switch (alt23) {
                            	case 1 :
                            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1130:2: (temp_StateArgument= ruleStateArgument ) ( ';' )
                            	    {
                            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1130:2: (temp_StateArgument= ruleStateArgument )
                            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1130:3: temp_StateArgument= ruleStateArgument
                            	    {
                            	    if ( backtracking==0 ) {
                            	      ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                            	    }
                            	    pushFollow(FOLLOW_ruleStateArgument_in_ruleState1541);
                            	    temp_StateArgument=ruleStateArgument();
                            	    _fsp--;
                            	    if (failed) return result;
                            	    if ( backtracking==0 ) {
                            	      if (temp_StateArgument != null) {
                            	        hasContent = true;
                            	        ptm.setModelElement(temp_StateArgument);
                            	        factory.add(result,"stateArgs",convert(temp_StateArgument),false);
                            	        ptm.ruleFinished(temp_StateArgument);
                            	      } else {
                            	        ptm.destroyNode();
                            	      }

                            	    }

                            	    }

                            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1142:1: ( ';' )
                            	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1142:2: ';'
                            	    {
                            	    if ( backtracking==0 ) {
                            	      skipCurrentToken = false;
                            	    }
                            	    match(input,12,FOLLOW_12_in_ruleState1549); if (failed) return result;
                            	    if ( backtracking==0 ) {
                            	      if (!skipCurrentToken) {
                            	        hasContent = true;
                            	        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                            	        ptm.ruleFinished(getLastToken());
                            	      }
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);

                            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1149:1: (temp_StateArgument= ruleStateArgument )
                            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1149:2: temp_StateArgument= ruleStateArgument
                            {
                            if ( backtracking==0 ) {
                              ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)).eContents().get(1)).eContents().get(2)));
                            }
                            pushFollow(FOLLOW_ruleStateArgument_in_ruleState1562);
                            temp_StateArgument=ruleStateArgument();
                            _fsp--;
                            if (failed) return result;
                            if ( backtracking==0 ) {
                              if (temp_StateArgument != null) {
                                hasContent = true;
                                ptm.setModelElement(temp_StateArgument);
                                factory.add(result,"stateArgs",convert(temp_StateArgument),false);
                                ptm.ruleFinished(temp_StateArgument);
                              } else {
                                ptm.destroyNode();
                              }

                            }

                            }

                            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1161:1: ( ';' )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==12) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1161:2: ';'
                                    {
                                    if ( backtracking==0 ) {
                                      skipCurrentToken = false;
                                    }
                                    match(input,12,FOLLOW_12_in_ruleState1570); if (failed) return result;
                                    if ( backtracking==0 ) {
                                      if (!skipCurrentToken) {
                                        hasContent = true;
                                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)).eContents().get(1)).eContents().get(3)));
                                        ptm.ruleFinished(getLastToken());
                                      }
                                    }

                                    }
                                    break;

                            }

                            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1167:1: ( ']' )
                            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1167:2: ']'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,13,FOLLOW_13_in_ruleState1578); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)).eContents().get(1)).eContents().get(4)));
                                ptm.ruleFinished(getLastToken());
                              }
                            }

                            }


                            }
                            break;

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1174:1: ( ';' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1174:2: ';'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,12,FOLLOW_12_in_ruleState1588); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1181:1: ( (temp_SableCCIdentifier= ruleSableCCIdentifier ) (temp_CState= ruleCState ) )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1181:1: ( (temp_SableCCIdentifier= ruleSableCCIdentifier ) (temp_CState= ruleCState ) )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1181:2: (temp_SableCCIdentifier= ruleSableCCIdentifier ) (temp_CState= ruleCState )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1181:2: (temp_SableCCIdentifier= ruleSableCCIdentifier )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1181:3: temp_SableCCIdentifier= ruleSableCCIdentifier
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                    }
                    pushFollow(FOLLOW_ruleSableCCIdentifier_in_ruleState1603);
                    temp_SableCCIdentifier=ruleSableCCIdentifier();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_SableCCIdentifier != null) {
                        hasContent = true;
                        factory.set(result,"name",convert(temp_SableCCIdentifier),false);
                        ptm.ruleFinished(temp_SableCCIdentifier);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1192:1: (temp_CState= ruleCState )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1192:2: temp_CState= ruleCState
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                    }
                    pushFollow(FOLLOW_ruleCState_in_ruleState1614);
                    temp_CState=ruleCState();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_CState != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_CState);
                        factory.set(result,"cstate",convert(temp_CState),false);
                        ptm.ruleFinished(temp_CState);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }


                    }


                    }
                    break;

            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 15, ruleState_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleState


    // $ANTLR start ruleTransition
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1212:1: ruleTransition returns [EObject result] : (temp_initialtransition= ruleInitialTransition | temp_noninitialtransition= ruleNonInitialTransition );
    public EObject ruleTransition() throws RecognitionException {
        EObject result = null;
        int ruleTransition_StartIndex = input.index();
        EObject temp_initialtransition = null;

        EObject temp_noninitialtransition = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1214:9: (temp_initialtransition= ruleInitialTransition | temp_noninitialtransition= ruleNonInitialTransition )
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1214:9: temp_initialtransition= ruleInitialTransition
                    {
                    pushFollow(FOLLOW_ruleInitialTransition_in_ruleTransition1652);
                    temp_initialtransition=ruleInitialTransition();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_initialtransition;
                    }

                    }
                    break;
                case 2 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1214:97: temp_noninitialtransition= ruleNonInitialTransition
                    {
                    pushFollow(FOLLOW_ruleNonInitialTransition_in_ruleTransition1667);
                    temp_noninitialtransition=ruleNonInitialTransition();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_noninitialtransition;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 16, ruleTransition_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleTransition


    // $ANTLR start ruleInitialTransition
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1216:1: ruleInitialTransition returns [EObject result] : ( ( '->' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_TransArgument= ruleTransArgument ) ( ';' ) )* (temp_TransArgument= ruleTransArgument ) ( ';' )? ( ']' ) )? ( ';' ) ) ;
    public EObject ruleInitialTransition() throws RecognitionException {
        EObject result = null;
        int ruleInitialTransition_StartIndex = input.index();
        String temp_SableCCIdentifier = null;

        EObject temp_TransArgument = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1219:4: ( ( ( '->' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_TransArgument= ruleTransArgument ) ( ';' ) )* (temp_TransArgument= ruleTransArgument ) ( ';' )? ( ']' ) )? ( ';' ) ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1219:4: ( ( '->' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_TransArgument= ruleTransArgument ) ( ';' ) )* (temp_TransArgument= ruleTransArgument ) ( ';' )? ( ']' ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "InitialTransition");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1222:1: ( ( '->' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_TransArgument= ruleTransArgument ) ( ';' ) )* (temp_TransArgument= ruleTransArgument ) ( ';' )? ( ']' ) )? ( ';' ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1222:2: ( '->' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_TransArgument= ruleTransArgument ) ( ';' ) )* (temp_TransArgument= ruleTransArgument ) ( ';' )? ( ']' ) )? ( ';' )
            {
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1222:2: ( '->' )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1222:3: '->'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,51,FOLLOW_51_in_ruleInitialTransition1695); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1228:1: (temp_SableCCIdentifier= ruleSableCCIdentifier )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1228:2: temp_SableCCIdentifier= ruleSableCCIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleSableCCIdentifier_in_ruleInitialTransition1705);
            temp_SableCCIdentifier=ruleSableCCIdentifier();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_SableCCIdentifier != null) {
                hasContent = true;
                factory.set(result,"targetState",convert(temp_SableCCIdentifier),false);
                ptm.ruleFinished(temp_SableCCIdentifier);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1239:1: ( ( '[' ) ( (temp_TransArgument= ruleTransArgument ) ( ';' ) )* (temp_TransArgument= ruleTransArgument ) ( ';' )? ( ']' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==11) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1239:2: ( '[' ) ( (temp_TransArgument= ruleTransArgument ) ( ';' ) )* (temp_TransArgument= ruleTransArgument ) ( ';' )? ( ']' )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1239:2: ( '[' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1239:3: '['
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleInitialTransition1714); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1245:1: ( (temp_TransArgument= ruleTransArgument ) ( ';' ) )*
                    loop28:
                    do {
                        int alt28=2;
                        switch ( input.LA(1) ) {
                        case 33:
                            {
                            int LA28_1 = input.LA(2);

                            if ( (LA28_1==20) ) {
                                int LA28_4 = input.LA(3);

                                if ( (LA28_4==RULE_STRING) ) {
                                    int LA28_7 = input.LA(4);

                                    if ( (LA28_7==12) ) {
                                        int LA28_21 = input.LA(5);

                                        if ( ((LA28_21>=33 && LA28_21<=34)||LA28_21==52) ) {
                                            alt28=1;
                                        }


                                    }


                                }


                            }


                            }
                            break;
                        case 34:
                            {
                            int LA28_2 = input.LA(2);

                            if ( (LA28_2==20) ) {
                                switch ( input.LA(3) ) {
                                case 53:
                                    {
                                    int LA28_8 = input.LA(4);

                                    if ( (LA28_8==12) ) {
                                        int LA28_21 = input.LA(5);

                                        if ( ((LA28_21>=33 && LA28_21<=34)||LA28_21==52) ) {
                                            alt28=1;
                                        }


                                    }


                                    }
                                    break;
                                case 54:
                                    {
                                    int LA28_9 = input.LA(4);

                                    if ( (LA28_9==12) ) {
                                        int LA28_21 = input.LA(5);

                                        if ( ((LA28_21>=33 && LA28_21<=34)||LA28_21==52) ) {
                                            alt28=1;
                                        }


                                    }


                                    }
                                    break;
                                case 55:
                                    {
                                    int LA28_10 = input.LA(4);

                                    if ( (LA28_10==12) ) {
                                        int LA28_21 = input.LA(5);

                                        if ( ((LA28_21>=33 && LA28_21<=34)||LA28_21==52) ) {
                                            alt28=1;
                                        }


                                    }


                                    }
                                    break;
                                case 56:
                                    {
                                    int LA28_11 = input.LA(4);

                                    if ( (LA28_11==12) ) {
                                        int LA28_21 = input.LA(5);

                                        if ( ((LA28_21>=33 && LA28_21<=34)||LA28_21==52) ) {
                                            alt28=1;
                                        }


                                    }


                                    }
                                    break;
                                case 57:
                                    {
                                    int LA28_12 = input.LA(4);

                                    if ( (LA28_12==12) ) {
                                        int LA28_21 = input.LA(5);

                                        if ( ((LA28_21>=33 && LA28_21<=34)||LA28_21==52) ) {
                                            alt28=1;
                                        }


                                    }


                                    }
                                    break;
                                case 58:
                                    {
                                    int LA28_13 = input.LA(4);

                                    if ( (LA28_13==12) ) {
                                        int LA28_21 = input.LA(5);

                                        if ( ((LA28_21>=33 && LA28_21<=34)||LA28_21==52) ) {
                                            alt28=1;
                                        }


                                    }


                                    }
                                    break;
                                case 59:
                                    {
                                    int LA28_14 = input.LA(4);

                                    if ( (LA28_14==12) ) {
                                        int LA28_21 = input.LA(5);

                                        if ( ((LA28_21>=33 && LA28_21<=34)||LA28_21==52) ) {
                                            alt28=1;
                                        }


                                    }


                                    }
                                    break;
                                case 60:
                                    {
                                    int LA28_15 = input.LA(4);

                                    if ( (LA28_15==12) ) {
                                        int LA28_21 = input.LA(5);

                                        if ( ((LA28_21>=33 && LA28_21<=34)||LA28_21==52) ) {
                                            alt28=1;
                                        }


                                    }


                                    }
                                    break;
                                case 61:
                                    {
                                    int LA28_16 = input.LA(4);

                                    if ( (LA28_16==12) ) {
                                        int LA28_21 = input.LA(5);

                                        if ( ((LA28_21>=33 && LA28_21<=34)||LA28_21==52) ) {
                                            alt28=1;
                                        }


                                    }


                                    }
                                    break;
                                case 62:
                                    {
                                    int LA28_17 = input.LA(4);

                                    if ( (LA28_17==12) ) {
                                        int LA28_21 = input.LA(5);

                                        if ( ((LA28_21>=33 && LA28_21<=34)||LA28_21==52) ) {
                                            alt28=1;
                                        }


                                    }


                                    }
                                    break;
                                case 63:
                                    {
                                    int LA28_18 = input.LA(4);

                                    if ( (LA28_18==12) ) {
                                        int LA28_21 = input.LA(5);

                                        if ( ((LA28_21>=33 && LA28_21<=34)||LA28_21==52) ) {
                                            alt28=1;
                                        }


                                    }


                                    }
                                    break;
                                case 64:
                                    {
                                    int LA28_19 = input.LA(4);

                                    if ( (LA28_19==12) ) {
                                        int LA28_21 = input.LA(5);

                                        if ( ((LA28_21>=33 && LA28_21<=34)||LA28_21==52) ) {
                                            alt28=1;
                                        }


                                    }


                                    }
                                    break;

                                }

                            }


                            }
                            break;
                        case 52:
                            {
                            int LA28_3 = input.LA(2);

                            if ( (LA28_3==20) ) {
                                int LA28_6 = input.LA(3);

                                if ( (LA28_6==RULE_STRING) ) {
                                    int LA28_20 = input.LA(4);

                                    if ( (LA28_20==12) ) {
                                        int LA28_21 = input.LA(5);

                                        if ( ((LA28_21>=33 && LA28_21<=34)||LA28_21==52) ) {
                                            alt28=1;
                                        }


                                    }


                                }


                            }


                            }
                            break;

                        }

                        switch (alt28) {
                    	case 1 :
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1245:2: (temp_TransArgument= ruleTransArgument ) ( ';' )
                    	    {
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1245:2: (temp_TransArgument= ruleTransArgument )
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1245:3: temp_TransArgument= ruleTransArgument
                    	    {
                    	    if ( backtracking==0 ) {
                    	      ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(2)).eContents().get(1)).eContents().get(0)));
                    	    }
                    	    pushFollow(FOLLOW_ruleTransArgument_in_ruleInitialTransition1725);
                    	    temp_TransArgument=ruleTransArgument();
                    	    _fsp--;
                    	    if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      if (temp_TransArgument != null) {
                    	        hasContent = true;
                    	        ptm.setModelElement(temp_TransArgument);
                    	        factory.add(result,"transArgs",convert(temp_TransArgument),false);
                    	        ptm.ruleFinished(temp_TransArgument);
                    	      } else {
                    	        ptm.destroyNode();
                    	      }

                    	    }

                    	    }

                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1257:1: ( ';' )
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1257:2: ';'
                    	    {
                    	    if ( backtracking==0 ) {
                    	      skipCurrentToken = false;
                    	    }
                    	    match(input,12,FOLLOW_12_in_ruleInitialTransition1733); if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      if (!skipCurrentToken) {
                    	        hasContent = true;
                    	        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(2)).eContents().get(1)).eContents().get(1)));
                    	        ptm.ruleFinished(getLastToken());
                    	      }
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1264:1: (temp_TransArgument= ruleTransArgument )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1264:2: temp_TransArgument= ruleTransArgument
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                    }
                    pushFollow(FOLLOW_ruleTransArgument_in_ruleInitialTransition1746);
                    temp_TransArgument=ruleTransArgument();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_TransArgument != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_TransArgument);
                        factory.add(result,"transArgs",convert(temp_TransArgument),false);
                        ptm.ruleFinished(temp_TransArgument);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1276:1: ( ';' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==12) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1276:2: ';'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,12,FOLLOW_12_in_ruleInitialTransition1754); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(2)).eContents().get(3)));
                                ptm.ruleFinished(getLastToken());
                              }
                            }

                            }
                            break;

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1282:1: ( ']' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1282:2: ']'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,13,FOLLOW_13_in_ruleInitialTransition1762); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(2)).eContents().get(4)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1289:1: ( ';' )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1289:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleInitialTransition1772); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 17, ruleInitialTransition_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleInitialTransition


    // $ANTLR start ruleNonInitialTransition
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1302:1: ruleNonInitialTransition returns [EObject result] : ( (temp_SableCCIdentifier= ruleSableCCIdentifier )? ( '->' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_TransArgument= ruleTransArgument ) ( ';' ) )* (temp_TransArgument= ruleTransArgument ) ( ';' )? ( ']' ) )? ( ';' ) ) ;
    public EObject ruleNonInitialTransition() throws RecognitionException {
        EObject result = null;
        int ruleNonInitialTransition_StartIndex = input.index();
        String temp_SableCCIdentifier = null;

        EObject temp_TransArgument = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1305:4: ( ( (temp_SableCCIdentifier= ruleSableCCIdentifier )? ( '->' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_TransArgument= ruleTransArgument ) ( ';' ) )* (temp_TransArgument= ruleTransArgument ) ( ';' )? ( ']' ) )? ( ';' ) ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1305:4: ( (temp_SableCCIdentifier= ruleSableCCIdentifier )? ( '->' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_TransArgument= ruleTransArgument ) ( ';' ) )* (temp_TransArgument= ruleTransArgument ) ( ';' )? ( ']' ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "NonInitialTransition");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1308:1: ( (temp_SableCCIdentifier= ruleSableCCIdentifier )? ( '->' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_TransArgument= ruleTransArgument ) ( ';' ) )* (temp_TransArgument= ruleTransArgument ) ( ';' )? ( ']' ) )? ( ';' ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1308:2: (temp_SableCCIdentifier= ruleSableCCIdentifier )? ( '->' ) (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_TransArgument= ruleTransArgument ) ( ';' ) )* (temp_TransArgument= ruleTransArgument ) ( ';' )? ( ']' ) )? ( ';' )
            {
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1308:2: (temp_SableCCIdentifier= ruleSableCCIdentifier )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_INT)||(LA31_0>=16 && LA31_0<=18)) ) {
                alt31=1;
            }
            else if ( (LA31_0==51) ) {
                int LA31_2 = input.LA(2);

                if ( (synpred55()) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1308:3: temp_SableCCIdentifier= ruleSableCCIdentifier
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(0)));
                    }
                    pushFollow(FOLLOW_ruleSableCCIdentifier_in_ruleNonInitialTransition1813);
                    temp_SableCCIdentifier=ruleSableCCIdentifier();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_SableCCIdentifier != null) {
                        hasContent = true;
                        factory.set(result,"sourceState",convert(temp_SableCCIdentifier),false);
                        ptm.ruleFinished(temp_SableCCIdentifier);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }
                    break;

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1319:1: ( '->' )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1319:2: '->'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,51,FOLLOW_51_in_ruleNonInitialTransition1822); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1325:1: (temp_SableCCIdentifier= ruleSableCCIdentifier )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1325:2: temp_SableCCIdentifier= ruleSableCCIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(2)));
            }
            pushFollow(FOLLOW_ruleSableCCIdentifier_in_ruleNonInitialTransition1832);
            temp_SableCCIdentifier=ruleSableCCIdentifier();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_SableCCIdentifier != null) {
                hasContent = true;
                factory.set(result,"targetState",convert(temp_SableCCIdentifier),false);
                ptm.ruleFinished(temp_SableCCIdentifier);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1336:1: ( ( '[' ) ( (temp_TransArgument= ruleTransArgument ) ( ';' ) )* (temp_TransArgument= ruleTransArgument ) ( ';' )? ( ']' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==11) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1336:2: ( '[' ) ( (temp_TransArgument= ruleTransArgument ) ( ';' ) )* (temp_TransArgument= ruleTransArgument ) ( ';' )? ( ']' )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1336:2: ( '[' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1336:3: '['
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleNonInitialTransition1841); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1342:1: ( (temp_TransArgument= ruleTransArgument ) ( ';' ) )*
                    loop32:
                    do {
                        int alt32=2;
                        switch ( input.LA(1) ) {
                        case 33:
                            {
                            int LA32_1 = input.LA(2);

                            if ( (LA32_1==20) ) {
                                int LA32_4 = input.LA(3);

                                if ( (LA32_4==RULE_STRING) ) {
                                    int LA32_7 = input.LA(4);

                                    if ( (LA32_7==12) ) {
                                        int LA32_21 = input.LA(5);

                                        if ( ((LA32_21>=33 && LA32_21<=34)||LA32_21==52) ) {
                                            alt32=1;
                                        }


                                    }


                                }


                            }


                            }
                            break;
                        case 34:
                            {
                            int LA32_2 = input.LA(2);

                            if ( (LA32_2==20) ) {
                                switch ( input.LA(3) ) {
                                case 53:
                                    {
                                    int LA32_8 = input.LA(4);

                                    if ( (LA32_8==12) ) {
                                        int LA32_21 = input.LA(5);

                                        if ( ((LA32_21>=33 && LA32_21<=34)||LA32_21==52) ) {
                                            alt32=1;
                                        }


                                    }


                                    }
                                    break;
                                case 54:
                                    {
                                    int LA32_9 = input.LA(4);

                                    if ( (LA32_9==12) ) {
                                        int LA32_21 = input.LA(5);

                                        if ( ((LA32_21>=33 && LA32_21<=34)||LA32_21==52) ) {
                                            alt32=1;
                                        }


                                    }


                                    }
                                    break;
                                case 55:
                                    {
                                    int LA32_10 = input.LA(4);

                                    if ( (LA32_10==12) ) {
                                        int LA32_21 = input.LA(5);

                                        if ( ((LA32_21>=33 && LA32_21<=34)||LA32_21==52) ) {
                                            alt32=1;
                                        }


                                    }


                                    }
                                    break;
                                case 56:
                                    {
                                    int LA32_11 = input.LA(4);

                                    if ( (LA32_11==12) ) {
                                        int LA32_21 = input.LA(5);

                                        if ( ((LA32_21>=33 && LA32_21<=34)||LA32_21==52) ) {
                                            alt32=1;
                                        }


                                    }


                                    }
                                    break;
                                case 57:
                                    {
                                    int LA32_12 = input.LA(4);

                                    if ( (LA32_12==12) ) {
                                        int LA32_21 = input.LA(5);

                                        if ( ((LA32_21>=33 && LA32_21<=34)||LA32_21==52) ) {
                                            alt32=1;
                                        }


                                    }


                                    }
                                    break;
                                case 58:
                                    {
                                    int LA32_13 = input.LA(4);

                                    if ( (LA32_13==12) ) {
                                        int LA32_21 = input.LA(5);

                                        if ( ((LA32_21>=33 && LA32_21<=34)||LA32_21==52) ) {
                                            alt32=1;
                                        }


                                    }


                                    }
                                    break;
                                case 59:
                                    {
                                    int LA32_14 = input.LA(4);

                                    if ( (LA32_14==12) ) {
                                        int LA32_21 = input.LA(5);

                                        if ( ((LA32_21>=33 && LA32_21<=34)||LA32_21==52) ) {
                                            alt32=1;
                                        }


                                    }


                                    }
                                    break;
                                case 60:
                                    {
                                    int LA32_15 = input.LA(4);

                                    if ( (LA32_15==12) ) {
                                        int LA32_21 = input.LA(5);

                                        if ( ((LA32_21>=33 && LA32_21<=34)||LA32_21==52) ) {
                                            alt32=1;
                                        }


                                    }


                                    }
                                    break;
                                case 61:
                                    {
                                    int LA32_16 = input.LA(4);

                                    if ( (LA32_16==12) ) {
                                        int LA32_21 = input.LA(5);

                                        if ( ((LA32_21>=33 && LA32_21<=34)||LA32_21==52) ) {
                                            alt32=1;
                                        }


                                    }


                                    }
                                    break;
                                case 62:
                                    {
                                    int LA32_17 = input.LA(4);

                                    if ( (LA32_17==12) ) {
                                        int LA32_21 = input.LA(5);

                                        if ( ((LA32_21>=33 && LA32_21<=34)||LA32_21==52) ) {
                                            alt32=1;
                                        }


                                    }


                                    }
                                    break;
                                case 63:
                                    {
                                    int LA32_18 = input.LA(4);

                                    if ( (LA32_18==12) ) {
                                        int LA32_21 = input.LA(5);

                                        if ( ((LA32_21>=33 && LA32_21<=34)||LA32_21==52) ) {
                                            alt32=1;
                                        }


                                    }


                                    }
                                    break;
                                case 64:
                                    {
                                    int LA32_19 = input.LA(4);

                                    if ( (LA32_19==12) ) {
                                        int LA32_21 = input.LA(5);

                                        if ( ((LA32_21>=33 && LA32_21<=34)||LA32_21==52) ) {
                                            alt32=1;
                                        }


                                    }


                                    }
                                    break;

                                }

                            }


                            }
                            break;
                        case 52:
                            {
                            int LA32_3 = input.LA(2);

                            if ( (LA32_3==20) ) {
                                int LA32_6 = input.LA(3);

                                if ( (LA32_6==RULE_STRING) ) {
                                    int LA32_20 = input.LA(4);

                                    if ( (LA32_20==12) ) {
                                        int LA32_21 = input.LA(5);

                                        if ( ((LA32_21>=33 && LA32_21<=34)||LA32_21==52) ) {
                                            alt32=1;
                                        }


                                    }


                                }


                            }


                            }
                            break;

                        }

                        switch (alt32) {
                    	case 1 :
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1342:2: (temp_TransArgument= ruleTransArgument ) ( ';' )
                    	    {
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1342:2: (temp_TransArgument= ruleTransArgument )
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1342:3: temp_TransArgument= ruleTransArgument
                    	    {
                    	    if ( backtracking==0 ) {
                    	      ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                    	    }
                    	    pushFollow(FOLLOW_ruleTransArgument_in_ruleNonInitialTransition1852);
                    	    temp_TransArgument=ruleTransArgument();
                    	    _fsp--;
                    	    if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      if (temp_TransArgument != null) {
                    	        hasContent = true;
                    	        ptm.setModelElement(temp_TransArgument);
                    	        factory.add(result,"transArgs",convert(temp_TransArgument),false);
                    	        ptm.ruleFinished(temp_TransArgument);
                    	      } else {
                    	        ptm.destroyNode();
                    	      }

                    	    }

                    	    }

                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1354:1: ( ';' )
                    	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1354:2: ';'
                    	    {
                    	    if ( backtracking==0 ) {
                    	      skipCurrentToken = false;
                    	    }
                    	    match(input,12,FOLLOW_12_in_ruleNonInitialTransition1860); if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      if (!skipCurrentToken) {
                    	        hasContent = true;
                    	        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
                    	        ptm.ruleFinished(getLastToken());
                    	      }
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1361:1: (temp_TransArgument= ruleTransArgument )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1361:2: temp_TransArgument= ruleTransArgument
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(3)).eContents().get(2)));
                    }
                    pushFollow(FOLLOW_ruleTransArgument_in_ruleNonInitialTransition1873);
                    temp_TransArgument=ruleTransArgument();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_TransArgument != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_TransArgument);
                        factory.add(result,"transArgs",convert(temp_TransArgument),false);
                        ptm.ruleFinished(temp_TransArgument);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1373:1: ( ';' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==12) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1373:2: ';'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,12,FOLLOW_12_in_ruleNonInitialTransition1881); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(3)).eContents().get(3)));
                                ptm.ruleFinished(getLastToken());
                              }
                            }

                            }
                            break;

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1379:1: ( ']' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1379:2: ']'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,13,FOLLOW_13_in_ruleNonInitialTransition1889); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(3)).eContents().get(4)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1386:1: ( ';' )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1386:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleNonInitialTransition1899); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(4)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 18, ruleNonInitialTransition_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleNonInitialTransition


    // $ANTLR start ruleTransArgument
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1399:1: ruleTransArgument returns [EObject result] : ( ( ( 'label' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'type' ) ( '=' ) (temp_TransitionType= ruleTransitionType ) ) | ( ( 'priority' ) ( '=' ) ( RULE_STRING ) ) ) ;
    public EObject ruleTransArgument() throws RecognitionException {
        EObject result = null;
        int ruleTransArgument_StartIndex = input.index();
        Enumerator temp_TransitionType = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1402:4: ( ( ( ( 'label' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'type' ) ( '=' ) (temp_TransitionType= ruleTransitionType ) ) | ( ( 'priority' ) ( '=' ) ( RULE_STRING ) ) ) )
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1402:4: ( ( ( 'label' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'type' ) ( '=' ) (temp_TransitionType= ruleTransitionType ) ) | ( ( 'priority' ) ( '=' ) ( RULE_STRING ) ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "TransArgument");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1405:1: ( ( ( 'label' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'type' ) ( '=' ) (temp_TransitionType= ruleTransitionType ) ) | ( ( 'priority' ) ( '=' ) ( RULE_STRING ) ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt35=1;
                }
                break;
            case 34:
                {
                alt35=2;
                }
                break;
            case 52:
                {
                alt35=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("1405:1: ( ( ( 'label' ) ( '=' ) ( RULE_STRING ) ) | ( ( 'type' ) ( '=' ) (temp_TransitionType= ruleTransitionType ) ) | ( ( 'priority' ) ( '=' ) ( RULE_STRING ) ) )", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1405:2: ( ( 'label' ) ( '=' ) ( RULE_STRING ) )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1405:2: ( ( 'label' ) ( '=' ) ( RULE_STRING ) )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1405:3: ( 'label' ) ( '=' ) ( RULE_STRING )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1405:3: ( 'label' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1405:4: 'label'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,33,FOLLOW_33_in_ruleTransArgument1938); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1411:1: ( '=' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1411:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,20,FOLLOW_20_in_ruleTransArgument1945); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1417:1: ( RULE_STRING )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1417:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTransArgument1953); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        factory.set(result,"label",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1428:1: ( ( 'type' ) ( '=' ) (temp_TransitionType= ruleTransitionType ) )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1428:1: ( ( 'type' ) ( '=' ) (temp_TransitionType= ruleTransitionType ) )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1428:2: ( 'type' ) ( '=' ) (temp_TransitionType= ruleTransitionType )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1428:2: ( 'type' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1428:3: 'type'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,34,FOLLOW_34_in_ruleTransArgument1966); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1434:1: ( '=' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1434:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,20,FOLLOW_20_in_ruleTransArgument1973); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1440:1: (temp_TransitionType= ruleTransitionType )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1440:2: temp_TransitionType= ruleTransitionType
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                    }
                    pushFollow(FOLLOW_ruleTransitionType_in_ruleTransArgument1983);
                    temp_TransitionType=ruleTransitionType();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_TransitionType != null) {
                        hasContent = true;
                        factory.set(result,"type",convert(temp_TransitionType),false);
                        ptm.ruleFinished(temp_TransitionType);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1452:1: ( ( 'priority' ) ( '=' ) ( RULE_STRING ) )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1452:1: ( ( 'priority' ) ( '=' ) ( RULE_STRING ) )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1452:2: ( 'priority' ) ( '=' ) ( RULE_STRING )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1452:2: ( 'priority' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1452:3: 'priority'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,52,FOLLOW_52_in_ruleTransArgument1996); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1458:1: ( '=' )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1458:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,20,FOLLOW_20_in_ruleTransArgument2003); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1464:1: ( RULE_STRING )
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1464:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTransArgument2011); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                        factory.set(result,"priority",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }


                    }
                    break;

            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 19, ruleTransArgument_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleTransArgument


    // $ANTLR start ruleTransitionType
    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1482:1: ruleTransitionType returns [Enumerator r] : ( 'weakAbortion' | 'wa' | 'strongAbortion' | 'sa' | 'normalTermination' | 'nt' | 'suspension' | 'sp' | 'conditional' | 'co' | 'internal' | 'it' );
    public Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator r = null;
        int ruleTransitionType_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return r; }
            // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1483:4: ( 'weakAbortion' | 'wa' | 'strongAbortion' | 'sa' | 'normalTermination' | 'nt' | 'suspension' | 'sp' | 'conditional' | 'co' | 'internal' | 'it' )
            int alt36=12;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt36=1;
                }
                break;
            case 54:
                {
                alt36=2;
                }
                break;
            case 55:
                {
                alt36=3;
                }
                break;
            case 56:
                {
                alt36=4;
                }
                break;
            case 57:
                {
                alt36=5;
                }
                break;
            case 58:
                {
                alt36=6;
                }
                break;
            case 59:
                {
                alt36=7;
                }
                break;
            case 60:
                {
                alt36=8;
                }
                break;
            case 61:
                {
                alt36=9;
                }
                break;
            case 62:
                {
                alt36=10;
                }
                break;
            case 63:
                {
                alt36=11;
                }
                break;
            case 64:
                {
                alt36=12;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("1482:1: ruleTransitionType returns [Enumerator r] : ( 'weakAbortion' | 'wa' | 'strongAbortion' | 'sa' | 'normalTermination' | 'nt' | 'suspension' | 'sp' | 'conditional' | 'co' | 'internal' | 'it' );", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1483:4: 'weakAbortion'
                    {
                    match(input,53,FOLLOW_53_in_ruleTransitionType2042); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)));
                      r =factory.enumLit("", "TransitionType","weakabortion");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 2 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1489:7: 'wa'
                    {
                    match(input,54,FOLLOW_54_in_ruleTransitionType2055); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(2)));
                      r =factory.enumLit("", "TransitionType","wa");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 3 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1495:7: 'strongAbortion'
                    {
                    match(input,55,FOLLOW_55_in_ruleTransitionType2068); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(3)));
                      r =factory.enumLit("", "TransitionType","strongabortion");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 4 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1501:7: 'sa'
                    {
                    match(input,56,FOLLOW_56_in_ruleTransitionType2081); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(4)));
                      r =factory.enumLit("", "TransitionType","sa");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 5 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1507:7: 'normalTermination'
                    {
                    match(input,57,FOLLOW_57_in_ruleTransitionType2094); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(5)));
                      r =factory.enumLit("", "TransitionType","normaltermination");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 6 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1513:7: 'nt'
                    {
                    match(input,58,FOLLOW_58_in_ruleTransitionType2107); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(6)));
                      r =factory.enumLit("", "TransitionType","nt");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 7 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1519:7: 'suspension'
                    {
                    match(input,59,FOLLOW_59_in_ruleTransitionType2120); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(7)));
                      r =factory.enumLit("", "TransitionType","suspension");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 8 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1525:7: 'sp'
                    {
                    match(input,60,FOLLOW_60_in_ruleTransitionType2133); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(8)));
                      r =factory.enumLit("", "TransitionType","sp");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 9 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1531:7: 'conditional'
                    {
                    match(input,61,FOLLOW_61_in_ruleTransitionType2146); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(9)));
                      r =factory.enumLit("", "TransitionType","conditional");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 10 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1537:7: 'co'
                    {
                    match(input,62,FOLLOW_62_in_ruleTransitionType2159); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(10)));
                      r =factory.enumLit("", "TransitionType","co");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 11 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1543:7: 'internal'
                    {
                    match(input,63,FOLLOW_63_in_ruleTransitionType2172); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(11)));
                      r =factory.enumLit("", "TransitionType","internal");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 12 :
                    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1549:7: 'it'
                    {
                    match(input,64,FOLLOW_64_in_ruleTransitionType2185); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(12)));
                      r =factory.enumLit("", "TransitionType","it");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 20, ruleTransitionType_StartIndex); }
        }
        return r;
    }
    // $ANTLR end ruleTransitionType

    // $ANTLR start synpred44
    public void synpred44_fragment() throws RecognitionException {   
        // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:990:2: ( ( '[' ) ( ( ruleRegionArgument ) ( ';' ) )* ( ruleRegionArgument ) ( ';' )? ( ']' ) )
        // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:990:2: ( '[' ) ( ( ruleRegionArgument ) ( ';' ) )* ( ruleRegionArgument ) ( ';' )? ( ']' )
        {
        // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:990:2: ( '[' )
        // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:990:3: '['
        {
        if ( backtracking==0 ) {
          skipCurrentToken = false;
        }
        match(input,11,FOLLOW_11_in_synpred441345); if (failed) return ;

        }

        // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:996:1: ( ( ruleRegionArgument ) ( ';' ) )*
        loop42:
        do {
            int alt42=2;
            switch ( input.LA(1) ) {
            case 33:
                {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==20) ) {
                    int LA42_4 = input.LA(3);

                    if ( (LA42_4==RULE_STRING) ) {
                        int LA42_7 = input.LA(4);

                        if ( (LA42_7==12) ) {
                            int LA42_10 = input.LA(5);

                            if ( (LA42_10==33||(LA42_10>=47 && LA42_10<=48)) ) {
                                alt42=1;
                            }


                        }


                    }


                }


                }
                break;
            case 47:
                {
                int LA42_2 = input.LA(2);

                if ( (LA42_2==20) ) {
                    int LA42_5 = input.LA(3);

                    if ( (LA42_5==RULE_STRING) ) {
                        int LA42_8 = input.LA(4);

                        if ( (LA42_8==12) ) {
                            int LA42_10 = input.LA(5);

                            if ( (LA42_10==33||(LA42_10>=47 && LA42_10<=48)) ) {
                                alt42=1;
                            }


                        }


                    }


                }


                }
                break;
            case 48:
                {
                int LA42_3 = input.LA(2);

                if ( (LA42_3==20) ) {
                    int LA42_6 = input.LA(3);

                    if ( (LA42_6==RULE_STRING) ) {
                        int LA42_9 = input.LA(4);

                        if ( (LA42_9==12) ) {
                            int LA42_10 = input.LA(5);

                            if ( (LA42_10==33||(LA42_10>=47 && LA42_10<=48)) ) {
                                alt42=1;
                            }


                        }


                    }


                }


                }
                break;

            }

            switch (alt42) {
        	case 1 :
        	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:996:2: ( ruleRegionArgument ) ( ';' )
        	    {
        	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:996:2: ( ruleRegionArgument )
        	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:996:3: ruleRegionArgument
        	    {
        	    if ( backtracking==0 ) {
        	      ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
        	    }
        	    pushFollow(FOLLOW_ruleRegionArgument_in_synpred441356);
        	    ruleRegionArgument();
        	    _fsp--;
        	    if (failed) return ;

        	    }

        	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1008:1: ( ';' )
        	    // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1008:2: ';'
        	    {
        	    if ( backtracking==0 ) {
        	      skipCurrentToken = false;
        	    }
        	    match(input,12,FOLLOW_12_in_synpred441364); if (failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop42;
            }
        } while (true);

        // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1015:1: ( ruleRegionArgument )
        // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1015:2: ruleRegionArgument
        {
        if ( backtracking==0 ) {
          ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(2)));
        }
        pushFollow(FOLLOW_ruleRegionArgument_in_synpred441377);
        ruleRegionArgument();
        _fsp--;
        if (failed) return ;

        }

        // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1027:1: ( ';' )?
        int alt43=2;
        int LA43_0 = input.LA(1);

        if ( (LA43_0==12) ) {
            alt43=1;
        }
        switch (alt43) {
            case 1 :
                // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1027:2: ';'
                {
                match(input,12,FOLLOW_12_in_synpred441385); if (failed) return ;

                }
                break;

        }

        // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1033:1: ( ']' )
        // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1033:2: ']'
        {
        if ( backtracking==0 ) {
          skipCurrentToken = false;
        }
        match(input,13,FOLLOW_13_in_synpred441393); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred44

    // $ANTLR start synpred51
    public void synpred51_fragment() throws RecognitionException {   
        // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1214:9: ( ruleInitialTransition )
        // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1214:9: ruleInitialTransition
        {
        pushFollow(FOLLOW_ruleInitialTransition_in_synpred511652);
        ruleInitialTransition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred51

    // $ANTLR start synpred55
    public void synpred55_fragment() throws RecognitionException {   
        // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1308:3: ( ruleSableCCIdentifier )
        // ..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g:1308:3: ruleSableCCIdentifier
        {
        if ( backtracking==0 ) {
          ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(0)));
        }
        pushFollow(FOLLOW_ruleSableCCIdentifier_in_synpred551813);
        ruleSableCCIdentifier();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred55

    public final boolean synpred44() {
        backtracking++;
        int start = input.mark();
        try {
            synpred44_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred55() {
        backtracking++;
        int start = input.mark();
        try {
            synpred55_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred51() {
        backtracking++;
        int start = input.mark();
        try {
            synpred51_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA16_eotS =
        "\12\uffff";
    static final String DFA16_eofS =
        "\12\uffff";
    static final String DFA16_minS =
        "\1\4\1\uffff\5\4\3\uffff";
    static final String DFA16_maxS =
        "\1\63\1\uffff\5\63\3\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\4\5\uffff\1\1\1\2\1\3";
    static final String DFA16_specialS =
        "\12\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\5\1\6\5\uffff\2\7\1\uffff\1\7\1\1\1\2\1\3\1\4\15\uffff\1"+
            "\11\22\uffff\1\10",
            "",
            "\1\5\1\6\5\uffff\2\7\1\uffff\1\7\1\uffff\1\2\1\3\1\4\40\uffff"+
            "\1\10",
            "\1\5\1\6\5\uffff\2\7\1\uffff\1\7\1\uffff\1\2\1\3\1\4\40\uffff"+
            "\1\10",
            "\1\5\1\6\5\uffff\2\7\1\uffff\1\7\1\uffff\1\2\1\3\1\4\40\uffff"+
            "\1\10",
            "\1\5\1\6\5\uffff\2\7\1\uffff\1\7\1\uffff\1\2\1\3\1\4\40\uffff"+
            "\1\10",
            "\1\5\1\6\5\uffff\2\7\1\uffff\1\7\1\uffff\1\2\1\3\1\4\40\uffff"+
            "\1\10",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()* loopback of 567:1: ( (temp_State= ruleState ) | (temp_Transition= ruleTransition ) | ( ( '||' ) (temp_Region= ruleRegion )? ) )*";
        }
    }
    static final String DFA21_eotS =
        "\17\uffff";
    static final String DFA21_eofS =
        "\1\2\16\uffff";
    static final String DFA21_minS =
        "\1\4\1\41\1\uffff\3\24\3\6\3\14\1\15\1\0\1\uffff";
    static final String DFA21_maxS =
        "\1\63\1\60\1\uffff\3\24\3\6\3\15\1\60\1\0\1\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\13\uffff\1\1";
    static final String DFA21_specialS =
        "\15\uffff\1\0\1\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\2\5\uffff\1\1\1\2\1\uffff\5\2\15\uffff\1\2\22\uffff\1\2",
            "\1\3\7\2\6\uffff\1\4\1\5",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14\1\15",
            "\1\14\1\15",
            "\1\14\1\15",
            "\1\15\23\uffff\1\3\7\2\6\uffff\1\4\1\5",
            "\1\uffff",
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
            return "990:1: ( ( '[' ) ( (temp_RegionArgument= ruleRegionArgument ) ( ';' ) )* (temp_RegionArgument= ruleRegionArgument ) ( ';' )? ( ']' ) )?";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_13 = input.LA(1);

                         
                        int index21_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44()) ) {s = 14;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index21_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\56\uffff";
    static final String DFA26_eofS =
        "\56\uffff";
    static final String DFA26_minS =
        "\6\4\1\41\2\uffff\12\24\1\6\1\51\10\6\17\14\1\15\1\14";
    static final String DFA26_maxS =
        "\6\22\1\60\2\uffff\12\24\1\6\1\56\10\6\17\15\1\60\1\16";
    static final String DFA26_acceptS =
        "\7\uffff\1\1\1\2\45\uffff";
    static final String DFA26_specialS =
        "\56\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\4\1\5\5\uffff\1\6\1\7\1\uffff\1\10\1\uffff\1\1\1\2\1\3",
            "\1\4\1\5\5\uffff\1\6\1\7\1\uffff\1\10\1\uffff\1\1\1\2\1\3",
            "\1\4\1\5\5\uffff\1\6\1\7\1\uffff\1\10\1\uffff\1\1\1\2\1\3",
            "\1\4\1\5\5\uffff\1\6\1\7\1\uffff\1\10\1\uffff\1\1\1\2\1\3",
            "\1\4\1\5\5\uffff\1\6\1\7\1\uffff\1\10\1\uffff\1\1\1\2\1\3",
            "\1\4\1\5\5\uffff\1\6\1\7\1\uffff\1\10\1\uffff\1\1\1\2\1\3",
            "\1\11\1\12\1\15\1\16\1\17\1\20\1\21\1\22\6\uffff\1\13\1\14",
            "",
            "",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54\1\55",
            "\1\54\1\55",
            "\1\54\1\55",
            "\1\54\1\55",
            "\1\54\1\55",
            "\1\54\1\55",
            "\1\54\1\55",
            "\1\54\1\55",
            "\1\54\1\55",
            "\1\54\1\55",
            "\1\54\1\55",
            "\1\54\1\55",
            "\1\54\1\55",
            "\1\54\1\55",
            "\1\54\1\55",
            "\1\55\23\uffff\1\11\1\12\1\15\1\16\1\17\1\20\1\21\1\22\6\uffff"+
            "\1\13\1\14",
            "\1\7\1\uffff\1\10"
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
            return "1113:1: ( ( (temp_SableCCIdentifier= ruleSableCCIdentifier ) ( ( '[' ) ( (temp_StateArgument= ruleStateArgument ) ( ';' ) )* (temp_StateArgument= ruleStateArgument ) ( ';' )? ( ']' ) )? ( ';' ) ) | ( (temp_SableCCIdentifier= ruleSableCCIdentifier ) (temp_CState= ruleCState ) ) )";
        }
    }
    static final String DFA27_eotS =
        "\41\uffff";
    static final String DFA27_eofS =
        "\41\uffff";
    static final String DFA27_minS =
        "\2\4\1\uffff\5\4\1\41\1\0\3\24\1\uffff\1\6\1\65\1\6\16\14\1\15\1"+
        "\14";
    static final String DFA27_maxS =
        "\1\63\1\22\1\uffff\5\22\1\64\1\0\3\24\1\uffff\1\6\1\100\1\6\16\15"+
        "\1\64\1\14";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\12\uffff\1\1\23\uffff";
    static final String DFA27_specialS =
        "\11\uffff\1\0\27\uffff}>";
    static final String[] DFA27_transitionS = {
            "\2\2\12\uffff\3\2\40\uffff\1\1",
            "\1\6\1\7\5\uffff\1\10\1\11\3\uffff\1\3\1\4\1\5",
            "",
            "\1\6\1\7\5\uffff\1\10\1\11\3\uffff\1\3\1\4\1\5",
            "\1\6\1\7\5\uffff\1\10\1\11\3\uffff\1\3\1\4\1\5",
            "\1\6\1\7\5\uffff\1\10\1\11\3\uffff\1\3\1\4\1\5",
            "\1\6\1\7\5\uffff\1\10\1\11\3\uffff\1\3\1\4\1\5",
            "\1\6\1\7\5\uffff\1\10\1\11\3\uffff\1\3\1\4\1\5",
            "\1\12\1\13\21\uffff\1\14",
            "\1\uffff",
            "\1\16",
            "\1\17",
            "\1\20",
            "",
            "\1\21",
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35",
            "\1\36",
            "\1\37\1\40",
            "\1\37\1\40",
            "\1\37\1\40",
            "\1\37\1\40",
            "\1\37\1\40",
            "\1\37\1\40",
            "\1\37\1\40",
            "\1\37\1\40",
            "\1\37\1\40",
            "\1\37\1\40",
            "\1\37\1\40",
            "\1\37\1\40",
            "\1\37\1\40",
            "\1\37\1\40",
            "\1\40\23\uffff\1\12\1\13\21\uffff\1\14",
            "\1\11"
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1212:1: ruleTransition returns [EObject result] : (temp_initialtransition= ruleInitialTransition | temp_noninitialtransition= ruleNonInitialTransition );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_9 = input.LA(1);

                         
                        int index27_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index27_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleChart_in_parse67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleChart104 = new BitSet(new long[]{0x0000000000074830L});
    public static final BitSet FOLLOW_ruleSableCCIdentifier_in_ruleChart114 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_11_in_ruleChart123 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_ruleChartArgument_in_ruleChart134 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleChart142 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_ruleChartArgument_in_ruleChart155 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleChart163 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleChart171 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleChart181 = new BitSet(new long[]{0x0000000003804800L});
    public static final BitSet FOLLOW_ruleIoDeclaration_in_ruleChart191 = new BitSet(new long[]{0x0000000003804800L});
    public static final BitSet FOLLOW_ruleCState_in_ruleChart203 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleChart211 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleChart218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSableCCIdentifier257 = new BitSet(new long[]{0x0000000000070032L});
    public static final BitSet FOLLOW_17_in_ruleSableCCIdentifier269 = new BitSet(new long[]{0x0000000000070032L});
    public static final BitSet FOLLOW_18_in_ruleSableCCIdentifier281 = new BitSet(new long[]{0x0000000000070032L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSableCCIdentifier292 = new BitSet(new long[]{0x0000000000070032L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSableCCIdentifier302 = new BitSet(new long[]{0x0000000000070032L});
    public static final BitSet FOLLOW_19_in_ruleChartArgument343 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleChartArgument350 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChartArgument358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleChartArgument371 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleChartArgument378 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChartArgument386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationType_in_ruleIoDeclaration430 = new BitSet(new long[]{0x0000000000471030L});
    public static final BitSet FOLLOW_ruleSableCCIdentifier_in_ruleIoDeclaration441 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_22_in_ruleIoDeclaration450 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIoDeclaration457 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIoDeclaration465 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_22_in_ruleIoDeclaration477 = new BitSet(new long[]{0x00000000FC000000L});
    public static final BitSet FOLLOW_ruleVarEventType_in_ruleIoDeclaration487 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleIoDeclaration498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDeclarationType526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDeclarationType539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDeclarationType552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleVarEventType573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleVarEventType586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleVarEventType599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleVarEventType612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleVarEventType625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleVarEventType638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCState670 = new BitSet(new long[]{0x000181FE00000000L});
    public static final BitSet FOLLOW_ruleStateArgument_in_ruleCState681 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCState689 = new BitSet(new long[]{0x000181FE00000000L});
    public static final BitSet FOLLOW_ruleStateArgument_in_ruleCState702 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleCState710 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCState718 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCState728 = new BitSet(new long[]{0x000A000100079830L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleCState738 = new BitSet(new long[]{0x0008000100079830L});
    public static final BitSet FOLLOW_ruleState_in_ruleCState751 = new BitSet(new long[]{0x0008000100079830L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleCState764 = new BitSet(new long[]{0x0008000100079830L});
    public static final BitSet FOLLOW_32_in_ruleCState775 = new BitSet(new long[]{0x000A000100079830L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleCState785 = new BitSet(new long[]{0x0008000100079830L});
    public static final BitSet FOLLOW_15_in_ruleCState799 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCState806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStateArgument845 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStateArgument852 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStateArgument860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStateArgument873 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStateArgument880 = new BitSet(new long[]{0x00007E0000000000L});
    public static final BitSet FOLLOW_rulePseudo_in_ruleStateArgument890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleStateArgument905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStateArgument918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleStateArgument929 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStateArgument936 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStateArgument944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleStateArgument957 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStateArgument964 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStateArgument972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleStateArgument985 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStateArgument992 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStateArgument1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleStateArgument1013 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStateArgument1020 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStateArgument1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleStateArgument1041 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStateArgument1048 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStateArgument1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleStateArgument1069 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStateArgument1076 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStateArgument1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePseudo1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePseudo1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulePseudo1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePseudo1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulePseudo1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulePseudo1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleEvent1211 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEvent1218 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleVariable1265 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVariable1272 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleRegion1319 = new BitSet(new long[]{0x0004000000070030L});
    public static final BitSet FOLLOW_ruleSableCCIdentifier_in_ruleRegion1329 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleRegion1337 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleRegion1345 = new BitSet(new long[]{0x0001800200000000L});
    public static final BitSet FOLLOW_ruleRegionArgument_in_ruleRegion1356 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRegion1364 = new BitSet(new long[]{0x0001800200000000L});
    public static final BitSet FOLLOW_ruleRegionArgument_in_ruleRegion1377 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleRegion1385 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRegion1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleRegionArgument1435 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRegionArgument1442 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRegionArgument1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleRegionArgument1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionArgument1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSableCCIdentifier_in_ruleState1521 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_ruleState1530 = new BitSet(new long[]{0x000181FE00000000L});
    public static final BitSet FOLLOW_ruleStateArgument_in_ruleState1541 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1549 = new BitSet(new long[]{0x000181FE00000000L});
    public static final BitSet FOLLOW_ruleStateArgument_in_ruleState1562 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleState1570 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState1578 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSableCCIdentifier_in_ruleState1603 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_ruleCState_in_ruleState1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_ruleTransition1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonInitialTransition_in_ruleTransition1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleInitialTransition1695 = new BitSet(new long[]{0x0000000000071830L});
    public static final BitSet FOLLOW_ruleSableCCIdentifier_in_ruleInitialTransition1705 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_ruleInitialTransition1714 = new BitSet(new long[]{0x0010000600000000L});
    public static final BitSet FOLLOW_ruleTransArgument_in_ruleInitialTransition1725 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInitialTransition1733 = new BitSet(new long[]{0x0010000600000000L});
    public static final BitSet FOLLOW_ruleTransArgument_in_ruleInitialTransition1746 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleInitialTransition1754 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInitialTransition1762 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInitialTransition1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSableCCIdentifier_in_ruleNonInitialTransition1813 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleNonInitialTransition1822 = new BitSet(new long[]{0x0000000000071830L});
    public static final BitSet FOLLOW_ruleSableCCIdentifier_in_ruleNonInitialTransition1832 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_ruleNonInitialTransition1841 = new BitSet(new long[]{0x0010000600000000L});
    public static final BitSet FOLLOW_ruleTransArgument_in_ruleNonInitialTransition1852 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNonInitialTransition1860 = new BitSet(new long[]{0x0010000600000000L});
    public static final BitSet FOLLOW_ruleTransArgument_in_ruleNonInitialTransition1873 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleNonInitialTransition1881 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNonInitialTransition1889 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNonInitialTransition1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTransArgument1938 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTransArgument1945 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTransArgument1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTransArgument1966 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTransArgument1973 = new BitSet(new long[]{0xFFE0000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleTransitionType_in_ruleTransArgument1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTransArgument1996 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTransArgument2003 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTransArgument2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTransitionType2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTransitionType2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleTransitionType2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleTransitionType2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleTransitionType2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleTransitionType2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTransitionType2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTransitionType2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleTransitionType2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleTransitionType2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleTransitionType2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleTransitionType2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred441345 = new BitSet(new long[]{0x0001800200000000L});
    public static final BitSet FOLLOW_ruleRegionArgument_in_synpred441356 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred441364 = new BitSet(new long[]{0x0001800200000000L});
    public static final BitSet FOLLOW_ruleRegionArgument_in_synpred441377 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_synpred441385 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred441393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_synpred511652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSableCCIdentifier_in_synpred551813 = new BitSet(new long[]{0x0000000000000002L});

}