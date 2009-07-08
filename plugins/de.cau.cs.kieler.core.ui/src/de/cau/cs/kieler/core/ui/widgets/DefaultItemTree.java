/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.core.ui.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

/**
 * @author haf
 *
 */
public class DefaultItemTree extends Composite {    

    Tree tree;
    
    /**
     * @param parent
     * @param style
     */
    public DefaultItemTree(Composite parent, int style) {
        super(parent, style);
        createControls(style);
    }
    
    private void createControls(int style){
        final DefaultItemTree parent = this;
        Layout layout = new FillLayout();
        parent.setLayout(layout);
        
        tree = new Tree(parent, style | SWT.CHECK);
        
        // add listener to selection events
        tree.addSelectionListener(new SelectionListener(){
            public void widgetDefaultSelected(SelectionEvent e) {
                // TODO Auto-generated method stub
            }
            public void widgetSelected(SelectionEvent e) {
                parent.itemSelected(e);
            }
        });
    }
    
    /**
     * Sets a new checked item given in the SelectionEvent.
     * @param e
     */
    public void itemSelected(SelectionEvent e){
        TreeItem ti = (TreeItem)e.item;
        this.setChecked(ti);
    }
    
    /**
     * Get the tree which is the basis of this composite. 
     * This method can be used to add new TreeItem objects
     * to the tree by passing the tree as parent in the 
     * TreeItem constructor.
     * @return basis tree of this composite
     */
    public Tree getTree(){
        return tree;
    }
    
    /**
     * Set the expanded state of all elements of the tree.
     * Also sets the expanded state for all children
     * recursively.
     * @param state new state
     */
    public void setExpanded(boolean state){
        for (TreeItem ti : tree.getItems()) {
            ti.setExpanded(state);
            setExpanded(ti, state);
        }
        tree.redraw();
    }
    
    /**
     * Recursively set the expanded state of the children.
     * @param item 
     * @param state the new state
     */
    void setExpanded(TreeItem item, boolean state){
        for (TreeItem ti : item.getItems()) {
            ti.setExpanded(state);
            setExpanded(ti, state);
        } 
    }
    
    /**
     * Get the first checked item of the tree. May return null
     * if no item is checked
     * @return first checked item, might be null
     */
    public TreeItem getChecked(){
        for (TreeItem child : tree.getItems()) {
            TreeItem childItem = getChecked(child);
            if ( childItem != null ){
                return childItem;
            }
        }
        return null;
    }
    
    /**
     * Recursively determine which item is the first
     * checked item.
     * @param root
     * @return
     */
    protected TreeItem getChecked(TreeItem root){
        if( root.getChecked() )
            return root;
        else{
            for (TreeItem child : root.getItems()) {
                TreeItem childItem = getChecked(child);
                if ( childItem != null ){
                    return childItem;
                }
            }
        }
       // no checked item found
       return null;
    }
    
    /**
     * Searches the first leaf of the checked item in 
     * the tree. If the checked item itself is a leaf
     * the it will be returned. Otherwise the first leaf 
     * in a DFS will be returned.
     * @return
     */
    public TreeItem getDeepChecked(){
        TreeItem checked = getChecked();
        return getDeepChecked(checked);
    }
    
    /**
     * @param checked
     */
    private TreeItem getDeepChecked(TreeItem root) {
        if(root == null)
            return null;
        if( root.getItemCount() <= 0 )
            return root;
        else
            return getDeepChecked(root.getItem(0));
    }

    /**
     * Sets the given item in the tree checked. All other
     * items get unchecked.
     * @param ti
     */
    public void setChecked(TreeItem ti){
        TreeItem[] items = tree.getItems();
        for (TreeItem treeItem : items) {
            setChecked(treeItem, ti);
        }
    }
    
    /**
     * Sets the given item in the tree under the given root element
     * as checked and all other items to unchecked. Will
     * traverse the tree recursively.
     * @param root
     * @param checkedItem
     */
    protected void setChecked(TreeItem root, TreeItem checkedItem){
        if( root == checkedItem )
            root.setChecked(true);
        else
            root.setChecked(false);
        TreeItem[] items = root.getItems();
        for (TreeItem treeItem : items) {
            setChecked(treeItem, checkedItem);
        }
    }
    
    public void debug(){
        System.out.println("Size:"+tree.computeSize(SWT.DEFAULT, SWT.DEFAULT));
    }
    
}
