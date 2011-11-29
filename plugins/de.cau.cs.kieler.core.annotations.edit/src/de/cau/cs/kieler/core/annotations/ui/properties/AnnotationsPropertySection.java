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

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.MenuAdapter;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import de.cau.cs.kieler.core.annotations.Annotatable;
import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.core.annotations.ui.properties.AddAnnotationAction.AddHow;
import de.cau.cs.kieler.core.model.GraphicalFrameworkService;
import de.cau.cs.kieler.core.model.IGraphicalFrameworkBridge;
import de.cau.cs.kieler.core.ui.UnsupportedPartException;

/**
 * Property section for annotatable objects.
 * 
 * @author msp
 */
public class AnnotationsPropertySection extends AbstractPropertySection {
    
    /** the plugin identifier that contains the annotations property section. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.core.annotations.edit";

    /** column index for annotation name. */
    public static final int COL_ANNOTATION = 0;
    /** column index for annotation value. */
    public static final int COL_VALUE = 1;

    /** the initial width of the table columns. */
    private static final int DEFAULT_COL_WIDTH = 300;
    /** preference name prefix for column width. */
    private static final String PREF_COL_WIDTH = "property.col";

    /** the viewer used to display content. */
    private TreeViewer viewer;
    /** the annotatable object that is currently shown in the property section. */
    private Annotatable annotatable;
    /** the editing domain for changes to the model. */
    private EditingDomain editingDomain;
    /** the widths of the columns of the tree viewer. */
    private int[] columnWidth;
    /** atorage for preferences. */
    private ScopedPreferenceStore preferenceStore;
    
    /**
     * Create and return the preference store.
     * 
     * @return the preference store
     */
    private IPreferenceStore getPreferenceStore() {
        if (preferenceStore == null) {
            preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, PLUGIN_ID);
        }
        return preferenceStore;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void createControls(final Composite parent,
            final TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);
        final Composite composite = getWidgetFactory().createFlatFormComposite(parent);
        viewer = new TreeViewer(composite, SWT.FULL_SELECTION | SWT.SINGLE | SWT.HIDE_SELECTION);
        createColumns();
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

        // create context menu for the tree viewer
        MenuManager menuManager = new MenuManager("#PopupMenu");
        menuManager.add(new AddAnnotationAction(this, AddHow.TOP_LEVEL));
        final Action subAnnotAction = new AddAnnotationAction(this, AddHow.SUB_ANNOT);
        menuManager.add(subAnnotAction);
        final Action removeAnnotAction = new RemoveAnnotationAction(this);
        menuManager.add(removeAnnotAction);
        Menu menu = menuManager.createContextMenu(viewer.getControl());
        menu.addMenuListener(new MenuAdapter() {
            public void menuShown(final MenuEvent event) {
                boolean selected = !viewer.getSelection().isEmpty();
                subAnnotAction.setEnabled(selected);
                removeAnnotAction.setEnabled(selected);
            }
        });
        viewer.getControl().setMenu(menu);
    }

    /**
     * Create the columns for the tree viewer.
     */
    private void createColumns() {
        IPreferenceStore preferenceStore = getPreferenceStore();
        columnWidth = new int[2];

        // create column for annotation name
        final TreeViewerColumn annotationCol = new TreeViewerColumn(viewer, SWT.NONE);
        int width = preferenceStore.getInt(PREF_COL_WIDTH + COL_ANNOTATION);
        if (width <= 2) {
            width = DEFAULT_COL_WIDTH;
        }
        TreeColumn column = annotationCol.getColumn();
        column.setWidth(width);
        column.setText("Annotation");
        column.setResizable(true);
        column.addControlListener(new ControlListener() {
            public void controlResized(ControlEvent e) {
                columnWidth[COL_ANNOTATION] = annotationCol.getColumn().getWidth();
            }

            public void controlMoved(ControlEvent e) {
            }
        });

        // create column for annotation value
        final TreeViewerColumn valueCol = new TreeViewerColumn(viewer, SWT.NONE);
        width = preferenceStore.getInt(PREF_COL_WIDTH + COL_VALUE);
        if (width <= 2) {
            width = DEFAULT_COL_WIDTH;
        }
        column = valueCol.getColumn();
        column.setWidth(width);
        column.setText("Value");
        column.setResizable(true);
        column.addControlListener(new ControlListener() {
            public void controlResized(ControlEvent e) {
                columnWidth[COL_VALUE] = valueCol.getColumn().getWidth();
            }

            public void controlMoved(ControlEvent e) {
            }
        });
        valueCol.setEditingSupport(new AnnotationsEditingSupport(viewer, this));
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
    public void dispose() {
        if (columnWidth != null) {
            IPreferenceStore preferenceStore = getPreferenceStore();
            for (int i = 0; i < columnWidth.length; i++) {
                preferenceStore.setValue(PREF_COL_WIDTH + i, columnWidth[i]);
            }
        }
        super.dispose();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void refresh() {
        if (getSelection() instanceof IStructuredSelection) {
            IStructuredSelection selection = (IStructuredSelection) getSelection();
            Object object = selection.getFirstElement();
            try {
                IGraphicalFrameworkBridge frameworkBridge = GraphicalFrameworkService.getInstance()
                        .getBridge(object);
                if (!(object instanceof Annotatable)) {
                    object = frameworkBridge.getElement(object);
                }
                if (annotatable == object) {
                    viewer.refresh();
                } else {
                    if (object instanceof Annotatable) {
                        annotatable = (Annotatable) object;
                        editingDomain = frameworkBridge.getEditingDomain(selection
                                .getFirstElement());
                    } else {
                        annotatable = null;
                        editingDomain = null;
                    }
                    viewer.setInput(object);
                }
            } catch (UnsupportedPartException e) {
                /* haf: nothing. Cannot refresh if there is no diagram available. */
            }
        }
    }
    
    /**
     * Expands the tree at the given annotation.
     * 
     * @param annotation an annotation that is displayed in the tree viewer
     */
    public void expand(final Annotation annotation) {
        viewer.setExpandedState(annotation, true);
    }

    /**
     * Returns the currently selected annotatable.
     * 
     * @return the selected annotatable
     */
    public Annotatable getAnnotatable() {
        return annotatable;
    }

    /**
     * Returns the editing domain for model changes.
     * 
     * @return the editing domain
     */
    public EditingDomain getEditingDomain() {
        return editingDomain;
    }

    /**
     * Returns the currently selected annotation in the table.
     * 
     * @return the selected annotation
     */
    public Annotation getTableSelection() {
        TreeItem[] selection = viewer.getTree().getSelection();
        if (selection.length > 0 && selection[0].getData() instanceof Annotation) {
            return (Annotation) selection[0].getData();
        } else {
            return null;
        }
    }

}
