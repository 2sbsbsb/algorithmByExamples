package examples.betterProgrammer;

import java.util.*;

public class BetterProgrammerTask {

	// Please do not change this interface
	public static interface Node {
		int getValue();

		List<Node> getChildren();
	}

	static double sum;
	static int count;

	public static double getAverage(Node root) {
		/*
		 * Please implement this method to return the average of all node values
		 * (Node.getValue()) in the tree.
		 */
		calculateSumCount(root);
		return sum / (double) count;
	}

	/**
	 * @param node
	 * @param sum
	 * @param count
	 */
	public static void calculateSumCount(Node node) {
		if (node != null) {
			sum += node.getValue();
			count++;
			List<Node> childrens = node.getChildren();
			if (childrens != null) {
				for (Node child : childrens) {
					calculateSumCount(child);
				}
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}

}
