/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.processors.add

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import de.cau.cs.kieler.scg.extensions.SCGSerializeHRExtensions
import info.scce.cfg.Vertex
import info.scce.cfg.transformation.ExpressionDAG
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.kicool.compilation.CodeContainer

/** 
 * 
 * @author ssm
 * @kieler.design 2020-11-25 proposed 
 * @kieler.rating 2020-11-25 proposed yellow
 */

class ADDSerialization extends ExogenousProcessor<SymbolicExecuterWrapper, CodeContainer> implements Traceable {

    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCGMethodExtensions
    @Inject extension SCGSerializeHRExtensions 
    
    protected val nodeMapping = <Node, Vertex> newHashMap
    protected var Node entryNode
    protected var Node exitNode
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.add.serialization"
    }
    
    override getName() {
        "ADD Serialization"
    }
    
    override process() {
        val cc = new CodeContainer

        setModel(cc)
    }
      
}
