package md.usm.laborator1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class BooksDOMParserDemo {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/main/java/md/usm/laborator1/files/books.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            Node rootElement = doc.getFirstChild();
            System.out.println("Root element : " + rootElement.getNodeName());

            NodeList firstChildRoot = doc.getElementsByTagName("books");
            System.out.printf("First element of root element : " + firstChildRoot.item(0).getNodeName());

            NodeList firstChildCelestial = doc.getElementsByTagName("department");
            System.out.println("First element of celestial-objects element : " + firstChildCelestial.item(0).getNodeName());

            NodeList books = doc.getElementsByTagName("books");
            System.out.println();

            for (int i = 0; i < books.getLength(); i++) {
                Node book = books.item(i);
                if (book.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) books;
                    System.out.println("         Type of books " + (i + 1) + " : "
                            + element.getAttribute("type"));

                    if (element.getAttribute("type").equals("books")) {
                        NodeList romans = doc.getElementsByTagName("books");
                        System.out.println("            --------- " + romans.item(0).getNodeName() + " ---------");

                        NodeList fantasy = doc.getElementsByTagName("romans");
                        System.out.println("            a. " + fantasy.item(0).getNodeName());

                        NodeList romansList = doc.getElementsByTagName("book");
                        for (int j = 0; j < romansList.getLength(); j++) {
                            Node romanNode = romansList.item(j);
                            if (romanNode.getNodeType() == Node.ELEMENT_NODE) {
                                Element eRoman = (Element) romanNode;
                                if(eRoman.getAttribute("authors") == ""){

                                }else{
                                    System.out.print("               " + (j + 1) + " roman : " + eRoman.getTextContent());
                                    System.out.println(" --> authors : "
                                            + eRoman.getAttribute("authors") + " and type : "
                                            + eRoman.getAttribute("type"));
                                }
                            }
                        }

                        NodeList detective = doc.getElementsByTagName("romans");
                        System.out.println("            a. " + detective.item(0).getNodeName());

                        NodeList romans1List = doc.getElementsByTagName("book");
                        for (int j = 0; j < romans1List.getLength(); j++) {
                            Node roman1Node = romans1List.item(j);
                            if (roman1Node.getNodeType() == Node.ELEMENT_NODE) {
                                Element eRoman1 = (Element) roman1Node;
                                if(eRoman1.getAttribute("authors") == ""){

                                }else{
                                    System.out.print("               " + (j + 1) + " roman : " + eRoman1.getTextContent());
                                    System.out.println(" --> authors : "
                                            + eRoman1.getAttribute("authors") + " and type : "
                                            + eRoman1.getAttribute("type"));
                                }
                            }
                        }

                        NodeList drama = doc.getElementsByTagName("romans");
                        System.out.println("            a. " + detective.item(0).getNodeName());

                        NodeList romans2List = doc.getElementsByTagName("book");
                        for (int j = 0; j < romans2List.getLength(); j++) {
                            Node roman2Node = romans2List.item(j);
                            if (roman2Node.getNodeType() == Node.ELEMENT_NODE) {
                                Element eRoman2 = (Element) roman2Node;
                                if(eRoman2.getAttribute("authors") == ""){

                                }else{
                                    System.out.print("               " + (j + 1) + " roman : " + eRoman2.getTextContent());
                                    System.out.println(" --> authors : "
                                            + eRoman2.getAttribute("authors") + " and type : "
                                            + eRoman2.getAttribute("type"));
                                }
                            }
                        }

                        NodeList romans3List = doc.getElementsByTagName("book");
                        for (int j = 0; j < romans3List.getLength(); j++) {
                            Node roman3Node = romans3List.item(j);
                            if (roman3Node.getNodeType() == Node.ELEMENT_NODE) {
                                Element eRoman3 = (Element) roman3Node;
                                if(eRoman3.getAttribute("authors") == ""){

                                }else{
                                    System.out.print("               " + (j + 1) + " roman : " + eRoman3.getTextContent());
                                    System.out.println(" --> authors : "
                                            + eRoman3.getAttribute("authors") + " and type : "
                                            + eRoman3.getAttribute("type"));
                                }
                            }
                        }
                            System.out.println();

                        System.out.println();
                        }
                }

            }
            }catch(Exception e){
                e.printStackTrace();
            }

    }
}
