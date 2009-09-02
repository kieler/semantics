| de.cau.cs.kieler.core.ui
\______________________________________

Core user interface contributions for the KIELER project. Aside from utility
classes for use in the Eclipse UI, the plugin.xml contains definitions of
UI elements that can be reused throughout KIELER. This includes categories
for the most important UI contributions, e.g. commands or views.

Other plug-ins should import this only if they contain UI code and are not
meant to be exported for a stand-alone application or library.

Files:

help/
  contents for eclipse internal help and the welcome page

p2.inf:
  Equinox/p2/Engine/Touchpoint Instructions
  see http://wiki.eclipse.org/Equinox/p2/Engine/Touchpoint_Instructions
  Defines the kieler update site to be available in the RCP application so
  automatic updates are possible.