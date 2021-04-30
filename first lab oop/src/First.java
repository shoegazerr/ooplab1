public class First {
    public static int convert (int i){
        return i*60;
    }

    public static int points (int two, int three){
        return (two * 2) + (three * 3);
    }

    public static int footballPoints (int wins, int draws, int defeats){
        return ((wins * 3) + draws + (defeats * 0));
    }
    public static boolean divisibleByFive(int t){
        return (t % 5 == 0);
    }
    public static boolean and (boolean m, boolean d){
        return (m && d);
    }
    public static int howManyWalls (int n, int w, int h){
        return (n / (h * w));
    }
    public static int squared (int l){
        return (l * l);
    }
    public static boolean profitableGamble(float prob, float prize, float pay){
        return (prob * prize > pay);
    }
    public static float frames (float minutes, float fps){
        return (minutes * 60) * fps;
    }
    public static int mod (int a, int b){
        return a - (b * (a/b));
    }

    public static void main(String[] args) {
        System.out.println(convert(2) + " секунд");
        System.out.println(points(13, 12) + " очков");
        System.out.println(footballPoints(30,4,2) + " очков");
        System.out.println(divisibleByFive(37));
        System.out.println(and(true,true));
        System.out.println(howManyWalls(100,4,5));
        System.out.println(squared(100));
        System.out.println(profitableGamble(0.9f,1,2));
        System.out.println(frames(5,218));
        System.out.println(mod(218, 5));
    }
}
