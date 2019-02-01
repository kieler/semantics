/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.verification.ui.view

import org.eclipse.jface.dialogs.IInputValidator
import org.eclipse.jface.dialogs.InputDialog
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionListener
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Shell
import org.eclipse.xtend.lib.annotations.Accessors

/** 
 * @author aas
 */
class EditSmvCommandsDialog extends InputDialog {
    
    @Accessors SelectionListener selectionListener
    
    new(Shell parentShell, String dialogTitle, String dialogMessage, String initialValue, IInputValidator validator) {
        super(parentShell, dialogTitle, dialogMessage, initialValue, validator)
    }
    
    override createDialogArea(Composite parent)  {
      val result = super.createDialogArea(parent)
    
      val text = getText()
    
      val data = new GridData(GridData.FILL_BOTH)
      data.grabExcessHorizontalSpace = true
      data.grabExcessVerticalSpace = true
      // The layout does not use the vertical space of its parent somehow, so just set a height explicitly. 
      val rowCount = 10
      data.heightHint = convertHeightInCharsToPixels(rowCount);
      text.setLayoutData(data)
      
      if(selectionListener !== null) {
          text.addSelectionListener(selectionListener)
      }
      
      return result
    }
    
    override getInputTextStyle() {
      return SWT.MULTI.bitwiseOr(SWT.BORDER)
    }
    
    
}
