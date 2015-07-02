/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.filewizard

import java.io.PrintWriter
import org.eclipse.core.resources.IFile
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.dialogs.WizardNewFileCreationPage
import org.eclipse.ui.ide.IDE
import org.eclipse.ui.internal.ide.misc.ResourceAndContainerGroup

/**
 * @author aas
 *
 */
class SCTFileCreationPage extends WizardNewFileCreationPage {
    
    new(String pageName, IStructuredSelection selection) {
        super(pageName, selection)
        
        title = pageName
        fileName = "NewModel"
        fileExtension = "sct"
    }
    
    private Composite parent
    
    public override createControl(Composite parent){
        super.createControl(parent)
        this.parent = parent
    }
    
    def refreshResources(){
        control.dispose
        
        createControl(parent)
        
        parent.layout()
        parent.redraw()
        parent.update()
    }
    
    def boolean isOk(){
        return validatePage()
    }
    
    def boolean performFinish(){
        val file = createNewFile()
        
        // Add default contents to sccharts
        writeDefaultContents(file)
        
        // Open file in editor
        openFileInEditor(file)
        
        return true
    }
    
    private def openFileInEditor(IFile file){
        val wb = PlatformUI.getWorkbench();
        val win = wb.getActiveWorkbenchWindow();
        val page = win.getActivePage();
        IDE.openEditor(page, file)
    }
    
    /**
     * Write the default contents for an sct file to a file.
     */
    private def writeDefaultContents(IFile file){
        // Better copy This should be a default file 
        val writer = new PrintWriter(file.location.toOSString, "UTF-8");
        writer.println(defaultContents.replace("${name}", file.name.replace(".sct","") ));
        writer.close();
    }
    
    // This should really be loaded from a configurable file. 
    private val defaultContents = ""  
    + "scchart ${name} {\n"
    + "    \n"
    + "    initial state init;\n"
    + "}"
}