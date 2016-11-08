public class Painting{
  String title,name;
  int value;
  public Painting(String title,String name){
    this.title=title;
    this.name=name;
    this.value=400;
  }
  public String getTitle(){
    return title;
  }
  public String getName(){
    return name;
  }
  public int getValue(){
    return value;
  }
  public void printInfo(){
    System.out.printf("Artist: %s\nName of Piece: %s\nValue: %d\n",name,title,value);
  }
}
