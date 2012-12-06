package de.cau.cs.kieler.yakindu.scc.model.scctext.util;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.yakindu.sct.model.sgraph.Declaration;
import org.yakindu.sct.model.sgraph.Scope;
import org.yakindu.sct.model.sgraph.State;

public class SccUtils {

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
