package de.cau.cs.kieler.core.model.trigger;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Anchor;
import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.Guide;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.ViewImpl;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;

import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.AbstractTriggerState;
import de.cau.cs.kieler.core.kivi.ITrigger;
import de.cau.cs.kieler.core.ui.util.CombinedWorkbenchListener;

/**
 * A view management Trigger, that registered as a ResourceSetChangeListener onto any active
 * Diagram editor. It provides TriggerStates about any model changes. There are two different nested
 * states available, one for the semantic model, one for the GMF notation model.
 * @author haf
 *
 */
public class ModelChangeTrigger extends AbstractTrigger implements IPartListener,
    ResourceSetListener {

    private NotificationFilter notationFilter = (NotificationFilter
        .createNotifierTypeFilter(NotationPackage.eINSTANCE.getView())
        .or(NotificationFilter.createNotifierTypeFilter(NotationPackage.eINSTANCE.getStyle()))
        .or(NotificationFilter.createNotifierTypeFilter(NotationPackage.eINSTANCE
            .getLayoutConstraint()))
        .or(NotificationFilter.createNotifierTypeFilter(NotationPackage.eINSTANCE.getAnchor()))
        .or(NotificationFilter.createNotifierTypeFilter(NotationPackage.eINSTANCE.getBendpoints()))
        .or(NotificationFilter.createNotifierTypeFilter(NotationPackage.eINSTANCE.getGuide())));

    @Override
    public void register() {
        CombinedWorkbenchListener.addPartListener(this);
    }

    @Override
    public void unregister() {
        CombinedWorkbenchListener.removePartListener(this);
    }

    @Override
    public void partActivated(IWorkbenchPart part) {
        if (part instanceof DiagramEditor) {
            ((DiagramEditor) part).getEditingDomain().addResourceSetListener(this);
        }

    }

    @Override
    public void partDeactivated(IWorkbenchPart part) {
        if (part instanceof DiagramEditor) {
            ((DiagramEditor) part).getEditingDomain().removeResourceSetListener(this);
        }
    }

    @Override
    public void partBroughtToTop(IWorkbenchPart part) {
    }

    @Override
    public void partClosed(IWorkbenchPart part) {
    }

    @Override
    public void partOpened(IWorkbenchPart part) {
    }

    /**
     * No filter set here. Doing filtering in the resourceSetChanged method. {@inheritDoc}
     */
    @Override
    public NotificationFilter getFilter() {
        return null;
    }

    @Override
    public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
        return null;
    }

    @Override
    public void resourceSetChanged(ResourceSetChangeEvent event) {

        boolean triggeredNotation = false;
        boolean triggeredSemantic = false;

        for (Notification notification : event.getNotifications()) {
            if (!triggeredNotation && notationFilter.matches(notification)) {
                trigger(new ModelDiagramChangeState(event));
                triggeredNotation = true;
            }
            if (!triggeredSemantic && notationFilter.negated().matches(notification)) {
                trigger(new ModelChangeState(event));
                triggeredSemantic = true;
            }
        }
    }

    @Override
    public boolean isAggregatePrecommitListener() {
        return true;
    }

    @Override
    public boolean isPrecommitOnly() {
        return false;
    }

    @Override
    public boolean isPostcommitOnly() {
        return true;
    }

    /**
     * A state about changes of the semantic model.
     * 
     * @author haf
     */
    static public class ModelChangeState extends AbstractTriggerState {

        ResourceSetChangeEvent event = null;

        public ModelChangeState() {
        }

        public ModelChangeState(ResourceSetChangeEvent event) {
            this.event = event;
        }

        @Override
        public Class<? extends ITrigger> getTriggerClass() {
            return ModelChangeTrigger.class;
        }

        public ResourceSetChangeEvent getChange() {
            return event;
        }
    }

    /**
     * A state about changes of the diagram model (currently only the GMF notation model)
     * 
     * @author haf
     */
    static public class ModelDiagramChangeState extends AbstractTriggerState {

        ResourceSetChangeEvent event = null;

        public ModelDiagramChangeState() {
        }

        public ModelDiagramChangeState(ResourceSetChangeEvent event) {
            this.event = event;
        }

        @Override
        public Class<? extends ITrigger> getTriggerClass() {
            return ModelChangeTrigger.class;
        }

        public ResourceSetChangeEvent getChange() {
            return event;
        }
    }

}
