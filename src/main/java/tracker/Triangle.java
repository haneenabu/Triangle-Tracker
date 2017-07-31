package tracker;

/**
 * Created by Guest on 7/31/17.
 */
public class Triangle {
   public int sideOne;
   public int sideTwo;
   public int sideThree;

   public Triangle(int sideOne, int sideTwo, int sideThree){
       this.sideOne = sideOne;
       this.sideTwo = sideTwo;
       this.sideThree = sideThree;
   }
   public String triangleType(Integer sideOne, Integer sideTwo, Integer sideThree){
        if (sideOne.equals(sideTwo) && sideOne.equals(sideThree)) {
            return ("Equilateral");
        } else if (sideOne > (sideTwo+sideThree) || sideTwo > (sideOne + sideThree) || sideThree > (sideOne + sideTwo)){
            return ("This is not  triangle");
        } else if(sideOne.equals(sideTwo) || sideOne.equals(sideThree) || sideTwo.equals(sideThree)) {
            return ("Isosceles");
        } else {
            return ("Scalene");
        }
   }
}

