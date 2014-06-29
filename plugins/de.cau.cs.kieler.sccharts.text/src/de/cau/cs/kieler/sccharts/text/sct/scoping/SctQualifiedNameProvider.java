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

import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.util.Tuples;

import com.google.common.base.Function;
import com.google.inject.Inject;
import com.google.inject.Provider;

import de.cau.cs.kieler.sccharts.Node;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.Scope;

/**
 * @author ssm
 *
 */
public class SctQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

    private PolymorphicDispatcher<QualifiedName> qualifiedName = new PolymorphicDispatcher<QualifiedName>("qualifiedName",1,1,Collections.singletonList(this), PolymorphicDispatcher.NullErrorHandler.<QualifiedName>get())
    {
            @Override
            protected QualifiedName handleNoSuchMethod(Object... params) { 
                    return null;
            }
    }; 
    
    @Inject
    private IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();
    
    @Inject
    private IResourceScopeCache cache = IResourceScopeCache.NullImpl.INSTANCE;    
    
    private Function<EObject, String> idResolver = SimpleAttributeResolver.newResolver(String.class, "id");
    private Function<EObject, String> nameResolver = SimpleAttributeResolver.newResolver(String.class, "name");

    private Function<EObject, String> resolver = new Function<EObject, String>() {
        public String apply(EObject input) {
            if (input instanceof Scope || input instanceof Region || input instanceof Node) {
                return idResolver.apply(input);
            } else {
                return nameResolver.apply(input);
            }
        };
    }; 
            
    protected Function<EObject, String> getResolver() {
            return resolver;
    }
    
    public QualifiedName getFullyQualifiedName(final EObject obj) {
        return cache.get(Tuples.pair(obj, "fqn"), obj.eResource(), new Provider<QualifiedName>(){

                public QualifiedName get() {
                        EObject temp = obj;
                        Resource res = obj.eResource();
                        QualifiedName qualifiedNameFromDispatcher = qualifiedName.invoke(temp);
                        if (qualifiedNameFromDispatcher!=null)
                                return qualifiedNameFromDispatcher;
                        String name = getResolver().apply(temp);
                        if (Strings.isEmpty(name))
                                return null;
                        QualifiedName qualifiedNameFromConverter = converter.toQualifiedName(name);
                        while (temp.eContainer() != null) {
                                temp = temp.eContainer();
                                QualifiedName parentsQualifiedName = getFullyQualifiedName(temp);
                                if (parentsQualifiedName != null)
                                        return parentsQualifiedName.append(qualifiedNameFromConverter);
                        }
                        return qualifiedNameFromConverter;
                }
        });
}
}
