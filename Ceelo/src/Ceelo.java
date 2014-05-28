import java.util.*;


public class Ceelo
{

	public static void main(String[] args)
	{
		
		
	
		int startMoney = 500;
		int wager;
		int roll;
		boolean bool = false;
		
		while(bool == false)
		{
			int d1 = (int) (Math.random() * 6 + 1); //player dice
			int d2 = (int) (Math.random() * 6 + 1);
			int d3 = (int) (Math.random() * 6 + 1);
			
			int e1 = (int) (Math.random() * 6 + 1);  //opponent dice
			int e2 = (int) (Math.random() * 6 + 1);
			int e3 = (int) (Math.random() * 6 + 1);
			
		System.out.println("startMoney " + startMoney);
		System.out.println("please enter your wage amount: ");
		Scanner wagein = new Scanner(System.in);
		wager = wagein.nextInt();
		
		
		System.out.println("Your current start money is: " + startMoney + "\n");
		System.out.println("press 0 to roll dice: ");
		Scanner rollin = new Scanner(System.in);
		roll = rollin.nextInt();
		
		
		
			if(roll == 0)
			{
				System.out.println("Player DiceRoll: " + d1 + " " + d2 + " " + d3);
				if ((d1 == 1 || d1 ==  2  || d1 == 3) &&    //auto loosing combo 123
						(d2 == 1 || d2 ==  2  || d2 == 3) && 
						(d3 == 1 || d3 ==  2  || d3 == 3) &&
						(d1 != d2 && d1 != d3 && d2 != d3))
				{
					System.out.println("you loose");
					startMoney = startMoney - wager;
				 	bool = false;
				}
				else if((d1 == 4 || d1 ==  5  || d1 == 6) &&  //auto winning combo 456
						(d2 == 4 || d2 ==  5  || d2 == 6)  && 
						(d3 == 4 || d3 ==  5  || d3 == 6) &&
						(d1 != d2 && d1 != d3 && d2 != d3))
				{
					System.out.println("you win");
					startMoney = startMoney + wager;
				 	bool = false;
				}
				else if(d1 == d2 && d2 == d3 && d3 == d1)
				{
					System.out.println("Trips: " + d1 + " " + d2 + " " + d3);
					
				}
				
				System.out.println("Computer DiceRoll: " + e1 + " " + e2 + " " + e3);
				
				//enemy roll and result
				if (e1 == 1 || e1 ==  2  || e1 == 3 &&    //auto winning combo computer 123
						e2 == 1 || e2 ==  2  || e2 == 3  && 
						e3 == 1 || e3 ==  2  || e3 == 3 &&
						e1 != e2 && e1 != e3 && e2 != e3)
				{
					System.out.println("you win");
					startMoney = startMoney + wager;
				 	bool = false;
				}
				else if(e1 == 4 || e1 ==  5  || e1 == 6 &&  //auto loosing combo computer 456
						e2 == 4 || e2 ==  5  || e2 == 6  && 
						e3 == 4 || e3 ==  5  || e3 == 6 &&
						e1 != e2 && e1 != e3 && e2 != e3)
				{
					System.out.println("you loose");
					startMoney = startMoney - wager;
				 	bool = false;
				}
				
				if((d1 == d2 && d2 == d3 && d1 == d3) && (e1 == e2 && e2 == e3 && e3 == e1)) //triple match
				{
					if(d1 > e1)
					{
						System.out.println("Player DiceRoll: " + d1 + " " + d2 + " " + d3 );
						System.out.println("Computer DiceRoll: " + e1 + " " + e2 + " " + e3 );
						System.out.println("you win wage: " + wager);
						System.out.println("Money in hand: " + startMoney + "plus wager = ");
						startMoney = startMoney + wager;
						System.out.println("total: " + startMoney);
						bool = false;
					}
					else if(d1 == e1)
					{
						System.out.println("draw");
						bool = false;
					}
					else
					{
						System.out.println("Player DiceRoll: " + d1 + " " + d2 + " " + d3 );
						System.out.println("Computer DiceRoll: " + e1 + " " + e2 + " " + e3 );
						System.out.println("you loose wage: " + wager);
						System.out.println("Money in hand: " + startMoney + "minus wager = ");
						startMoney = startMoney - wager;
						System.out.println("total: " + startMoney);
						bool = false;
					}
				}
				
				if((d1 == d2 || d2 == d3 || d1 == d3) && (e1 == e2 && e2 == e3 && e1 == e3)) //player double loss to computer triple 
				{
					System.out.println("Player DiceRoll: " + d1 + " " + d2 + " " + d3 );
					System.out.println("Computer DiceRoll: " + e1 + " " + e2 + " " + e3 );
					System.out.println("you loose wage: " + wager);
					System.out.println("Money in hand: " + startMoney + "minus wager = ");
					startMoney = startMoney - wager;
					System.out.println("total: " + startMoney);
					bool = false;
					
				}
				if((e1 == e2 || e2 == e3 || e1 == e3) && (d1 == d2 && d2 == d3 && d3 == d1)) //computer double loss to player triple 
				{
					System.out.println("Player DiceRoll: " + d1 + " " + d2 + " " + d3 );
					System.out.println("Computer DiceRoll: " + e1 + " " + e2 + " " + e3 );
					System.out.println("you loose wage: " + wager);
					System.out.println("Money in hand: " + startMoney + "minus wager = ");
					startMoney = startMoney + wager;
					System.out.println("total: " + startMoney);
					bool = false;
					
				}
				
				if(d1 == d2 || d2 == d3 || d1 == d3)
				{
					System.out.println("DoubbleMatch, Count the non repeating number");
					System.out.println("Player DiceRoll: " + d1 + " " + d2 + " " + d3 );
					
					
				}
				
				
			}
			else
			{
				System.out.println("invalid input");
				bool = false;
				
			}
			
		}
	}
	
	


}


