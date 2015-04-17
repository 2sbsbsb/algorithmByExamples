package examples.betterProgrammer;

import java.util.*;

public class BetterProgrammerTask {

	// Please do not change this interface
	public static interface Node {
		int getValue();

		List<Node> getChildren();
	}

	/**
	 * Created a class to hold the count of node and sum;
	 */
	public static class NodeCount {
		int count;
		int sum;

		public void add(int value) {
			count++;
			sum += value;
		}

		public double avg() {
			return sum / (double) count;
		}
	}

	/**
	 * @param nc
	 * @param root
	 */
	public static void updateCount(NodeCount nc, Node root) {
		nc.add(root.getValue());
		List<Node> kids = root.getChildren();
		if (kids != null) {
			for (Node kid : kids) {
				updateCount(nc, kid);
			}
		}
	}

	public static double getAverage(Node root) {
		/*
		 * Please implement this method to return the average of all node values
		 * (Node.getValue()) in the tree.
		 */
		NodeCount nc = new NodeCount();
		updateCount(nc, root);
		return nc.avg();
	}

}
