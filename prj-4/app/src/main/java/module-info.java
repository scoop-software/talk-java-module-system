import org.example.jpms.zip.Compressor;

//tag::module[]
module org.example.jpms.app {
    requires org.example.jpms.zip;
    uses Compressor;
}
//end::module[]
