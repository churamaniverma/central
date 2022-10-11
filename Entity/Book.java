package springapi.apidevelop.Entity;

public class Book {
    private int bid;
    private String bname;
    private String Aname;
    public Book() {
    }
    public int getBid() {
        return bid;
    }
    public void setBid(int bid) {
        this.bid = bid;
    }
    public String getBname() {
        return bname;
    }
    public void setBname(String bname) {
        this.bname = bname;
    }
    public String getAname() {
        return Aname;
    }
    public void setAname(String aname) {
        Aname = aname;
    }
    public Book(int bid, String bname, String aname) {
        this.bid = bid;
        this.bname = bname;
        Aname = aname;
    }

}
