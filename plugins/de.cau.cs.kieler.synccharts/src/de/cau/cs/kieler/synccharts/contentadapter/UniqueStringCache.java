package de.cau.cs.kieler.synccharts.contentadapter;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

 public class UniqueStringCache{
        List<String> cachedValues = new ArrayList<String>();
        EObject parent;
        EAttribute attribute;
        
        public UniqueStringCache(EObject theParent, EAttribute theAttribute) {
            parent = theParent;
            attribute = theAttribute;
        }
        
        public boolean contains(String string){
           for (String cachedString : cachedValues) {
               if(cachedString.equals(string)){
                   return true;
               }
           }
           return false;
        }
        
        public void add(String string){
            cachedValues.add(string);
        }
        
        public List<String> getList(){
            return cachedValues;
        }

        public EObject getParent() {
            return parent;
        }

        public EAttribute getAttribute() {
            return attribute;
        }
        
        
    }