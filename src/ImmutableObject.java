public class ImmutableObject {
    private String nameObject;
    private int credit;

    public ImmutableObject(String nameObject, int credit){
        this.nameObject = nameObject;
        this.credit = credit;
    }

    public String getNameObject() {
        return nameObject;
    }

    public int getCredit() {
        return credit;
    }
}
