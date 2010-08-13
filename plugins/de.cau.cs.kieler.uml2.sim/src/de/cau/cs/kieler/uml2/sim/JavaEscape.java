package de.cau.cs.kieler.uml2.sim;

import java.util.LinkedList;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.Transition;

public class JavaEscape {

	private static LinkedList<Vertex> doneVerticesIncoming = new LinkedList<Vertex>();
	private static LinkedList<Vertex> doneVerticesOutgoing = new LinkedList<Vertex>();
	private static EList<Pseudostate> savedPseudostates = new BasicEList<Pseudostate>();
	private static Region lastRootRegion = null;

	// ------------------------------------------------------------------------
	
	// Add a Pseudostate to a temporary list
	public static void addPseudostate(Pseudostate pseudostate) {
		savedPseudostates.add(pseudostate);
	}
	
	// Get the saved Pseudostates
	public static EList<Pseudostate> getPseudostates() {
		return savedPseudostates;
	}
	
	// Reset the Pseudostates
	public static void resetPseudostates() {
		savedPseudostates.clear();
	}
	
	// ------------------------------------------------------------------------

	// Save a new root region iff it has a smaller hierarchy level 
	// otherwise keep the old one
	public static void setLastRootRegion(Region region) {
		if (lastRootRegion == null) {
			lastRootRegion = region;
		}
		else if (getHierarchyLevel(lastRootRegion) > getHierarchyLevel(region)) {
			lastRootRegion = region;
		}
	}
	
	// ------------------------------------------------------------------------

	// Get the last RootRegion, that is the one with the smallest hierarchy level
	public static Region getLastRootRegion() {
		return lastRootRegion;
	}
	
	// ------------------------------------------------------------------------

	public static void resetLastRootRegion() {
		lastRootRegion = null;
	}
	
	// ------------------------------------------------------------------------
	
	// For any EObject return the hierarchy level
	public static int getHierarchyLevel(EObject eObject) {
		int c = 0;
		while (eObject.eContainer() != null) {
			c++;
			eObject = eObject.eContainer();
		}
		return c;
	}
	
	// ------------------------------------------------------------------------

	// Clear list of checked vertices
	public static void clearDoneVertices() {
		doneVerticesIncoming.clear();
		doneVerticesOutgoing.clear();
	}

	// ------------------------------------------------------------------------

	// Add a Vertex iff it is not already checked
	public static boolean markDone(Vertex vertex, String id) {
		if (id.equals("INCOMING")) {
			if (!isDone(vertex, id)) {
				doneVerticesIncoming.add(vertex);
				return true;
			}
		}
		if (id.equals("OUTGOING")) {
			if (!isDone(vertex, id)) {
				doneVerticesOutgoing.add(vertex);
				return true;
			}
		}
		return false;

	}

	// ------------------------------------------------------------------------

	// Ask whether a Vertex is checked
	public static boolean isDone(Vertex vertex, String id) {
		if (id.equals("INCOMING")) {
			if (doneVerticesIncoming.contains(vertex)) {
				return true;
			}
		}
		if (id.equals("OUTGOING")) {
			if (doneVerticesOutgoing.contains(vertex)) {
				return true;
			}
		}
		return false;
	}

	// ------------------------------------------------------------------------

	// Get the Fragment URI ID of a Vertex
	public static String getId(Vertex vertex) {
		return getAlias(vertex)
				+ hash(vertex.eResource().getURIFragment(vertex).toString());
	}

	// ------------------------------------------------------------------------

	// Get the Fragment URI ID of a Region
	public static String getId(Region region) {
		return "R"+hash(region.eResource().getURIFragment(region).toString());
	}

	// ------------------------------------------------------------------------

	// Get Alias of a Vertex for better traceability
	public static String getAlias(Vertex vertex) {
		if (isInitial(vertex))
			return "I";
		if (isFinal(vertex))
			return "T";
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

	// Get Alias of a Transition for better traceability
	public static String getAlias(Transition transition) {
		return getAlias(transition.getSource()) + "2"
				+ getAlias(transition.getTarget());
	}

	// ------------------------------------------------------------------------

	// Get the Fragment URI ID of a Tranistion
	public static String getId(Transition transition) {
		return getAlias(transition)
				+ hash(transition.eResource().getURIFragment(transition));
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

	public static Boolean isFinal(Vertex vertex) {
		// only a Pseudostate can be an initial state
		if (!(vertex instanceof FinalState))
			return false;
		return true;
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
		// pseudostate.eAllContents().
		return returnList;
	}
}
