package de.cau.cs.kieler.synccharts.contentadapter;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import de.cau.cs.kieler.core.model.util.PossiblyEmptyCompoundCommand;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * A SyncCharts TriggerListener that handles different label values of
 * SyncCharts, namely the State label and ID and the Region ID. When either a
 * new State or Region is created, the label and ID are set automatically to
 * some unique dummy value, e.g. S0, S1, S2 for state name, _S0, _S1, _S2 for
 * State ID and R0, R1, R2 for Region ID.
 * 
 * Setting a State label explicitly will also set the State ID to that value
 * (stripped by whitespace) and sibling IDs of anonymous states will be changed
 * to a new unique one (i.e. a user set label has priority over an automatically
 * set ID)
 * 
 * @author haf
 * 
 */
public class TriggerListenerIDs extends FireOnceTriggerListener {

    List<UniqueStringCache> caches = new ArrayList<UniqueStringCache>();

    public TriggerListenerIDs() {
        super(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE.getState_Label())
                .or(
                        NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                                .getRegion_Id())).or(
                        NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                                .getState_Id())).or(
                        NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                                .getRegion_InnerStates())).or(
                        NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                                .getState_Regions())));
    }

    @Override
    protected Command trigger(TransactionalEditingDomain domain, Notification notification) {
        int type = notification.getEventType();
        PossiblyEmptyCompoundCommand cc = new PossiblyEmptyCompoundCommand();
        if (type == Notification.ADD || type == Notification.SET) {
            EStructuralFeature feature = (EStructuralFeature) notification.getFeature();
            if (feature.equals(SyncchartsPackage.eINSTANCE.getState_Label())) {
                cc.append(handleStateLabel(notification));
            } else if (feature.equals(SyncchartsPackage.eINSTANCE.getState_Id())) {
                cc.append(handleStateId(notification));
            } else if (feature.equals(SyncchartsPackage.eINSTANCE.getRegion_InnerStates())) {
                cc.append(handleNewState(notification));
            } else if (feature.equals(SyncchartsPackage.eINSTANCE.getState_Regions())) {
                cc.append(handleNewRegion(notification));
            }
        }
        
        return cc;
    }

    private Command handleNewRegion(Notification notification) {
        return handleNewRegion((Region) notification.getNewValue());
    }

    private Command handleNewRegion(Region region) {
        PossiblyEmptyCompoundCommand cc = new PossiblyEmptyCompoundCommand();
        if (region != null && region.getId() == null) {
            String newRegionId = getUniqueString(region,
                    SyncchartsPackage.eINSTANCE.getRegion_Id(), "R");
            cc.append(new SetCommand(getTarget(), region, SyncchartsPackage.eINSTANCE
                    .getRegion_Id(), newRegionId));
        }
        // handle contained States recursively
//        for (State state : region.getInnerStates()) {
//            if (state.getLabel() == null) {
//                cc.append(handleNewState(state));
//            } else {
//                cc.append(handleStateLabel(state, state.getLabel()));
//            }
//        }

        return cc;
    }

    private Command handleNewState(Notification notification) {
        return handleNewState((State) notification.getNewValue());
    }

    /**
     * Give a State an initial unique numbered label, e.g. S0, S1, S2... Also
     * set the Id to _S0, _S1, _S2...
     * 
     * @param notification
     * @return
     */
    private Command handleNewState(State state) {
        CompoundCommand cc = new CompoundCommand();
        if (state != null) {
            if (state.getLabel() == null) {
                String newLabel = getUniqueString(state, SyncchartsPackage.eINSTANCE
                        .getState_Label(), "S");
                String newId = ("_" + newLabel).replaceAll("\\s", "_");
                cc.append(new SetCommand(getTarget(), state, SyncchartsPackage.eINSTANCE
                        .getState_Label(), newLabel));
                cc.append(handleStateId(state, newId));
                // handle contained regions recursively
//                for (Region region : state.getRegions()) {
//                    cc.append(handleNewRegion(region));
//                }
            }else{
                cc.append(handleStateLabel(state,state.getLabel()));
            }
        }
        return cc;
    }

    private Command handleStateId(Notification notification) {
        return handleStateId((State) notification.getNotifier(), notification.getNewStringValue());
    }

    /**
     * Set id to new ID and automatically change Ids of anonymous states.
     * 
     * @param state
     * @param newId
     * @return
     */
    private Command handleStateId(State state, String newId) {
        CompoundCommand cc = new CompoundCommand();

        if (newId == null || newId.trim().equals("")) {
            String anonymousId = getUniqueString(state, SyncchartsPackage.eINSTANCE.getState_Id(),
                    "_S");
            return new SetCommand(getTarget(), state, SyncchartsPackage.eINSTANCE.getState_Id(),
                    anonymousId);
        }

        // check whether ID is unique
        Region parentRegion = state.getParentRegion();
        if (parentRegion != null) {
            for (State sibling : parentRegion.getInnerStates()) {
                String siblingId = sibling.getId();
                if (siblingId != null && siblingId.equals(newId)) {
                    // resolve conflict by changing auto generated IDs (for
                    // anonymous states)
                    if (sibling.getLabel() == null || sibling.getLabel().trim().equals("")) {
                        String dummyId = getUniqueString(sibling, SyncchartsPackage.eINSTANCE
                                .getState_Id(), "_S");
                        cc.append(new SetCommand(getTarget(), sibling, SyncchartsPackage.eINSTANCE
                                .getState_Id(), dummyId));
                    }
                }
            }
        }
        cc.append(new SetCommand(getTarget(), state, SyncchartsPackage.eINSTANCE.getState_Id(),
                newId));
        return cc;
    }

    private Command handleStateLabel(Notification notification) {
        return handleStateLabel((State) notification.getNotifier(), notification
                .getNewStringValue());
    }

    /**
     * Set label and set id by replacing whitespace by underscores.
     * 
     * @param notification
     * @return
     */
    private Command handleStateLabel(State state, String newLabel) {
        CompoundCommand cc = new CompoundCommand();
        String newId = newLabel.replaceAll("\\s", "_");
        cc.append(new SetCommand(getTarget(), state, SyncchartsPackage.eINSTANCE.getState_Label(),
                newLabel));
        cc.append(handleStateId(state, newId));

        // handle contained Regions recursively
//        for (Region region : state.getRegions()) {
//            cc.append(handleNewRegion(region));
//        }
        return cc;
    }

    private String getUniqueString(EObject target, EAttribute attribute, String prefix) {
        EObject parent = target.eContainer();
        UniqueStringCache cache = null;
        for (UniqueStringCache c : caches) {
            if ((parent == null && c.getParent() == null) || c.getParent().equals(parent)
                    && c.getAttribute().equals(attribute)) {
                cache = c;
            }
        }
        if (cache == null) {
            cache = new UniqueStringCache(parent, attribute);
            caches.add(cache);
        }
        String temp = SyncchartsContentUtil.getNewUniqueString(target, attribute, prefix, cache);
        cache.add(temp);
        return temp;
    }

    @Override
    public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
        // when the transaction is finished and a new starts, we can clear the
        // String caches
        if (transaction != null && transaction.isActive()) {
            caches.clear();
        }
        return super.transactionAboutToCommit(event);
    }

}
