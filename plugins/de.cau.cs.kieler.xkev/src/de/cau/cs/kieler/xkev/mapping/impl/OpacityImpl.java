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

import de.cau.cs.kieler.xkev.Activator;
import de.cau.cs.kieler.xkev.mapping.MappingPackage;
import de.cau.cs.kieler.xkev.mapping.Opacity;
import de.cau.cs.kieler.xkev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.xkev.mapping.animations.RunnableAnimation;
import de.cau.cs.kieler.xkev.views.EclipseJSVGCanvas;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.json.JSONObject;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGLocatable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opacity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.OpacityImpl#getOpacity <em>Opacity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpacityImpl extends AnimationImpl implements Opacity {
    /**
     * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpacity()
     * @generated
     * @ordered
     */
    protected static final String OPACITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpacity()
     * @generated
     * @ordered
     */
    protected String opacity = OPACITY_EDEFAULT;

    
    /**
     * The hashmap for mapping the input to the corresponding opacity values
     */
    private HashMap<String, String> hashMapOpacityRange = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpacityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.OPACITY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOpacity() {
        return opacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOpacity(String newOpacity) {
        String oldOpacity = opacity;
        opacity = newOpacity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.OPACITY__OPACITY, oldOpacity, opacity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MappingPackage.OPACITY__OPACITY:
                return getOpacity();
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
            case MappingPackage.OPACITY__OPACITY:
                setOpacity((String)newValue);
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
            case MappingPackage.OPACITY__OPACITY:
                setOpacity(OPACITY_EDEFAULT);
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
            case MappingPackage.OPACITY__OPACITY:
                return OPACITY_EDEFAULT == null ? opacity != null : !OPACITY_EDEFAULT.equals(opacity);
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
        result.append(" (opacity: ");
        result.append(opacity);
        result.append(')');
        return result.toString();
    }
    
    
    
    //Computes the range values
    private final ArrayList<String> computeRange(String value, int numberOfInputValues) {
        ArrayList<String> range = new ArrayList<String>();
        if (Pattern.matches("[-]?\\d+[.]{2,3}[-]?\\d+", value)) {
            Scanner sc = new Scanner(value).useDelimiter("[.]+");
            //We have exactly two values
            float first, last, numberOfRangeValues;
            first = sc.nextFloat();
            last = sc.nextFloat();
            
            numberOfRangeValues = Math.abs(first-last);
//            System.out.println("first: "+first+ " last: "+last+ " NumberofRangeValues:"+numberOfRangeValues);
            float x = numberOfRangeValues / numberOfInputValues;
//            System.out.println(x);
            if (first <= last) {
                for (int i = 0; i < numberOfInputValues; i++) {
                    range.add(Float.toString((x*i)+first));
                }
            } else {
                for (int i = 0; i < numberOfInputValues; i++) {
                    range.add(Float.toString(first-(x*i)));
                }
            }
        } else if (Pattern.matches("([-]?\\d+([.]\\d+)?[,])+[-]?\\d+([.]\\d+)?", value)) {
            //Get a list of comma separted values
            range = new MapAnimations().attributeParser(value, false);
        } else if (Pattern.matches("[-]?\\d+([.]\\d+)?", value)) {
            for (int i = 0; i < numberOfInputValues; i++) {
                range.add(value);
            }
        } //else we have invalid values for move x_range and y_range
//        System.out.println("Range size:"+ range.size());
        return range;
    }


    /* (non-Javadoc)
     * @see de.cau.cs.kieler.xkev.mapping.Animation#apply(java.lang.Object, java.lang.String)
     */
    public void apply(Object jsonObject, String svgElementID) {
        RunnableAnimation runnableAnimation = new RunnableAnimation((JSONObject) jsonObject, svgElementID) {
            
            public void run() {
                Element elem = getSVGElement();
                String jsonValue = getActualJSONValue(getJSONObject(), getSVGElementID());
                if (jsonValue != null) {
                    //Now apply the animation
                    if (elem != null) {
                        try {
                            String opacityValue = hashMapOpacityRange.get(jsonValue);
                            if (opacityValue == null) {
                                return;
                            }
                            String attrib = elem.getAttribute("style");
                            attrib = attrib.replaceAll("opacity:\\d+([.]\\d+)?[;]?", "");
                            elem.setAttribute("style", "opacity:"+Float.parseFloat(opacityValue)+";"+attrib);
                        } catch (DOMException e1) {
                            Activator.reportErrorMessage("Something went wrong, setting an DOM element.", e1);
                        }
                    } else {
                        Activator.reportErrorMessage("SVGElement with ID: "+getSVGElementID()+" doesn't exists in "+EclipseJSVGCanvas.getInstance().getSVGDocument().getURL());
                    }                
                }
            }
        };
        EclipseJSVGCanvas.getInstance().getUpdateManager().getUpdateRunnableQueue().invokeLater(runnableAnimation);
        
    }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.xkev.mapping.Animation#initialize()
     */
    public void initialize() {
        MapAnimations mapAnimation = new MapAnimations();

        ArrayList<String> inputArray, opacityRange;
        inputArray = mapAnimation.attributeParser(getInput(), true);
        opacityRange = computeRange(getOpacity(), inputArray.size());
//        System.out.println("Input: "+inputArray);
//        System.out.println("Output: "+opacityRange);
        
        hashMapOpacityRange = mapAnimation.mapInputToOutput(inputArray, opacityRange);
//        System.out.println(hashMapOpacityRange);
    }

} //OpacityImpl
