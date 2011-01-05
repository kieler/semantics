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
package de.cau.cs.kieler.core.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

/**
 * Interface for providers of domain model elements. This can be used to connect code that
 * is independent of specific editor frameworks to frameworks such as GMF.
 *
 * @author msp
 */
public interface IDomainProvider {

    /**
     * Retrieve the domain model element from the given object.
     * 
     * @param object a selectable object, such as an edit part
     * @return the domain model element, or {@code null} if there is none
     */
    EObject getElement(Object object);
    
    /**
     * Retrieve the editing domain for model changes of the given object.
     * 
     * @param object a selectable object, such as an edit part
     * @return the transactional editing domain, or {@code null} if there is none
     */
    TransactionalEditingDomain getEditingDomain(Object object);
    
}
