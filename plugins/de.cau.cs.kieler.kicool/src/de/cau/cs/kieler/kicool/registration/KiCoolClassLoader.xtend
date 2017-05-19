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
package de.cau.cs.kieler.kicool.registration

import com.google.common.io.ByteStreams
import java.io.File
import java.io.FileInputStream
import java.io.IOException
import java.net.MalformedURLException

/**
 * @author ssm
 * @kieler.design 2013-05-23 proposed ssm
 * @kieler.rating 2013-05-23 proposed yellow
 *
 */
class KiCoolClassLoader extends ClassLoader {
    
    val classPaths = <String, String> newHashMap
    
    new(ClassLoader classLoader) {
        super(classLoader)
    }
    
    public def addClassFileByName(String className, String classPath) {
        classPaths.put(className, classPath)
    } 
    
    override Class<?> loadClass(String className) {
        if (classPaths.containsKey(className))
        try {
            val input = new FileInputStream(new File(classPaths.get(className)))
            val classData =  ByteStreams.toByteArray(input)

            val c = defineClass(className, classData, 0, classData.length);
            resolveClass(c)
            return c
            
        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }

        return super.loadClass(className);
    }       

}