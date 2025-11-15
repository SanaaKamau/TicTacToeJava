import java.util.HashMap;
import java.util.Map;

import javafx.scene.image.Image;

public class ImageLoader {
     public static Map<String, Image> images = new HashMap<>();
     static{
         images.put("O_Blue", new Image(ImageLoader.class.getResourceAsStream("/resources/oblue.png")));
         images.put("X_Blue", new Image(ImageLoader.class.getResourceAsStream("/resources/xblue.png")));
         images.put("O_Red", new Image(ImageLoader.class.getResourceAsStream("/resources/ored.png")));
         images.put("X_Red", new Image(ImageLoader.class.getResourceAsStream("/resources/xred.png")));
         images.put("O_Pink", new Image(ImageLoader.class.getResourceAsStream("/resources/opink.png")));
         images.put("X_Pink", new Image(ImageLoader.class.getResourceAsStream("/resources/xpink.png")));
     }

    
}
