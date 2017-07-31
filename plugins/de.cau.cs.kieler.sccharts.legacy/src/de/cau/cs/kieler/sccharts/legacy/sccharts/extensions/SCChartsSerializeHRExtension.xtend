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
package de.cau.cs.kieler.sccharts.legacy.sccharts.extensions

import com.google.common.base.Joiner
import de.cau.cs.kieler.sccharts.legacy.sccharts.Action
import de.cau.cs.kieler.sccharts.legacy.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.legacy.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.legacy.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.legacy.sccharts.IterateAction
import de.cau.cs.kieler.sccharts.legacy.sccharts.SuspendAction
import de.cau.cs.kieler.sccharts.legacy.sccharts.Transition
import java.util.Listimport de.cau.cs.kieler.sccharts.legacy.kexpressions.keffects.extensions.KEffectsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.legacy.kexpressions.Declaration
import de.cau.cs.kieler.sccharts.legacy.kexpressions.ValueType
import de.cau.cs.kieler.sccharts.legacy.kexpressions.CombineOperator

/**
 * @author ssm
 * 
 * @kieler.design 2014-09-04 proposed ssm
 * @kieler.rating 2014-09-04 proposed yellow
 */
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
			} else {
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

	def dispatch CharSequence serialize(Action action) {
		action.serialize(false)
	}

	def dispatch CharSequence serializeHR(Action action) {
		action.serialize(true)
	}

	private def CharSequence serialize(Action action, boolean hr) {
		val joiner = Joiner.on(" ");
		val parts = action.serializeHighlighted(hr)
		return joiner.join(parts.map[key])
	}

	def List<Pair<CharSequence, Boolean>> serializeHighlighted(Action action, boolean hr) {
		val components = newArrayList

		if (action.immediate) {
			components.addKeyword("immediate");
		}

		components.addKeyword(switch action {
			EntryAction: "entry"
			DuringAction: "during"
			ExitAction: "exit"
			SuspendAction case action.isWeak: "weak suspend"
			SuspendAction: "suspend"
			IterateAction: "iterate"
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

	def dispatch CharSequence serialize(Declaration declaration) {
		declaration.serialize(false)
	}

	def dispatch CharSequence serializeHR(Declaration declaration) {
		declaration.serialize(true)
	}

	private def CharSequence serialize(Declaration declaration, boolean hr) {
		val joiner = Joiner.on(" ");
		val parts = declaration.serializeHighlighted(hr)
		return joiner.join(parts.map[key])
	}

	def List<Pair<CharSequence, Boolean>> serializeHighlighted(Declaration declaration, boolean hr) {
		val components = newArrayList

		// Modifiers
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
    
    def Pair<List<String>, List<String>> serializeComponents(Declaration declaration, boolean hr) {
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
}