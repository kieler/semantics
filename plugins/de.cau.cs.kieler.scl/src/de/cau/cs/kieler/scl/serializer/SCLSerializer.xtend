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
package de.cau.cs.kieler.scl.serializer

import com.google.inject.Inject
import de.cau.cs.kieler.scl.validation.InternalSyntaxValidation
import java.io.IOException
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.serializer.impl.Serializer

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SCLSerializer extends Serializer {
    
    @Inject extension InternalSyntaxValidation
    
    override serialize(EObject obj, Appendable appendable, SaveOptions options) throws IOException {
        super.serialize(obj.assureSemicolons, appendable, options);
    }
}