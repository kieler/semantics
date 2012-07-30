/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.kexpressions.test.scoping;

import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.core.kexpressions.impl.SignalImpl;

/**
 * The Class DummySignal.
 * 
 * @author cmot
 */
public class DummySignal extends SignalImpl {
    
    /**
     * Instantiates a new dummy signal.
     *
     * @param name the name
     */
    public DummySignal(String name) {
        this.setType(ValueType.PURE);
        this.setIsInput(true);
        this.setIsOutput(true);
        setName(name);
    }


}
