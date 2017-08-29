/**
 */
package de.cau.cs.kieler.kivis.kivis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Simulation Operation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getSimulationOperation()
 * @model
 * @generated
 */
public enum SimulationOperation implements Enumerator
{
  /**
   * The '<em><b>STEP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STEP_VALUE
   * @generated
   * @ordered
   */
  STEP(0, "STEP", "step"),

  /**
   * The '<em><b>STOP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STOP_VALUE
   * @generated
   * @ordered
   */
  STOP(1, "STOP", "stop"),

  /**
   * The '<em><b>PAUSE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PAUSE_VALUE
   * @generated
   * @ordered
   */
  PAUSE(2, "PAUSE", "pause"),

  /**
   * The '<em><b>PLAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLAY_VALUE
   * @generated
   * @ordered
   */
  PLAY(3, "PLAY", "play");

  /**
   * The '<em><b>STEP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STEP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STEP
   * @model literal="step"
   * @generated
   * @ordered
   */
  public static final int STEP_VALUE = 0;

  /**
   * The '<em><b>STOP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STOP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STOP
   * @model literal="stop"
   * @generated
   * @ordered
   */
  public static final int STOP_VALUE = 1;

  /**
   * The '<em><b>PAUSE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PAUSE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PAUSE
   * @model literal="pause"
   * @generated
   * @ordered
   */
  public static final int PAUSE_VALUE = 2;

  /**
   * The '<em><b>PLAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PLAY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PLAY
   * @model literal="play"
   * @generated
   * @ordered
   */
  public static final int PLAY_VALUE = 3;

  /**
   * An array of all the '<em><b>Simulation Operation</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SimulationOperation[] VALUES_ARRAY =
    new SimulationOperation[]
    {
      STEP,
      STOP,
      PAUSE,
      PLAY,
    };

  /**
   * A public read-only list of all the '<em><b>Simulation Operation</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SimulationOperation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Simulation Operation</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SimulationOperation get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SimulationOperation result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Simulation Operation</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SimulationOperation getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SimulationOperation result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Simulation Operation</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SimulationOperation get(int value)
  {
    switch (value)
    {
      case STEP_VALUE: return STEP;
      case STOP_VALUE: return STOP;
      case PAUSE_VALUE: return PAUSE;
      case PLAY_VALUE: return PLAY;
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
  private SimulationOperation(int value, String name, String literal)
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
  
} //SimulationOperation
