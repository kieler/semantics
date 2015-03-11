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
package de.cau.cs.kieler.kico.server;

//import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;

import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.IntermediateResult;
import de.cau.cs.kieler.kico.KiCoUtil;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.TransformationIntermediateResult;
import de.cau.cs.kieler.server.HttpHeader;
import de.cau.cs.kieler.server.HttpQuery;
import de.cau.cs.kieler.server.HttpRequest;
import de.cau.cs.kieler.server.HttpResponse;
import de.cau.cs.kieler.server.HttpServer;
import de.cau.cs.kieler.server.HttpUtils;

/**
 * This class implements to KIELER Compiler TCP Server that runs as an Eclipse Job. Typically it
 * uses the port 5555 but it can be called to use any other TCP port. It tries to compile the
 * received model and returns the compilation result with error messages if present.
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 * 
 */
public class KiCoServer extends HttpServer {

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiCo server. Note that the name is automatically set to include also the
     * listening port.
     * 
     * @param name
     *            the name
     */
    @Inject
    public KiCoServer(String name) {
        super(KiCoServerPlugin.loadPort(), "KIELER Compiler HTTP Server ("
                + KiCoServerPlugin.loadPort() + ")");
        debug("Server created");
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected HttpResponse handleRequest(HttpRequest request) {
        debug("Server started");

        HttpHeader header = request.header();
        // String body = request.bodyAsText();

        String bodyAsString = request.bodyAsText();
        System.out.println(bodyAsString);

        HttpQuery query = header.getQuery();
        if (request.header().isMethodPOST()) {
            query = request.body().getFormQueryData();
        }

        // Check the query
        if (query.getValue("model").length() > 0) {

            // Parse options
            boolean verbose = false;
            boolean strict = false;
            boolean performance = false;
            String verboseString = query.getValue("verbose");
            String ext = null; // by default no extension is given, if an extension is given use
                               // this!
            if (verboseString.toLowerCase().equals("true")
                    || verboseString.toLowerCase().equals("t")
                    || verboseString.toLowerCase().equals("1")) {
                verbose = true;
            }
            String performanceString = query.getValue("performance");
            if (performanceString.trim().length() > 0) {
                performanceString = performanceString.trim();
                // an example performanceString may be "%ALL,%CODEGENERATION,%ENTRY,%SCG"
                // it includes %ALL or %TRANSFORMATIONID and the return value will be this string
                // where
                // %TRANSFORMATIONID is replaced by the time in ms which the transformation with
                // this id took
                // or %ALL is replaced by the sum of the overall compilation.
                performance = true;
            }
            String strictString = query.getValue("strict");
            if (strictString.toLowerCase().equals("true") || strictString.toLowerCase().equals("t")
                    || strictString.toLowerCase().equals("1")) {
                strict = true;
            }
            String extString = query.getValue("ext");
            if (extString.trim().length() > 0) {
                ext = extString.toLowerCase().trim();
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

            String transformationIDs = query.getValue("transformations");

            // Parse models
            EObject mainModel = null;
            KielerCompilerContext context = new KielerCompilerContext(transformationIDs, mainModel);
            for (int i = models.size() - 1; i >= 0; i--) {
                boolean isMainModel = (i == 0);
                String model = models.get(i);
                EObject eObject = KiCoUtil.parse(model, context, isMainModel, ext);
                if (isMainModel) {
                    mainModel = eObject;
                }
            }
            
            
            // answer with compiled & serialized model
            String lastError = "";
            String lastWarning = "";
            String serializedCompiledModel = "";
            if (mainModel == null) {
                lastError = "Model cannot be parsed.";
                serializedCompiledModel = lastError;
                lastWarning = "";
                debug("Model not parsed");
            } else {
                debug("Model parsed");
                context.setVerboseMode(verbose);
                context.setAutoSelect(!strict);
                context.setMainResource(mainModel.eResource());

                // process the model
                CompilationResult compilationResult = KielerCompiler.compile(context);

                if (performance) {
                    List<TransformationIntermediateResult> results = compilationResult.getTransformationIntermediateResults();
                    long durationAll = 0;
                    for (int c = 0; c < results.size(); c++) {
                        durationAll += (results.get(c)).getDuration();
                    }
                    performanceString = performanceString.replace("%ALL", durationAll + "");
                    // modelname,durationsum,
                    for (int c = 0; c < results.size(); c++) {
                        IntermediateResult result = (results.get(c));
                        String transformationID = result.getId();
                        long duration = result.getDuration();
                        if (transformationID != null && transformationID.length() > 0) {
                            performanceString =
                                    performanceString.replace("%" + transformationID, duration + "");
                        }
                    }
                    serializedCompiledModel = performanceString + "\n";
                    debug("Model compiled with performance test");
                } else {
                    // no performance test, serialize
                    debug("Model compiled");
                    Object compiledModel = compilationResult.getObject();
                    if (compiledModel != null) {
                        serializedCompiledModel = compiledModel.toString();
                        if (compiledModel instanceof EObject) {
                            serializedCompiledModel =
                                    KiCoUtil.serialize((EObject) compiledModel, context, false);
                        }
                        debug("Model serialized");
                    }
                }
                
                lastError = compilationResult.getAllErrors();
                lastWarning = compilationResult.getAllWarnings();
            }


            // answer with compiled & serialized model
            if (lastError != null) {
                debug("Errors serialized:");
                debug(lastError);
            } else {
                lastError = "";
                debug("No errors to serialize");
            }
            if (lastWarning != null) {
                debug(lastWarning);
            } else {
                lastWarning = "";
            }

            HttpHeader responseHeader = new HttpHeader();
            responseHeader.setStatusOk();
            responseHeader.setTypeTextPlain();
            responseHeader.setHeaderField("Access-Control-Allow-Origin", "*");
            responseHeader.setHeaderField("Access-Control-Expose-Headers",
                    "compile-error,compile-warning");
            // responseHeader.setHeaderField("Access-Control-Allow-Headers", "*");
            HttpResponse response = new HttpResponse();
            response.setHeader(responseHeader);
            if (lastError.length() > 0) {
                responseHeader.setHeaderField("compile-error", HttpUtils.encodeURL(lastError));
            }

            if (lastWarning.length() > 0) {
                responseHeader.setHeaderField("compile-warning", HttpUtils.encodeURL(lastWarning));
            }
            response.setBody(serializedCompiledModel, false);

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
        return KiCoServerPlugin.loadEnabled();
    }

    // -------------------------------------------------------------------------

}
