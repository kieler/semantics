/**
 * Copyright (c) 2012 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	itemis AG - initial API and implementation
 * 
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.validation;

import org.yakindu.base.types.Type;
import org.yakindu.sct.model.sgraph.Statement;
import org.yakindu.sct.model.stext.validation.TypeCheckException;

import com.google.inject.ImplementedBy;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
@ImplementedBy(SCCTypeInferrer.class)
public interface ISCCTypeInferrer {
	/**
	 * infers the type for a given {@link Statement}
	 * 
	 * @throws TypeCheckException
	 *             if the Statement is invalid
	 */
	Type getType(Statement expr) throws TypeCheckException;

}
