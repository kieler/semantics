/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kart.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.sim.kart.INamingSuggestion;

/**
 * {@inheritDoc}
 * 
 * @author Sebastian Schäfer - ssc AT informatik.uni-kiel.de
 * @kieler.rating 2012-01-24 red
 */
public class NamingSuggestion implements INamingSuggestion {
    /**
     * {@inheritDoc}
     */
    public String suggestName() {
        String filename = "";
        try {
            IEditorPart editor = KartUIPlugin.getDefault().getActivePage().getActiveEditor();
            
            IFile file = (IFile) editor.getEditorInput().getAdapter(IFile.class);
            URI resource = URI.createURI(file.getLocationURI().toString());
            URI absFile = CommonPlugin.resolve(resource.trimFileExtension().appendFileExtension("eso"));
            filename = absFile.toFileString();            
        } catch (Exception e) {
            // do nothing, auto-suggestion will simply not work
        }
        
        return filename;
    }
}
