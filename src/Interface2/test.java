package Interface2;

import java.util.ArrayList;
import java.util.Scanner;

interface deliveryOptions{

     int getTheTotal(ArrayList<String> list);
     String isFreeShipping(ArrayList<String> list);

     int AmazonMinFreeDelivery = 10000;
     int CostcoMinFreeDelivery =  15000;




}

class Amazon implements deliveryOptions{


    @Override
    public int getTheTotal(ArrayList<String> list) {
        int sum =0;

        for (String s: list){

            if (s.charAt(s.length()-1) == 'K'){

                s = s.replaceAll("[^0-9]","");
                sum += Integer.parseInt(s) * 1000;
            }

            else {
               s=  s.replaceAll("[^0-9]","");
               sum += Integer.parseInt(s);
            }
        }

        return sum;
    }

    @Override
    public String isFreeShipping(ArrayList<String> list) {

        String strReturn = "";

        if (getTheTotal(list) > AmazonMinFreeDelivery){

            strReturn= "you are eligible for free delivery";
        }

        if (getTheTotal(list) < AmazonMinFreeDelivery) {

            strReturn = "you need to buy " +(AmazonMinFreeDelivery - getTheTotal(list)) + " amount of item.";
        }
        return strReturn;
    }
}

class Costco implements deliveryOptions{


    @Override
    public int getTheTotal(ArrayList<String> list) {
        int sum =0;

        for (String s: list){

            if (s.charAt(s.length()-1) == 'K'){

                s = s.replaceAll("[^0-9]","");
                sum += Integer.parseInt(s) * 1000;
            }

            else {
                s=  s.replaceAll("[^0-9]","");
                sum += Integer.parseInt(s);
            }
        }

        return sum;
    }

    @Override
    public String isFreeShipping(ArrayList<String> list) {

        String strReturn = "";

        if (getTheTotal(list) > CostcoMinFreeDelivery){

            strReturn= "you are eligible for free delivery";
        }

        if (getTheTotal(list) < CostcoMinFreeDelivery) {

            strReturn = "you need to buy " +(CostcoMinFreeDelivery - getTheTotal(list)) + " amount of item.";
        }
        return strReturn;
    }
}



public class test {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        ArrayList<String> listNumbers = new ArrayList<>();

        int counter = 0;
        while(scan.hasNext()){

            listNumbers.add(scan.nextLine());
            counter++;
            if(counter==10){

                break;
            }

        }

        // while calling the methods in the classes use listNumbers arraylist

        Amazon amazon = new Amazon();
        Costco costco = new Costco();

        System.out.println( amazon.isFreeShipping(listNumbers));
        System.out.println(costco.isFreeShipping(listNumbers));





    }

}