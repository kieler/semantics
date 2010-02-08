/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.provider;


import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.synccharts.State} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StateItemProvider
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
    public StateItemProvider(AdapterFactory adapterFactory) {
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

            addIdPropertyDescriptor(object);
            addLabelPropertyDescriptor(object);
            addTypePropertyDescriptor(object);
            addIsInitialPropertyDescriptor(object);
            addIsFinalPropertyDescriptor(object);
            addBodyTextPropertyDescriptor(object);
            addBodyReferencePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_State_id_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_State_id_feature", "_UI_State_type"),
                 SyncchartsPackage.Literals.STATE__ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Label feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLabelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_State_label_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_State_label_feature", "_UI_State_type"),
                 SyncchartsPackage.Literals.STATE__LABEL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_State_type_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_State_type_feature", "_UI_State_type"),
                 SyncchartsPackage.Literals.STATE__TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Initial feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsInitialPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_State_isInitial_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_State_isInitial_feature", "_UI_State_type"),
                 SyncchartsPackage.Literals.STATE__IS_INITIAL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Final feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsFinalPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_State_isFinal_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_State_isFinal_feature", "_UI_State_type"),
                 SyncchartsPackage.Literals.STATE__IS_FINAL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Body Text feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBodyTextPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_State_bodyText_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_State_bodyText_feature", "_UI_State_type"),
                 SyncchartsPackage.Literals.STATE__BODY_TEXT,
                 true,
                 true,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Body Reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBodyReferencePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_State_bodyReference_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_State_bodyReference_feature", "_UI_State_type"),
                 SyncchartsPackage.Literals.STATE__BODY_REFERENCE,
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
            childrenFeatures.add(SyncchartsPackage.Literals.STATE__SIGNALS);
            childrenFeatures.add(SyncchartsPackage.Literals.STATE__REGIONS);
            childrenFeatures.add(SyncchartsPackage.Literals.STATE__ENTRY_ACTIONS);
            childrenFeatures.add(SyncchartsPackage.Literals.STATE__INNER_ACTIONS);
            childrenFeatures.add(SyncchartsPackage.Literals.STATE__EXIT_ACTIONS);
            childrenFeatures.add(SyncchartsPackage.Literals.STATE__RENAMINGS);
            childrenFeatures.add(SyncchartsPackage.Literals.STATE__SUSPENSION_TRIGGER);
            childrenFeatures.add(SyncchartsPackage.Literals.STATE__OUTGOING_TRANSITIONS);
            childrenFeatures.add(SyncchartsPackage.Literals.STATE__BODY_CONTENTS);
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
     * This returns State.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/State"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((State)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_State_type") :
            getString("_UI_State_type") + " " + label;
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

        switch (notification.getFeatureID(State.class)) {
            case SyncchartsPackage.STATE__ID:
            case SyncchartsPackage.STATE__LABEL:
            case SyncchartsPackage.STATE__TYPE:
            case SyncchartsPackage.STATE__IS_INITIAL:
            case SyncchartsPackage.STATE__IS_FINAL:
            case SyncchartsPackage.STATE__BODY_TEXT:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case SyncchartsPackage.STATE__SIGNALS:
            case SyncchartsPackage.STATE__REGIONS:
            case SyncchartsPackage.STATE__ENTRY_ACTIONS:
            case SyncchartsPackage.STATE__INNER_ACTIONS:
            case SyncchartsPackage.STATE__EXIT_ACTIONS:
            case SyncchartsPackage.STATE__RENAMINGS:
            case SyncchartsPackage.STATE__SUSPENSION_TRIGGER:
            case SyncchartsPackage.STATE__OUTGOING_TRANSITIONS:
            case SyncchartsPackage.STATE__BODY_CONTENTS:
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
                (SyncchartsPackage.Literals.STATE__SIGNALS,
                 SyncchartsFactory.eINSTANCE.createSignal()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__REGIONS,
                 SyncchartsFactory.eINSTANCE.createRegion()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__ENTRY_ACTIONS,
                 SyncchartsFactory.eINSTANCE.createAction()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__ENTRY_ACTIONS,
                 SyncchartsFactory.eINSTANCE.createTransition()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__INNER_ACTIONS,
                 SyncchartsFactory.eINSTANCE.createAction()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__INNER_ACTIONS,
                 SyncchartsFactory.eINSTANCE.createTransition()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__EXIT_ACTIONS,
                 SyncchartsFactory.eINSTANCE.createAction()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__EXIT_ACTIONS,
                 SyncchartsFactory.eINSTANCE.createTransition()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__RENAMINGS,
                 SyncchartsFactory.eINSTANCE.createRenaming()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__SUSPENSION_TRIGGER,
                 SyncchartsFactory.eINSTANCE.createAction()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__SUSPENSION_TRIGGER,
                 SyncchartsFactory.eINSTANCE.createTransition()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__OUTGOING_TRANSITIONS,
                 SyncchartsFactory.eINSTANCE.createTransition()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createAction()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createAssignment()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createComplexExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createEmission()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createHostCode()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createRegion()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createValuedObject()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createSignal()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createSignalReference()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createRenaming()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createState()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createTransition()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createVariable()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createVariableReference()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createValue()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createIntValue()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createFloatValue()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.STATE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createBooleanValue()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify =
            childFeature == SyncchartsPackage.Literals.STATE__SIGNALS ||
            childFeature == SyncchartsPackage.Literals.STATE__BODY_CONTENTS ||
            childFeature == SyncchartsPackage.Literals.STATE__REGIONS ||
            childFeature == SyncchartsPackage.Literals.STATE__ENTRY_ACTIONS ||
            childFeature == SyncchartsPackage.Literals.STATE__INNER_ACTIONS ||
            childFeature == SyncchartsPackage.Literals.STATE__EXIT_ACTIONS ||
            childFeature == SyncchartsPackage.Literals.STATE__SUSPENSION_TRIGGER ||
            childFeature == SyncchartsPackage.Literals.STATE__OUTGOING_TRANSITIONS ||
            childFeature == SyncchartsPackage.Literals.STATE__RENAMINGS;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return SyncchartsEditPlugin.INSTANCE;
    }

}
