package com.javarush.task.task27.task2712.ad;

/**
 * @autor mvl on 26.06.2017.
 */
public class AdvertisementManager {
    AdvertisementStorage storage = AdvertisementStorage.getInstance();

    private int timeSeconds;

    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }

    public void processVideos() throws NoVideoAvailableException{
        if (storage.list().isEmpty())
            throw new NoVideoAvailableException();
    }
}