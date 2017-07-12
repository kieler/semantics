/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.synthesis;

import static de.cau.cs.kieler.kicool.ui.synthesis.ColorStore.*;
import static de.cau.cs.kieler.kicool.ui.synthesis.ColorStore.Color.*;

import de.cau.cs.kieler.kicool.classes.IColorSystem;

/**
 * @author ssm
 *
 */
public enum ColorSystem implements IColorSystem {
    
    BUSY(BUSY_FOREGROUND, BUSY_BACKGROUND, BUSY_BACKGROUND_TARGET),
    OK(OK_FOREGROUND, OK_BACKGROUND, OK_BACKGROUND_TARGET),
    WARNING(WARNING_FOREGROUND, WARNING_BACKGROUND, WARNING_BACKGROUND_TARGET),
    ERROR(ERROR_FOREGROUND, ERROR_BACKGROUND, ERROR_BACKGROUND_TARGET),
    PROGRESSBAR(PROGRESSBAR_FOREGROUND, PROGRESSBAR_BACKGROUND, PROGRESSBAR_BACKGROUND),
    ON(OK_FOREGROUND, OK_BACKGROUND, OK_BACKGROUND_TARGET),
    OFF(ERROR_FOREGROUND, ERROR_BACKGROUND, ERROR_BACKGROUND_TARGET);
    
    private Color foreground = null;
    private Color background = null;
    private Color backgroundTarget = null;
    
    private ColorSystem(ColorStore.Color foreground, ColorStore.Color background, ColorStore.Color backgroundTarget) {
        this.foreground = foreground;
        this.background = background;
        this.backgroundTarget = backgroundTarget;
    }
    
    public Color getForeground() {
        return foreground;
    }

    public Color getBackground() {
        return background;
    }

    public Color getBackgroundTarget() {
        return backgroundTarget;
    }
    
}
