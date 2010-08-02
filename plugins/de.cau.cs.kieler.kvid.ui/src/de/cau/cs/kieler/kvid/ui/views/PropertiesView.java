package de.cau.cs.kieler.kvid.ui.views;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;

public class PropertiesView extends ViewPart {
    
    private TableViewer tableViewer;

    @Override
    public void createPartControl(Composite parent) {
        Table table = new Table(parent, SWT.BORDER);
        TableColumn column = new TableColumn(table, SWT.NONE);
        column.setWidth(80);
        tableViewer = new TableViewer(table);
    }

    @Override
    public void setFocus() {
        tableViewer.getControl().setFocus();
    }

}
