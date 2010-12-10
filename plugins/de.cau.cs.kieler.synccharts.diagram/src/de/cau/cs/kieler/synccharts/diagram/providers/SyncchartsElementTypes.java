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

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEntryActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateExitActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInnerActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TextualCodeEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.VariableEditPart;
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
    public static final IElementType State_2005 = getElementType("de.cau.cs.kieler.synccharts.diagram.State_2005"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Signal_3041 = getElementType("de.cau.cs.kieler.synccharts.diagram.Signal_3041"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Action_3042 = getElementType("de.cau.cs.kieler.synccharts.diagram.Action_3042"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Action_3043 = getElementType("de.cau.cs.kieler.synccharts.diagram.Action_3043"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Action_3044 = getElementType("de.cau.cs.kieler.synccharts.diagram.Action_3044"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Action_3045 = getElementType("de.cau.cs.kieler.synccharts.diagram.Action_3045"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType TextualCode_3046 = getElementType("de.cau.cs.kieler.synccharts.diagram.TextualCode_3046"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Region_3039 = getElementType("de.cau.cs.kieler.synccharts.diagram.Region_3039"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType State_3040 = getElementType("de.cau.cs.kieler.synccharts.diagram.State_3040"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType Variable_3047 = getElementType("de.cau.cs.kieler.synccharts.diagram.Variable_3047"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType Transition_4005 = getElementType("de.cau.cs.kieler.synccharts.diagram.Transition_4005"); //$NON-NLS-1$

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
            elements = new IdentityHashMap<IElementType, ENamedElement>();

            elements.put(Region_1000, SyncchartsPackage.eINSTANCE.getRegion());

            elements.put(State_2005, SyncchartsPackage.eINSTANCE.getState());

            elements.put(Signal_3041, KExpressionsPackage.eINSTANCE.getSignal());

            elements.put(Action_3042, SyncchartsPackage.eINSTANCE.getAction());

            elements.put(Action_3043, SyncchartsPackage.eINSTANCE.getAction());

            elements.put(Action_3044, SyncchartsPackage.eINSTANCE.getAction());

            elements.put(Action_3045, SyncchartsPackage.eINSTANCE.getAction());

            elements.put(TextualCode_3046, KExpressionsPackage.eINSTANCE.getTextualCode());

            elements.put(Region_3039, SyncchartsPackage.eINSTANCE.getRegion());

            elements.put(State_3040, SyncchartsPackage.eINSTANCE.getState());

            elements.put(Variable_3047, KExpressionsPackage.eINSTANCE.getVariable());

            elements.put(Transition_4005, SyncchartsPackage.eINSTANCE.getTransition());
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
            KNOWN_ELEMENT_TYPES.add(State_2005);
            KNOWN_ELEMENT_TYPES.add(Signal_3041);
            KNOWN_ELEMENT_TYPES.add(Action_3042);
            KNOWN_ELEMENT_TYPES.add(Action_3043);
            KNOWN_ELEMENT_TYPES.add(Action_3044);
            KNOWN_ELEMENT_TYPES.add(Action_3045);
            KNOWN_ELEMENT_TYPES.add(TextualCode_3046);
            KNOWN_ELEMENT_TYPES.add(Region_3039);
            KNOWN_ELEMENT_TYPES.add(State_3040);
            KNOWN_ELEMENT_TYPES.add(Variable_3047);
            KNOWN_ELEMENT_TYPES.add(Transition_4005);
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
            return State_2005;
        case SignalEditPart.VISUAL_ID:
            return Signal_3041;
        case StateEntryActionEditPart.VISUAL_ID:
            return Action_3042;
        case StateInnerActionEditPart.VISUAL_ID:
            return Action_3043;
        case StateExitActionEditPart.VISUAL_ID:
            return Action_3044;
        case StateSuspensionTriggerEditPart.VISUAL_ID:
            return Action_3045;
        case TextualCodeEditPart.VISUAL_ID:
            return TextualCode_3046;
        case StateRegionEditPart.VISUAL_ID:
            return Region_3039;
        case RegionStateEditPart.VISUAL_ID:
            return State_3040;
        case VariableEditPart.VISUAL_ID:
            return Variable_3047;
        case TransitionEditPart.VISUAL_ID:
            return Transition_4005;
        }
        return null;
    }

}
