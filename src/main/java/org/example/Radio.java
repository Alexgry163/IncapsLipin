package org.example;

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation (int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;

    }

    public void nextStation() {
        if (maxStation <= currentStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prevStation() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume (int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
    }
          this.currentVolume = currentVolume;
        }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

}

