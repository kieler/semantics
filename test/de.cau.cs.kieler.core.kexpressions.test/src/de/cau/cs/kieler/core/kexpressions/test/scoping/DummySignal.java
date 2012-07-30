package de.cau.cs.kieler.core.kexpressions.test.scoping;

import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.core.kexpressions.impl.SignalImpl;

public class DummySignal extends SignalImpl {
    
    public DummySignal(String name) {
        this.setType(ValueType.PURE);
        this.setIsInput(true);
        this.setIsOutput(true);
        setName(name);
    }


}
