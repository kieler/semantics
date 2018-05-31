/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.compilation

import java.io.File
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Data

import static extension com.google.common.base.Preconditions.*

/**
 * A CodeContainer contains a map of files. Each file is represented by a string.
 * 
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
class CodeContainer {
    
    @Accessors List<CodeFile> files = <CodeFile>newArrayList
    
    def get(String file) {
        files.findFirst[fileName.equals(file)]
    }
    
    def getHead() {
        files.head
    }
    
    def getFilesMap() {
        return files.toMap[fileName]
    }
    
    def add(String fileName, String code) {
        files += new CodeFile(fileName, code)
    }
    
    def addCHeader(String fileName, String code, String dataStructName) {
        files += new CCodeFile(fileName, code, true, dataStructName)
    }
    
    def addCCode(String fileName, String code, String dataStructName) {
        files += new CCodeFile(fileName, code, false, dataStructName)
    }
    
    def addJavaCode(String fileName, String code) {
        checkArgument(fileName.endsWith(".java"), "File name has not the correct pattern for java source files")
        files += new JavaCodeFile(fileName, code, fileName.substring(0, fileName.indexOf(".java")))
    }
}

@Data
class CodeFile {
    
    val String fileName
    val String code
    
    def getFile() {
        return new File(fileName)
    }
}

@Data
class CCodeFile extends CodeFile {
    
    val boolean header
    val String dataStructName
}

@Data
class JavaCodeFile extends CodeFile {
    
    val String className
}