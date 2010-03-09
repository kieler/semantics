/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.custom;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.core.ui.figures.DoubleRoundedRectangle;
import de.cau.cs.kieler.core.ui.figures.IAttributeAwareFigure;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.custom.layout.SyncChartsConfiguration;
import de.cau.cs.kieler.core.ui.figures.layout.AbstractTableLayout;
import de.cau.cs.kieler.core.ui.figures.layout.container.Cell;
import de.cau.cs.kieler.core.ui.figures.layout.container.ExtendedTable;

/**
 * This class is an extension of AbstractTableLayout, customized to StateFigure in 
 * synccharts.gmfgraph and its ecore model-object.
 * 
 * @author abl
 */
public class StateLayout extends AbstractTableLayout {

	/** minimal height for normal states. */
	public static final int MIN_HEIGHT = 30;
	/** minimal width for normal states. */
	public static final int MIN_WIDTH = 30;
	/** minimal height for conditional states. */
	public static final int COND_HEIGHT = 20;
	/** minimal width for conditional states. */
	public static final int COND_WIDTH = 20;

	/** the layout elements resp. the indices of the children */
	public static final int STATELABEL = 0;
	public static final int POLYLINE = 1;
	public static final int BODYTEXT = 2;
	public static final int INTERFACEDECL = 3;
	public static final int SIGNALS = 4;
	public static final int ENTRYACTIONS = 5;
	public static final int INSIDEACTIONS = 6;
	public static final int EXITACTIONS = 7;
	public static final int SUSPENDTRIGGER = 8;
	public static final int REGION = 9;

	/** The container for the used layout-style.*/
	private AbstractSyncChartsConfiguration layouts;

	/**
	 * Creates a state layout.
	 */
	public StateLayout() {
		super();

		// Set the Layouter to desired configuration
		layouts = new SyncChartsConfiguration();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExtendedTable getCorrespondingLayout(IFigure stateFigure) {
		/*
		 * check whether the figure is an attribute aware state and whether it
		 * is a simple or a complex state
		 */
		if (stateFigure instanceof IAttributeAwareFigure) {
			AttributeAwareStateFigure attrStateFigure = (AttributeAwareStateFigure) stateFigure;
			Notifier modelElement = attrStateFigure.getTarget();
			if (modelElement instanceof State) {
				State state = (State) modelElement;
				StateType type = state.getType();
				ExtendedTable layout;
				switch (type) {
				case NORMAL:
					if (checkComplex(state)) {
						setIsEmptyValues(layouts.complexStateLayout, state);
						layout = layouts.complexStateLayout;
					} else {
						layout = layouts.simpleStateLayout;
					}
					break;
				case CONDITIONAL:
					setIsEmptyValues(layouts.conditionalStateLayout, state);
					layout = layouts.conditionalStateLayout;
					break;

				case REFERENCE:
					setIsEmptyValues(layouts.referenceStateLayout, state);
					layout = layouts.referenceStateLayout;
					break;

				case TEXTUAL:
					setIsEmptyValues(layouts.complexStateLayout, state);
					layout = layouts.complexStateLayout;
					break;

				default:
					layout = layouts.simpleStateLayout;
					break;
				}

				/** If the state is final we have to set a padding */
				if (state.isIsFinal()) {
					layout.padding(DoubleRoundedRectangle.BORDER_WIDTH);
				} else {
					layout.padding(0);
				}
				return layout;
			}
		}
		return null;
	}

	/** Define isEmpty-value for every graphical element. */
	private void setIsEmptyValues(ExtendedTable layout, State state) {
		for (int row = 0; row < layout.table.length; row++) {
			for (int column = 0; column < layout.table[row].length; column++) {
				Cell cell = layout.table[row][column];
				cell.isEmpty = isEmptyCell(cell.figure, state);
			}
		}
	}

	/**
	 * Method defines for every graphical element if it will be painted or
	 * hidden. It does so by checking constraints for the associated model
	 * elements.
	 */
	private boolean isEmptyCell(int figureConstant, State state) {
		boolean isEmpty = false;
		switch (figureConstant) {
		case STATELABEL:
			isEmpty = false;
			break;
		case INTERFACEDECL:
			isEmpty = state.getInterfaceDeclaration() == null
					|| state.getInterfaceDeclaration().length() == 0;
			break;
		case BODYTEXT:
			isEmpty = state.getBodyText() == null
					|| state.getBodyText().length() == 0;
			break;
		case SIGNALS:
			isEmpty = state.getSignals().size() == 0;
			break;
		case ENTRYACTIONS:
			isEmpty = state.getEntryActions().size() == 0;
			break;
		case INSIDEACTIONS:
			isEmpty = state.getInnerActions().size() == 0;
			break;
		case EXITACTIONS:
			isEmpty = state.getExitActions().size() == 0;
			break;
		case SUSPENDTRIGGER:
			isEmpty = state.getSuspensionTrigger() == null;
			break;
		case REGION:
			isEmpty = state.getRegions().size() == 0;
			break;

		default:
			isEmpty = false;
			break;
		}
		return isEmpty;
	}

	/**
	 * Check whether the currently watched state is a complex state.
	 * 
	 * @param state
	 *            the checked state
	 * @return {@code true} if complex, {@code false} otherwise
	 */
	private boolean checkComplex(final State state) {
		boolean containsRegions = state.getRegions().size() > 0;
		boolean containsSignals = state.getSignals().size() > 0;
		boolean containsVariables = false;
		boolean containsEntryActions = state.getEntryActions().size() > 0;
		boolean containsInsideActions = state.getInnerActions().size() > 0;
		boolean containsExitActions = state.getExitActions().size() > 0;
		boolean containsSuspensionTrigger = state.getSuspensionTrigger() != null;
		boolean containsBodyText = ! (state.getBodyText() == null || state.getBodyText().length() == 0);

		return (containsRegions || containsSignals || containsVariables
				|| containsEntryActions || containsInsideActions
				|| containsExitActions || containsSuspensionTrigger
				|| containsBodyText);
	}

	/**
	 * A container for the class variables. Provides easy exchange of different
	 * layout-styles.
	 */
	public static abstract class AbstractSyncChartsConfiguration {
		public ExtendedTable referenceStateLayout;
		public ExtendedTable simpleStateLayout;
		public ExtendedTable complexStateLayout;
		public ExtendedTable conditionalStateLayout;
		public ExtendedTable textualStateLayout;
	}
}
