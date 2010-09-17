package de.cau.cs.kieler.synccharts.listener;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;

import de.cau.cs.kieler.core.annotations.Annotatable;
import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.core.annotations.AnnotationsFactory;
import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.core.annotations.StringAnnotation;

/**
 * Listen to changes of Note elements in the GMF notation model. Such notes work like comments in
 * the graphical editor. This TriggerListener looks for new Notes or changed Note descritpions. If
 * it triggers, it adds a corresponding semantic StringAnnotation from the
 * {@link de.cau.cs.kieler.core.annotations.AnnotationsPackage} to the corresponding semantic object
 * if it is an Annotatable.
 * 
 * @author haf
 * 
 */
public class NoteSynchronizationTriggerListener extends FireOnceTriggerListener {

    static final NotificationFilter addedAnnotationFilter = NotificationFilter
        .createFeatureFilter(AnnotationsPackage.eINSTANCE.getAnnotatable_Annotations())
        .or(NotificationFilter.createFeatureFilter(AnnotationsPackage.eINSTANCE
            .getStringAnnotation_Value()))
        .or(NotificationFilter.createFeatureFilter(AnnotationsPackage.eINSTANCE
            .getNamedObject_Name()));

    static final NotificationFilter addedNoteFilter = NotificationFilter.createEventTypeFilter(
        Notification.ADD).and(
        NotificationFilter.createFeatureFilter(NotationPackage.eINSTANCE
            .getView_PersistedChildren()));

    static final NotificationFilter setDescriptionFilter = NotificationFilter
        .createEventTypeFilter(Notification.SET).and(
            NotificationFilter.createFeatureFilter(NotationPackage.eINSTANCE
                .getDescriptionStyle_Description()));

    static final NotificationFilter removedNoteFilter = NotificationFilter.createEventTypeFilter(
        Notification.REMOVE).and(
        NotificationFilter.createFeatureFilter(NotationPackage.eINSTANCE
            .getView_PersistedChildren()));

    Map<Shape, EObject> annotations = new HashMap<Shape, EObject>();

    public NoteSynchronizationTriggerListener() {
        super(addedNoteFilter.or(removedNoteFilter).or(setDescriptionFilter));
    }

    @Override
    protected Command trigger(TransactionalEditingDomain domain, Notification notification) {
        Object notifier = notification.getNotifier();
        Object newValue = notification.getNewValue();
        Object oldValue = notification.getOldValue();
        switch (notification.getEventType()) {
        case Notification.ADD:
            if (notifier instanceof View && newValue instanceof Shape) {
                addedShape((View) notifier, (Shape) newValue);
            }
            break;
        case Notification.REMOVE:
            if (notifier instanceof View && oldValue instanceof Shape) {
                removedNote((View) notifier, (Shape) oldValue);
            }
            break;
        case Notification.SET:
            if (notifier instanceof Shape && newValue instanceof String) {
                handleNewDescription((Shape) notifier);
            }
            break;
        default:
            /* nothing, the type is not supported */
        }
        return null;
    }

    /**
     * Handle removing of notes in the diagram. Remove the corresponding edge deferred, i.e. in a
     * separate thread sometime later when it can be done outside this read-only transaction.
     */
    private void removedNote(View notifier, Shape note) {
        if (note.getType() != null && note.getType().equals("Note")) {
            EObject semanticPartner = annotations.get(note);
            if (semanticPartner != null) {
                EObject semanticParent = semanticPartner.eContainer();
                String description = note.getDescription();
                if (semanticParent instanceof Annotatable) {
                    EList<Annotation> myAnnotations = ((Annotatable) semanticParent)
                        .getAllAnnotations(null);
                    for (Annotation annotation : myAnnotations) {
                        if (annotation instanceof StringAnnotation
                            && ((StringAnnotation) annotation).getValue().equals(description)) {
                            deferredRemoveAnnotation((Annotatable) semanticParent, annotation);
                        }
                    }
                }
            }
        }
    }

    /**
     * Handle that a Shape has been added. It could be a Note, then handle that.
     */
    private void addedShape(View notifier, Shape newValue) {
        if (newValue.getType() != null && newValue.getType().equals("Note")) {
            handleNewDescription(newValue);
        }
    }

    /**
     * Add the StringAnnotation to an Annotatable for a given Note Shape.
     */
    private void handleNewDescription(Shape note) {
        String description = note.getDescription();

        View parent = (View) note.eContainer();
        EObject semanticParent = (EObject) parent.getElement();

        View connectedNode = getConnectedView(note);
        if (connectedNode != null) {
            EObject semanticPartner = (EObject) connectedNode.getElement();
            addStringComment(semanticPartner, description, note);
        } else {
            /*
             * TODO: this will add an annotation if there is no edge from the note this is a problem
             * because initially every note will not have an edge. So when adding a new note it will
             * be inserted twice
             */
            // addStringComment(semanticParent, description);
        }

    }

    /**
     * Add a StringAnnotation to an Annotatable. Will first remove an old StringAnnotation with
     * empty key "". Will add a new such annotation iff the comment is not null. If it is null, then
     * this operation will simply remove former annotations.
     */
    private void addStringComment(EObject target, String comment, Shape note) {
        if (target instanceof Annotatable) {
            // remove a possible old annotation with no key. We currently support exactly 1 comment
            // annotation
            // Annotation oldAnnotation = ((Annotatable) target).getAnnotation("");
            // if (oldAnnotation != null) {
            // ((Annotatable) target).getAnnotations().remove(oldAnnotation);
            // }
            if (comment != null) {
                StringAnnotation annotation = AnnotationsFactory.eINSTANCE.createStringAnnotation();
                annotation.setValue(comment);
                // annotation.setName("");
                annotations.put(note, annotation);
                // ((Annotatable) target).getAnnotations().add(annotation);
                EditingDomain domain = TransactionUtil.getEditingDomain(target);
                Command cmd = AddCommand.create(domain, target,
                    AnnotationsPackage.eINSTANCE.getAnnotatable_Annotations(), annotation);
                deferredExecuteCommand(cmd, domain);
            }
        }
    }

    /**
     * For a given View get the first View that it is connected by an Edge. Useful to find the
     * object that a Note is connected to. This is exactly one.
     */
    private View getConnectedView(View origin) {
        View connectedNode = null;

        for (Object edge : origin.getSourceEdges()) {
            if (edge instanceof Edge) {
                connectedNode = ((Edge) edge).getTarget();
                break;
            }
        }
        if (connectedNode == null) {
            for (Object edge : origin.getTargetEdges()) {
                if (edge instanceof Edge) {
                    connectedNode = ((Edge) edge).getSource();
                    break;
                }
            }
        }
        return connectedNode;
    }

    /**
     * Execute an EMF Command in a deferred way, i.e. do it in a separate Thread that tries on to
     * execute until it was succesful. This way it can execute in another transaction when this
     * read-only transaction is over.
     */
    void deferredExecuteCommand(final Command cmd, final EditingDomain domain) {
        new Thread() {
            @Override
            public void run() {
                super.run();
                boolean success = false;
                long sleepTime = 100;
                while (!success) {
                    try {
                        cmd.execute();
                        success = true;
                    } catch (Exception e) {
                        try {
                            this.sleep(sleepTime);
                        } catch (InterruptedException e1) {
                            /* nothing */
                        }
                        sleepTime *= 2;
                    }

                }

            }
        }.start();
    }

    /**
     * Remove an Annotation from an Annotatable in a deferred way, i.e. do it in a separate Thread
     * that tries on to execute until it was succesful. This way it can execute in another
     * transaction when this read-only transaction is over. Strangely, the RemoveCommand of EMF
     * won't work here.
     */
    void deferredRemoveAnnotation(final Annotatable annotatable, final Annotation annotation) {
        new Thread() {
            @Override
            public void run() {
                super.run();
                boolean success = false;
                long sleepTime = 100;
                while (!success) {
                    try {
                        annotatable.getAnnotations().remove(annotation);
                        success = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                        try {
                            sleep(sleepTime);
                        } catch (InterruptedException e1) {
                            /* nothing */
                        }
                        sleepTime *= 2;
                    }

                }

            }
        }.start();
    }
}
