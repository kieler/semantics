package de.cau.cs.kieler.sim.ptolemy;
import java.util.*;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

import org.openarchitectureware.*;
import org.openarchitectureware.workflow.*;

public class CodeGenerator {
	public static void main(String[] args) {
/*		if (args.length < 2) {
			System.out.println("Usage: java -jar CodeGenerator.jar ModelInstance OutputDir [Workflow]");
			System.exit(0);
		}
		
		String Directory = CodeGenerator.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		
		if (Directory.endsWith(".jar")||Directory.endsWith(".jar/")||Directory.endsWith(".jar\\")) {
			File DirFile = new File(Directory);
			Directory = DirFile.getParentFile().getAbsolutePath();
			if (!(Directory.endsWith("/")||(Directory.endsWith("\\")))) {
				Directory += System.getProperty("file.separator");
			}
		}
		else {
			File DirFile = new File(Directory);
			Directory = DirFile.getAbsolutePath();
			if (!(Directory.endsWith("/")||(Directory.endsWith("\\")))) {
				Directory += System.getProperty("file.separator");
			}
		}
		
		
		String WorkflowFile = Directory + "workflow.oaw";
		if (args.length > 2)
			   WorkflowFile = Directory + args[2];
		
		
		String MetaModel = Directory + "model.ecore"; //"SimpleRailCtrl.ecore"
		String ModelInstance = "file:" + args[0];   //"file:C:\\Documents and Settings\\delphino\\Desktop\\SimpleRailCtrl.blaaaaaaaaaaaa\\sample.simplerailctrl";

		
		String OutDir = args[1];                    //"C:\\"
		
		//Call ModelInstance OutputDir [Workflow]

		System.out.println("Generating C-Code");
		System.out.println("-----------------");
		System.out.println("JAR Directory: '"+Directory+"'");
		System.out.println("Workflow     : '"+WorkflowFile+"'");
		System.out.println("MetaModel    : '"+MetaModel+"'");
		System.out.println("ModelInstance: '"+ModelInstance+"'");
		System.out.println("Out Directory: '"+OutDir+"'");
*/		
		//String Directory = "/home/delphino/eclipseworkspace/CodeGenerator/";
		//String WorkflowFile = "/home/delphino/eclipseworkspace/CodeGenerator/workflowGirlsday.oaw";
		//String MetaModel = "/home/delphino/eclipseworkspace/CodeGenerator/model.ecore";
		//String ModelInstance = "/home/delphino/eclipseworkspace/CodeGenerator/girlsday.simplerailctrl";
		//ModelInstance = "file:/tmp/girlsday.simplerailctrl_diagram";
		//String OutDir = "/home/delphino/Desktop";

		String Directory = ".";
		String WorkflowFile = "file:X:/dop_eclipse/testspace/de.cau.cs.kieler.sim.ptolemy/src/de/cau/cs/kieler/sim/ptolemy/workflowM2M.oaw";
		String MetaModel = "model.ecore";
		String ModelInstance = "girlsday.simplerailctrl";
		String OutDir = "C:\\Documents and Settings\\delphino\\Desktop";
		
        Map<String,String> properties = new HashMap<String,String>();
        Map<String, Object> slotContents = new HashMap<String, Object>();
        
		properties.put("model", ModelInstance);
		properties.put("metamodel", MetaModel);
		properties.put("src-gen", OutDir) ;
        
		System.out.println("C-Code Generation - starting...");
		
        if (new WorkflowRunner().run(WorkflowFile , 
        		null, properties, slotContents)) {
        	System.out.println("C-Code Generation - completed.");
            System.exit(1);

        }
        else {
        	System.out.println("C-Code Generation - failed.");
        	System.exit(0);
        }
	}
}
