package de.cau.cs.kieler.kexpressions.kext.scoping

import org.eclipse.xtext.naming.QualifiedName

class NamespaceName extends QualifiedName {
	
	protected new(String... segments) {
		super(segments)
	}
	
	override String toString() {
		return toString(":");
	}
	
}