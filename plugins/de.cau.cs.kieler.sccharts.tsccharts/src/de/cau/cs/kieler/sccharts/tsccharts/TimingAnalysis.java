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
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
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
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.ui.util.ResourceUtil;

import com.google.common.base.Joiner;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Iterators;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.inject.Guice;

import de.cau.cs.kieler.core.kexpressions.Declaration;
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;
import de.cau.cs.kieler.core.kexpressions.TextExpression;
import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference;
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
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.kico.AbstractKielerCompilerAuxiliaryData;
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
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension;
import de.cau.cs.kieler.sccharts.tsccharts.handler.FileWriter;
import de.cau.cs.kieler.sccharts.tsccharts.handler.RequestType;
import de.cau.cs.kieler.sccharts.tsccharts.handler.TimingRequestResult;
import de.cau.cs.kieler.sccharts.tsccharts.transformation.TTPFeature;
import de.cau.cs.kieler.sccharts.tsccharts.transformation.TimingAnalysisTransformations;
import de.cau.cs.kieler.scg.Assignment;
import de.cau.cs.kieler.scg.Conditional;
import de.cau.cs.kieler.scg.ControlFlow;
import de.cau.cs.kieler.scg.Entry;
import de.cau.cs.kieler.scg.Exit;
import de.cau.cs.kieler.scg.Link;
import de.cau.cs.kieler.scg.Node;
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.scg.ScgFactory;
import de.cau.cs.kieler.scg.features.SCGFeatures;
import de.cau.cs.kieler.scg.s.features.CodeGenerationFeatures;
import de.cau.cs.kieler.scg.s.transformations.CodeGenerationTransformations;
import de.cau.cs.kieler.sccharts.tsccharts.transformation.TPPInformation;

/**
 * @author ima, als
 *
 */
public class TimingAnalysis extends Job {

    private static int MEGAHERTZ = 200;
    private static boolean FRACTIONAL = true;

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

    public static final boolean DEBUG = false;
    public static final boolean DEBUG_VERBOSE = false;
    public static final boolean HOTSPOT_HIGHLIGHTING = true;
    public static final boolean REGION_TIMING = true;

    private String pluginId = "de.cau.cs.kieler.sccharts.tsccharts";

    private FileWriter fileWriter = new FileWriter();

    private Resource resource;

    private TimingAnnotationProvider timingAnnotationProvider = new TimingAnnotationProvider();

    // no side effects on runtime, so static OK here
    private static KRenderingExtensions renderingExtensions = new KRenderingExtensions();
    private static SCChartsExtension scchartsExtension = Guice.createInjector().getInstance(
            SCChartsExtension.class);

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
                        renderingExtensions.setFontSize(text, 10);
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
        renderingExtensions.setFontSize(text, 20);
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

    private State scchart;
    private HashMultimap<Region, WeakReference<KText>> timingLabels;
    private HashMap<Region, String> timingResults;
    private Region scchartDummyRegion;
    private HashMultimap<Region, WeakReference<KRectangle>> regionRectangles;
    private ArrayList<Region> wcpRegions = new ArrayList<Region>();
    private TimingValueRepresentation rep;
    private boolean highlight;

    /**
     * @param name
     * @param rootState
     * @param scchartDummyRegion
     * @param regionRectangles
     * @param highlight
     * @param rep
     * @param rootNode
     */
    public TimingAnalysis(State rootState, HashMultimap<Region, WeakReference<KText>> regionLabels,
            Region scchartDummyRegion, Resource resource,
            HashMultimap<Region, WeakReference<KRectangle>> regionRectangles, boolean highlight,
            TimingValueRepresentation rep) {
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
                        + ",*T_ABORT,*T_scg.basicblock.sc,*T_NOSIMULATIONVISUALIZATION,T_scg.ttp", scchart);
        context.setProperty(Tracing.ACTIVE_TRACING, true);
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
            return new Status(IStatus.ERROR, pluginId, "SCG sequentialization failed.");
        }

        SCGraph scg = (SCGraph) compilationResult.getEObject();
     
       // get the auxiliary data on Timing Program Points
       int highestInsertedTPPNumber = -1;
       HashMap<String, Region> tppRegionMap = null;
       List<TPPInformation> tppInformations = compilationResult.getAuxiliaryData(TPPInformation.class);
       TPPInformation tppInformation = tppInformations.isEmpty()? null : tppInformations.get(0);
       if (tppInformation != null) {
           highestInsertedTPPNumber = tppInformation.getHighestInsertedTPPNumber();
           tppRegionMap = tppInformation.getTPPRegionMapping();
       } else {
           return new Status(IStatus.ERROR, pluginId, "The TPP insertion yielded no auxiliary information.");
       }
      
        
        // just testing the TPPTransformation, can be removed.
        
//        KielerCompilerContext testContextTPP = new KielerCompilerContext(TimingAnalysisTransformations.TTP_FEATURE_ID, scg);
//        CompilationResult ttpSCG = KielerCompiler.compile(testContextTPP);
//        SCGraph testSCG = (SCGraph) ttpSCG.getEObject();
        
        // testing TPPTransformation testing end
        
        // to Transformation
//        List<Tracing> tracings = compilationResult.getAuxiliaryData(Tracing.class);
//        Tracing tracing = tracings.isEmpty() ? null : tracings.get(0);
//
//        if (tracing == null) {
//            return new Status(IStatus.ERROR, pluginId,
//                    "The tracing is not activated for the given model.");
//        }

//        // Step 2: Analyse tracing relation into a node to region mapping
//// to transformation end
//        if (monitor.isCanceled()) {
//            // Stop as soon as possible when job canceled
//            return Status.CANCEL_STATUS;
//        }
//// to transformation
//        Multimap<Object, Object> mapping = tracing.getMapping(scg, scchart);
//        HashMap<Node, Region> nodeRegionMapping =
//                new HashMap<Node, Region>(mapping.keySet().size());
//        HashMap<Region, Integer> regionDepth = TimingUtil.createRegionDepthMap(scchart);
//        for (Object originElement : mapping.keySet()) {
//            if (originElement instanceof Node) {
//                Collection<Object> targetElements = mapping.get(originElement);
//                Region region = null;
//                int depth = -1;
//                for (Object targetObj : targetElements) {
//                    EObject targetElement = (EObject) targetObj;
//                    /*
//                     * If the associated element is NOT a macro state (refinement due to entry node
//                     * mappings in tracing in combination with guards) a region is searched to
//                     * associate this node to. Except the macro state is the only associated
//                     * element.
//                     */
//                    if (!(targetElement instanceof State && (scchartsExtension
//                            .hasInnerStatesOrControlflowRegions((State) targetElement)))
//                            || targetElements.size() == 1) {
//                        while (targetElement != null) {
//                            if (targetElement instanceof Region) {
//                                Region newRegionCandidate = (Region) targetElement;
//                                int candidateDepth = regionDepth.get(newRegionCandidate);
//                                /*
//                                 * If new region candidate has a strictly greater depth than the
//                                 * current region the new candidate becomes the region this node is
//                                 * associated with. Otherwise the region is contained in the new
//                                 * candidate and is ignored. Assumption: No node is mapped to
//                                 * elements in parallel Regions
//                                 */
//                                if (candidateDepth > depth) {
//                                    region = newRegionCandidate;
//                                    depth = candidateDepth;
//                                }
//                                break;
//                            } else {
//                                targetElement = targetElement.eContainer();
//                            }
//                        }
//                    }
//                }
//                nodeRegionMapping.put((Node) originElement, region);
//            }
//        }
//        
//        // to transformation end
//
//        // Step 3: Calculate timing blocks and add additional timing mark nodes into SCG
//
//        if (monitor.isCanceled()) {
//            // Stop as soon as possible when job canceled
//            return Status.CANCEL_STATUS;
//        }
//        
//        
//        //to transformation
//        HashMap<String, Region> tppRegionMap = new HashMap<String, Region>();
//
//        // insert timing program points
//        int highestInsertedTPPNumber =
//                insertTPP(scg, nodeRegionMapping, tppRegionMap, scchartDummyRegion);
//        // to transformation end
//        
//        // Step 4: Compile SCG to C code
//
//        if (monitor.isCanceled()) {
//            // Stop as soon as possible when job canceled
//            return Status.CANCEL_STATUS;
//        }

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
            return new Status(IStatus.ERROR, pluginId, "The code generation failed.");
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

        // Generate the timing request file with the assumptions
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
        boolean assumptionFilePresent =
                timingAnnotationProvider.getAssumptions(assumptionFilePath, stringBuilder);
        if (!assumptionFilePresent) {
            System.out
                    .println("An associated assumption file for this model was not found. No timing "
                            + "assumptions for called functions available.");
        }
        // write timing requests appended to the assumptionString
        LinkedList<TimingRequestResult> resultList =
                timingAnnotationProvider.writeTimingRequests(highestInsertedTPPNumber,
                        stringBuilder);
        // .ta file string complete, write it to file
        String requestFile = uriString.replace(".sct", ".ta");
        String requestFilePath = requestFile.replace("file:", "");
        fileWriter.writeToFile(stringBuilder.toString(), requestFilePath);

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
//        if (DEBUG) {
//            debugTracing(nodeRegionMapping);
//        }

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
                            renderingExtensions.setFontSize(label, 18);
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
                    newTimingResult += (String.format("%.5f", timeInMillisecs));
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
                regionLabelStringMap.put(currentRegion, flatValues.get(currentRegion) + " / "
                        + deepValues.get(currentRegion));
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
    
    // goes to transformation
    /**
     * The method checks all edges of the SCG and finds edges, where source and target node are
     * associated with different regions from the original SCChart, of which the SCG is a
     * compilation result. This means, the method determines, at which edges of the SCG a context
     * switch between threads happens (which is determined with the help of a map provided by
     * tracing). Into those edges, it inserts Assignment nodes with a Timing Program Point (TPP) for
     * the interface of Interactive Timing Analysis.
     * 
     * @param scg
     *            A sequential SCG, into which timing program points are to be inserted.
     * @param nodeRegionMapping
     *            A map determined by tracing, which relates the nodes of a sequential SCG with
     *            regions of the corresponding SCChart.
     * @param tppRegionMap
     *            A map, into which the method stores the related region for each TPP (which will be
     *            the one corresponding to the thread, to which the context is switched a the
     *            location where the TPP is inserted.
     * @param scchartDummyRegion
     * @param debugNodeList
     * @return returns -1, if the TPP-insertion ran into a problem else the highest inserted TPP
     *         number
     */
    private int insertTPP(SCGraph scg, HashMap<Node, Region> nodeRegionMapping,
            HashMap<String, Region> tppRegionMap, Region scchartDummyRegion) {
        // Get all edges of the sequential scg
        // get the SCG nodes in fixed traversing order (top to bottom, then branch first)
        LinkedList<ControlFlow> edgeList = getEdgesInFixedTraversingOrder(scg);
        Iterator<ControlFlow> edgeListIterator = edgeList.iterator();
        ArrayList<Link> redirectedEdges = new ArrayList<Link>();
        // insertion starts with TPP(1);
        Integer tppCounter = 1;
        // Preprocessing step: Assign the first Region to the entry TPP
        ControlFlow firstEdge = edgeList.getFirst();
        Region firstSourceRegion =
                getSourceRegion(firstEdge, nodeRegionMapping, scchartDummyRegion);
        tppRegionMap.put("entry", firstSourceRegion);
        while (edgeListIterator.hasNext()) {
            if (tppCounter == 13) {
                // avoid a TPP with the number 13, as this one has a special meaning for the timing
                // analysis tool prototype
                tppCounter = 1 + tppCounter;
            }
            ControlFlow currentEdge = edgeListIterator.next();
            Node edgeTarget = currentEdge.getTarget();
            // get the region the target node of the edge stems from
            Region targetRegion = nodeRegionMapping.get(edgeTarget);
            if (targetRegion == null) {
                // It is normal that nodes of the SCG get mapped to null, if they are considered to
                // belong to the scchart but not to one of its regions, for the timing analysis,
                // they are attributed to a dummy region representing all parts of the scchart that
                // does not belong to a region (thus enabling us to keep track of the timing for
                // those
                // parts
                targetRegion = scchartDummyRegion;
            }
            Region sourceRegion =
                    getSourceRegion(currentEdge, nodeRegionMapping, scchartDummyRegion);
            // // get the region the source node of the edge stems from
            // EObject edgeEContainer = currentEdge.eContainer();
            // Node sourceNode = null;
            // if (edgeEContainer instanceof Node) {
            // sourceNode = (Node) edgeEContainer;
            // } else {
            // // source node of edge could not be determined
            // return -1;
            // }
            // Region sourceRegion = nodeRegionMapping.get(sourceNode);
            // if (sourceRegion == null) {
            // // Nodes that do not belong to a region are attributed to the scchart dummy region
            // sourceRegion = scchartDummyRegion;
            // }
            // check if the mapping has yielded a complete answer
            if ((targetRegion != null) && (sourceRegion != null)) {
                // check for a context switch, in any other case nothing will be done
                if (!(sourceRegion.equals(targetRegion))) {
                    // also, if this edge has been visited before, there is nothing to do (important
                    // for edges that have the same target node as other edges)
                    if (!(redirectedEdges.contains(currentEdge))) {
                        // now this edge is processed, record that
                        redirectedEdges.add(currentEdge);
                        // insert tpp node, keep it for the redirection of other edges
                        Assignment tpp =
                                insertSingleTPP(scg, currentEdge, tppCounter, redirectedEdges);
                        // Save which Region starts at this TPP value
                        tppRegionMap.put((tppCounter).toString(), targetRegion);
                        tppCounter = tppCounter + 1;
                        // make sure that all edges that also point to the same target node as the
                        // current edge did before redirection are redirected to the TPP as well
                        EList<Link> targetIncomingEdges = edgeTarget.getIncoming();
                        if (targetIncomingEdges.size() > 1) {
                            Iterator<Link> targetIncomingIterator = targetIncomingEdges.iterator();
                            while (targetIncomingIterator.hasNext()) {
                                Link redirectionLink = targetIncomingIterator.next();
                                if ((!(currentEdge.equals(redirectionLink)))
                                        && (!(redirectedEdges.contains(redirectionLink)))) {
                                    redirectionLink.setTarget(tpp);
                                    redirectedEdges.add(redirectionLink);
                                }
                            }
                        }
                    }
                }
            } else {
                // a mapping for at least one of the nodes could not be determined
                System.out.println("A mapping for at least one node of an edge cannot be found.");
            }
        }
        return tppCounter - 1;
    }
    // end goes to transformation

    // goes to transformation
    /**
     * This method retrieves the region the source node of the controlFlow edge given as a parameter
     * is attributed to.
     * 
     * @param nodeRegionMapping
     *            The given mapping of nodes to regions
     * @param scchartDummyRegion
     *            The dummy region representing the SCChart itself (for not all elements can
     *            attributed to regions of the SCChart and are then attributed to the SCChart, resp.
     *            its dummy region)
     * @param controlFlow
     *            The edge for which the start node region ist to be determined
     * @return Returns the Region the source node of the controlFlow edge belongs to. Returns null,
     *         if the edge container is no Node.
     */
    private Region getSourceRegion(ControlFlow controlFlow,
            HashMap<Node, Region> nodeRegionMapping, Region scchartDummyRegion) {
        // get the region the source node of the edge stems from
        EObject edgeEContainer = controlFlow.eContainer();
        Node sourceNode = null;
        if (edgeEContainer instanceof Node) {
            sourceNode = (Node) edgeEContainer;
        } else {
            // source node of edge could not be determined
            return null;
        }
        Region sourceRegion = nodeRegionMapping.get(sourceNode);
        if (sourceRegion == null) {
            // Nodes that do not belong to a region are attributed to the scchart dummy region
            sourceRegion = scchartDummyRegion;
        }
        return sourceRegion;
    }
    // end goes to transformation

    // goes to transformation
    /**
     * Creates a linked list of all controlflow edges of a sequential scg in fixed traversing order,
     * meaning top to bottom, then-branches first.
     * 
     * @param The
     *            sequential SCG
     * @return The linked list with all controlflow edges in the graph traversal order top to
     *         bottom, then branches first.
     */
    private LinkedList<ControlFlow> getEdgesInFixedTraversingOrder(SCGraph scg) {
        LinkedList<ControlFlow> edgeList = new LinkedList<ControlFlow>();
        // Find start entry node
        Iterator<Entry> entryIter =
                Iterators.filter(ModelingUtil.eAllContentsOfType2(scg, Node.class), Entry.class);
        Node entry = null;
        while (entryIter.hasNext()) {
            Entry currentEntry = entryIter.next();
            if (currentEntry.getIncoming().size() == 0) {
                entry = (Node) currentEntry;
            }
        }
        traverseSequentialGraphEdges(entry, edgeList);
        return edgeList;
    }
    // end goes to transformation

    // goes to transformation
    /**
     * Recursive method to collect the edges of a sequential SCG in the traversing order top to
     * bottom, then branch first. The method relies on the special structure of the sequential SCG:
     * there are no nested conditionals and only the then branches of a conditional have content.
     * Assumes that there are no empty then branches.
     * 
     * @param currentNode
     *            The sequential SCG entry node, else the currentNode
     * @param edgeList
     *            The list to add the edges in traversing order, empty in initial call
     */
    private void traverseSequentialGraphEdges(Node currentNode, LinkedList<ControlFlow> edgeList) {
        // There is only one Entry node in a sequential SCG, this is the start call
        if (currentNode instanceof Entry) {
            ControlFlow outgoingEdge = ((Entry) currentNode).getNext();
            edgeList.add(outgoingEdge);
            traverseSequentialGraphEdges(outgoingEdge.getTarget(), edgeList);
        } else {
            // There is only one Exit node in a sequential SCG, if we reach it, we are finished.
            if (currentNode instanceof Exit) {
                return;
            } else {
                if (currentNode instanceof Conditional) {
                    // We do then branch first order
                    ControlFlow thenEdge = ((Conditional) currentNode).getThen();
                    edgeList.add(thenEdge);
                    traverseSequentialGraphEdges(thenEdge.getTarget(), edgeList);
                } else {
                    if (currentNode instanceof Assignment) {
                        ControlFlow outgoingEdge = ((Assignment) currentNode).getNext();
                        edgeList.add(outgoingEdge);
                        // check whether this node ends a then branch, if so, add the else edge to
                        // the
                        // list also
                        EList<Link> targetIncomingList = outgoingEdge.getTarget().getIncoming();
                        if (targetIncomingList.size() > 1) {
                            Iterator<Link> incomingEdgeIterator = targetIncomingList.iterator();
                            while (incomingEdgeIterator.hasNext()) {
                                Link currentLink = incomingEdgeIterator.next();
                                if (!(currentLink == outgoingEdge)) {
                                    edgeList.add((ControlFlow) currentLink);
                                }
                            }
                        }
                        traverseSequentialGraphEdges(outgoingEdge.getTarget(), edgeList);
                    }
                }
            }
        }
    }
    // goes to transformation

    // goes to transformation
    /**
     * Method inserts a single timing program point for interactive timing analysis in the edge
     * given as parameter controlFlow. This happens by inserting an Assignment with the TPP as text
     * expression as new target of the edge and connecting it by a new edge with the original target
     * of the edge.
     * 
     * @param controlFlow
     *            The edge, into which the TPP node is to be inserted.
     * @param tppNumber
     *            The number of the TPP to be created, for example the 2 in 'TPP(2);'
     * @param redirectedEdges
     *            The list of already redirectedEdges, into which the newly created edge has to be
     *            inserted to keep it from being redirected again
     * @return The Assignment wit the TPP
     */
    private Assignment insertSingleTPP(SCGraph scg, ControlFlow controlFlow, int tppNumber,
            ArrayList<Link> redirectedEdges) {
        // make target reachable via a new edge
        Node target = controlFlow.getTarget();
        ControlFlow newEdge = ScgFactory.eINSTANCE.createControlFlow();
        redirectedEdges.add(newEdge);
        newEdge.setTarget(target);
        // prepare assignment node with the tpp
        Assignment tpp = ScgFactory.eINSTANCE.createAssignment();
        TextExpression tppText = KExpressionsFactory.eINSTANCE.createTextExpression();
        tppText.setText("TPP(" + tppNumber + ")");
        tpp.setAssignment(tppText);
        // insert the new assignment node in the edge
        tpp.setNext(newEdge);
        controlFlow.setTarget(tpp);
        scg.getNodes().add(tpp);
        return tpp;
    }
    // end goes to transformation

    // DEBUG METHODS

    private void debugTracing(HashMap<Node, Region> nodeRegionMapping) {
        // get all regions
        Set<Region> regions = new HashSet<Region>(nodeRegionMapping.values());
        regions.addAll(Arrays.asList((Iterators.toArray(
                Iterators.filter(scchart.eAllContents(), Region.class), Region.class))));

        for (Region r : regions) {
            String regionID = r == null ? "root" : r.getId();
            if (regionID == null) {
                State parentState = r.getParentState();
                regionID =
                        parentState.getId() + parentState.getLabel()
                                + parentState.getRegions().indexOf(r) + r.getLabel();
            } else if (r != null) {
                regionID += r.getLabel();
            }
            Pair<String, String> pair =
                    new Pair<String, String>((scchart.getId() + scchart.getLabel()), regionID);
            Set<String> prev = debugTracingHistory.get(pair);

            Set<String> results = new HashSet<String>();
            for (java.util.Map.Entry<Node, Region> entry : nodeRegionMapping.entrySet()) {
                if (entry.getValue() == r) {
                    results.add(nodeToString(entry.getKey()));
                }
            }

            if (prev == null) {
                debugTracingHistory.put(pair, results);
            } else if (results.size() != prev.size()
                    || !Sets.symmetricDifference(results, prev).isEmpty()) {
                String message = "Error: Tracing produced inconsistent mappings over multiple run";
                String fails =
                        "Errornous nodes of region '" + regionID + "': "
                                + Joiner.on(",").join(Sets.symmetricDifference(results, prev));
                StatusManager.getManager().handle(
                        new Status(IStatus.ERROR, Activator.PLUGIN_ID, message,
                                new Throwable(fails)), StatusManager.LOG);
                StatusManager.getManager().handle(
                        new Status(IStatus.ERROR, Activator.PLUGIN_ID, message,
                                new Throwable(fails)), StatusManager.SHOW);
            }

            if (DEBUG_VERBOSE) {
                timingResults.put(r, Joiner.on(",").join(results) + "[" + results.size() + "]");
            }
        }
    }

    private String nodeToString(Node node) {
        if (node instanceof Assignment) {
            ValuedObject vo = ((Assignment) node).getValuedObject();
            if (vo != null) {
                return "Ass:" + vo.getName();
            } else {
                return "Hostcode";
            }
        } else if (node instanceof Conditional) {
            return "Cond:"
                    + ((ValuedObjectReference) ((Conditional) node).getCondition())
                            .getValuedObject().getName();
        } else {
            return node.eClass().getName();
        }
    }
}
