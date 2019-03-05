import org.example.jpms.zip.Compressor;

module org.example.jpms.huffman {
    requires org.example.jpms.zip;
    provides Compressor with org.example.jpms.huffman.HuffmanCompressor;
}
