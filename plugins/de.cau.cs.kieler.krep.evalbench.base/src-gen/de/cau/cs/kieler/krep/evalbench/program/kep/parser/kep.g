grammar kep;

@lexer::header {
  package krep.evalbench.program.kep.parser;
}

@header {
  package krep.evalbench.program.kep.parser;
  import java.util.LinkedList;
  import java.util.HashMap;
  
  import krep.evalbench.program.kep.Instruction;  
  import krep.evalbench.program.kep.*;
  import krep.evalbench.comm.Signal;
  import krep.evalbench.program.kep.Constants.*;
  import krep.evalbench.program.kep.KepSignal;
}

@members {
  LinkedList<Instruction> instructions = new LinkedList<Instruction>();
  
  LinkedList<Signal> inputs = new LinkedList<Signal>();
  LinkedList<Signal> outputs = new LinkedList<Signal>();
  LinkedList<Signal> locals = new LinkedList<Signal>();
  
  int signalIndex=1; //0=ticklen; 
  
  LinkedList<String> labels = new LinkedList<String>();
  
  private String errorMsg = new String();
  private boolean error = false;
  
  private HashMap<String, Integer> signalID= new HashMap<String, Integer>();

  private void addSignal(Scope scope, boolean valued, String name){
    Signal s = new Signal(name, false, valued?0:null, signalIndex);
    if(scope == Scope.INPUT){
      inputs.add(s);
    }else if (scope == Scope.OUTPUT){
      outputs.add(s);
    }else{
      locals.add(s);
    }
    if(signalID.get(name)==null){
      signalID.put(name, signalIndex);
    }
    signalIndex++;
  }
  
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
  
  public LinkedList<Signal> getInputs(){
    return inputs;
  }
  
  public LinkedList<Signal> getOutputs(){
    return outputs;
  }
  
  public LinkedList<Signal> getLocals(){
    return locals;
  }
  
  public LinkedList<Instruction> getInstructions(){
    return instructions;
  }
  
  private void unsupported(String keyword){
    System.err.println(keyword + " not supported");
  }
  
  private enum Scope{
    INPUT, OUTPUT, LOCAL;
  }
}


program  :  io_expr*    
            'EMIT' '_TICKLEN' ','  '#' d=num 
            {instructions.add(new Emit(new KepSignal("_TICKLEN", null, 0, 1+$d.v), null));}   
            kst*
      ;

kst :  i=kasm_st { if($i.instr!=null){
                    $i.instr.setLabels(labels);
                    labels.clear(); 
                    instructions.add($i.instr);
                   }else{
                     System.err.println("unknown expression");
                   };
                 }
    |  l=ID ':' {labels.add($l.text);}
    ;
      
io_expr  : 'INPUT'   sig_list[Scope.INPUT, false]
         | 'OUTPUT'  sig_list[Scope.OUTPUT, false]
         | 'INPUTV'  sig_list[Scope.INPUT, true]
         | 'OUTPUTV' sig_list[Scope.OUTPUT,true]
         | 'SIGNAL'  sig_list[Scope.LOCAL, false]
         | 'SIGNALV' sig_list[Scope.LOCAL,true]
         | 'VAR' var_list { unsupported("var"); }
         ;
         
sig_list[Scope scope, boolean valued] 
        :  id0=signal_id {addSignal(scope, valued,  $id0.text);} 
           (',' id1=signal_id {addSignal(scope, valued, $id1.text);} )*
         ;

var_list :  variable  (',' variable)*
         ;

kasm_st returns [Instruction instr]
        : 'NOTHING'         {instr = new Nothing(null); }
        | 'GOTO' a=addr       {instr = new Goto($a.label, null);} 
        | 'CALL' addr       {instr = null;}
        | 'RETURN'          {instr = null;}

        | 'PRESENT' s=signal ',' a2=addr 
                            {instr = new Present($s.signal, $a2.label, null); }

        | 'AWAIT' s1=signal    {instr = new Await($s1.signal, null); }
        | 'PAUSE'              {instr = new Pause(null); }
        | 'AWAITI' s2=signal   {instr = new Awaiti($s2.signal, null); }
        | 'HALT'               {instr = new Halt(null); }

        | 'CAWAITS'                      {instr = null;}
        | 'CAWAIT'  signal   ','    addr {instr = null;}
        | 'CAWAITI' signal   ','    addr {instr = null;}
        | 'CAWAITE' addr                 {instr = null;}

        | 'ABORT'   s3=signal ',' a3=addr 
          {instr = new Abort($s3.signal, $a3.label, null, null); }
        | 'ABORTI'  s4=signal ',' a4=addr  
           {instr = new Aborti($s4.signal, $a4.label, null, null); }
        | 'WABORT'  s5=signal ',' a5=addr 
           {instr = new WAbort($s5.signal, $a5.label, null, null); }
        | 'WABORTI' s6=signal ',' a6=addr  
           {instr = new WAborti($s6.signal, $a6.label, null, null); }        

        | 'SUSPEND'  s7=signal ',' a7=addr  
           {instr = new Suspend($s7.signal, $a7.label, null, null); }
        | 'SUSPENDI' s8=signal ',' a8=addr  
           {instr = new Suspendi($s8.signal, $a8.label, null, null); }

        | 'SIGNAL'   s9=signal    
          {addSignal(Scope.LOCAL, false, $s9.signal.getName());
           $s9.signal.setId(signalID.get($s9.signal.getName()));   
           instr = new SignalIn($s9.signal, null); }
        | 'SIGNALV'  s10=signal   
          {addSignal(Scope.LOCAL, false, $s10.signal.getName());
           $s10.signal.setId(signalID.get($s10.signal.getName()));  
           instr = new SignalIn($s10.signal, null); }
        | 'EMIT'    sexpr=sig_expr  {instr = new Emit($sexpr.sig, null); }
        | 'SETV'    sig_expr        {instr = null;}
        | 'SUSTAIN' sexpr=sig_expr  {instr = new Sustain($sexpr.sig, null); }
        
        | 'PAR'  p0=num ',' l0=addr ',' t0=num 
           {$instr = new Par($l0.label, new ThreadID($t0.v, $p0.v), null);}
        | 'PARE' l1=addr ','  p1=num  
          {$instr = new Pare($l1.label, new PrioID($p1.v), null); }
        | 'PRIO' p2=num ',' t2=num    
          {$instr =new Prio(new ThreadID($t2.v, $p2.v), null); }
        | 'PRIO' p3=num               
          {$instr =new Prio(new ThreadID(0, $p3.v), null); }
        | 'JOIN' p4=num               
           {$instr =new Join(new PrioID($p4.v), null); }

        | 'LABORT'   signal ',' addr 
        | 'LABORTI'  signal ',' addr 
        | 'LWABORT'  signal ',' addr 
        | 'LWABORTI' signal ',' addr 

        | 'TABORT'   signal ',' addr 
        | 'TABORTI'  signal ',' addr 
        | 'TWABORT'  signal ',' addr 
        | 'TWABORTI' signal ',' addr 

       // | 'JW'       cond_expr {instr = null;}
        | 'JC'       addr {instr = null;}
        | 'JNC'      addr {instr = null;}
        | 'CLRC' {instr = null;}
        | 'SETC' {instr = null;}
        | 'SR'       reg {instr = null;}
        | 'SRC'      reg {instr = null;}
        | 'SL'       reg {instr = null;}
        | 'SLC'      reg {instr = null;}
        | 'NOTR'     reg {instr = null;}
        | 'LOAD'     r=reg_expr 
          {instr = new Load_Data($r.reg, new Data($r.data), null);}
        | 'ADD'      reg_expr {instr = null;}
        | 'ADDC'     reg_expr {instr = null;}
        | 'SUB'      reg_expr {instr = null;}
        | 'SUBC'     reg_expr {instr = null;}
        | 'MUL'      reg_expr {instr = null;}
        | 'ANDR'     reg_expr {instr = null;}
        | 'ORR'      reg_expr {instr = null;}
        | 'XORR'     reg_expr {instr = null;}
        | 'CMP'      reg_expr {instr = null;}
        | 'CMPS'     reg_expr {instr = null;}
        | 'DEF32'    '#' data {instr = null;}
        | 'EXIT'     a=addr   ','      addr {instr = new Goto($a.label, null);}
        ;

sig_expr returns [KepSignal sig]
         : s=ID                {$sig = new KepSignal($s.text, null, signalID.get($s.text));}
         | s=ID ',' '#' v=num  {$sig = new KepSignal($s.text, null, signalID.get($s.text), $v.v);}
         | s=ID ',' r=reg      {$sig = new KepSignal($s.text, null, signalID.get($s.text), $r.reg);}
         ;

//cond_expr: 'Z' ',' addr
         //| 'L' ',' addr
         //| 'G'        ','    addr
         //| 'GE'       ','    addr
         //| 'LE'       ','    addr
         //| 'EE'       ','    addr
         //| 'NE'       ','    addr
         //;

signal returns [KepSignal signal]
      : i0=ID               {$signal = new KepSignal($i0.text, null,signalID.get($i0.text), false);}
      | 'PRE' '(' i1=ID ')' {$signal = new KepSignal($i0.text, null,signalID.get($i1.text), true);}
      ;

reg_expr returns [Register reg, Integer data] 
      : r=reg ',' '#' d=num  {$reg=new Register($r.text,0); $data=$d.v;}
      | reg ',' reg
      | reg ',' signal_val
      ;

signal_val:     '?'     signal_id
      |              'PRE'       '('   '?'  signal_id ')'
      ;

addr      returns [Label label]: i=ID {$label=new Label($i.text, null);};
signal_id : ID ;
reg       returns [Register reg]: i=ID {$reg = new Register($i.text, 0);};
variable  : ID ;
prio_val  : NUMBER;
thread_id : NUMBER;
data      : NUMBER;
watcher   : NUMBER;
  
/* 
prog returns [LinkedList<Instruction> res]  
  :{error = false;} ((i=instr) {instructions.add($i.instr); } ) + {res =  instructions;};

instr returns  [Instruction instr]
      : i=decl reg=ID 
        { instr = new Decl($i.io, $reg.text); }
      | init reg=ID (l=ID clk=ID?)? 
        { instr = new Init($reg.text, $l.text, $clk.text); }
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
      |  l=ID ':' 
        { instr = Label.get($l.text); }  
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
      
 */
 
  num returns [Integer v] 
      : n=NUMBER { v=Integer.parseInt($n.text); }
      ;
/*------------------------------------------------------------------
* LEXER RULES
*------------------------------------------------------------------*/

ID	: (Letter | '_') (Letter | Digit | '_')*;

NUMBER	: ('+'|'-')?(Digit)+ ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C')+ 	{ $channel = HIDDEN; } ;

COMMENT : '%' (options {greedy=false;}: .)* '\n' {$channel=HIDDEN;};

fragment Digit	: '0'..'9' ;

fragment Letter 
	:	'a'..'z'|'A'..'Z';
 
