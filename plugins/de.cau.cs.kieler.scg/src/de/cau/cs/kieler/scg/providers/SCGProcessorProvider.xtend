/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.providers

import de.cau.cs.kieler.kicool.registration.IProcessorProvider

/**
 * Provider to make processors available to KiCool.
 * 
 * @author Wechselberg
 */
class SCGProcessorProvider implements IProcessorProvider {
    
    override getProcessors() {
        #[
            de.cau.cs.kieler.scg.processors.codegen.c.CCodeGenerator,
            de.cau.cs.kieler.scg.processors.SimpleGuardSequentializer,
            de.cau.cs.kieler.scg.processors.SimpleGuardExpressions,
            de.cau.cs.kieler.scg.processors.BasicBlockTransformation,
            de.cau.cs.kieler.scg.processors.analyzer.ControlflowValidator,
            de.cau.cs.kieler.scg.processors.SimpleGuardScheduler,
            de.cau.cs.kieler.scg.processors.SimpleGuardTransformation,
            de.cau.cs.kieler.scg.processors.DependencyTransformationV2,
            de.cau.cs.kieler.scg.processors.ssa.SSATransformation,
            de.cau.cs.kieler.scg.processors.ssa.CSSATransformation,
            de.cau.cs.kieler.scg.processors.ssa.SCSSATransformation,
            de.cau.cs.kieler.scg.processors.ssa.SimpleSCSSATransformation,
            de.cau.cs.kieler.scg.processors.ssa.WeakUnemitSSATransformation,
            de.cau.cs.kieler.scg.processors.ssa.DeSSATransformation,
            de.cau.cs.kieler.scg.processors.ssa.UnSSATransformation,
            de.cau.cs.kieler.scg.processors.ssa.SCCP,
            de.cau.cs.kieler.scg.processors.codegen.java.JavaCodeGenerator,
            de.cau.cs.kieler.scg.processors.priority.PriorityProcessor,
            de.cau.cs.kieler.scg.processors.priority.SJTransformation,
            de.cau.cs.kieler.scg.processors.priority.SCLPTransformation,
            de.cau.cs.kieler.scg.processors.analyzer.ThreadAnalyzer,
            de.cau.cs.kieler.scg.processors.analyzer.LoopAnalyzerV2,
            de.cau.cs.kieler.scg.processors.StructuralDepthJoinProcessor,
            de.cau.cs.kieler.scg.processors.SurfaceDepthSeparatorProcessor,
            de.cau.cs.kieler.scg.processors.optimizer.CopyPropagationV2,
            de.cau.cs.kieler.scg.processors.optimizer.SmartRegisterAllocation,
            de.cau.cs.kieler.scg.processors.optimizer.CleanupValuedObjects,
            de.cau.cs.kieler.scg.processors.optimizer.ConditionalMerger,
            de.cau.cs.kieler.scg.processors.optimizer.HaltStateRemover,
            de.cau.cs.kieler.scg.processors.optimizer.PartialExpressionEvaluation,
            de.cau.cs.kieler.scg.processors.BasicBlockTransformationSCplus,
            de.cau.cs.kieler.scg.processors.optimizer.PersistentStateOptimizer,
            de.cau.cs.kieler.scg.processors.optimizer.PartialAssignmentEvaluation,
            de.cau.cs.kieler.scg.processors.analyzer.GuardTickBoundaryProcessor,
            de.cau.cs.kieler.scg.processors.optimizer.IneffectiveGuardRemover,
            de.cau.cs.kieler.scg.processors.optimizer.UnobservableGuardRemover,
            de.cau.cs.kieler.scg.processors.optimizer.SimpleGuardOptimization,
            de.cau.cs.kieler.scg.processors.MethodProcessor,
            de.cau.cs.kieler.scg.processors.codegen.promela.PromelaCodeGenerator,
            de.cau.cs.kieler.scg.processors.codegen.smv.SmvCodeGenerator,
            de.cau.cs.kieler.scg.processors.codegen.smv.SimplifyNamesOfSSA,
            de.cau.cs.kieler.scg.processors.codegen.smv.DefineUnboundVariablesOfSSA,
            de.cau.cs.kieler.scg.processors.codegen.smv.PreFinalVariableValuesOfSSA,
            de.cau.cs.kieler.scg.processors.StoreVariableDeclarations,
            de.cau.cs.kieler.scg.processors.codegen.prio.c.CPrioCodeGenerator,
            de.cau.cs.kieler.scg.processors.codegen.prio.java.JavaPrioCodeGenerator
        ]
    }
    
}