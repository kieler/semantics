/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.kexpressions.test.scoping;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import de.cau.cs.kieler.core.kexpressions.ValueType;

/**
 * This class implements a dummy scope provided declaring a bunch of dummy signals and dummy
 * variables for the KExpressions tests.
 * 
 * @author cmot, ssm
 * 
 */
public class DummyScopeProvider extends AbstractDeclarativeScopeProvider {

    @Override
    public IScope getScope(EObject context, EReference reference) {
        LinkedList<EObject> eObjectList = new LinkedList<EObject>();

        DummyDeclaration declaration = new DummyDeclaration(ValueType.INT);
         
        eObjectList.add(new DummyValuedObject(declaration, "A"));
        eObjectList.add(new DummyValuedObject(declaration, "B"));
        eObjectList.add(new DummyValuedObject(declaration, "C"));
        eObjectList.add(new DummyValuedObject(declaration, "D"));

        return Scopes.scopeFor(eObjectList,
                QualifiedName.wrapper(SimpleAttributeResolver.newResolver(String.class, "name")),
                IScope.NULLSCOPE);
    }
}
