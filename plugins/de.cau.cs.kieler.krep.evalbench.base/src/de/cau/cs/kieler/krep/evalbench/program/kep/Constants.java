package de.cau.cs.kieler.krep.evalbench.program.kep;


public class Constants {

     public  final static int addr_width  = 16;
     public  final static int signal_width = 9 ;
     public  final static int data_width  = addr_width;
     public  final static int prio_width = 8;
     public  final static int threadId_width  = prio_width-1;
     public  final static int watcher_width = 6;
     public  final static int reg_width  = 10;

     public   final static double max_data     = Math.pow(2, data_width);
     public   final static double max_addr     = Math.pow(2, addr_width);
     public   final static double max_watcher  = Math.pow(2, watcher_width);
     public   final static double max_threadId = Math.pow(2, threadId_width);
     public   final static double max_prio     = Math.pow(2, threadId_width);
     public   final static double max_reg      = Math.pow(2, reg_width);
     public   final static double max_sig      = Math.pow(2, signal_width);


     public final static int instr_width = 40;
     public final static int max_LabelPrint = 10;

     public enum SignalType {INPUT,OUTPUT,SIGNAL,INPUT_VAL,OUTPUT_VAL,SIGNAL_VAL};
     public enum RegisterType {DATA,REG,SIGNAL};
     public enum SignalDataType {PURE,DATA,REG};
     
     public static String TICK ="TICK";
     public static String TICKLEN ="_TICKLEN";

     public final static int id_width  = 8;

     public final static String A = "00";
     public final static String EMISS = A;
     public final static String PREEM = A;
     public final static String B = "01";
     public final static String C = "10";
     public final static String D = "11";

     public final static String T0 = "00";
     public final static String T1 = "01";
     public final static String T2 = "10";
     public final static String ALU = "11";

//Type 0 [00]:
    //Type A [00]
       //00
        public final static Opcode NOTHING       = new Opcode (T0+A+"00"+"00","NOTHING");
        public final static Opcode GOTO          = new Opcode ( T0+A+"00"+"01","GOTO");
//     TODO what is the meaning of CALL: format of Host Language Label
        public final static Opcode CALL          = new Opcode ( T0+A+"00"+"10","CALL");
//     TODO what is the meaning of RETURN: format of Host Language Label
        public final static Opcode RETURN        = new Opcode ( T0+A+"00"+"11","RETURN");
       //01
       // TODO what is the meaning of DEF32, maybe deprecated
        public final static Opcode DEF32         = new Opcode ( T0+A+"01"+"00","DEF32");
        public final static Opcode EXIT 	     = new Opcode ( T0+A+"01"+"01","EXIT");
        public final static Opcode PRESENT       = new Opcode ( T0+A+"01"+"10","PRESENT");
       //11 unused

       //10
        public final static Opcode AWAIT 	     = new Opcode ( T0+A+"10"+"00","AWAIT");
        public final static Opcode AWAITI        = new Opcode ( T0+A+"10"+"01","AWAITI");
        // TODO what about prio1 prio2
        public final static Opcode PAUSE         = new Opcode ( T0+A+"10"+"10","PAUSE");
        public final static Opcode HALT          = new Opcode ( T0+A+"10"+"11","HALT");
       //11
        public final static Opcode CAWAITS       = new Opcode ( T0+A+"11"+"00","CAWAITS");
        public final static Opcode CAWAIT        = new Opcode ( T0+A+"11"+"01","CAWAIT");
        public final static Opcode CAWAITI       = new Opcode ( T0+A+"11"+"10","CAWAITI");
        public final static Opcode CAWAITE       = new Opcode ( T0+A+"11"+"11","CAWAITE");
    //Type B [01]
       //00
        public final static Opcode SIGNALIN      = new Opcode ( T0+B+"00"+"00","SIGNALIN");
       //01 unused
       //10 unused
       //11 unused

    //Type C [10]
    //Type D [11]

//Type 1 [01]:
       //Type A [00] Emission:
              //00
               public final static Opcode EMIT          = new Opcode ( T1+EMISS+"00"+"00","EMIT");
               public final static Opcode EMIT_REG      = new Opcode ( T1+EMISS+"00"+"01","EMIT");
              //01
               public final static Opcode SETV          = new Opcode ( T1+EMISS+"01"+"00","SETV");
               public final static Opcode SETV_REG      = new Opcode ( T1+EMISS+"01"+"01","SETV");
              //10
               public final static Opcode SUSTAIN       = new Opcode ( T1+EMISS+"10"+"00","SUSTAIN");
               public final static Opcode SUSTAIN_REG   = new Opcode ( T1+EMISS+"10"+"01","SUSTAIN");
              //11 unused

       // Type B [01] Threads:

             //00
              public final static Opcode PAR           = new Opcode ( T1+B+"00"+"00","PAR");
              public final static Opcode PARE          = new Opcode ( T1+B+"00"+"01","PARE");
              public final static Opcode PRIO          = new Opcode ( T1+B+"00"+"10","PRIO");
              public final static Opcode JOIN          = new Opcode ( T1+B+"00"+"11","JOIN");
              //01 unused
              //10 unused
              //11 unused

       // Type C [10] unused
       // Type D [11] unused

// Type 2 [10]:

       // Type A [00] Preemtion [00]:
              //00
               public final static Opcode ABORT         = new Opcode ( T2+PREEM+"00"+"00","ABORT");
               public final static Opcode ABORTI        = new Opcode ( T2+PREEM+"00"+"01","ABORTI");
               public final static Opcode WABORT        = new Opcode ( T2+PREEM+"00"+"10","WABORT");
               public final static Opcode WABORTI       = new Opcode ( T2+PREEM+"00"+"11","WABORTI");
              //01
               public final static Opcode SUSPEND       = new Opcode ( T2+PREEM+"01"+"00","SUSPEND");
               public final static Opcode SUSPENDI      = new Opcode ( T2+PREEM+"01"+"01","SUSPENDI");
              //10
               public final static Opcode LABORT        = new Opcode ( T2+PREEM+"10"+"00","LABORT");
               public final static Opcode LABORTI       = new Opcode ( T2+PREEM+"10"+"01","LABORTI");
               public final static Opcode LWABORT       = new Opcode ( T2+PREEM+"10"+"10","LWABORT");
               public final static Opcode LWABORTI      = new Opcode ( T2+PREEM+"10"+"11","WABORTI");
              //11
               public final static Opcode TABORT        = new Opcode ( T2+PREEM+"11"+"00","TABORT");
               public final static Opcode TABORTI       = new Opcode ( T2+PREEM+"11"+"01","TABORTI");
               public final static Opcode TWABORT       = new Opcode ( T2+PREEM+"11"+"10","TWABORT");
               public final static Opcode TWABORTI      = new Opcode ( T2+PREEM+"11"+"11","TWABORTI");

       //Type B  [01]: unused
       //Type C  [10]: unused
       //Type D  [11]: unused

// Type 3 [11] Alu:

       //  Type A [00]

              //00
               public final static Opcode ADD_DATA      = new Opcode ( ALU+A+"00"+"00","ADD");
       	       public final static Opcode ADD_REG       = new Opcode ( ALU+A+"00"+"01","ADD");
       	       public final static Opcode ADD_SIG       = new Opcode ( ALU+A+"00"+"10","ADD");
       	      // 11 unused
       	      //01]
       	       public final static Opcode ADDC_DATA     = new Opcode ( ALU+A+"01"+"00","ADDC");
    	       public final static Opcode ADDC_REG      = new Opcode ( ALU+A+"01"+"01","ADDC");
    	       public final static Opcode ADDC_SIG      = new Opcode ( ALU+A+"01"+"10","ADDC");
    	      // 11 unused
       	      //10
    	       public final static Opcode SUB_DATA      = new Opcode ( ALU+A+"10"+"00","SUB");
       	       public final static Opcode SUB_REG       = new Opcode ( ALU+A+"10"+"01","SUB");
       	       public final static Opcode SUB_SIG       = new Opcode ( ALU+A+"10"+"10","SUB");
       	      // 11 unused
       	      //11
       	       public final static Opcode SUBC_DATA     = new Opcode ( ALU+A+"11"+"00","SUBC");
    	       public final static Opcode SUBC_REG      = new Opcode ( ALU+A+"11"+"01","SUBC");
    	       public final static Opcode SUBC_SIG      = new Opcode ( ALU+A+"11"+"10","SUBC");
    	      // 11 unused

       //  Type B [01]

       	  	  //00
    	       public final static Opcode LOAD_DATA     = new Opcode ( ALU+B+"00"+"00","LOAD");
       	       public final static Opcode LOAD_REG      = new Opcode ( ALU+B+"00"+"01","LOAD");
       	       public final static Opcode LOAD_SIG      = new Opcode ( ALU+B+"00"+"10","LOAD");
       	      // 11 unused
       	      //01
               public final static Opcode MUL_DATA      = new Opcode ( ALU+B+"01"+"00","MUL");
               public final static Opcode MUL_REG	    = new Opcode ( ALU+B+"01"+"01","MUL");
               public final static Opcode MUL_SIG	    = new Opcode ( ALU+B+"01"+"10","");
              // 11 unused
              //10
               public final static Opcode ANDR_DATA     = new Opcode ( ALU+B+"10"+"00","ANDR");
               public final static Opcode ANDR_REG      = new Opcode ( ALU+B+"10"+"01","ANDR");
               public final static Opcode ANDR_SIG      = new Opcode ( ALU+B+"10"+"10","ANDR");
              // 11 unused
              //11
               public final static Opcode ORR_DATA      = new Opcode ( ALU+B+"11"+"00","ORR");
               public final static Opcode ORR_REG       = new Opcode ( ALU+B+"11"+"01","ORR");
               public final static Opcode ORR_SIG       = new Opcode ( ALU+B+"11"+"10","ORR");
              // 11 unused

       //  Type C [10]

              //00
               public final static Opcode XORR_DATA     = new Opcode ( ALU+C+"00"+"00","XORR");
               public final static Opcode XORR_REG      = new Opcode ( ALU+C+"00"+"01","XORR");
               public final static Opcode XORR_SIG      = new Opcode ( ALU+C+"00"+"10","XORR");
              // 11 unused
              //01
               public final static Opcode CMP_DATA      = new Opcode ( ALU+C+"01"+"00","CMP");
               public final static Opcode CMP_REG       = new Opcode ( ALU+C+"01"+"01","CMP");
               public final static Opcode CMP_SIG       = new Opcode ( ALU+C+"01"+"10","CMP");
              // 11 unused
              //10
               public final static Opcode CMPS_DATA     = new Opcode ( ALU+C+"10"+"00","CMPS");
               public final static Opcode CMPS_REG      = new Opcode ( ALU+C+"10"+"01","CMPS");
               public final static Opcode CMPS_SIG      = new Opcode ( ALU+C+"10"+"10","CMPS");
              // 11 unused
              //11
               public final static Opcode CLRC          = new Opcode ( ALU+C+"11"+"00","CLRC");
               public final static Opcode SETC          = new Opcode ( ALU+C+"11"+"01","SETC");
              // 10 unused
              // 11 unused

       //Type D [11] Conditional misc. Register Operations

              //0
               public final static Opcode JW_Z          = new Opcode ( ALU+D+"0"+"000","JWZ");
              //001 unused
               public final static Opcode JW_G          = new Opcode ( ALU+D+"0"+"011","JWG");
               public final static Opcode JW_L          = new Opcode ( ALU+D+"0"+"010","JWL");
               public final static Opcode JW_GE         = new Opcode ( ALU+D+"0"+"100","JWGE");
               public final static Opcode JW_LE         = new Opcode ( ALU+D+"0"+"101","JWLE");
               public final static Opcode JW_EE         = new Opcode ( ALU+D+"0"+"110","JWEE");
               public final static Opcode JW_NE         = new Opcode ( ALU+D+"0"+"111","JWNE");
              //1
               public final static Opcode JC            = new Opcode ( ALU+D+"1"+"000","JC");
               public final static Opcode JNC           = new Opcode ( ALU+D+"1"+"001","JNC");
               public final static Opcode SR            = new Opcode ( ALU+D+"1"+"010","SR");
               public final static Opcode SRC           = new Opcode ( ALU+D+"1"+"011","SRC");
               public final static Opcode SL            = new Opcode ( ALU+D+"1"+"100","SL");
               public final static Opcode SLC           = new Opcode ( ALU+D+"1"+"101","SLC");
              //110 unused
               public final static Opcode NOTR          = new Opcode ( ALU+D+"1"+"111","NOTR");



}
