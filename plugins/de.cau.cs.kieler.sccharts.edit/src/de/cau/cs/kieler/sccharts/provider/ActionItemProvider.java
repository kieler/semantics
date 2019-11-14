/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.provider;


import de.cau.cs.kieler.annotations.AnnotationsPackage;

import de.cau.cs.kieler.annotations.provider.AnnotatableItemProvider;

import de.cau.cs.kieler.kexpressions.KExpressionsFactory;

import de.cau.cs.kieler.kexpressions.keffects.KEffectsFactory;
import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;

import de.cau.cs.kieler.sccharts.Action;
import de.cau.cs.kieler.sccharts.SCChartsFactory;
import de.cau.cs.kieler.sccharts.SCChartsPackage;

import de.cau.cs.kieler.scl.SCLFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.sccharts.Action} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionItemProvider extends AnnotatableItemProvider {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionItemProvider(AdapterFactory adapterFactory) {
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

            addIncomingLinksPropertyDescriptor(object);
            addTriggerDelayPropertyDescriptor(object);
            addTriggerProbabilityPropertyDescriptor(object);
            addLabelPropertyDescriptor(object);
            addDelayPropertyDescriptor(object);
            addNondeterministicPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Incoming Links feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIncomingLinksPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Linkable_incomingLinks_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Linkable_incomingLinks_feature", "_UI_Linkable_type"),
                 KEffectsPackage.Literals.LINKABLE__INCOMING_LINKS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Trigger Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTriggerDelayPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Action_triggerDelay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Action_triggerDelay_feature", "_UI_Action_type"),
                 SCChartsPackage.Literals.ACTION__TRIGGER_DELAY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Trigger Probability feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTriggerProbabilityPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Action_triggerProbability_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Action_triggerProbability_feature", "_UI_Action_type"),
                 SCChartsPackage.Literals.ACTION__TRIGGER_PROBABILITY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
                 getString("_UI_Action_label_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Action_label_feature", "_UI_Action_type"),
                 SCChartsPackage.Literals.ACTION__LABEL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDelayPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Action_delay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Action_delay_feature", "_UI_Action_type"),
                 SCChartsPackage.Literals.ACTION__DELAY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Nondeterministic feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNondeterministicPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Action_nondeterministic_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Action_nondeterministic_feature", "_UI_Action_type"),
                 SCChartsPackage.Literals.ACTION__NONDETERMINISTIC,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
            childrenFeatures.add(KEffectsPackage.Literals.LINKABLE__OUTGOING_LINKS);
            childrenFeatures.add(SCChartsPackage.Literals.ACTION__EFFECTS);
            childrenFeatures.add(SCChartsPackage.Literals.ACTION__TRIGGER);
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
     * This returns Action.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Action"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        Action action = (Action)object;
        return getString("_UI_Action_type") + " " + action.getTriggerDelay();
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

        switch (notification.getFeatureID(Action.class)) {
            case SCChartsPackage.ACTION__TRIGGER_DELAY:
            case SCChartsPackage.ACTION__TRIGGER_PROBABILITY:
            case SCChartsPackage.ACTION__LABEL:
            case SCChartsPackage.ACTION__DELAY:
            case SCChartsPackage.ACTION__NONDETERMINISTIC:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case SCChartsPackage.ACTION__OUTGOING_LINKS:
            case SCChartsPackage.ACTION__EFFECTS:
            case SCChartsPackage.ACTION__TRIGGER:
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
                 KExpressionsFactory.eINSTANCE.createJsonAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (KEffectsPackage.Literals.LINKABLE__OUTGOING_LINKS,
                 KEffectsFactory.eINSTANCE.createDataDependency()));

        newChildDescriptors.add
            (createChildParameter
                (KEffectsPackage.Literals.LINKABLE__OUTGOING_LINKS,
                 KEffectsFactory.eINSTANCE.createControlDependency()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__EFFECTS,
                 SCChartsFactory.eINSTANCE.createCodeEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__EFFECTS,
                 SCChartsFactory.eINSTANCE.createDataflowAssignment()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__EFFECTS,
                 KEffectsFactory.eINSTANCE.createAssignment()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__EFFECTS,
                 KEffectsFactory.eINSTANCE.createEmission()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__EFFECTS,
                 KEffectsFactory.eINSTANCE.createHostcodeEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__EFFECTS,
                 KEffectsFactory.eINSTANCE.createReferenceCallEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__EFFECTS,
                 KEffectsFactory.eINSTANCE.createFunctionCallEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__EFFECTS,
                 KEffectsFactory.eINSTANCE.createPrintCallEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__EFFECTS,
                 KEffectsFactory.eINSTANCE.createRandomizeCallEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__EFFECTS,
                 SCLFactory.eINSTANCE.createAssignment()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 SCChartsFactory.eINSTANCE.createScopeCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KEffectsFactory.eINSTANCE.createHostcodeEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KEffectsFactory.eINSTANCE.createReferenceCallEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KEffectsFactory.eINSTANCE.createFunctionCallEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KEffectsFactory.eINSTANCE.createPrintCallEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KEffectsFactory.eINSTANCE.createRandomizeCallEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KExpressionsFactory.eINSTANCE.createValuedObjectReference()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KExpressionsFactory.eINSTANCE.createIntValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KExpressionsFactory.eINSTANCE.createFloatValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KExpressionsFactory.eINSTANCE.createBoolValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KExpressionsFactory.eINSTANCE.createStringValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KExpressionsFactory.eINSTANCE.createVectorValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KExpressionsFactory.eINSTANCE.createIgnoreValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KExpressionsFactory.eINSTANCE.createJsonObjectValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KExpressionsFactory.eINSTANCE.createJsonArrayValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KExpressionsFactory.eINSTANCE.createNullValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KExpressionsFactory.eINSTANCE.createOperatorExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KExpressionsFactory.eINSTANCE.createTextExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KExpressionsFactory.eINSTANCE.createScheduleObjectReference()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KExpressionsFactory.eINSTANCE.createReferenceCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KExpressionsFactory.eINSTANCE.createFunctionCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KExpressionsFactory.eINSTANCE.createPrintCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KExpressionsFactory.eINSTANCE.createRandomCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 KExpressionsFactory.eINSTANCE.createRandomizeCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.ACTION__TRIGGER,
                 SCLFactory.eINSTANCE.createModuleCall()));
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
            childFeature == SCChartsPackage.Literals.ACTION__EFFECTS ||
            childFeature == SCChartsPackage.Literals.ACTION__TRIGGER;

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
        return SCChartsEditPlugin.INSTANCE;
    }

}
