package krp.statement;
public class Jmp extends Statement {
   
    String label;
    
    public Jmp(String label){
	this.label=label;
    }
  

    
    @Override
    public String toString(){
	return "JMP " + label;
    }
}
