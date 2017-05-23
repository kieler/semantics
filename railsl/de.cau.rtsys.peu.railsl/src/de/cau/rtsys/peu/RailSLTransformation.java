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
package de.cau.rtsys.peu;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.kico.internal.Transformation;
import de.cau.cs.kieler.kico.transformation.IExpansionTransformation;
import de.cau.cs.kieler.kico.transformation.ITransformation;
import de.cau.cs.kieler.kico.transformation.ProcessorOption;

/**
 *
 */
public class RailSLTransformation extends Transformation implements ITransformation {

    /**
     * @param expansionTransformation
     */
    public RailSLTransformation(IExpansionTransformation expansionTransformation) {
        super(expansionTransformation);
        // TODO Auto-generated constructor stub
    }

    public static final String ID = "RailSL";
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String getId() {
        return ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return null;
    }

    public List<String> getDependencies() {
        return null;
    }
    
    public EObject transform (EObject e) {
        // TODO
        return null;
    }
    
}
