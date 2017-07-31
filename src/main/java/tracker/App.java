package tracker;
import tracker.Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 7/31/17.
 */
public class App {
    public static void main(String[] args) {
        try{
            Integer[] triangleSideLength = {1, 2, 3};
            for (Integer num = 1; num <4; num++){
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Please enter the length of side: "+ num);
                triangleSideLength[num-1] = Integer.parseInt(bufferedReader.readLine());
            }
            Triangle newTriangle = new Triangle(triangleSideLength[0], triangleSideLength[1], triangleSideLength[2]);
            System.out.println(newTriangle.triangleType(triangleSideLength[0], triangleSideLength[1], triangleSideLength[2]));

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
