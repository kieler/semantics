/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.core.properties.Property;

/**
 * @author als
 * @kieler.design 2014-09-22 proposed
 * @kieler.rating 2014-09-22 proposed yellow
 * 
 */
public final class KiCoProperties {
    private KiCoProperties() {
    }

    public static final IProperty<CompilationResult> COMPILATION_RESULT =
            new Property<CompilationResult>("de.cau.cs.kieler.kico.klighd.compilation.result", null);
    public static final IProperty<KielerCompilerContext> COMPILATION_CONTEXT = 
            new Property<KielerCompilerContext>("de.cau.cs.kieler.kico.klighd.compilation.context", null);
    public static final IProperty<EObject> RAW_INPUT_MODEL = 
            new Property<EObject>("de.cau.cs.kieler.kico.klighd.compilation.input", null);
}
