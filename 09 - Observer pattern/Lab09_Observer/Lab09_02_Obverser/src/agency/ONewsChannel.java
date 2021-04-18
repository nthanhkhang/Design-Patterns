package agency;

import java.util.Observable;
import java.util.Observer;

public class ONewsChannel implements Observer {

	private String news;

    @Override
    public void update(Observable o, Object news) {
        this.setNews((String) news);
    }

}
