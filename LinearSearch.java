class LinearSearch
{
	public static void main(String args[])
	{
		int [] arr= new int[args.length];
		int Value=79;
		int index=-1;
		boolean b=false;
		for(int i=0;i<args.length; i++)
		{
			arr[i]= Integer.parseInt(args[i]);
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==79)
			{
				index=i;
				b=true;
				break;
			}
		}
		if(b==true)
		{
			System.out.println("Index No of Value: " +index + "\n The Value is : " +Value);
		}
		if(b==false)
		{
			System.out.println("Value not found");
		}
	}
}