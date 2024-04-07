class Mixed
{
	public static void main(String args[])
	{
		int dividend=7,divisor=3,quo,rem,c=0;
		quo=dividend/divisor;
		rem=dividend%divisor;
		c=divisor%rem;
		Mixed fraction= new Mixed();
    if(c==0)
    {
        divisor=divisor/rem;
        rem=rem/rem;
        System.out.println(fraction.toString(quo,rem,divisor));
    }
    else
        System.out.println(quo + " " + (char)8515 + " " + rem + " " + (char)8515 + " " + divisor);    	
	}
	public String toString(int quo, int rem, int divisor)
	{
	  return quo + " " + (char)8515 + " " + rem + " " + (char)8515 + " " + divisor;
	}
}
