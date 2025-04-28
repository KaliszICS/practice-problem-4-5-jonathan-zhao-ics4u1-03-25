/**
 * @author Jonathan Z
 * @version 17.0.1
 */
public class Cow {
    //instance variables
     private String name;
     private int age;
     private double weight;
     
     /**
      * Constructor for Cow class
      * @param name 
      * @param age
      * @param weight
      */
     public Cow(String name, int age, double weight) {
      this.name = name;
      this.age = age;
      this.weight = weight;
     }
    
     /**
      * Getter for name
      * @return returns the name of the cow
      */
        public String getName() {
            return this.name;
        }
    /**
     * Getter for age
     * @return returns the age (int) of the cow
     */
        public int getAge() {
            return this.age;
        }
    
        /**
         * Getter for weight
         * @return returns the weight (double) of the cow
         */
        public double getWeight() {
            return this.weight;
        }
    
        /**
         * Default object toString method
         * @return returns a string representation of the cow object
         *         in the format of "name, age - weight"
         */
        @Override
        public String toString() {
            return this.name + ", " + this.age + " - " + this.weight;
        }
    
        /**
         * Default object equals metho
         * obj instanceof Cow checks if the subject is an instance of the Cow class
         * @param obj the object to compare to
         * @return returns true if the cow object is equal to the other object, false otherwise
         *         (compares name, age, and weight)
         */
        @Override 
        public boolean equals(Object obj) {
            if(obj instanceof Cow) {
                Cow cow = (Cow)obj;
                if(cow.getName().equals(this.name) && cow.getAge() == this.age && cow.getWeight() == this.weight) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
    
    