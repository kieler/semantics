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
package de.cau.cs.kieler.kicool.classes

import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author ssm
 * @kieler.design 2017-07-10 proposed
 * @kieler.rating 2017-07-10 proposed yellow  
 */
class SourceTargetPair<Source, Target> {

    @Accessors(PUBLIC_GETTER) private Source source
    @Accessors(PUBLIC_GETTER) private Target target
    
    new(Source source, Target target) {
        this.source = source
        this.target = target
    }
    
}