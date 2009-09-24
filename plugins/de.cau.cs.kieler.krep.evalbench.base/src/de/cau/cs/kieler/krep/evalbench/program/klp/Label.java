package de.cau.cs.kieler.krep.evalbench.program.klp;
//package krep.evalbench.program.klp;
//
//import java.util.HashMap;
//
//import krep.evalbench.program.Instruction;
//
///**
// * Label in the assembler code. Conects names and actual adresses.
// * @author ctr
// *
// */
//public class Label extends Instruction {
//
//    private static HashMap<String, Label> labels = new HashMap<String, Label>();
//
//    private String label;
//
//    private int pos;
//
//    /**
//     * 
//     * @param name unique identifier of the label
//     */
//    private Label(String name) {
//	label = name;
//    }
//
//    /**
//     * 
//     * @param pos instruction adress for the label
//     */
//    public void setPos(int pos) {
//	this.pos = pos;
//    }
//
//    /**
//     * 
//     * @return adress of the label
//     */
//    public int getPos() {
//	return pos;
//    }
//
//    /**
//     * @param name of the label
//     * @return Label with this name, if it exists, null otherwise
//     */
//    public static Label get(String name) {
//	Label l =  labels.get(name);
//	if (l==null){
//	    l = new Label(name);
//	    labels.put(name, l);
//	}
//	return labels.get(name);
//    }
//    
//    @Override
//    public String toString() {
//	return label;
//    }
//
//    @Override
//    protected int[] getObj() {
//	return null;
//    }
//}
