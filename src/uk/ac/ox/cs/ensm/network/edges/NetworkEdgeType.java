package uk.ac.ox.cs.ensm.network.edges;

import uk.ac.ox.cs.ensm.network.NSNetwork;

/**
 * A type of relationship between two nodes in the normative network
 * Typically, it's a relationship between norms.
 * <p>
 * Norms may have four types of relationships in the normative network:
 * 
 * <ol>
 * <li>	<tt>generalisation</tt>. A norm <tt>n</tt> is more general than another 
 * 			norm <tt>n'</tt> if the precondition and postcondition of 
 * 			<tt>n'</tt> satisfy the precondition and postcondition of 
 * 			<tt>n</tt>, but not on the contrary. Whenever a norm <tt>n</tt>
 * 			is more general than norm <tt>n'</tt>, then we can establish a
 * 			generalisation relationship in the normative network from 
 * 			<tt>n'</tt> to its parent norm <tt>n</tt>; * 
 * <li>	<tt>substitutability</tt>. Two norms are substitutable if, for each
 * 			situation where both norms apply, only one of them is necessary 
 * 			so that no conflicts arise.
 * <li>	<tt>complementarity</tt>. Two norms are substitutable if, for each
 * 			situation where both norms apply, the two of them are necessary 
 * 			so that no conflicts arise.
 * <li>	<tt>exclusiveness</tt>
 * 
 * </ol>
 * 
 * @author "Javier Morales (javier.morales@cs.ox.ac.uk)"
 * @see NSNetwork
 */
public enum NetworkEdgeType {
	Generalisation,	Substitutability, Complementarity, Concurrency, Regulation, Inclusion;	
}
