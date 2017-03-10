/**
 */
package de.cau.cs.kieler.scl.scl.impl;

import de.cau.cs.kieler.scl.scl.Assignment;
import de.cau.cs.kieler.scl.scl.Conditional;
import de.cau.cs.kieler.scl.scl.ElseScope;
import de.cau.cs.kieler.scl.scl.Goto;
import de.cau.cs.kieler.scl.scl.Label;
import de.cau.cs.kieler.scl.scl.Parallel;
import de.cau.cs.kieler.scl.scl.Pause;
import de.cau.cs.kieler.scl.scl.SCLProgram;
import de.cau.cs.kieler.scl.scl.SclFactory;
import de.cau.cs.kieler.scl.scl.SclPackage;
import de.cau.cs.kieler.scl.scl.ScopeStatement;

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
public class SclFactoryImpl extends EFactoryImpl implements SclFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SclFactory init() {
        try {
            SclFactory theSclFactory = (SclFactory)EPackage.Registry.INSTANCE.getEFactory(SclPackage.eNS_URI);
            if (theSclFactory != null) {
                return theSclFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SclFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SclFactoryImpl() {
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
            case SclPackage.SCL_PROGRAM: return createSCLProgram();
            case SclPackage.PAUSE: return createPause();
            case SclPackage.LABEL: return createLabel();
            case SclPackage.GOTO: return createGoto();
            case SclPackage.ASSIGNMENT: return createAssignment();
            case SclPackage.CONDITIONAL: return createConditional();
            case SclPackage.PARALLEL: return createParallel();
            case SclPackage.THREAD: return createThread();
            case SclPackage.SCOPE_STATEMENT: return createScopeStatement();
            case SclPackage.ELSE_SCOPE: return createElseScope();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCLProgram createSCLProgram() {
        SCLProgramImpl sclProgram = new SCLProgramImpl();
        return sclProgram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Pause createPause() {
        PauseImpl pause = new PauseImpl();
        return pause;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Label createLabel() {
        LabelImpl label = new LabelImpl();
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Goto createGoto() {
        GotoImpl goto_ = new GotoImpl();
        return goto_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Assignment createAssignment() {
        AssignmentImpl assignment = new AssignmentImpl();
        return assignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Conditional createConditional() {
        ConditionalImpl conditional = new ConditionalImpl();
        return conditional;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Parallel createParallel() {
        ParallelImpl parallel = new ParallelImpl();
        return parallel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cau.cs.kieler.scl.scl.Thread createThread() {
        ThreadImpl thread = new ThreadImpl();
        return thread;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScopeStatement createScopeStatement() {
        ScopeStatementImpl scopeStatement = new ScopeStatementImpl();
        return scopeStatement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElseScope createElseScope() {
        ElseScopeImpl elseScope = new ElseScopeImpl();
        return elseScope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SclPackage getSclPackage() {
        return (SclPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SclPackage getPackage() {
        return SclPackage.eINSTANCE;
    }

} //SclFactoryImpl
