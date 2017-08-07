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
    @Accessors String message
    @Accessors Object object
    @Accessors boolean annotate
    @Accessors IColorSystem colorSystem
    @Accessors Exception exception
    
    new(String message, Object object, boolean annotate, IColorSystem colorSystem, Exception exception) {
        this.message = message
        this.object = object
        this.annotate = annotate
        this.colorSystem = colorSystem
        this.exception = exception
    }
    
}