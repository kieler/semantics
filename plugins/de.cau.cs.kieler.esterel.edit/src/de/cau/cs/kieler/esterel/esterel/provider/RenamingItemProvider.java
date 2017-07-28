/**
 */
package de.cau.cs.kieler.esterel.esterel.provider;


import de.cau.cs.kieler.core.annotations.AnnotationsFactory;

import de.cau.cs.kieler.esterel.esterel.EsterelFactory;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.Renaming;

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
 * This is the item provider adapter for a {@link de.cau.cs.kieler.esterel.esterel.Renaming} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RenamingItemProvider 
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
    public RenamingItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(EsterelPackage.Literals.RENAMING__RENAMINGS);
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
	 * This returns Renaming.gif.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Renaming"));
	}

    /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String getText(Object object) {
		return getString("_UI_Renaming_type");
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

		switch (notification.getFeatureID(Renaming.class)) {
			case EsterelPackage.RENAMING__RENAMINGS:
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
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createProgram()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createModule()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createModuleBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createModuleInterface()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createChannelDescription()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createTypeIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createStatementContainer()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createLocalSignalDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createLocalSignalList()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createSensorDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createSensorWithType()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createRelationDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createRelationType()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createRelationImplication()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createRelationIncompatibility()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createTypeDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createConstantDecls()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createOneTypeConstantDecls()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createConstantWithValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createFunctionDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createProcedureDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createTaskDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createAbort()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createAbortBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createAbortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createAbortCase()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createAbortCaseSingle()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createWeakAbortBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createWeakAbortEnd()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createWeakAbortEndAlt()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createAwait()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createAwaitBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createAwaitInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createAwaitCase()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createProcCall()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createDo()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createDoUpto()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createDoWatching()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createDoWatchingEnd()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createEmit()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createUnEmit()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createReset()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createEveryDo()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createExit()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createHalt()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createIfTest()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createElsIf()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createThenPart()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createElsePart()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createEndLoop()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createLoopEach()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createLoopDelay()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createLoopBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createNothing()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createPause()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createPresent()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createPresentBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createPresentEventBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createPresentCaseList()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createPresentCase()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createPresentEvent()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createRepeat()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createRun()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createModuleRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createRenamingList()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createTypeRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createConstantRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createFunctionRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createProcedureRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createTaskRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createSignalRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createSuspend()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createWeakSuspend()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createSustain()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createTrap()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createTrapDeclList()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createTrapHandler()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createGoto()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createDelayExpr()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createDelayEvent()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createExec()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createExecBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createExecCase()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createEsterelTypeIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createEsterelType()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createLocalSignal()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createRelation()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createParallel()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createWeakAbort()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createWeakAbortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createWeakAbortCase()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createTrapDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createTrapExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createFunctionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createConstantExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 EsterelFactory.eINSTANCE.createTrapReferenceExpr()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 AnnotationsFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 AnnotationsFactory.eINSTANCE.createStringAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 AnnotationsFactory.eINSTANCE.createTypedStringAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 AnnotationsFactory.eINSTANCE.createCommentAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createComplexExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createTextualCode()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createValuedObject()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createValuedObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createIntValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createFloatValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createBooleanValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createOperatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createTextExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createInterfaceDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createInterfaceSignalDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createISignal()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createChannelDescription()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createTypeIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createInterfaceVariableDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createVariableDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createIVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createInputOutput()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.RENAMING__RENAMINGS,
				 KExpressionsFactory.eINSTANCE.createReturn()));
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
