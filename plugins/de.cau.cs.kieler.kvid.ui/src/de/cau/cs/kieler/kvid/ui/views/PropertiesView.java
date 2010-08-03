/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
 */
package de.cau.cs.kieler.kvid.ui.views;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.kvid.datadistributor.Property;
import de.cau.cs.kieler.kvid.datadistributor.RuntimeConfiguration;

/**
 * 
 * Eclipse view for editing KViD properties by hand.
 * 
 * @author jjc
 *
 */
public class PropertiesView extends ViewPart {
    
    private TableViewer tableViewer;
    
    private static final int COLUMN_WIDTH = 250;

    @Override
    /**
     * {@inheritDoc}
     */
    public void createPartControl(final Composite parent) {       
        tableViewer = new TableViewer(parent, SWT.NONE);
        Table propertyTable = tableViewer.getTable();
        propertyTable.setHeaderVisible(true);
        propertyTable.setLinesVisible(true);
        
        TableViewerColumn viewerPropertyColumn = new TableViewerColumn(tableViewer, SWT.NONE);
        viewerPropertyColumn.getColumn().setText("Property");
        viewerPropertyColumn.getColumn().setWidth(COLUMN_WIDTH);
        
        TableViewerColumn viewerValueColumn = new TableViewerColumn(tableViewer, SWT.NONE);
        viewerValueColumn.getColumn().setText("Value");
        viewerValueColumn.getColumn().setWidth(COLUMN_WIDTH);
        
        tableViewer.setContentProvider(ArrayContentProvider.getInstance());
                
        viewerPropertyColumn.setLabelProvider(new CellLabelProvider() {
            
            @Override
            public void update(ViewerCell cell) {
                cell.setText(((Property) (cell.getElement())).getName());
            }
        });
        
        viewerValueColumn.setLabelProvider(new CellLabelProvider() {
            
            @Override
            public void update(ViewerCell cell) {
                cell.setText(((Property) (cell.getElement())).getCurrentValue());
            }
        });
        
        viewerValueColumn.setEditingSupport(new EditingSupport(tableViewer) {
            
            @Override
            protected void setValue(Object element, Object value) {
                ((Property) element).setCurrentValue((Integer) value);
                tableViewer.refresh(element);
            }
            
            @Override
            protected Object getValue(Object element) {
                return ((Property) element).getCurrentValueNumber();
            }
            
            @Override
            protected CellEditor getCellEditor(Object element) {
                ComboBoxCellEditor box = new ComboBoxCellEditor(tableViewer.getTable(), ((Property) element).getValueNames());
                return box;
            }
            
            @Override
            protected boolean canEdit(Object element) {
                return true;
            }
        });
        
        tableViewer.setInput(RuntimeConfiguration.getInstance().getKnownOptions());
    }

    @Override
    public void setFocus() {
        tableViewer.getControl().setFocus();
    }

}
