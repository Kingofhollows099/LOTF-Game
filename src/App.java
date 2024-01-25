import java.sql.Time;
import java.util.Hashtable;
import java.util.Scanner;
// import java.util.function.Function;
import java.util.concurrent.TimeUnit;
import gameObjects.*;
import gameObjects.Living.*;
import gameObjects.Living.Player;

public class App {
    /*
     * Simple print
     */
    public static void out(String printable) {
        System.out.println(printable);
    };
    
    public static void main(String[] args) throws Exception {
        /*
         * Instructions
         */
        out("You play as Simon. Enter the number corresponding to the action to do it. If you enter an unvalid value, the game will default to the last option. Press Enter to begin.");

        int chapter = 1;
        int chapterProg = 0;
        int runCount = 0;
        Boolean started = false;

        Boolean c1Sent = false;
        Boolean c2Sent = false;
        Boolean c3Sent = false;
        Boolean c4Sent = false;
        Boolean c5Sent = false;
        Boolean c6Sent = false;
        Boolean c7Sent = false;
        Boolean c8Sent = false;

        Boolean waited = false;
        Boolean waited2 = false;
        Scanner scan = new Scanner(System.in);
        String reader;


        /*
         * Messages
         */


        Hashtable<String, String> Messages = new Hashtable<String,String>();

        Messages.put("Death", "The cruel dance of shadows engulfs you in a blanket of agony. The frenzied chants, once familer voices, now distort into a cacophany of madness. The world flickers into black as your kin extinguish your life...");
        // 1
        Messages.put("1false", "You dash down the mountain, the lord of the flies behind you. You realize you need to tell the others. You need to tell them the beast is just their fear, everything will settle down, no more chaos...");
        Messages.put("1true", "You are running through the dark woods. The wind whistles around the mountain, making an eerie wailing that seems to tell you to hurry as you make your way to castle rock...");
        Messages.put("1choice1", "You keep running...");
        Messages.put("1choice2", "You slow to catch your breath, but you keep going, knowing its your duty to tell everyone the truth about the beast...");
        // 2
        Messages.put("2false", "As you near Castle Rock the stone spikes loom over you and you hear a loud chanting echoing throughout the area...");
        Messages.put("2true", "The wind echoes around the mountain and you hear the howls of the boys inside castle rock...");
        Messages.put("2choice1", "You climb up the jagged rocks and enter the fortress...");
        Messages.put("2choice2", "You wait and catch your breath...");
        // 3
        Messages.put("3false", "You enter through the long narrow bridge, a feeling of foreboding fills your stomach but you ignore it. You reach the end of the bridge and you see the boys dancing around, encircling a dancer in the center. The single dancer leaves the center and joins his fellows in the circle; the circle then opens up to let you enter...");
        Messages.put("3choice1", "You yell out \"The beast isn't real! Guys! Hey!\" ");
        // 4
        Messages.put("4false", "You see the boys dancing in a circle around another in the middle. \"Kill the beast! Cut his throat! Spill his blood!\" The boy leaves the center, and after a moment, the circle opens up for you to enter. \"Kill the beast! Cut his throat! Spill his blood!\"");
        Messages.put("4choice1", "You enter the ring and yell out \"The beast isn't real! Its just your fear! We don't need to be afraid!\" the wind wisks your words away...");
        Messages.put("4choice2", "You enter the ring and yell out \"Calm down! Wait a moment, I have something to tell you all about the beast! Its not real!\" the wind wisks your words away...");
        Messages.put("4choice3", "You enter the ring and yell out to Piggy, \"Sucks to your asmar!\" the wind wisks your words away...");
        // 5
        Messages.put("5false", "The ring closes around you like a great monster snapping its mouth shut on you, swallowing you whole. The boys chant faster and faster, \"Kill the beast! Cut his throat! Spill his blood! Kill the beast! Cut his throat! Spill his blood! Do him in!\" you realize with horror the savages' cruel intentions... ");
        Messages.put("5true", "you are laying flat on the ground, the savages beating you with their sticks, and the first of them are starting to stab. Waves of pain wash over you...");
        Messages.put("5choice1", "You ball up into a fetal position, and almost immediately the spears fall upon you. breaking your stance and leaving you flat on the floor. You try and get up...");
        Messages.put("5choice2", "You try and escape the circle, you run to the edge and break through. Freedom! but the terrror is still behind you, and you realize it is below you as well, as you stumble off the edge. There is a moment of weightlessness and then blackness... You open your eyes, recovering from your brief unconsciousness. The pain is everywhere. It is all consuming and you can think of nothing else. ");
        // 6
        Messages.put("6false", "");
        Messages.put("6true", "");
        Messages.put("6choice1", "");
        Messages.put("6choice2", "");
        // 7
        Messages.put("7false", "");
        Messages.put("7true", "");
        Messages.put("7option1", "");
        Messages.put("7option2", "");
        Messages.put("7option3", "");
        // Attacks
        Messages.put("head1", "");
        Messages.put("head2", "");
        Messages.put("head3", "");
        Messages.put("arms1", "");
        Messages.put("arms2", "");
        Messages.put("arms3", "");
        Messages.put("legs1", "");
        Messages.put("legs2", "");
        Messages.put("legs3", "");
        Messages.put("chest1", "");
        Messages.put("chest2", "");
        Messages.put("chest3", "");



        Player Simon = new Player("Simon", "A good child, the representation of truth", 1000);
        Simon.setHealth(1000);
        
        while (Simon.getHealth() > 0) {
            reader = "";
            if (started.equals(false)) {
                reader = scan.nextLine().toString().toLowerCase();
                out("Welcome Simon, enjoy the dance.\n");
                TimeUnit.SECONDS.sleep(3);
                started = true;
            }
            
            if (reader.contains("leave") || reader.contains("exit") || reader.contains("quit")) {
                System.exit(0);
            }
            
            if (reader.contains("one") || reader.contains("1")) {
                reader = "1";
            }
            if (reader.contains("two") || reader.contains("2")) {
                reader = "2";
            }
            if (reader.contains("three") || reader.contains("3")) {
                reader = "3";
            }
            if (reader.contains("four") || reader.contains("4")) {
                reader = "4";
            }
            if (reader.contains("five") || reader.contains("5")) {
                reader = "5";
            }

            /*
             * Chapters
             */

            if (chapterProg >= 100) {
                chapterProg = 0;
                chapter += 1;
            }

            if (chapter == 6) {
                out(Messages.get(Integer.toString(chapter) + c6Sent.toString()));
                c6Sent = true;
                out("1: " + "");
                out("2: " + "");
                reader = scan.nextLine().toString().toLowerCase();
                if (reader.contains("1")) {
                    chapterProg += 0;
                    out(Messages.get("6choice1"));
                }
                else {
                    chapterProg += 0;
                    out(Messages.get("6choice2"));
                }
            }

            // Chapter 5
            if (chapter == 5) {
                out(Messages.get(Integer.toString(chapter) + c5Sent.toString()));
                c5Sent = true;
                out("1: " + "Ball up");
                out("2: " + "Try to escape");
                out("3: "+ "Give in");
                reader = scan.nextLine().toString().toLowerCase();
                if (reader.contains("1")) {
                    chapterProg += 50;
                    out(Messages.get("5choice1"));
                }
                else {
                    if (reader.contains("2"))
                    chapterProg += 100;
                    out(Messages.get("5choice2"));
                }
            }
            // Chapter 4
            if (chapter == 4) {
                out(Messages.get(Integer.toString(chapter) + c4Sent.toString()));
                c4Sent = true;
                out("1: " + "Enter, say the beast isn't real.");
                out("2: " + "Enter, tell them to calm down");
                out("3" + "Enter, yell out to Piggy");
                reader = scan.nextLine().toString().toLowerCase();
                if (reader.contains("1")) {
                    chapterProg += 100;
                    out(Messages.get("4choice1"));
                }
                else {
                    if (reader.contains("2")) {
                        chapterProg += 100;
                        out(Messages.get("4choice2"));
                    }
                    else {
                        chapterProg += 100;
                        out(Messages.get("4choice3"));
                    }
                }
            }

            // Chapter 3
            if (chapter == 3) {
                out(Messages.get(Integer.toString(chapter) + c3Sent.toString()));
                c3Sent = true;
                out("1: " + "");
                out("2: " + "");
                reader = scan.nextLine().toString().toLowerCase();
                
                chapterProg += 100;
                out(Messages.get("3choice1"));
                
            }

            // Chapter 2
            if (chapter == 2) {
                out(Messages.get(Integer.toString(chapter) + c2Sent.toString()));
                c2Sent = true;
                out("1: " + "Enter castle rock so you can tell the boys the truth");
                if(!waited2.equals(true)){
                    out("2: " + "Catch your breath");
                };
                reader = scan.nextLine().toString().toLowerCase();
                if (reader.contains("1")) {
                    runCount += 1;
                    chapterProg += 100;
                    out(Messages.get("2choice1"));
                }
                else {
                    chapterProg += 20;
                    out(Messages.get("2choice2"));
                    if (waited.equals(true)) {
                        waited2 = true;
                    }
                    else {
                        waited = true;
                    }
                }
            }

            // Chapter 1
            if (chapter == 1) {
                out(Messages.get(Integer.toString(chapter) + c1Sent.toString()));
                c1Sent = true;
                out("1: " + "Keep running");
                out("2: " + "Run slower");
                reader = scan.nextLine().toString().toLowerCase();
                if (reader.contains("1")) {
                    runCount += 1;
                    chapterProg += 34;
                    out(Messages.get("1choice1"));
                }
                else {
                    chapterProg += 20;
                    out(Messages.get("1choice2"));
                }
            }
            

            TimeUnit.MILLISECONDS.sleep(500);
            out("\n\n ~-~-~-~-~-~-~-");
    }
    
    out(Messages.get("Death"));//death event
    
    scan.close();  
    }
}

/*
 * As Ralph stabs your arm repeatedly with his spear, you can feel the hole singe your arm with a burning agony,
 *  you see your blood pouring out of the holes as if a dam has broken. You feel a spear impale you, and as you look down, you 
 * see the bloodied end push through your stomach, seperating the skin and unleashing another wave of agony over you
 */