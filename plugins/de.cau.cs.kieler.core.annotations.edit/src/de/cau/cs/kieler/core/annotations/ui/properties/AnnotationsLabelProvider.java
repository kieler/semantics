/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.annotations.ui.properties;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.core.annotations.AnnotationType;
import de.cau.cs.kieler.core.annotations.BooleanAnnotation;
import de.cau.cs.kieler.core.annotations.ContainmentAnnotation;
import de.cau.cs.kieler.core.annotations.FloatAnnotation;
import de.cau.cs.kieler.core.annotations.IntAnnotation;
import de.cau.cs.kieler.core.annotations.ReferenceAnnotation;
import de.cau.cs.kieler.core.annotations.StringAnnotation;
import de.cau.cs.kieler.core.annotations.TypedStringAnnotation;

/**
 * Label provider for annotations.
 *
 * @author msp
 */
public class AnnotationsLabelProvider extends BaseLabelProvider implements ITableLabelProvider {

    /** map of already loaded images. */
    private Map<String, Image> imageMap = new HashMap<String, Image>();
    
    /**
     * Retrieve the image for the given key. The key is the image file name without extension.
     * 
     * @param key image file name
     * @return the corresponding image, or {@code null} if there is no such image
     */
    public Image getImage(final String key) {
        Image image = imageMap.get(key);
        if (image == null) {
            image = AbstractUIPlugin.imageDescriptorFromPlugin(
                    AnnotationsPropertySection.PLUGIN_ID,
                    "icons/obj16/" + key + ".gif").createImage();
            if (image != null) {
                imageMap.put(key, image);
            }
        }
        return image;
    }
    
    /**
     * {@inheritDoc}
     */
    public Image getColumnImage(Object element, int columnIndex) {
        if (columnIndex == AnnotationsPropertySection.COL_VALUE) {
            switch (AnnotationType.of((Annotation) element)) {
            case STRING:
            case TYPED_STRING:
                return getImage("prop_text");
            case INT:
                return getImage("prop_int");
            case BOOLEAN:
                if (((BooleanAnnotation) element).isValue()) {
                    return getImage("prop_true");
                } else {
                    return getImage("prop_false");
                }
            case FLOAT:
                return getImage("prop_float");
            default:
                throw new IllegalArgumentException(
                        "Annotation type must not be CONTAINMENT, REFERENCE, or NONE.");
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public String getColumnText(Object element, int columnIndex) {
        Annotation annotation = (Annotation) element;
        switch (columnIndex) {
        case AnnotationsPropertySection.COL_ANNOTATION:
            return annotation.getName();
        case AnnotationsPropertySection.COL_VALUE:
            switch (AnnotationType.of((Annotation) element)) {
            case TYPED_STRING:
                TypedStringAnnotation tsa = (TypedStringAnnotation) annotation;
                if (tsa.getType() != null) {
                    return tsa.getValue() + " (" + tsa.getType() + ")";
                } else {
                    return tsa.getValue();
                }
            case STRING:
                return ((StringAnnotation) annotation).getValue();
            case INT:
                return Integer.toString(((IntAnnotation) annotation).getValue());
            case BOOLEAN:
                return Boolean.toString(((BooleanAnnotation) annotation).isValue());
            case FLOAT:
                return Float.toString(((FloatAnnotation) annotation).getValue());
            case REFERENCE:
                EObject object = ((ReferenceAnnotation) annotation).getObject();
                if (object != null) {
                    return object.eClass().getName();
                }
            case CONTAINMENT:
                object = ((ContainmentAnnotation) annotation).getObject();
                if (object != null) {
                    return object.eClass().getName();
                }
            default:
                return null;
            }
        default:
            return null;
        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void dispose() {
        super.dispose();
        for (Image image : imageMap.values()) {
            image.dispose();
        }
        imageMap.clear();
    }

}
