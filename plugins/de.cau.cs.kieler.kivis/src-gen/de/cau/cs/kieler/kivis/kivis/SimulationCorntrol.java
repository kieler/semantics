/**
 * generated by Xtext
 */
package de.cau.cs.kieler.kivis.kivis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Simulation Corntrol</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getSimulationCorntrol()
 * @model
 * @generated
 */
public enum SimulationCorntrol implements Enumerator
{
  /**
   * The '<em><b>NONE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NONE_VALUE
   * @generated
   * @ordered
   */
  NONE(0, "NONE", "nothing"),

  /**
   * The '<em><b>STEP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STEP_VALUE
   * @generated
   * @ordered
   */
  STEP(1, "STEP", "step"),

  /**
   * The '<em><b>STOP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STOP_VALUE
   * @generated
   * @ordered
   */
  STOP(2, "STOP", "stop"),

  /**
   * The '<em><b>PAUSE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PAUSE_VALUE
   * @generated
   * @ordered
   */
  PAUSE(3, "PAUSE", "pause"),

  /**
   * The '<em><b>PLAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLAY_VALUE
   * @generated
   * @ordered
   */
  PLAY(4, "PLAY", "play");

  /**
   * The '<em><b>NONE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NONE
   * @model literal="nothing"
   * @generated
   * @ordered
   */
  public static final int NONE_VALUE = 0;

  /**
   * The '<em><b>STEP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STEP
   * @model literal="step"
   * @generated
   * @ordered
   */
  public static final int STEP_VALUE = 1;

  /**
   * The '<em><b>STOP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STOP
   * @model literal="stop"
   * @generated
   * @ordered
   */
  public static final int STOP_VALUE = 2;

  /**
   * The '<em><b>PAUSE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PAUSE
   * @model literal="pause"
   * @generated
   * @ordered
   */
  public static final int PAUSE_VALUE = 3;

  /**
   * The '<em><b>PLAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLAY
   * @model literal="play"
   * @generated
   * @ordered
   */
  public static final int PLAY_VALUE = 4;

  /**
   * An array of all the '<em><b>Simulation Corntrol</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SimulationCorntrol[] VALUES_ARRAY =
    new SimulationCorntrol[]
    {
      NONE,
      STEP,
      STOP,
      PAUSE,
      PLAY,
    };

  /**
   * A public read-only list of all the '<em><b>Simulation Corntrol</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SimulationCorntrol> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Simulation Corntrol</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SimulationCorntrol get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SimulationCorntrol result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Simulation Corntrol</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SimulationCorntrol getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SimulationCorntrol result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Simulation Corntrol</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SimulationCorntrol get(int value)
  {
    switch (value)
    {
      case NONE_VALUE: return NONE;
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
  private SimulationCorntrol(int value, String name, String literal)
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
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
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
  
} //SimulationCorntrol
