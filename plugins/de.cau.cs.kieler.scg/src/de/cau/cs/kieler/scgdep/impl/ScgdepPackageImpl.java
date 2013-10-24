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

import de.cau.cs.kieler.scg.ScgPackage;

import de.cau.cs.kieler.scgdep.AbsoluteWrite_Read;
import de.cau.cs.kieler.scgdep.AbsoluteWrite_RelativeWrite;
import de.cau.cs.kieler.scgdep.AssignmentDep;
import de.cau.cs.kieler.scgdep.ConditionalDep;
import de.cau.cs.kieler.scgdep.Dependency;
import de.cau.cs.kieler.scgdep.NodeDep;
import de.cau.cs.kieler.scgdep.RelativeWrite_Read;
import de.cau.cs.kieler.scgdep.SCGraphDep;
import de.cau.cs.kieler.scgdep.ScgdepFactory;
import de.cau.cs.kieler.scgdep.ScgdepPackage;
import de.cau.cs.kieler.scgdep.Write_Write;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScgdepPackageImpl extends EPackageImpl implements ScgdepPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dependencyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass absoluteWrite_ReadEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relativeWrite_ReadEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass absoluteWrite_RelativeWriteEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass write_WriteEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conditionalDepEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentDepEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeDepEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scGraphDepEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.cau.cs.kieler.scgdep.ScgdepPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ScgdepPackageImpl() {
        super(eNS_URI, ScgdepFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ScgdepPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ScgdepPackage init() {
        if (isInited) return (ScgdepPackage)EPackage.Registry.INSTANCE.getEPackage(ScgdepPackage.eNS_URI);

        // Obtain or create and register package
        ScgdepPackageImpl theScgdepPackage = (ScgdepPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScgdepPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScgdepPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        ScgPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theScgdepPackage.createPackageContents();

        // Initialize created meta-data
        theScgdepPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theScgdepPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ScgdepPackage.eNS_URI, theScgdepPackage);
        return theScgdepPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDependency() {
        return dependencyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDependency_Concurrent() {
        return (EAttribute)dependencyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbsoluteWrite_Read() {
        return absoluteWrite_ReadEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelativeWrite_Read() {
        return relativeWrite_ReadEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbsoluteWrite_RelativeWrite() {
        return absoluteWrite_RelativeWriteEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWrite_Write() {
        return write_WriteEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConditionalDep() {
        return conditionalDepEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssignmentDep() {
        return assignmentDepEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNodeDep() {
        return nodeDepEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNodeDep_Dependencies() {
        return (EReference)nodeDepEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSCGraphDep() {
        return scGraphDepEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScgdepFactory getScgdepFactory() {
        return (ScgdepFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        dependencyEClass = createEClass(DEPENDENCY);
        createEAttribute(dependencyEClass, DEPENDENCY__CONCURRENT);

        absoluteWrite_ReadEClass = createEClass(ABSOLUTE_WRITE_READ);

        relativeWrite_ReadEClass = createEClass(RELATIVE_WRITE_READ);

        absoluteWrite_RelativeWriteEClass = createEClass(ABSOLUTE_WRITE_RELATIVE_WRITE);

        write_WriteEClass = createEClass(WRITE_WRITE);

        conditionalDepEClass = createEClass(CONDITIONAL_DEP);

        assignmentDepEClass = createEClass(ASSIGNMENT_DEP);

        nodeDepEClass = createEClass(NODE_DEP);
        createEReference(nodeDepEClass, NODE_DEP__DEPENDENCIES);

        scGraphDepEClass = createEClass(SC_GRAPH_DEP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        ScgPackage theScgPackage = (ScgPackage)EPackage.Registry.INSTANCE.getEPackage(ScgPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        dependencyEClass.getESuperTypes().add(theScgPackage.getLink());
        absoluteWrite_ReadEClass.getESuperTypes().add(this.getDependency());
        relativeWrite_ReadEClass.getESuperTypes().add(this.getDependency());
        absoluteWrite_RelativeWriteEClass.getESuperTypes().add(this.getDependency());
        write_WriteEClass.getESuperTypes().add(this.getDependency());
        conditionalDepEClass.getESuperTypes().add(theScgPackage.getConditional());
        conditionalDepEClass.getESuperTypes().add(this.getNodeDep());
        assignmentDepEClass.getESuperTypes().add(theScgPackage.getAssignment());
        assignmentDepEClass.getESuperTypes().add(this.getNodeDep());
        scGraphDepEClass.getESuperTypes().add(theScgPackage.getSCGraph());

        // Initialize classes, features, and operations; add parameters
        initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDependency_Concurrent(), ecorePackage.getEBoolean(), "concurrent", "false", 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(absoluteWrite_ReadEClass, AbsoluteWrite_Read.class, "AbsoluteWrite_Read", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(relativeWrite_ReadEClass, RelativeWrite_Read.class, "RelativeWrite_Read", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(absoluteWrite_RelativeWriteEClass, AbsoluteWrite_RelativeWrite.class, "AbsoluteWrite_RelativeWrite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(write_WriteEClass, Write_Write.class, "Write_Write", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(conditionalDepEClass, ConditionalDep.class, "ConditionalDep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(assignmentDepEClass, AssignmentDep.class, "AssignmentDep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(nodeDepEClass, NodeDep.class, "NodeDep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNodeDep_Dependencies(), theScgPackage.getLink(), null, "dependencies", null, 0, -1, NodeDep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(scGraphDepEClass, SCGraphDep.class, "SCGraphDep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //ScgdepPackageImpl
