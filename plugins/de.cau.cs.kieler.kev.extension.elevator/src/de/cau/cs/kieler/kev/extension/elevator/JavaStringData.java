package de.cau.cs.kieler.kev.extension.elevator;

import java.util.Observable;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 * Instances of this class store data that is to be exchanged between Java and
 * the modelling tool. Data is internally stored in a Vector and holds any
 * objects. Data objects are especially of type Boolean, Integer, Float or
 * String. A String data object can be used for example to exchange enumerations
 * with SCADE.
 * 
 * @author haf
 * 
 */
public class JavaStringData extends Observable {

	static final String delim = "{}[](),; ";

	/**
	 * 
	 */
	public String stringRepresentation = "";
	/**
	 * 
	 */
	public Vector<Object> data;

	/**
	 * Main constructor. Used by the two sides: SCADE will call the constructor
	 * and pass a String with the String representation of the Data. This will
	 * be parsed and transferred into the Java data types when the getData
	 * method is called. If the Java side needs to pass Data to SCADE, use this
	 * constructor with an empty String and use the addData method to add data
	 * objects to it. The toString function will then transfer the data to a
	 * SCADE readable format.
	 * 
	 * @param strGuiDisplayData
	 *            String that represents the Data (e.g. coming from SCADE)
	 */
	public JavaStringData(String strGuiDisplayData) {
		stringRepresentation = strGuiDisplayData;
// System.out.println("Data: "+stringRepresentation);
	}

	/**
	 * Creates a String Representation of the data and returns it. The data is
	 * formatted to be passed to SCADE in a structure with a flat hierarchy.
	 * Example: {true,1,1.2,3,4}
	 */
	@Override
	public String toString() {
		if (data == null)
			return stringRepresentation;
		stringRepresentation = "(";

		for (int i = 0; i < data.size(); i++) {
			//System.out.println(data.get(i));
			if (data.get(i) != null){
				stringRepresentation += data.get(i).toString();
				if (i < (getData().size() - 1)) // not for last item
					stringRepresentation += ","; // set komma between items
			}
		}
		stringRepresentation += ")";
		return stringRepresentation;
	}

	/**
	 * Returns the internal data as a Vector. Primitive Types are assumed to be
	 * stored in the corresponding Java Objects: Boolean, Integer, Float and
	 * String (e.g. for enumerations)
	 * 
	 * @return ArrayList of data objects
	 */
	public Vector getData() {
		if (data == null) { // only parse string if data was not parsed before
			data = new Vector<Object>();
			StringTokenizer tokenizer = new StringTokenizer(
					stringRepresentation, delim);
			while (tokenizer.hasMoreTokens()) {
				String token = tokenizer.nextToken();
				Object dataObject = token; // init with the original String
				// try to parse the token to a real data type
				try {
					if (token.equalsIgnoreCase("true")
							|| token.equalsIgnoreCase("false"))
						dataObject = new Boolean(token);
					else
						throw new NumberFormatException(token
								+ " is no boolean!");
				}
				catch (Exception e1) {
					try {
						dataObject = new Integer(token);
					}
					catch (Exception e2) {
						try {
							dataObject = new Double(token);
						}
						catch (Exception e3) {/* nothing */
						}
					}
				}
				data.add(dataObject);
			}
		}
		return data;// System.out.println("Called JavaScadeData toString()");
	}

	/**
	 * Returns the contents as an array of floats. Bools and Integers are
	 * converted to doubles and Strings will return 0.
	 * 
	 * @return an array of doubles
	 */
	public double[] getDoubles() {
		Vector data = this.getData();
		double[] doubleData = new double[data.size()];
		for (int i = 0; i < data.size(); i++) {
			Object d = data.get(i);
			if (d instanceof Double)
				doubleData[i] = ((Double) d).doubleValue();
			else if (d instanceof Integer)
				doubleData[i] = ((Integer) d).doubleValue();
			else if (d instanceof Boolean) {
				boolean b = ((Boolean) d).booleanValue();
				doubleData[i] = b ? 1 : 0;
			}
			else
				// e.g. String or anything else
				doubleData[i] = 0;
		}
		return doubleData;
	}

	/**
	 * Adds a data object (should be one of Boolean, Float, Integer, String
	 * (corresponding to an enumeration name)) to the data Array.
	 * 
	 * @param o
	 */
	public void addData(Object o) {
		getData(); // make sure data was initialized.
		data.add(o);
		this.setChanged();
		this.notifyObservers();
	}

	/**
	 * @param index
	 * @param o
	 */
	public void setData(int index, Object o) {
		getData();
		if (data.size() - 1 >= index) {
			data.set(index, o);
			// System.out.println(data.toString());
			//System.out.println("DataToString: " + data.toString());
			this.setChanged();
			this.notifyObservers();
		}
		else {
			data.setSize(index + 1);
			data.set(index, o);
			this.setChanged();
			this.notifyObservers();
		}
	}

	@Override
	public void notifyObservers() {
		this.notifyObservers("data");
	}

	/**
	 * for testing
	 * 
	 * @param args
	 */
}
