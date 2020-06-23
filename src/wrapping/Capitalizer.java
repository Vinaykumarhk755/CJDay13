package wrapping;

public class Capitalizer {

public static void main(String args[]) 
{
String str = "JAVA IS OBJECT ORIENTED";

//capitalize first letter
String output = str.substring(0, 1).toUpperCase()+str.substring(1, 5).toLowerCase()+str.substring(5, 6).toUpperCase()+str.substring(6, 8).toLowerCase()+str.substring(8, 9).toUpperCase()+str.substring(9, 15).toLowerCase()+str.substring(15, 16).toUpperCase()+str.substring(16, 23).toLowerCase();
System.out.println(output);
}}