package de.cau.cs.kieler.synccharts.sim.ptolemy;

import java.io.File;

import Moml.impl.*;
import de.cau.cs.kieler.synccharts.impl.*;

public class Synccharts2Moml {
	
	public Synccharts2Moml() {
		
	}
	
	//-------------------------------------------------------------------------

	public static void main(String[] args) {
		File file = new File("c:\\generated.moml");
		MOMLBuilder builder = new MOMLBuilder();
		
		builder.writeMomlTo(file);
	}

}
