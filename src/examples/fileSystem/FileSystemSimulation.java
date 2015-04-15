package examples.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class FileSystemSimulation implements Comparable<FileSystemSimulation> {

	// It has a name
	private final String name;
	// If it is a file (True) or directory (false)
	private final boolean file;
	// If it is a directory it should have list of childrens
	private final List<FileSystemSimulation> childrens;

	/**
	 * @param name
	 * @param file
	 */
	public FileSystemSimulation(String name, boolean file) {
		this.name = name;
		this.file = file;
		childrens = new ArrayList<FileSystemSimulation>();
	}

	/**
	 * @param fss
	 * @throws Exception
	 */
	public void addFiles(FileSystemSimulation fss) throws Exception {
		if (!file) {
			childrens.add(fss);
		} else {
			throw new Exception("Cant add files to a file ");
		}
	}

	public void list(boolean sort) {
		//@todo 
	}

	/**
	 */
	@Override
	public int compareTo(FileSystemSimulation o) {
		return name.compareTo(o.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
