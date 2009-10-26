package de.cau.cs.kieler.synccharts.dsl.kits.resource;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.linking.impl.SimpleAttributeResolver;
import org.eclipse.xtext.resource.IFragmentProvider;
/**
 * 
 * @author oba
 *	This class gives each parsed object a unique ID, using fragments
 *	and vice versa, meaning every object can be found via its ID (AT link:
 *	getEObjectBzFragmet Path) 
 */
public class KitsFragmentProvider implements IFragmentProvider {

	public EObject getEObject(Resource resource, String fragment) {
		for (TreeIterator<EObject> allContents = resource.getAllContents(); allContents
				.hasNext();) {
			EObject next = allContents.next();
			if (fragment.equals(getFragment(next))) {
				return next;
			}
		}
		return getEObjectByFragmentPath(resource, fragment);
	}

	public String getFragment(EObject obj) {
		String name = SimpleAttributeResolver.NAME_RESOLVER.apply(obj);
		// if ((obj instanceof ValuedObject) || (obj instanceof Action)) {
		// String containerName = SimpleAttributeResolver.NAME_RESOLVER
		// .apply(obj.eContainer());
		// return containerName + "." + name;
		// }
		return (name != null) ? name : getFragmentPath(obj);
	}

	/**
	 * Copied from ResourceImpl
	 */
	private EObject getEObjectByFragmentPath(Resource resource,
			String uriFragment) {
		int length = uriFragment.length();
		if (length > 0) {
			if (uriFragment.charAt(0) == '/') {
				ArrayList<String> uriFragmentPath = new ArrayList<String>(4);
				int start = 1;
				for (int i = 1; i < length; ++i) {
					if (uriFragment.charAt(i) == '/') {
						uriFragmentPath.add(start == i ? "" : uriFragment
								.substring(start, i));
						start = i + 1;
					}
				}
				uriFragmentPath.add(uriFragment.substring(start));

				int size = uriFragmentPath.size();
				EObject eObject = getEObjectForURIFragmentRootSegment(resource,
						size == 0 ? "" : uriFragmentPath.get(0));
				for (int i = 1; i < size && eObject != null; ++i) {
					eObject = ((InternalEObject) eObject)
							.eObjectForURIFragmentSegment(uriFragmentPath
									.get(i));
				}

				return eObject;
			}
		}
		return null;
	}

	/**
	 * Copied from ResourceImpl
	 */
	protected EObject getEObject(Resource resource, List<String> uriFragmentPath) {
		int size = uriFragmentPath.size();
		EObject eObject = getEObjectForURIFragmentRootSegment(resource,
				size == 0 ? "" : uriFragmentPath.get(0));
		for (int i = 1; i < size && eObject != null; ++i) {
			eObject = ((InternalEObject) eObject)
					.eObjectForURIFragmentSegment(uriFragmentPath.get(i));
		}

		return eObject;
	}

	/**
	 * Copied from ResourceImpl
	 */
	protected EObject getEObjectForURIFragmentRootSegment(Resource resource,
			String uriFragmentRootSegment) {
		int position = 0;
		if (uriFragmentRootSegment.length() > 0) {
			try {
				position = Integer.parseInt(uriFragmentRootSegment);
			} catch (NumberFormatException exception) {
				throw new WrappedException(exception);
			}
		}

		List<EObject> contents = resource.getContents();
		if (position < contents.size() && position >= 0) {
			return contents.get(position);
		} else {
			return null;
		}
	}

	/**
	 * Copied from EcoreUtil.
	 * 
	 * @param obj
	 * @return
	 */
	private String getFragmentPath(EObject obj) {
		InternalEObject internalEObject = (InternalEObject) obj;
		List<String> uriFragmentPath = new ArrayList<String>();
		HashSet<InternalEObject> visited = new HashSet<InternalEObject>();
		for (InternalEObject container = internalEObject.eInternalContainer(); container != null
				&& visited.add(container); container = internalEObject
				.eInternalContainer()) {
			uriFragmentPath.add(container.eURIFragmentSegment(internalEObject
					.eContainingFeature(), internalEObject));
			internalEObject = container;
		}

		StringBuffer result = new StringBuffer("//");

		for (int i = uriFragmentPath.size() - 1; i >= 0; --i) {
			result.append('/');
			result.append(uriFragmentPath.get(i));
		}
		return result.toString();
	}

}
