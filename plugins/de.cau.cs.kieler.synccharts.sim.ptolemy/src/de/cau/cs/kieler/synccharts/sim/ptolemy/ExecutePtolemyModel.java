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
package de.cau.cs.kieler.synccharts.sim.ptolemy;

import java.io.File;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.json.JSONException;
import org.json.JSONObject;

import ptolemy.actor.Actor;
import ptolemy.actor.CompositeActor;
import ptolemy.actor.IOPort;
import ptolemy.actor.IOPortEvent;
import ptolemy.actor.IOPortEventListener;
import ptolemy.actor.Manager;
import ptolemy.actor.kiel.KielerIO;
import ptolemy.actor.lib.Const;
import ptolemy.data.expr.Parameter;
import ptolemy.domains.modal.kernel.State;
import ptolemy.domains.modal.kernel.Transition;
import ptolemy.domains.modal.modal.ModalController;
import ptolemy.domains.modal.modal.ModalModel;
import ptolemy.kernel.InstantiableNamedObj;
import ptolemy.kernel.util.Attribute;
import ptolemy.kernel.util.KernelException;
import ptolemy.kernel.util.NamedObj;
import ptolemy.kernel.util.StringAttribute;
import ptolemy.moml.MoMLParser;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;

/**
 * The class ExecutePtolemyModel implements the PtolemyExecutor. This is the component that enables
 * loading and executing (generated) Ptolemy models.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class ExecutePtolemyModel {

    /**
     * The Class ModelOutput.
     */
    public class ModelOutput {
        
        /** The signal name. */
        private String signalName;
        
        /** The present. */
        private boolean present;
        
        /**
         * Instantiates a new model output.
         *
         * @param signalName the signal name
         * @param actor the actor
         */
        public ModelOutput(final String signalName, final Const actor) {
            this.signalName = signalName;
            this.present = false;

        }
    }

    /** The kieler io list. */
    private List<KielerIO> kielerIOList;
    
    /** The model output list. */
    private List<ModelOutput> modelOutputList;

    /** The input data. */
    private JSONObject inputData;

    /** The Ptolemy model to execute. */
    private String ptolemyModel;

    /** The Ptolemy manager. */
    private Manager manager;

    // the outer most actor
    /** The model actor. */
    private CompositeActor modelActor;

    /** The currently active state of the EMF model as FragmentURI. */
    private String activeStates;

    /** The currently active transitions of the EMF model as FragmentURI. */
    private String activeTransitions;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new ExecutePtolemyModel.
     * 
     * @param ptolemyModel
     *            the Ptolemy model to execute
     */
    public ExecutePtolemyModel(final String ptolemyModel) {
        // System.out.print("Adding Ptolemy to classpath ...");
        // try {
        // DynamicClasspath.addFile("D:\\Studium_SVN\\ptIIplugin\\ptolemy");
        // SyncchartsSimPtolemyPlugin.DEBUG(" done!");
        // } catch (IOException e) {
        // SyncchartsSimPtolemyPlugin.DEBUG(" failed!");
        // e.printStackTrace();
        // }
        this.ptolemyModel = ptolemyModel;
        this.kielerIOList = null;
        this.activeStates = "";
        this.activeTransitions = "";
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the data.
     *
     * @param jSONObject the new data
     */
    public void setData(final JSONObject jSONObject) {
        this.inputData = jSONObject;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is signal present.
     *
     * @param signalName the signal name
     * @return true, if is signal present
     */
    public boolean isSignalPresent(final String signalName) {
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

    /**
     * Gets the interface signals.
     *
     * @return the interface signals
     */
    public synchronized String[] getInterfaceSignals() {
        if (this.kielerIOList == null) {
            return null;
        }

        String[] keyArray = new String[kielerIOList.size() + modelOutputList.size()];

        for (int c = 0; c < kielerIOList.size(); c++) {
            String signalName = kielerIOList.get(c).getSignalName();
            // remove quotation marks
            signalName = signalName.replaceAll("'", "");
            // System.out.print(">>>" + signalName);
            keyArray[c] = signalName;
        }

        for (int c = 0; c < modelOutputList.size(); c++) {
            keyArray[kielerIOList.size() + c] = modelOutputList.get(c).signalName;
        }

        return keyArray;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the model output present signals.
     *
     * @return the model output present signals
     */
    public String[] getModelOutputPresentSignals() {
        int count = 0;
        for (int c = 0; c < this.modelOutputList.size(); c++) {
            if (this.modelOutputList.get(c).present) {
                count++;
            }
        }
        String[] returnArray = new String[count];
        count = 0;
        for (int c = 0; c < this.modelOutputList.size(); c++) {
            if (this.modelOutputList.get(c).present) {
                returnArray[count++] = this.modelOutputList.get(c).signalName;
            }
        }
        return returnArray;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the model output absent signals.
     *
     * @return the model output absent signals
     */
    public String[] getModelOutputAbsentSignals() {
        int count = 0;
        for (int c = 0; c < this.modelOutputList.size(); c++) {
            if (!this.modelOutputList.get(c).present) {
                count++;
            }
        }
        String[] returnArray = new String[count];
        count = 0;
        for (int c = 0; c < this.modelOutputList.size(); c++) {
            if (!this.modelOutputList.get(c).present) {
                returnArray[count++] = this.modelOutputList.get(c).signalName;
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
    public String getActiveStates() {
        return activeStates;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the currently active state as URIFragment.
     * 
     * @return the current state
     */
    public String getActiveTransitions() {
        return activeTransitions;
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
            for (int c = 0; c < modelOutputList.size(); c++) {
                ModelOutput modelOutput = modelOutputList.get(c);
                modelOutput.present = false;
            }

            // iterate thru all kielerIOs = set the input signals
            for (KielerIO kielerIO : kielerIOList) {
                String signalName = kielerIO.getSignalName();
                // remove quotation marks
                signalName = signalName.replaceAll("'", "");
                kielerIO.setPresent(isSignalPresent(signalName));
            }

            // NOW ... TRIGGER A STEP :-)
            manager.iterate();

            // iterate thru all modal models and concatenate
            // the fragment URIs with a colon
            List<InstantiableNamedObj> list = extracted();
            // reset both Strings first
            activeStates = "";
            activeTransitions = "";

            searchForActiveStatesAndTransitions(list, null);

            // for (int c = 0; c < modalModelList.size(); c++) {
            // ModalModel modalModel = modalModelList.get(c);
            // //if more than one active state
            // if (!currentState.equals(""))
            // currentState += ", ";
            // currentState += ((StringAttribute)modalModel
            // .getController()
            // .currentState()
            // .getAttribute("elementURIFragment"))
            // .getValueAsString();
            // }

        } catch (KernelException e) {
            e.printStackTrace();
            // raise a KiemExecutionException in case of any error
            throw new KiemExecutionException(e.getLocalizedMessage(), true, e);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Extracted.
     *
     * @return the list
     */
    @SuppressWarnings("unchecked")
    private List<InstantiableNamedObj> extracted() {
        return modelActor.entityList();
    }

    // -------------------------------------------------------------------------

    /**
     * The listener interface for receiving presentToken events.
     * The class that is interested in processing a presentToken
     * event implements this interface, and the object created
     * with that class is registered with a component using the
     * component's <code>addPresentTokenListener<code> method. When
     * the presentToken event occurs, that object's appropriate
     * method is invoked.
     *
     * @see PresentTokenEvent
     */
    class PresentTokenListener implements IOPortEventListener {
        
        /** The model output. */
        private ModelOutput modelOutput;

        /**
         * Instantiates a new present token listener.
         *
         * @param modelOutput the model output
         */
        public PresentTokenListener(final ModelOutput modelOutput) {
            SyncchartsSimPtolemyPlugin.debug("+++++++++++++++PresentTokenListener");
            this.modelOutput = modelOutput;
        }

        /**
         * {@inheritDoc}
         */
        public void portEvent(final IOPortEvent event) {
            SyncchartsSimPtolemyPlugin.debug("+++++++++++++++PORT EVENT");
            this.modelOutput.present = true;
        }

    }

    // -------------------------------------------------------------------------

    /**
     * Fills the Combine list by recursively going thru the models elements.
     *
     * @param modelOutputListParam the model output list
     * @param children the children to walk thru
     */
    @SuppressWarnings("unchecked")
    private void fillModelOutputList(final List<ModelOutput> modelOutputListParam,
            final List<InstantiableNamedObj> children) {
        // if no children at all
        if (children == null) {
            return;
        }

        // do *NOT* recursively for children, just a flat top-level search
        for (int c = 0; c < children.size(); c++) {
            Object child = children.get(c);
            if (child instanceof Const) {
                Const as = (Const) child;
                if (as.getAttribute("signal name") != null) {
                    // this is only true for output not for local signals
                    String signalName = ((Parameter) as.getAttribute("signal name"))
                            .getValueAsString();
                    // remove quotation marks
                    signalName = signalName.replaceAll("'", "");
                    signalName = signalName.replaceAll("\"", "");
                    ModelOutput modelOutput = new ModelOutput(signalName, as);
                    List<Object> ports = ((Actor) as).outputPortList();
                    for (Object port : ports) {
                        if (port instanceof IOPort) {
                            ((IOPort) port).addIOPortEventListener(new PresentTokenListener(
                                    modelOutput));
                        }
                    }
                    modelOutputListParam.add(modelOutput);
                }

            }
        } // end while
    }

    // -------------------------------------------------------------------------

    /**
     * Fills the modalModelList by recursively going thru the models elements.
     * 
     * @param kielerIOListParam
     *            the kieler io list
     * @param children
     *            the children to walk thru
     */
    @SuppressWarnings("unchecked")
    private void fillKielerIOList(final List<KielerIO> kielerIOListParam,
            final List<InstantiableNamedObj> children) {

        // if no further children
        if (children == null) {
            return;
        }

        // do recursively for children
        for (int c = 0; c < children.size(); c++) {
            Object child = children.get(c);
            if (child instanceof CompositeActor) {
                CompositeActor compositeActor = (CompositeActor) child;

                fillKielerIOList(kielerIOListParam, compositeActor.entityList());
            }

            // System.out.println(child.getClass().getName());

            if (child.getClass().getName().equals("ptolemy.actor.kiel.KielerIO")) {
                kielerIOListParam.add((KielerIO) child);
            }
            if (child instanceof ModalModel) {
                ModalModel modalModel = (ModalModel) child;

                fillKielerIOList(kielerIOListParam, modalModel.entityList());
            }

            if (child instanceof ModalController) {
                ModalController modalController = (ModalController) child;

                fillKielerIOList(kielerIOListParam, modalController.entityList());
            }
        } // end while
    }

    // -------------------------------------------------------------------------

    /**
     * Fills the modalModelList by recursively going thru the models elements.
     *
     * @param children the children to walk thru
     * @param activeStateName the active state name
     */
    @SuppressWarnings("unchecked")
    private void searchForActiveStatesAndTransitions(final List<InstantiableNamedObj> children,
            final String activeStateName) {

        SyncchartsSimPtolemyPlugin.debug("-------------------");

        // if no further children
        if (children == null) {
            return;
        }
        if (children.size() == 0) {
            return;
        }

        SyncchartsSimPtolemyPlugin.debug("   ACTIVE:" + activeStateName);

        // do recursively for children
        for (int c = 0; c < children.size(); c++) {
            Object child = children.get(c);

            if (child instanceof State) {
                State state = (State) child;
                if (state.getName().equals(activeStateName)) {
                    SyncchartsSimPtolemyPlugin.debug("STATE (ACTIVE):" + state.getName());
                    // prepare for adding to the string
                    if (!activeStates.equals("")) {
                        activeStates += ", ";
                    }
                    // add state name
                    activeStates += ((StringAttribute) (state.getAttribute("elementURIFragment")))
                            .getValueAsString();
                } else {
                    SyncchartsSimPtolemyPlugin.debug("STATE (PASSIVE):" + state.getName());
                    continue;
                }
            }

            if (child instanceof ModalModel) {
                ModalModel modalModel = (ModalModel) child;

                // add modal models of the same hierarchy to the list
                // modalModelTree.add(modalModel);
                SyncchartsSimPtolemyPlugin.debug("MODALMODEL:" + modalModel.getName());
                SyncchartsSimPtolemyPlugin.debug("         ->"
                        + modalModel.getController().currentState().getName());

                // if it contains any more children...
                // denote current state
                searchForActiveStatesAndTransitions(modalModel.entityList(), modalModel
                        .getController().currentState().getName());
            } else if (child instanceof CompositeActor) {
                // this could be a NON-active macro state
                CompositeActor compositeActor = (CompositeActor) child;

                String compositeActorName = compositeActor.getName();
                SyncchartsSimPtolemyPlugin.debug("COMPOSITE:" + compositeActorName);

                if (activeStateName == null) {
                    SyncchartsSimPtolemyPlugin.debug("---> CALL INNER STATES (null)");
                    // for active states only search deeper!
                    searchForActiveStatesAndTransitions(compositeActor.entityList(),
                            activeStateName);
                } else if (compositeActorName.equals(activeStateName)) {
                    SyncchartsSimPtolemyPlugin.debug("---> CALL INNER STATES (name active)");
                    // for active states only search deeper!
                    searchForActiveStatesAndTransitions(compositeActor.entityList(),
                            activeStateName);
                }
            } else if (child instanceof ModalController) {
                ModalController modalController = (ModalController) child;

                // due to the complex hierarchy in moml-files
                // this has to be set here!
                // activeStateName = modalController.currentState().getName();
                // SyncchartsSimPtolemyPlugin.DEBUG("  +ACTIVE:"+activeStateName);

                SyncchartsSimPtolemyPlugin.debug("MODALCONTR:" + modalController.getName());
                SyncchartsSimPtolemyPlugin.debug("         ->"
                        + modalController.currentState().getName());

                ModalController ctrl = modalController;
                // TODO: Fix here for a chain of transitions not only a single one
                // FIXME: as soon as the Ptolemy.jar is update, call getLastChosenTransition()
                List<Transition> transitionList = ctrl.getLastTakenTransitions();
                if (transitionList != null && transitionList.size() > 0) {
                    for (Transition activeTransition : transitionList) {
                        // add state name
                        Attribute attribute = activeTransition.getAttribute("elementURIFragment");
                        if (attribute instanceof StringAttribute) {
                            if (!activeTransitions.equals("")) {
                                activeTransitions += ", ";
                            }
                            activeTransitions += ((StringAttribute) (activeTransition
                                    .getAttribute("elementURIFragment"))).getValueAsString();
                        }
                    }

                } else {
                    SyncchartsSimPtolemyPlugin.debug("LAST CHOSEN TRANSITION == NULL");
                }

                // if it contains any more children...
                // denote current state
                searchForActiveStatesAndTransitions(modalController.entityList(), modalController
                        .currentState().getName());
            }

        } // end while
    }

    // -------------------------------------------------------------------------

    /**
     * Execution stop.
     */
    public synchronized void executionStop() {
        // if there is already a manager (e.g., from previous calls)
        // then try to stop it and create a new one
        try {
            manager.stop();
            manager.wrapup();
        } catch (Exception e) {
            //ignore
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Execution initialize.
     * 
     * @throws KiemInitializationException
     *             the kiem initialization exception
     */
    public synchronized void executionInitialize() throws KiemInitializationException {
        SyncchartsSimPtolemyPlugin.debug("#1");
        URI fileURI = URI.createFileURI(new File(ptolemyModel).getAbsolutePath());
        SyncchartsSimPtolemyPlugin.debug("#2");
        URI momlFile = fileURI;
        SyncchartsSimPtolemyPlugin.debug("#3");

        // create new MoML parser
        // make sure Ptolemy is in dependencies
        MoMLParser parser = new MoMLParser();
        SyncchartsSimPtolemyPlugin.debug("#4");

        // modalModelTree = new LinkedList<Object>();
        kielerIOList = new LinkedList<KielerIO>();
        modelOutputList = new LinkedList<ModelOutput>();

        NamedObj localPtolemyModel = null;
        try {
            // parse
            parser.resetAll();
            localPtolemyModel = parser.parse(null, new URL(momlFile.toString()));
            SyncchartsSimPtolemyPlugin.debug("#5");

            parser.reset();

            // now execute the model
            if (localPtolemyModel != null && localPtolemyModel instanceof CompositeActor) {
                SyncchartsSimPtolemyPlugin.debug("#6");

                // check if the parsed model is of correct type
                modelActor = ((CompositeActor) localPtolemyModel);

                SyncchartsSimPtolemyPlugin.debug("#7");

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
                        // ignore
                    }
                    manager = new Manager(modelActor.workspace(), "kieler manager");
                    modelActor.setManager(manager);
                }

                SyncchartsSimPtolemyPlugin.debug("#8");

                // //go thru the model and add fill the modalModelList (Current States)
                // fillModalModelTree(
                // modalModelTree,
                // modelActor.entityList());

                // go thru the model and add fill the kielerIOList (Inputs)
                fillKielerIOList(kielerIOList, extracted());

                SyncchartsSimPtolemyPlugin.debug("#9");

                // go thru the model and add fill the Combine (Outputs)
                fillModelOutputList(modelOutputList, extracted());

                SyncchartsSimPtolemyPlugin.debug("#10");

                // run the model
                if (manager != null) {
                    // run forest, run!
                    manager.initialize();
                    SyncchartsSimPtolemyPlugin.debug("#11");

                }
            } // end if
        } catch (Exception e) {
            // raise a KiemInitializationException in case of any error
            throw new KiemInitializationException(e.getLocalizedMessage(), true, e);
        }
    }

}
