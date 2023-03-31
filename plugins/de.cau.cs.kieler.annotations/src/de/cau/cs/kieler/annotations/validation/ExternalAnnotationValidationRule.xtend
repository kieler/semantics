/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2023 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.annotations.validation

import de.cau.cs.kieler.annotations.Pragma
import org.eclipse.xtext.validation.ValidationMessageAcceptor
import de.cau.cs.kieler.annotations.Annotation

/**
 * Interface for injecting annotation/pragma specific validation rule into the AnnotationsValidator.
 * 
 * @author als
 */
interface ExternalAnnotationValidationRule {
    
    def void apply(ValidationMessageAcceptor acceptor, Annotation annotation)
    
    def void apply(ValidationMessageAcceptor acceptor, Pragma pragma)
    
}