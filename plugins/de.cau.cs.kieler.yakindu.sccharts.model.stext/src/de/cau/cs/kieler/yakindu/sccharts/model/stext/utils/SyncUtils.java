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
package de.cau.cs.kieler.yakindu.sccharts.model.stext.utils;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.yakindu.sct.model.sgraph.Declaration;
import org.yakindu.sct.model.sgraph.Scope;
import org.yakindu.sct.model.sgraph.State;

/**
 * This class provides some utils to load declarations (signals and varibales).
 * from parent scopes {@link SynctextScopeProvider}.
 * 
 * @author wah
 * @kieler.rating green 2013-04-13
 * 
 */
public class SyncUtils {

	/**
	 * Method to find all ancestor declarations. All declarations in parent
	 * state and parent of parent states. This method goes through all parent
	 * scopes and puts declarations in an ArrayList.
	 * 
	 * @param object
	 *            the eContainer object
	 * @return ArrayList of Declarations
	 */
	public static ArrayList<Declaration> getAncestorDeclarations(EObject object) {
		// Initialize an ArrayList of declarations.
		ArrayList<Declaration> declarations = new ArrayList<Declaration>();
		// Go to the parent element.
		object = object.eContainer();
		while (object != null) {
			// If the object is a State get the declarations and put them in the
			// ArrayList.
			if (object instanceof State) {
				EList<Scope> scopes = ((State) object).getScopes();
				for (Scope scope : scopes) {
					declarations.addAll(scope.getDeclarations());
				}
			}
			// Go to the parent element.
			object = object.eContainer();
		}
		// Return the ArrayList of declarations
		return declarations;
	}
}
