package org.example.jpms;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class XMLPrinter {
    public static void main(String[] args) throws Exception {
        System.out.printf("\nRunning module: %s\n\n", XMLPrinter.class.getModule().getName());

        Product product = new Product(100, "pizza", 3.25);

        JAXBContext jaxbContext = JAXBContext.newInstance(Product.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(product, System.out);
    }
}
