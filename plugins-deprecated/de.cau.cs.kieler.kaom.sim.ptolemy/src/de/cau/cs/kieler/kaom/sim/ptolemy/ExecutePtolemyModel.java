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
import org.json.JSONException;
import org.json.JSONObject;

import ptolemy.actor.Actor;
import ptolemy.actor.CompositeActor;
import ptolemy.actor.IOPort;
import ptolemy.actor.IOPortEvent;
import ptolemy.actor.IOPortEventListener;
import ptolemy.actor.Manager;
import ptolemy.actor.kiel.KielerIO;
import ptolemy.data.Token;
import ptolemy.domains.modal.kernel.State;
import ptolemy.domains.modal.kernel.Transition;
import ptolemy.domains.modal.modal.ModalController;
import ptolemy.domains.modal.modal.ModalModel;
import ptolemy.kernel.InstantiableNamedObj;
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
 * @author cmot
 * @kieler.ignore (excluded from review process)
 */
public class ExecutePtolemyModel {

    /**
     * The Class ModelOutput.
     */
    public class ModelOutput {

        /** The actor name. */
        private String actorName;

        /** The token. */
        private Token token;

        /** The actor. */
        private Actor actor;

        /** The port name. */
        private String portName;

        /**
         * Instantiates a new model output.
         * 
         * @param actorName
         *            the actor name
         * @param actor
         *            the actor
         * @param portName
         *            the port name
         */
        public ModelOutput(final String actorName, final Actor actor, final String portName) {
            this.actorName = actorName;
            this.setActor(actor);
            this.token = null;
            this.portName = portName;
        }

        /**
         * Gets the actor.
         * 
         * @return the actor
         */
        public Actor getActor() {
            return actor;
        }

        /**
         * Sets the actor.
         * 
         * @param actor
         *            the new actor
         */
        public void setActor(final Actor actor) {
            this.actor = actor;
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

    /** The currently active state of the EMF model as FragmentURI. */
    private String currentState;

    /** The Ptolemy manager. */
    private Manager manager;

    // the outer most actor
    /** The model actor. */
    private CompositeActor modelActor;

    /** The recursive. */
    private boolean recursive = false;

    // -------------------------------------------------------------------------

    /**
     * Checks if is recursive.
     * 
     * @return true, if is recursive
     */
    public boolean isRecursive() {
        return recursive;
    }

    /**
     * Sets the recursive.
     * 
     * @param recursive
     *            the new recursive
     */
    public void setRecursive(final boolean recursive) {
        this.recursive = recursive;
    }

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
        this.currentState = "";
        this.kielerIOList = null;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the data.
     * 
     * @param jSONObject
     *            the new data
     */
    public void setData(final JSONObject jSONObject) {
        this.inputData = jSONObject;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is signal present.
     * 
     * @param signalName
     *            the signal name
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
     * Gets the interface tokens.
     * 
     * @return the interface tokens
     */
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
            keyArray[kielerIOList.size() + c] = modelOutputList.get(c).actorName + ":";
            keyArray[kielerIOList.size() + c] += modelOutputList.get(c).portName;
        }

        return keyArray;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the model output.
     * 
     * @return the model output
     */
    public String[] getModelOutput() {
        String[] returnArray = new String[this.modelOutputList.size()];
        for (int c = 0; c < this.modelOutputList.size(); c++) {
            try {
                returnArray[c] = this.modelOutputList.get(c).token.toString();
            } catch (Exception e) {
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
            try {
                // NOW ... TRIGGER A STEP :-)
                manager.iterate();
            } catch (ptolemy.kernel.util.IllegalActionException e) {
                String errorMsg = e.getMessage();
                // we ignore the following possible error
                if (!errorMsg.startsWith("Cannot find effigy")) {
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
     * The listener interface for receiving token events. The class that is interested in processing
     * a token event implements this interface, and the object created with that class is registered
     * with a component using the component's <code>addTokenListener<code> method. When
     * the token event occurs, that object's appropriate
     * method is invoked.
     * 
     * @see TokenEvent
     */
    class TokenListener implements IOPortEventListener {

        /** The model output. */
        private ModelOutput modelOutput;

        /**
         * Instantiates a new token listener.
         * 
         * @param modelOutput
         *            the model output
         */
        public TokenListener(final ModelOutput modelOutput) {
            KaomSimPtolemyPlugin.dEBUG("++++++++++++++TokenListener");
            this.modelOutput = modelOutput;
        }

        /**
         * {@inheritDoc}
         */
        public void portEvent(final IOPortEvent event) {
            KaomSimPtolemyPlugin.dEBUG("+++++++++++++++PORT EVENT");
            this.modelOutput.token = event.getToken();
        }

    }

    // -------------------------------------------------------------------------

    /**
     * Fills the kielerCombine list by recursively going thru the models elements.
     * 
     * @param modelOutputListParam
     *            the model output list
     * @param children
     *            the children to walk thru
     * @param recursiveParam
     *            the recursive
     */
    @SuppressWarnings("unchecked")
    private void fillModelOutputList(final List<ModelOutput> modelOutputListParam,
            final List<InstantiableNamedObj> children, final boolean recursiveParam) {
        // if no children at all
        if (children == null) {
            return;
        }

        // do *NOT* recursively for children, just a flat top-level search
        for (int c = 0; c < children.size(); c++) {
            Object child = children.get(c);
            // only search children if recursive
            if (recursiveParam && (child instanceof CompositeActor)) {
                CompositeActor compositeActor = (CompositeActor) child;
                fillModelOutputList(modelOutputListParam, compositeActor.entityList(),
                        recursiveParam);
            }

            if (child instanceof Actor) {
                Actor as = (Actor) child;
                // this is only true for output not for local signals
                String actorName = as.getFullName();
                List<Object> ports = ((Actor) as).outputPortList();
                for (Object port : ports) {
                    if (port instanceof IOPort) {
                        ModelOutput modelOutput = new ModelOutput(actorName, as,
                                ((IOPort) port).getName());
                        ((IOPort) port).addIOPortEventListener(new TokenListener(modelOutput));
                        modelOutputListParam.add(modelOutput);
                    }
                }
                ports = ((Actor) as).inputPortList();
                for (Object port : ports) {
                    if (port instanceof IOPort) {
                        ModelOutput modelOutput = new ModelOutput(actorName, as,
                                ((IOPort) port).getName());
                        ((IOPort) port).addIOPortEventListener(new TokenListener(modelOutput));
                        modelOutputListParam.add(modelOutput);
                    }
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

            if (child instanceof KielerIO) {
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
     * @param children
     *            the children to walk thru
     * @param activeStateName
     *            the active state name
     * @return the string
     */
    @SuppressWarnings("unchecked")
    private String searchForActiveStates(final List<InstantiableNamedObj> children,
            final String activeStateName) {

        KaomSimPtolemyPlugin.dEBUG("-------------------");

        // if no further children
        if (children == null) {
            return "";
        }
        if (children.size() == 0) {
            return "";
        }

        String activeStates = "";
        KaomSimPtolemyPlugin.dEBUG("   ACTIVE:" + activeStateName);

        // do recursively for children
        for (int c = 0; c < children.size(); c++) {
            Object child = children.get(c);

            if (child instanceof State) {
                State state = (State) child;
                if (state.getName().equals(activeStateName)) {
                    KaomSimPtolemyPlugin.dEBUG("STATE (ACTIVE):" + state.getName());
                    // prepare for adding to the string
                    if (!activeStates.equals("")) {
                        activeStates += ", ";
                    }
                    // add state name
                    activeStates += ((StringAttribute) (state.getAttribute("elementURIFragment")))
                            .getValueAsString();
                } else {
                    KaomSimPtolemyPlugin.dEBUG("STATE (PASSIVE):" + state.getName());
                    continue;
                }
            }

            if (child instanceof ModalModel) {
                ModalModel modalModel = (ModalModel) child;

                // add modal models of the same hierarchy to the list
                // modalModelTree.add(modalModel);
                KaomSimPtolemyPlugin.dEBUG("MODALMODEL:" + modalModel.getName());
                KaomSimPtolemyPlugin.dEBUG("         ->"
                        + modalModel.getController().currentState().getName());

                // if it contains any more children...
                // denote current state
                activeStates += searchForActiveStates(modalModel.entityList(), modalModel
                        .getController().currentState().getName());
            } else if (child instanceof CompositeActor) {
                // this could be a NON-active macro state
                CompositeActor compositeActor = (CompositeActor) child;

                String compositeActorName = compositeActor.getName();
                KaomSimPtolemyPlugin.dEBUG("COMPOSITE:" + compositeActorName);

                if (activeStateName == null) {
                    KaomSimPtolemyPlugin.dEBUG("---> CALL INNER STATES (null)");
                    // for active states only search deeper!
                    activeStates += searchForActiveStates(compositeActor.entityList(),
                            activeStateName);
                } else if (compositeActorName.equals(activeStateName)) {
                    KaomSimPtolemyPlugin.dEBUG("---> CALL INNER STATES (name active)");
                    // for active states only search deeper!
                    activeStates += searchForActiveStates(compositeActor.entityList(),
                            activeStateName);
                }
            } else if (child instanceof ModalController) {
                ModalController modalController = (ModalController) child;

                // due to the complex hierarchy in moml-files
                // this has to be set here!
                // activeStateName = modalController.currentState().getName();
                // KaomSimPtolemyPlugin.DEBUG("  +ACTIVE:"+activeStateName);

                KaomSimPtolemyPlugin.dEBUG("MODALCONTR:" + modalController.getName());
                KaomSimPtolemyPlugin
                        .dEBUG("         ->" + modalController.currentState().getName());

                ModalController ctrl = modalController;
                // We need this to display the last chosen transition
                // in updated Ptolemy version this might fail!
                // This is a reason to not update Ptolemy or use an auxiliary signal based
                // approach.
                // cmot, Jun 28 2012
                @SuppressWarnings("deprecation")
                Transition transition = ctrl.getLastChosenTransition();
                if (transition != null) {
                    KaomSimPtolemyPlugin.dEBUG("LAST CHOSEN TRANSITION:"
                            + transition.getAttribute("EmfFragmentURI").toString());

                } else {
                    KaomSimPtolemyPlugin.dEBUG("LAST CHOSEN TRANSITION == NULL");
                }

                // if it contains any more children...
                // denote current state
                activeStates += searchForActiveStates(modalController.entityList(), modalController
                        .currentState().getName());
            }

        } // end while

        if (!activeStates.equals("")) {
            activeStates = ", " + activeStates;
        }

        return activeStates;
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
        KaomSimPtolemyPlugin.dEBUG("#1");
        URI fileURI = URI.createFileURI(new File(ptolemyModel).getAbsolutePath());
        KaomSimPtolemyPlugin.dEBUG("#2");
        URI momlFile = fileURI;
        KaomSimPtolemyPlugin.dEBUG("#3");

        // create new MoML parser
        // make sure Ptolemy is in dependencies
        MoMLParser parser = new MoMLParser();
        KaomSimPtolemyPlugin.dEBUG("#4");

        // modalModelTree = new LinkedList<Object>();
        kielerIOList = new LinkedList<KielerIO>();
        modelOutputList = new LinkedList<ModelOutput>();

        NamedObj localPtolemyModel = null;
        try {
            // parse
            localPtolemyModel = parser.parse(null, new URL(momlFile.toString()));
            KaomSimPtolemyPlugin.dEBUG("#5");

            parser.reset();

            // now execute the model
            if (localPtolemyModel != null && localPtolemyModel instanceof CompositeActor) {
                KaomSimPtolemyPlugin.dEBUG("#6");

                // check if the parsed model is of correct type
                modelActor = ((CompositeActor) localPtolemyModel);

                // replace
                // ptolemy.actor.lib.gui.Display dummy needed on toplevel
                // ptolemy.kernel.util.Workspace workspace = new ptolemy.kernel.util.Workspace();
                // KEffigy ke = new KEffigy(workspace);
                // Configuration configuration = new Configuration(null);
                // configuration.
                // Configuration.configurations().add(configuration);

                KaomSimPtolemyPlugin.dEBUG("#7");

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
                        //ignore
                    }
                    manager = new Manager(modelActor.workspace(), "kieler manager");
                    modelActor.setManager(manager);
                }

                KaomSimPtolemyPlugin.dEBUG("#8");

                // //go thru the model and add fill the modalModelList (Current States)
                // fillModalModelTree(
                // modalModelTree,
                // modelActor.entityList());

                // go thru the model and add fill the kielerIOList (Inputs)
                fillKielerIOList(kielerIOList, extracted());

                KaomSimPtolemyPlugin.dEBUG("#9");

                // go thru the model and add fill the kielerCombine (Outputs)
                fillModelOutputList(modelOutputList, extracted(), this.isRecursive());

                KaomSimPtolemyPlugin.dEBUG("#10");

                // run the model
                if (manager != null) {

                    // run forest, run!
                    manager.initialize();

                    KaomSimPtolemyPlugin.dEBUG("#11");

                }
            } // end if
        } catch (Exception e) {
            // raise a KiemInitializationException in case of any error
            throw new KiemInitializationException(e.getLocalizedMessage(), true, e);
        }
    }

}
