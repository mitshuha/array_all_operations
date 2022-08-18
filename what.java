
// pakages --->class-->method







import java.util.Scanner;
        public class what {
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the size of an array");
                int size=sc.nextInt();
                int array[]=new int[size+1];
                System.out.println("enter the elements in array ");
                for (int i=0;i<size;i++){
                    array[i]=sc.nextInt();

                }

                System.out.println("your existing array is");
                for (int i=0;i<size;i++){
                    System.out.println(array[i]);
                }

// taking input for going inside fungtions
                int input;

               while (true){


                System.out.println("press 1 for insertion");
                System.out.println("press 2 for deletion");
                System.out.println("press 3 for shorting");
                System.out.println("press 4 for reversing");
                   System.out.println("press 5 to exit the program");
                System.out.println("enter the number related to operation");
                input=sc.nextInt();

                if (input==5){
                    break;
                }
// this is while for conditions
                    switch (input) {
                        case 1:
                            // this is code for insertion in array
                            // printing the exisiting array
                            System.out.println("the existing array is");
                            for (int i = 0; i < size; i++) {
                                System.out.println(array[i]);
                            }
                            System.out.println("enter the location where you want to insert the element");
                            int loc = sc.nextInt();

                            loc = loc - 1;
                            System.out.println("enter the element which you wanna insert");
                            int element = sc.nextInt();
                            for (int i = size - 1; i >= loc; i--) {
                                array[i + 1] = array[i];
                            }
                            array[loc] = element;
                            size++;

                            System.out.println("array after insertion");
                            for (int i = 0; i < size; i++) {
                                System.out.println(array[i]);
                            }

                            break;
                        case 2:
                            // this case is for deletion
                            int location = 0;
                            int value;

                            System.out.println("your existing array is");
                            for (int i = 0; i < size; i++) {
                                System.out.println(array[i]);
                            }
                            System.out.println("enter the element you want to delete");
                            value = sc.nextInt();
                            for (int i = 0; i < size; i++) {
                                if (value == array[i]) {
                                    location = i;
                                }
                            }
                            // loop for deletion

                            for (int i = location; i < size - 1; i++) {
                                array[i] = array[i + 1];
                            }
                            size--;

                            System.out.println("array after deletion");
                            for (int i = 0; i < size; i++) {
                                System.out.println(array[i]);
                            }
                            break;

                        case 3:

                            int temp = 0;
                            // this is logic for shorting
                            System.out.println("your existing array is");
                            for (int i = 0; i < size; i++) {
                                System.out.println(array[i]);
                            }
                            // this is logic for shorting
                            for (int i = 0; i < size - 1; i++) {
                                for (int j = 0; j < size - 1; j++) {
                                    if (array[j] > array[j + 1]) {
                                        temp = array[j];
                                        array[j] = array[j + 1];
                                        array[j + 1] = temp;
                                    }
                                }
                            }

                            System.out.println("array after shorting");
                            for (int i = 0; i < size; i++) {
                                System.out.println(array[i]);
                            }

                            break;
                        case 4:
                            // this is program for reversing
                            System.out.println("your existing array is");
                            for (int i = 0; i < size; i++) {
                                System.out.println(array[i]);
                            }
                            int position = 0;
                            int new_array[] = new int[size];
                            for (int i = size - 1; i >= 0; i--) {
                                new_array[position] = array[i];
                                position++;

                            }

                            System.out.println("your reversed array is");

                            for (int i = 0; i < size; i++) {
                                System.out.println(new_array[i]);
                            }

                            break;

                        default:
                            // this is program for searching
                            System.out.println("enter the valid choice");
                            break;
                    }
               }
                System.out.println("your are exit through programs succesfully");


            }

        }



