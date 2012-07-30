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
