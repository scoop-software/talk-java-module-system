package org.example.jpms.app;

import org.example.jpms.zip.Compressor;

import java.util.ServiceLoader;

//tag::class[]
public class App {
    public static void main(String[] args) {
        for(Compressor compressor: ServiceLoader.load(Compressor.class)) {
            System.out.println(compressor.getClass().getSimpleName() +
                    " (" + compressor.getCompressionRatio() + ")");
        }
    }
}
//tag::end[]
