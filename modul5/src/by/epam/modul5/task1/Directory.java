package by.epam.modul5.task1;

import java.util.ArrayList;
import java.util.List;

public class Directory {
	
	private String name;
	private List<TextFile> textFile;
	private List<Directory> directorys;
	
	{
		textFile = new ArrayList<TextFile>();
		directorys = new ArrayList<Directory>();
	}

	public Directory() {

	}

	public Directory(String name) {
		this.name = name;
	}

	public void addTextFile(TextFile file) {
		textFile.add(file);
	}

	public void addDirectory(Directory d) {
		directorys.add(d);
	}

	public void removeDirectory(String name) {
		for (int i = 0; i < directorys.size(); i++) {
			if (directorys.get(i).getName().equalsIgnoreCase(name)) {
				directorys.remove(directorys.get(i));
			}
		}
	}

	public void removeTextFile(String name) {
		for (int i = 0; i < textFile.size(); i++) {
			if (textFile.get(i).getName().equalsIgnoreCase(name)) {
				textFile.remove(textFile.get(i));
			}
		}
	}

	public void renameDirectory(String name, String newname) {
		for (int i = 0; i < directorys.size(); i++) {
			if (directorys.get(i).getName().equalsIgnoreCase(name)) {
				directorys.get(i).setName(newname);
				;
			}
		}
	}

	public void renameFile(String name, String newname) {
		for (int i = 0; i < textFile.size(); i++) {
			if (textFile.get(i).getName().equalsIgnoreCase(name)) {
				textFile.get(i).setName(newname);
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TextFile> getTextFile() {
		return textFile;
	}

	public void setTextFile(List<TextFile> textFile) {
		this.textFile = textFile;
	}

	public List<Directory> getDirectorys() {
		return directorys;
	}

	public void setDirectorys(List<Directory> directorys) {
		this.directorys = directorys;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((directorys == null) ? 0 : directorys.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((textFile == null) ? 0 : textFile.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		if (directorys == null) {
			if (other.directorys != null)
				return false;
		} else if (!directorys.equals(other.directorys))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (textFile == null) {
			if (other.textFile != null)
				return false;
		} else if (!textFile.equals(other.textFile))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Название директории =" + name;

	}

}
