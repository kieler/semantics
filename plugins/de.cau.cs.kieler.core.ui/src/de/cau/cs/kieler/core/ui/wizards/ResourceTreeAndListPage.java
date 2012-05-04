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

package de.cau.cs.kieler.core.ui.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.ITreeViewerListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeExpansionEvent;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.model.WorkbenchViewerComparator;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import de.cau.cs.kieler.core.ui.Messages;


/**
 * A wizard page that displays a checked tree and a checked list, as well as a
 * source group, target group and an options group. This can be seen as a more
 * flexible version of {@code org.eclipse.ui.dialogs.WizardResourceImportPage}.
 * This class is intended to be subclassed by clients.
 * 
 * <p>To customize the tree and list views, subclasses may override diverse methods
 * that return a content provider, label provider, comparator and filters. To
 * set the input that should be fed into the tree's content provider, call
 * {@link #setResourceTreeInput(Object)}. The list's content provider's input
 * is automatically set to the element currently selected in the tree.</p>
 * 
 * <p>The source group, if present, usually provides a way to select some kind of
 * source directory, often also providing a history of previously entered values.
 * You can use {@link #createDefaultSourceGroup(Composite, String, String)} to
 * have a default source group with a combo box and a browse button created.</p>
 * 
 * <p>The target group, if present, usually provides a way to select some kind of
 * target container or directory, often also providing a history of previously
 * selected values. As with the source group, you can use
 * {@link #createDefaultTargetGroup(Composite, String, String)} to have a default
 * target group with a combo box and a browse button created.</p>
 * 
 * <p>The button bar, if present, usually provides a way to select and deselect all
 * list items. By default, such a group is created. Subclasses can change this
 * by overriding {@link #createButtonBar(Composite)}.</p>
 * 
 * <p>Finally, the options group, if present, usually allows the user to influence
 * some parameters of the actions to be performed. There is no way to have a
 * default options group created, since there is no way to know which options
 * might be needed.</p>
 * 
 * <p>There are currently two specializations of this class. {@link FileSystemResourcesPage}
 * specializes in file system imports while {@link WorkspaceResourcesPage}
 * specializes in workspace imports.</p>
 * 
 * @author cds
 * @kieler.rating yellow 2010-03-14
 *      reviewed by haf, msp, pkl
 */
public abstract class ResourceTreeAndListPage extends WizardPage {
    
    // CONSTANTS
    
    /**
     * Width hint for the resource tree and list.
     */
    private static final int SIZE_HINT_WIDTH = 200;
    
    /**
     * Height hint for the resource tree and list.
     */
    private static final int SIZE_HINT_HEIGHT = 250;
    
    /**
     * The number of columns used to lay out the default source and target groups.
     */
    private static final int DEFAULT_SOURCE_TARGET_GROUP_COLUMNS = 3;
    
    // VARIABLES
    
    /**
     * Remembers all the checked list items for a given tree viewer item. This map
     * must be cleared when the tree viewer's input object changes.
     */
    private Multimap<Object, Object> checkedListItems = HashMultimap.create();
    
    /**
     * Set of tree items that have been visited. A tree item gets visited when it
     * is either expanded or selected. Items in this set may be safely queried for
     * their children, since their children are already known.
     */
    private Set<Object> visitedTreeItems = new HashSet<Object>();
    
    /**
     * Set of tree items that are checked and not grayed.
     */
    private Set<Object> checkedTreeItems = new HashSet<Object>();
    
    /**
     * Set of tree items that are grayed.
     */
    private Set<Object> grayedTreeItems = new HashSet<Object>();
    
    // UI CONTROLS
    private Composite composite = null;
    
    private Composite sourceGroupComposite = null;
    private Combo sourceGroupSourceCombo = null;
    private Button sourceGroupBrowseButton = null;
    
    private Tree resourceTree = null;
    private CheckboxTreeViewer resourceTreeViewer = null;
    private ITreeContentProvider resourceTreeContentProvider = null;
    private ILabelProvider resourceTreeLabelProvider = null;
    private ViewerComparator resourceTreeViewerComparator = null;
    
    private Table resourceList = null;
    private CheckboxTableViewer resourceListViewer = null;
    private IStructuredContentProvider resourceListContentProvider = null;
    private ILabelProvider resourceListLabelProvider = null;
    private ViewerComparator resourceListViewerComparator = null;
    
    private Composite buttonBarComposite = null;
    private Button buttonBarSelectAllButton = null;
    private Button buttonBarDeselectAllButton = null;
    
    private Composite targetGroupComposite = null;
    private Combo targetGroupTargetCombo = null;
    private Button targetGroupBrowseButton = null;
    
    private Composite optionsGroupComposite = null;
    
    
    /**
     * Constructs a new instance with the given name.
     * 
     * @param pageName the page's name.
     */
    protected ResourceTreeAndListPage(final String pageName) {
        super(pageName);
    }

    
    ///////////////////////////////////////////////////////////////////////////////
    // Result Extraction
    
    /**
     * Returns a list of selected elements. This operation can take a very long
     * time.
     * 
     * @param monitor progress monitor. May be {@code null}.
     * @return list of selected list elements. Tree elements are not returned. If
     *         the user cancels the operation through the progress monitor,
     *         {@code null} is returned.
     */
    public final Collection<Object> getSelectedElements(final IProgressMonitor monitor) {
        IProgressMonitor progressMonitor = monitor;
        if (progressMonitor == null) {
            progressMonitor = new NullProgressMonitor();
        }
        
        progressMonitor.beginTask(Messages.ResourceTreeAndListPage_task_itemDiscovery, 1);
        
        // First, visit all checked elements
        Collection<Object> elements = new ArrayList<Object>();
        for (Object element : resourceTreeContentProvider.getChildren(
                resourceTreeViewer.getInput())) {

            gatherSelectedElements(element, elements, progressMonitor);
        }
        
        // Now, return the list of selected list items
        if (progressMonitor.isCanceled()) {
            progressMonitor.done();
            return null;
        } else {
            progressMonitor.done();
            return elements;
        }
    }
    
    /**
     * Gathers the item's selected resource list children in the given list. If
     * the item is checked, all list children are put into the list and all of
     * its resource tree children are recursively visited. If the element is
     * grayed, only those resource list children are gathered that were selected
     * by the user and only those resource tree children that are checked or
     * grayed are recursively visited.
     * 
     * <p>All elements added to the list are required to pass the installed filters
     * first.</p>
     * 
     * @param monitor progress monitor.
     * @param element the element to visit.
     */
    private void gatherSelectedElements(final Object element, final Collection<Object> elements,
            final IProgressMonitor monitor) {
        
        // Check if the user wants to cancel
        if (monitor.isCanceled()) {
            return;
        }
        
        // Check if this item is checked or grayed
        if (checkedTreeItems.contains(element)) {
            // Checked; gather all of its resource list children
            elements.addAll(filterListItems(resourceListContentProvider.getElements(element)));
            
            // Check all of its children in the resource tree so that their
            // resource list items will be added as well
            checkedTreeItems.addAll(filterTreeItems(
                    resourceTreeContentProvider.getChildren(element)));
        } else if (grayedTreeItems.contains(element)) {
            // Grayed; gather those resource list children that are selected
            elements.addAll(filterListItems(checkedListItems.get(element).toArray()));
        } else {
            // The item is neither checked nor grayed; escape. ESCAPE!
            return;
        }
        
        // Iterate through the element's children
        for (Object child : resourceTreeContentProvider.getChildren(element)) {
            gatherSelectedElements(child, elements, monitor);
        }
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////
    // General GUI Management

    /**
     * {@inheritDoc}
     */
    public final void createControl(final Composite parent) {
        // Composite
        composite = new Composite(parent, SWT.NULL);
        composite.setLayout(new GridLayout(2, true));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        setControl(composite);
        
        // Source Group
        sourceGroupComposite = createSourceGroup(composite);
        if (sourceGroupComposite != null) {
            sourceGroupComposite.setLayoutData(
                    new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        }
        
        // Resource Group
        createResourceGroup();
        
        // Button Bar
        buttonBarComposite = createButtonBar(composite);
        if (buttonBarComposite != null) {
            buttonBarComposite.setLayoutData(
                    new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        }
        
        // Target Group
        targetGroupComposite = createTargetGroup(composite);
        if (targetGroupComposite != null) {
            targetGroupComposite.setLayoutData(
                    new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
        }
        
        // Options Group
        optionsGroupComposite = createOptionsGroup(composite);
        if (optionsGroupComposite != null) {
            optionsGroupComposite.setLayoutData(
                    new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        }
        
        // Restore dialog settings
        restoreDialogSettings();
        
        // Do any initialization
        initializeControls();
    }
    
    /**
     * Creates the tree and list and registers the necessary listeners.
     */
    private void createResourceGroup() {
        GridData gd;
        
        // Resource Tree
        resourceTree = new Tree(composite,
                SWT.SINGLE | SWT.CHECK | SWT.FULL_SELECTION | SWT.BORDER);
        
        gd = new GridData(SWT.FILL, SWT.FILL, true, true);
        gd.heightHint = SIZE_HINT_HEIGHT;
        gd.widthHint = SIZE_HINT_WIDTH;
        resourceTree.setLayoutData(gd);
        
        resourceTreeContentProvider = getResourceTreeContentProvider();
        resourceTreeLabelProvider = getResourceTreeLabelProvider();
        resourceTreeViewerComparator = getResourceTreeViewerComparator();

        resourceTreeViewer = new CheckboxTreeViewer(resourceTree);
        resourceTreeViewer.setContentProvider(resourceTreeContentProvider);
        resourceTreeViewer.setLabelProvider(resourceTreeLabelProvider);
        resourceTreeViewer.setComparator(resourceTreeViewerComparator);
        resourceTreeViewer.setFilters(getResourceTreeFilters());
        
        // Resource Table
        resourceList = new Table(composite,
                SWT.SINGLE | SWT.CHECK | SWT.FULL_SELECTION | SWT.BORDER);
        
        gd = new GridData(SWT.FILL, SWT.FILL, true, true);
        gd.heightHint = SIZE_HINT_HEIGHT;
        gd.widthHint = SIZE_HINT_WIDTH;
        resourceList.setLayoutData(gd);
        
        resourceListContentProvider = getResourceListContentProvider();
        resourceListLabelProvider = getResourceListLabelProvider();
        resourceListViewerComparator = getResourceListViewerComparator();
        
        resourceListViewer = new CheckboxTableViewer(resourceList);
        resourceListViewer.setContentProvider(resourceListContentProvider);
        resourceListViewer.setLabelProvider(resourceListLabelProvider);
        resourceListViewer.setComparator(resourceListViewerComparator);
        resourceListViewer.setFilters(getResourceListFilters());
        
        // Event Management
        resourceTreeViewer.addTreeListener(new ITreeViewerListener() {
            public void treeCollapsed(final TreeExpansionEvent event) {
                // Nothing to see, please move along..!
            }

            public void treeExpanded(final TreeExpansionEvent event) {
                BusyIndicator.showWhile(resourceTree.getDisplay(), new Runnable() {
                    public void run() {
                        // Visit the tree item and make sure its children are properly
                        // checked, if necessary
                        visitTreeItem(event.getElement(), false);
                    }
                });
            }
        });
        
        resourceTreeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(final SelectionChangedEvent event) {
                BusyIndicator.showWhile(resourceTree.getDisplay(), new Runnable() {
                    public void run() {
                        IStructuredSelection selection =
                            (IStructuredSelection) event.getSelection();
                        visitTreeItem(selection.isEmpty() ? null : selection.getFirstElement(),
                                true);
                        validate();
                    }
                });
            }
        });
        
        resourceTreeViewer.addCheckStateListener(new ICheckStateListener() {
            public void checkStateChanged(final CheckStateChangedEvent event) {
                BusyIndicator.showWhile(resourceTree.getDisplay(), new Runnable() {
                    public void run() {
                        applyNewTreeItemCheckState(event.getElement(), event.getChecked(), false,
                                true, true);
                        validate();
                    }
                });
            }
        });
        
        resourceListViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(final SelectionChangedEvent event) {
                BusyIndicator.showWhile(resourceList.getDisplay(), new Runnable() {
                    public void run() {
                        validate();
                    }
                });
            }
        });
        
        resourceListViewer.addCheckStateListener(new ICheckStateListener() {
            public void checkStateChanged(final CheckStateChangedEvent event) {
                BusyIndicator.showWhile(resourceList.getDisplay(), new Runnable() {
                    public void run() {
                        listCheckStateChanged(event.getElement(), event.getChecked());
                        validate();
                    }
                });
            }
        });
    }
    
    /**
     * Called after the controls were created and the settings restored. Subclasses
     * may override and can use this method to do any initialization tasks that
     * might be left, like preselecting resources. The default implementation does
     * nothing.
     */
    protected void initializeControls() {
        // Do nothing
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////
    // Resource Group Management
    //  (not check state management, that's way below)
    
    /**
     * Returns the content provider to be used for the resource tree. This
     * method is only called once, upon the resource tree's creation. Subclasses
     * may override. The default implementation returns the
     * {@code BaseWorkbenchContentProvider}.
     * 
     * @return content provider for the resource tree.
     */
    protected ITreeContentProvider getResourceTreeContentProvider() {
        return new BaseWorkbenchContentProvider();
    }
    
    /**
     * Returns the label provider to be used for the resource tree. This
     * method is only called once, upon the resource tree's creation. Subclasses
     * may override. The default implementation returns the
     * {@code WorkbenchLabelProvider}.
     * 
     * @return label provider for the resource tree.
     */
    protected ILabelProvider getResourceTreeLabelProvider() {
        return new WorkbenchLabelProvider();
    }
    
    /**
     * Returns the viewer comparator to be used for the resource tree. This
     * method is only called once, upon the resource tree's creation. Subclasses
     * may override. The default implementation returns the
     * {@code WorkbenchViewerComparator}.
     * 
     * @return viewer comparator for the resource tree.
     */
    protected ViewerComparator getResourceTreeViewerComparator() {
        return new WorkbenchViewerComparator();
    }
    
    /**
     * Returns the viewer filters to be used for the resource tree. This
     * method is only called once, upon the resource tree's creation. Subclasses
     * may override. The default implementation returns an empty array.
     * 
     * <p><em>Note:</em> This could be made more flexible to allow changeing
     * the list of active filters after creation.</p>
     * 
     * @return array of filters.
     */
    protected ViewerFilter[] getResourceTreeFilters() {
        return new ViewerFilter[0];
    }
    
    /**
     * Returns the content provider to be used for the resource list. This
     * method is only called once, upon the resource list's creation. Subclasses
     * may override. The default implementation returns the
     * {@code BaseWorkbenchContentProvider}.
     * 
     * @return content provider for the resource list.
     */
    protected ITreeContentProvider getResourceListContentProvider() {
        return new BaseWorkbenchContentProvider();
    }
    
    /**
     * Returns the label provider to be used for the resource list. This
     * method is only called once, upon the resource list's creation. Subclasses
     * may override. The default implementation returns the
     * {@code WorkbenchLabelProvider}.
     * 
     * @return label provider for the resource list.
     */
    protected ILabelProvider getResourceListLabelProvider() {
        return new WorkbenchLabelProvider();
    }
    
    /**
     * Returns the viewer comparator to be used for the resource list. This
     * method is only called once, upon the resource list's creation. Subclasses
     * may override. The default implementation returns the
     * {@code WorkbenchViewerComparator}.
     * 
     * @return viewer comparator for the resource list.
     */
    protected ViewerComparator getResourceListViewerComparator() {
        return new WorkbenchViewerComparator();
    }
    
    /**
     * Returns the viewer filters to be used for the resource list. This
     * method is only called once, upon the resource list's creation. Subclasses
     * may override. The default implementation returns an empty array.
     * 
     * <p><em>Note:</em> This could be made more flexible to allow changeing
     * the list of active filters after creation.</p>
     * 
     * @return array of filters.
     */
    protected ViewerFilter[] getResourceListFilters() {
        return new ViewerFilter[0];
    }
    
    /**
     * Sets the resource tree's input and validates the page. This will usually
     * be called after the user changed the source. All resources previously
     * selected by the user will be cleared.
     * 
     * @param newInput the new input object for the resource tree.
     */
    protected final void setResourceTreeInput(final Object newInput) {
        // Clear user selections
        checkedListItems.clear();
        checkedTreeItems.clear();
        grayedTreeItems.clear();
        visitedTreeItems.clear();
        
        // Set the tree viewer's new input and validate the page
        resourceTreeViewer.setInput(newInput);
        resourceListViewer.setInput(null);
        validate();
    }
    
    /**
     * Checks if there is anything selected. This can only be a hint.
     * 
     * @return {@code true} if anything is selected.
     */
    public final boolean isAnythingSelected() {
        return !(checkedTreeItems.isEmpty() && grayedTreeItems.isEmpty());
    }
    
    /**
     * Selects all the list items currently shown.
     * 
     * Does not trigger validation.
     */
    protected final void selectAllListItems() {
        Object listInput = resourceListViewer.getInput();
        Object[] listElements = resourceListContentProvider.getElements(listInput);
        
        // Select each and every list item
        for (Object listElement : listElements) {
            listCheckStateChanged(listElement, true);
        }
        
        // Make sure the selection is displayed
        visitTreeItem(listInput, true);
    }
    
    /**
     * Deselects all the list items currently shown.
     * 
     * Does not trigger validation.
     */
    protected final void deselectAllListItems() {
        Object listInput = resourceListViewer.getInput();
        Object[] listElements = resourceListContentProvider.getElements(listInput);
        
        // Select each and every list item
        for (Object listElement : listElements) {
            listCheckStateChanged(listElement, false);
        }
        
        // Make sure the selection is displayed
        visitTreeItem(listInput, true);
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////
    // Source Group Management
    
    /**
     * Creates the source group. This method is intended to be implemented by
     * subclasses.
     * 
     * <p>Subclasses may call {@link #createDefaultSourceGroup(Composite, String, String)}
     * to have a default source group with a label, a combo box and a browse
     * button created. In this case, it should also implement {@link #applyNewSource(String)}
     * and {@link #doBrowseSource()}. While access to the combo box and the browse
     * button shouldn't normally be necessary, they can be retrieved using
     * {@link #getSourceGroupCombo()} and {@link #getSourceGroupBrowseButton()}.</p>
     * 
     * @param parent the new source group's parent.
     * @return the new source group, or {@code null} if none should be shown.
     */
    protected abstract Composite createSourceGroup(final Composite parent);
    
    /**
     * Creates a default version of the source group consisting of a label, a
     * combo box and a browse button. See {@link #createSourceGroup(Composite)} for
     * further details.
     * 
     * @param parent the parent composite.
     * @param labelText the label's text.
     * @param browseButtonText the browse button's text.
     * @return the new source group.
     */
    protected final Composite createDefaultSourceGroup(final Composite parent,
            final String labelText, final String browseButtonText) {

        // Composite
        Composite sourceGroup = new Composite(parent, SWT.NULL);
        sourceGroup.setLayout(new GridLayout(DEFAULT_SOURCE_TARGET_GROUP_COLUMNS, false));
        
        // Label
        Label label = new Label(sourceGroup, SWT.NULL);
        label.setText(labelText);
        label.setLayoutData(
                new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
        
        // Combo
        sourceGroupSourceCombo = new Combo(sourceGroup, SWT.DROP_DOWN);
        sourceGroupSourceCombo.setLayoutData(
                new GridData(SWT.FILL, SWT.CENTER, true, false));
        
        // Browse Button
        sourceGroupBrowseButton = new Button(sourceGroup, SWT.PUSH);
        sourceGroupBrowseButton.setText(browseButtonText);
        sourceGroupBrowseButton.setLayoutData(
                new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
        
        // Event handlers
        sourceGroupSourceCombo.addModifyListener(new ModifyListener() {
            public void modifyText(final ModifyEvent e) {
                applyNewSource(sourceGroupSourceCombo.getText());
                validate();
            }
        });
        
        sourceGroupBrowseButton.addSelectionListener(new SelectionAdapter() {
            /**
             * {@inheritDoc}
             */
            @Override
            public void widgetSelected(final SelectionEvent e) {
                doBrowseSource();
                validate();
            }
        });
        
        return sourceGroup;
    }
    
    /**
     * Called when the source group combo loses focus. If a subclass created the
     * default source group, it should implement this method to react to the user
     * entering a new source. The default implementation does nothing. Subclasses
     * overriding this method must make sure not to modify the text of the source
     * combo box to avoid endless loops and stack overflows.
     * 
     * <p>After this method was called, {@link validate()} is called automatically.</p>
     * 
     * @param text the combo's current text.
     */
    protected void applyNewSource(final String text) {
        // Do nothing
    }
    
    /**
     * Called when the source group browse button is clicked. If a subclass created
     * the default source group, it should implement this method to pop up some
     * kind of browse dialog. The default implementation does nothing.
     * 
     * <p>After this method was called, {@link validate()} is called automatically.</p>
     */
    protected void doBrowseSource() {
        // Do nothing
    }
    
    /**
     * Returns the source group's combo box, if the source group was created using
     * {@link #createDefaultSourceGroup(Composite, String, String)}.
     * 
     * @return the source group's combo box.
     */
    protected final Combo getSourceGroupCombo() {
        return sourceGroupSourceCombo;
    }
    
    /**
     * Returns the source group's browse button, if the source group was created using
     * {@link #createDefaultSourceGroup(Composite, String, String)}.
     * 
     * @return the source group's browse button.
     */
    protected final Button getSourceGroupBrowseButton() {
        return sourceGroupBrowseButton;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////
    // Button Bar Management
    
    /**
     * Creates the button bar. The default implementation creates a button bar
     * with a "Select all" and a "Deselect all" button, which select and deselect
     * all items in the list, respectively. Subclasses may override.
     * 
     * @param parent the new button bar's parent.
     * @return the new button bar, or {@code null} if none should be shown.
     */
    protected Composite createButtonBar(final Composite parent) {
        GridLayout gl;

        // Composite
        Composite buttonBar = new Composite(parent, SWT.NULL);
        gl = new GridLayout(1, false);
        gl.marginHeight = 0;
        buttonBar.setLayout(gl);
        
        // Composite the buttons are placed in
        Composite buttonComposite = new Composite(buttonBar, SWT.PUSH);
        buttonComposite.setLayoutData(new GridData(SWT.END, SWT.BEGINNING, true, true));
        gl = new GridLayout(2, true);
        gl.marginHeight = 0;
        gl.marginWidth = 0;
        buttonComposite.setLayout(gl);
        
        // Select All Button
        buttonBarSelectAllButton = new Button(buttonComposite, SWT.PUSH);
        buttonBarSelectAllButton.setText(Messages.ResourceTreeAndListPage_selectAllButton_text);
        buttonBarSelectAllButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        
        // Deselect All Button
        buttonBarDeselectAllButton = new Button(buttonComposite, SWT.PUSH);
        buttonBarDeselectAllButton.setText(Messages.ResourceTreeAndListPage_deselectAllButton_text);
        buttonBarDeselectAllButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        
        // Event handlers
        buttonBarSelectAllButton.addSelectionListener(new SelectionAdapter() {
            /**
             * {@inheritDoc}
             */
            @Override
            public void widgetSelected(final SelectionEvent e) {
                selectAllListItems();
                validate();
            }
        });

        buttonBarDeselectAllButton.addSelectionListener(new SelectionAdapter() {
            /**
             * {@inheritDoc}
             */
            @Override
            public void widgetSelected(final SelectionEvent e) {
                deselectAllListItems();
                validate();
            }
        });
        
        return buttonBar;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////
    // Target Group Management
    
    /**
     * Creates the target group. This method is intended to be implemented by
     * subclasses.
     * 
     * <p>Subclasses may call {@link #createDefaultTargetGroup(Composite, String, String)}
     * to have a default target group with a label, a combo box and a browse
     * button created. In this case, it should also implement {@link #applyNewTarget(String)}
     * and {@link #doBrowseTarget()}. While access to the combo box and the browse
     * button shouldn't normally be necessary, they can be retrieved using
     * {@link #getTargetGroupCombo()} and {@link #getTargetGroupBrowseButton()}.</p>
     * 
     * @param parent the new target group's parent.
     * @return the new target group, or {@code null} if none should be shown.
     */
    protected abstract Composite createTargetGroup(final Composite parent);
    
    /**
     * Creates a default version of the target group consisting of a label, a
     * combo box and a browse button. See {@link #createTargetGroup(Composite)} for
     * further details.
     * 
     * @param parent the parent composite.
     * @param labelText the label's text.
     * @param browseButtonText the browse button's text.
     * @return the new target group.
     */
    protected final Composite createDefaultTargetGroup(final Composite parent,
            final String labelText, final String browseButtonText) {

        // Composite
        Composite targetGroup = new Composite(parent, SWT.NULL);
        targetGroup.setLayout(new GridLayout(DEFAULT_SOURCE_TARGET_GROUP_COLUMNS, false));
        
        // Label
        Label label = new Label(targetGroup, SWT.NULL);
        label.setText(labelText);
        label.setLayoutData(
                new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
        
        // Combo
        targetGroupTargetCombo = new Combo(targetGroup, SWT.DROP_DOWN);
        targetGroupTargetCombo.setLayoutData(
                new GridData(SWT.FILL, SWT.CENTER, true, false));
        
        // Browse Button
        targetGroupBrowseButton = new Button(targetGroup, SWT.PUSH);
        targetGroupBrowseButton.setText(browseButtonText);
        targetGroupBrowseButton.setLayoutData(
                new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
        
        // Event handlers
        targetGroupTargetCombo.addModifyListener(new ModifyListener() {
            public void modifyText(final ModifyEvent e) {
                applyNewTarget(targetGroupTargetCombo.getText());
                validate();
            }
        });
        
        targetGroupBrowseButton.addSelectionListener(new SelectionAdapter() {
            /**
             * {@inheritDoc}
             */
            @Override
            public void widgetSelected(final SelectionEvent e) {
                doBrowseTarget();
                validate();
            }
        });
        
        return targetGroup;
    }
    
    /**
     * Called when the target group combo loses focus. If a subclass created the
     * default target group, it should implement this method to react to the user
     * entering a new target. The default implementation does nothing. Subclasses
     * overriding this method must make sure not to modify the text of the target
     * combo box to avoid endless loops and stack overflows.
     * 
     * <p>After this method was called, {@link validate()} is called automatically.</p>
     * 
     * @param text the combo's current text.
     */
    protected void applyNewTarget(final String text) {
        // Do nothing
    }
    
    /**
     * Called when the target group browse button is clicked. If a subclass created
     * the default target group, it should implement this method to pop up some
     * kind of browse dialog. The default implementation does nothing.
     * 
     * <p>After this method was called, {@link validate()} is called automatically.</p>
     */
    protected void doBrowseTarget() {
        // Do nothing
    }
    
    /**
     * Returns the target group's combo box, if the target group was created using
     * {@link #createDefaultTargetGroup(Composite, String, String)}.
     * 
     * @return the target group's combo box.
     */
    protected final Combo getTargetGroupCombo() {
        return targetGroupTargetCombo;
    }
    
    /**
     * Returns the target group's browse button, if the target group was created using
     * {@link #createDefaultTargetGroup(Composite, String, String)}.
     * 
     * @return the target group's browse button.
     */
    protected final Button getTargetGroupBrowseButton() {
        return targetGroupBrowseButton;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////
    // Options Group Management
    
    /**
     * Creates the options group. This method is intended to be implemented by
     * subclasses.
     * 
     * @param parent the new options group's parent.
     * @return the new options group, or {@code null} if none should be shown.
     */
    protected abstract Composite createOptionsGroup(final Composite parent);
    
    
    ///////////////////////////////////////////////////////////////////////////////
    // Validation
    
    /**
     * Validates this page. This method is automatically called whenever a new
     * source or target was applied, or when the selection on the tree or list
     * changed. Subclasses should call this method when options changed. The
     * actual validation is done by subclasses in {@link doValidate()}. If the
     * page validates fine, any error message set is cleared.
     */
    protected final void validate() {
        boolean valid = doValidate();
        setPageComplete(valid);
        
        if (valid) {
            setErrorMessage(null);
        }
    }
    
    /**
     * Validates the page. This is the right place to set error messages on this
     * page when some user input is missing or wrong. If the page validates fine,
     * any error message is automatically cleared by the calling method. Subclasses
     * may override, but must call this implementation. This implementation always
     * returns {@code true}.
     * 
     * @return {@code true} if the page validates fine and the page is complete,
     *         {@code false} otherwise.
     */
    protected boolean doValidate() {
        boolean enable = resourceList.getItemCount() > 0;
        
        // Enable or disable the select / deselect all buttons
        if (buttonBarSelectAllButton != null) {
            buttonBarSelectAllButton.setEnabled(enable);
        }

        if (buttonBarDeselectAllButton != null) {
            buttonBarDeselectAllButton.setEnabled(enable);
        }
        
        return true;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////
    // Dialog Settings
    
    /**
     * Saves the user's input. The default implementation does nothing. Subclasses
     * may override.
     */
    public void saveDialogSettings() {
        // Do nothing.
    }
    
    /**
     * Restores the user's saved input. Called after all controls have been
     * created. The default implementation does nothing. Subclasses may override.
     */
    protected void restoreDialogSettings() {
        // Do nothing.
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////
    // Selection Services
    
    /**
     * Tries to find the given element and selects it, as well as expanding
     * the path leading to it.
     * 
     * <p>There is one condition that must be met for this to work: The tree
     * content provider must be able to return the element's ancestors
     * without them having been visited before. This especially means that
     * the tree content provider must know what to do with the element.</p>
     * 
     * @param element the element to select and reveal.
     * @param listElement {@code true} if this is an element in the resource
     *                    list, {@code false} if it is an element in the
     *                    resource tree.
     * @return {@code true} if the element was selected, {@code false}
     *         otherwise.
     */
    protected final boolean selectAndRevealElement(final Object element,
            final boolean listElement) {
        
        // The element's path, in reverse order. This is filled using the
        // content providers and then used to reveal the path elements
        List<Object> elementPath = new ArrayList<Object>();
        
        // Find the element's immediate ancestor using the list content provider
        Object parent = resourceTreeContentProvider.getParent(element);
        if (parent == null) {
            return false;
        }
        
        // Go up the ancestor hierarchy until we've reached the tree viewer's
        // input element or until there's no ancestor any more
        Object treeViewerInput = resourceTreeViewer.getInput();
        Object currentAncestor = parent;
        while (currentAncestor != null && currentAncestor != treeViewerInput) {
            currentAncestor = resourceTreeContentProvider.getParent(currentAncestor);
            
            if (currentAncestor != null) {
                elementPath.add(currentAncestor);
            }
        }
        
        // We now need to visit and reveal all items in the list, except
        // for the element to be selected; we'll handle that below. Remember
        // that we didn't put the element's direct parent in the list. We'll
        // handle the parent below.
        Object currentPathElement = null;
        for (int i = elementPath.size() - 2; i >= 0; i--) {
            currentPathElement = elementPath.get(i);
            
            visitTreeItem(currentPathElement, false);
            resourceTreeViewer.reveal(currentPathElement);
        }
        
        // There's different methods of selecting the element, depending on
        // whether it's a tree element or a list element
        if (listElement) {
            // Select and reveal the element's parent
            visitTreeItem(parent, true);
            resourceTreeViewer.reveal(parent);
            resourceTreeViewer.setSelection(new StructuredSelection(parent));
            
            // Select the list item
            listCheckStateChanged(element, true);
            
            // Update the list to reflect the selection changes
            visitTreeItem(parent, true);
        } else {
            // Reveal the element's parent, then select and reveal the element
            // itself
            visitTreeItem(parent, false);
            resourceTreeViewer.reveal(parent);

            visitTreeItem(element, true);
            resourceTreeViewer.reveal(element);
            resourceTreeViewer.setSelection(new StructuredSelection(element));
            
            // Apply a new check state to the tree item
            applyNewTreeItemCheckState(element, true, false, true, true);
        }
        
        return true;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////
    // Advanced Internal Resource Group Management
    
    /* This is some quite intricate stuff. Approach with caution. You have been
     * warned.
     * 
     * Basically, this works by remembering a few things. Whenever a list item
     * is checked or unchecked, this is reflected in the checkedListItems map.
     * We have to remember that because when a new tree item is selected, the
     * list viewer's input and elements change and it forgets which items were
     * previously selected.
     * 
     * When a tree item is checked, all of its child list items and its ancestor
     * tree items are supposed to be checked as well. This would mean calling
     * getChildren() on the tree item and all of its ancestors - an operation
     * that could cause extremely long delays depending on what the tree items
     * represent. Because of this, we remember which tree items we've already
     * visited (= called getChildren() on) in visitedTreeItems.
     * 
     * To speed things up, we also remember which tree items are currently
     * checked in checkedTreeItems.
     * 
     * When the tree viewer's input changes, all the maps and lists are
     * reset. (that happens in setResourceTreeInput(Object), somewhere above.
     */
    
    /**
     * Called when an item in the list viewer gets checked or unchecked. Adds
     * the item to the list of checked list items, or removes it from the list.
     * Then, the corresponding tree viewer element (which is the list viewer's
     * input element) has its check state updated.
     * 
     * Does not validate the page.
     * 
     * @param element 
     */
    private void listCheckStateChanged(final Object element, final boolean checked) {
        Object listViewerInput = resourceListViewer.getInput();
        
        if (checked) {
            checkedListItems.put(listViewerInput, element);
        } else {
            checkedListItems.remove(listViewerInput, element);
        }
        
        // Update the tree item's check state
        boolean elementChecked = determineTreeItemCheckState(listViewerInput);
        boolean elementGrayed = determineTreeItemGrayedState(listViewerInput);
        
        applyNewTreeItemCheckState(listViewerInput,
                elementChecked,
                elementGrayed && !elementChecked,
                true,
                true);
    }
    
    /**
     * Applies a new tree selection to the list by using the selected element
     * as the list's new input, if any. The list viewer's check state is then
     * restored.
     * 
     * <p>Does not validate the page.</p>
     * 
     * @param element the element to be visited.
     * @param updateList {@code true} if the list's input should be set to the
     *                   element and the item check states restored.
     */
    private void visitTreeItem(final Object element, final boolean updateList) {
        // Was the item visited before?
        if (!visitedTreeItems.contains(element)) {
            // The item is now visited
            visitedTreeItems.add(element);
            
            // If the item is checked, we need to check its children...
            if (checkedTreeItems.contains(element)) {
                applyNewTreeItemCheckState(element, true, false, true, false);
            }
        }
        
        if (updateList) {
            resourceListViewer.setInput(element);
            
            // Restore the check states
            if (element != null) {
                Collection<Object> checkedItems = checkedListItems.get(element);
                
                resourceListViewer.setCheckedElements(checkedItems.toArray());
            }
        }
    }
    
    /**
     * Applies a tree item's new check state. Updates any children we may know about
     * and its ancestors, if any.
     * 
     * <p>This method updates the check state in the tree viewer, but is also called
     * as a response to the tree viewer's check state change event. This is no
     * problem, however, since the check state applied to the element in this method
     * is no different from the check state communicated in the event. Furthermore,
     * no check state change events are generated in response to non-user-initiated
     * check states.</p>
     * 
     * @param element the element whose check state has changed.
     * @param checked whether the element is now checked.
     * @param grayed whether the element is now grayed.
     * @param recurseDownwards if {@code true} and the element has already been
     *                         visited, all of its children get their check state
     *                         updated as well.
     * @param recurseUpwards if {@code true}, the element's ancestors get their
     *                       check state updated as well.
     */
    private void applyNewTreeItemCheckState(final Object element, final boolean checked,
            final boolean grayed, final boolean recurseDownwards,
            final boolean recurseUpwards) {
        
        if (grayed) {
            // The item is not checked, and we cannot say anything about its
            // childrens' check state, so we don't change anything there
            checkedTreeItems.remove(element);
            grayedTreeItems.add(element);
            
            resourceTreeViewer.setGrayChecked(element, true);
        } else {
            if (checked) {
                // The item is now checked
                checkedTreeItems.add(element);
                grayedTreeItems.remove(element);

                resourceTreeViewer.setChecked(element, true);
                resourceTreeViewer.setGrayed(element, false);
            } else {
                // The tree item isn't checked or grayed anymore
                checkedTreeItems.remove(element);
                grayedTreeItems.remove(element);

                resourceTreeViewer.setChecked(element, false);
                resourceTreeViewer.setGrayed(element, false);
            }
            
            // If the item has already been visited, update the element's
            // list items and possibly its children in the tree
            if (visitedTreeItems.contains(element)) {
                // Select list items and update the list if it currently shows
                // the element's children
                checkedListItems.removeAll(element);
                if (checked) {
                    checkedListItems.putAll(element, filterListItems(
                            resourceListContentProvider.getElements(element)));
                }
                
                if (resourceListViewer.getInput().equals(element)) {
                    visitTreeItem(element, true);
                }
                
                // If we should recurse downwards, update the item's children in
                // the tree
                if (recurseDownwards) {
                    for (Object child : resourceTreeContentProvider.getChildren(element)) {
                        applyNewTreeItemCheckState(child, checked, grayed, true, false);
                    }
                }
            }
        }
        
        // Possibly recurse upwards
        if (recurseUpwards) {
            Object parent = resourceTreeContentProvider.getParent(element);
            
            if (parent != null) {
                boolean parentChecked = determineTreeItemCheckState(parent);
                boolean parentGrayed = determineTreeItemGrayedState(parent);
                
                // Note: there is no need to recurse downwards here, since only
                // element has changed. If this caused the parent to be checked,
                // this means that all of its other children were already checked
                // and thus don't need to be updated. The same applies to the case
                // when the parent is unchecked. If it's grayed, nothing will be
                // changed about the states of its children anyway.
                applyNewTreeItemCheckState(parent, parentChecked,
                        parentGrayed && !parentChecked, false, true);
            }
        }
    }

    /**
     * Determines if the given tree item should be checked or not.
     * 
     * @param element the element to check...
     * @return {@code true} if it should be checked.
     */
    private boolean determineTreeItemCheckState(final Object element) {
        if (!visitedTreeItems.contains(element)) {
            // We don't know any of the tree item's children, so we will just
            // stay with the currently remembered check value
            return checkedTreeItems.contains(element);
        } else {
            // Find out if all of its children in the list are checked
            boolean allListChildrenChecked =
                checkedListItems.get(element).size()
                == filterListItems(resourceListContentProvider.getElements(element)).size();
            
            // Find out if all of its children in the tree are checked
            boolean allTreeChildrenChecked = true;
            for (Object child : resourceTreeContentProvider.getChildren(element)) {
                if (!checkedTreeItems.contains(child)) {
                    allTreeChildrenChecked = false;
                    break;
                }
            }
            
            return allListChildrenChecked && allTreeChildrenChecked;
        }
    }

    /**
     * Determines if the given tree item should be at least grayed or not. For the
     * item to be ultimately grayed, {@link #determineTreeItemCheckState(Object)}
     * must return {@code false}.
     * 
     * @param element the element to check...
     * @return {@code true} if it should be grayed.
     */
    private boolean determineTreeItemGrayedState(final Object element) {
        if (!visitedTreeItems.contains(element)) {
            // We don't know any of the tree item's children, so none of them
            // can be in the list of checked items, which is the only reason
            // that could cause this element to be grayed
            return false;
        } else {
            // Find out if any of its children in the list are checked
            boolean anyListChildrenChecked = checkedListItems.get(element).size() > 0;
            
            // Find out if any of its children in the tree are checked or grayed
            boolean anyTreeChildrenChecked = false;
            for (Object child : resourceTreeContentProvider.getChildren(element)) {
                if (checkedTreeItems.contains(child) || grayedTreeItems.contains(child)) {
                    anyTreeChildrenChecked = true;
                    break;
                }
            }
            
            return anyListChildrenChecked || anyTreeChildrenChecked;
        }
    }
    
    /**
     * Applies the tree viewer filters to the given array of tree viewer items.
     * 
     * @param items array of items to filter.
     * @return filtered list of items.
     */
    private List<Object> filterTreeItems(final Object[] items) {
        List<Object> result = new ArrayList<Object>(items.length);
        ViewerFilter[] filters = resourceTreeViewer.getFilters();
        
        for (Object item : items) {
            boolean select = true;
            
            for (ViewerFilter filter : filters) {
                if (!filter.select(
                        resourceTreeViewer, resourceTreeContentProvider.getParent(item), item)) {
                    
                    select = false;
                    break;
                }
            }
            
            if (select) {
                result.add(item);
            }
        }
        
        return result;
    }
    
    /**
     * Applies the list viewer filters to the given array of list viewer items.
     * 
     * @param items array of items to filter.
     * @return filtered list of items.
     */
    private List<Object> filterListItems(final Object[] items) {
        List<Object> result = new ArrayList<Object>(items.length);
        ViewerFilter[] filters = resourceListViewer.getFilters();
        Object listViewerInput = resourceListViewer.getInput();
        
        for (Object item : items) {
            boolean select = true;
            
            for (ViewerFilter filter : filters) {
                if (!filter.select(resourceListViewer, listViewerInput, item)) {
                    select = false;
                    break;
                }
            }
            
            if (select) {
                result.add(item);
            }
        }
        
        return result;
    }
}
