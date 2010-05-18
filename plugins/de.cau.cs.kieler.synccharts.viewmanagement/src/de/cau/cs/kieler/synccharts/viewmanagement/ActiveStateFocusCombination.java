package de.cau.cs.kieler.synccharts.viewmanagement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ResizableCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;

import de.cau.cs.kieler.core.KielerModelException;
import de.cau.cs.kieler.core.model.util.ModelingUtil;
import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionCompartment2EditPart;
import de.cau.cs.kieler.viewmanagement.ACombination;
import de.cau.cs.kieler.viewmanagement.ATrigger;
import de.cau.cs.kieler.viewmanagement.RunLogic;
import de.cau.cs.kieler.viewmanagement.TriggerEventObject;
import de.cau.cs.kieler.viewmanagement.effects.CompartmentCollapseExpandEffect;
import de.cau.cs.kieler.viewmanagement.effects.LayoutEffect;
import de.cau.cs.kieler.viewmanagement.effects.ZoomEffect;

/**
 * A Viewmanagement Combination that reacts on StateActivityTriggers and then
 * executes focus and context by collapsing or expanding state compartments.
 * 
 * @author haf
 */
public class ActiveStateFocusCombination extends ACombination {
    /** The root EditPart of the editor. */
    private EditPart rootEditPart;

    /** The single instance of this plug-in. */
    private static ActiveStateFocusCombination instance;

    long time = -1;
    
    /**
     * Instantiates a new StateCombination.
     */
    public ActiveStateFocusCombination() {
        ActiveStateFocusCombination.instance = this;
        ActiveStateFocusCombination.getInstance().setActive(true);
        this.initialize();
    }

    /**
     * @return single instance of StateCombination
     */
    public static ActiveStateFocusCombination getInstance() {
        return ActiveStateFocusCombination.instance;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets a new root EditPart.
     * 
     * @param rootEditPart
     *            the new root EditPart
     */
    public void setRootEditPart(EditPart rootEditPart) {
        this.rootEditPart = rootEditPart;
    }

    // -------------------------------------------------------------------------

    StateActivityTrigger trigger;
    CompartmentCollapseExpandEffect collapseEffect;

    Map<EditPart, Pair<CompartmentCollapseExpandEffect, Boolean>> expandEffects = new HashMap<EditPart, Pair<CompartmentCollapseExpandEffect, Boolean>>();
    LinkedList<Pair<CompartmentCollapseExpandEffect, Boolean>> currentEffects = new LinkedList<Pair<CompartmentCollapseExpandEffect, Boolean>>();

    @Override
    public boolean evaluate(TriggerEventObject triggerEvent) {
        time = System.currentTimeMillis();
        if (rootEditPart == null && StateActivityObserver.INSTANCE != null) {
            rootEditPart = StateActivityObserver.INSTANCE.getRootEditPart();
        }
        if (rootEditPart != null) {
            // prepare collapse effects for all macro states
            if (expandEffects.size() == 0) {
                try {
                    init();
                } catch (KielerModelException e) {
                    return false;
                }
            }
            // set collapse status for the given macro state
            if (triggerEvent.getAffectedObject() instanceof State) {
                State state = (State) triggerEvent.getAffectedObject();
                // get a List of all parent states
                Collection<EObject> statesToExpand = new ArrayList<EObject>();
                if (state.getRegions().size() > 0) {
                    statesToExpand.add(state);
                }
                // statesToExpand.addAll(ModelingUtil.getAllAncestorsByType(SyncchartsPackage.eINSTANCE
                // .getState(), state));

                for (EObject stateToExpand : statesToExpand) {
                    EditPart editPart = ModelingUtil.getEditPart(stateToExpand, rootEditPart);
                    Pair<CompartmentCollapseExpandEffect, Boolean> config = expandEffects
                            .get(editPart);
                    if (config != null) {
                        if (triggerEvent.getTriggerState()) {
                            config.setSecond(Boolean.TRUE);
                        } else {
                            config.setSecond(Boolean.FALSE);
                        }
                    }
                    currentEffects.add(config);
                }
                return true;
            }

        }
        return false;
    }

    /**
     * Create collapse effects for all macro states (not for simple ones).
     * @throws KielerModelException 
     */
    private void init() throws KielerModelException {
        Collection<EObject> states = ModelingUtil.getAllByType(SyncchartsPackage.eINSTANCE
                .getState(), rootEditPart);
        for (EObject state : states) {
            // remove the root State, because it represents the whole SM and
            // will not be active at
            // all
            if (((State) state).getParentRegion() == null
                    || ((State) state).getParentRegion().getParentState() == null) {
                continue;
            } else if (((State) state).getRegions().size() != 0) { 
                // only collapse macrostates
                EditPart stateEP = ModelingUtil.getEditPart(state, rootEditPart);
                ResizableCompartmentEditPart stateCompartment = getRegionCompartmentEditPart(stateEP);
                CompartmentCollapseExpandEffect expandEffect = new CompartmentCollapseExpandEffect(0);
                // if stateCompartment cannot be found, something in the editor changed. that is an error
                if(stateCompartment == null){
                    throw new KielerModelException("Cannot find compartment to state.",state);
                }
                expandEffect.setTarget(stateCompartment);
                Pair<CompartmentCollapseExpandEffect, Boolean> config = new Pair<CompartmentCollapseExpandEffect, Boolean>(
                        expandEffect, Boolean.FALSE);
                expandEffects.put(stateEP, config);
                currentEffects.add(config);
                
            }
        }
    }

    private ResizableCompartmentEditPart getRegionCompartmentEditPart(EditPart stateEP) {
        if (stateEP instanceof State2EditPart) {
            List<?> children = stateEP.getChildren();
            for (Object child : children) {
                if(child instanceof StateRegionCompartment2EditPart){
                    return (StateRegionCompartment2EditPart)child;
                }
            }
        }
        return null;
    }

    @Override
    public void execute() {
        try {
            // try to collapse and expand states
            for (Pair<CompartmentCollapseExpandEffect, Boolean> config : currentEffects) {
                if (config.getSecond()) {
                    config.getFirst().undo(); // expand
                } else {
                    config.getFirst().execute(); // collapse
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            currentEffects.clear();
        }
        System.out.println("Collapse: "+(System.currentTimeMillis()-time)+"ms");
        time = System.currentTimeMillis();
        //then perform automatic layout
        new LayoutEffect().execute();
        new ZoomEffect().execute();
        System.out.println("Layout: "+(System.currentTimeMillis()-time)+"ms");
    }

    @Override
    public List<ATrigger> getTriggers() {
        List<ATrigger> triggers = new ArrayList<ATrigger>();
        trigger = (StateActivityTrigger) RunLogic.getInstance()
                .getTrigger("State Activity Trigger");
        triggers.add(trigger);
        return triggers;
    }

    @Override
    public void undoEffects() {
        for (Pair<CompartmentCollapseExpandEffect, Boolean> config : expandEffects.values()) {
            config.getFirst().undo();
        }
        // then perform automatic layout
        new LayoutEffect().execute();
        new ZoomEffect().execute();
    }

}
