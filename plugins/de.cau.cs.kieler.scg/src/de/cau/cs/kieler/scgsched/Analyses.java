/**
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
package de.cau.cs.kieler.scgsched;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Analyses</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getAnalyses()
 * @model
 * @generated
 */
public enum Analyses implements Enumerator {
	/**
	 * The '<em><b>User Defined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_DEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USER_DEFINED(0, "UserDefined", "UserDefined"),

	/**
	 * The '<em><b>Potential Instantaneous Loop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POTENTIAL_INSTANTANEOUS_LOOP_VALUE
	 * @generated
	 * @ordered
	 */
	POTENTIAL_INSTANTANEOUS_LOOP(1, "PotentialInstantaneousLoop", "PotentialInstantaneousLoop"),

	/**
	 * The '<em><b>Join Feedback</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOIN_FEEDBACK_VALUE
	 * @generated
	 * @ordered
	 */
	JOIN_FEEDBACK(2, "JoinFeedback", "JoinFeedback"),

	/**
	 * The '<em><b>Interleaved Assignment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERLEAVED_ASSIGNMENT_VALUE
	 * @generated
	 * @ordered
	 */
	INTERLEAVED_ASSIGNMENT(3, "InterleavedAssignment", "InterleavedAssignment");

	/**
	 * The '<em><b>User Defined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>User Defined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USER_DEFINED
	 * @model name="UserDefined"
	 * @generated
	 * @ordered
	 */
	public static final int USER_DEFINED_VALUE = 0;

	/**
	 * The '<em><b>Potential Instantaneous Loop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Potential Instantaneous Loop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POTENTIAL_INSTANTANEOUS_LOOP
	 * @model name="PotentialInstantaneousLoop"
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_INSTANTANEOUS_LOOP_VALUE = 1;

	/**
	 * The '<em><b>Join Feedback</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Join Feedback</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOIN_FEEDBACK
	 * @model name="JoinFeedback"
	 * @generated
	 * @ordered
	 */
	public static final int JOIN_FEEDBACK_VALUE = 2;

	/**
	 * The '<em><b>Interleaved Assignment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interleaved Assignment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERLEAVED_ASSIGNMENT
	 * @model name="InterleavedAssignment"
	 * @generated
	 * @ordered
	 */
	public static final int INTERLEAVED_ASSIGNMENT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Analyses</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Analyses[] VALUES_ARRAY =
		new Analyses[] {
			USER_DEFINED,
			POTENTIAL_INSTANTANEOUS_LOOP,
			JOIN_FEEDBACK,
			INTERLEAVED_ASSIGNMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Analyses</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Analyses> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Analyses</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Analyses get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Analyses result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Analyses</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Analyses getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Analyses result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Analyses</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Analyses get(int value) {
		switch (value) {
			case USER_DEFINED_VALUE: return USER_DEFINED;
			case POTENTIAL_INSTANTANEOUS_LOOP_VALUE: return POTENTIAL_INSTANTANEOUS_LOOP;
			case JOIN_FEEDBACK_VALUE: return JOIN_FEEDBACK;
			case INTERLEAVED_ASSIGNMENT_VALUE: return INTERLEAVED_ASSIGNMENT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Analyses(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Analyses
