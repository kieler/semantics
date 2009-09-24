grammar klp;

@lexer::header {
  package krep.evalbench.program.klp.parser;
}

@header {
  package krep.evalbench.program.klp.parser;
  import java.util.LinkedList;
  
  import krep.evalbench.program.Instruction;
  import krep.evalbench.program.klp.*;
}

@members {
  LinkedList<Instruction> instructions = new LinkedList<Instruction>();
  LinkedList<String> labels = new LinkedList<String>();
  
  private String errorMsg = new String();
  private boolean error = false;
  
  public void emitErrorMessage(String msg) {
    errorMsg += msg + "\n";
    error = true;
  }
  
  public String getErrorMsg(){
    return errorMsg;
  }
  
  public boolean getError(){
    return error;
  }
}

prog returns [LinkedList<Instruction> res]  
  :{error = false;} 
   (
     (i=instr 
      {$i.instr.setLabels(labels); labels.clear(); instructions.add($i.instr);})
     | (l=ID ':' {labels.add($l.text);})
   )+ 
   {res =  instructions;};

instr returns  [Instruction instr]
      : i=decl reg=ID 
        { instr = new Decl($i.io, $reg.text); }
      | 'SETCLK' reg=ID clk=ID 
        { instr = new SetClk($reg.text, $clk.text); }
      | 'SETPC' reg=ID l=ID 
        { instr = new SetPC($reg.text, $l.text); }        
      | 'PRIO' pc=ID? prio=num
        { instr = new Prio($pc.text, $prio.v); }               
      | 'DONE' pc=ID? 
        { instr = new Done($pc.text); }                 
      | op=binop  to=ID r1=read r2=read  
        { instr = new BinOp($to.text,$r1.r, $r2.r, $op.op); } 
      | op=ibinop to=ID r=read v=num
        { instr = new IBinOp($to.text,$r.r, $v.v, $op.op); }      
      | 'JMP' to=ID
        { instr = new Jmp($to.text); }
      | cond=cjump r=read to=ID
        { instr = new CJmp($cond.c, $r.r, $to.text); }
      | type=mov  to=ID r=read
        { instr = new Mov($type.t, $to.text, $r.r); }
      | itype=imov to=ID val=num
        { instr = new IMov($itype.t, $to.text, $val.v); }
//    |  l=ID ':' 
//        { instr = Label.get($l.text); }  
      ;

decl returns [Decl.Kind io]
      : 'INPUT'   { io = Decl.Kind.INPUT; }
      | 'OUTPUT'  { io = Decl.Kind.OUTPUT;  }   
      | 'LOCAL'   { io = Decl.Kind.LOCAL;  } 
      ;
      
init 
      : 'INITV' {}
      | 'INITC' {}
      ;
     
binop returns [OP op]
      : 'ADD' { op = OP.ADD; }
      | 'SUB' { op = OP.SUB; }
      | 'MUL' { op = OP.MUL; }
      | 'DIV' { op = OP.DIV; }
      | 'AND' { op = OP.AND; }
      | 'OR'  { op = OP.OR;  }
      | 'XOR' { op = OP.XOR; }    
      | 'LT'  { op = OP.LT; }
      | 'LE'  { op = OP.LE; }
      | 'EQ'  { op = OP.EQ; }
      | 'GE'  { op = OP.GE; }
      | 'GT'  { op = OP.GT; }
      | 'NEQ' { op = OP.NEQ; } 
      ;
      
ibinop returns [OP op]
      : 'IADD' { op = OP.ADD; }
      | 'ISUB' { op = OP.SUB; }
      | 'IMUL' { op = OP.MUL; }
      | 'IDIV' { op = OP.DIV; }
      | 'IAND' { op = OP.AND; }
      | 'IOR'  { op = OP.OR;  }
      | 'IXOR' { op = OP.XOR; }      
      | 'ILT'  { op = OP.LT; }
      | 'ILE'  { op = OP.LE; }
      | 'IEQ'  { op = OP.EQ; }
      | 'IGE'  { op = OP.GE; }
      | 'IGT'  { op = OP.GT; }
      | 'INEQ' { op = OP.NEQ; } 
      ;
           
 cjump returns [CJmp.Cond c]
       : 'JT'  { c = CJmp.Cond.T; }
       | 'JF'  { c = CJmp.Cond.F; }
       | 'JZ'  { c = CJmp.Cond.Z; } 
       | 'JNZ' { c = CJmp.Cond.NZ; }
       ;       
 
 mov  returns [Mov.Type t]
      : 'CVMOV'    { t = Mov.Type.CV; }
      | 'VCMOV'   { t = Mov.Type.VC; }
      | 'VVMOV'  { t = Mov.Type.VV; }
      | 'CCMOV'  { t = Mov.Type.CC; }
      ;
      
 imov returns [IMov.Type t]
      : 'IVMOV' { t = IMov.Type.IV; }
      | 'ICMOV' { t = IMov.Type.IC; }
      ;
      
 num returns [Integer v] 
      : n=NUMBER { v=Integer.parseInt($n.text); }
      ;
      
 read returns [Read r]
      : 'pre' '(' v=ID ')' { r = new Read($v.text, true); }
      | v=ID { r = new Read($v.text, false); } 
      ;
 
/*------------------------------------------------------------------
* LEXER RULES
*------------------------------------------------------------------*/

ID	: (Letter | '_') (Letter | Digit | '_')*;

NUMBER	: ('+'|'-')?(Digit)+ ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C')+ 	{ $channel = HIDDEN; } ;

COMMENT : '#' (options {greedy=false;}: .)* '\n' {$channel=HIDDEN;};

fragment Digit	: '0'..'9' ;

fragment Letter 
	:	'a'..'z'|'A'..'Z';
 
