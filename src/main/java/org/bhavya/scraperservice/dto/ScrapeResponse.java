package org.bhavya.scraperservice.dto;

public class ScrapeResponse
{
    private final String title;

    public ScrapeResponse(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
