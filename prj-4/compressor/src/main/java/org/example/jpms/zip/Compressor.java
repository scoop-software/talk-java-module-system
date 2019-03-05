package org.example.jpms.zip;

//tag::class[]
public interface Compressor {
    byte[] compress(byte[] data);
    double getCompressionRatio();
}
//tag::end[]
