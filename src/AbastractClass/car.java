package AbastractClass;

abstract class car extends Engine{
    //Engine
    //GearBox
    //Keys


    //Tesla is a car
    //Tesla- DRIVE()

    @Override
    void Start() {
        System.out.println("Open Car with keys");

    }

    @Override
    void Stop() {
        System.out.println("Stop The Car");

    }

    @Override
    void partGearBox() {
        System.out.println("Part of Gear Box");

    }

    @Override
    void openCar() {
        System.out.println("start the car");

    }
}
