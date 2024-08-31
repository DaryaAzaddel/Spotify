package com.example.spotifymusic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class maincontroller {
    @FXML
    private TextField search;

    @FXML
    private void initialize(){
        String taylorpast = "Taylor Alison Swift (born December 13, 1989) is an American singer-songwriter. A subject of widespread public interest with a vast fanbase, she has influenced the music industry, popular culture, and politics through her songwriting, artistry, and advocacy.";
        ArrayList<Song> taylorsongs = new ArrayList<>();
        String l1 = "I walked through the door with you" +
                "The air was cold" +
                "But something about it felt like home somehow" +
                "And I, left my scarf there at your sister's house" +
                "And you've still got it in your drawer even now" +
                "Oh, your sweet disposition" +
                "And my wide-eyed gaze" +
                "We're singing in the car, getting lost upstate" +
                "Autumn leaves falling down like pieces into place" +
                "And I can picture it after all these days" +
                "And I know it's long gone and that magic's not here no more" +
                "And I might be okay but I'm not fine at all" +
                "'Cause there we are again on that little town street" +
                "You almost ran the red 'cause you were lookin' over at me" +
                "Wind in my hair, I was there" +
                "I remember it all too well" +
                "Photo album on the counter" +
                "Your cheeks were turning red" +
                "You used to be a little kid with glasses in a twin-sized bed" +
                "And your mother's telling stories 'bout you on the tee-ball team" +
                "You told me 'bout your past thinking your future was me" +
                "And I know it's long gone and there was nothing else I could do" +
                "And I forget about you long enough to forget why I needed to" +
                "'Cause there we are again in the middle of the night" +
                "We're dancing 'round the kitchen in the refrigerator light" +
                "Down the stairs, I was there" +
                "I remember it all too well, yeah" +
                "And maybe we got lost in translation" +
                "Maybe I asked for too much" +
                "But maybe this thing was a masterpiece 'til you tore it all up" +
                "Running scared, I was there" +
                "I remember it all too well" +
                "And you call me up again just to break me like a promise" +
                "So casually cruel in the name of being honest" +
                "I'm a crumpled up piece of paper lying here" +
                "'Cause I remember it all, all, all" +
                "Too well" +
                "Time won't fly, it's like I'm paralyzed by it" +
                "I'd like to be my old self again" +
                "But I'm still trying to find it" +
                "After plaid shirt days and nights when you made me your own" +
                "Now you mail back my things and I walk home alone" +
                "But you keep my old scarf from that very first week" +
                "'Cause it reminds you of innocence" +
                "And it smells like me" +
                "You can't get rid of it" +
                "'Cause you remember it all too well, yeah" +
                "'Cause there we are again when I loved you so" +
                "Back before you lost the one real thing you've ever known" +
                "It was rare, I was there, I remember it all too well" +
                "Wind in my hair, you were there, you remember it all" +
                "Down the stairs, you were there, you remember it all" +
                "It was rare, I was there, I remember it all too well";
        Song s1 = new Song("All too well",2021,"Red",l1,54);
        String l2 =
                "'Cause baby, now we got bad blood" +
                "You know it used to be mad love" +
                "So take a look what you've done" +
                "'Cause baby, now we got bad blood (hey!)" +
                "Now we got problems" +
                "And I don't think we can solve 'em" +
                "You made a really deep cut" +
                "And baby, now we got bad blood (hey!)" +
                "Did you have to do this?" +
                "I was thinking that you could be trusted" +
                "Did you have to ruin" +
                "What was shining? Now it's all rusted" +
                "Did you have to hit me" +
                "Where I'm weak? Baby, I couldn't breathe" +
                "And rub it in so deep" +
                "Salt in the wound like you're laughing right at me" +
                "Oh, it's so sad to think about the good times" +
                "You and I" +
                "'Cause baby, now we got bad blood" +
                "You know it used to be mad love" +
                "So take a look what you've done" +
                "'Cause baby, now we got bad blood (hey!)" +
                "Now we got problems" +
                "And I don't think we can solve 'em" +
                "You made a really deep cut" +
                "And baby, now we got bad blood (hey!)" +
                "Did you think we'd be fine?" +
                "Still got scars on my back from your knife" +
                "So don't think it's in the past" +
                "These kind of wounds they last and they last" +
                "Now did you think it all through?" +
                "All these things will catch up to you" +
                "And time can heal, but this won't" +
                "So if you come in my way, just don't" +
                "Oh, it's so sad to think about the good times" +
                "You and I" +
                "'Cause baby, now we got bad blood" +
                "You know it used to be mad love" +
                "So take a look what you've done" +
                "'Cause baby, now we got bad blood (hey!)" +
                "Now we got problems" +
                "And I don't think we can solve 'em" +
                "You made a really deep cut" +
                "And baby, now we got bad blood (hey!)" +
                "Band-aids don't fix bullet holes" +
                "You say sorry just for show" +
                "If you live like that, you live with ghosts (ghosts, ghosts)" +
                "Band-aids don't fix bullet holes (hey!)" +
                "You say sorry just for show (hey!)" +
                "If you live like that, you live with ghosts (hey!)" +
                "Hm, if you love like that, blood runs cold" +
                "'Cause baby, now we got bad blood" +
                "You know it used to be mad love" +
                "So take a look what you've done" +
                "'Cause baby, now we got bad blood (hey!)" +
                "Now we got problems" +
                "And I don't think we can solve 'em (think we can solve 'em)" +
                "You made a really deep cut" +
                "And baby, now we got bad blood (hey!)" +
                "'Cause baby, now we got bad blood" +
                "You know it used to be mad love" +
                "So take a look what you've done (look what you've done)" +
                "'Cause baby, now we got bad blood (hey!)" +
                "Now we got problems" +
                "And I don't think we can solve 'em" +
                "You made a really deep cut";
        Song s2 = new Song("Bad Blood",2015,"1989",l2,56);
        taylorsongs.add(s1);
        taylorsongs.add(s2);
        Singer taylor = new Singer("Taylor Swift",taylorsongs,"Pop",taylorpast,98);
        Singer.singers.add(taylor);

        String l3 = "Yeah" +
                "I've been tryna call" +
                "I've been on my own for long enough" +
                "Maybe you can show me how to love, maybe" +
                "I'm going through withdrawals" +
                "You don't even have to do too much" +
                "You can turn me on with just a touch baby" +
                "I look around and" +
                "Sin City's cold and empty (oh)" +
                "No one's around to judge me (oh)" +
                "I can't see clearly when you're gone" +
                "I said, ooh, I'm blinded by the lights" +
                "No, I can't sleep until I feel your touch" +
                "I said, ooh, I'm drowning in the night" +
                "Oh, when I'm like this, you're the one I trust" +
                "(Hey, hey, hey)" +
                "I'm running out of time" +
                "'Cause I can see the sun light up the sky" +
                "So I hit the road in overdrive, baby, oh" +
                "The city's cold and empty (oh)" +
                "No one's around to judge me (oh)" +
                "I can't see clearly when you're gone" +
                "I said, ooh, I'm blinded by the lights" +
                "No, I can't sleep until I feel your touch" +
                "I said, ooh, I'm drowning in the night" +
                "Oh, when I'm like this, you're the one I trust" +
                "I'm just walking by to let you know (by to let you know)" +
                "I can never say it on the phone (say it on the phone)" +
                "Will never let you go this time (ooh)" +
                "I said, ooh, I'm blinded by the lights" +
                "No, I can't sleep until I feel your touch" +
                "(Hey, hey, hey)" +
                "I said, ooh, I'm blinded by the lights" +
                "No, I can't sleep until I feel your touch";
        Song s3 = new Song("Blinding Lights",2020,"End of the night",l3,4);
        String l4= "Ooh" +
                "Na-na, yeah" +
                "I saw you dancing in a crowded room (uh)" +
                "You look so happy when I'm not with you" +
                "But then you saw me, caught you by surprise" +
                "A single teardrop falling from your eye" +
                "I don't know why I ran away" +
                "I make you cry when I run away" +
                "You could've asked me why I broke your heart" +
                "You could've told me that you fell apart" +
                "But you walked past me like I wasn't there" +
                "And just pretended like you didn't care" +
                "I don't know why I ran away" +
                "I make you cry when I run away" +
                "Take me back 'cause I wanna stay" +
                "Save your tears for another" +
                "day Save your tears for another day" +
                "Save your tears for another day (so)" +
                "I made you think that I would always stay" +
                "I said some things that I should never say" +
                "Yeah, I broke your heart like someone did to mine" +
                "And now you won't love me for a second time" +
                "I don't know why I run away, oh, girl" +
                "Said, I make you cry when I run away" +
                "Girl, take me back 'cause I wanna stay" +
                "Save your tears for another" +
                "I realize that I'm much too late" +
                "And you deserve someone better" +
                "Save your tears for another day (oh yeah)" +
                "Save your tears for another day (yeah)" +
                "I don't know why I run away." +
                "I'll make you cry when I run away" +
                "Save your tears for another day" +
                "Ooh, girl, I said (ah)" +
                "Save your tears for another day (ah)" +
                "Save your tears for another day (ah)" +
                "Save your tears for another day (ah)";
        Song s4 = new Song("Save Your Tears",2020,"End of the night",l4,2);
        String twp = "Tesfaye began releasing music anonymously in 2009. After co-founding the record label XO, he released three mixtapes—House of Balloons, Thursday, and Echoes of Silence—in 2011, and gained recognition for his blend of contemporary and alternative R&B, as well as the mystery surrounding his identity. He signed with Republic Records in 2012 and reissued the mixtapes as part of the compilation album Trilogy (2012), and released his debut studio album, Kiss Land (2013) the following year. After a string of collaborations and film soundtrack contributions between 2013 and 2014, Tesfaye transitioned from alternative R&B in favor of a pop sound with his second and third studio albums, Beauty Behind the Madness (2015) and Starboy (2016), both of which debuted atop the US Billboard 200. The former yielded his first two Billboard Hot 100 number-one singles, \"Can't Feel My Face\" and \"The Hills\", while Starboy spawned two more: its title track (featuring Daft Punk), and after a remix with Ariana Grande, \"Die for You\".";
        ArrayList<Song> theweekendsongs = new ArrayList<>();
        theweekendsongs.add(s3);
        theweekendsongs.add(s4);
        Singer theweekend = new Singer("The Weekend",theweekendsongs,"Pop",twp,106);
        Singer.singers.add(theweekend);

        String bp ="The Beatles were an English rock band formed in Liverpool in 1960, comprising John Lennon, Paul McCartney, George Harrison and Ringo Starr. They are regarded as the most influential band of all time[1] and were integral to the development of 1960s counterculture and the recognition of popular music as an art form";
        ArrayList<Song> beatlessongs = new ArrayList<>();

        String l5 = "Here comes the sun, doo-doo-doo-doo" +
                "Here comes the sun, and I say" +
                "It's alright" +
                "Little darlin', it's been a long, cold, lonely winter" +
                "Little darlin', it feels like years since it's been here" +
                "Here comes the sun, doo-doo-doo-doo" +
                "Here comes the sun, and I say" +
                "It's alright" +
                "Little darlin', the smile's returning to their faces" +
                "Little darlin', it seems like years since it's been here" +
                "Here comes the sun" +
                "Here comes the sun, and I say" +
                "It's alright" +
                "Sun, sun, sun, here it comes" +
                "Sun, sun, sun, here it comes" +
                "Sun, sun, sun, here it comes" +
                "Sun, sun, sun, here it comes" +
                "Sun, sun, sun, here it comes" +
                "Little darlin', I feel that ice is slowly melting" +
                "Little darlin', it seems like years since it's been clear" +
                "Here comes the sun, doo-doo-doo-doo" +
                "Here comes the sun, and I say" +
                "It's alright" +
                "Here comes the sun, doo-doo-doo-doo" +
                "Here comes the sun" +
                "It's alright" +
                "It's alright";
        Song s5 = new Song("Here Comes the Sun",1969,"Abbey Road",l5,5);
        beatlessongs.add(s5);

        String l6 =
                "Blackbird singing in the dead of night" +
                "Take these broken wings and learn to fly" +
                "All your life" +
                "You were only waiting for this moment to arise" +
                "Blackbird singing in the dead of night" +
                "Take these sunken eyes and learn to see" +
                "All your life" +
                "You were only waiting for this moment to be free" +
                "Blackbird fly, blackbird fly" +
                "Into the light of a dark black night" +
                "Blackbird fly, blackbird fly" +
                "Into the light of a dark black night" +
                "Blackbird singing in the dead of night" +
                "Take these broken wings and learn to fly" +
                "All your life" +
                "You were only waiting for this moment to arise" +
                "You were only waiting for this moment to arise" +
                "You were only waiting for this moment to arise";
        Song s6 = new Song("Blackbird",1968,"Beatles",l6,5);
        beatlessongs.add(s6);

        Singer thebeatles = new Singer("The Beatles",beatlessongs,"Rock",bp,150);
        Singer.singers.add(thebeatles);

        String cp= "Coldplay are a British rock band formed in London in 1997, consisting of vocalist and pianist Chris Martin, lead guitarist Jonny Buckland, bassist Guy Berryman, drummer and percussionist Will Champion, and manager Phil Harvey.[a] They are best known for their live performances,[3] having also impacted popular culture with their artistry, advocacy and achievements.";
        ArrayList<Song> coldplaysongs = new ArrayList<>();

        String l7 =
                "Look at the stars" +
                "Look how they shine for you" +
                "And everything you do" +
                "Yeah, they were all yellow" +
                "I came along" +
                "I wrote a song for you" +
                "And all the things you do" +
                "And it was called Yellow" +
                "So then I took my turn" +
                "Oh, what a thing to have done" +
                "And it was all yellow" +
                "Your skin, oh yeah, your skin and bones" +
                "Turn into something beautiful" +
                "And you know, you know I love you so" +
                "You know I love you so" +
                "I swam across" +
                "I jumped across for you" +
                "Oh, what a thing to do" +
                "'Cause you were all yellow" +
                "I drew a line" +
                "I drew a line for you" +
                "Oh, what a thing to do" +
                "And it was all yellow" +
                "And your skin, oh yeah, your skin and bones" +
                "Turn into something beautiful" +
                "And you know, for you, I'd bleed myself dry" +
                "For you, I'd bleed myself dry" +
                "It's true" +
                "Look how they shine for you" +
                "Look how they shine for you" +
                "Look how they shine for" +
                "Look how they shine for you" +
                "Look how they shine for you" +
                "Look how they shine" +
                "Look at the stars" +
                "Look how they shine for you" +
                "And all the things that you do";
        Song s7 = new Song("Yellow",2000,"Parachutes",l7,3);
        coldplaysongs.add(s7);
        String l8 =
                "'Cause you're a sky, 'cause you're a sky full of stars" +
                "I'm gonna give you my heart" +
                "'Cause you're a sky, 'cause you're a sky full of stars" +
                "'Cause you light up the path" +
                "I don't care, go on and tear me apart" +
                "I don't care if you do, ooh-ooh, ooh" +
                "'Cause in a sky, 'cause in a sky full of stars" +
                "I think I saw you" +
                "'Cause you're a sky, 'cause you're a sky full of stars" +
                "I wanna die in your arms, oh, oh-oh" +
                "'Cause you get lighter the more it gets dark" +
                "I'm gonna give you my heart, oh" +
                "I don't care, go on and tear me apart" +
                "I don't care if you do, ooh-ooh, ooh" +
                "'Cause in a sky, 'cause in a sky full of stars" +
                "I think I see you" +
                "I think I see you" +
                "'Cause you're a sky, you're a sky full of stars" +
                "Such a heavenly view" +
                "You're such a heavenly view" +
                "Yeah, yeah, yeah, ooh";
        Song s8 = new Song("A Sky Full of Stars",2014,"Ghost Stories",l8,2);
        coldplaysongs.add(s8);
        Singer coldplay = new Singer("Coldplay",coldplaysongs,"Rock",cp,83);
        Singer.singers.add(coldplay);
    }
    Stage stage;
    Scene scene;
    public void swichtotaylor(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("taylorswift.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void swichtothew(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("theweekend.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void swichtos3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("s3t.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void swichtos4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("s4t.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void swichtos1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("s1t.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void swichtos2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("s2t.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void swichtouser(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UserMenu.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void swichtopop(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("pop.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    public void swichtos5(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("s5t.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void swichtos6(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("s6t.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void swichtotb(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("thebeatles.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void swichtos7(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("s7t.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void swichtos8(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("st8.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void swichtor(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("rockf.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    public void swichtoc(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("coldplay.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    public void searchbutton(ActionEvent event) throws IOException {
        String s = search.getText();
        if (s.equals("Taylor Swift")){
            swichtotaylor(event);
        }
        else if (s.equals("The Weekend")){
            swichtothew(event);
        }
        else if (s.equals("All too well")){
            swichtos1(event);
        }
        else if (s.equals("Bad Blood")){
            swichtos2(event);
        }
        else if (s.equals("Blinding Lights")){
            swichtos3(event);
        }
        else if (s.equals("Save your tears")){
            swichtos4(event);
        }
        else if (s.equals("Blackbird")){
            swichtos6(event);
        }
        else if (s.equals("Here Comes the Sun")){
            swichtos5(event);
        }
        else if (s.equals("The Beatles")){
            swichtotb(event);
        }
        else if (s.equals("Yellow")){
            swichtos7(event);
        }
        else if (s.equals("A Sky Full of Stars")){
            swichtos8(event);
        }
        else if (s.equals("Coldplay")){
            swichtoc(event);
        }
        else if (s.equals("Rock")){
            swichtor(event);
        }
        else if (s.equals("Pop")){
            swichtopop(event);
        }
    }

}
