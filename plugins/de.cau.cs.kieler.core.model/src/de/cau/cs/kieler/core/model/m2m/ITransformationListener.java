package de.cau.cs.kieler.core.model.m2m;

public interface ITransformationListener {

    
    void transformationExecuted(String transformationName, Object[] parameters, Object result);
    
}
