package de.cau.cs.kieler.core.kexpressions.test.scoping;

import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.core.kexpressions.impl.VariableImpl;

/**
 * The Class DummyVariable.
 * 
 * @author cmot
 */
public class DummyVariable extends VariableImpl {
    
    /**
     * Instantiates a new dummy variable.
     *
     * @param name the name
     */
    public DummyVariable(String name) {
        this.setType(ValueType.INT);
        setName(name);
    }

}
