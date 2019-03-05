import org.example.jpms.zip.Compressor;

module org.example.jpms.lzw {
    requires org.example.jpms.zip;
    provides Compressor with org.example.jpms.lzw.LZWCompressor;
}
