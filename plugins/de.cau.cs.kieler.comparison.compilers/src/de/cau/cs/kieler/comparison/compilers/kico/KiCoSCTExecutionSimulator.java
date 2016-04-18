/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.compilers.kico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.LinkedList;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.framework.Bundle;

import com.google.inject.Guice;

import de.cau.cs.kieler.comparison.simulation.ExecutionSimulator;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions;
import de.cau.cs.kieler.core.model.util.ModelUtil;
import de.cau.cs.kieler.core.model.util.ProgressMonitorAdapter;
import de.cau.cs.kieler.sc.CExecution;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.sim.c.SCChartsSimCPlugin;
import de.cau.cs.kieler.sccharts.sim.c.xtend.CSimulationSCChart;
import de.cau.cs.kieler.sccharts.sim.c.xtend.CSimulationSCG;
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.sim.benchmark.Benchmark;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.util.KiemUtil;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;

/**
 * @author nfl
 *
 */
public class KiCoSCTExecutionSimulator extends ExecutionSimulator {

    // TODO remove test defaults
    // TODO remove extension point
    private Path srcModelPath = new File("/home/nfl/Documents/Master/simulator/AO.sct").toPath();
    private Path compilationPath = new File("/home/nfl/Documents/Master/simulator/AO.sct.c")
            .toPath();

    /** The SSCharts State / SCG is the considered model to simulate. */
    private EObject myModel = null;

    /** The C execution object for concurrent execution. */
    private CExecution cExecution = null;

    /** The benchmark flag for generating cycle and file size signals. */
    private boolean benchmark = true;

    /**
     * {@inheritDoc}
     */
    @Override
    public void wrapup() throws KiemInitializationException {
        if (cExecution != null) {
            // Do not delete the executable, maybe it can be used again
            cExecution.stopExecution(false);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCompilationPath(Path compilation) {
        compilationPath = compilation;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean setSrcModelPath(Path srcModel) {
        try {

            URI uri = URI.createFileURI(srcModel.toString());

            // Get the resource
            Resource resource = new ResourceSetImpl().getResource(uri, true);
            if (resource == null || resource.getContents() == null
                    || resource.getContents().isEmpty())
                return false;

            // The following should be a state or an SCG
            EObject stateOrSCG = resource.getContents().get(0);
            if (!((stateOrSCG instanceof State) || (stateOrSCG instanceof SCGraph))) {
                // compilation failed
                return false;
            }

            myModel = stateOrSCG;
            srcModelPath = srcModel;
        } catch (IllegalArgumentException e) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JSONObject doStep(JSONObject jSONObject) throws KiemExecutionException {
        System.out.println("- entering step with jSONObject: " + jSONObject.toString());

        // The return object to construct
        JSONObject returnObj = new JSONObject();

        if (cExecution == null || !cExecution.isStarted()) {
            throw new KiemExecutionException("No S simulation is running", true, null);
        }

        try {
            String out = jSONObject.toString();
            // System.out.println("> " + out);
            cExecution.getInterfaceToExecution().write(out + "\n");
            cExecution.getInterfaceToExecution().flush();
            while (cExecution.getInterfaceError().ready()) {
                // Error output, if any
                System.out.print(cExecution.getInterfaceError().read());
            }

            String receivedMessage = cExecution.getInterfaceFromExecution().readLine();
            System.out.println("-- receivedMessage: " + receivedMessage);

            if (receivedMessage != null) {
                JSONObject output = new JSONObject(receivedMessage);
                JSONArray outputArray = output.names();

                if (outputArray != null) {
                    for (int i = 0; i < outputArray.length(); i++) {
                        String outputName = outputArray.getString(i);

                        if (output.get(outputName) instanceof JSONObject) {

                            JSONObject valuedObject = output.getJSONObject(outputName);
                            Object value = ((JSONObject) valuedObject).get("value");

                            boolean present = false;
                            if (value instanceof Boolean) {
                                present = (Boolean) value;
                            } else if (value instanceof Integer) {
                                present = ((Integer) value) != 0;
                            }

                            returnObj.accumulate(outputName,
                                    JSONSignalValues.newValue(value, present));
                        }

                    }

                    // Add benchmark information
                    if (benchmark) {
                        if (output.has(Benchmark.BENCHMARK_SIGNAL_TIME)) {
                            Object bench = output.get(Benchmark.BENCHMARK_SIGNAL_TIME);
                            returnObj.accumulate(Benchmark.BENCHMARK_SIGNAL_TIME, bench);
                        }
                    }
                }
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
            cExecution.stopExecution(false);
        } catch (JSONException e) {
            e.printStackTrace();
            cExecution.stopExecution(false);
        }

        System.out.println("- leaving step with returnObj: " + returnObj.toString()
                + System.lineSeparator());
        return returnObj;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void doModel2ModelTransform(ProgressMonitorAdapter monitor)
            throws KiemInitializationException {

        if (monitor != null) {
            monitor.begin("SCCharts Simulation", 1);
        }

        try {
            // LOAD SCT FILE

            setSrcModelPath(srcModelPath);
            EObject stateOrSCG = myModel;

            // LOAD C FILE

            String cSCChartCCode = "";
            try (BufferedReader br = new BufferedReader(new FileReader(compilationPath.toFile()))) {
                String line = br.readLine();
                while (line != null) {
                    cSCChartCCode += line + System.lineSeparator();
                    line = br.readLine();
                }
            }

            if (cSCChartCCode.equals("")) {
                // compilation failed
                throw new KiemInitializationException("Unable to load CCode", true, null);
            }

            // Generate Simulation wrapper C code
            generateWrapperCode(stateOrSCG, cSCChartCCode);
            
        } catch (RuntimeException e) {
            throw new KiemInitializationException("Error compiling S program:\n\n "
                    + e.getMessage() + "\n\n", true, e);
        } catch (IOException e) {
            throw new KiemInitializationException("Error compiling S program:\n\n "
                    + e.getMessage() + "\n\n", true, e);
        } catch (InterruptedException e) {
            throw new KiemInitializationException("Error compiling S program:\n\n "
                    + e.getMessage() + "\n\n", true, e);
        }
    }

    /**
     * @param stateOrSCG 
     * @param cSCChartCCode 
     * @throws IOException 
     * @throws InterruptedException 
     * 
     */
    private void generateWrapperCode(EObject stateOrSCG, String cSCChartCCode) throws IOException, InterruptedException {
        String cSimulation = "";
        if (stateOrSCG instanceof State) {
            System.out.println("15");
            CSimulationSCChart cSimulationSCChart =
                    Guice.createInjector().getInstance(CSimulationSCChart.class);
            System.out.println("16");
            cSimulation = cSimulationSCChart.transform((State) stateOrSCG, "10000").toString();
        } else if (stateOrSCG instanceof SCGraph) {
            System.out.println("15");
            CSimulationSCG cSimulationSCG =
                    Guice.createInjector().getInstance(CSimulationSCG.class);
            System.out.println("16");
            cSimulation = cSimulationSCG.transform((SCGraph) stateOrSCG, "10000").toString();
        }
        // System.out.println("17 " + cSimulation);

        if (benchmark) {
            cSimulation = Benchmark.addTimingCode(cSimulation, "tick");
        }

        // Set a random output folder for the compiled files
        String outputFolder = ModelUtil.generateRandomTempOutputFolder();
        // System.out.println("18 " + outputFolder);

        String fileNameSCChart = "scchart.c";
        String outputFileSCChart = outputFolder + fileNameSCChart;
        // System.out.println("19 " + outputFileSCChart);
        writeOutputModel(outputFileSCChart, cSCChartCCode.getBytes());

        String fileNameSimulation = "simulation.c";
        String outputFileSimulation = outputFolder + fileNameSimulation;
        // System.out.println("20 " + outputFileSimulation);
        writeOutputModel(outputFileSimulation, cSimulation.getBytes());

        String includePath = getBundlePath("templates");
        // System.out.println("21 " + includePath);

        // Compile
        cExecution = new CExecution(outputFolder, benchmark);
        LinkedList<String> generatedSCFiles = new LinkedList<String>();
        generatedSCFiles.add(outputFileSimulation);
        // generatedSCFiles.add(outputFileSCChart);
        generatedSCFiles.add("-I " + includePath);
        String modelName = "SCG";
        if (myModel instanceof State) {
            modelName = ((State) myModel).getId();
        }
        cExecution.compile(generatedSCFiles, modelName, outputFileSCChart);
        // System.out.println("22 : Everything went fine");
    }

    /**
     * Write output model to file.
     * 
     * @param outputFile
     *            the output file
     * @param modelAsText
     *            the model as text
     */
    private static void writeOutputModel(String outputFile, byte[] model) {
        FileOutputStream out;
        try {
            out = new FileOutputStream(outputFile);
            out.write(model);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** The single s / kexpression extension. */
    private static KExpressionsValuedObjectExtensions kExpressionValuedObjectExtensions =
            new KExpressionsValuedObjectExtensions();

    /**
     * {@inheritDoc}
     */
    @Override
    public JSONObject doProvideInitialVariables() throws KiemInitializationException {
        // start execution of compiled program
        if (cExecution.isCompiled()) {
            try {
                cExecution.startExecution();
            } catch (IOException e) {
                throw new KiemInitializationException(
                        "SCCharts could not be started sucessfully.\n\n", true, e);
            }
        } else {
            throw new KiemInitializationException("SCCharts was not compiled sucessfully.\n\n",
                    true, null);
        }

        if (!cExecution.isStarted()) {
            throw new KiemInitializationException(
                    "Error running SCCharts. Compiled simulation does not exist.\n", true, null);
        }

        JSONObject res = new JSONObject();
        try {
            if (myModel != null
                    && kExpressionValuedObjectExtensions.getValuedObjects(myModel) != null) {
                for (ValuedObject valuedObject : kExpressionValuedObjectExtensions
                        .getValuedObjects(myModel)) {
                    if (kExpressionValuedObjectExtensions.isInput(valuedObject)
                            || kExpressionValuedObjectExtensions.isOutput(valuedObject)) {
                        res.accumulate(valuedObject.getName(), JSONSignalValues.newValue(false));
                    }
                }
            }
        } catch (JSONException e) {
            // ignore
        }
        return res;
    }

    /**
     * Gets the bundle path.
     * 
     * @param subDirectory
     *            the sub directory
     * @return the bundle path
     */
    private String getBundlePath(String subDirectory) {
        Bundle bundle = Platform.getBundle(SCChartsSimCPlugin.PLUGIN_ID);

        String bundleLocation = null;
        try {
            URL url =
                    FileLocator.toFileURL(FileLocator.find(bundle,
                            new org.eclipse.core.runtime.Path(subDirectory), null));
            IPath path = new org.eclipse.core.runtime.Path(url.getPath());
            bundleLocation = path.toOSString();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return bundleLocation;
    }
}
