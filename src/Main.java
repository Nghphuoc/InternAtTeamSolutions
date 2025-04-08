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
    }
}