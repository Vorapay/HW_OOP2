package ru.netology.javaqa.javaqamvn.servises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test // не выставляет радиоволну, больше чем количество допустимых
    public void shouldSetRadioStationUnderBorder() {
        Radio rad = new Radio(14);

        rad.setNumberRadioStation(14);

        int expected = 0;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // если пользователь не указал количество радиостанций, но захотел выставить радиоволну, выше допустимой по умолчанию
    public void shouldNoRange() {
        Radio rad = new Radio();

        rad.setNumberRadioStation(10);

        int expected = 0;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //следующая волна, если указан новый диапазон радиоволн
    public void shouldNextRadioStationNewRange() {
        Radio rad = new Radio(14);

        rad.setNumberRadioStation(11);

        rad.nextRadioStation();

        int expected = 12;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //следующая волна, если не указан новый диапазон радиоволн
    public void shouldNextRadioStation() {
        Radio rad = new Radio();

        rad.setNumberRadioStation(5);

        rad.nextRadioStation();

        int expected = 6;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //следующая волна, если не указан новый диапазон радиоволн (граничное значение)
    public void shouldNextRadioStationUpBoarder() {
        Radio rad = new Radio();

        rad.setNumberRadioStation(9);

        rad.nextRadioStation();

        int expected = 0;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //следующая волна, если указан новый диапазон радиоволн (граничное значение)
    public void shouldNextRadioStationUderBoarder() {
        Radio rad = new Radio(14);

        rad.setNumberRadioStation(13);

        rad.nextRadioStation();

        int expected = 0;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // предидущая волна, если указан новый диапазон радиоволн
    public void shouldPrevRadioStationNewRange() {
        Radio rad = new Radio(14);

        rad.setNumberRadioStation(13);

        rad.prevRadioStation();

        int expected = 12;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // предидущая волна, если не указан новый диапазон радиоволн
    public void shouldPrevRadioStation() {
        Radio rad = new Radio();

        rad.setNumberRadioStation(8);

        rad.prevRadioStation();

        int expected = 7;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // предидущая волна, если указан новый диапазон радиоволн (граничное значение)
    public void shouldPrevRadioStationDownBorderNewRange() {
        Radio rad = new Radio(14);

        rad.setNumberRadioStation(0);

        rad.prevRadioStation();

        int expected = 13;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // предидущая волна, если не указан новый диапазон радиоволн (граничное значение)
    public void shouldPrevRadioStationDownBorder() {
        Radio rad = new Radio();

        rad.setNumberRadioStation(0);

        rad.prevRadioStation();

        int expected = 9;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // выбор определенной волны, если указан новый диапазон радиоволн
    public void shouldChangeRadioStationNewRange() {
        Radio rad = new Radio(14);

        rad.setNumberRadioStation(12);

        int expected = 12;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // выбор определенной волны, если не указан новый диапазон радиоволн
    public void shouldChangeRadioStation() {
        Radio rad = new Radio();

        rad.setNumberRadioStation(5);

        int expected = 5;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // выбор определенной волны (верхнее граничное значение)
    public void shouldChangeRadioStationUpBorder() {
        Radio rad = new Radio(14);

        rad.setNumberRadioStation(14);

        int expected = 0;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // выбор определенной волны (нижнее граничное значение)
    public void shouldChangeRadioStationDownBorder() {
        Radio rad = new Radio(14);

        rad.setNumberRadioStation(-1);

        int expected = 0;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // увеличение громкости
    public void shouldIncreaseVolume() {
        Radio rad = new Radio(14);

        rad.setSoundVolume(5);

        rad.increaseVolume();

        int expected = 6;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // увеличение громкости (граничное значение)
    public void shouldIncreaseVolumeUpBorder() {
        Radio rad = new Radio(14);

        rad.setSoundVolume(101);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // уменьшение громкости
    public void shouldDecreaseVolume() {
        Radio rad = new Radio(14);

        rad.setSoundVolume(1);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // уменьшение громкости (граничное значение)
    public void shouldDecreaseVolumeDownBorder() {
        Radio rad = new Radio(14);

        rad.setSoundVolume(-1);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}
