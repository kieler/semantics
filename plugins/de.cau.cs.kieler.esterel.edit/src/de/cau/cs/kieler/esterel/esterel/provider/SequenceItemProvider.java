/**
 */
package de.cau.cs.kieler.esterel.esterel.provider;


import de.cau.cs.kieler.esterel.esterel.EsterelFactory;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.Sequence;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.esterel.esterel.Sequence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SequenceItemProvider extends StatementItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceItemProvider(AdapterFactory adapterFactory) {
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
            childrenFeatures.add(EsterelPackage.Literals.SEQUENCE__LIST);
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
     * This returns Sequence.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Sequence"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_Sequence_type");
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

        switch (notification.getFeatureID(Sequence.class)) {
            case EsterelPackage.SEQUENCE__LIST:
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
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createLocalSignalDecl()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createStatement()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createBlock()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createAssignment()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createAbort()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createAwait()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createProcCall()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createDo()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createEmit()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createEveryDo()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createExit()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createHalt()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createIfTest()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createLoop()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createNothing()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createPause()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createPresent()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createRepeat()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createRun()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createSuspend()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createSustain()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createTrap()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createLocalVariable()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createExec()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createParallel()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createSequence()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createWeakAbort()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.SEQUENCE__LIST,
                 EsterelFactory.eINSTANCE.createWeakSuspend()));
    }

}
