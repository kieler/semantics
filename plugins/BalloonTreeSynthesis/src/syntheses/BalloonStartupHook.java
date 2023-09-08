/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package syntheses;

import de.cau.cs.kieler.klighd.IKlighdStartupHook;
import de.cau.cs.kieler.klighd.KlighdDataManager;

/**
 * @author mka
 *
 */
public class BalloonStartupHook implements IKlighdStartupHook {

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        KlighdDataManager.getInstance().registerDiagramSynthesisClass("Balloon", BalloonSynthesis.class);
    }

}
