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

import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import java.io.File
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/** 
 * @author aas
 */
class VerificationContext implements IKiCoolCloneable {
    
    // Switch between generic verification code generation and actual verification run
    @Accessors private boolean verify = false
    
    // General options
    @Accessors private List<VerificationProperty> verificationProperties = newArrayList
    @Accessors private List<VerificationAssumption> verificationAssumptions = newArrayList
    
    /**
     * File handle used to define where generated files for verification will be saved.
     */
    @Accessors private File verificationModelFile = null
    
    /**
     * The OS process (or one of its parents) that is running the model checker
     */
    @Accessors private Process verificationProcess = null
    
    // Options for counterexample generation
    @Accessors private boolean createCounterexamplesWithOutputs = true
    @Accessors private boolean createCounterexamples = true
    
    // Options for SMV code generation
    @Accessors private boolean smvUseIVAR = false
    @Accessors private boolean smvIgnoreRangeAssumptions = false
    
    // Options for verification using NuSMV / nuXmv
    @Accessors private List<String> customInteractiveSmvInvarCommands = null
    @Accessors private List<String> customInteractiveSmvLtlCommands = null
    @Accessors private List<String> customInteractiveSmvCtlCommands = null
    
    // Options for verification using SPIN
    @Accessors private List<String> customSpinCommands =null
    
    
    // Utility methods to enables dependency inversion
    
    def void copyAssumptions(ValuedObject vo, ValuedObject source) {
        for(assumption : this.verificationAssumptions.clone) {
            switch(assumption) {
                RangeAssumption : {
                    if(assumption.valuedObject !== null && assumption.valuedObject.name == source.name) {
                        val assumptionCopy = new RangeAssumption(vo, assumption.minValue, assumption.maxValue)
                        this.verificationAssumptions.add(assumptionCopy)
                    }
                }
            }
        }
    }
    
    def void addRangeAssumtion(ValuedObject vo, int start, int end) {
        this.verificationAssumptions.add(new RangeAssumption(vo, start, end))
    }
    
    override cloneObject() {
        this
    }
    
    override isMutable() {
        false
    }
    
}