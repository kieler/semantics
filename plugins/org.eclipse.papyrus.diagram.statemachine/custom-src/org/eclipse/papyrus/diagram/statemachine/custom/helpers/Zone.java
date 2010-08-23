package org.eclipse.papyrus.diagram.statemachine.custom.helpers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.RegionEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateMachineEditPart;
import org.eclipse.papyrus.diagram.statemachine.part.UMLVisualIDRegistry;

/**
 * Helper class used to manage the encoding of a region position within a state
 * machine or a state.
 * 
 * @author David Servat
 */
public class Zone {

	public final static int defaultWidth = 200;

	public final static int defaultHeight = 100;

	public final static int defaultHeader = 13;

	/**
	 * Key string for EAnnotation
	 */
	public static final String ANNOTATION_KEY = "RegionAnnotationKey";

	/**
	 * Key string for zone entry in EAnnotation
	 */
	public static final String ZONE_KEY = "RegionZoneKey";

	/**
	 * A default empty property string which serves when creating a region
	 * without initial graphical context.
	 */
	public static final String NONE = "";

	/**
	 * The code for a region in the TOP part of a given area.
	 */
	public static final String TOP = "T";

	/**
	 * The code for a region in the RIGHT part of a given area.
	 */
	public static final String RIGHT = "R";

	/**
	 * The code for a region in the BOTTOM part of a given area.
	 */
	public static final String BOTTOM = "B";

	/**
	 * The code for a region in the LEFT part of a given area.
	 */
	public static final String LEFT = "L";

	/**
	 * Returns a copy of the property string.
	 * 
	 * @param s
	 *        a string
	 * 
	 * @return a copy of string s
	 */
	public static String copy(String s) {
		return new String(s);
	}

	/**
	 * Helper to copy zone
	 */
	public static void copyZone(View from, View to) {
		if(to.getEAnnotation(ANNOTATION_KEY) == null)
			throw new IllegalArgumentException();

		if(!to.getEAnnotation(ANNOTATION_KEY).getDetails().containsKey(ZONE_KEY))
			throw new IllegalArgumentException();

		String zone = copy(getZone(from));
		to.getEAnnotation(ANNOTATION_KEY).getDetails().put(ZONE_KEY, zone);
	}

	/**
	 * Helper to create an initialized Annotation
	 */
	public static void createRegionDefaultAnnotation(View region) {
		if(!isRegion(region))
			throw new IllegalArgumentException();

		// now everything is fine we can go on
		// the given node is a region node
		// create EAnnotation to store region specifics
		EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		// register annotation to region node
		eAnnotation.setEModelElement(region);
		eAnnotation.setSource(ANNOTATION_KEY);

		// assign default values for zone property
		eAnnotation.getDetails().put(ZONE_KEY, NONE);
	}

	/**
	 * Computes a bit-wise operation which account for the directions along
	 * which a region may be resized. E.g. if a region has no LEFT neighbours -
	 * sits directly at the LEFT border of a state machine - we do not allow for
	 * a resize along the WEST direction, user will have to resize the state
	 * machine or state directly. Bit-wise operations are performed according to
	 * the draw2D conventions
	 * 
	 * @param s
	 *        a string
	 * 
	 * @return an integer which is the result of a bit-wise operation
	 */
	public static int getAllowedResizeDirections(String s) {
		if(s == null)
			throw new IllegalArgumentException();
		// this involves bit-wise operations
		// we start with none directions allowed
		// then add others
		int direction = PositionConstants.NONE;
		if(hasLeftNeighbours(s))
			// WEST allowed
			direction |= PositionConstants.WEST;
		if(hasRightNeighbours(s))
			// EAST allowed
			direction |= PositionConstants.EAST;
		if(hasTopNeighbours(s))
			// NORTH allowed
			direction |= PositionConstants.NORTH;
		if(hasBottomNeighbours(s))
			// SOUTH allowed
			direction |= PositionConstants.SOUTH;
		return direction;
	}

	/**
	 * Helper to get bounds.
	 * 
	 * @param view
	 *        the region view
	 * 
	 * @return a new Rectangle with same bounds as the region
	 */
	public static Rectangle getBounds(View view) {
		int x = (Integer)ViewUtil.getStructuralFeatureValue(view, NotationPackage.eINSTANCE.getLocation_X());
		int y = (Integer)ViewUtil.getStructuralFeatureValue(view, NotationPackage.eINSTANCE.getLocation_Y());
		int width = (Integer)ViewUtil.getStructuralFeatureValue(view, NotationPackage.eINSTANCE.getSize_Width());
		int height = (Integer)ViewUtil.getStructuralFeatureValue(view, NotationPackage.eINSTANCE.getSize_Height());

		return new Rectangle(x, y, width, height);
	}

	/**
	 * Helper to get height of the given view
	 * 
	 * @param view
	 *        the region view
	 * 
	 * @return the height of the region
	 */
	public static int getHeight(View view) {
		int height = (Integer)ViewUtil.getStructuralFeatureValue(view, NotationPackage.eINSTANCE.getSize_Height());
		return height;
	}

	/**
	 * Checks the regions passed in the list w.r.t. to zone criterion expressed
	 * as an initial pattern to be matched and a zone not to be found in the
	 * final pattern expression and returns a list of regions matching the
	 * criterion
	 * 
	 * @param regionList
	 *        a list of region nodes
	 * @param initPattern
	 *        the initial pattern the region zone must match
	 * @param excludingZoneInFinalPattern
	 *        the type of zone to exclude in the final pattern
	 * 
	 * @return a list of the regions in the list matching the criterion
	 */
	public static List<View> getMatchingRegionsFromList(List<View> regionList, String initPattern, String excludingZoneInFinalPattern) {

		List<View> matchingRegions = new ArrayList<View>();
		Iterator<View> it = regionList.iterator();
		while(it.hasNext()) {
			View view = it.next();
			// get the zone of current region
			String zone = Zone.getZone(view);
			String zoneLastPart = (zone.length() <= initPattern.length()) ? "" : zone.substring(initPattern.length());

			if(zone.startsWith(initPattern) && !zoneLastPart.contains(excludingZoneInFinalPattern))
				matchingRegions.add(view);
		}

		return matchingRegions;
	}

	/**
	 * Provides the list of nodes which are close to the inside of the given
	 * region BOTTOM border.
	 * 
	 * @param region
	 *        the region graph node
	 * 
	 * @return a vector of the neighbouring graph nodes
	 */
	public static List<View> getRegionBottomBorderInsideNeighbours(View region) {
		// get the region zone
		String zone = Zone.getZone(region);
		// we are looking for regions that matches the zone of the given region
		// i.e. if region is initPattern+"T"+finalPattern where finalPattern
		// does not contain any
		// "T"
		// a matching region is initPattern+"T"+otherFinalPattern where
		// otherFinalPattern does not
		// contain any "T"

		int index = zone.lastIndexOf(Zone.TOP);
		String initPattern = zone.substring(0, index) + Zone.TOP;
		String excludingZoneInFinalPattern = Zone.TOP;

		// get the stateMachine compartment
		View stateMachineCompartment = (View)region.eContainer();
		// then the list of regions
		List<View> regionList = (List<View>)stateMachineCompartment.getChildren();

		List<View> neighbours = getMatchingRegionsFromList(regionList, initPattern, excludingZoneInFinalPattern);

		return neighbours;
	}

	/**
	 * Provides the list of regions which are close to the outside of the given
	 * region BOTTOM border.
	 * 
	 * @param region
	 *        the region node
	 * 
	 * @return a vector of the neighbouring regions
	 */
	public static List<View> getRegionBottomBorderOutsideNeighbours(View region) {
		// get the region zone
		String zone = Zone.getZone(region);
		// we are looking for regions that matches the zone of the given region
		// i.e. if region is initPattern+"T"+finalPattern where finalPattern
		// does not contain any
		// "T"
		// a matching region is initPattern+"B"+otherFinalPattern where
		// otherFinalPattern does not
		// contain any "B"

		int index = zone.lastIndexOf(Zone.TOP);
		String initPattern = zone.substring(0, index) + Zone.BOTTOM;
		String excludingZoneInFinalPattern = Zone.BOTTOM;

		// get the stateMachine compartment
		View stateMachineCompartment = (View)region.eContainer();
		// then the list of regions
		List<View> regionList = (List<View>)stateMachineCompartment.getChildren();

		List<View> neighbours = getMatchingRegionsFromList(regionList, initPattern, excludingZoneInFinalPattern);

		return neighbours;
	}

	/**
	 * Provides the list of nodes which are close to the inside of the given
	 * region LEFT border.
	 * 
	 * @param region
	 *        the region graph node
	 * 
	 * @return a vector of the neighbouring graph nodes
	 */
	public static List<View> getRegionLeftBorderInsideNeighbours(View region) {
		// get the region zone
		String zone = Zone.getZone(region);
		// we are looking for regions that matches the zone of the given region
		// i.e. if region is initPattern+"R"+finalPattern where finalPattern
		// does not contain any
		// "R"
		// a matching region is initPattern+"R"+otherFinalPattern where
		// otherFinalPattern does not
		// contain any "R"

		int index = zone.lastIndexOf(Zone.RIGHT);
		String initPattern = zone.substring(0, index) + Zone.RIGHT;
		String excludingZoneInFinalPattern = Zone.RIGHT;

		// get the stateMachine compartment
		View stateMachineCompartment = (View)region.eContainer();
		// then the list of regions
		List<View> regionList = (List<View>)stateMachineCompartment.getChildren();

		List<View> neighbours = getMatchingRegionsFromList(regionList, initPattern, excludingZoneInFinalPattern);

		return neighbours;
	}

	/**
	 * Provides the list of nodes which are close to the outside of the given
	 * region LEFT border.
	 * 
	 * @param region
	 *        the region graph node
	 * 
	 * @return a list of the neighbouring graph nodes
	 */
	public static List<View> getRegionLeftBorderOutsideNeighbours(View region) {
		// get the region zone
		String zone = Zone.getZone(region);
		// we are looking for regions that matches the zone of the given region
		// i.e. if region is initPattern+"R"+finalPattern where finalPattern
		// does not contain any
		// "R"
		// a matching region is initPattern+"L"+otherFinalPattern where
		// otherFinalPattern does not
		// contain any "L"

		int index = zone.lastIndexOf(Zone.RIGHT);
		String initPattern = zone.substring(0, index) + Zone.LEFT;
		String excludingZoneInFinalPattern = Zone.LEFT;

		// get the stateMachine compartment
		View stateMachineCompartment = (View)region.eContainer();
		// then the list of regions
		List<View> regionList = (List<View>)stateMachineCompartment.getChildren();

		List<View> neighbours = getMatchingRegionsFromList(regionList, initPattern, excludingZoneInFinalPattern);

		return neighbours;
	}

	/**
	 * Provides the list of nodes which are close ot the inside of the given
	 * region RIGHT border.
	 * 
	 * @param region
	 *        the region graph node
	 * 
	 * @return a vector of the neighbouring graph nodes
	 */
	public static List<View> getRegionRightBorderInsideNeighbours(View region) {
		// get the region zone
		String zone = Zone.getZone(region);
		// we are looking for regions that matches the zone of the given region
		// i.e. if region is initPattern+"L"+finalPattern where finalPattern
		// does not contain any
		// "L"
		// a matching region is initPattern+"L"+otherFinalPattern where
		// otherFinalPattern does not
		// contain any "L"

		int index = zone.lastIndexOf(Zone.LEFT);
		String initPattern = zone.substring(0, index) + Zone.LEFT;
		String excludingZoneInFinalPattern = Zone.LEFT;

		// get the stateMachine compartment
		View stateMachineCompartment = (View)region.eContainer();
		// then the list of regions
		List<View> regionList = (List<View>)stateMachineCompartment.getChildren();

		List<View> neighbours = getMatchingRegionsFromList(regionList, initPattern, excludingZoneInFinalPattern);

		return neighbours;
	}

	/**
	 * Provides the list of nodes which are at the outside of the given region
	 * RIGHT border.
	 * 
	 * @param region
	 *        the region graph node
	 * 
	 * @return a vector of the neighbouring graph nodes
	 */
	public static List<View> getRegionRightBorderOutsideNeighbours(View region) {
		// get the region zone
		String zone = Zone.getZone(region);
		// we are looking for regions that matches the zone of the given region
		// i.e. if region is initPattern+"L"+finalPattern where finalPattern
		// does not contain any
		// "L"
		// a matching region is initPattern+"R"+otherFinalPattern where
		// otherFinalPattern does not
		// contain any "R"

		int index = zone.lastIndexOf(Zone.LEFT);
		String initPattern = zone.substring(0, index) + Zone.RIGHT;
		String excludingZoneInFinalPattern = Zone.RIGHT;

		// get the stateMachine compartment
		View stateMachineCompartment = (View)region.eContainer();
		// then the list of regions
		List<View> regionList = (List<View>)stateMachineCompartment.getChildren();

		List<View> neighbours = getMatchingRegionsFromList(regionList, initPattern, excludingZoneInFinalPattern);

		return neighbours;
	}

	/**
	 * Provides the list of nodes which are close to the inside of the given
	 * region TOP border.
	 * 
	 * @param region
	 *        the region node
	 * 
	 * @return a vector of the neighbouring regions
	 */
	public static List<View> getRegionTopBorderInsideNeighbours(View region) {
		// get the region zone
		String zone = Zone.getZone(region);
		// we are looking for regions that matches the zone of the given region
		// i.e. if region is initPattern+"B"+finalPattern where finalPattern
		// does not contain any
		// "B"
		// a matching region is initPattern+"B"+otherFinalPattern where
		// otherFinalPattern does not
		// contain any "B"

		int index = zone.lastIndexOf(Zone.BOTTOM);
		String initPattern = zone.substring(0, index) + Zone.BOTTOM;
		String excludingZoneInFinalPattern = Zone.BOTTOM;

		// get the stateMachine compartment
		View stateMachineCompartment = (View)region.eContainer();
		// then the list of regions
		List<View> regionList = (List<View>)stateMachineCompartment.getChildren();

		List<View> neighbours = getMatchingRegionsFromList(regionList, initPattern, excludingZoneInFinalPattern);

		return neighbours;
	}

	/**
	 * Provides the list of nodes which are close to the outside of the given
	 * region TOP border.
	 * 
	 * @param region
	 *        the region graph node
	 * 
	 * @return a vector of the neighbouring graph nodes
	 */
	public static List<View> getRegionTopBorderOutsideNeighbours(View region) {
		// get the region zone
		String zone = Zone.getZone(region);
		// we are looking for regions that matches the zone of the given region
		// i.e. if region is initPattern+"B"+finalPattern where finalPattern
		// does not contain any
		// "B"
		// a matching region is initPattern+"T"+otherFinalPattern where
		// otherFinalPattern does not
		// contain any "T"

		int index = zone.lastIndexOf(Zone.BOTTOM);
		String initPattern = zone.substring(0, index) + Zone.TOP;
		String excludingZoneInFinalPattern = Zone.TOP;

		// get the stateMachine compartment
		View stateMachineCompartment = (View)region.eContainer();
		// then the list of regions
		List<View> regionList = (List<View>)stateMachineCompartment.getChildren();

		List<View> neighbours = getMatchingRegionsFromList(regionList, initPattern, excludingZoneInFinalPattern);

		return neighbours;
	}

	/**
	 * Helper to get width
	 * 
	 * @param region
	 *        the region graph node
	 * 
	 * @return the width of the region
	 */
	public static int getWidth(View view) {
		int width = (Integer)ViewUtil.getStructuralFeatureValue(view, NotationPackage.eINSTANCE.getSize_Width());
		return width;
	}

	/**
	 * Helper to get x
	 * 
	 * @param region
	 *        the region graph node
	 * 
	 * @return the x of the region
	 */
	public static int getX(View view) {
		int x = (Integer)ViewUtil.getStructuralFeatureValue(view, NotationPackage.eINSTANCE.getLocation_X());
		return x;
	}

	/**
	 * Helper to get y
	 * 
	 * @param region
	 *        the region graph node
	 * 
	 * @return the y of the region
	 */
	public static int getY(View view) {
		int y = (Integer)ViewUtil.getStructuralFeatureValue(view, NotationPackage.eINSTANCE.getLocation_Y());
		return y;
	}

	/**
	 * Helper to access zone
	 * 
	 * @param region
	 *        the region graph node
	 * 
	 * @return the zone of the region
	 */
	public static String getZone(View view) {
		if(view.getEAnnotation(ANNOTATION_KEY) == null)
			throw new IllegalArgumentException();
		if(!view.getEAnnotation(ANNOTATION_KEY).getDetails().containsKey(ZONE_KEY))
			throw new IllegalArgumentException();
		return view.getEAnnotation(ANNOTATION_KEY).getDetails().get(ZONE_KEY);
	}

	/**
	 * Returns the zone counterpart of the given zone i.e. if Zone.RIGHT then
	 * Zone.LEFT is returned, etc.
	 * 
	 * @param zone
	 *        the zone
	 * 
	 * @return the counterpart zone
	 */
	private static String getZoneCounterpart(String s) {
		String cs = s.substring(0, s.length() - 1);
		if(Zone.isRight(s))
			return Zone.setLeft(cs);
		if(Zone.isLeft(s))
			return Zone.setRight(cs);
		if(Zone.isBottom(s))
			return Zone.setTop(cs);
		if(Zone.isTop(s))
			return Zone.setBottom(cs);
		return s;
	}

	/**
	 * Computes the zone at location within bounds using absolute coordinates
	 * 
	 * @param location
	 *        the location
	 * @param rect
	 *        the bounds
	 * 
	 * @return the zone
	 */
	public static String getZoneFromLocationInRectangleWithAbsoluteCoordinates(Point location, Rectangle rect) {
		// d1 is for the first diagonal (going up) rect
		double d1 = location.y - 1.0 * rect.height / rect.width * (rect.x - location.x) - rect.y - rect.height;
		// d2 is for the second (going down)
		double d2 = location.y + 1.0 * rect.height / rect.width * (rect.x - location.x) - rect.y;
		if((d1 <= 0) && (d2 <= 0)) {
			return Zone.TOP;
		}
		if((d1 <= 0) && (d2 > 0)) {
			return Zone.LEFT;
		}
		if((d1 > 0) && (d2 <= 0)) {
			return Zone.RIGHT;
		}
		if((d1 > 0) && (d2 > 0)) {
			return Zone.BOTTOM;
		}
		return Zone.NONE;
	}

	/**
	 * Computes the zone at location within bounds using local coordinates
	 * 
	 * @param location
	 *        the location
	 * @param rect
	 *        the bounds
	 * 
	 * @return the zone
	 */
	public static String getZoneFromLocationInRectangleWithLocalCoordinates(Point location, Rectangle rect) {
		// d1 is for the first diagonal (going up) rect
		double d1 = location.y + 1.0 * rect.height * location.x / rect.width - rect.height;
		// d2 is for the second (going down)
		double d2 = location.y - 1.0 * rect.height * location.x / rect.width;
		if((d1 <= 0) && (d2 <= 0)) {
			return Zone.TOP;
		}
		if((d1 <= 0) && (d2 > 0)) {
			return Zone.LEFT;
		}
		if((d1 > 0) && (d2 <= 0)) {
			return Zone.RIGHT;
		}
		if((d1 > 0) && (d2 > 0)) {
			return Zone.BOTTOM;
		}
		return Zone.NONE;
	}

	/**
	 * Checks whether the given location has any BOTTOM neighbours. Or said
	 * differently has a BOTTOM border.
	 * 
	 * @param s
	 *        a string
	 * 
	 * @return boolean true or false
	 */
	public static boolean hasBottomNeighbours(String s) {
		if(s == null)
			throw new IllegalArgumentException();
		return s.contains(Zone.TOP);
	}

	/**
	 * Checks whether the given location has any LEFT neighbours. Or said
	 * differently has a LEFT border.
	 * 
	 * @param s
	 *        a string
	 * 
	 * @return boolean true or false
	 */
	public static boolean hasLeftNeighbours(String s) {
		if(s == null)
			throw new IllegalArgumentException();
		return s.contains(Zone.RIGHT);
	}

	/**
	 * Checks whether the given location has any RIGHT neighbours. Or said
	 * differently has a RIGHT border.
	 * 
	 * @param s
	 *        a string
	 * 
	 * @return boolean true or false
	 */
	public static boolean hasRightNeighbours(String s) {
		if(s == null)
			throw new IllegalArgumentException();
		return s.contains(Zone.LEFT);
	}

	/**
	 * Checks whether the given location has any TOP neighbours. Or said
	 * differently has a TOP border.
	 * 
	 * @param s
	 *        a string
	 * 
	 * @return boolean true or false
	 */
	public static boolean hasTopNeighbours(String s) {
		if(s == null)
			throw new IllegalArgumentException();
		return s.contains(Zone.BOTTOM);
	}

	/**
	 * Checks whether the leaf location encoded is BOTTOM.
	 * 
	 * @param s
	 *        a string
	 * 
	 * @return boolean true or false
	 */
	public static boolean isBottom(String s) {
		if(s == null)
			throw new IllegalArgumentException();
		return s.endsWith(Zone.BOTTOM);
	}

	/**
	 * Checks whether the leaf location encoded is LEFT.
	 * 
	 * @param s
	 *        a string
	 * 
	 * @return boolean true or false
	 */
	public static boolean isLeft(String s) {
		if(s == null)
			throw new IllegalArgumentException();
		return s.endsWith(Zone.LEFT);
	}

	/**
	 * Checks whether the leaf location encoded is NONE.
	 * 
	 * @param s
	 *        a string
	 * @return boolean true or false
	 */
	public static boolean isNone(String s) {
		if(s == null)
			throw new IllegalArgumentException();
		return s.equals(Zone.NONE);
	}

	/**
	 * Checks whether the view is a region
	 * 
	 * @param view
	 *        a View
	 * @return boolean true or false
	 */
	public static boolean isRegion(View view) {
		if(view == null)
			throw new IllegalArgumentException();
		return (UMLVisualIDRegistry.getVisualID(view.getType()) == RegionEditPart.VISUAL_ID);
	}

	/**
	 * Checks whether the leaf location encoded is RIGHT.
	 * 
	 * @param s
	 *        a string
	 * 
	 * @return boolean true or false
	 */
	public static boolean isRight(String s) {
		if(s == null)
			throw new IllegalArgumentException();
		return s.endsWith(Zone.RIGHT);
	}

	/**
	 * Checks whether the view is a state machine
	 * 
	 * @param view
	 *        a View
	 * @return boolean true or false
	 */
	public static boolean isStateMachine(View view) {
		if(view == null)
			throw new IllegalArgumentException();
		return (UMLVisualIDRegistry.getVisualID(view.getType()) == StateMachineEditPart.VISUAL_ID);
	}

	/**
	 * Checks whether the leaf location encoded is TOP.
	 * 
	 * @param s
	 *        a string
	 * @return boolean true or false
	 */
	public static boolean isTop(String s) {
		if(s == null)
			throw new IllegalArgumentException();
		return s.endsWith(Zone.TOP);
	}

	/**
	 * Resets the zone of the region counterparts i.e. if region passed has a
	 * "XXXR" zone then its counterparts are "XXXL*", etc. Resetting their zones
	 * mean they are changed into "XXX*" "L" is removed
	 * 
	 * @param region
	 *        the region node
	 */
	public static void resetRegionCounterpartZone(View region) {
		// get the region zone
		String zone = getZone(region);
		// get its counterpart
		String cZone = getZoneCounterpart(zone);

		List<View> list = new ArrayList<View>();
		// get the stateMachine compartment
		View stateMachineCompartment = (View)region.eContainer();
		Iterator<View> it = stateMachineCompartment.getChildren().iterator();
		while(it.hasNext()) {
			View view = it.next();
			String currentZone = getZone(view);
			if(currentZone.startsWith(cZone)) {
				String initPart = currentZone.substring(0, cZone.length() - 1);
				String finalPart = (currentZone.length() <= cZone.length()) ? "" : currentZone.substring(cZone.length());
				currentZone = initPart + finalPart;
				setZone(view, currentZone);
			}
		}
	}

	/**
	 * Adds a final "B" to the given property string. This is used when a
	 * horizontal region is created. The new region is always at the BOTTOM, the
	 * old one is on TOP.
	 * 
	 * @param s
	 *        a string
	 * 
	 * @return the updated string
	 */
	public static String setBottom(String s) {
		if(s == null)
			throw new IllegalArgumentException();
		return s + Zone.BOTTOM;
	}

	/**
	 * Helper to set zone
	 * 
	 * @param view
	 *        a View
	 */
	public static void setBottom(View view) {
		if(view.getEAnnotation(ANNOTATION_KEY) == null)
			throw new IllegalArgumentException();

		if(!view.getEAnnotation(ANNOTATION_KEY).getDetails().containsKey(ZONE_KEY))
			throw new IllegalArgumentException();

		String currentZone = Zone.getZone(view);
		String zoneToSet = Zone.setBottom(currentZone);
		view.getEAnnotation(ANNOTATION_KEY).getDetails().put(ZONE_KEY, zoneToSet);
	}

	/**
	 * Helper to set bounds
	 * 
	 * @param view
	 *        a View
	 * @param bounds
	 *        the bounds
	 */
	public static void setBounds(View view, Rectangle bounds) {
		ViewUtil.setStructuralFeatureValue(view, NotationPackage.eINSTANCE.getLocation_X(), bounds.x);
		ViewUtil.setStructuralFeatureValue(view, NotationPackage.eINSTANCE.getLocation_Y(), bounds.y);
		ViewUtil.setStructuralFeatureValue(view, NotationPackage.eINSTANCE.getSize_Width(), bounds.width);
		ViewUtil.setStructuralFeatureValue(view, NotationPackage.eINSTANCE.getSize_Height(), bounds.height);
	}

	/**
	 * Helper to set height
	 * 
	 * @param view
	 *        a View
	 * @param height
	 *        the height
	 */
	public static void setHeight(View view, int height) {
		ViewUtil.setStructuralFeatureValue(view, NotationPackage.eINSTANCE.getSize_Height(), height);
	}

	/**
	 * Adds a final "L" to the given property string. This is used when a
	 * vertical region is created. The new region is always on the RIGHT, the
	 * old one is on the LEFT.
	 * 
	 * @param s
	 *        a string
	 * 
	 * @return the updated string
	 */
	public static String setLeft(String s) {
		if(s == null)
			throw new IllegalArgumentException();
		return s + Zone.LEFT;
	}

	/**
	 * Helper to set zone
	 * 
	 * @param view
	 *        a View
	 */
	public static void setLeft(View view) {
		if(view.getEAnnotation(ANNOTATION_KEY) == null)
			throw new IllegalArgumentException();

		if(!view.getEAnnotation(ANNOTATION_KEY).getDetails().containsKey(ZONE_KEY))
			throw new IllegalArgumentException();

		String currentZone = Zone.getZone(view);
		String zoneToSet = Zone.setLeft(currentZone);
		view.getEAnnotation(ANNOTATION_KEY).getDetails().put(ZONE_KEY, zoneToSet);
	}

	/**
	 * Adds a final "R" to the given property string. This is used when a
	 * vertical region is created. The new region is always on the RIGHT, the
	 * old one is on the LEFT.
	 * 
	 * @param s
	 *        a string
	 * 
	 * @return the updated string
	 */
	public static String setRight(String s) {
		if(s == null)
			throw new IllegalArgumentException();
		return s + Zone.RIGHT;
	}

	/**
	 * Helper to set zone
	 * 
	 * @param view
	 *        a View
	 */
	public static void setRight(View view) {
		if(view.getEAnnotation(ANNOTATION_KEY) == null)
			throw new IllegalArgumentException();

		if(!view.getEAnnotation(ANNOTATION_KEY).getDetails().containsKey(ZONE_KEY))
			throw new IllegalArgumentException();

		String currentZone = Zone.getZone(view);
		String zoneToSet = Zone.setRight(currentZone);
		view.getEAnnotation(ANNOTATION_KEY).getDetails().put(ZONE_KEY, zoneToSet);
	}

	/**
	 * Adds a final "T" to the given property string. This is used when a
	 * horizontal region is created. The new region is always at the BOTTOM, the
	 * old one is on TOP.
	 * 
	 * @param s
	 *        a string
	 * 
	 * @return the updated string
	 */
	public static String setTop(String s) {
		if(s == null)
			throw new IllegalArgumentException();
		return s + Zone.TOP;
	}

	/**
	 * Helper to set zone
	 * 
	 * @param view
	 *        a View
	 */
	public static void setTop(View view) {
		if(view.getEAnnotation(ANNOTATION_KEY) == null)
			throw new IllegalArgumentException();

		if(!view.getEAnnotation(ANNOTATION_KEY).getDetails().containsKey(ZONE_KEY))
			throw new IllegalArgumentException();

		String currentZone = Zone.getZone(view);
		String zoneToSet = Zone.setTop(currentZone);
		view.getEAnnotation(ANNOTATION_KEY).getDetails().put(ZONE_KEY, zoneToSet);
	}

	/**
	 * Helper to set width
	 * 
	 * @param view
	 *        a View
	 * @param width
	 *        the width
	 */
	public static void setWidth(View view, int width) {
		ViewUtil.setStructuralFeatureValue(view, NotationPackage.eINSTANCE.getSize_Width(), width);
	}

	/**
	 * Helper to set x
	 * 
	 * @param view
	 *        a View
	 * @param x
	 *        the x
	 */
	public static void setX(View view, int x) {
		ViewUtil.setStructuralFeatureValue(view, NotationPackage.eINSTANCE.getLocation_X(), x);
	}

	/**
	 * Helper to set y
	 * 
	 * @param view
	 *        a View
	 * @param y
	 *        the y
	 */
	public static void setY(View view, int y) {
		ViewUtil.setStructuralFeatureValue(view, NotationPackage.eINSTANCE.getLocation_Y(), y);
	}

	/**
	 * Helper to set zone with passed zone
	 * 
	 * @param view
	 *        a View
	 * @param zone
	 *        a Zone
	 */
	public static void setZone(View view, String zone) {
		if(view.getEAnnotation(ANNOTATION_KEY) == null)
			throw new IllegalArgumentException();

		if(!view.getEAnnotation(ANNOTATION_KEY).getDetails().containsKey(ZONE_KEY))
			throw new IllegalArgumentException();

		view.getEAnnotation(ANNOTATION_KEY).getDetails().put(ZONE_KEY, zone);
	}
}
