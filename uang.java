/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi
 */
class Money{
   public String bentuk;
   public String warna;
   public int nominal;

public Money(String b, String w, int n){
    this.bentuk=b;
    this.warna=w;
    this.nominal=n;
}

public void tampilData(){
    System.out.println("=========DATA UANG=========");  
    System.out.println("Bentuk Uang  : "+ this.bentuk);   
    System.out.println("Warna        : "+ this.warna);  
    System.out.println("Nominal Uang : "+this.nominal);   
    }
}

public class uang{
    public static void main(String[] args){
        Money ug1=new Money("Lingkaran", "Silver", 100);
        ug1.tampilData();
    }
}
