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

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import de.cau.cs.kieler.core.annotations.Annotatable;
import de.cau.cs.kieler.core.model.IDomainProvider;

/**
 * Property section for annotatable objects.
 *
 * @author msp
 */
public abstract class AnnotationsPropertySection extends AbstractPropertySection {
    
    /** column index for annotation name. */
    public static final int COL_ANNOTATION = 0;
    /** column index for annotation value. */
    public static final int COL_VALUE = 1;
    
    /** the initial width of the table columns. */
    private static final int DEFAULT_COL_WIDTH = 300;
    
    /** the viewer used to display content. */
    private TreeViewer viewer;
    /** the annotatable object that is currently shown in the property section. */
    private Annotatable annotatable;
    /** the domain model provider used to retrieve annotatable elements. */
    private IDomainProvider domainProvider;
    
    /**
     * Creates a property section for annotations based on the given domain model provider.
     * Subclasses must have a default constructor that creates a suitable domain provider.
     * 
     * @param thedomainProvider the domain model provider
     */
    public AnnotationsPropertySection(final IDomainProvider thedomainProvider) {
        this.domainProvider = thedomainProvider;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void createControls(Composite parent,
            TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);
        final Composite composite = getWidgetFactory().createFlatFormComposite(parent);
        viewer = new TreeViewer(composite, SWT.FULL_SELECTION | SWT.SINGLE
                | SWT.HIDE_SELECTION);
        
        // create columns
        TreeViewerColumn annotationCol = new TreeViewerColumn(viewer, SWT.NONE);
        annotationCol.getColumn().setWidth(DEFAULT_COL_WIDTH);
        annotationCol.getColumn().setText("Annotation");
        annotationCol.getColumn().setResizable(true);
        TreeViewerColumn valueCol = new TreeViewerColumn(viewer, SWT.NONE);
        valueCol.getColumn().setWidth(DEFAULT_COL_WIDTH);
        valueCol.getColumn().setText("Value");
        valueCol.getColumn().setResizable(true);
        viewer.getTree().setHeaderVisible(true);
        viewer.getTree().setLinesVisible(true);

        // create content and label providers
        viewer.setContentProvider(new AnnotationsContentProvider());
        viewer.setLabelProvider(new AnnotationsLabelProvider());
        refresh();
        
        // specify layout of the tree viewer
        FormData formData = new FormData();
        formData.left = new FormAttachment(0, 0);
        formData.right = new FormAttachment(100, 0);
        formData.top = new FormAttachment(0, 0);
        formData.bottom = new FormAttachment(100, 0);
        viewer.getControl().setLayoutData(formData);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean shouldUseExtraSpace() {
        return true;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void refresh() {
        if (getSelection() instanceof IStructuredSelection) {
            IStructuredSelection selection = (IStructuredSelection) getSelection();
            Object object = selection.getFirstElement();
            if (!(object instanceof Annotatable)) {
                object = domainProvider.getElement(object);
            }
            if (annotatable == object) {
                viewer.refresh();
            } else {
                if (object instanceof Annotatable) {
                    annotatable = (Annotatable) object;
                } else {
                    annotatable = null;
                }
                viewer.setInput(object);
            }
        }
    }

}
