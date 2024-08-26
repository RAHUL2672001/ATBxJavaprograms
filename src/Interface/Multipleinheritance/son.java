package Interface.Multipleinheritance;

public class son implements Father,Mother{
    @Override
    public void money() {
        System.out.println("This is Only One Function");
    }

    @Override
    public void home() {

    }
}
