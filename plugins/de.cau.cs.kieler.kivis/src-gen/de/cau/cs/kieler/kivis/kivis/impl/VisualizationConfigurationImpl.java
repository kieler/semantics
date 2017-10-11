/**
 */
package de.cau.cs.kieler.kivis.kivis.impl;

import de.cau.cs.kieler.kivis.kivis.Element;
import de.cau.cs.kieler.kivis.kivis.Interaction;
import de.cau.cs.kieler.kivis.kivis.KivisPackage;
import de.cau.cs.kieler.kivis.kivis.VisualizationConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visualization Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.impl.VisualizationConfigurationImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.impl.VisualizationConfigurationImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.impl.VisualizationConfigurationImpl#getInteractions <em>Interactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualizationConfigurationImpl extends MinimalEObjectImpl.Container implements VisualizationConfiguration
{
  /**
   * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
  protected static final String IMAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
  protected String image = IMAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Element> elements;

  /**
   * The cached value of the '{@link #getInteractions() <em>Interactions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractions()
   * @generated
   * @ordered
   */
  protected EList<Interaction> interactions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VisualizationConfigurationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return KivisPackage.Literals.VISUALIZATION_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImage()
  {
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImage(String newImage)
  {
    String oldImage = image;
    image = newImage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KivisPackage.VISUALIZATION_CONFIGURATION__IMAGE, oldImage, image));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Element>(Element.class, this, KivisPackage.VISUALIZATION_CONFIGURATION__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interaction> getInteractions()
  {
    if (interactions == null)
    {
      interactions = new EObjectContainmentEList<Interaction>(Interaction.class, this, KivisPackage.VISUALIZATION_CONFIGURATION__INTERACTIONS);
    }
    return interactions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case KivisPackage.VISUALIZATION_CONFIGURATION__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
      case KivisPackage.VISUALIZATION_CONFIGURATION__INTERACTIONS:
        return ((InternalEList<?>)getInteractions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case KivisPackage.VISUALIZATION_CONFIGURATION__IMAGE:
        return getImage();
      case KivisPackage.VISUALIZATION_CONFIGURATION__ELEMENTS:
        return getElements();
      case KivisPackage.VISUALIZATION_CONFIGURATION__INTERACTIONS:
        return getInteractions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KivisPackage.VISUALIZATION_CONFIGURATION__IMAGE:
        setImage((String)newValue);
        return;
      case KivisPackage.VISUALIZATION_CONFIGURATION__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Element>)newValue);
        return;
      case KivisPackage.VISUALIZATION_CONFIGURATION__INTERACTIONS:
        getInteractions().clear();
        getInteractions().addAll((Collection<? extends Interaction>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case KivisPackage.VISUALIZATION_CONFIGURATION__IMAGE:
        setImage(IMAGE_EDEFAULT);
        return;
      case KivisPackage.VISUALIZATION_CONFIGURATION__ELEMENTS:
        getElements().clear();
        return;
      case KivisPackage.VISUALIZATION_CONFIGURATION__INTERACTIONS:
        getInteractions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case KivisPackage.VISUALIZATION_CONFIGURATION__IMAGE:
        return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
      case KivisPackage.VISUALIZATION_CONFIGURATION__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case KivisPackage.VISUALIZATION_CONFIGURATION__INTERACTIONS:
        return interactions != null && !interactions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (image: ");
    result.append(image);
    result.append(')');
    return result.toString();
  }

} //VisualizationConfigurationImpl
