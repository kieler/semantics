/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import de.cau.cs.kieler.sim.kiem.json.JSONArray;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.xkev.Activator;
import de.cau.cs.kieler.xkev.mapping.MappingPackage;
import de.cau.cs.kieler.xkev.mapping.Move;
import de.cau.cs.kieler.xkev.mapping.animations.MapAnimations;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.MoveImpl#getX_range <em>Xrange</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.MoveImpl#getY_range <em>Yrange</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoveImpl extends AnimationImpl implements Move {
    /**
     * The default value of the '{@link #getX_range() <em>Xrange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX_range()
     * @generated
     * @ordered
     */
    protected static final String XRANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX_range() <em>Xrange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX_range()
     * @generated
     * @ordered
     */
    protected String x_range = XRANGE_EDEFAULT;

    /**
     * The default value of the '{@link #getY_range() <em>Yrange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY_range()
     * @generated
     * @ordered
     */
    protected static final String YRANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getY_range() <em>Yrange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY_range()
     * @generated
     * @ordered
     */
    protected String y_range = YRANGE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MoveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.MOVE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getX_range() {
        return x_range;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setX_range(String newX_range) {
        String oldX_range = x_range;
        x_range = newX_range;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MOVE__XRANGE, oldX_range, x_range));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getY_range() {
        return y_range;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setY_range(String newY_range) {
        String oldY_range = y_range;
        y_range = newY_range;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MOVE__YRANGE, oldY_range, y_range));
    }
    
    
    private void moveAnimation(String svgElementId, String xValue, String yValue) {
        //Create a new Instance of MapAnimations for Method access and SVGDocument-Reference
        MapAnimations mapAnimation = new MapAnimations();
        SVGDocument svgDoc = mapAnimation.getSVGDocument();
//        System.out.println("xRange: "+xValue+" yRange:"+yValue);
        if (svgDoc == null) {
            return;
        }
        
        Element e = svgDoc.getElementById(svgElementId);
        //Test whether the svg element exists or not
        if (e != null) {
            float xPos, yPos;

            try {
                xPos = Float.parseFloat(e.getAttribute("x"));
                yPos = Float.parseFloat(e.getAttribute("y"));
//                System.out.println("xPos: "+xPos+"  yPos: "+yPos);
                
                if (xValue != null) {
//                    xPos += Float.parseFloat(xRange);
//                    e.setAttribute("x",Float.toString(xPos));
                    e.setAttribute("x",xValue);
                }
                if (yValue != null) {
//                    yPos += Float.parseFloat(yRange);
//                    e.setAttribute("y",Float.toString(yPos));
                    e.setAttribute("y",yValue);
                }
            } catch (NumberFormatException  e1) {
                Activator.reportErrorMessage("Attribute in "+svgDoc.getURL()+" has a wrong NumberFormat!", e1);
            } catch (DOMException e2) {
                Activator.reportErrorMessage("Something went wrong, setting an DOM element.", e2);
            }
        } else {
            Activator.reportErrorMessage("SVGElement with ID: "+svgElementId+" doesn't exists in "+svgDoc.getURL());
        }
       
    }
    
    
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void applyAnimation(JSONObject jsonObject, String svgElementID) {
        MapAnimations mapAnimation = new MapAnimations();
        String jsonValue = getActualJSONValue(jsonObject, svgElementID);
        ArrayList<HashMap<String,String>> hashMapArray_XRange, hashMapArray_YRange;
        HashMap<String,String> hashMap_XRange, hashMap_YRange;
        
        if (jsonValue != null) {
            hashMapArray_XRange = mapAnimation.mapInputToOutput(getInput(), getX_range(), true);
            hashMapArray_YRange = mapAnimation.mapInputToOutput(getInput(), getY_range(), true);
            int xRangeSize = hashMapArray_XRange.size();
            int yRangeSize = hashMapArray_YRange.size();
            int maxSize = Math.max(xRangeSize, yRangeSize);
            
            if (maxSize == xRangeSize) {
                //Now we know, that yRangeSize is the minimum
                for (int i = 0; i < yRangeSize; i++) {
                    hashMap_XRange = hashMapArray_XRange.get(i);
                    hashMap_YRange = hashMapArray_YRange.get(i);
                    if (hashMap_XRange.containsKey(jsonValue) || hashMap_YRange.containsKey(jsonValue)) {
                        moveAnimation(svgElementID, hashMap_XRange.get(jsonValue), hashMap_YRange.get(jsonValue));
                        //System.out.println("ElementID: "+svgElementID+ " JSONValue: "+jsonValue+" MappedValue x-range: "+hashMap_XRange.get(jsonValue)+" MappedValue y-range: "+hashMap_YRange.get(jsonValue));
                    }
                }
                //Now go on for the rest (until maxSize == xRangeSize)
                for (int i = yRangeSize; i < maxSize; i++) {
                    hashMap_XRange = hashMapArray_XRange.get(i);
                    if (hashMap_XRange.containsKey(jsonValue)) {
                        moveAnimation(svgElementID, hashMap_XRange.get(jsonValue), null);
                    }
                }
            } else {
                //Now we know, that xRangeSize is the minimum
                for (int i = 0; i < xRangeSize; i++) {
                    hashMap_XRange = hashMapArray_XRange.get(i);
                    hashMap_YRange = hashMapArray_YRange.get(i);
                    if (hashMap_XRange.containsKey(jsonValue) || hashMap_YRange.containsKey(jsonValue)) {
                        moveAnimation(svgElementID, hashMap_XRange.get(jsonValue), hashMap_YRange.get(jsonValue));
                        //System.out.println("ElementID: "+svgElementID+ " JSONValue: "+jsonValue+" MappedValue x-range: "+hashMap_XRange.get(jsonValue)+" MappedValue y-range: "+hashMap_YRange.get(jsonValue));
                    }
                }
                //Now go on for the rest (until maxSize == yRangeSize)
                for (int i = xRangeSize; i < maxSize; i++) {
                    hashMap_YRange = hashMapArray_YRange.get(i);
                    if (hashMap_YRange.containsKey(jsonValue)) {
                        moveAnimation(svgElementID, null, hashMap_YRange.get(jsonValue));
                    }
                }
            }
        }
    }
     

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MappingPackage.MOVE__XRANGE:
                return getX_range();
            case MappingPackage.MOVE__YRANGE:
                return getY_range();
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
            case MappingPackage.MOVE__XRANGE:
                setX_range((String)newValue);
                return;
            case MappingPackage.MOVE__YRANGE:
                setY_range((String)newValue);
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
            case MappingPackage.MOVE__XRANGE:
                setX_range(XRANGE_EDEFAULT);
                return;
            case MappingPackage.MOVE__YRANGE:
                setY_range(YRANGE_EDEFAULT);
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
            case MappingPackage.MOVE__XRANGE:
                return XRANGE_EDEFAULT == null ? x_range != null : !XRANGE_EDEFAULT.equals(x_range);
            case MappingPackage.MOVE__YRANGE:
                return YRANGE_EDEFAULT == null ? y_range != null : !YRANGE_EDEFAULT.equals(y_range);
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
        result.append(" (x_range: ");
        result.append(x_range);
        result.append(", y_range: ");
        result.append(y_range);
        result.append(')');
        return result.toString();
    }

} //MoveImpl
