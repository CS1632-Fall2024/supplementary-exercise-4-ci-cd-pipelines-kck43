package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	int catId;
	String catName;
	boolean catRented;

	public CatImpl(int id, String name) {
		// TODO: Fill in
		catId = id;
		catName = name;
		catRented = false;
	}

	public void rentCat() {
		// TODO: Fill in
		catRented = true;
	}

	public void returnCat() {
		// TODO: Fill in
		catRented = false;
	}

	public void renameCat(String name) {
		// TODO: Fill in
		catName = name;
	}

	public String getName() {
		// TODO: Fill in
		
		return catName;
	}

	public int getId() {
		// TODO: Fill in
		return catId;
	}

	public boolean getRented() {
		// TODO: Fill in
		return catRented;
	}

	public String toString() {
		// TODO: Fill in
		return "ID " + catId + ". " + catName;
	}

}