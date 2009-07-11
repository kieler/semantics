package de.cau.cs.kieler.kev.extension.scade;

import java.util.StringTokenizer;
import java.util.Vector;

import de.cau.cs.kieler.kev.extension.AnimationData;


/** AnimationData that can be build from a String representation holding
 * the data.
 * @author haf
 *
 */
public class StringAnimationData extends AnimationData {

	static final String delim = "{}[](),; ";
	
	public StringAnimationData(String stringRepresentation) {
		super();
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
			this.getData().add(dataObject);
		}
	}

	@Override
	public String toString() {
		StringBuffer stringRepresentation = new StringBuffer("(");

		for (int i = 0; i < this.getData().size(); i++) {
			//System.out.println(data.get(i));
			if (this.getData().get(i) != null){
				stringRepresentation.append(this.getData().get(i).toString());
				if (i < (this.getData().size() - 1)) // not for last item
					stringRepresentation.append(","); // set komma between items
			}
		}
		stringRepresentation.append(")");
		return stringRepresentation.toString();
	}
	
	
	
	
}
