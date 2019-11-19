package pl.rynski.lab_5_rynski.mail;

import org.springframework.stereotype.Service;
import pl.rynski.lab_5_rynski.client.controller.NewsClient;

@Service
public class MailServiceImpl implements MailService {

    private NewsClient newsClient;

    public MailServiceImpl(NewsClient newsClient) {
        this.newsClient = newsClient;
    }

    public String getTitle() {
        return newsClient.getNews().getNews().get(0).getTitle();
    }

    public String getContent() {
        return newsClient.getNews().getNews().get(0).getDescription();
    }
}
