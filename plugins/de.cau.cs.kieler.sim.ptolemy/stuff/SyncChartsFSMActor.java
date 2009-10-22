package ptolemy.actor.kiel;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import ptolemy.domains.modal.kernel.Action;
import ptolemy.domains.modal.kernel.MultipleEnabledTransitionsException;
import ptolemy.domains.modal.kernel.State;
import ptolemy.domains.modal.kernel.Transition;
import ptolemy.domains.modal.kernel.FSMActor;
import ptolemy.kernel.CompositeEntity;
import ptolemy.kernel.util.IllegalActionException;
import ptolemy.kernel.util.NameDuplicationException;
import ptolemy.kernel.util.Workspace;
import ptolemy.domains.modal.kernel.Transition;

public class SyncChartsFSMActor extends FSMActor {
    /** Create an FSMActor in the specified container with the specified
     *  name. The name must be unique within the container or an exception
     *  is thrown. The container argument must not be null, or a
     *  NullPointerException will be thrown.
     *  @param container The container.
     *  @param name The name of this actor within the container.
     *  @exception IllegalActionException If the entity cannot be contained
     *   by the proposed container.
     *  @exception NameDuplicationException If the name coincides with
     *   an entity already in the container.
     */
    public SyncChartsFSMActor(CompositeEntity container, String name)
            throws IllegalActionException, NameDuplicationException {
        super(container, name);
    }

    /** Construct an FSMActor in the specified workspace with an empty
     *  string as its name. You can then change the name with setName().
     *  If the workspace argument is null, then use the default workspace.
     *  Add the actor to the workspace directory.
     *  Increment the version number of the workspace.
     *  @param workspace The workspace that will list the actor.
     */
    public SyncChartsFSMActor(Workspace workspace) {
        super(workspace);
    }
	
    /** Return an enabled transition among the given list of transitions.
     *  If there is only one transition enabled, return that transition.
     *  In case there are multiple enabled transitions, if any of
     *  them is not nondeterministic, throw an exception. See {@link Transition}
     *  for the explanation of "nondeterministic". Otherwise, randomly choose
     *  one from the enabled transitions and return it.
     *  <p>
     *  Execute the choice actions contained by the returned transition.
     *  @param transitionList A list of transitions.
     *  @return An enabled transition, or null if none is enabled.
     *  @exception IllegalActionException If there is more than one
     *   transition enabled and not all of them are nondeterministic.
     */
    public Transition chooseTransition(List transitionList)
            throws IllegalActionException {
        Transition result = null;

        List enabledTransitions = enabledTransitions(transitionList);
        int length = enabledTransitions.size();

        if (length == 1) {
            result = (Transition) enabledTransitions.get(0);
        } else if (length > 1) {
            // Ensure that if there are multiple enabled transitions, all have different priority
            Iterator transitions = enabledTransitions.iterator();
            
            HashMap<Integer,Transition> enabledTransitionMap = new HashMap<Integer,Transition>();
            int maxKey = 0;

            while (transitions.hasNext()) {
                Transition enabledTransition = (Transition) transitions.next();
                
                System.out.println(enabledTransition.annotation.getValueAsString());

                int key = 0;
                try {
                	String keyString = enabledTransition.annotation.getValueAsString();
                	keyString = keyString.replace("\"", "");
                	key = Integer.parseInt(keyString);
                	System.out.println("KEY: ("+enabledTransition.getFullName()+") "+ key);
                }catch(Exception e){}
                
                if (enabledTransitionMap.containsKey(key)) {
                    throw new MultipleEnabledTransitionsException(
                            currentState(),
                            "Nondeterministic SyncChartFSM error: "
                                    + "Multiple enabled transitions found but not all"
                                    + " of them are marked nondeterministic. Transition "
                                    + enabledTransition.getName()
                                    + " is deterministic.");
                }
                else {
                	enabledTransitionMap.put(key, enabledTransition);
                	if (maxKey < key) maxKey = key;
                }
            }

            //choose transition with smallest priority value
            for (int prio = 0; prio < maxKey; prio++) {
            	if (enabledTransitionMap.containsKey(prio)) {
            		 result = (Transition) enabledTransitionMap.get(prio);
                 	System.out.println("CHOOSEN TRANSITION: "+result.getFullName()+" with key "+ prio);
            		 break;
            	}
            }
        }

        if (result != null) {
            if (_debugging) {
                _debug("Enabled transition: ", result.getFullName());
            }

            Iterator actions = result.choiceActionList().iterator();

            while (actions.hasNext()) {
                Action action = (Action) actions.next();
                action.execute();
            }
        }
     
        _lastChosenTransition = result;
        return result;
    }
    
    public void setCurrentState(State state) {
    	this._currentState = state;
    }
    
	
}
