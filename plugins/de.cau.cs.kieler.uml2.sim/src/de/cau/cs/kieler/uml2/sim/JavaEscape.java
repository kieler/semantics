package de.cau.cs.kieler.uml2.sim;

public class JavaEscape {

    //FIXME: only works for simple transition labels
    public static String getTrigger(String TransitionLabel) {
        return "a";
        //return TransitionLabel.substring(0,TransitionLabel.indexOf("/"));
    }
    
    //FIXME: only works for simple transition labels
    public static String getEffect(String TransitionLabel) {
        return "b";
//        return TransitionLabel.substring(TransitionLabel.indexOf("/"));
    }
    
}
