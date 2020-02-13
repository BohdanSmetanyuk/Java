package product.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.UnknownHostException;

public class Parser {

    public static void main(String[] args) {

        Document doc;
        String title;
        try {
            doc = Jsoup.connect("https://auchan.ua/superceny/").get();
            Element body = doc.body();
            Elements elems = body.getElementsByClass("product-info");
            for (Element elem: elems) {
                String s = elem.getElementsByTag("a").attr("title");
                System.out.println(s);
                Elements spans = elem.getElementsByTag("span");
                for (Element span: spans) {
                    System.out.println(span.text());
                }
                System.out.println("-------------------------------------");
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
