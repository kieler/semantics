package de.cau.cs.kieler.synccharts.dsl.validation;

import org.eclipse.xtext.validation.Check;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.*;

/**
 * Returns an Image object that can then be painted on the screen. The url
 * argument must specify an absolute {@link URL}. The name argument is a
 * specifier that is relative to the url argument.
 * <p>
 * This method always returns immediately, whether or not the image exists. When
 * this applet attempts to draw the image on the screen, the data will be
 * loaded. The graphics primitives that draw the image will incrementally paint
 * on the screen.
 * 
 * @param url
 *            an absolute URL giving the base location of the image
 * @param name
 *            the location of the image, relative to the url argument
 * @return the image at the specified URL
 * @see Image
 */

public class RetypingSyncchartsJavaValidator extends
		AbstractRetypingSyncchartsJavaValidator {

	@Check
	public void checkStateID(State state) {
		if ((RetypingSyncchartsPackage.eINSTANCE.getState_StateID() == null)
				&& (RetypingSyncchartsPackage.eINSTANCE.getState_StateLabel() != null)) {
			System.out.println("I work!!");
			warning ("I AM AN ANGRY WARNING", RetypingSyncchartsPackage.STATE__STATE_ID);
		} else {
			System.out.println("I don't work!!");
		}
		System.out.println("the method was over");

		// @Check
		// public void checkTypeNameStartsWithCapital(Type type) {
		// if (!Character.isUpperCase(type.getName().charAt(0))) {
		// warning("Name should start with a capital", MyDslPackage.TYPE__NAME);
		// }
		// }

	}
}

// @Check
// public void checkUniqueStateID (State state){
// if (state.currentObject.eGet(state.getClass().getMethod("getStateName",
// (Class<?>) null) == null)
// de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State.class.getDeclaredField("Label")

