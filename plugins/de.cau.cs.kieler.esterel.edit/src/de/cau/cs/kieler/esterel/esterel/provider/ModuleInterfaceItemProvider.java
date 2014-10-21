/**
 */
package de.cau.cs.kieler.esterel.esterel.provider;


import de.cau.cs.kieler.esterel.esterel.EsterelFactory;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.ModuleInterface;

import de.cau.cs.kieler.esterel.kexpressions.KExpressionsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.esterel.esterel.ModuleInterface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleInterfaceItemProvider 
    extends ItemProviderAdapter
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModuleInterfaceItemProvider(AdapterFactory adapterFactory) {
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
            childrenFeatures.add(EsterelPackage.Literals.MODULE_INTERFACE__INT_SIGNAL_DECLS);
            childrenFeatures.add(EsterelPackage.Literals.MODULE_INTERFACE__INT_TYPE_DECLS);
            childrenFeatures.add(EsterelPackage.Literals.MODULE_INTERFACE__INT_SENSOR_DECLS);
            childrenFeatures.add(EsterelPackage.Literals.MODULE_INTERFACE__INT_CONSTANT_DECLS);
            childrenFeatures.add(EsterelPackage.Literals.MODULE_INTERFACE__INT_RELATION_DECLS);
            childrenFeatures.add(EsterelPackage.Literals.MODULE_INTERFACE__INT_TASK_DECLS);
            childrenFeatures.add(EsterelPackage.Literals.MODULE_INTERFACE__INT_FUNCTION_DECLS);
            childrenFeatures.add(EsterelPackage.Literals.MODULE_INTERFACE__INT_PROCEDURE_DECLS);
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
     * This returns ModuleInterface.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ModuleInterface"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_ModuleInterface_type");
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

        switch (notification.getFeatureID(ModuleInterface.class)) {
            case EsterelPackage.MODULE_INTERFACE__INT_SIGNAL_DECLS:
            case EsterelPackage.MODULE_INTERFACE__INT_TYPE_DECLS:
            case EsterelPackage.MODULE_INTERFACE__INT_SENSOR_DECLS:
            case EsterelPackage.MODULE_INTERFACE__INT_CONSTANT_DECLS:
            case EsterelPackage.MODULE_INTERFACE__INT_RELATION_DECLS:
            case EsterelPackage.MODULE_INTERFACE__INT_TASK_DECLS:
            case EsterelPackage.MODULE_INTERFACE__INT_FUNCTION_DECLS:
            case EsterelPackage.MODULE_INTERFACE__INT_PROCEDURE_DECLS:
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
                (EsterelPackage.Literals.MODULE_INTERFACE__INT_SIGNAL_DECLS,
                 KExpressionsFactory.eINSTANCE.createInterfaceSignalDecl()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.MODULE_INTERFACE__INT_SIGNAL_DECLS,
                 KExpressionsFactory.eINSTANCE.createInput()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.MODULE_INTERFACE__INT_SIGNAL_DECLS,
                 KExpressionsFactory.eINSTANCE.createOutput()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.MODULE_INTERFACE__INT_SIGNAL_DECLS,
                 KExpressionsFactory.eINSTANCE.createInputOutput()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.MODULE_INTERFACE__INT_SIGNAL_DECLS,
                 KExpressionsFactory.eINSTANCE.createReturn()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.MODULE_INTERFACE__INT_TYPE_DECLS,
                 EsterelFactory.eINSTANCE.createTypeDecl()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.MODULE_INTERFACE__INT_SENSOR_DECLS,
                 EsterelFactory.eINSTANCE.createSensorDecl()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.MODULE_INTERFACE__INT_CONSTANT_DECLS,
                 EsterelFactory.eINSTANCE.createConstantDecls()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.MODULE_INTERFACE__INT_RELATION_DECLS,
                 EsterelFactory.eINSTANCE.createRelationDecl()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.MODULE_INTERFACE__INT_RELATION_DECLS,
                 EsterelFactory.eINSTANCE.createRelation()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.MODULE_INTERFACE__INT_TASK_DECLS,
                 EsterelFactory.eINSTANCE.createTaskDecl()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.MODULE_INTERFACE__INT_FUNCTION_DECLS,
                 EsterelFactory.eINSTANCE.createFunctionDecl()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.MODULE_INTERFACE__INT_PROCEDURE_DECLS,
                 EsterelFactory.eINSTANCE.createProcedureDecl()));
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
