/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.cview

import de.cau.cs.kieler.cview.AbstractKLighDController
import de.cau.cs.kieler.cview.model.cViewModel.CViewModelFactory

/**
 * @author cmot
 *
 */
class KLighDController extends AbstractKLighDController {
    
    override calculateModel(Object[] allselections) {
        
                model = CViewModelFactory.eINSTANCE.createCViewModel();
        
                for (Object element : allselections) {
                    
                    val filePath = getFilePath(element);
                    val folderPath = getFolderPath(element);
                    val projectPath = getProjectPath(element);
                    
                    if (!projectPath.nullOrEmpty) {
                        // Project
                        val folder = CViewModelFactory.eINSTANCE.createFolder;
                        folder.location = folderPath;
                        folder.name = element.toString
                        folder.project = true
                        model.folders.add(folder)
                    } else if (!folderPath.nullOrEmpty) {
                        // Folder   
                        val folder = CViewModelFactory.eINSTANCE.createFolder;
                        folder.location = folderPath;
                        folder.name = element.toString
                        folder.project = false
                        model.folders.add(folder)
                    } else if (!filePath.nullOrEmpty) {
                        // File
                        val file = CViewModelFactory.eINSTANCE.createFile;
                        file.location = folderPath;
                        file.name = element.toString
                        model.files.add(file);
                    }
                }
                return model;
    }
    
}