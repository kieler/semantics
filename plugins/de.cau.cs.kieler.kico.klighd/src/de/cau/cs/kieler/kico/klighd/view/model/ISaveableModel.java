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
package de.cau.cs.kieler.kico.klighd.view.model;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

/**
 * Interface for a saveable model class.
 * 
 * @author als
 * @kieler.design 2015-08-04 proposed
 * @kieler.rating 2015-08-04 proposed yellow
 *
 */
public interface ISaveableModel {

    /**
     * Saves the model into the given file.
     * 
     * @param file
     *            target file
     * @param uri
     *            location of the file
     * @throws Exception
     */
    public void save(IFile file, URI uri) throws Exception;

}
