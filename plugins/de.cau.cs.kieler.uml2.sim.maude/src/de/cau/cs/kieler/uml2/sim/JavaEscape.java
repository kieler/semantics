package de.cau.cs.kieler.uml2.sim;

import java.util.LinkedList;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.Transition;

import org.eclipse.xtend.util.stdlib.ExtIssueReporter;

public class JavaEscape {

    // Saves the Vertices that had been visited when searching for incoming
    // transitions so that they are no searched again (when backtracking).
    private static LinkedList<Vertex> doneVerticesIncoming = new LinkedList<Vertex>();

    // Saves the Vertices that had been visited when searching for outgoing
    // transitions so that they are no searched again (when backtracking).
    private static LinkedList<Vertex> doneVerticesOutgoing = new LinkedList<Vertex>();

    // Saves the last hierarchically upper most region that will be the region
    // containing the complex transition afterwards.
    private static Region lastRootRegion = null;

    // Saves the list of pseudostates that will be used to identify the
    // connected components forming a complex transition. This means that this
    // pseudostate (i.e., a fork or join vertex) will identify such a
    // transition.
    private static EList<Pseudostate> savedPseudostates = new BasicEList<Pseudostate>();

    // Saves the trigger for a complex transition, there should only be one
    private static EList<String> savedTrigger = new BasicEList<String>();

    // Saves the action for a complex transition, there should only be one
    private static EList<String> savedAction = new BasicEList<String>();

    // Saves the guard for a complex transition, there should only be one
    private static EList<String> savedGuard = new BasicEList<String>();

    // ------------------------------------------------------------------------

    // Saves information about the trigger, action or guard of a complex
    // transition.
    public static void addComplexTransitionInformation(String item, String id) {
        if (item == null || item.length() < 1) {
            // Ignore iff there is nothing to add
            return;
        }
        if (id.equals("TRIGGER")) {
            // Do not save the nil-trigger
            if (!(item.equals("nil") || item.contains("noevent"))) {
                savedTrigger.add(item);
            }
        } else if (id.equals("ACTION")) {
            // Do not save the skip-action
            if (!item.equals("skip")) {
                savedAction.add(item);
            }
        } else if (id.equals("GUARD")) {
            // Do not save the Gd-guard
            if (!item.equals("Gd")) {
                savedGuard.add(item);
            }
        } else {
            ExtIssueReporter.reportError("saveComplexTransitionInformation: "
                    + "id must be of type TRIGGER, ACTION or GUARD");
        }
    }

    // Gets the information about the trigger action or guard of a complex
    // transition - for simplicity, the first item[0] can always be used
    // (if the list would be empty, the default value is added automatically)
    public static EList<String> getComplexTransitionInformation(String id) {
        if (id.equals("TRIGGER")) {
            if (savedTrigger.size() == 0) {
                // Add the default trigger, if there is no trigger
                savedTrigger.add("(ev: \"noevent\")");
            }
            return savedTrigger;
        } else if (id.equals("ACTION")) {
            if (savedAction.size() == 0) {
                // Add the default action, if there is no action
                savedAction.add("skip");
            }
            return savedAction;
        } else if (id.equals("GUARD")) {
            if (savedGuard.size() == 0) {
                // Add the default guard, if there is no action
                savedGuard.add("Gd");
            }
            return savedGuard;
        } else {
            ExtIssueReporter.reportError("getComplexTransitionInformation: "
                    + "id must be of type TRIGGER, ACTION or GUARD");
            return null;
        }
    }

    // Resets the information about a complex transition
    public static void resetComplexTransitionInformation() {
        savedTrigger.clear();
        savedAction.clear();
        savedGuard.clear();
    }

    // ------------------------------------------------------------------------

    // Returns the model element's container
    public static Element getParent(Element me) {
        return (Element) me.eContainer();
    }

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
        } else if (getHierarchyLevel(lastRootRegion) > getHierarchyLevel(region)) {
            lastRootRegion = region;
        }
    }

    // ------------------------------------------------------------------------

    // Get the last RootRegion, that is the one with the smallest hierarchy
    // level
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

    // Get the ID of a Vertex
    public static String getId(Vertex vertex) {
        return getAlias(vertex) + "-" + hash(vertex.eResource().getURIFragment(vertex).toString());
    }

    // ------------------------------------------------------------------------

    // Get the EMF Fragment URI ID of a Vertex
    public static String getEMFId(Vertex vertex) {
        return vertex.eResource().getURIFragment(vertex).toString();
    }

    // ------------------------------------------------------------------------

    // Get the ID of a Region
    public static String getId(Region region) {
        return "R" + hash(region.eResource().getURIFragment(region).toString());
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
        return getAlias(transition.getSource()) + "2" + "-" + getAlias(transition.getTarget());
    }

    // ------------------------------------------------------------------------

    // Get the ID of a Tranistion
    public static String getId(Transition transition) {
        return getAlias(transition) + "-" + hash(transition.eResource().getURIFragment(transition));
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
            return TransitionLabel.substring(0, TransitionLabel.indexOf("/")).trim();
        else {
            if (TransitionLabel.length() > 0) {
                return TransitionLabel;
            }
        }
        return null;

    }

    // ------------------------------------------------------------------------

    // FIXME: only works for simple transition labels
    public static String getAction(String TransitionLabel) {
        if (TransitionLabel.contains("/")) {
            if (TransitionLabel.contains("[") && TransitionLabel.contains("]")) {
                return TransitionLabel.substring(TransitionLabel.indexOf("]") + 1).trim();
            }
            if (TransitionLabel.substring(TransitionLabel.indexOf("/") + 1) != "[") {
                return TransitionLabel.substring(TransitionLabel.indexOf("/") + 1).trim();
            }
        }
        return "skip";
    }

    // ------------------------------------------------------------------------

    // FIXME: only works for simple transition labels
    public static String getGuard(String TransitionLabel, Transition transition) {
        EObject rootElement = transition.eResource().getAllContents().next();
        
        if (TransitionLabel.contains("/[")) {
            if (TransitionLabel.substring(TransitionLabel.indexOf("/[") + 1) != "]") {
                return resolveStateNames(TransitionLabel.substring(TransitionLabel.indexOf("[") + 1, TransitionLabel.indexOf("]")).trim(), rootElement);
            }
        }
        return "true";
    }

    // ------------------------------------------------------------------------

    public static String resolveStateNames(String inText, EObject rootElement) {
        String outputText = "";

        boolean extractingStateName = false;
        String extractedStateName = "";
        
        for (int i = 0; i < inText.length(); i++) {
            String character = inText.substring(i, i + 1);
            if ((character.equals("\"")) && (!extractingStateName)) {
                extractingStateName = true;
                continue;
            }
            if ((character.equals("\"")) && (extractingStateName)) {
                extractingStateName = false;
                // now try to resolve it
                TreeIterator allContents = rootElement.eAllContents();
                String stateMaudeId = resolveStateName(extractedStateName, allContents);
                // add resolved id
                outputText += stateMaudeId;
                // reset name
                extractedStateName = "";
                continue;
            }
            if (extractingStateName) {
                // extracting mode
                extractedStateName += character;
            } else {
                // normal mode
                outputText += character;
            }
        }
        return outputText;
    }
    
    // ------------------------------------------------------------------------
    
    /**
     * Tries to resolve a simple state name and returns the Maude id 
     * 
     * @param stateName
     *            the state name
     * @return the string
     */
    public static String resolveStateName(String stateName, TreeIterator allContents) {
        while (allContents.hasNext()) {
            Object object = allContents.next();
            if (object instanceof Vertex) {
                Vertex vertex = (Vertex)object;
                if (vertex.getName().equals(stateName)) {
                    return JavaEscape.getId(vertex);
                }
            }
        }
        return null;
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
        Object e = ((Pseudostate) vertex).getKind().getValue();
        boolean isInitial2 = ((((Pseudostate) vertex).getKind()).getValue() == PseudostateKind.INITIAL);
        return isInitial2;
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

    public static Boolean isChoice(Vertex vertex) {
        // only a Pseudostate can be a choice state
        if (!(vertex instanceof Pseudostate))
            return false;
        return ((((Pseudostate) vertex).getKind()).getValue() == PseudostateKind.CHOICE);
    }

    public static Boolean isPseudostate(Vertex vertex) {
        return (vertex instanceof Pseudostate);
    }

    
    
    // ------------------------------------------------------------------------

    public static EList<Vertex> getSourceNodes(Pseudostate pseudostate) {
        EList<Vertex> returnList = new BasicEList<Vertex>();
        // pseudostate.eAllContents().
        return returnList;
    }
    
    
}
