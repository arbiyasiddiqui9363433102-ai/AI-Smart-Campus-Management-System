
 import java.util.*;

class Student {
    int id;
    String name;
    double marks;
    int attendance;

    Student(int id, String name, double marks, int attendance) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    String getGrade() {
         if (marks >= 90)
              return "A+";
         else if (marks >= 80)
              return "A";
         else if (marks >= 70)
              return "B";
         else if (marks >= 60)
              return "C";
         else
              return "D";
}

    String predictPerformance() {
        if (marks >= 80 && attendance >= 90)
            return "Excellent";
        else if (marks >= 60 && attendance >= 75)
            return "Good";
        else if (marks >= 40 && attendance >= 60)
            return "Average";
        else
            return "Needs Improvement";
    }

    void display() {
        System.out.println("\nStudent ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Marks      : " + marks);
        System.out.println("Attendance : " + attendance + "%");
        System.out.println("AI Prediction : " + predictPerformance());
    }
}

class Bus {
    int busNumber;
    String route;
    String driverName;
    String driverContact;
    int capacity;
    int availableSeats;
    double busFee;

    Bus(int busNumber, String route, String driverName,
        String driverContact, int capacity, double busFee) {

        this.busNumber = busNumber;
        this.route = route;
        this.driverName = driverName;
        this.driverContact = driverContact;
        this.capacity = capacity;
        this.availableSeats = capacity;
        this.busFee = busFee;
    }
}

class SportsPlayer {

    int playerId;
    String playerName;
    String game;

    SportsPlayer(int playerId, String playerName, String game) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.game = game;
    }
}

//================================================main class=======================================

public class AISmartCampusManagement
 {

   static int nextRoom = 101;
    static HashMap<Integer, String> hostelRooms = new HashMap<>();

    static HashMap<Integer, String> libraryBooks = new HashMap<>();
     static HashSet<Integer> issuedBooks = new HashSet<>();

//============================Main Method=============================================
    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        HashMap<Integer, Bus> buses = new HashMap<>();
        HashMap<Integer, SportsPlayer> players = new HashMap<>();

        while (true) {

            System.out.println("\n===== AI SMART CAMPUS MANAGEMENT =====");
            System.out.println("1. Student Management");
            System.out.println("2. Sort Students by Marks");
            System.out.println("3. Show Topper");
            System.out.println("4. Calculate Average Marks");
            System.out.println("5. Attendance Report");
            System.out.println("6. AI Performance Prediction");
            System.out.println("7. Scholarship Eligibility");
            System.out.println("8. Count Total Students");
            System.out.println("9. Student Grade Report");
            System.out.println("10. Cafeteria Management");
            System.out.println("11. Sports Management");
            System.out.println("12. Hostel management");
            System.out.println("13. Bus Transport");
            System.out.println("14. Library Management");
            System.out.println("15. Fee Management");
            System.out.println("16. Complaint System");
            System.out.println("17. Feedback System");
            System.out.println("18. Security Management");
            System.out.println("19. Campus Notification");
            System.out.println("20. AI Chat Assistant");
            System.out.println("21. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                  case 1:

                      while (true) {

                          System.out.println("\n===== STUDENT MANAGEMENT =====");
                          System.out.println("1. Add Student");
                          System.out.println("2. View Students");
                          System.out.println("3. Search Student");
                          System.out.println("4. Update Student");
                          System.out.println("5. Delete Student");
                          System.out.println("6. Exit");

                          System.out.print("Enter Choice: ");
                          int studentChoice = sc.nextInt();

                          switch (studentChoice) {

                              case 1:

                                    System.out.print("Enter Student ID: ");
                                    int id = sc.nextInt();
                                    sc.nextLine();

                                    System.out.print("Enter Student Name: ");
                                    String name = sc.nextLine();

                                    System.out.print("Enter Marks: ");
                                    double marks = sc.nextDouble();

                                    System.out.print("Enter Attendance: ");
                                    int attendance = sc.nextInt();

                                    students.add(new Student(id, name, marks, attendance));

                                    System.out.println("Student Added Successfully.");
                                    break;

                            case 2:

                                if (students.isEmpty()) {
                                         System.out.println("No Students Found.");
                                          } else {

                                             for (Student s : students)
                                             s.display();
                                         }

                                      break;

                            case 3:

                                   System.out.print("Enter Student ID: ");
                                    int searchId = sc.nextInt();

                                   boolean found = false;

                                   for (Student s : students) {

                                    if (s.id == searchId) {

                                    s.display();
                                    found = true;
                                      break;
                                     }
                                   }

                                    if (!found)
                                        System.out.println("Student Not Found.");

                                break;

                         case 4:

                                System.out.print("Enter Student ID: ");
                                int updateId = sc.nextInt();

                                boolean updated = false;

                                for (Student s : students) {

                                if (s.id == updateId) {

                                sc.nextLine();

                                System.out.print("Enter New Name: ");
                                s.name = sc.nextLine();

                                System.out.print("Enter New Marks: ");
                                s.marks = sc.nextDouble();

                                System.out.print("Enter New Attendance: ");
                                s.attendance = sc.nextInt();

                                updated = true;

                                System.out.println("Student Updated Successfully.");
                                break;
                              }
                            }

                             if (!updated)
                                  System.out.println("Student Not Found.");

                                   break;

                    case 5:

                            System.out.print("Enter Student ID: ");
                            int deleteId = sc.nextInt();

                            boolean removed = students.removeIf(s -> s.id == deleteId);

                            if (removed)
                            System.out.println("Student Deleted Successfully.");
                            else
                            System.out.println("Student Not Found.");

                            break;

                  case 6:
                            System.out.println("Exiting Student Management...");
                            break;

                           default:
                           System.out.println("Invalid Choice.");
                            }

                           if (studentChoice == 6)
                           break;
                           }

                          break;

             case 2:
                  students.sort((a, b) -> Double.compare(b.marks, a.marks));

                  for (Student s : students)
                  s.display();

                 break;

            case 3:
                  if (!students.isEmpty()) {
                  Student topper = students.get(0);

                  for (Student s : students)
                  if (s.marks > topper.marks)
                    topper = s;

                    System.out.println("Topper Details:");
                  topper.display();
                  }
                break;

           case 4:
                 double total = 0;

                 for (Student s : students)
                 total += s.marks;

                 if (!students.isEmpty())
                 System.out.println("Average Marks = " + total / students.size());

                break;

           case 5:
                for (Student s : students) {
                if (s.attendance >= 75)
                    System.out.println(s.name + " : Present");
                else
                    System.out.println(s.name + " : Short Attendance");
                  }
               break;

          case 6:
                for (Student s : students)
                 System.out.println(s.name + " --> " + s.predictPerformance());

                break;
          case 7:
                for (Student s : students) {
                 if (s.marks >= 85 && s.attendance >= 90)
                    System.out.println(s.name + " : Eligible");
                 else
                     System.out.println(s.name + " : Not Eligible");
                  }

              break;

          case 8:
                   System.out.println("Total Students = " + students.size());
                 break;

          case 9:
                 for (Student s : students)
                   System.out.println(s.name + " : Grade " + s.getGrade());

              break;

          case 10:

                 while (true) {

                 System.out.println("\n===== CAFETERIA MANAGEMENT =====");
                 System.out.println("1. View Menu");
                 System.out.println("2. Order Food");
                 System.out.println("3. Exit");
                 System.out.print("Enter Choice: ");

                 int cafeChoice = sc.nextInt();

                 switch (cafeChoice) {

                 case 1:

                        System.out.println("\n===== CAFETERIA MENU =====");
                        System.out.println("1. Sandwich   - Rs. 50");
                        System.out.println("2. Burger     - Rs. 80");
                        System.out.println("3. Pizza      - Rs. 120");
                        System.out.println("4. Coffee     - Rs. 40");
                        System.out.println("5. Tea        - Rs. 20");
                        System.out.println("6. Cold Drink - Rs. 35");

                        break;

                 case 2:

                        System.out.println("\n===== ORDER FOOD =====");
                        System.out.println("1. Sandwich - Rs.50");
                        System.out.println("2. Burger - Rs.80");
                        System.out.println("3. Pizza - Rs.120");
                        System.out.println("4. Coffee - Rs.40");
                        System.out.println("5. Tea - Rs.20");
                        System.out.println("6. Cold Drink - Rs.35");

                        System.out.print("Enter Food Choice: ");
                        int food = sc.nextInt();

                        System.out.print("Enter Quantity: ");
                        int qty = sc.nextInt();

                        int price = 0;
                        String item = "";

                        switch (food) {

                        case 1:
                             item = "Sandwich";
                             price = 50;
                             break;

                       case 2:
                            item = "Burger";
                            price = 80;
                            break;
 
                       case 3:
                            item = "Pizza";
                            price = 120;
                            break;

                       case 4:
                            item = "Coffee";
                            price = 40;
                            break;

                       case 5:
                            item = "Tea";
                            price = 20;
                            break;

                       case 6:
                            item = "Cold Drink";
                            price = 35;
                            break;

                           default:
                                System.out.println("Invalid Food Choice");
                             continue;
                      }

                        int Total = price * qty;

                          System.out.println("\n===== BILL =====");
                          System.out.println("Item      : " + item);
                          System.out.println("Price     : Rs." + price);
                          System.out.println("Quantity  : " + qty);
                          System.out.println("------------------------");
                          System.out.println("Total Bill: Rs." + Total);

                          break;

                   case 3:
                         System.out.println("Exiting Cafeteria Management...");
                           break;

                        default:
                         System.out.println("Invalid Choice.");
                       }

                      if (cafeChoice == 3)
                      break;
                    }

              break;

          case 11:

                 while (true) 
                  {

                     System.out.println("\n===== SPORTS MANAGEMENT =====");
                     System.out.println("1. Register Player");
                     System.out.println("2. View All Players");
                     System.out.println("3. Search Player by ID");
                     System.out.println("4. Remove Player");
                     System.out.println("5. Exit");
                     System.out.print("Enter Choice: ");

                    int sportsChoice = sc.nextInt();
                    sc.nextLine();

                    switch (sportsChoice)
                    {

                      case 1:

                            System.out.print("Enter Player ID: ");
                            int identity = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter Player Name: ");
                            String NAME = sc.nextLine();

                            System.out.print("Enter Game: ");
                            String game = sc.nextLine();

                            players.put(identity, new SportsPlayer(identity, NAME, game));

                            System.out.println("Player Registered Successfully.");
                           break;

                    case 2:

                           if (players.isEmpty()) 
                           {
                              System.out.println("No Players Registered.");
                           } 
                           else 
                               {

                                  System.out.println("\n===== PLAYER LIST =====");

                                  for (SportsPlayer p : players.values()) 
                                  {

                                     System.out.println("-----------------------");
                                     System.out.println("Player ID   : " + p.playerId);
                                     System.out.println("Player Name : " + p.playerName);
                                     System.out.println("Game        : " + p.game);
                                  }
                               }

                              break;

                   case 3:

                          System.out.print("Enter Player ID: ");
                          int SearchId = sc.nextInt();

                            if (players.containsKey(SearchId)) 
                            {

                               SportsPlayer p = players.get(SearchId);

                               System.out.println("\nPlayer Found");
                               System.out.println("Player ID   : " + p.playerId);
                               System.out.println("Player Name : " + p.playerName);
                               System.out.println("Game        : " + p.game);

                             }
                             else
                                 {

                                   System.out.println("Player Not Found.");
                                 }

                                  break;
 
                    case 4:

                            System.out.print("Enter Player ID to Remove: ");
                            int removeId = sc.nextInt();

                            if (players.remove(removeId) != null)
                            {

                               System.out.println("Player Removed Successfully.");

                            } 
                            else 
                                {

                                   System.out.println("Player Not Found.");
                                }

                                break;

                     case 5:

                             System.out.println("Exiting Sports Management...");
                            break;

                             default:

                              System.out.println("Invalid Choice.");
                           }

                           if (sportsChoice == 5)
                             break;
                        }

                         break;

 

         case 12:

              while (true) 
                {

                 System.out.println("\n===== HOSTEL MANAGEMENT =====");
                 System.out.println("1. Room Allocation");
                 System.out.println("2. Check Available Rooms");
                 System.out.println("3. View All Allocated Rooms");
                 System.out.println("4. Back");
                 System.out.print("Enter Choice: ");

                 int hostelChoice = sc.nextInt();
                 sc.nextLine();

                 switch (hostelChoice)
                   {

                case 1:

                       System.out.print("Enter Student Name: ");
                       String studentname = sc.nextLine();

                       System.out.print("Enter Roll Number: ");
                       String rollNo = sc.nextLine();

                       int roomNo = nextRoom++;

                       hostelRooms.put(roomNo, studentname + " (Roll No: " + rollNo + ")");

                       System.out.println("\nRoom Allocated Successfully.");
                       System.out.println("Student Name : " + studentname);
                       System.out.println("Roll Number  : " + rollNo);
                       System.out.println("Room Number  : " + roomNo);

                       break;

                 case 2:

                       System.out.println("\nAvailable Rooms");

                        for (int i = nextRoom; i <= 120; i++)
                        {
                          System.out.println("Room " + i + " Available");
                        }

                       break;

                  case 3:

                        System.out.println("\nAllocated Rooms");

                        if (hostelRooms.isEmpty())
                        {
                          System.out.println("No Rooms Allocated.");
                        } 
                        else  
                          {

                           for (Map.Entry<Integer, String> entry : hostelRooms.entrySet()) 
                            {

                               System.out.println("Room " + entry.getKey() +" --> " + entry.getValue());
                                               
                            }
                          }

                         break;

                   case 4:
                         break;

                        default:
                              System.out.println("Invalid Choice");
                             }

                            if (hostelChoice == 4)
                           break;
                          }

                        break;
 
           case 13:

                  while (true)
                  {

                     System.out.println("\n===== BUS MANAGEMENT =====");
                     System.out.println("1. Add Bus");
                     System.out.println("2. View All Buses");
                     System.out.println("3. Search Bus");
                     System.out.println("4. Assign Student");
                     System.out.println("5. Remove Bus");
                     System.out.println("6. Exit");

                     System.out.print("Enter Choice: ");
                     int ch = sc.nextInt();
                    sc.nextLine();

                    switch (ch) 
                     {

                       case 1:

                               System.out.print("Bus Number: ");
                               int no = sc.nextInt();
                               sc.nextLine();

                               System.out.print("Route: ");
                               String route = sc.nextLine();

                               System.out.print("Driver Name: ");
                               String driver = sc.nextLine();

                               System.out.print("Driver Contact: ");
                               String contact = sc.nextLine();

                               System.out.print("Capacity: ");
                               int cap = sc.nextInt();

                               System.out.print("Bus Fee: ");
                               double fee = sc.nextDouble();

                               buses.put(no, new Bus(no, route, driver, contact, cap, fee));

                               System.out.println("Bus Added Successfully.");
                              break;

                      case 2:

                               if (buses.isEmpty()) 
                                {
                                   System.out.println("No Buses Available.");
                                }
                                 else 
                                    {
                                      for (Bus b : buses.values()) 
                                       {

                                          System.out.println("----------------------------");
                                          System.out.println("Bus Number      : " + b.busNumber);
                                          System.out.println("Route           : " + b.route);
                                          System.out.println("Driver Name     : " + b.driverName);
                                          System.out.println("Driver Contact  : " + b.driverContact);
                                          System.out.println("Capacity        : " + b.capacity);
                                          System.out.println("Available Seats : " + b.availableSeats);
                                          System.out.println("Bus Fee         : Rs." + b.busFee);
                                       }
                                    }
                                  break;

                         case 3:

                                 System.out.print("Enter Bus Number: ");
                                 int search = sc.nextInt();

                                  if (buses.containsKey(search)) 
                                  {

                                    Bus b = buses.get(search);

                                    System.out.println("Bus Found");
                                    System.out.println("Route : " + b.route);
                                    System.out.println("Driver : " + b.driverName);
                                    System.out.println("Available Seats : " + b.availableSeats);

                                  } 
                                   else 
                                       {

                                          System.out.println("Bus Not Found.");
                                       }

                                    break;

                           case 4:

                                   System.out.print("Enter Bus Number: ");
                                   int bus = sc.nextInt();
                                   sc.nextLine();

                                   if (buses.containsKey(bus)) 
                                   {

                                      Bus b = buses.get(bus);

                                       if (b.availableSeats > 0) 
                                        {

                                           System.out.print("Enter Student Name: ");
                                           String student = sc.nextLine();

                                            b.availableSeats--;

                                            System.out.println(student + " assigned successfully.");
                                            System.out.println("Remaining Seats: " + b.availableSeats);

                                         } 
                                        else
                                           {

                                              System.out.println("No Seats Available.");
                                            }

                                     } 
                                     else 
                                         {

                                           System.out.println("Bus Not Found.");
                                         }

                                        break;

                          case 5:

                                System.out.print("Enter Bus Number to Remove: ");
                                int remove = sc.nextInt();

                                if (buses.remove(remove) != null)

                                    System.out.println("Bus Removed Successfully.");

                                else

                                    System.out.println("Bus Not Found.");

                                   break;

                          case 6:
                                  break;

                                  default:
                                       System.out.println("Invalid Choice.");
                                   }

                               if(ch == 6)
                                break;
                                }

                              break;
 
           case 14:

                  while (true)
                    {

                       System.out.println("\n===== LIBRARY MANAGEMENT =====");
                       System.out.println("1. Add Book");
                       System.out.println("2. Issue Book");
                       System.out.println("3. View Available Books");
                       System.out.println("4. Back");
                       System.out.print("Enter Choice: ");

                       int libraryChoice = sc.nextInt();
                       sc.nextLine();

                       switch (libraryChoice)
                       {

                         case 1:

                                  System.out.print("Enter Book ID: ");
                                   int bookId = sc.nextInt();
                                  sc.nextLine();

                                  System.out.print("Enter Book Name: ");
                                  String bookName = sc.nextLine();

                                  libraryBooks.put(bookId, bookName);

                                  System.out.println("Book Added Successfully.");
                                 break;

                         case 2:

                                System.out.print("Enter Book ID: ");
                                int issueId = sc.nextInt();

                                if (!libraryBooks.containsKey(issueId))
                                {

                                  System.out.println("Book Not Available.");

                                }
                                 else if (issuedBooks.contains(issueId))
                                {

                                  System.out.println("Book Already Issued.");

                                } 
                                else 
                                   {

                                     issuedBooks.add(issueId);

                                     System.out.println("Book Issued Successfully.");
                                     System.out.println("Book ID : " + issueId);
                                     System.out.println("Book Name : " + libraryBooks.get(issueId));
                                   }

                                  break;

                        case 3:

                                System.out.println("\n===== AVAILABLE BOOKS =====");

                                boolean available = false;

                                for (Integer Id : libraryBooks.keySet())
                                {

                                   if (!issuedBooks.contains(Id)) 
                                   {

                                     System.out.println("Book ID : " + Id);
                                     System.out.println("Book Name : " + libraryBooks.get(Id));
                                     System.out.println("------------------------");

                                     available = true;
                                    }
                                }

                              if (!available)
                                   System.out.println("No Books Available.");

                                break;

                       case 4:
                                 break;

                             default:
                                  System.out.println("Invalid Choice");
                              }

                              if (libraryChoice == 4)
                             break;
                           }

                         break;

         case 15:
                System.out.print("Enter Student ID: ");
                int feeId = sc.nextInt();

                System.out.print("Enter Total Fee: ");
                double totalFee = sc.nextDouble();

                System.out.print("Enter Paid Amount: ");
                double paid = sc.nextDouble();

                double balance = totalFee - paid;

                System.out.println("Fee Summary");
                System.out.println("Student ID : " + feeId);
                System.out.println("Total Fee  : ₹" + totalFee);
                System.out.println("Paid Fee   : ₹" + paid);
                System.out.println("Balance    : ₹" + balance);
               break;

         case 16:
               sc.nextLine();

               System.out.print("Enter Student Name: ");
               String cname = sc.nextLine();

               System.out.print("Enter Complaint: ");
               String complaint = sc.nextLine();

               System.out.println("Complaint submitted successfully.");
               System.out.println("Student : " + cname);
               System.out.println("Complaint : " + complaint);
             break;
 
        case 17:
               sc.nextLine();

               System.out.print("Enter Student Name: ");
               String fname = sc.nextLine();

               System.out.print("Enter Feedback: ");
               String feedback = sc.nextLine();

               System.out.println("Thank you for your feedback!");
              break;
 
        case 18:
               System.out.println("\n===== CAMPUS SECURITY =====");
               System.out.println("1. Visitor Entry");
               System.out.println("2. Emergency Contact");
               System.out.println("3. CCTV Monitoring");
               System.out.println("4. Security Alert");

               System.out.print("Enter Visitor Name: ");
               sc.nextLine();
               String visitor = sc.nextLine();
              
               System.out.println(visitor + " registered successfully.");
              break;

        case 19:
               System.out.println("\n===== CAMPUS NOTIFICATIONS =====");
               System.out.println("1. Holiday Notice");
               System.out.println("2. Exam Schedule");
               System.out.println("3. Placement Drive");
               System.out.println("4. Sports Event");
               System.out.println("5. Workshop & Seminar");
               System.out.println("6. Fee Due Reminder");

               System.out.print("Select Notification: ");
               int notify = sc.nextInt();

                switch (notify)
                {

                  case 1:
                         System.out.println("Notice: Campus will remain closed on Sunday.");
                        break;

                  case 2:
                         System.out.println("Notice: Mid Semester Exams start from 20 July.");
                        break;

                  case 3:
                         System.out.println("Notice: TCS Placement Drive on 25 July at 10:00 AM.");
                        break;

                  case 4:
                         System.out.println("Notice: Annual Sports Meet will be held on 30 July.");
                        break;

                  case 5:
                         System.out.println("Notice: AI & Machine Learning Workshop on 22 July.");
                        break;

                  case 6:
                         System.out.println("Notice: Last date for fee submission is 18 July.");
                        break;

                   default:
                        System.out.println("Invalid Choice.");
                     }

                 break;

         case 20:

               sc.nextLine();

                System.out.println("\n===== AI CHAT ASSISTANT =====");
                System.out.println("Type 'exit' to close AI Chat.");

                while (true)
                {

                 System.out.print("\nYou : ");
                 String message = sc.nextLine().toLowerCase();

                 if (message.equals("exit")) 
                 {
                    System.out.println("AI : Thank you for using AI Chat Assistant.");
                    break;
                 }

                 else if (message.contains("hello") || message.contains("hi")) 
                 {
                   System.out.println("AI : Hello! Welcome to Smart Campus.");
                 }

                 else if (message.contains("admission")) 
                 {
                   System.out.println("AI : Please contact the Admission Office or visit the Admission Desk.");
                 }

                 else if (message.contains("fee")) 
                 {
                   System.out.println("AI : You can check your fee details in the Fee Management module.");
                 }

                 else if (message.contains("library")) 
                 {
                   System.out.println("AI : The library is open from 9:00 AM to 6:00 PM.");
                 }

                  else if (message.contains("hostel")) 
                  {
                      System.out.println("AI : Hostel rooms can be allocated through the Hostel Management module.");
                  }

                   else if (message.contains("bus"))
                  {
                     System.out.println("AI : Bus routes and schedules are available in Bus Management.");
                  }

                  else if (message.contains("canteen"))
                  {
                     System.out.println("AI : The canteen is open from 8:00 AM to 8:00 PM.");
                  }

                  else if (message.contains("sports"))
                  {
                     System.out.println("AI : Sports registration is available in the Sports Management module.");
                  }

                  else if (message.contains("exam")) 
                  {
                    System.out.println("AI : Please check Campus Notifications for the latest exam schedule.");
                  }

                  else if (message.contains("attendance")) 
                  {
                     System.out.println("AI : Attendance details are available in the Attendance module.");
                  }

                  else if (message.contains("thank"))
                  {
                    System.out.println("AI : You're welcome! Have a great day.");
                  }
        
                  else 
                  {
                    System.out.println("AI : Sorry, I don't understand your question. Please try another campus-related query.");
                  }
               }

              break;
 
       case 21:
               System.out.println("Thank You for using AI Smart Campus Management System.");
               System.exit(0);

 
            }
        }
    }
}