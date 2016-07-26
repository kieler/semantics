/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.c.sccharts.controller;

import org.eclipse.cdt.internal.ui.editor.CEditor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;

import com.google.inject.Guice;

import de.cau.cs.kieler.c.sccharts.CDTProcessor;
import de.cau.cs.kieler.c.sccharts.transformation.CbasedSCChartFeature;
import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.core.annotations.AnnotationsFactory;
import de.cau.cs.kieler.kico.klighd.KiCoModelUpdateController;
import de.cau.cs.kieler.sccharts.SCCharts;
import de.cau.cs.kieler.sccharts.State;

/**
 * @author leo
 *
 */
public class CDTUpdateController extends KiCoModelUpdateController  {
    
    /** Controller ID. */
    private static final String ID =
            "de.cau.cs.kieler.c.sccharts.controller.CDTUpdateController";

    /**
     * {@inheritDoc}
     */
    @Override
    public String getID() {
        return ID;
    }
   
    /**
     * {@inheritDoc}
     */
    @Override
    protected EObject readModel_NON_STATIC(final IEditorPart editor) {
        if (editor instanceof CEditor) {
            CDTProcessor CDTProcessor = Guice.createInjector().getInstance(CDTProcessor.class);
            SCCharts scchart = CDTProcessor.createFromEditor(editor);
            Annotation tag = AnnotationsFactory.eINSTANCE.createAnnotation();
            tag.setName(CbasedSCChartFeature.ID);
//            scchart.getAnnotations().add(tag);
            return scchart;
        }
        return null;
    }
}
