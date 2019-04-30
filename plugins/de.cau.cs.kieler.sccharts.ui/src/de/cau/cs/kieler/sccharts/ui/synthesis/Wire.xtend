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
package de.cau.cs.kieler.sccharts.ui.synthesis

import de.cau.cs.kieler.kexpressions.Expression
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.kexpressions.ValuedObjectReference

/**
 * @author ssm
 * @kieler.design 2017-09-26 proposed
 * @kieler.rating 2017-09-26 proposed yellow
 * 
 */
class Wire {

    @Accessors var Wiring wiring = null
    @Accessors var Expression source = null
    @Accessors var Expression sink = null
    @Accessors var Expression semanticSource = null
    @Accessors var Expression semanticSink = null
    @Accessors var ValuedObjectReference semanticSourceSubReference = null
    @Accessors var ValuedObjectReference semanticSinkSubReference = null
    @Accessors var int sinkIndex = 0
    @Accessors var boolean sourceIsInterface = false
    @Accessors var boolean sinkIsInterface = false
    @Accessors var ReferenceDeclaration semanticSourceReferenceDeclaration = null
    @Accessors var ReferenceDeclaration semanticSinkReferenceDeclaration = null
    @Accessors var int externalSourceReferenceCounter = 0
    @Accessors var int externalSinkReferenceCounter = 0
    @Accessors var boolean sourceIsDeclaredInEquationScope = false
    @Accessors var boolean sinkIsDeclaredInEquationScope = false
    @Accessors var boolean sourceIsEquationTarget = false

    new(Expression source, Expression sink, Wiring wiring) {
        this.wiring = wiring
        this.source = source
        this.sink = sink
    }
    
    def ReferenceDeclaration getReferenceDeclaration() {
        if (semanticSourceReferenceDeclaration !== null) return semanticSourceReferenceDeclaration 
            else semanticSinkReferenceDeclaration
    }
    
    def boolean wireIsLocal() {
        return !sourceIsInterface && !sinkIsInterface
    }

    override String toString() {
        val result = new StringBuffer("Wire");
        result.append("@");
        result.append(String.format("%08x", this.hashCode()));
        result.append(" ");
        result.append(serializer.serialize(source));
        result.append(" (" + serializer.serialize(semanticSource) + ") ");
        result.append("-- ")
        result.append(serializer.serialize(sink));
        result.append(" (" + serializer.serialize(semanticSink) + ") ");
        return result.toString();
    }

    static val SCChartsSerializeHRExtensions serializer = new SCChartsSerializeHRExtensions
}
