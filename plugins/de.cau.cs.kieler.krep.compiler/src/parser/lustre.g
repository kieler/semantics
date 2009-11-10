grammar lustre;

@lexer::header {
  package parser;
}

@header {
  package parser;
  import java.util.LinkedList;
  
  import prog.Type;
  import lustre.*;
  import lustre.Number;
  import lustre.Lustre;
  import java.util.HashMap;
  import krp.statement.Operator;
}

@members {
  Lustre l;
  Expression e;
  
  //HashMap<String, Type> types = new HashMap<String, Type>();
  //HashMap<String, String> clocks = new HashMap<String, String>();
  
   
  public void setProg(Lustre l){
    //types.put("false", Type.BOOL);
    //types.put("true", Type.BOOL);
    this.l=l;
  }

  //private Variable getVar(String name){
  //  return new Variable(name, types.get(name), clocks.get(name));
  //}

}

prog : decl+ ;

decl 
  : constDecl {}
  | typeDecl {}
  | nodeDecl {}
  ;

typedID returns [Variable var] 
  : n=ID ':' t=type            {return new Variable($n.text, $t.type);};

// constants
constDecl
  :	'const' constDeclList ';' {}
  |	'const' constDeclList '.' {}
  ;

constDeclList 
  : constOneDecl (';' constOneDecl)* {};

constOneDecl 
  : ID ':' type {}; 

// types
typeDecl
  : 'type' typeDeclList ';' {}
  |	'type' typeDeclList '.' {}
  ;
         
typeDeclList
  :	typeOneDecl (',' typeOneDecl)* {};

typeOneDecl 
  : ID {};

type returns [Type type]
  : t=predefinedType  { $type=$t.t; }
  | ID                { $type=Type.INT; }
  ;

typeList
  :	type (',' type)* {};

predefinedType returns [Type t]
  : 'bool' {$t=Type.BOOL;}
  | 'int'  {$t=Type.INT;}
  | 'real' {$t=Type.REAL;}
  ;

// nodes
nodeDecl 
  : 'node' ID '(' 
      in=varDeclList        { l.setInputs($in.vars); } 
    ')' 'returns' '(' 
      out=varDeclList       { l.setOutputs($out.vars); }
    ')' ';'
    loc=locals              { l.setLocals($loc.vars); } 
    nodeBody 
  ;         

varDeclList returns [LinkedList<Variable> vars]
	: {LinkedList<Variable> res = new LinkedList<Variable>();}
	  vs=varDecl                            {res.add($vs.var);}  
	  (';' vs=varDecl {res.add($vs.var);})*	{$vars=res;};
            
varDecl returns [Variable  var]
  : v=typedID                             { $var= $v.var; }
  | v=typedID 'when' c=ID                 { $v.var.setClock($c.text); $var= $v.var; }
  | '(' vs=typedID ')' 'when' c=ID        { $vs.var.setClock($c.text); $var= $vs.var; } 
  ;
        
locals returns [LinkedList<Variable>  vars]
  : /* empty */                     { $vars= new LinkedList<Variable>(); }
  | 'var' (res= varDeclList)? ';'   { $vars= $res.vars; }
  ;
        
nodeBody 
  : 'let' equationList 'tel' (';' | '.')? {};

// equations 
equationList 
  : equation* {};

equation 
  : 'assert' expression["assert"] ';' {}
  | n=ID '=' e=expression[$n.text] ';' {l.addEq($n.text, $e.expr);}
  ;


// expressions
expression[String name] returns [Expression expr]
  : c = constant[name]                               {$expr = $c.val;} // new Number(name, Integer.parseInt($NUMBER.text));}
  | v=ID                                             {$expr = new VarAccess($v.text);}
  | 'not' e=expression[name]                         {$expr= new Not(name, $e.expr);}
  | 'pre' e=expression[name]                         {$expr = new Pre(name, $e.expr); }
  | 'current' e=expression[name]                     {$expr = new Current(name, $e.expr);}
  | '(' 'if' e1=expression[name] 
        'then' e2=expression[name] 
        'else' e3=expression[name] ')'  
                                                       {$expr = new If(name, $e1.expr, $e2.expr, $e3.expr); }
  | '(' e1=expression[name]                            {expr=$e1.expr;} 
        (e=rbinop[name,$expr] {$expr=$e.expr;})? ')' 
  ;	

rbinop [String name, Expression e1] returns [Expression expr]
  : '->' e2=expression[name]       {$expr=new Init(name, e1, $e2.expr);}
  | 'when' v=ID                    {$expr=new When(name, e1, new VarAccess($v.text));}  
  | op=binop e2=expression[name]   {$expr=new BinOp(name, e1, $e2.expr, $op.op);}
  ;

binop returns [Operator op] 	
  :   'xor'  {$op=Operator.XOR;}
  |	'=>'   {$op=Operator.IMPL;}
  |	'or'   {$op=Operator.OR;}
  | 	'and'  {$op=Operator.AND;}
  |	'='    {$op=Operator.EQ;}
  |	'<>'   {$op=Operator.NEQ;}
  |	'<'    {$op=Operator.LT;}
  |	'<='   {$op=Operator.LE;}
  |	'>='   {$op=Operator.GE;}
  |	'>'    {$op=Operator.GT;}
  |	'*'    {$op=Operator.MUL;}
  |	'/'    {$op=Operator.DIV;}
  |	'mod'  {$op=Operator.MOD;}
  |	'div'  {$op=Operator.DIV;}
  |	'+'    {$op=Operator.ADD;}
  |	'-'    {$op=Operator.SUB;}
  ;
           
constant[String name] returns [Number val]
  : 'true'  { $val = new Number(name, true); }
  | 'false' { $val = new Number(name, false); }
  | n=NUMBER { $val = new Number(name, Integer.parseInt($NUMBER.text));}
  ;
  
/*------------------------------------------------------------------
* LEXER RULES
*------------------------------------------------------------------*/

ID	: (Letter | '_') (Letter | Digit | '_')*;

NUMBER	: ('+'|'-')?(Digit)+ ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C')+ 	{ $channel = HIDDEN; } ;

COMMENT : 'assert' (options {greedy=false;}: .)* '\n' {$channel=HIDDEN;};

fragment Digit	: '0'..'9' ;

fragment Letter 
	:	'a'..'z'|'A'..'Z';
 
