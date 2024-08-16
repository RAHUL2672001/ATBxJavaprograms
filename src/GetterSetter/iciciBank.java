package GetterSetter;

public class iciciBank {
    private String name;
    private long bal;

    public iciciBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean isAdmin) {

        if (isAdmin){

            this.name = name;

        }else
            System.out.println("not allowed");

    }

        public long getBal () {
            return bal;
        }

        public void setBal ( long bal, boolean isAdmin){
            if (isAdmin) {
                this.bal = bal;

            } else
                System.out.println("not allowed");

        }
    }
