/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.text.kits.ui;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.validation.DiagnosticConverterImpl;
import org.eclipse.xtext.validation.Issue;

/**
 * This class is used to filter the validation diagnostics. This is needed
 * since a lot of them are not valid if a sub model is shown in the KITS view.
 * Currently all of the check file based diagnostics are dropped since 
 * they can't be identified that in turn disables a more sensitive filtering.
 * 
 * @author chsch
 */
public class KitsDiagnosticConverterImpl extends DiagnosticConverterImpl {

    public void convertValidatorDiagnostic(org.eclipse.emf.common.util.Diagnostic diagnostic,
            IAcceptor<Issue> acceptor) {
        if (diagnostic instanceof MWEDiagnostic) {
            return;
        }
        super.convertValidatorDiagnostic(diagnostic, acceptor);
    }
    
    protected EStructuralFeature getFeature(Diagnostic diagnostic) {
        List<?> data = diagnostic.getData();
        Object feature = data.size() > 1 ? data.get(1) : null;
        return resolveStructuralFeature(getCauser(diagnostic), feature);
    }
}
