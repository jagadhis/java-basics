package jaga.course;


//enum in java
enum lang{
    JAVA,JAVASCRIPT,PYTHON;
}
//implementing multithread using runnable method outside the main class
class NewThread implements Runnable {
    String name;
    Thread thread;
    NewThread (String name){
        this.name = name;
        thread = new Thread(this, name);
        System.out.println( "A New thread: " + thread+ "is created\n" );
        thread.start();
    }
    public void run() {
        try {
            for(int j = 5; j > 0; j--) {
                System.out.println(name + ": " + j);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println(name + " thread Interrupted");
        }
        System.out.println(name + " thread exiting.");
    }
}

//extending to the thread class
    public class Main extends Thread {
        // executing a thread
        //run method to perform thread action
        //go to line 104,105 for creating instance
        public void run() {
            int a = 20;
            int b = 30;
            int total = a * b / 2;
            System.out.println("Thread is started");
            System.out.println("the total is " + total);
        }

        public static void main(String[] args) {

///calling the multithread class instance
            new NewThread("1st");
            new NewThread("2nd");
            new NewThread("3rd");
            try {
                Thread.sleep(8000);
            } catch (InterruptedException excetion) {
                System.out.println("Interruption occurs in Main Thread");
            }
            System.out.println("We are exiting from Main Thread");


    //primitive datatypes
            int value = 10000;
            int mymaxvalue = Integer.MAX_VALUE;
            int myminvalue = Integer.MIN_VALUE;
            System.out.println("maximum value = " + (mymaxvalue + 1));
            System.out.println("minimum value = " + (myminvalue - 1));
            byte minvalue = Byte.MIN_VALUE;
            byte maxvalue = Byte.MAX_VALUE;
            System.out.println(maxvalue);
            System.out.println(minvalue);
            short minivalue = Short.MIN_VALUE;
            short maxivalue = Short.MAX_VALUE;
            System.out.println(maxivalue);
            System.out.println(minivalue);
            long minimvalue = Long.MIN_VALUE;
            long maximvalue = Long.MAX_VALUE;
            System.out.println(maximvalue);
            System.out.println(minimvalue);

            int total = (mymaxvalue / 2);
            byte newtotal = (byte) (maxvalue / 2);
            short newmaxtotal = (short) (minivalue / 2);
            long newmaximtotal = (long) (maximvalue / 2);
            System.out.println(total);
            System.out.println(newtotal);
            System.out.println(newmaxtotal);
            System.out.println(newmaximtotal);

            byte bytevalue = 67;
            short shortvalue = 11115;
            int intvalue = 100;
            long longtotal = 10000L + 50L + (bytevalue + shortvalue + intvalue);
            System.out.println(longtotal);

            short shorttotal = (short) (10000 + 500 + (bytevalue + shortvalue + intvalue));
            System.out.println(shorttotal);

            float floatmaxvalue = Float.MAX_VALUE;
            float floatminvalue = Float.MIN_VALUE;
            System.out.println(floatmaxvalue);
            System.out.println(floatminvalue);

            double doublemaxvalue = Double.MAX_VALUE;
            double doubleminvalue = Double.MIN_VALUE;
            System.out.println(doublemaxvalue);
            System.out.println(doubleminvalue);

            double numberofpounds = 200d;
            double convertedkilo = numberofpounds * 0.45359273d;
            System.out.println(convertedkilo);

            char myunicodechar = '\u0041';
            System.out.println(myunicodechar);
            //operators
            int result = 1 * 2;
            System.out.println(result);

            ++result;
            System.out.println(result);
            //if statement
            boolean istopper = true;
            if (istopper = true) {
                System.out.println("He is not a topper");
            } else {
                System.out.println("he is a topper");
            }
            //enum examples and methods
            lang l1 = lang.JAVA;
            System.out.println(l1);
            System.out.println(lang.values());
            System.out.println(lang.valueOf("JAVASCRIPT"));

            lang arr[] = lang.values();
            System.out.println(arr);

            for (lang ja : arr) {
                System.out.println(ja + " at index " + ja.ordinal());
            }
            //creating instance for class
            Main thread = new Main();
            thread.start();//calling start to execute run
            //logical operators
            int totalscore = 100;
            int minscore = 40;
            //AND logical operator
            if(totalscore<100 && minscore<40){
                System.out.println("you are fail");
            }else{
                System.out.println("you are pass");
            }
            //OR logical operator
            if(totalscore==100 || minscore==40){
                System.out.println("you secured first class");

            }else{
                System.out.println("you secured second class");
            }



        }
    }
