package org.example.jpms.zip;

import java.util.ServiceLoader;

//tag::class[]
public interface Compressor {
    byte[] compress(byte[] data);
    double getCompressionRatio();

    static Iterable<Compressor> getCompressors() {
        return ServiceLoader.load(Compressor.class);
    }
}
//tag::end[]
