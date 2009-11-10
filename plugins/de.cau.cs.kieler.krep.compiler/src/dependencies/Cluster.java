//package dependencies;
//
//import java.util.HashMap;
//import java.util.Set;
//
//public class Cluster {
//
//	private HashMap<String, Integer> cluster = new HashMap<String, Integer>();
//
//	private HashMap<String, Node> nodes = new HashMap<String, Node>();
//
//	/** Map cluster ID to delay */
//	private HashMap<Integer, Integer> delay = null;
//
//	public Cluster() {
//		super();
//	}
//
//	public Cluster(Set<Node> nodes) {
//		super();
//		for (Node node : nodes) {
//			this.nodes.put(node.getName(), node);
//			cluster.put(node.getName(), 0);
//		}
//	}
//
//	public void add(Set<Node> nodes, int i) {
//		for (Node node : nodes) {
//			add(node, i);
//		}
//	}
//
//	public void add(Node node, int i) {
//		nodes.put(node.getName(), node);
//		cluster.put(node.getName(), i);
//	}
//
//	public int getDelay(Node node) {
//		if (delay == null) {
//			computeDelays();
//		}
//		return delay.get(nodes.get(node));
//	}
//
//	public void computeDelays() {
//		delay = new HashMap<Integer, Integer>();
//		for (String n : nodes.keySet()) {
//			delay.put(cluster.get(n), 0);
//		}
//		for (String n : nodes.keySet()) {
//			Node node = nodes.get(n);
//			for (Edge e : node.getIn()) {
//				if (e.getDelay() == 0) {
//					String source = e.getNode().getName();
//					if (cluster.get(source) != cluster.get(n)) {
//						delay.put(cluster.get(n), Math.max(delay.get(cluster
//								.get(n)), delay.get(cluster.get(source)) + 1));
//					}
//				}
//			}
//		}
//	}
//
//	public int getID(String name) {
//		return cluster.get(name);
//	}
//
//	public int getDelay(String name) {
//		if (delay == null) {
//			computeDelays();
//		}
//		return delay.get(cluster.get(name));
//	}
//
//	public int getID(Node node) {
//		return cluster.get(node.getName());
//	}
//
//}