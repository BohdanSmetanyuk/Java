package product.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;
import product.object.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class Parser {

    public List<Product> productList; // set

    Parser() {
        productList = new ArrayList<Product>();
        parseNovus();
    }

    public void parseNovus() {
        Document doc;
        try {
            for (int i=1; i<=100; i++) {  // 197
                doc = Jsoup.connect("https://novus.ua/sales.html?p=" + i).get();
                Element body = doc.body();
                Elements elems = body.getElementsByClass("item product product-item");
                for (Element elem : elems) {
                    String name = elem.getElementsByClass("product-item-link").text();
                    Elements spans = elem.getElementsByClass("price"); //
                    if(spans.first() == spans.last()) {
                        break;
                    }
                    else {
                        List<String> prices = new ArrayList<String>();
                        for (Element span : spans) {
                            prices.add(span.text());
                        }
                        productList.add(new Product(name.toLowerCase(), prices.get(0).replace(' ', '.'), prices.get(1).replace(' ', '.')));
                    }
                }
            }
            //System.out.println(body.getElementsByClass("ias-no-more").text());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void parseAuchan() {
        Document doc;
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

    public List<Product> getProductList() {
        return productList;
    }

}
