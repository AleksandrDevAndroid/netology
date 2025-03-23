package org.aleks.perov;


public class Main {
    public static void main(String[] args) {
        name();
        balance();

    }
    public static void name(){
        System.out.println("Perov Aleksandr");
    }
    public static void balance(){
        int income = 44000;
        int spending = 30000;
        System.out.printf("Итого (руб):\n %s",income-spending);
    }
}