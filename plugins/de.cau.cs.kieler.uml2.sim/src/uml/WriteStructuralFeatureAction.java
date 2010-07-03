/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Structural Feature Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * WriteStructuralFeatureAction is an abstract class for structural feature actions that change structural feature values.
 * <!-- end-model-doc -->
 *
 *
 * @see uml.UmlPackage#getWriteStructuralFeatureAction()
 * @model abstract="true"
 * @generated
 */
public interface WriteStructuralFeatureAction extends StructuralFeatureAction {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type input pin is the same as the classifier of the structural feature.
     * self.value.type = self.structuralFeature.featuringClassifier
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean input_pin(DiagnosticChain diagnostics, Map<Object, Object> context);

} // WriteStructuralFeatureAction
