/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.log.LogEntry;

import de.cau.cs.kieler.kico.features.Feature;
import de.cau.cs.kieler.kico.internal.KiCoUtil;
import de.cau.cs.kieler.kico.internal.Transformation;
import de.cau.cs.kieler.kico.transformation.IHook;
import de.cau.cs.kieler.kico.transformation.Processor;


/**
 * This is the main class of the Kieler Compiler (KiCo) Project that aims to provide an
 * infrastructure for compiling via consecutive modal transformations.
 * 
 * @author cmot
 * @kieler.design 2015-03-11 proposed
 * @kieler.rating 2015-03-11 proposed yellow
 * 
 */
public class KielerCompiler {

    
    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    // .....█████╗..██████╗.██████╗███████╗███████╗███████╗
    // ....██╔══██╗██╔════╝██╔════╝██╔════╝██╔════╝██╔════╝
    // ....███████║██║.....██║.....█████╗..███████╗███████╗
    // ....██╔══██║██║.....██║.....██╔══╝..╚════██║╚════██║
    // ....██║..██║╚██████╗╚██████╗███████╗███████║███████║
    // ....╚═╝..╚═╝.╚═════╝.╚═════╝╚══════╝╚══════╝╚══════╝.
    // -------------------------------------------------------------------------

    /**
     * Gets the processor by its id, if it is registered.
     * 
     * @param id
     *            the id
     * @return the processor
     */
    public static Processor getProcessor(String id) {
        return KiCoPlugin.getProcessor(id, false);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets all registered processors.
     * 
     * @return the processors
     */
    public static Set<Processor> getProcessors() {
        Map<String, Processor> map = KiCoPlugin.getRegisteredProcessors(false);
        Set<Processor> set = new HashSet<Processor>();
        for (Entry<String, Processor> entry : map.entrySet()) {
            set.add(entry.getValue());
        }
        return set;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the feature by its id, if it is registered.
     * 
     * @param id
     *            the id
     * @return the feature
     */
    public static Feature getFeature(String id) {
        return KiCoPlugin.getFeature(id, false);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets all registered features.
     * 
     * @return the features
     */
    public static Set<Feature> getFeatures() {
        Map<String, Feature> map = KiCoPlugin.getRegisteredFeatures(false);
        Set<Feature> set = new HashSet<Feature>();
        for (Entry<String, Feature> entry : map.entrySet()) {
            set.add(entry.getValue());
        }
        return set;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the transformation by its id, if it is registered.
     * 
     * @param id
     *            the id
     * @return the transformation
     */
    public static Transformation getTransformation(String id) {
        return KiCoPlugin.getTransformation(id, false);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets all registered transformations.
     * 
     * @return the transformations
     */
    public static Set<Transformation> getTransformations() {
        Map<String, Transformation> map = KiCoPlugin.getRegisteredTransformations(false);
        Set<Transformation> set = new HashSet<Transformation>();
        for (Entry<String, Transformation> entry : map.entrySet()) {
            set.add(entry.getValue());
        }
        return set;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the hook by its id, if it is registered.
     * 
     * @param id
     *            the id
     * @return the hook
     */
    public static IHook getHook(String id) {
        return KiCoPlugin.getHook(id, false);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets all registered hooks.
     * 
     * @return the hooks
     */
    public static Set<IHook> getHooks() {
        Map<String, IHook> map = KiCoPlugin.getRegisteredHooks(false);
        Set<IHook> set = new HashSet<IHook>();
        for (Entry<String, IHook> entry : map.entrySet()) {
            set.add(entry.getValue());
        }
        return set;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    // ....██████╗.██████╗..██████╗..██████╗███████╗███████╗███████╗
    // ....██╔══██╗██╔══██╗██╔═══██╗██╔════╝██╔════╝██╔════╝██╔════╝
    // ....██████╔╝██████╔╝██║...██║██║.....█████╗..███████╗███████╗
    // ....██╔═══╝.██╔══██╗██║...██║██║.....██╔══╝..╚════██║╚════██║
    // ....██║.....██║..██║╚██████╔╝╚██████╗███████╗███████║███████║
    // ....╚═╝.....╚═╝..╚═╝.╚═════╝..╚═════╝╚══════╝╚══════╝╚══════╝
    // -------------------------------------------------------------------------

    /**
     * Advanced internally used KIELER Compiler compile method on a given context.
     * 
     * @param context
     *            the context
     * @return the compilation result
     */
    public static CompilationResult compile(KielerCompilerContext context) {
        long start = System.nanoTime();

        // as this is a compile run, the following MUST be set
        EObject transformationEObject = context.getTransformationObject();
        if (transformationEObject == null) {
            String message = "No model was supplied for this compilation run! Aborting compilation.";
            KiCoPlugin.getInstance().showError(
                    message,
                    KiCoPlugin.PLUGIN_ID, null, true);
            context.getCompilationResult().addPostponedError(new KielerCompilerException("", "", message));
            return context.getCompilationResult();
        }

        // Set the main resource
        if (context.getMainResource() == null) {
            context.setMainResource(transformationEObject.eResource());
        }
        
        // Invoke hooks
        for (IHook hook : getHooks()) {
            hook.preCompilation(context);
        }

        context.setProperty(KiCoProperties.RAW_INPUT_MODEL, transformationEObject);
        // If not inplace then produce a copy of the input EObject
        if (!context.isInplace()) {
            EObject copiedObject = copy(transformationEObject, context);
            // replace (first) intermediate object
            context.getCompilationResult().clear(copiedObject);
            // make the new copy the transformedObject
            transformationEObject = copiedObject;
        }

        // Compute and retrieve the compilation chain. This method hides all the tough work figuring
        // out the right transformations based on the selection.
        List<Transformation> compilationTransformations = context.getTransformationChain(true);

        String logString = "\nKiCo Compilation:\n [";
        for (Transformation transformation : compilationTransformations) {
            logString += transformation.getId();
            if (transformation != compilationTransformations.get(compilationTransformations.size()-1)) {
                logString += ", ";
            }
        }
        logString += "]";
        KiCoPlugin.log(logString);

        
        // The progress monitor is optional and may be null!
        IProgressMonitor monitor = context.getProgressMonitor();

        int doneWork = 0;
        int totalWork = compilationTransformations.size();
        if (monitor != null) {
            monitor.beginTask("Compiling, performing " + totalWork + "transformations.",
                    totalWork * 100);
        }

        // This will be the current instance of the transformed model, initially it is the
        // transformationEObject from the context
        EObject transformedObject = transformationEObject;

        for (Transformation transformation : compilationTransformations) {
            // Reset the done flag for the next transformation step
            context.getCompilationResult().setCurrentTransformationDone(false);

            doneWork++;

            // Possibly async call to perform the transformation (in a new Eclipse job)
            performTransformationTask(transformedObject, transformation, context, doneWork,
                    totalWork);

            boolean cancelled = false;
            // Blocking waiting until cancelled or current transformation is done
            while (!cancelled && !context.getCompilationResult().isCurrentTransformationDone()) {
                if (monitor != null && monitor.isCanceled()) {
                    cancelled = true;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
            }

            // Break if either cancelled by the user
            if (monitor != null && monitor.isCanceled()) {
                break;
            }

            // Feed back the last transformation result for the NEXT transformation
            Object object = context.getCompilationResult().getEObject();
            if (object instanceof EObject) {
                //TODO this is some kind of snapshot feature to create transformations chains based on selected features
                if (!context.isInplace()
                        //&& context.getSelectedTransformationIDs().contains(compilationTransformationID) // TODO fix interface
                        ){
                    transformedObject = copy((EObject) object, context);
                } else {
                    transformedObject = (EObject) object;
                }
            } else {
                // In this case we CANNOT do any further transformation calls
                // which require the return value of doTransform to be an EObject
                break;
            }

        }

        if (monitor != null) {
            monitor.done();
        }
        long end = System.nanoTime();
        String seconds = (((float) (end - start)) / 1000) + "";
        KiCoPlugin.log("KIELER Compiler compiled in " + seconds + " seconds.");

        context.getCompilationResult().processPostponedWarnings(false);
        context.getCompilationResult().processPostponedErrors(false);
        return context.getCompilationResult();
    }

    // -------------------------------------------------------------------------

    /**
     * Internally perform a single transformation.
     * 
     * @param transformedObject
     *            the transformed object
     * @param transformation
     *            the transformation
     * @param context
     *            the context
     * @param doneWork
     *            the done work
     * @param totalWork
     *            the total work
     * @return the object
     */
    private static void performTransformationTask(final EObject transformedObject,
            Transformation transformation, KielerCompilerContext context, int doneWork,
            int totalWork) {
        if (transformation != null) {
            String compilationTransformationId = transformation.getId();

            // The progress monitor is optional and may be null!
            IProgressMonitor monitor = context.getProgressMonitor();

            if (monitor != null) {
                monitor.setTaskName("Compiling, performing transformation " + doneWork + "/"
                        + totalWork + ": '" + transformation.getName() + "'");
            }

            // If the requested TransformationId
            if (transformation.getId().equals(compilationTransformationId)) {
                // If this is an individual

                // Class<?> parameterType = transformedObject.getClass();
                Class<?> handledParameterType = transformation.getParameterType();
                if (handledParameterType != null) {
                    if (handledParameterType.isInstance(transformedObject)) {

                        KielerCompilerProgressMonitor subMonitor = null;
                        if (monitor == null) {
                            monitor = new NullProgressMonitor();
                        }
                        subMonitor = new KielerCompilerProgressMonitor(monitor, 100);
                        // Set the sub monitor for this transformation
                        context.setCurrentTransformationProgressMonitor(subMonitor);

                        /*
                         * Possibly skip this transformation. For expansion transformations the
                         * transformation can be skipped when the feature is not present, for
                         * production transformation only when already present.
                         */
                        Feature feature = transformation.getExpandsFeature();
                        if (feature.doIsContained(transformedObject)
                                ^ transformation.isProduction()) {
                            // PROCESSING
                            KiCoPlugin.logInfo("PERFORM TRANSFORMATION: " + compilationTransformationId);
                            // Each subMonitor can use 0 - 100 % / work units
                            performTransformation(transformedObject, transformation, context,
                                    subMonitor);
                        } else {
                            // SKIPPING
                            KiCoPlugin.logInfo("SKIPPING TRANSFORMATION: " + compilationTransformationId);
                        }
                        
                        context.getCompilationResult().setCurrentTransformationDone(true);
                        // Increment the main monitor with 100%-x% percent, where x% is the number
                        // of
                        // work in % already added by the subMonitor
                        int additional = 100 - subMonitor.getPercentDone();
                        monitor.worked(additional);
                    } else {
                        String errorMessage =  "Broken compile chain. Transformation "
                                + compilationTransformationId
                                + " cannot handle input type "
                                + transformedObject.getClass().getName();
                        KiCoPlugin.getInstance().showError(errorMessage);
                        context.getCompilationResult().addPostponedError(new KielerCompilerException(compilationTransformationId, compilationTransformationId, errorMessage));
                        // MUST flag this to be finished otherwise
                        context.getCompilationResult().setCurrentTransformationDone(true);
                    }
                }
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Perform the actual transformation.
     * 
     * @param transformedObject
     *            the transformed object
     * @param transformation
     *            the transformation
     * @param context
     *            the context
     * @return the object
     */
    private static void performTransformation(final EObject transformedObject,
            final Transformation transformation, final KielerCompilerContext context,
            final KielerCompilerProgressMonitor subMonitor) {
        
        // Add a new transformation intermediate result. It is important to do this BEFORE the call
        // to transform because within the transform method processor intermediate results will be
        // produced and must be added to this transformation intermediate result.
        String compilationTransformationId = transformation.getId();
        TransformationIntermediateResult intermediateResult =
                context.getCompilationResult().addTransformationIntermediateResult(
                        compilationTransformationId);

        long start = 0;
        long end = 0;
        Resource res = transformedObject.eResource();
        if (context.isCreateDummyResource()) {
            // If we should create a dummy resource then save it after each successful
            // transformation step
            if (res == null) {
                // Create a dummy resource by calling serialization (this creates a dummy
                // resource on the fly)
                @SuppressWarnings("unused")
                String discard = KiCoUtil.serialize(transformedObject, context, true);
                // Test: Only perform serialization once, testing performance improvements
                context.setCreateDummyResource(false);
            }
            res = context.getMainResource();
        }
        
        EObject transformationInput = transformedObject;
        
        // Invoke pre hooks
        for (IHook hook : getHooks()) {
            EObject hookResult = hook.preTransformation(transformationInput, context, transformation.getDelegate());
            if(hookResult != null){
                transformationInput = hookResult;
            }
        }

        start = System.nanoTime();
        Object result = transformation.doTransform(transformationInput, context);
        end = System.nanoTime();

        // Invoke post hooks
        for (IHook hook : getHooks()) {
            Object hookResult = hook.postTransformation(transformationInput, result, context, transformation.getDelegate());
            if(hookResult != null){
                result = hookResult;
            }
        }

        // Add to compilation result
        intermediateResult.setResult(result);

        // Add performance result
        intermediateResult.setDuration(end - start);

        if (result != null) {
            // If this is the FIRST successful transformation AND we are NOT in
            // verbose mode
            // then clear all possibly previous errors
            if (context.getCompilationResult().getTransformationIntermediateResults().size() <= 1
                    && !context.isVerboseMode()) {
                context.getCompilationResult().resetPostponedErrors();
            }

            if (!(result instanceof EObject)) {
                // in this case we CANNOT do any further transformation calls
                // which require the return value of doTransform to be an EObject
                context.getCompilationResult().setCurrentTransformationDone(true);
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Creates and returns a copy of the given model and preserves its tracings if necessary.
     * 
     * @param original
     *            model
     * @return copy model
     */
    private static EObject copy(EObject original, KielerCompilerContext context) {
        EObject copy = null;

        for (IHook hook : getHooks()) {
            EObject hookCopy = hook.copy(original, context);
            if (copy != null && hookCopy != null) {
                throw new IllegalStateException("Multiple hooks try to perfom model copy");
            }
            if (hookCopy != null) {
                copy = hookCopy;
            }
        }
        if (copy == null) {
            return EcoreUtil.copy(original);
        }
        return copy;
    }
}
