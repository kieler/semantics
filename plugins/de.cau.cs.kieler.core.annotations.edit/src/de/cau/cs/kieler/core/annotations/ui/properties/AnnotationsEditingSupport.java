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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.core.annotations.AnnotationType;
import de.cau.cs.kieler.core.annotations.BooleanAnnotation;
import de.cau.cs.kieler.core.annotations.FloatAnnotation;
import de.cau.cs.kieler.core.annotations.IntAnnotation;
import de.cau.cs.kieler.core.annotations.StringAnnotation;

/**
 * Editing support for annotation values.
 *
 * @author msp
 */
public class AnnotationsEditingSupport extends EditingSupport {

    /** the annotations property section. */
    private AnnotationsPropertySection propertySection;
    
    /**
     * Creates an editing support for annotation values.
     * 
     * @param viewer the column viewer
     * @param thepropertySection the annotations property section
     */
    public AnnotationsEditingSupport(final ColumnViewer viewer,
            final AnnotationsPropertySection thepropertySection) {
        super(viewer);
        this.propertySection = thepropertySection;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean canEdit(final Object element) {
        return (element instanceof StringAnnotation
                || element instanceof IntAnnotation
                || element instanceof BooleanAnnotation
                || element instanceof FloatAnnotation);
    }

    /** available choices for boolean annotations. */
    private static final String[] BOOLEAN_CHOICES = { "false", "true" };
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected CellEditor getCellEditor(final Object element) {
        Composite parent = (Composite) getViewer().getControl();
        switch (AnnotationType.of((Annotation) element)) {
        case STRING:
        case TYPED_STRING:
            return new TextCellEditor(parent);
        case INT:
            CellEditor intEditor = new TextCellEditor(parent);
            intEditor.setValidator(new ICellEditorValidator() {
                public String isValid(final Object value) {
                    try {
                        Integer.parseInt((String) value);
                        return null;
                    } catch (NumberFormatException exception) {
                        return "Enter an integer number.";
                    }
                }
            });
            return intEditor;
        case FLOAT:
            CellEditor floatEditor = new TextCellEditor(parent);
            floatEditor.setValidator(new ICellEditorValidator() {
                public String isValid(final Object value) {
                    try {
                        Float.parseFloat((String) value);
                        return null;
                    } catch (NumberFormatException exception) {
                        return "Enter a floating point number.";
                    }
                }
            });
            return floatEditor;
        case BOOLEAN:
            ComboBoxCellEditor boolEditor = new ComboBoxCellEditor(parent,
                    BOOLEAN_CHOICES, SWT.READ_ONLY);
            return boolEditor;
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object getValue(final Object element) {
        switch (AnnotationType.of((Annotation) element)) {
        case STRING:
        case TYPED_STRING:
            return ((StringAnnotation) element).getValue();
        case INT:
            return Integer.toString(((IntAnnotation) element).getValue());
        case FLOAT:
            return Float.toString(((FloatAnnotation) element).getValue());
        case BOOLEAN:
            return ((BooleanAnnotation) element).isValue()
                    ? Integer.valueOf(1) : Integer.valueOf(0);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void setValue(final Object element, final Object value) {
        TransactionalEditingDomain editingDomain = (TransactionalEditingDomain)
                propertySection.getEditingDomain();
        if (editingDomain != null) {
            editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain,
                    "Modify Annotation") {
                protected void doExecute() {
                    AnnotationType.setValue((Annotation) element, value);
                }
            });
            getViewer().refresh(element);
        } else {
            IStatus status = new Status(IStatus.ERROR, AnnotationsPropertySection.PLUGIN_ID,
                    "No transactional editing domain is availabe for the current selection.");
            StatusManager.getManager().handle(status, StatusManager.SHOW);
        }
    }

}
