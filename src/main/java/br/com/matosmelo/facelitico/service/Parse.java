package br.com.matosmelo.facelitico.service;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
//import org.w3c.dom.Document;

public class Parse {
	public static void main(String[] args) throws IOException {
		String url = new String();
		url = "https://www.google.com.br/alerts/feeds/02609279662761079266/14300651792638160700";
		Document doc = Jsoup.connect(url).get();
		//System.out.println(doc);

		Elements links = doc.select("link[href]");
		Elements title = doc.select("title");
		for (int i = 0; i < links.size(); i++) {
			System.out.println("\nlink : " + links.get(i).attr("href"));
			System.out.println("title : " + title.get(i).text());
		}


	}
}
