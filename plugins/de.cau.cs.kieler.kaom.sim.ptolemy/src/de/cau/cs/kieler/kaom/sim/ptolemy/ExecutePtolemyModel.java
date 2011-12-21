/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kaom.sim.ptolemy;

import java.io.File;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

import org.json.JSONException;
import org.json.JSONObject;

import ptolemy.actor.kiel.KielerIO;
import ptolemy.actor.Actor;
import ptolemy.actor.CompositeActor;
import ptolemy.actor.Director;
import ptolemy.actor.IOPort;
import ptolemy.actor.IOPortEvent;
import ptolemy.actor.IOPortEventListener;
import ptolemy.actor.Manager;
import ptolemy.domains.modal.modal.ModalController;
import ptolemy.domains.modal.modal.ModalModel;
import ptolemy.domains.modal.kernel.FSMDirector;
import ptolemy.domains.modal.kernel.State;
import ptolemy.domains.modal.kernel.Transition;
import ptolemy.kernel.InstantiableNamedObj;
import ptolemy.kernel.util.KernelException;
import ptolemy.kernel.util.NamedObj;
import ptolemy.kernel.util.StringAttribute;
import ptolemy.moml.MoMLParser;
import ptolemy.data.Token;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;


/**
 * The class ExecutePtolemyModel implements the PtolemyExecutor. This is the component that enables
 * loading and executing (generated) Ptolemy models.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class ExecutePtolemyModel {

    public class ModelOutput {
        public String actorName;
        public Token token;
        public Actor actor;
        public String portName;

        public ModelOutput(String actorName, Actor actor, String portName) {
            this.actorName = actorName;
            this.actor = actor;
            this.token = null;
            this.portName = portName;
        }
    }

    private List<KielerIO> kielerIOList;
    private List<ModelOutput> modelOutputList;

    private JSONObject inputData;

    /** The Ptolemy model to execute. */
    private String PtolemyModel;

    /** The currently active state of the EMF model as FragmentURI. */
    private String currentState;

    /** The Ptolemy manager. */
    private Manager manager;

    // the outer most actor
    private CompositeActor modelActor;
    
    private boolean recursive = false;

    // -------------------------------------------------------------------------

    public boolean isRecursive() {
        return recursive;
    }

    public void setRecursive(boolean recursive) {
        this.recursive = recursive;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new ExecutePtolemyModel.
     * 
     * @param PtolemyModel
     *            the Ptolemy model to execute
     */
    public ExecutePtolemyModel(String PtolemyModel) {
        // System.out.print("Adding Ptolemy to classpath ...");
        // try {
        // DynamicClasspath.addFile("D:\\Studium_SVN\\ptIIplugin\\ptolemy");
        // SyncchartsSimPtolemyPlugin.DEBUG(" done!");
        // } catch (IOException e) {
        // SyncchartsSimPtolemyPlugin.DEBUG(" failed!");
        // e.printStackTrace();
        // }
        this.PtolemyModel = PtolemyModel;
        this.currentState = "";
        this.kielerIOList = null;
    }

    // -------------------------------------------------------------------------

    public void setData(JSONObject jSONObject) {
        this.inputData = jSONObject;
    }

    // -------------------------------------------------------------------------

    public boolean isSignalPresent(String signalName) {
        if (this.inputData.has(signalName)) {
            try {
                Object object = this.inputData.get(signalName);
                return (JSONSignalValues.isPresent(object));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    // -------------------------------------------------------------------------

    public synchronized String[] getInterfaceTokens() {
        if (this.kielerIOList == null) {
            return null;
        }

        String[] keyArray = new String[kielerIOList.size() + modelOutputList.size()];

        for (int c = 0; c < kielerIOList.size(); c++) {
            String signalName = kielerIOList.get(c).getSignalName();
            // remove quotation marks
            signalName = signalName.replaceAll("'", "");
                System.out.print(">>>" + signalName);
            keyArray[c] = signalName;
        }

        for (int c = 0; c < modelOutputList.size(); c++) {
            keyArray[kielerIOList.size() + c] = modelOutputList.get(c).actorName + ":" + modelOutputList.get(c).portName;
        }

        return keyArray;
    }

    // -------------------------------------------------------------------------

    public String[] getModelOutput() {
        String[] returnArray = new String[this.modelOutputList.size()];
        for (int c = 0; c < this.modelOutputList.size(); c++) {
           try {
               returnArray[c] = this.modelOutputList.get(c).token.toString();
           } catch(Exception e) {
               // only get tokens that are readable
           }
        }
        return returnArray;
    }
    
    // -------------------------------------------------------------------------

    /**
     * Gets the currently active state as URIFragment.
     * 
     * @return the current state
     */
    public String getCurrentState() {
        return currentState;
    }

    // -------------------------------------------------------------------------

    /**
     * Trigger the execution to perform another step. This is done asynchronously meaning that the
     * step is not immediately performed but whenever the executing thread is able to perform the
     * next one. <BR>
     * <BR>
     * If the {@link #executionStop()} method is called before this step is actually performed it
     * wont be performed! <BR>
     * <BR>
     * If any KiemExecutionException was thrown in the {@link #run()} method of the thread then it
     * is thrown in here. Note that this exception normally happened in any step performed before
     * the current one but only now will be brought to the users or KIEM attention.
     * 
     * @throws KiemExecutionException
     *             a KiemExecutionException
     */
    public synchronized void executionStep() throws KiemExecutionException {
        try {
            // set all output signals to absent
//            for (int c = 0; c < modelOutputList.size(); c++) {
//                ModelOutput modelOutput = modelOutputList.get(c);
//                modelOutput.present = false;
//            }

            // iterate thru all kielerIOs = set the input signals
//            for (KielerIO kielerIO : kielerIOList) {
//                String signalName = kielerIO.getSignalName();
//                // remove quotation marks
//                signalName = signalName.replaceAll("'", "");
//                kielerIO.setPresent(isSignalPresent(signalName));
//            }

            try {
                // NOW ... TRIGGER A STEP :-)
                manager.iterate();
            } 
            catch (ptolemy.kernel.util.IllegalActionException e) {
                String errorMsg = e.getMessage();
                if (errorMsg.startsWith("Cannot find effigy")) {
                    // we ignore this error
                }
                else {
                    // propagate to outer level
                    throw e;
                }
            }

            // iterate thru all modal models and concatenate
            // the fragment URIs with a colon
            currentState = "";
            List<InstantiableNamedObj> list = extracted();
            currentState = searchForActiveStates(list, null);

        } catch (KernelException e) {
            e.printStackTrace();
            // raise a KiemExecutionException in case of any error
            throw new KiemExecutionException(e.getLocalizedMessage(), true, e);
        }
    }

    // -------------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    private List<InstantiableNamedObj> extracted() {
        return modelActor.entityList();
    }

    // -------------------------------------------------------------------------

    class TokenListener implements IOPortEventListener {
        ModelOutput modelOutput;

        public TokenListener(ModelOutput modelOutput) {
                KaomSimPtolemyPlugin.DEBUG("++++++++++++++TokenListener");
            this.modelOutput = modelOutput;
        }

        public void portEvent(IOPortEvent event) {
                KaomSimPtolemyPlugin.DEBUG("+++++++++++++++PORT EVENT");
            this.modelOutput.token = event.getToken();
        }

    }

    // -------------------------------------------------------------------------

    /**
     * Fills the kielerCombine list by recursively going thru the models elements.
     * 
     * @param modalModelList
     *            the list of ModalModels to fill
     * @param children
     *            the children to walk thru
     */
    @SuppressWarnings("unchecked")
    private void fillModelOutputList(List<ModelOutput> modelOutputList,
            List<InstantiableNamedObj> children, boolean recursive) {
        // if no children at all
        if (children == null)
            return;

        // do *NOT* recursively for children, just a flat top-level search
        for (int c = 0; c < children.size(); c++) {
            Object child = children.get(c);
            // only search children if recursive
            if (recursive && (child instanceof CompositeActor)) {
                CompositeActor compositeActor = (CompositeActor) child;
                fillModelOutputList(modelOutputList, compositeActor.entityList(), recursive);
            }
            
            if (child instanceof Actor) {
                Actor as = (Actor) child;
                    // this is only true for output not for local signals
                    String actorName = as.getFullName();
                    List<Object> ports = ((Actor) as).outputPortList();
                    for (Object port : ports) {
                        if (port instanceof IOPort) {
                            ModelOutput modelOutput = new ModelOutput(actorName, as, ((IOPort) port).getName());
                            ((IOPort) port).addIOPortEventListener(new TokenListener(
                                    modelOutput));
                            modelOutputList.add(modelOutput);
                        }
                    }
                    ports = ((Actor) as).inputPortList();
                    for (Object port : ports) {
                        if (port instanceof IOPort) {
                            ModelOutput modelOutput = new ModelOutput(actorName, as, ((IOPort) port).getName());
                            ((IOPort) port).addIOPortEventListener(new TokenListener(
                                    modelOutput));
                            modelOutputList.add(modelOutput);
                        }
                    }
            }
        }// end while
    }

    // -------------------------------------------------------------------------

    /**
     * Fills the modalModelList by recursively going thru the models elements.
     * 
     * @param modalModelList
     *            the list of ModalModels to fill
     * @param children
     *            the children to walk thru
     */
    @SuppressWarnings("unchecked")
    private void fillKielerIOList(List<KielerIO> kielerIOList, List<InstantiableNamedObj> children) {

        // if no further children
        if (children == null)
            return;

        // do recursively for children
        for (int c = 0; c < children.size(); c++) {
            Object child = children.get(c);
            if (child instanceof CompositeActor) {
                CompositeActor compositeActor = (CompositeActor) child;

                fillKielerIOList(kielerIOList, compositeActor.entityList());
            }

            if (child instanceof KielerIO) {
                kielerIOList.add((KielerIO) child);
            }
            if (child instanceof ModalModel) {
                ModalModel modalModel = (ModalModel) child;
                
                fillKielerIOList(kielerIOList, modalModel.entityList());
            }

            if (child instanceof ModalController) {
                ModalController modalController = (ModalController) child;

                fillKielerIOList(kielerIOList, modalController.entityList());
            }
        }// end while
    }

    // -------------------------------------------------------------------------

    /**
     * Fills the modalModelList by recursively going thru the models elements.
     * 
     * @param modalModelList
     *            the list of ModalModels to fill
     * @param children
     *            the children to walk thru
     */
    @SuppressWarnings("unchecked")
    private String searchForActiveStates(List<InstantiableNamedObj> children, String activeStateName) {

            KaomSimPtolemyPlugin.DEBUG("-------------------");

        // if no further children
        if (children == null)
            return "";
        if (children.size() == 0)
            return "";

        String activeStates = "";
            KaomSimPtolemyPlugin.DEBUG("   ACTIVE:" + activeStateName);

        // do recursively for children
        for (int c = 0; c < children.size(); c++) {
            Object child = children.get(c);

            if (child instanceof State) {
                State state = (State) child;
                if (state.getName().equals(activeStateName)) {
                        KaomSimPtolemyPlugin.DEBUG("STATE (ACTIVE):" + state.getName());
                    // prepare for adding to the string
                    if (!activeStates.equals(""))
                        activeStates += ", ";
                    // add state name
                    activeStates += ((StringAttribute) (state.getAttribute("elementURIFragment")))
                            .getValueAsString();
                } else {
                        KaomSimPtolemyPlugin.DEBUG("STATE (PASSIVE):" + state.getName());
                    continue;
                }
            }

            if (child instanceof ModalModel) {
                ModalModel modalModel = (ModalModel) child;

                // add modal models of the same hierarchy to the list
                // modalModelTree.add(modalModel);
                KaomSimPtolemyPlugin.DEBUG("MODALMODEL:" + modalModel.getName());
                KaomSimPtolemyPlugin.DEBUG("         ->"
                        + modalModel.getController().currentState().getName());

                // if it contains any more children...
                // denote current state
                activeStates += searchForActiveStates(modalModel.entityList(), modalModel
                        .getController().currentState().getName());
            }

            else if (child instanceof CompositeActor) {
                // this could be a NON-active macro state
                CompositeActor compositeActor = (CompositeActor) child;

                String compositeActorName = compositeActor.getName();
                KaomSimPtolemyPlugin.DEBUG("COMPOSITE:" + compositeActorName);

                if (activeStateName == null) {
                    KaomSimPtolemyPlugin.DEBUG("---> CALL INNER STATES (null)");
                    // for active states only search deeper!
                    activeStates += searchForActiveStates(compositeActor.entityList(),
                            activeStateName);
                } else if (compositeActorName.equals(activeStateName)) {
                    KaomSimPtolemyPlugin.DEBUG("---> CALL INNER STATES (name active)");
                    // for active states only search deeper!
                    activeStates += searchForActiveStates(compositeActor.entityList(),
                            activeStateName);
                }
            }

            else if (child instanceof ModalController) {
                ModalController modalController = (ModalController) child;

                // due to the complex hierarchy in moml-files
                // this has to be set here!
                // activeStateName = modalController.currentState().getName();
                // KaomSimPtolemyPlugin.DEBUG("  +ACTIVE:"+activeStateName);

                KaomSimPtolemyPlugin.DEBUG("MODALCONTR:" + modalController.getName());
                KaomSimPtolemyPlugin.DEBUG("         ->" + modalController.currentState().getName());

                ModalController ctrl = modalController;
                Director director = ctrl.getDirector();
                if (director instanceof FSMDirector) {
                    FSMDirector fsmDirector = (FSMDirector) director;
                    // fsmDirector._getLastChosenTransition();
                }
                Transition transition = ctrl.getLastChosenTransition();
                if (transition != null) {
                    KaomSimPtolemyPlugin.DEBUG("LAST CHOSEN TRANSITION:"
                            + transition.getAttribute("EmfFragmentURI").toString());

                } else {
                    KaomSimPtolemyPlugin.DEBUG("LAST CHOSEN TRANSITION == NULL");
                }

                // if it contains any more children...
                // denote current state
                activeStates += searchForActiveStates(modalController.entityList(), modalController
                        .currentState().getName());
            }

        }// end while

        if (!activeStates.equals(""))
            activeStates = ", " + activeStates;

        return activeStates;
    }

    // -------------------------------------------------------------------------

    public synchronized void executionStop() {
        // if there is already a manager (e.g., from previous calls)
        // then try to stop it and create a new one
        try {
            manager.stop();
            manager.wrapup();
        } catch (Exception e) {
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Execution initialize.
     */
    public synchronized void executionInitialize() throws KiemInitializationException {
        KaomSimPtolemyPlugin.DEBUG("#1");
        URI fileURI = URI.createFileURI(new File(PtolemyModel).getAbsolutePath());
        KaomSimPtolemyPlugin.DEBUG("#2");
        URI momlFile = fileURI;
        KaomSimPtolemyPlugin.DEBUG("#3");

        // create new MoML parser
        // make sure Ptolemy is in dependencies
        MoMLParser parser = new MoMLParser();
        KaomSimPtolemyPlugin.DEBUG("#4");

        // modalModelTree = new LinkedList<Object>();
        kielerIOList = new LinkedList<KielerIO>();
        modelOutputList = new LinkedList<ModelOutput>();

        NamedObj ptolemyModel = null;
        try {
            // parse
            ptolemyModel = parser.parse(null, new URL(momlFile.toString()));
            KaomSimPtolemyPlugin.DEBUG("#5");

            parser.reset();
            

            // now execute the model
            if (ptolemyModel != null && ptolemyModel instanceof CompositeActor) {
                KaomSimPtolemyPlugin.DEBUG("#6");

                // check if the parsed model is of correct type
                modelActor = ((CompositeActor) ptolemyModel);

                // replace 
//                ptolemy.actor.lib.gui.Display dummy needed on toplevel
//                ptolemy.kernel.util.Workspace workspace = new ptolemy.kernel.util.Workspace();
//                KEffigy ke = new KEffigy(workspace);
//                Configuration configuration = new Configuration(null);
//                configuration.
//                Configuration.configurations().add(configuration);
                
                
                KaomSimPtolemyPlugin.DEBUG("#7");

                // get the manager that manages execution
                manager = modelActor.getManager();
                if (manager == null) {
                    // there is likely no manager available,
                    // hence create a new one
                    manager = new Manager(modelActor.workspace(), "kieler manager");
                    modelActor.setManager(manager);
                } else {
                    // if there is already a manager (e.g., from previous calls)
                    // then try to stop it and create a new one
                    try {
                        manager.stop();
                        manager.wrapup();
                    } catch (Exception e) {
                    }
                    manager = new Manager(modelActor.workspace(), "kieler manager");
                    modelActor.setManager(manager);
                }

                KaomSimPtolemyPlugin.DEBUG("#8");

                // //go thru the model and add fill the modalModelList (Current States)
                // fillModalModelTree(
                // modalModelTree,
                // modelActor.entityList());

                // go thru the model and add fill the kielerIOList (Inputs)
                fillKielerIOList(kielerIOList, extracted());

                KaomSimPtolemyPlugin.DEBUG("#9");

                // go thru the model and add fill the kielerCombine (Outputs)
                fillModelOutputList(modelOutputList, extracted(), this.isRecursive());

                KaomSimPtolemyPlugin.DEBUG("#10");

                // run the model
                if (manager != null) {

                	// run forest, run!
                    manager.initialize();
                	
                    KaomSimPtolemyPlugin.DEBUG("#11");

                }
            }// end if
        } catch (Exception e) {
            // raise a KiemInitializationException in case of any error
            throw new KiemInitializationException(e.getLocalizedMessage(), true, e);
        }
    }

}
