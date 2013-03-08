/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.model.stext.utils;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.yakindu.sct.model.sgraph.Declaration;
import org.yakindu.sct.model.sgraph.Scope;
import org.yakindu.sct.model.sgraph.State;

/**
 * This class provides some utils to load declarations (signals and varibales)
 * from parent scopes
 * 
 * @author wah
 * 
 */
public class SyncUtils {

	/**
	 * Method to find all ancestor declarations. All declarations in parent
	 * state and parent of parent states.
	 * 
	 * @param object
	 *            the eContainer object
	 * @return ArrayList of Declarations
	 */
	public static ArrayList<Declaration> getAncestorDeclarations(EObject object) {
		ArrayList<Declaration> declarations = new ArrayList<Declaration>();
		object = object.eContainer();
		while (object != null) {
			if (object instanceof State) {
				EList<Scope> scopes = ((State) object).getScopes();
				for (Scope scope : scopes) {
					declarations.addAll(scope.getDeclarations());
				}
			}
			object = object.eContainer();
		}
		return declarations;
	}

	/**
	 * Method to return declarations made in the current state.
	 * 
	 * @param object
	 *            the eContainer object
	 * @return ArrayList of Declarations
	 */
	public static ArrayList<Declaration> getCurrentStateDeclarations(
			EObject object) {
		ArrayList<Declaration> declarations = new ArrayList<Declaration>();
		while (object != null) {
			if (object instanceof State) {
				EList<Scope> scopes = ((State) object).getScopes();
				for (Scope scope : scopes) {
					declarations.addAll(scope.getDeclarations());
				}
				return declarations;
			}
			object = object.eContainer();
		}
		return null;
	}
}
