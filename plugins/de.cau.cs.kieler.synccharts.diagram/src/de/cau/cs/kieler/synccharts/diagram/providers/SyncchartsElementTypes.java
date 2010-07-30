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

import de.cau.cs.kieler.core.expressions.ExpressionsPackage;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Region2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEntryActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateExitActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInnerActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TextualCodeEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorPlugin;

/**
 * @generated
 */
public class SyncchartsElementTypes {

    /**
     * @generated
     */
    private SyncchartsElementTypes() {
    }

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
    public static final IElementType Region_1000 = getElementType("de.cau.cs.kieler.synccharts.diagram.Region_1000"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType State_2004 = getElementType("de.cau.cs.kieler.synccharts.diagram.State_2004"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType Region_3031 = getElementType("de.cau.cs.kieler.synccharts.diagram.Region_3031"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType State_3032 = getElementType("de.cau.cs.kieler.synccharts.diagram.State_3032"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType Signal_3033 = getElementType("de.cau.cs.kieler.synccharts.diagram.Signal_3033"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType Action_3034 = getElementType("de.cau.cs.kieler.synccharts.diagram.Action_3034"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType Action_3035 = getElementType("de.cau.cs.kieler.synccharts.diagram.Action_3035"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType Action_3036 = getElementType("de.cau.cs.kieler.synccharts.diagram.Action_3036"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType Action_3037 = getElementType("de.cau.cs.kieler.synccharts.diagram.Action_3037"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType TextualCode_3038 = getElementType("de.cau.cs.kieler.synccharts.diagram.TextualCode_3038"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType Transition_4004 = getElementType("de.cau.cs.kieler.synccharts.diagram.Transition_4004"); //$NON-NLS-1$

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
                return SyncchartsDiagramEditorPlugin.getInstance()
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
            elements = new IdentityHashMap<IElementType, ENamedElement>();

            elements.put(Region_1000, SyncchartsPackage.eINSTANCE.getRegion());

            elements.put(State_2004, SyncchartsPackage.eINSTANCE.getState());

            elements.put(Region_3031, SyncchartsPackage.eINSTANCE.getRegion());

            elements.put(State_3032, SyncchartsPackage.eINSTANCE.getState());

            elements.put(Signal_3033, ExpressionsPackage.eINSTANCE.getSignal());

            elements.put(Action_3034, SyncchartsPackage.eINSTANCE.getAction());

            elements.put(Action_3035, SyncchartsPackage.eINSTANCE.getAction());

            elements.put(Action_3036, SyncchartsPackage.eINSTANCE.getAction());

            elements.put(Action_3037, SyncchartsPackage.eINSTANCE.getAction());

            elements.put(TextualCode_3038,
                    ExpressionsPackage.eINSTANCE.getTextualCode());

            elements.put(Transition_4004,
                    SyncchartsPackage.eINSTANCE.getTransition());
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
            KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
            KNOWN_ELEMENT_TYPES.add(Region_1000);
            KNOWN_ELEMENT_TYPES.add(State_2004);
            KNOWN_ELEMENT_TYPES.add(Region_3031);
            KNOWN_ELEMENT_TYPES.add(State_3032);
            KNOWN_ELEMENT_TYPES.add(Signal_3033);
            KNOWN_ELEMENT_TYPES.add(Action_3034);
            KNOWN_ELEMENT_TYPES.add(Action_3035);
            KNOWN_ELEMENT_TYPES.add(Action_3036);
            KNOWN_ELEMENT_TYPES.add(Action_3037);
            KNOWN_ELEMENT_TYPES.add(TextualCode_3038);
            KNOWN_ELEMENT_TYPES.add(Transition_4004);
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
            return State_2004;
        case Region2EditPart.VISUAL_ID:
            return Region_3031;
        case State2EditPart.VISUAL_ID:
            return State_3032;
        case SignalEditPart.VISUAL_ID:
            return Signal_3033;
        case StateEntryActionEditPart.VISUAL_ID:
            return Action_3034;
        case StateInnerActionEditPart.VISUAL_ID:
            return Action_3035;
        case StateExitActionEditPart.VISUAL_ID:
            return Action_3036;
        case StateSuspensionTriggerEditPart.VISUAL_ID:
            return Action_3037;
        case TextualCodeEditPart.VISUAL_ID:
            return TextualCode_3038;
        case TransitionEditPart.VISUAL_ID:
            return Transition_4004;
        }
        return null;
    }

}
