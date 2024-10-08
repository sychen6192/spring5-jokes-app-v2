package guru.springframework.spring5_jokes_app_v2.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chunkNorrisQuotes;

    public JokeServiceImpl() {
        this.chunkNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chunkNorrisQuotes.getRandomQuote();
    }
}
