/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kvis.ui.animations

import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.StringValue
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kvis.kvis.AndExpression
import de.cau.cs.kieler.kvis.kvis.Animation
import de.cau.cs.kieler.kvis.kvis.AttributeMapping
import de.cau.cs.kieler.kvis.kvis.Comparison
import de.cau.cs.kieler.kvis.kvis.Condition
import de.cau.cs.kieler.kvis.kvis.Domain
import de.cau.cs.kieler.kvis.kvis.Mapping
import de.cau.cs.kieler.kvis.kvis.VariableReference
import de.cau.cs.kieler.kvis.ui.views.KVisView
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.NDimensionalArray
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.svg.SVGDocument

/**
 * @author aas
 *
 */
abstract class AnimationHandler {
    protected var String svgElementId
    protected var Animation animation
    protected var Object variableValue
    
    abstract public def String getName()
    abstract protected def void doApply(DataPool pool)
    
    public new(String svgElementId, Animation animation) {
        this.svgElementId = svgElementId
        this.animation = animation
    }
    
    public def void apply(DataPool pool) {
        variableValue = getVariableValue(pool)
        if(isActive(pool)) {
            doApply(pool)
        }
    }
    
    private def SVGDocument getSVGDocument() {
         return KVisView.instance?.canvas?.svgCanvas?.getSVGDocument();
    }
    
    protected def Element getElementById(String id) {
        return SVGDocument.getElementById(id);
    }
    
    protected def Element findElement() {
        return getElementById(svgElementId)
    }
    
    protected def AttributeMapping getAttribute(Animation animation, String name) {
        return animation.attributeMappings.findFirst[it.attribute.equals(name)]
    }
    
    protected def Object getVariableValue(VariableReference ref, DataPool pool) {
        val modelName = ref?.model?.name
        val variableName = ref?.name
        if(variableName != null) {
            val variable = pool.getVariable(modelName, variableName);
            if(variable.value instanceof NDimensionalArray) {
                val array = variable.value as NDimensionalArray
                return array.get(ref.indices)
            } else {
                return variable.value
            }
        }
        return null
    }
    
    protected def Object getVariableValue(DataPool pool) {
        return getVariableValue(animation.variable, pool)
    }
    
    protected def String removeQuotes(String txt) {
        if(txt == null) {
            return null    
        }
        return txt.replaceAll("\"", "")
    }
    
    protected def void setAttributeField(Element elem, String attributeName, String fieldName, String fieldValue) {
        val oldAttribute = elem.getAttribute(attributeName)
        val newAttribute = changeField(oldAttribute, fieldName, fieldValue)
        elem.setAttribute(attributeName, newAttribute)
    }
    
    protected def void setAttributeFunction(Element elem, String attributeName, String functionName, String... arguments) {
        val oldAttribute = elem.getAttribute(attributeName)
        val newAttribute = changeFunction(oldAttribute, functionName, arguments)
        elem.setAttribute(attributeName, newAttribute)
    }
    
    protected def void setText(Element elem, String text) {
        val textNode = elem.findNodeOfType(Node.TEXT_NODE)
        if (textNode != null) {
            textNode.nodeValue = text
        } else {
            throw new Exception("Can't set text on element "+svgElementId+ ".\n"
                              + "It is not a text node itself and has no text node as child.")
        }
    }
    
    protected def Node findNodeOfType(Node node, int nodeType) {
        if(node.nodeType == nodeType) {
            return node
        } else {
            val children = node.getChildNodes()
            if (children != null) {
                for(var i = 0; i < children.length; i++) {
                    val child = children.item(i)
                    val textNode = child.findNodeOfType(nodeType)
                    if(textNode != null) {
                        return textNode
                    }                    
                }    
            }
        }
        return null
    }
    
    protected def String changeField(String attribute, String fieldName, String fieldValue) {
        val newField = (fieldName + ":" + fieldValue + ";")
        // Replace the current field from the attribute. That is, replace everything from 'FIELD_NAME:' to ';'
//        println("old:"+attribute)
        var newAttribute = attribute.replaceAll(fieldName+":[^;]*[;]?", "");
        if(!newAttribute.isNullOrEmpty && !newAttribute.endsWith(";")) {
            newAttribute += ";"    
        }
        newAttribute += newField
//        println("new:"+newAttribute)
        return newAttribute
    }
    
    protected def String changeFunction(String attribute, String functionName, String... arguments) {
        val newFunction = (functionName + "(" + arguments.join(",") + ")")
        // Replace the current function from the attribute. That is, replace everything from 'FUNCTION_NAME(' to ')'
//        println("old:"+attribute)
        var newAttribute = attribute.replaceAll(functionName+"\\([^\\)]*\\)", "");
        newAttribute += newFunction
//        println("new:"+newAttribute)
        return newAttribute
    }
    
    protected def Object getMappedValue(AttributeMapping attributeMapping, Object value) {
        if(attributeMapping == null) {
            return null
        }
        
        val literal = attributeMapping.literal
        if(literal != null) {
            return literal.primitiveValue
        } else {
            for(mapping : attributeMapping.mappings) {
                if(mapping.variableDomain.matches(value)) {
                    return mapping.apply(value)
                } else {
                    if(mapping.variableDomain.range != null) {
                        System.err.println(value + " does not match with "
                            + mapping.variableDomain.range.from.primitiveValue 
                            + "-"
                            + mapping.variableDomain.range.to.primitiveValue)
                    } else {
                        System.err.println(value + " does not match with "+ mapping.variableDomain.value.primitiveValue)
                    } 
                }
            }
            return null
        }
    }
    
    protected def Object getPrimitiveValue(Value value) {
        if(value instanceof StringValue) {
            return value.value
        } else if(value instanceof FloatValue) {
            return value.value
        } else if(value instanceof IntValue) {
            return value.value
        } else if(value instanceof BoolValue) {
            return value.value
        }
        return null
    }
    
    protected def boolean matches(Domain domain, Object value) {
        if(domain.value != null) {
            val domValue = domain.value.primitiveValue
            return domValue.equalsValue(value)
        } else if(domain.range != null) {
            try {
                val doubleValue = value.doubleValue
                val low = domain.range.from.primitiveValue.doubleValue
                val high = domain.range.to.primitiveValue.doubleValue
                return (low <= doubleValue) && (doubleValue <= high)
            } catch(IllegalArgumentException e) {
                // Just go to 'return false' at the end of the method.
            }
        }
        return false
    }
    
    protected def Object apply(Mapping mapping, Object value) {
        if(mapping.attributeDomain.value != null) {
            return mapping.attributeDomain.value.primitiveValue
        } else if(mapping.attributeDomain.range != null && mapping.variableDomain.range != null) {
            val doubleValue = value.doubleValue
            val fromLow = mapping.variableDomain.range.from.primitiveValue.doubleValue
            val fromHigh = mapping.variableDomain.range.to.primitiveValue.doubleValue
            val toLow = mapping.attributeDomain.range.from.primitiveValue.doubleValue
            val toHigh = mapping.attributeDomain.range.to.primitiveValue.doubleValue
            // Vector calculation v = pos + percent*length
            val mappedValue = scale(doubleValue, fromLow, fromHigh, toLow, toHigh)
            return mappedValue
        }
        return null
    }
    
    protected def double scale(double value, double fromLow, double fromHigh, double toLow, double toHigh) {
        val double percent = Math.abs(value - fromLow) / Math.abs(fromHigh - fromLow)
        val mappedValue = (toLow + percent * Math.abs(toHigh-toLow))
        return mappedValue
    }
    
    protected def double getDoubleValue(Object value) {
        var double doubleValue
        if(value instanceof Double){
            doubleValue = value as Double
        } else if(value instanceof Float) {
            doubleValue = value as Float
        } else if(value instanceof Integer) {
            doubleValue = value as Integer
        } else if(value instanceof String) {
            doubleValue = Double.valueOf((value as String).removeQuotes)
        } else {
            throw new IllegalArgumentException("Can't convert "+value.toString+" to Double")
        }
        return doubleValue
    }
    
    protected def boolean equalsValue(Object v1, Object v2) {
        if(v1 == null && v2 == null) {
            return true
        }
        if(v1 != null && v2 != null) {
            if(v1 instanceof String || v1 instanceof Boolean) {
                return v1.equals(v2)
            }
            if(v1 instanceof Number && v2 instanceof Number) {
                return v1.doubleValue.equals(v2.doubleValue)
            }
        }
        return false
    }
    
    protected def boolean isActive(DataPool pool) {
        if(animation.condition == null) {
            return true
        } else {
            return animation.condition.eval(pool)
        }
    }
    
    protected def boolean eval(Condition cond, DataPool pool) {
        if(cond instanceof AndExpression) {
            return (cond as AndExpression).eval(pool)
        } else if(cond instanceof Comparison) {
            return (cond as Comparison).eval(pool)
        }
        return true
    }
    
    protected def boolean eval(Comparison cond, DataPool pool) {
        if(cond != null) {
            val leftValue = cond.left.getVariableValue(pool)
            val right = cond.right
            var Object rightValue
            
            if(right instanceof Value) {
                rightValue = right.primitiveValue
            } else if(right instanceof VariableReference) {
                rightValue = right.getVariableValue(pool)
            }
            if( leftValue != null && rightValue != null) {
                try {
                    switch(cond.relation) {
                        case OperatorType.EQ : return leftValue.equalsValue(rightValue)
                        case OperatorType.NE : return !leftValue.equalsValue(rightValue)
                        case OperatorType.GT : return leftValue.doubleValue > rightValue.doubleValue
                        case OperatorType.LT : return leftValue.doubleValue < rightValue.doubleValue
                        case OperatorType.GEQ : return leftValue.doubleValue >= rightValue.doubleValue
                        case OperatorType.LEQ : return leftValue.doubleValue <= rightValue.doubleValue
                        default: {
                            return false
                        }
                    }
                } catch(IllegalArgumentException e) {
                    return false
                }        
            }
            cond.left
        }
        return true
    }
    
    protected def boolean eval(AndExpression cond, DataPool pool) {
        // Because we have all comparision combined by and,
        // we can immediately return false, if any of them evaluates to false.
        if(!cond.left.eval(pool)) {
            return false
        } else if(!cond.right.eval(pool)) {
            return false
        }
        return true
    }
}