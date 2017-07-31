/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ui.synthesis;

import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SynthesisHook;

/**
 * The {@link SynthesisOption}s generally used in the {@link SRTGSynthesis}. <br>
 * Specific {@link SynthesisOption} related to {@link SynthesisHook} are declared in the
 * corresponding class.
 * 
 * @author als ssm
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 *
 */
public final class GeneralSynthesisOptions {
    /**
     * Prevent Instantiation.
     */
    private GeneralSynthesisOptions() {
    }
    
    //-- CATEGORIES --
    
    /** The appearance category */
    public static final SynthesisOption APPEARANCE = SynthesisOption.createCategory("Appearance");
    /** The debugging category */
    public static final SynthesisOption DEBUGGING = SynthesisOption.createCategory("Debugging", false);
    /** The layout category */
    public static final SynthesisOption LAYOUT = SynthesisOption.createCategory("Layout", false);
    /** Dataflow category */
    public static final SynthesisOption DATAFLOW = SynthesisOption.createCategory("Dataflow", false).
            setCategory(APPEARANCE);
    
    //-- OPTIONS --
    
    /** Option for setting the KLayLayered layout */
    public static final SynthesisOption USE_KLAY = SynthesisOption.createCheckOption("KLayLayered",
            true).setCategory(LAYOUT);

    /** Option for enabling adaptive zoom */
    public static final SynthesisOption USE_ADAPTIVEZOOM = SynthesisOption.createCheckOption(
            "Adaptive Zoom", false).setCategory(APPEARANCE);
    
    public static final SynthesisOption SHOW_ALL_SCCHARTS =
            SynthesisOption.createCheckOption("Show all SCCharts", false).setCategory(APPEARANCE);
    
    public static final SynthesisOption SHOW_COMMENTS =
            SynthesisOption.createCheckOption("Show comment nodes", true).setCategory(APPEARANCE);

}
