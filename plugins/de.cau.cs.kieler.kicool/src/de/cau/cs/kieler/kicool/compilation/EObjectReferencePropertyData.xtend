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
package de.cau.cs.kieler.kicool.compilation

import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author mrb
 *
 */
class EObjectReferencePropertyData implements IKiCoolCloneable {
    
    @Accessors(PUBLIC_GETTER)
    private var EObject object
    
    new(EObject object) {
        this.object = object
    }
    
    override isMutable() {
        false
    }
    
    override cloneObject() {
        new EObjectReferencePropertyData(object)
    }
    
    override void resolveCopiedObjects(Copier copier) {
        object = copier.get(object)
    }
}