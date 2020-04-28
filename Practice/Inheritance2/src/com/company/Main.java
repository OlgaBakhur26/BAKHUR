package com.company;

public class Main {

    public static void main(String[] args) {

        BoxWeight mybpx1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybpx2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybpx3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(2, 3);
        BoxWeight myclone = new BoxWeight(mybpx1);
        double vol;

        vol = mybpx1.volume();
        System.out.println("Vol of mybox1 is equal to: " + vol);
        System.out.println("Weight of mybox1 is equal to: " + mybpx1.weight);
        System.out.println();

        vol = mybpx2.volume();
        System.out.println("Vol of mybox2 is equal to: " + vol);
        System.out.println("Weight of mybox2 is equal to: " + mybpx2.weight);
        System.out.println();

        vol = mybpx3.volume();
        System.out.println("Vol of mybox3 is equal to: " + vol);
        System.out.println("Weight of mybox3 is equal to: " + mybpx3.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Vol of mycube is equal to: " + vol);
        System.out.println("Weight of mycube is equal to: " + mycube.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Vol of myclone is equal to: " + vol);
        System.out.println("Weight of myclone is equal to: " + myclone.weight);
        System.out.println();

        BoxWeight obj = new BoxWeight();
        obj.show();

        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is equal to: " + vol);
        System.out.println("Weight of shipment1 is equal to: " + shipment1.weight);
        System.out.println("Cost of shipment1 is equal to: " + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Volume of shipment2 is equal to: " + vol);
        System.out.println("Weight of shipment2 is equal to: " + shipment2.weight);
        System.out.println("Cost of shipment2 is equal to: " + shipment2.cost);
        System.out.println();



    }
}
