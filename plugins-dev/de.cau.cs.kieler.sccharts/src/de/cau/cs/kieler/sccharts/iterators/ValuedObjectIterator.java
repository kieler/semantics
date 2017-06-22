/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.iterators;

import static com.google.common.collect.Iterators.concat;
import static com.google.common.collect.Iterators.transform;

import java.util.Iterator;

import org.eclipse.emf.common.util.AbstractTreeIterator;

import com.google.common.base.Function;

import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.ValuedObject;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.Scope;
import de.cau.cs.kieler.sccharts.State;

/**
 * @author ssm
 * @kieler.design 2014-09-05 proposed 
 * @kieler.rating 2014-09-05 proposed yellow
 */
public final class ValuedObjectIterator {

    public static Function<Declaration, Iterator<ValuedObject>> GET_VALUEDOBJECTS =
            new Function<Declaration, Iterator<ValuedObject>>() {
                /**
                 * {@inheritDoc}
                 */
                public Iterator<ValuedObject> apply(Declaration d) {
                    return d.getValuedObjects().iterator();
                }
            };
    
    public static Iterator<ValuedObject> sccValuedObjects(State s) {
        return new AbstractTreeIterator<ValuedObject>((State) s, false) {

            private static final long serialVersionUID = -4364507280963568557L;

            @Override
            protected Iterator<? extends ValuedObject> getChildren(Object object) {
                final Iterator<Declaration> declarations = ((State) object).getDeclarations().iterator();
                return concat(transform(declarations, GET_VALUEDOBJECTS));
            }

        };
    };
    
    public static Iterator<ValuedObject> sccValuedObjects(Region r) {
        return new AbstractTreeIterator<ValuedObject>((Region) r, false) {

            private static final long serialVersionUID = -4364507280963568557L;

            @Override
            protected Iterator<? extends ValuedObject> getChildren(Object object) {
                final Iterator<Declaration> declarations = ((Region) object).getDeclarations().iterator();
                return concat(transform(declarations, GET_VALUEDOBJECTS));
            }

        };
    };
    
    public static Iterator<ValuedObject> sccValuedObjects(Scope s) {
        if (s instanceof State) {
           return sccValuedObjects((State) s);

        } else if (s instanceof Region) {
           return sccValuedObjects((Region) s);
        }
        else {
            throw new IllegalArgumentException("Scope type not supported.");
        }
    }
}
