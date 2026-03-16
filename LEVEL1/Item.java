public class Item{
int itemcode;
String itemname;
int price;

int total(int qty,int price){
return price*qty;}

public static void main(String[] args){
Item i1=new Item();
i1.itemcode=1;
i1.itemname="Shampoo";
i1.price=260;
int q=5;
int t=i1.total(q,i1.price);
System.out.println("itemcode=" + i1.itemcode);
System.out.println("itemname=" + i1.itemname);
System.out.println("price=" + i1.price);
System.out.println("total=" + t);


}

}