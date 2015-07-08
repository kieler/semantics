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

import de.cau.cs.kieler.sccharts.launchconfig.common.ui.UIUtil
import java.io.PrintWriter
import org.eclipse.core.resources.IFile
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.dialogs.WizardNewFileCreationPage

/**
 * Implementation of a IWizardPage
 * that contains controls to specify a sct file which should be created.
 * 
 * @author aas
 *
 */
class SCTFileCreationPage extends WizardNewFileCreationPage {
    
    /**
     * The parent composite of the controls of this class.
     * The value is set in createControl(...) and used to recreate the controls using the same parent.
     */
    protected Composite parent
    
    new(String pageName, IStructuredSelection selection) {
        super(pageName, selection)
        
        title = pageName
        fileName = "NewModel"
        fileExtension = "sct"
        description = "Create a new SCT file."
    }
    
    /**
     * Creates the controls of this wizard page and sets the reference to the parent composite.
     */
    public override createControl(Composite parent){
        super.createControl(parent)
        this.parent = parent
    }
    
    /**
     * Recreates the controls of this wizard page.
     * This method can be used to refresh the resource tree.
     * Note that user modifications to the old controls are lost when calling this method. 
     */
    public def recreate(){
        // Remove old
        control.dispose()
        
        // Create new
        createControl(parent)
        
        // Update visuals
        parent.layout()
        parent.redraw()
        parent.update()
    }
    
    /**
     * @return true if the user input is valid.<br />
     *         false otherwise.
     */
    public def boolean isOk(){
        return validatePage()
    }
    
    /**
     * Creates the file if the input is valid and fills it with the default contents of an sct file.
     * After creation the file is opened in an editor.
     */
    public def boolean performFinish(){
        if(isOk()){
            val file = createNewFile()
            
            // Add default contents to sccharts
            writeDefaultContents(file)
            
            // Open file in editor
            UIUtil.openFileInEditor(file)
            
            return true
        } else {
            return false
        }
    }
    
    /**
     * Fills a file with the default contents of an sct file.
     */
    protected def writeDefaultContents(IFile file){
        val writer = new PrintWriter(file.location.toOSString, "UTF-8");
        writer.println(defaultContents.replace("${name}", file.name.replace(".sct","") ));
        writer.close();
    }
    
     /**
     * A string with the default contents of an sct file.
     */
    //This should really be loaded from a (configurable?) file.
    protected val defaultContents = ""  
    + "scchart ${name} {\n"
    + "    \n"
    + "    initial state init;\n"
    + "}"
}