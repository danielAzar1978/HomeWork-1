// זהו קוד למחשבון פשוט בשפת Java
//import java.util.Scanner;  // מייבא את המחלקה Scanner לצורך קבלת קלט מהמשתמש

public class Calculator {

    // פונקציה לחיבור שני מספרים
    public static double add(double a, double b) {
        return a + b;  // מחזיר את סכום שני המספרים
    }

    // פונקציה לחיסור שני מספרים
    public static double subtract(double a, double b) {
        return a - b;  // מחזיר את ההפרש בין שני המספרים
    }

    // פונקציה לכפל שני מספרים
    public static double multiply(double a, double b) {
        return a * b;  // מחזיר את מכפלת שני המספרים
    }

    // פונקציה לחלק שני מספרים
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("it is not possible to devide by 0");  // אם מחלקים ב-0, זורק שגיאה
        }
        return a / b;  // מחזיר את התוצאה של חלוקת שני המספרים
    }
}

    // פונקציה להדפסת התפריט למשתמש
//   public static void printMenu() {
//         System.out.println("Press 1-5");
//         System.out.println("For adding 1");
//         System.out.println("Subtruck 2");
//         System.out.println("Multiply 3");
//         System.out.println("Deviding 4");
//         System.out.println("5 to Exit");
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);  // יצירת אובייקט Scanner לקריאת קלט מהמשתמש
//         while (true) {
//             printMenu();  // הדפסת התפריט
//             int choice = scanner.nextInt();  // קבלת הבחירה של המשתמש
//             if (choice == 5) {
//                 System.out.println("GoodBye");  // הודעה אם המשתמש בחר לצאת
//                 break;  // יציאה מהלולאה
//             }
//             System.out.print("Enter the first number : ");
//             double num1 = scanner.nextDouble();  // קבלת המספר הראשון מהמשתמש
//             System.out.print("Enter the second number : ");
//             double num2 = scanner.nextDouble();  // קבלת המספר השני מהמשתמש
//             double result = 0;  // משתנה שיכיל את התוצאה
//             switch (choice) {
//                 case 1:
//                     result = add(num1, num2);  // חיבור אם המשתמש בחר בחירה 1
//                     break;
//                 case 2:
//                     result = subtract(num1, num2);  // חיסור אם המשתמש בחר בחירה 2
//                     break;
//                 case 3:
//                     result = multiply(num1, num2);  // כפל אם המשתמש בחר בחירה 3
//                     break;
//                 case 4:
//                     try {
//                         result = divide(num1, num2);  // חילוק אם המשתמש בחר בחירה 4
//                     } catch (IllegalArgumentException e) {
//                         System.out.println(e.getMessage());  // הדפסת שגיאה אם לא ניתן לחלק ב-0
//                         continue;
//                     }
//                     break;
//                 default:
//                     System.out.println("Illegal choise !");  // הודעה במקרה של בחירה לא נכונה
//                     continue;
//             }
//             System.out.println("The result is : " + result);  // הדפסת התוצאה הסופית
//         }
//         scanner.close();  // סגירת אובייקט ה-Scanner לאחר סיום השימוש
//     }

// }


