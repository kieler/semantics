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
package de.cau.cs.kieler.verification

import de.cau.cs.kieler.kicool.compilation.CompilationContext
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.xtend.lib.annotations.Accessors

/** 
 * @author aas
 */
class VerificationContext extends CompilationContext {
    
    // General options
    @Accessors private List<VerificationProperty> verificationProperties = newArrayList
    @Accessors private List<VerificationAssumption> verificationAssumptions = newArrayList
    
    /**
     * File handle used to define where generated files for verification will be saved.
     */
    @Accessors private IFile verificationModelFile = null
    
    /**
     * The OS process (or one of its parents) that is running the model checker
     */
    @Accessors private Process verificationProcess = null
    
    // Options for counterexample generation
    @Accessors private boolean createCounterexamplesWithOutputs = true
    @Accessors private boolean createCounterexamples = true
    
    // Options for SMV code generation
    @Accessors private boolean smvUseIVAR = false
    @Accessors private boolean smvInitializePreVariables = false
    @Accessors private boolean smvIgnoreRangeAssumptions = false
    
    // Options for verification using NuSMV / nuXmv
    @Accessors private List<String> customInteractiveSmvInvarCommands = null
    @Accessors private List<String> customInteractiveSmvLtlCommands = null
    @Accessors private List<String> customInteractiveSmvCtlCommands = null
    
    // Options for verification using SPIN
    @Accessors private List<String> customSpinCommands =null
}