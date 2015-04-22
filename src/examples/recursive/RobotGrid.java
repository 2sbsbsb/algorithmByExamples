package examples.recursive;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * <pre>
 * 	Imagine a robot sitting on the upper left hand corner of an NxN grid. The robot can only move in two directions: right and down. 
 * 	How many possible paths are there for the robot?
 * 	
 * 	Follow Up
 * 	Imagine certain squares are “off limits”, such that the robot can not step on them. Design an algorithm to get all possible paths for the robot.
 * </pre>
 * 
 * @author santoshb
 */
public class RobotGrid {

	public static class Point {
		
		int x;
		int y;

		/**
		 * @param x
		 * @param y
		 */
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}

	}

	/**
	 * @param n
	 * @return
	 */
	public static List<String> robotPaths(int n) {
		List<String> pathList = new ArrayList<String>();
		getPaths(n, 1, 1, "", pathList);
		return pathList;
	}

	/**
	 * @param n
	 * @param i
	 * @param j
	 * @param path
	 * @param pathList
	 */
	public static void getPaths(int n, int i, int j, String path,
			List<String> pathList) {
		path += String.format(" (%d,%d)", i, j);
		if (i == n && j == n) { // reach the (n,n) point
			pathList.add(path);
		} else if (i > n || j > n) {// wrong way
			return;
		} else {
			getPaths(n, i + 1, j, path, pathList);
			getPaths(n, i, j + 1, path, pathList);
		}
	}

	public static void main(String[] args) {
		List<String> results = robotPaths(5);
		for (int i = 0; i < results.size(); i++) {
			System.out.println(results.get(i));
		}
	}

}
