/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.ssc.features

import de.cau.cs.kieler.kico.features.FeatureGroup

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSCFeatureGroup extends FeatureGroup {

    override getId() {
        "ssc"
    }

    override getName() {
        "Strict Sequential Constructiveness"
    }

    override getFeatureIds() {
        newHashSet("scg.ssa", "scl.ssa", "scl.dualrailencoding", "esterel.ssa")

    }

}
