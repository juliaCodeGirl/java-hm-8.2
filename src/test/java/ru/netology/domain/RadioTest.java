package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void nextChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(3);
        radio.increaseChannel();
        assertEquals(4, radio.getCurrentChannel());

    }

    @Test
    void previousChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(6);
        radio.decreaseChannel();
        assertEquals(5, radio.getCurrentChannel());
    }

    @Test
    void channelOverMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(12);
        radio.increaseChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    void channelOverMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-9);//если бы можно было кликать в обратную сторону от 0
        radio.decreaseChannel();
        assertEquals(0, radio.getCurrentChannel());

    }

    //проверка громкости

    @Test
    void increaseVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.decreaseVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    void volumeOverMax () {
        Radio radio = new Radio();
        radio.setCurrentVolume(24);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    void volumeOverMin () {
        Radio radio = new Radio();
        radio.setCurrentVolume(-3);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}