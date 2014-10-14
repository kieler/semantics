/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.sccharts.prio.dependencies.dependency.impl;

import de.cau.cs.kieler.sccharts.prio.dependencies.dependency.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependencyFactoryImpl extends EFactoryImpl implements DependencyFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static DependencyFactory init() {
        try {
            DependencyFactory theDependencyFactory = (DependencyFactory)EPackage.Registry.INSTANCE.getEFactory(DependencyPackage.eNS_URI);
            if (theDependencyFactory != null) {
                return theDependencyFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DependencyFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DependencyFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case DependencyPackage.DEPENDENCY: return createDependency();
            case DependencyPackage.VALUED_OBJECT_DEPENDENCY: return createValuedObjectDependency();
            case DependencyPackage.HIERARCHY_DEPENDENCY: return createHierarchyDependency();
            case DependencyPackage.CONTROLFLOW_DEPENDENCY: return createControlflowDependency();
            case DependencyPackage.TRANSITION_DEPENDENCY: return createTransitionDependency();
            case DependencyPackage.DEPENDENCIES: return createDependencies();
            case DependencyPackage.NODE: return createNode();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case DependencyPackage.NODE_TYPE:
                return createNodeTypeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case DependencyPackage.NODE_TYPE:
                return convertNodeTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Dependency createDependency() {
        DependencyImpl dependency = new DependencyImpl();
        return dependency;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObjectDependency createValuedObjectDependency() {
        ValuedObjectDependencyImpl valuedObjectDependency = new ValuedObjectDependencyImpl();
        return valuedObjectDependency;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HierarchyDependency createHierarchyDependency() {
        HierarchyDependencyImpl hierarchyDependency = new HierarchyDependencyImpl();
        return hierarchyDependency;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ControlflowDependency createControlflowDependency() {
        ControlflowDependencyImpl controlflowDependency = new ControlflowDependencyImpl();
        return controlflowDependency;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TransitionDependency createTransitionDependency() {
        TransitionDependencyImpl transitionDependency = new TransitionDependencyImpl();
        return transitionDependency;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Dependencies createDependencies() {
        DependenciesImpl dependencies = new DependenciesImpl();
        return dependencies;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Node createNode() {
        NodeImpl node = new NodeImpl();
        return node;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue) {
        NodeType result = NodeType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNodeTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DependencyPackage getDependencyPackage() {
        return (DependencyPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static DependencyPackage getPackage() {
        return DependencyPackage.eINSTANCE;
    }

} //DependencyFactoryImpl
