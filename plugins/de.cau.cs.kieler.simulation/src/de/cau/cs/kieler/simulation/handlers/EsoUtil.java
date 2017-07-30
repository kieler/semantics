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
package de.cau.cs.kieler.simulation.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.prom.ModelImporter;
import de.cau.cs.kieler.sim.eso.eso.EsoBool;
import de.cau.cs.kieler.sim.eso.eso.EsoFloat;
import de.cau.cs.kieler.sim.eso.eso.EsoInt;
import de.cau.cs.kieler.sim.eso.eso.EsoString;
import de.cau.cs.kieler.sim.eso.eso.signal;
import de.cau.cs.kieler.sim.eso.eso.tick;
import de.cau.cs.kieler.sim.eso.eso.trace;
import de.cau.cs.kieler.sim.eso.eso.tracelist;
import de.cau.cs.kieler.simulation.core.DataPool;
import de.cau.cs.kieler.simulation.core.Model;
import de.cau.cs.kieler.simulation.core.Variable;

/**
 * @author aas
 *
 */
public class EsoUtil {
    public EList<trace> traces;
    
    EsoUtil(IFile file) throws Exception {
        EObject model = ModelImporter.load(file);
        if(model instanceof tracelist) {
            traces =  ((tracelist)model).getTraces();
        } else {
            throw new Exception(file.getName()+" is not an ESO trace.");
        }
    }
    
    EsoUtil(EObject trace) throws Exception {
        if(trace instanceof tracelist) {
            traces =  ((tracelist)trace).getTraces();
        } else {
            throw new Exception(trace+" is not an ESO trace.");
        }
    }
    
    int getTraceCount() {
        return traces.size();
    }
    
    List<DataPool> getTraceAsDataPools(int tracenumber) {
        List<DataPool> pools = new ArrayList<>();
        trace currentTrace = traces.get(tracenumber);
        for(tick t : currentTrace.getTicks()) {
            DataPool pool = getTickAsDataPool(t);
            pools.add(pool);
        }
        return pools;
    }
    
    private DataPool getTickAsDataPool(tick t) {
        DataPool pool = new DataPool();
        Model model = new Model("Model");
        pool.addModel(model);
        // Add inputs
        for(signal s : t.getInput()) {
            Variable variable = getSignalAsVariable(s);
            variable.setIsInput(true);
            model.addVariable(variable);
        }
        // Add outputs
        for(signal s : t.getOutput()) {
            Variable variable = getSignalAsVariable(s);
            variable.setIsOutput(true);
            model.addVariable(variable);
        }
        return pool;
    }
    
    private Variable getSignalAsVariable(signal s) {
        String varName = s.getName();
        Variable variable = new Variable(varName);
        if(s.isValued()) {
            // Set value of variable to value of signal.
            EObject value = s.getVal();
            if(value instanceof EsoInt) {
                variable.setValue(((EsoInt)value).getValue());
            } else if(value instanceof EsoFloat) {
                variable.setValue(((EsoFloat)value).getValue());
            } else if(value instanceof EsoString) {
                variable.setValue(((EsoString)value).getValue());
            } else if(value instanceof EsoBool) {
                variable.setValue(((EsoBool)value).isValue());
            } else {
                // The variable should be present
                variable.setValue(1);
            }
        } else {
            // As this value is present but not valued,
            // the variable in the pool should have a value of true (or 1).
            variable.setValue(true);
        }
        return variable;
    }
}
