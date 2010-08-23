package org.eclipse.papyrus.diagram.statemachine.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.FinalStateEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.PackageEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.PseudostateEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.RegionEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateMachineEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.TransitionEditPart;
import org.eclipse.papyrus.diagram.statemachine.part.UMLDiagramEditorPlugin;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLElementTypes {

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Package_1000 = getElementType("org.eclipse.papyrus.diagram.statemachine.Package_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StateMachine_2000 = getElementType("org.eclipse.papyrus.diagram.statemachine.StateMachine_2000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Region_3000 = getElementType("org.eclipse.papyrus.diagram.statemachine.Region_3000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Pseudostate_4000 = getElementType("org.eclipse.papyrus.diagram.statemachine.Pseudostate_4000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FinalState_5000 = getElementType("org.eclipse.papyrus.diagram.statemachine.FinalState_5000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType State_6000 = getElementType("org.eclipse.papyrus.diagram.statemachine.State_6000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Transition_7000 = getElementType("org.eclipse.papyrus.diagram.statemachine.Transition_7000"); //$NON-NLS-1$

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Package_1000, UMLPackage.eINSTANCE.getPackage());

			elements.put(StateMachine_2000,
					UMLPackage.eINSTANCE.getStateMachine());

			elements.put(Region_3000, UMLPackage.eINSTANCE.getRegion());

			elements.put(Pseudostate_4000,
					UMLPackage.eINSTANCE.getPseudostate());

			elements.put(FinalState_5000, UMLPackage.eINSTANCE.getFinalState());

			elements.put(State_6000, UMLPackage.eINSTANCE.getState());

			elements.put(Transition_7000, UMLPackage.eINSTANCE.getTransition());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case PackageEditPart.VISUAL_ID:
			return Package_1000;
		case StateMachineEditPart.VISUAL_ID:
			return StateMachine_2000;
		case RegionEditPart.VISUAL_ID:
			return Region_3000;
		case PseudostateEditPart.VISUAL_ID:
			return Pseudostate_4000;
		case FinalStateEditPart.VISUAL_ID:
			return FinalState_5000;
		case StateEditPart.VISUAL_ID:
			return State_6000;
		case TransitionEditPart.VISUAL_ID:
			return Transition_7000;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return UMLDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Package_1000);
			KNOWN_ELEMENT_TYPES.add(StateMachine_2000);
			KNOWN_ELEMENT_TYPES.add(Region_3000);
			KNOWN_ELEMENT_TYPES.add(Pseudostate_4000);
			KNOWN_ELEMENT_TYPES.add(FinalState_5000);
			KNOWN_ELEMENT_TYPES.add(State_6000);
			KNOWN_ELEMENT_TYPES.add(Transition_7000);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	private UMLElementTypes() {
	}

}
