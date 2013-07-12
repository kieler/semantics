| de.cau.cs.kieler.core.annotations
\_____________________________________

Generic metamodel of annotations to be used in other Ecore models.
These annotations can be used to attach arbitrary information to an
annotatable object. Furthermore, an annotation itself is annotatable,
so that annotations can form a tree structure.

NOTE: Xtext is now able to resolve ecore-based meta models (here the annotations.ecore)
 by means of namespace URIs if and only if metamodel is contained in a source folder that
 is additionally mentioned in the source.. declaration of the build.properties and the
 Xtext nature is added to the project containing the meta model.
 For this reason that nature is attached to this bundle.
