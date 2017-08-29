/**
 */
package de.cau.cs.kieler.kivis.kivis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DOM Event</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getDOMEvent()
 * @model
 * @generated
 */
public enum DOMEvent implements Enumerator
{
  /**
   * The '<em><b>CLICK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CLICK_VALUE
   * @generated
   * @ordered
   */
  CLICK(0, "CLICK", "click"),

  /**
   * The '<em><b>MOUSEDOWN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MOUSEDOWN_VALUE
   * @generated
   * @ordered
   */
  MOUSEDOWN(1, "MOUSEDOWN", "mousedown"),

  /**
   * The '<em><b>MOUSEUP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MOUSEUP_VALUE
   * @generated
   * @ordered
   */
  MOUSEUP(2, "MOUSEUP", "mouseup"),

  /**
   * The '<em><b>MOUSEMOVE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MOUSEMOVE_VALUE
   * @generated
   * @ordered
   */
  MOUSEMOVE(3, "MOUSEMOVE", "mousemove");

  /**
   * The '<em><b>CLICK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CLICK</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CLICK
   * @model literal="click"
   * @generated
   * @ordered
   */
  public static final int CLICK_VALUE = 0;

  /**
   * The '<em><b>MOUSEDOWN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MOUSEDOWN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MOUSEDOWN
   * @model literal="mousedown"
   * @generated
   * @ordered
   */
  public static final int MOUSEDOWN_VALUE = 1;

  /**
   * The '<em><b>MOUSEUP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MOUSEUP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MOUSEUP
   * @model literal="mouseup"
   * @generated
   * @ordered
   */
  public static final int MOUSEUP_VALUE = 2;

  /**
   * The '<em><b>MOUSEMOVE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MOUSEMOVE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MOUSEMOVE
   * @model literal="mousemove"
   * @generated
   * @ordered
   */
  public static final int MOUSEMOVE_VALUE = 3;

  /**
   * An array of all the '<em><b>DOM Event</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DOMEvent[] VALUES_ARRAY =
    new DOMEvent[]
    {
      CLICK,
      MOUSEDOWN,
      MOUSEUP,
      MOUSEMOVE,
    };

  /**
   * A public read-only list of all the '<em><b>DOM Event</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DOMEvent> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>DOM Event</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DOMEvent get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DOMEvent result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>DOM Event</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DOMEvent getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DOMEvent result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>DOM Event</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DOMEvent get(int value)
  {
    switch (value)
    {
      case CLICK_VALUE: return CLICK;
      case MOUSEDOWN_VALUE: return MOUSEDOWN;
      case MOUSEUP_VALUE: return MOUSEUP;
      case MOUSEMOVE_VALUE: return MOUSEMOVE;
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
  private DOMEvent(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //DOMEvent
