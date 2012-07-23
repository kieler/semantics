/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.synchronizer;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;

import org.eclipse.emf.compare.diff.merge.service.MergeService;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork.Void;

import de.cau.cs.kieler.core.WrappedException;

/**
 * 
 * @author chsch
 * @kieler.ignore (excluded from review process)
 */
public class SynchronizeXtextEditorUnitOfWork extends Void<XtextResource> {
    
    private DiffModel diffModel = null;
    private StringBuffer buffer = null;
    private KitsSynchronizeLinker linker = null;

    public SynchronizeXtextEditorUnitOfWork(DiffModel theDiffModel, StringBuffer theBuffer) {
        this.diffModel = theDiffModel;
        this.buffer = theBuffer;
        this.linker = new KitsSynchronizeLinker();
    }

    public void process(final XtextResource state) throws Exception {

        try {
            if (this.diffModel.getOwnedElements() != null
                    && !this.diffModel.getOwnedElements().isEmpty()) {
                // in this case the diff model is created by the DiffService
                
                MergeService.merge(diffModel.getOwnedElements(), true);
                
            } else {
                if (this.diffModel.getRightRoots().size() == 1                        
                        && state.getContents().isEmpty()) {
                    // in this case the (dummy) diff model has been created by the synchronizer
                    //  for the purpose of passing the new passive model
                    
                    state.getContents().add(this.diffModel.getRightRoots().get(0));
                }
            }

            this.linker.setDiffModel(diffModel).linkElement(state.getContents().get(0));
            
            ModelSynchronizer.dumpPassive(EcoreUtil.copy(state.getContents().get(0)), System.out);

            if (this.buffer != null) {
                System.out.print("Serialising...");
                state.save(new OutputStream() {

                    @Override
                    public void write(int b) throws IOException {
                        buffer.append((char) b);
                    }
                }, Collections.EMPTY_MAP);
            }
            // System.out.println(" done!");
        } catch (Exception e) {
            throw new WrappedException(e, ModelSynchronizer.MSG_XTEXT_REFRESH_FAILED);
        }

    }

}
