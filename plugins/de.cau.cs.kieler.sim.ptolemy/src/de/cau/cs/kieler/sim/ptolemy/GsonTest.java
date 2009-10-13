/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.sim.ptolemy;

import com.google.gson.Gson;
import ptolemy.data.IntToken;

/**
 * Example shows how to use Googles JSON-API for Java object serialization
 * to JSON and deserialization back to an object.
 * @author cmot
 *
 */

public class GsonTest {

	public static void main(String[] args) {
		//create gson instance
		Gson gson = new Gson();
		
		//create ptolemy data instance, e.g. int of value 5
		IntToken myPtolemyData = new IntToken(5);
		System.out.println("ptolemy data orginal:"+myPtolemyData.intValue());
		
		//get JSON-string represenation of ptolemy java object
		String json = gson.toJson(myPtolemyData);  
		System.out.println("ptolemy data JSON:"+json);
		
		//recover ptolemy data instance from JSON-string
		IntToken myRecoveredPtolemyData = gson.fromJson(json, IntToken.class);
		System.out.println("ptolemy data recovered:"+myRecoveredPtolemyData.intValue());
	}

}

///////////////
//  OUTPUT:  //
///////////////
//
//ptolemy data orginal:5
//ptolemy data JSON:{"_value":5}
//ptolemy data recovered:5
//