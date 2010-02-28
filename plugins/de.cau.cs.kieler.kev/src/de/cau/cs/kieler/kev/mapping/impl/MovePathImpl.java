/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping.impl;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

import de.cau.cs.kieler.kev.Activator;
import de.cau.cs.kieler.kev.mapping.MappingPackage;
import de.cau.cs.kieler.kev.mapping.MovePath;
import de.cau.cs.kieler.kev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.kev.views.EclipseJSVGCanvas;

import org.apache.batik.dom.svg.SVGOMElement;
import org.apache.batik.dom.svg.SVGOMMPathElement;
import org.apache.batik.dom.svg.SVGOMPathElement;
import org.apache.batik.dom.svg.SVGPathSupport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.json.JSONObject;

import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.svg.SVGDocument;
import org.w3c.dom.svg.SVGLocatable;
import org.w3c.dom.svg.SVGPathElement;
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
    
    
    private Point point = null;

    private HashMap<String, HashMap<String, String>> hashMapList = null;

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

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.kev.mapping.Animation#initialize()
     */
    public void initialize(String svgElementID) {
        SVGDocument svgDoc = EclipseJSVGCanvas.getInstance().getSVGDocument();
        Element elem = svgDoc.getElementById(svgElementID);

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
//                } else if (jsonKey.matches(".+\\[\\d+\\]")) { // This means the json key points to an json array
//                    try {
//                        this.arrayIndex = Integer.parseInt(jsonKey.substring(jsonKey.indexOf("["), jsonKey.indexOf("]")));
//                        setKey(jsonKey.substring(0,jsonKey.indexOf("[")));
//                    } catch (NumberFormatException e) {
//                        Activator.reportErrorMessage("Error during parsing. Arrayindex of JSON Key is not a number! [" + jsonKey + "]");
//                    }
//                }
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
    
            // Set auto_orientation per default to false
            if (getAutoOrientation() == null || !getAutoOrientation().equalsIgnoreCase("true")) {
                setAutoOrientation("false");
            } else {
                if (getAutoOrientation().equalsIgnoreCase("true")) {
                    // This check is needed to get a valid boolean for later access
                    setAutoOrientation("true");
                }
            }
            // Initialize the anchorpoint
            point = new Point();
    
            if (getAnchorPoint() != null && !getAnchorPoint().equals("")) {
                if (Pattern.matches("[-]?\\d+([.]\\d+)?[,]{1}[-]?\\d+([.]\\d+)?", getAnchorPoint())) {
                    String[] anchorPointValues = getAnchorPoint().split(",");
                    point.setLocation(Float.parseFloat(anchorPointValues[0]), Float
                            .parseFloat(anchorPointValues[1]));
                }
            }
            
            hashMapList = new HashMap<String, HashMap<String, String>>();

            SVGOMPathElement path = SVGOMPathElement.class.cast(svgDoc.getElementById(getPath()));
            ArrayList<String> inputArray, xPos, yPos, angle;
            inputArray = MapAnimations.getInstance().attributeParser(getInput(),true);
            float pathLength, stepLength;
            pathLength = path.getTotalLength();
            stepLength = pathLength / inputArray.size();
            SVGPoint p, p_old = null;
            xPos = new ArrayList<String>();
            yPos = new ArrayList<String>();
            angle = new ArrayList<String>();

            for (int i = 0; i < inputArray.size(); i++) {
                p = path.getPointAtLength(i * stepLength);
                xPos.add(Float.toString(p.getX()));
                yPos.add(Float.toString(p.getY()));
                if (i > 0) {
                    angle.add(computeAngle(p, p_old));
                } else {
                    angle.add("0");
                }
                p_old = p;
            }

            hashMapList.put("xPos", MapAnimations.getInstance().mapInputToOutput(inputArray, xPos));
            hashMapList.put("yPos", MapAnimations.getInstance().mapInputToOutput(inputArray, yPos));
            hashMapList.put("angle", MapAnimations.getInstance().mapInputToOutput(inputArray, angle));
        
    
    }

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

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.kev.mapping.Animation#apply(de.cau.cs.kieler.sim.kiem.json.JSONObject,
     * java.lang.String)
     */
    public void apply(Object jsonObject, String svgElementID) {
        // Get the current SVGDocument for manipulation.
        SVGDocument svgDoc = EclipseJSVGCanvas.getInstance().getSVGDocument();
        Element elem = svgDoc.getElementById(svgElementID);
        
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

        // Now apply the animation
        if (elem != null) {
            try {
                String xValue, yValue, angleValue;
                if (hashMapList.containsKey("xPos") && hashMapList.containsKey("yPos")) {
                    xValue = hashMapList.get("xPos").get(jsonValue);
                    yValue = hashMapList.get("yPos").get(jsonValue);
                    angleValue = hashMapList.get("angle").get(jsonValue);

                    // System.out.println("xValue: "+xValue+" yValue: "+yValue);

                    // BoundingBox is always the same. so get the x,y position of the upperleft
                    // corner
                    SVGLocatable locatable = (SVGLocatable) elem;

                    if (xValue == null) {
                        xValue = "0";
                        if (yValue == null) {
                            return;
                        }
                    } else {
                        xValue = Double.toString(Float.parseFloat(xValue)
                                - locatable.getBBox().getX() - point.getX());
                    }

                    if (yValue == null) {
                        yValue = "0";
                        if (xValue == null) {
                            return;
                        }
                    } else {
                        yValue = Double.toString(Float.parseFloat(yValue)
                                - locatable.getBBox().getY() - point.getY());
                    }

                    String attrib = "translate(" + xValue + "," + yValue + ")";
                    elem.setAttribute("transform", attrib);
                    // System.out.println(elem.getAttribute("transform"));
                    // System.out.println(elem.getAttribute("id")+": "+xValue+", "+yValue+" BBox: "+locatable.getBBox().getX()+
                    // " "+locatable.getBBox().getY()+" Anchorpoint:"+anchorPoint.getX()+", "+anchorPoint.getY()+
                    // "BBox-Width-Height: "+locatable.getBBox().getWidth()+
                    // ", "+locatable.getBBox().getHeight());

                    if (angleValue != null && !angleValue.equals("") && xValue != null
                            && !xValue.equals("") && yValue != null && !yValue.equals("")) {
                        if (getAutoOrientation().equals("true")) {
                            elem.setAttribute("transform", attrib + "rotate(" + angleValue
                                    + "," + (locatable.getBBox().getX() + point.getX())
                                    + "," + (locatable.getBBox().getY() + point.getY())
                                    + ")");
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

} // MovePathImpl
