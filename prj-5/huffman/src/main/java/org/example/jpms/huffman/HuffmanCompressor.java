package org.example.jpms.huffman;

import org.example.jpms.zip.Compressor;

//tag::class[]
public class HuffmanCompressor
                implements Compressor {
    @Override
    public double getCompressionRatio() {
        return 0.37;
    }
    @Override
    public byte[] compress(byte[] data) {
        byte[] compressedData = null;
        // ... (Huffman implementation)
        return compressedData;
    }
}
//end::class[]
