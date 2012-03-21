package de.cau.cs.kieler.core.model.m2m;

import java.util.LinkedList;
import java.util.List;

public class TransformationObserver {

    private List<ITransformationListener> listeners = new LinkedList<ITransformationListener>();
    
    private static TransformationObserver INSTANCE = new TransformationObserver();
    
    private TransformationObserver() {
        
    }
     
    public static TransformationObserver getInstance() {
        return INSTANCE;
    }
    
    public void register(ITransformationListener listener) {
        if (!listeners.contains(listener)) {
            listeners.add(listener);
        }
    }
    
    public void deregister(ITransformationListener listener) {
        if (listeners.contains(listener)) {
            listeners.remove(listener);
        }
    }
    
    public void notifyListeners(ITransformationContext context, TransformationDescriptor descriptor) {
        for (ITransformationListener listener: listeners) {
            listener.transformationExecuted(descriptor.getTransformationName(), descriptor.getParameters(), descriptor.getResult());
        }
    }
    
}
