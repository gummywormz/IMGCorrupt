This software is made to "corrupt" image files. For those unfamiliar with corruptions, it is essentially changing random bytes in a file in order to change the look or behavior of them. It is usually done for humorous purposes. Video games (ROMs) are commonly corrupted, but any file can (with mixed results). This is a simple and quick corruptor designed to better work with image files (though it can work with any file).

Please see LICENSE.TXT for license info.

NOTES / TIPS:
* Files are technically backed up. The program doesn't work with the main file, but a copy that is created (filename-c). To save your results, just copy this file to a new folder. 

* If you get an uninteresting corruption, it's best to reload the file and start again because the corruptor doesn't restore the original file.

* It is best to use large images with a decent amount of colors.

* Setting a lower bytes value (even lower than the default 1580) will cause less "complete corruption" (i.e. random white noise, black / disappearing image etc.) especially with large images.

* The offset shouldn't be set lower than 1500. Anything less and the image probably won't open at all (though this may need to be adjusted to a lower number for smaller images).

* Different image viewers react to differently to the images. Windows Photo Viewer is the most resilient. Web browsers often don't display these images "properly". Photoshop appearently does not handle them well either. Paint.net is the best option for resaving them in a "good" form.