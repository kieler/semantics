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
package de.cau.cs.kieler.scgdep.impl;

import de.cau.cs.kieler.scgdep.*;

import org.eclipse.emf.ecore.EClass;
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
public class ScgdepFactoryImpl extends EFactoryImpl implements ScgdepFactory {
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static ScgdepFactory init() {
		try {
			ScgdepFactory theScgdepFactory = (ScgdepFactory)EPackage.Registry.INSTANCE.getEFactory(ScgdepPackage.eNS_URI);
			if (theScgdepFactory != null) {
				return theScgdepFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScgdepFactoryImpl();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ScgdepFactoryImpl() {
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
			case ScgdepPackage.DEPENDENCY: return createDependency();
			case ScgdepPackage.ABSOLUTE_WRITE_READ: return createAbsoluteWrite_Read();
			case ScgdepPackage.RELATIVE_WRITE_READ: return createRelativeWrite_Read();
			case ScgdepPackage.ABSOLUTE_WRITE_RELATIVE_WRITE: return createAbsoluteWrite_RelativeWrite();
			case ScgdepPackage.WRITE_WRITE: return createWrite_Write();
			case ScgdepPackage.ASSIGNMENT_DEP: return createAssignmentDep();
			case ScgdepPackage.SC_GRAPH_DEP: return createSCGraphDep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
    public AbsoluteWrite_Read createAbsoluteWrite_Read() {
		AbsoluteWrite_ReadImpl absoluteWrite_Read = new AbsoluteWrite_ReadImpl();
		return absoluteWrite_Read;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RelativeWrite_Read createRelativeWrite_Read() {
		RelativeWrite_ReadImpl relativeWrite_Read = new RelativeWrite_ReadImpl();
		return relativeWrite_Read;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AbsoluteWrite_RelativeWrite createAbsoluteWrite_RelativeWrite() {
		AbsoluteWrite_RelativeWriteImpl absoluteWrite_RelativeWrite = new AbsoluteWrite_RelativeWriteImpl();
		return absoluteWrite_RelativeWrite;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Write_Write createWrite_Write() {
		Write_WriteImpl write_Write = new Write_WriteImpl();
		return write_Write;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AssignmentDep createAssignmentDep() {
		AssignmentDepImpl assignmentDep = new AssignmentDepImpl();
		return assignmentDep;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SCGraphDep createSCGraphDep() {
		SCGraphDepImpl scGraphDep = new SCGraphDepImpl();
		return scGraphDep;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ScgdepPackage getScgdepPackage() {
		return (ScgdepPackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static ScgdepPackage getPackage() {
		return ScgdepPackage.eINSTANCE;
	}

} //ScgdepFactoryImpl
