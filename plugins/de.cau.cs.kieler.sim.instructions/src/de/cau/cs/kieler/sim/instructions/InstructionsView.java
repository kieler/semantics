/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.instructions;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.jface.viewers.TreeViewer;

/**
 * The GUI of InstructionsView with keyboard/selection listener. It notifies all data providers
 * on change of selection.
 * 
 * @author cmot
 * 
 */
public class InstructionsView extends ViewPart {

    /** The ID of the view as specified by the extension. */
    public static final String ID = "de.cau.cs.kieler.klots.view.SInstructionsView";

    /** The Constant COLUMN_0_WIDTH. */
    private static final int COLUMN_0_WIDTH = 0;
    private static final String COLUMN_0_TEXT = "";
    private static final String COLUMN_0_TOOLTIP = "";

    /** The Constant COLUMN_1_WIDTH. */
    private static final int COLUMN_1_WIDTH = 200;
    private static final String COLUMN_1_TEXT = "Instruction";
    private static final String COLUMN_1_TOOLTIP = "Instruction's name";

    /** The Constant COLUMN_2_WIDTH. */
    private static final int COLUMN_2_WIDTH = 200;
    private static final String COLUMN_2_TEXT = "Label";
    private static final String COLUMN_2_TOOLTIP = "Instruction's label";

    /** The Constant COLUMN_3_WIDTH. */
    private static final int COLUMN_3_WIDTH = 40;
    private static final String COLUMN_3_TEXT = "Prio";
    private static final String COLUMN_3_TOOLTIP = "Instruction's priority";

    /** This data table view instance. */
    private static InstructionsView instructionsView;

    /** The tree viewer. */
    private TreeViewer viewer;

    //-------------------------------------------------------------------------

    /**
     * Instantiates a new instructions view.
     */
    public  InstructionsView() {
        instructionsView = this;
    }

    //-------------------------------------------------------------------------
    
    /**
     * @return SJInstructionsView
     */
    public static InstructionsView getInstance() {
        return instructionsView;
    }

    //-------------------------------------------------------------------------

    /**
     * This is a callback that will allow us to create the viewer and initialize it.
     * 
     * @param parent
     *            the composite parent
     */
    public void createPartControl(final Composite parent) {
        createViewer(parent);
        viewer.setInput(new InstructionsDataList(viewer));
    }

    //-------------------------------------------------------------------------

    /**
     * Creates the tree table viewer.
     * 
     * @param parent
     *            the composite parent
     */
    private void createViewer(final Composite parent) {
        viewer = new TreeViewer(parent, SWT.HIDE_SELECTION | SWT.MULTI | SWT.H_SCROLL
                | SWT.V_SCROLL | SWT.FULL_SELECTION);
        createColumns(viewer);
        viewer.setContentProvider(new InstructionsDataContentProvider());
        viewer.setLabelProvider(new InstructionsDataLabelProvider());

        viewer.addPostSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(final SelectionChangedEvent event) {
                // If the selection is empty do nothing
                if (event.getSelection().isEmpty()) {
                    return;
                }
                if (event.getSelection() instanceof IStructuredSelection) {
                    IStructuredSelection selection = (IStructuredSelection) event.getSelection();
                    List<InstructionsData> list = new LinkedList<InstructionsData>();

                    InstructionsData data = (InstructionsData) selection.getFirstElement();
                    list.add(data);
                    EObject activeStatement = data.getEObject();
                    
                    // Inform all data providers 
                    List<IInstructionsDataProvider> providerList = InstructionsViewPlugin.getDefault().getInstructionsDataProviderList();
                    for (IInstructionsDataProvider provider : providerList) {
                        provider.selectStatement(activeStatement);
                    }
                    
                    
                    InstructionsDataList instructionDataList = InstructionsDataList.getInstance();
                    int i = instructionDataList.indexOf(data);
                    viewer.getTree().setSelection(viewer.getTree().getItem(i));
                }
            } 
        }); 
    }

    //-------------------------------------------------------------------------

    /**
     * This will create the columns for the table.
     * 
     * @param viewerParam
     *            the DataTableViewer
     */
    private void createColumns(final TreeViewer viewerParam) {
        int[] bounds = { COLUMN_0_WIDTH, COLUMN_1_WIDTH, COLUMN_2_WIDTH, COLUMN_3_WIDTH };
        String[] titles = { COLUMN_0_TEXT, COLUMN_1_TEXT, COLUMN_2_TEXT, COLUMN_3_TEXT };
        String[] toolTip = { COLUMN_0_TOOLTIP, COLUMN_1_TOOLTIP, COLUMN_2_TOOLTIP, COLUMN_3_TOOLTIP };

        for (int i = 0; i < titles.length; i++) {
            TreeViewerColumn column = new TreeViewerColumn(viewerParam, SWT.NONE);
            column.getColumn().setWidth(bounds[i]);
            column.getColumn().setText(titles[i]);
            column.getColumn().setToolTipText(toolTip[i]);
            column.getColumn().setResizable(true);
            column.getColumn().setMoveable(true);
            if (i == 0) {
                column.getColumn().setResizable(false);
            }
        }

        Tree tree = viewerParam.getTree();
        tree.setHeaderVisible(true);
        tree.setLinesVisible(true);
    }

    //-------------------------------------------------------------------------
    
    /**
     * Pass the focus request to the viewer's control.
     */
    public void setFocus() {
        viewer.getControl().setFocus();
    }

    // -------------------------------------------------------------------------

    /**
     * Refreshes the tree viewer.
     */
    public void refreshViewer() {
        viewer.refresh();
        return;
    }

    //-------------------------------------------------------------------------

    /**
     * Updates the view of the parent tree table viewer asynchronously.
     */
    public void refreshViewerAsync() {
        // asynchronously update the table
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                try {
                    viewer.refresh();
                } catch (Exception e) {
                    // ignore errors
                }
            }
        });
    }

    // -------------------------------------------------------------------------
  
}
