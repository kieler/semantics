/**
 */
package de.cau.cs.kieler.scl.impl;

import de.cau.cs.kieler.annotations.AnnotationsPackage;

import de.cau.cs.kieler.kexpressions.KExpressionsPackage;

import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;

import de.cau.cs.kieler.kexpressions.kext.KExtPackage;

import de.cau.cs.kieler.scl.Assignment;
import de.cau.cs.kieler.scl.Conditional;
import de.cau.cs.kieler.scl.ElseScope;
import de.cau.cs.kieler.scl.ForkType;
import de.cau.cs.kieler.scl.Goto;
import de.cau.cs.kieler.scl.Label;
import de.cau.cs.kieler.scl.Loop;
import de.cau.cs.kieler.scl.MethodImplementationDeclaration;
import de.cau.cs.kieler.scl.ModuleCall;
import de.cau.cs.kieler.scl.Parallel;
import de.cau.cs.kieler.scl.Pause;
import de.cau.cs.kieler.scl.Return;
import de.cau.cs.kieler.scl.SCLFactory;
import de.cau.cs.kieler.scl.SCLPackage;
import de.cau.cs.kieler.scl.SCLProgram;
import de.cau.cs.kieler.scl.Scope;
import de.cau.cs.kieler.scl.ScopeStatement;
import de.cau.cs.kieler.scl.SequencePart;
import de.cau.cs.kieler.scl.Statement;
import de.cau.cs.kieler.scl.StatementContainer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SCLPackageImpl extends EPackageImpl implements SCLPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sclProgramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass statementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass statementContainerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scopeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pauseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass labelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gotoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conditionalEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parallelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleCallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass threadEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scopeStatementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass elseScopeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sequencePartEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass returnEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass methodImplementationDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass loopEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum forkTypeEEnum = null;

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
     * @see de.cau.cs.kieler.scl.SCLPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SCLPackageImpl() {
        super(eNS_URI, SCLFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link SCLPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SCLPackage init() {
        if (isInited) return (SCLPackage)EPackage.Registry.INSTANCE.getEPackage(SCLPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredSCLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        SCLPackageImpl theSCLPackage = registeredSCLPackage instanceof SCLPackageImpl ? (SCLPackageImpl)registeredSCLPackage : new SCLPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        AnnotationsPackage.eINSTANCE.eClass();
        KEffectsPackage.eINSTANCE.eClass();
        KExpressionsPackage.eINSTANCE.eClass();
        KExtPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theSCLPackage.createPackageContents();

        // Initialize created meta-data
        theSCLPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSCLPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SCLPackage.eNS_URI, theSCLPackage);
        return theSCLPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSCLProgram() {
        return sclProgramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSCLProgram_Modules() {
        return (EReference)sclProgramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModule() {
        return moduleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getStatement() {
        return statementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getStatementContainer() {
        return statementContainerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getStatementContainer_Statements() {
        return (EReference)statementContainerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getScope() {
        return scopeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPause() {
        return pauseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLabel() {
        return labelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGoto() {
        return gotoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGoto_Target() {
        return (EReference)gotoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssignment() {
        return assignmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConditional() {
        return conditionalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConditional_Expression() {
        return (EReference)conditionalEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConditional_Else() {
        return (EReference)conditionalEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getParallel() {
        return parallelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getParallel_Threads() {
        return (EReference)parallelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getParallel_JoinAny() {
        return (EAttribute)parallelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getParallel_ForkType() {
        return (EAttribute)parallelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModuleCall() {
        return moduleCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModuleCall_Module() {
        return (EReference)moduleCallEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getThread() {
        return threadEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getScopeStatement() {
        return scopeStatementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getElseScope() {
        return elseScopeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSequencePart() {
        return sequencePartEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSequencePart_Semicolon() {
        return (EAttribute)sequencePartEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getReturn() {
        return returnEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReturn_Expression() {
        return (EReference)returnEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMethodImplementationDeclaration() {
        return methodImplementationDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMethodImplementationDeclaration_Implemented() {
        return (EAttribute)methodImplementationDeclarationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLoop() {
        return loopEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLoop_Initialization() {
        return (EReference)loopEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLoop_InitializationDeclaration() {
        return (EReference)loopEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLoop_Condition() {
        return (EReference)loopEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLoop_Afterthought() {
        return (EReference)loopEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getForkType() {
        return forkTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SCLFactory getSCLFactory() {
        return (SCLFactory)getEFactoryInstance();
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
        sclProgramEClass = createEClass(SCL_PROGRAM);
        createEReference(sclProgramEClass, SCL_PROGRAM__MODULES);

        moduleEClass = createEClass(MODULE);

        statementEClass = createEClass(STATEMENT);

        statementContainerEClass = createEClass(STATEMENT_CONTAINER);
        createEReference(statementContainerEClass, STATEMENT_CONTAINER__STATEMENTS);

        scopeEClass = createEClass(SCOPE);

        pauseEClass = createEClass(PAUSE);

        labelEClass = createEClass(LABEL);

        gotoEClass = createEClass(GOTO);
        createEReference(gotoEClass, GOTO__TARGET);

        assignmentEClass = createEClass(ASSIGNMENT);

        conditionalEClass = createEClass(CONDITIONAL);
        createEReference(conditionalEClass, CONDITIONAL__EXPRESSION);
        createEReference(conditionalEClass, CONDITIONAL__ELSE);

        parallelEClass = createEClass(PARALLEL);
        createEReference(parallelEClass, PARALLEL__THREADS);
        createEAttribute(parallelEClass, PARALLEL__JOIN_ANY);
        createEAttribute(parallelEClass, PARALLEL__FORK_TYPE);

        moduleCallEClass = createEClass(MODULE_CALL);
        createEReference(moduleCallEClass, MODULE_CALL__MODULE);

        threadEClass = createEClass(THREAD);

        scopeStatementEClass = createEClass(SCOPE_STATEMENT);

        elseScopeEClass = createEClass(ELSE_SCOPE);

        sequencePartEClass = createEClass(SEQUENCE_PART);
        createEAttribute(sequencePartEClass, SEQUENCE_PART__SEMICOLON);

        returnEClass = createEClass(RETURN);
        createEReference(returnEClass, RETURN__EXPRESSION);

        methodImplementationDeclarationEClass = createEClass(METHOD_IMPLEMENTATION_DECLARATION);
        createEAttribute(methodImplementationDeclarationEClass, METHOD_IMPLEMENTATION_DECLARATION__IMPLEMENTED);

        loopEClass = createEClass(LOOP);
        createEReference(loopEClass, LOOP__INITIALIZATION);
        createEReference(loopEClass, LOOP__INITIALIZATION_DECLARATION);
        createEReference(loopEClass, LOOP__CONDITION);
        createEReference(loopEClass, LOOP__AFTERTHOUGHT);

        // Create enums
        forkTypeEEnum = createEEnum(FORK_TYPE);
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
        AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
        KExtPackage theKExtPackage = (KExtPackage)EPackage.Registry.INSTANCE.getEPackage(KExtPackage.eNS_URI);
        KEffectsPackage theKEffectsPackage = (KEffectsPackage)EPackage.Registry.INSTANCE.getEPackage(KEffectsPackage.eNS_URI);
        KExpressionsPackage theKExpressionsPackage = (KExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(KExpressionsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        sclProgramEClass.getESuperTypes().add(theAnnotationsPackage.getPragmatable());
        sclProgramEClass.getESuperTypes().add(theAnnotationsPackage.getNameable());
        moduleEClass.getESuperTypes().add(this.getScope());
        moduleEClass.getESuperTypes().add(theAnnotationsPackage.getNamedObject());
        statementEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        statementEClass.getESuperTypes().add(this.getSequencePart());
        statementContainerEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        scopeEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        scopeEClass.getESuperTypes().add(theKExtPackage.getDeclarationScope());
        scopeEClass.getESuperTypes().add(this.getStatementContainer());
        pauseEClass.getESuperTypes().add(this.getStatement());
        labelEClass.getESuperTypes().add(this.getStatement());
        labelEClass.getESuperTypes().add(theAnnotationsPackage.getNamedObject());
        gotoEClass.getESuperTypes().add(this.getStatement());
        assignmentEClass.getESuperTypes().add(theKEffectsPackage.getAssignment());
        assignmentEClass.getESuperTypes().add(this.getStatement());
        conditionalEClass.getESuperTypes().add(this.getScope());
        conditionalEClass.getESuperTypes().add(this.getStatement());
        parallelEClass.getESuperTypes().add(this.getStatement());
        moduleCallEClass.getESuperTypes().add(theKExpressionsPackage.getCall());
        moduleCallEClass.getESuperTypes().add(this.getStatement());
        threadEClass.getESuperTypes().add(this.getScope());
        scopeStatementEClass.getESuperTypes().add(this.getStatement());
        scopeStatementEClass.getESuperTypes().add(this.getScope());
        elseScopeEClass.getESuperTypes().add(this.getScope());
        elseScopeEClass.getESuperTypes().add(this.getSequencePart());
        returnEClass.getESuperTypes().add(this.getStatement());
        methodImplementationDeclarationEClass.getESuperTypes().add(theKExpressionsPackage.getMethodDeclaration());
        methodImplementationDeclarationEClass.getESuperTypes().add(this.getScope());
        loopEClass.getESuperTypes().add(this.getStatement());
        loopEClass.getESuperTypes().add(this.getScope());

        // Initialize classes and features; add operations and parameters
        initEClass(sclProgramEClass, SCLProgram.class, "SCLProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSCLProgram_Modules(), this.getModule(), null, "modules", null, 1, -1, SCLProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(moduleEClass, de.cau.cs.kieler.scl.Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(statementContainerEClass, StatementContainer.class, "StatementContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStatementContainer_Statements(), this.getStatement(), null, "statements", null, 0, -1, StatementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(scopeEClass, Scope.class, "Scope", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(pauseEClass, Pause.class, "Pause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(gotoEClass, Goto.class, "Goto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGoto_Target(), this.getLabel(), null, "target", null, 1, 1, Goto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(conditionalEClass, Conditional.class, "Conditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConditional_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConditional_Else(), this.getScope(), null, "else", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getParallel_Threads(), this.getThread(), null, "threads", null, 0, -1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParallel_JoinAny(), ecorePackage.getEBoolean(), "joinAny", null, 0, 1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParallel_ForkType(), this.getForkType(), "forkType", "PARALLEL", 1, 1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(moduleCallEClass, ModuleCall.class, "ModuleCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModuleCall_Module(), this.getModule(), null, "module", null, 1, 1, ModuleCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(threadEClass, de.cau.cs.kieler.scl.Thread.class, "Thread", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(scopeStatementEClass, ScopeStatement.class, "ScopeStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(elseScopeEClass, ElseScope.class, "ElseScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(sequencePartEClass, SequencePart.class, "SequencePart", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSequencePart_Semicolon(), ecorePackage.getEBoolean(), "semicolon", "false", 1, 1, SequencePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getReturn_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 1, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(methodImplementationDeclarationEClass, MethodImplementationDeclaration.class, "MethodImplementationDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMethodImplementationDeclaration_Implemented(), ecorePackage.getEBoolean(), "implemented", null, 1, 1, MethodImplementationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLoop_Initialization(), theKEffectsPackage.getAssignment(), null, "initialization", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLoop_InitializationDeclaration(), theKExpressionsPackage.getVariableDeclaration(), null, "initializationDeclaration", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLoop_Condition(), theKExpressionsPackage.getExpression(), null, "condition", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLoop_Afterthought(), theKEffectsPackage.getAssignment(), null, "afterthought", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(forkTypeEEnum, ForkType.class, "ForkType");
        addEEnumLiteral(forkTypeEEnum, ForkType.PARALLEL);
        addEEnumLiteral(forkTypeEEnum, ForkType.SEQUENTIAL);
        addEEnumLiteral(forkTypeEEnum, ForkType.SEQUENTIAL_PREEMPTIVE);

        // Create resource
        createResource(eNS_URI);
    }

} //SCLPackageImpl
