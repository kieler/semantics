package de.cau.cs.kieler.core.kexpressions.text.scoping

import org.eclipse.xtext.naming.QualifiedName

class NamespaceName extends QualifiedName {
	
	protected new(String... segments) {
		super(segments)
	}
	
	override String toString() {
		return toString(":");
	}
	
}