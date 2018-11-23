
package pkg2college;
import java.util.Scanner;
public class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Welocome to the University of Cordilleras:");
        System.out.println("What is you college department:");
        String collage = sc.nextLine();
        
    if (collage.equals("CAS")){
        System.out.println("Hello Welcome to the College of Arts and Science:");
        System.out.println("What is your academic program:");
        String prog = sc.nextLine();
       if (prog.equals("English")){
        System.out.println("Hello your program is Bachelor of Arts in English:");
        System.out.println("You are taking the Bachelor of Arts in English:");
       } else if (prog.equals("Political Science")){
        System.out.println("Hello your program is Bachelor of Political Science:");
        System.out.println("You are taking the Bachelor of Political Science:");
        } else if (prog.equals("Arts in communication")){
        System.out.println("Hello your program is Bachelor of Science Arts in communication:");
        System.out.println("You are taking the Bachelor of Science Arts in communication:");
        } else if (prog.equals("Psychology")){
        System.out.println("Hello your program is Bachelor Science of Psychology:");
        System.out.println("You are taking the Bachelor of Science in  Psychology:");
        } else {
        System.out.println("Sorry that academic program is invalid:");
        }
    }
    if (collage.equals("CBA")){
        System.out.println("Hello Welcome to the College of Business Administration:");
        System.out.println("What is your academic program:");
        String CBAprog = sc.nextLine();
       if (CBAprog.equals("Business Administration")){
        System.out.println("Hello your program is Bachelor of Science in Businnes Administration:");
        System.out.println("You are taking the Bachelor of Science Businnes Administration:");
       } else if (CBAprog.equals("Entrepreneurship")){
        System.out.println("Hello your program is Bachelor of Science in Entrepreneurship:");
        System.out.println("You are taking the Bachelor of Science in Entrepreneurship:");
        } else if (CBAprog.equals("Office Administration")){
        System.out.println("Hello your program is Bachelor of Science in Office Administration :");
        System.out.println("You are taking the Bachelor of Science in Office Administration :");
        } else {
        System.out.println("Sorry that academic program is invalid:");
        }
    }
    if (collage.equals("CEA")){
        System.out.println("Hello Welcome to the College of Engineering and Architecture:");
        System.out.println("What is your academic program:");
        String CEAprog = sc.nextLine();
       if (CEAprog.equals("Architecture")){
        System.out.println("Hello your program is Bachelor of Science in Architecture :");
        System.out.println("You are taking the Bachelor of Science in Architecture :");
       } else if (CEAprog.equals("Civil Engenering")){
        System.out.println("Hello your program is Bachelor of Science in Civil Engenering:");
        System.out.println("You are taking the Bachelor of Science in Civil Engenering:");
        } else if (CEAprog.equals("Computer Engenering")){
        System.out.println("Hello your program is Bachelor of Science in Computer Engenering:");
        System.out.println("You are taking the Bachelor of Science in Computer Engenering:");
        } else if (CEAprog.equals("Electronics Engenering")){
        System.out.println("Hello your program is Bachelor of Science in Electronics Engenering:");
        System.out.println("You are taking the Bachelor of Science in Electronics Engenering:");
        } else if (CEAprog.equals("Environmental & Sanitary Engenering")){
        System.out.println("Hello your program is Bachelor of Science in Environmental & Sanitary Engenering:");
        System.out.println("You are taking the Bachelor of Science in Environmental & Sanitary Engenering:");
        } else {
        System.out.println("Sorry that academic program is invalid:");
        }
    }
    if (collage.equals("CITCS")){
        System.out.println("Hello Welcome to the College of Information Technology and Computer Science:");
        System.out.println("What is your academic program:");
        String CITCSprog = sc.nextLine();
       if (CITCSprog.equals("Computer Science")){
        System.out.println("Hello your program is Bachelor of Science in Computer Sciece:");
        System.out.println("You are taking the Bachelor of Science Computer Science:");
        System.out.println("Students gain knowledge of the theories along with the methodologies and techniques in the research and development of multifaceted software systems as well as new knowledge in the field of computing");
        String major = sc.nextLine();
       if(major.equals("Digital Arts and Animation")){
          System.out.println("Your major in Digital Arts and Animation:"); 
       } else if (major.equals("Mobile Technology")){
          System.out.println("Your major in Mobile Technology:");
       } else {
          System.out.println("Sorry the major you entered is invalid:");
       }
    }
      if (collage.equals("Information System")){
        System.out.println("Hello your program is Bachelor of Science in Information System:");
        System.out.println("You are taking the Bachelor of Science Information System:");
        String CITCSmajor = sc.nextLine();
       if(CITCSmajor.equals("e-Learning Technology")){
          System.out.println("Your major in e-Learning Technology:"); 
       } else if (CITCSmajor.equals("Business Process Management")){
          System.out.println("Your major in Business Process Management:");
       } else {
          System.out.println("Sorry the major you entered is invalid:");
       }
    }
       if (collage.equals("Information Technology")){
        System.out.println("Hello your program is Bachelor of Science in Information Technology:");
        System.out.println("You are taking the Bachelor of Science Information Techology:");
        String ITmajor = sc.nextLine();
       if(ITmajor.equals("Enterprise Resource Planning")){
          System.out.println("Your major in Enterprise Resource Planning:"); 
       } else if (ITmajor.equals("Network and Security")){
          System.out.println("Your major in Network and Security:");
       } else if (ITmajor.equals("Web Technology")){
          System.out.println("Your major in Web Technology:");   
       } else {
          System.out.println("Sorry the major you entered is invalid:");
       }
    }
       if (collage.equals("Computer Technology")){
        System.out.println("Hello your program is Bachelor of Science in Computer Technology:");
        System.out.println("You are taking the Bachelor of Science Computer Technology:");
        String CTmajor = sc.nextLine();
       if(CTmajor.equals("Emphasis in Call Center Services")){
          System.out.println("Your major in Emphasis in Call Center Services:"); 
       } else if (CTmajor.equals("Emphasis in Computer Maintenance and Network Management")){
          System.out.println("Your major in Emphasis in Computer Maintenance and Network Management:");
       } else {
          System.out.println("Sorry the major you entered is invalid:");
       }
    }
       if (collage.equals("CTE")){
        System.out.println("Hello Welcome to the College of Teacher Education:");
        System.out.println("What is your academic program:");
        String CTEprog = sc.nextLine();
       if (CTEprog.equals("Elementary Education - General")){
        System.out.println("Hello your program is Bachelor of Science in Elementary Education - General:");
        System.out.println("You are taking the Bachelor of Science in Elementary Education - General:");
       } else if (CTEprog.equals("Elementary Education")){
        System.out.println("Hello your program is Bachelor of Science in Elementary Education:");
        System.out.println("You are taking the Bachelor of Science in Elementary Education:");
        } else if (CTEprog.equals("Secondary Education")){
        System.out.println("Hello your program is Bachelor of Science in Secondary Education:");
        System.out.println("You are taking the Bachelor of Science in Secondary Education:");
        } else {
        System.out.println("Sorry that academic program is invalid:");
        }
    }
       if (collage.equals("COA")){
        System.out.println("Hello Welcome to the College of Accountancy:");
        System.out.println("What is your academic program:");
        String COAprog = sc.nextLine();
       if (COAprog.equals("Science in Accountancy")){
        System.out.println("Hello your program is Bachelor of Science in Science in Accountancy:");
        System.out.println("You are taking the Bachelor of Science in Science in Accountancy:");
        }else if (COAprog.equals("Accounting Technology")){
        System.out.println("Hello your program is Bachelor of Science in Accounting Technology:");
        System.out.println("You are taking the Bachelor of Science in Accounting Technology:");
        } else if (COAprog.equals("Management Accounting")){
        System.out.println("Hello your program is Bachelor of Science in Management Accounting:");
        System.out.println("You are taking the Bachelor of Science in Management Accounting:");
         } else if (COAprog.equals("Forensic Accounting")){
        System.out.println("Hello your program is Bachelor of Science in Forensic Accounting:");
        System.out.println("You are taking the Bachelor of Science in Forensic Accounting:");
        } else {
        System.out.println("Sorry that academic program is invalid:");
        }
    }
}
    }
}
    
   