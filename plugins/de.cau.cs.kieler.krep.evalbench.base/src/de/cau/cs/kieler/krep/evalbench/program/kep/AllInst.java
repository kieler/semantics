package de.cau.cs.kieler.krep.evalbench.program.kep;






public class AllInst {


	   public static  Program dummyProgram;


	 public AllInst() throws Exception{

		 dummyProgram     = new Program(false,false,"");
		 SCLine sc        = new SCLine("EMPTY",0);
		 Label label      = new Label("EMPTY",0);
		 Data data        = new Data("0");
		 Register reg     = new Register("EMPTY",0);
		 KepSignal sig       = new KepSignal("EMPTY",Constants.SignalType.INPUT,0);

		 PrioID prio      = new PrioID(0);
		 ThreadID thread  = new ThreadID(0,0);
		 Watcher watch    = new Watcher(0);
		 sig.setReg(reg);
		 sig.setValue(data);
//Type 0 [00]:
    //Type A [00]
       //00
		dummyProgram.addInstruction(new Nothing(sc));
		dummyProgram.addInstruction(new Goto(label,sc));
//     TODO what is the meaning of CALL: format of Host Language Addr
        dummyProgram.addInstruction(new Call(label,sc));

//     TODO what is the meaning of RETURN: format of Host Language Addr
        dummyProgram.addInstruction(new Return(sc));
       //01
       // TODO what is the meaning of DEF32, maybe deprecated
        //dummyProgram.addInstruction(new Def32(sc));
        dummyProgram.addInstruction(new Exit(label,label,sc));
        dummyProgram.addInstruction(new Present(sig,label,sc));
       //11 unused

       //10
        dummyProgram.addInstruction(new Await(sig,sc));
        dummyProgram.addInstruction(new Awaiti(sig,sc));
        // TODO what about prio1 prio2
        dummyProgram.addInstruction(new Pause(sc));
        dummyProgram.addInstruction(new Halt(sc));
       //11
        dummyProgram.addInstruction(new CAwaits(sc));
        dummyProgram.addInstruction(new CAwait(sig,label,sc));
        dummyProgram.addInstruction(new CAwaiti(sig,label,sc));
        dummyProgram.addInstruction(new CAwaite(label,sc));
    //Type B [01]
       //00
        dummyProgram.addInstruction(new SignalIn(sig,sc));
       //01 unused
       //10 unused
       //11 unused

    //Type C [10]
    //Type D [11]

//Type 1 [01]:
       //Type A [00] Emission:
              //00
               dummyProgram.addInstruction(new Emit(sig,sc));
               dummyProgram.addInstruction(new Emit_Reg(sig,sc));
              //01
               dummyProgram.addInstruction(new Setv(sig,sc));
               dummyProgram.addInstruction(new Setv_Reg(sig,sc));
              //10
               dummyProgram.addInstruction(new Sustain(sig,sc));
               dummyProgram.addInstruction(new Sustain_Reg(sig,sc));
              //11 unused

       // Type B [01] Threads:

             //00
              dummyProgram.addInstruction(new Par(label,thread,sc));
              dummyProgram.addInstruction(new Pare(label,prio,sc));
              dummyProgram.addInstruction(new Prio(thread,sc));
              dummyProgram.addInstruction(new Join(prio,sc));
              //01 unused
              //10 unused
              //11 unused

       // Type C [10] unused
       // Type D [11] unused

// Type 2 [10]:

       // Type A [00] Preemtion [00]:
              //00
              dummyProgram.addInstruction(new Abort(sig,label,watch,sc));
              dummyProgram.addInstruction(new Aborti(sig,label,watch,sc));
              dummyProgram.addInstruction(new WAbort(sig,label,watch,sc));
              dummyProgram.addInstruction(new WAborti(sig,label,watch,sc));
              //01
              dummyProgram.addInstruction(new Suspend(sig,label,watch,sc));
              dummyProgram.addInstruction(new Suspendi(sig,label,watch,sc));
              //10
              dummyProgram.addInstruction(new LAbort(sig,label,watch,sc));
              dummyProgram.addInstruction(new LAborti(sig,label,watch,sc));
              dummyProgram.addInstruction(new LwAbort(sig,label,watch,sc));
              dummyProgram.addInstruction(new LwAborti(sig,label,watch,sc));
              //11
               dummyProgram.addInstruction(new Tabort(sig,label,watch,sc));
               dummyProgram.addInstruction(new Taborti(sig,label,watch,sc));
               dummyProgram.addInstruction(new TwAbort(sig,label,watch,sc));
               dummyProgram.addInstruction(new TwAborti(sig,label,watch,sc));

       //Type B  [01]: unused
       //Type C  [10]: unused
       //Type D  [11]: unused

// Type 3 [11] Alu:

       //  Type A [00]

              //00
               dummyProgram.addInstruction(new Add_Data(reg,data,sc));
               dummyProgram.addInstruction(new Add_Reg(reg,reg,sc));
               dummyProgram.addInstruction(new Add_Sig(reg,sig,sc));
       	      // 11 unused
       	      //01]
               dummyProgram.addInstruction(new Addc_Data(reg,data,sc));
               dummyProgram.addInstruction(new Addc_Reg(reg,reg,sc));
               dummyProgram.addInstruction(new Addc_Sig(reg,sig,sc));
    	      // 11 unused
       	      //10
    	       dummyProgram.addInstruction(new Sub_Data(reg,data,sc));
               dummyProgram.addInstruction(new Sub_Reg(reg,reg,sc));
               dummyProgram.addInstruction(new Sub_Sig(reg,sig,sc));
       	      // 11 unused
       	      //11
               dummyProgram.addInstruction(new Subc_Data(reg,data,sc));
               dummyProgram.addInstruction(new Subc_Reg(reg,reg,sc));
               dummyProgram.addInstruction(new Subc_Sig(reg,sig,sc));
    	      // 11 unused

       //  Type B [01]

       	  	  //00
               dummyProgram.addInstruction(new Load_Data(reg,data,sc));
               dummyProgram.addInstruction(new Load_Reg(reg,reg,sc));
               dummyProgram.addInstruction(new Load_Sig(reg,sig,sc));
       	      // 11 unused
       	      //01
               dummyProgram.addInstruction(new Mul_Data(reg,data,sc));
               dummyProgram.addInstruction(new Mul_Reg(reg,reg,sc));
               dummyProgram.addInstruction(new Mul_Sig(reg,sig,sc));
              // 11 unused
              //10
               dummyProgram.addInstruction(new Andr_Data(reg,data,sc));
               dummyProgram.addInstruction(new Andr_Reg(reg,reg,sc));
               dummyProgram.addInstruction(new Andr_Sig(reg,sig,sc));
              // 11 unused
              //11
               dummyProgram.addInstruction(new Orr_Data(reg,data,sc));
               dummyProgram.addInstruction(new Orr_Reg(reg,reg,sc));
               dummyProgram.addInstruction(new Orr_Sig(reg,sig,sc));
              // 11 unused

       //  Type C [10]

              //00
               dummyProgram.addInstruction(new Xorr_Data(reg,data,sc));
               dummyProgram.addInstruction(new Xorr_Reg(reg,reg,sc));
               dummyProgram.addInstruction(new Xorr_Sig(reg,sig,sc));
              // 11 unused
              //01
               dummyProgram.addInstruction(new Cmp_Data(reg,data,sc));
               dummyProgram.addInstruction(new Cmp_Reg(reg,reg,sc));
               dummyProgram.addInstruction(new Cmp_Sig(reg,sig,sc));
              // 11 unused
              //10
               dummyProgram.addInstruction(new Cmps_Data(reg,data,sc));
               dummyProgram.addInstruction(new Cmps_Reg(reg,reg,sc));
               dummyProgram.addInstruction(new Cmps_Sig(reg,sig,sc));
              // 11 unused
              //11
               dummyProgram.addInstruction(new Clrc(sc));
               dummyProgram.addInstruction(new Setc(sc));
              // 10 unused
              // 11 unused

       //Type D [11] Conditional misc. Register Operations

              //0
               dummyProgram.addInstruction(new JW_z(label,sc));
              //001 unused
               dummyProgram.addInstruction(new JW_g(label,sc));
               dummyProgram.addInstruction(new JW_l(label,sc));
               dummyProgram.addInstruction(new JW_ge(label,sc));
               dummyProgram.addInstruction(new JW_le(label,sc));
               dummyProgram.addInstruction(new JW_ee(label,sc));
               dummyProgram.addInstruction(new JW_ne(label,sc));

              //1
               dummyProgram.addInstruction(new Jc(label,sc));
               dummyProgram.addInstruction(new Jnc(label,sc));
               dummyProgram.addInstruction(new Sr(reg,sc));
               dummyProgram.addInstruction(new Src(reg,sc));
               dummyProgram.addInstruction(new Sl(reg,sc));
               dummyProgram.addInstruction(new Slc(reg,sc));
              //110 unused
               dummyProgram.addInstruction(new Notr(reg,sc));
	 }
}


