package com.javacourse.lessons.les_11.homework.task_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//ok
public class Task_2 {

    //Есть текст, пользователь вводит несколько слов. Надо проверить
    //если они в тексте и в каком количестве
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sourceText = initText();
        String inputWords = inputWords(scan);

        checkWordsInText(sourceText, inputWords);
    }

    public static String initText() {
        return "I am happy to join with you today in what will go down in history as the greatest demonstration for freedom in the history of our nation.\n" +
                "\n" +
                "Five score dream years ago, a great American, in whose symbolic shadow we stand today, signed the Emancipation Proclamation. This momentous decree came as a great beacon light of hope to millions of Negro slaves who had been seared in the flames of withering injustice. It came as a joyous daybreak to end the long night of their captivity.\n" +
                "\n" +
                "But one hundred years later, the Negro still is not free. One hundred years later, the life of the Negro is still sadly crippled by the manacles of segregation and the chains of discrimination. One hundred years later, the Negro lives on a lonely island of poverty in the midst of a vast ocean of material prosperity. One hundred years later, the Negro is still languished in the corners of American society and finds himself an exile in his own land. And so we've come here today to dramatize a shameful condition.\n" +
                "\n" +
                "In a sense we've come to our nation's capital to cash a check. When the architects of our republic wrote the magnificent words of the Constitution and the Declaration of Independence, they were signing a promissory note to which every American was to fall heir. This note was a promise that all men, yes, black men as well as white men, would be guaranteed the \"unalienable Rights\" of \"Life, Liberty and the pursuit of Happiness.\" It is obvious today that America has defaulted on this promissory note, insofar as her citizens of color are concerned. Instead of honoring this sacred obligation, America has given the Negro people a bad check, a check which has come back marked \"insufficient funds.\"\n" +
                "\n" +
                "But we refuse to believe that the bank of justice is bankrupt. We refuse to believe that there are insufficient funds in the great vaults of opportunity of this nation. And so, we've come to cash this check, a check that will give us upon demand the riches of freedom and the security of justice.\n" +
                "\n" +
                "We have also come to this hallowed spot to remind America of the fierce urgency of Now. This is no time to engage in the luxury of cooling off or to take the tranquilizing drug of gradualism. Now is the time to make real the promises of democracy. Now is the time to rise from the dark and desolate valley of segregation to the sunlit path of racial justice. Now is the time to lift our nation from the quicksands of racial injustice to the solid rock of brotherhood. Now is the time to make justice a reality for all of God's children.\n" +
                "\n" +
                "It would be fatal for the nation to overlook the urgency of the moment. This sweltering summer of the Negro's legitimate discontent will not pass until there is an invigorating autumn of freedom and equality. Nineteen sixty-three is not an end, but a beginning. And those who hope that the Negro needed to blow off steam and will now be content will have a rude awakening if the nation returns to business as usual. And there will be neither rest nor tranquility in America until the Negro is granted his citizenship rights. The whirlwinds of revolt will continue to shake the foundations of our nation until the bright day of justice emerges.\n" +
                "\n" +
                "But there is something that I must say to my people, who stand on the warm threshold which leads into the palace of justice: In the process of gaining our rightful place, we must not be guilty of wrongful deeds. Let us not seek to satisfy our thirst for freedom by drinking from the cup of bitterness and hatred. We must forever conduct our struggle on the high plane of dignity and discipline. We must not allow our creative protest to degenerate into physical violence. Again and again, we must rise to the majestic heights of meeting physical force with soul force.\n" +
                "\n" +
                "The marvelous new militancy which has engulfed the Negro community must not lead us to a distrust of all white people, for many of our white brothers, as evidenced by their presence here today, have come to realize that their destiny is tied up with our destiny. And they have come to realize that their freedom is inextricably bound to our freedom.";
    }

    public static String inputWords(Scanner scan) {
        System.out.print("Input the words that will find in text: ");
        return scan.nextLine();
    }

    public static void checkWordsInText(String text, String words) {
        String[] arrayOfWords = words.split(" ");
        for (int i = 0; i < arrayOfWords.length; i++) {
            System.out.println(arrayOfWords[i] + " : " + amountOfWordsInText(text, arrayOfWords[i]));
        }
    }

    public static int amountOfWordsInText(String text, String word) {
        int counter = 0;
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            counter++;
        }
        return counter;
    }
}
