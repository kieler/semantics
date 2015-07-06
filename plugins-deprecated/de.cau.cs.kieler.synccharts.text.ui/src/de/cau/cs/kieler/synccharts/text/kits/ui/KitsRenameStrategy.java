/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.text.kits.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.refactoring.impl.DefaultRenameStrategy;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * Custom {@link org.eclipse.xtext.ui.refactoring.IRenameStrategy} contributing to the Kits editor.<br>
 * This customization enables the renaming of instances of {@link de.cau.cs.kieler.synccharts.Scope
 * Scope}, which do not have a 'name' attribute but an 'id' field.
 * 
 * @author chsch
 */
@SuppressWarnings("restriction")
public class KitsRenameStrategy extends DefaultRenameStrategy {

    @Override
    protected EAttribute getNameAttribute(final EObject targetElement) {
        if (SyncchartsPackage.eINSTANCE.getScope().isInstance(targetElement)) {
            return SyncchartsPackage.eINSTANCE.getScope_Id();
        } else {
            return super.getNameAttribute();
        }
    }
}
