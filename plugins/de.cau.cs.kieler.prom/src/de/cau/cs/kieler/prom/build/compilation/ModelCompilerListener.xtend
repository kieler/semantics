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
    public def void beforeCompilation(ModelCompiler compiler)
    public def void beforeIntermediateCompilation(ModelCompiler compiler)
    public def void afterIntermediateCompilation(ModelCompiler compiler)
    public def void afterCompilation(ModelCompiler compiler)
}