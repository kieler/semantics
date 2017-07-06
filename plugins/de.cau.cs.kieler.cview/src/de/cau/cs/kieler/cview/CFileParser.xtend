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

/**
 * @author cmot
 * 
 */
class CFileParser {

    def static IASTTranslationUnit parse(char[] code) throws Exception {
        val fc = FileContent.create("/Path/ToResolveIncludePaths.cpp", code);
        val macroDefinitions = new HashMap<String, String>();
        val String[] includeSearchPaths = #[]
        val si = new ScannerInfo(macroDefinitions, includeSearchPaths);
        val ifcp = IncludeFileContentProvider.getEmptyFilesProvider();
        val idx = null;
        val options = ILanguage.OPTION_IS_SOURCE_UNIT;
        val log = new DefaultLogService();
        return GPPLanguage.getDefault().getASTTranslationUnit(fc, si, ifcp, idx, options, log);
    }

}
