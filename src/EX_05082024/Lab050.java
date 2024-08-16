package EX_05082024;

public class Lab050
{
    public static void main(String[] args) {
        BuildingsBP dlfref = new BuildingsBP(); //Real object
        dlfref.name="DLF Pvt Builder";
        dlfref.noOfRooms=100;

        dlfref.useLift();

        BuildingsBP prestigeref = new BuildingsBP();
        prestigeref.name="Prestige Pvt Builder";
        prestigeref.noOfRooms=100;

        prestigeref.useLift();
    }
}
