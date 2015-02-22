/**
 * 
 */
package de.cau.cs.kieler.scgprios.transform

import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.SCGraph
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.scgprios.common.Helper
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scgprios.common.Tuple

/**
 * @author cbu
 *
 */
class OptimizeSCGTransformation extends Transformation{
    
    Helper helper = new Helper
    
    override transform(EObject eObject, KielerCompilerContext context) {
        //var scgraph_P = transformSCGToSCG_P(eObject as SCGraph)
        return optimizeThreads(eObject as SCGraph)
    }
    
    def SCGraph optimizeThreads(SCGraph scg){
        var nodes = scg.nodes
        var nodes2remove = <Node> newLinkedList
        var cf2remove = <Tuple<Node, ControlFlow>> newLinkedList 
        var flag = false //shortens runtime
        for (n : nodes){
            if (n instanceof Entry){
                var exit = (n as Entry).exit
                if ((n as Entry).next.target.equals(exit)){
                    flag = true
                    var fork = ((exit as Exit).next.target as Join).fork
                    for (cf : (fork as Fork).next){
                        if ((cf as ControlFlow).target.equals(n)){
                            cf2remove.add(new Tuple(fork,cf))
                        }
                    }
                    nodes2remove.add(n)
                    nodes2remove.add(n.exit)
                }
                
            }
        }
        for (r : nodes2remove){
            nodes.remove(r)
        }
        for (c : cf2remove){
            (c.a as Fork).next.remove(c.b)
        }
        if (flag){
            optimizeForks(scg)
        } else {
            scg
        }
    }
    
    // If the join node of the corresponding fork node is connected to that fork node
    // and threads between them do nothing, this function might cause errors.
    // It does not make sense to model anything like this: it would result in an infinite loop!!!
    def SCGraph optimizeForks(SCGraph scg){
        var nodes = scg.nodes
        var nodes2remove = <Node> newLinkedList
        for (n : nodes){
            if (n instanceof Fork){
                if ((n as Fork).next.length == 0){
                    var nextTarget = (n as Fork).join.next.target
            
                        for (i : n.incoming){
                            if (i instanceof ControlFlow){
                                i.target = nextTarget
                            }
                        }
                    nodes2remove.add(n)
                    nodes2remove.add((n as Fork).join)
                    //(n as Fork).join.next = null
                } else if ((n as Fork).next.length ==1){
                    var entry = (n as Fork).next.head.target
                    var targetOfEntry = (entry as Entry).next.target
                    for (i : n.incoming){
                        if (i instanceof ControlFlow){
                            i.target = targetOfEntry
                        }
                    }
                    var exit = (entry as Entry).exit
                    var targetOfJoin = (n as Fork).join.next.target
                    for (e : exit.incoming){
                        if (e instanceof ControlFlow){
                            e.target = targetOfJoin
                        }
                    }
                    nodes2remove.add(n)
                    nodes2remove.add((n as Fork).join)
                    nodes2remove.add(entry)
                    nodes2remove.add(exit)
                    //(n as Fork).join.next = null;
                }
            } 
        }
        for (r : nodes2remove){
            nodes.remove(r)
        }
        scg
    }
    

}