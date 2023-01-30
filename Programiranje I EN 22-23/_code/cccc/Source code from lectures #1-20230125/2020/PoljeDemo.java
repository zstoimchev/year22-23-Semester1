class PoljeDemo { 
  public static void main(String[] args) { 
    int[] toPolje; // declaration of an integer array. 
    toPolje = new int[10]; // allocation of the memory for 10 integers
    toPolje[0] = 100; // initialisation of the 1. element
    toPolje[1] = 200; // initialisation of the 2. element
    toPolje[9] = 1000; // initialisation of the last element
    //error: toPolje[90] = 1000; // initialisation of the last element
    System.out.println("Element at index 0: " + toPolje[0]);
    System.out.println(" Element at index 1: " + toPolje[1]); 
    System.out.println(" Element at index 9: " + toPolje[9]); 
  } 
} 