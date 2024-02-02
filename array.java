public class array {
    public static void main(String[] args) {
        int IdNo[]={01,02,03};                      
        int marks[]= new int[3];
        marks[0]=97;
        marks[1]=95;
        marks[2]=98;

        System.out.println("Display Id Numbers");
        System.out.println(IdNo[0]);
        System.out.println(IdNo[1]);
        System.out.println(IdNo[2]);
        System.out.println("Display Marks");

        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
}
