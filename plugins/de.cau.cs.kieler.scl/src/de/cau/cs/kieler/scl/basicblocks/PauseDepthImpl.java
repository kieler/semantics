package de.cau.cs.kieler.scl.basicblocks;

import de.cau.cs.kieler.scl.scl.Pause;
import de.cau.cs.kieler.scl.scl.impl.PauseImpl;

public class PauseDepthImpl extends PauseImpl implements PauseDepth {

    public Pause PauseReference;
    
    public PauseDepthImpl(Pause SCLPause) {
        super();
        PauseReference = SCLPause;
    }

}
