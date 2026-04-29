public class OOP9 {
    /*
     * DEMONSTRATION: Static Variables are SHARED across all instances
     * 
     * This program shows how static variables belong to the CLASS, not individual objects.
     * When any object changes a static variable, ALL objects see that change.
     * 
     * Expected Output:
     * - s1 has individual name "Harshit" 
     * - s2 sets SchoolName to "Saint"
     * - s3 changes SchoolName to "Vedantic" 
     * - This overwrites s2's value because SchoolName is SHARED!
     * 
     * Key Learning: Static = One copy shared by ALL objects of that class
     */
    public static void main(String args[]) {
        // Individual object with instance variable (each object has its own copy)
        Student s1 = new Student();
        // First object sets static variable
        s1.setName("Harshit");
        System.out.println("Your name is "+s1.getName());

        // Second object changes the SAME static variable (shared memory)
        Student s2 = new Student();
        s2.SchoolName = "Saint";

        System.out.println("s3 changed SchoolName to: "+ s2.SchoolName);

        Student s3 = new Student();
        s3.SchoolName = "Vedantic";
        // Prove they share the same variable
        System.out.println("s2's SchoolName is now: "+s3.SchoolName);
    }
}

class Student{
    String name;
    int roll;

    static String SchoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}