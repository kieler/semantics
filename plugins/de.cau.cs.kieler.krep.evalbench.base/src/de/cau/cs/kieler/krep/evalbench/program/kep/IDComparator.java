package de.cau.cs.kieler.krep.evalbench.program.kep;

import java.util.Comparator;

public class IDComparator implements Comparator<Instruction> {

	public int compare(Instruction inst1, Instruction inst2) {
		return inst1.id.compareTo(inst2.id);
	}

	public boolean equals(Instruction inst1, Instruction inst2) {
		return inst1.id.equals(inst2.id);
	}

}
