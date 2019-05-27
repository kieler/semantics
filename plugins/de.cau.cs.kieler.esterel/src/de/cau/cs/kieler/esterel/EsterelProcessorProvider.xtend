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
package de.cau.cs.kieler.esterel

import de.cau.cs.kieler.kicool.registration.IProcessorProvider

/**
 * Provider to make processors available to KiCool.
 * 
 * @author Wechselberg
 */
class EsterelProcessorProvider implements IProcessorProvider {
    
    override getProcessors() {
        #[
            de.cau.cs.kieler.esterel.processors.transformators.incremental.AbortTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.AwaitTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.BlockTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.ConstantTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.DoTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.EmitTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.EsterelParallelTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.EveryDoTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.ExecTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.FunctionTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.IfTestTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.InitializationTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.LocalSignalDeclTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.LocalVariableTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.NothingTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.PresentTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.ProcCallTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.RepeatTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.RunTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.SCEstIntermediateProcessor,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.SCLTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.SensorTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.SetTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.SignalTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.SuspendTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.SustainTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.TrapTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.UnEmitTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.LoopTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.incremental.HaltTransformation,
            de.cau.cs.kieler.esterel.compiler.processors.InriaEsterelCodeGenerator,
            de.cau.cs.kieler.esterel.compiler.processors.XESCompiler,
            de.cau.cs.kieler.esterel.compiler.processors.InriaSimulationTemplateGenerator,
            de.cau.cs.kieler.esterel.compiler.processors.InriaSimulationPreparation,
            de.cau.cs.kieler.esterel.processors.ssa.SCEstToSSCSCLTransformation,
            de.cau.cs.kieler.esterel.processors.ssa.SSASCL2SSAEsterel,
            de.cau.cs.kieler.esterel.processors.ssa.SSCEsterelReconstruction,
            de.cau.cs.kieler.esterel.processors.transformators.kernel.AwaitKernelTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.kernel.AbortKernelTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.kernel.HaltKernelTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.kernel.LoopEachKernelTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.kernel.DoKernelTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.kernel.EveryKernelTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.kernel.PresentCaseKernelTransformation,
            de.cau.cs.kieler.esterel.processors.transformators.kernel.SustainKernelTransformation
        ]
    }
    
}