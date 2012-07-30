package de.cau.cs.kieler.core.kexpressions.test.scoping;

import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.core.kexpressions.impl.VariableImpl;

public class DummyVariable extends VariableImpl {
    
    public DummyVariable(String name) {
        this.setType(ValueType.INT);
        setName(name);
    }


}
