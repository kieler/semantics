/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.text.sct.scoping;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;
import de.cau.cs.kieler.core.kexpressions.PrimitiveType;
import de.cau.cs.kieler.core.kexpressions.Type;
import de.cau.cs.kieler.core.kexpressions.ValueType;

/**
 *
 * @author chsch
 */
public class SctTypeProvider {

    private static final String TYPE_RESOURCE_URI_STRING = "kexpressions://types";
    private static final URI TYPE_RESOURCE_URI = URI.createURI(TYPE_RESOURCE_URI_STRING);
    
    private ResourceSet resourceSet = null;
    
    public SctTypeProvider(ResourceSet theResourceSet) {
        this.resourceSet = theResourceSet;
    }
    
    public Type findTypeByName(final String name) {
        if (this.resourceSet == null) {
            return null;
        }
        
        final Resource res = this.resourceSet.getResource(TYPE_RESOURCE_URI, true);
        
        if (res.getContents().isEmpty()) {
            createTypes(res);
        }

        final PrimitiveType type = Iterables.getFirst(Iterables.filter(
                    Iterables.filter(res.getContents(), PrimitiveType.class),
                    new Predicate<PrimitiveType>() {
                        public boolean apply(final PrimitiveType type) {
                            return type.getName().equals(name);
                        }
                    }), null);
        return type;
    }
    
    private void createTypes(Resource resource) {
        PrimitiveType t;
        List<EObject> content = resource.getContents();
        
        for(ValueType vt : ValueType.values()) {
            t= KExpressionsFactory.eINSTANCE.createPrimitiveType();
            t.setName(vt.getLiteral());
            content.add(t);
        }
    }
}
