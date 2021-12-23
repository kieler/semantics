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
package de.cau.cs.kieler.esterel.serializer

import com.google.inject.Inject
import de.cau.cs.kieler.esterel.EsterelProgram
import java.io.IOException
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.serializer.impl.Serializer

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class EsterelSerializer extends Serializer {
    
    @Inject extension EsterelSytaxHelper
    
    override serialize(EObject obj, Appendable appendable, SaveOptions options) throws IOException {
        try {
            if (obj instanceof EsterelProgram) obj.convertSerializerFriendly
            super.serialize(obj, appendable, options)
        } finally {
            if (obj instanceof EsterelProgram) obj.convertUserFriendly
        }
    }
    
}