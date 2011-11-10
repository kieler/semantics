package de.cau.cs.kieler.synccharts.listener;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import de.cau.cs.kieler.core.model.util.PossiblyEmptyCompoundCommand;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Scope;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * A SyncCharts TriggerListener that handles different label values of
 * SyncCharts, namely the Scope label and ID (i.e. identifiers for Regions and
 * States). When either a new State or Region is created, the label and ID are
 * set automatically to some unique dummy value, e.g. S0, S1, S2 for state name,
 * _S0, _S1, _S2 for State ID and R0, R1, R2 for Region ID.
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

    /**
     * Public constructor setting up filters to react only on necessary events.
     */
    public TriggerListenerIDs() {
        super(NotificationFilter
                .createFeatureFilter(
                        SyncchartsPackage.eINSTANCE.getScope_Label())
                .or(
                /*     NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE.getScope_Id()
                             )).or(*/
                NotificationFilter
                        .createFeatureFilter(SyncchartsPackage.eINSTANCE
                                .getRegion_States()))
                .or(NotificationFilter
                        .createFeatureFilter(SyncchartsPackage.eINSTANCE
                                .getState_Regions())));
    }

    /**
     * Trigger this TriggerListener for all events that the filters match to
     * which are specified in the constructor. {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    protected Command trigger(final TransactionalEditingDomain domain,
            final Notification notification) {
        int type = notification.getEventType();
        Scope targetScope = null;
        if (type == Notification.ADD) {
            targetScope = (Scope) notification.getNewValue();
        } else if (type == Notification.ADD_MANY) {
            /* fix by chsch: handle the addition of multiple scopes */
            return handleScopes((List<Scope>) notification.getNewValue());
        } else if (type == Notification.SET) {
            targetScope = (Scope) notification.getNotifier();
        }
        return handleScope(targetScope);
    }

    /**
     * Handle the ID of a specific Scope which can be a State or a Region. This
     * will be set according to its label. If the label is empty or null, then
     * '_' will be used for ID. ID will be unique within the parent Scope.
     */
    private Command handleScope(final Scope scope) {
        PossiblyEmptyCompoundCommand cc = new PossiblyEmptyCompoundCommand();
        if (scope != null) {
            // we decided to allow empty Region IDs, so don't force them here
            if(scope instanceof Region && 
                    (scope.getLabel() == null || scope.getLabel().equals(""))) {
                cc.append(new SetCommand(getTarget(), scope,
                    SyncchartsPackage.eINSTANCE.getScope_Id(), "")); // empty ID
                return cc;
            }
            String newId = getUniqueString(scope,
                    SyncchartsContentUtil.getValidId(scope.getLabel()));
            cc.append(new SetCommand(getTarget(), scope,
                    SyncchartsPackage.eINSTANCE.getScope_Id(), newId));
        }
        return cc;
    }
    
    /**
     * Handle the ID determination for multiple regions.
     * Delegates {@link TriggerListenerIDs#handleScope(Scope)}
     * 
     * @author chsch
     * 
     * @param scopes a collection of newly added scopes
     * @return a compound command realizing the determination
     */
    private Command handleScopes(final List<Scope> scopes) {
        PossiblyEmptyCompoundCommand cc = new PossiblyEmptyCompoundCommand();
        for (Scope scope : scopes) {
            cc.append(this.handleScope(scope));
        }
        return cc;        
    }

    /**
     * Get a unique String by using a local cache of Strings for a given Scope.
     * This can be necessary if unique String results are not immediately
     * applied to the model and hence asking the model for occupied IDs is not
     * enough.
     */
    private String getUniqueString(final Scope target, final String prefix) {
        EObject parent = target.eContainer();
        UniqueStringCache cache = null;
        EAttribute attribute = SyncchartsPackage.eINSTANCE.getScope_Id();
        for (UniqueStringCache c : caches) {
            // cmot, added "(parent != null && c.getParent() != null) &&" because of a possible null-pointer exception
            if ((parent == null && c.getParent() == null)
                    || (parent != null && c.getParent() != null) && c.getParent().equals(parent)
                    && c.getAttribute().equals(attribute)) {
                cache = c;
            }
        }
        if (cache == null) {
            cache = new UniqueStringCache(parent, attribute);
            caches.add(cache);
        }
        String temp = SyncchartsContentUtil.getNewUniqueString(target, prefix,
                cache);
        cache.add(temp);
        return temp;
    }

    @Override
    public Command transactionAboutToCommit(final ResourceSetChangeEvent event)
            throws RollbackException {
        // when the transaction is finished and a new starts, we can clear the
        // String caches
        if (transaction != null && transaction.isActive()) {
            caches.clear();
        }
        return super.transactionAboutToCommit(event);
    }

}
