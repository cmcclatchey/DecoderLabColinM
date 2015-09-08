package com.example;

public class Decoder
{
    public static void main(String[] args)
    {

        String greeting = "Hi, what is up?";

        // Secret message variables
        char var1 = '\u0054';
        char var2 = '\u0068';
        char var3 = '\u0065';
        char var4 = '\u0073';
        char var5 = '\u006B';
        char var6 = '\u0079';


        System.out.println(greeting);

        System.out.println("\n");

        System.out.println(var1 + "" + var2 + "" + var3 + " " + var4 + "" + var5 + "" + var6);


    }
}
