//package exercises;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class HashMapPractice {
//    public static void main(String[] args) {
//        HashMap<Integer, String> classRoster = new HashMap<>();
//        Scanner input = new Scanner(System.in);
//        String newStudent;
//
//        System.out.println("Enter your students' name (or ENTER to finish):");
//
//        // Get student names and grades
//        do {
//
//            System.out.print("Student name: ");
//            newStudent = input.nextLine();
//
//            if (!newStudent.equals("")) {
//                System.out.print("ID: ");
//                Integer newId = input.nextInt();
//                classRoster.put(newId, newStudent);
//
//                // Read in the newline before looping back
//                input.nextLine();
//            }
//
//        } while(!newStudent.equals(""));
//
//        input.close();
//
//        // Print class roster
//        System.out.println("\nClass roster:");
//        double sum = 0.0;
//
//        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
//            System.out.println(student.getValue() + "'s ID:" + student.getKey());
//            sum += student.getValue();
//        }
//
//        double avg = sum / students.size();
//        System.out.println("Number of students in the roster" + avg);
//    }
//    }
//}
