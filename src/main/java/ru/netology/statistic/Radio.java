package ru.netology.statistic;
public class Radio {
    public int currentStation;
    public int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getVolume() {
        return currentVolume;
    }


//    Ограничение радиостанций мин/макс.
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }
//    Кнопка "Следующая"
    public int next() {
        if (currentStation < 9) {
            return currentStation++;
        } else {
            return currentStation = 0;
        }
    }
//    Кнопка "Предыдущая"
    public int previous() {
        if (currentStation > 0) {
            return currentStation--;
        } else {
            return currentStation = 9;
        }
    }


//    Ограничение громкости мин/макс.
    public void setCurrentVolume(int newCurrentVolume) { 
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

//    Кнопка "+"
    public int setPlus() {
        if (currentVolume >= 10) {
            return currentVolume = 10;
        } else {
            return currentVolume++;
        }
    }

//    Кнопка "-"
    public int setMinus() {
        if (currentVolume <= 0) {
            return currentVolume = 0;
        } else {
            return currentVolume--;
        }
    }
}

