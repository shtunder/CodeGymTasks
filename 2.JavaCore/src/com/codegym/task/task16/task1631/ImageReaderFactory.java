package com.codegym.task.task16.task1631;

import com.codegym.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageType) throws IllegalArgumentException {
        if (imageType == ImageTypes.BMP) {
            return new BmpReader();
        }
        if (imageType == ImageTypes.JPG) {
            return new JpgReader();
        }
        if (imageType == ImageTypes.PNG) {
            return new PngReader();
        }
        throw new IllegalArgumentException("Unknown image type");
    }
}
