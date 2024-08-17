import java.util.Scanner;
public class NokiaPhone{

	public static void main(String args[]) {
	
	//Main Menu Content
	String mainMenu = """ 

	NOKIA

	Menu
 
	1-> Phonebook 
	2-> Messages 
	3-> Chat 
	4-> Call Register 
	5-> Tones 
	6-> Settings 
	7-> Call divert 
	8-> Games Sections
	9-> Calculator        
	10-> Reminders
	11-> Clock 
	12-> Profiles
	13-> SIM services 

	""";
	
	System.out.println(mainMenu);

//Menu options*******

	
	Scanner userInput = new Scanner(System.in);
	int numberInput = userInput.nextInt();
		switch (numberInput){


// Phonebook Sections*****

		case 1: {
	
		 String phoneBookMenu = """ 
		PHONE BOOK
		
		1-> Search
		2-> Service Nos.
		3-> Add Name 
		4-> Erase
		5-> Edit
		6-> Assign Tone
		7-> Send b'card
		8-> Options
		9-> Speed dials
		10-> Voice tags

		""";

		System.out.println(phoneBookMenu);


	//phone book options*



		int phoneBookSubSection = userInput.nextInt();	
			String options = """ 
					1-> Type of view
					2-> Memory status

					""";
		
	//phone book sub-setions*

			switch (phoneBookSubSection){


				case 1: System.out.print("Search...");
					break;	

				case 2: System.out.print("Service Nos...");
					break;
				
				case 3: System.out.print("Add name...");
					break;

				case 4: System.out.print("Erase...");
					break;
				
				case 5: System.out.print("Edit...");
					break;

				case 6: System.out.print("Assign tone...");
					break;

				case 7: System.out.print("Send b'card...");
					break;

				case 8: {

					System.out.print(options);					
					int case8Input = userInput.nextInt();

					switch(case8Input){

					case 1: System.out.print("Type of view");
					break;

					case 2: System.out.println("Memory status");
					break;
				
					default: System.out.println("Pls pick a valid number");
					break;
	
						

						}
					
					}

					break;

			
				case 9: System.out.println("Speed dials...");
					break;
				
				case 10: System.out.println("Voice tags...");
					break;


			default: System.out.println("Pls pick a valid number");
				break;
					
	}
			
		}


			         
					break;



// Messages Sections*****


		case 2: {
		 String messagesMenu = """

		MESSAGES
		
		1-> Write messages
		2-> Inbox
		3-> Outbox
		4-> Picture nessages
		5-> Templates
		6-> Smileys
		7-> Message settings
	
		""";

		
					
		System.out.println(messagesMenu);
		
		int messageSubSection = userInput.nextInt();

		


	//Message sub-setions*
			switch (messageSubSection){


				case 1: System.out.print("Write messages...");
					break;	

				case 2: System.out.print("Inbox...");
					break;
				
				case 3: System.out.print("Outbox...");
					break;

				case 4: System.out.print("Picture messages...");
					break;
				
				case 5: System.out.print("Templates...");
					break;

				case 6: System.out.print("Smiley...");
					break;



				case 7: System.out.println( """
					MESSAGE SETTINGS
		
					1-> Set 1
					2-> Common

					""");
			
					int messageSettingsSection = userInput.nextInt();
						switch (messageSettingsSection){


				case 1: {
						System.out.print("""

						1-> Message center number
						2-> Message sent as
						3-> Message validity

						""");

					int set1SubSection = userInput.nextInt();
		
				switch (set1SubSection){


				case 1: 
					System.out.print("Message center number...");
					break;	
					

				case 2: 
					System.out.print(" Message sent as...");
					break;
					
					
					
				case 3: 
					System.out.print("Message validity...");
					break;
					

				default: System.out.println("Pls pick a valid number...");
				break;
						
						}


					}



						break;	



				case 2: 
					System.out.println("""
						1-> Delivery reports
						2-> Reply via same centre
						3-> Character support
					""");

				int commonSubSection = userInput.nextInt();
				switch (commonSubSection){


				case 1: System.out.print("Delivery reports...");
					break;	
					

				case 2: System.out.print("Reply via same centre...");
					break;
					

				case 3: System.out.print("Character support...");
					break;
					

				default: System.out.println("Pls pick a valid number");
				break;

					 
					}
				
				

					break;
							




				case 8: System.out.println("Info service...");
					break;

				case 9: System.out.println("Voice mailbox number...");
					break;

				case 10: System.out.println("Service command editor...");
					break;


				default: System.out.println("Pls pick a valid number");
				break;

				}

		}
}
 					break;








//Chat Sections*****
			

		case 3: System.out.println("CHATS...");
		break;
		




//Call Register Sections*****
		
		case 4: {
	
		 String callRegisterMenu = """ 
		CALL REGISTER
		
		1-> Missed calls
		2-> Received calls
		3-> Dialed Numbers
		4-> Erase recent call lists
		5-> Show call duration
		6-> Show call cost
		7-> Clear counters
		8-> Prepaid credit

		""";

		System.out.println(callRegisterMenu);
	int callRegisterSections = userInput.nextInt();


//call sub-setions*

			switch (callRegisterSections){


				case 1: System.out.print("Missed calls...");
					break;	
					

				case 2: System.out.print("Received calls...");
					break;
					

				case 3: System.out.print("Dialed Numbers...");
					break;
					

				case 4: System.out.print("Erase recent call lists...");
					break;

				
				case 5: 
					System.out.println("""
						1-> Last call duration
						2-> All calls' duration
						3-> Received calls' duration
						4-> Dialled calls' duration
						5-> Clear Timers

						
					""");

			int callRegisterSubSection = userInput.nextInt();
				switch (callRegisterSubSection){


				case 1: System.out.print("Last call duration...");
					break;	
					

				case 2: System.out.print("All calls' duration...");
					break;
					

				case 3: System.out.print("Received calls' duration...");
					break;


				case 4: System.out.print("Dialled calls' duration...");
					break;

					
				case 5: System.out.print("Clear Timers...");
					break;


				default: System.out.println("Pls pick a valid number");
				break;

					 
					}
				
				

					break;
							



				case 6: 
					System.out.println("""
						1-> Last call cost
						2-> All calls' cost
						3-> Clear counters
						
						
					""");



			int callCostsSubSection = userInput.nextInt();
				switch (callCostsSubSection){


				case 1: System.out.print("Last call cost...");
					break;	
					

				case 2: System.out.print("All calls' cost...");
					break;
					

				case 3: System.out.print("Clear counters...");
					break;


				default: System.out.println("Pls pick a valid number");
				break;

					 
					}
				
				

					    break;
							


				case 7: 
					System.out.println("""
						1-> Call cost limit
						2-> Call cost limit				
					""");



			int callCostsSettingsSubSection = userInput.nextInt();
				switch (callCostsSettingsSubSection){


				case 1: System.out.print("Call cost limit...");
					break;	
					

				case 2: System.out.print("Call cost limit...");
					break;
					

				default: System.out.println("Pls pick a valid number");
				break;

					 
					}
				
				

					    break;



				case 8: System.out.print("Prepaid credit...");
					break;


				default: System.out.println("Pls pick a valid number");
				break;

					 
					}


						
		}

					break;



//Tones Sections*****


		case 5: {
	
		 String tonesMenu = """ 
		TONES
		
		1-> Ringing tone
		2-> Ringing volume
		3-> Incoming call alert 
		4-> Composer
		5-> Message alert tone
		6-> Keypad tones
		7-> Warning and game tones
		8-> Vibrating alert
		9-> Screen saver
		

		""";

		System.out.println(tonesMenu);

		int tonesSection = userInput.nextInt();

//Tones sub-setions*
		
			switch (tonesSection){


				case 1: System.out.print("Ringing tone...");
					break;	
					

				case 2: System.out.print("Ringing volume...");
					break;
			
				case 3: System.out.print("Incoming call alert...");
					break;

				case 4: System.out.print("Composer...");
					break;

				case 5: System.out.print("Message alert tone...");
					break;

				
				case 6: System.out.print("Keypad tones...");
					break;


				case 7: System.out.print("Warning and game tones...");
					break;


				case 8: System.out.print("Vibrating alert...");
					break;


				case 9: System.out.print("Screen saver...");
					break;

					

				default: System.out.println("Pls pick a valid number");
				break;

					 
					}
				
				

					    

		}

						break;


//Settings Sections*****

		case 6: {
	
		 String settingsMenu = """ 
		SETTINGS
		
		1-> Call settings
		2-> Phone settings
		3-> Security settings 
		4-> Restore factory settings		

		""";

		System.out.println(settingsMenu);
	int settingMenu = userInput.nextInt();


//Settings sub-setions*

		switch (settingMenu){

			case 1: 
					System.out.println("""
						CALL SETTINGS
						
						1-> Automatic redial
						2-> Speed dialing
						3-> Call waiting options
						4-> Own number sending
						5-> Phone line in use
						6-> Automatic answer
						
					""");

			int callSettingsSubSection = userInput.nextInt();
				switch (callSettingsSubSection){


				case 1: System.out.print("Automatic redial...");
					break;	
					

				case 2: System.out.print("Speed dialing...");
					break;
					

				case 3: System.out.print("Call waiting options...");
					break;


				case 4: System.out.print("Own number sending...");
					break;

					
				case 5: System.out.print("Phone line in use...");
					break;

				case 6: System.out.print("Automatic answer...");
					break;

				default: System.out.println("Pls pick a valid number");
				break;

					 
					}
				
				

					break;
						




				case 2: 
					System.out.println("""
						PHONE SETTINGS
						
						1-> Language
						2-> Cell info display
						3-> Welcome note
						4-> Network selection
						5-> Lights
						6-> Confirm SIM service actions
						
					""");

				int phoneSettingsSubSection = userInput.nextInt();
					switch (phoneSettingsSubSection){


					case 1: System.out.print("Language...");
						break;	
					

					case 2: System.out.print("Cell info display...");
						break;
					
	
					case 3: System.out.print("Welcome note...");
						break;


					case 4: System.out.print("Network selection...");
						break;

					
					case 5: System.out.print("Lights...");
						break;

					case 6: System.out.print("Confirm SIM service actions...");
						break;

					default: System.out.print("Pls pick a valid number");
						break;

					 
					}
				
				

						break;
	


					
					case 3: 
					System.out.println("""
						SECURITY SETTINGS
						
						1-> Pin code request
						2-> Call barring service
						3-> Fixed dialing service
						4-> Closed user groups
						5-> Phone security
						6-> Change access codes
						
					""");

				int securitySettingsSubSection = userInput.nextInt();
					switch (securitySettingsSubSection){


					case 1: System.out.print("Pin code request...");
						break;	
					

					case 2: System.out.print("Call barring service...");
						break;
					
	
					case 3: System.out.print("Fixed dialing service...");
						break;


					case 4: System.out.print("Closed user groups...");
						break;

					
					case 5: System.out.print("Phone security...");
						break;

					case 6: System.out.print("Change access codes...");
						break;

					default: System.out.print("Pls pick a valid number");
						break;

					 
					}
				
				

						break;
	


					case 4: System.out.print("Restore factory settings...");

					break;




		}	


		}

						break;


//Call divert Sections*****

		case 7: {
	
		 String callDivertMenu = """ 
		SETTINGS
		
		1-> Call divert...	

		""";

		System.out.println(callDivertMenu);
		}
		break;



//Games Sections*****
		case 8:{
			System.out.println("""
			GAMES
			
			1-> Snake II
			2-> Space Impact
			3-> Bantumi
			4-> Pairs II


			""");
				int gamesSubSection = userInput.nextInt();
//Games sub-setions*
					switch (gamesSubSection){


					case 1: System.out.print("Best Game Ever !!");
						break;	
					

					case 2: System.out.print("That game was really fun");
						break;
					
	
					case 3: System.out.print("Pls remind me what this game was all about");
						break;


					case 4: System.out.print("Sweet memories");
						break;

					
					default: System.out.print("Pls pick a valid number");
						break;

					 
					}
				

			}

							break;


	

//Calculator Sections********************************************************

		case 9:{
			System.out.println("""
						CALCULATOR

						Pick what you want to calculate
						1-> Basic Arithmetics (+ - * /)
						2-> Statistics (sd)
						3-> Trigonometry (cos,sin)
						4-> Geometry (area)
						5-> Finance (CI,SI)
						
 
						""");

		int calculatorInput = userInput.nextInt();
			switch (calculatorInput){

		
			case 1: System.out.println("""
						CALCULATOR

						Pick what you want to calculate
						1-> Addition
						2-> Subtraction
						3-> Multiplication
						4-> Division
						5-> Complex
						
 
						""");
				int basicArithmetics = userInput.nextInt();

				switch(basicArithmetics){

				case 1:{ 
					int sum = 0;
					int calcNumbers;
					
					for(;;){

					System.out.print("Input your numbers or input -0 to calculate ");								calcNumbers = userInput.nextInt();	

					if (calcNumbers == -0){ break; }
						
					sum+=calcNumbers;

						
					     }	
				
						System.out.print("Total = " + sum);			 

					}
				}
	
				
							break;






				case 2: { System.out.print("input your first number");
						int subtraction = 0 ;
						int subt;

					for(;;){
						 System.out.print ("input another number or press -0 to calculate")
						int subtractionInput = userInput.nextInt();
						




						}






				
				}







			



		}








			}
    				break;








//Reminders Sections*****

		case 10:{
			System.out.println("REMINDERS...");
			}

				break;
//Clock Sections*****

		case 11:{
		String clockMenu =""" 
		CLOCK

		1-> Alarm clock
		2-> Clock settings
		3-> Date setting 
		4-> Stopwatch
		5-> Countdown timer
		6-> Auto update of date and time

		""";
			System.out.print(clockMenu);

				int clockSubSections = userInput.nextInt();
//Clock sub-setions*
					switch (clockSubSections){

					case 1: System.out.print("Alarm clock...");
					break;

					case 2: System.out.print("Clock settings...");
					break;

					case 3: System.out.print("Date setting...");
					break;

					case 4: System.out.print("Stopwatch...");
					break;

					case 5: System.out.print("Countdown timer...");
					break;

					case 6: System.out.print("Auto update of date and time...");
					break;

					default: System.out.print("Pls pick a valid number");
					break;





			
	
				}
			}

						break;


//Profiles*****
		case 12:
			System.out.print("PROFILES.....");
			break;
		
		


//SIM services Sections*****
		case 13:
			System.out.print("SIM SERVICES...");
			break;
			
	
//General default*******
		default: System.out.println("Pls pick a valid number ");
		break;
		




		






		}
	
	
	  
	}
}



