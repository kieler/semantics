/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.annotations.ui.properties;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.core.annotations.TypedStringAnnotation;
import de.cau.cs.kieler.core.annotations.ui.AnnotationType;


/**
 * A dialog to add new annotations in the properties view.
 *
 * @author msp
 */
public class NewAnnotationDialog extends Dialog {
    
    /** the selected type of annotation. */
    private AnnotationType annotationType;
    /** the text for entering a name. */
    private Text nameText;
    /** the value of the annotation name. */
    private String annotationName;
    
    /**
     * Creates a new annotation dialog.
     * 
     * @param parentShell the parent shell
     */
    protected NewAnnotationDialog(final Shell parentShell) {
        super(parentShell);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected void configureShell(final Shell shell) {
        super.configureShell(shell);
        shell.setText("Add New Annotation");
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean close() {
        annotationName = nameText.getText();
        return super.close();
    }
    
    /** gap between label and control. */
    private static final int HORIZONTAL_GAP = 8;
    /** minimum width of each group. */
    private static final int MINIMUM_WIDTH = 500;
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected Control createDialogArea(final Composite parent) {
        Composite composite = (Composite) super.createDialogArea(parent);
        createTypeGroup(composite);
        createNameGroup(composite);
        return composite;
    }
    
    private static final String[][] TYPE_LABELS = new String[][] {
            { "String", AnnotationType.STRING.toString() },
            { "Integer", AnnotationType.INT.toString() },
            { "Floating point", AnnotationType.FLOAT.toString() },
            { "Boolean", AnnotationType.BOOLEAN.toString() },
            { "Typed string" , AnnotationType.TYPED_STRING.toString() }
    };

    /**
     * Create group for annotation type selection.
     * 
     * @param parent the parent control
     */
    private void createTypeGroup(final Composite parent) {
        Group group = new Group(parent, SWT.NONE);
        group.setText("Select type of annotation");
        GridLayout layout = new GridLayout(1, false);
        layout.horizontalSpacing = HORIZONTAL_GAP;
        group.setLayout(layout);
        for (int i = 0; i < TYPE_LABELS.length; i++) {
            Button radio = new Button(group, SWT.RADIO | SWT.LEFT);
            radio.setSelection(i == 0);
            String[] labelAndValue = TYPE_LABELS[i];
            radio.setText(labelAndValue[0]);
            radio.setData(labelAndValue[1]);
            radio.addSelectionListener(new SelectionAdapter() {
                public void widgetSelected(final SelectionEvent event) {
                    annotationType = AnnotationType.valueOf((String) event.widget.getData());
                }
            });
        }
        annotationType = AnnotationType.STRING;
        GridData gridData = new GridData(SWT.FILL, SWT.TOP, true, false);
        gridData.minimumWidth = MINIMUM_WIDTH;
        group.setLayoutData(gridData);
    }
    
    /**
     * Create group for the annotation name.
     * 
     * @param parent the parent control
     */
    private void createNameGroup(final Composite parent) {
        Group group = new Group(parent, SWT.NONE);
        group.setText("Enter a name for the annotation");
        group.setLayout(new FillLayout());
        nameText = new Text(group, SWT.SINGLE | SWT.BORDER);
        GridData gridData = new GridData(SWT.FILL, SWT.TOP, true, false);
        gridData.minimumWidth = MINIMUM_WIDTH;
        group.setLayoutData(gridData);
    }
    
    /**
     * Create a new annotation based on the dialog contents.
     * 
     * @return a new annotation
     */
    public Annotation createAnnotation() {
        Annotation annotation = annotationType.create();
        annotation.setName(annotationName);
        if (annotationType == AnnotationType.TYPED_STRING) {
            InputDialog inputDialog = new InputDialog(getShell(), "Typed Annotation",
                    "Enter a type for the typed string annotation.", null, null);
            if (inputDialog.open() == InputDialog.OK) {
                ((TypedStringAnnotation) annotation).setType(inputDialog.getValue());
            }
        }
        return annotation;
    }

}
