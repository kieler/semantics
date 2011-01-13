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
package de.cau.cs.kieler.core.annotations.ui.properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;

import de.cau.cs.kieler.core.annotations.Annotatable;
import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.core.annotations.ui.AnnotationsUiPlugin;

/**
 * An action for removal of annotations.
 *
 * @author msp
 */
public class RemoveAnnotationAction extends Action {

    /** image for removing an annotation. */
    private static final ImageDescriptor REMOVE_IMAGE = AnnotationsUiPlugin.getImageDescriptor(
            "icons/menu16/remove_annot.gif");
    
    /** the property section for annotations. */
    private AnnotationsPropertySection propertySection;
    
    /**
     * Creates an action for removing annotations.
     * 
     * @param thepropertySection the property section for annotations
     */
    public RemoveAnnotationAction(final AnnotationsPropertySection thepropertySection) {
        this.propertySection = thepropertySection;
        setText("Remove Annotation");
        setImageDescriptor(REMOVE_IMAGE);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        final Annotation annotation = propertySection.getTableSelection();
        TransactionalEditingDomain editingDomain = (TransactionalEditingDomain)
                propertySection.getEditingDomain();
        if (annotation != null && editingDomain != null) {
            final EObject container = annotation.eContainer();
            if (container instanceof Annotatable) {
                editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain,
                        "Remove Annotation") {
                    protected void doExecute() {
                        ((Annotatable) container).getAnnotations().remove(annotation);
                    }
                });
                propertySection.refresh();
            }
        }
    }
    
}
