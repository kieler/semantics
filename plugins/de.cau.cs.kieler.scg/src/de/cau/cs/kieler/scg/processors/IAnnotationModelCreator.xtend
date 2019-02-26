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
package de.cau.cs.kieler.scg.processors

import de.cau.cs.kieler.kicool.environments.Environment

/** 
 * @author ssm
 * @kieler.design 2019-02-26 proposed 
 * @kieler.rating 2019-02-26 proposed yellow
 */
interface IAnnotationModelCreator {
 
    def void create(Object annotationObject, Environment environment)
    
}