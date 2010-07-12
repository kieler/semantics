/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.Classifier;
import uml.ClassifierTemplateParameter;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ClassifierTemplateParameterImpl#isAllowSubstitutable <em>Allow Substitutable</em>}</li>
 *   <li>{@link uml.impl.ClassifierTemplateParameterImpl#getConstrainingClassifier <em>Constraining Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierTemplateParameterImpl extends TemplateParameterImpl implements ClassifierTemplateParameter {
    /**
     * The default value of the '{@link #isAllowSubstitutable() <em>Allow Substitutable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAllowSubstitutable()
     * @generated
     * @ordered
     */
    protected static final boolean ALLOW_SUBSTITUTABLE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isAllowSubstitutable() <em>Allow Substitutable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAllowSubstitutable()
     * @generated
     * @ordered
     */
    protected boolean allowSubstitutable = ALLOW_SUBSTITUTABLE_EDEFAULT;

    /**
     * The cached value of the '{@link #getConstrainingClassifier() <em>Constraining Classifier</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstrainingClassifier()
     * @generated
     * @ordered
     */
    protected EList<Classifier> constrainingClassifier;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClassifierTemplateParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getClassifierTemplateParameter();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAllowSubstitutable() {
        return allowSubstitutable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAllowSubstitutable(boolean newAllowSubstitutable) {
        boolean oldAllowSubstitutable = allowSubstitutable;
        allowSubstitutable = newAllowSubstitutable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE, oldAllowSubstitutable, allowSubstitutable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Classifier> getConstrainingClassifier() {
        if (constrainingClassifier == null) {
            constrainingClassifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, UmlPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER);
        }
        return constrainingClassifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean has_constraining_classifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         UmlValidator.DIAGNOSTIC_SOURCE,
                         UmlValidator.CLASSIFIER_TEMPLATE_PARAMETER__HAS_CONSTRAINING_CLASSIFIER,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "has_constraining_classifier", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE:
                return isAllowSubstitutable();
            case UmlPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER:
                return getConstrainingClassifier();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case UmlPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE:
                setAllowSubstitutable((Boolean)newValue);
                return;
            case UmlPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER:
                getConstrainingClassifier().clear();
                getConstrainingClassifier().addAll((Collection<? extends Classifier>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case UmlPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE:
                setAllowSubstitutable(ALLOW_SUBSTITUTABLE_EDEFAULT);
                return;
            case UmlPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER:
                getConstrainingClassifier().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case UmlPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE:
                return allowSubstitutable != ALLOW_SUBSTITUTABLE_EDEFAULT;
            case UmlPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER:
                return constrainingClassifier != null && !constrainingClassifier.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (allowSubstitutable: ");
        result.append(allowSubstitutable);
        result.append(')');
        return result.toString();
    }

} //ClassifierTemplateParameterImpl
