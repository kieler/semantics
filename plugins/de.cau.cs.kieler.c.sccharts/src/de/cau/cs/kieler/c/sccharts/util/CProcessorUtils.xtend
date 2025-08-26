/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.c.sccharts.util

import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.environments.Environment
import java.io.File
import java.util.HashMap
import org.eclipse.cdt.core.dom.ast.IASTName
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import org.eclipse.cdt.core.dom.ast.gnu.c.GCCLanguage
import org.eclipse.cdt.core.index.IIndex
import org.eclipse.cdt.core.model.ICProject
import org.eclipse.cdt.core.parser.DefaultLogService
import org.eclipse.cdt.core.parser.FileContent
import org.eclipse.cdt.core.parser.IParserLogService
import org.eclipse.cdt.core.parser.IncludeFileContentProvider
import org.eclipse.cdt.core.parser.ScannerInfo
import org.eclipse.core.resources.IResource

/**
 * Class with some utility methods for processors handling C files.
 * 
 * @author nre
 */
final class CProcessorUtils {
    
    // No instance of this class possible.
    private new() {}
    
    /**
     * Finds the given file with absolute path in the C Project and return the resource within the project, if
     * available. Returns {@code null} if the file is not in the given project.
     */
    static def IResource findFileInProject(File file, ICProject project) {
        val fileLocation = file.absolutePath
        for (resource : project.resource.project.members) {
            val resourceLocation = resource.rawLocation.toString
            if (fileLocation.equals(resourceLocation)) {
                return resource
            }
        }
        return null
    }
    
    
    /**
     * Builds a new AST from the file in this environment without context.
     * 
     * @return The AST for the file to process.
     */
    static def IASTTranslationUnit findAstNoProject(Environment environment) {
        
        val infrastructure = ProjectInfrastructure.getProjectInfrastructure(environment)
        
        
        val fileName = infrastructure.modelFile.absolutePath
        
        val FileContent fileContent = FileContent.createForExternalFileLocation(fileName)

        val definedSymbols = new HashMap
        val String[] includePaths = #[]
        val ScannerInfo info = new ScannerInfo(definedSymbols, includePaths);
        val IParserLogService log = new DefaultLogService();

        val IncludeFileContentProvider emptyIncludes = IncludeFileContentProvider.getEmptyFilesProvider();

        val int opts = 8;
//        return GCCLanguage.getDefault().getASTTranslationUnit(fileContent, info, emptyIncludes, null, opts, log);
        return GCCLanguage.getDefault().getASTTranslationUnit(fileContent, info, emptyIncludes, null, opts, log);
    }
    
    /**
     * Turns the {@code IASTName} of function or function references within ASTs into a uniquely identifiable object for
     * mapping. Is either an {@code IIndexBinding} if a valid index is given, or a string.
     * 
     * @param name The function name of the function or function reference.
     * @param index The index to identify the function in. May be {@code null}.
     * @return A uniquely identifiable object for the function.
     */
    static def Object nameToIdentifier(IASTName name, IIndex index) {
        index?.acquireReadLock
        var Object identifier
        try {
            identifier = index?.findBinding(name) ?: name.toString
        } finally {
            index?.releaseReadLock
        }
        return identifier
    }
    
}