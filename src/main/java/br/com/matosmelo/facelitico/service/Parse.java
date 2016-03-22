package br.com.matosmelo.facelitico.service;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
//import org.w3c.dom.Document;

public class Parse {
	public static void main(String[] args) throws IOException {
		
		String url = new String();
		url = "https://www.google.com.br/alerts/feeds/02609279662761079266/13169489542260361059";
		Document doc = Jsoup.connect(url).get();
		//System.out.println(doc);
			
		Elements links = doc.select("link[href]");
		Elements title = doc.select("title");
		String link = new String();
		String titulo = new String();
		
		for (int i = 1; i < links.size(); i++) {
			link = links.get(i).attr("href");
			titulo = title.get(i).text();
			
			
			System.out.println(link);
			System.out.println(titulo);
			
		}

	
	}
}
