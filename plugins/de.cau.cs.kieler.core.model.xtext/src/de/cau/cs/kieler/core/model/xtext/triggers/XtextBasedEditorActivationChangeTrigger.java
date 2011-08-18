/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.xtext.triggers;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.ui.util.ResourceUtil;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.AbstractTriggerState;
import de.cau.cs.kieler.core.kivi.ITrigger;
import de.cau.cs.kieler.core.kivi.ITriggerState;
import de.cau.cs.kieler.core.model.xtext.ModelXtextPlugin;
import de.cau.cs.kieler.core.model.xtext.triggers.XtextBasedEditorActivationChangeTrigger.XtextModelChangeState.EventType; // SUPPRESS CHECKSTYLE LineLength
import de.cau.cs.kieler.core.ui.util.CombinedWorkbenchListener;
import de.cau.cs.kieler.core.ui.util.EditorUtils;

/**
 * Implementation of {@link ITrigger} dedicated to Xtext-based editors. Reacts on the following
 * events: opening, receiving the focus, modifying of their content, and closing.
 * 
 * @author chsch
 */
public class XtextBasedEditorActivationChangeTrigger extends AbstractTrigger implements ITrigger,
        IXtextModelListener, IPartListener {

    /**
     * Default constructor, needed by KIVi.
     */
    public XtextBasedEditorActivationChangeTrigger() {
    }

    /**
     * The Xtext-based editor the trigger is attached to.
     */
    private XtextEditor currentEditor = null;

    // private Map<XtextEditor, XtextModelChangeState> editorsTriggerStatesMap
    // = new HashMap<XtextEditor, XtextModelChangeState>();

    /**
     * {@inheritDoc}
     */
    @Override
    public void register() {
        CombinedWorkbenchListener.addPartListener(this);
        this.partActivated(EditorUtils.getLastActiveEditor());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void unregister() {
        CombinedWorkbenchListener.removePartListener(this);
    }

    private void attachToXtextEditor(final XtextEditor editor, final boolean opened) {
        this.currentEditor = editor;

        editor.getDocument().addModelListener(this);
        editor.getDocument().readOnly(new IUnitOfWork.Void<XtextResource>() {

            @Override
            public void process(final XtextResource resource) throws Exception {
                if (checkAndIndicateErrors(resource)) {
                    XtextBasedEditorActivationChangeTrigger.this.trigger(new XtextModelChangeState(
                            editor, (opened ? EventType.OPENED : EventType.FOCUSED), resource));
                }
            }
        });
    }

    private void detachFromCurrentXtextEditor() {
        if (currentEditor != null) {
            currentEditor.getDocument().removeModelListener(this);
        }
        this.currentEditor = null;

    }

    private void xtextEditorClosed(final XtextEditor editor) {
        this.trigger(new XtextModelChangeState(editor, EventType.CLOSED));
    }

    private boolean checkAndIndicateErrors(final XtextResource resource) {
        final String msg = ": Model contains critical errors, hence no the KIVi is not triggered.";
        if (resource.getErrors().isEmpty()) {
            return true;
        } else {
            try {
                IMarker marker;
                marker = ResourceUtil.getUnderlyingFile(resource).createMarker(IMarker.PROBLEM);
                marker.setAttribute(IMarker.MESSAGE, "Test");
                marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
            } catch (CoreException e) {
                StatusManager.getManager().handle(
                        new Status(IStatus.INFO, ModelXtextPlugin.PLUGIN_ID, resource.getURI()
                                .lastSegment() + msg));
            }
            return true;
        }
    }

    /*
     * ------------------------------------------------------ the IXtextModelListener parts
     * ------------------------------------------------------
     */

    /**
     * {@inheritDoc}
     */
    public void modelChanged(final XtextResource resource) {
        if (checkAndIndicateErrors(resource)) {
            // System.out.println(Calendar.getInstance().get(Calendar.MINUTE) + " TRIGGER");
            this.trigger(new XtextModelChangeState(this.currentEditor, EventType.MODIFIED, resource));
        }
    }

    /*
     * ------------------------------------------------------ the IPartListener parts
     * ------------------------------------------------------
     */

    /**
     * {@inheritDoc}
     */
    public void partOpened(final IWorkbenchPart part) {
        if (part instanceof XtextEditor && !part.equals(this.currentEditor)) {
            this.detachFromCurrentXtextEditor();
            this.attachToXtextEditor((XtextEditor) part, true);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partBroughtToTop(final IWorkbenchPart part) {
        if (part instanceof XtextEditor && !part.equals(this.currentEditor)) {
            this.detachFromCurrentXtextEditor();
            this.attachToXtextEditor((XtextEditor) part, false);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partActivated(final IWorkbenchPart part) {
        if (part instanceof XtextEditor && !part.equals(this.currentEditor)) {
            this.detachFromCurrentXtextEditor();
            this.attachToXtextEditor((XtextEditor) part, false);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partDeactivated(final IWorkbenchPart part) {
        // if (part.equals(this.currentEditor)) {
        // this.detachFromCurrentXtextEditor();
        // }
    }

    /**
     * {@inheritDoc}
     */
    public void partClosed(final IWorkbenchPart part) {
        if (part.equals(this.currentEditor)) {
            this.detachFromCurrentXtextEditor();
        }
        if (part instanceof XtextEditor) {
            this.xtextEditorClosed((XtextEditor) part);
        }
    }

    /*
     * ------------------------------------------------------ the ITriggerState implementation
     * ------------------------------------------------------
     */

    /**
     * An {@link ITriggerState} indicating opening, modifying, or closing events of Xtext-based
     * editors.
     * 
     * @author chsch
     */
    public static class XtextModelChangeState extends AbstractTriggerState implements ITriggerState {

        /**
         * Type of event to be denoted.
         */
        public enum EventType {
            /** */
            OPENED,
            /** */
            FOCUSED,
            /** */
            MODIFIED,
            /** */
            CLOSED
        }

        private XtextEditor editor = null;
        private EventType eventType = EventType.OPENED;
        private XtextResource resource = null;

        /**
         * Default constructor.
         */
        public XtextModelChangeState() {
        }

        /**
         * Convenience constructor.
         * 
         * @param theEditor
         *            the editor the event has taken place of.
         * @param theEventType
         *            the event type description.
         */
        public XtextModelChangeState(final XtextEditor theEditor, final EventType theEventType) {
            this(theEditor, theEventType, null);
        }

        /**
         * Complete constructor.
         * 
         * @param theEditor
         *            the editor the event has taken place of.
         * @param theEventType
         *            the event type description.
         * @param theResource
         *            resource that is maintained by the editor. This parameter can be supplied in
         *            addition to the editor in order to avoid the costly grabbing via the
         *            transaction mechanism.
         */
        public XtextModelChangeState(final XtextEditor theEditor, final EventType theEventType,
                final XtextResource theResource) {
            this.editor = theEditor;
            this.eventType = theEventType;
            this.resource = theResource;
        }

        /**
         * {@inheritDoc}
         */
        public Class<? extends ITrigger> getTriggerClass() {
            return XtextBasedEditorActivationChangeTrigger.class;
        }

        /**
         * Getter for the editor field.
         * 
         * @return the value of the editor field.
         */
        public XtextEditor getEditor() {
            return this.editor;
        }

        /**
         * Reveals the path of the denoted editor's {@link org.eclipse.ui.IEditorInput}. That
         * {@link org.eclipse.ui.IEditorInput} is assumed to be a
         * {@link org.eclipse.ui.part.FileEditorInput}.
         * 
         * @return the {@link org.eclipse.core.runtime.IPath} of the denoted editor's
         *         {@link org.eclipse.ui.IEditorInput}.
         */
        public IPath getEditorInputPath() {
            assert this.editor.getEditorInput().getClass().equals(FileEditorInput.class);
            return ((FileEditorInput) this.editor.getEditorInput()).getPath();
        }

        /**
         * Getter for the eventType field.
         * 
         * @return the value of the eventType field.
         */
        public EventType getEventType() {
            return this.eventType;
        }

        /**
         * Getter for the resource field.
         * 
         * @return the value of the resource field.
         */
        public XtextResource getResource() {
            return this.resource;
        }

        /**
         * Setter for the editor field.
         * 
         * @param theEditor
         *            the new value for the editor field.
         * @return the currently manipulated {@link ITriggerState} object.
         */
        public ITriggerState setEditor(final XtextEditor theEditor) {
            this.editor = theEditor;
            return this;
        }

        /**
         * Setter for the eventType field.
         * 
         * @param theEventType
         *            the new value for the eventType field.
         * @return the currently manipulated {@link ITriggerState} object.
         */
        public ITriggerState setEventType(final EventType theEventType) {
            this.eventType = theEventType;
            return this;
        }

        /**
         * Setter for the resource field.
         * 
         * @param theResource
         *            the new value for the resource field.
         * @return the currently manipulated {@link ITriggerState} object.
         */
        public ITriggerState setResource(final XtextResource theResource) {
            this.resource = theResource;
            return this;
        }
    }
}
