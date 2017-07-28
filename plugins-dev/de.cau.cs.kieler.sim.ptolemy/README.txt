@author Christian Motika, <cmot@informatik.uni-kiel.de>
@date 2010-08-04

Use this plug in if you want to use additional KIELER Ptolemy actors. Be aware of that you have to explicitly set a dependency to org.ptolemy or org.ptolemy.tiny in order to run the actors.

ATTENTION: org.ptolemy.tiny needs a reference to sim.ptolemy because Ptolemy needs to know the additional KIELER actors. Because
sim.ptolemy depends on org.ptolemy or org.ptolemy.tiny we might run into a cyclic dependency.
As a workaround we fixed the search order using the pluginPath variable so that firstly the larger org.ptolemy is found which has NO backwards dependency.