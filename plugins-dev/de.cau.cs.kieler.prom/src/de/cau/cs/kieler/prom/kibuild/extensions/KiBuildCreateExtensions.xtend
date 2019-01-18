/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.prom.kibuild.extensions

import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.prom.kibuild.Literal
import de.cau.cs.kieler.prom.kibuild.Sign
import de.cau.cs.kieler.prom.kibuild.SignedFloat
import de.cau.cs.kieler.prom.kibuild.SignedInt
import de.cau.cs.kieler.prom.kibuild.TextValue
import de.cau.cs.kieler.prom.kibuild.impl.KibuildFactoryImpl

/**
 * @author aas
 *
 */
class KiBuildCreateExtensions {
    
    extension static val KExpressionsCreateExtensions kExpressionsCreateExtensions = new KExpressionsCreateExtensions
    
    public def Literal createLiteral(String v) {
        KibuildFactoryImpl::eINSTANCE.createLiteral => [
            value = createStringValue(v)
        ]
    }
    
    public def Literal createLiteral(boolean v) {
        KibuildFactoryImpl::eINSTANCE.createLiteral => [
            value = createBoolValue(v)
        ]
    }
    
    public def Literal createLiteral(int v) {
        KibuildFactoryImpl::eINSTANCE.createLiteral => [
            value = createSignedInt(v)
        ]
    }
    
    public def Literal createLiteral(float v) {
        KibuildFactoryImpl::eINSTANCE.createLiteral => [
            value = createSignedFloat(v)
        ]
    }
    
    public def TextValue createTextValue(String v) {
        KibuildFactoryImpl::eINSTANCE.createTextValue => [
            value = v
        ]
    }
    
    public def SignedInt createSignedInt(int v) {
        KibuildFactoryImpl::eINSTANCE.createSignedInt => [
            value = Math.abs(v)
            sign = if(v < 0) Sign.NEGATIVE else Sign.POSITIVE
        ]
    }
    
    public def SignedFloat createSignedFloat(float v) {
        KibuildFactoryImpl::eINSTANCE.createSignedFloat => [
            value = Math.abs(v)
            sign = if(v < 0) Sign.NEGATIVE else Sign.POSITIVE
        ]
    }
}