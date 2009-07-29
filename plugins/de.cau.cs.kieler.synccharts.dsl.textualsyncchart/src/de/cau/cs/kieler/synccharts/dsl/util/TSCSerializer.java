package de.cau.cs.kieler.synccharts.dsl.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.antlr.IAntlrParser;

import com.google.inject.Injector;

import de.cau.cs.kieler.synccharts.dsl.TSCStandaloneSetup;

public class TSCSerializer {

	public static void main(String[] args) throws FileNotFoundException {
		Injector injector = new TSCStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		// Serialization of an Ecore model (msp)
		// ...
		//create inputstream from the model file
		String name = "/home/oba/Desktop/workspaces/KIELER_KIT_Galileo/de.cau.cs.kieler.synccharts.dsl.textualsyncchart/examplemodels/fullstate.tsc";
		InputStream inputStream = new FileInputStream(name);		// Parsing text into an Ecore model (msp):		
		IAntlrParser parser = injector.getInstance(IAntlrParser.class);
		IParseResult parseResult = parser.parse(inputStream);
		if (!parseResult.getParseErrors().isEmpty()) {
			// syntax errors occured - handle them properly
		}
		EObject topModelElement = parseResult.getRootASTElement();
		System.out.println(topModelElement.toString());

	}

}
