/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kexpressions.extensions

import java.util.Collection
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * This is a wrapper for common EcoreUtil methods.
 * 
 * Note that using this extensions is important for tracing since the injector will be configured to inject a subclass 
 * to provide tracing in kexpressions without a dependency to kicool.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class EcoreUtilExtensions {

    /**
     * Returns a self-contained copy of the eObject.
     * @param eObject the object to copy.
     * @return the copy.
     * @see Copier
     */
    def <T extends EObject> T copy(T eObject) {
        return EcoreUtil.copy(eObject)
    }

    /**
     * Returns a collection of the self-contained copies of each {@link EObject} in eObjects.
     * @param eObjects the collection of objects to copy.
     * @return the collection of copies.
     * @see Copier
     */
    def <T> Collection<T> copyAll(Collection<? extends T> eObjects) {
        return EcoreUtil.copyAll(eObjects)
    }

    /**
     * Removes the object from its {@link EObject#eResource containing} resource 
     * and/or its {@link EObject#eContainer containing} object.
     * @param eObject the object to remove.
     */
    def void remove(EObject eObject) {
        EcoreUtil.remove(eObject)
    }

    /**
     * Replace the object in its {@link EObject#eResource containing} resource 
     * and/or its {@link EObject#eContainer containing} object,
     * with the replacement object.
     * @param eObject the object to replace.
     * @param replacementEObject the replacement object.
     */
    def void replace(EObject eObject, EObject replacementEObject) {
        EcoreUtil.replace(eObject, replacementEObject)

    }

    /**
     * Deletes the object from its {@link EObject#eResource containing} resource 
     * and/or its {@link EObject#eContainer containing} object
     * as well as from any other feature that references it 
     * within the enclosing resource set, resource, or root object.
     * @param eObject the object to delete.
     * @since 2.3
     */
    def void delete(EObject eObject) {
        EcoreUtil.delete(eObject)
    }

    /**
     * Deletes the object from its {@link EObject#eResource containing} resource 
     * and/or its {@link EObject#eContainer containing} object
     * as well as from any other feature that references it 
     * within the enclosing resource set, resource, or root object.
     * If recursive true, contained children of the object that are in the same resource 
     * are similarly removed from any features that reference them.
     * @param eObject the object to delete.
     * @param recursive whether references to contained children should also be removed.
     * @since 2.4
     */
    def void delete(EObject eObject, boolean recursive) {
        EcoreUtil.delete(eObject, recursive)
    }
}
