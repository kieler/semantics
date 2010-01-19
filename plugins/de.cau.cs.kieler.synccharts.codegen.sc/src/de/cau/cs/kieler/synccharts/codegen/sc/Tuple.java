package de.cau.cs.kieler.synccharts.codegen.sc;

public class Tuple<T, V> {
    private T object1;
    private V object2;

    /**
     * Constructor for the type "Tupel" with two objects as argument.
     * 
     * @param o1 first object of the tuple
     * @param o2 second object of the tuple
     */
    public Tuple(final T o1, final V o2) {
        object1 = o1;
        object2 = o2;
    }
    
    /**
     * Constructor of the type "Tupel" without arguments. This sets both objects of the
     * tuple to null.
     */
    public Tuple() {
        object1 = null;
        object2 = null;
    }

    /**
     * Getter for the first object of the tuple.
     * 
     * @return first object of the tuple
     */
    public T getO1() {
        return object1;
    }

    /**
     * Getter for the second object of the tuple.
     * 
     * @return second object of the tuple
     */
    public V getO2() {
        return object2;
    }
    
    /**
     * Setter for the first object of the tuple.
     * 
     * @param object to set the first object of the tuple
     */
    public void setO1(final T object) {
        object1 = object;
    }
    
    /**
     * Setter for the second object of the tuple.
     * 
     * @param object to set the second object of the tuple
     */
    public void setO2(final V object) {
        object2 = object;
    }
    
    @ Override
    public boolean equals(final Object other) {
        if (other instanceof Tuple<?, ?>) {
            Tuple<T, V> tupel = (Tuple<T, V>) other;
            boolean boolObject1 = tupel.object1.equals(object1);
            boolean boolObject2 = tupel.object2.equals(object2);
            return (boolObject1 && boolObject2);
        } else {
            return false;
        }
    }
}
