/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.transformations.sequentializer;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empty Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.EmptyExpression#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.EmptyExpression#getThreadExitObject <em>Thread Exit Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.EmptyExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getEmptyExpression()
 * @model
 * @generated
 */
public class AssignmentExpression {
    
    private ValuedObject valuedObject;
    private Expression expression;
    
    public AssignmentExpression() {
        this.valuedObject = null;
    }
    
    public ValuedObject getValuedObject() {
        return this.valuedObject;
    }
    
    public void setValuedObject(ValuedObject value) {
        this.valuedObject = value;
    }
    
    public Expression getExpression() {
        return this.expression;
    }
    
    public void setExpression(Expression value) {
        this.expression = value;
    }

} 
