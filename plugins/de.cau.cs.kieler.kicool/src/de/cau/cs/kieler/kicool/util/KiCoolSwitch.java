/**
 */
package de.cau.cs.kieler.kicool.util;

import de.cau.cs.kieler.kicool.KiCoolPackage;
import de.cau.cs.kieler.kicool.Metric;
import de.cau.cs.kieler.kicool.Processor;
import de.cau.cs.kieler.kicool.ProcessorAlternativeGroup;
import de.cau.cs.kieler.kicool.ProcessorContext;
import de.cau.cs.kieler.kicool.ProcessorEntry;
import de.cau.cs.kieler.kicool.ProcessorGroup;

import de.cau.cs.kieler.kicool.ProcessorSystem;
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
 * @see de.cau.cs.kieler.kicool.KiCoolPackage
 * @generated
 */
public class KiCoolSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static KiCoolPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KiCoolSwitch() {
        if (modelPackage == null) {
            modelPackage = KiCoolPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
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
            case KiCoolPackage.SYSTEM: {
                de.cau.cs.kieler.kicool.System system = (de.cau.cs.kieler.kicool.System)theEObject;
                T result = caseSystem(system);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KiCoolPackage.PROCESSOR_ENTRY: {
                ProcessorEntry processorEntry = (ProcessorEntry)theEObject;
                T result = caseProcessorEntry(processorEntry);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KiCoolPackage.PROCESSOR: {
                Processor processor = (Processor)theEObject;
                T result = caseProcessor(processor);
                if (result == null) result = caseProcessorEntry(processor);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KiCoolPackage.PROCESSOR_SYSTEM: {
                ProcessorSystem processorSystem = (ProcessorSystem)theEObject;
                T result = caseProcessorSystem(processorSystem);
                if (result == null) result = caseProcessorEntry(processorSystem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KiCoolPackage.PROCESSOR_GROUP: {
                ProcessorGroup processorGroup = (ProcessorGroup)theEObject;
                T result = caseProcessorGroup(processorGroup);
                if (result == null) result = caseProcessorEntry(processorGroup);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KiCoolPackage.PROCESSOR_ALTERNATIVE_GROUP: {
                ProcessorAlternativeGroup processorAlternativeGroup = (ProcessorAlternativeGroup)theEObject;
                T result = caseProcessorAlternativeGroup(processorAlternativeGroup);
                if (result == null) result = caseProcessorGroup(processorAlternativeGroup);
                if (result == null) result = caseProcessorEntry(processorAlternativeGroup);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KiCoolPackage.METRIC: {
                Metric metric = (Metric)theEObject;
                T result = caseMetric(metric);
                if (result == null) result = caseProcessorEntry(metric);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KiCoolPackage.PROCESSOR_CONTEXT: {
                ProcessorContext processorContext = (ProcessorContext)theEObject;
                T result = caseProcessorContext(processorContext);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>System</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSystem(de.cau.cs.kieler.kicool.System object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Processor Entry</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processor Entry</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessorEntry(ProcessorEntry object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessor(Processor object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Processor System</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processor System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessorSystem(ProcessorSystem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Processor Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processor Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessorGroup(ProcessorGroup object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Processor Alternative Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processor Alternative Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessorAlternativeGroup(ProcessorAlternativeGroup object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMetric(Metric object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Processor Context</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processor Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessorContext(ProcessorContext object) {
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

} //KiCoolSwitch
