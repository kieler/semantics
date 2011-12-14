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

import static de.cau.cs.kieler.kies.scoping.EsterelScopeProviderUtil.*;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference;
import de.cau.cs.kieler.kies.esterel.ConstantExpression;
import de.cau.cs.kieler.kies.esterel.ConstantRenaming;
import de.cau.cs.kieler.kies.esterel.Emit;
import de.cau.cs.kieler.kies.esterel.Exit;
import de.cau.cs.kieler.kies.esterel.FunctionExpression;
import de.cau.cs.kieler.kies.esterel.FunctionRenaming;
import de.cau.cs.kieler.kies.esterel.ModuleRenaming;
import de.cau.cs.kieler.kies.esterel.ProcedureRenaming;
import de.cau.cs.kieler.kies.esterel.RelationImplication;
import de.cau.cs.kieler.kies.esterel.RelationIncompatibility;
import de.cau.cs.kieler.kies.esterel.SignalRenaming;
import de.cau.cs.kieler.kies.esterel.Sustain;
import de.cau.cs.kieler.kies.esterel.TaskRenaming;
import de.cau.cs.kieler.kies.esterel.TrapReferenceExpr;
import de.cau.cs.kieler.kies.esterel.TypeRenaming;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on how and when to use
 * it
 * 
 * Every method within this class is called by xtext via Java Reflections. The name of each method
 * holds the rule and the attribute for which the scope provider is called. All methods used to fill
 * the scope are declared and described further in {{@link #EsterelScopeProviderUtil()}. Overall the
 * functionality of those methods can be derived by their name.
 * 
 * @author uru
 */
public class EsterelScopeProvider extends AbstractDeclarativeScopeProvider {

    // CHECKSTYLEOFF JavadocMethod - see class description
    // CHECKSTYLEOFF MethodName - java reflections demand those names

    /**
     * {@inheritDoc}
     */
    @Override
    public IScope getScope(final EObject context, final EReference reference) {
        return super.getScope(context, reference);
    }

    /* ************************************************************************
     * Scopes for references in one module
     * ************************************************************************
     */

    public IScope scope_RelationImplication_first(final RelationImplication context,
            final EReference ref) {
        return new SimpleScope(getElements(context, COLLECT_SIGNALS));
    }

    public IScope scope_RelationImplication_second(final RelationImplication context,
            final EReference ref) {
        return new SimpleScope(getElements(context, COLLECT_SIGNALS));
    }

    public IScope scope_RelationIncompatibility_incomp(final RelationIncompatibility context,
            final EReference ref) {
        return new SimpleScope(getElements(context, COLLECT_SIGNALS));
    }

    public IScope scope_Emit_signal(final Emit context, final EReference ref) {
        return new SimpleScope(getAllSignals(context));
    }

    public IScope scope_Sustain_signal(final Sustain context, final EReference ref) {
        return new SimpleScope(getAllSignals(context));
    }

    public IScope scope_ValuedObjectReference_valuedObject(final ValuedObjectReference context,
            final EReference ref) {
        ArrayList<IEObjectDescription> scopeElems = new ArrayList<IEObjectDescription>();
        // there are several elements which are scoped as valued object
        scopeElems.addAll(getLocalSignals(context));
        scopeElems.addAll(getLocalVariables(context));
        scopeElems.addAll(getLocalTraps(context));
        scopeElems.addAll(getAllElements(context,
                COLLECT_CONSTANTS.merge(COLLECT_SENSORS).merge(COLLECT_SIGNALS)));
        return new SimpleScope(scopeElems);
    }

    public IScope scope_TrapReferenceExpr_valuedObject(final TrapReferenceExpr context,
            final EReference ref) {
        return new SimpleScope(getLocalTraps(context));
    }

    public IScope scope_Exit_trap(final Exit context, final EReference ref) {
        return new SimpleScope(getLocalTraps(context));
    }

    public IScope scope_FunctionExpression_function(final FunctionExpression context,
            final EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_FUNCTIONS));
    }

    public IScope scope_DataConstant_constant(final ConstantExpression context, final EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_CONSTANTS));
    }

    /* ************************************************************************
     * ********* Scopes for renaming
     */

    public IScope scope_SignalRenaming_oldName(final SignalRenaming context, final EReference ref) {
        List<IEObjectDescription> scopeElems = getAllSignals(context);
        // sensors are treated as signals
        scopeElems.addAll(getAllElements(context, COLLECT_SENSORS));
        return new SimpleScope(scopeElems);
    }

    public IScope scope_SignalRenaming_newName(final SignalRenaming context, final EReference ref) {
        List<IEObjectDescription> scopeElems = getAllSignals(context);
        // sensors are treated as signals
        scopeElems.addAll(getAllElements(context, COLLECT_SENSORS));
        return new SimpleScope(scopeElems);
    }

    public IScope scope_ConstantRenaming_oldName(final ConstantRenaming context,
            final EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_CONSTANTS));
    }

    public IScope scope_ConstantRenaming_newName(final ConstantRenaming context,
            final EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_CONSTANTS));
    }

    public IScope scope_TypeRenaming_oldName(final TypeRenaming context, final EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_TYPES));
    }

    public IScope scope_TypeRenaming_newName(final TypeRenaming context, final EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_TYPES));
    }

    public IScope scope_FunctionRenaming_oldName(final FunctionRenaming context,
            final EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_FUNCTIONS));
    }

    public IScope scope_FunctionRenaming_newName(final FunctionRenaming context,
            final EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_FUNCTIONS));
    }

    public IScope scope_ProcedureRenaming_oldName(final ProcedureRenaming context,
            final EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_PROCEDURES));
    }

    public IScope scope_ProcedureRenaming_newName(final ProcedureRenaming context,
            final EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_PROCEDURES));
    }

    public IScope scope_TaskRenaming_oldName(final TaskRenaming context, final EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_TASKS));
    }

    public IScope scope_TaskRenaming_newName(final TaskRenaming context, final EReference ref) {
        return new SimpleScope(getAllElements(context, COLLECT_TASKS));
    }

    public IScope scope_ModuleRenaming_module(final ModuleRenaming context, final EReference ref) {
        return new SimpleScope(getModules(context));
    }

}
