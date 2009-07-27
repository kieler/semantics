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

import java.util.Collection;
import java.util.Hashtable;

import de.cau.cs.kieler.simplerailctrl.*;
import de.cau.cs.kieler.simplerailctrl.util.SimplerailctrlAdapterFactory;
//import org.openarchitectureware.*;
//import org.openarchitectureware.emf.*;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import de.cau.cs.kieler.simplerailctrl.provider.*;

public class XtendJava {
	public final static void dump(String aString) {
		System.out.println(aString);
	}

	//-------------------------------------------------------------------------

	public final static String hash(Node myNode) {
		int i = myNode.eContainer().eContents().indexOf(myNode);
		return ""+i;//myNode.hashCode();
	}

	public final static String modelElementXPath(Node myNode) {
		int index = myNode.eContainer().eContents().indexOf(myNode);
		String returnString = "//@nodes."+index;
		return returnString;
	}
	
	
	public final static String hash(Transition myTransition) {
		return ""+myTransition.hashCode();
	}

	public final static String hash(String aString) {
		return ""+aString.hashCode();
	}
	
	//-------------------------------------------------------------------------
	
	//-------------------------------------------------------------------------

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
			EList trackList = event.getTrack();
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

	public final static String buildEmission(Node myNode) {
		String myEmission = "";
		if (myNode.eClass().getName().equals("SetSpeed")) {
			SetSpeed setSpeed = (SetSpeed)myNode;
			int speed = setSpeed.getSpeed();
			int motormode = setSpeed.getDirection().getValue();
			EList trackList = setSpeed.getTrack();
			myEmission += "tracks={";
			for (int c = 0; c < trackList.size(); c++) {
				if (c > 0) myEmission += ",";
				int track = ((TRACK)trackList.get(c)).getValue();
				//myEmission += "track"+track+"={speed="+speed+"}";
				myEmission += "track"+track+"={speed="+speed+", motormode="+motormode+"}";
			}
			myEmission += "};";
			if (trackList.size() == 0) myEmission = "tracks={track12345={speed=0, motormode=0}};";
			myEmission += "signals={signal12345={lights=0}};";
			myEmission += "points={point12345={turn=0}}";
			//myEmission += "tracks={track12345={speed=0, motormode=0}}";
		}

		if (myNode.eClass().getName().equals("SetPoint")) {
			SetPoint setPoint = (SetPoint)myNode;
			int turn = setPoint.getDirection().getValue();
			EList pointList = setPoint.getPoint();
			myEmission += "points={";
			for (int c = 0; c < pointList.size(); c++) {
				if (c > 0) myEmission += ",";
				int point = ((POINT)pointList.get(c)).ordinal();
				myEmission += "point"+point+"={turn="+turn+"}";
			}
			myEmission += "};";
			if (pointList.size() == 0) myEmission = "points={point12345={turn=0}};";
			myEmission += "signals={signal12345={lights=0}};";
			//myEmission += "points={point12345={turn=0}}";
			myEmission += "tracks={track12345={speed=0, motormode=0}}";
		}

		if (myNode.eClass().getName().equals("SetSignal")) {
			SetSignal setSignal = (SetSignal)myNode;
			int color = setSignal.getColor().getValue();
			boolean position0 = false;
			boolean position1 = false;
			EList positionList = setSignal.getPosition();
			for (int c = 0; c < positionList.size(); c++){
				int posval = ((POSITION)positionList.get(c)).getValue();
				if (posval == 0) position0 = true;
				if (posval == 1) position1 = true;
			}
			EList trackList = setSignal.getTrack();
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
			if (trackList.size() == 0) myEmission = "signals={signal12345={lights=0}};";
			//myEmission += "signals={signal12345={lights=0}}";
			myEmission += "points={point12345={turn=0}};";
			myEmission += "tracks={track12345={speed=0, motormode=0}}";
		}
		
		return myEmission;
	}

	//-------------------------------------------------------------------------

	static Hashtable ht = new Hashtable();
	public final static void markState(Node myNode) {
		ht.put(myNode.hashCode(), myNode);
	}
	
	public final static boolean isMarked(Node myNode) {
		return ht.contains(myNode);
	}
}
