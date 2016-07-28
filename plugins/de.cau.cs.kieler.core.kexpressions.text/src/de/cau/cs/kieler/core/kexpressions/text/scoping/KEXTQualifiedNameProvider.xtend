package de.cau.cs.kieler.core.kexpressions.text.scoping

import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.util.Tuples;

import com.google.common.base.Function;
import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.kieler.core.kexpressions.Identifiable

/**
 * @author ssm
 * 
 */
public class KEXTQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	private val qualifiedName = new PolymorphicDispatcher<QualifiedName>("qualifiedName", 1, 1,
		Collections.singletonList(this), PolymorphicDispatcher.NullErrorHandler.<QualifiedName>get()) {
		override QualifiedName handleNoSuchMethod(Object... params) { return null }
	}

	@Inject
	private val converter = new IQualifiedNameConverter.DefaultImpl()

	@Inject
	private val cache = IResourceScopeCache.NullImpl.INSTANCE

	// Function<EObject, String>
	private val idResolver = SimpleAttributeResolver.newResolver(typeof(String), "id")
	private val nameResolver = SimpleAttributeResolver.newResolver(typeof(String), "name")
	private val resolver = new Function<EObject, String>() {
		override String apply(EObject input) {
			if (input instanceof Identifiable) {
				return idResolver.apply(input);
			} else {
				return nameResolver.apply(input);
			}
		}
	};

	override getResolver() {
		return resolver;
	}

	override def QualifiedName getFullyQualifiedName(EObject obj) {
		return cache.get(Tuples.pair(obj, "fqn"), obj.eResource(), new Provider<QualifiedName>() {
			override QualifiedName get() {
				var EObject temp = obj;
				val QualifiedName qualifiedNameFromDispatcher = qualifiedName.invoke(temp);
				if (qualifiedNameFromDispatcher != null)
					return qualifiedNameFromDispatcher;
				val name = getResolver().apply(temp);
				if (Strings.isEmpty(name))
					return null;
				val QualifiedName qualifiedNameFromConverter = converter.toQualifiedName(name);
				while (temp.eContainer() != null) {
					temp = temp.eContainer();
					val QualifiedName parentsQualifiedName = getFullyQualifiedName(temp);
					if (parentsQualifiedName != null)
						return parentsQualifiedName.append(qualifiedNameFromConverter);
				}
				return qualifiedNameFromConverter;
			}
		});
	}
}