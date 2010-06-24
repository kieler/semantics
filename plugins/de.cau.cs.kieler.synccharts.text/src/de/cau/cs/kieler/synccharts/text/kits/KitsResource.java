package de.cau.cs.kieler.synccharts.text.kits;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parsetree.reconstr.SerializerOptions;
import org.eclipse.xtext.resource.XtextResource;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Scope;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.contentadapter.SyncchartsContentUtil;
import de.cau.cs.kieler.synccharts.contentadapter.UniqueStringCache;

/**
 * 
 * @author chsch
 *
 */

public class KitsResource extends LazyLinkingResource {

	/** copied from TriggerListenerIDs */
    List<UniqueStringCache> caches = new ArrayList<UniqueStringCache>();
	
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		super.doLoad(inputStream, options);
		setupScopeIDs();
	}
    
	@Override
	public void doSave(OutputStream outputStream, Map<?,?> options)
			throws IOException {
		
		// there's something strange let me go crazy : options is null no matter 
		// what the param in resource.save(...) is ... :-(
		Map<String,Object> myOptions = new HashMap<String, Object>();		
		myOptions.put(XtextResource.OPTION_SERIALIZATION_OPTIONS, new SerializerOptions(true, false));
		super.doSave(outputStream, myOptions);
	}
	
	
	/** 
	 * Eliminates an ugly bug within the calling method
	 * {@link org.eclipse.xtext.resource.XtextResource#update(int, int, String)}:<br>
	 *  If a parsing round fails entirely, the last previously successfully
	 *  deducted EObject will remain in contents though the parseResult is empty!
	 *  After the next successful parser run the new EObject will be added
	 *  to contents regardless the non-emptiness of contents. */
	public void updateInternalState(IParseResult parseResult) {
		if (parseResult.getRootASTElement() != null
				&& getContents().size() != 0
				&& !getContents().get(0).equals(parseResult.getRootASTElement())) {
			unload(getContents().get(0));
			getContents().remove(getContents().get(0));
		}
		super.updateInternalState(parseResult);
	}
	
	public void update(int offset, int replacedTextLength, String newText) {
		super.update(offset, replacedTextLength, newText);
		setupScopeIDs();
	}
	
	/** adapted from TriggerListenerIDs */
	@SuppressWarnings("unchecked")
	private void setupScopeIDs() {

		caches.clear();
		EObject o = null;
		for (Iterator<EObject> i = this.getAllContents(); i.hasNext(); o = i
				.next()) {
			if (o instanceof Scope) {
				Scope scope = (Scope) o;
				String newId = scope.getLabel();
				String prefix = (scope instanceof State)?"_S":"_R";
				
		        if (newId == null || newId.trim().equals("")) {
		            String anonymousId = getUniqueString(scope, SyncchartsPackage.eINSTANCE.getScope_Id(),
		                    prefix);
		            scope.setId(anonymousId);
		        } else {
		        
					newId = newId.replaceAll("\\s", "_");

					// check whether ID is unique					
					boolean scopeIsState = (scope instanceof State);
					
					Scope parentScope = scopeIsState ? ((State) scope)
							.getParentRegion() : ((Region) scope)
							.getParentState();
					if (parentScope != null) {
						EList<Scope> children = (EList<Scope>) (scopeIsState ? ((Region) parentScope)
								.getInnerStates()
								: ((State) parentScope).getRegions());

						for (Scope sibling : children) {
								String siblingId = sibling.getId();
								if (sibling != scope && siblingId != null
										&& siblingId.equals(newId)) {
									// resolve conflict by changing auto
									// generated
									// IDs (for
									// anonymous states)
									if (sibling.getLabel() == null
											|| sibling.getLabel().trim()
													.equals("")) {
										String dummyId = getUniqueString(
												sibling,
												SyncchartsPackage.eINSTANCE
														.getScope_Id(), "_S");
										sibling.setId(dummyId);
									}
								}
						}
					}
					scope.setId(newId);
				}
			}
		}
	}
     
	/** copied from TriggerListenerIDs */
	private String getUniqueString(EObject target, EAttribute attribute,
			String prefix) {
		EObject parent = target.eContainer();
		UniqueStringCache cache = null;
		for (UniqueStringCache c : caches) {
			if ((parent == null && c.getParent() == null)
					|| (parent != null && c.getParent() != null && c.getParent().equals(parent)
					&& c.getAttribute().equals(attribute))) {
				cache = c;
			}
		}
		if (cache == null) {
			cache = new UniqueStringCache(parent, attribute);
			caches.add(cache);
		}
		String temp = SyncchartsContentUtil.getNewUniqueString(target,
				attribute, prefix, cache);
		cache.add(temp);
		return temp;
	}

}
