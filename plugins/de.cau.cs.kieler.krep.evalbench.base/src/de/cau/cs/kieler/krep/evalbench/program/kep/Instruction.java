package de.cau.cs.kieler.krep.evalbench.program.kep;



import java.util.HashMap;
import java.util.StringTokenizer;




public class Instruction extends de.cau.cs.kieler.krep.evalbench.program.Instruction implements InstInf {

	String id;
	String mnemonic;
	SCLine sourceCode;
	public Instruction(){}

	public Instruction(String id, String name, SCLine sourceCode) {
		this.id = id;
		this.mnemonic = name;
		this.sourceCode = sourceCode;
	}

	public String toString(){
		return mnemonic + " ";
	}

	public String encode(){
		return id;
	}

	public String info(){
		return  ""+mnemonic+"\n\r" +
				id;
	}

	public int length(){
		return Constants.id_width;
	}

	public SCLine getScource(){
		return sourceCode;
	}

	public void setSourceCode(SCLine sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getId() {
		return id;
	}




	public boolean equals(String crit){

	   StringTokenizer tokenizer = new StringTokenizer(this.mnemonic);
   	   String name = tokenizer.nextToken();

	   return name.contains(crit);
	}

	@Override
	public void asmLabel(HashMap<String, Integer> label2addr) {
	    // TODO Auto-generated method stub
	}

	private int[] String2Array(String bin){
		 int[] res = new int[5];
		 // pad with 0
		 String pad = "";
		 for (int i=0; i<5*8-bin.length(); i++){
		     pad +="0";
		 }
		 bin +=pad;
		 
		 for(int i =0; i<5; i++){
		     String s = bin.substring(8*i, 8*(i+1));
		   res[i] = Integer.parseInt(s, 2);    
		 }
		 return res;
		}
	
	@Override
	protected int[] getObj() {
	    return String2Array(encode());
	}





}