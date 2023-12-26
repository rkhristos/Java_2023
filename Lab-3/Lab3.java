public class Lab3 {
    public static void main(String[] args) {
        short option;
        Scanner in = new Scanner(System.in);

        boolean succeed = false;

        while (!succeed) {
            System.out.println("Select option (1,2,3)\n");
            option = in.nextShort();
            switch (option) {
                case 1:
                    Task1(0,0,0);
                    Task1(-1,1,1);
                    Task1(5,1,1);
                    Task1(Integer.MAX_VALUE,3,3);
                    Task1(Integer.MAX_VALUE,0,0);
                    Task1(31,1,2);
                    succeed = true;
                    break;
                case 2:
                    Task2(0,0);
                    Task2(1,1);
                    Task2(2,2);
                    Task2(3,3);
                    Task2(Double.MAX_VALUE,1);
                    Task2(Double.MAX_VALUE,4);
                    Task2(Double.NaN,1);
                    Task2(Double.NaN,4);
                    succeed = true;
                    break;
                case 3:
                    Task3(-1);
                    Task3(0.1);
                    Task3(0.000001);
                    Task3(10);
                    Task3(Double.NaN);
                    Task3(Double.MAX_VALUE);
                    succeed = true;
                    break;
                default:
                    System.out.println("Wrong option !\n");
                    break;
            }
        }
    }

    public static void Task1(int k, double a, double b)
    {
        double res = 0;

        try {
            if(k <= 0 || k > 30)
            {
                throw new IllegalArgumentException("k = "+ k);
            }
            for(int i = 1; i <= k; i++)
            {
                res += Math.sqrt(a*i*Math.sqrt(b/i));
            }
            System.out.println("Task1 k = " + k + " a = " + a + " b = " + b + " res = " + res);
        }catch (IllegalArgumentException e){
            System.out.println("ARGUMENT EXCEPTION" + e.getMessage());
        }
    }

    public static void Task2(double t, int i)
    {
        double res = 0;

        try {
            if(i <= 0)
            {
                throw new IllegalArgumentException("i = "+ i);
            }
            else if(i == 1 || i == 2) {
                res = Math.log(t);
            }
            else if(i>2) {
                for (int k = 1; k <= i; k++) {
                    res += Math.sin(t)/k;
                }
            }
            System.out.println("Task1 i = " + i + " t = " + t + " res = " + res);
        }catch (IllegalArgumentException e){
            System.out.println("ARGUMENT EXCEPTION" + e.getMessage());
        }
    }

    public static void Task3(double e)
    {
        double res = 0;

        try {
            if(e <= 0)
            {
                throw new IllegalArgumentException("e = "+ e);
            }

            double a = 0, i = 1;
            do{
                a = 1/(i*(i+1));
                res +=a;
                i++;
            }while(a > e);
            System.out.println("Task1 e = " + e + " res = " + res);
        }catch (IllegalArgumentException exception){
            System.out.println("ARGUMENT EXCEPTION" + exception.getMessage());
        }
    }
}
