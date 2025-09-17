class Flames extends UserInterface 
{
	Flames()
	{
		
	}
	public void flames()throws Exception 
	{
		System.out.println("---------Hurry Up to Flames-----------");
		heart();
		while (a)
		{
			System.out.println("1.Pairing\n2.About Flames\n3.Back");
			System.out.print("Wanna Move to :");
			if (sc.hasNextInt())
			{
				int user=sc.nextInt();
				if (user>0 && user<4)
				{
					switch (user)
					{
					case 1:
						{
							game();
						}
					break;
					case 2:
						{
							rules();
						}
					break;
					case 3:
						{
							frontPage();
						}
					break;
					}
				}
				else
				{
					elseNote();
					sc.nextLine();
				}
			}
			else
			{
				intNote();
				sc.nextLine();
			}
		}
	}
	public void rules()
	{
		System.out.println("Already You About 'FLAMES' but once I will remain it......\n\tF - FRIENDS\n\tL - Love\n\tA - Affection\n\tM - MARRIAGE\n\tE - ENEMY\n\tS - SISTER");
	}
	public void game()throws Exception
	{
		System.out.println("Lets See Pairing About Your Wished One.......");
		sc.nextLine();
		System.out.print("Enter Your Beautifull Name :");
		String name=sc.nextLine();
		name=name.replaceAll("\\s+","").toUpperCase();
		System.out.print("Enter Your Crush Name :");
		String cname=sc.nextLine();
		cname=cname.replaceAll("\\s+","").toUpperCase();
		StringBuilder sb1=new StringBuilder(name);
		StringBuilder sb2=new StringBuilder(cname);
		int i=0;
		while (i<sb1.length())
		{
			boolean found=false;
			for (int j=0;j<sb2.length() ;j++ )
			{
				if (sb1.charAt(i)==sb2.charAt(j))
				{
					sb1.deleteCharAt(i);
					sb2.deleteCharAt(j);
					found=true;
					i=0;
					break;
				}
			}
			if (!found)
			{
				i++;
			}
		}
		String res=sb1.toString()+sb2.toString();
		String flames="FLAMES";
		StringBuilder relation=new StringBuilder(flames);
		int idx = 0;
        while (relation.length() > 1) {
            idx = (res.length() % relation.length()) - 1;
            if (idx >= 0) {
                relation.deleteCharAt(idx);
                relation = new StringBuilder(relation.substring(idx) + relation.substring(0, idx));
            } else {
                relation.deleteCharAt(relation.length() - 1);
            }
        }

        char fr = relation.charAt(0);
        String output = "";
		switch (fr)
		{
		case 'F':
			{
				output="Friend";
			}
		break;
		case 'L':
			{
				output="Lover";
			}
		break;
		case 'A':
			{
				output="Affection";
			}
		break;
		case 'M':
			{
				output="Married";
			}
		break;
		case 'E':
			{
				output="Enemy";
			}
		break;
		case 'S':
			{
				output="Sister";
			}
		break;
		}
		System.out.println("Processing.....");
		twinHeart();
		System.out.printf("Hey %s, %s is %s for You.........\n",name,cname,output);
		while (a)
		{
			System.out.println("1.Pair Again\n2.Back");
			System.out.print("Wanna Move to :");
			if (sc.hasNextInt())
			{
				int user=sc.nextInt();
				if (user==1 || user==2)
				{
					switch (user)
					{
					case 1:
						{
							game();
						}
					break;
					case 2:
						{
							flames();
						}
					break;
					}
					break;
				}
				else
				{
					elseNote();
					sc.nextLine();
				}
				break;
			}
			else
			{
				intNote();
				sc.nextLine();
			}
		}
	}
	public void twinHeart()throws Exception
	{
		for (int i=0;i<5 ;i++ )
		{
			for (int j=0;j<12;j++ )
			{
				if ((i==0&&j==1)|| (i==0&&j==2)|| (i==0&&j==4)||(i==0&&j==5)||(i==0&&j==6)|| (i==0&&j==7)|| (i==0&&j==9)|| (i==0&&j==10)|| (i==1&&j==0)|| (i==1&&j==3)|| (i==1&&j==5)|| (i==1&&j==6)|| (i==1&&j==8)|| (i==1&&j==11)|| (i==2&&j==1)|| (i==2&&j==5)|| (i==2&&j==6)|| (i==2&&j==10)|| (i==3&&j==2)|| (i==3&&j==4)|| (i==3&&j==7)|| (i==3&&j==9)|| (i==4&&j==3)|| (i==4&&j==8)||(i==1&&j==3)||(i==1&&j==1)||(i==1&&j==2)||(i==1&&j==4)||(i==1&&j==7)||(i==1&&j==9)||(i==1&&j==10)||(i==2&&j==2)||(i==2&&j==3)||(i==2&&j==4)||(i==2&&j==7)||(i==2&&j==8)||(i==2&&j==9)||(i==3&&j==3)||(i==3&&j==8))
				{
					System.out.print("* ");
					Thread.sleep(50);
				}
				else
				{
					System.out.print("  ");
					Thread.sleep(50);
				}
			}
			System.out.println();
		}
	}
	public void heart()throws Exception
	{
		for (int i=0;i<4 ;i++ )
		{
			for (int j=0;j<5;j++ )
			{
				if ((i==0&&j==1)||(i==0&&j==3)||(i==1&&j==0)||(i==1&&j==2)||(i==1&&j==4)||(i==2&&j==1)||(i==2&&j==3)||(i==3&&j==2))
				{
					System.out.print("* ");
					Thread.sleep(50);
				}
				else
				{
					System.out.print("  ");
					Thread.sleep(50);
				}
			}
			System.out.println();
		}
		
	}
}
