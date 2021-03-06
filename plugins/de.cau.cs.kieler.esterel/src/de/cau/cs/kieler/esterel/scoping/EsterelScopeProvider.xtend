/*
 * generated by Xtext
 */
package de.cau.cs.kieler.esterel.scoping

import com.google.common.base.Predicate
import de.cau.cs.kieler.esterel.ConstantExpression
import de.cau.cs.kieler.esterel.ConstantRenaming
import de.cau.cs.kieler.esterel.Emit
import de.cau.cs.kieler.esterel.EsterelFunctionCall
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.Exit
import de.cau.cs.kieler.esterel.FunctionRenaming
import de.cau.cs.kieler.esterel.ModuleRenaming
import de.cau.cs.kieler.esterel.ProcedureRenaming
import de.cau.cs.kieler.esterel.RelationImplication
import de.cau.cs.kieler.esterel.RelationIncompatibility
import de.cau.cs.kieler.esterel.Run
import de.cau.cs.kieler.esterel.SignalReference
import de.cau.cs.kieler.esterel.SignalRenaming
import de.cau.cs.kieler.esterel.Sustain
import de.cau.cs.kieler.esterel.TaskRenaming
import de.cau.cs.kieler.esterel.TrapExpression
import de.cau.cs.kieler.esterel.TrapReference
import de.cau.cs.kieler.esterel.TypeRenaming
import de.cau.cs.kieler.esterel.VariableReference
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scl.scoping.SCLScopeProvider
import java.lang.reflect.Method
import java.util.ArrayList
import java.util.Collections
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.eclipse.xtext.util.PolymorphicDispatcher

import static de.cau.cs.kieler.esterel.scoping.EsterelScopeProviderUtil.*
import org.eclipse.emf.ecore.EClass

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 * 
 */
class EsterelScopeProvider extends SCLScopeProvider {

    /**
     * {@inheritDoc}
     */
    override getScope(EObject context, EReference reference) {
        var IScope scope
        if (context.eContainer instanceof SignalRenaming && context.eContainmentFeature.name.equals("oldName")) {
            return context.eContainer.getScope(context.eContainmentFeature)
        }
        switch (context) {
            SignalReference : {
                if ( (context.eContainer instanceof OperatorExpression) && 
                     (context.eContainer as OperatorExpression).operator === OperatorType.VAL) {
                     scope = new SimpleScope(getSignalsAndSensors(context))
                }
                else if (context.eContainer instanceof SignalRenaming) {
                    scope = new SimpleScope(getSignalsAndSensors(context))
                }
                else {
                    scope = new SimpleScope(getAllSignals(context))
                }
            }   
            TrapReference ,
            TrapExpression : {
                scope = new SimpleScope(getLocalTraps(context))
            }
            VariableReference : {
                scope = new SimpleScope(getLocalVariables(context))
            }
            ValuedObjectReference : {
                scope = new SimpleScope(getValuedObjects(context))
            }
            default : {
                scope = polymorphicFindScopeForReferenceName(context, reference);
            }
        }
        if (scope === null) {
            scope = polymorphicFindScopeForClassName(context, reference);
            if (scope === null) {
                return super.getScope(context, reference);
            }
        }
        return scope
    }

    /* ************************************************************************
     * Scopes for references in one module
     * ************************************************************************
     */
    def IScope scope_RelationImplication_first(RelationImplication context, EReference ref) {
        return new SimpleScope(getElements(context, COLLECT_SIGNALS));
    }

    def IScope scope_RelationImplication_second(RelationImplication context, EReference ref) {
        return new SimpleScope(getElements(context, COLLECT_SIGNALS));
    }

    def IScope scope_RelationIncompatibility_incomp(RelationIncompatibility context, EReference ref) {
        return new SimpleScope(getElements(context, COLLECT_SIGNALS));
    }

    def IScope scope_Emit_signal(Emit context, EReference ref) {
        return new SimpleScope(getAllSignals(context));
    }

    def IScope scope_Sustain_signal(Sustain context, EReference ref) {
        return new SimpleScope(getAllSignals(context));
    }
    
    def IScope scope_ValuedObjectReference_valuedObject(ValuedObjectReference context, EReference ref) {
        var ArrayList<IEObjectDescription> scopeElems = new ArrayList<IEObjectDescription>();
        // there are several elements which are scoped as valued object
        scopeElems.addAll(getLocalSignals(context));
        scopeElems.addAll(getLocalVariables(context));
        scopeElems.addAll(getLocalTraps(context));
        scopeElems.addAll(getAllElements(context, COLLECT_CONSTANTS))
        scopeElems.addAll(getAllElements(context, COLLECT_SENSORS))
        scopeElems.addAll(getAllElements(context, COLLECT_SIGNALS))
        return new SimpleScope(scopeElems);
    }

    def IScope scope_TrapReferenceExpr_valuedObject(TrapReference context, EReference ref) {
        return new SimpleScope(getLocalTraps(context));
    }

    def IScope scope_Exit_trap(Exit context, EReference ref) {
        return new SimpleScope(getLocalTraps(context));
    }

    def IScope scope_EsterelFunctionCall_function(EsterelFunctionCall context, EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_FUNCTIONS));
    }

    def IScope scope_DataConstant_constant(ConstantExpression context, EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_CONSTANTS));
    }

    /* ************************************************************************
     * ********* Scopes for renaming
     */
    def IScope scope_SignalRenaming_oldName(SignalRenaming context, EReference ref) {
        val run = context.eContainer?.eContainer
        if (run instanceof Run) {
            if (run.module !== null && run.module.module !== null) {
                var scopeElems = getAllElements(run.module.module, COLLECT_SIGNALS)
                // sensors are treated as signals
                scopeElems.addAll(getAllElements(run.module.module, COLLECT_SENSORS))
                return new SimpleScope(scopeElems)
            }
        }
        return IScope.NULLSCOPE
    }

    def IScope scope_ConstantRenaming_oldName(ConstantRenaming context, EReference ref) {
        val run = context.eContainer?.eContainer
        if (run instanceof Run) {
            if (run.module !== null && run.module.module !== null) {
                return new SimpleScope(getAllElements(run.module.module, COLLECT_CONSTANTS));
            }
        }
        return IScope.NULLSCOPE
    }

    def IScope scope_ConstantRenaming_newName(ConstantRenaming context, EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_CONSTANTS));
    }

    def IScope scope_TypeRenaming_oldName(TypeRenaming context, EReference ref) {
        val run = context.eContainer?.eContainer
        if (run instanceof Run) {
            if (run.module !== null && run.module.module !== null) {
                return new SimpleScope(getAllElements(run.module.module, COLLECT_TYPES));
            }
        }
        return IScope.NULLSCOPE
    }

    def IScope scope_TypeRenaming_newName(TypeRenaming context, EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_TYPES));
    }

    def IScope scope_FunctionRenaming_oldName(FunctionRenaming context, EReference ref) {
        val run = context.eContainer?.eContainer
        if (run instanceof Run) {
            if (run.module !== null && run.module.module !== null) {
                return new SimpleScope(getAllElements(run.module.module, COLLECT_FUNCTIONS));
            }
        }
        return IScope.NULLSCOPE
    }

    def IScope scope_FunctionRenaming_newName(FunctionRenaming context, EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_FUNCTIONS));
    }

    def IScope scope_ProcedureRenaming_oldName(ProcedureRenaming context, EReference ref) {
        val run = context.eContainer?.eContainer
        if (run instanceof Run) {
            if (run.module !== null && run.module.module !== null) {
                return new SimpleScope(getAllElements(run.module.module, COLLECT_PROCEDURES));
            }
        }
        return IScope.NULLSCOPE
    }

    def IScope scope_ProcedureRenaming_newName(ProcedureRenaming context, EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_PROCEDURES));
    }

    def IScope scope_TaskRenaming_oldName(TaskRenaming context, EReference ref) {
        val run = context.eContainer?.eContainer
        if (run instanceof Run) {
            if (run.module !== null && run.module.module !== null) {
                return new SimpleScope(getAllElements(run.module.module, COLLECT_TASKS));
            }
        }
        return IScope.NULLSCOPE
    }

    def IScope scope_TaskRenaming_newName(TaskRenaming context, EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_TASKS));
    }

    def IScope scope_ModuleRenaming_module(ModuleRenaming context, EReference ref) {
        val res = context.eResource
        if (res !== null) {
            val resSet = res.resourceSet
            if (resSet !== null && resSet.resources.size > 1) {
                val modules = <IEObjectDescription>newLinkedList
                modules.addAll(getAllModules(context))
                for (r : resSet.resources.filter[it !== res]) {
                    for (content : r.contents.filter(EsterelProgram)) {
                        modules.addAll(getAllModules(content))
                    }
                }
                return new SimpleScope(modules);
            }
        }
        return new SimpleScope(getAllModules(context));
    }
    
    // ------------------------------------------
    // HELPER
    // ------------------------------------------
    
    private val PolymorphicDispatcher.ErrorHandler<IScope> errorHandler = new PolymorphicDispatcher.NullErrorHandler<IScope>();
    
    protected def IScope polymorphicFindScopeForClassName(EObject context, EReference reference) {
        var IScope scope = null;
        var PolymorphicDispatcher<IScope> dispatcher = new PolymorphicDispatcher<IScope>(
                Collections.singletonList(this), 
                getPredicate(context, reference.getEReferenceType()),
                errorHandler) {
            override IScope handleNoSuchMethod(Object... params) {
                if (PolymorphicDispatcher.NullErrorHandler.equals(errorHandler.getClass()))
                    return null;
                return super.handleNoSuchMethod(params);
            }
        };
        var EObject current = context;
        while (scope === null && current !== null) {
            scope = dispatcher.invoke(current, reference);
            current = current.eContainer();
        }
        current = context;
        while (scope === null && current !== null) {
            scope = dispatcher.invoke(current, reference.getEReferenceType());
            current = current.eContainer();
        }
        return scope;
    }

    protected def IScope polymorphicFindScopeForReferenceName(EObject context, EReference reference) {
        var Predicate<Method> predicate = getPredicate(context, reference);
        var PolymorphicDispatcher<IScope> dispatcher = new PolymorphicDispatcher<IScope>(Collections
                .singletonList(this), predicate, errorHandler) {
            override IScope handleNoSuchMethod(Object... params) {
                if (PolymorphicDispatcher.NullErrorHandler.equals(errorHandler.getClass()))
                    return null;
                return super.handleNoSuchMethod(params);
            }
        };
        var EObject current = context;
        var IScope scope = null;
        while (scope === null && current !== null) {
            scope = dispatcher.invoke(current, reference);
            current = current.eContainer();
        }
        return scope;
    }
    
    protected def Predicate<Method> getPredicate(EObject context, EClass type) {
        val String methodName = "scope_" + type.getName();
        return PolymorphicDispatcher.Predicates.forName(methodName, 2);
    }

    protected def Predicate<Method> getPredicate(EObject context, EReference reference) {
        val String methodName = "scope_" + reference.getEContainingClass().getName() + "_" + reference.getName();
        return PolymorphicDispatcher.Predicates.forName(methodName, 2);
    }
    
    

}
