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
package de.cau.cs.kieler.sccharts.ui.wizard

import de.cau.cs.kieler.sccharts.ui.SCChartsUiModule
import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.PartInitException
import org.eclipse.ui.dialogs.WizardNewFileCreationPage
import org.eclipse.ui.ide.IDE
import org.eclipse.ui.internal.ide.DialogUtil
import org.eclipse.ui.internal.wizards.newresource.ResourceMessages
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SctxFileWizard extends BasicNewResourceWizard {

    static val FILE_EXT = "sctx"

    var WizardNewFileCreationPage mainPage

    override addPages() {
        super.addPages()
        mainPage = new WizardNewFileCreationPage("newFilePage", getSelection()) {
            override getInitialContents() {
                val template = '''
                    scchart NewSCChart {
                    
                        region {
                            initial state A
                        }
                    }
                '''
                return new ByteArrayInputStream(template.getBytes(StandardCharsets.UTF_8))
            }
        };
        mainPage.setTitle("Create SCChart");
        mainPage.setDescription("Create a new textual SCCharts file.");
        mainPage.fileExtension = FILE_EXT
        addPage(mainPage);
    }

    override init(IWorkbench workbench, IStructuredSelection currentSelection) {
        super.init(workbench, currentSelection)
        setWindowTitle("Create new SCCharts File")
        setNeedsProgressMonitor(true)
    }


    override initializeDefaultPageImageDescriptor() {
       setDefaultPageImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(SCChartsUiModule.PLUGIN_ID, "icons/sccharts_icon16.png"))
    }
    
    override boolean performFinish() {
        val file = mainPage.createNewFile();
        if (file === null) {
            return false;
        }

        selectAndReveal(file);

        // Open editor on new file.
        val dw = getWorkbench().getActiveWorkbenchWindow();
        try {
            if (dw !== null) {
                val page = dw.getActivePage();
                if (page !== null) {
                    IDE.openEditor(page, file, true);
                }
            }
        } catch (PartInitException e) {
            DialogUtil.openError(dw.getShell(), ResourceMessages.FileResource_errorMessage,
                    e.getMessage(), e);
        }

        return true;
    }
    
}