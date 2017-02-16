/**
 */
package de.cau.cs.kieler.esterel.esterel.provider;


import de.cau.cs.kieler.core.annotations.AnnotationsFactory;

import de.cau.cs.kieler.esterel.esterel.Abort;
import de.cau.cs.kieler.esterel.esterel.EsterelFactory;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;

import de.cau.cs.kieler.esterel.kexpressions.KExpressionsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.esterel.esterel.Abort} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbortItemProvider extends StatementContainerItemProvider {
    /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AbortItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(EsterelPackage.Literals.ABORT__BODY);
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
	 * This returns Abort.gif.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Abort"));
	}

    /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String getText(Object object) {
		return getString("_UI_Abort_type");
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

		switch (notification.getFeatureID(Abort.class)) {
			case EsterelPackage.ABORT__BODY:
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
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createProgram()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createModule()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createModuleBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createModuleInterface()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createChannelDescription()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createTypeIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createStatementContainer()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createLocalSignalDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createLocalSignalList()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createSensorDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createSensorWithType()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createRelationDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createRelationType()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createRelationImplication()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createRelationIncompatibility()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createTypeDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createConstantDecls()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createOneTypeConstantDecls()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createConstantWithValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createFunctionDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createProcedureDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createTaskDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createAbort()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createAbortBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createAbortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createAbortCase()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createAbortCaseSingle()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createWeakAbortBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createWeakAbortEnd()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createWeakAbortEndAlt()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createAwait()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createAwaitBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createAwaitInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createAwaitCase()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createProcCall()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createDo()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createDoUpto()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createDoWatching()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createDoWatchingEnd()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createEmit()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createUnEmit()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createReset()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createEveryDo()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createExit()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createHalt()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createIfTest()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createElsIf()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createThenPart()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createElsePart()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createEndLoop()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createLoopEach()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createLoopDelay()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createLoopBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createNothing()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createPause()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createPresent()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createPresentBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createPresentEventBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createPresentCaseList()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createPresentCase()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createPresentEvent()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createRepeat()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createRun()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createModuleRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createRenamingList()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createTypeRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createConstantRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createFunctionRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createProcedureRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createTaskRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createSignalRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createSuspend()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createWeakSuspend()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createSustain()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createTrap()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createTrapDeclList()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createTrapHandler()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createGoto()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createDelayExpr()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createDelayEvent()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createExec()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createExecBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createExecCase()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createEsterelTypeIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createEsterelType()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createLocalSignal()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createRelation()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createParallel()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createWeakAbort()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createWeakAbortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createWeakAbortCase()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createTrapDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createTrapExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createFunctionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createConstantExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 EsterelFactory.eINSTANCE.createTrapReferenceExpr()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 AnnotationsFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 AnnotationsFactory.eINSTANCE.createStringAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 AnnotationsFactory.eINSTANCE.createTypedStringAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 AnnotationsFactory.eINSTANCE.createCommentAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createComplexExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createTextualCode()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createValuedObject()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createValuedObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createIntValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createFloatValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createBooleanValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createOperatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createTextExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createInterfaceDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createInterfaceSignalDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createISignal()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createChannelDescription()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createTypeIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createInterfaceVariableDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createVariableDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createIVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createInputOutput()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.ABORT__BODY,
				 KExpressionsFactory.eINSTANCE.createReturn()));
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
			childFeature == EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT ||
			childFeature == EsterelPackage.Literals.ABORT__BODY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
