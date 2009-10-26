/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.krep.editors.klp.klp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Jump Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getJumpKind()
 * @model
 * @generated
 */
public enum JumpKind implements Enumerator {
	/**
	 * The '<em><b>Jt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JT_VALUE
	 * @generated
	 * @ordered
	 */
	JT(0, "jt", "JT"),

	/**
	 * The '<em><b>Jf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JF_VALUE
	 * @generated
	 * @ordered
	 */
	JF(1, "jf", "JF"),

	/**
	 * The '<em><b>Jz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JZ_VALUE
	 * @generated
	 * @ordered
	 */
	JZ(2, "jz", "JZ"),

	/**
	 * The '<em><b>Jnz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JNZ_VALUE
	 * @generated
	 * @ordered
	 */
	JNZ(3, "jnz", "JNZ");

	/**
	 * The '<em><b>Jt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Jt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JT
	 * @model name="jt" literal="JT"
	 * @generated
	 * @ordered
	 */
	public static final int JT_VALUE = 0;

	/**
	 * The '<em><b>Jf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Jf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JF
	 * @model name="jf" literal="JF"
	 * @generated
	 * @ordered
	 */
	public static final int JF_VALUE = 1;

	/**
	 * The '<em><b>Jz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Jz</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JZ
	 * @model name="jz" literal="JZ"
	 * @generated
	 * @ordered
	 */
	public static final int JZ_VALUE = 2;

	/**
	 * The '<em><b>Jnz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Jnz</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JNZ
	 * @model name="jnz" literal="JNZ"
	 * @generated
	 * @ordered
	 */
	public static final int JNZ_VALUE = 3;

	/**
	 * An array of all the '<em><b>Jump Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JumpKind[] VALUES_ARRAY =
		new JumpKind[] {
			JT,
			JF,
			JZ,
			JNZ,
		};

	/**
	 * A public read-only list of all the '<em><b>Jump Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JumpKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Jump Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JumpKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JumpKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Jump Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JumpKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JumpKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Jump Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JumpKind get(int value) {
		switch (value) {
			case JT_VALUE: return JT;
			case JF_VALUE: return JF;
			case JZ_VALUE: return JZ;
			case JNZ_VALUE: return JNZ;
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
	private JumpKind(int value, String name, String literal) {
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
	
} //JumpKind
