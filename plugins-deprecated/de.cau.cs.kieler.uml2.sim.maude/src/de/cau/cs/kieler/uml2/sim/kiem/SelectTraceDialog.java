/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.uml2.sim.kiem;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

/**
 * The Class AddDataComponentDialog.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2009-01-15 proposed yellow
 * 
 */
public class SelectTraceDialog extends Dialog {

    /** The Constant MARGIN_WIDTH_AND_HEIGHT. */
    private static final int MARGIN_WIDTH_AND_HEIGHT = 15;

    /** The Constant FORM_WIDTH. */
    private static final int FORM_WIDTH = 400;

    /** The Constant FORM_HEIGHT. */
    private static final int FORM_HEIGHT = 300;

    /** The Constant DISABLED_COLOR_GRAY. */
    private static final int DISABLED_COLOR_GRAY = 150;

    /** The basic dialog SWT component. */
    private SelectTraceDialog dialog;

    /** The temporary table that allows the user to select components. */
    private Table table;

    /** The list that holds the currently selected components. */
    private List<String> selectedList;

    /**
     * The component list should hold all available default components and is used to update the
     * table.
     */
    private List<String> componentList;

    /** The title of the dialog. */
    private String title;

    /** The selected index. */
    private int selectedIndex;

    /**
     * The DataComponentWrapperList. It is used to check for multiple instances. It should hold all
     * DataComponentWrapper's that are in the original list of the KiemView to check if another
     * instance of a DataComponent can safely be added.
     */
    private List<String> forbiddenComponentList;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a dialog.
     * 
     * @param parent
     *            the SWT parent of this dialog
     */
    public SelectTraceDialog(final Shell parent, final String titleParam) {
        super(parent);
        dialog = this;
        title = titleParam;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
     */
    @Override
    protected void configureShell(final Shell newShell) {
        super.configureShell(newShell);
        // set the title of this dialog
        newShell.setText(title);
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
     */
    @Override
    protected Control createDialogArea(final Composite parent) {
        Composite composite = (Composite) super.createDialogArea(parent);

        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 1;
        composite.setLayout(gridLayout);
        gridLayout.marginHeight = MARGIN_WIDTH_AND_HEIGHT;
        gridLayout.marginWidth = MARGIN_WIDTH_AND_HEIGHT;

        table = new Table(composite, SWT.BORDER | SWT.MULTI);
        table.addSelectionListener(new SelectionListener() {
            public void widgetDefaultSelected(final SelectionEvent e) {
            }

            public void widgetSelected(final SelectionEvent e) {
                updateSelectedList();
            }
        });
        table.addMouseListener(new MouseListener() {
            public void mouseDoubleClick(final MouseEvent e) {
                updateSelectedList();
                dialog.close();
            }

            public void mouseDown(final MouseEvent e) {
            }

            public void mouseUp(final MouseEvent e) {
            }
        });
        updateTable();

        GridData gridData = new GridData();
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = true;
        gridData.horizontalAlignment = GridData.FILL;
        gridData.verticalAlignment = GridData.FILL;
        table.setLayoutData(gridData);

        refreshEnabledDisabledTextColors();
        return composite;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.dialogs.Dialog#getInitialSize()
     */
    @Override
    protected Point getInitialSize() {
        // set the dimensions of the dialog
        return new Point(FORM_WIDTH, FORM_HEIGHT);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the selected index.
     * 
     * @return the selected index
     */
    public int getSelectedIndex() {
        return selectedIndex;
    }

    // -------------------------------------------------------------------------
    /**
     * Sets the component list. The component list should hold all available default DataComponents
     * and is used to update the table. This should be provided by the calling instance.
     * 
     * @param dataComponents
     *            the new component list
     */
    public void setComponentList(final List<String> components) {
        this.componentList = components;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the DataComponentEsList. It is used to check for multiple instances. It should hold all
     * DataComponentWrapper's that are in the original list of the KiemView to check if another
     * instance of a DataComponent can safely be added. <BR>
     * This should be provided by the calling instance.
     * 
     * @param dataComponentWrapperListParam
     *            the new component list
     */
    public void setForbiddenComponentList(final List<String> forbiddenComponentListParam) {
        this.forbiddenComponentList = forbiddenComponentListParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Updates the temporary table from which the user can select (multiple) DataComponents that
     * he/she wishes to add to its list. The type of the DataComponent is shown in brackets, and the
     * icon is also personalized for each type of DataComponent.
     */
    private void addToTable(final String component) {
        TableItem item = new TableItem(table, SWT.NULL);

        // item.setText(new String[] { component.getName()+" (" + type + ")" });
        item.setText(component);

        item.setData(component);
    }

    private void updateTable() {
        // make a copy of the list
        List<String> componentListCopy = new LinkedList<String>();
        for (int c = 0; c < componentList.size(); c++) {
            componentListCopy.add(componentList.get(c));
        } // next c

        for (int c = 0; c < componentList.size(); c++) {
            // find the min component of the copy list
            String minComponent = null;
            for (int cc = 0; cc < componentListCopy.size(); cc++) {
                String component = componentListCopy.get(cc);
                if ((minComponent == null) || (component.compareTo(minComponent)) < 0) {
                    minComponent = component;
                }
            } // next c

            // remove it
            componentListCopy.remove(minComponent);

            this.addToTable(minComponent);
        } // next c

    }

    // -------------------------------------------------------------------------

    /**
     * Gets the selected components. This is normally called after the user has selected and chosen
     * DataComponents and already closed the dialog.
     * 
     * @return the selected DataComponents for which DataComponentWrappers has to be created by the
     *         calling instance
     */
    public List<String> getSelectedComponents() {
        return selectedList;
    }

    // -------------------------------------------------------------------------

    /**
     * Updates the selected list. This is done immediately when the user selects DataComponents in
     * the list. The selected list can be obtained by calling {@link #getSelectedComponents()}.
     */
    private void updateSelectedList() {
        selectedIndex = table.getSelectionIndex();
        selectedList = new LinkedList<String>();
        TableItem[] selection = table.getSelection();
        for (int c = 0; c < selection.length; c++) {
            String component = (String) selection[c].getData();
            // only add if multiple instances are ok
            // or if there are no instances yet!
            if (checkMultipleInstanceOk(component)) {
                selectedList.add(component);
            }
        }
        if ((selectedList.size() < 1) || (selection.length < 1)) {
            selectedList = null;
        }
    }

    // ---------------------------------------------------------------------------

    /**
     * Check if multiple instances of a DataComponent are okay and if not check if there already is
     * another instance in the original DataComponentWrapperList. If the latter is the case then
     * return false. In any other case it is okay to add another instance of this DataComponent so
     * this method returns true.
     * 
     * @param component
     *            the DataComponent that we want to check on
     * 
     * @return true, if another instance of this DataComponent is allowed
     */
    public boolean checkMultipleInstanceOk(final String component) {
        // nothing to check = no multiple instances possible if empty list
        if (forbiddenComponentList == null) {
            return true;
        }
        // now check for the same component
        for (int c = 0; c < forbiddenComponentList.size(); c++) {
            String forbiddenComponent = forbiddenComponentList.get(c);
            // now we have a NOT multiple instantiable component in the list
            // check if this is our component, if yes return false!
            if (component.equals(forbiddenComponent)) {
                return false;
            }
        }
        return true;
    }

    // ---------------------------------------------------------------------------

    /**
     * Refreshes the enabled/disabled text colors of the DataComponent selection list. In case a
     * DataComponent is <B>NOT</B> multiple instantiable and there already is one instance in the
     * original DataComponentWrapperList (of the KiemView) then we indicate this by a grayed
     * colorDisabled.
     */
    public void refreshEnabledDisabledTextColors() {
        // change the text color (black or gray)
        Color colorEnabled = new Color(null, new RGB(0, 0, 0));
        Color colorDisabled = new Color(null, new RGB(DISABLED_COLOR_GRAY, DISABLED_COLOR_GRAY,
                DISABLED_COLOR_GRAY));

        for (int c = 0; c < table.getItemCount(); c++) {
            String component = (String) table.getItem(c).getData();
            // select color
            Color currentColor = colorDisabled;
            if (checkMultipleInstanceOk(component)) {
                currentColor = colorEnabled;
            } else {
                currentColor = colorDisabled;
            }
            // update text colors
            table.getItem(c).setForeground(currentColor);
        }
    }

}
