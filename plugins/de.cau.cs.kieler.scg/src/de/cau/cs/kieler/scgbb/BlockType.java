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
package de.cau.cs.kieler.scgbb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Block Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getBlockType()
 * @model
 * @generated
 */
public enum BlockType implements Enumerator {
	/**
     * The '<em><b>NORMAL</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #NORMAL_VALUE
     * @generated
     * @ordered
     */
	NORMAL(0, "NORMAL", "NORMAL"),

	/**
     * The '<em><b>DEPTH</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #DEPTH_VALUE
     * @generated
     * @ordered
     */
	DEPTH(1, "DEPTH", "DEPTH"),

	/**
     * The '<em><b>TRUEBRANCH</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #TRUEBRANCH_VALUE
     * @generated
     * @ordered
     */
	TRUEBRANCH(2, "TRUEBRANCH", "TRUEBRANCH"), /**
     * The '<em><b>ELSEBRANCH</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #ELSEBRANCH_VALUE
     * @generated
     * @ordered
     */
	ELSEBRANCH(3, "ELSEBRANCH", "ELSEBRANCH"), /**
     * The '<em><b>SYNCHRONIZER</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #SYNCHRONIZER_VALUE
     * @generated
     * @ordered
     */
	SYNCHRONIZER(4, "SYNCHRONIZER", "SYNCHRONIZER");

	/**
     * The '<em><b>NORMAL</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #NORMAL
     * @model
     * @generated
     * @ordered
     */
	public static final int NORMAL_VALUE = 0;

	/**
     * The '<em><b>DEPTH</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEPTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #DEPTH
     * @model
     * @generated
     * @ordered
     */
	public static final int DEPTH_VALUE = 1;

	/**
     * The '<em><b>TRUEBRANCH</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRUEBRANCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #TRUEBRANCH
     * @model
     * @generated
     * @ordered
     */
	public static final int TRUEBRANCH_VALUE = 2;

	/**
     * The '<em><b>ELSEBRANCH</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ELSEBRANCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #ELSEBRANCH
     * @model
     * @generated
     * @ordered
     */
	public static final int ELSEBRANCH_VALUE = 3;

	/**
     * The '<em><b>SYNCHRONIZER</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYNCHRONIZER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #SYNCHRONIZER
     * @model
     * @generated
     * @ordered
     */
	public static final int SYNCHRONIZER_VALUE = 4;

	/**
     * An array of all the '<em><b>Block Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final BlockType[] VALUES_ARRAY =
		new BlockType[] {
            NORMAL,
            DEPTH,
            TRUEBRANCH,
            ELSEBRANCH,
            SYNCHRONIZER,
        };

	/**
     * A public read-only list of all the '<em><b>Block Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<BlockType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Block Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static BlockType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            BlockType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Block Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static BlockType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            BlockType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Block Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static BlockType get(int value) {
        switch (value) {
            case NORMAL_VALUE: return NORMAL;
            case DEPTH_VALUE: return DEPTH;
            case TRUEBRANCH_VALUE: return TRUEBRANCH;
            case ELSEBRANCH_VALUE: return ELSEBRANCH;
            case SYNCHRONIZER_VALUE: return SYNCHRONIZER;
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
	private BlockType(int value, String name, String literal) {
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
	
} //BlockType
