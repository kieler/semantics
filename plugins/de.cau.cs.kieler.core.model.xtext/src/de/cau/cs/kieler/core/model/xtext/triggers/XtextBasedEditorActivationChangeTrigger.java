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
package de.cau.cs.kieler.core.model.xtext;

import java.util.Calendar;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.AbstractTriggerState;
import de.cau.cs.kieler.core.kivi.ITrigger;
import de.cau.cs.kieler.core.kivi.ITriggerState;
import de.cau.cs.kieler.core.model.xtext.XtextBasedEditorActivationChangeTrigger.XtextModelChangeState.EventType;
import de.cau.cs.kieler.core.ui.util.CombinedWorkbenchListener;
import de.cau.cs.kieler.core.ui.util.EditorUtils;


/**
 * Implementation of {@link ITrigger} dedicated to Xtext-based editors.
 * Reacts on the following events: opening, receiving the focus, modifying of their content, and closing.   
 * 
 * @author chsch
 */
public class XtextBasedEditorActivationChangeTrigger extends AbstractTrigger implements
        ITrigger, IXtextModelListener, IPartListener, IPartListener2 {

    
    /**
     * Default constructor, needed by KIVi.
     */
    public XtextBasedEditorActivationChangeTrigger() {        
    }
    
    /**
     * The Xtext-based editor the trigger is attached to.
     */
    private XtextEditor currentEditor = null;
//    private Map<XtextEditor, XtextModelChangeState> editorsTriggerStatesMap
//            = new HashMap<XtextEditor, XtextModelChangeState>();

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
            public void process(XtextResource resource) throws Exception {
                if (resource.getErrors().isEmpty()) {
                    XtextBasedEditorActivationChangeTrigger.this.trigger(new XtextModelChangeState(
                            editor, (opened ? EventType.OPENED : EventType.FOCUSED), resource));
                } else {
                    StatusManager.getManager().addLoggedStatus(
                            new Status(IStatus.INFO, ModelXtextPlugin.PLUGIN_ID, resource.getURI()
                                    .lastSegment() + ": Model contains critical errors."));
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
    
    private void xtextEditorClosed(XtextEditor editor) {
        this.trigger(new XtextModelChangeState(editor, EventType.CLOSED));
    }
    
    
    /* ------------------------------------------------------ 
     * the IXtextModelListener parts
     * ------------------------------------------------------ */
    
    /**
     * {@inheritDoc}
     */
    public void modelChanged(XtextResource resource) {
        if (resource.getErrors().isEmpty()) {
            System.out.println(Calendar.getInstance().get(Calendar.MINUTE) + " TRIGGER");
            this.trigger(new XtextModelChangeState(this.currentEditor, EventType.MODIFIED, resource));
        }
    }
    
    
    /* ------------------------------------------------------ 
     * the IPartListener parts
     * ------------------------------------------------------ */
    
    /**
     * {@inheritDoc}
     */
    public void partOpened(IWorkbenchPart part) {
        if (part instanceof XtextEditor
                && !part.equals(this.currentEditor)) {
            this.detachFromCurrentXtextEditor();
            this.attachToXtextEditor((XtextEditor) part, true);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partBroughtToTop(IWorkbenchPart part) {
        if (part instanceof XtextEditor
                && !part.equals(this.currentEditor)) {
            this.detachFromCurrentXtextEditor();
            this.attachToXtextEditor((XtextEditor) part, false);
        }
    }
    
    /**
     * {@inheritDoc}
     */
    public void partActivated(IWorkbenchPart part) {
        if (part instanceof XtextEditor
                && !part.equals(this.currentEditor)) {
            this.detachFromCurrentXtextEditor();
            this.attachToXtextEditor((XtextEditor) part, false);
        }
    }
    
    /**
     * {@inheritDoc}
     */
    public void partDeactivated(IWorkbenchPart part) {
//        if (part.equals(this.currentEditor)) {
//            this.detachFromCurrentXtextEditor();
//        }
    }
    
    /**
     * {@inheritDoc}
     */
    public void partClosed(IWorkbenchPart part) {
        if (part.equals(this.currentEditor)) {
            this.detachFromCurrentXtextEditor();
        }
        if (part instanceof XtextEditor) {
            this.xtextEditorClosed((XtextEditor) part);
        }
    }


    /* ------------------------------------------------------ 
     * the ITriggerState implementation
     * ------------------------------------------------------ */
    
    /**
     * An {@link ITriggerState} indicating opening, modifying, or closing events of Xtext-based editors.
     * 
     * @author chsch
     */    
    public static class XtextModelChangeState extends AbstractTriggerState implements ITriggerState {
        
        public enum EventType { OPENED, FOCUSED, MODIFIED, CLOSED }
        
        public static final int NONE = 1; 
        public static final int MODEL_DISPOSED = 1; 
        
        private XtextEditor editor = null;
        private EventType eventType = EventType.OPENED;
        private XtextResource resource = null;
        
        public XtextModelChangeState() {            
        }
        
        public XtextModelChangeState(XtextEditor theEditor, EventType theEventType) {
            this(theEditor, theEventType, null);
        }

        public XtextModelChangeState(XtextEditor theEditor, EventType theEventType, XtextResource theResource) {
            this.editor = theEditor;
            this.eventType = theEventType;
            this.resource = theResource;
        }

        public Class<? extends ITrigger> getTriggerClass() {
            return XtextBasedEditorActivationChangeTrigger.class;
        }
        
        public XtextEditor getEditor() {
            return this.editor;
        }
        
        public EventType getEventType() {
            return this.eventType;
        }
        
        public XtextResource getResource() {
            return this.resource;
        }
        
        public ITriggerState setEditor(XtextEditor theEditor) {
            this.editor = theEditor;
            return this;
        }
        
        public ITriggerState setEventType(EventType theEventType) {
            this.eventType = theEventType;
            return this;
        }
        
//        /**
//         * {@inheritDoc}
//         */
//        @Override
//        public void merge(final ITriggerState previous) {
//            if (previous instanceof XtextModelChangeState
//                    && this.resource.equals(((XtextModelChangeState) previous).resource)) {
//            }
//        }
        
    }


    public void partOpened(IWorkbenchPartReference partRef) {
    }
    
    
    public void partActivated(IWorkbenchPartReference partRef) {
        // TODO Auto-generated method stub
        
    }


    public void partVisible(IWorkbenchPartReference partRef) {
        // TODO Auto-generated method stub
        
    }
    
    
    public void partBroughtToTop(IWorkbenchPartReference partRef) {
        // TODO Auto-generated method stub
        
    }


    public void partDeactivated(IWorkbenchPartReference partRef) {
//        if (partRef.equals(currentEditor)) {
//            this.detachFromXtextEditor(currentEditor);
//        }
    }


    public void partHidden(IWorkbenchPartReference partRef) {
        if (partRef.equals(currentEditor)) {
            this.detachFromCurrentXtextEditor();
        }
    }


    public void partClosed(IWorkbenchPartReference partRef) {
        if (partRef.equals(currentEditor)) {
            this.detachFromCurrentXtextEditor();
        }
    }
    
    
    public void partInputChanged(IWorkbenchPartReference partRef) {
        // TODO Auto-generated method stub
        
    }
}
