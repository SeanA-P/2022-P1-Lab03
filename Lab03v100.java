public class Lab03v100
{
    public static void main(String[] args) {
        System.out.println("Lab03, 100 point version");
        int sm = 10000123;
        System.out.println("Starting Milliseconds:  " + sm);

        int h = sm / 3600000;
        System.out.println("Hours:                  " + h);

        int rh = sm % 3600000;

        int m = rh / 60000;
        System.out.println("Minutes:                " + m);

        int rm = rh % 60000;
        int s = rm / 1000;
        System.out.println("Seconds:                " + s);

        int rms = rm % 1000;
        System.out.println("Milliseconds:           " + rms);


    }
}
