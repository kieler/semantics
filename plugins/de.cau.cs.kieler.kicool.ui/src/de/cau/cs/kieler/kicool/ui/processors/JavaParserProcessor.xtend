/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.processors

import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.kicool.compilation.JavaCodeFile
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.core.dom.AST
import org.eclipse.jdt.core.dom.ASTParser
import org.eclipse.jdt.core.dom.CompilationUnit

/**
 * @author kolja
 * 
 */
class JavaParserProcessor extends ExogenousProcessor<CodeContainer, CompilationUnit> {

    override getId() {
        "de.cau.cs.kieler.kicool.ui.processors.javaParser"
    }

    override getName() {
        "Java Parser"
    }

    override process() {

        val model = getModel()
        val result = <CompilationUnit>newArrayList
        model.files.filter(JavaCodeFile).forEach [
            val parser = ASTParser.newParser(AST.JLS13)
            parser.source = code.toCharArray
            val options = JavaCore.getOptions();
            JavaCore.setComplianceOptions(JavaCore.VERSION_13, options);
            parser.setCompilerOptions(options);
            result.add(parser.createAST(null) as CompilationUnit)
        ]
        setModel(result.head)
    }
}
