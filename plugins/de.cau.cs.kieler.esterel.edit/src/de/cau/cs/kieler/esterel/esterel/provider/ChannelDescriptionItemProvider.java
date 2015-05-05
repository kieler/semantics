/**
 */
package de.cau.cs.kieler.esterel.esterel.provider;


import de.cau.cs.kieler.esterel.esterel.EsterelFactory;

import de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.esterel.esterel.ChannelDescription} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChannelDescriptionItemProvider extends de.cau.cs.kieler.esterel.kexpressions.provider.ChannelDescriptionItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChannelDescriptionItemProvider(AdapterFactory adapterFactory) {
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

        }
        return itemPropertyDescriptors;
    }

    /**
     * This returns ChannelDescription.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ChannelDescription"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_ChannelDescription_type");
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
                (KExpressionsPackage.Literals.CHANNEL_DESCRIPTION__TYPE,
                 EsterelFactory.eINSTANCE.createTypeIdentifier()));

        newChildDescriptors.add
            (createChildParameter
                (KExpressionsPackage.Literals.CHANNEL_DESCRIPTION__TYPE,
                 EsterelFactory.eINSTANCE.createEsterelTypeIdentifier()));

        newChildDescriptors.add
            (createChildParameter
                (KExpressionsPackage.Literals.CHANNEL_DESCRIPTION__TYPE,
                 EsterelFactory.eINSTANCE.createEsterelType()));

        newChildDescriptors.add
            (createChildParameter
                (KExpressionsPackage.Literals.CHANNEL_DESCRIPTION__EXPRESSION,
                 EsterelFactory.eINSTANCE.createTrapExpression()));

        newChildDescriptors.add
            (createChildParameter
                (KExpressionsPackage.Literals.CHANNEL_DESCRIPTION__EXPRESSION,
                 EsterelFactory.eINSTANCE.createFunctionExpression()));

        newChildDescriptors.add
            (createChildParameter
                (KExpressionsPackage.Literals.CHANNEL_DESCRIPTION__EXPRESSION,
                 EsterelFactory.eINSTANCE.createConstantExpression()));

        newChildDescriptors.add
            (createChildParameter
                (KExpressionsPackage.Literals.CHANNEL_DESCRIPTION__EXPRESSION,
                 EsterelFactory.eINSTANCE.createTrapReferenceExpr()));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return EsterelEditPlugin.INSTANCE;
    }

}
