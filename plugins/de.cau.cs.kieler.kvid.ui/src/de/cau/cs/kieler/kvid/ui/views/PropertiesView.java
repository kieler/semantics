package de.cau.cs.kieler.kvid.ui.views;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellLabelProvider;
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

        tableViewer.setInput(RuntimeConfiguration.getInstance().getKnownOptions());
    }

    @Override
    public void setFocus() {
        tableViewer.getControl().setFocus();
    }

}
