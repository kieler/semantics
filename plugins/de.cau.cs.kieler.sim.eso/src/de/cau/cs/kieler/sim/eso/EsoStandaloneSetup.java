/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.eso;

import de.cau.cs.kieler.sim.eso.EsoStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry.
 * 
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 */
public class EsoStandaloneSetup extends EsoStandaloneSetupGenerated{

	public static void doSetup() {
		new EsoStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

