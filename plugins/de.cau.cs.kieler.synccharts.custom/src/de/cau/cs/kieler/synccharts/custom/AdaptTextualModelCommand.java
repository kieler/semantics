package de.cau.cs.kieler.synccharts.custom;

import java.util.HashMap;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.statushandlers.StatusManager;

import textualsynccharts.TextualTransition;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.Transition;

public class AdaptTextualModelCommand extends AbstractCommand {
    private static SyncchartsFactory syncFac = SyncchartsFactory.eINSTANCE;
    protected TransactionalEditingDomain domain = null;
    protected Diagram diagram = null;

    // protected Collection<State> createdStates = null;

    public AdaptTextualModelCommand(Diagram diagram,
            TransactionalEditingDomain domain) {
        this.diagram = diagram;
        this.domain = domain;
        this.isExecutable = true;
        // this.createdStates = new ArrayList<State>();
    }

    @Override
    public boolean canExecute() {

        return true;
    }

    @Override
    public boolean canUndo() {

        return false;
    }

    @Override
    /**
     * copied from {@link AbstractCommand}
     */
    public Command chain(Command command) {
        class ChainedCompoundCommand extends CompoundCommand {
            public ChainedCompoundCommand() {
                super();
            }

            @Override
            public Command chain(Command c) {
                append(c);
                return this;
            }
        }

        CompoundCommand result = new ChainedCompoundCommand();
        result.append(this);
        result.append(command);
        return result;
    }

    @Override
    public void dispose() {
        // Do nothing.

    }

    public void execute() {
        if (diagram.getElement() != null) {
            if (diagram.getElement() instanceof Region) {
                Region rootRegion = (Region) diagram.getElement();
                // iterate over all regions
                processAllRegions(rootRegion);

                // assert (!(createdStates == null || createdStates.isEmpty()));
                // rootRegion.getInnerStates().addAll(createdStates);
            }
        }
    }

    /**
     * @param rootRegion
     */
    private void processAllRegions(Region rootRegion) {
        // remove the list "innerStates" later
        // EList<State> innerStates = null;
        // EList<Region> innerRegions = null;
        if (!(rootRegion.getInnerStates() == null || rootRegion
                .getInnerStates().isEmpty())) {
            // innerStates = rootRegion.getInnerStates();

            State[] innerStates = rootRegion.getInnerStates().toArray(
                    new State[rootRegion.getInnerStates().size()]);
            for (int i = 0; i < innerStates.length; i++) {

                State s = innerStates[i];
                if (!(s.getOutgoingTransitions() == null || s
                        .getOutgoingTransitions().isEmpty()))
                    markTextualTransitions(s);
                if (!(s.getRegions() == null || s.getRegions().isEmpty())) {
                    // innerRegions = s.getRegions();
                    for (Region r : s.getRegions()) {
                        processAllRegions(r);
                    }
                }
            }
            System.out.println("was zum teufel");
        }

    }

    private void markTextualTransitions(State s) {
        EList<Transition> outgoingTransitions = null;
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        assert (!(s.getOutgoingTransitions() == null || s
                .getOutgoingTransitions().isEmpty()));
        outgoingTransitions = s.getOutgoingTransitions();
        // create a map to mark the textual transitions
        // the key is the index of the transition in the outgoingTransitions
        // list
        // the value is the state id of the state to be created
        for (Transition t : outgoingTransitions) {
            if (t instanceof TextualTransition) {
                TextualTransition textualTransition = (TextualTransition) t;
                assert (textualTransition.getSourceState() != null && textualTransition
                        .getTargetStateProxy() != null);
                map.put(textualTransition.getSourceState()
                        .getOutgoingTransitions().indexOf(textualTransition),
                        textualTransition.getTargetStateProxy());
            }
        }
        if (!(map.isEmpty()) && map != null)
            resolveTargetState(outgoingTransitions, map);
    }

    private void resolveTargetState(
            final EList<Transition> outgoingTransitions,
            final HashMap<Integer, String> map) {
        for (int key : map.keySet()) {
            String stateId = map.get(key);

            State targetState = createTargetState(stateId);
            // setting state attributes should be done in {@link createState}
            // but it is not worth carrying the list outgoingTransitions over

            if (outgoingTransitions.get(key) != null
                    && (outgoingTransitions.get(key) instanceof TextualTransition)) {
                TextualTransition t = (TextualTransition) outgoingTransitions
                        .get(key);
                if (t.isMakeConditional()) {
                    targetState.setType(StateType.CONDITIONAL);
                }
                if (t.isMakeFinal()) {
                    targetState.setIsFinal(true);
                }
            }
            // create a "real" transition with the appropriate target and source
            // states
            State sourceState = outgoingTransitions.get(key).getSourceState();
            Transition transition = createTransition(sourceState, targetState);
            // add the target state to the appropriate region
            if (sourceState.getParentRegion() != null) {
                sourceState.getParentRegion().getInnerStates().add(targetState);
            } else {
                StatusManager
                        .getManager()
                        .handle(
                                new Status(
                                        IStatus.ERROR,
                                        "Textual Model Adapter",
                                        "The textual model adapter has found a state that does not have a parent region. This should not be happening. Please file a bug report with CC to oba.",
                                        null), StatusManager.SHOW);
            }

            // set transition attributes
            // this could be done in {@link createTransition}
            // but it is not worth carrying the list outgoingTransitions over
            if (outgoingTransitions.get(key) != null) {
                if (outgoingTransitions.get(key).isIsImmediate()) {
                    transition.setIsImmediate(true);
                }
                // if (!(outgoingTransitions.get(key).getTriggersAndEffects()
                // .isEmpty()
                // || outgoingTransitions.get(key).getTriggersAndEffects() ==
                // null)) {
                // transition.setTriggersAndEffects(outgoingTransitions.get(
                // key).getTriggersAndEffects());
                // }
            }

            // remove the textual transition
            outgoingTransitions.remove(key);
            // if (!(outgoingTransitions.contains(transition)))
            // outgoingTransitions.set(key, transition);

        }
    }

    private Transition createTransition(final State sourceState,
            final State targetState) {
        Transition transition = syncFac.createTransition();
        sourceState.getOutgoingTransitions().add(transition);
        transition.setSourceState(sourceState);
        transition.setTargetState(targetState);
        return transition;
    }

    private State createTargetState(final String stateId) {
        State newTargetState = syncFac.createState();
        newTargetState.setId(stateId);
        newTargetState.setLabel(newTargetState.getId());
        // createdStates.add(newTargetState);
        return newTargetState;

    }

    /**
     * do nothing.
     */
    public void redo() {
        // do nothing

    }

    /**
     * 
     * @return created states.
     */
    // @Override
    // public Collection<?> getAffectedObjects() {
    // return createdStates;
    // }

    // /**
    // * @return the createdStates
    // */
    // public ArrayList<State> getCreatedStates() {
    // return (ArrayList<State>) createdStates;
    // }
    //
    // /**
    // * @param createdStates
    // * the createdStates to set
    // */
    // public void setCreatedStates(final ArrayList<State> createdStates) {
    // this.createdStates = createdStates;
    // }

}
