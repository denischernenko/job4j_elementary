package ru.job4j.condition;

public class SwitchWeek {
    public String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
                break;
            default:
                name = "Sunday";
                break;
        }
        return name;
    }

    public void main(String[] args) {
        SwitchWeek.nameOfDay(1);
    }

}
