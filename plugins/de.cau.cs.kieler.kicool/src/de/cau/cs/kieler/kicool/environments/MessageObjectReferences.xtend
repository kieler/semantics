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

import java.util.LinkedList
import de.cau.cs.kieler.kicool.classes.IColorSystem
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import org.eclipse.emf.ecore.EObject

/**
 * @author ssm
 * @kieler.design 2017-07-11 proposed 
 * @kieler.rating 2017-07-11 proposed yellow
 *
 */
class MessageObjectReferences extends LinkedList<MessageObjectLink> implements IKiCoolCloneable {
    
    override isMutable() { false }
    override cloneObject() { null }
    override isVolatile() { true }
    
    override resolveCopiedObjects(Copier copier) {
        for(reference : listIterator.toIterable.filter[ object != null && object instanceof EObject ]) {
            if (copier.containsKey(reference.object)) {
                reference.object = copier.get(reference.object)
            }
        }
    }    
    
    def add(String msg) {
        add(new MessageObjectLink(msg, null, true, null, null))
    }
    
    def add(String msg, Object object) {
        add(new MessageObjectLink(msg, object, true, null, null))
    }
    
    def add(String msg, Object object, boolean annotate) {
        add(new MessageObjectLink(msg, object, annotate, null, null))
    }
    
    def add(String msg, Object object, boolean annotate, IColorSystem colorSystem) {
        add(new MessageObjectLink(msg, object, annotate, colorSystem, null))
    }

    def add(Exception exception) {
        add(new MessageObjectLink(exception.message, null, true, null, exception))
    }
    
}