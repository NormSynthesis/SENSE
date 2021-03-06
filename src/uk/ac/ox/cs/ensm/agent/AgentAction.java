package uk.ac.ox.cs.ensm.agent;

/**
 * An action available to the environment agents. An agent
 * action may be whatever that can be performed by the agents.
 * As an example, within a road traffic scenario, some examples of actions
 * are "Go forward", "Stop", "Turn left", or "Turn right".
 *  
 * @author "Javier Morales (javier.morales@cs.ox.ac.uk)"
 */
public interface AgentAction {

	//---------------------------------------------------------------------------
	// Methods
	//---------------------------------------------------------------------------
	
	/**
	 * Returns a {@code String} with the name of the action
	 * 
	 * @return a {@code String} with the name of the action
	 */
	public String toString();
}
