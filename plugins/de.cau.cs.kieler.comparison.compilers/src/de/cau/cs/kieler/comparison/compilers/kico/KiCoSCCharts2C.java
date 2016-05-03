/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.compilers.kico;

import de.cau.cs.kieler.comparison.core.ICompiler;
import de.cau.cs.kieler.comparison.core.Language;

/**
 * The KiCoSCCharts2C compiles to C-Code and provides an ExecutionSimulator for measuring the
 * execution speed of compiled test cases.
 * 
 * @author nfl
 */
public class KiCoSCCharts2C extends AbstractKiCo implements ICompiler {

    /**
     * The constructor of KiCo compiling to C-Code. A simulator to execute C-Code is integrated as
     * well.
     */
    public KiCoSCCharts2C() {
        trgLanguage = Language.C;
        trgLanguageString = "C";
        trgLanguageExtension = ".c";
        transformation = "T_s.c";
        simulator = new KiCoSCTExecutionSimulator();
    }
}
