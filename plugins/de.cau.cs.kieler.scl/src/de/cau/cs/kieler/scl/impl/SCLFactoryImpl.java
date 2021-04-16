/**
 */
package de.cau.cs.kieler.scl.impl;

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
import de.cau.cs.kieler.scl.ScopeStatement;

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
public class SCLFactoryImpl extends EFactoryImpl implements SCLFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SCLFactory init() {
        try {
            SCLFactory theSCLFactory = (SCLFactory)EPackage.Registry.INSTANCE.getEFactory(SCLPackage.eNS_URI);
            if (theSCLFactory != null) {
                return theSCLFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SCLFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCLFactoryImpl() {
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
            case SCLPackage.SCL_PROGRAM: return createSCLProgram();
            case SCLPackage.MODULE: return createModule();
            case SCLPackage.PAUSE: return createPause();
            case SCLPackage.LABEL: return createLabel();
            case SCLPackage.GOTO: return createGoto();
            case SCLPackage.ASSIGNMENT: return createAssignment();
            case SCLPackage.CONDITIONAL: return createConditional();
            case SCLPackage.PARALLEL: return createParallel();
            case SCLPackage.MODULE_CALL: return createModuleCall();
            case SCLPackage.THREAD: return createThread();
            case SCLPackage.SCOPE_STATEMENT: return createScopeStatement();
            case SCLPackage.ELSE_SCOPE: return createElseScope();
            case SCLPackage.RETURN: return createReturn();
            case SCLPackage.METHOD_IMPLEMENTATION_DECLARATION: return createMethodImplementationDeclaration();
            case SCLPackage.LOOP: return createLoop();
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
            case SCLPackage.FORK_TYPE:
                return createForkTypeFromString(eDataType, initialValue);
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
            case SCLPackage.FORK_TYPE:
                return convertForkTypeToString(eDataType, instanceValue);
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
    public SCLProgram createSCLProgram() {
        SCLProgramImpl sclProgram = new SCLProgramImpl();
        return sclProgram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public de.cau.cs.kieler.scl.Module createModule() {
        ModuleImpl module = new ModuleImpl();
        return module;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Pause createPause() {
        PauseImpl pause = new PauseImpl();
        return pause;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Label createLabel() {
        LabelImpl label = new LabelImpl();
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Goto createGoto() {
        GotoImpl goto_ = new GotoImpl();
        return goto_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Assignment createAssignment() {
        AssignmentImpl assignment = new AssignmentImpl();
        return assignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Conditional createConditional() {
        ConditionalImpl conditional = new ConditionalImpl();
        return conditional;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Parallel createParallel() {
        ParallelImpl parallel = new ParallelImpl();
        return parallel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ModuleCall createModuleCall() {
        ModuleCallImpl moduleCall = new ModuleCallImpl();
        return moduleCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public de.cau.cs.kieler.scl.Thread createThread() {
        ThreadImpl thread = new ThreadImpl();
        return thread;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ScopeStatement createScopeStatement() {
        ScopeStatementImpl scopeStatement = new ScopeStatementImpl();
        return scopeStatement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ElseScope createElseScope() {
        ElseScopeImpl elseScope = new ElseScopeImpl();
        return elseScope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Return createReturn() {
        ReturnImpl return_ = new ReturnImpl();
        return return_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MethodImplementationDeclaration createMethodImplementationDeclaration() {
        MethodImplementationDeclarationImpl methodImplementationDeclaration = new MethodImplementationDeclarationImpl();
        return methodImplementationDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Loop createLoop() {
        LoopImpl loop = new LoopImpl();
        return loop;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ForkType createForkTypeFromString(EDataType eDataType, String initialValue) {
        ForkType result = ForkType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertForkTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SCLPackage getSCLPackage() {
        return (SCLPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SCLPackage getPackage() {
        return SCLPackage.eINSTANCE;
    }

} //SCLFactoryImpl
