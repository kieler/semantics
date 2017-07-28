/**
 */
package de.cau.cs.kieler.esterel.esterel.provider;


import de.cau.cs.kieler.core.annotations.AnnotationsFactory;

import de.cau.cs.kieler.esterel.esterel.Do;
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
 * This is the item provider adapter for a {@link de.cau.cs.kieler.esterel.esterel.Do} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DoItemProvider extends StatementContainerItemProvider {
    /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DoItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(EsterelPackage.Literals.DO__END);
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
	 * This returns Do.gif.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Do"));
	}

    /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String getText(Object object) {
		return getString("_UI_Do_type");
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

		switch (notification.getFeatureID(Do.class)) {
			case EsterelPackage.DO__END:
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
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createProgram()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createModule()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createModuleBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createModuleInterface()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createChannelDescription()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createTypeIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createStatementContainer()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createLocalSignalDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createLocalSignalList()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createSensorDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createSensorWithType()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createRelationDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createRelationType()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createRelationImplication()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createRelationIncompatibility()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createTypeDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createConstantDecls()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createOneTypeConstantDecls()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createConstantWithValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createFunctionDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createProcedureDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createTaskDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createAbort()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createAbortBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createAbortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createAbortCase()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createAbortCaseSingle()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createWeakAbortBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createWeakAbortEnd()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createWeakAbortEndAlt()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createAwait()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createAwaitBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createAwaitInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createAwaitCase()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createProcCall()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createDo()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createDoUpto()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createDoWatching()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createDoWatchingEnd()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createEmit()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createUnEmit()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createReset()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createEveryDo()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createExit()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createHalt()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createIfTest()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createElsIf()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createThenPart()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createElsePart()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createEndLoop()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createLoopEach()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createLoopDelay()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createLoopBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createNothing()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createPause()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createPresent()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createPresentBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createPresentEventBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createPresentCaseList()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createPresentCase()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createPresentEvent()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createRepeat()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createRun()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createModuleRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createRenamingList()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createTypeRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createConstantRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createFunctionRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createProcedureRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createTaskRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createSignalRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createSuspend()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createWeakSuspend()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createSustain()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createTrap()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createTrapDeclList()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createTrapHandler()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createGoto()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createDelayExpr()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createDelayEvent()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createExec()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createExecBody()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createExecCase()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createEsterelTypeIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createEsterelType()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createLocalSignal()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createRelation()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createParallel()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createWeakAbort()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createWeakAbortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createWeakAbortCase()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createTrapDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createTrapExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createFunctionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createConstantExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 EsterelFactory.eINSTANCE.createTrapReferenceExpr()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 AnnotationsFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 AnnotationsFactory.eINSTANCE.createStringAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 AnnotationsFactory.eINSTANCE.createTypedStringAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 AnnotationsFactory.eINSTANCE.createCommentAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createComplexExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createTextualCode()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createValuedObject()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createValuedObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createIntValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createFloatValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createBooleanValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createOperatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createTextExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createInterfaceDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createInterfaceSignalDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createISignal()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createChannelDescription()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createTypeIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createInterfaceVariableDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createVariableDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createIVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
				 KExpressionsFactory.eINSTANCE.createInputOutput()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.DO__END,
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
			childFeature == EsterelPackage.Literals.DO__END;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
