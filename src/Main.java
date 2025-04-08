public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        String[] arg = {"data","project","new"}; // use this in your project
        for (String data : arg){
            System.out.print("\"");
            System.out.print(data);
            System.out.println("\"");
        }

        String getCharToString = "Hello TeamSolutions";
        System.out.println("-------------------------");
        for(char index : getCharToString.toCharArray()){
            System.out.println(index);
        }
        // mutable co th get va set
        MutableObject mutableObject = new MutableObject();
        mutableObject.setName("Nguyen Huu Phuoc");
        mutableObject.setAge(20);
        mutableObject.setHeight(1.7F);
        System.out.println(mutableObject.getName() + ", " + mutableObject.getAge() + ", " + mutableObject.getHeight());

        // immutable khong the set
        ImmutableObject immutableObject = new ImmutableObject("Course",15);
        System.out.println(immutableObject.getNameObject() + ", " + immutableObject.getCredit());

    }
}