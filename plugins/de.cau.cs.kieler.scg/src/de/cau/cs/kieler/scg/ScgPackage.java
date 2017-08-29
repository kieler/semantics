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
package de.cau.cs.kieler.scg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.cau.cs.kieler.annotations.AnnotationsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.scg.ScgFactory
 * @model kind="package"
 * @generated
 */
public interface ScgPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "scg";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://kieler.cs.cau.de/scg/0.1.0";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "scg";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	ScgPackage eINSTANCE = de.cau.cs.kieler.scg.impl.ScgPackageImpl.init();

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.SCGraphsImpl <em>SC Graphs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.SCGraphsImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getSCGraphs()
     * @generated
     */
    int SC_GRAPHS = 0;

    /**
     * The feature id for the '<em><b>Pragmas</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_GRAPHS__PRAGMAS = AnnotationsPackage.PRAGMATABLE__PRAGMAS;

    /**
     * The feature id for the '<em><b>Scgs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_GRAPHS__SCGS = AnnotationsPackage.PRAGMATABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>SC Graphs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_GRAPHS_FEATURE_COUNT = AnnotationsPackage.PRAGMATABLE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.SCGraphImpl <em>SC Graph</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.SCGraphImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getSCGraph()
     * @generated
     */
	int SC_GRAPH = 1;

	/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SC_GRAPH__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_GRAPH__NAME = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SC_GRAPH__NODES = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SC_GRAPH__DECLARATIONS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Basic Blocks</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SC_GRAPH__BASIC_BLOCKS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Guards</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SC_GRAPH__GUARDS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SC_GRAPH__LABEL = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 5;

	/**
     * The number of structural features of the '<em>SC Graph</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SC_GRAPH_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 6;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.NodeImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getNode()
     * @generated
     */
	int NODE = 2;

	/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__NAME = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE__INCOMING = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE__IS_INITIAL = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE__DEPENDENCIES = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Schizophrenic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__SCHIZOPHRENIC = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Node</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 5;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.ConditionalImpl <em>Conditional</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.ConditionalImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getConditional()
     * @generated
     */
	int CONDITIONAL = 3;

	/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITIONAL__ANNOTATIONS = NODE__ANNOTATIONS;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL__NAME = NODE__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITIONAL__INCOMING = NODE__INCOMING;

	/**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITIONAL__IS_INITIAL = NODE__IS_INITIAL;

	/**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITIONAL__DEPENDENCIES = NODE__DEPENDENCIES;

	/**
     * The feature id for the '<em><b>Schizophrenic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL__SCHIZOPHRENIC = NODE__SCHIZOPHRENIC;

    /**
     * The feature id for the '<em><b>Then</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITIONAL__THEN = NODE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Else</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITIONAL__ELSE = NODE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITIONAL__CONDITION = NODE_FEATURE_COUNT + 2;

	/**
     * The number of structural features of the '<em>Conditional</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONDITIONAL_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.SurfaceImpl <em>Surface</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.SurfaceImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getSurface()
     * @generated
     */
	int SURFACE = 4;

	/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SURFACE__ANNOTATIONS = NODE__ANNOTATIONS;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SURFACE__NAME = NODE__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SURFACE__INCOMING = NODE__INCOMING;

	/**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SURFACE__IS_INITIAL = NODE__IS_INITIAL;

	/**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SURFACE__DEPENDENCIES = NODE__DEPENDENCIES;

	/**
     * The feature id for the '<em><b>Schizophrenic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SURFACE__SCHIZOPHRENIC = NODE__SCHIZOPHRENIC;

    /**
     * The feature id for the '<em><b>Depth</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SURFACE__DEPTH = NODE_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Surface</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SURFACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.DepthImpl <em>Depth</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.DepthImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getDepth()
     * @generated
     */
	int DEPTH = 5;

	/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DEPTH__ANNOTATIONS = NODE__ANNOTATIONS;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPTH__NAME = NODE__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DEPTH__INCOMING = NODE__INCOMING;

	/**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DEPTH__IS_INITIAL = NODE__IS_INITIAL;

	/**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DEPTH__DEPENDENCIES = NODE__DEPENDENCIES;

	/**
     * The feature id for the '<em><b>Schizophrenic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPTH__SCHIZOPHRENIC = NODE__SCHIZOPHRENIC;

    /**
     * The feature id for the '<em><b>Surface</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DEPTH__SURFACE = NODE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DEPTH__NEXT = NODE_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Depth</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DEPTH_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.AssignmentImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getAssignment()
     * @generated
     */
	int ASSIGNMENT = 6;

	/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASSIGNMENT__ANNOTATIONS = NODE__ANNOTATIONS;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__NAME = NODE__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASSIGNMENT__INCOMING = NODE__INCOMING;

	/**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASSIGNMENT__IS_INITIAL = NODE__IS_INITIAL;

	/**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASSIGNMENT__DEPENDENCIES = NODE__DEPENDENCIES;

	/**
     * The feature id for the '<em><b>Schizophrenic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__SCHIZOPHRENIC = NODE__SCHIZOPHRENIC;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__SCHEDULE = NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Valued Object</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASSIGNMENT__VALUED_OBJECT = NODE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASSIGNMENT__EXPRESSION = NODE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Indices</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASSIGNMENT__INDICES = NODE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__OPERATOR = NODE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Sub Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__SUB_REFERENCE = NODE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASSIGNMENT__NEXT = NODE_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASSIGNMENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 7;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.ForkImpl <em>Fork</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.ForkImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getFork()
     * @generated
     */
	int FORK = 7;

	/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORK__ANNOTATIONS = NODE__ANNOTATIONS;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORK__NAME = NODE__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORK__INCOMING = NODE__INCOMING;

	/**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORK__IS_INITIAL = NODE__IS_INITIAL;

	/**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORK__DEPENDENCIES = NODE__DEPENDENCIES;

	/**
     * The feature id for the '<em><b>Schizophrenic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORK__SCHIZOPHRENIC = NODE__SCHIZOPHRENIC;

    /**
     * The feature id for the '<em><b>Join</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORK__JOIN = NODE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Next</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORK__NEXT = NODE_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Fork</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORK_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.JoinImpl <em>Join</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.JoinImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getJoin()
     * @generated
     */
	int JOIN = 8;

	/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOIN__ANNOTATIONS = NODE__ANNOTATIONS;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOIN__NAME = NODE__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOIN__INCOMING = NODE__INCOMING;

	/**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOIN__IS_INITIAL = NODE__IS_INITIAL;

	/**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOIN__DEPENDENCIES = NODE__DEPENDENCIES;

	/**
     * The feature id for the '<em><b>Schizophrenic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOIN__SCHIZOPHRENIC = NODE__SCHIZOPHRENIC;

    /**
     * The feature id for the '<em><b>Fork</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOIN__FORK = NODE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOIN__NEXT = NODE_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Join</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOIN_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.LinkImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getLink()
     * @generated
     */
	int LINK = 15;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.EntryImpl <em>Entry</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.EntryImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getEntry()
     * @generated
     */
	int ENTRY = 9;

	/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ENTRY__ANNOTATIONS = NODE__ANNOTATIONS;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY__NAME = NODE__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ENTRY__INCOMING = NODE__INCOMING;

	/**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ENTRY__IS_INITIAL = NODE__IS_INITIAL;

	/**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ENTRY__DEPENDENCIES = NODE__DEPENDENCIES;

	/**
     * The feature id for the '<em><b>Schizophrenic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY__SCHIZOPHRENIC = NODE__SCHIZOPHRENIC;

    /**
     * The feature id for the '<em><b>Exit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ENTRY__EXIT = NODE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ENTRY__NEXT = NODE_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Entry</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ENTRY_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.ExitImpl <em>Exit</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.ExitImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getExit()
     * @generated
     */
	int EXIT = 10;

	/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXIT__ANNOTATIONS = NODE__ANNOTATIONS;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT__NAME = NODE__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXIT__INCOMING = NODE__INCOMING;

	/**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXIT__IS_INITIAL = NODE__IS_INITIAL;

	/**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXIT__DEPENDENCIES = NODE__DEPENDENCIES;

	/**
     * The feature id for the '<em><b>Schizophrenic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT__SCHIZOPHRENIC = NODE__SCHIZOPHRENIC;

    /**
     * The feature id for the '<em><b>Entry</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXIT__ENTRY = NODE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXIT__NEXT = NODE_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Exit</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXIT_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.ControlFlowImpl <em>Control Flow</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.ControlFlowImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getControlFlow()
     * @generated
     */
	int CONTROL_FLOW = 16;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.DependencyImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getDependency()
     * @generated
     */
    int DEPENDENCY = 17;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.DataDependencyImpl <em>Data Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.DataDependencyImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getDataDependency()
     * @generated
     */
    int DATA_DEPENDENCY = 18;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.ControlDependencyImpl <em>Control Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.ControlDependencyImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getControlDependency()
     * @generated
     */
    int CONTROL_DEPENDENCY = 19;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.BasicBlockImpl <em>Basic Block</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.BasicBlockImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getBasicBlock()
     * @generated
     */
	int BASIC_BLOCK = 11;

	/**
     * The feature id for the '<em><b>Scheduling Blocks</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASIC_BLOCK__SCHEDULING_BLOCKS = 0;

	/**
     * The feature id for the '<em><b>Predecessors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASIC_BLOCK__PREDECESSORS = 1;

	/**
     * The feature id for the '<em><b>Go Block</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASIC_BLOCK__GO_BLOCK = 2;

	/**
     * The feature id for the '<em><b>Depth Block</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASIC_BLOCK__DEPTH_BLOCK = 3;

	/**
     * The feature id for the '<em><b>Synchronizer Block</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASIC_BLOCK__SYNCHRONIZER_BLOCK = 4;

	/**
     * The feature id for the '<em><b>Entry Block</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASIC_BLOCK__ENTRY_BLOCK = 5;

	/**
     * The feature id for the '<em><b>Dead Block</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASIC_BLOCK__DEAD_BLOCK = 6;

	/**
     * The feature id for the '<em><b>Term Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_BLOCK__TERM_BLOCK = 7;

    /**
     * The feature id for the '<em><b>Pre Guard</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASIC_BLOCK__PRE_GUARD = 8;

	/**
     * The number of structural features of the '<em>Basic Block</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASIC_BLOCK_FEATURE_COUNT = 9;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.SchedulingBlockImpl <em>Scheduling Block</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.SchedulingBlockImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getSchedulingBlock()
     * @generated
     */
	int SCHEDULING_BLOCK = 12;

	/**
     * The feature id for the '<em><b>Nodes</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCHEDULING_BLOCK__NODES = 0;

	/**
     * The feature id for the '<em><b>Dependencies</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCHEDULING_BLOCK__DEPENDENCIES = 1;

	/**
     * The feature id for the '<em><b>Guards</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCHEDULING_BLOCK__GUARDS = 2;

	/**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULING_BLOCK__LABEL = 3;

    /**
     * The number of structural features of the '<em>Scheduling Block</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCHEDULING_BLOCK_FEATURE_COUNT = 4;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.PredecessorImpl <em>Predecessor</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.PredecessorImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getPredecessor()
     * @generated
     */
	int PREDECESSOR = 13;

	/**
     * The feature id for the '<em><b>Basic Block</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PREDECESSOR__BASIC_BLOCK = 0;

	/**
     * The feature id for the '<em><b>Conditional</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PREDECESSOR__CONDITIONAL = 1;

	/**
     * The feature id for the '<em><b>Branch Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PREDECESSOR__BRANCH_TYPE = 2;

	/**
     * The number of structural features of the '<em>Predecessor</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PREDECESSOR_FEATURE_COUNT = 3;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.ExpressionDependencyImpl <em>Expression Dependency</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.ExpressionDependencyImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getExpressionDependency()
     * @generated
     */
	int EXPRESSION_DEPENDENCY = 20;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.GuardDependencyImpl <em>Guard Dependency</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.GuardDependencyImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getGuardDependency()
     * @generated
     */
	int GUARD_DEPENDENCY = 21;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.GuardImpl <em>Guard</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.GuardImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getGuard()
     * @generated
     */
	int GUARD = 14;

	/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GUARD__ANNOTATIONS = NODE__ANNOTATIONS;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GUARD__NAME = NODE__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GUARD__INCOMING = NODE__INCOMING;

	/**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GUARD__IS_INITIAL = NODE__IS_INITIAL;

	/**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GUARD__DEPENDENCIES = NODE__DEPENDENCIES;

	/**
     * The feature id for the '<em><b>Schizophrenic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GUARD__SCHIZOPHRENIC = NODE__SCHIZOPHRENIC;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GUARD__SCHEDULE = NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Valued Object</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GUARD__VALUED_OBJECT = NODE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GUARD__EXPRESSION = NODE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Indices</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GUARD__INDICES = NODE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GUARD__OPERATOR = NODE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Sub Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GUARD__SUB_REFERENCE = NODE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Guard</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GUARD_FEATURE_COUNT = NODE_FEATURE_COUNT + 6;

	/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

	/**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK__TARGET = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Link</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTROL_FLOW__ANNOTATIONS = LINK__ANNOTATIONS;

	/**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTROL_FLOW__TARGET = LINK__TARGET;

	/**
     * The number of structural features of the '<em>Control Flow</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTROL_FLOW_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DEPENDENCY__ANNOTATIONS = LINK__ANNOTATIONS;

	/**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DEPENDENCY__TARGET = LINK__TARGET;

	/**
     * The number of structural features of the '<em>Dependency</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DEPENDENCY_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_DEPENDENCY__ANNOTATIONS = DEPENDENCY__ANNOTATIONS;

	/**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_DEPENDENCY__TARGET = DEPENDENCY__TARGET;

	/**
     * The feature id for the '<em><b>Concurrent</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_DEPENDENCY__CONCURRENT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Confluent</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_DEPENDENCY__CONFLUENT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_DEPENDENCY__TYPE = DEPENDENCY_FEATURE_COUNT + 2;

	/**
     * The number of structural features of the '<em>Data Dependency</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTROL_DEPENDENCY__ANNOTATIONS = DEPENDENCY__ANNOTATIONS;

	/**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTROL_DEPENDENCY__TARGET = DEPENDENCY__TARGET;

	/**
     * The number of structural features of the '<em>Control Dependency</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTROL_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

				/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXPRESSION_DEPENDENCY__ANNOTATIONS = DEPENDENCY__ANNOTATIONS;

				/**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXPRESSION_DEPENDENCY__TARGET = DEPENDENCY__TARGET;

				/**
     * The number of structural features of the '<em>Expression Dependency</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXPRESSION_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

				/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GUARD_DEPENDENCY__ANNOTATIONS = DEPENDENCY__ANNOTATIONS;

				/**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GUARD_DEPENDENCY__TARGET = DEPENDENCY__TARGET;

				/**
     * The number of structural features of the '<em>Guard Dependency</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GUARD_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.ScheduleDependencyImpl <em>Schedule Dependency</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.impl.ScheduleDependencyImpl
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getScheduleDependency()
     * @generated
     */
	int SCHEDULE_DEPENDENCY = 22;

				/**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCHEDULE_DEPENDENCY__ANNOTATIONS = DEPENDENCY__ANNOTATIONS;

				/**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCHEDULE_DEPENDENCY__TARGET = DEPENDENCY__TARGET;

				/**
     * The number of structural features of the '<em>Schedule Dependency</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCHEDULE_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.BranchType <em>Branch Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.BranchType
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getBranchType()
     * @generated
     */
	int BRANCH_TYPE = 23;


	/**
     * The meta object id for the '{@link de.cau.cs.kieler.scg.DataDependencyType <em>Data Dependency Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scg.DataDependencyType
     * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getDataDependencyType()
     * @generated
     */
	int DATA_DEPENDENCY_TYPE = 24;


	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.SCGraphs <em>SC Graphs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SC Graphs</em>'.
     * @see de.cau.cs.kieler.scg.SCGraphs
     * @generated
     */
    EClass getSCGraphs();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.SCGraphs#getScgs <em>Scgs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Scgs</em>'.
     * @see de.cau.cs.kieler.scg.SCGraphs#getScgs()
     * @see #getSCGraphs()
     * @generated
     */
    EReference getSCGraphs_Scgs();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.SCGraph <em>SC Graph</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>SC Graph</em>'.
     * @see de.cau.cs.kieler.scg.SCGraph
     * @generated
     */
	EClass getSCGraph();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.SCGraph#getNodes <em>Nodes</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Nodes</em>'.
     * @see de.cau.cs.kieler.scg.SCGraph#getNodes()
     * @see #getSCGraph()
     * @generated
     */
	EReference getSCGraph_Nodes();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.SCGraph#getDeclarations <em>Declarations</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Declarations</em>'.
     * @see de.cau.cs.kieler.scg.SCGraph#getDeclarations()
     * @see #getSCGraph()
     * @generated
     */
	EReference getSCGraph_Declarations();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.SCGraph#getBasicBlocks <em>Basic Blocks</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Basic Blocks</em>'.
     * @see de.cau.cs.kieler.scg.SCGraph#getBasicBlocks()
     * @see #getSCGraph()
     * @generated
     */
	EReference getSCGraph_BasicBlocks();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.SCGraph#getGuards <em>Guards</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Guards</em>'.
     * @see de.cau.cs.kieler.scg.SCGraph#getGuards()
     * @see #getSCGraph()
     * @generated
     */
	EReference getSCGraph_Guards();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.SCGraph#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see de.cau.cs.kieler.scg.SCGraph#getLabel()
     * @see #getSCGraph()
     * @generated
     */
	EAttribute getSCGraph_Label();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Node <em>Node</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node</em>'.
     * @see de.cau.cs.kieler.scg.Node
     * @generated
     */
	EClass getNode();

	/**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.scg.Node#getIncoming <em>Incoming</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incoming</em>'.
     * @see de.cau.cs.kieler.scg.Node#getIncoming()
     * @see #getNode()
     * @generated
     */
	EReference getNode_Incoming();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.Node#isIsInitial <em>Is Initial</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Initial</em>'.
     * @see de.cau.cs.kieler.scg.Node#isIsInitial()
     * @see #getNode()
     * @generated
     */
	EAttribute getNode_IsInitial();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.Node#getDependencies <em>Dependencies</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Dependencies</em>'.
     * @see de.cau.cs.kieler.scg.Node#getDependencies()
     * @see #getNode()
     * @generated
     */
	EReference getNode_Dependencies();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.Node#isSchizophrenic <em>Schizophrenic</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schizophrenic</em>'.
     * @see de.cau.cs.kieler.scg.Node#isSchizophrenic()
     * @see #getNode()
     * @generated
     */
    EAttribute getNode_Schizophrenic();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Conditional <em>Conditional</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conditional</em>'.
     * @see de.cau.cs.kieler.scg.Conditional
     * @generated
     */
	EClass getConditional();

	/**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Conditional#getThen <em>Then</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Then</em>'.
     * @see de.cau.cs.kieler.scg.Conditional#getThen()
     * @see #getConditional()
     * @generated
     */
	EReference getConditional_Then();

	/**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Conditional#getElse <em>Else</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Else</em>'.
     * @see de.cau.cs.kieler.scg.Conditional#getElse()
     * @see #getConditional()
     * @generated
     */
	EReference getConditional_Else();

	/**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Conditional#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition</em>'.
     * @see de.cau.cs.kieler.scg.Conditional#getCondition()
     * @see #getConditional()
     * @generated
     */
	EReference getConditional_Condition();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Surface <em>Surface</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Surface</em>'.
     * @see de.cau.cs.kieler.scg.Surface
     * @generated
     */
	EClass getSurface();

	/**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Surface#getDepth <em>Depth</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Depth</em>'.
     * @see de.cau.cs.kieler.scg.Surface#getDepth()
     * @see #getSurface()
     * @generated
     */
	EReference getSurface_Depth();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Depth <em>Depth</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Depth</em>'.
     * @see de.cau.cs.kieler.scg.Depth
     * @generated
     */
	EClass getDepth();

	/**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Depth#getSurface <em>Surface</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Surface</em>'.
     * @see de.cau.cs.kieler.scg.Depth#getSurface()
     * @see #getDepth()
     * @generated
     */
	EReference getDepth_Surface();

	/**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Depth#getNext <em>Next</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Next</em>'.
     * @see de.cau.cs.kieler.scg.Depth#getNext()
     * @see #getDepth()
     * @generated
     */
	EReference getDepth_Next();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment</em>'.
     * @see de.cau.cs.kieler.scg.Assignment
     * @generated
     */
	EClass getAssignment();

	/**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Assignment#getNext <em>Next</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Next</em>'.
     * @see de.cau.cs.kieler.scg.Assignment#getNext()
     * @see #getAssignment()
     * @generated
     */
	EReference getAssignment_Next();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Fork <em>Fork</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Fork</em>'.
     * @see de.cau.cs.kieler.scg.Fork
     * @generated
     */
	EClass getFork();

	/**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Fork#getJoin <em>Join</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Join</em>'.
     * @see de.cau.cs.kieler.scg.Fork#getJoin()
     * @see #getFork()
     * @generated
     */
	EReference getFork_Join();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.Fork#getNext <em>Next</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Next</em>'.
     * @see de.cau.cs.kieler.scg.Fork#getNext()
     * @see #getFork()
     * @generated
     */
	EReference getFork_Next();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Join <em>Join</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Join</em>'.
     * @see de.cau.cs.kieler.scg.Join
     * @generated
     */
	EClass getJoin();

	/**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Join#getFork <em>Fork</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Fork</em>'.
     * @see de.cau.cs.kieler.scg.Join#getFork()
     * @see #getJoin()
     * @generated
     */
	EReference getJoin_Fork();

	/**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Join#getNext <em>Next</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Next</em>'.
     * @see de.cau.cs.kieler.scg.Join#getNext()
     * @see #getJoin()
     * @generated
     */
	EReference getJoin_Next();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Link <em>Link</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Link</em>'.
     * @see de.cau.cs.kieler.scg.Link
     * @generated
     */
	EClass getLink();

	/**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Link#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see de.cau.cs.kieler.scg.Link#getTarget()
     * @see #getLink()
     * @generated
     */
	EReference getLink_Target();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Entry <em>Entry</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entry</em>'.
     * @see de.cau.cs.kieler.scg.Entry
     * @generated
     */
	EClass getEntry();

	/**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Entry#getExit <em>Exit</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Exit</em>'.
     * @see de.cau.cs.kieler.scg.Entry#getExit()
     * @see #getEntry()
     * @generated
     */
	EReference getEntry_Exit();

	/**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Entry#getNext <em>Next</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Next</em>'.
     * @see de.cau.cs.kieler.scg.Entry#getNext()
     * @see #getEntry()
     * @generated
     */
	EReference getEntry_Next();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Exit <em>Exit</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exit</em>'.
     * @see de.cau.cs.kieler.scg.Exit
     * @generated
     */
	EClass getExit();

	/**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Exit#getEntry <em>Entry</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entry</em>'.
     * @see de.cau.cs.kieler.scg.Exit#getEntry()
     * @see #getExit()
     * @generated
     */
	EReference getExit_Entry();

	/**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Exit#getNext <em>Next</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Next</em>'.
     * @see de.cau.cs.kieler.scg.Exit#getNext()
     * @see #getExit()
     * @generated
     */
	EReference getExit_Next();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.ControlFlow <em>Control Flow</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Control Flow</em>'.
     * @see de.cau.cs.kieler.scg.ControlFlow
     * @generated
     */
	EClass getControlFlow();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Dependency <em>Dependency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dependency</em>'.
     * @see de.cau.cs.kieler.scg.Dependency
     * @generated
     */
    EClass getDependency();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.DataDependency <em>Data Dependency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Dependency</em>'.
     * @see de.cau.cs.kieler.scg.DataDependency
     * @generated
     */
    EClass getDataDependency();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.DataDependency#isConcurrent <em>Concurrent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Concurrent</em>'.
     * @see de.cau.cs.kieler.scg.DataDependency#isConcurrent()
     * @see #getDataDependency()
     * @generated
     */
    EAttribute getDataDependency_Concurrent();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.DataDependency#isConfluent <em>Confluent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Confluent</em>'.
     * @see de.cau.cs.kieler.scg.DataDependency#isConfluent()
     * @see #getDataDependency()
     * @generated
     */
    EAttribute getDataDependency_Confluent();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.DataDependency#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.scg.DataDependency#getType()
     * @see #getDataDependency()
     * @generated
     */
	EAttribute getDataDependency_Type();

				/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.ControlDependency <em>Control Dependency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Control Dependency</em>'.
     * @see de.cau.cs.kieler.scg.ControlDependency
     * @generated
     */
    EClass getControlDependency();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.BasicBlock <em>Basic Block</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Basic Block</em>'.
     * @see de.cau.cs.kieler.scg.BasicBlock
     * @generated
     */
	EClass getBasicBlock();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.BasicBlock#getSchedulingBlocks <em>Scheduling Blocks</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Scheduling Blocks</em>'.
     * @see de.cau.cs.kieler.scg.BasicBlock#getSchedulingBlocks()
     * @see #getBasicBlock()
     * @generated
     */
	EReference getBasicBlock_SchedulingBlocks();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.BasicBlock#getPredecessors <em>Predecessors</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Predecessors</em>'.
     * @see de.cau.cs.kieler.scg.BasicBlock#getPredecessors()
     * @see #getBasicBlock()
     * @generated
     */
	EReference getBasicBlock_Predecessors();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.BasicBlock#isGoBlock <em>Go Block</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Go Block</em>'.
     * @see de.cau.cs.kieler.scg.BasicBlock#isGoBlock()
     * @see #getBasicBlock()
     * @generated
     */
	EAttribute getBasicBlock_GoBlock();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.BasicBlock#isDepthBlock <em>Depth Block</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Depth Block</em>'.
     * @see de.cau.cs.kieler.scg.BasicBlock#isDepthBlock()
     * @see #getBasicBlock()
     * @generated
     */
	EAttribute getBasicBlock_DepthBlock();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.BasicBlock#isSynchronizerBlock <em>Synchronizer Block</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Synchronizer Block</em>'.
     * @see de.cau.cs.kieler.scg.BasicBlock#isSynchronizerBlock()
     * @see #getBasicBlock()
     * @generated
     */
	EAttribute getBasicBlock_SynchronizerBlock();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.BasicBlock#isEntryBlock <em>Entry Block</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Entry Block</em>'.
     * @see de.cau.cs.kieler.scg.BasicBlock#isEntryBlock()
     * @see #getBasicBlock()
     * @generated
     */
	EAttribute getBasicBlock_EntryBlock();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.BasicBlock#isDeadBlock <em>Dead Block</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dead Block</em>'.
     * @see de.cau.cs.kieler.scg.BasicBlock#isDeadBlock()
     * @see #getBasicBlock()
     * @generated
     */
	EAttribute getBasicBlock_DeadBlock();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.BasicBlock#isTermBlock <em>Term Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Term Block</em>'.
     * @see de.cau.cs.kieler.scg.BasicBlock#isTermBlock()
     * @see #getBasicBlock()
     * @generated
     */
    EAttribute getBasicBlock_TermBlock();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.BasicBlock#getPreGuard <em>Pre Guard</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Pre Guard</em>'.
     * @see de.cau.cs.kieler.scg.BasicBlock#getPreGuard()
     * @see #getBasicBlock()
     * @generated
     */
	EReference getBasicBlock_PreGuard();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.SchedulingBlock <em>Scheduling Block</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scheduling Block</em>'.
     * @see de.cau.cs.kieler.scg.SchedulingBlock
     * @generated
     */
	EClass getSchedulingBlock();

	/**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.scg.SchedulingBlock#getNodes <em>Nodes</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Nodes</em>'.
     * @see de.cau.cs.kieler.scg.SchedulingBlock#getNodes()
     * @see #getSchedulingBlock()
     * @generated
     */
	EReference getSchedulingBlock_Nodes();

	/**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.scg.SchedulingBlock#getDependencies <em>Dependencies</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Dependencies</em>'.
     * @see de.cau.cs.kieler.scg.SchedulingBlock#getDependencies()
     * @see #getSchedulingBlock()
     * @generated
     */
	EReference getSchedulingBlock_Dependencies();

	/**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.scg.SchedulingBlock#getGuards <em>Guards</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Guards</em>'.
     * @see de.cau.cs.kieler.scg.SchedulingBlock#getGuards()
     * @see #getSchedulingBlock()
     * @generated
     */
	EReference getSchedulingBlock_Guards();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.SchedulingBlock#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see de.cau.cs.kieler.scg.SchedulingBlock#getLabel()
     * @see #getSchedulingBlock()
     * @generated
     */
    EAttribute getSchedulingBlock_Label();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Predecessor <em>Predecessor</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Predecessor</em>'.
     * @see de.cau.cs.kieler.scg.Predecessor
     * @generated
     */
	EClass getPredecessor();

	/**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Predecessor#getBasicBlock <em>Basic Block</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Basic Block</em>'.
     * @see de.cau.cs.kieler.scg.Predecessor#getBasicBlock()
     * @see #getPredecessor()
     * @generated
     */
	EReference getPredecessor_BasicBlock();

	/**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Predecessor#getConditional <em>Conditional</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Conditional</em>'.
     * @see de.cau.cs.kieler.scg.Predecessor#getConditional()
     * @see #getPredecessor()
     * @generated
     */
	EReference getPredecessor_Conditional();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.Predecessor#getBranchType <em>Branch Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Branch Type</em>'.
     * @see de.cau.cs.kieler.scg.Predecessor#getBranchType()
     * @see #getPredecessor()
     * @generated
     */
	EAttribute getPredecessor_BranchType();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.ExpressionDependency <em>Expression Dependency</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Expression Dependency</em>'.
     * @see de.cau.cs.kieler.scg.ExpressionDependency
     * @generated
     */
	EClass getExpressionDependency();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.GuardDependency <em>Guard Dependency</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Guard Dependency</em>'.
     * @see de.cau.cs.kieler.scg.GuardDependency
     * @generated
     */
	EClass getGuardDependency();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.ScheduleDependency <em>Schedule Dependency</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Schedule Dependency</em>'.
     * @see de.cau.cs.kieler.scg.ScheduleDependency
     * @generated
     */
	EClass getScheduleDependency();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Guard <em>Guard</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Guard</em>'.
     * @see de.cau.cs.kieler.scg.Guard
     * @generated
     */
	EClass getGuard();

	/**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.scg.BranchType <em>Branch Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Branch Type</em>'.
     * @see de.cau.cs.kieler.scg.BranchType
     * @generated
     */
	EEnum getBranchType();

	/**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.scg.DataDependencyType <em>Data Dependency Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Data Dependency Type</em>'.
     * @see de.cau.cs.kieler.scg.DataDependencyType
     * @generated
     */
	EEnum getDataDependencyType();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	ScgFactory getScgFactory();

	/**
     * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
     * @generated
     */
	interface Literals {
		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.SCGraphsImpl <em>SC Graphs</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.SCGraphsImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getSCGraphs()
         * @generated
         */
        EClass SC_GRAPHS = eINSTANCE.getSCGraphs();

        /**
         * The meta object literal for the '<em><b>Scgs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SC_GRAPHS__SCGS = eINSTANCE.getSCGraphs_Scgs();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.SCGraphImpl <em>SC Graph</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.SCGraphImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getSCGraph()
         * @generated
         */
		EClass SC_GRAPH = eINSTANCE.getSCGraph();

		/**
         * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SC_GRAPH__NODES = eINSTANCE.getSCGraph_Nodes();

		/**
         * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SC_GRAPH__DECLARATIONS = eINSTANCE.getSCGraph_Declarations();

		/**
         * The meta object literal for the '<em><b>Basic Blocks</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SC_GRAPH__BASIC_BLOCKS = eINSTANCE.getSCGraph_BasicBlocks();

		/**
         * The meta object literal for the '<em><b>Guards</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SC_GRAPH__GUARDS = eINSTANCE.getSCGraph_Guards();

		/**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SC_GRAPH__LABEL = eINSTANCE.getSCGraph_Label();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.NodeImpl <em>Node</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.NodeImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getNode()
         * @generated
         */
		EClass NODE = eINSTANCE.getNode();

		/**
         * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
         * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute NODE__IS_INITIAL = eINSTANCE.getNode_IsInitial();

		/**
         * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference NODE__DEPENDENCIES = eINSTANCE.getNode_Dependencies();

		/**
         * The meta object literal for the '<em><b>Schizophrenic</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE__SCHIZOPHRENIC = eINSTANCE.getNode_Schizophrenic();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.ConditionalImpl <em>Conditional</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.ConditionalImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getConditional()
         * @generated
         */
		EClass CONDITIONAL = eINSTANCE.getConditional();

		/**
         * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CONDITIONAL__THEN = eINSTANCE.getConditional_Then();

		/**
         * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CONDITIONAL__ELSE = eINSTANCE.getConditional_Else();

		/**
         * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CONDITIONAL__CONDITION = eINSTANCE.getConditional_Condition();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.SurfaceImpl <em>Surface</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.SurfaceImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getSurface()
         * @generated
         */
		EClass SURFACE = eINSTANCE.getSurface();

		/**
         * The meta object literal for the '<em><b>Depth</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SURFACE__DEPTH = eINSTANCE.getSurface_Depth();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.DepthImpl <em>Depth</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.DepthImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getDepth()
         * @generated
         */
		EClass DEPTH = eINSTANCE.getDepth();

		/**
         * The meta object literal for the '<em><b>Surface</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DEPTH__SURFACE = eINSTANCE.getDepth_Surface();

		/**
         * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DEPTH__NEXT = eINSTANCE.getDepth_Next();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.AssignmentImpl <em>Assignment</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.AssignmentImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getAssignment()
         * @generated
         */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
         * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ASSIGNMENT__NEXT = eINSTANCE.getAssignment_Next();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.ForkImpl <em>Fork</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.ForkImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getFork()
         * @generated
         */
		EClass FORK = eINSTANCE.getFork();

		/**
         * The meta object literal for the '<em><b>Join</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference FORK__JOIN = eINSTANCE.getFork_Join();

		/**
         * The meta object literal for the '<em><b>Next</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference FORK__NEXT = eINSTANCE.getFork_Next();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.JoinImpl <em>Join</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.JoinImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getJoin()
         * @generated
         */
		EClass JOIN = eINSTANCE.getJoin();

		/**
         * The meta object literal for the '<em><b>Fork</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference JOIN__FORK = eINSTANCE.getJoin_Fork();

		/**
         * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference JOIN__NEXT = eINSTANCE.getJoin_Next();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.LinkImpl <em>Link</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.LinkImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getLink()
         * @generated
         */
		EClass LINK = eINSTANCE.getLink();

		/**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference LINK__TARGET = eINSTANCE.getLink_Target();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.EntryImpl <em>Entry</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.EntryImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getEntry()
         * @generated
         */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
         * The meta object literal for the '<em><b>Exit</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ENTRY__EXIT = eINSTANCE.getEntry_Exit();

		/**
         * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ENTRY__NEXT = eINSTANCE.getEntry_Next();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.ExitImpl <em>Exit</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.ExitImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getExit()
         * @generated
         */
		EClass EXIT = eINSTANCE.getExit();

		/**
         * The meta object literal for the '<em><b>Entry</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference EXIT__ENTRY = eINSTANCE.getExit_Entry();

		/**
         * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference EXIT__NEXT = eINSTANCE.getExit_Next();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.ControlFlowImpl <em>Control Flow</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.ControlFlowImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getControlFlow()
         * @generated
         */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.DependencyImpl <em>Dependency</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.DependencyImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getDependency()
         * @generated
         */
        EClass DEPENDENCY = eINSTANCE.getDependency();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.DataDependencyImpl <em>Data Dependency</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.DataDependencyImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getDataDependency()
         * @generated
         */
        EClass DATA_DEPENDENCY = eINSTANCE.getDataDependency();

        /**
         * The meta object literal for the '<em><b>Concurrent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_DEPENDENCY__CONCURRENT = eINSTANCE.getDataDependency_Concurrent();

        /**
         * The meta object literal for the '<em><b>Confluent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_DEPENDENCY__CONFLUENT = eINSTANCE.getDataDependency_Confluent();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute DATA_DEPENDENCY__TYPE = eINSTANCE.getDataDependency_Type();

								/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.ControlDependencyImpl <em>Control Dependency</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.ControlDependencyImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getControlDependency()
         * @generated
         */
        EClass CONTROL_DEPENDENCY = eINSTANCE.getControlDependency();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.BasicBlockImpl <em>Basic Block</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.BasicBlockImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getBasicBlock()
         * @generated
         */
		EClass BASIC_BLOCK = eINSTANCE.getBasicBlock();

		/**
         * The meta object literal for the '<em><b>Scheduling Blocks</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference BASIC_BLOCK__SCHEDULING_BLOCKS = eINSTANCE.getBasicBlock_SchedulingBlocks();

		/**
         * The meta object literal for the '<em><b>Predecessors</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference BASIC_BLOCK__PREDECESSORS = eINSTANCE.getBasicBlock_Predecessors();

		/**
         * The meta object literal for the '<em><b>Go Block</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute BASIC_BLOCK__GO_BLOCK = eINSTANCE.getBasicBlock_GoBlock();

		/**
         * The meta object literal for the '<em><b>Depth Block</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute BASIC_BLOCK__DEPTH_BLOCK = eINSTANCE.getBasicBlock_DepthBlock();

		/**
         * The meta object literal for the '<em><b>Synchronizer Block</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute BASIC_BLOCK__SYNCHRONIZER_BLOCK = eINSTANCE.getBasicBlock_SynchronizerBlock();

		/**
         * The meta object literal for the '<em><b>Entry Block</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute BASIC_BLOCK__ENTRY_BLOCK = eINSTANCE.getBasicBlock_EntryBlock();

		/**
         * The meta object literal for the '<em><b>Dead Block</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute BASIC_BLOCK__DEAD_BLOCK = eINSTANCE.getBasicBlock_DeadBlock();

		/**
         * The meta object literal for the '<em><b>Term Block</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASIC_BLOCK__TERM_BLOCK = eINSTANCE.getBasicBlock_TermBlock();

        /**
         * The meta object literal for the '<em><b>Pre Guard</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference BASIC_BLOCK__PRE_GUARD = eINSTANCE.getBasicBlock_PreGuard();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.SchedulingBlockImpl <em>Scheduling Block</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.SchedulingBlockImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getSchedulingBlock()
         * @generated
         */
		EClass SCHEDULING_BLOCK = eINSTANCE.getSchedulingBlock();

		/**
         * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SCHEDULING_BLOCK__NODES = eINSTANCE.getSchedulingBlock_Nodes();

		/**
         * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SCHEDULING_BLOCK__DEPENDENCIES = eINSTANCE.getSchedulingBlock_Dependencies();

		/**
         * The meta object literal for the '<em><b>Guards</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SCHEDULING_BLOCK__GUARDS = eINSTANCE.getSchedulingBlock_Guards();

		/**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULING_BLOCK__LABEL = eINSTANCE.getSchedulingBlock_Label();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.PredecessorImpl <em>Predecessor</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.PredecessorImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getPredecessor()
         * @generated
         */
		EClass PREDECESSOR = eINSTANCE.getPredecessor();

		/**
         * The meta object literal for the '<em><b>Basic Block</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference PREDECESSOR__BASIC_BLOCK = eINSTANCE.getPredecessor_BasicBlock();

		/**
         * The meta object literal for the '<em><b>Conditional</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference PREDECESSOR__CONDITIONAL = eINSTANCE.getPredecessor_Conditional();

		/**
         * The meta object literal for the '<em><b>Branch Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PREDECESSOR__BRANCH_TYPE = eINSTANCE.getPredecessor_BranchType();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.ExpressionDependencyImpl <em>Expression Dependency</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.ExpressionDependencyImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getExpressionDependency()
         * @generated
         */
		EClass EXPRESSION_DEPENDENCY = eINSTANCE.getExpressionDependency();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.GuardDependencyImpl <em>Guard Dependency</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.GuardDependencyImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getGuardDependency()
         * @generated
         */
		EClass GUARD_DEPENDENCY = eINSTANCE.getGuardDependency();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.ScheduleDependencyImpl <em>Schedule Dependency</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.ScheduleDependencyImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getScheduleDependency()
         * @generated
         */
		EClass SCHEDULE_DEPENDENCY = eINSTANCE.getScheduleDependency();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.GuardImpl <em>Guard</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.impl.GuardImpl
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getGuard()
         * @generated
         */
		EClass GUARD = eINSTANCE.getGuard();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.BranchType <em>Branch Type</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.BranchType
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getBranchType()
         * @generated
         */
		EEnum BRANCH_TYPE = eINSTANCE.getBranchType();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.scg.DataDependencyType <em>Data Dependency Type</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scg.DataDependencyType
         * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getDataDependencyType()
         * @generated
         */
		EEnum DATA_DEPENDENCY_TYPE = eINSTANCE.getDataDependencyType();

	}

} //ScgPackage
