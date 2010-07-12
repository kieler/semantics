package de.cau.cs.kieler.uml2.sim;

public class JavaEscape {

    //FIXME: only works for simple transition labels
    static String getTrigger(String TransitionLabel) {
        return TransitionLabel.substring(0,TransitionLabel.indexOf("/"));
    }
    
    //FIXME: only works for simple transition labels
    static String getEffect(String TransitionLabel) {
        return TransitionLabel.substring(TransitionLabel.indexOf("/"));
    }
    
}
