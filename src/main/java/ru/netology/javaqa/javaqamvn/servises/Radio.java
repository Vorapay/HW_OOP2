package ru.netology.javaqa.javaqamvn.servises;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int quantity = 10; // количество радиостанций
    private int soundVolume; //громкость звука
    private int numberRadioStation; //номер текущей радиостанции



}


