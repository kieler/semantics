grammar scade;

@lexer::header {
  package parser;
}

@header {
            
  package parser;
  import java.util.LinkedList;
  
  import ceq.*;
  import ceq.Variable.Kind;
  import ceq.Expression;
  import prog.Type;
  import lustre.Operator;
//  import lustre.Scade;
  
  import java.util.HashMap;
}

@members {
  Scade main;
  

 // LinkedList<Variable> inputs = new LinkedList<Variable>();

 
  private LinkedList<Variable> toVar(LinkedList<String> vars, Kind io, Type t){
      LinkedList<Variable> res = new LinkedList<Variable>();
      for(String v: vars){
          res.add(Variable.get(v, io, t));
      }
      return res;
  }

  public void setProg(Scade main){
    this.main=main;
  }
}
//////////////////////////////////////////////////////////////
program : user_op_decl; //decls* ;

//////////////////////////////////////////////////////////////
path : ID ('::' ID)* ;
path_id : (path '::')? ID;

//////////////////////////////////////////////////////////////
// TYPES
//////////////////////////////////////////////////////////////
type_expr returns [Type type] 
    : 'bool'  { $type=Type.BOOL; }
   	| 'int'   { $type=Type.INT; }
    ;  	      

//////////////////////////////////////////////////////////////
// User Define Operator
//////////////////////////////////////////////////////////////
var_decls returns [LinkedList<String> vars, Type type]
    : {$vars = new LinkedList<String>();}
        v=var_id { $vars.add($v.id); } 
        (',' v=var_id { $vars.add($v.id); })* 
        ':' t=type_expr {$type=$t.type;} when_decl? default_decl? last_decl? 
    ;


var_id returns [String id]     
    : '\''? n=ID {$id = $n.text;}
    ;

when_decl : 'when' clock_expr;
default_decl : 'default' '=' expr;
last_decl    : 'last' '=' expr
    ;
//////////////////////////////////////////////////////////////

user_op_decl 
    : 'node' id=ID { main.setName($id.text); } 
        in=params[Kind.INPUT] {main.add($in.vars); } 
        'returns' out=params[Kind.OUTPUT] {main.add($out.vars); }  
        opt_body[main]
    ;
//op_kind : 'function' | 'node';
//size_decl : '<<' (ID (',' ID)* )? '>>' ;
params [Kind io] returns [LinkedList<Variable> vars]   
    : { $vars=new LinkedList<Variable>(); }
        '(' (v=var_decls {$vars.addAll(toVar($v.vars, $io, $v.type));}
            (';' v=var_decls {$vars.addAll(toVar($v.vars, $io, $v.type));} )* )? ')'
    ;
//where_decl : 'where' typevar (',' typevar)* 'numeric';
//spec_decl  : 'where' typevar (',' typevar)* 'numeric'
//           | 'specialize' path_id
//           ;

opt_body[Scope scope] : ';'
		 | equation[scope] ';'
		 | (s=signal_block {$scope.add($s.sigs);} )? 
            (l=local_block {$scope.add($l.vars); } )? 
           'let' (equation[scope] ';')* 'tel' ';'? 
		 ;
		 
data_def [Scope scope]
    : equation[scope] ';'
    | sscope[scope] 
    ;

//////////////////////////////////////////////////////////////
sscope[Scope scope]        
    : (s=signal_block { $scope.add($s.sigs);})?  
        (l=local_block {$scope.add($l.vars);} )? 
        eqs[scope]?
    ;
signal_block returns [LinkedList<Variable> sigs] 
    : { $sigs = new LinkedList<Variable>(); }
        'sig' id=ID { $sigs.add(new Variable($id.text, Kind.LOCAL, Type.BOOL));}
        (',' id=ID { $sigs.add(new Variable($id.text, Kind.LOCAL, Type.BOOL)); }  )* ';'
    ;

local_block returns [LinkedList<Variable> vars]
    : {$vars=new LinkedList<Variable>();}
        'var' ( v=var_decls {$vars.addAll(toVar($v.vars, Kind.LOCAL, $v.type));} ';')*
    ;

eqs[Scope scope]
    : 'let' (equation[scope] ';')* 'tel';
//////////////////////////////////////////////////////////////
equation [Scope scope]
    : eq = simple_equation { $scope.add($eq.eq); }
    | em=emission  { $scope.addEq($em.eqs); }
    | a=state_machine {scope.add(a);} 'returns' '..'
    ;

simple_equation returns [Equation eq] 
    : id=lhs '=' e=expr {$eq = new Equation($id.text, $e.expr); }
    ; 

lhs             
    : '(' ')' 
    | lhs_id (',' lhs_id)*
    ;

lhs_id : ID | '_' ;
emission returns [LinkedList<Equation>  eqs]
    : {$eqs = new LinkedList<Equation>(); }
        'emit' e=emission_body
        {
          for(String s:$e.ids){
          $eqs.add(new Equation(s, $e.expr==null?new Const("True",1):$e.expr));
                         
          } ;}
    ;
emission_body returns [LinkedList<String> ids, Expression expr]
    
    : {$ids=new LinkedList<String>(); } 
        '\''id=ID {$ids.add($id.text);} 
        ( 'if' e=expr {$expr=$e.expr;})?
    | { $ids=new LinkedList<String>(); }
        '(' '\'' id=ID {$ids.add($id.text);} 
        (',' '\'' id=ID {$ids.add($id.text);}) ')' 
        ('if' e=expr {$expr=$e.expr;})?;
//////////////////////////////////////////////////////////////
state_machine returns [Automaton a]
    : 'automaton' id=ID {$a= new Automaton($id.text);} state_decl[a]+
    ;

state_decl[Automaton a]    
    : init='initial'? 'final'? 'state' id=ID 
        {State s = new State($id.text, $init!=null);} 
        ('unless' (t=transition[s] {s.addSAbort($t.trans);} ';')+)?
        data_def[s]
        ('until' (t=transition[s] {s.addWAbort($t.trans);} ';')* 
            ('synchro' actions[s]? fork[s] ';')?)?
        { $a.add(s); }
    ;
transition[Scope scope] returns [Transition trans]
    : 'if' trigger=expr t=arrow[scope] {$trans=new Transition($trigger.expr, $t.target); };

arrow[Scope scope] returns [String target]
    :  actions[scope]? s=fork[scope] {$target=$s.target; };

fork[Scope scope] returns [String target]
    : t=target {$target=$t.t;}
    | 'if' expr arrow[scope] elsif_fork[scope]*  else_fork[scope]? 'end';

elsif_fork[Scope scope]
    : 'elsif' expr arrow[scope];
else_fork[Scope scope]
    : 'else' arrow[scope];

target returns [String t]
    : 'restart' id=ID {$t=$id.text; }
    | 'resume' id=ID {$t=$id.text; }
    ;

actions[Scope scope]
    : 'do' '{' 'emit'? emission_body (';' 'emit'? emission_body)* '}'
    | 'do' data_def[scope]
    ;

clock_expr    
    : ID | 'not' ID 
    ;//| '(' ID 'match' pattern ')';

expr returns [Expression expr]
    :  a = atom    { $expr= $a.expr; } 
            (op=bin_op b=atom 
            {$expr=new BinOp($expr.toString(), $expr, $b.expr, $op.op);})?
//              | tempo_expr
//    | op= bin_expr { $expr= $op.expr; }
//    | relation_expr
//    | bool_expr
    ;

atom returns [Expression expr]         
    : a=bool_atom { $expr= $a.expr; }
    | n=num { $expr= new Const("NUMBER", $n.val); }
    | id=id_expr  { $expr= $id.expr; }
    ;

num returns [int val] : n=NUMBER  { $val=Integer.parseInt($n.text); };

bool_atom returns [Expression expr] 
    : 'true'     { $expr= new Const("TRUE", true); }
    | 'false'    { $expr= new Const("False", false); }
    ;

id_expr returns [Expression expr]  
    :  v=var { $expr = new VarAccess($v.var, false); }
    | 'last' v=var  { $expr= new VarAccess($v.var, true); }
    ; 

var returns [Variable var]
    : '\''? id = ID { $var = Variable.get($id.text); }
    ;
//////////////////////////////////////////////////////////////
//bin_expr returns [Expression expr] 
//     : unary_arith_op expr
//    : a=ID op=bin_op b=ID 
//        { $expr= new Const("HUHU", 7); }// BinOp("BinOp", 
//                            new VarAccess($a.text, $a.text, 
//           | '(' expr bin_arith_op expr ')'
//           ;



bin_op returns [Operator op]
    : '+' { $op=Operator.ADD; }
    | '-' { $op=Operator.SUB; }
    | '*' { $op=Operator.MUL; }
    | '/' { $op=Operator.DIV; }
    | 'mod' 
    | 'div' { $op=Operator.DIV; }
    | '='   { $op=Operator.EQ; }
    | '<>' { $op=Operator.NEQ; }
    | '<' { $op=Operator.LT; }
    | '>' { $op=Operator.GT; }
    | '<=' { $op=Operator.LE; }
    | '>=' { $op=Operator.GE; }
    |  'and'{ $op=Operator.AND; } 
    | 'or' { $op=Operator.OR; }
    | 'xor'{ $op=Operator.XOR; };
unary_arith_op : '-' | '+' | 'int' | 'real';
//bin_arith_op   : '+' | '-' | '*' | '/' | 'mod' | 'div';
//relation_expr  : '(' expr bin_relation_op expr ')'; 
//bin_relation_op : '=' | '<>' | '<' | '>' | '<=' | '>=';
//bool_expr       : 'not' expr
//                | '(' expr bin_bool_op expr ')'
//                | '#' '(' list ')'
 //               ;
//bin_bool_op : 'and' | 'or' | 'xor';
//////////////////////////////////////////////////////////////
mixed_constructor : '(' expr 'with' label_or_index+ '=' expr ')';
label_expr : ID ':' expr;
index : '[' expr ']';
label_or_index : '.' ID
               | index
               ;

/*------------------------------------------------------------------
* LEXER RULES
*------------------------------------------------------------------*/

ID	: (Letter | '_' ) (Letter | Digit | '_')*;

NUMBER	: ('+'|'-')?(Digit)+ ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C')+ 	{ $channel = HIDDEN; } ;

COMMENT : '/*' (options {greedy=false;}: .)* '*/' {$channel=HIDDEN;};

fragment Digit	: '0'..'9' ;

fragment Letter 
	:	'a'..'z'|'A'..'Z';
