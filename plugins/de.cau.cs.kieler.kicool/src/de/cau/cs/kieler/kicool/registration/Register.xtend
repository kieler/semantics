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
package de.cau.cs.kieler.kicool.registration

import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.Platform
import org.osgi.framework.BundleContext
import org.osgi.framework.FrameworkUtil
import org.osgi.framework.Bundle

/**
 * @author ssm
 * @kieler.design 2017-05-19 proposed
 * @kieler.rating 2017-05-19 proposed yellow  
 */
class Register {

    static val BIN_FOLDER_NAME = "bin"
    static val SRC_FOLDER_NAME = "src"
    
    static def registerRuntimeClass(IFile file) {
        new Register().register(file)
    }

    private def register(IFile file) {        
        val class = file.createClassFromClassFile
        
        if (class == null) return
        
        val instance = class.newInstance as de.cau.cs.kieler.kicool.compilation.Processor
        KiCoolRegistration.addProcessor(instance)
    }
    
    private def Class<?> createClassFromClassFile(IFile file) {
        val project = file.project
        val binFolder = project.getFolder(BIN_FOLDER_NAME)   
        if (!binFolder.exists) {
            System.err.println("Registering the processor is not possible because the bin folder cannot be obtained from the project.")
            return null
        }
        val classFilename = file.location.toString.replaceFirst("/" + SRC_FOLDER_NAME + "/", "/" + BIN_FOLDER_NAME + "/").replaceFirst("\\.xtend", ".class")
        
        val classLoader = new KiCoolClassLoader(Thread.currentThread().getContextClassLoader())
        val BundleContext ctx = FrameworkUtil.getBundle(this.class).getBundleContext() 
        val Bundle[] bundles = ctx.getBundles();
        for(b : bundles) {
            val cl = b.class.classLoader
            classLoader.addAdditionalClassLoader(cl)
            classLoader.addAdditionalBundle(b)
        }
        
        var className = ""
        for (var i = 2; i < file.fullPath.segmentCount; i++) {
            className += "." + file.fullPath.segments.get(i)
        }
        className = className.substring(1).replaceFirst("\\.xtend", "")
        
        classLoader.addClassFileByName(className, classFilename)
        return classLoader.loadClass(className)   
    }
    
    
}