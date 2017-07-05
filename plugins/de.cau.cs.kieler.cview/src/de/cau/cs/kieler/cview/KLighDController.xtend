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
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import java.io.File

/**
 * @author cmot
 * 
 */
class KLighDController extends AbstractKLighDController {
    
    def void addToModel(CViewModel model, Object element) {
        var filePath = getFilePath(element);
        var folderPath = getDirPath(element);
        val projectPath = getProjectPath(element);

        if (element instanceof File) {
            if (!element.isDirectory) {
                filePath = element.absolutePath
            } else {
                folderPath = element.absolutePath
            }
        }

        if (!projectPath.nullOrEmpty) {
            // Project
            val folder = CViewModelFactory.eINSTANCE.createFolder;
            folder.location = folderPath;
            folder.name = element.toString.folderOrFileName
            folder.project = true
            model.folders.add(folder)

//            listFiles(folder.location, "*").forEach [ e |
//                model.addToModel(e)
//            ];
        } else if (!folderPath.nullOrEmpty) {
            // Folder   
            val folder = CViewModelFactory.eINSTANCE.createFolder;
            folder.location = folderPath;
            folder.name = element.toString.folderOrFileName
            folder.project = false
            model.folders.add(folder)

            for (e : listFiles(folder.location, "*")) {
                model.addToModel(e)
            }

//            listFiles(folder.location, "*").forEach [ e |
//                model.addToModel(e)
//            ];
        } else if (!filePath.nullOrEmpty) {
            // File
            val file = CViewModelFactory.eINSTANCE.createFile;
            file.location = folderPath;
            file.name = element.toString.folderOrFileName
            model.files.add(file);
        }

    }

    def folderOrFileName(String folderOrFilePath) {
        var i = folderOrFilePath.lastIndexOf("\\");
        var j = folderOrFilePath.lastIndexOf("/");

        if (j > 0) {
            i = j;
        }
        if (i > 0) {
            // Path or File?
            if (i == folderOrFilePath.length) {
                var i2 = folderOrFilePath.lastIndexOf("\\", i - 1);
                var j2 = folderOrFilePath.lastIndexOf("/", i - 1);
                if (j2 > 0) {
                    i2 = j2;
                }
                return folderOrFilePath.substring(i2+1);
            }
            return folderOrFilePath.substring(i+1);
        } else {
            return folderOrFilePath;
        }
    }

    override calculateModel(Object[] allselections) {

        model = CViewModelFactory.eINSTANCE.createCViewModel();

        for (Object element : allselections) {
            model.addToModel(element)
        }
        return model;
    }

}
