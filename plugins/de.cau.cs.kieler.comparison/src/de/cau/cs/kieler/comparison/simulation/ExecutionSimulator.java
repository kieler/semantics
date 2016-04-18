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
 * @author nfl
 *
 */
public abstract class ExecutionSimulator extends JSONObjectSimulationDataComponent {

    public abstract void setCompilationPath(Path compilation);
    public abstract boolean setSrcModelPath(Path srcModel);

    public abstract JSONObject doStep(JSONObject jSONObject) throws KiemExecutionException;
    public abstract void doModel2ModelTransform(final ProgressMonitorAdapter monitor) throws KiemInitializationException;
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
