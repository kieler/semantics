package de.cau.cs.kieler.kvid.ui.providers;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class PropertyLabelProvider extends LabelProvider implements ITableLabelProvider {

    public Image getColumnImage(Object element, int columnIndex) {
        // TODO Auto-generated method stub
        return null;
    }

    public String getColumnText(Object element, int columnIndex) {
        if (columnIndex == 0) {
            return "Animation Activated";
        } else if (columnIndex == 1) {
            return "Figure behavior after animation";
        } else if (columnIndex == 2) {
            return "Placement if animation is deactivated";
        }
        return null;
    }

}
