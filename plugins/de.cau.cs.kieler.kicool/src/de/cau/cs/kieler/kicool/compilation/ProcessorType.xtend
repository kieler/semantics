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
package de.cau.cs.kieler.kicool.compilation

/**
 * Different types of a processor.
 * 
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
enum ProcessorType {
    
    /** The processor is part of the kicool system. */
    SYSTEM,
    
    /** The processor is meant to do a model-to-model transformation. */
    TRANSFORMATOR, 
    
    /** The processor is meant to analyze the model without performing any changes. */
    ANALYZER, 
    
    /** The processor is meant to optimize the model. However, semantically it should be identical. 
     *  Also, if the optimization fails, the source model is considered valid for the ongoing compilation. */
    OPTIMIZER, 
    
    /** Specialized analyzer that creates metric values. */
    METRIC, 

    /** Specialized analyzer that reports warnings and errors. */
    VALIDATOR, 
    
    /** The processor is meant to perform testing on the model. */
    TESTER,     
    
    /** The processor is in a development phase (e.g. during runtime prototyping) and not yet ready for stable release. */
    DEVELOPER
}