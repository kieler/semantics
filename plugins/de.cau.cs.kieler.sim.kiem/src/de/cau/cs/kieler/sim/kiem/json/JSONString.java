package de.cau.cs.kieler.sim.kiem.json;
/**
 * The <code>JSONString</code> interface allows a <code>toJSONString()</code> 
 * method so that a class can change the behavior of 
 * <code>JSONObject.toString()</code>, <code>JSONArray.toString()</code>,
 * and <code>JSONWriter.value(</code>Object<code>)</code>. The 
 * <code>toJSONString</code> method will be used instead of the default behavior 
 * of using the Object's <code>toString()</code> method and quoting the result.
 * @generated
 */
public interface JSONString {
	/**
	 * <B>DEPRECATED: Use org.json java plug-in instead!</B><BR>
	 * The <code>toJSONString</code> method allows a class to produce its own JSON 
	 * serialization. 
	 * 
	 * @return A strictly syntactically correct JSON text.
	 */
        @Deprecated
	public String toJSONString();
}
