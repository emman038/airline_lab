public class Passenger {

    private String name;
    private int contact;
    private int id;

    public Passenger(String name, int contact){
        this.name = name;
        this.contact = contact;
        this.id = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContact() {
        return this.contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public int getid() {
        return this.id;
    }

    public void setid(int id) {
        this.id = id;
    }
}
