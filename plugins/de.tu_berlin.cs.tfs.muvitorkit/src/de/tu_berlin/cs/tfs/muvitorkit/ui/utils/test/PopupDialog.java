/******************************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation
 ****************************************************************************/

package de.tu_berlin.cs.tfs.muvitorkit.ui.utils.test;

import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListDialog;

/**
 * A simple dialog with a list from which the user can select one item.
 * 
 * @author ldamus
 */
public class PopupDialog extends ListDialog {

	/**
	 * Constructs a new instance
	 * 
	 * @param parent
	 *            the shell
	 * @param contents
	 *            the elements to present in the list
	 * @param labelProvider
	 *            the label provider
	 */
	public PopupDialog(final Shell parent, final List<?> contents,
			final ILabelProvider labelProvider) {
		super(parent);
		setLabelProvider(labelProvider);
		setContentProvider(ArrayContentProvider.getInstance());
		setInput(contents);
		setTitle("Select Action");
		setMessage("Select an action:");
	}

	/**
	 * Constructs a new instance
	 * 
	 * @param parent
	 *            the shell
	 * @param contents
	 *            the elements to present in the list
	 * @param labelProvider
	 *            the label provider
	 */
	public PopupDialog(final Shell parent, final List<?> contents) {
		this(parent, contents, new LabelProvider());
	}
}
