/**
 * generated by Xtext
 */
package de.cau.cs.kieler.kivis.kivis.impl;

import de.cau.cs.kieler.kivis.kivis.Content;
import de.cau.cs.kieler.kivis.kivis.KivisPackage;
import de.cau.cs.kieler.kivis.kivis.Visualization;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visualization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.impl.VisualizationImpl#getImages <em>Images</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.impl.VisualizationImpl#getLoads <em>Loads</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.impl.VisualizationImpl#getInit <em>Init</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.impl.VisualizationImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualizationImpl extends MinimalEObjectImpl.Container implements Visualization
{
  /**
   * The cached value of the '{@link #getImages() <em>Images</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImages()
   * @generated
   * @ordered
   */
  protected EList<String> images;

  /**
   * The cached value of the '{@link #getLoads() <em>Loads</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoads()
   * @generated
   * @ordered
   */
  protected EList<String> loads;

  /**
   * The default value of the '{@link #getInit() <em>Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected static final String INIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected String init = INIT_EDEFAULT;

  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected EList<Content> content;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VisualizationImpl()
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
    return KivisPackage.Literals.VISUALIZATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getImages()
  {
    if (images == null)
    {
      images = new EDataTypeEList<String>(String.class, this, KivisPackage.VISUALIZATION__IMAGES);
    }
    return images;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getLoads()
  {
    if (loads == null)
    {
      loads = new EDataTypeEList<String>(String.class, this, KivisPackage.VISUALIZATION__LOADS);
    }
    return loads;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInit(String newInit)
  {
    String oldInit = init;
    init = newInit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KivisPackage.VISUALIZATION__INIT, oldInit, init));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Content> getContent()
  {
    if (content == null)
    {
      content = new EObjectContainmentEList<Content>(Content.class, this, KivisPackage.VISUALIZATION__CONTENT);
    }
    return content;
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
      case KivisPackage.VISUALIZATION__CONTENT:
        return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
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
      case KivisPackage.VISUALIZATION__IMAGES:
        return getImages();
      case KivisPackage.VISUALIZATION__LOADS:
        return getLoads();
      case KivisPackage.VISUALIZATION__INIT:
        return getInit();
      case KivisPackage.VISUALIZATION__CONTENT:
        return getContent();
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
      case KivisPackage.VISUALIZATION__IMAGES:
        getImages().clear();
        getImages().addAll((Collection<? extends String>)newValue);
        return;
      case KivisPackage.VISUALIZATION__LOADS:
        getLoads().clear();
        getLoads().addAll((Collection<? extends String>)newValue);
        return;
      case KivisPackage.VISUALIZATION__INIT:
        setInit((String)newValue);
        return;
      case KivisPackage.VISUALIZATION__CONTENT:
        getContent().clear();
        getContent().addAll((Collection<? extends Content>)newValue);
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
      case KivisPackage.VISUALIZATION__IMAGES:
        getImages().clear();
        return;
      case KivisPackage.VISUALIZATION__LOADS:
        getLoads().clear();
        return;
      case KivisPackage.VISUALIZATION__INIT:
        setInit(INIT_EDEFAULT);
        return;
      case KivisPackage.VISUALIZATION__CONTENT:
        getContent().clear();
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
      case KivisPackage.VISUALIZATION__IMAGES:
        return images != null && !images.isEmpty();
      case KivisPackage.VISUALIZATION__LOADS:
        return loads != null && !loads.isEmpty();
      case KivisPackage.VISUALIZATION__INIT:
        return INIT_EDEFAULT == null ? init != null : !INIT_EDEFAULT.equals(init);
      case KivisPackage.VISUALIZATION__CONTENT:
        return content != null && !content.isEmpty();
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (images: ");
    result.append(images);
    result.append(", loads: ");
    result.append(loads);
    result.append(", init: ");
    result.append(init);
    result.append(')');
    return result.toString();
  }

} //VisualizationImpl
