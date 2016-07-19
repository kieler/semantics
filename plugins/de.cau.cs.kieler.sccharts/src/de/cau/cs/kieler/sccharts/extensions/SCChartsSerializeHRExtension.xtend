/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.extensions

import com.google.common.base.Joiner
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.IterateAction
import de.cau.cs.kieler.sccharts.SuspendAction
import de.cau.cs.kieler.sccharts.Transition
import java.util.List
import de.cau.cs.kieler.core.kexpressions.VariableDeclaration
import de.cau.cs.kieler.core.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.core.kexpressions.Identifiable
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared

/**
 * @author ssm
 *
 * @kieler.design 2014-09-04 proposed ssm
 * @kieler.rating 2014-09-04 proposed yellow
 */
@ViewSynthesisShared
class SCChartsSerializeHRExtension extends KEffectsSerializeHRExtensions {
    
    def dispatch CharSequence serialize(Transition transition) {
        transition.serialize(false);
    }
    
    def dispatch CharSequence serializeHR(Transition transition) {
        transition.serialize(true);
    }
    
    private def CharSequence serialize(Transition transition, boolean hr) {
        val label = new StringBuilder();

        if (transition.trigger != null) {
            if (transition.delay > 1) {
                label.append(transition.delay.toString).append(" ");
            }
            if (hr) {
                label.append(transition.trigger.serializeHR);
            }else{
                label.append(transition.trigger.serialize); 
            }
        }

        if (!transition.effects.empty) {
            label.append(" / ")
            if (hr) {
                label.append(transition.effects.serializeHR);
            } else {
                label.append(transition.effects.serialize);
            }
        }

        return label.toString;
    }

    def dispatch CharSequence serialize(Action action){
        action.serialize(false)
    }
    
    def dispatch CharSequence serializeHR(Action action){
        action.serialize(true)
    }
    
    private def CharSequence serialize(Action action, boolean hr) {
        val joiner = Joiner.on(" ");
        val parts = action.serializeComponents(hr)
        return joiner.join(parts.key) + joiner.join(parts.value);
    }

    def Pair<List<String>, List<String>> serializeComponents(Action action, boolean hr) {
        val keywords = newLinkedList;
        val content = newLinkedList;

        if (action.immediate) {
            keywords += "immediate";
        }

        keywords += switch action {
            EntryAction: "entry"
            DuringAction: "during"
            ExitAction: "exit"
            SuspendAction case action.isWeak: "weak suspend"
            SuspendAction: "suspend"
            IterateAction: "iterate"
            default: ""
        }

        if (action.trigger != null) {
            if (hr) {
                content += action.trigger.serializeHR as String
            }else{
                content += action.trigger.serialize as String
            }
        }

        if (!action.effects.empty) {
            content += "/"
            if (hr) {
                content += action.effects.serializeHR as String
            }else{
                content += action.effects.serialize as String
            }
        }

        return new Pair(keywords, content);
    }
    
    def dispatch CharSequence serialize(VariableDeclaration declaration) {
        declaration.serialize(false)
    }
       
    def dispatch CharSequence serializeHR(VariableDeclaration declaration) {
        declaration.serialize(true)
    }
    
    private def CharSequence serialize(VariableDeclaration declaration, boolean hr) {
        val joiner = Joiner.on(" ");
        val parts = declaration.serializeComponents(hr)
        return joiner.join(parts.key) + joiner.join(parts.value);
    }
    
    def Pair<List<String>, List<String>> serializeComponents(VariableDeclaration declaration, boolean hr) {
        val keywords = newLinkedList;
        val content = newLinkedList;

        //Modifiers
        if (declaration.isExtern) {
            keywords += "extern";
        }
        if (declaration.isStatic) {
            keywords += "static ";
        }
        if (declaration.isConst) {
            keywords += "const";
        }
        if (declaration.isVolatile) {
            keywords += "volatile";
        }
        if (declaration.isInput) {
            keywords += "input";
        }
        if (declaration.isOutput) {
            keywords += "output"
        }
        if (declaration.isSignal) {
            keywords += "signal";
        }

        //Type
        val type = declaration.type;
        if (type == ValueType.PURE) {
            // Nothing - indicated by signal keyword
        } else if (type == ValueType.HOST) {
            keywords += declaration.hostType
        } else {
            if (hr) {
                keywords += type.serializeHR as String
            }else{
                keywords += type.serialize as String
            }
        } 

        //Content
        val voIter = declaration.valuedObjects.iterator;
        while (voIter.hasNext) {
            val vo = voIter.next;
            val text = new StringBuilder();
            if (hr) {
                text.append(vo.serializeHR)
            }else{
                text.append(vo.serialize)
            }
            if (vo.initialValue != null) {
                text.append(" = ");
                if (hr) {
                    text.append(vo.initialValue.serializeHR);
                }else{
                    text.append(vo.initialValue.serialize);
                }
            }
            if (voIter.hasNext) {
                text.append(",");
            }
            content += text.toString;
        }

        return new Pair(keywords, content);
    }
    
    
    def dispatch CharSequence serialize(ReferenceDeclaration declaration) {
        declaration.serialize(false)
    }
       
    def dispatch CharSequence serializeHR(ReferenceDeclaration declaration) {
        declaration.serialize(true)
    }
    
    private def CharSequence serialize(ReferenceDeclaration declaration, boolean hr) {
        val joiner = Joiner.on(" ");
        val parts = declaration.serializeComponents(hr)
        return joiner.join(parts.key) + joiner.join(parts.value);
    }
    
    def Pair<List<String>, List<String>> serializeComponents(ReferenceDeclaration declaration, boolean hr) {
        val keywords = newLinkedList;
        val content = newLinkedList;
        
        keywords += "["
        if (declaration.reference instanceof Identifiable) {
            keywords += (declaration.reference as Identifiable).id
        } else {
            keywords += declaration.reference.class.name
        }
        keywords += "]"

        //Content
        val voIter = declaration.valuedObjects.iterator;
        while (voIter.hasNext) {
            val vo = voIter.next;
            val text = new StringBuilder();
            if (hr) {
                text.append(vo.serializeHR)
            }else{
                text.append(vo.serialize)
            }
            if (vo.initialValue != null) {
                text.append(" = ");
                if (hr) {
                    text.append(vo.initialValue.serializeHR);
                }else{
                    text.append(vo.initialValue.serialize);
                }
            }
            if (voIter.hasNext) {
                text.append(",");
            }
            content += text.toString;
        }

        return new Pair(keywords, content);
    }    
    
    
    
    private val nameSymbolTable = <String, String> newHashMap
    
    def defineSymbol(String startsWith, String symbol) {
        nameSymbolTable.put(startsWith, symbol) 
    }   
    
    def void clearSymbols() {
        nameSymbolTable.clear
    }
    
    def String applySymbolTable(String name) {
        for(s : nameSymbolTable.keySet) {
            if (name.startsWith(s))  {
                return nameSymbolTable.get(s) + name.substring(s.length)
            }
        }
        return name
    } 
    
    override dispatch CharSequence serialize(ValuedObject valuedObject) {
        var vo = valuedObject.name.applySymbolTable
        
        for (index : valuedObject.cardinalities) {
            vo = vo + "[" + index.toString + "]"
        }
        vo
    }

    override dispatch CharSequence serialize(ValuedObjectReference valuedObjectReference) {
        var vo = valuedObjectReference.valuedObject.name.applySymbolTable
        for (index : valuedObjectReference.indices) {
            vo = vo + "[" + index.serialize + "]"
        }
        vo
    }    
    
    override dispatch CharSequence serializeHR(ValuedObjectReference valuedObjectReference) {
        var vo = valuedObjectReference.valuedObject.name.applySymbolTable
        for (index : valuedObjectReference.indices) {
            vo = vo + "[" + index.serializeHR + "]"
        }
        vo
    }    
    
    def void defineGreekSymbols() {
        "Heta".defineSymbol("\u0370")       // Ͱ
        "heta".defineSymbol("\u0371")       // ͱ       
        "Yot".defineSymbol("\u037F")        // Ϳ
        
        "Alpha".defineSymbol("\u0391")      // Α
        "Beta".defineSymbol("\u0392")       // Β
        "Gamma".defineSymbol("\u0393")      // Γ
        "Delta".defineSymbol("\u0394")      // Δ
        "Epsilon".defineSymbol("\u0395")    // Ε
        "Zeta".defineSymbol("\u0396")       // Ζ
        "Eta".defineSymbol("\u0397")        // Η
        "Theta".defineSymbol("\u0398")      // Θ
        "Iota".defineSymbol("\u0399")       // Ι
        "Kappa".defineSymbol("\u039A")      // Κ
        "Lambda".defineSymbol("\u039B")     // Λ
        "Mu".defineSymbol("\u039C")         // Μ
        "Nu".defineSymbol("\u039D")         // Ν
        "Xi".defineSymbol("\u039E")         // Ξ
        "Omicron".defineSymbol("\u039F")    // Ο
        "Pi".defineSymbol("\u03A0")         // Π
        "Rho".defineSymbol("\u03A1")        // Ρ
        "Sigma".defineSymbol("\u03A3")      // Σ
        "Tau".defineSymbol("\u03A4")        // Τ
        "Upsilon".defineSymbol("\u03A5")    // Υ
        "Phi".defineSymbol("\u03A6")        // Φ
        "Chi".defineSymbol("\u03A7")        // Χ
        "Psi".defineSymbol("\u03A8")        // Ψ
        "Omega".defineSymbol("\u03A9")      // Ω
        
        "alpha".defineSymbol("\u03B1")      // α
        "beta".defineSymbol("\u03B2")       // β
        "gamma".defineSymbol("\u03B3")      // γ
        "delta".defineSymbol("\u03B4")      // δ
        "epsilon".defineSymbol("\u03B5")    // ε
        "zeta".defineSymbol("\u03B6")       // ζ
        "eta".defineSymbol("\u03B7")        // η
        "theta".defineSymbol("\u03B8")      // θ
        "iota".defineSymbol("\u03B9")       // ι
        
        "kappa".defineSymbol("\u03BA")      // κ
        "lambda".defineSymbol("\u03BB")     // λ
        "mu".defineSymbol("\u03BC")         // μ
        "nu".defineSymbol("\u03BD")         // ν
        "xi".defineSymbol("\u03BE")         // ξ
        "omicron".defineSymbol("\u03BF")    // ο
        "pi".defineSymbol("\u03C0")         // π
        "rho".defineSymbol("\u03C1")        // ρ
        "sigma".defineSymbol("\u03C3")      // σ
        
        "tau".defineSymbol("\u03C4")        // τ
        "upsilon".defineSymbol("\u03C5")    // υ
        "phi".defineSymbol("\u03C6")        // φ
        "chi".defineSymbol("\u03C7")        // χ
        "psi".defineSymbol("\u03C8")        // ψ
        "omega".defineSymbol("\u03C9")      // ω    
        
        "Stigma".defineSymbol("\u03DA")     // Ϛ
        "stigma".defineSymbol("\u03DB")     // ϛ
        "Digamma".defineSymbol("\u03DC")    // Ϝ
        "digamma".defineSymbol("\u03DD")    // ϝ
        "Koppa".defineSymbol("\u03DE")      // Ϟ
        "koppa".defineSymbol("\u03DF")      // ϟ
        "Sampi".defineSymbol("\u03E0")      // Ϡ
        "sampi".defineSymbol("\u03E1")      // ϡ
        
        "Sho".defineSymbol("\u03F7")        // Ϸ
        "sho".defineSymbol("\u03F8")        // ϸ
        "San".defineSymbol("\u03FA")        // Ϻ
        "san".defineSymbol("\u03FB")        // ϻ
    }
}