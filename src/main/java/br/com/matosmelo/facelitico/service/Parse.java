package br.com.matosmelo.facelitico.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
//import org.w3c.dom.Document;

public class Parse {
	// public static void main(String[] args) throws IOException {
	public Map<String, String> listaLinkTitulo(String urlRss) {
		try {
			// String url = new String();
			// url =
			// "https://www.google.com.br/alerts/feeds/02609279662761079266/13169489542260361059";
			Document doc = Jsoup.connect(urlRss).get();
			// System.out.println(doc);
			Elements links = doc.select("link[href]");
			Elements title = doc.select("title");
			String link = new String();
			String titulo = new String();

			Map<String, String> listaLinkTitulo = new HashMap();
			//
			// System.out.println("Tamanho do elemto" + links.size());
			//
			 for (int i = 1; i < links.size(); i++) {
					listaLinkTitulo.put(title.get(i).text(), links.get(i).attr("abs:href"));
//					System.out.println(links.get(i).attr("abs:href"));
				}
			return listaLinkTitulo;

			// List<String> listLink = new ArrayList();
			// List<String> listTitulo = new ArrayList();
			// List<String> listFinal = new ArrayList();
			//
			// for (int i = 1; i < links.size(); i++) {
			// link = links.get(i).attr("href");
			// titulo = title.get(i).text();
			// listLink.add(link);
			// listTitulo.add(titulo);
			//
			// }
			// listFinal.addAll(listTitulo);
			// listFinal.addAll(listLink);
			// return listFinal;
		} catch (Exception e) {
			System.out.println("Url invalida");
			return null;
		}

	}
}
