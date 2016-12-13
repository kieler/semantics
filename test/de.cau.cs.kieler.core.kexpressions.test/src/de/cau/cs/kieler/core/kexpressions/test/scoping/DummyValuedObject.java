/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.kexpressions.test.scoping;

import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.impl.ValuedObjectImpl;

/**
 * The Class DummyVariable.
 * 
 * @author cmot, ssm
 */
public class DummyValuedObject extends ValuedObjectImpl {
    
    /**
     * Instantiates a new dummy variable.
     *
     * @param name the name
     */
    public DummyValuedObject(Declaration declaration, String name) {
        declaration.getValuedObjects().add(this);
        setName(name);
    }

}
