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
package de.cau.cs.kieler.prom.build

import java.util.ArrayList
import java.util.List
import java.util.regex.Pattern
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
abstract class SimulationCompiler extends Configurable {
    
    @Accessors(PUBLIC_GETTER)
    protected FileGenerationResult result
    @Accessors(PUBLIC_SETTER)
    protected var IProgressMonitor monitor
    
    abstract public def String[] getSupportedFileExtensions()
    abstract public def FileGenerationResult compile(IFile file)
    
    new() {
        super()
    }
    
    new(IProgressMonitor monitor) {
        this.monitor = monitor
    }
    
    public def void initialize(de.cau.cs.kieler.prom.kibuild.SimulationCompiler config) {
        this.updateConfigurableAttributes(config.attributes)
    }
    
    public def boolean canCompile(IFile file) {
        return supportedFileExtensions.contains(file.fileExtension)
    }
    
    /**
     * Split input string on spaces, except if between double quotes (e.g. "hello world" would be one token.)
     * Surrounding double quotes are removed.
     * 
     * @param str The string to be splitted
     * @return List<String> containing slices of the input string.
     */
    protected def List<String> splitStringOnWhitespace(String str) {
        // Code from
        // http://stackoverflow.com/questions/7804335/split-string-on-spaces-except-if-between-quotes-i-e-treat-hello-world-as
        val list = new ArrayList<String>();
        val m = Pattern.compile("([^\"]\\S*|\".+?\")\\s*").matcher(str);
        while (m.find()) {
            // .replace(...) is to remove surrounding qoutes
            list.add(m.group(1).replace("\"", ""))
        }
        return list
    }
    
    protected def String replacePlaceholder(String text, String placeholder, String value) {
        if(value.contains(' ')) {
            return text.replacePlaceholder(placeholder, value, true)
        } else {
            return text.replacePlaceholder(placeholder, value, false)    
        }
    }
    
    protected def String replacePlaceholder(String text, String placeholder, String value, boolean quoted) {
        var String replacement = value
        if(quoted) {
            replacement = '"'+replacement+'"'
        }
        return text.replace("${"+placeholder+"}", replacement)    
    }
}