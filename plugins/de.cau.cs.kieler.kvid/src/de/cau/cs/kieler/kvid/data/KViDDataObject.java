package de.cau.cs.kieler.kvid.data;

public class KViDDataObject {
    
    private String URI;
    
    private String data;
    
    private KViDDataType type;
    
    public KViDDataObject(final String theURI, final String thedata,
            final KViDDataType thetype) {
        this.URI = theURI;
        this.data = thedata;
        this.type = thetype;
    }
    
    public Object getData() {
        switch (type) {
        case INT:
            return Integer.parseInt(data);
        case FLOAT:
            return Float.parseFloat(data);
        case STRING:
            return data;
        default:
            throw new RuntimeException("Data Type not supported: " + type.name());
        }
    }

}
