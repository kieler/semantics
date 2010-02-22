/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping.impl;

import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.kev.Activator;
import de.cau.cs.kieler.kev.mapping.MappingPackage;
import de.cau.cs.kieler.kev.mapping.MoveTo;
import de.cau.cs.kieler.kev.views.EclipseJSVGCanvas;

import org.eclipse.emf.ecore.EClass;

import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;
import org.w3c.dom.svg.SVGLocatable;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>MoveTo</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MoveToImpl extends AnimationImpl implements MoveTo {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MoveToImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.MOVE_TO;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public void apply(Object jsonObject, String svgElementID) {
        SVGDocument svgDoc = EclipseJSVGCanvas.getInstance().getSVGDocument();
        Element elem = svgDoc.getElementById(svgElementID);
        JSONObject jSONObject = (JSONObject) jsonObject;

        String xValue = "0";
        String yValue = "0";
        String rValue = "0";
        String rxValue = null;
        String ryValue = null;
        boolean rotate = false;
        // if x value is present
        if (jSONObject.has(jsonObject + ".x")) {
            try {
                xValue = jSONObject.getString(svgElementID + ".x");
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        // if y value is present
        if (jSONObject.has(svgElementID + ".y")) {
            try {
                yValue = jSONObject.getString(svgElementID + ".y");
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        // if rotate value is present
        if (jSONObject.has(svgElementID + ".r")) {
            try {
                rValue = jSONObject.getString(svgElementID + ".r");
                rotate = true;
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (jSONObject.has(svgElementID + ".rx")) {
            try {
                rxValue = jSONObject.getString(svgElementID + ".rx");
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (jSONObject.has(svgElementID + ".ry")) {
            try {
                ryValue = jSONObject.getString(svgElementID + ".ry");
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        // Now apply the animation
        if (elem != null) {
            try {
                // BoundingBox is always the same. so get the x,y position of the upperleft corner
                SVGLocatable locatable = (SVGLocatable) elem;

                elem.setAttribute("transform", "translate(" + xValue + "," + yValue + ")");
                if (rotate) {
                    if (rxValue == null) {
                        rxValue = "" + (int) Math.round(locatable.getBBox().getWidth() / 2);
                    }
                    if (ryValue == null) {
                        ryValue = "" + (int) Math.round(locatable.getBBox().getHeight() / 2);
                    }
                    elem.setAttribute("transform",
                            "translate("
                                    + xValue
                                    + ","
                                    + yValue
                                    + ")"
                                    + " rotate("
                                    + rValue
                                    + ","
                                    + (locatable.getBBox().getX()
                                            + Integer.parseInt(rxValue)
                                            + ","
                                            + (locatable.getBBox().getY() + Integer
                                                    .parseInt(ryValue)) + ")"));
                }

            } catch (DOMException e1) {
                Activator.reportErrorMessage("Something went wrong, setting an DOM element.", e1);
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
    public void initialize() {
        if (getInput() == null) {
            setInput("");
        }
    }

} // MoveImpl
