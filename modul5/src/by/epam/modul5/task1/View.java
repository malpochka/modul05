package by.epam.modul5.task1;

public class View {

	public void printDirectory(Directory d) {

		for (int i = 0; i < d.getDirectorys().size(); i++) {
			System.out.println(d.getDirectorys().get(i));
		}

		for (int i = 0; i < d.getTextFile().size(); i++) {
			System.out.println("Название файла: " + d.getTextFile().get(i).getName());
			System.out.println(d.getTextFile().get(i));
		}
	}
}
