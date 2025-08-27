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

import de.cau.cs.kieler.kicool.classes.IColorSystem
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author ssm
 * @kieler.design 2017-07-12 proposed 
 * @kieler.rating 2017-07-12 proposed yellow
 *
 */

class MessageObjectLink {
    
    @Accessors var String message
    @Accessors var Object object
    @Accessors var boolean annotate
    @Accessors var IColorSystem colorSystem
    @Accessors var Exception exception
    @Accessors var Object payload
    
    new(String message, Object object, boolean annotate, IColorSystem colorSystem, Exception exception, Object payload) {
        this.message = message
        this.object = object
        this.annotate = annotate
        this.colorSystem = colorSystem
        this.exception = exception
        this.payload = payload
    }
    
}