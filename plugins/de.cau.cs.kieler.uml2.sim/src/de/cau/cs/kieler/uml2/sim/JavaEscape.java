package de.cau.cs.kieler.uml2.sim;

import java.util.LinkedList;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.Transition;

public class JavaEscape {

    private static LinkedList<Vertex> checkedVertices = new LinkedList<Vertex>();

	// ------------------------------------------------------------------------
    
    // Clear list of checked vertices
    public static void clearCheckedVertices() {
    	checkedVertices.clear();
    }
	
    // ------------------------------------------------------------------------
    
    // Add a Vertex iff it is not already checked
    public static boolean addCheckedVertex(Vertex vertex) {
    	if (!isCheckedVertex(vertex)) {
        	checkedVertices.add(vertex);
        	return true;
    	}
    	return false;
    }
    
	// ------------------------------------------------------------------------

    // Ask whether a Vertex is checked
    public static boolean isCheckedVertex(Vertex vertex) {
    	if (checkedVertices.contains(vertex)) {
    		return true;
    	}
    	return false;
    }
    
	// ------------------------------------------------------------------------

	// Get the Fragment URI ID of a Vertex
	public static String getId(Vertex vertex) {
		return getAlias(vertex)
				+ vertex.eResource().getURIFragment(vertex).toString();
	}

	// ------------------------------------------------------------------------

	// Get Alias of a Vertex for better traceability
	public static String getAlias(Vertex vertex) {
		if (isInitial(vertex))
			return "I";
		if (isDH(vertex))
			return "DH";
		if (isSH(vertex))
			return "SH";
		if (isJoin(vertex))
			return "J";
		if (isFork(vertex))
			return "F";
		if (vertex.getName() == null)
			return "";
		return vertex.getName();
	}

	// ------------------------------------------------------------------------

	// Get the Fragment URI ID of a Tranistion
	public static String getId(Transition transition) {
		return getAlias(transition.getSource()) + "2"
				+ getAlias(transition.getTarget())
				+ transition.eResource().getURIFragment(transition);
	}

	// ------------------------------------------------------------------------

	// Get the hash value of a String
	public static String hash(String string) {
		return string.hashCode() + "";
	}

	// ------------------------------------------------------------------------

	// FIXME: only works for simple transition labels
	public static String getTrigger(String TransitionLabel) {
		if (TransitionLabel.contains("/"))
			return TransitionLabel.substring(0, TransitionLabel.indexOf("/"));
		else
			return null;

	}

	// ------------------------------------------------------------------------

	// FIXME: only works for simple transition labels
	public static String getAction(String TransitionLabel) {
		if (TransitionLabel.contains("/"))
			if (TransitionLabel.substring(TransitionLabel.indexOf("/") + 1) != "")
				return TransitionLabel
						.substring(TransitionLabel.indexOf("/") + 1);
			else
				return "skip";
		else
			return "skip";
	}

	// ------------------------------------------------------------------------

	public Boolean contains(String str) {
		return (this.contains(str));
	}

	// ------------------------------------------------------------------------

	public static Boolean isInitial(Vertex vertex) {
		// only a Pseudostate can be an initial state
		if (!(vertex instanceof Pseudostate))
			return false;
		return ((((Pseudostate) vertex).getKind()).getValue() == PseudostateKind.INITIAL);
	}

	public static Boolean isDH(Vertex vertex) {
		// only a Pseudostate can be a deep history state
		if (!(vertex instanceof Pseudostate))
			return false;
		return ((((Pseudostate) vertex).getKind()).getValue() == PseudostateKind.DEEP_HISTORY);
	}

	public static Boolean isFork(Vertex vertex) {
		// only a Pseudostate can be a deep history state
		if (!(vertex instanceof Pseudostate))
			return false;
		return ((((Pseudostate) vertex).getKind()).getValue() == PseudostateKind.FORK);
	}

	public static Boolean isJoin(Vertex vertex) {
		// only a Pseudostate can be a deep history state
		if (!(vertex instanceof Pseudostate))
			return false;
		return ((((Pseudostate) vertex).getKind()).getValue() == PseudostateKind.JOIN);
	}

	public static Boolean isSH(Vertex vertex) {
		// only a Pseudostate can be a shallow history state
		if (!(vertex instanceof Pseudostate))
			return false;
		return ((((Pseudostate) vertex).getKind()).getValue() == PseudostateKind.SHALLOW_HISTORY);
	}

	// ------------------------------------------------------------------------
	
	public static EList<Vertex> getSourceNodes(Pseudostate pseudostate) {
		EList<Vertex> returnList = new BasicEList<Vertex>();
		//pseudostate.eAllContents().
		return returnList;
	}
}
