// Name         Time (minutes)
// Elena        341
// Thomas       273
// Hamilton     278
// Suzie        329
// Phil         445
// Matt         402
// Alex         388
// Emma         275
// John         243
// James        334
// Jane         412
// Emily        393
// Daniel       299
// Neda         343
// Aaron        317
//Kate          265 

class Marathon {

    public static int fastRunner(int[] x){
        int index = 0;
        int minValue = 10000;
        for (int i = 0; i < x.length; i++){
            if (x[i] < minValue){
                minValue = x[i];
                index = i;
            }
        }
        return index;
    }

    public static int secondFastRunner(int[] x){
        int fRunner = fastRunner(x);
        int minValue = 10000;
        int index = 0;
        for(int i = 0; i < x.length; i++){
            if(x[i] < minValue && i != fRunner){
                minValue = x[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }

        int aux = fastRunner(times);
        System.out.println("Fast Runner: " + names[aux] + ": " + times[aux]);

        aux = secondFastRunner(times);
        System.out.println("Second Fast Runner: " + names[aux] + ": " + times[aux]);
    }
}
