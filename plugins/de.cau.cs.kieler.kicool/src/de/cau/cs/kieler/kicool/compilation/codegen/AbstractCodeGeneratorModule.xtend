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
package de.cau.cs.kieler.kicool.compilation.codegen

import org.eclipse.xtend.lib.annotations.Accessors
import com.google.inject.Inject
import com.google.inject.Injector

/**
 * Abstract class for code generator modules
 * Modules are intended to be fulfill a specific code generation task and can be linked together.  
 * 
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
abstract class AbstractCodeGeneratorModule {
    
    @Inject protected Injector injector
        
    @Accessors val StringBuilder code = new StringBuilder
    @Accessors var String baseName = ""
    @Accessors var String prefix = ""
    @Accessors var String suffix = ""
    @Accessors var String indentation = "  "
    @Accessors var int indentationModifier = 0
    @Accessors var boolean commentsEnabled = true
    
    new() {
        
    }
    
    /**
     * The name of the generated code part.
     */
    def String getName()
    
    /**
     * Indent adds the indentation to the builder.
     */
    protected def indent() {
        code.append(indentation)
    }
    
    /**
     * Adds the indentation to the builder n times.
     */
    protected def indent(int n) {
        val m = n + indentationModifier
        if (m == 0) return;
        for (i : 1..m) {
            code.append(indentation)
        }
    }
    
    
    
    
    // Convenient StringBuilder methods
    private static val MAGIC_PREFIX = "$ulf$"
    private static val NL_MAGIC = MAGIC_PREFIX + "NL"
    private static val DEFAULT_CODE_LINE_LENGTH = 40
    private static val AUTO_CODE_LINE_LENGTH_SPACING = 4
    
    @Accessors private var int actualLineLength = 0
    @Accessors private var int codeLineLength = DEFAULT_CODE_LINE_LENGTH
    private val lecStore = <String, String> newHashMap
    
    protected def add(StringBuilder sb, Object ... args) {
        for (s : args) {
            var s2 = s
            if (s instanceof String) {
                if (s.startsWith(MAGIC_PREFIX)) {
                    if (s.equals(NL_MAGIC)) {
                        s2 = processNL    
                    } else {
                        s2 = processLEC(s)
                    }
                }   
            }
            sb.append(s2)
            actualLineLength += String.valueOf(s2).length
        }
    }
    
    // Add Auto Code Line Length
    protected def void addCLL(StringBuilder sb, Object ... args) {
        val storedCodeLineLength = codeLineLength
        var maxLength = 0
        var length = 0
        for (s : args.filter(String)) {
            if (s.equals(NL_MAGIC)) {
                length = 0
            } else if (!s.startsWith("//") && !s.startsWith("/*") && !s.startsWith(" *") && !s.startsWith(MAGIC_PREFIX)) { 
                length += s.length
            }
            if (length > maxLength) {
                maxLength = length
            }
        }
        codeLineLength = maxLength + AUTO_CODE_LINE_LENGTH_SPACING
        sb.add(args)
        codeLineLength = storedCodeLineLength
    }
    
    protected def a(StringBuilder sb, String s) {
        sb.append(s)
    }
    
    protected def ws(StringBuilder sb) {
        sb.append(" ")
    }
    
    protected def nl(StringBuilder sb) {
        sb.append("\n")
    }
    
    protected def NL() {
        return NL_MAGIC
    }
    
    private def processNL() {
        actualLineLength = -1
        return "\n"
    }
    
    protected def WS() {
        return " "
    }
    
    // Line Ending Comment
    protected def String LEC(String comment) {
        if (!commentsEnabled) return ""
        val key = MAGIC_PREFIX + comment.hashCode
        lecStore.put(key, comment)
        return key
    } 
    
    private def String processLEC(String key) {
        val comment = lecStore.get(key)
        var remainingLength = codeLineLength - actualLineLength;
        if (remainingLength > 0) {
            return StaticWhitespace.getSpace(remainingLength) + 
                     " // " + comment
        } else {
            return " // " + comment
        }
    }
    
    // Single Line Comment
    protected def String SLC(String comment) {
        if (!commentsEnabled) return ""
        return "// " + comment + "\n"
    }

    protected def String SLC(int spaces, String comment) {
        if (!commentsEnabled) return ""
        return StaticWhitespace.getSpace(spaces) + "// " + comment + "\n"
    }
    
    // Multi-Line Comment
    protected def String MLC(Object ... args) {
        MLCi(0, args)
    }
    
    // Multi-Line Comment
    protected def String MLCi(int spaces, Object ... args) {
        if (!commentsEnabled) return ""
        val sb = new StringBuilder
        sb.append(StaticWhitespace.getSpace(spaces))
        sb.append("/* ")
        var first = true
        for (s : args) {
            if (!first) {
                sb.append(StaticWhitespace.getSpace(spaces))
                sb.append(" * ")
            }
            sb.append(s)
            sb.append("\n")
            first = false                    
        }
        sb.append(StaticWhitespace.getSpace(spaces))        
        sb.append(" */\n")
        return sb.toString
    }
}