/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.util;

import de.cau.cs.kieler.core.annotations.Annotatable;

import de.cau.cs.kieler.scg.*;

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
 * @see de.cau.cs.kieler.scg.ScgPackage
 * @generated
 */
public class ScgSwitch<T> extends Switch<T> {
    /**
	 * The cached model package
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static ScgPackage modelPackage;

    /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ScgSwitch() {
		if (modelPackage == null) {
			modelPackage = ScgPackage.eINSTANCE;
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
			case ScgPackage.SC_GRAPH: {
				SCGraph scGraph = (SCGraph)theEObject;
				T result = caseSCGraph(scGraph);
				if (result == null) result = caseAnnotatable(scGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseAnnotatable(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.CONDITIONAL: {
				Conditional conditional = (Conditional)theEObject;
				T result = caseConditional(conditional);
				if (result == null) result = caseNode(conditional);
				if (result == null) result = caseAnnotatable(conditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.SURFACE: {
				Surface surface = (Surface)theEObject;
				T result = caseSurface(surface);
				if (result == null) result = caseNode(surface);
				if (result == null) result = caseAnnotatable(surface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.DEPTH: {
				Depth depth = (Depth)theEObject;
				T result = caseDepth(depth);
				if (result == null) result = caseNode(depth);
				if (result == null) result = caseAnnotatable(depth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.ASSIGNMENT: {
				Assignment assignment = (Assignment)theEObject;
				T result = caseAssignment(assignment);
				if (result == null) result = caseNode(assignment);
				if (result == null) result = caseAnnotatable(assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.FORK: {
				Fork fork = (Fork)theEObject;
				T result = caseFork(fork);
				if (result == null) result = caseNode(fork);
				if (result == null) result = caseAnnotatable(fork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.JOIN: {
				Join join = (Join)theEObject;
				T result = caseJoin(join);
				if (result == null) result = caseNode(join);
				if (result == null) result = caseAnnotatable(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseAnnotatable(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.ENTRY: {
				Entry entry = (Entry)theEObject;
				T result = caseEntry(entry);
				if (result == null) result = caseNode(entry);
				if (result == null) result = caseAnnotatable(entry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.EXIT: {
				Exit exit = (Exit)theEObject;
				T result = caseExit(exit);
				if (result == null) result = caseNode(exit);
				if (result == null) result = caseAnnotatable(exit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.CONTROL_FLOW: {
				ControlFlow controlFlow = (ControlFlow)theEObject;
				T result = caseControlFlow(controlFlow);
				if (result == null) result = caseLink(controlFlow);
				if (result == null) result = caseAnnotatable(controlFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				T result = caseDependency(dependency);
				if (result == null) result = caseLink(dependency);
				if (result == null) result = caseAnnotatable(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.DATA_DEPENDENCY: {
				DataDependency dataDependency = (DataDependency)theEObject;
				T result = caseDataDependency(dataDependency);
				if (result == null) result = caseDependency(dataDependency);
				if (result == null) result = caseLink(dataDependency);
				if (result == null) result = caseAnnotatable(dataDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.CONTROL_DEPENDENCY: {
				ControlDependency controlDependency = (ControlDependency)theEObject;
				T result = caseControlDependency(controlDependency);
				if (result == null) result = caseDependency(controlDependency);
				if (result == null) result = caseLink(controlDependency);
				if (result == null) result = caseAnnotatable(controlDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.ABSOLUTE_WRITE_READ: {
				AbsoluteWrite_Read absoluteWrite_Read = (AbsoluteWrite_Read)theEObject;
				T result = caseAbsoluteWrite_Read(absoluteWrite_Read);
				if (result == null) result = caseDataDependency(absoluteWrite_Read);
				if (result == null) result = caseDependency(absoluteWrite_Read);
				if (result == null) result = caseLink(absoluteWrite_Read);
				if (result == null) result = caseAnnotatable(absoluteWrite_Read);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.RELATIVE_WRITE_READ: {
				RelativeWrite_Read relativeWrite_Read = (RelativeWrite_Read)theEObject;
				T result = caseRelativeWrite_Read(relativeWrite_Read);
				if (result == null) result = caseDataDependency(relativeWrite_Read);
				if (result == null) result = caseDependency(relativeWrite_Read);
				if (result == null) result = caseLink(relativeWrite_Read);
				if (result == null) result = caseAnnotatable(relativeWrite_Read);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.ABSOLUTE_WRITE_RELATIVE_WRITE: {
				AbsoluteWrite_RelativeWrite absoluteWrite_RelativeWrite = (AbsoluteWrite_RelativeWrite)theEObject;
				T result = caseAbsoluteWrite_RelativeWrite(absoluteWrite_RelativeWrite);
				if (result == null) result = caseDataDependency(absoluteWrite_RelativeWrite);
				if (result == null) result = caseDependency(absoluteWrite_RelativeWrite);
				if (result == null) result = caseLink(absoluteWrite_RelativeWrite);
				if (result == null) result = caseAnnotatable(absoluteWrite_RelativeWrite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.WRITE_WRITE: {
				Write_Write write_Write = (Write_Write)theEObject;
				T result = caseWrite_Write(write_Write);
				if (result == null) result = caseDataDependency(write_Write);
				if (result == null) result = caseDependency(write_Write);
				if (result == null) result = caseLink(write_Write);
				if (result == null) result = caseAnnotatable(write_Write);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.BASIC_BLOCK: {
				BasicBlock basicBlock = (BasicBlock)theEObject;
				T result = caseBasicBlock(basicBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.SCHEDULING_BLOCK: {
				SchedulingBlock schedulingBlock = (SchedulingBlock)theEObject;
				T result = caseSchedulingBlock(schedulingBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.PREDECESSOR: {
				Predecessor predecessor = (Predecessor)theEObject;
				T result = casePredecessor(predecessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.SCHEDULE_BLOCK: {
				ScheduleBlock scheduleBlock = (ScheduleBlock)theEObject;
				T result = caseScheduleBlock(scheduleBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.SCHEDULE: {
				Schedule schedule = (Schedule)theEObject;
				T result = caseSchedule(schedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScgPackage.GUARD: {
				Guard guard = (Guard)theEObject;
				T result = caseGuard(guard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNode(Node object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseConditional(Conditional object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Surface</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSurface(Surface object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Depth</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Depth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDepth(Depth object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseAssignment(Assignment object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseFork(Fork object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseJoin(Join object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseLink(Link object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>SC Graph</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SC Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSCGraph(SCGraph object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseEntry(Entry object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Exit</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseExit(Exit object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseControlFlow(ControlFlow object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDependency(Dependency object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Data Dependency</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDataDependency(DataDependency object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Control Dependency</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseControlDependency(ControlDependency object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Write Read</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Write Read</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseAbsoluteWrite_Read(AbsoluteWrite_Read object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Write Read</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Write Read</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRelativeWrite_Read(RelativeWrite_Read object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Write Relative Write</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Write Relative Write</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseAbsoluteWrite_RelativeWrite(AbsoluteWrite_RelativeWrite object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Write Write</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Write</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseWrite_Write(Write_Write object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Block</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseBasicBlock(BasicBlock object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduling Block</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduling Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSchedulingBlock(SchedulingBlock object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Predecessor</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predecessor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T casePredecessor(Predecessor object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduleBlock(ScheduleBlock object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSchedule(Schedule object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseGuard(Guard object) {
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

} //ScgSwitch
