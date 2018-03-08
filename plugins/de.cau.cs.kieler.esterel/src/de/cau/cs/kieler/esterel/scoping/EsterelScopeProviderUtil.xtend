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
package de.cau.cs.kieler.esterel.scoping

import de.cau.cs.kieler.esterel.ConstantDeclaration
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.EsterelVariableDeclaration
import de.cau.cs.kieler.esterel.Function
import de.cau.cs.kieler.esterel.FunctionDeclaration
import de.cau.cs.kieler.esterel.LocalSignalDeclaration
import de.cau.cs.kieler.esterel.LocalVariableDeclaration
import de.cau.cs.kieler.esterel.Procedure
import de.cau.cs.kieler.esterel.ProcedureDeclaration
import de.cau.cs.kieler.esterel.Sensor
import de.cau.cs.kieler.esterel.SensorDeclaration
import de.cau.cs.kieler.esterel.Signal
import de.cau.cs.kieler.esterel.SignalDeclaration
import de.cau.cs.kieler.esterel.Task
import de.cau.cs.kieler.esterel.TaskDeclaration
import de.cau.cs.kieler.esterel.Trap
import de.cau.cs.kieler.esterel.TypeDeclaration
import de.cau.cs.kieler.esterel.TypeDefinition
import de.cau.cs.kieler.esterel.Variable
import de.cau.cs.kieler.scl.Module
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class EsterelScopeProviderUtil {
    
    /** collecting all sensors of a passed module. */
    public static val ScopeFunction<Module> COLLECT_SENSORS = new ScopeFunction<Module>() {
        override collect(Module m, List<IEObjectDescription> scopeElems) {
            for (s : m.declarations.filter(SensorDeclaration).map[valuedObjects.filter(Sensor)].flatten) {
                scopeElems.add(new EObjectDescription(QualifiedName.create(s.name), s, emptyMap));
            }
        }
    }

    /** collecting all constants of a passed module. */
    public static val ScopeFunction<Module> COLLECT_CONSTANTS = new ScopeFunction<Module>() {
        override collect(Module m, List<IEObjectDescription> scopeElems) {
            for (d : m.declarations.filter(ConstantDeclaration)) {
                for (s : d.valuedObjects) {
                    scopeElems.add(new EObjectDescription(QualifiedName.create(s.name), s, emptyMap));
                }
            }
        }
    }

    /** collecting all functions of a passed module. */
    public static val ScopeFunction<Module> COLLECT_FUNCTIONS = new ScopeFunction<Module>() {
        override collect(Module m, List<IEObjectDescription> scopeElems) {
            for (s : m.declarations.filter(FunctionDeclaration).map[valuedObjects.filter(Function)].flatten) {
                scopeElems.add(new EObjectDescription(QualifiedName.create(s.name), s, emptyMap));
            }
        }
    };

    /** collecting all procedures of a passed module. */
    public static val ScopeFunction<Module> COLLECT_PROCEDURES = new ScopeFunction<Module>() {
        override collect(Module m, List<IEObjectDescription> scopeElems) {
            for (s : m.declarations.filter(ProcedureDeclaration).map[valuedObjects.filter(Procedure)].flatten) {
                scopeElems.add(new EObjectDescription(QualifiedName.create(s.name), s, emptyMap));
            }
        }
    };

    /** collecting all signals of a passed module. */
    public static val ScopeFunction<Module> COLLECT_SIGNALS = new ScopeFunction<Module>() {
        override collect(Module m, List<IEObjectDescription> scopeElems) {
            for (s : m.declarations.filter(SignalDeclaration).map[valuedObjects.filter(Signal)].flatten) {
                scopeElems.add(new EObjectDescription(QualifiedName.create(s.name), s, emptyMap));
            }
        }
    };
    /** collecting all types of a passed module. */
    public static val ScopeFunction<Module> COLLECT_TYPES = new ScopeFunction<Module>() {
        override collect(Module m, List<IEObjectDescription> scopeElems) {
            for (s : m.declarations.filter(TypeDeclaration).map[valuedObjects.filter(TypeDefinition)].flatten) {
                scopeElems.add(new EObjectDescription(QualifiedName.create(s.name), s, emptyMap));
            }
        }
    };
    /** collecting all tasks of a passed module. */
    public static val ScopeFunction<Module> COLLECT_TASKS = new ScopeFunction<Module>() {
        override collect(Module m, List<IEObjectDescription> scopeElems) {
            for (s : m.declarations.filter(TaskDeclaration).map[valuedObjects.filter(Task)].flatten) {
                scopeElems.add(new EObjectDescription(QualifiedName.create(s.name), s, emptyMap));
            }
        }
    };

    /**
     * Collects all Signals of the current module (including local signals) and all other modules.
     * 
     * @param context
     *            context
     * @return list with the new scope elements.
     */
    public static def List<IEObjectDescription> getAllSignals(EObject context) {
        val scopeElems = getLocalSignals(context);
        scopeElems.addAll(getAllElements(context, COLLECT_SIGNALS));
        return scopeElems;
    }

    /**
     * Gets all elements collected by the passed function within the context's scope up to its
     * parent module.
     * 
     * @param context
     *            context
     * @param function
     *            function collecting scope elements
     * @return list with the according scope elements.
     */
    public static def List<IEObjectDescription> getElements(EObject context, ScopeFunction<Module> function) {
        val scopeElems = new ArrayList<IEObjectDescription>();
        var parent = if (context instanceof Module) {
            context
        } else {
            context.eContainer()
        }
        // get this scope's module interface
        while (!(parent instanceof Module) && parent !== null) {
            parent = parent.eContainer();
        }
        if (parent !== null) function.collect(parent as Module, scopeElems);
        return scopeElems;
    }

    /**
     * Gets all elements collected by the passed function within the context's scope up to its
     * parent module <b>and</b> all other modules withing the .strl file!
     * 
     * @param context
     *            context
     * @param function
     *            function collecting scope elements
     * @return list with the according scope elements.n
     */
    public static def List<IEObjectDescription> getAllElements(EObject context, ScopeFunction<Module> function) {

        val scopeElems = new ArrayList<IEObjectDescription>();
        var parent = if (context instanceof Module) {
            context
        } else {
            context.eContainer()
        }
        // get this scope's module interface
        while (!(parent instanceof Module) && parent !== null) {
            parent = parent.eContainer();
        }
        if (parent !== null) {
            function.collect(parent as Module, scopeElems);
            // collect from possible other modules
//            val p = (parent as Module).eContainer() as EsterelProgram;
//            for (Module m : p.modules.filter(Module)) {
//                function.collect(m, scopeElems);
//            }
            if (function == COLLECT_SIGNALS ) {
                val program = parent.eContainer
                if (program instanceof EsterelProgram) {
                    if (program.tick !== null) {
                        scopeElems.add(new EObjectDescription(QualifiedName.create(program.tick
                                        .getName()), program.tick, emptyMap))
                    }
                }
            }
        }
        return scopeElems;
    }
    
    /**
     * collect all signals (including local signals) and sensors AND the valued object "tick"
     * 
     * @param context context
     * 
     * @return list with scope elements
     */
    public static def List<IEObjectDescription> getSignalsAndSensors(EObject context) {
        val scopeElems = getAllSignals(context)
        scopeElems.addAll(getAllElements(context, COLLECT_SENSORS))

        return scopeElems;
        
    }
    
    /**
     * collect everything of type 'valuedObject' (signals, variables, traps ...)
     * 
     * @param context context
     * 
     * @return list with scope elements
     */
    public static def List<IEObjectDescription> getValuedObjects(EObject context) {
        val scopeElems = new ArrayList<IEObjectDescription>();
        
        scopeElems.addAll(getLocalVariables(context))
        scopeElems.addAll(getAllElements(context, COLLECT_CONSTANTS))

        return scopeElems;

//        var parent = context.eContainer();
//        // Go up in the Structure until Module/MainModule
//        while (!(parent instanceof Module) && parent != null) {
//            switch (parent) {
//                LocalVariableDeclaration : {
//                    val decl = (parent as LocalVariableDeclaration).getDeclarations();
//                    for (EsterelVariableDeclaration vdecl : decl) {
//                        for (Variable varSingle : vdecl.valuedObjects.filter(Variable)) {
//                            scopeElems.add(new EObjectDescription(QualifiedName.create(varSingle
//                                    .getName()), varSingle, emptyMap));
//                        }
//                    }
//                }
//                LocalSignalDeclaration : {
//                    val signals = (parent as LocalSignalDeclaration).getValuedObjects();
//                    for (s : signals) {
//                        scopeElems.add(new EObjectDescription(QualifiedName.create(s.getName()), s, emptyMap));
//                    }
//                }
//                Trap : {
//                    val trapDecl = (parent as Trap).getTrapSignals();
//                    // add Trap to the scope
//                    for (Signal trap : trapDecl) {
//                        scopeElems.add(new EObjectDescription(QualifiedName.create(trap.getName()),
//                                trap, emptyMap));
//                    }                    
//                }
//                
//            }
//            parent = parent.eContainer();
//        }
//        scopeElems.addAll(getAllElements(context, COLLECT_CONSTANTS))
//        scopeElems.addAll(getAllElements(context, COLLECT_SENSORS))
//        scopeElems.addAll(getAllElements(context, COLLECT_SIGNALS))
//
//        return scopeElems;
    }

    /**
     * collect all local signals of the context up to its parent module.
     * 
     * @param context
     *            context
     * @return list with scope elements
     */
    public static def List<IEObjectDescription> getLocalSignals(EObject context) {
        val scopeElems = new ArrayList<IEObjectDescription>();

        var parent = if (context instanceof Module) {
            context
        } else {
            context.eContainer()
        }
        // Go up in the Structure until Module/MainModule
        while (!(parent instanceof Module) && parent !== null) {
            // Get the local signals into the scope
            if (parent instanceof LocalSignalDeclaration) {
                val signals = (parent as LocalSignalDeclaration).getValuedObjects();
                for (s : signals) {
                    scopeElems.add(new EObjectDescription(QualifiedName.create(s.getName()), s, emptyMap));
                }
            }
            parent = parent.eContainer();
        }

        return scopeElems;
    }

    /**
     * collect all local variables of the context up to its parent module.
     * 
     * @param context
     *            context
     * @return list with scope elements
     */
    public static def List<IEObjectDescription> getLocalVariables(EObject context) {
        val scopeElems = new ArrayList<IEObjectDescription>();

        var parent = if (context instanceof Module) {
            context
        } else {
            context.eContainer()
        }
        // Go up in the Structure until Module/MainModule
        while (!(parent instanceof Module) && parent !== null) {
            // Get the local variables into the scope
            if (parent instanceof LocalVariableDeclaration) {
                val decl = (parent as LocalVariableDeclaration).getDeclarations();
                for (EsterelVariableDeclaration vdecl : decl) {
                    for (Variable varSingle : vdecl.valuedObjects.filter(Variable)) {
                        scopeElems.add(new EObjectDescription(QualifiedName.create(varSingle
                                .getName()), varSingle, emptyMap));
                    }
                }
            }
            parent = parent.eContainer();
        }

        return scopeElems;
    }

    /**
     * collect all local traps of the context up to its parent module.
     * 
     * @param context
     *            context
     * @return list with scope elements
     */
    public static def List<IEObjectDescription> getLocalTraps(EObject context) {
        val scopeElems = new ArrayList<IEObjectDescription>();

        var parent = if (context instanceof Module) {
            context
        } else {
            context.eContainer()
        }
        // find all Traps
        while (!(parent instanceof Module) && parent !== null) {
            if (parent instanceof Trap) {
                val trapDecl = (parent as Trap).getTrapSignals();
                // add Trap to the scope
                for (Signal trap : trapDecl) {
                    scopeElems.add(new EObjectDescription(QualifiedName.create(trap.getName()),
                            trap, emptyMap));
                }
            }
            parent = parent.eContainer();
        }

        return scopeElems;
    }

    /**
     * collect all modules of the current esterel file.
     * 
     * @param context
     *            context
     * @return list with scope elements
     */
    public static def List<IEObjectDescription> getAllModules(EObject context) {
        val scopeElems = new ArrayList<IEObjectDescription>();

        var parent = if (context instanceof EsterelProgram) {
            context
        } else {
            context.eContainer()
        }
        // find all Modules
        while (parent !== null) {
            if (parent instanceof EsterelProgram) {
                val p = parent;
                // add Trap to the scope
                for (m : p.modules.filter(Module)) {
                    scopeElems.add(new EObjectDescription(QualifiedName.create(m.getName()), m, emptyMap));
                }
                return scopeElems;
            }
            parent = parent.eContainer();
        }

        return scopeElems;
    }
}