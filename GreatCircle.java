public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double distance = haversine(x1, y1, x2, y2);

        System.out.printf("Great circle distance = %.4f km", distance );
    }

    public static double haversine(double lat1, double lon1, double lat2, double lon2 ) {

        double r = 6371.0;

        double RadLat1 = Math.toRadians(lat1);
        double RadLon1 = Math.toRadians(lon1);
        double RadLat2 = Math.toRadians(lat1);
        double RadLon2 = Math.toRadians(lon2);


    }
}


