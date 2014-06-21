package resume;

import java.util.Collection;

/**
 * Created by 1 on 21.06.2014.
 */
public class TextSection extends Section {

    Collection<String> content;

    public TextSection(String type, String contentItem) {
        super(type);
        this.content.add(contentItem);
    }

    public void setContentItem(String contentItem) {
        this.content.add(contentItem);
    }
}
