package de.cau.cs.kieler.synccharts.diagram.providers;

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
import org.eclipse.swt.graphics.Image;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Action2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Action3EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Action4EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Region2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorPlugin;

/**
 * @generated
 */
public class SyncchartsElementTypes extends ElementInitializers {

    /**
     * @generated
     */
    private SyncchartsElementTypes() {
    }

    /**
     * @generated
     */
    private static Map elements;

    /**
     * @generated
     */
    private static ImageRegistry imageRegistry;

    /**
     * @generated
     */
    private static Set KNOWN_ELEMENT_TYPES;

    /**
     * @generated
     */
    public static final IElementType Region_1000 = getElementType("de.cau.cs.kieler.synccharts.diagram.Region_1000"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType State_2001 = getElementType("de.cau.cs.kieler.synccharts.diagram.State_2001"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Region_3001 = getElementType("de.cau.cs.kieler.synccharts.diagram.Region_3001"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType State_3002 = getElementType("de.cau.cs.kieler.synccharts.diagram.State_3002"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Signal_3003 = getElementType("de.cau.cs.kieler.synccharts.diagram.Signal_3003"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Action_3004 = getElementType("de.cau.cs.kieler.synccharts.diagram.Action_3004"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Action_3005 = getElementType("de.cau.cs.kieler.synccharts.diagram.Action_3005"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Action_3006 = getElementType("de.cau.cs.kieler.synccharts.diagram.Action_3006"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Action_3008 = getElementType("de.cau.cs.kieler.synccharts.diagram.Action_3008"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Transition_4001 = getElementType("de.cau.cs.kieler.synccharts.diagram.Transition_4001"); //$NON-NLS-1$

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
    private static ImageDescriptor getProvidedImageDescriptor(ENamedElement element) {
        if (element instanceof EStructuralFeature) {
            EStructuralFeature feature = ((EStructuralFeature) element);
            EClass eContainingClass = feature.getEContainingClass();
            EClassifier eType = feature.getEType();
            if (eContainingClass != null && !eContainingClass.isAbstract()) {
                element = eContainingClass;
            } else if (eType instanceof EClass && !((EClass) eType).isAbstract()) {
                element = eType;
            }
        }
        if (element instanceof EClass) {
            EClass eClass = (EClass) element;
            if (!eClass.isAbstract()) {
                return SyncchartsDiagramEditorPlugin.getInstance().getItemImageDescriptor(
                        eClass.getEPackage().getEFactoryInstance().create(eClass));
            }
        }
        // TODO : support structural features
        return null;
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
    public static Image getImage(IAdaptable hint) {
        ENamedElement element = getElement(hint);
        if (element == null) {
            return null;
        }
        return getImage(element);
    }

    /**
     * Returns 'type' of the ecore object associated with the hint.
     * 
     * @generated
     */
    public static ENamedElement getElement(IAdaptable hint) {
        Object type = hint.getAdapter(IElementType.class);
        if (elements == null) {
            elements = new IdentityHashMap();

            elements.put(Region_1000, SyncchartsPackage.eINSTANCE.getRegion());

            elements.put(State_2001, SyncchartsPackage.eINSTANCE.getState());

            elements.put(Region_3001, SyncchartsPackage.eINSTANCE.getRegion());

            elements.put(State_3002, SyncchartsPackage.eINSTANCE.getState());

            elements.put(Signal_3003, SyncchartsPackage.eINSTANCE.getSignal());

            elements.put(Action_3004, SyncchartsPackage.eINSTANCE.getAction());

            elements.put(Action_3005, SyncchartsPackage.eINSTANCE.getAction());

            elements.put(Action_3006, SyncchartsPackage.eINSTANCE.getAction());

            elements.put(Action_3008, SyncchartsPackage.eINSTANCE.getAction());

            elements.put(Transition_4001, SyncchartsPackage.eINSTANCE.getTransition());
        }
        return (ENamedElement) elements.get(type);
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
    public static boolean isKnownElementType(IElementType elementType) {
        if (KNOWN_ELEMENT_TYPES == null) {
            KNOWN_ELEMENT_TYPES = new HashSet();
            KNOWN_ELEMENT_TYPES.add(Region_1000);
            KNOWN_ELEMENT_TYPES.add(State_2001);
            KNOWN_ELEMENT_TYPES.add(Region_3001);
            KNOWN_ELEMENT_TYPES.add(State_3002);
            KNOWN_ELEMENT_TYPES.add(Signal_3003);
            KNOWN_ELEMENT_TYPES.add(Action_3004);
            KNOWN_ELEMENT_TYPES.add(Action_3005);
            KNOWN_ELEMENT_TYPES.add(Action_3006);
            KNOWN_ELEMENT_TYPES.add(Action_3008);
            KNOWN_ELEMENT_TYPES.add(Transition_4001);
        }
        return KNOWN_ELEMENT_TYPES.contains(elementType);
    }

    /**
     * @generated
     */
    public static IElementType getElementType(int visualID) {
        switch (visualID) {
        case RegionEditPart.VISUAL_ID:
            return Region_1000;
        case StateEditPart.VISUAL_ID:
            return State_2001;
        case Region2EditPart.VISUAL_ID:
            return Region_3001;
        case State2EditPart.VISUAL_ID:
            return State_3002;
        case SignalEditPart.VISUAL_ID:
            return Signal_3003;
        case ActionEditPart.VISUAL_ID:
            return Action_3004;
        case Action2EditPart.VISUAL_ID:
            return Action_3005;
        case Action3EditPart.VISUAL_ID:
            return Action_3006;
        case Action4EditPart.VISUAL_ID:
            return Action_3008;
        case TransitionEditPart.VISUAL_ID:
            return Transition_4001;
        }
        return null;
    }

}
