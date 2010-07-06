package de.cau.cs.kieler.synccharts.custom;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * A custom TextCellEditor that uses only the SWT.MULTI Style to support
 * multiline labels. It does not use autowrap which has unpleasing results
 * on places where the text field's size increases over time, e.g. in-place editing of 
 * GMF/GEF Editors. 
 * 
 * @author haf
 */
public class WrapTextCellEditor extends
    org.eclipse.gmf.runtime.gef.ui.internal.parts.WrapTextCellEditor {

    // change the default style from autowrap to manual wrap only
    // autowrap is pretty awkward for in-place editors as their size is also
    // automatically increased. 
    // old style:
    //private static final int defaultStyle = SWT.WRAP | SWT.MULTI;
    private static final int defaultStyle = SWT.MULTI ;
    
    
    public WrapTextCellEditor() {
            setStyle(defaultStyle);
    }
    public WrapTextCellEditor(Composite parent) {
            this(parent, defaultStyle);
    }
    public WrapTextCellEditor(Composite parent, int style) {
            super(parent, style);
    }
}
