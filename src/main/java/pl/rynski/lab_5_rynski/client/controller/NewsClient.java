package pl.rynski.lab_5_rynski.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import pl.rynski.lab_5_rynski.client.model.NewsModel;

@Controller
public class NewsClient {

    private RestTemplate restTemplate;

    public NewsClient() {
        this.restTemplate = new RestTemplate();
    }

    public NewsModel getNews() {
        NewsModel newsModel = restTemplate.getForObject("https://api.currentsapi.services/v1/search?apiKey=bhJyU0KRdwnJcjIGoGovUIi9DBbx2z92Sz59Sp_u1BE3-crF", NewsModel.class);
        return newsModel;
    }
}