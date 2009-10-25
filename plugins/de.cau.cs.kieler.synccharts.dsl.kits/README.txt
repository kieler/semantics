| de.cau.cs.kieler.synccharts.dsl.kits
\______________________________________

This is the main plug-in for the textual editor for SyncCharts. 

The overall structure and an overview of the most prominent files are given 
below: 

--------------------------------------------------------------------------------
src/de.cau.cs.kieler.synccharts.dsl
--------------------------------------------------------------------------------
	/KITS.xtext>
	The Xtext grammar of the KIELER textual language for SyncCharts.
--------------------------------------------------------------------------------
	/CreateStateWithID>
	deprecated, can be ignored
--------------------------------------------------------------------------------
	/KitsRuntimeModule.java>
	declarative listing of the used bindings in the runtime plug-in
--------------------------------------------------------------------------------
	/KitsPostProcessor>
	This is the place for M2M transformations in Xtext. It is used to modify 
	the default EMF metamodel generation behavior of Xtext, which is 
	documented [http://www.eclipse.org/Xtext/documentation
	/0_7_2/xtext.html#customPostProcessing here]
--------------------------------------------------------------------------------
	/CreateStateWithID>
	deprecated, can be ignored
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
src/de.cau.cs.kieler.synccharts.dsl.formatting
--------------------------------------------------------------------------------
	/KitsFormatter.java>
	declarative pretty printer class 
	describes how the format of the text will look like when the user clicks
	Ctrl+Alt+F *customized*
--------------------------------------------------------------------------------
src/de.cau.cs.kieler.synccharts.dsl.kits.resource>
--------------------------------------------------------------------------------
	/KitsFragmentProvider.java>
	provides each EObject with a unique ID using its fragments *not generated*
--------------------------------------------------------------------------------
	