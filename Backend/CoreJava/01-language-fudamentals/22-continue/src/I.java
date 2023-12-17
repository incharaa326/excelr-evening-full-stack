class I
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++)
		{
			if (i==2)
			{
			System.out.println("current i value is 2:" +i);
			}
			 else if(i==3)
			{
				System.out.println("current i value is 3:" +i);
			}
			 else if (i==5)
		{
			System.out.println("current i value is 5:" +i);
		}
		else
			{
               System.out.println("current i value is other than 2 3 5:" +i);
			}
	}
  }
}
//possibilities
//if block is possible
//one if and correspondingly one else
//one if and any no.of else if block
//one if and any no.of else if block and at last one else
//impossible
//else alone
//else if alone is not possible
//for one is multiple else block not possible
//one if block after multiple else if then you cannot develop more than one else