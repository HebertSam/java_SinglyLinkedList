public class SLLTest{
    public static void main(String[] args){
        SLL myList = new SLL();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);

        myList.printVals();

        myList.remove();

        myList.printVals();

        System.out.println(myList.find(3));

        myList.removeAt(3);

        myList.printVals();

    }
}