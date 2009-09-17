package de.cau.cs.kieler.synccharts.sim.ptolemy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//import ptolemy.actor.TypedCompositeActor;

public class MOMLBuilder {

//	private TypedCompositeActor content;

	//----------------------------------------------------------------------------
	
	public MOMLBuilder() {
//		content = new TypedCompositeActor();
	}

	//----------------------------------------------------------------------------
	
	
	public boolean writeMomlTo(File file) {
		try {
			FileWriter fstream = new FileWriter(file);
	        BufferedWriter out = new BufferedWriter(fstream);
	        out.write("<?xml version=\"1.0\" standalone=\"no\"?>");
	        out.write("<!DOCTYPE entity PUBLIC \"-//UC Berkeley//DTD" +
	        		  " MoML 1//EN\" \n \"http://ptolemy.eecs.berkeley." +
	        		  "edu/xml/dtd/MoML_1.dtd\">");
		
	        //out.write(this.content.exportMoMLPlain());
		
	        out.flush();
	        out.close();
	        System.out.println("done");
	        return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}

