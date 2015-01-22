/**
 */
package de.cau.cs.kieler.scgprios.util;

import de.cau.cs.kieler.core.annotations.Annotatable;

import de.cau.cs.kieler.scgprios.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage
 * @generated
 */
public class ScgpriosAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ScgpriosPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScgpriosAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ScgpriosPackage.eINSTANCE;
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
    protected ScgpriosSwitch<Adapter> modelSwitch =
        new ScgpriosSwitch<Adapter>() {
            @Override
            public Adapter caseSCGraph_P(SCGraph_P object) {
                return createSCGraph_PAdapter();
            }
            @Override
            public Adapter caseNode_P(Node_P object) {
                return createNode_PAdapter();
            }
            @Override
            public Adapter caseConditional_P(Conditional_P object) {
                return createConditional_PAdapter();
            }
            @Override
            public Adapter caseSurface_P(Surface_P object) {
                return createSurface_PAdapter();
            }
            @Override
            public Adapter caseDepth_P(Depth_P object) {
                return createDepth_PAdapter();
            }
            @Override
            public Adapter caseAssignment_P(Assignment_P object) {
                return createAssignment_PAdapter();
            }
            @Override
            public Adapter caseFork_P(Fork_P object) {
                return createFork_PAdapter();
            }
            @Override
            public Adapter caseJoin_P(Join_P object) {
                return createJoin_PAdapter();
            }
            @Override
            public Adapter caseLink_P(Link_P object) {
                return createLink_PAdapter();
            }
            @Override
            public Adapter caseEntry_P(Entry_P object) {
                return createEntry_PAdapter();
            }
            @Override
            public Adapter caseExit_P(Exit_P object) {
                return createExit_PAdapter();
            }
            @Override
            public Adapter caseControlFlow_P(ControlFlow_P object) {
                return createControlFlow_PAdapter();
            }
            @Override
            public Adapter caseDependency_P(Dependency_P object) {
                return createDependency_PAdapter();
            }
            @Override
            public Adapter caseAbsoluteWrite_Read_P(AbsoluteWrite_Read_P object) {
                return createAbsoluteWrite_Read_PAdapter();
            }
            @Override
            public Adapter caseRelativeWrite_Read_P(RelativeWrite_Read_P object) {
                return createRelativeWrite_Read_PAdapter();
            }
            @Override
            public Adapter caseAbsoluteWrite_RelativeWrite_P(AbsoluteWrite_RelativeWrite_P object) {
                return createAbsoluteWrite_RelativeWrite_PAdapter();
            }
            @Override
            public Adapter caseWrite_Write_P(Write_Write_P object) {
                return createWrite_Write_PAdapter();
            }
            @Override
            public Adapter caseBasicBlock_P(BasicBlock_P object) {
                return createBasicBlock_PAdapter();
            }
            @Override
            public Adapter caseSchedulingBlock_P(SchedulingBlock_P object) {
                return createSchedulingBlock_PAdapter();
            }
            @Override
            public Adapter casePredecessor_P(Predecessor_P object) {
                return createPredecessor_PAdapter();
            }
            @Override
            public Adapter caseSchedule_P(Schedule_P object) {
                return createSchedule_PAdapter();
            }
            @Override
            public Adapter caseScheduledBlock_P(ScheduledBlock_P object) {
                return createScheduledBlock_PAdapter();
            }
            @Override
            public Adapter caseGuard_P(Guard_P object) {
                return createGuard_PAdapter();
            }
            @Override
            public Adapter caseAnnotatable(Annotatable object) {
                return createAnnotatableAdapter();
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
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.SCGraph_P <em>SC Graph P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.SCGraph_P
     * @generated
     */
    public Adapter createSCGraph_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.Node_P <em>Node P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.Node_P
     * @generated
     */
    public Adapter createNode_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.Conditional_P <em>Conditional P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.Conditional_P
     * @generated
     */
    public Adapter createConditional_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.Surface_P <em>Surface P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.Surface_P
     * @generated
     */
    public Adapter createSurface_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.Depth_P <em>Depth P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.Depth_P
     * @generated
     */
    public Adapter createDepth_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.Assignment_P <em>Assignment P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.Assignment_P
     * @generated
     */
    public Adapter createAssignment_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.Fork_P <em>Fork P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.Fork_P
     * @generated
     */
    public Adapter createFork_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.Join_P <em>Join P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.Join_P
     * @generated
     */
    public Adapter createJoin_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.Link_P <em>Link P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.Link_P
     * @generated
     */
    public Adapter createLink_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.Entry_P <em>Entry P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.Entry_P
     * @generated
     */
    public Adapter createEntry_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.Exit_P <em>Exit P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.Exit_P
     * @generated
     */
    public Adapter createExit_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.ControlFlow_P <em>Control Flow P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.ControlFlow_P
     * @generated
     */
    public Adapter createControlFlow_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.Dependency_P <em>Dependency P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.Dependency_P
     * @generated
     */
    public Adapter createDependency_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.AbsoluteWrite_Read_P <em>Absolute Write Read P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.AbsoluteWrite_Read_P
     * @generated
     */
    public Adapter createAbsoluteWrite_Read_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.RelativeWrite_Read_P <em>Relative Write Read P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.RelativeWrite_Read_P
     * @generated
     */
    public Adapter createRelativeWrite_Read_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.AbsoluteWrite_RelativeWrite_P <em>Absolute Write Relative Write P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.AbsoluteWrite_RelativeWrite_P
     * @generated
     */
    public Adapter createAbsoluteWrite_RelativeWrite_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.Write_Write_P <em>Write Write P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.Write_Write_P
     * @generated
     */
    public Adapter createWrite_Write_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.BasicBlock_P <em>Basic Block P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.BasicBlock_P
     * @generated
     */
    public Adapter createBasicBlock_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.SchedulingBlock_P <em>Scheduling Block P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.SchedulingBlock_P
     * @generated
     */
    public Adapter createSchedulingBlock_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.Predecessor_P <em>Predecessor P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.Predecessor_P
     * @generated
     */
    public Adapter createPredecessor_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.Schedule_P <em>Schedule P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.Schedule_P
     * @generated
     */
    public Adapter createSchedule_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.ScheduledBlock_P <em>Scheduled Block P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.ScheduledBlock_P
     * @generated
     */
    public Adapter createScheduledBlock_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgprios.Guard_P <em>Guard P</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.scgprios.Guard_P
     * @generated
     */
    public Adapter createGuard_PAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.annotations.Annotatable <em>Annotatable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.annotations.Annotatable
     * @generated
     */
    public Adapter createAnnotatableAdapter() {
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

} //ScgpriosAdapterFactory
