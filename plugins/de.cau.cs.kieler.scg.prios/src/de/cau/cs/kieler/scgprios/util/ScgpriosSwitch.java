/**
 */
package de.cau.cs.kieler.scgprios.util;

import de.cau.cs.kieler.core.annotations.Annotatable;

import de.cau.cs.kieler.scgprios.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage
 * @generated
 */
public class ScgpriosSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ScgpriosPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScgpriosSwitch() {
        if (modelPackage == null) {
            modelPackage = ScgpriosPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case ScgpriosPackage.SC_GRAPH_P: {
                SCGraph_P scGraph_P = (SCGraph_P)theEObject;
                T result = caseSCGraph_P(scGraph_P);
                if (result == null) result = caseAnnotatable(scGraph_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.NODE_P: {
                Node_P node_P = (Node_P)theEObject;
                T result = caseNode_P(node_P);
                if (result == null) result = caseAnnotatable(node_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.CONDITIONAL_P: {
                Conditional_P conditional_P = (Conditional_P)theEObject;
                T result = caseConditional_P(conditional_P);
                if (result == null) result = caseNode_P(conditional_P);
                if (result == null) result = caseAnnotatable(conditional_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.SURFACE_P: {
                Surface_P surface_P = (Surface_P)theEObject;
                T result = caseSurface_P(surface_P);
                if (result == null) result = caseNode_P(surface_P);
                if (result == null) result = caseAnnotatable(surface_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.DEPTH_P: {
                Depth_P depth_P = (Depth_P)theEObject;
                T result = caseDepth_P(depth_P);
                if (result == null) result = caseNode_P(depth_P);
                if (result == null) result = caseAnnotatable(depth_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.ASSIGNMENT_P: {
                Assignment_P assignment_P = (Assignment_P)theEObject;
                T result = caseAssignment_P(assignment_P);
                if (result == null) result = caseNode_P(assignment_P);
                if (result == null) result = caseAnnotatable(assignment_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.FORK_P: {
                Fork_P fork_P = (Fork_P)theEObject;
                T result = caseFork_P(fork_P);
                if (result == null) result = caseNode_P(fork_P);
                if (result == null) result = caseAnnotatable(fork_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.JOIN_P: {
                Join_P join_P = (Join_P)theEObject;
                T result = caseJoin_P(join_P);
                if (result == null) result = caseNode_P(join_P);
                if (result == null) result = caseAnnotatable(join_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.LINK_P: {
                Link_P link_P = (Link_P)theEObject;
                T result = caseLink_P(link_P);
                if (result == null) result = caseAnnotatable(link_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.ENTRY_P: {
                Entry_P entry_P = (Entry_P)theEObject;
                T result = caseEntry_P(entry_P);
                if (result == null) result = caseNode_P(entry_P);
                if (result == null) result = caseAnnotatable(entry_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.EXIT_P: {
                Exit_P exit_P = (Exit_P)theEObject;
                T result = caseExit_P(exit_P);
                if (result == null) result = caseNode_P(exit_P);
                if (result == null) result = caseAnnotatable(exit_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.CONTROL_FLOW_P: {
                ControlFlow_P controlFlow_P = (ControlFlow_P)theEObject;
                T result = caseControlFlow_P(controlFlow_P);
                if (result == null) result = caseLink_P(controlFlow_P);
                if (result == null) result = caseAnnotatable(controlFlow_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.DEPENDENCY_P: {
                Dependency_P dependency_P = (Dependency_P)theEObject;
                T result = caseDependency_P(dependency_P);
                if (result == null) result = caseLink_P(dependency_P);
                if (result == null) result = caseAnnotatable(dependency_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.ABSOLUTE_WRITE_READ_P: {
                AbsoluteWrite_Read_P absoluteWrite_Read_P = (AbsoluteWrite_Read_P)theEObject;
                T result = caseAbsoluteWrite_Read_P(absoluteWrite_Read_P);
                if (result == null) result = caseDependency_P(absoluteWrite_Read_P);
                if (result == null) result = caseLink_P(absoluteWrite_Read_P);
                if (result == null) result = caseAnnotatable(absoluteWrite_Read_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.RELATIVE_WRITE_READ_P: {
                RelativeWrite_Read_P relativeWrite_Read_P = (RelativeWrite_Read_P)theEObject;
                T result = caseRelativeWrite_Read_P(relativeWrite_Read_P);
                if (result == null) result = caseDependency_P(relativeWrite_Read_P);
                if (result == null) result = caseLink_P(relativeWrite_Read_P);
                if (result == null) result = caseAnnotatable(relativeWrite_Read_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.ABSOLUTE_WRITE_RELATIVE_WRITE_P: {
                AbsoluteWrite_RelativeWrite_P absoluteWrite_RelativeWrite_P = (AbsoluteWrite_RelativeWrite_P)theEObject;
                T result = caseAbsoluteWrite_RelativeWrite_P(absoluteWrite_RelativeWrite_P);
                if (result == null) result = caseDependency_P(absoluteWrite_RelativeWrite_P);
                if (result == null) result = caseLink_P(absoluteWrite_RelativeWrite_P);
                if (result == null) result = caseAnnotatable(absoluteWrite_RelativeWrite_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.WRITE_WRITE_P: {
                Write_Write_P write_Write_P = (Write_Write_P)theEObject;
                T result = caseWrite_Write_P(write_Write_P);
                if (result == null) result = caseDependency_P(write_Write_P);
                if (result == null) result = caseLink_P(write_Write_P);
                if (result == null) result = caseAnnotatable(write_Write_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.BASIC_BLOCK_P: {
                BasicBlock_P basicBlock_P = (BasicBlock_P)theEObject;
                T result = caseBasicBlock_P(basicBlock_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.SCHEDULING_BLOCK_P: {
                SchedulingBlock_P schedulingBlock_P = (SchedulingBlock_P)theEObject;
                T result = caseSchedulingBlock_P(schedulingBlock_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.PREDECESSOR_P: {
                Predecessor_P predecessor_P = (Predecessor_P)theEObject;
                T result = casePredecessor_P(predecessor_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.SCHEDULE_P: {
                Schedule_P schedule_P = (Schedule_P)theEObject;
                T result = caseSchedule_P(schedule_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.SCHEDULED_BLOCK_P: {
                ScheduledBlock_P scheduledBlock_P = (ScheduledBlock_P)theEObject;
                T result = caseScheduledBlock_P(scheduledBlock_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgpriosPackage.GUARD_P: {
                Guard_P guard_P = (Guard_P)theEObject;
                T result = caseGuard_P(guard_P);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SC Graph P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SC Graph P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSCGraph_P(SCGraph_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNode_P(Node_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conditional P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conditional P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConditional_P(Conditional_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Surface P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Surface P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSurface_P(Surface_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Depth P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Depth P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDepth_P(Depth_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignment_P(Assignment_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fork P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fork P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFork_P(Fork_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Join P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Join P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJoin_P(Join_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Link P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Link P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLink_P(Link_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entry P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entry P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntry_P(Entry_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exit P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exit P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExit_P(Exit_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Control Flow P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Control Flow P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseControlFlow_P(ControlFlow_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dependency P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dependency P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDependency_P(Dependency_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Absolute Write Read P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Absolute Write Read P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbsoluteWrite_Read_P(AbsoluteWrite_Read_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relative Write Read P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relative Write Read P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelativeWrite_Read_P(RelativeWrite_Read_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Absolute Write Relative Write P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Absolute Write Relative Write P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbsoluteWrite_RelativeWrite_P(AbsoluteWrite_RelativeWrite_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Write Write P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Write Write P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWrite_Write_P(Write_Write_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Basic Block P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Basic Block P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBasicBlock_P(BasicBlock_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Scheduling Block P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Scheduling Block P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSchedulingBlock_P(SchedulingBlock_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Predecessor P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Predecessor P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePredecessor_P(Predecessor_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Schedule P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Schedule P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSchedule_P(Schedule_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Scheduled Block P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Scheduled Block P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScheduledBlock_P(ScheduledBlock_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Guard P</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Guard P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGuard_P(Guard_P object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Annotatable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Annotatable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnnotatable(Annotatable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //ScgpriosSwitch
