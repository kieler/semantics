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

/**
 * Example shows how to use Googles JSON-API for Java object serialization
 * to JSON and deserialization back to an object.
 * @author cmot
 *
 */

class MyDataEx {
	  public int value1 = 1;
	  public String[] strings = {"abc", "def", "ghi"};
	  public MySubDataEx[] subdata;
	  
	  MyDataEx(){
		  subdata = new MySubDataEx[2];
		  subdata[0] = new MySubDataEx();
		  subdata[1] = new MySubDataEx();
	  }
}
class MySubDataEx {
	  public int intVal;
	  public String stringVal;
	  MySubDataEx() {}
}

public class GsonTestEx {

	
	public static void main(String[] args) {
		//create gson instance
		Gson gson = new Gson();
		
		//create extended data instance
		MyDataEx myData = new MyDataEx();
		myData.subdata[1].stringVal = "testvalue";
		System.out.println("data orginal (subdata string1):"+myData.subdata[1].stringVal);
		
		//get JSON-string represenation of java object
		String json = gson.toJson(myData);  
		System.out.println("data JSON:"+json);
		
		//recover extened data instance from JSON-string
		MyDataEx someData = gson.fromJson(json, MyDataEx.class);
		System.out.println("data recovered (subdata string1):"+myData.subdata[1].stringVal);
		
		String address = "myData.subdata[1].stringVal";
		//Question: How to address this value programmatically?!
	}

}
