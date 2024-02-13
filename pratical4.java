class SYbit016 {
    boolean confirm(String sample){
        String name = "";
        for(int i = 4;i<=6;i++){
            name = name + sample.charAt(i);
        }
        if((name.equals("bcs")) || (name.equals("bit")) || (name.equals("bme"))){
            return true;
        }
        else{
            return false;
        }
    }
    int getvalid(String arr[]){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(confirm(arr[i])){
                count++;
            }
        }
        return count;
    }
    public static long getvalidRegistrationCountLE50task1(String s) {
    long count=0;
    int num =Integer.parseInt(s.substring(8,10));
    if(num<=50)
    count++;
    return count;
    }   
      public static long getvalidRegistrationCountLE50task2(String s){
      long count=0;
    	String reg=s.substring(7,10);
    	char c[]=reg.toCharArray();
    	if((int)c[0]<49)
    	{
    		if((int)c[1]<53)
    			count++;
    		else if((int)c[1]==53)
    		{
    			if((int)c[2]==48)
    				count++;
    		}
    	}
    	return count;
      }
    
    public static void main(String[] args) {
        String regnums[] = {"2022bcs022","2022bit041","2022bit001","2022bce041"};
        SYbit016 obj = new SYbit016();
        int ans = obj.getvalid(regnums);
        System.out.println(ans);
        int t1=obj.getvalidRegistrationCountLE50task1(regnums);
        int t2=obj.getvalidRegistrationCountLE50task2(regnums);
        System.out.println(t1);
        System.out.println(t2);
    }
}
