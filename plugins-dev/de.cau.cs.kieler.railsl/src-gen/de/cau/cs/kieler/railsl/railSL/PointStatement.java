/**
 * generated by Xtext 2.10.0
 */
package de.cau.cs.kieler.railsl.railSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.railsl.railSL.PointStatement#getPoints <em>Points</em>}</li>
 *   <li>{@link de.cau.cs.kieler.railsl.railSL.PointStatement#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.railsl.railSL.RailSLPackage#getPointStatement()
 * @model
 * @generated
 */
public interface PointStatement extends SetStatement
{
  /**
   * Returns the value of the '<em><b>Points</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Points</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Points</em>' attribute list.
   * @see de.cau.cs.kieler.railsl.railSL.RailSLPackage#getPointStatement_Points()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getPoints();

  /**
   * Returns the value of the '<em><b>Orientation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orientation</em>' attribute.
   * @see #setOrientation(String)
   * @see de.cau.cs.kieler.railsl.railSL.RailSLPackage#getPointStatement_Orientation()
   * @model
   * @generated
   */
  String getOrientation();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.railsl.railSL.PointStatement#getOrientation <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orientation</em>' attribute.
   * @see #getOrientation()
   * @generated
   */
  void setOrientation(String value);

} // PointStatement