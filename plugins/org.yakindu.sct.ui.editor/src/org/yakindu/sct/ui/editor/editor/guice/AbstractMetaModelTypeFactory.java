/**
 * Copyright (c) 2012 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.ui.editor.editor.guice;

import java.net.URL;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.MetamodelType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelper;

import com.google.inject.ImplementedBy;
import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public abstract class AbstractMetaModelTypeFactory implements
		IMetaModelTypeFactory {

	public abstract void registerElementTypes(IMetaModelTypeAcceptor acceptor);

	public static final class HintedMetamodelType extends MetamodelType
			implements IHintedType {

		public HintedMetamodelType(String id, URL iconURL, String displayName,
				EClass eClass, IEditHelper editHelper, String semanticHint) {
			super(id, iconURL, displayName, eClass, editHelper);
			this.semanticHint = semanticHint;
		}

		private final String semanticHint;

		public String getSemanticHint() {
			return semanticHint;
		}
	}

	@ImplementedBy(DefaultMetaModelTypeAcceptor.class)
	public static interface IMetaModelTypeAcceptor {
		public void accept(HintedMetamodelType type);
	}

	@Singleton
	public static class DefaultMetaModelTypeAcceptor implements
			IMetaModelTypeAcceptor {

		public void accept(HintedMetamodelType type) {
			if (ElementTypeRegistry.getInstance().getType(type.getId()) == null)
				ElementTypeRegistry.getInstance().register(type);
		}
	}

	@Inject
	private IMetaModelTypeAcceptor acceptor;

	public final void registerElementTypes() {
		registerElementTypes(acceptor);
	}

}
