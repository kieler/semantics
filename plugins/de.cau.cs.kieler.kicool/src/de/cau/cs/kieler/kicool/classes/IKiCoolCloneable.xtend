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
package de.cau.cs.kieler.kicool.classes

import org.eclipse.emf.ecore.util.EcoreUtil.Copier

/**
 * Interface for objects that will be pu tin an environment.
 * Return null if the object is not cloneable.
 * 
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
interface IKiCoolCloneable {
    
    /**
     * The class is mutable. If not, the clones object may be the original object and 
     * you are not allowed to change it in the environment. 
     */
    public def boolean isMutable()
    
    /**
     * Returns the cloned object.
     */
    public def Object cloneObject()
    
    /**
     * Determines if the object is lost when preparing prime environments.
     */
    def isVolatile() { false }
    
    /**
     * Determines if the objects must be resolved after the environment copy.
     */
    def void resolveCopiedObjects(Copier copier) { }
}