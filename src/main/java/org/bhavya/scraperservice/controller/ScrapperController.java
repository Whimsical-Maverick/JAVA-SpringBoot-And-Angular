package org.bhavya.scraperservice.controller;
import org.bhavya.scraperservice.service.ScraperService;
import org.bhavya.scraperservice.dto.ScrapeResponse;
import org.bhavya.scraperservice.dto.ScrapeRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/scraper")
public class ScrapperController
{
    private final ScraperService scrapperService;

    public ScrapperController(ScraperService scrapperService)
    {
        this.scrapperService = scrapperService;
    }
    @PostMapping("/scrape")
    public ScrapeResponse scrape(@RequestBody ScrapeRequest request)
    {
        String title = scrapperService.ScrapeTitle(request.getUrl());
        return new ScrapeResponse(title);
    }
}
