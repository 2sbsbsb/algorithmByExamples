package examples.betterProgrammer;

import java.util.*;

public class BetterProgrammerTask {

	 // Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }


    /**
     * @param root
     * @return
     */
    public static List<Node> traverseTreeInDepth(Node root) {
        /*
          Please implement this method to
          traverse the tree in depth and return a list of all passed nodes.
          The method shall work optimally with large trees.
         */
    	List<Node> results = new ArrayList<Node>();
    	List<Node> childrens = root.getChildren();
    	results.add(root);
    	if(childrens!=null && childrens.size()>0) {
    		for(Node node : childrens) {    			
    			results.addAll(traverseTreeInDepth(node));
    		}
    	}    	
    	return results;
    }

	
}
