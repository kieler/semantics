/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.klighd.server;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
//import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.cau.cs.kieler.core.kgraph.KGraphData;
import de.cau.cs.kieler.core.kgraph.KGraphElement;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.kgraph.impl.KGraphDataImpl;
import de.cau.cs.kieler.kico.KiCoUtil;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kiml.graphviz.layouter.GraphvizLayoutProvider;
import de.cau.cs.kieler.kiml.util.KimlUtil;
import de.cau.cs.kieler.klighd.IOffscreenRenderer;
import de.cau.cs.kieler.klighd.LightDiagramServices;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.piccolo.export.SVGOffscreenRenderer;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;
import de.cau.cs.kieler.klighd.util.ModelingUtil;
import de.cau.cs.kieler.server.HttpHeader;
import de.cau.cs.kieler.server.HttpQuery;
import de.cau.cs.kieler.server.HttpRequest;
import de.cau.cs.kieler.server.HttpResponse;
import de.cau.cs.kieler.server.HttpServer;
import de.cau.cs.kieler.server.HttpUtils;

/**
 * This class implements to KIELER KLighD TCP Server that runs as an Eclipse Job. Typically it uses
 * the port 4444 but it can be called to use any other TCP port. It tries to render the received
 * model and returns the rendered result with error messages if present.
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 * 
 */
public class KlighdServer extends HttpServer {

    /** The async done flag. */
    boolean renderingDone = false;

    IStatus renderingResult = null;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new klighd server.
     */
    public KlighdServer() {
        super(KlighdServerPlugin.loadPort(), "KIELER KLighD HTTP Server ("
                + KlighdServerPlugin.loadPort() + ")");
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected HttpResponse handleRequest(HttpRequest request) {

        String render = "png";
        String scale = "1";
        int scaleInteger = 1;

        debug("Transformations read");

        HttpHeader header = request.header();
        // String body = request.bodyAsText();

        HttpQuery query = header.getQuery();
        if (request.header().isMethodPOST()) {
            query = request.body().getFormQueryData();
        }

        // Check the query
        if (query.getValue("model").length() > 0) {

            // Parse options
            scale = query.getValue("scale");
            try {
                scaleInteger = Integer.parseInt(scale);
            } catch (Exception e) {
            }

            String render2 = query.getValue("render");
            if (render2.equals("svg")) {
                // if this is a valid value (other than the default png) then change it
                render = render2;
            }

            // Read all models in "model" and "include1", "include2", ...
            ArrayList<String> models = new ArrayList<String>();
            String mainModelString = query.getValue("model");
            models.add(mainModelString);
            int index = 1;
            boolean found = true;
            while (found) {
                String includedModel = query.getValue("include" + index);
                if (includedModel.length() > 0) {
                    models.add(includedModel);
                    index++;
                } else {
                    found = false;
                }
            }
            debug("Models read");

            // Parse models
            EObject mainModel = null;
            KielerCompilerContext context = new KielerCompilerContext("", mainModel);
            for (int i = models.size() - 1; i >= 0; i--) {
                boolean isMainModel = (i == 0);
                String model = models.get(i);
                EObject eObject = KiCoUtil.parse(model, context, isMainModel);
                if (isMainModel) {
                    mainModel = eObject;
                }
            }
            debug("Model parsed");

            ByteArrayOutputStream outputStream  = new ByteArrayOutputStream();
            // ========= KGX ========
            if (render2.equals("kgx")) {
                // build up a corresponding view context
                final ViewContext viewContext =
                        LightDiagramServices.translateModel2(mainModel, null);
                ResourceSet rs = new ResourceSetImpl();
                Resource r = rs.createResource(URI.createPlatformResourceURI("Dummy.kgx", true));
                // write a copy of the view model kgraph to the selected file
                EObject copy = EcoreUtil.copy(viewContext.getViewModel());
                // persist layout options and friends
                KimlUtil.persistDataElements((KNode) copy);
                // remove transient klighd state
                @SuppressWarnings("unchecked")
                Iterator<KGraphElement> kgeIt =
                        (Iterator<KGraphElement>) (Iterator<?>) ModelingUtil
                                .selfAndEAllContentsOfType2(copy, KGraphElement.class);
                try {
                    while (kgeIt.hasNext()) {
                        KGraphElement kge = kgeIt.next();
                        Iterator<KGraphData> dataIt = kge.getData().iterator();
                        while (dataIt.hasNext()) {
                            KGraphData d = dataIt.next();
                            // RenderinContextData
                            if (d.getClass().equals(KGraphDataImpl.class)) {
                                dataIt.remove();
                            }
                        }
                    }
                } catch (Throwable t) {
                    t.printStackTrace();
                }
                r.getContents().add(copy);
                try {
                    // Render KGX model and save it to output stream
                    r.save(outputStream, Collections.emptyMap());
                    outputStream.flush();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } else {
                // DUE TO GRAPHIZ BUG
                GraphvizLayoutProvider.renewProcess = true;
                final ByteArrayOutputStream outputStreamParam = outputStream;
                // // Render model
                // ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                // final ByteArrayOutputStream outputStreamParam = outputStream;
                final EObject mainModelParam = mainModel;
                final String renderParam = render;
                final KlighdSynthesisProperties properties =
                        KlighdSynthesisProperties
                                .create()
                                .setProperty(SVGOffscreenRenderer.GENERATOR,
                                        "de.cau.cs.kieler.klighd.piccolo.svggen.freeHEP")
                                .setProperty(IOffscreenRenderer.IMAGE_SCALE, scaleInteger);
                renderingResult =
                        LightDiagramServices.renderOffScreen(mainModelParam, renderParam,
                                outputStreamParam, properties);
                try {
                    outputStreamParam.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                GraphvizLayoutProvider.renewProcess = false;
            }

            debug("Model rendered");


            byte[] serializedRenderedModel = null;
            String errors = "";
            if ((renderingResult != null && renderingResult.getCode() == IStatus.OK) || render2.equals("kgx")) {
                // everything ok, return output stream
                serializedRenderedModel = outputStream.toByteArray();
                // String bla = new String(serializedRenderedModel);
                // System.out.println(bla);
            } else {
                String serializedRenderedModelString = "Generation of diagram failed: ";
                if (renderingResult != null && renderingResult.getException() != null) {
                    serializedRenderedModelString +=
                            getErrorMessage(renderingResult.getException());
                }
                serializedRenderedModel = "".getBytes();
                errors = serializedRenderedModelString;
            }
            debug("Model serialized");
            errors = "";

            HttpHeader responseHeader = new HttpHeader();
            responseHeader.setStatusOk();

            if (render.equals("svg")) {
                responseHeader.setTypeImageSvg();
            } else {
                responseHeader.setTypeImagePng();
            }
            HttpResponse response = new HttpResponse();
            response.setHeader(responseHeader);
            if (errors.length() > 0) {
                responseHeader.setHeaderField("render-error", HttpUtils.encodeURL(errors));
            }

            responseHeader.setHeaderField("Access-Control-Allow-Origin", "*");
            responseHeader.setHeaderField("Access-Control-Expose-Headers",
                    "compile-error,compile-warning");

            if (query.getValue("encoding").toLowerCase().equals("base64")) {
                responseHeader.setHeaderField("Content-Transfer-Encoding", "base64");
                serializedRenderedModel =
                        (HttpUtils.encodeBase64(serializedRenderedModel)).getBytes();
            }

            responseHeader.setContentLength(serializedRenderedModel.length);
            response.setBody(serializedRenderedModel, false);

            System.out.println(responseHeader.toString());
            System.out.println(new String(serializedRenderedModel));

            // String responeBody = "Huhu";
            // HttpHeader responseHeader = new HttpHeader();
            // responseHeader.setServerName("KIELER Compiler Server");
            // responseHeader.setContentLength(responeBody.getBytes().length);
            // responseHeader.setStatusOk();
            // HttpResponse response = new HttpResponse();
            // response.setHeader(responseHeader);
            // response.setBody(responeBody);

            return response;

        }

        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean isEnabled() {
        return KlighdServerPlugin.loadEnabled();
    }

    // -------------------------------------------------------------------------

}
