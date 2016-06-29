/**
 */
package de.cau.cs.kieler.core.kexpressions.keffects.provider;


import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;

import de.cau.cs.kieler.core.kexpressions.keffects.Emission;
import de.cau.cs.kieler.core.kexpressions.keffects.KEffectsFactory;
import de.cau.cs.kieler.core.kexpressions.keffects.KEffectsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.core.kexpressions.keffects.Emission} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EmissionItemProvider extends EffectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EmissionItemProvider(AdapterFactory adapterFactory) {
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

            addValuedObjectPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Valued Object feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValuedObjectPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Emission_valuedObject_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Emission_valuedObject_feature", "_UI_Emission_type"),
                 KEffectsPackage.Literals.EMISSION__VALUED_OBJECT,
                 true,
                 false,
                 true,
                 null,
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
            childrenFeatures.add(KEffectsPackage.Literals.EMISSION__NEW_VALUE);
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
     * This returns Emission.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Emission"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_Emission_type");
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

        switch (notification.getFeatureID(Emission.class)) {
            case KEffectsPackage.EMISSION__NEW_VALUE:
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
                (KEffectsPackage.Literals.EMISSION__NEW_VALUE,
                 KEffectsFactory.eINSTANCE.createHostcodeEffect()));

        newChildDescriptors.add
            (createChildParameter
                (KEffectsPackage.Literals.EMISSION__NEW_VALUE,
                 KEffectsFactory.eINSTANCE.createReferenceCallEffect()));

        newChildDescriptors.add
            (createChildParameter
                (KEffectsPackage.Literals.EMISSION__NEW_VALUE,
                 KExpressionsFactory.eINSTANCE.createExpression()));

        newChildDescriptors.add
            (createChildParameter
                (KEffectsPackage.Literals.EMISSION__NEW_VALUE,
                 KExpressionsFactory.eINSTANCE.createValuedObjectReference()));

        newChildDescriptors.add
            (createChildParameter
                (KEffectsPackage.Literals.EMISSION__NEW_VALUE,
                 KExpressionsFactory.eINSTANCE.createValue()));

        newChildDescriptors.add
            (createChildParameter
                (KEffectsPackage.Literals.EMISSION__NEW_VALUE,
                 KExpressionsFactory.eINSTANCE.createIntValue()));

        newChildDescriptors.add
            (createChildParameter
                (KEffectsPackage.Literals.EMISSION__NEW_VALUE,
                 KExpressionsFactory.eINSTANCE.createFloatValue()));

        newChildDescriptors.add
            (createChildParameter
                (KEffectsPackage.Literals.EMISSION__NEW_VALUE,
                 KExpressionsFactory.eINSTANCE.createBoolValue()));

        newChildDescriptors.add
            (createChildParameter
                (KEffectsPackage.Literals.EMISSION__NEW_VALUE,
                 KExpressionsFactory.eINSTANCE.createOperatorExpression()));

        newChildDescriptors.add
            (createChildParameter
                (KEffectsPackage.Literals.EMISSION__NEW_VALUE,
                 KExpressionsFactory.eINSTANCE.createTextExpression()));

        newChildDescriptors.add
            (createChildParameter
                (KEffectsPackage.Literals.EMISSION__NEW_VALUE,
                 KExpressionsFactory.eINSTANCE.createStringValue()));

        newChildDescriptors.add
            (createChildParameter
                (KEffectsPackage.Literals.EMISSION__NEW_VALUE,
                 KExpressionsFactory.eINSTANCE.createCall()));

        newChildDescriptors.add
            (createChildParameter
                (KEffectsPackage.Literals.EMISSION__NEW_VALUE,
                 KExpressionsFactory.eINSTANCE.createReferenceCall()));
    }

}
