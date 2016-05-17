/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.simulation;

import java.nio.file.Path;

import org.json.JSONObject;

import de.cau.cs.kieler.core.model.util.ProgressMonitorAdapter;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;

/**
 * The ExecutionSimulator class is used for the simulation of compilations using KIEM. It is
 * responsible for the stepwise simulation of the compiled test cases. It is an abstract class and
 * every {@link ICompiler} needs an ExecutionSimulator object, if it should be measured by the
 * execution time of compiled test cases.
 * 
 * @author nfl
 */
public abstract class ExecutionSimulator extends JSONObjectSimulationDataComponent {

    /**
     * Setter for the path referring the compiled test case.
     * 
     * @param compilation
     *            the path to set
     */
    public abstract void setCompilationPath(Path compilation);

    /**
     * Setter for the path referring the test case before compilation.
     * 
     * @param srcModel
     *            the path to set
     * @return true, if the path could be successfully set; false otherwise
     */
    public abstract boolean setSrcModelPath(Path srcModel);

    /**
     * {@inheritDoc}
     */
    public abstract JSONObject doStep(JSONObject jSONObject) throws KiemExecutionException;

    /**
     * {@inheritDoc}
     */
    public abstract void doModel2ModelTransform(final ProgressMonitorAdapter monitor)
            throws KiemInitializationException;

    /**
     * {@inheritDoc}
     */
    public abstract JSONObject doProvideInitialVariables() throws KiemInitializationException;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isProducer() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isObserver() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KiemProperty[] doProvideProperties() {
        return null;
    }
}
