Michael Dang 1235845, mwldang@uw.edu

1) None

2)
For the h3 hashing method, I created a string using a concatenation of each block's red, green, and blue values.
I then turned the resulting string into a hash code using the String object's hashcode method. This method should work
well because it produces a unique hashcode for each block with a different color, but it should also produce the same
hash code for each time a color is inputted multiple times. In terms of key scattering, this will be relatively efficient,
as long as there not a ton of blocks with the same red, green, and blue values. Inputting multiple blocks with same color
will result in a collision. In terms of the hashing efficiency, our code is very efficient as the hashing process is extremely
simple.

3)
The fast method is theoretically faster than the slow method because it calculates the Euclidean distance fewer times.
The Euclidean distance calculation matters because it involves lengthy mathematical operations.
The fast method should be faster than the slow method because it executes the Euclidean distance calculation between the
current block and the different palette colors for only the number of unique colors in the image while the slow method
calculates the Euclidean distance for each individual pixel in the image and for each color in the palette. This means
that the slow method does many many more operations. However, I optimized the Euclidean distance calculation by computing
the distance by manually multiplying the red, green, and blue values by themselves instead of using the Math.pow method.
This resulted in a much more efficient way of calculating the distance and closed the performance gap between the fast
and slow method. On both of my machines, my slow method (700ms) even outperforms my fast method (900ms) with a palette
of 256 and a block sizze of 4x4x4, the encode time is lower for the
slow method. I believe this is because the slow method does less object creation (merely puts primitive ints into an array)
as it does not create new Integer objects to  replace the integer values (the javaHashMap stores the integer values as Integer objects)
in the javaHashMap in order to replace the weight values in the javaHashMap with the palette index of the representative
colors for each pixel. I believe the performance drag for the increased number of mathematical operations for calculating
euclidean distance in the slow method is outweighted by the performance loss when creating new
Integer objects to put into the javaHashMap in the fast method.

4)
The value of the compression ratio of that the viewer considers slightly noticeable varies based upon the viewer. The
higher the compression ratio, the more noticeably distorted the image will be. If someone is more prone to noticing
compression artifacts, the compression ratio at which the image becomes noticeably distorted to the viewer will be lower.