/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.tsccharts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.xtext.ui.util.ResourceUtil;

import com.google.common.collect.HashMultimap;

import de.cau.cs.kieler.core.kexpressions.Declaration;
import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.Colors;
import de.cau.cs.kieler.core.krendering.HorizontalAlignment;
import de.cau.cs.kieler.core.krendering.KBackground;
import de.cau.cs.kieler.core.krendering.KContainerRendering;
import de.cau.cs.kieler.core.krendering.KLineWidth;
import de.cau.cs.kieler.core.krendering.KRectangle;
import de.cau.cs.kieler.core.krendering.KRenderingFactory;
import de.cau.cs.kieler.core.krendering.KRoundedRectangle;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.core.krendering.VerticalAlignment;
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.core.properties.Property;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KiCoProperties;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.KielerCompilerException;
import de.cau.cs.kieler.kitt.tracing.Tracing;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties;
import de.cau.cs.kieler.klighd.util.ModelingUtil;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.SCChartsFactory;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.tsccharts.handler.FileWriter;
import de.cau.cs.kieler.sccharts.tsccharts.handler.RequestType;
import de.cau.cs.kieler.sccharts.tsccharts.handler.TimingRequestResult;
import de.cau.cs.kieler.sccharts.tsccharts.transformation.TPPInformation;
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.scg.features.SCGFeatures;
import de.cau.cs.kieler.scg.s.features.CodeGenerationFeatures;
import de.cau.cs.kieler.scg.s.transformations.CodeGenerationTransformations;

/**
 * @author ima, als
 *
 */
public class TimingAnalysis extends Job {

    /**
     * Stores the original input SCChart.
     */
    public static final IProperty<State> INPUT_SCCHART = new Property<State>(
            "de.cau.cs.kieler.timing.input.scchart", null);

    public static final boolean DEBUG = false;
    public static final boolean DEBUG_VERBOSE = false;

    /**
     * Switch on/of highlighting.
     */
    public static final boolean HOTSPOT_HIGHLIGHTING = true;
    public static final boolean REGION_TIMING = true;

    /**
     * Megahertz for which the the milliseconds are calculated from the processor cycles.
     */
    private static int MEGAHERTZ = 80;
    
    /**
     * Number of digits behind the decimal point in the display of milliseconds
     */
    private static int DIGITS = 0;

    /**
     * Enumeration for the possible representations of timing values in the interactive timing
     * analysis.
     * 
     * @author ima
     *
     */
    public enum TimingValueRepresentation {
        PERCENT, CYCLES, MILLISECONDS;

        /**
         * {@inheritDoc}
         */
        @Override
        public String toString() {
            switch (this) {
            case PERCENT:
                return "Percentage";
            case CYCLES:
                return "Cycles";
            case MILLISECONDS:
                return "Milliseconds";
            default:
                return "";
            }
        }
    }

    private static HashMap<Pair<String, String>, Set<String>> debugTracingHistory =
            new HashMap<Pair<String, String>, Set<String>>();
    private String pluginId = "de.cau.cs.kieler.sccharts.tsccharts";
    private FileWriter fileWriter = new FileWriter();
    private Resource resource;
    private TimingAnnotationProvider timingAnnotationProvider = new TimingAnnotationProvider();
    // no side effects on runtime, so static OK here
    private static KRenderingExtensions renderingExtensions = new KRenderingExtensions();
    private State scchart;
    private HashMultimap<Region, WeakReference<KText>> timingLabels;
    private HashMap<Region, String> timingResults;
    private Region scchartDummyRegion;
    private HashMultimap<Region, WeakReference<KRectangle>> regionRectangles;
    private ArrayList<Region> wcpRegions = new ArrayList<Region>();
    private TimingValueRepresentation rep;
    private boolean highlight;

    /*
     * Private Constructor. This class is not meant to be instantiated other than by the static
     * startAnalysis method.
     */
    private TimingAnalysis(State rootState,
            HashMultimap<Region, WeakReference<KText>> regionLabels, Region scchartDummyRegion,
            Resource resource, HashMultimap<Region, WeakReference<KRectangle>> regionRectangles,
            boolean highlight, TimingValueRepresentation rep) {
        super("Timing Analysis");
        this.scchart = rootState;
        this.timingLabels = regionLabels;
        this.timingResults = new HashMap<Region, String>();
        this.scchartDummyRegion = scchartDummyRegion;
        this.resource = resource;
        this.regionRectangles = regionRectangles;
        this.highlight = highlight;
        this.rep = rep;
    }

    public static void startAnalysis(State rootState, KNode rootNode, ViewContext viewContext,
            boolean highlight, TimingValueRepresentation rep) {
        // It is normal that some nodes of the SCG will be mapped to null, because they belong to
        // the SCChart itself not to a Region of the SCChart (they cannot be attributed to the
        // outermost
        // Region in the root state, because there may be several of those). So we use a dummy
        // region to represent the SCChart in Timing Analysis.
        Region scchartDummyRegion = SCChartsFactory.eINSTANCE.createRegion();
        scchartDummyRegion.setId("SCChartDummyRegion");

        Resource resource = null;
        KielerCompilerContext context = viewContext.getProperty(KiCoProperties.COMPILATION_CONTEXT);
        if (context != null) {
            resource = context.getMainResource();
        } else {
            resource = rootState.eResource();
        }

        // Step 0: (Preprocessing)
        // Add timing labels (while still in synthesis run)

        // Hashmap contains weak references, thus the KGraph can be deleted completely while
        // timing analysis is running

        HashMultimap<Region, WeakReference<KText>> timingLabels = HashMultimap.create();
        HashMultimap<Region, WeakReference<KRectangle>> regionRectangles = HashMultimap.create();
        Iterator<EObject> graphIter =
                ModelingUtil.eAllContentsOfType2(rootNode, KNode.class, KContainerRendering.class,
                        KRectangle.class);
        while (graphIter.hasNext()) {
            EObject eObj = graphIter.next();
            if (eObj instanceof KRectangle) {
                KRectangle rect = (KRectangle) eObj;
                Object sourceElem = rect.getProperty(KlighdInternalProperties.MODEL_ELEMEMT);
                if (sourceElem instanceof Region) {
                    KText text = KRenderingFactory.eINSTANCE.createKText();
                    if (REGION_TIMING) {
                        text.setText("???/???");
                    }
                    renderingExtensions.setFontSize(text, 20);
                    renderingExtensions.setForegroundColor(text, 255, 0, 0);
                    renderingExtensions.setPointPlacementData(text, renderingExtensions.RIGHT, 5,
                            0, renderingExtensions.TOP, 1, 0, HorizontalAlignment.RIGHT,
                            VerticalAlignment.TOP, 5, 5, 0, 0);
                    rect.getChildren().add(text);
                    timingLabels.put((Region) sourceElem, new WeakReference<KText>(text));
                    regionRectangles.put((Region) sourceElem, new WeakReference<KRectangle>(rect));
                }
            }
        }
        KRectangle rectangle =
                (KRectangle) rootNode.getChildren().get(0).getData(KRoundedRectangle.class)
                        .getChildren().get(0);
        KText text = KRenderingFactory.eINSTANCE.createKText();
        text.setText("???");
        renderingExtensions.setFontSize(text, 24);
        renderingExtensions.setForegroundColor(text, 255, 0, 0);
        renderingExtensions.setPointPlacementData(text, renderingExtensions.RIGHT, 5, 0,
                renderingExtensions.TOP, 1, 0, HorizontalAlignment.RIGHT, VerticalAlignment.TOP, 5,
                5, 0, 0);
        rectangle.getChildren().add(text);
        timingLabels.put(null, new WeakReference<KText>(text));
        // start analysis job
        new TimingAnalysis(rootState, timingLabels, scchartDummyRegion, resource, regionRectangles,
                highlight, rep).schedule();
    }

    /**
     * {@inheritDoc}
     * 
     * @param ttpRegionMapping
     */
    @Override
    protected IStatus run(IProgressMonitor monitor) {
        long startTime = System.currentTimeMillis();
        // Step 1: Compile SCChart to sequentialized SCG

        if (monitor.isCanceled()) {
            // Stop as soon as possible when job canceled
            return Status.CANCEL_STATUS;
        }

        final KRenderingFactory renderingFactory = KRenderingFactory.eINSTANCE;
        KielerCompilerContext context =
                new KielerCompilerContext(SCGFeatures.SEQUENTIALIZE_ID
                        + ",*T_ABORT,*T_scg.basicblock.sc,*T_NOSIMULATIONVISUALIZATION,T_scg.ttp",
                        scchart);
        context.setProperty(Tracing.ACTIVE_TRACING, true);
        context.setProperty(INPUT_SCCHART, scchart);
        context.setAdvancedSelect(true);
        CompilationResult compilationResult = KielerCompiler.compile(context);

        if (!(compilationResult.getEObject() instanceof SCGraph)
                || compilationResult.getPostponedErrors().size() > 0) {
            if (!(compilationResult.getEObject() instanceof SCGraph)) {
                System.out.println("The scg sequentialization did not return an scg.");
            } else {
                System.out.println("The sequentialization yielded postponed Errors:\n");
                Iterator<KielerCompilerException> errorIterator =
                        compilationResult.getPostponedErrors().iterator();
                while (errorIterator.hasNext()) {
                    KielerCompilerException currentError = errorIterator.next();
                    System.out.println(currentError.getMessage() + "\n");
                }
            }
            return new Status(IStatus.ERROR, pluginId, "SCG sequentialization failed. (ITA)");
        }

        SCGraph scg = (SCGraph) compilationResult.getEObject();

        // get the auxiliary data on Timing Program Points
        int highestInsertedTPPNumber = -1;
        HashMap<String, Region> tppRegionMap = null;
        List<TPPInformation> tppInformations =
                compilationResult.getAuxiliaryData(TPPInformation.class);
        TPPInformation tppInformation = tppInformations.isEmpty() ? null : tppInformations.get(0);
        if (tppInformation != null) {
            highestInsertedTPPNumber = tppInformation.getHighestInsertedTPPNumber();
            tppRegionMap = tppInformation.getTPPRegionMapping();
        } else {
            return new Status(IStatus.ERROR, pluginId,
                    "The TPP insertion yielded no auxiliary information.");
        }

        context =
                new KielerCompilerContext(CodeGenerationFeatures.S_CODE_ID + ","
                        + CodeGenerationFeatures.TARGET_ID + ",T_"
                        + CodeGenerationTransformations.S2C_ID, scg);
        compilationResult = KielerCompiler.compile(context);

        if (compilationResult.getString() == null
                || compilationResult.getPostponedErrors().size() > 0) {
            if (compilationResult.getString() == null) {
                System.out.println("The code generation yielded no code string.");
            } else {
                System.out.println("The code generation yielded postponed Errors:\n");
                Iterator<KielerCompilerException> errorIterator =
                        compilationResult.getPostponedErrors().iterator();
                while (errorIterator.hasNext()) {
                    KielerCompilerException currentError = errorIterator.next();
                    System.out.println(currentError.getMessage() + "\n");
                }
            }
            return new Status(IStatus.ERROR, pluginId, "The code generation failed. (ITA)");
        }

        String code = compilationResult.getString();
        // Debug, can be removed
        System.out.print(code);

        // Step 5: Send C code to timing analyzer

        if (monitor.isCanceled()) {
            // Stop as soon as possible when job canceled
            return Status.CANCEL_STATUS;
        }
        String uriString = null;
        String fileName = null;
        String fileFolder = null;
        String fileLocationString = null;
        if (resource != null) {
            IFile file = ResourceUtil.getFile(resource);
            uriString = file.getLocationURI().toString();
            fileName = file.getName();
            fileLocationString = uriString.replace("file:", "");
            fileFolder = fileLocationString.replace(fileName, "");
        } else {
            return new Status(IStatus.ERROR, pluginId,
                    "The resource for the given model could not be found.");
        }

        // Make sure no outdated files (.ta, .c, .ta.out) linger
        String targetCodeLocationString = fileLocationString.replace(".sct", ".c");
        String taFileLocationString = fileLocationString.replace(".sct", ".ta");
        String taOutFileLocationString = fileLocationString.replace(".sct", ".ta.out");
        try {
            Files.deleteIfExists(Paths.get(targetCodeLocationString, ""));
            Files.deleteIfExists(Paths.get(taFileLocationString, ""));
            Files.deleteIfExists(Paths.get(taOutFileLocationString, ""));
        } catch (IOException e1) {
            System.out.println("IOException when deleting outdated timing files: \n");
            e1.printStackTrace();
        }
        try {
            ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
        } catch (CoreException e) {
            return new Status(IStatus.ERROR, pluginId, "Files could not be refreshed.");
        }

        // Workaround for validation with David Broman's tool that does not handle chars:
        String codeInt = code.replace("char", "int");
        code = codeInt;
        // Workaround end
        // Code additions to make the code stand-alone-executable
        StringBuilder codeAdditionBuilder = new StringBuilder();
        codeAdditionBuilder.append("\n\n/* Header file for Timing program points */"
                + "\n#include \"../tpp.h\"");
        String assumptionFile = uriString.replace(".sct", ".asu");
        String assumptionFilePath = assumptionFile.replace("file:", "");
        boolean assumptionFileFound =
                timingAnnotationProvider.writeStubs(assumptionFilePath, codeAdditionBuilder);
        if (!assumptionFileFound) {
            System.out.println("There are no assumptions on called functions found.");
        }
        System.out.println(codeAdditionBuilder.toString());
        String codeAdapted =
                code.replace("***/\nint", "***/" + codeAdditionBuilder.toString() + "\nint");
        code = codeAdapted;

        fileWriter.writeToFile(code, targetCodeLocationString);

        LinkedList<TimingRequestResult> resultList =
                generateTimingRequestFile(code, scchart, uriString, highestInsertedTPPNumber);

        Runtime rt = Runtime.getRuntime();
        String taFileName = fileName.replace(".sct", ".ta");
        String cFileName = fileName.replace(".sct", ".c");
        String command =
                "kta ta -compile " + fileFolder + cFileName + " -tafile " + fileFolder + taFileName;
        // String command = "/Users/ima/shared/ptc/bin/ptc " + requestFilePath;
        try {
            // System.out.println("Current value of PATH: \n" + System.getenv("PATH"));
            Process pr = rt.exec(command);
            // get the timing analysis tool's console output
            BufferedReader stdInput =
                    new BufferedReader(new InputStreamReader(pr.getInputStream()));
            BufferedReader stdError =
                    new BufferedReader(new InputStreamReader(pr.getErrorStream()));
            // read the output of the analysis tool
            System.out.println("Output from the timing analysis tool:");
            String s = null;
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
            // read error messages of the anylsis tool
            System.out.println("Error output from the timing analysis tool:");
            System.out.println("-----end of timing analysis tool output-------\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
            // wait for the timing analysis tool to complete its job
            pr.waitFor();
        } catch (IOException e) {
            return new Status(IStatus.ERROR, pluginId,
                    "The timing analysis tool could not be invoked." + e.getMessage());
        } catch (InterruptedException e) {
            return new Status(IStatus.ERROR, pluginId,
                    "The timing analysis tool invokation was interrupted");
        }

        // Refresh to make sure the .c file can be found
        try {
            ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
        } catch (CoreException e) {
            return new Status(IStatus.ERROR, pluginId, "Files could not be refreshed.");
        }

        // Step 6: Retrieve timing data and associate with regions

        if (monitor.isCanceled()) {
            // Stop as soon as possible when job canceled
            return Status.CANCEL_STATUS;
        }

        // construct uri, where the analysis tool will deposit the response file (.ta)
        String taFile = uriString.replace(".sct", ".ta.out");
        String taPath = taFile.replace("file:", "");

        int timingInformationFetch =
                timingAnnotationProvider.getTimingInformation(resultList, taPath, rep);
        if (timingInformationFetch == 1) {
            return new Status(IStatus.ERROR, pluginId, "The timing information file was not found");
        } else if (timingInformationFetch == 2) {
            return new Status(IStatus.ERROR, pluginId,
                    "An IO error occurred while timing information was retrieved from file.");
        }

        // calculate timing values for all regions and store a list of regions that belong to the
        // WCET path in wcpRegions for special display
        wcpRegions =
                extractTimingLabels(RequestType.FWCET, resultList, timingLabels, timingResults,
                        tppRegionMap, scchart);

        // Step 7: Feedback information back to the diagram

        if (monitor.isCanceled()) {
            // Stop as soon as possible when job canceled
            return Status.CANCEL_STATUS;
        }

        // nodeRegionMapping has moved to Transformation
        // if (DEBUG) {
        // debugTracing(nodeRegionMapping);
        // }

        // Changing diagram should be in UI thread (maybe ask chsch)
        new UIJob("Inserting timing data") {
            @Override
            public IStatus runInUIThread(IProgressMonitor monitor) {

                // get overallWCET
                Integer overallWCET = 0;
                String scchartTiming = timingResults.get(scchartDummyRegion);
                String timingResultChart = timingResults.get(null);
                if (scchartTiming != null) {
                    Integer timingResultSum =
                            Integer.parseInt(timingResultChart) + Integer.parseInt(scchartTiming);
                    overallWCET = timingResultSum;
                } else {
                    overallWCET = Integer.parseInt(timingResultChart);
                }

                for (Region region : timingLabels.keySet()) {
                    String timingResult = timingResults.get(region);
                    Set<WeakReference<KText>> labels = timingLabels.get(region);
                    for (WeakReference<KText> labelRef : labels) {
                        KText label = labelRef.get();
                        if (label != null) {
                            // String timingResult = timingResults.get(region);
                            // Special case: Timing for the whole SCChart
                            if (region == null) {
                                // get the timing for elements not attributed to a concrete region
                                // String scchartTiming = timingResults.get(scchartDummyRegion);
                                // add it to the timing for child regions
                                // if (scchartTiming != null) {
                                // Integer timingResultSum =
                                // Integer.parseInt(timingResult)
                                // + Integer.parseInt(scchartTiming);
                                // overallWCET = timingResultSum;
                                timingResult = overallWCET.toString();
                            }
                        }
                        // Adapt timing values, when representation is not in the default case
                        if (rep != TimingValueRepresentation.CYCLES) {
                            String newTimingResult =
                                    adaptTimingRepresentation(rep, timingResult, overallWCET);
                            if (REGION_TIMING || region == null) {
                                label.setText(newTimingResult);
                            }
                        } else {
                            if (REGION_TIMING || region == null) {
                                label.setText(timingResult);
                            }
                        }
                        // If the region belongs to the WCET path, enlarge numbers
                        if (wcpRegions.contains(region)) {
                            renderingExtensions.setFontSize(label, 24);
                        }
                    }
                    // If the region belongs to the WCET path, highlight, if requested by user
                    if (highlight && HOTSPOT_HIGHLIGHTING && wcpRegions.contains(region)) {
                        // determine how much percent of the overall WCET is attributed to this
                        // region
                        double percentage = 0.0;
                        if (timingResultChart != null) {
                            StringTokenizer resultTokenizer = new StringTokenizer(timingResult);
                            Double timingvalue = Double.parseDouble(resultTokenizer.nextToken());
                            double onePercent = overallWCET / 100.0;
                            percentage = timingvalue / onePercent;
                        }
                        highlightRegion(region, renderingFactory, percentage,
                                timingLabels.get(region));
                    }
                }

                return Status.OK_STATUS;
            }
        }.schedule();
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        // delete temporary files if not needed for debugging
        System.out.println("Interactive Timing Analysis completed (elapsed time: " + elapsedTime
                + " ms).");
        return Status.OK_STATUS;
    }

    /**
     * Writes a timing request file for the given C-code and SCChart. Reads a timing assumption
     * file from a given location and concatenates its content with automatically generated state
     * information and and timing requests for the fractional time value between each pair of
     * consecutive timing program points.
     * 
     * 
     * @param code
     *            The code in C language as String with inserted Timing Program Points.
     * @param scchart
     *            The SCChart represented by the code given as State.
     * @param uriString
     *            The location of the .sct file of the scchart given as an uri String
     *            representation.
     * @param highestInsertedTPPNumber
     *            The highest number of any TPP inserted in the code.
     * @return Returns the list of TimingRequestResults prepared for storing the analysis results
     */
    public static LinkedList<TimingRequestResult> generateTimingRequestFile(String code,
            State scchart, String uriString, int highestInsertedTPPNumber) {
        FileWriter assumptionFileWriter = new FileWriter();
        TimingAnnotationProvider assumptionTimingAnnotationProvider =
                new TimingAnnotationProvider();
        StringBuilder stringBuilder = new StringBuilder();

        // In any case we will ask for the analysis of the tick function
        stringBuilder.append("Function tick\nInitFunction reset\nState _GO");
        // Declare the state variables (corresponding to the registers, this is about execution
        // states)
        StringTokenizer codeTokenizer = new StringTokenizer(code);
        while (codeTokenizer.hasMoreTokens()) {
            String currentToken = codeTokenizer.nextToken();
            if (currentToken.startsWith("PRE")) {
                currentToken = currentToken.replace(";", "");
                stringBuilder.append("\nState " + currentToken);
            }
            if (currentToken.startsWith("reset")) {
                break;
            }
        }
        // Get the inputs for which we want to have globalvar assumptions
        // Note that at the moment we will generate globalvar assumptions automatically only for
        // boolean
        // inputs, others have to be specified in the .asu file
        // // First, add an assumption line for _GO, which will always be there, we treat it
        // analogously to
        // // environment inputs (as opposed to states)
        // stringBuilder.append("\nGlobalVar _GO 0..1");
        EList<Declaration> declarationList = scchart.getDeclarations();
        Iterator<Declaration> declarationListIterator = declarationList.iterator();
        while (declarationListIterator.hasNext()) {
            Declaration currentDeclaration = declarationListIterator.next();
            if (currentDeclaration.isInput()) {
                ValueType type = currentDeclaration.getType();
                if (type.equals(ValueType.BOOL) || type.equals(ValueType.PURE)) {
                    stringBuilder.append("\nGlobalVar "
                            + currentDeclaration.getValuedObjects().get(0).getName() + " 0..1");
                }
            }
        }
        // read (optional) additional assumptions and timing assumptions for called functions into
        // the
        // assumptions file
        String assumptionFile = uriString.replace(".sct", ".asu");
        String assumptionFilePath = assumptionFile.replace("file:", "");
        boolean assumptionFilePresent =
                assumptionTimingAnnotationProvider
                        .getAssumptions(assumptionFilePath, stringBuilder);
        if (!assumptionFilePresent) {
            System.out
                    .println("An associated assumption file for this model was not found. No timing "
                            + "assumptions for called functions available.");
        }
        System.out.println(stringBuilder.toString());
        // write timing requests appended to the assumptionString
        LinkedList<TimingRequestResult> resultList =
                assumptionTimingAnnotationProvider.writeTimingRequests(highestInsertedTPPNumber,
                        stringBuilder);
        // .ta file string complete, write it to file
        String requestFile = uriString.replace(".sct", ".ta");
        String requestFilePath = requestFile.replace("file:", "");
        System.out.println(stringBuilder.toString());
        assumptionFileWriter.writeToFile(stringBuilder.toString(), requestFilePath);
        return resultList;
    }

    /**
     * The method adapts the timing representation, if it is not in the default case
     * 
     * @param rep
     *            The timing representation chosen by the user
     * @param timingResult
     *            The timing Result, which has one of the formats "<number> / <number>" or <number>
     * @param overallWCET
     *            The overall WCET needed to calculate percentages
     */
    private String adaptTimingRepresentation(TimingValueRepresentation rep, String timingResult,
            Integer overallWCET) {
        String newTimingResult = "";
        StringTokenizer StringTokenizer = new StringTokenizer(timingResult);
        // If we represent in percentage, the overall timing value should stay untouched, in that
        // case
        // and only that case the String consists of only one number
        if (StringTokenizer.countTokens() > 1) {
            if (rep == TimingValueRepresentation.PERCENT) {
                double onePercent = overallWCET / 100.00;
                double FirstNumber = Double.parseDouble(StringTokenizer.nextToken());
                // throw away the "/"
                // TODO: Define delimiter set that renders this unnecessary
                StringTokenizer.nextToken();
                double SecondNumber = Double.parseDouble(StringTokenizer.nextToken());
                FirstNumber /= onePercent;
                SecondNumber /= onePercent;
                newTimingResult =
                        String.format("%.2f", FirstNumber) + " / "
                                + String.format("%.2f", SecondNumber);
            }
        } else {
            if (rep == TimingValueRepresentation.PERCENT) {
                newTimingResult = "100";
            }
        }
        if (rep == TimingValueRepresentation.MILLISECONDS) {
            while (StringTokenizer.hasMoreTokens()) {
                String token = StringTokenizer.nextToken();
                if (!token.equals("/")) {
                    double cycles = Double.parseDouble(token);
                    double timeInMillisecs = (cycles / (MEGAHERTZ * 1000.0));
                    newTimingResult += (String.format("%."+DIGITS+"f", timeInMillisecs));
                } else {
                    newTimingResult += (" " + token + " ");
                }
            }
        }
        return newTimingResult;
    };

    /**
     * The method highlightRegion adds red background color to the display of a region. In this the
     * darkness of the red color increases with increased the higher the percentage of overall WCET
     * that is attributed to this region.
     * 
     * @param region
     *            The region to be highlighted.
     * @param renderingFactory
     *            A renderingFactory
     * @param percentage
     *            The percentage of the region's fractional WCET in relation to overall WCET
     * @param labels
     *            The set with the timing labels of the regions of the model
     */
    private void highlightRegion(Region region, KRenderingFactory renderingFactory,
            double percentage, Set<WeakReference<KText>> labels) {
        Set<WeakReference<KRectangle>> rectangleRefs = regionRectangles.get(region);
        for (WeakReference<KRectangle> rectangleRef : rectangleRefs) {
            KRectangle regionRectangle = rectangleRef.get();
            KRectangle inner = KRenderingFactory.eINSTANCE.createKRectangle();
            regionRectangle.getChildren().add(0, inner);
            if (percentage > 50) {
                regionRectangle.getStyles().add(
                        renderingFactory.createKForeground().setColor(Colors.RED));
            }
            KBackground background = renderingFactory.createKBackground();
            // in casting percentage, all percentages below zero will be set to 0, thus they will
            // not
            // be marked as hot spots
            int alpha = (int) percentage;
            background.setAlpha(alpha);
            inner.getStyles().add(background.setColor(Colors.RED));
            if (percentage > 50) {
                final KLineWidth lwStyle = KRenderingFactory.eINSTANCE.createKLineWidth();
                lwStyle.setLineWidth(3);
                regionRectangle.getStyles().add(lwStyle);
                // the red numbers on red ground will not be readable well, so change them to black
                for (WeakReference<KText> labelRef : labels) {
                    KText label = labelRef.get();
                    renderingExtensions.setForegroundColor(label, 0, 0, 0);
                }
            }
        }
    }

    /**
     * Method extracts timing labels with format <deep timing value> / <flat timing value> for the
     * regions in the resultList.
     * 
     * @param requestType
     *            : The requestType for which the timing labels are to be extracted. The method
     *            expects either RequestType.LWCET, RequestType.LBCET, RequestType.FWCET or
     *            RequestType.FBCET
     * @param resultList
     *            A list with TimingRequestResults extracted from the timing analysis response file
     * @param timingLabelList
     *            A Map between the Regions of the SCChart which is to be annotated with timing
     *            values and References to the associated labels
     * @param regionLabelStringMap
     *            A Map between Regions and the Strings that will be the timing information labels
     *            to feed back to the diagram
     * @param tppRegionMap
     *            A Mapping between Timing Program Points and Regions
     * @param rootState
     * @return Returns a list of the Regions that are on the WCET path
     */
    private ArrayList<Region> extractTimingLabels(RequestType requestType,
            LinkedList<TimingRequestResult> resultList,
            HashMultimap<Region, WeakReference<KText>> timingLabelList,
            HashMap<Region, String> regionLabelStringMap, HashMap<String, Region> tppRegionMap,
            State rootState) {
        // retrieve WCET path
        LinkedList<String> wcp = resultList.getLast().getResult();
        // set up list for Regions that are on the WCET path
        ArrayList<Region> wcpRegions = new ArrayList<Region>();
        // get the associated Region for every step of the path result
        // (which f.e. looks like: entry, 1, 4, 7, exit)
        Iterator<String> pathIterator = wcp.iterator();
        while (pathIterator.hasNext()) {
            String step = pathIterator.next();
            // exit is not attributed to a region, it can be no start TPP
            if (step != "exit") {
                Region currentRegion = tppRegionMap.get(step);
                if (currentRegion != null) {
                    wcpRegions.add(currentRegion);
                }
            }
        }
        HashMap<Region, Integer> deepValues = new HashMap<Region, Integer>();
        HashMap<Region, Integer> flatValues = new HashMap<Region, Integer>();
        Iterator<TimingRequestResult> resultListIterator = resultList.iterator();
        // fill the map for flat values
        while (resultListIterator.hasNext()) {
            TimingRequestResult currentResult = resultListIterator.next();
            if (currentResult.getRequestType() == requestType) {
                Region resultRegion;
                String startPoint = currentResult.getStartPoint();
                resultRegion = tppRegionMap.get(startPoint);
                if (flatValues.get(resultRegion) == null) {
                    flatValues
                            .put(resultRegion, Integer.parseInt(currentResult.getResult().get(0)));
                } else {
                    // there may be more than one timing result for a region, sum the values up
                    flatValues.put(
                            resultRegion,
                            flatValues.get(resultRegion)
                                    + Integer.parseInt(currentResult.getResult().get(0)));
                }
            }
        }
        calculateDeepTimingValues(rootState, flatValues, deepValues);
        Iterator<Region> regionIterator = timingLabelList.keySet().iterator();
        while (regionIterator.hasNext()) {
            Region currentRegion = regionIterator.next();
            if (!(currentRegion == null)) {
                // Possibly we have to mark this region as part of the WCET path (WCP)
                String label =
                        flatValues.get(currentRegion) + " / " + deepValues.get(currentRegion);
                regionLabelStringMap.put(currentRegion, label);
            } else {
                Integer WCRT = 0;
                Iterator<Region> outerRegionsIterator = rootState.getRegions().iterator();
                while (outerRegionsIterator.hasNext()) {
                    Region nextRegion = outerRegionsIterator.next();
                    Integer currentValue = deepValues.get(nextRegion);
                    WCRT = WCRT + currentValue;
                }
                // get the timing for the parts of the scchart that are not attributed to a region
                Integer dummyTiming = flatValues.get(scchartDummyRegion);
                if (dummyTiming != null) {
                    WCRT = WCRT + dummyTiming;
                }
                regionLabelStringMap.put(currentRegion, WCRT.toString());
            }
        }
        return wcpRegions;
    }

    /**
     * The method takes a state and a Mapping between Regions and Integer values. For each region,
     * it sums up the values for its child regions and itself and puts the result in a map
     * associating regions with their deep timing values. It works recursively from state down to
     * the innermost states of the given scchart.
     * 
     * @param state
     *            The current state, in the original call the sccchart root state
     * @param flatValues
     *            Mapping of Regions to their flat timing values.
     * @param deepValues
     *            Mapping of Regions to their hierarchical timing values. Empty on first call.
     */
    private void calculateDeepTimingValues(State state, HashMap<Region, Integer> flatValues,
            HashMap<Region, Integer> deepValues) {
        EList<Region> regionList = state.getRegions();
        // base case is a state with
        Iterator<Region> regionListIterator = regionList.iterator();
        List<State> macroChildStates = timingAnnotationProvider.getMacroChildStates(state);
        if (!macroChildStates.isEmpty()) {
            Iterator<State> macroChildStatesIterator = macroChildStates.iterator();
            while (macroChildStatesIterator.hasNext()) {
                State macroChild = macroChildStatesIterator.next();
                calculateDeepTimingValues(macroChild, flatValues, deepValues);
            }
        }
        while (regionListIterator.hasNext()) {
            Region childRegion = regionListIterator.next();
            // Add the region's own flat value to its deep value
            Integer flatTiming = flatValues.get(childRegion);
            // It is possible that there is no flat timing value stored for a region, set to zero
            if (flatTiming == null) {
                flatTiming = 0;
                flatValues.put(childRegion, flatTiming);
            }
            if (deepValues.get(childRegion) != null) {
                deepValues.put(childRegion, deepValues.get(childRegion) + flatTiming);
            } else {
                deepValues.put(childRegion, flatTiming);
            }
            Integer deepTiming = deepValues.get(childRegion);
            // Add deep timing value of this region to the hierarchical timing value of its parent
            // region
            Region stateParentRegion = state.getParentRegion();
            if (stateParentRegion != null) {
                if (deepValues.get(stateParentRegion) != null) {
                    deepValues.put(stateParentRegion, deepValues.get(stateParentRegion)
                            + deepTiming);
                } else {
                    deepValues.put(stateParentRegion, deepTiming);
                }
            }

        }
    }

    // // DEBUG METHODS
    //
    // private void debugTracing(HashMap<Node, Region> nodeRegionMapping) {
    // // get all regions
    // Set<Region> regions = new HashSet<Region>(nodeRegionMapping.values());
    // regions.addAll(Arrays.asList((Iterators.toArray(
    // Iterators.filter(scchart.eAllContents(), Region.class), Region.class))));
    //
    // for (Region r : regions) {
    // String regionID = r == null ? "root" : r.getId();
    // if (regionID == null) {
    // State parentState = r.getParentState();
    // regionID =
    // parentState.getId() + parentState.getLabel()
    // + parentState.getRegions().indexOf(r) + r.getLabel();
    // } else if (r != null) {
    // regionID += r.getLabel();
    // }
    // Pair<String, String> pair =
    // new Pair<String, String>((scchart.getId() + scchart.getLabel()), regionID);
    // Set<String> prev = debugTracingHistory.get(pair);
    //
    // Set<String> results = new HashSet<String>();
    // for (java.util.Map.Entry<Node, Region> entry : nodeRegionMapping.entrySet()) {
    // if (entry.getValue() == r) {
    // results.add(nodeToString(entry.getKey()));
    // }
    // }
    //
    // if (prev == null) {
    // debugTracingHistory.put(pair, results);
    // } else if (results.size() != prev.size()
    // || !Sets.symmetricDifference(results, prev).isEmpty()) {
    // String message = "Error: Tracing produced inconsistent mappings over multiple run";
    // String fails =
    // "Errornous nodes of region '" + regionID + "': "
    // + Joiner.on(",").join(Sets.symmetricDifference(results, prev));
    // StatusManager.getManager().handle(
    // new Status(IStatus.ERROR, Activator.PLUGIN_ID, message,
    // new Throwable(fails)), StatusManager.LOG);
    // StatusManager.getManager().handle(
    // new Status(IStatus.ERROR, Activator.PLUGIN_ID, message,
    // new Throwable(fails)), StatusManager.SHOW);
    // }
    //
    // if (DEBUG_VERBOSE) {
    // timingResults.put(r, Joiner.on(",").join(results) + "[" + results.size() + "]");
    // }
    // }
    // }
    // private String nodeToString(Node node) {
    // if (node instanceof Assignment) {
    // ValuedObject vo = ((Assignment) node).getValuedObject();
    // if (vo != null) {
    // return "Ass:" + vo.getName();
    // } else {
    // return "Hostcode";
    // }
    // } else if (node instanceof Conditional) {
    // return "Cond:"
    // + ((ValuedObjectReference) ((Conditional) node).getCondition())
    // .getValuedObject().getName();
    // } else {
    // return node.eClass().getName();
    // }
    // }
}
