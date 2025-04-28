public class Student {
    // instance variables
    private String name;
    private int age;
    private String studentNumber;
    
    /**
     * Constructor for Student class
     * @param name
     * @param age
     * @param studentNumber
     */

    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    /**
     * Getter for name
     * @return returns the name of the student
     */
    public String getName() {
        return this.name;

    }
    /**
     * Getter for age
     * @return returns the age (int) of the student
     */
    public int getAge() {
        return this.age;
    }
    /**
     * Getter for Student Number
     * @return returns the student number (STring) of the student
     */
    public String getStudentNumber() {
        return this.studentNumber;
    }

    /**
     * Default object toString method
     * @return returns a string representation of the student object
     *         in the format of "name, age - studentNumber"
     */
    @Override
    public String toString() {
        return this.name + ", " + this.age + " - " + this.studentNumber; 
    }

    /**
     * Default object equals method
     * obj instanceof Student checks if the subject is an instance of the Student class
     * @param obj the object to compare to
     * @return returns true if the student object is equal to the other object, false otherwise
     *         (compares name, age, and studentNumber)
     */
    @Override
    public boolean equals(Object obj) {
       if(obj instanceof Student) {
        Student student = (Student)obj;
            if(student.getStudentNumber().equals(this.studentNumber)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
