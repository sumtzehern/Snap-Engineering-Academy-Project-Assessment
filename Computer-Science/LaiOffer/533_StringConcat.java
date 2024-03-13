public String concatenate(String x, String y)
{
    String z = "";
    z = x + "," + y;
    return z;
}

/**
 * Notes:
 * 
 *  "+" operator will create a new String obj each time it used
 * 
 * StringBuilder and append()
 * 
 * provide more efficient way to concatenate
 * 
 * concatenating strings in a loop or dealing with a large number of concatenations, 
 * using StringBuilder with its append() method is generally more efficient and performs better, 
 * as it avoids creating unnecessary intermediate String objects.
 */