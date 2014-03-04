/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.text.sct.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import com.google.common.base.Function;

import de.cau.cs.kieler.sccharts.Scope;

/**
 * @author ssm
 *
 */
public class SctQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
    
    private Function<EObject, String> idResolver = SimpleAttributeResolver.newResolver(String.class, "id");
    private Function<EObject, String> nameResolver = SimpleAttributeResolver.newResolver(String.class, "name");

    private Function<EObject, String> resolver = new Function<EObject, String>() {
        public String apply(EObject input) {
            if (input instanceof Scope) {
                return idResolver.apply(input);
            } else {
                return nameResolver.apply(input);
            }
        };
    }; 
            
    protected Function<EObject, String> getResolver() {
            return resolver;
    }
}
