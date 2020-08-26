package com.company;
import java.util.Scanner;

public class Main {

    public static String checkHealth(String name, float temp, int systolic, int diastolic, float height) {
        String comments = "Patient: " + name + ".  ";
        comments += "Has a blood pressure of " + diastolic + "/" + systolic + ".  ";
        if (temp < 72) {
            comments += "Patient has probably been dead for several days.";
        } else if (temp < 87.5) {
            comments += "Just recently dead.";
        } else if (temp < 96) {
            comments += "Get patient a blanket.";
        } else if (temp < 99) {
            comments += "Normal.";
        } else if (temp < 102) {
            comments += "Suggest patient take some aspirin.";
        } else if (temp < 106) {
            comments += "Call the ER.";
        } else {
            comments += "Call the CDC.";
        }

        if (height < 1.5) {
            comments += "Suggest growth hormones.";
        } else if (height > 2.4) {
            comments += "Suggest they try out for the Mavs.";
        }

        return comments;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name:");
        String name = in.nextLine();
        System.out.print("Temp:");
        String temp = in.nextLine();
        float fTemp = Float.parseFloat(temp);
        System.out.print("Enter systolic:");
        String systolic = in.nextLine();
        int iSystolic = Integer.parseInt(systolic);
        System.out.print("Enter diastolic:");
        String diastolic = in.nextLine();
        int iDiastolic = Integer.parseInt(diastolic);
        System.out.print("Enter height in Meters:");
        String height = in.nextLine();
        float fHeight = Float.parseFloat(height);

        System.out.println(checkHealth(name, fTemp, iSystolic, iDiastolic, fHeight));






    }
}
