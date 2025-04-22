package ru.netology.javaqa.javaqamvn.servises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test //какая волна выбранна на данный момент
    public void shouldSetRadioStation() {
        Radio rad = new Radio();

        rad.setNumberRadioStation(4);

        int expected = 4;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //следующая волна
    public void shouldNextRadioStation() {
        Radio rad = new Radio();

        rad.setNumberRadioStation(5);

        rad.nextRadioStation();

        int expected = 6;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //следующая волна (граничное значение)
    public void shouldNextRadioStationUpBoarder() {
        Radio rad = new Radio();

        rad.setNumberRadioStation(9);

        rad.nextRadioStation();

        int expected = 0;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // предидущая волна
    public void shouldPrevRadioStation() {
        Radio rad = new Radio();

        rad.setNumberRadioStation(7);

        rad.prevRadioStation();

        int expected = 6;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // предидущая волна (граничное значение)
    public void shouldPrevRadioStationDownBorder() {
        Radio rad = new Radio();

        rad.setNumberRadioStation(0);

        rad.prevRadioStation();

        int expected = 9;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // выбор определенной волны
    public void shouldChangeRadioStation() {
        Radio rad = new Radio();

        rad.setNumberRadioStation(5);

        int expected = 5;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // выбор определенной волны (верхнее граничное значение)
    public void shouldChangeRadioStationUpBorder() {
        Radio rad = new Radio();

        rad.setNumberRadioStation(10);

        int expected = 0;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // выбор определенной волны (нижнее граничное значение)
    public void shouldChangeRadioStationDownBorder() {
        Radio rad = new Radio();

        rad.setNumberRadioStation(-1);

        int expected = 0;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // увеличение громкости
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(5);

        rad.increaseVolume();

        int expected = 6;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // увеличение громкости (граничное значение)
    public void shouldIncreaseVolumeUpBorder() {
        Radio rad = new Radio();

        rad.setSoundVolume(101);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // уменьшение громкости
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(1);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // уменьшение громкости (граничное значение)
    public void shouldDecreaseVolumeDownBorder() {
        Radio rad = new Radio();

        rad.setSoundVolume(-1);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}
