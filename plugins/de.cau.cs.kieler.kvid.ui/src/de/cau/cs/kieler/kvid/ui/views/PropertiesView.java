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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.kvid.datadistributor.Property;
import de.cau.cs.kieler.kvid.datadistributor.RuntimeConfiguration;
import de.cau.cs.kieler.kvid.ui.providers.PropertyContentProvider;
import de.cau.cs.kieler.kvid.ui.providers.PropertyLabelProvider;

public class PropertiesView extends ViewPart {
    
    private TableViewer tableViewer;

    @Override
    public void createPartControl(Composite parent) {       
        tableViewer = new TableViewer(parent, SWT.NONE);
        Table propertyTable = tableViewer.getTable();
        propertyTable.setHeaderVisible(true);
        propertyTable.setLinesVisible(true);
        
        TableViewerColumn viewerPropertyColumn = new TableViewerColumn(tableViewer, SWT.NONE);
        viewerPropertyColumn.getColumn().setText("Property");
        viewerPropertyColumn.getColumn().setWidth(250);
        
        TableViewerColumn viewerValueColumn = new TableViewerColumn(tableViewer, SWT.NONE);
        viewerValueColumn.getColumn().setText("Value");
        viewerValueColumn.getColumn().setWidth(250);
        
        tableViewer.setContentProvider(ArrayContentProvider.getInstance());
                
        viewerPropertyColumn.setLabelProvider(new CellLabelProvider() {
            
            @Override
            public void update(ViewerCell cell) {
                cell.setText(((Property)(cell.getElement())).getName());
            }
        });
        
        viewerValueColumn.setLabelProvider(new CellLabelProvider() {
            
            @Override
            public void update(ViewerCell cell) {
                cell.setText(((Property)(cell.getElement())).getCurrentValue());
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
                return new ComboBoxCellEditor(tableViewer.getTable(), ((Property) element).getValueNames());
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
