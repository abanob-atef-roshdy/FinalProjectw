package bebo.Jokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joke {
    public static List<String> jokeList = new ArrayList<>();
    public static String getRandomJoke(){
        jokeList.add("Did you hear the one about the little mountain?\n" +
                "It's hill-arious!");
        jokeList.add("Q: What kind of monster loves to disco?\n" +
                "A: The boogieman.");
        jokeList.add("Q: Where does a ghost go on vacation?\n" +
                "A: Mali-boo.");
        jokeList.add("Q: What is the name of the witch who lives in the desert?\n" +
                "A: Sand-witch!");
        jokeList.add("Q:  How do you mend a broken Jack-o-lantern?\n" +
                "A:  With a pumpkin patch.");
        jokeList.add("Q: What’s it like to be kissed by a vampire?\n" +
                "A: It’s a pain in the neck.");
        jokeList.add("Q: How did the skeleton know it was going to rain on Halloween?\n" +
                "A: He could feel it in his bones!");
        return jokeList.get(new Random().nextInt(jokeList.size()));



    }
}
