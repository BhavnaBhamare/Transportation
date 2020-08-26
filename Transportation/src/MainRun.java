
import java.sql.*;
import java.util.*;

public class MainRun 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		do{
		System.out.println("  *** Welcome ***");
		System.out.println(" * Travel to Pune *");
		System.out.println("===================");
		System.out.println("Choose from below:");
		System.out.println(" 1> Inside Pune \n 2> Outside Pune \n 3> No. of person \n 4> Amount \n 5> Information \n 6> Exit");
		
		
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		
		if(choice==0 || choice>6)
		{
			System.out.println("Please Choose a Valid Option.\n\n");
			System.out.println("-----------------------------------------");
		}
		
		if(choice==6)
		{
			System.out.println("\n+++++++++++++++++++++++++");
			System.out.println("THANK YOU, VISIT AGAIN!!!");
			System.out.println("+++++++++++++++++++++++++");
			break;
		}
		
		if(choice>=1 || choice<=5)
		{
			System.out.println(" Your Choice is : "+choice);
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("================================================================");
			switch(choice)
			{
				case 1: {
							System.out.println("Places inside Pune are below(distance is from center of city):\n");
							Connection con = DatabaseConnection.getConnection();
							if(con!=null)
							{
								Statement st = con.createStatement();
								ResultSet rs = st.executeQuery("select * from inside_pune");
								System.out.println("ID \t NAME \t\t\t\t DISTANCE");
								System.out.println("============================================================");
								
								while(rs.next())
								{
									//System.out.println(rs.getInt(1)+">  "+rs.getString(2)+"  "+rs.getInt(3)+"km");
									
									
									int id = rs.getInt(1);
									String name = rs.getString(2);
									int dist = rs.getInt(3);
									System.out.println(id+"\t"+name+"\t\t>> "+dist+" KM"); 
									System.out.println("------------------------------------------------------------");
								}
								st.close();
							}
							System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
							con.close();
							
							break;
						}
					
				case 2: {
							System.out.println("Places outside Pune are below:\n");
							Connection con = DatabaseConnection.getConnection();
							if(con!=null)
							{
								Statement st = con.createStatement();
								ResultSet rs = st.executeQuery("select * from outside_pune");
								System.out.println("ID \t NAME \t\t\t DISTANCE");
								System.out.println("============================================================");
								
								while(rs.next())
								{
									//System.out.println(rs.getInt(1)+">  "+rs.getString(2)+"  "+rs.getInt(3)+"km");
									
									
									int id = rs.getInt(1);
									String name = rs.getString(2);
									int dist = rs.getInt(3);
									System.out.println(id+"\t"+name+"\t\t>> "+dist+" KM"); 
									System.out.println("------------------------------------------------------------");
								}
								st.close();
							}
							System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
							con.close();
							break;
						}
					
				case 3: {
							System.out.println("Enter number of persons who want to travel : ");
							int n;
							n = sc.nextInt();
							if(n>0 && n<=4)
							{
								System.out.println("For upto "+n+" persons, we have Sedan, Station wagon, Hatchback, Mini SUVs, etc. vehicles available.");
								System.out.println("For the pricing information, goto Amount section on 4th option.");
							}else if(n>=5 && n<=10)
							{
								System.out.println("For upto "+n+" persons, we have Mini-van, SUVs and Traveler vehicles available.");
								System.out.println("For the pricing information, goto Amount section on 4th option.");
							}else
							{
								System.out.println("For more than 10 persons, we have Traveler with SUVs, Van, Hatchback, etc. vehicles available.");
								System.out.println("For the pricing information, goto Amount section on 4th option.");
							}
							
							System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
							break;
						}
					
				case 4: {
							System.out.println("Below are the rate chart according to number of persons traveling(excluding driver): ");
							System.out.println("\nNo. of Person \t Charges per day(incl. GST)");
							System.out.println("================================================");
							System.out.println("1 to 4        \t  RS. 1500 ");
							System.out.println("5 to 10       \t  RS. 4500 ");
							System.out.println("10 and above  \t  RS. 6500 ");
							System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
							break;
						}
					
				case 5: {
							System.out.println("\n Please enter your details to confirm booking : ");
							Connection con = DatabaseConnection.getConnection();
							if(con!=null)
							{
								System.out.print("\n Enter your name :");
								String name = sc.next();
								System.out.print("\n Enter your Aadhar No. :");
								long adhar = sc.nextLong();
								System.out.print("\n Enter your active mobile no. :");
								long mob = sc.nextLong();
								System.out.print("\nEnter no. of co-passengers travelling with you :");
								int copassno = sc.nextInt();
								System.out.print("\n Enter the city name you live in :");
								String city = sc.next();
								Statement st = con.createStatement();
								Random r = new Random();
								int id = r.nextInt(9999999);
								String sql = "insert into cust_detail values ('"+name+"', "+adhar+", "+mob+", "+copassno+", '"+city+"', "+id+"  )";
								st.execute(sql);
								st.close();
								System.out.println("\n Booking confirmed.");
								System.out.println(" Your booking ID is : "+id);
								System.out.println("");
															
							}
							con.close();
							System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
							break;
						}	
					
				default:	break;
			}
			choice= choice+10;
		}
		
		}while(choice==0 || choice>6);
		sc.close();
			
		
		
		
		
		
		
	}
}
