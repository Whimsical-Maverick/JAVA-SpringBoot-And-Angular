package org.bhavya.scraperservice.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

@Service
public class ScraperService
{
    public String ScrapeTitle(String url)
    {
        try
        {
            Document doc = Jsoup.connect(url).get();
            return doc.title();
        }
        catch(Exception e)
        {
            throw new RuntimeException("Failed to fetch url");
        }
    }
}
