import java.util.Scanner;
import java.util.ArrayList;
public class PaintingTest{
  public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    ArrayList<Painting> list=new ArrayList<Painting>();
    for(int i=0;i<10;i++){
      System.out.print("Enter title of piece: ");
      String title=scan.nextLine();
      System.out.print("Enter artist's last name");
      String name=scan.nextLine();
      if(name.equals("Monet")||name.equals("Degas")||name.equals("Picasso")||name.equals("Rembrandt"))
        list.add(new FamousPainting(title,name));
      else
        list.add(new Painting(title,name));
    }
    for(Painting a:list){
      a.printInfo();
    }
  }
}
