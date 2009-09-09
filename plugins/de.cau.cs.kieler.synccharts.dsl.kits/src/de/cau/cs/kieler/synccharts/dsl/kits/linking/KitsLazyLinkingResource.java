/**
 * 
 */
package de.cau.cs.kieler.synccharts.dsl.kits.linking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.xtext.linking.lazy.LazyLinkingResource;

/**
 * @author oba
 * 
 */
public class KitsLazyLinkingResource extends LazyLinkingResource {

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		//
		// if () {
		// super.doLoad(inputStream, options);
		// } else {
		super.doLoad(inputStream, options);
		// }
	}

	@Override
	public void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		// TODO Auto-generated method stub
		super.doSave(outputStream, options);
	}

}
