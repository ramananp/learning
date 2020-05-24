package io.ramanan.learning.InterviewCake;

public class CanTwoMovieFillTheFlight {

    private static boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength) {

        // determine if two movies add up to the flight length
        java.util.Set<Integer> movies = new java.util.HashSet<>();
        for(int movieLength : movieLengths) {
            movies.add(movieLength);
        }
        
        for(int i=0; i<movieLengths.length; i++) {
            if(movies.contains(flightLength - movieLengths[i])) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        final boolean result = canTwoMoviesFillFlight(new int[] {3, 8}, 6);
        System.out.println(result);
    }

}