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
import de.cau.cs.kieler.synccharts.diagram.edit.parts.EntryActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ExitActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.InnerActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Region2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SuspensionTriggerEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TextualCodeEditPart;
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
    public static final IElementType State_2002 = getElementType("de.cau.cs.kieler.synccharts.diagram.State_2002"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Region_3009 = getElementType("de.cau.cs.kieler.synccharts.diagram.Region_3009"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType State_3010 = getElementType("de.cau.cs.kieler.synccharts.diagram.State_3010"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Signal_3011 = getElementType("de.cau.cs.kieler.synccharts.diagram.Signal_3011"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Action_3012 = getElementType("de.cau.cs.kieler.synccharts.diagram.Action_3012"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Action_3014 = getElementType("de.cau.cs.kieler.synccharts.diagram.Action_3014"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Action_3016 = getElementType("de.cau.cs.kieler.synccharts.diagram.Action_3016"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Action_3018 = getElementType("de.cau.cs.kieler.synccharts.diagram.Action_3018"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType TextualCode_3020 = getElementType("de.cau.cs.kieler.synccharts.diagram.TextualCode_3020"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Transition_4002 = getElementType("de.cau.cs.kieler.synccharts.diagram.Transition_4002"); //$NON-NLS-1$

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
            elements = new IdentityHashMap();

            elements.put(Region_1000, SyncchartsPackage.eINSTANCE.getRegion());

            elements.put(State_2002, SyncchartsPackage.eINSTANCE.getState());

            elements.put(Region_3009, SyncchartsPackage.eINSTANCE.getRegion());

            elements.put(State_3010, SyncchartsPackage.eINSTANCE.getState());

            elements.put(Signal_3011, SyncchartsPackage.eINSTANCE.getSignal());

            elements.put(Action_3012, SyncchartsPackage.eINSTANCE.getAction());

            elements.put(Action_3014, SyncchartsPackage.eINSTANCE.getAction());

            elements.put(Action_3016, SyncchartsPackage.eINSTANCE.getAction());

            elements.put(Action_3018, SyncchartsPackage.eINSTANCE.getAction());

            elements.put(TextualCode_3020, SyncchartsPackage.eINSTANCE
                    .getTextualCode());

            elements.put(Transition_4002, SyncchartsPackage.eINSTANCE
                    .getTransition());
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
            KNOWN_ELEMENT_TYPES.add(State_2002);
            KNOWN_ELEMENT_TYPES.add(Region_3009);
            KNOWN_ELEMENT_TYPES.add(State_3010);
            KNOWN_ELEMENT_TYPES.add(Signal_3011);
            KNOWN_ELEMENT_TYPES.add(Action_3012);
            KNOWN_ELEMENT_TYPES.add(Action_3014);
            KNOWN_ELEMENT_TYPES.add(Action_3016);
            KNOWN_ELEMENT_TYPES.add(Action_3018);
            KNOWN_ELEMENT_TYPES.add(TextualCode_3020);
            KNOWN_ELEMENT_TYPES.add(Transition_4002);
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
            return State_2002;
        case Region2EditPart.VISUAL_ID:
            return Region_3009;
        case State2EditPart.VISUAL_ID:
            return State_3010;
        case SignalEditPart.VISUAL_ID:
            return Signal_3011;
        case EntryActionEditPart.VISUAL_ID:
            return Action_3012;
        case InnerActionEditPart.VISUAL_ID:
            return Action_3014;
        case ExitActionEditPart.VISUAL_ID:
            return Action_3016;
        case SuspensionTriggerEditPart.VISUAL_ID:
            return Action_3018;
        case TextualCodeEditPart.VISUAL_ID:
            return TextualCode_3020;
        case TransitionEditPart.VISUAL_ID:
            return Transition_4002;
        }
        return null;
    }

}
