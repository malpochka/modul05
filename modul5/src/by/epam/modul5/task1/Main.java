package by.epam.modul5.task1;

/*Создать объект тип Текстовый файл, используя классы Файл и Директория.Методы:Создать, переименовать, 
 * вывести на консоль содержимое, дополнить, удалить.
 */

public class Main {

	public static void main(String[] args) {

		Directory directory = new Directory();
		TextFile file = new TextFile("Доброе утро");
		View view = new View();

		directory.addDirectory(new Directory("Основная"));
		file.addText("Сегодня прекрасное морозное утро");
		directory.addTextFile(file);

		view.printDirectory(directory);

		directory.renameDirectory("Основная", "Корневая");
		directory.renameFile("Доброе утро", "Добрый день");
		view.printDirectory(directory);

		file.addText(file, ", а вечером будет прекрасный закат");

		directory.removeDirectory("Корневая");
		view.printDirectory(directory);
		directory.removeTextFile("Добрый день");

	}

}
