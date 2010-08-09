package de.cau.cs.kieler.uml2.sim;
import org.eclipse.uml2.uml.Pseudostate;


public class JavaEscape {

    //FIXME: only works for simple transition labels
    public static String getTrigger(String TransitionLabel) {
    	if (TransitionLabel.contains("/")) 
        return TransitionLabel.substring(0,TransitionLabel.indexOf("/"));
    	else return null ;

    }
    
    //FIXME: only works for simple transition labels
    public static String getAction(String TransitionLabel) {
    	if (TransitionLabel.contains("/")) 
        if (TransitionLabel.substring(TransitionLabel.indexOf("/")+1) != "")
        	return TransitionLabel.substring(TransitionLabel.indexOf("/")+1) ;
        else return "skip" ;
    	else return "skip" ;
    }
    public static String transID(String TransitionLabel) {
    	if (TransitionLabel == null) return null;
    	else return TransitionLabel.substring(TransitionLabel.indexOf("@")+1, TransitionLabel.indexOf("(name")-1) ;
    }

    public Boolean contains(String str) {
    	return (this.contains(str)); 
    }

    public Boolean isInitial(org.eclipse.uml2.uml.Pseudostate pstate) {
    	return ((pstate.getKind()).getValue() == org.eclipse.uml2.uml.PseudostateKind.INITIAL); 
    }
    public Boolean isDH(org.eclipse.uml2.uml.Pseudostate pstate) {
    	return ((pstate.getKind()).getValue() == org.eclipse.uml2.uml.PseudostateKind.DEEP_HISTORY); 
    }
    public Boolean isSH(org.eclipse.uml2.uml.Pseudostate pstate) {
    	return ((pstate.getKind()).getValue() == org.eclipse.uml2.uml.PseudostateKind.SHALLOW_HISTORY); 
    }
}
