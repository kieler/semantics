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
package de.cau.cs.kieler.esterel.scest.transformations

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.CombineOperator
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scl.extensions.SCLExtensions
import de.cau.cs.kieler.scl.features.SCLFeatures
import java.util.HashMap
import java.util.LinkedList
import java.util.Set
import java.util.Stack
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.esterel.esterel.ISignal
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.esterel.scest.features.SCEstFeature

/**
 * @author mrb
 *
 */
class SCEstTransformations extends AbstractProductionTransformation implements Traceable {

    @Inject
    extension KExpressionsDeclarationExtensions
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension KExpressionsCreateExtensions
    
    @Inject
    extension KExpressionsComplexCreateExtensions
    
    @Inject 
    extension SCLExtensions
    
    public final static String SCEST_ID = "scest.basic";
    public final static String SCEST_NAME = "SCEst";

    // Label at the end of currently transformed thread
    var String currentThreadEndLabel

    // List of threads sorted by unique end label; each entry contains labels within that thread
    var Multimap<String, String> labelToThreadMap

    // List of exit signals and the corresponding label
    var protected HashMap<ISignal, Pair<ValuedObject, String>> exitToLabelMap
    
    // List of variables for valued traps
    var protected HashMap<ISignal, ValuedObject> valuedExitVariables

    // Connecting a signal name with a valuedObject. Allows "scoping" and shadowing out
    var protected LinkedList<Pair<String, ValuedObject>> signalToVariableMap

    // Maps valued variables to signal
    var protected HashMap<ValuedObject, ValuedObject> signalToValueMap

    // Maps variables holding the neutral element for a valued, combined signal to the signal and saves combine operator
    var protected HashMap<ValuedObject, ValuedObject> signalToNeutralMap

    // Associates counting variables to the corresponding delay event
    var HashMap<String, ValuedObject> counterToEventMap

    // Local declared variables which are not in a StatementScope (should be added to global declarations)
    var LinkedList<ValuedObject> localBoolDeclarations
    var LinkedList<ValuedObject> localIntDeclarations

    // The tick; i.e., tick is true all the time
    var protected ValuedObject synchronousTick;

    // Flag indicating if optimized transformations should be used
    var boolean optimizeTransformation

    // List of transformation functions to manipulate pauses and join
    var Stack<(EList<Statement>)=>EList<Statement>> pauseTransformation
    var Stack<(EList<Statement>)=>EList<Statement>> joinTransformation
    
    override getId() {
        return SCEstTransformation.SCEST_ID
    }

    override getName() {
        return SCEstTransformation.SCEST_NAME
    }
    
    override getProducedFeatureId() {
        return SCLFeatures.BASIC_ID
    }
    
    override Set<String> getRequiredFeatureIds() {
        return newHashSet(SCEstFeature.SCEST_ID);
    }
    
    
    
}