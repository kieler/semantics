package de.cau.cs.kieler.krep.compiler.helper;

import java.util.HashMap;

/**
 * @author ctr
 * compute unique temporary names
 */
public class TempName {
  static HashMap<String, Integer> names = new HashMap<String, Integer>(); 
  
  
  /**
   * 
   * @param prefix of the unique name
   * @return a unique name of the form prefix_N
   */
  static public String get(String prefix){
      Integer i = names.get(prefix);
      if(i==null){
	  names.put(prefix, 1);
	  return prefix + "_0";
      }
      names.put(prefix, i+1);
      return prefix + "_" + i;
  }
    
    
}
