public class cardBoardBox {
    private String name = "SQUARE";
    private String color = "Brown";
    private int size = 16;

    public void on(){
        System.out.println("Box (Name =  " +name+ " Size = " +size+ " Color = " +color+") AVAILABLE ");
    }

    public void off(){
        System.out.println("Box (Name = " +name+ " Size = " +size+ " Color = " +color+") NOT AVAILABLE ");
    }


}
