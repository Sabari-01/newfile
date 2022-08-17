import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class student{
    static HashMap<Integer,student> map = new HashMap<>() ;
    static int id = 10001 ;

    String name ;
    int phno ;
    student()
    {}
    public void create(String name , int phno ){
        student s = new student();
        s.phno = phno ;
        s.name = name ;
//        list.(s);
        map.put(id,s);
        id++;
        System.out.println("Student Added");
    }
    public void get(){
        for(int i : map.keySet()){
            System.out.println("Student id : " + i );
            System.out.println("Student name :" + map.get(i).name );
            System.out.println("Student phno : " + map.get(i).phno );
            System.out.println();
        }
    }
    public void get(int i){
            System.out.println("Student id : " + i );
            System.out.println("Student name :" + map.get(i).name );
            System.out.println("Student phno : " + map.get(i).phno );
    }

}
public class Main {
    public static void main(String[] args) {
        student s = new student() ;
        s.create("sabari" , 98934567 );
        s.create("sabari2" , 78934567 );
        s.create("sabari3" , 674567 );
//        s.get();
        System.out.println();
        s.get(10002);
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;

    }

}