/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/

package de.cau.cs.kieler.simplerailctrl.sim.ptolemy.oaw;

import java.util.Hashtable;

import de.cau.cs.kieler.simplerailctrl.*;
import org.eclipse.emf.common.util.EList;

/**
 * The class XtendJava implements some Java escape code used in the model2model
 * Xtend transformation.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class XtendJava {
	
	/** The hash table used to remember marked states. */
	static Hashtable<Integer,Node> ht = new Hashtable<Integer,Node>();

	//-------------------------------------------------------------------------
	
	/**
	 * Dump a String to the system console for debugging purposes.
	 * 
	 * @param aString the a string
	 */
	public final static void dump(String aString) {
		System.out.println(aString);
	}

	//-------------------------------------------------------------------------

	/**
	 * Gets the URIFragment of a Node.
	 * 
	 * @param myNode the Node
	 * 
	 * @return the URIFragment
	 */
	public final static String getURIFragment(Node myNode) {
		//Returns the URI fragment that, when passed to getEObject will
		//return the given object.
		return myNode.eResource().getURIFragment(myNode).toString();
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Returns a hash value of a Node.
	 * 
	 * @param myNode the Node
	 * 
	 * @return the hash value as a String
	 */
	public final static String hash(Node myNode) {
		//int i = myNode.eContainer().eContents().indexOf(myNode);
		//return ""+i;//myNode.hashCode();
		return ""+myNode.hashCode();
	}

	//-------------------------------------------------------------------------
	
	/**
	 *  Returns a hash value of a Transition.
	 * 
	 * @param myTransition the Transition
	 * 
	 * @return the hash value as a String
	 */
	public final static String hash(Transition myTransition) {
		return ""+myTransition.hashCode();
	}

	//-------------------------------------------------------------------------

	/**
	 * Returns a hash value of a String..
	 * 
	 * @param string the String
	 * 
	 * @return the hash value as a String
	 */
	public final static String hash(String string) {
		return ""+string.hashCode();
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Builds the trigger of a Transition.
	 * 
	 * @param myTransition the Transition
	 * 
	 * @return the trigger as a String
	 */
	public final static String buildTrigger(Transition myTransition) {
		String myTrigger = "";
		if (myTransition.eClass().getName().equals("EventWait")) {
			EventWait event = (EventWait)myTransition;
			myTrigger = "count > 25*"+event.getSeconds();
		}
		if (myTransition.eClass().getName().equals("EventContact")) {
			EventContact event = (EventContact)myTransition;
			int track = event.getTrack().getValue();
			int pos   = event.getPosition().getValue();
			myTrigger = "contact(" + track + ") == " + pos;
		}
		if (myTransition.eClass().getName().equals("EventOccupied")) {
			EventOccupied event = (EventOccupied)myTransition;
			EList<TRACK> trackList = event.getTrack();
			String condition   = event.getCondition().getLiteral();
			String conjunction = event.getConjunction().getLiteral();
			if(condition.equals("IF_NOT")) condition = "!("; 
									  else condition = "(";
			if(conjunction.equals("AND")) conjunction = " && "; 
									 else conjunction = " || ";
			myTrigger = condition;
			for (int c = 0; c < trackList.size(); c++) {
				if (c > 0) myTrigger += conjunction;
				int track = ((TRACK)trackList.get(c)).getValue();
				myTrigger += "occupied("+track+") == 1";
			}
			myTrigger += ")";
		}
		return myTrigger;
	}

	//-------------------------------------------------------------------------

	/**
	 * Builds the emission of a Node.
	 * 
	 * @param myNode the Node
	 * 
	 * @return the emission as a String
	 */
	public final static String buildEmission(Node myNode) {
		String myEmission = "";
		if (myNode.eClass().getName().equals("SetSpeed")) {
			SetSpeed setSpeed = (SetSpeed)myNode;
			int speed = setSpeed.getSpeed();
			int motormode = setSpeed.getDirection().getValue();
			EList<TRACK> trackList = setSpeed.getTrack();
			myEmission += "tracks={";
			for (int c = 0; c < trackList.size(); c++) {
				if (c > 0) myEmission += ",";
				int track = ((TRACK)trackList.get(c)).getValue();
				//myEmission += "track"+track+"={speed="+speed+"}";
				myEmission += "track"+track
						+"={speed="+speed+", motormode="+motormode+"}";
			}
			myEmission += "};";
			if (trackList.size() == 0) 
				myEmission = "tracks={track12345={speed=0, motormode=0}};";
			myEmission += "signals={signal12345={lights=0}};";
			myEmission += "points={point12345={turn=0}}";
			//myEmission += "tracks={track12345={speed=0, motormode=0}}";
		}

		if (myNode.eClass().getName().equals("SetPoint")) {
			SetPoint setPoint = (SetPoint)myNode;
			int turn = setPoint.getDirection().getValue();
			EList<POINT> pointList = setPoint.getPoint();
			myEmission += "points={";
			for (int c = 0; c < pointList.size(); c++) {
				if (c > 0) myEmission += ",";
				int point = ((POINT)pointList.get(c)).ordinal();
				myEmission += "point"+point+"={turn="+turn+"}";
			}
			myEmission += "};";
			if (pointList.size() == 0) 
				myEmission = "points={point12345={turn=0}};";
			myEmission += "signals={signal12345={lights=0}};";
			//myEmission += "points={point12345={turn=0}}";
			myEmission += "tracks={track12345={speed=0, motormode=0}}";
		}

		if (myNode.eClass().getName().equals("SetSignal")) {
			SetSignal setSignal = (SetSignal)myNode;
			int color = setSignal.getColor().getValue();
			boolean position0 = false;
			boolean position1 = false;
			EList<POSITION> positionList = setSignal.getPosition();
			for (int c = 0; c < positionList.size(); c++){
				int posval = ((POSITION)positionList.get(c)).getValue();
				if (posval == 0) position0 = true;
				if (posval == 1) position1 = true;
			}
			EList<TRACK> trackList = setSignal.getTrack();
			myEmission += "signals={";
			for (int c = 0; c < trackList.size(); c++) {
				if (c > 0) myEmission += ",";
				int track = ((TRACK)trackList.get(c)).getValue();
				if (position0) {
					myEmission += "signal"+track+"a={lights="+color+"}";
				}
				if (position0 && position1) {
					myEmission += ",";
				}
				if (position1) {
					myEmission += "signal"+track+"b={lights="+color+"}";
				}
			}
			myEmission += "};";
			if (trackList.size() == 0) 
				myEmission = "signals={signal12345={lights=0}};";
			myEmission += "points={point12345={turn=0}};";
			myEmission += "tracks={track12345={speed=0, motormode=0}}";
		}
		
		return myEmission;
	}

	//-------------------------------------------------------------------------

	/**
	 * Mark a state Node. This puts the Node myNode into the hash table to
	 * remember it.
	 * 
	 * @param myNode the Node to mark
	 */
	public final static void markState(Node myNode) {
		ht.put(myNode.hashCode(), myNode);
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Checks whether a state Node myNode is marked.
	 * 
	 * @param myNode the Node to check
	 * 
	 * @return true, if state is marked
	 */
	public final static boolean isMarked(Node myNode) {
		return ht.contains(myNode);
	}
	
}
