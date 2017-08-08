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
package de.cau.cs.kieler.kicool.environments

import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import java.util.HashMap
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import de.cau.cs.kieler.kicool.classes.IColorSystem

/**
 * @author ssm
 * @kieler.design 2017-07-11 proposed 
 * @kieler.rating 2017-07-11 proposed yellow
 *
 */
class MessageObjectReferences extends HashMap<Object, MessageObjectList> implements IKiCoolCloneable {
    
    public static val ROOT = null
    
    override isMutable() { false }
    override cloneObject() { null }
    override isVolatile() { true }
    
    override resolveCopiedObjects(Copier copier) {
    }    
    
    def void add(String msg) {
        add(null, msg, null, false, null, null)                
    }
    
    def void add(String msg, Object object) {
        add(null, msg, object, object !== null, null, null)
    }
    
    def void add(String msg, Object object, boolean annotate) {
        add(null, msg, object, annotate, null, null)
    }
    
    def void add(String msg, Object object, boolean annotate, IColorSystem colorSystem) {
        add(null, msg, object, annotate, colorSystem, null)
    }

    def void add(Exception exception) {
        add(null, null, null, false, null, exception)
    }
    
    def void add(Object sourceModelReference, String msg, Object object) {
        add(sourceModelReference, msg, object, object !== null, null, null)
    }
    
    def void  add(Object sourceModelReference, String msg, Object object, boolean annotate, IColorSystem colorSystem, Exception exception) {
        var mol = get(sourceModelReference)
        if (mol === null) {
            put(sourceModelReference, new MessageObjectList())
            mol = get(sourceModelReference)
        } 
        if (exception !== null) {
            mol.add(exception)
        } else {
            mol.add(msg, object, annotate, colorSystem)
        }
    }
    
           
}