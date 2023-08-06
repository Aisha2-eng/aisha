package sakanat.test;

import java.util.Scanner;

import acceptTest.Login;

public class MainApp {
	
    private static Login userInfo;

    public static void main(String[] args) {
    	System.out.println("-------------------------------------------Welcome to Sakan System-------------------------------------------" );
    	
        Scanner scanner = new Scanner(System.in);
        userInfo = new Login();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Read user's name, email, and password
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Check if the user exists and get user info
        if (userInfo.isUserExists(email, password)) {
            Login.UserInfo user = userInfo.getUserInfoByEmail(email);
           // System.out.println("Welcome to " + user.getName() + ": " + user.getEmail());
            // Call corresponding methods based on the user's role (Admin/Owner/Tenant)
            if (user.getName().equals("Aisha")) {
                admin();
            } else if (user.getName().equals("Arees")) {
                owner();
            } else {
                tenant();
            }
        } else {
            System.out.println("Invalid email or password. Please try again.");
        }
    }

    public static void admin() {
        // Your admin code here
    	System.out.println("-----------------------------Welcome to Admain Page-----------------------------\n" );
    	 int flge1=1;
    	
    	 Scanner input = new Scanner(System.in);
    	 
    	 while(flge1==1) {
    		 System.out.println(" *****Menu***** \n" );
    		 System.out.println(" 1.Housing Advertisement \n" );
    		 System.out.println(" 2.View Reservations \n" );
    		 System.out.println(" 3.Adds a Housing unit \n" );
    		 System.out.println(" 4.LOGOUT \n" );

    		 
    		int number=Integer.parseInt(input.nextLine());
 			switch(number) {
 			
 			case 1:{
 				int flge2=1;
 				Scanner input1 = new Scanner(System.in);
 				
 				 while(flge1==1) {
 		    		 System.out.println(" 1.Accept \n" );
 		    		 System.out.println(" 2.Rejects\n" );
 		    		 System.out.println(" 3.Close \n" );
 		    		 
 		    		int number1=Integer.parseInt(input.nextLine());
 		 			switch(number) {
 		 			case 1:{System.out.println(" case11 !! \n" );
 		 				break;}
 		 			
 		 			case 2:{System.out.println(" case22 !! \n" );break;}
 		 			
 		 			case 3:{System.out.println(" closing !! \n" );
 		 				flge2=0;
 		 				break;}
 		 			default:{System.out.println(" unvalid!! \n" );break;}
 		 			
 		 			}//end switch 
 		    		 
 				 }//end while
 				 
 				 break;
 				
 			}//end case1 (Housing Advertisement) admain
 			
 			case 2:{System.out.println(" case2 !! \n" );break;}//end case2 (View Reservations)admain
 			
 			case 3:{System.out.println(" case3 !! \n" );break;}//end case3 (Adds a Housing unit) admain
 			
 			case 4:{System.out.println(" logout!! \n" );flge1=0;
 			        
 			
 			System.out.print("Enter your name: ");
 	        //Scanner input2 = new Scanner(System.in);
			Scanner scanner=new Scanner(System.in);;
			String name = scanner.nextLine();

 	        // Read user's name, email, and password
 	        System.out.print("Enter your email: ");
 	        String email = scanner.nextLine();

 	        System.out.print("Enter your password: ");
 	        String password = scanner.nextLine();

 	        // Check if the user exists and get user info
 	        if (userInfo.isUserExists(email, password)) {
 	            Login.UserInfo user = userInfo.getUserInfoByEmail(email);
 	           // System.out.println("Welcome to " + user.getName() + ": " + user.getEmail());
 	            // Call corresponding methods based on the user's role (Admin/Owner/Tenant)
 	            if (user.getName().equals("Arees")) {
 	                owner();
 	            } else if (user.getName().equals("Tala")) {
 	                tenant();
 	            }
 	        } else {
 	            System.out.println("Invalid email or password. Please try again.");
 	        }
 			    
 				    break;}//end case4 (logout) admain
 			
 			default:{System.out.println(" unvalid!! \n" );break;}
 			
 			}
    	 }
    	 
    	 
    	 
    	
    }
    
    
    

    public static void owner() {
        // Your owner code here
    	System.out.println("-----------------------------Welcome to Owner Page-----------------------------" );
    	int flge1=1;
   	    Scanner input = new Scanner(System.in);
   	    
   	 while(flge1==1) {
		 System.out.println(" *****Menu***** \n" );
		 System.out.println(" 1.Furniture Advertised\n" );
		 System.out.println(" 2.Housing Details \n" );
		 System.out.println(" 3.LOGOUT \n" );

		 
		int number=Integer.parseInt(input.nextLine());
			switch(number) {
			
			case 1:{ System.out.println(" case1 !! \n" );
				break;}
			
			case 2:{System.out.println(" case2 !! \n" ); 
				break;}
			
			case 3:{System.out.println(" logout!! \n" );flge1=0;
			
			

	        Scanner scanner = new Scanner(System.in);
	        userInfo = new Login();
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();

	        // Read user's name, email, and password
	        System.out.print("Enter your email: ");
	        String email = scanner.nextLine();

	        System.out.print("Enter your password: ");
	        String password = scanner.nextLine();

	        // Check if the user exists and get user info
	        if (userInfo.isUserExists(email, password)) {
	            Login.UserInfo user = userInfo.getUserInfoByEmail(email);
	           // System.out.println("Welcome to " + user.getName() + ": " + user.getEmail());
	            // Call corresponding methods based on the user's role (Admin/Owner/Tenant)
	            if (user.getName().equals("Aisha")) {
	                admin();
	            
	            } else if (user.getName().equals("Tala")) {
	                tenant();
	            }
	        } else {
	            System.out.println("Invalid email or password. Please try again.");
	        }
			
			
				 break;}//end case3 (logout) owner
			
			default:{System.out.println(" unvalid!! \n" );break;}
			
			}
	 }
   	    
    }
    
    
    

    public static void tenant() {
        // Your tenant code here
    	System.out.println("-----------------------------Welcome to Tenant Page-----------------------------" );
    	int flge1=1;
   	     Scanner input = new Scanner(System.in);
   	     
   	  while(flge1==1) {
 		 System.out.println(" *****Menu***** \n" );
 		 System.out.println(" 1.Booking Accommodation\n" );
 		 System.out.println(" 2.Housing Details \n" );
 		 System.out.println(" 3.Control Panel \n" );
		 System.out.println(" 4.LOGOUT \n" );

 		 
 		int number=Integer.parseInt(input.nextLine());
			switch(number) {
			
            case 1:{ System.out.println(" case1!! \n" );break;}
			
			case 2:{System.out.println(" case2!! \n" ); break;}
			
			case 3:{System.out.println(" case3!! \n" ); break;}
			
			case 4:{System.out.println(" logout!! \n" );
				flge1=0; 
				
				

		        Scanner scanner = new Scanner(System.in);
		        userInfo = new Login();
		        System.out.print("Enter your name: ");
		        String name = scanner.nextLine();

		        // Read user's name, email, and password
		        System.out.print("Enter your email: ");
		        String email = scanner.nextLine();

		        System.out.print("Enter your password: ");
		        String password = scanner.nextLine();

		        // Check if the user exists and get user info
		        if (userInfo.isUserExists(email, password)) {
		            Login.UserInfo user = userInfo.getUserInfoByEmail(email);
		           // System.out.println("Welcome to " + user.getName() + ": " + user.getEmail());
		            // Call corresponding methods based on the user's role (Admin/Owner/Tenant)
		            if (user.getName().equals("Aisha")) {
		                admin();
		            
		            } else if (user.getName().equals("Arees")) {
		            	owner();
		            }
		        } else {
		            System.out.println("Invalid email or password. Please try again.");
		        }
				
				
				
				
				break;}//end case4 (logout) tenant
			
			default:{System.out.println(" unvalid!! \n" );break;}
			
			}
 	 }
   	     
    }



}
