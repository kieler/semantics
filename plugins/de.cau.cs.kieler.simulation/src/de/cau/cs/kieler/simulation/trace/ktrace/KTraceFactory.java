/**
 */
package de.cau.cs.kieler.simulation.trace.ktrace;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.simulation.trace.ktrace.KTracePackage
 * @generated
 */
public interface KTraceFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    KTraceFactory eINSTANCE = de.cau.cs.kieler.simulation.trace.ktrace.impl.KTraceFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Trace File</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Trace File</em>'.
     * @generated
     */
    TraceFile createTraceFile();

    /**
     * Returns a new object of class '<em>Trace</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Trace</em>'.
     * @generated
     */
    Trace createTrace();

    /**
     * Returns a new object of class '<em>Tick</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tick</em>'.
     * @generated
     */
    Tick createTick();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    KTracePackage getKTracePackage();

} //KTraceFactory
