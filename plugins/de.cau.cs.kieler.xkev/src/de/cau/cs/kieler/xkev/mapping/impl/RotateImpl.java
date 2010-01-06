/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;
import de.cau.cs.kieler.xkev.Activator;
import de.cau.cs.kieler.xkev.mapping.MappingPackage;
import de.cau.cs.kieler.xkev.mapping.Rotate;
import de.cau.cs.kieler.xkev.mapping.animations.RunnableAnimation;
import de.cau.cs.kieler.xkev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.xkev.views.EclipseJSVGCanvas;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.RotateImpl#getAngle_range <em>Angle range</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.RotateImpl#getPivot <em>Pivot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RotateImpl extends AnimationImpl implements Rotate {
    /**
     * The default value of the '{@link #getAngle_range() <em>Angle range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAngle_range()
     * @generated
     * @ordered
     */
    protected static final String ANGLE_RANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAngle_range() <em>Angle range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAngle_range()
     * @generated
     * @ordered
     */
    protected String angle_range = ANGLE_RANGE_EDEFAULT;

    /**
     * The default value of the '{@link #getPivot() <em>Pivot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPivot()
     * @generated
     * @ordered
     */
    protected static final String PIVOT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPivot() <em>Pivot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPivot()
     * @generated
     * @ordered
     */
    protected String pivot = PIVOT_EDEFAULT;
    
    /**
     * A hashmap used for the animation, need to be created only once.
     */
    private HashMap<String, String> hashMap = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RotateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.ROTATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAngle_range() {
        return angle_range;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAngle_range(String newAngle_range) {
        String oldAngle_range = angle_range;
        angle_range = newAngle_range;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.ROTATE__ANGLE_RANGE, oldAngle_range, angle_range));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPivot() {
        return pivot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPivot(String newPivot) {
        String oldPivot = pivot;
        pivot = newPivot;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.ROTATE__PIVOT, oldPivot, pivot));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MappingPackage.ROTATE__ANGLE_RANGE:
                return getAngle_range();
            case MappingPackage.ROTATE__PIVOT:
                return getPivot();
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
            case MappingPackage.ROTATE__ANGLE_RANGE:
                setAngle_range((String)newValue);
                return;
            case MappingPackage.ROTATE__PIVOT:
                setPivot((String)newValue);
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
            case MappingPackage.ROTATE__ANGLE_RANGE:
                setAngle_range(ANGLE_RANGE_EDEFAULT);
                return;
            case MappingPackage.ROTATE__PIVOT:
                setPivot(PIVOT_EDEFAULT);
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
            case MappingPackage.ROTATE__ANGLE_RANGE:
                return ANGLE_RANGE_EDEFAULT == null ? angle_range != null : !ANGLE_RANGE_EDEFAULT.equals(angle_range);
            case MappingPackage.ROTATE__PIVOT:
                return PIVOT_EDEFAULT == null ? pivot != null : !PIVOT_EDEFAULT.equals(pivot);
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
        result.append(" (angle_range: ");
        result.append(angle_range);
        result.append(", pivot: ");
        result.append(pivot);
        result.append(')');
        return result.toString();
    }

    //Computes the range values
    private final ArrayList<String> computeRange(String value, int numberOfInputValues) {
        ArrayList<String> range = new ArrayList<String>();
        if (Pattern.matches("[-]?[\\d]+[.]{2,3}[-]?[\\d]+", value)) {
            Scanner sc = new Scanner(value).useDelimiter("[.]+");
            //We have exactly two values
            float first, last, numberOfRangeValues;
            first = sc.nextFloat();
            last = sc.nextFloat();
            
            numberOfRangeValues = Math.abs(first-last);
            System.out.println("first: "+first+ " last: "+last+ " NumberofRangeValues:"+numberOfRangeValues);
            float x = numberOfRangeValues / numberOfInputValues;
            System.out.println(x);
            if (first <= last) {
                for (int i = 0; i < numberOfInputValues; i++) {
                    range.add(Float.toString((x*i)+first));
                }
            } else {
                for (int i = 0; i < numberOfInputValues; i++) {
                    range.add(Float.toString(first-(x*i)));
                }
            }
        } else if (Pattern.matches("[-]?[\\d]+", value)) {
            for (int i = 0; i < numberOfInputValues; i++) {
                range.add(value);
            }
        } //else we have invalid values for move x_range and y_range
        System.out.println("Range size:"+ range.size());
        return range;
    }
    
    /* (non-Javadoc)
     * @see de.cau.cs.kieler.xkev.mapping.Animation#applyAnimation(de.cau.cs.kieler.sim.kiem.json.JSONObject, java.lang.String)
     */
    public void apply(Object jsonObject, String svgElementID) {
        MapAnimations mapAnimation = new MapAnimations();
        
        RunnableAnimation runnableAnimation = new RunnableAnimation((JSONObject) jsonObject, svgElementID) {

            public void run() {
                Element elem = getSVGElement();
                String jsonValue = getActualJSONValue(getJSONObject(), getSVGElementID());            
                if (jsonValue != null) {
                    float pivotX = 0, pivotY = 0;
                    if (getPivot() != null && !getPivot().isEmpty()) {
                        Scanner sc = new Scanner(getPivot()).useDelimiter("[,]");
                        try {
                            if (sc.hasNext()) {
                                pivotX = Float.parseFloat(sc.next());
                            }
                            if (sc.hasNext()) {
                                pivotY = Float.parseFloat(sc.next());
                            }
                        } catch (NumberFormatException e) {
                            Activator.reportInfoMessage("The rotate animation has wrong values for the pivot element. [SVGElementID: "+getSVGElementID()+"]");
                        }
                    }
                    System.out.println(pivotX+" "+pivotY);
                    String angle = hashMap.get(jsonValue);
                    if (angle != null) {
                        if (angle.indexOf("$") == 0) {
                            angle = ((JSONObject) getJSONObject()).optString(angle.substring(1));
                        }
                    }
                    if (elem != null) {
                        //Now apply the animation
                        try {
                           System.out.println("transform: rotate"+angle+","+pivotX+","+pivotY+")");
                           elem.setAttribute("transform", "rotate("+angle+","+pivotX+","+pivotY+")");
                        } catch (DOMException e) {
                            Activator.reportErrorMessage("Something went wrong, setting an DOM element.", e);
                        } catch (NumberFormatException e1) {
                            Activator.reportErrorMessage("Wrong format for pivot element in rotate animation", e1);
                        }
                    }
                }
            }
        };
        EclipseJSVGCanvas.getInstance().getUpdateManager().getUpdateRunnableQueue().invokeLater(runnableAnimation);
        
        
//        String jsonValue = getActualJSONValue(jsonObject, svgElementID);
//        float pivotX = 0, pivotY = 0;
//
//        if (jsonValue != null) {
//            //Parsing of the animation special attribute values
//            if (getPivot() != null && !getPivot().isEmpty()) {
//                Scanner sc = new Scanner(getPivot()).useDelimiter("[,]");
//                try {
//                    if (sc.hasNext()) {
//                        pivotX = Float.parseFloat(sc.next());
//                    }
//                    if (sc.hasNext()) {
//                        pivotY = Float.parseFloat(sc.next());
//                    }
//                } catch (NumberFormatException e) {
//                    Activator.reportInfoMessage("The rotate animation has wrong values for the pivot element. [SVGElementID: "+svgElementID+"]");
//                }
//            }
//            System.out.println(pivotX+" "+pivotY);
//            String angle = this.hashMap.get(jsonValue);
//            if (angle != null) {
//                if (angle.indexOf("$") == 0) {
//                    angle = ((JSONObject) jsonObject).optString(angle.substring(1));
//                }
//                //Now apply the animation
//                SVGDocument svgDoc;
//                svgDoc = mapAnimation.getSVGDocument();
//                if (svgDoc != null) {
//                    try {
//                       Element e = svgDoc.getElementById(svgElementID);
//                       if (e != null) {
//                           System.out.println("transform: rotate"+angle+","+pivotX+","+pivotY+")");
//                           e.setAttribute("transform", "rotate("+angle+","+pivotX+","+pivotY+")");
//                       }
//                    } catch (DOMException e) {
//                        Activator.reportErrorMessage("Something went wrong, setting an DOM element.", e);
//                    } catch (NumberFormatException e1) {
//                        Activator.reportErrorMessage("Wrong format for pivot element in rotate animation", e1);
//                    }
//                }
//            }
//        }
    }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.xkev.mapping.Animation#initialize()
     */
    public void initialize() {
        MapAnimations mapAnimation = new MapAnimations();
        
        ArrayList<String> inputArray, angleRange;
        inputArray = mapAnimation.attributeParser(getInput(), true);
        angleRange = computeRange(getAngle_range(), inputArray.size());
        
        //mapping of input to angle_range
        this.hashMap = mapAnimation.mapInputToOutput(inputArray, angleRange);
    }

} //RotateImpl
