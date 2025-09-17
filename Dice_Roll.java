import java.util.*;
class Dice_Roll extends UserInterface implements Runnable
{
	Dice_Roll()
	{
		
	}
	static ArrayList<Integer> al=new ArrayList<Integer>();
	static TreeMap<String, Integer> gamert = new TreeMap<>();
    static TreeMap<String, Integer> syst = new TreeMap<>();
	String threadName;
	static int round=1;
	static int userTotal = 0;
	static int sysTotal = 0;
	Dice_Roll(String tname) 
	{
        this.threadName = tname;
    }
	public void diceRoll()throws Exception 
	{
		System.out.println("---------Hurry Up to Dice Thrice-----------");
		while (a)
		{
			System.out.println("1.Play Game\n2.About Game\n3.Back");
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
							ui();
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
	public void ui()
	{
		System.out.println("Now Game Gets Begin");
		System.out.println("-------You VS System---------");
		input();
		user();
	}
	public void user()
	{
		while (a && round <= 3) 
		{ 
			System.out.println("\tTap to Roll Dice\n1.Tap\n2.End Game");
			System.out.print("Wanna Move to :");
			if (sc.hasNextInt()) 
			{
				int user = sc.nextInt();
				if (user == 1) 
				{
					Dice_Roll d1 = new Dice_Roll("Gamer");
					Dice_Roll d2 = new Dice_Roll("System");
					Thread t1 = new Thread(d1);
					Thread t2 = new Thread(d2);
					t1.start();
					t2.start();
					try 
					{
						t1.join();
						t2.join();
					} 
					catch (Exception e) 
					{
						e.printStackTrace();
					}
                round++; 
                if (round > 3) 
				{
                    result(); 
                    break;
                }
				} 
				else if (user == 2) 
				{
                try 
				{
                    diceRoll();
                } 
				catch (Exception ex)
				{
                    ex.printStackTrace();
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
	public void userran()
	{
		int val = diceroll();
		System.out.println("\nYour Dice:");
		dice(val);
		gamert.put("Round " + round, val);
		userTotal += val;
		if (round == 3) 
		{
			gamert.put("Total Score by You", userTotal);
		}		
	}
	public void sysran()
	{
		int val = diceroll();
		System.out.println("\nSystem Dice:");
		dice(val);
		syst.put("Round " + round, val);
		sysTotal += val;
		if (round == 3) 
		{
			syst.put("Total Score by System", sysTotal);
		}
	}
	public synchronized int diceroll()
	{
		int idx = r.nextInt(al.size());
        return al.get(idx);
	}
	public void rules()
	{
		System.out.println("\t\tAttention!\n1.This game is between You and the SYSTEM.\n2.Both will roll the dice once per turn.\n3. The one with the higher dice value wins that round.\n4. If both get the same value, the round is a DRAW.\n5. You can continue rolling until you choose to END the game.\n");
	}
	public void input()
	{
		al.clear();
		for (int i=1;i<=6 ;i++ )
		{
			al.add(i);
		}
	}
	public void dice(int value)
	{
		switch (value)
		{
		case 1:
			{
				one();
			}
		break;
		case 2:
			{
				two();
			}
		break;
		case 3:
			{
				three();
			}
		break;
		case 4:
			{
				four();
			}
		break;
		case 5:
			{
				five();
			}
		break;
		case 6:
			{
				six();
			}
		break;
		}
		System.out.println();
	}
	public void one()
	{
		int n=5;
		int mid = n / 2;
		for (int i = 0; i < n; i++) 
		{
            for (int j = 0; j < n; j++) 
			{
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) 
				{
                    System.out.print(". ");
                } 
				else 
				{
                    if (i == mid && j == mid) 
					{
                        System.out.print("* ");
                    } 
					else 
					{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
	}
	public void two()
	{
		int n=5;
		int mid = n / 2;
		for (int i = 0; i < n; i++) 
		{
            for (int j = 0; j < n; j++) 
			{
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
				{
                    System.out.print(". ");
                } 
				else if ((i == 1 && j == 1) || (i == n - 2 && j == n - 2))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
                }
			}
            System.out.println();	
		}
	}
	public void three()
	{
		int n=5;
		int mid = n / 2;
		for (int i = 0; i < n; i++) 
		{
            for (int j = 0; j < n; j++) 
			{
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
				{
                    System.out.print(". ");
                } 
				else if ((i == 1 && j == 1) || (i == mid && j == mid) || (i == n - 2 && j == n - 2))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
                }
			}
            System.out.println();	
		}
	}
	public void four()
	{
		int n=5;
		int mid = n / 2;
		for (int i = 0; i < n; i++) 
		{
            for (int j = 0; j < n; j++) 
			{
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
				{
                    System.out.print(". ");
                } 
				else if ((i == 1 && j == 1) || (i == 1 && j == n - 2) ||(i == n - 2 && j == 1) || (i == n - 2 && j == n - 2))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
                }
			}
            System.out.println();	
		}
	}
	public void five()
	{
		int n=5;
		int mid = n / 2;
		for (int i = 0; i < n; i++) 
		{
            for (int j = 0; j < n; j++) 
			{
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
				{
                    System.out.print(". ");
                } 
				else if ((i == 1 && j == 1) || (i == 1 && j == n - 2) ||(i == n - 2 && j == 1) || (i == n - 2 && j == n - 2) ||(i == mid && j == mid))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
                }
			}
            System.out.println();	
		}
	}
	public void six()
	{
		int n=5;
		int mid = n / 2;
		for (int i = 0; i < n; i++) 
		{
            for (int j = 0; j < n; j++) 
			{
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
				{
                    System.out.print(". ");
                } 
				else if ((i == 1 && j == 1) || (i == mid && j == 1) || (i == n - 2 && j == 1) ||(i == 1 && j == n - 2) || (i == mid && j == n - 2) || (i == n - 2 && j == n - 2))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
                }
			}
            System.out.println();	
		}
	}
	@Override 
	public void run() 
	{
        if (threadName.equals("Gamer")) 
		{
            userran();
        } 
		else if (threadName.equals("System")) 
		{
            sysran();
        }
    }
	public void result()
	{
		if (gamert.containsKey("Total Score by You") && syst.containsKey("Total Score by System")) 
		{
            System.out.println("---Your Score---");
            for (Map.Entry<String, Integer> e : gamert.entrySet()) 
			{
                System.out.println(e.getKey() + " = " + e.getValue());
            }
            System.out.println("---System Score---");
            for (Map.Entry<String, Integer> e : syst.entrySet()) 
			{
                System.out.println(e.getKey() + " = " + e.getValue());
            }
            int utotal = gamert.get("Total Score by You");
            int stotal = syst.get("Total Score by System");
            System.out.println("-------Final Result--------");
            if (utotal > stotal) 
			{
                System.out.println("You Win the Match with Difference :" + (utotal-stotal));
            } 
			else if (stotal > utotal)
			{
                System.out.println("System Win the Match with Difference :" + (stotal-utotal));
            } 
			else 
			{
                System.out.println("It's a Draw! both scored " + stotal);
				gamert.clear();
				syst.clear();
            }
        }
	}
}
