/**
 */
package de.cau.cs.kieler.scl.util;

import de.cau.cs.kieler.annotations.Annotatable;
import de.cau.cs.kieler.annotations.Nameable;
import de.cau.cs.kieler.annotations.NamedObject;
import de.cau.cs.kieler.annotations.Pragmatable;

import de.cau.cs.kieler.kexpressions.Call;
import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.MethodDeclaration;
import de.cau.cs.kieler.kexpressions.Schedulable;

import de.cau.cs.kieler.kexpressions.keffects.Effect;
import de.cau.cs.kieler.kexpressions.keffects.Linkable;

import de.cau.cs.kieler.kexpressions.kext.DeclarationScope;

import de.cau.cs.kieler.scl.Assignment;
import de.cau.cs.kieler.scl.Conditional;
import de.cau.cs.kieler.scl.ElseScope;
import de.cau.cs.kieler.scl.Goto;
import de.cau.cs.kieler.scl.Label;
import de.cau.cs.kieler.scl.Loop;
import de.cau.cs.kieler.scl.MethodImplementationDeclaration;
import de.cau.cs.kieler.scl.ModuleCall;
import de.cau.cs.kieler.scl.Parallel;
import de.cau.cs.kieler.scl.Pause;
import de.cau.cs.kieler.scl.Return;
import de.cau.cs.kieler.scl.SCLPackage;
import de.cau.cs.kieler.scl.SCLProgram;
import de.cau.cs.kieler.scl.Scope;
import de.cau.cs.kieler.scl.ScopeStatement;
import de.cau.cs.kieler.scl.SequencePart;
import de.cau.cs.kieler.scl.Statement;
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
 * @see de.cau.cs.kieler.scl.SCLPackage
 * @generated
 */
public class SCLAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SCLPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCLAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = SCLPackage.eINSTANCE;
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
    protected SCLSwitch<Adapter> modelSwitch =
        new SCLSwitch<Adapter>() {
            @Override
            public Adapter caseSCLProgram(SCLProgram object) {
                return createSCLProgramAdapter();
            }
            @Override
            public Adapter caseModule(de.cau.cs.kieler.scl.Module object) {
                return createModuleAdapter();
            }
            @Override
            public Adapter caseStatement(Statement object) {
                return createStatementAdapter();
            }
            @Override
            public Adapter caseStatementContainer(StatementContainer object) {
                return createStatementContainerAdapter();
            }
            @Override
            public Adapter caseScope(Scope object) {
                return createScopeAdapter();
            }
            @Override
            public Adapter casePause(Pause object) {
                return createPauseAdapter();
            }
            @Override
            public Adapter caseLabel(Label object) {
                return createLabelAdapter();
            }
            @Override
            public Adapter caseGoto(Goto object) {
                return createGotoAdapter();
            }
            @Override
            public Adapter caseAssignment(Assignment object) {
                return createAssignmentAdapter();
            }
            @Override
            public Adapter caseConditional(Conditional object) {
                return createConditionalAdapter();
            }
            @Override
            public Adapter caseParallel(Parallel object) {
                return createParallelAdapter();
            }
            @Override
            public Adapter caseModuleCall(ModuleCall object) {
                return createModuleCallAdapter();
            }
            @Override
            public Adapter caseThread(de.cau.cs.kieler.scl.Thread object) {
                return createThreadAdapter();
            }
            @Override
            public Adapter caseScopeStatement(ScopeStatement object) {
                return createScopeStatementAdapter();
            }
            @Override
            public Adapter caseElseScope(ElseScope object) {
                return createElseScopeAdapter();
            }
            @Override
            public Adapter caseSequencePart(SequencePart object) {
                return createSequencePartAdapter();
            }
            @Override
            public Adapter caseReturn(Return object) {
                return createReturnAdapter();
            }
            @Override
            public Adapter caseMethodImplementationDeclaration(MethodImplementationDeclaration object) {
                return createMethodImplementationDeclarationAdapter();
            }
            @Override
            public Adapter caseLoop(Loop object) {
                return createLoopAdapter();
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
            public Adapter caseEffect(Effect object) {
                return createEffectAdapter();
            }
            @Override
            public Adapter caseKEffects_Assignment(de.cau.cs.kieler.kexpressions.keffects.Assignment object) {
                return createKEffects_AssignmentAdapter();
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
            public Adapter caseMethodDeclaration(MethodDeclaration object) {
                return createMethodDeclarationAdapter();
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
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.SCLProgram <em>Program</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.SCLProgram
     * @generated
     */
    public Adapter createSCLProgramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.Module <em>Module</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.Module
     * @generated
     */
    public Adapter createModuleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.Statement <em>Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.Statement
     * @generated
     */
    public Adapter createStatementAdapter() {
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
    public Adapter createScopeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.Pause <em>Pause</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.Pause
     * @generated
     */
    public Adapter createPauseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.Label <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.Label
     * @generated
     */
    public Adapter createLabelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.Goto <em>Goto</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.Goto
     * @generated
     */
    public Adapter createGotoAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.Assignment
     * @generated
     */
    public Adapter createAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.Conditional <em>Conditional</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.Conditional
     * @generated
     */
    public Adapter createConditionalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.Parallel <em>Parallel</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.Parallel
     * @generated
     */
    public Adapter createParallelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.ModuleCall <em>Module Call</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.ModuleCall
     * @generated
     */
    public Adapter createModuleCallAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.Thread <em>Thread</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.Thread
     * @generated
     */
    public Adapter createThreadAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.ScopeStatement <em>Scope Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.ScopeStatement
     * @generated
     */
    public Adapter createScopeStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.ElseScope <em>Else Scope</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.ElseScope
     * @generated
     */
    public Adapter createElseScopeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.SequencePart <em>Sequence Part</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.SequencePart
     * @generated
     */
    public Adapter createSequencePartAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.Return <em>Return</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.Return
     * @generated
     */
    public Adapter createReturnAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.MethodImplementationDeclaration <em>Method Implementation Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.MethodImplementationDeclaration
     * @generated
     */
    public Adapter createMethodImplementationDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scl.Loop <em>Loop</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scl.Loop
     * @generated
     */
    public Adapter createLoopAdapter() {
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
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kexpressions.keffects.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.kexpressions.keffects.Assignment
     * @generated
     */
    public Adapter createKEffects_AssignmentAdapter() {
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
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kexpressions.MethodDeclaration <em>Method Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.kexpressions.MethodDeclaration
     * @generated
     */
    public Adapter createMethodDeclarationAdapter() {
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

} //SCLAdapterFactory
