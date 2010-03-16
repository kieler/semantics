/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kiem.automated.data;

import de.cau.cs.kieler.sim.kiem.automated.IAutomatedComponent;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * The result for a single model file.
 * 
 * @author soh
 * @kieler.rating 2010-03-16 proposed yellow
 */
public class ModelResult extends AbstractResult {

    /**
     * Creates a new result for a model file.
     * 
     * @param modelFile
     *            the model file
     */
    public ModelResult(final String modelFile) {
        super();
        super.addResult(new KiemProperty(IAutomatedComponent.MODEL_FILE,
                modelFile));
        super.addResult(new KiemProperty(IAutomatedComponent.STATUS,
                ResultStatus.labelOf(ResultStatus.CREATED)));
    }

    /**
     * Setter for the status.
     * 
     * @param statusParam
     *            the status to set
     */
    public void setStatus(final ResultStatus statusParam) {
        String value = ResultStatus.labelOf(statusParam);

        for (KiemProperty prop : super.getResults()) {
            if (prop.getKey().equals(IAutomatedComponent.STATUS)) {
                prop.setValue(value);
            }
        }
    }
}
