/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.ui.splash;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.splash.BasicSplashHandler;

/**
 * Provides a splash screen handler that shows a progress bar, a message line and a version
 * number. Currently, the version number is hard-coded. In the next release, however, the
 * version number is to be dynamic.
 * 
 * TODO: Make version number dynamic.
 * 
 * @author cds
 */
public class KielerSplashHandler extends BasicSplashHandler {
    
    // UI CONTROLS
    private Composite contentComposite;
    private Label versionLabel;
    private Font versionLabelFont;
    private Color versionLabelColor;
    

    /**
     * 
     * Creates a new CustomExtensibleSplashHandler.
     * 
     */
    public KielerSplashHandler() {
        super();
    }
    

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public void init(final Shell splash) {
        // Allow magic numbers in GUI creation
        // CHECKSTYLEOFF MagicNumber
        
        // Store the shell
        super.init(splash);
        
        // Let there be a progress bar and a status message
        setProgressRect(new Rectangle(10, 305, 480, 15));
        setMessageRect(new Rectangle(15, 285, 470, 15));
        contentComposite = (Composite) getBundleProgressMonitor();
        
        // Create the version number label
        versionLabel = createVersionLabel(contentComposite);
        versionLabel.setText("0.5.0");
        
        // CHECKSTYLEON MagicNumber
    }
    
    /** the grey value for label color. */
    private static final int SHADING = 200;
    
    /**
     * Creates and returns the version label.
     * 
     * @param parent the parent control.
     * @return the version label.
     */
    private Label createVersionLabel(final Composite parent) {
        // Allow magic numbers in GUI creation
        // CHECKSTYLEOFF MagicNumber
        
        versionLabelColor = new Color(Display.getDefault(), SHADING, SHADING, SHADING);
        
        Label label = new Label(parent, SWT.NONE);
        label.setForeground(versionLabelColor);
        
        Font f = label.getFont();
        if (f.getFontData() != null) {
            FontData fd = f.getFontData()[0];
            String name = fd.getName();
            int style = fd.getStyle();
            versionLabelFont = new Font(f.getDevice(), name, 20, style);
            label.setFont(versionLabelFont);
        }
        
        label.setLocation(28, 185);
        label.setSize(200, 50);
        
        return label;
        
        // CHECKSTYLEON MagicNumber
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void dispose() {
        super.dispose();
        
        versionLabel.dispose();
        versionLabelColor.dispose();
        versionLabelFont.dispose();
    }
}
