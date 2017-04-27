/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kexpressions.test.scoping;

import de.cau.cs.kieler.kexpressions.ValueType;
import de.cau.cs.kieler.kexpressions.impl.DeclarationImpl;

/**
 * This class implements a dummy scope provided declaring a bunch of dummy signals and dummy
 * variables for the KExpressions tests.
 * 
 * @author ssm
 * 
 */
public class DummyDeclaration extends DeclarationImpl {

	public DummyDeclaration(ValueType valueType) {
		setType(valueType);
	}
}