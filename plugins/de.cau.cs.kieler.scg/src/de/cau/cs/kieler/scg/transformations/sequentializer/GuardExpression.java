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

import java.util.ArrayList;
import java.util.List;

import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.ValuedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.GuardExpression#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.GuardExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.GuardExpression#getEmptyExpressions <em>Empty Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getGuardExpression()
 * @model
 * @generated
 */
public class GuardExpression {
    
    private ValuedObject valuedObject;
    private Expression expression;
    private List<EmptyExpression> emptyExpressions;
    private List<AssignmentExpression> additionalExpressions;
    
    public GuardExpression() {
        valuedObject = null;
        expression = null;
        emptyExpressions = new ArrayList<EmptyExpression>();
        additionalExpressions = new ArrayList<AssignmentExpression>();
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

    public List<EmptyExpression> getEmptyExpressions() {
        return this.emptyExpressions;
    }
    
    public void addEmptyExpression(EmptyExpression emptyExpression) {
        this.emptyExpressions.add(emptyExpression);
    }
    
    public List<AssignmentExpression> getAdditionalExpressions() {
        return this.additionalExpressions;
    }
    
    public void addAdditionalExpression(AssignmentExpression assignmentExpression) {
        this.additionalExpressions.add(assignmentExpression);
    }

} // GuardExpression
