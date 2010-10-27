/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.transformation.impl;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.esterel.transformation.core.AbstractTransformationDataComponent;
import de.cau.cs.kieler.esterel.transformation.core.AbstractTransformationStatement;
import de.cau.cs.kieler.synccharts.State;

/**
 * @author uru
 * 
 */
public class DummyDataComponent extends AbstractTransformationDataComponent {

    private static final String SYNCCHARTS_PACKAGE = "de.cau.cs.kieler.synccharts.SyncchartsPackage";
    private static final String EXPRESSIONS_PACKAGE = "de.cau.cs.kieler.core.expressions."
            + "ExpressionsPackage";
    private static final String ESTEREL_PACKAGE = "de.cau.cs.kieler.esterel.esterel.EsterelPackage";
    private static final String ECORE_PACKAGE = "org.eclipse.emf.ecore.EcorePackage";
    private static final String TRANSFORMATION_FILE = "toSyncchartTransformationNew.ext";

    /** first transformation being executed. */
    public static final String INITIAL_TRANSFORMATION = "initial";

    // TODO needed?! can there be more than one data component of one type?
    /** any kind of identifier. */
    private static final String IDENTIFIER = "de.cau.cs.kieler.esterel.transformation."
            + "impl.E2SDataComponent";

    @Override
    public String getTransformationFile() {
        // TODO Auto-generated method stub
        return TRANSFORMATION_FILE;
    }

    @Override
    public String getIdentifier() {

        return "de.cau.cs.kieler.esterel.transformation." + "impl.E2SDataComponent";
    }

    @Override
    public List<String> getBasePackages() {
        LinkedList<String> basePackages = new LinkedList<String>();
        basePackages.add(SYNCCHARTS_PACKAGE);
        basePackages.add(EXPRESSIONS_PACKAGE);
        basePackages.add(ESTEREL_PACKAGE);
        basePackages.add(ECORE_PACKAGE);
        return basePackages;
    }

    public static AbstractTransformationStatement getTransformationStatement(
            final String transName, final State syncElement, final EObject estElement) {
        QueueStatement qs = new QueueStatement(transName, syncElement, estElement);
        return qs;
    }
}
