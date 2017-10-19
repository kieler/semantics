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
package de.cau.cs.kieler.prom.build.compilation

/**
 * @author aas
 *
 */
interface ModelCompilerListener {
    /**
     * Fired before the compilation of any model.
     */
    public def void beforeCompilation(ModelCompiler compiler)
    /**
     * Fired before an element in the compile chain is processed.
     */
    public def void beforeIntermediateCompilation(ModelCompiler compiler)
    /**
     * Fired after an element in the compile chain is processed.
     */
    public def void afterIntermediateCompilation(ModelCompiler compiler)
    /**
     * Fired after the compilation is done, but before the simulation code for the compiled model is created.
     */
    public def void afterCompilation(ModelCompiler compiler)
}