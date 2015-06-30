package de.cau.cs.kieler.sccharts.esterel.transformation;

import java.util.Comparator;

import org.eclipse.emf.common.util.EList;

import de.cau.cs.kieler.esterel.esterel.ModuleInterface;
import de.cau.cs.kieler.esterel.kexpressions.InterfaceSignalDecl;
import de.cau.cs.kieler.sccharts.Transition;

public class HelpFunctions {
	
	
	
	public HelpFunctions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static EList<InterfaceSignalDecl>  getSignals(ModuleInterface mi) {
		return mi.getIntSignalDecls();		
	}
	
	Comparator<Transition> comp = new Comparator<Transition> () {
		public int compare(Transition t1, Transition t2) {
			return t1.getPriority() < t2.getPriority() ? -1 : 1;
		}	
	};
}
