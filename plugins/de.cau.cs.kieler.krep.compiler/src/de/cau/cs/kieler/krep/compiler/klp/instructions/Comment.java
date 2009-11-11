package de.cau.cs.kieler.krep.compiler.klp.instructions;

public class Comment extends Instruction {

    public Comment(String comment){
	this.comment=comment;
    }
    
    @Override
    public String toString() {
	return "";
    }
    
    public String getComment(){
	return "# " + comment;
    }

}
