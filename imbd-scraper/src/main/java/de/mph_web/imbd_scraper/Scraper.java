package de.mph_web.imbd_scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class Scraper 
{
	
	public static void main(String[] args) throws Exception {
		
		final Document doc = Jsoup.connect("https://www.imdb.com/chart/top").get();
	 
		//System.out.println(doc.outerHtml());
		
		for(Element row : doc.select("table.chart.full-width tr")) {
			
			final String title = row.select(".titleColumn a").text();
			final String rating = row.select(".imdbRating").text();
			
			System.out.println(title + " Rating: " + rating);
		}
	}

}
