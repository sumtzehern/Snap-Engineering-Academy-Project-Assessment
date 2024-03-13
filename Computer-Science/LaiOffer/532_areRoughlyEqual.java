public boolean areEqual(double x, double y)
{
    boolean b = false;
    if( Math.abs(x - y) < 0.0001)
    {
        b = true;
    }
    return b;
}

// Math.abs will get the absolute value
/**
 * Notes:
 * 
 * Math.abs return the type as the same argument type
 */