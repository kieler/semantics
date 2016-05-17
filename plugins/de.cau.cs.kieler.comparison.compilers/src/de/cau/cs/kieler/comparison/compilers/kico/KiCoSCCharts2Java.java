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
 * The KiCoSCCharts2Java class compiles to Java code. It is abstract and missing the transformation
 * rule as well as a simulator.
 * 
 * @author nfl
 */
public abstract class KiCoSCCharts2Java extends AbstractKiCo implements ICompiler {

    /**
     * The constructor of KiCo compiling to Java code.
     */
    public KiCoSCCharts2Java() {
        trgLanguage = Language.Java;
        trgLanguageString = "Java";
        trgLanguageExtension = ".java";
        // TODO add java transformation strings
        // transformation = "";
    }
}
