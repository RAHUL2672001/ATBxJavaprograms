package WrapperClass;

public enum COLORS {
    RED("22323"),
    GREEN("3333"),
    BLUE("VHASGX");


    private String hexvalue;

    COLORS(String hexvalue) {
        this.hexvalue = hexvalue;
    }
    public String getvalue(){
        return hexvalue;
    }
}