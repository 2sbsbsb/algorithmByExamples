package examples.betterProgrammer;

import java.util.*;

public class BetterProgrammerTask {

	// Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }


    public static List<Node> traverseTreeInDepth(Node root) {
        /*
          Please implement this method to
          traverse the tree in depth and return a list of all passed nodes.

          The method shall work optimally with large trees.
         */
    	List<Node> results = new ArrayList<Node>();
    	if(root!=null) {
    		results.add(root);
    		List<Node> childrens = root.getChildren();
    		for(Node children : childrens) {
    			results.addAll(traverseTreeInDepth(children));
    		}
    	}    	
    	return results;
    } 
	  
}
