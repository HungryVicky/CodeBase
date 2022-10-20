package com.company;
import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        int n;

        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<String>> lists = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<String> vegetable = new ArrayList<>();

        try {
            System.out.println("\nEnter How Many Items Are You Saving in 1nd Array");
            n = scanner.nextInt();
            do {
                String str = scanner.next();
                fruits.add(str);
                n--;
            } while (n >= 0);

            System.out.println("\nEnter How Many Items Are You Saving in 2nd Array");
            n = scanner.nextInt();
            do {
                String str = scanner.next();
                vegetable.add(str);

                n--;
            } while (n >= 0);

        }
        catch (InputMismatchException e){
            e.fillInStackTrace();
            System.out.println("Enter How May Items Are You Storing");
        }
        catch (Exception e){
            e.fillInStackTrace();
            System.out.println("Error");
        }
        finally {
            lists.add(fruits);
            lists.add(vegetable);
            System.out.println("--------------");
            for (ArrayList<String> grocery : lists) {
                for (String st : grocery) {
                    System.out.println(st);
                }

                }
            System.out.println("--------------");
            }
        }
        }


