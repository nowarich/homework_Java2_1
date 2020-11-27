package ru.geekbains.DZ;

public class Main {

    public static void main(String[] args) {
        Course c = new Course("running", "swimming"); // Создаем полосу препятствий
        Team team = new Team("DreamTeam", "Ivan", "Zhenya", "Vasiliy", "Mike"); // Создаем команду

        team.getNames();
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты

    }
}
