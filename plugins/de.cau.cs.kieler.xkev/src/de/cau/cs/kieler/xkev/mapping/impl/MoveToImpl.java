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

import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.xkev.Activator;
import de.cau.cs.kieler.xkev.mapping.Animation;
import de.cau.cs.kieler.xkev.mapping.MappingPackage;
import de.cau.cs.kieler.xkev.mapping.MoveTo;
import de.cau.cs.kieler.xkev.mapping.Move;
import de.cau.cs.kieler.xkev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.xkev.mapping.animations.RunnableAnimation;
import de.cau.cs.kieler.xkev.views.EclipseJSVGCanvas;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGLocatable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MoveTo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MoveToImpl extends AnimationImpl implements MoveTo {
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MoveToImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.MOVE_TO;
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
    
    
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void apply(Object jsonObject, String svgElementID) {
        RunnableAnimation runnableAnimation = new RunnableAnimation((JSONObject) jsonObject, svgElementID) {
            
            public void run() {
                Element elem = getSVGElement();
                
                JSONObject jSONObject = getJSONObject();

                String xValue = "0";
                String yValue = "0";
                String rValue = "0";
                String rxValue = null;
                String ryValue = null;
                boolean rotate = false;
                //if x value is present
                if (jSONObject.has(this.getSVGElementID()+".x")) {
                	try {
						xValue = jSONObject.getString(this.getSVGElementID()+".x");
					} catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
                //if y value is present
                if (jSONObject.has(this.getSVGElementID()+".y")) {
                	try {
						yValue = jSONObject.getString(this.getSVGElementID()+".y");
					} catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
                //if rotate value is present
                if (jSONObject.has(this.getSVGElementID()+".r")) {
                	try {
						rValue = jSONObject.getString(this.getSVGElementID()+".r");
						rotate = true;
					} catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
                if (jSONObject.has(this.getSVGElementID()+".rx")) {
                	try {
						rxValue = jSONObject.getString(this.getSVGElementID()+".rx");
					} catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
                if (jSONObject.has(this.getSVGElementID()+".ry")) {
                	try {
						ryValue = jSONObject.getString(this.getSVGElementID()+".ry");
					} catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
                
                //Now apply the animation
                if (elem != null) {
                    try {
                        //BoundingBox is always the same. so get the x,y position of the upperleft corner
                        SVGLocatable locatable = (SVGLocatable) elem;
                        
                        elem.setAttribute("transform", "translate("+xValue+","+yValue+")");
                        if (rotate) {
                        	if (rxValue == null) {
                        		rxValue = ""+(int)Math.round(locatable.getBBox().getWidth()/2);                        		
                        	}
                        	if (ryValue == null) {
                        		ryValue = ""+(int)Math.round(locatable.getBBox().getHeight()/2);
                        	}
                            elem.setAttribute("transform", "translate("+xValue+","+yValue+")" 
                            		        + " rotate("+rValue+","+(locatable.getBBox().getX()+Integer.parseInt(rxValue)
                       		        		+ ","+(locatable.getBBox().getY()+Integer.parseInt(ryValue))+")"));
                        }
                        
                    } catch (DOMException e1) {
                        Activator.reportErrorMessage("Something went wrong, setting an DOM element.", e1);
                    }
                } else {
                    Activator.reportErrorMessage("SVGElement with ID: "+getSVGElementID()+" doesn't exists in "+EclipseJSVGCanvas.getInstance().getSVGDocument().getURL());
                }                
            }
        };
        EclipseJSVGCanvas.getInstance().getUpdateManager().getUpdateRunnableQueue().invokeLater(runnableAnimation);
        
//        
//        String jsonValue = getActualJSONValue(jsonObject, svgElementID);
//
//        if (jsonValue != null) {
//            //Now apply the animation
//            SVGDocument svgDoc = mapAnimation.getSVGDocument();
//            if (svgDoc != null) {
//                Element e = svgDoc.getElementById(svgElementID);
//                //Test whether the svg element exists or not
//                if (e != null) {
//                    try {
//                        if (hashMapXRange.get(jsonValue) != null) {
//                            e.setAttribute("x", hashMapXRange.get(jsonValue));
//                        }
//                        if (hashMapYRange.get(jsonValue) != null) {
//                            e.setAttribute("y",hashMapYRange.get(jsonValue));
//                        }
//                    } catch (DOMException e1) {
//                        Activator.reportErrorMessage("Something went wrong, setting an DOM element.", e1);
//                    }
//                } else {
//                    Activator.reportErrorMessage("SVGElement with ID: "+svgElementID+" doesn't exists in "+svgDoc.getURL());
//                }                
//            }
//        }
    }
    
    /* (non-Javadoc)
     * @see de.cau.cs.kieler.xkev.mapping.Animation#initialize()
     */
    public void initialize() {
    }

} //MoveImpl
