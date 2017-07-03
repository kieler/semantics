package de.cau.cs.kieler.sccharts.timing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ui.util.ResourceUtil;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;

import de.cau.cs.kieler.kexpressions.TextExpression;
import de.cau.cs.kieler.kico.KiCoProperties;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties;
import de.cau.cs.kieler.klighd.kgraph.KEdge;
import de.cau.cs.kieler.klighd.kgraph.KNode;
import de.cau.cs.kieler.klighd.krendering.HorizontalAlignment;
import de.cau.cs.kieler.klighd.krendering.KContainerRendering;
import de.cau.cs.kieler.klighd.krendering.KPlacementData;
import de.cau.cs.kieler.klighd.krendering.KPointPlacementData;
import de.cau.cs.kieler.klighd.krendering.KRectangle;
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory;
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle;
import de.cau.cs.kieler.klighd.krendering.KText;
import de.cau.cs.kieler.klighd.krendering.VerticalAlignment;
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.klighd.util.KlighdProperties;
import de.cau.cs.kieler.klighd.util.ModelingUtil;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.SCChartsFactory;
import de.cau.cs.kieler.sccharts.Scope;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sccharts.klighd.hooks.SynthesisHook;

public class TimingAnalysisHook extends SynthesisHook {
    
    private static SynthesisOption TIMING_CATEGORY =
            SynthesisOption.createCategory("Timing Analysis", false);

    private static SynthesisOption SHOW_TIMING = SynthesisOption
            .createCheckOption("Perform Timing Analysis", false).setCategory(TIMING_CATEGORY);

    private static SynthesisOption SHOW_TIMING_HIGHLIGHTING = SynthesisOption
            .createCheckOption("Show Hotspot Highlighting", false).setCategory(TIMING_CATEGORY);

    private static SynthesisOption TIMING_REP =
            SynthesisOption
                    .createChoiceOption("Timing Representation",
                            Arrays.asList(TimingAnalysis.TimingValueRepresentation.values()),
                            TimingAnalysis.TimingValueRepresentation.CYCLES)
                    .setCategory(TIMING_CATEGORY);

	private static KRenderingExtensions renderingExtensions = new KRenderingExtensions();

	@Override
    public List<SynthesisOption> getDisplayedSynthesisOptions() {
        if (!Activator.getDefault().getPreferenceStore()
                .getBoolean("interactiveTimingAnalysisSidebar")) {
            return Collections.emptyList();
        } else {
            return Lists.newArrayList(TIMING_CATEGORY, SHOW_TIMING, SHOW_TIMING_HIGHLIGHTING,
                    TIMING_REP);
        }
    }

	@Override
	public void finish(Scope scope, KNode node) {
		if (getBooleanValue(SHOW_TIMING) && scope instanceof State) {
			// It is normal that some nodes of the SCG will be mapped to null,
			// because they belong to
			// the SCChart itself not to a Region of the SCChart (they cannot be
			// attributed to the
			// outermost
			// Region in the root state, because there may be several of those).
			// So
			// we use a dummy
			// region to represent the SCChart in Timing Analysis.
			State rootState = (State) scope;
			Region scchartDummyRegion = SCChartsFactory.eINSTANCE.createControlflowRegion();
			scchartDummyRegion.setId("SCChartDummyRegion");

			Resource resource = null;
            KielerCompilerContext context =
                    getUsedContext().getProperty(KiCoProperties.COMPILATION_CONTEXT);
			if (context != null) {
				resource = context.getMainResource();
			} else {
				resource = rootState.eResource();
			}

			// Step 0: (Preprocessing)
			// Add timing labels (while still in synthesis run)

			// Hashmap contains weak references, thus the KGraph can be deleted
			// completely while
			// timing analysis is running

			HashMultimap<Region, WeakReference<KText>> timingLabels = HashMultimap.create();
            HashMultimap<Region, WeakReference<KRectangle>> regionRectangles =
                    HashMultimap.create();
            Iterator<EObject> graphIter = ModelingUtil.eAllContentsOfType2(node, KNode.class,
                    KContainerRendering.class,
					KRectangle.class);
			while (graphIter.hasNext()) {
				EObject eObj = graphIter.next();
				if (eObj instanceof KRectangle) {
					KRectangle rect = (KRectangle) eObj;
					Object sourceElem = rect.getProperty(KlighdInternalProperties.MODEL_ELEMEMT);
					if (sourceElem instanceof Region) {
						KText text = KRenderingFactory.eINSTANCE.createKText();
						// Find region label and calculate padding
						float leftMargin = 5;
						KText regionLabel = Iterables.getFirst(Iterables.filter(rect.getChildren(), KText.class), null);
						if (regionLabel != null) {
						    KPlacementData data = regionLabel.getPlacementData();
				            if (data instanceof KPointPlacementData) {
				                leftMargin = 10 + ((KPointPlacementData) data).getMinWidth();
				            }
						}
						if (TimingAnalysis.REGION_TIMING) {
							text.setText("???/???");
						}
						renderingExtensions.setFontSize(text, 10);
						renderingExtensions.setForegroundColor(text, 255, 0, 0);
                        renderingExtensions.setPointPlacementData(text, renderingExtensions.RIGHT,
                                5, 0, renderingExtensions.TOP, 1, 0, HorizontalAlignment.RIGHT,
                                VerticalAlignment.TOP, leftMargin, 5, 0, 0);
						rect.getChildren().add(text);
						timingLabels.put((Region) sourceElem, new WeakReference<KText>(text));
                        regionRectangles.put((Region) sourceElem,
                                new WeakReference<KRectangle>(rect));
					}
				}
			}
            KRoundedRectangle rectangle =
                    (KRoundedRectangle) node.getChildren().get(0).getData(KRoundedRectangle.class);
			KRectangle innerRect = KRenderingFactory.eINSTANCE.createKRectangle();
			renderingExtensions.setInvisible(innerRect, true);
			innerRect.getChildren().add(rectangle.getChildren().get(0));
			rectangle.getChildren().add(0, innerRect);
			KText text = KRenderingFactory.eINSTANCE.createKText();
			text.setText("???");
			renderingExtensions.setFontSize(text, 14);
			renderingExtensions.setForegroundColor(text, 255, 0, 0);
            renderingExtensions.setPointPlacementData(text, renderingExtensions.RIGHT, 5, 0,
                    renderingExtensions.TOP, 1,
					0, HorizontalAlignment.RIGHT, VerticalAlignment.TOP, 5, 5, 0, 0);
			innerRect.getChildren().add(text);
			timingLabels.put(null, new WeakReference<KText>(text));
			// start analysis job
            new TimingAnalysis(rootState, timingLabels, scchartDummyRegion, resource,
                    regionRectangles,
					getBooleanValue(SHOW_TIMING_HIGHLIGHTING),
                    (TimingAnalysis.TimingValueRepresentation) getObjectValue(TIMING_REP),
                    getUsedContext())
                            .schedule();
		}
	}
	
    @Override
    public void processTransition(Transition transition, KEdge edge) {
        if (Activator.getDefault().getPreferenceStore()
                .getBoolean("interactiveTimingAnalysisSidebar")) {
            // Text for the tooltip
            String text = "";
            // Get the model resource
            Resource resource = null;
            KielerCompilerContext context =
                    getUsedContext().getProperty(KiCoProperties.COMPILATION_CONTEXT);
            if (context != null) {
                resource = context.getMainResource();
            } else {
                if (transition != null) {
                    resource = transition.eResource();
                }
            }
            // Get a map of all function wcet asumptions
            HashMap<String, String> functionAssumptions = null;
            String uriString = null;
            if (resource != null) {
                IFile file = ResourceUtil.getFile(resource);
                uriString = file.getRawLocation().toFile().getAbsolutePath();
                String assumptionFile = uriString.replace(".sct", ".asu");
                String assumptionFilePath = assumptionFile.replace("file:", "");
                functionAssumptions = getFunctionAssumptions(assumptionFilePath);
            }
            // Find hostcode
            Iterator<TextExpression> hostCodeIter =
                    Iterators.filter(transition.eAllContents(), TextExpression.class);
            // Look up timing values for each host code call and write tooltiptext
            while (hostCodeIter.hasNext()) {
                TextExpression hostcode = hostCodeIter.next();
                String hostCodeCallText = hostcode.getText();
                // Default message in case a timing assumption information is not found
                String timingAssumption = "no assumption found";
                if (functionAssumptions != null) {
                    String key = hostCodeCallText.replace("()", "");
                    String timingValue = functionAssumptions.get(key);
                    if (timingValue != null) {
                        timingAssumption = timingValue;
                    }
                }
                text = "WCET " + hostCodeCallText + ": " + timingAssumption;
                if (!timingAssumption.equals("no assumption found")) {
                    text += " cycles";
                }
            }
            // Add tooltip
            if (!text.isEmpty()) {
                edge.getLabels().get(0).setProperty(KlighdProperties.TOOLTIP, text);
                edge.setProperty(KlighdProperties.TOOLTIP, text);
            }
        }
    }

    /**
     * Method reads function WCET assumptions from the assumptions file for the model and stores
     * them in a map from function names to time values (as Strings).
     * 
     * @param assumptionFilePath
     *            The path to the assumption file.
     * @return The map of function names and time values, null, if an error occurs.
     */
    private HashMap<String, String> getFunctionAssumptions(String assumptionFilePath) {
        BufferedReader bufferedReader = null;
        HashMap<String, String> functionAssumptions = new HashMap<String, String>();
        try {
            bufferedReader = new BufferedReader(new FileReader(assumptionFilePath));
            String line = bufferedReader.readLine();
            while ((line != null)) {
                StringTokenizer stringTokenizer = new StringTokenizer(line);
                if (stringTokenizer.hasMoreTokens()) {
                    String keyword = stringTokenizer.nextToken();
                    if (keyword.equals("FunctionWCET")) {
                        String hostCodeCall = null;
                        String timeValue = null;
                        if (stringTokenizer.hasMoreTokens()) {
                            hostCodeCall = stringTokenizer.nextToken();
                            if (stringTokenizer.hasMoreTokens()) {
                                timeValue = stringTokenizer.nextToken();
                                functionAssumptions.put(hostCodeCall, timeValue);
                            }
                        }

                    }
                }
                line = bufferedReader.readLine();
            }
            return functionAssumptions;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
