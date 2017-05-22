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

class TrackerDataComponent extends JSONObjectDataComponent
        implements IJSONObjectDataComponent {

    static final String CONSOLE_NAME = "SCCharts Activity Sequence Tracker";

    static final String TRANSITION_NAME = "transition";

    static final String CONSOLEVIEWID = "org.eclipse.ui.console.ConsoleView";

    MessageConsoleStream consoleStream = null;

    private HashMap<String, EObject> eObjectMap = new HashMap<String, EObject>();

    private State modelRoot = null;


    //-------------------------------------------------------------------------
    
    override initialize() throws KiemInitializationException {
        val console = findConsole(CONSOLE_NAME);
        consoleStream = console.newMessageStream();
        console.clearConsole();
        bringToFront();
        eObjectMap = new HashMap<String, EObject>();
        modelRoot = null;
    }
    
    override isObserver() {
        true
    }
    
    override isProducer() {
        false
    }
    
    override wrapup() throws KiemInitializationException {
        // TODO Auto-generated method stub
    }
    
    //-------------------------------------------------------------------------
    
    override step(JSONObject jSONObject) throws KiemExecutionException {
        val namesArray = jSONObject.names();

        var inputs = "";
        var outputs = "";

        for (var c = 0; c < namesArray.length(); c++) {
            var Object obj;
            try {
                obj = namesArray.get(c);
                if (obj instanceof String) {
                    var key = obj;
                    var value = jSONObject.getString(key);
                    // Signal special case
                    if (JSONSignalValues.isSignalValue(jSONObject.get(key))) {
                        if (JSONSignalValues.isPresent(jSONObject.get(key))) {
                            value = "PRESENT";
                        } else {
                            value = "ABSENT";
                        }
                    }
                    if (isInput(key)) {
                        if (inputs.length() > 0) {
                            inputs += ", ";
                        }
                        inputs += key + "=" + value;
                    }
                    if (isOutput(key)) {
                        if (outputs.length() > 0) {
                            outputs += ", ";
                        }
                        outputs += key + "=" + value;
                    }
                }
            } catch (JSONException e) {
            }
        }

        consoleStream.println("Inputs: " + inputs);

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
                                    val transition = eObject;
                                    var output = transition.getSourceState().getId() + "->"
                                            + transition.getTargetState().getId();
                                    consoleStream.println(output);
                                }
                            }
                        }
                    }
                }
            } catch (JSONException e) {
            }
        }

        consoleStream.println("Outputs: " + outputs);
        consoleStream.println("");

        return null;
    }
    
    //-------------------------------------------------------------------------
    
    def State getModelRoot() {
        if (modelRoot == null) {
            val eobj =
                    KiemPlugin.getOpenedModelRootObjects().get(KiemPlugin.getCurrentModelFile());
            if (eobj instanceof State) {
                modelRoot = eobj;
            }
        }
        return modelRoot;
    }

    //-------------------------------------------------------------------------

    def boolean isInput(String name) throws KiemExecutionException {
        return isInputOutput(name, true);
    }

    def boolean isOutput(String name) throws KiemExecutionException {
        return isInputOutput(name, false);
    }

    //-------------------------------------------------------------------------

    def String getSenderRegion(String name) throws KiemExecutionException {
        val valuedObject = getValuedObject(name);
        
        
        return "";
    }
    
    //-------------------------------------------------------------------------

    def String getReceiverRegion(String name) throws KiemExecutionException {
        return "";
    }

    //-------------------------------------------------------------------------

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

    //-------------------------------------------------------------------------

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

    //-------------------------------------------------------------------------

    def String getEncodedEObjectId(EObject eObject) {
        if (eObject.eResource() != null) {
            var uri = eObject.eResource().getURIFragment(eObject);
            uri = (uri.hashCode() + "").replace("-", "M");
            return uri;
        }
        return null;
    }

    //-------------------------------------------------------------------------

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

    //-------------------------------------------------------------------------

    /**
     * Refreshes and totally rebuilds the eObject hash map.
     */
    def void refreshEObjectMap() {
        eObjectMap.clear();
        refreshEObjectMap(this.modelRoot);
    }

    //-------------------------------------------------------------------------

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
            //TreeIterator<EObject> 
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

    //-------------------------------------------------------------------------

    def MessageConsole findConsole(String name) {
        val plugin = ConsolePlugin.getDefault();
        val conMan = plugin.getConsoleManager();
        val existing = conMan.getConsoles();
        for (var i = 0; i < existing.length; i++)
            if (name.equals(existing.get(i).getName()))
                return existing.get(i) as MessageConsole;
        // no console found, so create a new one
        val myConsole = new MessageConsole(name, null);
        //conMan.addConsoles(new IConsole[] { myConsole });
        val IConsole[] consoles = #[myConsole];
        conMan.addConsoles(consoles);
        return myConsole;
    }

    //-------------------------------------------------------------------------

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

    //-------------------------------------------------------------------------
    
}
