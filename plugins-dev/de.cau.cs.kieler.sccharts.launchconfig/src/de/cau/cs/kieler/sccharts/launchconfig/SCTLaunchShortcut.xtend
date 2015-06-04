package de.cau.cs.kieler.sccharts.launchconfig

import org.eclipse.core.resources.IFile
import org.eclipse.debug.ui.ILaunchShortcut
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.ide.ResourceUtil

class SCTLaunchShortcut implements ILaunchShortcut {
    /**
     * {@inheritDoc}
     */
    override void launch(IEditorPart editor, String mode) {
        val file = ResourceUtil.getFile(editor.editorInput)
        if(file != null)
            launch(file)
    }
    
    /**
     * {@inheritDoc}
     */
    override void launch(ISelection selection, String mode) {
        if (selection instanceof IStructuredSelection) {
            val s = selection as IStructuredSelection
            if(s.firstElement instanceof IFile)
                launch(s.firstElement as IFile)
        }
    }
    
    /**
     * Launch the sct file by adding it to an existing launch config of this project or creating a new one if none yet.
     */
    def launch(IFile file){
        println(file.location)
        println(file.projectRelativePath)
    }

}
