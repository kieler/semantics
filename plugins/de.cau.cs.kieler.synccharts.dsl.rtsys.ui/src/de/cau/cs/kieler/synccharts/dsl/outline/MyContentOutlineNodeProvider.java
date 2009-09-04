package de.cau.cs.kieler.synccharts.dsl.outline;

import org.eclipse.xtext.ui.common.editor.outline.ContentOutlineNode;

import com.google.inject.Provider;

@Deprecated
/**
 * this problem was an official Xtext bug
 * and is fixed
 */
public class MyContentOutlineNodeProvider implements
		Provider<ContentOutlineNode> {
	private ContentOutlineNode providedContentOutlineNode = new ContentOutlineNode();

	public ContentOutlineNode get() {
		// TODO Auto-generated method stub

		return providedContentOutlineNode;
	}

}
