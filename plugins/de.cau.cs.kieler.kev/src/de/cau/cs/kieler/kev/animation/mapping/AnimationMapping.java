package de.cau.cs.kieler.kev.animation.mapping;

import java.awt.Point;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.batik.dom.svg.SVGGraphicsElement;
import org.apache.batik.dom.svg.SVGOMDocument;
import org.apache.batik.dom.svg.SVGOMElement;
import org.apache.batik.dom.svg.SVGStylableElement;
import org.apache.batik.swing.JSVGCanvas;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import de.cau.cs.kieler.kev.KevPlugin;
import de.cau.cs.kieler.kev.animation.animations.Animation;
import de.cau.cs.kieler.kev.animation.animations.Colorize;
import de.cau.cs.kieler.kev.animation.animations.Move;
import de.cau.cs.kieler.kev.animation.animations.MovePath;
import de.cau.cs.kieler.kev.animation.animations.Opaque;
import de.cau.cs.kieler.kev.animation.animations.Rotate;
import de.cau.cs.kieler.kev.animation.animations.RotatePivot;
import de.cau.cs.kieler.kev.animation.animations.Text;
import de.cau.cs.kieler.kev.animation.controls.Button;
import de.cau.cs.kieler.kev.animation.controls.Control;
import de.cau.cs.kieler.kev.animation.controls.Textbox;
import de.cau.cs.kieler.kev.exceptions.MappingException;
import de.cau.cs.kieler.kev.extension.AnimationData;
import de.cau.cs.kieler.kev.extension.AnimationDataController;
import de.cau.cs.kieler.kev.helpers.Tools;
import de.cau.cs.kieler.kev.views.EnvironmentView;


public class AnimationMapping {

	// All mapping file constants. If you don't like some tag or attribute
	// names, change it here and in your mapping file and everything should be
	// fine.
	public static final String DISPLAY_TAG = "display";
	public static final String CONTROL_TAG = "control";
	public static final String MOVE_TAG = "move";
	public static final String MOVEPATH_TAG = "move-path";
	public static final String ROTATE_TAG = "rotate";
	public static final String COLOR_TAG = "colorize";
	public static final String OPACITY_TAG = "opaque";
	public static final String SCALE_TAG = "scale";
	public static final String TEXT_TAG = "textbox";
	public static final String BUTTON_TAG = "button";
	public static final String PATH_ATTR = "path";
	public static final String ID_ATTR = "id";
	public static final String PORT_ATTR = "port";
	public static final String INPUT_ATTR = "input";
	public static final String ANGLE_ATTR = "angle-range";
	public static final String X_ATTR = "x-range";
	public static final String Y_ATTR = "y-range";
	public static final String PIVOT_ATTR = "pivot";
	public static final String COLOR_ATTR = "color";
	public static final String COLORPROPERTY_ATTR = "color-property";
	public static final String OPACITY_ATTR = "opacity";
	public static final String ANCHORPOINT_ATTR = "anchor-point";
	public static final String AUTOORIENT_ATTR = "auto-orient";
	public static final String ORIENTANGLE_ATTR = "direction-angle";

	private ArrayList<Animation> animationList;
	private ArrayList<Control> controlList;
	private AnimationData dataToSend;
	
	int displayPortSize=0, controlPortSize=0;
	
	URI mappingPath;
	
	public AnimationMapping(EnvironmentView view) {

		dataToSend = new AnimationData();
		// sja: very, VERY dirty work. Sorry to everyone, who must go
		// through this...
		try {
			JSVGCanvas canvas = view.getComposite().getSvgCanvas();
			URI svgFile = view.getComposite().getSvgFile();
			
			mappingPath = Tools.exchangeExtension(svgFile, "map"); 
									
			//if(!mappingPath.toFile().exists())
			//	throw new MappingException("Error loading animation mapping file! No map file \""+mappingPath.toOSString()+"\" exists to the loaded svg file. No animations possible.");
			
			NodeList displayNodes = null;
			NodeList controlNodes = null;
			// server.getDataToSend().getData().setSize(0);

			// clean up SVG animations and controls before we set
			// them up for the new image
			animationList = new ArrayList<Animation>();
			controlList = new ArrayList<Control>();
			// try to validate mapping file (only if activated in
			// preferences dialog)
			
			// TODO: check eclipse preferences
//			boolean xmlValidationStatus = ((JRadioButton) menu
//					.getPreferencesDialog().getPreference(
//							"xml-validation")).isSelected();
			boolean xmlValidationStatus = true;
			if (xmlValidationStatus == true) {
				Path path = new Path("config/mapping.xsd");
				URL xsd = FileLocator.find(KevPlugin.getDefault().getBundle(),path,null);
				Tools.isValidXml(mappingPath.toURL(), xsd);
			}
			MapParser parser = new MapParser(mappingPath.toURL());
			displayNodes = parser.getDisplayNodes();
			controlNodes = parser.getControlNodes();
			// maybe we did not find display tags in mapping file,
			// so we don't have to
			// animate anything and skip this part
			if (displayNodes != null) {
				for (int i = 0; i < displayNodes.getLength(); i++) {
					Node current = displayNodes.item(i);
					int port = parser.getPort(current);
					if(port > this.displayPortSize)
						this.displayPortSize = port; // count number of available ports
					// get the list of display actions like move,
					// rotate, color, opacity, scale, ...
					NodeList actions = current.getChildNodes();
					for (int j = 0; j < actions.getLength(); j++) {
						Node currentAction = actions.item(j);
						String tagname = currentAction
								.getNodeName();
						// we do not want to parse commentaries or
						// text (marked with a '#' prefix),
						// but only attributes and their values
						if (!tagname.startsWith("#")) {
							// get id value of SVG element, which
							// has to be manipulated by current
							// action
							// e.g. if current action is 'move' and
							// id='railway' it means that SVG
							// element 'railway'
							// will be moved
							String id = currentAction
									.getAttributes().getNamedItem(
											ID_ATTR).getNodeValue();

							// get the (hopefully unique) graphical
							// SVG element whose ID equals
							// <code>id</code>
							// The uniqueness of an element's ID
							// must be guaranteed at SVG document
							// creation.
							// Here, ambiguous id allocation will
							// lead to errors

							// TODO: put this in every if clause
							// separately, because text-fields do
							// not extend SVGGraphicsElement
							// so this line will lead to a
							// ClassCastException if text shall be
							// displayed
	
							SVGStylableElement el = (SVGStylableElement) canvas.getSVGDocument()
									.getRootElement()
									.getElementById(id);
							// error handling if mapping object does
							// not exist -- haf
							if (el == null)
								throw new MappingException("SVG element \""+id
										+ "\" not found!");

							// the following if clauses check which
							// display action we want to perform on
							// current
							// element, based on data in the mapping
							// file.
							if (tagname.equals(MOVEPATH_TAG)) {
								try {
									Interval inputInterval = new Interval(
											currentAction
													.getAttributes()
													.getNamedItem(
															INPUT_ATTR)
													.getNodeValue());
									Point anchorPoint = null;
									// per default, auto orientation is enabled
									boolean autoOrient = true;
									// per default, object is heading upwards
									double orientAngle = 0;
									try {
										String anchorPointStr = currentAction
												.getAttributes()
												.getNamedItem(
														ANCHORPOINT_ATTR)
												.getNodeValue();
										StringTokenizer tok = new StringTokenizer(
												anchorPointStr, ",");
										anchorPoint = new Point(
												Integer
														.parseInt(tok
																.nextToken()),
												Integer
														.parseInt(tok
																.nextToken()));													
									}
									catch (Exception e1) {
										/*
										 * if no anchor point is
										 * available, just ignore,
										 * since it is an optional
										 * attribute
										 */
									}
									
									try {
										String autoOrientStr = currentAction.getAttributes().getNamedItem(AUTOORIENT_ATTR).getNodeValue();
										if (autoOrientStr != null && !autoOrientStr.equals("")){
											// if we found some explicit entry in mapping, first set autoOrient to false...
											autoOrient = false;
										}
										// ... then try to parse the String. So, in case of typing errors, auto orientation is disabled
										if(autoOrientStr.equals("1") || autoOrientStr.equals("true") || autoOrientStr.equals("yes")){
											autoOrient = true;
										}													
									} catch (Exception e1){
										/* just ignore */
									}
									
									try {
										String orientAngleStr = currentAction.getAttributes().getNamedItem(ORIENTANGLE_ATTR).getNodeValue();
										orientAngle = Integer.parseInt(orientAngleStr);
									} catch (Exception e1){
										/* just ignore */
									}
									
									String pathID = currentAction
											.getAttributes()
											.getNamedItem(PATH_ATTR)
											.getNodeValue();
									SVGOMElement path = (SVGOMElement) canvas.getSVGDocument()
											.getRootElement()
											.getElementById(pathID);
									// error handling if mapping
									// object does not exist -- haf
									if (path == null)
										throw new MappingException(
												pathID
														+ "not found!");
									//System.out.println("auto orient:" + autoOrient);
									//System.out.println("direction Angle:" + orientAngle);
									MovePath mp = new MovePath(
											port,
											(SVGGraphicsElement) el,
											inputInterval,
											anchorPoint,
											autoOrient,
											orientAngle, path,
											canvas);
									addAnimation(mp);

								}
								catch (NumberFormatException e1) {
									Tools.showDialog("Could not parse mapping attributes. Unkown number format!");
								}
								catch (Exception e1) {
									Tools.showDialog("Unknown error occured while parsing mapping attributes!",e1);
								}
							}
							if (tagname.equals(MOVE_TAG)) {
								// log.println("Move element:
								// " + id);
								try {
									Interval inputInterval = new Interval(
											currentAction
													.getAttributes()
													.getNamedItem(
															INPUT_ATTR)
													.getNodeValue());
									Interval xRangeInterval = new Interval(
											currentAction
													.getAttributes()
													.getNamedItem(
															X_ATTR)
													.getNodeValue());
									Interval yRangeInterval = new Interval(
											currentAction
													.getAttributes()
													.getNamedItem(
															Y_ATTR)
													.getNodeValue());

									Move m = new Move(
											port,
											(SVGGraphicsElement) el,
											inputInterval,
											xRangeInterval,
											yRangeInterval,
											canvas);
									addAnimation(m);
								}
								catch (NumberFormatException e1) {
									Tools.showDialog("Could not parse mapping attributes of element '"
													+ id + "'!");
								}

							}
							if (tagname.equals(ROTATE_TAG)) {
								// log.println("Rotate
								// element: " + id);
								Interval inputInterval = new Interval(
										currentAction
												.getAttributes()
												.getNamedItem(
														INPUT_ATTR)
												.getNodeValue());
								Interval angleInterval = new Interval(
										currentAction
												.getAttributes()
												.getNamedItem(
														ANGLE_ATTR)
												.getNodeValue());
								Node pivotNode = currentAction
										.getAttributes()
										.getNamedItem(PIVOT_ATTR);
								if (pivotNode != null) {
									String pivotStr = pivotNode
											.getNodeValue();
									if (pivotStr.equals(""))
										// if no 'pivot' attribute
										// was used just do a
										// regular rotation (around
										// the center of the
										// element)
										addAnimation(new Rotate(
												port,
												(SVGGraphicsElement) el,
												inputInterval,
												angleInterval,
												canvas));
									else {
										// parse the pivot attribute
										// and rotate around given
										// x,y coordinate
										StringTokenizer tok = new StringTokenizer(
												pivotStr, ",");
										try {
											int pivotx = Math
													.round(Float
															.parseFloat(tok
																	.nextToken()));
											int pivoty = Math
													.round(Float
															.parseFloat(tok
																	.nextToken()));
											Point pivot = new Point(
													pivotx, pivoty);
											// log.println("pivot:
											// " + pivot);
											addAnimation(new RotatePivot(
													port,
													(SVGGraphicsElement) el,
													angleInterval,
													inputInterval,
													pivot,
													canvas));
										}
										catch (Exception e1) {
											Tools.showDialog("Error! Possibly the 'pivot' attribute of element '"
															+ id
															+ "' could not be parsed!",e1);
										}
									}
								}
								else {
									// pivot node is null, so just
									// rotate around center of the
									// bounding box
									addAnimation(new Rotate(
											port,
											(SVGGraphicsElement) el,
											inputInterval,
											angleInterval,
											canvas));
								}
							}
							if (tagname.equals(COLOR_TAG)) {
								// the value of the input attribute
								// for a 'colorize' element is a
								// comma separated list of numeric
								// or boolean values
								Node inputAttr = currentAction
										.getAttributes()
										.getNamedItem(INPUT_ATTR);
								// color values are comma separated
								// hex strings representing a
								// specific color, e.g. #ffffff for
								// white
								Node colors = currentAction
										.getAttributes()
										.getNamedItem(COLOR_ATTR);
								// colorProperty defines whether to
								// colorize the border ('stroke') or
								// the fill region ('fill')
								Node colorProperty = currentAction
										.getAttributes()
										.getNamedItem(
												COLORPROPERTY_ATTR);

								Colorize c = new Colorize(port, el,
										inputAttr.getNodeValue(),
										colors.getNodeValue(),
										colorProperty
												.getNodeValue(),
										canvas);
								addAnimation(c);
							}
							if (tagname.equals(SCALE_TAG)) {
								// TODO: scaling not supported yet

								@SuppressWarnings("unused")
								Node inputAttr = currentAction
										.getAttributes()
										.getNamedItem(INPUT_ATTR);
							}
							if (tagname.equals(OPACITY_TAG)) {
								// change the opacity of an element
								Node inputAttr = currentAction
										.getAttributes()
										.getNamedItem(INPUT_ATTR);
								Node opaques = currentAction
										.getAttributes()
										.getNamedItem(OPACITY_ATTR);
								addAnimation(new Opaque(port, el,
										inputAttr.getNodeValue(),
										opaques.getNodeValue(),
										canvas));
							}
							if (tagname.equals(TEXT_TAG)) {
								// displays any incoming String data
								// in a specific textbox
								addAnimation(new Text(port, el,
										canvas));

							}
						}
					}
				}
			}
			if (controlNodes != null) {
				for (int i = 0; i < controlNodes.getLength(); i++) {
					Node current = controlNodes.item(i);
					int port = parser.getPort(current);
					if(port > this.controlPortSize) // count number of available ports
						this.controlPortSize = port;
					NodeList actions = current.getChildNodes();
					for (int j = 0; j < actions.getLength(); j++) {
						Node currentAction = actions.item(j);
						String tagname = currentAction
								.getNodeName();
						if (tagname.equals(BUTTON_TAG)) {
							NamedNodeMap attributes = currentAction
									.getAttributes();
							Node idAttr = attributes
									.getNamedItem(ID_ATTR);
							String id = idAttr.getNodeValue();
							// log.println("button " + id + "
							// found!");
							SVGOMElement el = (SVGOMElement) canvas.getSVGDocument()
									.getRootElement()
									.getElementById(id);
							if (el != null) {
								// log.println("Control '" +
								// id + "' gefunden!");
								dataToSend
										.getData()
										.setSize(
												dataToSend
														.getData()
														.size() + 1);
								// log.println("dataToSend
								// size: " +
								// dataToSend.getData().size());
								//server.toString();
								addControl(new Button(port, el, dataToSend, false));
							}
						}
						if (tagname.equals(TEXT_TAG)) {
							NamedNodeMap attributes = currentAction
									.getAttributes();
							Node idAttr = attributes
									.getNamedItem(ID_ATTR);
							String id = idAttr.getNodeValue();
							SVGOMElement el = (SVGOMElement) canvas.getSVGDocument()
									.getRootElement()
									.getElementById(id);
							dataToSend.getData()
									.setSize(
											dataToSend.getData()
													.size() + 1);
							addControl(new Textbox(port, el, dataToSend, (SVGOMDocument)canvas.getSVGDocument(),
									"", canvas));
						}
					}
				}
			}

			if (!(displayNodes == null && controlNodes == null)) {

				/* TODO: repair observers
				server.addObserver(svgApp);
				svgApp.addObserver(toolBar);
				server.addObserver(toolBar);
				svgApp.addObserver(server);

				// notify server that rendering process is completed
				// after receiving this notification, server starts
				// listening
				svgApp.setChanged();
				svgApp.notifyObservers("rendering done");
				*/
				
				// svgApp.addElementInformations();
				// start in pause mode
				// toolBar.setPaused(true);
			}
			else {
				// if neither display tags nor control tags were
				// found, the user may have
				// a great time watching an animation free
				// non-interactive but beautiful image
				Tools.showDialog("Finished rendering SVG, but no display or control action found. Nothing to do...");
			}
		}
		catch (MappingException me) {
			// something failed during parsing of the mapping, e.g.
			// a mapped object does
			// not exist in the svg file
			Tools.showDialog("Error while processing the animation mapping file "+mappingPath,me);
		}
		catch (MalformedURLException e2) {
			Tools.showDialog("URL is not well formed!",e2);
		}
		catch (IOException e2) {
			Tools.showDialog("An error occured during some read/write operations!",e2);
		}
		catch (SAXException e2) {
			Tools.showDialog("Mapping file \""+mappingPath+"\" is not valid!",e2);
		}
		catch (ParserConfigurationException e2) {
			Tools.showDialog("Could not parse file!",e2);
		}
		catch (URISyntaxException e2) {
			Tools.showDialog("URI Syntax error!",e2);
		}
	
	} // constructor
	
	public void addAnimation(Animation animation) {
		this.animationList.add(animation);
	}
	
	public void addControl(Control control) {
		this.controlList.add(control);
		// TODO: repair listening to controls
		//svgApp.addObserver(control);
	}

	/**
	 * Returns the size of the output data (data controlled by human interaction)
	 * 
	 */
	public int getControlPortsize(){
		return controlPortSize;
	}
	/**
	 * Returns the size of the input data (data to be displayed in the graphics) 
	 */
	public int getDisplayPortSize(){
		return displayPortSize;
	}
	
	public List<Animation> getAnimationList(){
		return this.animationList;
	}
	public List<Control> getControlList(){
		return this.controlList;
	}

	public void registerControlListeners(
			AnimationDataController animationController) {
		for (Control control : controlList) {
			control.addDataChangeListener(animationController);
		}		
	}
	
	public void unregisterControlListeners(){
		for (Control control : controlList) {
			control.removeDataChangeListeners();
		}
	}
}
