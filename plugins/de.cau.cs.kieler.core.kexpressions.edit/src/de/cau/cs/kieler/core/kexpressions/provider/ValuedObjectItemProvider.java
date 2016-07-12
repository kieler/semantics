/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.core.kexpressions.provider;


import de.cau.cs.kieler.core.annotations.AnnotationsFactory;
import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.core.annotations.provider.AnnotatableItemProvider;

import de.cau.cs.kieler.core.annotations.provider.NamedObjectItemProvider;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.core.kexpressions.ValuedObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ValuedObjectItemProvider
    extends NamedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObjectItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addCombineOperatorPropertyDescriptor(object);
            addInitialValuePropertyDescriptor(object);
            addCardinalitiesPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Initial Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInitialValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ValuedObject_initialValue_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ValuedObject_initialValue_feature", "_UI_ValuedObject_type"),
                 KExpressionsPackage.Literals.VALUED_OBJECT__INITIAL_VALUE,
                 true,
                 false,
                 false,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Cardinalities feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addCardinalitiesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ValuedObject_cardinalities_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ValuedObject_cardinalities_feature", "_UI_ValuedObject_type"),
                 KExpressionsPackage.Literals.VALUED_OBJECT__CARDINALITIES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

				/**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

                /**
     * This adds a property descriptor for the Combine Operator feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCombineOperatorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ValuedObject_combineOperator_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ValuedObject_combineOperator_feature", "_UI_ValuedObject_type"),
                 KExpressionsPackage.Literals.VALUED_OBJECT__COMBINE_OPERATOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns ValuedObject.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ValuedObject"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((ValuedObject)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_ValuedObject_type") :
            getString("_UI_ValuedObject_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(ValuedObject.class)) {
            case KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR:
            case KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE:
            case KExpressionsPackage.VALUED_OBJECT__CARDINALITIES:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case KExpressionsPackage.VALUED_OBJECT__ANNOTATIONS:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
                 AnnotationsFactory.eINSTANCE.createAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
                 AnnotationsFactory.eINSTANCE.createStringAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
                 AnnotationsFactory.eINSTANCE.createReferenceAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
                 AnnotationsFactory.eINSTANCE.createBooleanAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
                 AnnotationsFactory.eINSTANCE.createIntAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
                 AnnotationsFactory.eINSTANCE.createFloatAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
                 AnnotationsFactory.eINSTANCE.createContainmentAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
                 AnnotationsFactory.eINSTANCE.createImportAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
                 AnnotationsFactory.eINSTANCE.createTypedStringAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
                 AnnotationsFactory.eINSTANCE.createCommentAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
                 AnnotationsFactory.eINSTANCE.createPragmaAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
                 AnnotationsFactory.eINSTANCE.createPragmaStringAnnotation()));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return KExpressionsEditPlugin.INSTANCE;
    }

}
