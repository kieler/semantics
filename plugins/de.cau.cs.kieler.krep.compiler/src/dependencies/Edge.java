package dependencies;

/**
 * @author ctr
 * edge in the dependency graph
 */
public class Edge {

	private Node n;
	private int delay;
	
	
	/**
	 * @param n 
	 * @param delay of this dependency
	 */
	public Edge(final Node n, final int delay) {
		super();
		this.n = n;
		this.delay = delay;
	}
	
	
	/**
	 * @return delay of this dependency
	 */
	public int getDelay() {
		return delay;
	}

	
	/**
	 * @return corresponding node
	 */
	public Node getNode() {
		return n;
	}  
	
	public String toString(){
	   return "->" + n; 
	}
}
