package Structural.Facade;

import Structural.Facade.facade.VideoConversionFacade;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
