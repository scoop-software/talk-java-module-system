import org.example.jpms.zip.Compressor;

//tag::module[]
module org.example.jpms.zip {
    exports org.example.jpms.zip;
    uses Compressor;
}
//end::module[]
