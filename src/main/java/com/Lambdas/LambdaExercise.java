package com.Lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaExercise {
    private static final List<Point> points = List.of(
            new Point(-4, -8),
            new Point(-2, 9),
            new Point(-1, -8),
            new Point(0, -7),
            new Point(1, 1),
            new Point(2, 3),
            new Point(2, 3),
            new Point(2, -2),
            new Point(4, -1));

    public static void main(String[] args) {
        // 1. Print all elements of points using streams
        points.forEach(System.out::println); // Use forEach to print each Point object
        // 2. Print all elements of a points with special formatting -> "[x,y]", you can use this helper method, which can be introduced in this class
        //can I just toString override this?
        // 3. Calculate sum of all X-Coordinates with mapToInt () and reduce()
        int sumX = points.stream().mapToInt(Point::getX) // Extract X-coordinates
                .reduce(0, Integer::sum); // Calculate the sum
        System.out.println("Sum of X-coordinates: " + sumX);
        // 4. Filter all points which are positive in X with filter()
        List<Point> positiveXPoints = points.stream() // Use filter() to keep only points with positive X-coordinates
                .filter(point -> point.getX() > 0).toList(); // Print the filtered points
        System.out.println("Each Point with positive X coordinate will be displayed:");
        positiveXPoints.forEach(System.out::println);
        // 5. Use for collect() termination operation Collectors.joining() method to create comma separated string from points
        String commaSeparatedPoints = points.stream()
                .map(Point::toString) // Convert each Point to its string representation
                .collect(Collectors.joining(", ")); // Join them with a comma and space
        // Print the comma-separated string 123
        System.out.println(commaSeparatedPoints);




    }


}
