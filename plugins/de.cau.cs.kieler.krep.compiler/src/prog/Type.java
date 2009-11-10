package prog;

/**
 * @author ctr
 * Basic Lustre types
 */
public enum Type {
    /**
     * integer values (32 Bit)
     */
    INT,
    /**
     * boolean values
     */
    BOOL, 
    /**
     * double values (32 Bit)
     */
    REAL;
    
    @Override
    public String toString(){
	switch(this){
	case INT: return "int";
	case BOOL: return "bool";
	case REAL: return "real";
	}
	return "";
    }
}
