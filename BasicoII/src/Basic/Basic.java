/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class Basic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        create();	// creates a file
        writeAle();	// writes data to the file
        read();		// reads data in the file
        store();	// stores data in an array

    }

    private static void create() // creates a file
    {
        try {

            for (int i = 0; i < 17; i++) {
                if (i != 16) {
                    String fname = ("data" + i + ".txt");

                    File f = new File(fname);

                    String msg = "creating file `" + fname + "' ... ";
                    System.out.println();
                    System.out.printf("%s", msg);

                    f.createNewFile();
                    System.out.println("done");
                } else {
                    String tname = ("times.txt");

                    File t = new File(tname);

                    String msg = "creating file `" + tname + "' ... ";
                    System.out.println();
                    System.out.printf("%s", msg);

                    t.createNewFile();
                    System.out.println("done");
                }

            }

        } catch (IOException err) {
            // complains if there is an Input/Output Error
            err.printStackTrace();
        }

        return;
    }

    public static int generateRandomInt(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }

    private static void writeAle() // writes data to a file
    {
        try {
            // defines the filename
            int numel = 0, cas;
            Scanner leer = new Scanner(System.in);
            System.out.println("Escoger caso: 1-mejor caso 2-caso promedio 3-peor caso");
            cas = leer.nextInt();
            numel = 32;
            switch (cas) {

                case 1:
                    for (int i = 0; i < 17; i++) {
                        if (i != 16) {
                            String filename = ("data" + i + ".txt");

                            PrintWriter out = new PrintWriter(filename);

                            String msg = "writing %d numbers ... ";
                            System.out.printf(msg, numel);

                            for (int j = 0; j != numel; ++j) {
                                out.printf("\n" + generateRandomInt(1));
                            }
                            numel = numel * 2;
                            System.out.println("done");

                            System.out.printf("closing file ... ");
                            out.close();	// closes the output stream
                            System.out.println("done");
                        } else {
                            String filename = ("times.txt");
                            // creates new PrintWriter object for writing file
                            PrintWriter out = new PrintWriter(filename);

                            String msg = "writing %d numbers ... ";
                            System.out.printf(msg, numel);
                            // writes the integers in the range [0, 256)

                            out.printf("\n");

                            System.out.println("done");

                            System.out.printf("closing file ... ");
                            out.close();	// closes the output stream
                            System.out.println("done");
                        }

                    }

                    break;
                case 2:
                    for (int i = 0; i < 17; i++) {
                        if (i != 16) {
                            String filename = ("data" + i + ".txt");

                            PrintWriter out = new PrintWriter(filename);

                            String msg = "writing %d numbers ... ";
                            System.out.printf(msg, numel);

                            for (int j = 0; j != numel; ++j) {
                                out.printf("\n" + generateRandomInt(numel));
                            }
                            numel = numel * 2;
                            System.out.println("done");

                            System.out.printf("closing file ... ");
                            out.close();	// closes the output stream
                            System.out.println("done");
                        } else {
                            String filename = ("times.txt");
                            // creates new PrintWriter object for writing file
                            PrintWriter out = new PrintWriter(filename);

                            String msg = "writing %d numbers ... ";
                            System.out.printf(msg, numel);
                            // writes the integers in the range [0, 256)

                            out.printf("\n");

                            System.out.println("done");

                            System.out.printf("closing file ... ");
                            out.close();	// closes the output stream
                            System.out.println("done");
                        }

                    }

                    break;
                case 3:

                    for (int i = 0; i < 17; i++) {
                        if (i != 16) {
                            String filename = ("data" + i + ".txt");
                            // creates new PrintWriter object for writing file
                            PrintWriter out = new PrintWriter(filename);

                            String msg = "writing %d numbers ... ";
                            System.out.printf(msg, numel);
                            // writes the integers in the range [0, 256)
                            for (int j = 0; j != numel; ++j) {
//                        out.printf("\n" + (generateRandomInt(1) + 1));
                                out.printf("\n" + j+1);
                            }
                            numel = numel * 2;
                            System.out.println("done");

                            System.out.printf("closing file ... ");
                            out.close();	// closes the output stream
                            System.out.println("done");
                        } else {
                            String filename = ("times.txt");
                            // creates new PrintWriter object for writing file
                            PrintWriter out = new PrintWriter(filename);

                            String msg = "writing %d numbers ... ";
                            System.out.printf(msg, numel);
                            // writes the integers in the range [0, 256)

                            out.printf("\n");

                            System.out.println("done");

                            System.out.printf("closing file ... ");
                            out.close();	// closes the output stream
                            System.out.println("done");
                        }

                    }

                    break;

            }

        } catch (FileNotFoundException err) {
            // complains if file does not exist
            err.printStackTrace();
        }

        return;
    }

    private static void read() // reads the file contents and prints them to the console
    {

        try {

            for (int i = 0; i < 17; i++) {
                if (i != 16) {
                    String filename = ("data" + i + ".txt");
                    // creates a File object
                    File f = new File(filename);

                    // attempts to create a Scanner object
                    Scanner in = new Scanner(f);

                    System.out.printf("\nnumbers in file:\n");

                    int x;
                    int count = 0;
                    // reads integers in file until EOF
                    while (in.hasNextInt()) {
                        // reads  number and prints it
                        x = in.nextInt();

                        ++count;
                    }

                    String msg = ("%d numbers have been read\n");
                    System.out.printf(msg, count);

                    in.close();	// closes the input stream
                } else {
                    String tilename = ("times.txt");
                    // creates a File object
                    File t = new File(tilename);

                    // attempts to create a Scanner object
                    Scanner in = new Scanner(t);

                    in.close();	// closes the input stream
                }

            }

        } catch (FileNotFoundException err) {
            // complains if file does not exist
            err.printStackTrace();
        }

        return;
    }

    private static void store() // stores the file contents into an array and prints the array
    {

        try {

            long[] tiempo = new long[20];
            long time_start, time_end;
            time_start = System.nanoTime();
            long num[] = new long[200];
            long iter[] = new long[200];
            for (int i = 0; i < 16; i++) {
                long itera = 0;
                String filename = "data" + i + ".txt";

                File f = new File(filename);

                int numers[][] = new int[10000000][3];

                Scanner in = new Scanner(f);

                int size = lines(filename);

                int[] list = new int[size];

                int count = 0;
                // reads numbers into array

                while (in.hasNextInt()) {
                    list[count] = in.nextInt();
                    for (int t = 0; t < list.length; t++) {
                        if (list[count] == list[t]) {
                            numers[t][0] = list[count];
                            itera = itera + 1;
                            break;

                        }
                    }

                    ++count;
                }

                for (int j = 0; j < list.length; j++) {
                    for (int w = 0; w < list.length + 1; w++) {
                        if (numers[w][0] == list[j]) {
                            numers[w][1] = numers[w][1] + 1;
                            itera = itera + 1;
                            break;
                        } else {
                            itera = itera + 1;
                        }
                    }
                }
                iter[i] = itera;
                time_end = System.nanoTime();

                tiempo[i] = time_end - time_start;

                num[i] = count;
                in.close();
                String tilename = "times.txt";
                // creates new PrintWriter object for writing file
                PrintWriter ous = new PrintWriter(tilename);
                for (int k = 0; k < 16; k++) {
                    if (num[k] != 0) {
//                        System.out.println("\n" + num[k] + " " + iter[k]+ " " + tiempo[k]);
                        ous.printf("\n" + num[k] + " " + iter[k] + " " + tiempo[k]);
                    }

                }
                String msg = ("array stores %d numbers\n");
                for (int j = 0; j < numers.length; ++j) {
                    if (numers[j][1] != 0) {
                        System.out.println("► " + numers[j][0] + " : " + numers[j][1] + " ◄ ");//si el vector tiene un valor se imprime, en caso contrario no

                    }

                }
                System.out.printf(msg, count);
                ous.close();
            }

        } catch (FileNotFoundException err) {
            // complains if file does not exist
            err.printStackTrace();
        }

        return;
    }

    private static int lines(String filename) // counts number of lines (or records) in a file
    {

        int count = 0;
        // creates a File object
        File f = new File(filename);
        try {
            // attempts to create a Scanner object
            Scanner in = new Scanner(f);

            // reads integers in file until EOF for counting
            while (in.hasNextInt()) {
                in.nextInt();
                ++count;
            }

            in.close();	// closes the input stream
        } catch (FileNotFoundException err) {
            // complains if file does not exist
            err.printStackTrace();
        }

        return count;

    }

}
