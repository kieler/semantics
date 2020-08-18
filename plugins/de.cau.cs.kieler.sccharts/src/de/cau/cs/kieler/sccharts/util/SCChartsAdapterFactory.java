/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.util;

import de.cau.cs.kieler.annotations.Annotatable;
import de.cau.cs.kieler.annotations.Nameable;
import de.cau.cs.kieler.annotations.NamedObject;
import de.cau.cs.kieler.annotations.Pragmatable;
import de.cau.cs.kieler.kexpressions.Call;
import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration;
import de.cau.cs.kieler.kexpressions.Schedulable;
import de.cau.cs.kieler.kexpressions.VariableDeclaration;
import de.cau.cs.kieler.kexpressions.keffects.Assignment;
import de.cau.cs.kieler.kexpressions.keffects.Effect;
import de.cau.cs.kieler.kexpressions.keffects.Linkable;
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration;
import de.cau.cs.kieler.kexpressions.kext.DeclarationScope;
import de.cau.cs.kieler.sccharts.*;
import de.cau.cs.kieler.scl.StatementContainer;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage
 * @generated
 */
public class SCChartsAdapterFactory extends AdapterFactoryImpl {
    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";
				/**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SCChartsPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCChartsAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = SCChartsPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SCChartsSwitch<Adapter> modelSwitch =
        new SCChartsSwitch<Adapter>() {
            @Override
            public Adapter caseSCCharts(SCCharts object) {
                return createSCChartsAdapter();
            }
            @Override
            public Adapter caseScope(Scope object) {
                return createScopeAdapter();
            }
            @Override
            public Adapter caseScopeCall(ScopeCall object) {
                return createScopeCallAdapter();
            }
            @Override
            public Adapter caseAction(Action object) {
                return createActionAdapter();
            }
            @Override
            public Adapter caseLocalAction(LocalAction object) {
                return createLocalActionAdapter();
            }
            @Override
            public Adapter caseState(State object) {
                return createStateAdapter();
            }
            @Override
            public Adapter caseRegion(Region object) {
                return createRegionAdapter();
            }
            @Override
            public Adapter caseControlflowRegion(ControlflowRegion object) {
                return createControlflowRegionAdapter();
            }
            @Override
            public Adapter caseDataflowRegion(DataflowRegion object) {
                return createDataflowRegionAdapter();
            }
            @Override
            public Adapter caseTransition(Transition object) {
                return createTransitionAdapter();
            }
            @Override
            public Adapter caseEntryAction(EntryAction object) {
                return createEntryActionAdapter();
            }
            @Override
            public Adapter caseDuringAction(DuringAction object) {
                return createDuringActionAdapter();
            }
            @Override
            public Adapter caseExitAction(ExitAction object) {
                return createExitActionAdapter();
            }
            @Override
            public Adapter caseSuspendAction(SuspendAction object) {
                return createSuspendActionAdapter();
            }
            @Override
            public Adapter casePeriodAction(PeriodAction object) {
                return createPeriodActionAdapter();
            }
            @Override
            public Adapter casePolicyClassDeclaration(PolicyClassDeclaration object) {
                return createPolicyClassDeclarationAdapter();
            }
            @Override
            public Adapter casePolicyRegion(PolicyRegion object) {
                return createPolicyRegionAdapter();
            }
            @Override
            public Adapter caseCodeEffect(CodeEffect object) {
                return createCodeEffectAdapter();
            }
            @Override
            public Adapter caseDataflowAssignment(DataflowAssignment object) {
                return createDataflowAssignmentAdapter();
            }
            @Override
            public Adapter caseGenericTypeScopeCall(GenericTypeScopeCall object) {
                return createGenericTypeScopeCallAdapter();
            }
            @Override
            public Adapter caseGenericTypeParameterDeclaration(GenericTypeParameterDeclaration object) {
                return createGenericTypeParameterDeclarationAdapter();
            }
            @Override
            public Adapter caseGenericTypeParameter(GenericTypeParameter object) {
                return createGenericTypeParameterAdapter();
            }
            @Override
            public Adapter caseParameterizedReferenceDeclaration(ParameterizedReferenceDeclaration object) {
                return createParameterizedReferenceDeclarationAdapter();
            }
            @Override
            public Adapter caseGenericTypeParameterReference(GenericTypeParameterReference object) {
                return createGenericTypeParameterReferenceAdapter();
            }
            @Override
            public Adapter casePragmatable(Pragmatable object) {
                return createPragmatableAdapter();
            }
            @Override
            public Adapter caseNameable(Nameable object) {
                return createNameableAdapter();
            }
            @Override
            public Adapter caseAnnotatable(Annotatable object) {
                return createAnnotatableAdapter();
            }
            @Override
            public Adapter caseDeclarationScope(DeclarationScope object) {
                return createDeclarationScopeAdapter();
            }
            @Override
            public Adapter caseNamedObject(NamedObject object) {
                return createNamedObjectAdapter();
            }
            @Override
            public Adapter caseSchedulable(Schedulable object) {
                return createSchedulableAdapter();
            }
            @Override
            public Adapter caseLinkable(Linkable object) {
                return createLinkableAdapter();
            }
            @Override
            public Adapter caseExpression(Expression object) {
                return createExpressionAdapter();
            }
            @Override
            public Adapter caseCall(Call object) {
                return createCallAdapter();
            }
            @Override
            public Adapter caseDeclaration(Declaration object) {
                return createDeclarationAdapter();
            }
            @Override
            public Adapter caseVariableDeclaration(VariableDeclaration object) {
                return createVariableDeclarationAdapter();
            }
            @Override
            public Adapter caseClassDeclaration(ClassDeclaration object) {
                return createClassDeclarationAdapter();
            }
            @Override
            public Adapter caseEffect(Effect object) {
                return createEffectAdapter();
            }
            @Override
            public Adapter caseStatementContainer(StatementContainer object) {
                return createStatementContainerAdapter();
            }
            @Override
            public Adapter caseSCL_Scope(de.cau.cs.kieler.scl.Scope object) {
                return createSCL_ScopeAdapter();
            }
            @Override
            public Adapter caseAssignment(Assignment object) {
                return createAssignmentAdapter();
            }
            @Override
            public Adapter caseReferenceDeclaration(ReferenceDeclaration object) {
                return createReferenceDeclarationAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.Action <em>Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.Action
     * @generated
     */
    public Adapter createActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.State <em>State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.State
     * @generated
     */
    public Adapter createStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.Region <em>Region</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.Region
     * @generated
     */
    public Adapter createRegionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.ControlflowRegion <em>Controlflow Region</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.ControlflowRegion
     * @generated
     */
    public Adapter createControlflowRegionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.DataflowRegion <em>Dataflow Region</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.DataflowRegion
     * @generated
     */
    public Adapter createDataflowRegionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.Transition <em>Transition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.Transition
     * @generated
     */
    public Adapter createTransitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.Scope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.Scope
     * @generated
     */
    public Adapter createScopeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.ScopeCall <em>Scope Call</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.ScopeCall
     * @generated
     */
    public Adapter createScopeCallAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.GenericTypeParameterDeclaration <em>Generic Type Parameter Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.GenericTypeParameterDeclaration
     * @generated
     */
    public Adapter createGenericTypeParameterDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.GenericTypeParameter <em>Generic Type Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.GenericTypeParameter
     * @generated
     */
    public Adapter createGenericTypeParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.ParameterizedReferenceDeclaration <em>Parameterized Reference Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.ParameterizedReferenceDeclaration
     * @generated
     */
    public Adapter createParameterizedReferenceDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.GenericTypeParameterReference <em>Generic Type Parameter Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.GenericTypeParameterReference
     * @generated
     */
    public Adapter createGenericTypeParameterReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.LocalAction <em>Local Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.LocalAction
     * @generated
     */
    public Adapter createLocalActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.EntryAction <em>Entry Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.EntryAction
     * @generated
     */
    public Adapter createEntryActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.DuringAction <em>During Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.DuringAction
     * @generated
     */
    public Adapter createDuringActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.ExitAction <em>Exit Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.ExitAction
     * @generated
     */
    public Adapter createExitActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.SuspendAction <em>Suspend Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.SuspendAction
     * @generated
     */
    public Adapter createSuspendActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.PeriodAction <em>Period Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.PeriodAction
     * @generated
     */
    public Adapter createPeriodActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.PolicyClassDeclaration <em>Policy Class Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.PolicyClassDeclaration
     * @generated
     */
    public Adapter createPolicyClassDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kexpressions.kext.ClassDeclaration <em>Class Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
     * @generated
     */
    public Adapter createClassDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kexpressions.keffects.Effect <em>Effect</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.kexpressions.keffects.Effect
     * @generated
     */
    public Adapter createEffectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.StatementContainer <em>Statement Container</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.StatementContainer
     * @generated
     */
    public Adapter createStatementContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.Scope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.Scope
     * @generated
     */
    public Adapter createSCL_ScopeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kexpressions.keffects.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.kexpressions.keffects.Assignment
     * @generated
     */
    public Adapter createAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.PolicyRegion <em>Policy Region</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.PolicyRegion
     * @generated
     */
    public Adapter createPolicyRegionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.CodeEffect <em>Code Effect</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.CodeEffect
     * @generated
     */
    public Adapter createCodeEffectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.DataflowAssignment <em>Dataflow Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.DataflowAssignment
     * @generated
     */
    public Adapter createDataflowAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.GenericTypeScopeCall <em>Generic Type Scope Call</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.GenericTypeScopeCall
     * @generated
     */
    public Adapter createGenericTypeScopeCallAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.annotations.Pragmatable <em>Pragmatable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.annotations.Pragmatable
     * @generated
     */
    public Adapter createPragmatableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.sccharts.SCCharts <em>SC Charts</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.sccharts.SCCharts
     * @generated
     */
	public Adapter createSCChartsAdapter() {
        return null;
    }

				/**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.annotations.Annotatable <em>Annotatable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.annotations.Annotatable
     * @generated
     */
    public Adapter createAnnotatableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kexpressions.kext.DeclarationScope <em>Declaration Scope</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.kexpressions.kext.DeclarationScope
     * @generated
     */
    public Adapter createDeclarationScopeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.annotations.Nameable <em>Nameable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.annotations.Nameable
     * @generated
     */
    public Adapter createNameableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.annotations.NamedObject <em>Named Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.annotations.NamedObject
     * @generated
     */
    public Adapter createNamedObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kexpressions.Schedulable <em>Schedulable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.kexpressions.Schedulable
     * @generated
     */
    public Adapter createSchedulableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kexpressions.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.kexpressions.Expression
     * @generated
     */
    public Adapter createExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kexpressions.Call <em>Call</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.kexpressions.Call
     * @generated
     */
    public Adapter createCallAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kexpressions.Declaration <em>Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.kexpressions.Declaration
     * @generated
     */
    public Adapter createDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kexpressions.ReferenceDeclaration <em>Reference Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.kexpressions.ReferenceDeclaration
     * @generated
     */
    public Adapter createReferenceDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kexpressions.VariableDeclaration <em>Variable Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.kexpressions.VariableDeclaration
     * @generated
     */
    public Adapter createVariableDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kexpressions.keffects.Linkable <em>Linkable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.kexpressions.keffects.Linkable
     * @generated
     */
    public Adapter createLinkableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //SCChartsAdapterFactory
