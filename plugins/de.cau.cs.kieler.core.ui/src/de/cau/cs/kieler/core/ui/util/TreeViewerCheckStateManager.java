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

package de.cau.cs.kieler.core.ui.util;

import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ITreeContentProvider;


/**
 * Manages check states of checked tree viewers. When an item is checked,
 * the check state manager goes up the hierarchy and updates the check state
 * of the ancestors. (checked if all children are checked, grayed if some,
 * but not all children are checked) Similarly, it goes down the hierarchy
 * marking all children as checked.
 * 
 * @author cds
 */
public class TreeViewerCheckStateManager {
    /**
     * The tree viewer to be managed.
     */
    private CheckboxTreeViewer treeViewer = null;
    
    
    /**
     * Constructs a new instance managing the given tree viewer.
     * 
     * @param viewer the tree viewer to be managed.
     */
    public TreeViewerCheckStateManager(final CheckboxTreeViewer viewer) {
        if (viewer == null) {
            throw new IllegalArgumentException("viewer may not be null.");
        }
        
        // Hook up for selection changes
        treeViewer = viewer;
        treeViewer.addCheckStateListener(new ICheckStateListener() {
            public void checkStateChanged(final CheckStateChangedEvent event) {
                onCheckStateChanged(event.getElement(), event.getChecked());
            }
        });
    }
    
    
    /**
     * Called when an element's check state changes as a result of a user action.
     * 
     * @param element the element whose check state has changed.
     * @param checked whether the element is now checked or not.
     */
    private void onCheckStateChanged(final Object element, final boolean checked) {
        ITreeContentProvider contentProvider =
            (ITreeContentProvider) treeViewer.getContentProvider();
        
        updateAncestors(contentProvider, element);
        updateChildren(contentProvider, element);
    }
    
    /**
     * Recursively updates the check state of the given element's ancestors.
     * 
     * @param contentProvider the tree viewer's content provider.
     * @param element the element whose check state has changed.
     */
    private void updateAncestors(final ITreeContentProvider contentProvider, final Object element) {
        // Get the element's parent
        Object parent = contentProvider.getParent(element);
        if (parent == null) {
            return;
        }
        
        // Find out if the parent has checked, unchecked or grayed children
        Object[] children = contentProvider.getChildren(parent);
        boolean checkedElements = false;
        boolean uncheckedElements = false;
        boolean grayedElements = false;
        
        for (Object child : children) {
            if (treeViewer.getGrayed(child)) {
                grayedElements = true;
            } else if (treeViewer.getChecked(child)) {
                checkedElements = true;
            } else {
                uncheckedElements = true;
            }
        }
        
        // Update the parent's check and gray state. If there is at least one grayed
        // child or if there are both checked and unchecked children, the parent is
        // grayed. If there are only checked children, the parent is checked as well.
        // Otherwise, the parent is unchecked.
        if (grayedElements || (checkedElements && uncheckedElements)) {
            treeViewer.setGrayChecked(parent, true);
        } else if (checkedElements && !uncheckedElements) {
            treeViewer.setChecked(parent, true);
            treeViewer.setGrayed(parent, false);
        } else {
            treeViewer.setChecked(parent, false);
            treeViewer.setGrayed(parent, false);
        }
        
        // Recurse up the ancestor tree
        updateAncestors(contentProvider, parent);
    }
    
    /**
     * Recursively updates the check state of the given element's children.
     * 
     * @param contentProvider the tree viewer's content provider.
     * @param element the element whose check state has changed.
     */
    private void updateChildren(final ITreeContentProvider contentProvider, final Object element) {
        if (treeViewer.getGrayed(element)) {
            // Shouldn't happen
            return;
        }
        
        Object[] children = contentProvider.getChildren(element);
        boolean check = treeViewer.getChecked(element);
        
        for (Object child : children) {
            treeViewer.setChecked(child, check);
            updateChildren(contentProvider, child);
        }
    }
}
