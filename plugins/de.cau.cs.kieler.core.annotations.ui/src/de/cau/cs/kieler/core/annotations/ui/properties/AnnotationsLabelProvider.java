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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.core.annotations.BooleanAnnotation;
import de.cau.cs.kieler.core.annotations.ContainmentAnnotation;
import de.cau.cs.kieler.core.annotations.FloatAnnotation;
import de.cau.cs.kieler.core.annotations.IntAnnotation;
import de.cau.cs.kieler.core.annotations.ReferenceAnnotation;
import de.cau.cs.kieler.core.annotations.StringAnnotation;
import de.cau.cs.kieler.core.annotations.TypedStringAnnotation;
import de.cau.cs.kieler.core.annotations.ui.AnnotationsUiPlugin;
import de.cau.cs.kieler.core.annotations.ui.AnnotationsUiPlugin.Images;
import de.cau.cs.kieler.core.annotations.ui.internal.AnnotationsActivator;

/**
 * Label provider for annotations.
 *
 * @author msp
 */
public class AnnotationsLabelProvider extends BaseLabelProvider implements ITableLabelProvider {

    /**
     * {@inheritDoc}
     */
    public Image getColumnImage(Object element, int columnIndex) {
        if (columnIndex == AnnotationsPropertySection.COL_VALUE) {
            Images images = ((AnnotationsUiPlugin) AnnotationsActivator.getInstance()).getImages();
            if (element instanceof StringAnnotation) {
                return images.get("prop_text");
            } else if (element instanceof IntAnnotation) {
                return images.get("prop_int");
            } else if (element instanceof BooleanAnnotation) {
                if (((BooleanAnnotation) element).isValue()) {
                    return images.get("prop_true");
                } else {
                    return images.get("prop_false");
                }
            } else if (element instanceof FloatAnnotation) {
                return images.get("prop_float");
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
            if (annotation instanceof TypedStringAnnotation) {
                TypedStringAnnotation tsa = (TypedStringAnnotation) annotation;
                if (tsa.getType() != null) {
                    return tsa.getValue() + " (" + tsa.getType() + ")";
                } else {
                    return tsa.getValue();
                }
            } else if (annotation instanceof StringAnnotation) {
                return ((StringAnnotation) annotation).getValue();
            } else if (annotation instanceof IntAnnotation) {
                return Integer.toString(((IntAnnotation) annotation).getValue());
            } else if (annotation instanceof BooleanAnnotation) {
                return Boolean.toString(((BooleanAnnotation) annotation).isValue());
            } else if (annotation instanceof FloatAnnotation) {
                return Float.toString(((FloatAnnotation) annotation).getValue());
            } else if (annotation instanceof ReferenceAnnotation) {
                EObject object = ((ReferenceAnnotation) annotation).getObject();
                if (object != null) {
                    return object.eClass().getName();
                }
            } else if (annotation instanceof ContainmentAnnotation) {
                EObject object = ((ContainmentAnnotation) annotation).getObject();
                if (object != null) {
                    return object.eClass().getName();
                }
            }
        }
        return null;
    }

}
