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
package de.cau.cs.kieler.cview.c

//import java.util.*
//import org.eclipse.cdt.core.dom.ast.*
import org.eclipse.cdt.core.dom.ast.gnu.cpp.GPPLanguage
//import org.eclipse.cdt.core.index.IIndex
import org.eclipse.cdt.core.model.ILanguage
//import org.eclipse.cdt.core.parser.*
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.cdt.core.parser.FileContent
import java.util.HashMap
import org.eclipse.cdt.core.parser.ScannerInfo
import org.eclipse.cdt.core.parser.IncludeFileContentProvider
import org.eclipse.cdt.core.parser.DefaultLogService
import org.eclipse.cdt.core.model.ITranslationUnit
import org.eclipse.cdt.core.model.CoreModel
import org.eclipse.cdt.core.CCorePlugin
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.Path

/**
 * @author cmot
 * 
 */
class CFileParser {

    def static IASTTranslationUnit parse(char[] code, IFile file) throws Exception {

// DEPRECATED OLD PARSING CODE
//        val fc = FileContent.create("/Path/ToResolveIncludePaths.cpp", code);
//        val macroDefinitions = new HashMap<String, String>();
//        val String[] includeSearchPaths = #[]
//        val si = new ScannerInfo(macroDefinitions, includeSearchPaths);
//        val ifcp = IncludeFileContentProvider.getEmptyFilesProvider();
//        val idx = null;
//        val options = ILanguage.OPTION_IS_SOURCE_UNIT;
//        val log = new DefaultLogService();
//        return GPPLanguage.getDefault().getASTTranslationUnit(fc, si, ifcp, idx, options, log);

//        val componentPath = new Path(component.location)
//        val componentFile = ResourcesPlugin.workspace.root.getFileForLocation(componentPath)
        
        val componentTU = CoreModel.^default.create(file.rawLocation) as ITranslationUnit
        val componentProject = CoreModel.^default.CModel.getCProject(file.project.name)
        val componentIndex = CCorePlugin.indexManager.getIndex(componentProject)
        componentIndex.acquireReadLock
        val ast = componentTU.getAST(componentIndex, ITranslationUnit.AST_SKIP_INDEXED_HEADERS)
        return ast
    }

}
