/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping.impl;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

import org.json.JSONObject;

import de.cau.cs.kieler.kev.Activator;
import de.cau.cs.kieler.kev.mapping.MappingPackage;
import de.cau.cs.kieler.kev.mapping.MovePath;
import de.cau.cs.kieler.kev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.kev.mapping.animations.RunnableAnimation;
import de.cau.cs.kieler.kev.views.EclipseJSVGCanvas;

import org.apache.batik.dom.svg.SVGOMPathElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;
import org.w3c.dom.svg.SVGLocatable;
import org.w3c.dom.svg.SVGPoint;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.MovePathImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.MovePathImpl#getAnchor_point <em>Anchor point</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.MovePathImpl#getAuto_orientation <em>Auto orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MovePathImpl extends AnimationImpl implements MovePath {
    /**
     * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
     * The default value of the '{@link #getAnchor_point() <em>Anchor point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnchor_point()
     * @generated
     * @ordered
     */
    protected static final String ANCHOR_POINT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAnchor_point() <em>Anchor point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnchor_point()
     * @generated
     * @ordered
     */
    protected String anchor_point = ANCHOR_POINT_EDEFAULT;

    /**
     * The default value of the '{@link #getAuto_orientation() <em>Auto orientation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuto_orientation()
     * @generated
     * @ordered
     */
    protected static final String AUTO_ORIENTATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAuto_orientation() <em>Auto orientation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuto_orientation()
     * @generated
     * @ordered
     */
    protected String auto_orientation = AUTO_ORIENTATION_EDEFAULT;

    private HashMap<String, HashMap<String, String>> hashMapList = null;
    Point anchorPoint = null;

    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MovePathImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.MOVE_PATH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPath() {
        return path;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
    public String getAnchor_point() {
        return anchor_point;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnchor_point(String newAnchor_point) {
        String oldAnchor_point = anchor_point;
        anchor_point = newAnchor_point;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MOVE_PATH__ANCHOR_POINT, oldAnchor_point, anchor_point));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAuto_orientation() {
        return auto_orientation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAuto_orientation(String newAuto_orientation) {
        String oldAuto_orientation = auto_orientation;
        auto_orientation = newAuto_orientation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MOVE_PATH__AUTO_ORIENTATION, oldAuto_orientation, auto_orientation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MappingPackage.MOVE_PATH__PATH:
                return getPath();
            case MappingPackage.MOVE_PATH__ANCHOR_POINT:
                return getAnchor_point();
            case MappingPackage.MOVE_PATH__AUTO_ORIENTATION:
                return getAuto_orientation();
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
            case MappingPackage.MOVE_PATH__PATH:
                setPath((String)newValue);
                return;
            case MappingPackage.MOVE_PATH__ANCHOR_POINT:
                setAnchor_point((String)newValue);
                return;
            case MappingPackage.MOVE_PATH__AUTO_ORIENTATION:
                setAuto_orientation((String)newValue);
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
            case MappingPackage.MOVE_PATH__PATH:
                setPath(PATH_EDEFAULT);
                return;
            case MappingPackage.MOVE_PATH__ANCHOR_POINT:
                setAnchor_point(ANCHOR_POINT_EDEFAULT);
                return;
            case MappingPackage.MOVE_PATH__AUTO_ORIENTATION:
                setAuto_orientation(AUTO_ORIENTATION_EDEFAULT);
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
            case MappingPackage.MOVE_PATH__PATH:
                return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
            case MappingPackage.MOVE_PATH__ANCHOR_POINT:
                return ANCHOR_POINT_EDEFAULT == null ? anchor_point != null : !ANCHOR_POINT_EDEFAULT.equals(anchor_point);
            case MappingPackage.MOVE_PATH__AUTO_ORIENTATION:
                return AUTO_ORIENTATION_EDEFAULT == null ? auto_orientation != null : !AUTO_ORIENTATION_EDEFAULT.equals(auto_orientation);
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
        result.append(" (path: ");
        result.append(path);
        result.append(", anchor_point: ");
        result.append(anchor_point);
        result.append(", auto_orientation: ");
        result.append(auto_orientation);
        result.append(')');
        return result.toString();
    }


    /* (non-Javadoc)
     * @see de.cau.cs.kieler.kev.mapping.Animation#initialize()
     */
    public void initialize() {
        //Initialize values if necessary
        if (getPath() == null) {
            setPath("");
        }
        if (getAuto_orientation() == null) {
            setAuto_orientation("");
        }
        if (getAnchor_point() == null) {
            setAnchor_point("");
        }
        
        
        //Set auto_orientation per default to false
        if (getAuto_orientation() == null || !getAuto_orientation().equalsIgnoreCase("true")) {
            setAuto_orientation("false");
        } else {
            if (getAuto_orientation().equalsIgnoreCase("true")) {
                //This check is needed to get a valid boolean for later access
                setAuto_orientation("true");
            }
        }
        //Initialize the anchorpoint
        anchorPoint = new Point();
        
        if (getAnchor_point() != null && !getAnchor_point().isEmpty()) {
            if (Pattern.matches("[-]?\\d+([.]\\d+)?[,]{1}[-]?\\d+([.]\\d+)?", getAnchor_point())) {
                String[] anchorPointValues = getAnchor_point().split(",");
                anchorPoint.setLocation(Float.parseFloat(anchorPointValues[0]),Float.parseFloat(anchorPointValues[1]));
            }
        }
    }
  
    private String computeAngle(SVGPoint p1, SVGPoint p2) {
        final double RADTODEG = 180.0/Math.PI;
        double deltaX, deltaY, alpha;            
        
        deltaX = p2.getX() - p1.getX();//Ankathete
        deltaY = p2.getY() - p1.getY();//Gegenkathete
        
        alpha = Math.atan(deltaY / deltaX) * RADTODEG;
        
        if (deltaX > 0 && deltaY <= 0) {
            //values from 0 - -90 nothing to do change here
        } else if (deltaX <= 0 && deltaY <= 0) {
           //mapping from 90 - 0 to -90 - -180     
            alpha = 180 - alpha;
            alpha *= -1;
        } else if (deltaX <= 0  && deltaY > 0) {
            //mapping from 0 - 90 to -180 - -270      
            alpha = 180 - alpha;
            alpha *= -1;
        } else if (deltaX > 0 && deltaY > 0) {
            //mapping from 90 - 0 to -90 - -180     
            alpha = 360 - alpha;
            alpha *= -1;
        }
        return Double.toString(alpha);
    }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.kev.mapping.Animation#apply(de.cau.cs.kieler.sim.kiem.json.JSONObject, java.lang.String)
     */
    public void apply(Object jsonObject, String svgElementID) {
        //Check whether the UpdateManager already exists or not
        if (EclipseJSVGCanvas.getInstance().getUpdateManager() == null) {
            //Do nothing, if the UpdateManager does not exists
            return;
        }    
        
        SVGDocument doc = EclipseJSVGCanvas.getInstance().getSVGDocument();
        if (hashMapList == null) {
            hashMapList = new HashMap<String, HashMap<String,String>>();
            SVGOMPathElement path;
            path = (SVGOMPathElement) doc.getElementById(getPath());
            if (path == null) {
                Activator.reportDebugMessage("The svg-path element with id[" + svgElementID + "] does not exists.");
                return;
            }
            ArrayList<String> inputArray, xPos, yPos, angle;
            MapAnimations mapAnimation = new MapAnimations();
            inputArray = mapAnimation.attributeParser(getInput(), true);
            float pathLength, stepLength;
            pathLength = path.getTotalLength();
            stepLength = pathLength / inputArray.size();
            SVGPoint p, p_old = null;
            xPos = new ArrayList<String>();
            yPos = new ArrayList<String>();
            angle = new ArrayList<String>();

            for (int i = 0; i < inputArray.size(); i++) {
                p = path.getPointAtLength(i*stepLength);
                xPos.add(Float.toString(p.getX()));
                yPos.add(Float.toString(p.getY()));
                if (i > 0) {
                    angle.add(computeAngle(p, p_old));
                } else {
                    angle.add("0");
                }
                p_old = p;
            }

            hashMapList.put("xPos",mapAnimation.mapInputToOutput(inputArray, xPos));
            hashMapList.put("yPos",mapAnimation.mapInputToOutput(inputArray, yPos));
            hashMapList.put("angle",mapAnimation.mapInputToOutput(inputArray, angle));
            
        }
        
        RunnableAnimation runnableAnimation = new RunnableAnimation((JSONObject) jsonObject, svgElementID) {
            
            public void run() {
                Element elem = getSVGElement();
                String jsonValue = getActualJSONValue(getJSONObject(), getSVGElementID());
                if (jsonValue != null) {
                    //Now apply the animation
                    if (elem != null) {
                        try {
                            String xValue, yValue, angleValue;
                            if (hashMapList.containsKey("xPos") && hashMapList.containsKey("yPos")) {
                                xValue = hashMapList.get("xPos").get(jsonValue);
                                yValue = hashMapList.get("yPos").get(jsonValue);
                                angleValue = hashMapList.get("angle").get(jsonValue);

//                                System.out.println("xValue: "+xValue+" yValue: "+yValue);

                                //BoundingBox is always the same. so get the x,y position of the upperleft corner
                                SVGLocatable locatable = (SVGLocatable) elem;
                                
                                if (xValue == null) {
                                    xValue = "0";
                                    if (yValue == null) {
                                        return;
                                    }
                                } else {
                                    xValue = Double.toString(Float.parseFloat(xValue) - locatable.getBBox().getX() - anchorPoint.getX());
                                }
                                    
                                if (yValue == null) {
                                    yValue = "0";
                                    if (xValue == null) {
                                        return;
                                    }
                                } else {
                                    yValue = Double.toString(Float.parseFloat(yValue) - locatable.getBBox().getY() - anchorPoint.getY());
                                }
                                
                                String attrib = "translate("+xValue+","+yValue+")";
                                elem.setAttribute("transform", attrib);
//                                System.out.println(elem.getAttribute("transform"));
//                                System.out.println(elem.getAttribute("id")+": "+xValue+", "+yValue+" BBox: "+locatable.getBBox().getX()+ " "+locatable.getBBox().getY()+" Anchorpoint:"+anchorPoint.getX()+", "+anchorPoint.getY()+ "BBox-Width-Height: "+locatable.getBBox().getWidth()+ ", "+locatable.getBBox().getHeight());

                                if (angleValue != null && !angleValue.isEmpty() && xValue != null && !xValue.isEmpty() && yValue != null && !yValue.isEmpty()) {
                                    if (getAuto_orientation().equals("true")) {
                                        elem.setAttribute("transform", attrib+"rotate("+angleValue+","+ (locatable.getBBox().getX() + anchorPoint.getX()) +","+ (locatable.getBBox().getY() + anchorPoint.getY()) +")");
                                    }
                                }
                            }
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
        

} //MovePathImpl
