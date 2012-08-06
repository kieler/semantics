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
package de.cau.cs.kieler.synccharts.synchronizer.merge;

import java.util.Map;

import org.eclipse.emf.compare.diff.merge.IMerger;
import org.eclipse.emf.compare.diff.merge.IMergerProvider;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.ModelElementChangeLeftTarget;
import org.eclipse.emf.compare.diff.metamodel.ModelElementChangeRightTarget;
import org.eclipse.emf.compare.diff.metamodel.MoveModelElement;
import org.eclipse.emf.compare.diff.metamodel.ReferenceChangeLeftTarget;
import org.eclipse.emf.compare.diff.metamodel.ReferenceOrderChange;
import org.eclipse.emf.compare.diff.metamodel.UpdateReference;
import org.eclipse.emf.compare.util.EMFCompareMap;

/**
 * Provider of our customized Kits-specific mergers.
 * 
 * @author chsch
 * @kieler.ignore (excluded from review process)
 */
public class KitsMergerProvider implements IMergerProvider {

    private Map<Class<? extends DiffElement>, Class<? extends IMerger>> mergerTypes;

    /**
     * {@inheritDoc}
     */    
    public Map<Class<? extends DiffElement>, Class<? extends IMerger>> getMergers() {
        //SUPPRESS CHECKSTYLE NEXT 10 LineLength
        if (mergerTypes == null) {
            mergerTypes = new EMFCompareMap<Class<? extends DiffElement>, Class<? extends IMerger>>();
            // mergerTypes.put(DiffGroup.class, DiffGroupMerger.class);
            mergerTypes.put(ModelElementChangeRightTarget.class, MyModelElementChangeRightTargetMerger.class);
            mergerTypes.put(ModelElementChangeLeftTarget.class, MyModelElementChangeLeftTargetMerger.class);
            mergerTypes.put(MoveModelElement.class, KitsMoveModelElementMerger.class);
            // mergerTypes.put(ReferenceChangeRightTarget.class, ReferenceChangeRightTargetMerger.class);
            mergerTypes.put(ReferenceChangeLeftTarget.class, MyReferenceChangeLeftTargetMerger.class);
            mergerTypes.put(UpdateReference.class, MyUpdateReferenceMerger.class);
            // mergerTypes.put(AttributeChangeRightTarget.class, AttributeChangeRightTargetMerger.class);
            // mergerTypes.put(AttributeChangeLeftTarget.class, AttributeChangeLeftTargetMerger.class);
            // mergerTypes.put(UpdateAttribute.class, UpdateAttributeMerger.class);
            mergerTypes.put(ReferenceOrderChange.class, KitsReferenceOrderChangeMerger.class);
        }
        return mergerTypes;
    }
}
