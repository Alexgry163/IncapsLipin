package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
Radio radio = new Radio();

    @Test
    public void shouldChangeStation() {
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationUnderMinStation() {

        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldSetStationOverMaxStation() {
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldNextStation() {
        radio.setCurrentStation(6);
        radio.nextStation();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldOverMaxStation1() {
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldOverMaxStation2() {
        radio.setCurrentStation(10);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStation() {
        radio.setCurrentStation(4);
        radio.prevStation();
        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldBelowMinStation1() {
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldBelowMinStation2() {
        radio.setCurrentStation(-1);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldChangeVolume() {
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());

    }

    @Test
    void shouldIncreaseVolume() {
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldOverMaxVolume1() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldOverMaxVolume2() {
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldBelowMinVolume1() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldBelowMinVolume2() {
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }  }