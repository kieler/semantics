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

import de.cau.cs.kieler.core.uri.URIUtils
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.io.File
import java.nio.file.Files
import java.util.List
import java.util.Map
import org.eclipse.emf.common.util.URI
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
        return new CodeFile(fileName, code) => [files += it]
    }
    
    def addProxy(File file) {
        return new CodeFile(file, null) => [files += it]
    }
        
    def addProxy(File file, String code) {
        return new CodeFile(file, code) => [files += it]
    }
    
    def addCHeader(String fileName, String code) {
        return new CCodeFile(fileName, code, true) => [files += it]
    }
    
    def addCCode(String fileName, String code) {
        return new CCodeFile(fileName, code, false) => [files += it]
    }
    
    def addJavaCode(String fileName, String code) {
        checkArgument(fileName.endsWith(".java"), "File name has not the correct pattern for java source files")
        return new JavaCodeFile(fileName, code, fileName.substring(0, fileName.indexOf(".java"))) => [files += it]
    }
    
    def addPythonCode(String fileName, String code) {
        checkArgument(fileName.endsWith(".py"), "File name has not the correct pattern for python source files")
        return new PythonCodeFile(fileName, code, fileName.substring(0, fileName.indexOf(".py"))) => [files += it]
    }
    
    def addProxyCCodeFile(File file) {
        return new CCodeFile(file) => [files += it]
    }
    
    def addProxyCCodeFile(URI uri) {
        if (uri.file) {
            addProxyCCodeFile(URIUtils.getJavaFile(uri))
        } else if (uri.lastSegment.endsWith(".h")) {
            addCHeader(uri.lastSegment, ProjectInfrastructure.readContent(uri))
        } else {
            addCCode(uri.lastSegment, ProjectInfrastructure.readContent(uri))
        }
    }
    
    def addProxyJavaFile(File file) {
        return new JavaCodeFile(file) => [files += it]
    }
    
    def addProxyJavaFile(URI uri) {
        if (uri.file) {
            addProxyJavaFile(URIUtils.getJavaFile(uri))
        } else {
            addJavaCode(uri.lastSegment, ProjectInfrastructure.readContent(uri))
        }
    }
}

@FinalFieldsConstructor
class CodeFile {
    
    @Accessors val String fileName
    @Accessors val String code
    @Accessors var File underlyingFile = null
    @Accessors val Map<CodeGeneratorNames, String> naming = <CodeGeneratorNames, String> newHashMap 
    @Accessors var String modelName
    @Accessors var boolean library
    
    
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

class CCodeFile extends CodeFile {
    
    @Accessors var boolean header
    
    new(File underlyingFile) {
        this(underlyingFile, null)
    }
    
    new(File underlyingFile, String content) {
        this(underlyingFile.name, content, underlyingFile.name.endsWith(".h"))
        this.underlyingFile = underlyingFile
    }
    
    new(String fileName, String code, boolean header) {
        super(fileName, code)
        this.header = header
    }
}

class JavaCodeFile extends CodeFile {
    
    @Accessors var String className
    
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

class PythonCodeFile extends CodeFile {
    
    @Accessors var String className
    
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