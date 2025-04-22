package ru.netology.javaqa.javaqamvn.servises;

public class Radio {
    private int numberRadioStation; //номер текущей радиостанции
    private int soundVolume; //громкость звука

    // гетер текущей волны
    public int getNumberRadioStation() {
        return numberRadioStation;
    }

    // сетер текущей волны
    public void setNumberRadioStation(int newNumberRadioStation) {
        if (newNumberRadioStation < 0) {
            return;
        }
        if (newNumberRadioStation > 9) {
            return;
        }
        numberRadioStation = newNumberRadioStation;
    }

    // гетер уровня громкости
    public int getSoundVolume() {
        return soundVolume;
    }

    // сетер уровня громкости
    public void setSoundVolume(int newSoundVolume) {
        soundVolume = newSoundVolume;
    }

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

    // увеличиваем громкость
    public void increaseVolume() {
        if (soundVolume > 100) {
            soundVolume = 100;
        } else {
            soundVolume = soundVolume + 1;
        }
        ;
    }

    // уменьшаем громкость
    public void decreaseVolume() {
        if (soundVolume < 0) {
            soundVolume = 0;
        } else {
            soundVolume = soundVolume - 1;
        }
    }
}


