package input02;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
JOptionPane.showMessageDialog(null,
                "Totally random questions. \nCreator: Nafi Ahmad Rohman",
                "Actually Interrogation.",
          1);
JOptionPane.showMessageDialog(null,
                "Just a heads up, there's 13 of these.",
                "Amount of questions",
             1);
String name = (String)JOptionPane.showInputDialog(null,
                "1. What is your name?",
                "Name",
               3,
                null,
                null,
                "");
             String amount1 = JOptionPane.showInputDialog("What's your favourite number? (Integer)","");
        int amount = Integer.parseInt(amount1);
             String noun = (String)JOptionPane.showInputDialog(null,
                "3. What is your favourite object? (plural)",
                "Object",
                3,
                null,
                null,
                "");
             String bodyPart = (String)JOptionPane.showInputDialog(null,
                "4. Name a body part.",
                "Body Part",
                3,
                null,
                null,
                "");
             String store = (String)JOptionPane.showInputDialog(null,
                "5. Where do you shop for groceries?",
                "Groceries",
                3,
                null,
                null,
                "");
             String friend = (String)JOptionPane.showInputDialog(null,
                "6. What is your best friend's name?",
                "Friend",
                3,
                null,
                null,
                "");
             String movie = (String)JOptionPane.showInputDialog(null,
                "7. What is your favourite movie?",
                "Movie",
                3,
                null,
                null,
                "");
             String holiday = (String)JOptionPane.showInputDialog(null,
                "8. What is your favourite holiday?",
                "Movie",
                3,
                null,
                null,
                "");
             String worstThing = (String)JOptionPane.showInputDialog(null,
                "9. What is the worst thing you did?",
                "Feeling Guilty",
                3,
                null,
                null,
                "");
             String catchphrase = (String)JOptionPane.showInputDialog(null,
                "10. Do you have a catchprase? or a motto?",
                "Words to live by",
                3,
                null,
                null,
                "");
             String amount2 = JOptionPane.showInputDialog("11. Sorry to be grim but, How many more years do you think you will live? (double)","");
        double liveLong = Double.parseDouble(amount2);
             String badPlace = (String)JOptionPane.showInputDialog(null,
                "12. What is your least favourite place to be in?",
                "Not here.",
                3,
                null,
                null,
                "");
             String badFood = (String)JOptionPane.showInputDialog(null,
                "13. What is your least favourite food?",
                "Not this.",
                3,
                null,
                null,
                "");  
             JOptionPane.showMessageDialog(null,
                "Thank you for answering all the questions.",
                "You're welcome.",
             1);
             JOptionPane.showMessageDialog(null,
                "Because you've just confessed your crimes.",
                "What???",
             1);
             JOptionPane.showMessageDialog(null,
                "This is an interrogation.",
                "welp.",
             1);
             JOptionPane.showMessageDialog(null,
                "Alright, " + name + ", we already know what you did. You don't have to admit anything.\nYou're here cuz' you're charged for second-degree robbery."
                        + "\nA reported " + amount + " " + noun + " was stolen from " + store + " and it has your " + bodyPart + " written all over it! "
             + "Poor " + friend + ". They lost " + amount*2 + " dollars from this.\n" +
"Now it says here your alibi is that you were watching " + movie + " on " + holiday + ".\n" +
"So the why does the security camera footage show you " + worstThing + " at the crime scene?\n" +
"What do you have to say for yourself? \"" + catchphrase + "\". Is that so?\n" +
"Normally this would call for " + liveLong + " years in jail which is " + (amount/liveLong)*100 + "% of the amount you stole.\n" +
"But we're putting you in a special place. The " + badPlace + ".\n" +
"As you request, here's your last supper before you spend the rest of your life there, " + badFood + ".\n"
+ "Goodbye.",
                "The Interrogation.",
             1);
    }
}
