// $ANTLR 3.0 ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g 2009-05-28 15:54:01

package de.cau.cs.kieler.synccharts.dsl.parser;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManagerNeu;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import de.cau.cs.kieler.synccharts.dsl.MetaModelRegistration;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class scdslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'/'", "'('", "')'", "'='", "'not'", "'<'", "'<='", "'and'", "'or'", "'+'", "'-'", "'*'", "'?'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_INT=5;
    public static final int RULE_WS=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public scdslParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[31+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g"; }



    	private Token getLastToken() {
    		return input.LT(-1);
    	}

    	protected Object convert(Object arg) {
    		if (arg instanceof org.antlr.runtime.Token) {
    			Token t = (Token) arg;
    			String s = t.getText();
    			if (t.getType() == scdslLexer.RULE_ID && s.startsWith("^")) {
    				return s.substring(1);
    			} else if (t.getType()==scdslLexer.RULE_STRING) {
    				return s.substring(1,s.length()-1);
    			} else if (t.getType()==scdslLexer.RULE_INT) {
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
    			factory.addImport("synccharts", "http://www.informatik.uni-kiel.de/rtsys/synccharts");
    		
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
    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:102:1: parse returns [Node r] : result= ruleAction EOF ;
    public Node parse() throws RecognitionException {
        Node r = null;
        int parse_StartIndex = input.index();
        EObject result = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return r; }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:103:3: (result= ruleAction EOF )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:103:3: result= ruleAction EOF
            {
            pushFollow(FOLLOW_ruleAction_in_parse67);
            result=ruleAction();
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


    // $ANTLR start ruleAction
    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:113:1: ruleAction returns [EObject result] : ( (temp_Expression= ruleExpression )? ( ( '/' ) ( (temp_Emission= ruleEmission ) | (temp_Assignment= ruleAssignment ) )* )? ) ;
    public EObject ruleAction() throws RecognitionException {
        EObject result = null;
        int ruleAction_StartIndex = input.index();
        EObject temp_Expression = null;

        EObject temp_Emission = null;

        EObject temp_Assignment = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:116:4: ( ( (temp_Expression= ruleExpression )? ( ( '/' ) ( (temp_Emission= ruleEmission ) | (temp_Assignment= ruleAssignment ) )* )? ) )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:116:4: ( (temp_Expression= ruleExpression )? ( ( '/' ) ( (temp_Emission= ruleEmission ) | (temp_Assignment= ruleAssignment ) )* )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("synccharts", "Action");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:119:1: ( (temp_Expression= ruleExpression )? ( ( '/' ) ( (temp_Emission= ruleEmission ) | (temp_Assignment= ruleAssignment ) )* )? )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:119:2: (temp_Expression= ruleExpression )? ( ( '/' ) ( (temp_Emission= ruleEmission ) | (temp_Assignment= ruleAssignment ) )* )?
            {
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:119:2: (temp_Expression= ruleExpression )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:119:3: temp_Expression= ruleExpression
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)));
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAction107);
                    temp_Expression=ruleExpression();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_Expression != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_Expression);
                        factory.set(result,"trigger",convert(temp_Expression),false);
                        ptm.ruleFinished(temp_Expression);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }
                    break;

            }

            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:131:1: ( ( '/' ) ( (temp_Emission= ruleEmission ) | (temp_Assignment= ruleAssignment ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:131:2: ( '/' ) ( (temp_Emission= ruleEmission ) | (temp_Assignment= ruleAssignment ) )*
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:131:2: ( '/' )
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:131:3: '/'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,10,FOLLOW_10_in_ruleAction117); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:137:1: ( (temp_Emission= ruleEmission ) | (temp_Assignment= ruleAssignment ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            int LA2_2 = input.LA(2);

                            if ( (LA2_2==13) ) {
                                alt2=2;
                            }
                            else if ( (LA2_2==EOF||(LA2_2>=RULE_ID && LA2_2<=RULE_INT)||LA2_2==11) ) {
                                alt2=1;
                            }


                        }
                        else if ( (LA2_0==RULE_INT) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:137:2: (temp_Emission= ruleEmission )
                    	    {
                    	    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:137:2: (temp_Emission= ruleEmission )
                    	    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:137:3: temp_Emission= ruleEmission
                    	    {
                    	    if ( backtracking==0 ) {
                    	      ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                    	    }
                    	    pushFollow(FOLLOW_ruleEmission_in_ruleAction128);
                    	    temp_Emission=ruleEmission();
                    	    _fsp--;
                    	    if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      if (temp_Emission != null) {
                    	        hasContent = true;
                    	        ptm.setModelElement(temp_Emission);
                    	        factory.add(result,"emissions",convert(temp_Emission),false);
                    	        ptm.ruleFinished(temp_Emission);
                    	      } else {
                    	        ptm.destroyNode();
                    	      }

                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:149:1: (temp_Assignment= ruleAssignment )
                    	    {
                    	    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:149:1: (temp_Assignment= ruleAssignment )
                    	    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:149:2: temp_Assignment= ruleAssignment
                    	    {
                    	    if ( backtracking==0 ) {
                    	      ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                    	    }
                    	    pushFollow(FOLLOW_ruleAssignment_in_ruleAction141);
                    	    temp_Assignment=ruleAssignment();
                    	    _fsp--;
                    	    if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      if (temp_Assignment != null) {
                    	        hasContent = true;
                    	        ptm.setModelElement(temp_Assignment);
                    	        factory.add(result,"assignments",convert(temp_Assignment),false);
                    	        ptm.ruleFinished(temp_Assignment);
                    	      } else {
                    	        ptm.destroyNode();
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
            if ( backtracking>0 ) { memoize(input, 2, ruleAction_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleAction


    // $ANTLR start ruleExpression
    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:170:1: ruleExpression returns [EObject result] : (temp_signalreference= ruleSignalReference | temp_variablereference= ruleVariableReference | temp_complexexpression= ruleComplexExpression );
    public EObject ruleExpression() throws RecognitionException {
        EObject result = null;
        int ruleExpression_StartIndex = input.index();
        EObject temp_signalreference = null;

        EObject temp_variablereference = null;

        EObject temp_complexexpression = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:172:9: (temp_signalreference= ruleSignalReference | temp_variablereference= ruleVariableReference | temp_complexexpression= ruleComplexExpression )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA4_1 = input.LA(2);

                if ( (synpred5()) ) {
                    alt4=1;
                }
                else if ( (synpred6()) ) {
                    alt4=2;
                }
                else {
                    if (backtracking>0) {failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("170:1: ruleExpression returns [EObject result] : (temp_signalreference= ruleSignalReference | temp_variablereference= ruleVariableReference | temp_complexexpression= ruleComplexExpression );", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt4=2;
                }
                break;
            case 11:
                {
                alt4=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("170:1: ruleExpression returns [EObject result] : (temp_signalreference= ruleSignalReference | temp_variablereference= ruleVariableReference | temp_complexexpression= ruleComplexExpression );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:172:9: temp_signalreference= ruleSignalReference
                    {
                    pushFollow(FOLLOW_ruleSignalReference_in_ruleExpression183);
                    temp_signalreference=ruleSignalReference();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_signalreference;
                    }

                    }
                    break;
                case 2 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:172:91: temp_variablereference= ruleVariableReference
                    {
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleExpression198);
                    temp_variablereference=ruleVariableReference();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_variablereference;
                    }

                    }
                    break;
                case 3 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:172:179: temp_complexexpression= ruleComplexExpression
                    {
                    pushFollow(FOLLOW_ruleComplexExpression_in_ruleExpression213);
                    temp_complexexpression=ruleComplexExpression();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_complexexpression;
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
            if ( backtracking>0 ) { memoize(input, 3, ruleExpression_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start ruleComplexExpression
    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:174:1: ruleComplexExpression returns [EObject result] : ( ( '(' ) (temp_Expression= ruleExpression )? (temp_Operator= ruleOperator ) (temp_Expression= ruleExpression ) ( ')' ) ) ;
    public EObject ruleComplexExpression() throws RecognitionException {
        EObject result = null;
        int ruleComplexExpression_StartIndex = input.index();
        EObject temp_Expression = null;

        EObject temp_Operator = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:177:4: ( ( ( '(' ) (temp_Expression= ruleExpression )? (temp_Operator= ruleOperator ) (temp_Expression= ruleExpression ) ( ')' ) ) )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:177:4: ( ( '(' ) (temp_Expression= ruleExpression )? (temp_Operator= ruleOperator ) (temp_Expression= ruleExpression ) ( ')' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("synccharts", "ComplexExpression");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:180:1: ( ( '(' ) (temp_Expression= ruleExpression )? (temp_Operator= ruleOperator ) (temp_Expression= ruleExpression ) ( ')' ) )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:180:2: ( '(' ) (temp_Expression= ruleExpression )? (temp_Operator= ruleOperator ) (temp_Expression= ruleExpression ) ( ')' )
            {
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:180:2: ( '(' )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:180:3: '('
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,11,FOLLOW_11_in_ruleComplexExpression241); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:186:1: (temp_Expression= ruleExpression )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_INT)||LA5_0==11) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:186:2: temp_Expression= ruleExpression
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)));
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleComplexExpression251);
                    temp_Expression=ruleExpression();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_Expression != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_Expression);
                        factory.add(result,"subExpressions",convert(temp_Expression),false);
                        ptm.ruleFinished(temp_Expression);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }
                    break;

            }

            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:198:1: (temp_Operator= ruleOperator )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:198:2: temp_Operator= ruleOperator
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(2)));
            }
            pushFollow(FOLLOW_ruleOperator_in_ruleComplexExpression263);
            temp_Operator=ruleOperator();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_Operator != null) {
                hasContent = true;
                ptm.setModelElement(temp_Operator);
                factory.set(result,"operator",convert(temp_Operator),false);
                ptm.ruleFinished(temp_Operator);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:210:1: (temp_Expression= ruleExpression )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:210:2: temp_Expression= ruleExpression
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(3)));
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleComplexExpression274);
            temp_Expression=ruleExpression();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_Expression != null) {
                hasContent = true;
                ptm.setModelElement(temp_Expression);
                factory.add(result,"subExpressions",convert(temp_Expression),false);
                ptm.ruleFinished(temp_Expression);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:222:1: ( ')' )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:222:2: ')'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleComplexExpression282); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(4)));
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
            if ( backtracking>0 ) { memoize(input, 4, ruleComplexExpression_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleComplexExpression


    // $ANTLR start ruleEmission
    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:235:1: ruleEmission returns [EObject result] : ( (temp_Signal= ruleSignal ) ( ( '(' ) (temp_Expression= ruleExpression ) ( ')' ) )? ) ;
    public EObject ruleEmission() throws RecognitionException {
        EObject result = null;
        int ruleEmission_StartIndex = input.index();
        EObject temp_Signal = null;

        EObject temp_Expression = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:238:4: ( ( (temp_Signal= ruleSignal ) ( ( '(' ) (temp_Expression= ruleExpression ) ( ')' ) )? ) )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:238:4: ( (temp_Signal= ruleSignal ) ( ( '(' ) (temp_Expression= ruleExpression ) ( ')' ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("synccharts", "Emission");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:241:1: ( (temp_Signal= ruleSignal ) ( ( '(' ) (temp_Expression= ruleExpression ) ( ')' ) )? )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:241:2: (temp_Signal= ruleSignal ) ( ( '(' ) (temp_Expression= ruleExpression ) ( ')' ) )?
            {
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:241:2: (temp_Signal= ruleSignal )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:241:3: temp_Signal= ruleSignal
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(0)));
            }
            pushFollow(FOLLOW_ruleSignal_in_ruleEmission323);
            temp_Signal=ruleSignal();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_Signal != null) {
                hasContent = true;
                ptm.setModelElement(temp_Signal);
                factory.set(result,"signal",convert(temp_Signal),false);
                ptm.ruleFinished(temp_Signal);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:253:1: ( ( '(' ) (temp_Expression= ruleExpression ) ( ')' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:253:2: ( '(' ) (temp_Expression= ruleExpression ) ( ')' )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:253:2: ( '(' )
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:253:3: '('
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleEmission332); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:259:1: (temp_Expression= ruleExpression )
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:259:2: temp_Expression= ruleExpression
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEmission342);
                    temp_Expression=ruleExpression();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_Expression != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_Expression);
                        factory.set(result,"newValue",convert(temp_Expression),false);
                        ptm.ruleFinished(temp_Expression);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }

                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:271:1: ( ')' )
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:271:2: ')'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,12,FOLLOW_12_in_ruleEmission350); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
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
            if ( backtracking>0 ) { memoize(input, 5, ruleEmission_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleEmission


    // $ANTLR start ruleAssignment
    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:285:1: ruleAssignment returns [EObject result] : ( (temp_Variable= ruleVariable ) ( '=' ) (temp_Expression= ruleExpression ) ) ;
    public EObject ruleAssignment() throws RecognitionException {
        EObject result = null;
        int ruleAssignment_StartIndex = input.index();
        EObject temp_Variable = null;

        EObject temp_Expression = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:288:4: ( ( (temp_Variable= ruleVariable ) ( '=' ) (temp_Expression= ruleExpression ) ) )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:288:4: ( (temp_Variable= ruleVariable ) ( '=' ) (temp_Expression= ruleExpression ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("synccharts", "Assignment");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:291:1: ( (temp_Variable= ruleVariable ) ( '=' ) (temp_Expression= ruleExpression ) )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:291:2: (temp_Variable= ruleVariable ) ( '=' ) (temp_Expression= ruleExpression )
            {
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:291:2: (temp_Variable= ruleVariable )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:291:3: temp_Variable= ruleVariable
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(0)));
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleAssignment394);
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

            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:303:1: ( '=' )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:303:2: '='
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleAssignment402); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:309:1: (temp_Expression= ruleExpression )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:309:2: temp_Expression= ruleExpression
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(2)));
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment412);
            temp_Expression=ruleExpression();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_Expression != null) {
                hasContent = true;
                ptm.setModelElement(temp_Expression);
                factory.set(result,"expression",convert(temp_Expression),false);
                ptm.ruleFinished(temp_Expression);
              } else {
                ptm.destroyNode();
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
            if ( backtracking>0 ) { memoize(input, 6, ruleAssignment_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleAssignment


    // $ANTLR start ruleSignalReference
    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:328:1: ruleSignalReference returns [EObject result] : (temp_Signal= ruleSignal ) ;
    public EObject ruleSignalReference() throws RecognitionException {
        EObject result = null;
        int ruleSignalReference_StartIndex = input.index();
        EObject temp_Signal = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:331:4: ( (temp_Signal= ruleSignal ) )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:331:4: (temp_Signal= ruleSignal )
            {
            if ( backtracking==0 ) {

              				result = factory.create("synccharts", "SignalReference");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:334:1: (temp_Signal= ruleSignal )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:334:2: temp_Signal= ruleSignal
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleSignal_in_ruleSignalReference453);
            temp_Signal=ruleSignal();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_Signal != null) {
                hasContent = true;
                ptm.setModelElement(temp_Signal);
                factory.set(result,"signal",convert(temp_Signal),false);
                ptm.ruleFinished(temp_Signal);
              } else {
                ptm.destroyNode();
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
            if ( backtracking>0 ) { memoize(input, 7, ruleSignalReference_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleSignalReference


    // $ANTLR start ruleVariableReference
    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:352:1: ruleVariableReference returns [EObject result] : (temp_Variable= ruleVariable ) ;
    public EObject ruleVariableReference() throws RecognitionException {
        EObject result = null;
        int ruleVariableReference_StartIndex = input.index();
        EObject temp_Variable = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:355:4: ( (temp_Variable= ruleVariable ) )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:355:4: (temp_Variable= ruleVariable )
            {
            if ( backtracking==0 ) {

              				result = factory.create("synccharts", "VariableReference");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:358:1: (temp_Variable= ruleVariable )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:358:2: temp_Variable= ruleVariable
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleVariableReference492);
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
            if ( backtracking>0 ) { memoize(input, 8, ruleVariableReference_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleVariableReference


    // $ANTLR start ruleSignal
    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:376:1: ruleSignal returns [EObject result] : ( RULE_ID ) ;
    public EObject ruleSignal() throws RecognitionException {
        EObject result = null;
        int ruleSignal_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:379:4: ( ( RULE_ID ) )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:379:4: ( RULE_ID )
            {
            if ( backtracking==0 ) {

              				result = factory.create("synccharts", "Signal");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:382:1: ( RULE_ID )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:382:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal529); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
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
            if ( backtracking>0 ) { memoize(input, 9, ruleSignal_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleSignal


    // $ANTLR start ruleVariable
    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:398:1: ruleVariable returns [EObject result] : ( ( RULE_ID ) | ( RULE_INT ) ) ;
    public EObject ruleVariable() throws RecognitionException {
        EObject result = null;
        int ruleVariable_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:401:4: ( ( ( RULE_ID ) | ( RULE_INT ) ) )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:401:4: ( ( RULE_ID ) | ( RULE_INT ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("synccharts", "Variable");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:404:1: ( ( RULE_ID ) | ( RULE_INT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                alt7=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("404:1: ( ( RULE_ID ) | ( RULE_INT ) )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:404:2: ( RULE_ID )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:404:2: ( RULE_ID )
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:404:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable567); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;
                case 2 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:414:1: ( RULE_INT )
                    {
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:414:1: ( RULE_INT )
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:414:2: RULE_INT
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVariable578); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)));
                        factory.set(result,"value",convert(temp),false);
                        ptm.ruleFinished(temp);
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
            if ( backtracking>0 ) { memoize(input, 10, ruleVariable_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleVariable


    // $ANTLR start ruleOperator
    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:431:1: ruleOperator returns [EObject result] : (temp_OperatorKind= ruleOperatorKind ) ;
    public EObject ruleOperator() throws RecognitionException {
        EObject result = null;
        int ruleOperator_StartIndex = input.index();
        Enumerator temp_OperatorKind = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:434:4: ( (temp_OperatorKind= ruleOperatorKind ) )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:434:4: (temp_OperatorKind= ruleOperatorKind )
            {
            if ( backtracking==0 ) {

              				result = factory.create("synccharts", "Operator");
              			 
            }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:437:1: (temp_OperatorKind= ruleOperatorKind )
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:437:2: temp_OperatorKind= ruleOperatorKind
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleOperatorKind_in_ruleOperator619);
            temp_OperatorKind=ruleOperatorKind();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_OperatorKind != null) {
                hasContent = true;
                factory.set(result,"operatorKind",convert(temp_OperatorKind),false);
                ptm.ruleFinished(temp_OperatorKind);
              } else {
                ptm.destroyNode();
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
            if ( backtracking>0 ) { memoize(input, 11, ruleOperator_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleOperator


    // $ANTLR start ruleOperatorKind
    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:454:1: ruleOperatorKind returns [Enumerator r] : ( 'not' | '=' | '<' | '<=' | 'and' | 'or' | '+' | '-' | '*' | '/' | '?' );
    public Enumerator ruleOperatorKind() throws RecognitionException {
        Enumerator r = null;
        int ruleOperatorKind_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return r; }
            // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:455:4: ( 'not' | '=' | '<' | '<=' | 'and' | 'or' | '+' | '-' | '*' | '/' | '?' )
            int alt8=11;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 13:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            case 16:
                {
                alt8=4;
                }
                break;
            case 17:
                {
                alt8=5;
                }
                break;
            case 18:
                {
                alt8=6;
                }
                break;
            case 19:
                {
                alt8=7;
                }
                break;
            case 20:
                {
                alt8=8;
                }
                break;
            case 21:
                {
                alt8=9;
                }
                break;
            case 10:
                {
                alt8=10;
                }
                break;
            case 22:
                {
                alt8=11;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("454:1: ruleOperatorKind returns [Enumerator r] : ( 'not' | '=' | '<' | '<=' | 'and' | 'or' | '+' | '-' | '*' | '/' | '?' );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:455:4: 'not'
                    {
                    match(input,14,FOLLOW_14_in_ruleOperatorKind646); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)));
                      r =factory.enumLit("synccharts", "OperatorKind","NOT");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 2 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:461:7: '='
                    {
                    match(input,13,FOLLOW_13_in_ruleOperatorKind659); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(2)));
                      r =factory.enumLit("synccharts", "OperatorKind","EQ");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 3 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:467:7: '<'
                    {
                    match(input,15,FOLLOW_15_in_ruleOperatorKind672); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(3)));
                      r =factory.enumLit("synccharts", "OperatorKind","LT");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 4 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:473:7: '<='
                    {
                    match(input,16,FOLLOW_16_in_ruleOperatorKind685); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(4)));
                      r =factory.enumLit("synccharts", "OperatorKind","LEQ");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 5 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:479:7: 'and'
                    {
                    match(input,17,FOLLOW_17_in_ruleOperatorKind698); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(5)));
                      r =factory.enumLit("synccharts", "OperatorKind","AND");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 6 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:485:7: 'or'
                    {
                    match(input,18,FOLLOW_18_in_ruleOperatorKind711); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(6)));
                      r =factory.enumLit("synccharts", "OperatorKind","OR");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 7 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:491:7: '+'
                    {
                    match(input,19,FOLLOW_19_in_ruleOperatorKind724); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(7)));
                      r =factory.enumLit("synccharts", "OperatorKind","ADD");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 8 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:497:7: '-'
                    {
                    match(input,20,FOLLOW_20_in_ruleOperatorKind737); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(8)));
                      r =factory.enumLit("synccharts", "OperatorKind","SUB");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 9 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:503:7: '*'
                    {
                    match(input,21,FOLLOW_21_in_ruleOperatorKind750); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(9)));
                      r =factory.enumLit("synccharts", "OperatorKind","MULT");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 10 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:509:7: '/'
                    {
                    match(input,10,FOLLOW_10_in_ruleOperatorKind763); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(10)));
                      r =factory.enumLit("synccharts", "OperatorKind","DIV");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 11 :
                    // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:515:7: '?'
                    {
                    match(input,22,FOLLOW_22_in_ruleOperatorKind776); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(11)));
                      r =factory.enumLit("synccharts", "OperatorKind","VAL");
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
            if ( backtracking>0 ) { memoize(input, 12, ruleOperatorKind_StartIndex); }
        }
        return r;
    }
    // $ANTLR end ruleOperatorKind

    // $ANTLR start synpred5
    public void synpred5_fragment() throws RecognitionException {   
        // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:172:9: ( ruleSignalReference )
        // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:172:9: ruleSignalReference
        {
        pushFollow(FOLLOW_ruleSignalReference_in_synpred5183);
        ruleSignalReference();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public void synpred6_fragment() throws RecognitionException {   
        // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:172:91: ( ruleVariableReference )
        // ..//de.cau.cs.kieler.synccharts.dsl/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/scdsl.g:172:91: ruleVariableReference
        {
        pushFollow(FOLLOW_ruleVariableReference_in_synpred6198);
        ruleVariableReference();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred6

    public final boolean synpred5() {
        backtracking++;
        int start = input.mark();
        try {
            synpred5_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred6() {
        backtracking++;
        int start = input.mark();
        try {
            synpred6_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleAction_in_parse67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAction107 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_ruleAction117 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleEmission_in_ruleAction128 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleAction141 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleExpression183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleExpression198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_ruleExpression213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleComplexExpression241 = new BitSet(new long[]{0x00000000007FEC30L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleComplexExpression251 = new BitSet(new long[]{0x00000000007FE400L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleComplexExpression263 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleComplexExpression274 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleComplexExpression282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleEmission323 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleEmission332 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEmission342 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEmission350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAssignment394 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssignment402 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignalReference453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleVariableReference492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVariable578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorKind_in_ruleOperator619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOperatorKind646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleOperatorKind659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOperatorKind672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOperatorKind685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOperatorKind698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOperatorKind711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOperatorKind724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOperatorKind737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOperatorKind750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleOperatorKind763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOperatorKind776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_synpred5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_synpred6198 = new BitSet(new long[]{0x0000000000000002L});

}