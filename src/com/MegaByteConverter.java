package com;

public class MegaByteConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes>=0) {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + "KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }else {
            System.out.println("Invalid Value");
        }
    }
}
