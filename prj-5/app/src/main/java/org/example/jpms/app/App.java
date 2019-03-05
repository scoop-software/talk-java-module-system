package org.example.jpms.app;

import org.example.jpms.zip.Compressor;

//tag::class[]
public class App {
    public static void main(String[] args) {
        for(Compressor compressor: Compressor.getCompressors()) {
            System.out.println(compressor.getClass().getSimpleName() +
                    " (" + compressor.getCompressionRatio() + ")");
        }
    }
}
//tag::end[]
