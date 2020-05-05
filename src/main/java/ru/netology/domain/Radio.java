package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Radio {
    private int maxChannel = 10;
    private int minChannel = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentChannel;
    private int currentVolume;

    public Radio(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public Radio(int currentChannel, int maxChannel) {
        this.currentChannel = currentChannel;
        this.maxChannel = maxChannel;
    }


    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        if (currentChannel < minChannel) {
            this.currentChannel = minChannel;
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseChannel() {
        if (currentChannel < maxChannel) {
            currentChannel++;

        } else {
            currentChannel = minChannel;
        }
    }

    public void decreaseChannel() {
        if (currentChannel > minChannel) {
            currentChannel--;

        }
        else {
            currentChannel = maxChannel;
        }
    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume <= minVolume) {
            return;
        }
        currentVolume--;
    }
}
