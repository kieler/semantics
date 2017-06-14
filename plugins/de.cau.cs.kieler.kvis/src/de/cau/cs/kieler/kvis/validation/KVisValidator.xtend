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
package de.cau.cs.kieler.kvis.validation

import de.cau.cs.kieler.kvis.kvis.Mapping
import org.eclipse.xtext.validation.Check

/**
 * @author aas
 * 
 */
class KVisValidator extends KVisJavaValidator {
    @Check
    public def void checkMappingDomains(Mapping mapping) {
        if (mapping.variableDomain.value != null && mapping.attributeDomain.range != null) {
            error("Can't map a single value to a range.", mapping, null);
        }
    }
}
 