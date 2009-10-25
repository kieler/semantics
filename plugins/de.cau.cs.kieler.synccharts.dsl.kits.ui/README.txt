| de.cau.cs.kieler.synccharts.dsl.kits.ui
\____________________________________________

This is the UI plug-in for the textual editor for SyncCharts. It contains user
interface related code for the editor, for instance it has code for content 
assist, labeling (icons) and the outline view (how the description of the
elements in the outline view will be displayed). 

This plug-in will be generated but you can "bind" your modified code by listing
it in the declarative Java class "KitsUIModule". This way, even if the whole 
plug-in was regenerated, still your modified code will be used. So this is like 
marking GMF- or EMF-generated code with "generated NOT" tags but it is more 
modular because in Xtext generated and not generated code does not stay in the
same file.        