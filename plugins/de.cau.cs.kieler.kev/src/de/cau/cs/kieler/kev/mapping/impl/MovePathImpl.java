/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import de.cau.cs.kieler.kev.Activator;
import de.cau.cs.kieler.kev.mapping.MappingPackage;
import de.cau.cs.kieler.kev.mapping.MovePath;
import de.cau.cs.kieler.kev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.kev.views.EclipseJSVGCanvas;

import org.apache.batik.dom.svg.SVGOMPathElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.json.JSONObject;

import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.svg.SVGDocument;
import org.w3c.dom.svg.SVGLocatable;
import org.w3c.dom.svg.SVGPoint;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Move Path</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.MovePathImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.MovePathImpl#getAnchorPoint <em>Anchor Point</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.MovePathImpl#getAutoOrientation <em>Auto Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MovePathImpl extends AnimationImpl implements MovePath {
    /**
     * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected static final String PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected String path = PATH_EDEFAULT;

    /**
     * The default value of the '{@link #getAnchor_point() <em>Anchor point</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAnchor_point()
     * @generated
     * @ordered
     */
    protected static final String ANCHOR_POINT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAnchorPoint() <em>Anchor Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnchorPoint()
     * @generated
     * @ordered
     */
    protected String anchorPoint = ANCHOR_POINT_EDEFAULT;

    private SVGPoint lastPoint = null;

    private HashMap<String, MovePathAttributeRecord> inputHashMap = null;
    
    private MovePathAttributeRecord lastValues = null;
    
    private String initialAttribute = null;

    /**
     * The default value of the '{@link #getAutoOrientation() <em>Auto Orientation</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAutoOrientation()
     * @generated
     * @ordered
     */
    protected static final String AUTO_ORIENTATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAutoOrientation() <em>Auto Orientation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAutoOrientation()
     * @generated
     * @ordered
     */
    protected String autoOrientation = AUTO_ORIENTATION_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MovePathImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.MOVE_PATH;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getPath() {
        return path;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPath(String newPath) {
        String oldPath = path;
        path = newPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MOVE_PATH__PATH, oldPath, path));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAnchorPoint() {
        return anchorPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnchorPoint(String newAnchorPoint) {
        String oldAnchorPoint = anchorPoint;
        anchorPoint = newAnchorPoint;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MOVE_PATH__ANCHOR_POINT, oldAnchorPoint, anchorPoint));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAutoOrientation() {
        return autoOrientation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAutoOrientation(String newAutoOrientation) {
        String oldAutoOrientation = autoOrientation;
        autoOrientation = newAutoOrientation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MOVE_PATH__AUTO_ORIENTATION, oldAutoOrientation, autoOrientation));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MappingPackage.MOVE_PATH__PATH:
                return getPath();
            case MappingPackage.MOVE_PATH__ANCHOR_POINT:
                return getAnchorPoint();
            case MappingPackage.MOVE_PATH__AUTO_ORIENTATION:
                return getAutoOrientation();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case MappingPackage.MOVE_PATH__PATH:
                setPath((String)newValue);
                return;
            case MappingPackage.MOVE_PATH__ANCHOR_POINT:
                setAnchorPoint((String)newValue);
                return;
            case MappingPackage.MOVE_PATH__AUTO_ORIENTATION:
                setAutoOrientation((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case MappingPackage.MOVE_PATH__PATH:
                setPath(PATH_EDEFAULT);
                return;
            case MappingPackage.MOVE_PATH__ANCHOR_POINT:
                setAnchorPoint(ANCHOR_POINT_EDEFAULT);
                return;
            case MappingPackage.MOVE_PATH__AUTO_ORIENTATION:
                setAutoOrientation(AUTO_ORIENTATION_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case MappingPackage.MOVE_PATH__PATH:
                return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
            case MappingPackage.MOVE_PATH__ANCHOR_POINT:
                return ANCHOR_POINT_EDEFAULT == null ? anchorPoint != null : !ANCHOR_POINT_EDEFAULT.equals(anchorPoint);
            case MappingPackage.MOVE_PATH__AUTO_ORIENTATION:
                return AUTO_ORIENTATION_EDEFAULT == null ? autoOrientation != null : !AUTO_ORIENTATION_EDEFAULT.equals(autoOrientation);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (path: ");
        result.append(path);
        result.append(", anchorPoint: ");
        result.append(anchorPoint);
        result.append(", autoOrientation: ");
        result.append(autoOrientation);
        result.append(')');
        return result.toString();
    }

    //vorher SVGPoint
    private String computeAngle(SVGPoint p1, SVGPoint p2) {
        final double RADTODEG = 180.0 / Math.PI;
        double deltaX, deltaY, alpha;

        deltaX = p2.getX() - p1.getX();// Ankathete
        deltaY = p2.getY() - p1.getY();// Gegenkathete

        alpha = Math.atan(deltaY / deltaX) * RADTODEG;

        if (deltaX > 0 && deltaY <= 0) {
            // values from 0 - -90 nothing to do change here
        } else if (deltaX <= 0 && deltaY <= 0) {
            // mapping from 90 - 0 to -90 - -180
            alpha = 180 - alpha;
            alpha *= -1;
        } else if (deltaX <= 0 && deltaY > 0) {
            // mapping from 0 - 90 to -180 - -270
            alpha = 180 - alpha;
            alpha *= -1;
        } else if (deltaX > 0 && deltaY > 0) {
            // mapping from 90 - 0 to -90 - -180
            alpha = 360 - alpha;
            alpha *= -1;
        }
        return Double.toString(alpha);
    }
    
    public void apply(Object jsonObject, String svgElementID) {
        // Get the current SVGDocument for manipulation.
        SVGDocument svgDoc = EclipseJSVGCanvas.getInstance().getSVGDocument();
        Element elem = svgDoc.getElementById(svgElementID);
        MapAnimations currentMapAnimation = MapAnimations.getInstance();
        
        // Check whether JSON object is an JSONAArray
        String jsonValue;
        if (getAccessID() != null && !getAccessID().equals("")) {
            jsonValue = ((JSONObject) jsonObject).optJSONArray(getKey()).optString(Integer.parseInt(getAccessID()));
            if (jsonValue.equals("")) {
                return;
            }
        } else {
            jsonValue = ((JSONObject) jsonObject).optString(getKey());    
        }
        
        
        // Now apply the animation.
        if (elem != null) {
            try {
                SVGLocatable locatable = (SVGLocatable) elem;
                SVGOMPathElement path;
                String pathValue, anchorPointValue, autoOrientationValue, angleValue, xValue, yValue, attribute;        
                
                if (getInput().equals("")) {
                    // If no input is set, return the value of actual json key.
                    pathValue = getPath();
                    anchorPointValue = getAnchorPoint();
                    autoOrientationValue = getAutoOrientation();
                    
                    if (pathValue.indexOf("$") == 0) {
                        pathValue = ((JSONObject) jsonObject).optString(pathValue.substring(1));
                    }
                    if (anchorPointValue.indexOf("$") == 0) {
                        anchorPointValue = ((JSONObject) jsonObject).optString(anchorPointValue.substring(1));
                    }
                    if (autoOrientationValue.indexOf("$") == 0) {
                        autoOrientationValue = ((JSONObject) jsonObject).optString(autoOrientationValue.substring(1));
                    }                    
                    
                    lastValues.path = pathValue;
                    lastValues.autoOrientation = autoOrientationValue;
                    lastValues.anchorPoint = anchorPointValue;
                    float pivotX, pivotY;

                    if (anchorPointValue.equals("")) {
                        pivotX = 0;
                        pivotY = 0;
                    } else {

                        if (anchorPointValue.equals("")) {
                            pivotX = 0;
                            pivotY = 0; 
                        } else { 
                            Scanner sc = new Scanner(anchorPointValue).useDelimiter(",").useLocale(Locale.US);
                            if (sc.hasNextFloat()) {
                                pivotX = sc.nextFloat();
                                if (sc.hasNextFloat()) {
                                    pivotY = sc.nextFloat();
                                } else {
                                    pivotX = 0;
                                    pivotY = 0;
                                }
                            } else {
                                pivotX = 0;
                                pivotY = 0;
                            }
                        }
                    }

                    if (pathValue.equals("")) {
                        return; //Without a valid path it makes no sense
                    } else {
                        path = SVGOMPathElement.class.cast(svgDoc.getElementById(pathValue));
                        
                        Double currentValue = Double.parseDouble(jsonValue) % path.getTotalLength();
                        SVGPoint currentPoint;
                        currentPoint = path.getPointAtLength(currentValue.floatValue());//new point
       
                        if (lastPoint != null) {
                            angleValue = computeAngle(currentPoint, lastPoint);
                        } else {
                            angleValue = "";
                        }

                        xValue = Double.toString(currentPoint.getX() - locatable.getBBox().getX() - pivotX);
                        yValue = Double.toString(currentPoint.getY() - locatable.getBBox().getY() - pivotY);                            

                        lastPoint = currentPoint;
                    }
                    
                    //if the set already contains the key it must have been modified
                    if (currentMapAnimation.getModifiedKeyMap().containsKey(svgElementID)) {
                        attribute = elem.getAttribute("transform");
                    } else {
                        attribute = initialAttribute;
                    } 
                    attribute += "translate(" + xValue + "," + yValue + ")";
                    if (angleValue != null && !angleValue.equals("") && xValue != null
                            && !xValue.equals("") && yValue != null && !yValue.equals("")) {
                        if (autoOrientationValue.equals("true")) {
                            attribute += "rotate(" + angleValue + "," + (locatable.getBBox().getX() + pivotX) + "," + (locatable.getBBox().getY() + pivotY) + ")";
//                            elem.setAttribute("transform", attrib + "rotate(" + angleValue
//                                    + "," + (locatable.getBBox().getX() + pivotX)
//                                    + "," + (locatable.getBBox().getY() + pivotY)
//                                    + ")");
                        } 
                    }
                    elem.setAttribute("transform", attribute);
                } else {
                    //Check whether the input matches the value
                    Iterator<String> it = inputHashMap.keySet().iterator();
                    String inputValue;
                    
                    while (it.hasNext()) {
                        inputValue = it.next();
                        if (jsonValue.equals(inputValue) || currentMapAnimation.valueMatchesRange(jsonValue, inputValue) ) {
                            pathValue = inputHashMap.get(inputValue).path;
                            autoOrientationValue = inputHashMap.get(inputValue).autoOrientation;
                            anchorPointValue = inputHashMap.get(inputValue).anchorPoint;
                            
                            if (pathValue.indexOf("$") == 0) {
                                pathValue = ((JSONObject) jsonObject).optString(pathValue.substring(1));
                            }
                            if (autoOrientationValue.indexOf("$") == 0) {
                                autoOrientationValue = ((JSONObject) jsonObject).optString(autoOrientationValue.substring(1));
                            }                            
                            if (anchorPointValue.indexOf("$") == 0) {
                                anchorPointValue = ((JSONObject) jsonObject).optString(anchorPointValue.substring(1));
                            }
                            
                            lastValues.path = pathValue;
                            lastValues.autoOrientation = autoOrientationValue;
                            lastValues.anchorPoint = anchorPointValue;
                            float pivotX, pivotY;

                            if (anchorPointValue.equals("")) {
                                pivotX = 0;
                                pivotY = 0;
                            } else {

                                if (anchorPointValue.equals("")) {
                                    pivotX = 0;
                                    pivotY = 0; 
                                } else { 
                                    Scanner sc = new Scanner(anchorPointValue).useDelimiter(",").useLocale(Locale.US);
                                    if (sc.hasNextFloat()) {
                                        pivotX = sc.nextFloat();
                                        if (sc.hasNextFloat()) {
                                            pivotY = sc.nextFloat();
                                        } else {
                                            pivotX = 0;
                                            pivotY = 0;
                                        }
                                    } else {
                                        pivotX = 0;
                                        pivotY = 0;
                                    }
                                }
                            }

                            if (pathValue.equals("")) {
                                return; //Without a valid path it makes no sense
                            } else {
                                path = SVGOMPathElement.class.cast(svgDoc.getElementById(pathValue));
                                
                                String currentValue, pathRange;
                                
                                pathRange = "0.." + Math.round(Math.floor(path.getTotalLength())); 
                                currentValue = currentMapAnimation.computeRangeValue(jsonValue, inputValue, pathRange);

                                SVGPoint currentPoint;
                                if (path != null && !currentValue.equals("")) {
                                    currentPoint = path.getPointAtLength(Float.parseFloat(currentValue));//new point
                                } else {
                                    return;
                                }
               
                                if (lastPoint != null) {
                                    angleValue = computeAngle(currentPoint, lastPoint);
                                } else {
                                    angleValue = "";
                                }

                                xValue = Double.toString(currentPoint.getX() - locatable.getBBox().getX() - pivotX);
                                yValue = Double.toString(currentPoint.getY() - locatable.getBBox().getY() - pivotY);                            

                                lastPoint = currentPoint;
                            }
                            
                            

//                            String attrib = "translate(" + xValue + "," + yValue + ")";
//                            elem.setAttribute("transform", attrib);
//                            if (angleValue != null && !angleValue.equals("") && xValue != null
//                                    && !xValue.equals("") && yValue != null && !yValue.equals("")) {
//                                if (autoOrientationValue.equals("true")) {
//                                    elem.setAttribute("transform", attrib + "rotate(" + angleValue
//                                            + "," + (locatable.getBBox().getX() + pivotX)
//                                            + "," + (locatable.getBBox().getY() + pivotY)
//                                            + ")");
//                                } 
//                            }
                            //if the set already contains the key it must have been modified
                            if (currentMapAnimation.getModifiedKeyMap().containsKey(svgElementID)) {
                                attribute = elem.getAttribute("transform");
                            } else {
                                attribute = initialAttribute;
                            } 
                            attribute += "translate(" + xValue + "," + yValue + ")";
                            if (angleValue != null && !angleValue.equals("") && xValue != null
                                    && !xValue.equals("") && yValue != null && !yValue.equals("")) {
                                if (autoOrientationValue.equals("true")) {
                                    attribute += "rotate(" + angleValue + "," + (locatable.getBBox().getX() + pivotX) + "," + (locatable.getBBox().getY() + pivotY) + ")";
//                                    elem.setAttribute("transform", attrib + "rotate(" + angleValue
//                                            + "," + (locatable.getBBox().getX() + pivotX)
//                                            + "," + (locatable.getBBox().getY() + pivotY)
//                                            + ")");
                                } 
                            }
                            elem.setAttribute("transform", attribute);                            
                            return;
                        }
                    }
                }
            } catch (DOMException e1) {
                Activator.reportErrorMessage("Something went wrong, setting an DOM element.",
                        e1);
            }
        } else {
            Activator.reportErrorMessage("SVGElement with ID: " + svgElementID
                    + " doesn't exists in "
                    + EclipseJSVGCanvas.getInstance().getSVGDocument().getURL());
        }
    }


    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.kev.mapping.Animation#initialize()
     */
    public void initialize(String svgElementID) {
        SVGDocument svgDoc = EclipseJSVGCanvas.getInstance().getSVGDocument();
        Element elem = svgDoc.getElementById(svgElementID);
        MapAnimations currentMapAnimation = MapAnimations.getInstance();
        if (elem != null) {
            initialAttribute = elem.getAttribute("transform");
        } else {
            initialAttribute = "";
        }
        
        
        // Check whether the Element is a clone and not already created
        if (elem == null && isClonedElement(svgElementID)) {
            String originalID = svgElementID.substring(1, svgElementID.lastIndexOf("_"));

            // System.out.println("Original: "+originalID+ " Clone: "+svgElementID);

            Element original, clone;
            original = svgDoc.getElementById(originalID);
            clone = (Element) original.cloneNode(true); // We need a deep clone with all child
            // elements if exists (see the text-element
            // for example)
            clone.setAttribute("id", svgElementID);     // Now the new id of the Element needs to be set

            Node parentNode = original.getParentNode();
            parentNode.appendChild(clone);// Append the new Element to the DOM-Tree
            //            elem = clone;// Set the pointer to the cloned element
        }     

        // General initializing for each animation. 
        //MapAnimations currentMapAnimation = Activator.getCurrentMapAnimation();
        //System.out.println("Mapanimation pointer: "+currentMapAnimation);
        // if (currentMapAnimation != null) {
        // Check current key and set it to the element id if it doesn't exists.
        if (getKey() == null || getKey().equals("")) {
            setKey(svgElementID);
        } else {
            String jsonKey = getKey();
            // Otherwise we have a link to another JSON value.
            if (jsonKey.indexOf("$") == 0) {
                setKey(jsonKey.substring(1));
            }
        }

        // Initialize values if necessary
        if (getPath() == null) {
            setPath("");
        }
        if (getAutoOrientation() == null) {
            setAutoOrientation("");
        }
        if (getAnchorPoint() == null) {
            setAnchorPoint("");
        }
        if (getInput() == null) {
            setInput("");
        }


        //Read all input values and set the x-range and y-range values to default values if necessary
        ArrayList<String> inputList, autoOrientationList, pathList, anchorPointList;
        inputList = currentMapAnimation.parser(getInput());
        autoOrientationList = currentMapAnimation.parser(getAutoOrientation());
        pathList = currentMapAnimation.parser(getPath());
        anchorPointList = currentMapAnimation.parser(getAnchorPoint()); 

        inputHashMap = new HashMap<String, MovePathAttributeRecord>();
        MovePathAttributeRecord dataRecord;
        for (int i = 0; i < inputList.size(); i++) {
            dataRecord = this.new MovePathAttributeRecord();
            if (i < autoOrientationList.size()) {
                dataRecord.autoOrientation = autoOrientationList.get(i);
            } else {
                dataRecord.autoOrientation = "";
            }

            if (i < pathList.size()) {
                dataRecord.path = pathList.get(i);
            } else {
                dataRecord.path = "";
            }

            if (i < anchorPointList.size()) {
                dataRecord.anchorPoint = anchorPointList.get(i);
            } else {
                dataRecord.anchorPoint = "";
            }
            //Only add a value if it doesn't already exists
            if (!inputHashMap.containsKey(inputList.get(i))) {
                inputHashMap.put(inputList.get(i), dataRecord);
            }
        }
        //Set default values for x and y-range if no input is set
        if (inputList.size() == 0) {
            if (autoOrientationList.size() > 0) {
                setAutoOrientation(autoOrientationList.get(0));
            } else {
                setAutoOrientation("");
            }

            if (pathList.size() > 0) {
                setPath(pathList.get(0));
            } else {
                setPath("");
            }

            if (anchorPointList.size() > 0) {
                setAnchorPoint(anchorPointList.get(0));
            } else {
                setAnchorPoint("");
            }
        }

        lastValues = new MovePathAttributeRecord();
    }

    private class MovePathAttributeRecord {
        String anchorPoint, path, autoOrientation;
    }
    
} // MovePathImpl
