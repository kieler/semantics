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
import java.nio.file.Files
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

import static com.google.common.base.Preconditions.*

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
    
    def addProxy(File file) {
        files += new CodeFile(file, null)
    }
        
    def addProxy(File file, String code) {
        files += new CodeFile(file, code)
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
    
    def addProxyCCodeFile(File file) {
        files += new CCodeFile(file)
    }
    
    def addProxyJavaFile(File file) {
        files += new JavaCodeFile(file)
    }
}

@FinalFieldsConstructor
class CodeFile {
    
    @Accessors val String fileName
    @Accessors val String code
    @Accessors var File underlyingFile = null
    
    new(File underlyingFile) {
        this(underlyingFile, null)
    }
    
    new(File underlyingFile, String content) {
        this(underlyingFile.name, content)
        this.underlyingFile = underlyingFile
    }
        
    def getFile() {
        if (underlyingFile !== null) {
            return underlyingFile
        } else {
            return new File(fileName)
        }
    }
    
    def isProxy() {
        return underlyingFile !== null
    }
    
    def getCode() {
        if (code !== null) {
            return code
        } else if (underlyingFile !== null) {
            return new String(Files.readAllBytes(file.toPath))
        } else {
            return null
        }
    }
}

@FinalFieldsConstructor
class CCodeFile extends CodeFile {
    
    @Accessors val boolean header
    @Accessors val String dataStructName
    
    new(File underlyingFile) {
        this(underlyingFile, null)
    }
    
    new(File underlyingFile, String content) {
        this(underlyingFile.name, content, underlyingFile.name.endsWith(".h"), null)
        this.underlyingFile = underlyingFile
    }
    
    new(String fileName, String code, boolean header, String dataStructName) {
        super(fileName, code)
        this.header = header
        this.dataStructName = dataStructName
    }
}

class JavaCodeFile extends CodeFile {
    
    @Accessors val String className
    
    new(File underlyingFile) {
        this(underlyingFile, null)
    }
    
    new(File underlyingFile, String content) {
        this(underlyingFile.name, content, underlyingFile.name)
        this.underlyingFile = underlyingFile
    }
    
    new(String fileName, String code, String className) {
        super(fileName, code)
        this.className = className
    }
}