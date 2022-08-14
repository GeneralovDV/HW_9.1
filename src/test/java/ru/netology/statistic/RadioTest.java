package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

//    Значение из интервала
    @Test
    public void shouldSetStation() {
        Radio rad = new Radio(15);
        rad.setCurrentStation(5);

        int expected = 5;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
//      Верхнаяя граница. Max+1.
    @Test
    public void shouldNotSetToAboveMaxStation() {
        Radio rad = new Radio(15);

        rad.setCurrentStation(15);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
//      Верхняя граница. Max значение.
    @Test
    public void shouldSetMaxStation() {
        Radio rad = new Radio(15);

        rad.setCurrentStation(14);

        int expected = 14;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    //      Верхняя граница. Max-1.
    @Test
    public void shouldSetMaxMinusOneStation() {
        Radio rad = new Radio(15);

        rad.setCurrentStation(13);

        int expected = 13;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    //      Нижняя граница. Min.
    @Test
    public void shouldSetMinStation() {
        Radio rad = new Radio(15);

        rad.setCurrentStation(0);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    //      Нижняя граница. Min-1.
    @Test
    public void shouldNotSetMinMinusOneStation() {
        Radio rad = new Radio(15);

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    //      Верхняя граница. Min+1.
    @Test
    public void shouldSetMinPlusOneStation() {
        Radio rad = new Radio(15);

        rad.setCurrentStation(1);

        int expected = 1;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    //      Следующая от max-1 до max
    @Test
    public void nextStationToMax() {
        Radio rad = new Radio(15);

        rad.setCurrentStation(13);
        rad.next();

        int expected = 14;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    //      Следующая от max до max+1
    @Test
    public void nextStationAboveMax() {
        Radio rad = new Radio(15);

        rad.setCurrentStation(14);
        rad.next();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    //      Предыдущая от min+1 до min
    @Test
    public void previousStationToMin() {
        Radio rad = new Radio(15);

        rad.setCurrentStation(1);
        rad.previous();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    //      Следующая от min до min-1
    @Test
    public void previousStationLessMin() {
        Radio rad = new Radio(15);

        rad.setCurrentStation(0);
        rad.previous();

        int expected = 14;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

//     Значение из интервала
    @Test
    public void shouldSetVolume() {
         Radio rad = new Radio();

         rad.setCurrentVolume(5);

         int expected = 5;
         int actual = rad.getVolume();

         Assertions.assertEquals(expected,actual);
     }

//    Верхнаяя граница. Max+1.
    @Test
    public void shouldNotSetToAboveMaxVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected,actual);
    }

    //    Верхнаяя граница. Max-1.
    @Test
    public void shouldSetMaxMinusOneVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(9);

        int expected = 9;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected,actual);
    }

    //    Верхнаяя граница. Max.
    @Test
    public void shouldSetToMaxVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);

        int expected = 10;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected,actual);
    }

    //    Нижнаяя граница. Min.
    @Test
    public void shouldSetToMinVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected,actual);
    }

    //    Нижнаяя граница. Min-1.
    @Test
    public void shouldSetToMinMinusOneVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected,actual);
    }

    //    Нижнаяя граница. Min+1.
    @Test
    public void shouldSetToMinPlusOneVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);

        int expected = 1;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected,actual);
    }


    //    Кнопка "+" от max-1 до max
    @Test
    public void plusVolumeToMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(9);
        rad.setPlus();

        int expected = 10;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected,actual);
    }

    //    Кнопка "+" от max до max + 1
    @Test
    public void plusVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.setPlus();

        int expected = 10;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected,actual);
    }

    //    Кнопка "-" от min+1 до min.
    @Test
    public void plusVolumeToMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.setMinus();

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected,actual);
    }
//  Кнопка "-" от min до min-1.
    @Test
    public void plusVolumeLessMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.setMinus();

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected,actual);
    }
}

