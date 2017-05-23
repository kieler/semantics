package de.cau.cs.kieler.sccharts.sequencetracker;

import java.util.HashMap;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.ValuedObject;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Action
import javax.inject.Inject
import java.util.ArrayList
import java.util.List
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import com.google.inject.Guice
import java.util.HashSet

class TrackerDataComponent extends JSONObjectDataComponent implements IJSONObjectDataComponent {

    static final String CONSOLE_NAME = "SCCharts Activity Sequence Tracker";

    static final String TRANSITION_NAME = "transition";

    static final String CONSOLEVIEWID = "org.eclipse.ui.console.ConsoleView";

    static final String ENVIRONMENT_INPUT = "User";

    static final String ENVIRONMENT_OUTPUT = "User";

    static final String SIGNAL_PRESENT = "PRESENT";
    static final String SIGNAL_ABSENT = "ABSENT";

    static HashMap<String, Object> valuedObjectValues = new HashMap<String, Object>
    static HashMap<String, Boolean> valuedObjectChanged = new HashMap<String, Boolean>

    MessageConsoleStream consoleStream = null;

    TransitionSerializer transitionSerializer = null;

    private HashMap<String, EObject> eObjectMap = new HashMap<String, EObject>();

    private State modelRoot = null;

    // -------------------------------------------------------------------------
    def void TrackerDataComponent() {
        println("BUH")
    }

    // -------------------------------------------------------------------------
//    @Inject
//    extension SCChartsExtension
//
//    @Inject
//    extension SCChartsSerializeHRExtension
    // -------------------------------------------------------------------------
    override initialize() throws KiemInitializationException {
        val console = findConsole(CONSOLE_NAME);
        consoleStream = console.newMessageStream();
        console.clearConsole();
        bringToFront();
        eObjectMap = new HashMap<String, EObject>();
        modelRoot = null;
        consoleStream.println("@startuml");

        transitionSerializer = Guice.createInjector().getInstance(TransitionSerializer);
    }

    override isObserver() {
        true
    }

    override isProducer() {
        false
    }

    override wrapup() throws KiemInitializationException {
        consoleStream.println("@enduml");
    }

    // -------------------------------------------------------------------------
    def applyValue(String valuedObjectName, Object value) {
        var changed = false
        if (!valuedObjectValues.containsKey(valuedObjectName)) {
            changed = true
        } else if (value != null && (value.equals(SIGNAL_PRESENT) || value.equals(SIGNAL_ABSENT))) {
            changed = true
        } else {
            val oldValue = valuedObjectValues.get(valuedObjectName)
            if (oldValue != value) {
                changed = true
            }
        }
        if (changed) {
            valuedObjectValues.put(valuedObjectName, value)
            valuedObjectChanged.put(valuedObjectName, true)
        } else {
            valuedObjectChanged.put(valuedObjectName, false)
        }
    }

    def boolean hasChanged(String valuedObjectName) {
        if (valuedObjectChanged.containsKey(valuedObjectName)) {
            valuedObjectChanged.get(valuedObjectName)
        }
        return true;
    }

    // -------------------------------------------------------------------------
    def getSignalVarValue(String key, JSONObject jSONObject) {
        var value = jSONObject.getString(key);
        // Signal special case
        if (JSONSignalValues.isSignalValue(jSONObject.get(key))) {
            val signalValue = JSONSignalValues.getSignalValue(jSONObject.get(key))
            if (signalValue != null) {
                // Valued signal
                value = signalValue.toString
            } else {
                // Pure signal
                if (JSONSignalValues.isPresent(jSONObject.get(key))) {
                    value = SIGNAL_PRESENT;
                } else {
                    value = SIGNAL_ABSENT;
                }
            }
        }

    }

    // -------------------------------------------------------------------------
    def String listToString(EList<String> inputList) {
        var returnValue = ""
        for (element : inputList) {
            if (returnValue.length() > 0) {
                returnValue += ", ";
            }
            returnValue += element;
        }
        return returnValue
    }

    // -------------------------------------------------------------------------
    def List<Transition> extractTakenTransitions(JSONObject jSONObject) {
        var returnList = newArrayList
        val namesArray = jSONObject.names();
        for (var c = 0; c < namesArray.length(); c++) {
            var Object obj;
            try {
                obj = namesArray.get(c);
                if (obj instanceof String) {
                    var key = obj;
                    var value = jSONObject.getString(key);
                    if (key.equals(TRANSITION_NAME)) {
                        var transitions = value.split(",");
                        if (transitions != null) {
                            for (String eObjectID : transitions) {
                                val eObject = getEObject(eObjectID);
                                if (eObject instanceof Transition) {
                                    returnList.add(eObject)
                                }
                            }
                        }
                    }
                }
            } catch (JSONException e) {
            }
        }
        return returnList;
    }

    // -------------------------------------------------------------------------
    override step(JSONObject jSONObject) throws KiemExecutionException {
        val namesArray = jSONObject.names();

        var valuedObjectList = newArrayList

        for (var c = 0; c < namesArray.length(); c++) {
            var Object obj;
            try {
                obj = namesArray.get(c);
                if (obj instanceof String) {
                    var key = obj;
                    var value = key.getSignalVarValue(jSONObject)
                    valuedObjectList.add(key)
                    applyValue(key, value)
                }
            } catch (JSONException e) {
            }
        }

        for (transition : jSONObject.extractTakenTransitions) {
            val triggerValuedObjects = transition.getTriggerValuedObjects
            val effectValuedObjects = transition.effectAssignmentValuedObjects

            // Optional Note
            val transitionNote = transition.sourceState.id + " -> " + transition.targetState.id // + " with " + transitionSerializer.serializeTrigger(transition)  
            consolePrintln("note left \n   " + transitionNote + "")
            consolePrintln("end note\n")

            if (!triggerValuedObjects.nullOrEmpty) {
                for (valuedObject : triggerValuedObjects) {
                    if (valuedObject.name.hasChanged) {
                        for (senderComponent : valuedObject.name.senderRegions) {
                            for (receiverComponent : valuedObject.name.receiverRegions) {
                                consolePrintln("autonumber")

                                consolePrint(senderComponent)
                                // consolePrint(transition.sourceState.id)
                                consolePrint(" -> ")
                                consolePrint(receiverComponent)
                                // consolePrint(transition.targetState.id)
                                consolePrint(" : ")

                                consolePrintln(transitionSerializer.serializeTrigger(transition))
                                consolePrintln("")
                            }
                        }
                    }
                }
            }
            if (!effectValuedObjects.nullOrEmpty) {
                for (valuedObject : effectValuedObjects) {
                    if (valuedObject.name.hasChanged) {
                        for (senderComponent : valuedObject.name.senderRegions) {
                            for (receiverComponent : valuedObject.name.receiverRegions) {
                                consolePrintln("autonumber")

                                consolePrint(senderComponent)
                                // consolePrint(transition.sourceState.id)
                                consolePrint(" -> ")
                                consolePrint(receiverComponent)
                                // consolePrint(transition.targetState.id)
                                consolePrint(" : ")

                                consolePrintln(transitionSerializer.serializeEffects(transition))
                                consolePrintln("")
                            }
                        }
                    }
                }
            }

        }
        return null;
    }

    // -------------------------------------------------------------------------
    def void consolePrint(String text) {
        consoleStream.print(text)
    }

    def void consolePrintln(String text) {
        consoleStream.println(text)
    }

    // -------------------------------------------------------------------------
    def State getModelRoot() {
        if (modelRoot == null) {
            val eobj = KiemPlugin.getOpenedModelRootObjects().get(KiemPlugin.getCurrentModelFile());
            if (eobj instanceof State) {
                modelRoot = eobj;
            }
        }
        return modelRoot;
    }

    // -------------------------------------------------------------------------
    def boolean isInput(String name) throws KiemExecutionException {
        return isInputOutput(name, true);
    }

    def boolean isOutput(String name) throws KiemExecutionException {
        return isInputOutput(name, false);
    }

    // -------------------------------------------------------------------------
    def EList<Region> getToplevelRegions() {
        // var returnList = newArrayList() as EList<Region>
        val model = getModelRoot()
        return model.regions
    }

    // -------------------------------------------------------------------------
    def List<ValuedObject> getTriggerValuedObjects(Transition transition) {
        var returnList = newArrayList; // as EList<ValuedObject>
        if (transition.trigger instanceof ValuedObjectReference) {
            returnList.add((transition.trigger as ValuedObjectReference).valuedObject)
        } else {
            for (valuedObjectReference : transition.eAllContents.filter(typeof(ValuedObjectReference)).toList()) {
                returnList.add(valuedObjectReference.valuedObject)
            }
        }
        return returnList
    }

    // -------------------------------------------------------------------------
    // Return the list of contained Emissions.
    def List<Emission> getAllContainedEmissions(Action action) {
        action.eAllContents().filter(typeof(Emission)).toList();
    }

    // Return the list of contained Assignments.
    def List<Assignment> getAllContainedAssignments(Action action) {
        action.eAllContents().filter(typeof(Assignment)).toList();
    }

    // -------------------------------------------------------------------------
    def List<ValuedObject> getEffectAssignmentValuedObjects(Transition transition) {
        var returnList = newArrayList; // as EList<ValuedObject>
        // for (assignment : transition.eAllContents().filter(typeof(Assignment)).toList()) {
        for (assignment : transition.allContainedAssignments) {
            returnList.add(assignment.valuedObject)
        }
        // for (assignment : transition.eAllContents().filter(typeof(Emission)).toList()) {
        for (assignment : transition.allContainedEmissions) {
            returnList.add(assignment.valuedObject)
        }
        return returnList
    }

    // -------------------------------------------------------------------------
    def String[] getSenderRegions(String name) throws KiemExecutionException {
        val valuedObject = getValuedObject(name);
        var returnList = newHashSet
        for (region : toplevelRegions) {
            val actions = region.eAllContents().filter(typeof(Action)).toList()
            for (action : actions) {
                if (action.getAllContainedEmissions.filter[e|e.valuedObject == valuedObject].toList.size > 0) {
                    if (region.id == null) {
                        returnList.add("REGION_WITH_NO_ID")
                    } else {
                        returnList.add(region.id)
                    }
                } else if (action.allContainedAssignments.filter[e|e.valuedObject == valuedObject].toList.size > 0) {
                    if (region.id == null) {
                        returnList.add("REGION_WITH_NO_ID")
                    } else {
                        returnList.add(region.id)
                    }
                }
            }
        }
        if ((valuedObject.eContainer as Declaration).isInput) {
            returnList.add(ENVIRONMENT_INPUT)
        }
        return returnList;
    }

    // -------------------------------------------------------------------------
    def String[] getReceiverRegions(String name) throws KiemExecutionException {
        val valuedObject = getValuedObject(name);
        var returnList = newHashSet
        for (region : toplevelRegions) {
            val references = region.eAllContents().filter(typeof(ValuedObjectReference)).toList()
            for (reference : references) {
                if (reference.valuedObject == valuedObject) {
                    if (region.id == null) {
                        returnList.add("REGION_WITH_NO_ID")
                    } else {
                        returnList.add(region.id)
                    }
                }
            }
        }
        if ((valuedObject.eContainer as Declaration).isOutput) {
            returnList.add(ENVIRONMENT_OUTPUT)
        }
        return returnList;
    }

    // -------------------------------------------------------------------------
    def ValuedObject getValuedObject(String name) throws KiemExecutionException {
        val scchart = getModelRoot();
        if (scchart != null) {
            for (Declaration declaration : scchart.getDeclarations()) {
                for (ValuedObject valuedObject : declaration.getValuedObjects()) {
                    if (valuedObject.getName().equals(name)) {
                        return valuedObject;
                    }
                }
            }
        } else {
            throw (new KiemExecutionException(
                    "SCCharts Sequence Tracker can only track activity sequences of SCCharts models.",
                false, false, false, null));
        }
        return null;
    }

    // -------------------------------------------------------------------------
    def boolean isInputOutput(String name, boolean input) throws KiemExecutionException {
        val scchart = getModelRoot();
        if (scchart != null) {
            for (Declaration declaration : scchart.getDeclarations()) {
                for (ValuedObject valuedObject : declaration.getValuedObjects()) {
                    if (input) {
                        if (declaration.isInput() && valuedObject.getName().equals(name)) {
                            return true;
                        }
                    } else {
                        if (declaration.isOutput() && valuedObject.getName().equals(name)) {
                            return true;
                        }
                    }
                }
            }
        } else {
            throw (new KiemExecutionException(
                    "SCCharts Sequence Tracker can only track activity sequences of SCCharts models.",
                false, false, false, null));
        }
        return false;
    }

    // -------------------------------------------------------------------------
    def String getEncodedEObjectId(EObject eObject) {
        if (eObject != null && eObject.eResource() != null) {
            var uri = eObject.eResource().getURIFragment(eObject);
            uri = (uri.hashCode() + "").replace("-", "M");
            return uri;
        }
        return null;
    }

    // -------------------------------------------------------------------------
    /**
     * Gets the eObject to an eObjectID cached by the hash map. With a first call of this function
     * the hash map is lazily filled.
     * 
     * @param eObjectID
     *            the EObject ID
     * @return the EObject
     */
    def EObject getEObject(String eObjectID) {
        if ((eObjectID == null) || eObjectID.equals("")) {
            return null;
        } else if (eObjectMap.containsKey(eObjectID)) {
            // only do this if editor input has not changed
            return eObjectMap.get(eObjectID);
        } else {
            // Refresh the map and try again
            refreshEObjectMap();
            if (eObjectMap.containsKey(eObjectID)) {
                return eObjectMap.get(eObjectID);
            }
        }

        return null;
    }

    // -------------------------------------------------------------------------
    /**
     * Refreshes and totally rebuilds the eObject hash map.
     */
    def void refreshEObjectMap() {
        eObjectMap.clear();
        refreshEObjectMap(getModelRoot);
    }

    // -------------------------------------------------------------------------
    /**
     * Recursively calls itself on eObjects that contain children to rebuild the eObject hash map.
     * 
     * @param baseObj
     *            the base EObject
     */
    def void refreshEObjectMap(EObject baseObj) {
        // Add this item
        var baseObjID = this.getEncodedEObjectId(baseObj);
        if (!eObjectMap.containsKey(baseObjID)) {
            eObjectMap.put(baseObjID, baseObj);
            // Add all children
            // TreeIterator<EObject> 
            var treeIterator = baseObj.eAllContents();
            while (treeIterator.hasNext()) {
                val treeIteratorObject = treeIterator.next();
                refreshEObjectMap(treeIteratorObject);
            // for (EObject treeIteratorObjectChild :
            // treeIteratorObject.eContents()) {
            // }
            }
        }

    }

    // -------------------------------------------------------------------------
    def MessageConsole findConsole(String name) {
        val plugin = ConsolePlugin.getDefault();
        val conMan = plugin.getConsoleManager();
        val existing = conMan.getConsoles();
        for (var i = 0; i < existing.length; i++)
            if (name.equals(existing.get(i).getName()))
                return existing.get(i) as MessageConsole;
        // no console found, so create a new one
        val myConsole = new MessageConsole(name, null);
        // conMan.addConsoles(new IConsole[] { myConsole });
        val IConsole[] consoles = #[myConsole];
        conMan.addConsoles(consoles);
        return myConsole;
    }

    // -------------------------------------------------------------------------
    def void bringToFront() {
        Display.getDefault().syncExec(new Runnable() {
            override run() {
                // bring Console View to the front
                try {
                    val window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                    val vP = window.getActivePage().showView(CONSOLEVIEWID);
                    vP.setFocus();
                // set done flag
                } catch (Exception e) {
                    // ignore if we cannot bring it to front
                }
            }
        });
    }

// -------------------------------------------------------------------------
}
