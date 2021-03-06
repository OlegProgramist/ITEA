package week3;

import java.util.Arrays;

/**
 * Home work for ITEA BASE week 2
 */
public class StudentGroup {

    private  Student[] students = new Student[10];
    private  int size = 0;

    /**
     * Add int value to the end of array.
     * if array outs index of bounds copy all values
     * to new bigger array.
     *
     * @param value - new value for nums field.
     */
    public void add(Student value) {
        if(students.length <= size){
            copyArray();
        }
        students[size++] = value;
    }

    private void copyArray() {
        Student[] newArray = new Student[size + (students.length * 2)];
        System.arraycopy(students, 0, newArray, 0, students.length);
        students = newArray;
    }

    /**
     * @return value from this index.
     * @param index in nums.
     * @throws ArrayIndexOutOfBoundsException if no such
     *         index in nums.
     */
    public  Student get(int index) {
        return students[index];
    }

    /**
     * Ascending sorts nums
     */
    public  Student[] sort() {
        Student[] SortedStudents = students.clone();
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size - 1; j++) {
                if(SortedStudents[j].getFirstName().compareTo(SortedStudents[j-1].getFirstName()) < 0){
                    Student box = SortedStudents[j];
                    SortedStudents[j] = SortedStudents[j-1];
                    SortedStudents[j-1] = box;

                }
            }

        }
        return SortedStudents;
    }

    /**
     * @return first founded index
     *      which associated with this value,
     *      or -1 if was not found such value.
     * @param firstName - searched value in nums
     */
    public  Student[] search(String firstName) {
        // TODO: 9/19/17
        return null;
    }

    /**
     * Inserts the specified element at the specified position in this
     * list. Shifts the element currently at that position (if any) and
     * any subsequent elements to the right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param value element to be inserted
     * @throws IndexOutOfBoundsException if no such
     *          index in nums.
     */
    public  void add(int index, Student value) {
        // TODO: 9/19/17
    }

    /**
     * Replaces the element at the specified position in this list with
     * the specified element.
     *
     * @param index index of the element to replace
     * @param value element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if no such
     *          index in nums.
     */
    public  Student replace(int index, Student value) {
        // TODO: 9/21/17
        return null;
    }

    /**
     * @return removed value.
     * @param index removed value.
     * @throws ArrayIndexOutOfBoundsException if no such
     *          index in nums.
     */
    public  Student remove(int index) {
        // TODO: 9/19/17
        return null;
    }

    /**
     * @return removed value or -1 if was not found
     * @param firstName removed value.
     */
    public  String removeStudent(String firstName) {
        Student[] newArray = new Student[size];
        for (int i = 0; i < size; i++) {
            if(students[i].getFirstName().equals(firstName)) {
                System.arraycopy(students, 0, newArray, 0, i);
                System.arraycopy(students, i + 1, newArray, i, students.length - i -     1);
                size--;
                students = newArray;

            }
            return firstName;
        }
        return null;
    }

    /**
     * Inverts nums
     */
    public  void invert() {
        // TODO: 9/19/17
    }

    /**
     * Makes copy of nums from first index to last index which
     * was received from params.
     *
     * @param from first index of subArray
     * @param to last index of subArray
     * @return subArray of the nums
     * @throws ArrayIndexOutOfBoundsException if no such
     *         indexes in nums.
     */
    public  Student[] subArray(int from, int to) {
        // TODO: 9/19/17
        return null;
    }

    /**
     * Convert nums into string.
     * @return nums in string format.
     */
    public  String showStudents(){
        String toString = "";
        for (int i = 0; i < size; i++) {
            toString += students[i].getFirstName() + " " + students[i].getLastName() +
                    " " + students[i].getAge() + " " + students[i].getAverageMark() + " \n";
        }

        return toString;
    }
    public  String showStudents(Student[] students){
        String toString = "";
        for (int i = 0; i < size; i++) {
            toString += students[i].getFirstName() + " " + students[i].getLastName() +
                    " " + students[i].getAge() + " " + students[i].getAverageMark() + " \n";
        }

        return toString;
    }

    public Student[] show(){
        return students.clone();
    }

    public int size(){
        return size;
    }

}