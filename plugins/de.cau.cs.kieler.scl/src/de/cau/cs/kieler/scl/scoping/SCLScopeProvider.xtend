package de.cau.cs.kieler.scl.scoping

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.impl.SimpleScope
import de.cau.cs.kieler.scl.scl.SCLProgram
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.naming.QualifiedName
import java.util.Collections
import de.cau.cs.kieler.scl.scl.StatementScope
import java.util.HashSet

class SCLScopeProvider extends AbstractDeclarativeScopeProvider{
	
	public override IScope getScope(EObject context, EReference reference) {
		val l = <IEObjectDescription>newLinkedList
		val m = new HashSet<String>
		var parent = context
		var continue = true
		
		while (continue) {
		while (!(parent instanceof SCLProgram) && !(parent instanceof StatementScope)) {
			parent = parent.eContainer
		}
		if (parent instanceof StatementScope) {
			(parent as StatementScope).declarations.forEach [
				valuedObjects.forEach [
					if (!m.contains(it.name)) {
						l.add(
				                new EObjectDescription(QualifiedName.create(it.name), it,
				                    Collections.<String, String>emptyMap()))
	                    m.add(it.name)
					}
				]
			]
			parent = parent.eContainer
			
		}
		else {
			(parent as SCLProgram).declarations.forEach [
				valuedObjects.forEach [
					if (!m.contains(it.name)) {
						l.add(
				                new EObjectDescription(QualifiedName.create(it.name), it,
				                    Collections.<String, String>emptyMap()))
				        m.add(it.name)
					}
				]
			]
			continue = false;
		}
		}
		println("context: " + context + " l: " + l)

		
		return new SimpleScope(l)
	}
}