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

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.kvid.datadistributor.IPropertyListener;
import de.cau.cs.kieler.kvid.datadistributor.Property;
import de.cau.cs.kieler.kvid.datadistributor.RuntimeConfiguration;
import de.cau.cs.kieler.kvid.ui.KViDUIPlugin;

/**
 * 
 * Eclipse view for editing KViD properties by hand.
 * 
 * @author jjc
 *
 */
public class PropertiesView extends ViewPart implements IPropertyListener {
    
    private TableViewer tableViewer;
    
    private Step step;
    
    private static final int COLUMN_WIDTH = 250;

    @Override
    /**
     * {@inheritDoc}
     */
    public void createPartControl(final Composite parent) {       
        RuntimeConfiguration.getInstance().addPropertyListener(this);
        
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
            public void update(final ViewerCell cell) {
                cell.setText(((Property) (cell.getElement())).getName());
            }
        });
        
        viewerValueColumn.setLabelProvider(new CellLabelProvider() {
            
            @Override
            public void update(final ViewerCell cell) {
                cell.setText(((Property) (cell.getElement())).getCurrentValue());
            }
        });
        
        viewerValueColumn.setEditingSupport(new EditingSupport(tableViewer) {
            
            @Override
            protected void setValue(final Object element, final Object value) {
                if (((Property) element).isFreeText()) {
                    ((Property) element).setCurrentValue(String.valueOf(value));
                } else {
                    ((Property) element).setCurrentValue((Integer) value);
                }
                tableViewer.refresh(element);
            }
            
            @Override
            protected Object getValue(final Object element) {
                if (((Property) element).isFreeText()) {
                    return ((Property) element).getCurrentValue();
                } else {
                    return ((Property) element).getCurrentValueNumber();
                }
            }
            
            @Override
            protected CellEditor getCellEditor(final Object element) {
                CellEditor cell;
                if (((Property) element).isFreeText()) {
                    cell = new TextCellEditor(tableViewer.getTable());
                } else {
                    cell = new ComboBoxCellEditor(tableViewer.getTable(),
                            ((Property) element).getValueNames(), SWT.READ_ONLY);
                }
                return cell;
            }
            
            @Override
            protected boolean canEdit(final Object element) {
                return true;
            }
        });
        
        IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
        step = new Step();
        step.setImageDescriptor(KViDUIPlugin.imageDescriptorFromPlugin(KViDUIPlugin.PLUGIN_ID, "icons/stepIcon.png"));
        step.setDisabledImageDescriptor(KViDUIPlugin.imageDescriptorFromPlugin(KViDUIPlugin.PLUGIN_ID, "icons/stepIconDisabled.png"));
        step.setEnabled(false);
        toolBarManager.add(step);
        
        tableViewer.setInput(RuntimeConfiguration.getInstance().getKnownProperties());
    }

    @Override
    /**
     * {@inheritDoc}
     */
    public void setFocus() {
        tableViewer.getControl().setFocus();
    }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.kvid.datadistributor.IPropertyListener#triggerPropertyChanged(de.cau.cs.kieler.kvid.datadistributor.Property)
     */
    public void triggerPropertyChanged(Property changedProperty) {
        if (changedProperty.getName().equals("Path to CSV File")) {
            step.setEnabled(true);
        }
        if (changedProperty.getName().equals("Data Source")) {
            if (changedProperty.getCurrentValue().equals("KIEM")) {
                step.setEnabled(false);
            }
        }
        tableViewer.setInput(RuntimeConfiguration.getInstance().getKnownProperties());
    }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.kvid.datadistributor.IPropertyListener#triggerPropertyListChanged()
     */
    public void triggerPropertyListChanged() {
        tableViewer.setInput(RuntimeConfiguration.getInstance().getKnownProperties());
    }

}
