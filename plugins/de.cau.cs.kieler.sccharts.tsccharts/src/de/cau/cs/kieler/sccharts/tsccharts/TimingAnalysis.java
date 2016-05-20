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
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.xtext.ui.util.ResourceUtil;

import com.google.common.collect.HashMultimap;

import de.cau.cs.kieler.core.kexpressions.Declaration;
import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.core.krendering.KRectangle;
import de.cau.cs.kieler.core.krendering.KRenderingFactory;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.KielerCompilerException;
import de.cau.cs.kieler.kitt.tracing.Tracing;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.scg.SCGTransformation;
import de.cau.cs.kieler.sccharts.tsccharts.transformation.TPPInformation;
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.scg.features.SCGFeatures;
import de.cau.cs.kieler.scg.s.features.CodeGenerationFeatures;
import de.cau.cs.kieler.scg.s.transformations.CodeGenerationTransformations;

/**
 * Performs a timing analysis for an scchart with the help of the connected kta
 * tool.
 * 
 * @author ima, als
 *
 */
public class TimingAnalysis extends Job {

	public static final boolean DEBUG = false;
	public static final boolean DEBUG_VERBOSE = false;

	/**
	 * Switch on/of highlighting.
	 */
	public static final boolean HOTSPOT_HIGHLIGHTING = true;
	public static final boolean REGION_TIMING = true;

	/**
	 * Megahertz for which the the milliseconds are calculated from the
	 * processor cycles.
	 */
	private static int MEGAHERTZ = 80;

	/**
	 * Number of digits behind the decimal point in the display of milliseconds
	 */
	private static int DIGITS = 0;

	/**
	 * Enumeration for the possible representations of timing values in the
	 * interactive timing analysis.
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
	private ICodePreparer codePreparer;
	private final KRenderingFactory renderingFactory = KRenderingFactory.eINSTANCE;
	private TimingHighlighter timingHighlighter = new TimingHighlighter(renderingFactory);

	protected TimingAnalysis(State rootState, HashMultimap<Region, WeakReference<KText>> regionLabels,
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
		this.codePreparer = new KTACodePreparer();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @param ttpRegionMapping
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		long startTime = System.currentTimeMillis();
		
		////////////////////////////////////////////////////////////////////////////////////////////////
		// Step 1: Compile SCChart to sequentialized SCG with Timing Program 
		// Points (TPP), uses the TPPTransformation at the end of the chain
        ////////////////////////////////////////////////////////////////////////////////////////////////
		if (monitor.isCanceled()) {
			// Stop as soon as possible when job canceled
			return Status.CANCEL_STATUS;
		}

		KielerCompilerContext context = new KielerCompilerContext(
				SCGFeatures.SEQUENTIALIZE_ID + ",*T_ABORT,*T_scg.basicblock.sc,"
						+ "*T_NOSIMULATIONVISUALIZATION,T_scg.tpp",scchart);
		context.setProperty(Tracing.ACTIVE_TRACING, true);
		context.setProperty(SCGTransformation.ENABLE_SFR, false);
		context.setAdvancedSelect(true);
		CompilationResult compilationResult = KielerCompiler.compile(context);

		if (!(compilationResult.getEObject() instanceof SCGraph) || compilationResult
				.getPostponedErrors().size() > 0) {
			if (!(compilationResult.getEObject() instanceof SCGraph)) {
				System.out.println("The scg sequentialization did not return an scg.");
			} else {
				System.out.println("The sequentialization yielded postponed Errors:\n");
				Iterator<KielerCompilerException> errorIterator = compilationResult
						.getPostponedErrors().iterator();
				while (errorIterator.hasNext()) {
					KielerCompilerException currentError = errorIterator.next();
					System.out.println(currentError.getMessage() + "\n");
				}
			}
			return new Status(IStatus.ERROR, pluginId, "SCG sequentialization failed. (ITA)");
		}

		SCGraph scg = (SCGraph) compilationResult.getEObject();
        
		////////////////////////////////////////////////////////////////////////////////////////////////
		// Step 2: Retrieve the auxiliary data produced by the TPPTransformation
		////////////////////////////////////////////////////////////////////////////////////////////////
		int highestInsertedTPPNumber = -1;
		HashMap<String, Region> tppRegionMap = null;
		List<TPPInformation> tppInformations = compilationResult.getAuxiliaryData(TPPInformation.class);
		TPPInformation tppInformation = tppInformations.isEmpty() ? null : tppInformations.get(0);
		if (tppInformation != null) {
			highestInsertedTPPNumber = tppInformation.getHighestInsertedTPPNumber();
			tppRegionMap = tppInformation.getTPPRegionMapping();
		} else {
			return new Status(IStatus.ERROR, pluginId,
					"Error in the TPP placement phase. No auxiliary data was produced (ITA).");
		}
		
        ////////////////////////////////////////////////////////////////////////////////////////////////
		// Step 3: Generate Code from the Sequentialized SCG with TPP
		////////////////////////////////////////////////////////////////////////////////////////////////
		context = new KielerCompilerContext(CodeGenerationFeatures.S_CODE_ID + "," 
		        + CodeGenerationFeatures.TARGET_ID + ",T_" + CodeGenerationTransformations.S2C_ID, scg);
		compilationResult = KielerCompiler.compile(context);

		if (compilationResult.getString() == null || compilationResult.getPostponedErrors().size() > 0) {
			if (compilationResult.getString() == null) {
				System.out.println("The code generation yielded no code string.");
			} else {
				System.out.println("The code generation yielded postponed Errors:\n");
				Iterator<KielerCompilerException> errorIterator = compilationResult.getPostponedErrors()
						.iterator();
				while (errorIterator.hasNext()) {
					KielerCompilerException currentError = errorIterator.next();
					System.out.println(currentError.getMessage() + "\n");
				}
			}
			return new Status(IStatus.ERROR, pluginId, "The code generation failed. (ITA)");
		}

		String code = compilationResult.getString();
         
		////////////////////////////////////////////////////////////////////////////////////////////////
		// Step 4: Prepare file locations, cleanup of outdated files
        ////////////////////////////////////////////////////////////////////////////////////////////////
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
			return new Status(IStatus.ERROR, pluginId, "The resource for the given model could "
					+ "not be found.");
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

		////////////////////////////////////////////////////////////////////////////////////////////////
		// Step 5: Prepare code for kta tool
		////////////////////////////////////////////////////////////////////////////////////////////////
		String codeAdapted = codePreparer.adaptCode(code, uriString);
		code = codeAdapted;

		fileWriter.writeToFile(code, targetCodeLocationString);

		////////////////////////////////////////////////////////////////////////////////////////////////
		// Step 6: Generate the timing request file (.ta)
        ////////////////////////////////////////////////////////////////////////////////////////////////
		LinkedList<TimingRequestResult> resultList = generateTimingRequestFile(code, scchart, uriString,
				highestInsertedTPPNumber);
		String taFileName = fileName.replace(".sct", ".ta");
		String cFileName = fileName.replace(".sct", ".c");

		////////////////////////////////////////////////////////////////////////////////////////////////
		// Step 7: Invoke the timing analysis tool on the code and the generated .ta file
        ////////////////////////////////////////////////////////////////////////////////////////////////
		
		// Get the paths to the kta binary and the compiler used by kta, which should be provided by the 
		// user in the preference page
		String timingToolLocation = Activator.getDefault().getPreferenceStore().getString("ktaPath");
		String compilerLocation = Activator.getDefault().getPreferenceStore()
				.getString("mipsel-mcb32-elf-gccPath");
		ProcessBuilder pb = new ProcessBuilder(timingToolLocation + "kta", "ta", "-compile", fileFolder 
				+ cFileName, "-tafile", fileFolder + taFileName);
		Map<String, String> env = pb.environment();
		// As the kta tool calls the mipsel-mcb32-elf-gcc compiler, we have to make sure it is on the 
		// PATH for the kta tool, so it can find it
		env.put("PATH", compilerLocation + ":$PATH");
		try {
			Process p = pb.start();
			// get the timing analysis tool's console output
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			// read the output of the analysis tool
			System.out.println("Output from the timing analysis tool:");
			String s = null;
			while ((s = stdInput.readLine()) != null) {
				System.out.println(s);
			}
			// read error messages of the anaylsis tool
			System.out.println("Error output from the timing analysis tool:");
			System.out.println("-----end of timing analysis tool output-------\n");
			while ((s = stdError.readLine()) != null) {
				System.out.println(s);
			}
			// wait for the timing analysis tool to complete its job
			p.waitFor();
		} catch (IOException e) {
			return new Status(IStatus.ERROR, pluginId,
					"There is no timing analysis tool connected or the timing analysis tool "
							+ "could not be invoked. Please check whether you have given the "
							+ "correct paths to the kta executable and the compiler in the "
							+ "KIELER Preferences ");
		} catch (InterruptedException e) {
			return new Status(IStatus.ERROR, pluginId, "The timing analysis tool invokation was "
					+ "interrupted");
		}

		// Refresh to make sure the .c file can be found
		try {
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			return new Status(IStatus.ERROR, pluginId, "Files could not be refreshed.");
		}

		////////////////////////////////////////////////////////////////////////////////////////////////
		// Step 8: Retrieve timing data and associate with regions
        ////////////////////////////////////////////////////////////////////////////////////////////////
		if (monitor.isCanceled()) {
			// Stop as soon as possible when job canceled
			return Status.CANCEL_STATUS;
		}

		// construct uri, where the analysis tool will deposit the response file
		// (.ta)
		String taFile = uriString.replace(".sct", ".ta.out");
		String taPath = taFile.replace("file:", "");

		int timingInformationFetch = timingAnnotationProvider.getTimingInformation(resultList, taPath,
				rep);
		if (timingInformationFetch == 1) {
			return new Status(IStatus.ERROR, pluginId, "The timing information file was not found");
		} else if (timingInformationFetch == 2) {
			return new Status(IStatus.ERROR, pluginId,
					"An IO error occurred while timing information was retrieved from file.");
		}

		// calculate timing values for all regions and store a list of regions
		// that belong to the
		// WCET path in wcpRegions for special display
		wcpRegions = extractTimingLabels(RequestType.FWCET, resultList, timingLabels, timingResults, 
				tppRegionMap,scchart);

		////////////////////////////////////////////////////////////////////////////////////////////////
		// Step 9: Feedback information to the diagram
        ////////////////////////////////////////////////////////////////////////////////////////////////
		if (monitor.isCanceled()) {
			// Stop as soon as possible when job canceled
			return Status.CANCEL_STATUS;
		}

		// Changing diagram should be in UI thread (maybe ask chsch)
		new UIJob("Inserting timing data") {
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {

				// get overallWCET
				BigInteger overallWCET = new BigInteger("0");
				String scchartTiming = timingResults.get(scchartDummyRegion);
				String timingResultChart = timingResults.get(null);
				if (scchartTiming != null) {
					BigInteger timingResultChartBI = new BigInteger(timingResultChart);
					BigInteger scchartTimingBI = new BigInteger(scchartTiming);
					BigInteger timingResultSum = timingResultChartBI.add(scchartTimingBI);
					overallWCET = timingResultSum;
				} else {
					overallWCET = new BigInteger(timingResultChart);
				}

				for (Region region : timingLabels.keySet()) {
					String timingResult = timingResults.get(region);
					Set<WeakReference<KText>> labels = timingLabels.get(region);
					for (WeakReference<KText> labelRef : labels) {
						KText label = labelRef.get();
						if (label != null) {
							// Special case: Timing for the whole SCChart
							if (region == null) {
								timingResult = overallWCET.toString();
							}
						}
						// Adapt timing values, when representation is not in
						// the default case
						if (rep != TimingValueRepresentation.CYCLES) {
							String newTimingResult = timingHighlighter.adaptTimingRepresentation
									(MEGAHERTZ, DIGITS, rep, timingResult, overallWCET);
							if (REGION_TIMING || region == null) {
								label.setText(newTimingResult);
							}
						} else {
							if (REGION_TIMING || region == null) {
								label.setText(timingResult);
							}
						}
					}
					// If the region belongs to the WCET path, highlight, if
					// requested by user
					if (highlight && HOTSPOT_HIGHLIGHTING && wcpRegions.contains(region)) {
						// determine how much percent of the overall WCET is
						// attributed to this region
						BigInteger percentage = new BigInteger("0");
						int percentageInt = 0;
						if (timingResultChart != null) {
							StringTokenizer resultTokenizer = new StringTokenizer(timingResult);
							BigInteger timingvalue = new BigInteger(resultTokenizer.nextToken());
							BigInteger onePercent = overallWCET.divide(new BigInteger("100"));
							percentage = timingvalue.divide(onePercent);
							percentageInt = percentage.intValue();
						}
						timingHighlighter.highlightRegion(region, percentageInt, timingLabels.get(region), 
								regionRectangles, renderingExtensions);
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
	 * Writes a timing request file for the given C-code and SCChart. Reads a
	 * timing assumption file from a given location and concatenates its content
	 * with automatically generated state information and and timing requests
	 * for the fractional time value between each pair of consecutive timing
	 * program points.
	 * 
	 * 
	 * @param code
	 *            The code in C language as String with inserted Timing Program
	 *            Points.
	 * @param scchart
	 *            The SCChart represented by the code given as State.
	 * @param uriString
	 *            The location of the .sct file of the scchart given as an uri
	 *            String representation.
	 * @param highestInsertedTPPNumber
	 *            The highest number of any TPP inserted in the code.
	 * @return Returns the list of TimingRequestResults prepared for storing the
	 *         analysis results
	 */
	public static LinkedList<TimingRequestResult> generateTimingRequestFile(String code, State scchart,
			String uriString, int highestInsertedTPPNumber) {
		FileWriter assumptionFileWriter = new FileWriter();
		TimingAnnotationProvider assumptionTimingAnnotationProvider = new TimingAnnotationProvider();
		StringBuilder stringBuilder = new StringBuilder();

		// In any case we will ask for the analysis of the tick function
		stringBuilder.append("Function tick\nInitFunction reset\nState _GO");
		// Declare the state variables (corresponding to the registers, this is
		// about execution
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
		// Note that at the moment we will generate globalvar assumptions
		// automatically only form boolean inputs, others have to be specified in the .asu file
		// First, add an assumption line for _GO, which will always be there,we treat it
		// analogously to environment inputs (as opposed to states)
		EList<Declaration> declarationList = scchart.getDeclarations();
		Iterator<Declaration> declarationListIterator = declarationList.iterator();
		while (declarationListIterator.hasNext()) {
			Declaration currentDeclaration = declarationListIterator.next();
			if (currentDeclaration.isInput()) {
				ValueType type = currentDeclaration.getType();
				if (type.equals(ValueType.BOOL) || type.equals(ValueType.PURE)) {
					stringBuilder
							.append("\nGlobalVar " + currentDeclaration.getValuedObjects().get(0)
									.getName() + " 0..1");
				}
			}
		}
		// read (optional) additional assumptions and timing assumptions for called functions into
		// the assumptions file
		String assumptionFile = uriString.replace(".sct", ".asu");
		String assumptionFilePath = assumptionFile.replace("file:", "");
		boolean assumptionFilePresent = assumptionTimingAnnotationProvider
				.getAssumptions(assumptionFilePath, stringBuilder);
		if (!assumptionFilePresent) {
			System.out.println("An associated assumption file for this model was not found. No timing "
					+ "assumptions for called functions available.");
		}
		System.out.println(stringBuilder.toString());
		// write timing requests appended to the assumptionString
		LinkedList<TimingRequestResult> resultList = assumptionTimingAnnotationProvider
				.writeTimingRequests(highestInsertedTPPNumber, stringBuilder);
		// .ta file string complete, write it to file
		String requestFile = uriString.replace(".sct", ".ta");
		String requestFilePath = requestFile.replace("file:", "");
		System.out.println(stringBuilder.toString());
		assumptionFileWriter.writeToFile(stringBuilder.toString(), requestFilePath);
		return resultList;
	}

	/**
	 * Method extracts timing labels with format <deep timing value> / <flat
	 * timing value> for the regions in the resultList.
	 * 
	 * @param requestType
	 *            : The requestType for which the timing labels are to be
	 *            extracted. The method expects either RequestType.LWCET,
	 *            RequestType.LBCET, RequestType.FWCET or RequestType.FBCET
	 * @param resultList
	 *            A list with TimingRequestResults extracted from the timing
	 *            analysis response file
	 * @param timingLabelList
	 *            A Map between the Regions of the SCChart which is to be
	 *            annotated with timing values and References to the associated
	 *            labels
	 * @param regionLabelStringMap
	 *            A Map between Regions and the Strings that will be the timing
	 *            information labels to feed back to the diagram
	 * @param tppRegionMap
	 *            A Mapping between Timing Program Points and Regions
	 * @param rootState
	 * @return Returns a list of the Regions that are on the WCET path
	 */
	private ArrayList<Region> extractTimingLabels(RequestType requestType, 
			LinkedList<TimingRequestResult> resultList,
			HashMultimap<Region, WeakReference<KText>> timingLabelList, 
			HashMap<Region, String> regionLabelStringMap,
			HashMap<String, Region> tppRegionMap, State rootState) {
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
		HashMap<Region, BigInteger> deepValues = new HashMap<Region, BigInteger>();
		HashMap<Region, BigInteger> flatValues = new HashMap<Region, BigInteger>();
		Iterator<TimingRequestResult> resultListIterator = resultList.iterator();
		// fill the map for flat values
		while (resultListIterator.hasNext()) {
			TimingRequestResult currentResult = resultListIterator.next();
			if (currentResult.getRequestType() == requestType) {
				Region resultRegion;
				String startPoint = currentResult.getStartPoint();
				resultRegion = tppRegionMap.get(startPoint);
				if (flatValues.get(resultRegion) == null) {
					flatValues.put(resultRegion, new BigInteger(currentResult.getResult().get(0)));
				} else {
					// there may be more than one timing result for a region, sum the values up
					flatValues.put(resultRegion,
							flatValues.get(resultRegion).add(new BigInteger(currentResult.getResult()
									.get(0))));
				}
			}
		}
		calculateDeepTimingValues(rootState, flatValues, deepValues);
		Iterator<Region> regionIterator = timingLabelList.keySet().iterator();
		while (regionIterator.hasNext()) {
			Region currentRegion = regionIterator.next();
			if (!(currentRegion == null)) {
				// Possibly we have to mark this region as part of the WCET path
				// (WCP)
				String label = flatValues.get(currentRegion) + " / " + deepValues.get(currentRegion);
				regionLabelStringMap.put(currentRegion, label);
			} else {
				BigInteger WCRT = new BigInteger("0");
				Iterator<Region> outerRegionsIterator = rootState.getRegions().iterator();
				while (outerRegionsIterator.hasNext()) {
					Region nextRegion = outerRegionsIterator.next();
					BigInteger currentValue = deepValues.get(nextRegion);
					WCRT = WCRT.add(currentValue);
				}
				// get the timing for the parts of the scchart that are not
				// attributed to a region
				BigInteger dummyTiming = flatValues.get(scchartDummyRegion);
				if (dummyTiming != null) {
					WCRT = WCRT.add(dummyTiming);
				}
				regionLabelStringMap.put(currentRegion, WCRT.toString());
			}
		}
		return wcpRegions;
	}

	/**
	 * The method takes a state and a Mapping between Regions and Integer
	 * values. For each region, it sums up the values for its child regions and
	 * itself and puts the result in a map associating regions with their deep
	 * timing values. It works recursively from state down to the innermost
	 * states of the given scchart.
	 * 
	 * @param state
	 *            The current state, in the original call the sccchart root
	 *            state
	 * @param flatValues
	 *            Mapping of Regions to their flat timing values.
	 * @param deepValues
	 *            Mapping of Regions to their hierarchical timing values. Empty
	 *            on first call.
	 */
	private void calculateDeepTimingValues(State state, HashMap<Region, BigInteger> flatValues,
			HashMap<Region, BigInteger> deepValues) {
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
			BigInteger flatTiming = flatValues.get(childRegion);
			// It is possible that there is no flat timing value stored for a region, set to zero
			if (flatTiming == null) {
				flatTiming = new BigInteger("0");
				flatValues.put(childRegion, flatTiming);
			}
			if (deepValues.get(childRegion) != null) {
				deepValues.put(childRegion, deepValues.get(childRegion).add(flatTiming));
			} else {
				deepValues.put(childRegion, flatTiming);
			}
			BigInteger deepTiming = deepValues.get(childRegion);
			// Add deep timing value of this region to the hierarchical timing
			// value of its parent region
			Region stateParentRegion = state.getParentRegion();
			if (stateParentRegion != null) {
				if (deepValues.get(stateParentRegion) != null) {
					deepValues.put(stateParentRegion, deepValues.get(stateParentRegion).add(deepTiming));
				} else {
					deepValues.put(stateParentRegion, deepTiming);
				}
			}
		}
	}
}
