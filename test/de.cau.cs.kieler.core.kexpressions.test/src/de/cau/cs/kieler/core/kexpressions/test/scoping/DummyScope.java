/**
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
package de.cau.cs.kieler.core.kexpressions.test.scoping;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import de.cau.cs.kieler.core.annotations.impl.AnnotatableImpl;
import de.cau.cs.kieler.core.kexpressions.Signal;
import de.cau.cs.kieler.core.kexpressions.Variable;

/**
 * This is a DummyScope for the test cases to run only. It creates some dummy signals and variables
 * and cares for serialization requests (getURI()).
 * 
 * @author cmot
 * 
 */
public class DummyScope extends AnnotatableImpl {

    // These IDs are the same as for SyncCharts
    private int SCOPE__SIGNALS = 3;
    private int SCOPE__VARIABLES = 4;
    
    // Internal signals and variables lists
    private EList<Signal> signals;
    private EList<Variable> variables;
    
    //-------------------------------------------------------------------------

    /**
     * Instantiates a new dummy scope and creates the dummy signals and variables.
     */
    public DummyScope() {
        signals = new EObjectContainmentEList<Signal>(Signal.class, this, SCOPE__SIGNALS);
        variables = new EObjectContainmentEList<Variable>(Variable.class, this, SCOPE__VARIABLES);

        signals.add(new DummySignal("A"));
        signals.add(new DummySignal("B"));
        signals.add(new DummySignal("C"));
        signals.add(new DummySignal("D"));

        variables.add(new DummyVariable("varA"));
        variables.add(new DummyVariable("varB"));
        variables.add(new DummyVariable("varC"));
        variables.add(new DummyVariable("varD"));
    }

    //-------------------------------------------------------------------------

    /**
     * Gets the signals.
     *
     * @return the signals
     */
    public EList<Signal> getSignals() {
        return signals;
    }
    
    //-------------------------------------------------------------------------

    /**
     * Gets the variables.
     *
     * @return the variables
     */
    public EList<Variable> getVariables() {
        return variables;
    }

    //-------------------------------------------------------------------------

    // This method is needed if getURI for Signal/Variable is called in order to
    // serialize it. In this case the name is returned.
    /**
     * {@inheritDoc}
     */
    public String eURIFragmentSegment(EStructuralFeature eStructuralFeature, EObject eObject) {
        if (eObject instanceof DummySignal) {
            return ((DummySignal) eObject).getName();
        }
        if (eObject instanceof DummyVariable) {
            return ((DummyVariable) eObject).getName();
        }
        return "eobjectnotfound";
    }

    //-------------------------------------------------------------------------

}
