class Student {
    String name;
    String email;
    String Roll;
    String ICPGrade;
    String DMGrades;
    String WDGrades;
    
    // Constructor
    Student(String n, String e, String r) {
        name = n;
        email = e;
        Roll = r;
    }
    
    // Method to get rating based on grade
    int getRating(String Grade) {
        if (Grade.equals("A*"))
            return 10;
        else if (Grade.equals("A"))
            return 8;
        else if (Grade.equals("B"))
            return 7;
        else
            return 0;  // Return a default rating if the grade is not recognized
    }
    boolean isEqualTo(Studnt s){
        return Roll.equals(s.Roll);
    }
    
    // Method to calculate CGR
    double getCGR() {
        return (getRating(this.ICPGrade) * 4 + getRating(this.DMGrades) * 3 + getRating(this.WDGrades) * 3) / 10.0;
    }
}

public class OOP {
    public static void main(String[] args) {
        // Create a student object with proper string literals and values
        Student st = new Student("Rahul", "hello@example.com", "278");
        
        // Assign grades to the student
        st.ICPGrade = "A*";
        st.DMGrades = "A*";
        st.WDGrades = "B";
        
        // Print the CGR
        System.out.println(st.getCGR());
          // Corrected: Call the method on the instance
          boolean check = isEqualTo(s1);
          
    }
}
