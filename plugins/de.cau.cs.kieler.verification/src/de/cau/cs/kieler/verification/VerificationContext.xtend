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
package de.cau.cs.kieler.verification

import de.cau.cs.kieler.kicool.compilation.CompilationContext
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.xtend.lib.annotations.Accessors

/** 
 * @author aas
 */
class VerificationContext extends CompilationContext {
    
    @Accessors private boolean smvUseIVAR = false
    
    @Accessors private List<VerificationProperty> verificationProperties = newArrayList
    @Accessors private List<VerificationAssumption> verificationAssumptions = newArrayList
    
    @Accessors private IFile verificationModelFile = null
    
    @Accessors private boolean createCounterexamplesWithOutputs = true
    @Accessors private boolean createCounterexamples = true
    
    @Accessors private List<String> customInteractiveSmvInvarCommands = null
    @Accessors private List<String> customInteractiveSmvLtlCommands = null
    @Accessors private List<String> customInteractiveSmvCtlCommands = null
        
    @Accessors private List<String> customSpinCommands =null
    
    @Accessors private Process verificationProcess = null
}