/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.sim.ptolemy;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import Moml.DocumentRoot;
import Moml.EntityType;
import Moml.LinkType;
import Moml.MomlFactory;
import Moml.PropertyType;
import Moml.RelationType;
import Moml.util.MomlResourceFactoryImpl;

/**
 * Example test class that shows how to use the XML Schema Definition (XSD) 
 * to Ecore import and how to save a model into an XML file corresponding 
 * to the XSD. For details see comments in the source code. 
 * @author haf
 *
 */
public class TestCreateMomlFile {

    // save MoML file for later
    public static URI momlFileUri;
    
    public static void main(String[] args) {
        // Get the EMF factory to create new elements
        MomlFactory f = Moml.MomlFactory.eINSTANCE;
        
        // create example model ptolemy/moml/demo/test.xml
        EntityType t1 = f.createEntityType();
        t1.setName("test");
        t1.setClass1("ptolemy.actor.TypedCompositeActor");
        
        EntityType ramp = f.createEntityType();
        ramp.setName("ramp");
        ramp.setClass1("ptolemy.actor.lib.Ramp");
        
        // a plotter is a visible gui component and can only be used
        // in vergil
        //EntityType plot = f.createEntityType();
        //plot.setName("plot");
        //plot.setClass("ptolemy.actor.lib.gui.SequencePlotter");
        
        // instead use a simple std.out writer
        EntityType writer = f.createEntityType();
        writer.setName("writer");
        writer.setClass1("ptolemy.actor.lib.io.LineWriter");
                
        RelationType relation = f.createRelationType();
        relation.setName("r");
        relation.setClass("ptolemy.actor.TypedIORelation");
        
        LinkType link1 = f.createLinkType();
        link1.setPort("ramp.output");
        link1.setRelation("r");
        
        LinkType link2 = f.createLinkType();
        link2.setPort("writer.input");
        link2.setRelation("r");
       
        t1.getEntity().add(ramp);
        t1.getEntity().add(writer);
        t1.getRelation().add(relation);
        t1.getLink().add(link1);
        t1.getLink().add(link2);
        
        // add director
        // FIXME: setting the director via MoML is a bit unhandy
        PropertyType director = f.createPropertyType();
        // lets try a "synchronous reactive" director
        director.setName("SR Director");
        director.setClass("ptolemy.domains.sr.kernel.SRDirector");
        t1.getProperty().add(director);
        
        // set some director properties
        // model time elapsing each iteration
        PropertyType period = f.createPropertyType();
        period.setName("period");
        period.setClass("ptolemy.data.expr.Parameter");
        period.setValue("1.0");
        // synchronize execution to real time. Maybe not always wanted
        PropertyType synchronizeToRealTime = f.createPropertyType();
        synchronizeToRealTime.setName("synchronizeToRealTime");
        synchronizeToRealTime.setClass("ptolemy.data.expr.Parameter");
        synchronizeToRealTime.setValue("true");
        director.getProperty().add(period);
        director.getProperty().add(synchronizeToRealTime);
        
        
        // Doc Root seems to be an auto generated class in Ecore that forms the 
        // root of the xml tree. 
        DocumentRoot doc = f.createDocumentRoot();
        doc.setEntity(t1);
        
        // save model to XMI
        // Create a resource set.
        ResourceSet resourceSet = new ResourceSetImpl();

        // use the generated MoML Resource factory. It will safe an XML
        // file with the syntax valid to the MoML XSD.
        // An alternative would be the XMIResourceFactoryImpl, which
        // uses standard XMI which is not MoML compliant.
        Resource.Factory resourceFactory = new MomlResourceFactoryImpl();
        
        // Register the default resource factory -- only needed for stand-alone!
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
           Resource.Factory.Registry.DEFAULT_EXTENSION, resourceFactory);

        // Get the URI of the model file.
        String filename = "output.xml";
        URI fileURI = URI.createFileURI(new File(filename).getAbsolutePath());
        // save URI for later
        momlFileUri = fileURI;
        
        // Create a resource for this file.
        XMLResource resource = (XMLResource)resourceSet.createResource(fileURI);

        // Add the EMF objects to the contents.
        resource.getContents().add(doc);

        // set options to save specific XML stuff required by MoML
        HashMap<Object, Object> options = new HashMap<Object, Object>();
        options.put(XMIResource.OPTION_SAVE_DOCTYPE, true);
        resource.setDoctypeInfo("-//UC Berkeley//DTD MoML 1//EN","http://ptolemy.eecs.berkeley.edu/xml/dtd/MoML_1.dtd");
                
        // Save the contents of the resource to the file system.
        try
        {
          resource.save(options);
          //resource.save(Collections.EMPTY_MAP);
          System.out.println("Example model created and saved to "+filename);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
