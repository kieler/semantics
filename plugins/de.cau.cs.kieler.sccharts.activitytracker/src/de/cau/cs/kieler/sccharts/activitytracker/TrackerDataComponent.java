package de.cau.cs.kieler.sccharts.activitytracker;

import java.util.HashMap;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
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

public class TrackerDataComponent extends JSONObjectDataComponent
        implements IJSONObjectDataComponent {

    static final String CONSOLE_NAME = "SCCharts ActivityTracker";
    
    static final String TRANSITION_NAME = "transition";

    MessageConsoleStream consoleStream = null;

    private HashMap<String, EObject> eObjectMap = new HashMap<String, EObject>();
    
    private State modelRoot = null;

    
    public TrackerDataComponent() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void initialize() throws KiemInitializationException {
        MessageConsole console = findConsole(CONSOLE_NAME);
        consoleStream = console.newMessageStream();
        console.clearConsole();
        eObjectMap = new HashMap<String, EObject>();
        modelRoot = null;
    }

    @Override
    public void wrapup() throws KiemInitializationException {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isProducer() {
        return false;
    }

    @Override
    public boolean isObserver() {
        return true;
    }

    
    public State getModelRoot() {
        if (modelRoot == null) {
            EObject eobj = KiemPlugin.getOpenedModelRootObjects().get(KiemPlugin.getCurrentModelFile());
            if (eobj instanceof State) {
                modelRoot = (State) eobj;
            }
        }
        return modelRoot;            
    }
    
    public boolean isInput(String name) throws KiemExecutionException {
        return isInputOutput(name, true);
    }
    
    public boolean isOutput(String name) throws KiemExecutionException {
        return isInputOutput(name, false);
    }

    public boolean isInputOutput(String name, boolean input) throws KiemExecutionException {
        State scchart = getModelRoot();
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
                    "SCCharts Activity Tracker can only track activity of SCCharts models.", false,
                    false, false, null));
        }
        return false;
    }

    @Override
    public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {

        JSONArray namesArray = jSONObject.names();

        for (int c = 0; c < namesArray.length(); c++) {
            Object obj;
            try {
                obj = namesArray.get(c);
                if (obj instanceof String) {
                    String key = (String) obj;
                    String value = jSONObject.getString(key);
                    // Signal special case
                    if (JSONSignalValues.isSignalValue(jSONObject.get(key))) {
                        if (JSONSignalValues.isPresent(jSONObject.get(key))) {
                            value = "PRESENT";
                        } else {
                            value = "ABSENT";
                        }
                    }
                    if (isInput(key)) {
                        consoleStream.print(key + "=" + value  + ",");
                    }
                }
            } catch (JSONException e) {
            }
        }
        consoleStream.println("");

        
        for (int c = 0; c < namesArray.length(); c++) {
            Object obj;
            try {
                obj = namesArray.get(c);
                if (obj instanceof String) {
                    String key = (String) obj;
                    String value = jSONObject.getString(key);
                    if (key.equals(TRANSITION_NAME)) {
                        String transitions[] = value.split(",");
                        if (transitions != null) {
                            for (String eObjectID : transitions) {
                                EObject eObject = getEObject(eObjectID);
                                if (eObject instanceof Transition) {
                                    Transition transition = (Transition) eObject;
                                    String output = transition.getSourceState().getId() + "->" + transition.getTargetState().getId();  
                                    consoleStream.println(output);
                                }
                            }
                        }
                    }
                }
            } catch (JSONException e) {
            }
        }
        
        
        
        // TODO Auto-generated method stub
        return null;
    }
    
    
    
    protected String getEncodedEObjectId(final EObject eObject) {
        if (eObject.eResource() != null) {
            String uri = eObject.eResource().getURIFragment(eObject);
            uri = (uri.hashCode() + "").replace("-", "M");
            return uri;
        }
        return null;
    }    

    
    /**
     * Gets the eObject to an eObjectID cached by the hash map. With a first call of this function
     * the hash map is lazily filled.
     * 
     * @param eObjectID
     *            the EObject ID
     * @return the EObject
     */
    private EObject getEObject(final String eObjectID) {
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

    // -----------------------------------------------------------------------------

    /**
     * Refreshes and totally rebuilds the eObject hash map.
     */
    protected final void refreshEObjectMap() {
        eObjectMap.clear();
        refreshEObjectMap(this.modelRoot);
    }

    // -----------------------------------------------------------------------------

    /**
     * Recursively calls itself on eObjects that contain children to rebuild the eObject hash map.
     * 
     * @param baseObj
     *            the base EObject
     */
    private void refreshEObjectMap(final EObject baseObj) {
        // Add this item
        String baseObjID = this.getEncodedEObjectId(baseObj);
        if (!eObjectMap.containsKey(baseObjID)) {
            eObjectMap.put(baseObjID, baseObj);
            // Add all children
            TreeIterator<EObject> treeIterator = baseObj.eAllContents();
            while (treeIterator.hasNext()) {
                EObject treeIteratorObject = treeIterator.next();
                refreshEObjectMap(treeIteratorObject);
                // for (EObject treeIteratorObjectChild :
                // treeIteratorObject.eContents()) {
                // }
            }
        }

    }

    // -----------------------------------------------------------------------------

    private MessageConsole findConsole(String name) {
        ConsolePlugin plugin = ConsolePlugin.getDefault();
        IConsoleManager conMan = plugin.getConsoleManager();
        IConsole[] existing = conMan.getConsoles();
        for (int i = 0; i < existing.length; i++)
            if (name.equals(existing[i].getName()))
                return (MessageConsole) existing[i];
        // no console found, so create a new one
        MessageConsole myConsole = new MessageConsole(name, null);
        conMan.addConsoles(new IConsole[] { myConsole });
        return myConsole;
    }
}
