package com.company;

public class Euclid {

    public static int recursively(int a, int b)
    {
        if(a == 0)
        {
            return b;
        }
        else if(b == 0)
        {
            return a;
        }
        else
        {
            int c = a/b;
            int r = a-(b*c);
            return recursively(b, r);
        }
    }

    public static int iteratively(int a, int b)
    {
        while(a != 0 && b != 0)
        {
            int c = a/b;
            int holder = b;
            b = a-(b*c);
            a = holder;
        }
        if(a == 0)
        {
            return b;
        }
        if(b == 0)
        {
            return a;
        }
        else
        {
            return 0;
        }
    }

}
