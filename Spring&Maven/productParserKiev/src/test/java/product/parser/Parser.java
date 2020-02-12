package product.parser;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.UnknownHostException;

public class Parser {

    public static void main(String[] args) {

        Document doc;
        String title;
        try {
            doc = Jsoup.connect("https://silpo.ua/offers").get();
            //title = doc.title();
            //System.out.println(title);
            Element body = doc.body();
            Element elem = body.getElementById("app");
            System.out.println(elem.attr("class"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
