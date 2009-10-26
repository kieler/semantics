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
 * A representation of the literals of the enumeration '<em><b>Move Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getMoveKind()
 * @model
 * @generated
 */
public enum MoveKind implements Enumerator {
	/**
	 * The '<em><b>Cmov</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CMOV_VALUE
	 * @generated
	 * @ordered
	 */
	CMOV(0, "cmov", "CVMOV"),

	/**
	 * The '<em><b>Vcmov</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VCMOV_VALUE
	 * @generated
	 * @ordered
	 */
	VCMOV(1, "vcmov", "VCMOV"),

	/**
	 * The '<em><b>Vvmov</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VVMOV_VALUE
	 * @generated
	 * @ordered
	 */
	VVMOV(2, "vvmov", "VVMOV"),

	/**
	 * The '<em><b>Ccmov</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CCMOV_VALUE
	 * @generated
	 * @ordered
	 */
	CCMOV(3, "ccmov", "CCMOV"),

	/**
	 * The '<em><b>Ivmov</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVMOV_VALUE
	 * @generated
	 * @ordered
	 */
	IVMOV(4, "ivmov", "IVMOV"),

	/**
	 * The '<em><b>Icmov</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICMOV_VALUE
	 * @generated
	 * @ordered
	 */
	ICMOV(5, "icmov", "ICMOV");

	/**
	 * The '<em><b>Cmov</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cmov</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CMOV
	 * @model name="cmov" literal="CVMOV"
	 * @generated
	 * @ordered
	 */
	public static final int CMOV_VALUE = 0;

	/**
	 * The '<em><b>Vcmov</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vcmov</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VCMOV
	 * @model name="vcmov" literal="VCMOV"
	 * @generated
	 * @ordered
	 */
	public static final int VCMOV_VALUE = 1;

	/**
	 * The '<em><b>Vvmov</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vvmov</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VVMOV
	 * @model name="vvmov" literal="VVMOV"
	 * @generated
	 * @ordered
	 */
	public static final int VVMOV_VALUE = 2;

	/**
	 * The '<em><b>Ccmov</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ccmov</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CCMOV
	 * @model name="ccmov" literal="CCMOV"
	 * @generated
	 * @ordered
	 */
	public static final int CCMOV_VALUE = 3;

	/**
	 * The '<em><b>Ivmov</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ivmov</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IVMOV
	 * @model name="ivmov" literal="IVMOV"
	 * @generated
	 * @ordered
	 */
	public static final int IVMOV_VALUE = 4;

	/**
	 * The '<em><b>Icmov</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Icmov</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICMOV
	 * @model name="icmov" literal="ICMOV"
	 * @generated
	 * @ordered
	 */
	public static final int ICMOV_VALUE = 5;

	/**
	 * An array of all the '<em><b>Move Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MoveKind[] VALUES_ARRAY =
		new MoveKind[] {
			CMOV,
			VCMOV,
			VVMOV,
			CCMOV,
			IVMOV,
			ICMOV,
		};

	/**
	 * A public read-only list of all the '<em><b>Move Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MoveKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Move Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MoveKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MoveKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Move Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MoveKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MoveKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Move Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MoveKind get(int value) {
		switch (value) {
			case CMOV_VALUE: return CMOV;
			case VCMOV_VALUE: return VCMOV;
			case VVMOV_VALUE: return VVMOV;
			case CCMOV_VALUE: return CCMOV;
			case IVMOV_VALUE: return IVMOV;
			case ICMOV_VALUE: return ICMOV;
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
	private MoveKind(int value, String name, String literal) {
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
	
} //MoveKind
