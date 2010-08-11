package de.cau.cs.kieler.uml2.sim;

import org.eclipse.uml2.uml.Pseudostate;

public class JavaEscape {

	// ------------------------------------------------------------------------

	// Get the Fragment URI ID of a Vertex
	public static String getId(org.eclipse.uml2.uml.Vertex vertex) {
		return getAlias(vertex)
				+ vertex.eResource().getURIFragment(vertex).toString();
	}

	// ------------------------------------------------------------------------

	// Get Alias of a Vertex for better traceability
	public static String getAlias(org.eclipse.uml2.uml.Vertex vertex) {
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
	public static String getId(org.eclipse.uml2.uml.Transition transition) {
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

	public static Boolean isInitial(org.eclipse.uml2.uml.Vertex vertex) {
		// only a Pseudostate can be an initial state
		if (!(vertex instanceof Pseudostate))
			return false;
		return ((((Pseudostate) vertex).getKind()).getValue() == org.eclipse.uml2.uml.PseudostateKind.INITIAL);
	}

	public static Boolean isDH(org.eclipse.uml2.uml.Vertex vertex) {
		// only a Pseudostate can be a deep history state
		if (!(vertex instanceof Pseudostate))
			return false;
		return ((((Pseudostate) vertex).getKind()).getValue() == org.eclipse.uml2.uml.PseudostateKind.DEEP_HISTORY);
	}

	public static Boolean isFork(org.eclipse.uml2.uml.Vertex vertex) {
		// only a Pseudostate can be a deep history state
		if (!(vertex instanceof Pseudostate))
			return false;
		return ((((Pseudostate) vertex).getKind()).getValue() == org.eclipse.uml2.uml.PseudostateKind.FORK);
	}

	public static Boolean isJoin(org.eclipse.uml2.uml.Vertex vertex) {
		// only a Pseudostate can be a deep history state
		if (!(vertex instanceof Pseudostate))
			return false;
		return ((((Pseudostate) vertex).getKind()).getValue() == org.eclipse.uml2.uml.PseudostateKind.JOIN);
	}

	public static Boolean isSH(org.eclipse.uml2.uml.Vertex vertex) {
		// only a Pseudostate can be a shallow history state
		if (!(vertex instanceof Pseudostate))
			return false;
		return ((((Pseudostate) vertex).getKind()).getValue() == org.eclipse.uml2.uml.PseudostateKind.SHALLOW_HISTORY);
	}

	// ------------------------------------------------------------------------
}
