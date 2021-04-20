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
package de.cau.cs.kieler.kicool.ui.synthesis

import com.google.inject.Injector
import de.cau.cs.kieler.kgraph.text.KGraphStandaloneSetup
import de.cau.cs.kieler.klighd.kgraph.KNode
import java.io.InputStream
import java.net.URL
import org.eclipse.emf.common.EMFPlugin
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

/**
 * @author als
 */
class KGTLoader {
    
    static val Injector KGTInjector = new KGraphStandaloneSetup().createInjectorAndDoEMFRegistration
    
    static def createModelRelativeURI(EObject obj, String path) {
        val baseURI = obj.eResource?.URI
        if (baseURI !== null) {
            val seg = baseURI.segmentsList
            if (EMFPlugin.IS_ECLIPSE_RUNNING) {
                val prefix = seg.take(seg.length - 1).drop(1)
                return URI.createPlatformResourceURI(prefix.join("/") + "/" + path, false)
            } else {
                val prefix = seg.take(seg.length - 1)
                return URI.createFileURI((baseURI.isRelative ? "" : "/") + prefix.join("/") + "/" + path)
            }
        }
        return null
    }
    
    static def KNode loadKGT(URI uri) {
        return loadKGT(uri, null)
    }
    
    static def KNode loadKGT(URI uri, URL url) {
        var InputStream stream = null
        try {
            val newResourceSet = KGTInjector.getInstance(XtextResourceSet)
            newResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.FALSE)
            val res = newResourceSet.createResource(uri)
            if (url !== null) {
                stream = url.openStream
                res.load(stream, newResourceSet.loadOptions)
            } else {
                res.load(newResourceSet.loadOptions)
            }
            return (res.getContents().get(0) as KNode).children.head
        } catch (Exception e) {
            // Will also be used to test existence of files
            // Hence, do not spam irrelevant exceptions!!
            //e.printStackTrace()
        } finally {
            stream?.close
        }
        return null
    }
    
    static def KNode loadFromBundle(Object inquirer, String bundle, String path) {
        if (EMFPlugin.IS_ECLIPSE_RUNNING) {
            val uri = URI.createPlatformPluginURI("/" + bundle + "/" + path, true)
            return loadKGT(uri)
        } else {
            val url = inquirer.class.classLoader.getResource(path)
            val uri = URI.createURI(path)
            return loadKGT(uri, url)
        }
    } 

}