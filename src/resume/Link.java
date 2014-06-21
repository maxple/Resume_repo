package resume;

/**
 * Created by 1 on 21.06.2014.
 */
public class Link {

    String text;
    String url;

    public Link(String text, String url) {
        this.text = text;
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
