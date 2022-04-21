package md.usm.laborator1;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class BooksCreateXMLDom {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.newDocument();

            Element rootElement = doc.createElement("library");
            doc.appendChild(rootElement);

            // 1 child of document
            Element books = doc.createElement("books");
            rootElement.appendChild(books);

                // 1 child of books
                Element dep = doc.createElement("department");
                books.appendChild(dep);

                    // 1 child of fantasy
                    Element book1 = doc.createElement("books");
                    // setting attribute to celestial object 1
                    Attr attr1 = doc.createAttribute("type");
                    attr1.setValue("The Witcher");
                    book1.setAttributeNode(attr1);
                    book1.appendChild(doc.createTextNode("The Witcher"));
                    dep.appendChild(book1);


                    // 2 child of department
                    Element book2 = doc.createElement("books");
                    // setting attribute to celestial object 2
                    Attr attr2 = doc.createAttribute("type");
                    attr2.setValue("romans");
                    book2.setAttributeNode(attr2);
                    dep.appendChild(book2);

                        // 1 child
                        Element romans = doc.createElement("romans");
                        book2.appendChild(romans);

                            //
                            Element fantasy = doc.createElement("fantasy");
                            romans.appendChild(fantasy);

                                // 1 child of fantasy
                                Element roman1 = doc.createElement("roman");
                                Attr attrP1 = doc.createAttribute("authors");
                                attrP1.setValue("Joane Rowling");
                                roman1.setAttributeNode(attrP1);
                                Attr attrP11 = doc.createAttribute("year");
                                attrP11.setValue("2000");
                                roman1.setAttributeNode(attrP11);
                                roman1.appendChild(doc.createTextNode("Harry Potter"));
                                fantasy.appendChild(roman1);

                                // 2 child of fantasy
                                Element roman2 = doc.createElement("roman");
                                Attr attrP2 = doc.createAttribute("authors");
                                attrP2.setValue("Andrzej Sapkowski");
                                roman2.setAttributeNode(attrP2);
                                Attr attrP22 = doc.createAttribute("year");
                                attrP22.setValue("2012");
                                roman2.setAttributeNode(attrP22);
                                roman2.appendChild(doc.createTextNode("The Witcher"));
                                fantasy.appendChild(roman2);

                                // 3 child of fantasy
                                Element roman3 = doc.createElement("roman");
                                Attr attrP3 = doc.createAttribute("authors");
                                attrP3.setValue("Sarah Hogle");
                                roman3.setAttributeNode(attrP3);
                                Attr attrP33 = doc.createAttribute("year");
                                attrP33.setValue("2001");
                                roman3.setAttributeNode(attrP33);
                                roman3.appendChild(doc.createTextNode("Just Like Magic"));
                                fantasy.appendChild(roman3);

                                // 4 child of fantasy
                                Element roman4 = doc.createElement("roman");
                                Attr attrP4 = doc.createAttribute("authors");
                                attrP4.setValue("Holly Black");
                                roman4.setAttributeNode(attrP4);
                                Attr attrP44 = doc.createAttribute("year");
                                attrP44.setValue("2012");
                                roman4.setAttributeNode(attrP44);
                                roman4.appendChild(doc.createTextNode("The Cruel Prince"));
                                fantasy.appendChild(roman4);

                                // 5 child of fantasy
                                Element roman5 = doc.createElement("roman");
                                Attr attrP5 = doc.createAttribute("authors");
                                attrP5.setValue("C.N. Crawford");
                                roman5.setAttributeNode(attrP5);
                                Attr attrP55 = doc.createAttribute("year");
                                attrP55.setValue("2010");
                                roman5.setAttributeNode(attrP55);
                                roman5.appendChild(doc.createTextNode("City of Thorns"));
                                fantasy.appendChild(roman5);

                                // 6 child of fantasy
                                Element roman6 = doc.createElement("roman");
                                Attr attrP6 = doc.createAttribute("authors");
                                attrP6.setValue("Margaret Rogerson");
                                roman6.setAttributeNode(attrP6);
                                Attr attrP66 = doc.createAttribute("type");
                                attrP66.setValue("1999");
                                roman6.setAttributeNode(attrP66);
                                roman6.appendChild(doc.createTextNode("Sorcery of Thorns "));
                                fantasy.appendChild(roman6);

                                // 7 child of fantasy
                                Element roman7 = doc.createElement("roman");
                                Attr attrP7 = doc.createAttribute("authors");
                                attrP7.setValue("Tricia Levenseller");
                                roman7.setAttributeNode(attrP7);
                                Attr attrP77 = doc.createAttribute("year");
                                attrP77.setValue("2008");
                                roman7.setAttributeNode(attrP77);
                                roman7.appendChild(doc.createTextNode("The Shadows Between Us"));
                                fantasy.appendChild(roman7);

                                // 8 child of fantasy
                                Element roman8 = doc.createElement("roman");
                                Attr attrP8 = doc.createAttribute("authors");
                                attrP8.setValue("Cassandra Clare");
                                roman8.setAttributeNode(attrP8);

                                Attr attrP88 = doc.createAttribute("year");
                                attrP88.setValue("2006");
                                roman8.setAttributeNode(attrP88);
                                roman8.appendChild(doc.createTextNode("Lady Midnight"));
                                fantasy.appendChild(roman8);

                            // 2 child of
                            Element detective = doc.createElement("detective");
                            romans.appendChild(detective);

                                // 1 child of dwarfPlanet




            Element roman9 = doc.createElement("roman");
            Attr attrP9 = doc.createAttribute("authors");
            attrP9.setValue("Lori Foster ");
            roman9.setAttributeNode(attrP9);
            Attr attrP99 = doc.createAttribute("year");
            attrP99.setValue("1995");
            roman9.setAttributeNode(attrP9);
            roman9.appendChild(doc.createTextNode("Run the Risk"));
            detective.appendChild(roman9);

            Element roman10 = doc.createElement("roman");
            Attr attrP10 = doc.createAttribute("authors");
            attrP10.setValue("Kerrigan Byrne");
            roman10.setAttributeNode(attrP10);
            Attr attrP1010 = doc.createAttribute("year");
            attrP1010.setValue("2003");
            roman10.setAttributeNode(attrP10);
            roman10.appendChild(doc.createTextNode("The Business of Blood"));
            detective.appendChild(roman10);


            Element roman12 = doc.createElement("roman");
            Attr attrP12= doc.createAttribute("authors");
            attrP12.setValue("Kendra Elliot");
            roman12.setAttributeNode(attrP12);
            Attr attrP1212 = doc.createAttribute("year");
            attrP1212.setValue("2006");
            roman12.setAttributeNode(attrP11);
            roman12.appendChild(doc.createTextNode("Bridged"));
            detective.appendChild(roman12);




                    // drama
            Element drama = doc.createElement("drama");
            romans.appendChild(drama);

            // 1 child of drama




            Element roman13 = doc.createElement("roman");
            Attr attrP13 = doc.createAttribute("authors");
            attrP13.setValue("Sara Gruen");
            roman13.setAttributeNode(attrP13);
            Attr attrP1313 = doc.createAttribute("year");
            attrP1313.setValue("2006");
            roman13.setAttributeNode(attrP13);
            roman13.appendChild(doc.createTextNode("Water for Elephants"));
            drama.appendChild(roman13);

            Element roman14 = doc.createElement("roman");
            Attr attrP14 = doc.createAttribute("authors");
            attrP14.setValue("Stephenie Meyer");
            roman14.setAttributeNode(attrP14);
            Attr attrP1414 = doc.createAttribute("year");
            attrP1414.setValue("2007");
            roman14.setAttributeNode(attrP14);
            roman14.appendChild(doc.createTextNode("Eclipse"));
            drama.appendChild(roman14);

            Element roman15 = doc.createElement("roman");
            Attr attrP15 = doc.createAttribute("authors");
            attrP15.setValue("Nicholas Sparks");
            roman15.setAttributeNode(attrP15);
            Attr attrP1515 = doc.createAttribute("year");
            attrP1515.setValue("2008");
            roman15.setAttributeNode(attrP15);
            roman15.appendChild(doc.createTextNode("The Last Song"));
            drama.appendChild(roman15);

            // adventure
            Element adventure = doc.createElement("adventure");
            romans.appendChild(adventure);

            // 1 child of adventure

            Element roman16 = doc.createElement("roman");
            Attr attrP16 = doc.createAttribute("authors");
            attrP16.setValue("Jacquelyn Benson ");
            roman16.setAttributeNode(attrP16);
            Attr attrP1616 = doc.createAttribute("year");
            attrP1616.setValue("2016");
            roman16.setAttributeNode(attrP16);
            roman16.appendChild(doc.createTextNode("The Smoke Hunter "));
            adventure.appendChild(roman16);

            Element roman17 = doc.createElement("roman");
            Attr attrP17 = doc.createAttribute("authors");
            attrP17.setValue("Suzanne Collins");
            roman17.setAttributeNode(attrP17);
            Attr attrP1717 = doc.createAttribute("year");
            attrP1717.setValue("2009");
            roman17.setAttributeNode(attrP17);
            roman17.appendChild(doc.createTextNode("Catching Fire"));
            adventure.appendChild(roman17);

            Element roman18 = doc.createElement("roman");
            Attr attrP18 = doc.createAttribute("authors");
            attrP18.setValue("Kristin Cashore");
            roman18.setAttributeNode(attrP18);
            Attr attrP1818 = doc.createAttribute("year");
            attrP1818.setValue("2008");
            roman18.setAttributeNode(attrP18);
            roman18.appendChild(doc.createTextNode("Graceling"));
            adventure.appendChild(roman18);


            //write content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/main/java/md/usm/laborator1/files/books.xml"));
            transformer.transform(source, result);

            //output to console for testing
            //StreamResult condoleResult = new StreamResult(System.out);
            //transformer.transform(source, condoleResult);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
