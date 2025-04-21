package ru.netology.javaqa.javaqamvn.servises;

public class Radio {
    public int numberRadioStation; //номер текущей радиостанции
    int soundVolume; //громкость звука
    //int certainNumberRadioStation; //определенная волна, накоторую хотим переключиться

    // переключаем на следующую радиоволну
    public void nextRadioStation() {
        if (numberRadioStation == 9) {
            numberRadioStation = 0;
        } else {
            numberRadioStation = numberRadioStation + 1;
        }
    }

    // переключаем на предидущую радиоволну
    public void prevRadioStation() {
        if (numberRadioStation == 0) {
            numberRadioStation = 9;
        } else {
            numberRadioStation = numberRadioStation - 1;
        }
    }

    // переключаем на выбранную определенную радиоволну (имеется проверка достуаного диапозона волн)
    public void setRadioStation(int newRadioStation) {

        if (newRadioStation < 0) {
            return;
        }
        if (newRadioStation > 9) {
            return;
        }
        numberRadioStation = newRadioStation;
    }

    // увеличиваем громкость
    public void increaseVolume() {
        if (soundVolume >= 100) {
            soundVolume = 100;
        } else {
            soundVolume = soundVolume + 1;
        }
    }

    // уменьшаем громкость
    public void decreaseVolume() {
        if (soundVolume <= 0) {
            soundVolume = 0;
        } else {
            soundVolume = soundVolume - 1;
        }
    }
}


