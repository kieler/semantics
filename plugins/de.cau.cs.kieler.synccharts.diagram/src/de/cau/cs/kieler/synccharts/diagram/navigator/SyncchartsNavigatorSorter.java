package de.cau.cs.kieler.synccharts.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry;

/**
 * @generated
 */
public class SyncchartsNavigatorSorter extends ViewerSorter {

    /**
     * @generated
     */
    private static final int GROUP_CATEGORY = 7016;

    /**
     * @generated
     */
    public int category(Object element) {
        if (element instanceof SyncchartsNavigatorItem) {
            SyncchartsNavigatorItem item = (SyncchartsNavigatorItem) element;
            return SyncchartsVisualIDRegistry.getVisualID(item.getView());
        }
        return GROUP_CATEGORY;
    }

}
