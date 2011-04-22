package de.cau.cs.kieler.example.oaw.gen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import mymodel.*;

public class XtendJava {

	//-------------------------------------------------------------------------
	// system output
	public final static void dump(String aString) {
		System.out.println(aString);
	}

	//-------------------------------------------------------------------------
	public final static String createListValue(EObject item) {
		   if (item.eClass().getName().equals("MyList")) {
			   //THIS CAUSES AN ERROR BECAUSE BECAUSE OF DYNAMIC EMF//
			   //SEE:
			   //www.ibm.com/developerworks/library/os-eclipse-dynamicemf/
			   
			   //MyList myList = (MyList)item;
		   }
		   return "LIST";
	}
		
	//-------------------------------------------------------------------------
	// create (more complex) list serialization
	public final static String createListValue(MyList item) {
		String returnString = "";
		EList objects = item.getItems();
		for (int c = 0; c < objects.size(); c++) {
			Object object = objects.get(c);
			String itemString = "";
			if (object instanceof MyString) {
				itemString = createStringValue((MyString)object);
			}
			if (object instanceof MyInt) {
				itemString = createIntValue((MyInt)object);
			}
			if (object instanceof MyConst) {
				itemString = createConstValue((MyConst)object);
			}
			if (object instanceof MyList) {
				itemString = "{" + createListValue((MyList)object) + "}";
			}
			if (!returnString.equals("")) returnString += ",";
			returnString += itemString;
		}
		return returnString;
	}
	
	//-------------------------------------------------------------------------
	// serialization of MyInt, MyString and MyConst
	public final static String createIntValue(MyInt item) {
		return item.getValue()+"";
	}
	public final static String createStringValue(MyString item) {
		return item.getText();
	}
	public final static String createConstValue(MyConst item) {
		return item.getValue().getLiteral();
	}
	
	//-------------------------------------------------------------------------
	
}
