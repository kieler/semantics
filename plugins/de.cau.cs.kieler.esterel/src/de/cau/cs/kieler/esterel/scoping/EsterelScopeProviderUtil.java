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
package de.cau.cs.kieler.esterel.scoping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;

import de.cau.cs.kieler.core.kexpressions.ISignal;
import de.cau.cs.kieler.core.kexpressions.IVariable;
import de.cau.cs.kieler.core.kexpressions.InterfaceSignalDecl;
import de.cau.cs.kieler.core.kexpressions.InterfaceVariableDecl;
import de.cau.cs.kieler.core.kexpressions.VariableDecl;
import de.cau.cs.kieler.esterel.esterel.ConstantDecls;
import de.cau.cs.kieler.esterel.esterel.ConstantWithValue;
import de.cau.cs.kieler.esterel.esterel.Function;
import de.cau.cs.kieler.esterel.esterel.FunctionDecl;
import de.cau.cs.kieler.esterel.esterel.LocalSignal;
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl;
import de.cau.cs.kieler.esterel.esterel.LocalSignalList;
import de.cau.cs.kieler.esterel.esterel.LocalVariable;
import de.cau.cs.kieler.esterel.esterel.Module;
import de.cau.cs.kieler.esterel.esterel.ModuleBody;
import de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecls;
import de.cau.cs.kieler.esterel.esterel.Procedure;
import de.cau.cs.kieler.esterel.esterel.ProcedureDecl;
import de.cau.cs.kieler.esterel.esterel.Program;
import de.cau.cs.kieler.esterel.esterel.SensorDecl;
import de.cau.cs.kieler.esterel.esterel.SensorWithType;
import de.cau.cs.kieler.esterel.esterel.Task;
import de.cau.cs.kieler.esterel.esterel.TaskDecl;
import de.cau.cs.kieler.esterel.esterel.Trap;
import de.cau.cs.kieler.esterel.esterel.Type;
import de.cau.cs.kieler.esterel.esterel.TypeDecl;

/**
 * Supplies some convenient methods for scoping of the esterel grammar.
 * 
 * @author uru
 * 
 */
public final class EsterelScopeProviderUtil {

    /** utility class, private constructor. */
    private EsterelScopeProviderUtil() {
    }

    /** collecting all sensors of a passed module. */
    protected static final ScopeFunction<Module> COLLECT_SENSORS = new ScopeFunction<Module>() {
        public void collect(final Module m, final List<IEObjectDescription> scopeElems) {
            if (m.getInterface() != null && m.getInterface().getIntSensorDecls() != null) {
                for (SensorDecl sd : m.getInterface().getIntSensorDecls()) {
                    for (SensorWithType swt : sd.getSensors()) {
                        scopeElems.add(new EObjectDescription(QualifiedName.create(swt.getSensor()
                                .getName()), swt.getSensor(), getEmptyMap(String.class)));
                    }
                }
            }
        }
    };

    /** collecting all constants of a passed module. */
    protected static final ScopeFunction<Module> COLLECT_CONSTANTS = new ScopeFunction<Module>() {
        public void collect(final Module m, final List<IEObjectDescription> scopeElems) {
            if (m.getInterface() != null && m.getInterface().getIntConstantDecls() != null) {
                for (ConstantDecls decls : m.getInterface().getIntConstantDecls()) {
                    for (OneTypeConstantDecls otcd : decls.getConstants()) {
                        for (ConstantWithValue constant : otcd.getConstants()) {
                            scopeElems.add(new EObjectDescription(QualifiedName.create(constant
                                    .getConstant().getName()), constant.getConstant(),
                                    getEmptyMap(String.class)));
                        }
                    }
                }
            }
        }
    };

    /** collecting all functions of a passed module. */
    protected static final ScopeFunction<Module> COLLECT_FUNCTIONS = new ScopeFunction<Module>() {
        public void collect(final Module m, final List<IEObjectDescription> scopeElems) {
            if (m.getInterface() != null && m.getInterface().getIntFunctionDecls() != null) {
                for (FunctionDecl fd : m.getInterface().getIntFunctionDecls()) {
                    for (Function f : fd.getFunctions()) {
                        scopeElems.add(new EObjectDescription(QualifiedName.create(f.getName()), f,
                                getEmptyMap(String.class)));
                    }
                }
            }
        }
    };

    /** collecting all procedures of a passed module. */
    protected static final ScopeFunction<Module> COLLECT_PROCEDURES = new ScopeFunction<Module>() {
        public void collect(final Module m, final List<IEObjectDescription> scopeElems) {
            if (m.getInterface() != null && m.getInterface().getIntProcedureDecls() != null) {
                for (ProcedureDecl procDecl : m.getInterface().getIntProcedureDecls()) {
                    EList<Procedure> procList = procDecl.getProcedures();
                    for (Procedure proc : procList) {
                        scopeElems.add(new EObjectDescription(QualifiedName.create(proc.getName()),
                                proc, getEmptyMap(String.class)));
                    }
                }
            }
        }
    };

    /** collecting all signals of a passed module. */
    protected static final ScopeFunction<Module> COLLECT_SIGNALS = new ScopeFunction<Module>() {
        public void collect(final Module m, final List<IEObjectDescription> scopeElems) {
            if (m.getInterface() != null && m.getInterface().getIntSignalDecls() != null) {
                for (InterfaceSignalDecl isd : m.getInterface().getIntSignalDecls()) {
                    for (ISignal s : isd.getSignals()) {
                        scopeElems.add(new EObjectDescription(QualifiedName.create(s.getName()), s,
                                getEmptyMap(String.class)));
                    }
                }
            }
        }
    };
    /** collecting all types of a passed module. */
    protected static final ScopeFunction<Module> COLLECT_TYPES = new ScopeFunction<Module>() {
        public void collect(final Module m, final List<IEObjectDescription> scopeElems) {
            if (m.getInterface() != null && m.getInterface().getIntTypeDecls() != null) {
                for (TypeDecl typeDecl : m.getInterface().getIntTypeDecls()) {
                    for (Type type : typeDecl.getTypes()) {
                        scopeElems.add(new EObjectDescription(QualifiedName.create(type.getName()),
                                type, getEmptyMap(String.class)));
                    }
                }
            }
        }
    };
    /** collecting all tasks of a passed module. */
    protected static final ScopeFunction<Module> COLLECT_TASKS = new ScopeFunction<Module>() {
        public void collect(final Module m, final List<IEObjectDescription> scopeElems) {
            if (m.getInterface() != null && m.getInterface().getIntTaskDecls() != null) {
                for (TaskDecl taskDecl : m.getInterface().getIntTaskDecls()) {
                    for (Task task : taskDecl.getTasks()) {
                        scopeElems.add(new EObjectDescription(QualifiedName.create(task.getName()),
                                task, getEmptyMap(String.class)));
                    }
                }
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
    public static List<IEObjectDescription> getAllSignals(final EObject context) {
        List<IEObjectDescription> scopeElems = getAllElements(context, COLLECT_SIGNALS);
        scopeElems.addAll(getLocalSignals(context));
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
    public static List<IEObjectDescription> getElements(final EObject context,
            final ScopeFunction<Module> function) {
        ArrayList<IEObjectDescription> scopeElems = new ArrayList<IEObjectDescription>();
        EObject parent = context.eContainer();
        // get this scope's module interface
        while (!(parent instanceof Module)) {
            parent = parent.eContainer();
        }
        if (((Module) parent).getInterface() != null) {
            function.collect((Module) parent, scopeElems);
        }
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
    public static List<IEObjectDescription> getAllElements(final EObject context,
            final ScopeFunction<Module> function) {

        ArrayList<IEObjectDescription> scopeElems = new ArrayList<IEObjectDescription>();
        EObject parent = context.eContainer();
        // get this scope's module interface
        while (!(parent instanceof Module)) {
            parent = parent.eContainer();
        }
        if (((Module) parent).getInterface() != null) {
            function.collect((Module) parent, scopeElems);
        }
        // collect from possible other modules
        Program p = (Program) ((Module) parent).eContainer();
        for (Module m : p.getModules()) {
            function.collect(m, scopeElems);
        }

        return scopeElems;
    }

    /**
     * collect all local signals of the context up to its parent module.
     * 
     * @param context
     *            context
     * @return list with scope elements
     */
    public static List<IEObjectDescription> getLocalSignals(final EObject context) {
        ArrayList<IEObjectDescription> scopeElems = new ArrayList<IEObjectDescription>();

        EObject parent = context.eContainer();
        // Go up in the Structure until Module/MainModule
        while (!(parent instanceof ModuleBody) && !(parent instanceof Module)) {
            // Get the local signals into the scope
            if (parent instanceof LocalSignalDecl) {
                LocalSignalList localSigList = ((LocalSignalDecl) parent).getSignalList();
                EList<ISignal> signals = ((LocalSignal) localSigList).getSignal();
                for (ISignal s : signals) {
                    scopeElems.add(new EObjectDescription(QualifiedName.create(s.getName()), s,
                            getEmptyMap(String.class)));
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
    public static List<IEObjectDescription> getLocalVariables(final EObject context) {
        ArrayList<IEObjectDescription> scopeElems = new ArrayList<IEObjectDescription>();

        EObject parent = context.eContainer();
        // Go up in the Structure until Module/MainModule
        while (!(parent instanceof ModuleBody) && !(parent instanceof Module)) {
            // Get the local variables into the scope
            if (parent instanceof LocalVariable) {
                InterfaceVariableDecl varDecl = ((LocalVariable) parent).getVar();
                EList<VariableDecl> decl = varDecl.getVarDecls();
                for (VariableDecl vdecl : decl) {
                    for (IVariable varSingle : vdecl.getVariables()) {
                        scopeElems.add(new EObjectDescription(QualifiedName.create(varSingle
                                .getName()), varSingle, getEmptyMap(String.class)));
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
    public static List<IEObjectDescription> getLocalTraps(final EObject context) {
        ArrayList<IEObjectDescription> scopeElems = new ArrayList<IEObjectDescription>();

        EObject parent = context.eContainer();
        // find all Traps
        while (!(parent instanceof ModuleBody) && !(parent instanceof Module)) {
            if (parent instanceof Trap) {
                EList<ISignal> trapDecl = ((Trap) parent).getTrapDeclList().getTrapDecls();
                // add Trap to the scope
                for (ISignal trap : trapDecl) {
                    scopeElems.add(new EObjectDescription(QualifiedName.create(trap.getName()),
                            trap, getEmptyMap(String.class)));
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
    public static List<IEObjectDescription> getModules(final EObject context) {
        ArrayList<IEObjectDescription> scopeElems = new ArrayList<IEObjectDescription>();

        EObject parent = context.eContainer();
        // find all Modules
        while (parent != null) {
            if (parent instanceof Program) {
                Program p = (Program) parent;
                // add Trap to the scope
                for (Module m : p.getModules()) {
                    scopeElems.add(new EObjectDescription(QualifiedName.create(m.getName()), m,
                            getEmptyMap(String.class)));
                }
                break;
            }
            parent = parent.eContainer();
        }

        return scopeElems;
    }

    private static <T> Map<T, T> getEmptyMap(final Class<T> clazz) {
        return Collections.emptyMap();
    }
}
