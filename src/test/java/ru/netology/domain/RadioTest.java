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
    void setCurrentChannelAndMaxChannel() {
        Radio radio = new Radio(20,24);
        radio.increaseChannel();
        assertEquals(21, radio.getCurrentChannel());
    }

    @Test
    void channelOverMaxForDefault() {
        Radio radio = new Radio(12,10);
        radio.increaseChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void channelOverMinForDefault() {
        Radio radio = new Radio(0,10);
        radio.decreaseChannel();
        assertEquals(10, radio.getCurrentChannel());

    }

    @Test
    void channelOverMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-2);
        radio.decreaseChannel();
        assertEquals(10, radio.getCurrentChannel());
    }

    @Test
    void channelOverMax() {
        Radio radio = new Radio(35,10);
        radio.increaseChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    //проверка громкости

    @Test
    void increaseVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(11, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.decreaseVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    void volumeOverMaxForDefault () {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    void volumeOverMinForDefault () {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void volumeOverMax() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(120);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void volumeOverMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-20);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}