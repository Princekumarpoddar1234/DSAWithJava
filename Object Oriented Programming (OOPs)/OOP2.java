public class OOP2 {
    public static void main(String args[]){
        info p1 = new info();
        p1.name="Harsh";
        p1.age= 17;
        p1.password="abcd";
        p1.marks[0] = 98;
        p1.marks[1]= 99;
        p1.marks[2] = 100;

        info p2 = new info(p1);

        for(int i=0; i<3; i++) {
            System.out.println(p2.marks[i]);
        }
        System.out.println("After printing p2's array");
        for(int i=0; i<3; i++) {
            System.out.println(p1.marks[i]);
        }


        p2.password="efgh";
        p1.marks[2] = 87;

        for(int i=0; i<3; i++) {
            System.out.println(p2.marks[i]);
        }
        System.out.println("After printing p2's array");
        for(int i=0; i<3; i++) {
            System.out.println(p1.marks[i]);
        }

    }
}

class info{
    String name;
    int age;
    String password;
    int marks[];

    //shallow constructors
    // info(info p1){
    // marks = new int[3];
    //     this.name= p1.name;
    //     this.age = p1.age;
    //     this.marks =p1.marks;
    // }

    info(info p1) {
        marks = new int[3];
        this.name = p1.name;
        this.age = p1.age;
        for(int i=0; i<marks.length; i++){
            this.marks[i]= p1.marks[i];
        }
    }

    info(){
        marks = new int[3];
        System.out.println("constructors is called..");
    }
}
