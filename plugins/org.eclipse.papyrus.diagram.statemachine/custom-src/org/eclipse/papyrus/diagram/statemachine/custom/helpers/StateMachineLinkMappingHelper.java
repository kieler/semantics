package org.eclipse.papyrus.diagram.statemachine.custom.helpers;

import java.util.Collection;

import org.eclipse.papyrus.diagram.common.helper.ILinkMappingHelper;
import org.eclipse.uml2.uml.Element;

/**
 * The StateMAchineLinkMappingHelper is specialization of the link mapping
 * helper for the StateMachine diagram
 */

public class StateMachineLinkMappingHelper implements ILinkMappingHelper {

	/**
	 * SingletonHolder is loaded at the first execution of getInstance() method
	 */
	private static class SingletonHolder {

		private final static StateMachineLinkMappingHelper instance = new StateMachineLinkMappingHelper();
	}

	/**
	 * Gets the single instance of StateMachineLinkMappingHelper.
	 * 
	 * @return single instance of StateMachineLinkMappingHelper
	 */
	public static StateMachineLinkMappingHelper getInstance() {
		return SingletonHolder.instance;
	}

	/**
	 * private constructor
	 */
	private StateMachineLinkMappingHelper() {
		// do nothing
	}

	public Collection<?> getSource(Element link) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<?> getTarget(Element link) {
		// TODO Auto-generated method stub
		return null;
	}

}
