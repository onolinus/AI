import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;

/*
    Name        : Canggih Pramono Gultom
    Desc        :
    Please	write	a	program	that	takes	a	text	file	as	input,	removes	a	particular	letter	from
    the	content	of	the	text	file,	and	output	the	results	into	another	text	file.	The	program
    should	take	3	inputs	as	a	single	command-line	argument.	These	inputs	(in	order)	are:
    • The	filename	of	the	input	text	file.
    • The	filename	of	the	output	file.
    • The	letter	to	be	removed.
    In	particular,	the	program	can	be	called	from	command-prompt	as:
    modify <inputFileName> <outputFileName> <letterToRemove>
* */
public class RemovalLetterTest {

    public static void main(String[] args) {

        System.out.print("Enter your command : ");

        try {

            File file = new File(args[0]);
            File newfile = new File(args[1]);
            FileWriter bw = new FileWriter(newfile, false);

            String remove = args[2];
            Scanner input = new Scanner(file);
            String newword;

            while (input.hasNext()) {
                String word = input.next();
                newword = word.replace(remove, "");
                bw.write(newword);
                bw.write("\n");
            }

            bw.flush();
            bw.close();
        } catch (Exception ex) {

            System.out.println("Error : " + ex.toString());

        }
    }

}
