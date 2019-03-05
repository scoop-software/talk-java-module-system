package org.example.jpms.lzw;

import org.example.jpms.zip.Compressor;

//tag::class[]
public class LZWCompressor
                implements Compressor {
    @Override
    public double getCompressionRatio() {
        return 0.48;
    }
    @Override
    public byte[] compress(byte[] data) {
        byte[] compressedData = null;
        // ... (LZW implementation)
        return compressedData;
    }
}
//end::class[]
