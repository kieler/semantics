/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping.impl;

import java.util.ArrayList;
import java.util.HashMap;

import de.cau.cs.kieler.sim.kiem.json.JSONArray;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.xkev.Activator;
import de.cau.cs.kieler.xkev.mapping.Animation;
import de.cau.cs.kieler.xkev.mapping.MappingPackage;
import de.cau.cs.kieler.xkev.mapping.animations.MapAnimations;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Animation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.AnimationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.AnimationImpl#getAccessID <em>Access ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.AnimationImpl#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AnimationImpl extends EObjectImpl implements Animation {
    /**
     * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInput()
     * @generated
     * @ordered
     */
    protected static final String INPUT_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInput()
     * @generated
     * @ordered
     */
    protected String input = INPUT_EDEFAULT;
    /**
     * The default value of the '{@link #getAccessID() <em>Access ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccessID()
     * @generated
     * @ordered
     */
    protected static final String ACCESS_ID_EDEFAULT = "";
    /**
     * The cached value of the '{@link #getAccessID() <em>Access ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccessID()
     * @generated
     * @ordered
     */
    protected String accessID = ACCESS_ID_EDEFAULT;
    /**
     * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKey()
     * @generated
     * @ordered
     */
    protected static final String KEY_EDEFAULT = "";
    /**
     * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKey()
     * @generated
     * @ordered
     */
    protected String key = KEY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnimationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.ANIMATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInput() {
        return input;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInput(String newInput) {
        String oldInput = input;
        input = newInput;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.ANIMATION__INPUT, oldInput, input));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAccessID() {
        return accessID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAccessID(String newAccessID) {
        String oldAccessID = accessID;
        accessID = newAccessID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.ANIMATION__ACCESS_ID, oldAccessID, accessID));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getKey() {
        return key;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKey(String newKey) {
        String oldKey = key;
        key = newKey;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.ANIMATION__KEY, oldKey, key));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getActualJSONValue(Object jsonObject, String svgElementID) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void applyAnimation(Object jsonObject, String svgElementID) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MappingPackage.ANIMATION__INPUT:
                return getInput();
            case MappingPackage.ANIMATION__ACCESS_ID:
                return getAccessID();
            case MappingPackage.ANIMATION__KEY:
                return getKey();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case MappingPackage.ANIMATION__INPUT:
                setInput((String)newValue);
                return;
            case MappingPackage.ANIMATION__ACCESS_ID:
                setAccessID((String)newValue);
                return;
            case MappingPackage.ANIMATION__KEY:
                setKey((String)newValue);
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
    public void eUnset(int featureID) {
        switch (featureID) {
            case MappingPackage.ANIMATION__INPUT:
                setInput(INPUT_EDEFAULT);
                return;
            case MappingPackage.ANIMATION__ACCESS_ID:
                setAccessID(ACCESS_ID_EDEFAULT);
                return;
            case MappingPackage.ANIMATION__KEY:
                setKey(KEY_EDEFAULT);
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
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case MappingPackage.ANIMATION__INPUT:
                return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
            case MappingPackage.ANIMATION__ACCESS_ID:
                return ACCESS_ID_EDEFAULT == null ? accessID != null : !ACCESS_ID_EDEFAULT.equals(accessID);
            case MappingPackage.ANIMATION__KEY:
                return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (input: ");
        result.append(input);
        result.append(", accessID: ");
        result.append(accessID);
        result.append(", key: ");
        result.append(key);
        result.append(')');
        return result.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * This abstract method is equal for all animations.
     * It just returns the jsonValue from the jsonObject, if exists.
     * <!-- end-user-doc -->
     */
    public String getActualJSONValue(JSONObject jsonObject, String svgElementID) {
        String jsonValue = null;
         
        //if the input-tag exists and if it's not empty than do use it, otherwise ignore it
        if (getInput() != null && !getInput().isEmpty()) {
            //check whether the value contains an id or not
            
            //Wenn der Key leer ist, setzt ihn per default auf die svgElementId
            if (getKey() == null || getKey().isEmpty()) {
                setKey(svgElementID);
            }
            
            //If we have an accessID, the jsonValue must be an JSONArray
            if (getAccessID() != null && !getAccessID().isEmpty()) {
                try {
                    int pos = Integer.parseInt(getAccessID());
                    JSONArray jsonArray = jsonObject.optJSONArray(getKey());
                    
                    //check, whether the value is in a valid array-range
                    if (jsonArray == null || pos < 0 || pos >= jsonArray.length()) {
                        Activator.reportErrorMessage("Value out of Range: The value of the \"accessID\" attribute is not in the valid array-range! [SVGElement:"+svgElementID+"]");
                        return null;
                    }
                    jsonValue = jsonArray.optString(pos);
                } catch (NumberFormatException e) {
                    // TODO Auto-generated catch block
                    Activator.reportErrorMessage("NumberFormatException: The value of the \"accessID\" attribute is not a valid integer value! [SVGElement:"+svgElementID+"]");
                }
            } else {
                //If the accessID is either empty or null, we treat the JSONValue as a normal value instead of an JSONArray
                jsonValue = jsonObject.optString(getKey());
            }
        }
        return jsonValue;
    }

    /**
     * <!-- begin-user-doc -->
     * This method should be implemented by each animation.
     * It should contain the special animation-code, which is different for each animation.
     * <!-- end-user-doc -->
     */
    public void applyAnimation() {

    }


} //AnimationImpl
