package pl.rynski.lab_5_rynski.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import pl.rynski.lab_5_rynski.client.model.News;
import pl.rynski.lab_5_rynski.client.model.NewsModel;

@Controller
public class NewsClient {

    private RestTemplate restTemplate;

    public NewsClient() {
        this.restTemplate = new RestTemplate();
    }

    @EventListener(ApplicationReadyEvent.class)
    public News getNews() {
        NewsModel newsModel = restTemplate.getForObject("https://api.currentsapi.services/v1/search?apiKey=bhJyU0KRdwnJcjIGoGovUIi9DBbx2z92Sz59Sp_u1BE3-crF", NewsModel.class);
        System.out.println(newsModel.getNews().get(0).getTitle());
        System.out.println(newsModel.getNews().get(0).getDescription());
        return newsModel.getNews().get(0);
    }
}
