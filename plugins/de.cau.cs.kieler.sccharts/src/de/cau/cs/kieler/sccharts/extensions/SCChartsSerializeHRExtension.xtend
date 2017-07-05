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
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.SuspendAction
import de.cau.cs.kieler.sccharts.Transition
import java.util.List
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.Identifiable
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import com.google.common.base.Function
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.CombineOperator
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.SucceedingAction
import de.cau.cs.kieler.sccharts.PrecedingAction

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
            if (transition.triggerDelay > 1) {
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
    
//    private def CharSequence serialize(Action action, boolean hr) {
//        val joiner = Joiner.on(" ");
//        val parts = action.serializeComponents(hr)
//        return joiner.join(parts.key) + joiner.join(parts.value);
//    }

    private def CharSequence serialize(Action action, boolean hr) {
        val joiner = Joiner.on(" ");
        val parts = action.serializeHighlighted(hr)
        return joiner.join(parts.map[key])
    }

    def List<Pair<CharSequence, Boolean>> serializeHighlighted(Action action, boolean hr) {
        val components = newArrayList

        if (action.delay == DelayType.IMMEDIATE) {
            components.addKeyword("immediate");
        }

        components.addKeyword(switch action {
            EntryAction: "entry"
            DuringAction: "during"
            ExitAction: "exit"
            SuspendAction case action.isWeak: "weak suspend"
            SuspendAction: "suspend"
            PrecedingAction: "preceding"
            SucceedingAction: "succeeding"
            default: ""
        })

        if (action.trigger != null) {
            components.addText(if (hr) {
                action.trigger.serializeHR
            } else {
                action.trigger.serialize
            })
        }

        if (!action.effects.empty) {
            components.addText("/")
            components.addText(if (hr) {
                action.effects.serializeHR
            } else {
                action.effects.serialize
            })
        }

        return components;
    }
    
    private def CharSequence serialize(Declaration declaration, boolean hr) {
        val joiner = Joiner.on(" ");
        val parts = declaration.serializeHighlighted(hr)
        return joiner.join(parts.map[key])
    }

    def List<Pair<CharSequence, Boolean>> serializeHighlighted(Declaration declaration, boolean hr) {
        val components = newArrayList

        // Modifiers
        if (declaration instanceof VariableDeclaration) {
            if (declaration.isExtern) {
                components.addKeyword("extern")
            }
            if (declaration.isStatic) {
                components.addKeyword("static ")
            }
            if (declaration.isConst) {
                components.addKeyword("const")
            }
            if (declaration.isVolatile) {
                components.addKeyword("volatile")
            }
            if (declaration.isInput) {
                components.addKeyword("input")
            }
            if (declaration.isOutput) {
                components.addKeyword("output")
            }
            if (declaration.isSignal) {
                components.addKeyword("signal")
            }

            // Type
            val type = declaration.type;
            if (type == ValueType.PURE) {
                // Nothing - indicated by signal keyword
            } else if (type == ValueType.HOST) {
                components.addKeyword(declaration.hostType)
            } else {
                components.addKeyword(if (hr) {
                    type.serializeHR
                } else {
                    type.serialize
                })
            }
        }

        // Content
        val voIter = declaration.valuedObjects.iterator;
        while (voIter.hasNext) {
            val vo = voIter.next;
            components.addText(if (hr) {
                vo.serializeHR
            } else {
                vo.serialize
            })
            if (vo.initialValue != null) {
                components.addText("=");
                components.addText(if (hr) {
                    vo.initialValue.serializeHR;
                } else {
                    vo.initialValue.serialize;
                })
            }
            if (vo.combineOperator != null && vo.combineOperator != CombineOperator.NONE) {
                components.addKeyword("combine");
                components.addText(if (hr) {
                    vo.combineOperator.serializeHR;
                } else {
                    vo.combineOperator.serialize;
                })
            }
            if (voIter.hasNext) {
                components.addText(",");
            }
        }

        return components;
    }
    
    private def addKeyword(List<Pair<CharSequence, Boolean>> list, CharSequence text) {
        list += new Pair(text, true)
    }
    
    private def addText(List<Pair<CharSequence, Boolean>> list, CharSequence text) {
        list += new Pair(text, false)
    }    

//    def dispatch Pair<List<String>, List<String>> serializeComponents(Action action, boolean hr) {
//        val keywords = newLinkedList;
//        val content = newLinkedList;
//
//        if (action.immediate) {
//            keywords += "immediate";
//        }
//
//        keywords += switch action {
//            EntryAction: "entry"
//            DuringAction: "during"
//            ExitAction: "exit"
//            SuspendAction case action.isWeak: "weak suspend"
//            SuspendAction: "suspend"
//            IterateAction: "iterate"
//            default: ""
//        }
//
//        if (action.trigger != null) {
//            if (hr) {
//                content += action.trigger.serializeHR as String
//            }else{
//                content += action.trigger.serialize as String
//            }
//        }
//
//        if (!action.effects.empty) {
//            content += "/"
//            if (hr) {
//                content += action.effects.serializeHR as String
//            }else{
//                content += action.effects.serialize as String
//            }
//        }
//
//        return new Pair(keywords, content);
//    }
    
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
    
    def dispatch Pair<List<String>, List<String>> serializeComponents(VariableDeclaration declaration, boolean hr) {
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
    
    def dispatch Pair<List<String>, List<String>> serializeComponents(ReferenceDeclaration declaration, boolean hr) {
        val keywords = newLinkedList;
        val content = newLinkedList;
        
        keywords += "ref"
        if (declaration.reference instanceof Identifiable) {
            keywords += (declaration.reference as Identifiable).id
        } else {
            keywords += declaration.reference.class.name
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
    
    def dispatch Pair<List<String>, List<String>> serializeComponents(Void void, boolean hr) {
        // error handling
    }
    
    
    def dispatch serialize(State state) {
        state.label
    }
    
    def dispatch serializeHR(State state) {
        state.label.applySymbolTable
    }

    def dispatch serialize(Region region) {
        region.label
    }
    
    def dispatch serializeHR(Region region) {
        region.label.applySymbolTable
    }
    
    
    
    private val nameSymbolTable = <String, String> newHashMap
    private val nameSymbolSuffixProcessor = <String, Function<String, String>> newHashMap
    
    def defineSymbol(String startsWith, String symbol) {
        nameSymbolTable.put(startsWith, symbol) 
    }   
    
    def void clearSymbols() {
        nameSymbolTable.clear
        nameSymbolSuffixProcessor.clear
    }
    
    def String applySymbolTable(String name) {
        for(s : nameSymbolTable.keySet) {
            if (name.startsWith(s))  {
                return nameSymbolTable.get(s) + name.substring(s.length)
            }
        }
        for(suffix : nameSymbolSuffixProcessor.keySet) {
            if (name.contains(suffix)) {
                val sepPos = name.indexOf(suffix)
                val prefix = name.substring(0, sepPos)
                val toProcess = name.substring(sepPos + 1)
                val subS = nameSymbolSuffixProcessor.get(suffix).apply(toProcess)
                return prefix + subS
            }            
        }
        return name
    } 
    
    // TODO: VO from declarations... refactor
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
    
    override def CharSequence serializeAssignment(Assignment assignment, CharSequence expressionStr) {
        var res = assignment.valuedObject.name.applySymbolTable
        if (!assignment.indices.nullOrEmpty) {
            for(index : assignment.indices) {
                res = res + "[" + index.serialize + "]"
            }
        }
        
        res = res + assignment.operator.serializeAssignOperator
        if (expressionStr != null) {
            res = res + expressionStr
        }
        
        return res
    }    
    
    override dispatch CharSequence serialize(Emission emission) {
        val objectContainer = emission.valuedObject.eContainer
        if (objectContainer instanceof VariableDeclaration) {
            if (objectContainer.type != ValueType::PURE) {
                return (emission.valuedObject.name + "(" + emission.newValue.serialize + ")")             
            } else {
                return emission.valuedObject.name.applySymbolTable
            }
        } else {
            return emission.valuedObject.name.applySymbolTable
        }
    }    
     
    def void defineSubscriptSymbols(String separator) {
        nameSymbolSuffixProcessor.put(separator, 
            [ s | 
                var result = ""
                for(c : s.toCharArray) {
                    result = result + c.toString.subscript
                }
                result
            ]
        )
    }
    
    private def String subscript(String c) {
        switch c {
            case '0': return '₀' // u2080
            case '1': return '₁' // u2081
            case '2': return '₂' // u2082
            case '3': return '₃' // u2083
            case '4': return '₄' // u2084
            case '5': return '₅' // u2085
            case '6': return '₆' // u2086
            case '7': return '₇' // u2087
            case '8': return '₈' // u2088
            case '9': return '₉' // u2089
            case 'a': return 'ₐ'
            case 'e': return 'ₑ'
            case 'h': return 'ₕ'
            case 'i': return 'ᵢ'
            case 'j': return 'ⱼ'
            case 'k': return 'ₖ'
            case 'l': return 'ₗ'
            case 'm': return 'ₘ'
            case 'n': return 'ₙ'
            case 'o': return 'ₒ'
            case 'p': return 'ₚ'
            case 'r': return 'ᵣ'
            case 's': return 'ₛ'
            case 't': return 'ₜ'
            case 'u': return 'ᵤ'
            case 'v': return 'ᵥ'
            case 'x': return 'ₓ'
            default: return c
        }
    }
    
    def void defineGreekSymbols(String prefix) {
        (prefix + "Heta").defineSymbol("\u0370")       // Ͱ
        (prefix + "heta").defineSymbol("\u0371")       // ͱ       
        (prefix + "Yot").defineSymbol("\u037F")        // Ϳ
        
        (prefix + "Alpha").defineSymbol("\u0391")      // Α
        (prefix + "Beta").defineSymbol("\u0392")       // Β
        (prefix + "Gamma").defineSymbol("\u0393")      // Γ
        (prefix + "Delta").defineSymbol("\u0394")      // Δ
        (prefix + "Epsilon").defineSymbol("\u0395")    // Ε
        (prefix + "Zeta").defineSymbol("\u0396")       // Ζ
        (prefix + "Eta").defineSymbol("\u0397")        // Η
        (prefix + "Theta").defineSymbol("\u0398")      // Θ
        (prefix + "Iota").defineSymbol("\u0399")       // Ι
        (prefix + "Kappa").defineSymbol("\u039A")      // Κ
        (prefix + "Lambda").defineSymbol("\u039B")     // Λ
        (prefix + "Mu").defineSymbol("\u039C")         // Μ
        (prefix + "Nu").defineSymbol("\u039D")         // Ν
        (prefix + "Xi").defineSymbol("\u039E")         // Ξ
        (prefix + "Omicron").defineSymbol("\u039F")    // Ο
        (prefix + "Pi").defineSymbol("\u03A0")         // Π
        (prefix + "Rho").defineSymbol("\u03A1")        // Ρ
        (prefix + "Sigma").defineSymbol("\u03A3")      // Σ
        (prefix + "Tau").defineSymbol("\u03A4")        // Τ
        (prefix + "Upsilon").defineSymbol("\u03A5")    // Υ
        (prefix + "Phi").defineSymbol("\u03A6")        // Φ
        (prefix + "Chi").defineSymbol("\u03A7")        // Χ
        (prefix + "Psi").defineSymbol("\u03A8")        // Ψ
        (prefix + "Omega").defineSymbol("\u03A9")      // Ω
        
        (prefix + "alpha").defineSymbol("\u03B1")      // α
        (prefix + "beta").defineSymbol("\u03B2")       // β
        (prefix + "gamma").defineSymbol("\u03B3")      // γ
        (prefix + "delta").defineSymbol("\u03B4")      // δ
        (prefix + "epsilon").defineSymbol("\u03B5")    // ε
        (prefix + "zeta").defineSymbol("\u03B6")       // ζ
        (prefix + "eta").defineSymbol("\u03B7")        // η
        (prefix + "theta").defineSymbol("\u03B8")      // θ
        (prefix + "iota").defineSymbol("\u03B9")       // ι
        
        (prefix + "kappa").defineSymbol("\u03BA")      // κ
        (prefix + "lambda").defineSymbol("\u03BB")     // λ
        (prefix + "mu").defineSymbol("\u03BC")         // μ
        (prefix + "nu").defineSymbol("\u03BD")         // ν
        (prefix + "xi").defineSymbol("\u03BE")         // ξ
        (prefix + "omicron").defineSymbol("\u03BF")    // ο
        (prefix + "pi").defineSymbol("\u03C0")         // π
        (prefix + "rho").defineSymbol("\u03C1")        // ρ
        (prefix + "sigma").defineSymbol("\u03C3")      // σ
        
        (prefix + "tau").defineSymbol("\u03C4")        // τ
        (prefix + "upsilon").defineSymbol("\u03C5")    // υ
        (prefix + "phi").defineSymbol("\u03C6")        // φ
        (prefix + "chi").defineSymbol("\u03C7")        // χ
        (prefix + "psi").defineSymbol("\u03C8")        // ψ
        (prefix + "omega").defineSymbol("\u03C9")      // ω    
        
        (prefix + "Stigma").defineSymbol("\u03DA")     // Ϛ
        (prefix + "stigma").defineSymbol("\u03DB")     // ϛ
        (prefix + "Digamma").defineSymbol("\u03DC")    // Ϝ
        (prefix + "digamma").defineSymbol("\u03DD")    // ϝ
        (prefix + "Koppa").defineSymbol("\u03DE")      // Ϟ
        (prefix + "koppa").defineSymbol("\u03DF")      // ϟ
        (prefix + "Sampi").defineSymbol("\u03E0")      // Ϡ
        (prefix + "sampi").defineSymbol("\u03E1")      // ϡ
        
        (prefix + "Sho").defineSymbol("\u03F7")        // Ϸ
        (prefix + "sho").defineSymbol("\u03F8")        // ϸ
        (prefix + "San").defineSymbol("\u03FA")        // Ϻ
        (prefix + "san").defineSymbol("\u03FB")        // ϻ
    }
    
    def void defineMathScriptSymbols(String prefix) {
        (prefix + "A").defineSymbol("\uD835\uDC9C")
        (prefix + "B").defineSymbol("\u212C")
        (prefix + "C").defineSymbol("\uD835\uDC9E")
        (prefix + "D").defineSymbol("\uD835\uDC9F")
        (prefix + "E").defineSymbol("\u2130")
        (prefix + "F").defineSymbol("\u2131")
        (prefix + "G").defineSymbol("\uD835\uDCA2")
        (prefix + "H").defineSymbol("\u210B")
        (prefix + "I").defineSymbol("\u2110")
        (prefix + "J").defineSymbol("\uD835\uDCA5")
        (prefix + "K").defineSymbol("\uD835\uDCA6")
        (prefix + "L").defineSymbol("\u2112")
        (prefix + "M").defineSymbol("\u2133")
        (prefix + "N").defineSymbol("\uD835\uDCA9")
        (prefix + "O").defineSymbol("\uD835\uDCAA")
        (prefix + "P").defineSymbol("\uD835\uDCAB")
        (prefix + "Q").defineSymbol("\uD835\uDCAC")
        (prefix + "R").defineSymbol("\u211B")
        (prefix + "S").defineSymbol("\uD835\uDCAE")
        (prefix + "T").defineSymbol("\uD835\uDCAF")
        (prefix + "U").defineSymbol("\uD835\uDCB0")
        (prefix + "V").defineSymbol("\uD835\uDCB1")
        (prefix + "W").defineSymbol("\uD835\uDCB2")
        (prefix + "X").defineSymbol("\uD835\uDCB3")
        (prefix + "Y").defineSymbol("\uD835\uDCB4")
        (prefix + "Z").defineSymbol("\uD835\uDCB5")
        
        (prefix + "a").defineSymbol("\uD835\uDCB6")
        (prefix + "b").defineSymbol("\uD835\uDCB7")
        (prefix + "c").defineSymbol("\uD835\uDCB8")
        (prefix + "d").defineSymbol("\uD835\uDCB9")
        (prefix + "e").defineSymbol("\u212F")
        (prefix + "f").defineSymbol("\uD835\uDCBB")
        (prefix + "g").defineSymbol("\u210A")
        (prefix + "h").defineSymbol("\uD835\uDCBD")
        (prefix + "i").defineSymbol("\uD835\uDCBE")
        (prefix + "j").defineSymbol("\uD835\uDCBF")
        (prefix + "k").defineSymbol("\uD835\uDCC0")
        (prefix + "l").defineSymbol("\uD835\uDCC1")
        (prefix + "m").defineSymbol("\uD835\uDCC2")
        (prefix + "n").defineSymbol("\uD835\uDCC3")
        (prefix + "o").defineSymbol("\u2134")
        (prefix + "p").defineSymbol("\uD835\uDCC5")
        (prefix + "q").defineSymbol("\uD835\uDCC6")
        (prefix + "r").defineSymbol("\uD835\uDCC7")
        (prefix + "s").defineSymbol("\uD835\uDCC8")
        (prefix + "t").defineSymbol("\uD835\uDCC9")
        (prefix + "u").defineSymbol("\uD835\uDCCA")
        (prefix + "v").defineSymbol("\uD835\uDCCB")
        (prefix + "w").defineSymbol("\uD835\uDCCC")
        (prefix + "x").defineSymbol("\uD835\uDCCD")
        (prefix + "y").defineSymbol("\uD835\uDCCE")
        (prefix + "z").defineSymbol("\uD835\uDCCF")
    }
    
    def void defineMathFrakturSymbols(String prefix) {
        (prefix + "A").defineSymbol("\uD835\uDD04")
        (prefix + "B").defineSymbol("\uD835\uDD05")
        (prefix + "C").defineSymbol("\u212D")
        (prefix + "D").defineSymbol("\uD835\uDD07")
        (prefix + "E").defineSymbol("\uD835\uDD08")
        (prefix + "F").defineSymbol("\uD835\uDD09")
        (prefix + "G").defineSymbol("\uD835\uDD0A")
        (prefix + "H").defineSymbol("\u210C")
        (prefix + "I").defineSymbol("\u2111")
        (prefix + "J").defineSymbol("\uD835\uDD0D")
        (prefix + "K").defineSymbol("\uD835\uDD0E")
        (prefix + "L").defineSymbol("\uD835\uDD0F")
        (prefix + "M").defineSymbol("\uD835\uDD10")
        (prefix + "N").defineSymbol("\uD835\uDD11")
        (prefix + "O").defineSymbol("\uD835\uDD12")
        (prefix + "P").defineSymbol("\uD835\uDD13")
        (prefix + "Q").defineSymbol("\uD835\uDD14")
        (prefix + "R").defineSymbol("\u211C")
        (prefix + "S").defineSymbol("\uD835\uDD16")
        (prefix + "T").defineSymbol("\uD835\uDD17")
        (prefix + "U").defineSymbol("\uD835\uDD18")
        (prefix + "V").defineSymbol("\uD835\uDD19")
        (prefix + "W").defineSymbol("\uD835\uDD1A")
        (prefix + "X").defineSymbol("\uD835\uDD1B")
        (prefix + "Y").defineSymbol("\uD835\uDD1C")
        (prefix + "Z").defineSymbol("\u2128")
        
        (prefix + "a").defineSymbol("\uD835\uDD1E")
        (prefix + "b").defineSymbol("\uD835\uDD1F")
        (prefix + "c").defineSymbol("\uD835\uDD20")
        (prefix + "d").defineSymbol("\uD835\uDD21")
        (prefix + "e").defineSymbol("\uD835\uDD22")
        (prefix + "f").defineSymbol("\uD835\uDD23")
        (prefix + "g").defineSymbol("\uD835\uDD24")
        (prefix + "h").defineSymbol("\uD835\uDD25")
        (prefix + "i").defineSymbol("\uD835\uDD26")
        (prefix + "j").defineSymbol("\uD835\uDD27")
        (prefix + "k").defineSymbol("\uD835\uDD28")
        (prefix + "l").defineSymbol("\uD835\uDD29")
        (prefix + "m").defineSymbol("\uD835\uDD2A")
        (prefix + "n").defineSymbol("\uD835\uDD2B")
        (prefix + "o").defineSymbol("\uD835\uDD2C")
        (prefix + "p").defineSymbol("\uD835\uDD2D")
        (prefix + "q").defineSymbol("\uD835\uDD2E")
        (prefix + "r").defineSymbol("\uD835\uDD2F")
        (prefix + "s").defineSymbol("\uD835\uDD30")
        (prefix + "t").defineSymbol("\uD835\uDD31")
        (prefix + "u").defineSymbol("\uD835\uDD32")
        (prefix + "v").defineSymbol("\uD835\uDD33")
        (prefix + "w").defineSymbol("\uD835\uDD34")
        (prefix + "x").defineSymbol("\uD835\uDD35")
        (prefix + "y").defineSymbol("\uD835\uDD36")
        (prefix + "z").defineSymbol("\uD835\uDD37")
    }    
    
    def void defineMathDoubleStruckSymbols(String prefix) {
        (prefix + "A").defineSymbol("\uD835\uDD38")
        (prefix + "B").defineSymbol("\uD835\uDD39")
        (prefix + "C").defineSymbol("\u2102")
        (prefix + "D").defineSymbol("\uD835\uDD3B")
        (prefix + "E").defineSymbol("\uD835\uDD3C")
        (prefix + "F").defineSymbol("\uD835\uDD3D")
        (prefix + "G").defineSymbol("\uD835\uDD3E")
        (prefix + "H").defineSymbol("\u210D")
        (prefix + "I").defineSymbol("\uD835\uDD40")
        (prefix + "J").defineSymbol("\uD835\uDD41")
        (prefix + "K").defineSymbol("\uD835\uDD42")
        (prefix + "L").defineSymbol("\uD835\uDD43")
        (prefix + "M").defineSymbol("\uD835\uDD44")
        (prefix + "N").defineSymbol("\u2115")
        (prefix + "O").defineSymbol("\uD835\uDD46")
        (prefix + "P").defineSymbol("\u2119")
        (prefix + "Q").defineSymbol("\u211A")
        (prefix + "R").defineSymbol("\u211D")
        (prefix + "S").defineSymbol("\uD835\uDD4A")
        (prefix + "T").defineSymbol("\uD835\uDD4B")
        (prefix + "U").defineSymbol("\uD835\uDD4C")
        (prefix + "V").defineSymbol("\uD835\uDD4D")
        (prefix + "W").defineSymbol("\uD835\uDD4E")
        (prefix + "X").defineSymbol("\uD835\uDD4F")
        (prefix + "Y").defineSymbol("\uD835\uDD50")
        (prefix + "Z").defineSymbol("\u2124")
        
        (prefix + "a").defineSymbol("\uD835\uDD52")
        (prefix + "b").defineSymbol("\uD835\uDD53")
        (prefix + "c").defineSymbol("\uD835\uDD54")
        (prefix + "d").defineSymbol("\uD835\uDD55")
        (prefix + "e").defineSymbol("\uD835\uDD56")
        (prefix + "f").defineSymbol("\uD835\uDD57")
        (prefix + "g").defineSymbol("\uD835\uDD58")
        (prefix + "h").defineSymbol("\uD835\uDD59")
        (prefix + "i").defineSymbol("\uD835\uDD5A")
        (prefix + "j").defineSymbol("\uD835\uDD5B")
        (prefix + "k").defineSymbol("\uD835\uDD5C")
        (prefix + "l").defineSymbol("\uD835\uDD5D")
        (prefix + "m").defineSymbol("\uD835\uDD5E")
        (prefix + "n").defineSymbol("\uD835\uDD5F")
        (prefix + "o").defineSymbol("\uD835\uDD60")
        (prefix + "p").defineSymbol("\uD835\uDD61")
        (prefix + "q").defineSymbol("\uD835\uDD62")
        (prefix + "r").defineSymbol("\uD835\uDD63")
        (prefix + "s").defineSymbol("\uD835\uDD64")
        (prefix + "t").defineSymbol("\uD835\uDD65")
        (prefix + "u").defineSymbol("\uD835\uDD66")
        (prefix + "v").defineSymbol("\uD835\uDD67")
        (prefix + "w").defineSymbol("\uD835\uDD68")
        (prefix + "x").defineSymbol("\uD835\uDD69")
        (prefix + "y").defineSymbol("\uD835\uDD6A")
        (prefix + "z").defineSymbol("\uD835\uDD6B")
    }    
}